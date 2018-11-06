package pl.bartlomieja.projekt.warstwa.methods;

import pl.bartlomieja.projekt.warstwa.IO.RowData;

import java.util.ArrayList;

public class Average {

    private double averageCzas;
    private double averageUx1;
    private double averageUx2;
    private double averageUx3;
    private double averageUx4;

    private double averageUy1;
    private double averageUy2;
    private double averageUy3;
    private double averageUy4;

    private double averageUz1;
    private double averageUz2;
    private double averageUz3;
    private double averageUz4;

    public double getAverageCzas() {
        return averageCzas;
    }

    public double getAverageUx1() {
        return averageUx1;
    }

    public double getAverageUx2() {
        return averageUx2;
    }

    public double getAverageUx3() {
        return averageUx3;
    }

    public double getAverageUx4() {
        return averageUx4;
    }

    public double getAverageUy1() {
        return averageUy1;
    }

    public double getAverageUy2() {
        return averageUy2;
    }

    public double getAverageUy3() {
        return averageUy3;
    }

    public double getAverageUy4() {
        return averageUy4;
    }

    public double getAverageUz1() {
        return averageUz1;
    }

    public double getAverageUz2() {
        return averageUz2;
    }

    public double getAverageUz3() {
        return averageUz3;
    }

    public double getAverageUz4() {
        return averageUz4;
    }

    public void makeAverage(ArrayList<Object> allRowDataObject, ArrayList<AverageObject> averageObjects) {

        double averageComponentCzas = 0;
        double averageComponentUx1 = 0;
        double averageComponentUx2 = 0;
        double averageComponentUx3 = 0;
        double averageComponentUx4 = 0;


        double averageComponentUy1 = 0;
        double averageComponentUy2 = 0;
        double averageComponentUy3 = 0;
        double averageComponentUy4 = 0;

        double averageComponentUz1 = 0;
        double averageComponentUz2 = 0;
        double averageComponentUz3 = 0;
        double averageComponentUz4 = 0;


        for (Object anAllRowDataObject : allRowDataObject) {

            ArrayList<RowData> firstElement = (ArrayList<RowData>) anAllRowDataObject;
            for (RowData aFirstElement : firstElement) {


                averageComponentCzas = averageComponentCzas + Float.parseFloat(aFirstElement.getCzas());
                averageComponentUx1 = averageComponentUx1 + Float.parseFloat(aFirstElement.getUx1());
                averageComponentUx2 = averageComponentUx2 + Float.parseFloat(aFirstElement.getUx2());
                averageComponentUx3 = averageComponentUx3 + Float.parseFloat(aFirstElement.getUx3());
                averageComponentUx4 = averageComponentUx4 + Float.parseFloat(aFirstElement.getUx4());

                averageComponentUy1 = averageComponentUy1 + Float.parseFloat(aFirstElement.getUy1());
                averageComponentUy2 = averageComponentUy2 + Float.parseFloat(aFirstElement.getUy2());
                averageComponentUy3 = averageComponentUy3 + Float.parseFloat(aFirstElement.getUy3());
                averageComponentUy4 = averageComponentUy4 + Float.parseFloat(aFirstElement.getUy4());

                averageComponentUz1 = averageComponentUz1 + Float.parseFloat(aFirstElement.getUz1());
                averageComponentUz2 = averageComponentUz2 + Float.parseFloat(aFirstElement.getUz2());
                averageComponentUz3 = averageComponentUz3 + Float.parseFloat(aFirstElement.getUz3());
                averageComponentUz4 = averageComponentUz4 + Float.parseFloat(aFirstElement.getUz4());


            }

            int sizeRowDataVariable = firstElement.size();

            averageCzas = averageComponentCzas / sizeRowDataVariable;
            averageUx1 = averageComponentUx1 / sizeRowDataVariable;
            averageUx2 = averageComponentUx2 / sizeRowDataVariable;
            averageUx3 = averageComponentUx3 / sizeRowDataVariable;
            averageUx4 = averageComponentUx4 / sizeRowDataVariable;

            averageUy1 = averageComponentUy1 / sizeRowDataVariable;
            averageUy2 = averageComponentUy2 / sizeRowDataVariable;
            averageUy3 = averageComponentUy3 / sizeRowDataVariable;
            averageUy4 = averageComponentUy4 / sizeRowDataVariable;

            averageUz1 = averageComponentUz1 / sizeRowDataVariable;
            averageUz2 = averageComponentUz2 / sizeRowDataVariable;
            averageUz3 = averageComponentUz3 / sizeRowDataVariable;
            averageUz4 = averageComponentUz4 / sizeRowDataVariable;

            AverageObject nextAverageObject = new AverageObject(averageCzas, averageUx1, averageUx2, averageUx3, averageUx4,
                    averageUy1, averageUy2, averageUy3, averageUy4, averageUz1, averageUz2, averageUz3, averageUz4, sizeRowDataVariable);
            averageObjects.add(nextAverageObject);


        }
    }


}


