package heroku;

import lombok.SneakyThrows;
import org.springframework.scheduling.annotation.Scheduled;

import java.net.HttpURLConnection;
import java.net.URL;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PingMe {

    @Scheduled(fixedRateString = "PT5M")
    @SneakyThrows
    public void ping() {

        try {
            URL url = new URL("https://exchanger-tg-bot.herokuapp.com/");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.connect();
            log.info("Server is working...  Ping {} status: {}", url.getHost(), connection.getResponseCode());
            connection.disconnect();
        } catch (Exception e) {
            log.error("Error from pingMe {}", e.getMessage());
        }
    }
}