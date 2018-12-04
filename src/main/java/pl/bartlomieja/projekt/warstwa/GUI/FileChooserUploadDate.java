package pl.bartlomieja.projekt.warstwa.GUI;

import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.util.List;

public class FileChooserUploadDate {

    final FileChooser fileChooser = new FileChooser();
    public int chooseFileProperty;

    public List<File> getDataFromFile(Stage primaryStage, int chooseFileProperty) {

        if (chooseFileProperty == 0) {

            configureFileChooser(fileChooser);


        } else {


            configureFileChooserInBits(fileChooser);

        }


        List<File> list =
                fileChooser.showOpenMultipleDialog(primaryStage);


        return list;
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


    private static void configureFileChooserInBits(
            final FileChooser fileChooser) {
        fileChooser.setTitle("View files");
        fileChooser.setInitialDirectory(
                new File(System.getProperty("user.home"))
        );
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("All Files", "*.*")

        );
    }


}
