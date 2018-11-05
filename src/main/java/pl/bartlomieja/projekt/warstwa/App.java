package pl.bartlomieja.projekt.warstwa;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import pl.bartlomieja.projekt.warstwa.IO.InputFile;
import pl.bartlomieja.projekt.warstwa.IO.RowData;
import pl.bartlomieja.projekt.warstwa.methods.Average;
import pl.bartlomieja.projekt.warstwa.methods.AverageObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App extends Application {

    public ArrayList<Object> allRowDataObject = new ArrayList<>();
    ArrayList<AverageObject> averageObjects = new ArrayList<>();
    InputFile inputFile = new InputFile();
    Average average = new Average();


    Button button;
    Stage window;
    BorderPane layout;

    int x=2;


    public static void main(String[] args) throws FileNotFoundException {

        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {

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
                    ArrayList<RowData> rowData = new ArrayList<RowData>();
                    inputFile.readFile(rowData, file2);
                    allRowDataObject.add(rowData);
                }

                average.makeAverage(allRowDataObject, averageObjects);
            }

        });

        MenuItem exitButton = new MenuItem("Exit");
        exitButton.setOnAction(event -> System.exit(0) );

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

            for (int i = 0; i < averageObjects.size(); i++) {

                System.out.println(averageObjects.get(i).getAverageUz2New());
            }

        });

        layout.setLeft(button1);


        Scene scene = new Scene(layout, 640, 480);
        window.setScene(scene);
        window.show();


    }


    private static void configureFileChooser(
            final FileChooser fileChooser) {
        fileChooser.setTitle("View files");
        fileChooser.setInitialDirectory(
                new File(System.getProperty("user.home"))
        );
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("All Files", "*.*"),
                new FileChooser.ExtensionFilter("DAT", "*.dat")
        );
    }


}

