package com.tirzah.service;

import com.tirzah.model.User;
import com.tirzah.pojo.GenericResponse;
import com.tirzah.utils.PasswordValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AuthService {

    private final UserService userService;
    private final MessageSource messageSource;
    private final PasswordValidator passwordValidator;

    public GenericResponse registerUser(User user) {

        String uuid = java.util.UUID.randomUUID().toString();

        if (userService.userEmailExists(user.getEmail())) {
            return new GenericResponse(messageSource.getMessage("already.exists", new String[]{user.getEmail()},
                    LocaleContextHolder.getLocale()), false, "101");
        }

        if (userService.userUsernameExists(user.getUsername())) {
            return new GenericResponse(messageSource.getMessage("already.exists", new String[]{user.getUsername()},
                    LocaleContextHolder.getLocale()), false, "101");
        }

        if (userService.userPhoneExists(user.getPhoneNo())) {
            return new GenericResponse(messageSource.getMessage("already.exists", new String[]{user.getPhoneNo()},
                    LocaleContextHolder.getLocale()), false, "101");
        }

        if (!passwordValidator.isValidPassword(user.getPassword())) {
            return new GenericResponse(messageSource.getMessage("password.invalid", null,
                    LocaleContextHolder.getLocale()), false, "101");
        }

        user.setUuid(uuid);



        return new GenericResponse();


    }

}








