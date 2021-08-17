package com.java_essential.examples.lesson10.example2;

import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;

public class FileReader {

    private static final Logger log = Logger.getLogger(FileReader.class);

    public static void main(String[] args) {
        try {
            String read = read("checkstyle.xml");
            System.out.println(read);
        } catch (FileNotFoundException e) {
            log.error("resource file necessary",e);
            e.printStackTrace();
        }
    }

    public static String read(String fileName) throws FileNotFoundException {
        byte[] bytes = new byte[0];
        try (InputStream inputStream = getFile(fileName)) {
            bytes = inputStream.readAllBytes();
        } catch (IOException | NullPointerException e) {
            if (e instanceof NullPointerException) {
                throw new FileNotFoundException("file not found", e);
            }
            log.error(e);
            System.err.println(e);
        }
        return new String(bytes);
    }

    public static InputStream getFile(String fileName) throws NullPointerException {
        InputStream resourceAsStream = ClassLoader.getSystemClassLoader().getResourceAsStream(fileName);
        if (resourceAsStream == null) {
            throw new NullPointerException();
        }
        return resourceAsStream;
    }
}
