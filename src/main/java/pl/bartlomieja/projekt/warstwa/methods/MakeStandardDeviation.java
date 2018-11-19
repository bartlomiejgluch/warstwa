package pl.bartlomieja.projekt.warstwa.methods;


import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import pl.bartlomieja.projekt.warstwa.IO.RowDataObject;

import java.util.ArrayList;

public class MakeStandardDeviation {


    public void calculateStdDev(ArrayList<Object> allRowDataObject, ArrayList<StandardDeviationObject> standardDeviationObjects) {



        for (int i = 0; i < allRowDataObject.size(); i++) {


            Object anAllRowDataObject = allRowDataObject.get(i);

            ArrayList<RowDataObject> dataArrayToAverage = (ArrayList<RowDataObject>) anAllRowDataObject;

            DescriptiveStatistics stdDevObjectStatsUx1 = new DescriptiveStatistics();
            DescriptiveStatistics stdDevObjectStatsUy1 = new DescriptiveStatistics();
            DescriptiveStatistics stdDevObjectStatsUz1 = new DescriptiveStatistics();

            DescriptiveStatistics stdDevObjectStatsUx2 = new DescriptiveStatistics();
            DescriptiveStatistics stdDevObjectStatsUy2 = new DescriptiveStatistics();
            DescriptiveStatistics stdDevObjectStatsUz2 = new DescriptiveStatistics();

            DescriptiveStatistics stdDevObjectStatsUx3 = new DescriptiveStatistics();
            DescriptiveStatistics stdDevObjectStatsUy3 = new DescriptiveStatistics();
            DescriptiveStatistics stdDevObjectStatsUz3 = new DescriptiveStatistics();

            DescriptiveStatistics stdDevObjectStatsUx4 = new DescriptiveStatistics();
            DescriptiveStatistics stdDevObjectStatsUy4 = new DescriptiveStatistics();
            DescriptiveStatistics stdDevObjectStatsUz4 = new DescriptiveStatistics();


            for (int j = 0; j < dataArrayToAverage.size(); j++) {


                stdDevObjectStatsUx1.addValue(Double.parseDouble(dataArrayToAverage.get(j).getUx1()));
                stdDevObjectStatsUy1.addValue(Double.parseDouble(dataArrayToAverage.get(j).getUy1()));
                stdDevObjectStatsUz1.addValue(Double.parseDouble(dataArrayToAverage.get(j).getUz1()));

                stdDevObjectStatsUx2.addValue(Double.parseDouble(dataArrayToAverage.get(j).getUx2()));
                stdDevObjectStatsUy2.addValue(Double.parseDouble(dataArrayToAverage.get(j).getUy2()));
                stdDevObjectStatsUz2.addValue(Double.parseDouble(dataArrayToAverage.get(j).getUz2()));

                stdDevObjectStatsUx3.addValue(Double.parseDouble(dataArrayToAverage.get(j).getUx3()));
                stdDevObjectStatsUy3.addValue(Double.parseDouble(dataArrayToAverage.get(j).getUy3()));
                stdDevObjectStatsUz3.addValue(Double.parseDouble(dataArrayToAverage.get(j).getUz3()));

                stdDevObjectStatsUx4.addValue(Double.parseDouble(dataArrayToAverage.get(j).getUx4()));
                stdDevObjectStatsUy4.addValue(Double.parseDouble(dataArrayToAverage.get(j).getUy4()));
                stdDevObjectStatsUz4.addValue(Double.parseDouble(dataArrayToAverage.get(j).getUz4()));

            }


            StandardDeviationObject nextStandardDeviationObject = new StandardDeviationObject(
                    stdDevObjectStatsUx1.getStandardDeviation(),
                    stdDevObjectStatsUy1.getStandardDeviation(),
                    stdDevObjectStatsUz1.getStandardDeviation(),
                    stdDevObjectStatsUx2.getStandardDeviation(),
                    stdDevObjectStatsUy2.getStandardDeviation(),
                    stdDevObjectStatsUz2.getStandardDeviation(),
                    stdDevObjectStatsUx3.getStandardDeviation(),
                    stdDevObjectStatsUy3.getStandardDeviation(),
                    stdDevObjectStatsUz3.getStandardDeviation(),
                    stdDevObjectStatsUx4.getStandardDeviation(),

                    stdDevObjectStatsUy4.getStandardDeviation(),
                    stdDevObjectStatsUz4.getStandardDeviation(),
                    dataArrayToAverage.size(), i);


            standardDeviationObjects.add(nextStandardDeviationObject);




        }


    }


}


