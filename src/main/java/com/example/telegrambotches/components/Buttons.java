package com.example.telegrambotches.components;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.List;

public class Buttons {

    private static final InlineKeyboardButton START_BUTTON = new InlineKeyboardButton("Start");
    private static final InlineKeyboardButton HELP_BUTTON = new InlineKeyboardButton("help");
    private static final InlineKeyboardButton ALL_BUTTON = new InlineKeyboardButton("all");
    private static final InlineKeyboardButton ADD_BUTTON = new InlineKeyboardButton("add");
    private static final InlineKeyboardButton SEARCH_BUTTON = new InlineKeyboardButton("search");
    private static final InlineKeyboardButton DELETE_BUTTON = new InlineKeyboardButton("delete");




    public static InlineKeyboardMarkup inlineMarkup() {
        START_BUTTON.setCallbackData("/start");
        HELP_BUTTON.setCallbackData("/help");
        ALL_BUTTON.setCallbackData("/all");
        ADD_BUTTON.setCallbackData("/add");
        SEARCH_BUTTON.setCallbackData("/search");
        DELETE_BUTTON.setCallbackData("/delete");


        List<InlineKeyboardButton> rowInline = List.of(START_BUTTON, HELP_BUTTON,ALL_BUTTON,ADD_BUTTON,SEARCH_BUTTON,DELETE_BUTTON);
        List<List<InlineKeyboardButton>> rowsInLine = List.of(rowInline);


        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInLine);


        return markupInline;
    }
}
