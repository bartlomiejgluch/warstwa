package pl.bartlomieja.projekt.warstwa.GUI;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import pl.bartlomieja.projekt.warstwa.methods.AverageObject;

public class AverageTable {

    public TableView<AverageObject> getAverageTable(){

    TableView<AverageObject> tableAverageObjects;

    TableColumn<AverageObject, Integer> ordinalNumberColumn = new TableColumn<>("Ordinal number");
        ordinalNumberColumn.setMinWidth(50);
        ordinalNumberColumn.setCellValueFactory(new PropertyValueFactory<>("ordinalNumberNew"));

    TableColumn<AverageObject, Integer> amountOfDataColumn = new TableColumn<>("amount of data");
        amountOfDataColumn.setMinWidth(50);
        amountOfDataColumn.setCellValueFactory(new PropertyValueFactory<>("amountOfDataNew"));

    TableColumn<AverageObject, Double> czasColumn = new TableColumn<>("average time");
        czasColumn.setMinWidth(50);
        czasColumn.setCellValueFactory(new PropertyValueFactory<>("averageCzasNew"));

    TableColumn<AverageObject, Double> averageUx1Column = new TableColumn<>("average Ux1");
        averageUx1Column.setMinWidth(50);
        averageUx1Column.setCellValueFactory(new PropertyValueFactory<>("averageUx1New"));

    TableColumn<AverageObject, Double> averageUy1Column = new TableColumn<>("average Uy1");
        averageUy1Column.setMinWidth(50);
        averageUy1Column.setCellValueFactory(new PropertyValueFactory<>("averageUy1New"));

    TableColumn<AverageObject, Double> averageUz1Column = new TableColumn<>("average Uz1");
        averageUz1Column.setMinWidth(50);
        averageUz1Column.setCellValueFactory(new PropertyValueFactory<>("averageUz1New"));

    TableColumn<AverageObject, Double> averageU1xyzColumn = new TableColumn<>("averageU1xyzNew");
        averageU1xyzColumn.setMinWidth(50);
        averageU1xyzColumn.setCellValueFactory(new PropertyValueFactory<>("averageU1xyzNew"));


    TableColumn<AverageObject, Double> averageUx2Column = new TableColumn<>("average Ux2");
        averageUx2Column.setMinWidth(50);
        averageUx2Column.setCellValueFactory(new PropertyValueFactory<>("averageUx2New"));

    TableColumn<AverageObject, Double> averageUy2Column = new TableColumn<>("average Uy2");
        averageUy2Column.setMinWidth(50);
        averageUy2Column.setCellValueFactory(new PropertyValueFactory<>("averageUy2New"));

    TableColumn<AverageObject, Double> averageUz2Column = new TableColumn<>("average Uz2");
        averageUz2Column.setMinWidth(50);
        averageUz2Column.setCellValueFactory(new PropertyValueFactory<>("averageUz2New"));

    TableColumn<AverageObject, Double> averageU2xyzColumn = new TableColumn<>("averageU2xyzNew");
        averageU2xyzColumn.setMinWidth(50);
        averageU2xyzColumn.setCellValueFactory(new PropertyValueFactory<>("averageU2xyzNew"));


    TableColumn<AverageObject, Double> averageUx3Column = new TableColumn<>("average Ux3");
        averageUx3Column.setMinWidth(50);
        averageUx3Column.setCellValueFactory(new PropertyValueFactory<>("averageUx3New"));

    TableColumn<AverageObject, Double> averageUy3Column = new TableColumn<>("average Uy3");
        averageUy3Column.setMinWidth(50);
        averageUy3Column.setCellValueFactory(new PropertyValueFactory<>("averageUy3New"));

    TableColumn<AverageObject, Double> averageUz3Column = new TableColumn<>("average Uz3");
        averageUz3Column.setMinWidth(50);
        averageUz3Column.setCellValueFactory(new PropertyValueFactory<>("averageUz3New"));

    TableColumn<AverageObject, Double> averageU3xyzColumn = new TableColumn<>("averageU3xyzNew");
        averageU3xyzColumn.setMinWidth(50);
        averageU3xyzColumn.setCellValueFactory(new PropertyValueFactory<>("averageU3xyzNew"));


    TableColumn<AverageObject, Double> averageUx4Column = new TableColumn<>("average Ux4");
        averageUx4Column.setMinWidth(50);
        averageUx4Column.setCellValueFactory(new PropertyValueFactory<>("averageUx4New"));

    TableColumn<AverageObject, Double> averageUy4Column = new TableColumn<>("average Uy4");
        averageUy4Column.setMinWidth(50);
        averageUy4Column.setCellValueFactory(new PropertyValueFactory<>("averageUy4New"));

    TableColumn<AverageObject, Double> averageUz4Column = new TableColumn<>("average Uz4");
        averageUz4Column.setMinWidth(50);
        averageUz4Column.setCellValueFactory(new PropertyValueFactory<>("averageUz4New"));

    TableColumn<AverageObject, Double> averageU4xyzColumn = new TableColumn<>("averageU4xyzNew");
        averageU4xyzColumn.setMinWidth(50);
        averageU4xyzColumn.setCellValueFactory(new PropertyValueFactory<>("averageU4xyzNew"));


    tableAverageObjects = new TableView<>();
        tableAverageObjects.setItems(getAverageObject());
        tableAverageObjects.getColumns().addAll(ordinalNumberColumn, amountOfDataColumn, czasColumn,
                                                averageUx1Column, averageUy1Column, averageUz1Column, averageU1xyzColumn,
                                                averageUx2Column, averageUy2Column, averageUz2Column, averageU2xyzColumn,
                                                averageUx3Column, averageUy3Column, averageUz3Column, averageU3xyzColumn,
                                                averageUx4Column, averageUy4Column, averageUz4Column, averageU4xyzColumn);






        return tableAverageObjects;
}

    private ObservableList<AverageObject> getAverageObject() {

        return FXCollections.observableArrayList();
    }

}
