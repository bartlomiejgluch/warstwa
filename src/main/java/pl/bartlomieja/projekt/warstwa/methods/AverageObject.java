package pl.bartlomieja.projekt.warstwa.methods;

public class AverageObject {


    private double averageCzasNew;
    private double averageUx1New;
    private double averageUy1New;
    private double averageUz1New;
    private double averageUx2New;
    private double averageUy2New;
    private double averageUz2New;
    private double averageUx3New;
    private double averageUy3New;
    private double averageUz3New;
    private double averageUx4New;
    private double averageUy4New;
    private double averageUz4New;
    private int amountOfData;


    protected AverageObject(double kAverageCzas,
                         double kAverageUx1,
                         double kAverageUy1,
                         double kAverageUz1,
                         double kAverageUx2,
                         double kAverageUy2,
                         double kAverageUz2,
                         double kAverageUx3,
                         double kAverageUy3,
                         double kAverageUz3,
                         double kAverageUx4,
                         double kAverageUy4,
                         double kAverageUz4,
                         int kamountOfData) {


        averageCzasNew = kAverageCzas;
        averageUx1New = kAverageUx1;
        averageUx2New = kAverageUx2;
        averageUx3New = kAverageUx3;
        averageUx4New = kAverageUx4;
        averageUy1New = kAverageUy1;
        averageUy2New = kAverageUy2;
        averageUy3New = kAverageUy3;
        averageUy4New = kAverageUy4;
        averageUz1New = kAverageUz1;
        averageUz2New = kAverageUz2;
        averageUz3New = kAverageUz3;
        averageUz4New = kAverageUz4;
        amountOfData = kamountOfData;

    }


    public double getAverageCzasNew() {
        return averageCzasNew;
    }

    public double getAverageUx1New() {
        return averageUx1New;
    }

    public double getAverageUy1New() {
        return averageUy1New;
    }

    public double getAverageUz1New() {
        return averageUz1New;
    }

    public double getAverageUx2New() {
        return averageUx2New;
    }

    public double getAverageUy2New() {
        return averageUy2New;
    }

    public double getAverageUz2New() {
        return averageUz2New;
    }

    public double getAverageUx3New() {
        return averageUx3New;
    }

    public double getAverageUy3New() {
        return averageUy3New;
    }

    public double getAverageUz3New() {
        return averageUz3New;
    }

    public double getAverageUx4New() {
        return averageUx4New;
    }

    public double getAverageUy4New() {
        return averageUy4New;
    }

    public double getAverageUz4New() {
        return averageUz4New;
    }

    public double getAmountOfData() {
        return amountOfData;
    }
}
