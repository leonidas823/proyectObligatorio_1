package logica;

public class Administeativo extends Empleado {

    double sueldo;

    public Administeativo(int tipo_empleado, int sueldo_base, int cedula, String nombre, String apellidos, String direccion, int telefono) {
        super(tipo_empleado, sueldo_base, cedula, nombre, apellidos, direccion, telefono);
    }
    
    @Override
    public String toString(){
        return " Cedula: " + Integer.toString(super.getCedula()) + 
                " Nombre: " + super.getNombre() +                
                " Apellido: " + super.getApellidos() +
                " Telefono: " + super.getTelefono() +
                " Direccion: " + super.getDireccion() +
                " Sueldo Base: " + Double.toString(this.sueldo_base) +
                " Tipo Empleado: " + Integer.toString(this.tipo_empleado);
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double _sueldo) {
        this.sueldo = _sueldo;
    }
    
    
    @Override
    public double calcularSueldo(){
        return sueldo_base * 1.27 ;
    
    
    }

    
    
  

}


