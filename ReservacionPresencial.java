package aplicacionReservaciones;

class ReservacionPresencial extends HuespedHabitaciones {
    
	public ReservacionPresencial(String nombre, int cantidadPersonas, int tipoHabitacion, boolean habitacionOcupada) {
        super(nombre, cantidadPersonas, tipoHabitacion, habitacionOcupada);
    }

	
	@Override
    public void presupuestarEstadia() {
        
		double costoEstadia = calcularCostoEstadia();
        System.out.println("Presupuesto de estadia para la reserva presencial del huésped: " + getNombre());
        System.out.println("Costo total de la estadía: $" + costoEstadia);
        
    }
}
	
	


