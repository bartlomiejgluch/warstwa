package pl.bartlomieja.projekt.warstwa.methods;

public class StandardDeviationObject {

    private double stdDevUx1New;
    private double stdDevUy1New;
    private double stdDevUz1New;

    private double stdDevUx2New;
    private double stdDevUy2New;
    private double stdDevUz2New;

    private double stdDevUx3New;
    private double stdDevUy3New;
    private double stdDevUz3New;

    private double stdDevUx4New;
    private double stdDevUy4New;
    private double stdDevUz4New;

    private int stdDevAmountOfDataNew;
    private int stdDevOrdinalNumberNew;


    public StandardDeviationObject(
            double kStdDevUx1New,
            double kStdDevUy1New,
            double kStdDevUz1New,

            double kStdDevUx2New,
            double kStdDevUy2New,
            double kStdDevUz2New,

            double kStdDevUx3New,
            double kStdDevUy3New,
            double kStdDevUz3New,

            double kStdDevUx4New,
            double kStdDevUy4New,
            double kStdDevUz4New,

            int kStdDevAmountOfDataNew,
            int kStdDevOrdinalNumberNew) {


        stdDevUx1New = kStdDevUx1New;
        stdDevUy1New = kStdDevUy1New;
        stdDevUz1New = kStdDevUz1New;
        stdDevUx2New = kStdDevUx2New;
        stdDevUy2New = kStdDevUy2New;
        stdDevUz2New = kStdDevUz2New;
        stdDevUx3New = kStdDevUx3New;
        stdDevUy3New = kStdDevUy3New;
        stdDevUz3New = kStdDevUz3New;
        stdDevUx4New = kStdDevUx4New;
        stdDevUy4New = kStdDevUy4New;
        stdDevUz4New = kStdDevUz4New;
        stdDevAmountOfDataNew = kStdDevAmountOfDataNew;
        stdDevOrdinalNumberNew = kStdDevOrdinalNumberNew;
    }


    public double getStdDevUx1New() {
        return stdDevUx1New;
    }

    public double getStdDevUy1New() {
        return stdDevUy1New;
    }

    public double getStdDevUz1New() {
        return stdDevUz1New;
    }

    public double getStdDevUx2New() {
        return stdDevUx2New;
    }

    public double getStdDevUy2New() {
        return stdDevUy2New;
    }

    public double getStdDevUz2New() {
        return stdDevUz2New;
    }

    public double getStdDevUx3New() {
        return stdDevUx3New;
    }

    public double getStdDevUy3New() {
        return stdDevUy3New;
    }

    public double getStdDevUz3New() {
        return stdDevUz3New;
    }

    public double getStdDevUx4New() {
        return stdDevUx4New;
    }

    public double getStdDevUy4New() {
        return stdDevUy4New;
    }

    public double getStdDevUz4New() {
        return stdDevUz4New;
    }

    public int getStdDevAmountOfDataNew() {
        return stdDevAmountOfDataNew;
    }

    public int getStdDevOrdinalNumberNew() {
        return stdDevOrdinalNumberNew;
    }
}
