package pl.bartlomieja.projekt.warstwa;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import pl.bartlomieja.projekt.warstwa.IO.InputFile;
import pl.bartlomieja.projekt.warstwa.IO.RowData;
import pl.bartlomieja.projekt.warstwa.methods.Average;
import pl.bartlomieja.projekt.warstwa.methods.AverageObject;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class App extends Application {

    private ArrayList<Object> allRowDataObject = new ArrayList<>();
    private ArrayList<AverageObject> averageObjects = new ArrayList<>();
    private InputFile inputFile = new InputFile();
    private Average average = new Average();


    Button button;
   private Stage window;
   private BorderPane layout;

    private  TableView<AverageObject> tableAvarageObjects;


    public static void main(String[] args) {

        launch(args);
    }


    @Override
    public void start(Stage primaryStage) {

        final FileChooser fileChooser = new FileChooser();

        window = primaryStage;
        window.setTitle("Program Bartłomieja - Warstwa");


        //file menu
        Menu fileMenu = new Menu("File");

        //menu items
        MenuItem openFile = new MenuItem("Open file...");
        openFile.setOnAction(event -> {

            configureFileChooser(fileChooser);
            List<File> list =
                    fileChooser.showOpenMultipleDialog(primaryStage);
            if (list != null) {
                for (File file2 : list) {
                    ArrayList<RowData> rowData = new ArrayList<>();
                    inputFile.readFile(rowData, file2);
                    allRowDataObject.add(rowData);
                }

            }

        });

        MenuItem exitButton = new MenuItem("Exit");
        exitButton.setOnAction(event -> System.exit(0));

        fileMenu.getItems().add(openFile);
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().add(exitButton);


        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu);

        layout = new BorderPane();
        layout.setTop(menuBar);

        Button button1 = new Button("Average");
        button1.setOnAction(event -> {
            average.makeAverage(allRowDataObject, averageObjects);

            for (AverageObject averageObject : averageObjects) {


                tableAvarageObjects.getItems().add(averageObject);
            }


        });

        layout.setLeft(button1);

        TableColumn<AverageObject, Integer> amountOfDataColumn = new TableColumn<>("amount of data");
        amountOfDataColumn.setMinWidth(100);
        amountOfDataColumn.setCellValueFactory(new PropertyValueFactory<>("amountOfData"));

        TableColumn<AverageObject, Double> czasColumn = new TableColumn<>("average time");
        czasColumn.setMinWidth(80);
        czasColumn.setCellValueFactory(new PropertyValueFactory<>("averageCzasNew"));

        TableColumn<AverageObject, Double> averageUx1Column = new TableColumn<>("average Ux1");
        averageUx1Column.setMinWidth(80);
        averageUx1Column.setCellValueFactory(new PropertyValueFactory<>("averageUx1New"));

        TableColumn<AverageObject, Double> averageUy1Column = new TableColumn<>("average Uy1");
        averageUy1Column.setMinWidth(80);
        averageUy1Column.setCellValueFactory(new PropertyValueFactory<>("averageUy1New"));

        TableColumn<AverageObject, Double> averageUz1Column = new TableColumn<>("average Uz1");
        averageUz1Column.setMinWidth(80);
        averageUz1Column.setCellValueFactory(new PropertyValueFactory<>("averageUz1New"));

        TableColumn<AverageObject, Double> averageUx2Column = new TableColumn<>("average Ux2");
        averageUx2Column.setMinWidth(80);
        averageUx2Column.setCellValueFactory(new PropertyValueFactory<>("averageUx2New"));

        TableColumn<AverageObject, Double> averageUy2Column = new TableColumn<>("average Uy2");
        averageUy2Column.setMinWidth(80);
        averageUy2Column.setCellValueFactory(new PropertyValueFactory<>("averageUy2New"));

        TableColumn<AverageObject, Double> averageUz2Column = new TableColumn<>("average Uz2");
        averageUz2Column.setMinWidth(80);
        averageUz2Column.setCellValueFactory(new PropertyValueFactory<>("averageUz2New"));

        TableColumn<AverageObject, Double> averageUx3Column = new TableColumn<>("average Ux3");
        averageUx3Column.setMinWidth(80);
        averageUx3Column.setCellValueFactory(new PropertyValueFactory<>("averageUx3New"));

        TableColumn<AverageObject, Double> averageUy3Column = new TableColumn<>("average Uy3");
        averageUy3Column.setMinWidth(80);
        averageUy3Column.setCellValueFactory(new PropertyValueFactory<>("averageUy3New"));

        TableColumn<AverageObject, Double> averageUz3Column = new TableColumn<>("average Uz3");
        averageUz3Column.setMinWidth(80);
        averageUz3Column.setCellValueFactory(new PropertyValueFactory<>("averageUz3New"));

        TableColumn<AverageObject, Double> averageUx4Column = new TableColumn<>("average Ux4");
        averageUx4Column.setMinWidth(80);
        averageUx4Column.setCellValueFactory(new PropertyValueFactory<>("averageUx4New"));

        TableColumn<AverageObject, Double> averageUy4Column = new TableColumn<>("average Uy4");
        averageUy4Column.setMinWidth(80);
        averageUy4Column.setCellValueFactory(new PropertyValueFactory<>("averageUy4New"));

        TableColumn<AverageObject, Double> averageUz4Column = new TableColumn<>("average Uz4");
        averageUz4Column.setMinWidth(80);
        averageUz4Column.setCellValueFactory(new PropertyValueFactory<>("averageUz4New"));

        tableAvarageObjects = new TableView<>();
        tableAvarageObjects.setItems(getAverageObject());
        tableAvarageObjects.getColumns().addAll(amountOfDataColumn, czasColumn, averageUx1Column, averageUy1Column, averageUz1Column,
                averageUx2Column, averageUy2Column, averageUz2Column, averageUx3Column, averageUy3Column, averageUz3Column,
                averageUx4Column, averageUy4Column, averageUz4Column);


        VBox vBox = new VBox();
        vBox.getChildren().addAll(layout, tableAvarageObjects);


        Scene scene = new Scene(vBox);
        window.setScene(scene);
        window.show();


    }


    private ObservableList<AverageObject> getAverageObject() {

        return FXCollections.observableArrayList();
    }


    private static void configureFileChooser(
            final FileChooser fileChooser) {
        fileChooser.setTitle("View files");
        fileChooser.setInitialDirectory(
                new File(System.getProperty("user.home"))
        );
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("DAT", "*.dat"),
                new FileChooser.ExtensionFilter("All Files", "*.*")

        );
    }


}

