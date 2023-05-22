package com.tirzah.utils;

import org.springframework.context.annotation.Configuration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Configuration
public class PasswordValidator {
    public static boolean isValidPassword(String password) {
        // Check length requirement
        if (password.length() < 8) {
            return false;
        }

        // Check if it contains at least one lowercase letter, one uppercase letter, one digit, and one special character
        Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=]).+$");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();

    }

}
