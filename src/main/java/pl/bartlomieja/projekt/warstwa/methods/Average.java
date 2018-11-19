package pl.bartlomieja.projekt.warstwa.methods;

import pl.bartlomieja.projekt.warstwa.IO.RowDataObject;

import java.util.ArrayList;

public class Average {

    private double averageCzas;

    private double averageUx1;
    private double averageUy1;
    private double averageUz1;
    private double averageU1xyz;

    private double averageUx2;
    private double averageUy2;
    private double averageUz2;
    private double averageU2xyz;

    private double averageUx3;
    private double averageUy3;
    private double averageUz3;
    private double averageU3xyz;

    private double averageUx4;
    private double averageUy4;
    private double averageUz4;
    private double averageU4xyz;




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

    public double getAverageU1xyz() {
        return averageU1xyz;
    }

    public double getAverageU2xyz() {
        return averageU2xyz;
    }

    public double getAverageU3xyz() {
        return averageU3xyz;
    }

    public void makeAverage(ArrayList<Object> allRowDataObject, ArrayList<AverageObject> averageObjects) {

        double averageComponentCzas = 0;

        double averageComponentUx1 = 0;
        double averageComponentUy1 = 0;
        double averageComponentUz1 = 0;

        double averageComponentUx2 = 0;
        double averageComponentUy2 = 0;
        double averageComponentUz2 = 0;

        double averageComponentUx3 = 0;
        double averageComponentUy3 = 0;
        double averageComponentUz3 = 0;

        double averageComponentUx4 = 0;
        double averageComponentUy4 = 0;
        double averageComponentUz4 = 0;




        for (int i = 0; i < allRowDataObject.size(); i++) {
            Object anAllRowDataObject = allRowDataObject.get(i);

            ArrayList<RowDataObject> dataArrayToAverage = (ArrayList<RowDataObject>) anAllRowDataObject;
            for (int i1 = 0; i1 < dataArrayToAverage.size(); i1++) {

                averageComponentCzas = averageComponentCzas + Double.parseDouble(dataArrayToAverage.get(i1).getCzas());

                averageComponentUx1 = averageComponentUx1 + Double.parseDouble(dataArrayToAverage.get(i1).getUx1());
                averageComponentUy1 = averageComponentUy1 + Double.parseDouble(dataArrayToAverage.get(i1).getUy1());
                averageComponentUz1 = averageComponentUz1 + Double.parseDouble(dataArrayToAverage.get(i1).getUz1());

                averageComponentUx2 = averageComponentUx2 + Double.parseDouble(dataArrayToAverage.get(i1).getUx2());
                averageComponentUy2 = averageComponentUy2 + Double.parseDouble(dataArrayToAverage.get(i1).getUy2());
                averageComponentUz2 = averageComponentUz2 + Double.parseDouble(dataArrayToAverage.get(i1).getUz2());

                averageComponentUx3 = averageComponentUx3 + Double.parseDouble(dataArrayToAverage.get(i1).getUx3());
                averageComponentUy3 = averageComponentUy3 + Double.parseDouble(dataArrayToAverage.get(i1).getUy3());
                averageComponentUz3 = averageComponentUz3 + Double.parseDouble(dataArrayToAverage.get(i1).getUz3());

                averageComponentUx4 = averageComponentUx4 + Double.parseDouble(dataArrayToAverage.get(i1).getUx4());
                averageComponentUy4 = averageComponentUy4 + Double.parseDouble(dataArrayToAverage.get(i1).getUy4());
                averageComponentUz4 = averageComponentUz4 + Double.parseDouble(dataArrayToAverage.get(i1).getUz4());






            }

            int sizeRowDataVariable = dataArrayToAverage.size();

            averageCzas = averageComponentCzas / sizeRowDataVariable;

            averageUx1 = averageComponentUx1 / sizeRowDataVariable;
            averageUy1 = averageComponentUy1 / sizeRowDataVariable;
            averageUz1 = averageComponentUz1 / sizeRowDataVariable;
            averageU1xyz = Math.sqrt((averageUx1*averageUx1)+(averageUy1*averageUy1)+(averageUz1*averageUz1));

            averageUx2 = averageComponentUx2 / sizeRowDataVariable;
            averageUy2 = averageComponentUy2 / sizeRowDataVariable;
            averageUz2 = averageComponentUz2 / sizeRowDataVariable;
            averageU2xyz = Math.sqrt((averageUx2*averageUx2)+(averageUy2*averageUy2)+(averageUz2*averageUz2));

            averageUx3 = averageComponentUx3 / sizeRowDataVariable;
            averageUy3 = averageComponentUy3 / sizeRowDataVariable;
            averageUz3 = averageComponentUz3 / sizeRowDataVariable;
            averageU3xyz = Math.sqrt((averageUx3*averageUx3)+(averageUy3*averageUy3)+(averageUz3*averageUz3));

            averageUx4 = averageComponentUx4 / sizeRowDataVariable;
            averageUy4 = averageComponentUy4 / sizeRowDataVariable;
            averageUz4 = averageComponentUz4 / sizeRowDataVariable;
            averageU4xyz = Math.sqrt((averageUx4*averageUx4)+(averageUy4*averageUy4)+(averageUz4*averageUz4));





            AverageObject nextAverageObject = new AverageObject(averageCzas, averageUx1, averageUy1, averageUz1, averageU1xyz,
                    averageUx2, averageUy2, averageUz2, averageU2xyz, averageUx3, averageUy3,
                    averageUy4,averageU3xyz, averageUx4 , averageUz3, averageUz4,averageU3xyz,
                    sizeRowDataVariable, i );
            averageObjects.add(nextAverageObject);

            averageComponentCzas = averageComponentUx1 = averageComponentUy1 = averageComponentUz1 =
                    averageComponentUx2 = averageComponentUy2 = averageComponentUz2 =
                            averageComponentUx3 = averageComponentUy3 = averageComponentUz3 =
                                    averageComponentUx4 = averageComponentUy4 = averageComponentUz4 = 0;

        }
    }


}
