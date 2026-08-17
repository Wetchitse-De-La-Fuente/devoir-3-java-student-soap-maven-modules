package com.samanecorporation.metier.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class PropertiesReader {
    private PropertiesReader() {
    }

    public static Properties load(String resourceName) {
        Properties properties = new Properties();
        try (InputStream input = PropertiesReader.class.getClassLoader().getResourceAsStream(resourceName)) {
            if (input == null) {
                throw new IllegalStateException("Ressource introuvable : " + resourceName);
            }
            properties.load(input);
            return properties;
        } catch (IOException e) {
            throw new IllegalStateException("Impossible de lire " + resourceName, e);
        }
    }
}
