package heroku;

import lombok.SneakyThrows;

import java.net.HttpURLConnection;
import java.net.URL;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PingMe {

    @SneakyThrows
    public void ping() {
        URL url = new URL("https://meowgavbot.herokuapp.com/");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.connect();

        connection.disconnect();
    }
}