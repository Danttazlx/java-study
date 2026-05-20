package collections.list.domain;

public class SmartPhone {

     private String serialNumbe;
     private String Marca;


    public SmartPhone(String serialNumbe, String marca) {
        this.serialNumbe = serialNumbe;
        Marca = marca;
    }


    public String getSerialNumbe() {
        return serialNumbe;
    }

    public void setSerialNumbe(String serialNumbe) {
        this.serialNumbe = serialNumbe;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "serialNumbe='" + serialNumbe + '\'' +
                ", Marca='" + Marca + '\'' +
                '}';
    }
}
