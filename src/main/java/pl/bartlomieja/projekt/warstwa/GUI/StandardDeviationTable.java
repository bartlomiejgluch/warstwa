package pl.bartlomieja.projekt.warstwa.GUI;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import pl.bartlomieja.projekt.warstwa.methods.StandardDeviationObject;

public class StandardDeviationTable {

    public TableView<StandardDeviationObject> getStandardDeviationTable() {

        TableView<StandardDeviationObject> tableStdDevObjects;


        TableColumn<StandardDeviationObject, Integer> stdDevAmountOfDataNewColumn = new TableColumn<>("stdDevAmountOfDataNew");
        stdDevAmountOfDataNewColumn.setMinWidth(50);
        stdDevAmountOfDataNewColumn.setCellValueFactory(new PropertyValueFactory<>("stdDevAmountOfDataNew"));

        TableColumn<StandardDeviationObject, Integer> stdDevOrdinalNumberNewColumn = new TableColumn<>("stdDevOrdinalNumberNew");
        stdDevOrdinalNumberNewColumn.setMinWidth(50);
        stdDevOrdinalNumberNewColumn.setCellValueFactory(new PropertyValueFactory<>("stdDevOrdinalNumberNew"));


        TableColumn<StandardDeviationObject, Double> stdDevUx1NewColumn = new TableColumn<>("stdDevUx1New");
        stdDevUx1NewColumn.setMinWidth(50);
        stdDevUx1NewColumn.setCellValueFactory(new PropertyValueFactory<>("stdDevUx1New"));

        TableColumn<StandardDeviationObject, Double> stdDevUy1NewColumn = new TableColumn<>("stdDevUy1New");
        stdDevUy1NewColumn.setMinWidth(50);
        stdDevUy1NewColumn.setCellValueFactory(new PropertyValueFactory<>("stdDevUy1New"));

        TableColumn<StandardDeviationObject, Double> stdDevUz1NewColumn = new TableColumn<>("stdDevUz1New");
        stdDevUz1NewColumn.setMinWidth(50);
        stdDevUz1NewColumn.setCellValueFactory(new PropertyValueFactory<>("stdDevUz1New"));


        TableColumn<StandardDeviationObject, Double> stdDevUx2NewColumn = new TableColumn<>("stdDevUx2New");
        stdDevUx2NewColumn.setMinWidth(50);
        stdDevUx2NewColumn.setCellValueFactory(new PropertyValueFactory<>("stdDevUx2New"));

        TableColumn<StandardDeviationObject, Double> stdDevUy2NewColumn = new TableColumn<>("stdDevUy2New");
        stdDevUy2NewColumn.setMinWidth(50);
        stdDevUy2NewColumn.setCellValueFactory(new PropertyValueFactory<>("stdDevUy2New"));

        TableColumn<StandardDeviationObject, Double> stdDevUz2NewColumn = new TableColumn<>("stdDevUz2New");
        stdDevUz2NewColumn.setMinWidth(50);
        stdDevUz2NewColumn.setCellValueFactory(new PropertyValueFactory<>("stdDevUz2New"));


        TableColumn<StandardDeviationObject, Double> stdDevUx3NewColumn = new TableColumn<>("stdDevUx3New");
        stdDevUx3NewColumn.setMinWidth(50);
        stdDevUx3NewColumn.setCellValueFactory(new PropertyValueFactory<>("stdDevUx3New"));

        TableColumn<StandardDeviationObject, Double> stdDevUy3NewColumn = new TableColumn<>("stdDevUy3New");
        stdDevUy3NewColumn.setMinWidth(50);
        stdDevUy3NewColumn.setCellValueFactory(new PropertyValueFactory<>("stdDevUy3New"));

        TableColumn<StandardDeviationObject, Double> stdDevUz3NewColumn = new TableColumn<>("stdDevUz3New");
        stdDevUz3NewColumn.setMinWidth(50);
        stdDevUz3NewColumn.setCellValueFactory(new PropertyValueFactory<>("stdDevUz3New"));


        TableColumn<StandardDeviationObject, Double> stdDevUx4NewColumn = new TableColumn<>("stdDevUx4New");
        stdDevUx4NewColumn.setMinWidth(50);
        stdDevUx4NewColumn.setCellValueFactory(new PropertyValueFactory<>("stdDevUx1New"));

        TableColumn<StandardDeviationObject, Double> stdDevUy4NewColumn = new TableColumn<>("stdDevUy4New");
        stdDevUy4NewColumn.setMinWidth(50);
        stdDevUy4NewColumn.setCellValueFactory(new PropertyValueFactory<>("stdDevUy4New"));

        TableColumn<StandardDeviationObject, Double> stdDevUz4NewColumn = new TableColumn<>("stdDevUz4New");
        stdDevUz4NewColumn.setMinWidth(50);
        stdDevUz4NewColumn.setCellValueFactory(new PropertyValueFactory<>("stdDevUz4New"));


        tableStdDevObjects = new TableView<>();
        tableStdDevObjects.setItems(getStdDevObject());
        tableStdDevObjects.getColumns().addAll(stdDevOrdinalNumberNewColumn, stdDevAmountOfDataNewColumn,
                stdDevUx1NewColumn, stdDevUy1NewColumn, stdDevUz1NewColumn,
                stdDevUx2NewColumn, stdDevUy2NewColumn, stdDevUz2NewColumn,
                stdDevUx3NewColumn, stdDevUy3NewColumn, stdDevUz3NewColumn,
                stdDevUx4NewColumn, stdDevUy4NewColumn, stdDevUz4NewColumn);



        return tableStdDevObjects;

    }



    private ObservableList<StandardDeviationObject> getStdDevObject() {

        return FXCollections.observableArrayList();
    }


}



