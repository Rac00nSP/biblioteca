package Clases;

public class precios {


    private int farenheith;
    private int revival;
    private int elAlquimista;
    private int elPoder;
    private int despertar;

    //Constructor
    public  precios()
    {
        farenheith = 5000;
        revival = 12000;
        elAlquimista = 45000;
        despertar = 156000;
        elPoder = 88000;
    }

    //Accesadores y Mutadores
    public int getFarenheith() {
        return farenheith;
    }

    public void setFarenheith(int farenheith) {
        this.farenheith = farenheith;
    }

    public int getRevival() {
        return revival;
    }

    public void setRevival(int revival) {
        this.revival = revival;
    }

    public int getElAlquimista() {
        return elAlquimista;
    }

    public void setElAlquimista(int elAlquimista) {
        this.elAlquimista = elAlquimista;
    }

    public int getElPoder() {
        return elPoder;
    }

    public void setElPoder(int elPoder) {
        this.elPoder = elPoder;
    }

    public int getDespertar() {
        return despertar;
    }

    public void setDespertar(int despertar) {
        this.despertar = despertar;
    }

}
