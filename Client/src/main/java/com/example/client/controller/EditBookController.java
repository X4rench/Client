package com.example.client.controller;


import com.example.client.Entity.BookEntity;
import com.example.client.utils.HTTPUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

import static com.example.client.controller.MainController.booksData;
import static com.example.client.controller.MainController.updateBook;

public class EditBookController {

    static HTTPUtils http = new HTTPUtils();

    @FXML
    private TextField bookName_field;

    @FXML
    private TextField bookAuthor_field;

    @FXML
    private TextField bookPublisher_field;

    @FXML
    private TextField bookYear_field;

    @FXML
    private TextField bookChapter_field;


    private Stage editBookStage;
    private BookEntity book;
    private int bookID;
    private boolean okClicked = false;

    public void setDialogStage (Stage dialogStage) { this.editBookStage = dialogStage; }

    public boolean isOkClicked() { return okClicked; }


    public void setLabels (BookEntity bookIn, int book_id) {
        this.book = bookIn;
        this.bookID = book_id;

        bookName_field.setText(book.getTitle());
        bookAuthor_field.setText(book.getAuthor());
        bookPublisher_field.setText(book.getPublisher());
        bookYear_field.setText(book.getYear());
        bookChapter_field.setText(book.getYear());
    }
        @FXML
        private void SaveBook() throws IOException {
            if (isInputValid()) {
                book.setTitle(bookName_field.getText());
                book.setAuthor(bookAuthor_field.getText());
                book.setPublisher(bookPublisher_field.getText());
                book.setYear(bookYear_field.getText());
                book.setKind(bookChapter_field.getText());

                okClicked = true;
                editBookStage.close();
                booksData.set(bookID, book);
                updateBook(book);
            }
        }
                @FXML
                private void CloseBook() {
                    editBookStage.close();
                }

                private boolean isInputValid() {
                    String errorMessage = "";

                    if (bookName_field.getText() == null || bookName_field.getText().length() == 0) errorMessage += "Не обнаружено название книги \n";
                    if (bookAuthor_field.getText() == null || bookAuthor_field.getText().length() == 0) errorMessage += "Не обнаружен автор книги! \n";
                    if (bookPublisher_field.getText() == null || bookPublisher_field.getText().length() == 0) errorMessage += "Нe обнаружено изни книи!\n";
                    if (bookYear_field.getText() == null || bookYear_field.getText().length() == 0) errorMessage += "Не обнаружен год выпуска книги! \n";
                    else {
                        try {

                            Integer.parseInt(bookYear_field.getText());
                        } catch (NumberFormatException e) {
                            errorMessage += "Не корректное значение года выпуска книги (должно быть целочисленным) !\n";
                        }
                    }
            if (bookChapter_field.getText() == null || bookChapter_field.getText().length() == 0) errorMessage += "Hе обнаружен раздeл содержания!\n";

            if (errorMessage.length() == 0) return true;
            else {
            // Показываем сообщение об ошибке.
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.initOwner(editBookStage);
                alert.setTitle("Ошибка заполнения");
                alert.setHeaderText("Пожалуйста, укажите корректные значения текстовых полей");
                alert.setContentText(errorMessage);

                alert.showAndWait();

                return false;
            }
        }
    }