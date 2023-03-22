package com.example.telegrambotches.components;

import org.telegram.telegrambots.meta.api.objects.commands.BotCommand;

import java.util.List;

public interface BotCommands {
    List<BotCommand> LIST_OF_COMMANDS = List.of(
            new BotCommand("/start", "start bot"),
            new BotCommand("/all", "see book"),
            new BotCommand("/add","add book"),
            new BotCommand("/search", "search book"),
            new BotCommand("/delete", "delete book")


    );


    String HELP_TEXT = "This bot will help add book of messages in the chat. " +
            "The following commands are available to you:\n\n" +
            "/start - start the bot\n" +
            "/add - help menu";
}