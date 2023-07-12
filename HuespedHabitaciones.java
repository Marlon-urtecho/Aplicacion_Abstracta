package aplicacionReservaciones;

class HuespedHabitaciones extends Reservaciones {
    private boolean habitacionOcupada;

    //creando constructor de la clase 
    public HuespedHabitaciones(String nombre, int cantidadPersonas, int tipoHabitacion, boolean habitacionOcupada) {
        super(nombre, cantidadPersonas, tipoHabitacion);//inicializas el objeto de la clase super
        this.habitacionOcupada = habitacionOcupada;
    }

@Override
public void presupuestarEstadia() {
    	double costoEstadia = calcularCostoEstadia();
    	System.out.println("Presupuesto de estadia para el huésped: " + getNombre());
    	System.out.println("Costo total de la estadía: $" + costoEstadia);
}

 protected double calcularCostoEstadia() {
    
	 double costoHabitacion = 0;

        switch (getTipoHabitacion()) {
            case 1: // habitacin sencilla 
                costoHabitacion = 35;
                break;
            case 2: // habitacion doble
                costoHabitacion = 50;
                break;
            case 3: // habitacion triple
                costoHabitacion = 80;
                break;
        }

  return costoHabitacion * getCantidadPersonas();//retronando el valor de la reservacion
}

 //Metodos para reservar la habitacion
 public boolean isHabitacionOcupada() {
        return habitacionOcupada;
 }

public void setHabitacionOcupada(boolean habitacionOcupada) {
        this.habitacionOcupada = habitacionOcupada;
 }


}
