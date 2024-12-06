package ru.mtuci.rbpo_2024_praktika.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mtuci.rbpo_2024_praktika.model.ApplicationUser;
import ru.mtuci.rbpo_2024_praktika.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public ApplicationUser getUserById(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }
}
