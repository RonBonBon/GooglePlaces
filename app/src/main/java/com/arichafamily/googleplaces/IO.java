package com.arichafamily.googleplaces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IO {
    public static String getString(InputStream in) throws IOException {
        StringBuilder builder = new StringBuilder();
        String line = null;

        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        try {
            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }
        }
        finally {
            reader.close();
        }
        return builder.toString();
    }
}
