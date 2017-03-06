package com.example.www.loginactivity;

/**
 * Created by shari on 3/5/2017.
 */

public class LoginUtils {
    /**
     * this methods check if the provided string represents a valid email address
     * and returens true if it is.
     * @param email
     * @return
     */
    public boolean isValidEmailAddrerss (String email){

        boolean hasAtSign = email.indexOf("@") >-1;
        return hasAtSign;

    }

    /**
     * this methods returns the length of the local part of the email address
     * whic is the part that comes before the "@" in the address.
     * @param email
     * @return
     */
    public int getLocalPartLength(String email){
        int start = email.indexOf("@");
        String localpart = email.substring(0,start);
        return localpart.length();
    }
}
