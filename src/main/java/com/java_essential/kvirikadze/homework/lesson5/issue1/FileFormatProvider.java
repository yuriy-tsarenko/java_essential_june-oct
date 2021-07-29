package com.java_essential.kvirikadze.homework.lesson5.issue1;

import java.util.Arrays;
import java.util.Locale;

public class FileFormatProvider {
    private static final String EXTENSION_XML = "xml";
    private static final String EXTENSION_TXT = "txt";
    private static final String EXTENSION_DOC = "doc";

    public static boolean isRecognizedFileFormat(String fileName) {
        return Arrays.asList(EXTENSION_DOC, EXTENSION_TXT, EXTENSION_XML).contains(getFileExtension(fileName));
    }

    public static boolean isDocFileFormat(String fileName) {
        return getFileExtension(fileName).equals(EXTENSION_DOC);
    }

    public static boolean isXmlFileFormat(String fileName) {
        return getFileExtension(fileName).equals(EXTENSION_XML);
    }

    public static boolean isTxtFileFormat(String fileName) {
        return getFileExtension(fileName).equals(EXTENSION_TXT);
    }

    private static String getFileExtension(String fileName) {
        String[] nameParts = fileName.split("\\.");
        if (nameParts.length == 0) {
            return "";
        } else {
            return nameParts[nameParts.length - 1].toLowerCase(Locale.ROOT);
        }
    }

}
