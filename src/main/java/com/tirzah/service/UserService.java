package com.tirzah.service;

import com.tirzah.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    public boolean userEmailExists(String email) {
        return userRepository.findByEmail(email).isPresent();
    }

    public boolean userUsernameExists(String username) {
        return userRepository.findByUsername(username).isPresent();
    }

    public boolean userPhoneExists(String phone) {
        return userRepository.findByPhoneNo(phone).isPresent();
    }


}
