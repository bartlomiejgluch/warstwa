package pl.bartlomieja.projekt.warstwa.methods;


import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class MakeStandardDeviation {


    public static void main(String[] args) {


        DescriptiveStatistics stats = new DescriptiveStatistics();
        stats.addValue(2);

        stats.addValue(4);
        stats.addValue(1);
        stats.addValue(98);

        stats.getStandardDeviation();

        System.out.println(stats.getStandardDeviation());
    }
}
