package com.delaroystudios.smartlock;

/**
 * Created by delaroystudios on 10/13/2016.
 */
public class CodelabUtil {

    /**
     * Check whether or not given username and password pair exist in UsernamesAndPassword class.
     */
    public static boolean isValidCredential(String username, String password) {
        if ((username.equals(UsernamesAndPasswords.username1) && password.equals(UsernamesAndPasswords.password1)) ||
                (username.equals(UsernamesAndPasswords.username2) && password.equals(UsernamesAndPasswords.password2)) ||
                (username.equals(UsernamesAndPasswords.username3) && password.equals(UsernamesAndPasswords.password3))) {
            return true;
        }
        return false;
    }

    /**
     * Check if given username starts an existing username in the UsernamesAndPassword class.
     */
    public static boolean isValidUsernameSoFar(String username) {
        return UsernamesAndPasswords.username1.startsWith(username) ||
                UsernamesAndPasswords.username2.startsWith(username) ||
                UsernamesAndPasswords.username3.startsWith(username);
    }

    /**
     * Check if the password starts an existing password and matches an existing username in the
     * UsernamesAndPassword class.
     */
    public static boolean isValidPasswordSoFar(String username, String password) {
        if (username.equals(UsernamesAndPasswords.username1) &&
                UsernamesAndPasswords.password1.startsWith(password)) {
            return true;
        } else if (username.equals(UsernamesAndPasswords.username2) &&
                UsernamesAndPasswords.password2.startsWith(password)) {
            return true;
        } else if (username.equals(UsernamesAndPasswords.username3) &&
                UsernamesAndPasswords.password3.startsWith(password)) {
            return true;
        }
        return false;
    }

}

