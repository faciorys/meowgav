package com.heroku;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;

import java.net.HttpURLConnection;
import java.net.URL;

@Slf4j
public class PingMe {
    @Scheduled(fixedRateString = "PT20M")
    @SneakyThrows
    public void ping() {
        URL url = new URL("https://meowgavbot.herokuapp.com/");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.connect();

        connection.disconnect();
    }
}