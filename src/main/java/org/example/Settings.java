package org.example;

public class Settings {
    private static final String TOKEN = "YOUR_BOT_TOKEN_HERE";
    private static final long CHANNEL_ID = 0L; // replace with your Discord channel ID

    public static String getToken() {
        return TOKEN;
    }

    public static long getChannelId() {
        return CHANNEL_ID;
    }
}
