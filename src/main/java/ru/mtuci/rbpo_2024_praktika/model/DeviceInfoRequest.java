package ru.mtuci.rbpo_2024_praktika.model;

import lombok.Data;

@Data
public class DeviceInfoRequest {
    private String macAddress;
    private String deviceName;
}
