package com.jakeledner.workout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Dialog;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import java.time.LocalDate;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import java.time.LocalDate;

import com.jakeledner.core.Scheduler;
import com.jakeledner.model.Exercise;

public class App extends Application {
  @Override
  public void start(Stage stage) {
    Scheduler scheduler = new Scheduler();
    ObservableList<Exercise> items = FXCollections.observableArrayList();
    ListView<Exercise> listView = new ListView<>(items);
    listView.setCellFactory(lv -> new ListCell<>() {
      @Override
      protected void updateItem(Exercise ex, boolean empty) {
        super.updateItem(ex, empty);
        setText(empty || ex == null
            ? null
            : ex.getName() + " (Priority: " + ex.getPriority() + ")");
      }
    });

    Button addBtn = new Button("Add Exercise");
    addBtn.setOnAction(e -> {
      // 1) Build your form controls
      TextField nameField = new TextField();
      TextField groupField = new TextField();
      Slider prioritySlider = new Slider(1, 10, 5);
      DatePicker datePicker = new DatePicker(LocalDate.now());

      // 2) Lay them out
      GridPane grid = new GridPane();
      grid.setHgap(10);
      grid.setVgap(10);
      grid.addRow(0, new Label("Name:"), nameField);
      grid.addRow(1, new Label("Group:"), groupField);
      grid.addRow(2, new Label("Priority:"), prioritySlider);
      grid.addRow(3, new Label("Date:"), datePicker);

      // 3) Dialog setup
      Dialog<Exercise> dialog = new Dialog<>();
      dialog.setTitle("New Exercise");
      dialog.getDialogPane().getButtonTypes().addAll(ButtonType.OK, ButtonType.CANCEL);
      dialog.getDialogPane().setContent(grid);

      // 4) Convert OK to an Exercise
      dialog.setResultConverter(btn -> {
        if (btn == ButtonType.OK) {
          return new Exercise(
              nameField.getText(),
              groupField.getText(),
              (int) prioritySlider.getValue(),
              datePicker.getValue());
        }
        return null;
      });

      // 5) Show and handle result
      dialog.showAndWait()
          .ifPresent(ex -> {
            scheduler.add(ex);
            items.add(ex); // <-- add directly so you see it
            System.out.println("Added: " + ex.getName());
          });
    });

    Button completeBtn = new Button("Complete Next");
    completeBtn.setOnAction(e -> {
      scheduler.completeNext();
      items.setAll(scheduler.allToday(LocalDate.now()));
    });

    HBox controls = new HBox(10, addBtn, completeBtn);
    controls.setPadding(new Insets(10));

    BorderPane root = new BorderPane(listView);
    root.setBottom(controls);

    stage.setScene(new Scene(root, 400, 500));
    stage.setTitle("Workout Scheduler");
    stage.show();
  }

  public static void main(String[] args) {
    launch();
  }
}
