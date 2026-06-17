# Minecraft Discord Message Sync

A Paper plugin that bridges your Minecraft server chat with a Discord channel — messages flow both ways in real time.

[Русский](./README.ru.md)

## How it works

- Players send a message in Minecraft → it appears in Discord
- Someone sends a message in Discord → it appears in Minecraft chat

## Requirements

- Java 21
- Paper 1.21+
- A Discord bot with `Message Content Intent` enabled

## Configuration

Before building, edit `src/main/java/org/example/Settings.java`:

```java
private static final String TOKEN = "YOUR_BOT_TOKEN";
private static final long CHANNEL_ID = 123456789012345678L; // target channel ID
```

## Build & Install

```bash
mvn package
```

Drop the resulting `.jar` from `target/` into your server's `plugins/` folder and restart.

## Tech

- Java 21
- Paper API 1.21
- JDA 5.3.0
- Maven + Shade plugin
