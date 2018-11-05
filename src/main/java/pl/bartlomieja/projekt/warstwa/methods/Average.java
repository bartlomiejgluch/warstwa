package pl.bartlomieja.projekt.warstwa.methods;

import pl.bartlomieja.projekt.warstwa.IO.RowData;

import java.util.ArrayList;

public class Average {

    double averageCzas;
    double averageUx1;
    double averageUx2;
    double averageUx3;
    double averageUx4;

    double averageUy1;
    double averageUy2;
    double averageUy3;
    double averageUy4;

    double averageUz1;
    double averageUz2;
    double averageUz3;
    double averageUz4;

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


        for (int i = 0; i < allRowDataObject.size(); i++) {

            ArrayList<RowData> firstElement = (ArrayList<RowData>) allRowDataObject.get(i);
            for (int j = 0; j < firstElement.size(); j++) {


                averageComponentCzas = averageComponentCzas + Float.parseFloat(firstElement.get(j).getCzas());
                averageComponentUx1 = averageComponentUx1 + Float.parseFloat(firstElement.get(j).getUx1());
                averageComponentUx2 = averageComponentUx2 + Float.parseFloat(firstElement.get(j).getUx2());
                averageComponentUx3 = averageComponentUx3 + Float.parseFloat(firstElement.get(j).getUx3());
                averageComponentUx4 = averageComponentUx4 + Float.parseFloat(firstElement.get(j).getUx4());

                averageComponentUy1 = averageComponentUy1 + Float.parseFloat(firstElement.get(j).getUy1());
                averageComponentUy2 = averageComponentUy2 + Float.parseFloat(firstElement.get(j).getUy2());
                averageComponentUy3 = averageComponentUy3 + Float.parseFloat(firstElement.get(j).getUy3());
                averageComponentUy4 = averageComponentUy4 + Float.parseFloat(firstElement.get(j).getUy4());

                averageComponentUz1 = averageComponentUz1 + Float.parseFloat(firstElement.get(j).getUz1());
                averageComponentUz2 = averageComponentUz2 + Float.parseFloat(firstElement.get(j).getUz2());
                averageComponentUz3 = averageComponentUz3 + Float.parseFloat(firstElement.get(j).getUz3());
                averageComponentUz4 = averageComponentUz4 + Float.parseFloat(firstElement.get(j).getUz4());


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
                    averageUy1, averageUy2, averageUy3, averageUy4, averageUz1, averageUz2, averageUz3, averageUz4);
            averageObjects.add(nextAverageObject);


        }
    }


}


