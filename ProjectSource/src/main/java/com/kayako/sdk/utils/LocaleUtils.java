package com.kayako.sdk.utils;

import com.kayako.sdk.helpcenter.locale.Locale;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 16/09/16
 */

public class LocaleUtils {

    public static String getLanguage(String localeCode) {
        String[] separators = new String[]{"_", "-"};
        for (String separator : separators) {
            if (localeCode.contains(separator)) {
                String[] parts = localeCode.split(separator);
                if (parts.length > 0) {
                    return parts[0];
                }
            }
        }
        return localeCode;
    }
}
