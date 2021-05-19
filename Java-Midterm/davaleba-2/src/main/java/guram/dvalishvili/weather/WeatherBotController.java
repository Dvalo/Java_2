package guram.dvalishvili.weather;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;


@ServerEndpoint("/weatherbot")
public class WeatherBotController {

    @OnOpen
    public void handleOpen() {
        System.out.println("Connected");
    }

    @OnMessage
    public String handleMessage(String message) throws IOException {
        System.out.println("Client : " + message);
        String replayMessage = WeatherBot.answer(message);
        System.out.println("Server : " + replayMessage);
        return replayMessage;
    }

    @OnClose
    public void handleClose() {
        System.out.println("Connection Ended");
    }

    @OnError
    public void handleError(Throwable t) {
        t.printStackTrace();
    }

}
