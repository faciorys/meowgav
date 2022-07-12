package heroku;

import lombok.SneakyThrows;

import java.net.HttpURLConnection;
import java.net.URL;

public class PingMe {

    @SneakyThrows
    public void ping() {
        URL url = new URL("https://meowgavbot.herokuapp.com/");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.connect();

        connection.disconnect();
    }
}