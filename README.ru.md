# Minecraft Discord Message Sync

Paper-плагин, который связывает чат Minecraft-сервера с каналом Discord — сообщения синхронизируются в обе стороны.

[English](./README.md)

## Как работает

- Игрок пишет в чате Minecraft → сообщение появляется в Discord
- Кто-то пишет в Discord → сообщение появляется в чате Minecraft

## Требования

- Java 21
- Paper 1.21+
- Discord-бот с включённым `Message Content Intent`

## Настройка

Перед сборкой отредактируй `src/main/java/org/example/Settings.java`:

```java
private static final String TOKEN = "ТОКЕН_ТВОЕГО_БОТА";
private static final long CHANNEL_ID = 123456789012345678L; // ID целевого канала
```

## Сборка и установка

```bash
mvn package
```

Положи `.jar` из папки `target/` в папку `plugins/` сервера и перезапусти его.

## Технологии

- Java 21
- Paper API 1.21
- JDA 5.3.0
- Maven + Shade plugin
