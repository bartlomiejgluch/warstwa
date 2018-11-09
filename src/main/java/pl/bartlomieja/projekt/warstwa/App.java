package pl.bartlomieja.projekt.warstwa;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import pl.bartlomieja.projekt.warstwa.IO.InputFile;
import pl.bartlomieja.projekt.warstwa.IO.RowDataObject;
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

    private int xValue = 0;

    Button button;
    private Stage window;
    private BorderPane layout;

    private TableView<AverageObject> tableAverageObjects;


    public static void main(String[] args) {

        launch(args);
    }


    @Override
    public void start(Stage primaryStage) {

        final FileChooser fileChooser = new FileChooser();

        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Measurement number");
        final LineChart<Number, Number> lineChart =
                new LineChart<Number, Number>(xAxis, yAxis);



        lineChart.setTitle("Average values");





        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Ux2");

        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Uy2");

        XYChart.Series series3 = new XYChart.Series();
        series3.setName("Uz2");

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

                xValue=list.size();
                for (int i = 0; i < list.size(); i++) {
                    File file2 = list.get(i);
                    ArrayList<RowDataObject> rowDatumObjects = new ArrayList<>();
                    inputFile.readFile(rowDatumObjects, file2);
                    allRowDataObject.add(rowDatumObjects);


                }



            }

            AlertBox.display("Message", new String("Loaded " + list.size() + " files"));
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


                tableAverageObjects.getItems().add(averageObject);


                xAxis.setAutoRanging(false);
                xAxis.setLowerBound(0);
                xAxis.setUpperBound(xValue);
                xAxis.setTickUnit(1);

                yAxis.setAutoRanging(false);
                yAxis.setLowerBound(0);
                yAxis.setUpperBound(4);
                yAxis.setTickUnit(0.5);

                series1.getData().add(new XYChart.Data(averageObject.getOrdinalNumber(), averageObject.getAverageUx2New()));
                series2.getData().add(new XYChart.Data(averageObject.getOrdinalNumber(), averageObject.getAverageUy2New()));
                series3.getData().add(new XYChart.Data(averageObject.getOrdinalNumber(), averageObject.getAverageUz2New()));

            }

            lineChart.getData().addAll(series1, series2, series3);

        });


        TableColumn<AverageObject, Integer> ordinalNumberColumn = new TableColumn<>("Ordinal number");
        ordinalNumberColumn.setMinWidth(60);
        ordinalNumberColumn.setCellValueFactory(new PropertyValueFactory<>("ordinalNumber"));

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

        tableAverageObjects = new TableView<>();
        tableAverageObjects.setItems(getAverageObject());
        tableAverageObjects.getColumns().addAll(ordinalNumberColumn, amountOfDataColumn, czasColumn, averageUx1Column, averageUy1Column, averageUz1Column,
                averageUx2Column, averageUy2Column, averageUz2Column, averageUx3Column, averageUy3Column, averageUz3Column,
                averageUx4Column, averageUy4Column, averageUz4Column);




        VBox vBox = new VBox();
        vBox.setPrefWidth(800);
        vBox.setPrefHeight(600);

        vBox.getChildren().addAll(layout, button1, tableAverageObjects, lineChart);
        vBox.setMargin(button1, new Insets(10, 10, 10, 10));

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

