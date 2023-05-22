package com.tirzah.security;

import com.tirzah.model.User;
import com.tirzah.pojo.GenericResponse;
import com.tirzah.repository.UserRepository;
import com.tirzah.utils.PasswordValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import java.util.Locale;

@RequiredArgsConstructor
@Service
public class AuthService {

    private final UserService userService;
    private final MessageSource messageSource;
    private final PasswordValidator passwordValidator;

    public GenericResponse registerUser(User user) {

        String uuid = java.util.UUID.randomUUID().toString();

//        if (userService.userEmailExists(user.getEmail())) {
            return new GenericResponse(messageSource.getMessage("already.exists", new String[]{"hello_chuks"}, LocaleContextHolder.getLocale()), false, "101");
//        }
//
//        return new GenericResponse();


    }

}








