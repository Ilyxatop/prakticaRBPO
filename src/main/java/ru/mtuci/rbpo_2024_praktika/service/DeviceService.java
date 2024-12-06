package ru.mtuci.rbpo_2024_praktika.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mtuci.rbpo_2024_praktika.model.ApplicationUser;
import ru.mtuci.rbpo_2024_praktika.model.Device;
import ru.mtuci.rbpo_2024_praktika.model.DeviceInfoRequest;
import ru.mtuci.rbpo_2024_praktika.repository.DeviceRepository;

@Service
@RequiredArgsConstructor
public class DeviceService {

    private final DeviceRepository deviceRepository;

    public Device registerOrUpdateDevice(String deviceInfo, ApplicationUser user) {
        // Находим устройство по идентификатору (например, MAC-адрес)
        Device device = deviceRepository.findByMacAddress(deviceInfo)
                .orElse(new Device());

        // Обновляем информацию об устройстве
        device.setName("User Device");
        device.setMacAddress(deviceInfo);
        device.setUserId(user.getId());

        return deviceRepository.save(device);
    }
    public Device findDeviceByInfo(DeviceInfoRequest deviceInfo, ApplicationUser user) {
        return deviceRepository.findByMacAddressAndUser(deviceInfo.getMacAddress(), user).orElse(null);
    }
}
