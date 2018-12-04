package pl.bartlomieja.projekt.warstwa;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import pl.bartlomieja.projekt.warstwa.GUI.*;
import pl.bartlomieja.projekt.warstwa.IO.InputFile;
import pl.bartlomieja.projekt.warstwa.IO.ReadFileBits;
import pl.bartlomieja.projekt.warstwa.IO.RowDataObject;
import pl.bartlomieja.projekt.warstwa.methods.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class App extends Application {

    private ArrayList<Object> allRowDataObject = new ArrayList<>();
    private ArrayList<AverageObject> averageObjects = new ArrayList<>();
    private InputFile inputFile = new InputFile();
    private Average average = new Average();
    ArrayList<StandardDeviationObject> standardDeviationObjects = new ArrayList<>();
    MakeStandardDeviation makeStandardDeviation = new MakeStandardDeviation();
    ArrayList<TurbulenceIntensityObject> turbulenceIntensityObjects = new ArrayList<>();

    private ReadFileBits readFileBits = new ReadFileBits();

    public int chooseFileProperty;


    private int xValue = 0;

    private Stage window;
    private BorderPane layout;


    public static void main(String[] args) {

        launch(args);
    }


    @Override
    public void start(Stage primaryStage) {


        window = primaryStage;
        window.setTitle("Program Warstwa - Autor: Bartłomiej Głuch");

        //file menu
        Menu fileMenu = new Menu("File");

        //menu items
        MenuItem openFile = new MenuItem("Open file...");

        MenuItem openFileInBits = new MenuItem("Open bits file...");

        FileChooserUploadDate fileChooserUploadDate = new FileChooserUploadDate();

        FileChooserUploadDate fileChooserUploadDateInBits = new FileChooserUploadDate();

        openFile.setOnAction(event -> {

            chooseFileProperty = 0;
            List<File> list = fileChooserUploadDate.getDataFromFile(primaryStage, chooseFileProperty);

            if (list != null) {

                xValue = list.size() - 1;
                for (int i = 0; i < list.size(); i++) {
                    File file2 = list.get(i);
                    ArrayList<RowDataObject> rowDataAllObjectsTemporary = new ArrayList<>();
                    inputFile.readFile(rowDataAllObjectsTemporary, file2);
                    allRowDataObject.add(rowDataAllObjectsTemporary);


                }


            }

            try {
                AlertBox.display("Message", new String("Loaded " + list.size() + " files"));
            } catch (Exception e) {

            }

        });


        openFileInBits.setOnAction(event -> {

            chooseFileProperty = 1;
            List<File> listFileInBits = fileChooserUploadDateInBits.getDataFromFile(primaryStage, chooseFileProperty);

            if (listFileInBits != null) {


                for (int i = 0; i < listFileInBits.size(); i++) {

                    File file3 = listFileInBits.get(i);
                    ArrayList<RowDataObject> rowDataAllObjectsTemporary = new ArrayList<>();
                    readFileBits.readFileInBits(rowDataAllObjectsTemporary,file3);
                    allRowDataObject.add(rowDataAllObjectsTemporary);

                }


            }

            try {
                AlertBox.display("Message", new String("Loaded " + listFileInBits.size() + " files"));
            } catch (Exception e) {
            }
        });


        MenuItem exitButton = new MenuItem("Exit");
        exitButton.setOnAction(event -> System.exit(0));

        fileMenu.getItems().add(openFile);
        fileMenu.getItems().add(openFileInBits);
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().add(exitButton);


        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu);

        layout = new BorderPane();
        layout.setTop(menuBar);


        AverageTable averageTable = new AverageTable();
        TableView<AverageObject> avarageTableVbox = averageTable.getAverageTable();

        StandardDeviationTable standardDeviationTable = new StandardDeviationTable();
        TableView<StandardDeviationObject> standardDeviationTableVbox = standardDeviationTable.getStandardDeviationTable();


        AverageChart averageChart = new AverageChart();
        LineChart<Number, Number> averageChartVbox = averageChart.getAverageChart();

        Button buttonCalculateAverage = new Button("Average");
        buttonCalculateAverage.setOnAction(event -> {
            average.makeAverage(allRowDataObject, averageObjects);

            for (AverageObject averageObject : averageObjects) {

                avarageTableVbox.getItems().add(averageObject);

                averageChart.series1.getData().add(new XYChart.Data(averageObject.getOrdinalNumberNew(), averageObject.getAverageUx2New()));
                averageChart.series2.getData().add(new XYChart.Data(averageObject.getOrdinalNumberNew(), averageObject.getAverageUy2New()));
                averageChart.series3.getData().add(new XYChart.Data(averageObject.getOrdinalNumberNew(), averageObject.getAverageUz2New()));

            }

            averageChart.xAxis.setUpperBound(xValue);
            averageChartVbox.getData().addAll(averageChart.series1, averageChart.series2, averageChart.series3);

        });

        Button buttonCalculateStdDev = new Button("Standard Devision");

        buttonCalculateStdDev.setOnAction(event -> {

            makeStandardDeviation.calculateStdDev(allRowDataObject, standardDeviationObjects);

            for (int i = 0; i < standardDeviationObjects.size(); i++) {

                standardDeviationTableVbox.getItems().add(standardDeviationObjects.get(i));

            }

        });

        TurbulenceIntensityTable turbulenceIntensityTable = new TurbulenceIntensityTable();
        TableView<TurbulenceIntensityObject> turbulenceIntensityTableVBox = turbulenceIntensityTable.getTurbulenceIntensityTable();

        TurbulenceIntensity turbulenceIntensity = new TurbulenceIntensity();


        Button buttonCalculateTurbulenceInstensity = new Button("Turbulence Intensity");
        buttonCalculateTurbulenceInstensity.setOnAction(event -> {
            turbulenceIntensity.calculateTurbulenceIntensity(averageObjects, standardDeviationObjects, turbulenceIntensityObjects);

            for (int i = 0; i < turbulenceIntensityObjects.size(); i++) {


                turbulenceIntensityTableVBox.getItems().add(turbulenceIntensityObjects.get(i));

            }

        });


        TabPane tabPane = new TabPane();
        Tab averageTab = new Tab("Average Tab");
        Tab standardDeviationTab = new Tab("Standard Deviation");
        Tab turbulenceIntensityTab = new Tab("Turbulence Intensity");
        tabPane.getTabs().addAll(averageTab, standardDeviationTab, turbulenceIntensityTab);


        VBox averageTabVBox = new VBox();
        averageTabVBox.setPrefWidth(1200);
        averageTabVBox.setPrefHeight(600);
        averageTabVBox.getChildren().addAll(buttonCalculateAverage, avarageTableVbox, averageChartVbox);
        averageTabVBox.setMargin(buttonCalculateAverage, new Insets(10, 10, 10, 10));
        averageTab.setContent(averageTabVBox);


        VBox standardDeviationTabVBox = new VBox();
        standardDeviationTabVBox.setPrefWidth(1200);
        standardDeviationTabVBox.setPrefHeight(600);
        standardDeviationTabVBox.getChildren().addAll(buttonCalculateStdDev, standardDeviationTableVbox);
        standardDeviationTabVBox.setMargin(buttonCalculateStdDev, new Insets(10, 10, 10, 10));
        standardDeviationTab.setContent(standardDeviationTabVBox);

        VBox turbulenceIntensityTabVBox = new VBox();
        turbulenceIntensityTabVBox.setPrefWidth(1200);
        turbulenceIntensityTabVBox.setPrefHeight(600);
        turbulenceIntensityTabVBox.getChildren().addAll(buttonCalculateTurbulenceInstensity, turbulenceIntensityTableVBox);
        turbulenceIntensityTabVBox.setMargin(buttonCalculateTurbulenceInstensity, new Insets(10, 10, 10, 10));
        turbulenceIntensityTab.setContent(turbulenceIntensityTabVBox);


        VBox layoutVBox = new VBox();
        layoutVBox.getChildren().addAll(layout, tabPane);

        Scene scene = new Scene(layoutVBox);
        window.setScene(scene);
        window.show();


    }


}

