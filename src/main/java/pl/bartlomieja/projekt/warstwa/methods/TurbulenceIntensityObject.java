package pl.bartlomieja.projekt.warstwa.methods;

public class TurbulenceIntensityObject {


    private double turbelunceIntensity1Object;
    private double turbelunceIntensity2Object;
    private double turbelunceIntensity3Object;
    private double turbelunceIntensity4Object;
    private int turbulenceOrdinalNumber;

    public TurbulenceIntensityObject(double kturbelunceIntensity1Object, double kturbelunceIntensity2Object,
                                     double kturbelunceIntensity3Object, double kturbelunceIntensity4Object,
                                     int kturbulenceOrdinalNumber) {
        turbelunceIntensity1Object = kturbelunceIntensity1Object;
        turbelunceIntensity2Object = kturbelunceIntensity2Object;
        turbelunceIntensity3Object = kturbelunceIntensity3Object;
        turbelunceIntensity4Object = kturbelunceIntensity3Object;
        turbulenceOrdinalNumber = kturbulenceOrdinalNumber;
    }


    public double getTurbelunceIntensity1Object() {
        return turbelunceIntensity1Object;
    }

    public double getTurbelunceIntensity2Object() {
        return turbelunceIntensity2Object;
    }

    public double getTurbelunceIntensity3Object() {
        return turbelunceIntensity3Object;
    }

    public double getTurbelunceIntensity4Object() {
        return turbelunceIntensity4Object;
    }

    public int getTurbulenceOrdinalNumber() {
        return turbulenceOrdinalNumber;
    }
}
