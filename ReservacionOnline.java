package aplicacionReservaciones;

class ReservacionOnline extends HuespedHabitaciones {
   
public ReservacionOnline(String nombre, int cantidadPersonas, int tipoHabitacion, boolean habitacionOcupada) {
 super(nombre, cantidadPersonas, tipoHabitacion, habitacionOcupada);
   
}
	
@Override
public void presupuestarEstadia() {
      
	    double costoEstadia = calcularCostoEstadia();
        System.out.println("Presupuesto de estadia para la reserva online del huésped: " + getNombre());
        System.out.println("Costo total de la estadía: $" + costoEstadia);
        
    }
	
	
}

