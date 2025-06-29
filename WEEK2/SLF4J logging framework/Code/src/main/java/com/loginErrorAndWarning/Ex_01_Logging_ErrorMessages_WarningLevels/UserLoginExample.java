package com.loginErrorAndWarning.Ex_01_Logging_ErrorMessages_WarningLevels;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;

public class UserLoginExample {

    private static final Logger logger = LoggerFactory.getLogger(UserLoginExample.class);

    public static void main(String[] args) {
        String username = "Thrinath";
        String password = "1234";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String eUsername = scanner.nextLine();

        System.out.println("Enter password: ");
        String ePassword = scanner.nextLine();

        if (eUsername.equals(username) && ePassword.equals(password)) {
            logger.info("User  logged in successfully.");
            System.out.println("Login successful.");
        } else {
            logger.warn("Failed login attempt for user.");
            System.out.println("Invalid username or password.");
        }

        scanner.close();
    }
}
