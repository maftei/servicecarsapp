package com.maftraz.servicecarsapp.model;


import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class clsEmailValidation {

    private Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_PATTERN =
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public clsEmailValidation() {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }

    /**
     * Validate hex with regular expression
     *
     * @param hex
     *            hex for validation
     * @return true valid hex, false invalid hex
     */
//    public boolean validate(final String hex) {
//
//        matcher = pattern.matcher(hex);
//        return matcher.matches();
//    }

    public boolean validate (String pSir) {
        if (matcher.matches() == true) {
            return true;
        }
        return false;
    }

    }

