package pl.bartlomieja.projekt.warstwa.IO;

public class RowDataObject {


    private String czas;
    private String Ux1;
    private String Uy1;
    private String Uz1;
    private String Ux2;
    private String Uy2;
    private String Uz2;
    private String Ux3;
    private String Uy3;
    private String Uz3;
    private String Ux4;
    private String Uy4;
    private String Uz4;


    RowDataObject(String kczas,
                  String kUx1,
                  String kUy1,
                  String kUz1,
                  String kUx2,
                  String kUy2,
                  String kUz2,
                  String kUx3,
                  String kUy3,
                  String kUz3,
                  String kUx4,
                  String kUy4,
                  String kUz4) {


        czas = kczas;
        Ux1 = kUx1;
        Uy1 = kUy1;
        Uz1 = kUz1;
        Ux2 = kUx2;
        Uy2 = kUy2;
        Uz2 = kUz2;
        Ux3 = kUx3;
        Uy3 = kUy3;
        Uz3 = kUz3;
        Ux4 = kUx4;
        Uy4 = kUy4;
        Uz4 = kUz4;
    }


    public String getCzas() {
        return czas;
    }

    public String getUx1() {
        return Ux1;
    }

    public String getUy1() {
        return Uy1;
    }

    public String getUz1() {
        return Uz1;
    }

    public String getUx2() {
        return Ux2;
    }

    public String getUy2() {
        return Uy2;
    }

    public String getUz2() {
        return Uz2;
    }

    public String getUx3() {
        return Ux3;
    }

    public String getUy3() {
        return Uy3;
    }

    public String getUz3() {
        return Uz3;
    }

    public String getUx4() {
        return Ux4;
    }

    public String getUy4() {
        return Uy4;
    }

    public String getUz4() {
        return Uz4;
    }


}
