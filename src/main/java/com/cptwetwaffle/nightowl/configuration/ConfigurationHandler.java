package com.cptwetwaffle.nightowl.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {
    public static void init(File configFile){
        Configuration configuration = new Configuration(configFile);

        try {
            //Load in the configuration
            configuration.load();

            //Read the configuration properties
            boolean configValue = configuration.get(Configuration.CATEGORY_GENERAL,"configValue",true,"this is an example config value").getBoolean();

        }catch (Exception e){
            //Log the exception
        }finally {
            //Save the configuration file
            configuration.save();
        }

    }
}
