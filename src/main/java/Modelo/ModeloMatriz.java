package Modelo;

public class ModeloMatriz {

    private int FilasA;
    private int ColumanasA;
    private int FilasB;
    private int ColumanasB;

    public ModeloMatriz() {
    }

    public ModeloMatriz(int FilasA, int ColumanasA, int FilasB, int ColumanasB) {
        this.FilasA = FilasA;
        this.ColumanasA = ColumanasA;
        this.FilasB = FilasB;
        this.ColumanasB = ColumanasB;
    }

    public int getFilasA() {
        return FilasA;
    }

    public void setFilasA(int FilasA) {
        this.FilasA = FilasA;
    }

    public int getColumanasA() {
        return ColumanasA;
    }

    public void setColumanasA(int ColumanasA) {
        this.ColumanasA = ColumanasA;
    }

    public int getFilasB() {
        return FilasB;
    }

    public void setFilasB(int FilasB) {
        this.FilasB = FilasB;
    }

    public int getColumanasB() {
        return ColumanasB;
    }

    public void setColumanasB(int ColumanasB) {
        this.ColumanasB = ColumanasB;
    }

}
