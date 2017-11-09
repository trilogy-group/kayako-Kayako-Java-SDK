package com.kayako.sdk.utils;

import org.threeten.bp.Instant;
import org.threeten.bp.format.DateTimeFormatter;
import org.threeten.bp.format.DateTimeParseException;

/**
 * @author Neil Mathew (neil.mathew@kayako.com)
 * @date 08/02/17
 */
public class IsoTimeFormatUtils {

    public static Long getTimeInMillisecondsFromIso8601String(String dateInIso8601Format) {
        try {
            return getTimeInMillisecondsUsingThreeTenLibrary(dateInIso8601Format);
        } catch (DateTimeParseException e) {
            try {
                return getTimeInMillisecondsUsingThreeTenLibrarySpecifyingParseFormat(dateInIso8601Format);
            } catch (DateTimeParseException e2) {
                return null;
            }
        }
    }

    private static Long getTimeInMillisecondsUsingThreeTenLibrary(String dateInIso8601Format) throws DateTimeParseException {
        // Convert ISO date to Local Date
        Instant instant = Instant.parse(dateInIso8601Format);

        // Convert Instant to epoch milliseconds
        return instant.toEpochMilli();
    }

    private static Long getTimeInMillisecondsUsingThreeTenLibrarySpecifyingParseFormat(String dateInIso8601Format) {
        Instant instant = DateTimeFormatter.ISO_OFFSET_DATE_TIME.parse(dateInIso8601Format, Instant.FROM);
        return instant.toEpochMilli();
    }
}
