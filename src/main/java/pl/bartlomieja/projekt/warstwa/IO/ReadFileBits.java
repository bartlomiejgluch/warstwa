package pl.bartlomieja.projekt.warstwa.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;

public class ReadFileBits {


    public void readFileInBits(ArrayList<RowDataObject> rowDatumObjects, File file3) {


        FileInputStream fileInputOfBits = null;
        FileChannel channelOfBits = null;

        StringBuffer temporaryStringToData4byte = new StringBuffer();
        StringBuffer temporaryStringToData2byteX1 = new StringBuffer();
        StringBuffer temporaryStringToData2byteY1 = new StringBuffer();
        StringBuffer temporaryStringToData2byteZ1 = new StringBuffer();
        StringBuffer temporaryStringToData2byteX2 = new StringBuffer();
        StringBuffer temporaryStringToData2byteY2 = new StringBuffer();
        StringBuffer temporaryStringToData2byteZ2 = new StringBuffer();
        StringBuffer temporaryStringToData2byteX3 = new StringBuffer();
        StringBuffer temporaryStringToData2byteY3 = new StringBuffer();
        StringBuffer temporaryStringToData2byteZ3 = new StringBuffer();
        StringBuffer temporaryStringToData2byteX4 = new StringBuffer();
        StringBuffer temporaryStringToData2byteY4 = new StringBuffer();
        StringBuffer temporaryStringToData2byteZ4 = new StringBuffer();

        int i = 0;
        try {

            fileInputOfBits = new FileInputStream(file3);
            channelOfBits = fileInputOfBits.getChannel();
            int size = (int) channelOfBits.size();
            MappedByteBuffer buf = channelOfBits.map(FileChannel.MapMode.READ_ONLY, 0, size);
            byte[] bytes = new byte[size];
            buf.get(bytes);

            for (i = 0; i < bytes.length;  ) {

                for (int j = 0; j < 4 && i < bytes.length; j++) {

                    temporaryStringToData4byte.insert(0, (Integer.toBinaryString(bytes[i] & 255 | 256).substring(1)));

                    i++;

                }


                for (int k = 0; k < 12 && i < bytes.length; k++) {


                    for (int l = 0; l < 2 && i < bytes.length; l++) {

                        if (k == 0)
                            temporaryStringToData2byteX1.insert(0, Integer.toBinaryString(bytes[i] & 255 | 256).substring(1));
                        if (k == 1)
                            temporaryStringToData2byteY1.insert(0, Integer.toBinaryString(bytes[i] & 255 | 256).substring(1));
                        if (k == 2)
                            temporaryStringToData2byteZ1.insert(0, Integer.toBinaryString(bytes[i] & 255 | 256).substring(1));
                        if (k == 3)
                            temporaryStringToData2byteX2.insert(0, Integer.toBinaryString(bytes[i] & 255 | 256).substring(1));
                        if (k == 4)
                            temporaryStringToData2byteY2.insert(0, Integer.toBinaryString(bytes[i] & 255 | 256).substring(1));
                        if (k == 5)
                            temporaryStringToData2byteZ2.insert(0, Integer.toBinaryString(bytes[i] & 255 | 256).substring(1));
                        if (k == 6)
                            temporaryStringToData2byteX3.insert(0, Integer.toBinaryString(bytes[i] & 255 | 256).substring(1));
                        if (k == 7)
                            temporaryStringToData2byteY3.insert(0, Integer.toBinaryString(bytes[i] & 255 | 256).substring(1));
                        if (k == 8)
                            temporaryStringToData2byteZ3.insert(0, Integer.toBinaryString(bytes[i] & 255 | 256).substring(1));
                        if (k == 9)
                            temporaryStringToData2byteX4.insert(0, Integer.toBinaryString(bytes[i] & 255 | 256).substring(1));
                        if (k == 10)
                            temporaryStringToData2byteY4.insert(0, Integer.toBinaryString(bytes[i] & 255 | 256).substring(1));
                        if (k == 11)
                            temporaryStringToData2byteZ4.insert(0, Integer.toBinaryString(bytes[i] & 255 | 256).substring(1));

                        i++;


                    }

                }


                String czas = String.valueOf((((double) Integer.parseInt(String.valueOf(temporaryStringToData4byte), 2))/10000));
                temporaryStringToData4byte = new StringBuffer();

                String Ux1 = String.valueOf((((double) Integer.parseInt(String.valueOf(temporaryStringToData2byteX1), 2))/1000));
                temporaryStringToData2byteX1 = new StringBuffer();

                String Uy1 = String.valueOf((((double) Integer.parseInt(String.valueOf(temporaryStringToData2byteY1), 2))/1000));
                temporaryStringToData2byteY1 = new StringBuffer();

                String Uz1 = String.valueOf((((double) Integer.parseInt(String.valueOf(temporaryStringToData2byteZ1), 2))/1000));
                temporaryStringToData2byteZ1 = new StringBuffer();

                String Ux2 = String.valueOf((((double) Integer.parseInt(String.valueOf(temporaryStringToData2byteX2), 2))/1000));
                temporaryStringToData2byteX2 = new StringBuffer();

                String Uy2 = String.valueOf((((double) Integer.parseInt(String.valueOf(temporaryStringToData2byteY2), 2))/1000));
                temporaryStringToData2byteY2 = new StringBuffer();

                String Uz2 = String.valueOf((((double) Integer.parseInt(String.valueOf(temporaryStringToData2byteZ2), 2))/1000));
                temporaryStringToData2byteZ2 = new StringBuffer();

                String Ux3 = String.valueOf((((double) Integer.parseInt(String.valueOf(temporaryStringToData2byteX3), 2))/1000));
                temporaryStringToData2byteX3 = new StringBuffer();

                String Uy3 = String.valueOf((((double) Integer.parseInt(String.valueOf(temporaryStringToData2byteY3), 2))/1000));
                temporaryStringToData2byteY3 = new StringBuffer();

                String Uz3 = String.valueOf((((double) Integer.parseInt(String.valueOf(temporaryStringToData2byteZ3), 2))/1000));
                temporaryStringToData2byteZ3 = new StringBuffer();

                String Ux4 = String.valueOf((((double) Integer.parseInt(String.valueOf(temporaryStringToData2byteX4), 2))/1000));
                temporaryStringToData2byteX4 = new StringBuffer();

                String Uy4 = String.valueOf((((double) Integer.parseInt(String.valueOf(temporaryStringToData2byteY4), 2))/1000));
                temporaryStringToData2byteY4 = new StringBuffer();

                String Uz4 = String.valueOf((((double) Integer.parseInt(String.valueOf(temporaryStringToData2byteZ4), 2))/1000));
                temporaryStringToData2byteZ4 = new StringBuffer();


                RowDataObject nextRow = new RowDataObject(czas, Ux1, Uy1, Uz1, Ux2, Uy2, Uz2, Ux3, Uy3, Uz3, Ux4, Uy4, Uz4);

                rowDatumObjects.add(nextRow);




            }


        } catch (
                IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                if (fileInputOfBits != null) {
                    fileInputOfBits.close();
                }
                if (channelOfBits != null) {
                    channelOfBits.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

