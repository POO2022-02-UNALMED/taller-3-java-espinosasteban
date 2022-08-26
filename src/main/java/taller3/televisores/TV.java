package taller3.televisores;

public class TV {
    public static int numTV = 0;
    public Marca marca;
    public int canal = 1;
    public int precio = 500;
    public boolean estado;
    private int volumen = 1;
    private Control control;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        numTV++;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Marca getMarca() {
        return this.marca;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public Control getControl() {
        return this.control;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setCanal(int canal) {
        if (canal >= 1 && canal <= 120 && estado) {
            this.canal = canal;
        }
    }

    public int getCanal() {
        return canal;
    }

    public static int getNumTV() {
        return numTV;

    }

    public static void setNumTV(int numTV) {
        TV.numTV = numTV;
    }

    public void turnOn() {
        estado = true;
    }

    public void turnOff() {
        estado = false;
    }

    public boolean getEstado() {
        return estado;
    }

    public void canalUp() {
        canal++;
    }

    public void canalDown() {
        canal--;
    }

    public void volumenUp() {
        if (volumen >= 0 && volumen <= 6 && estado) {
            volumen++;
        }
    }

    public void volumenDown() {
        if (volumen >= 1 && volumen <= 7 && estado) {
            volumen--;
        }
    }

}
