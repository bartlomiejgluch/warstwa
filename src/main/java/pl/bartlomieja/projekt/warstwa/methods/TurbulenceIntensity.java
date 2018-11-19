package pl.bartlomieja.projekt.warstwa.methods;

import java.util.ArrayList;

public class TurbulenceIntensity {


    public void calculateTurbulenceIntensity(ArrayList<AverageObject> averageObjects, ArrayList<StandardDeviationObject> standardDeviationObjects, ArrayList<TurbulenceIntensityObject> turbulenceIntensityObjects) {


        double turbelunceIntensity1;
        double turbelunceIntensity2;
        double turbelunceIntensity3;
        double turbelunceIntensity4;

        for (int i = 0; i < averageObjects.size(); i++) {

            double StdDevUx1 = standardDeviationObjects.get(i).getStdDevUx1New();
            double StdDevUy1 = standardDeviationObjects.get(i).getStdDevUy1New();
            double StdDevUz1 = standardDeviationObjects.get(i).getStdDevUz1New();

            double StdDevUx2 = standardDeviationObjects.get(i).getStdDevUx2New();
            double StdDevUy2 = standardDeviationObjects.get(i).getStdDevUy2New();
            double StdDevUz2 = standardDeviationObjects.get(i).getStdDevUz2New();

            double StdDevUx3 = standardDeviationObjects.get(i).getStdDevUx3New();
            double StdDevUy3 = standardDeviationObjects.get(i).getStdDevUy3New();
            double StdDevUz3 = standardDeviationObjects.get(i).getStdDevUz3New();

            double StdDevUx4 = standardDeviationObjects.get(i).getStdDevUx4New();
            double StdDevUy4 = standardDeviationObjects.get(i).getStdDevUy4New();
            double StdDevUz4 = standardDeviationObjects.get(i).getStdDevUz4New();

            double averageU1xyz = averageObjects.get(i).getAverageU1xyzNew();
            double averageU2xyz = averageObjects.get(i).getAverageU2xyzNew();
            double averageU3xyz = averageObjects.get(i).getAverageU3xyzNew();
            double averageU4xyz = averageObjects.get(i).getAverageU4xyzNew();






            if (averageU1xyz == 0) {
                turbelunceIntensity1 = 0;
            } else {
                turbelunceIntensity1 = (((Math.sqrt(((StdDevUx1 * StdDevUx1) + (StdDevUy1 * StdDevUy1) +
                        (StdDevUz1 * StdDevUz1)) / 3))) / averageU1xyz);
            }

            if (averageU2xyz==0){
                turbelunceIntensity2=0;

            }else {
                turbelunceIntensity2 = (((Math.sqrt(((StdDevUx2 * StdDevUx2) + (StdDevUy2 * StdDevUy2) +
                        (StdDevUz2 * StdDevUz2)) / 3))) / averageU2xyz);
            }

            if (averageU3xyz==0){

                turbelunceIntensity3=0;
            }else {

                turbelunceIntensity3 = (((Math.sqrt(((StdDevUx3 * StdDevUx3) + (StdDevUy3 * StdDevUy3) +
                        (StdDevUz3 * StdDevUz3)) / 3))) / averageU3xyz);
            }

            if (averageU4xyz==0){

                turbelunceIntensity4=0;
            }else {

                turbelunceIntensity4 = (((Math.sqrt(((StdDevUx4 * StdDevUx4) + (StdDevUy4 * StdDevUy4) + (StdDevUz4 * StdDevUz4)) / 3))) / averageU4xyz);
            }



            TurbulenceIntensityObject nextTurbulenceIntensityObject = new TurbulenceIntensityObject(turbelunceIntensity1,
                    turbelunceIntensity2, turbelunceIntensity3, turbelunceIntensity4, i);

            turbulenceIntensityObjects.add(nextTurbulenceIntensityObject);

            turbelunceIntensity1 = turbelunceIntensity2 = turbelunceIntensity3 = turbelunceIntensity4 = 0;


        }


    }

}
