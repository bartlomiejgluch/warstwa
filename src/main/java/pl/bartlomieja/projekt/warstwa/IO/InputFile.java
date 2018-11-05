package pl.bartlomieja.projekt.warstwa.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class InputFile {






    public void readFile(ArrayList<RowData> rowData, File file2) {

        try {


            BufferedReader bufferedReader = new BufferedReader(new FileReader(file2));
            String row = null;
            int j = 0;
            while ((row = bufferedReader.readLine()) != null) {

                if (j >= 2) {
                    addRow(row, rowData);
                }
                j++;
            }

        } catch (Exception ex) {
            ex.printStackTrace();

        }

    }

    void addRow(String rowToAnalize, ArrayList<RowData> rowData) {


        String[] elements = rowToAnalize.split("  ");



        RowData nextRow = new RowData(elements[0], elements[1], elements[2], elements[3], elements[4], elements[5], elements[6],
                elements[7], elements[8], elements[9], elements[10], elements[11], elements[12]);

        rowData.add(nextRow);

    }


}


