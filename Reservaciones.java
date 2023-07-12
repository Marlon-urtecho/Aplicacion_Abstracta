package aplicacionReservaciones;
abstract class Reservaciones {
   
	//Declarando atributoa de la clase
	private String nombre;
    private int cantidadPersonas;
    private int tipoHabitacion;
    private String tipoReservacion;
    
    //creamos Constructor de la clase
public Reservaciones(String nombre, int cantidadPersonas, int tipoHabitacion) {
  this.nombre = nombre;
  this.cantidadPersonas = cantidadPersonas;
  this.tipoHabitacion = tipoHabitacion;
    }
 
//Declaramos el metodo abstracto presupuestar
 public abstract void presupuestarEstadia();


  //Creando los metodos set y get de los atributos  
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadPersonas() {
		return cantidadPersonas;
	}

	public void setCantidadPersonas(int cantidadPersonas) {
		this.cantidadPersonas = cantidadPersonas;
	}

	public int getTipoHabitacion() {
		return tipoHabitacion;
	}

	public void setTipoHabitacion(int tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}

	public String getTipoReservacion() {
		return tipoReservacion;
	}

	public void setTipoReservacion(String tipoReservacion) {
		this.tipoReservacion = tipoReservacion;
	}
}
