package pl.bartlomieja.projekt.warstwa.GUI;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import pl.bartlomieja.projekt.warstwa.methods.TurbulenceIntensityObject;

public class TurbulenceIntensityTable {


    public TableView<TurbulenceIntensityObject> getTurbulenceIntensityTable() {

        TableView<TurbulenceIntensityObject> tableTurbulenceInt;


        TableColumn<TurbulenceIntensityObject, Double> turbelunceIntensity1ObjectColumn = new TableColumn<>("turbelunceIntensity1Object");
        turbelunceIntensity1ObjectColumn.setMinWidth(50);
        turbelunceIntensity1ObjectColumn.setCellValueFactory(new PropertyValueFactory<>("turbelunceIntensity1Object"));

        TableColumn<TurbulenceIntensityObject, Double> turbelunceIntensity2ObjectColumn = new TableColumn<>("turbelunceIntensity2Object");
        turbelunceIntensity2ObjectColumn.setMinWidth(50);
        turbelunceIntensity2ObjectColumn.setCellValueFactory(new PropertyValueFactory<>("turbelunceIntensity2Object"));

        TableColumn<TurbulenceIntensityObject, Double> turbelunceIntensity3ObjectColumn = new TableColumn<>("turbelunceIntensity3Object");
        turbelunceIntensity3ObjectColumn.setMinWidth(50);
        turbelunceIntensity3ObjectColumn.setCellValueFactory(new PropertyValueFactory<>("turbelunceIntensity3Object"));

        TableColumn<TurbulenceIntensityObject, Double> turbelunceIntensity4ObjectColumn = new TableColumn<>("turbelunceIntensity4Object");
        turbelunceIntensity4ObjectColumn.setMinWidth(50);
        turbelunceIntensity4ObjectColumn.setCellValueFactory(new PropertyValueFactory<>("turbelunceIntensity4Object"));


        TableColumn<TurbulenceIntensityObject, Integer> turbulenceOrdinalNumberColumn = new TableColumn<>("turbulenceOrdinalNumber");
        turbulenceOrdinalNumberColumn.setMinWidth(50);
        turbulenceOrdinalNumberColumn.setCellValueFactory(new PropertyValueFactory<>("turbulenceOrdinalNumber"));


        tableTurbulenceInt = new TableView<>();
        tableTurbulenceInt.setItems(getTurbulenceIntObject());
        tableTurbulenceInt.getColumns().addAll( turbulenceOrdinalNumberColumn, turbelunceIntensity1ObjectColumn,
                turbelunceIntensity2ObjectColumn,turbelunceIntensity3ObjectColumn,turbelunceIntensity4ObjectColumn);



        return tableTurbulenceInt;

    }



    private ObservableList<TurbulenceIntensityObject> getTurbulenceIntObject() {

        return FXCollections.observableArrayList();
    }




}
