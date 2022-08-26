package taller3.televisores;

public class TestTV {
	public static void main(String[] args) {
		Marca marca1 = new Marca("Semsung");
	    Marca marca2 = new Marca("Lj");
		
	    TV tv1 = new TV(marca1, true);
	    TV tv2 = new TV(marca2, false);
	    
	    tv1.setPrecio(2000);
	    tv2.setCanal(90);
	    tv1.setCanal(121);
		tv2.setVolumen(7);
		
		Control control1 = new Control();
		control1.enlazar(tv1);
		control1.turnOff();
		control1.setCanal(50);
		control1.turnOn();
		control1.canalUp();
		control1.volumenUp();
		
	    System.out.println(tv2.getCanal());
	    System.out.println(tv1.getPrecio());
	    System.out.println(tv1.getMarca().getNombre());
	    System.out.println(tv1.getCanal());
	}
}

class Marca {
	private String nombre;

	public Marca(String nombre){
		this.nombre = nombre;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}
}

class TV {
	private static int numTV = 0;
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;

	public TV(Marca marca, boolean estado){
		this.marca = marca;
		this.estado = estado;
	}

	public void setMarca(Marca marca){
		this.marca = marca;
	}

	public Marca getMarca(){
		return this.marca;
	}

	public void setControl(Control control){
		this.control = control;
	}

	public Control getControl(){
		return this.control;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getPrecio() {
		return precio;
	}

	public void setVolumen(int volumen){
		this.volumen = volumen;
	}

	public int getVolumen(){
		return volumen;
	}

	public void setCanal(int canal) {
		if (canal >=1 && canal <= 120 && estado){
			this.canal = canal;
		}
	}

	public int getCanal() {
		return canal;
	}

	public int getNumTV(){
		return numTV;

	}

	public void turnOn(){
		estado = true;
	}

	public void turnOff(){
		estado = false;
	}

	public boolean getEstado(){
		return estado;
	}

	public void canalUp(){
		canal++;
	}

	public void canalDown(){
		canal--;
	}

	public void volumenUp(){
		if(volumen >= 0 && volumen <=6 && estado){
			volumen++;
		}
	}

	public void volumenDown(){
		if(volumen >=1 && volumen <=7 && estado){
			volumen--;
		}
	}

}

class Control{
	private TV tv;

	public void turnOn(){
		tv.turnOn();
	}
	public void turnOff(){
		tv.turnOff();
	}

	public void canalUp(){
		tv.canalUp();
	}

	public void canalDown(){
		tv.canalDown();
	}

	public void volumenUp(){
		tv.volumenUp();
	}

	public void volumenDown(){
		tv.volumenDown();
	}

	public void setCanal(int canal){
		tv.setCanal(canal);
	}

	public void enlazar(TV tv1) {
		tv = tv1;
	}
}

