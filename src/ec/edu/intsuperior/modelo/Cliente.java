package ec.edu.intsuperior.modelo;

public class Cliente extends Persona {

    private String Telefonocontacto;
    
    public Cliente (){
    }

    public Cliente(String Telefonocontacto, String nombre, String apellido, String correo, int edad, String direccion) {
      super ( nombre , apellido , correo , correo , direccion , Telefonocontacto );
        this.Telefonocontacto = Telefonocontacto;
    }

    public String getTelefonocontacto() {
        return Telefonocontacto;
    }

    public void setTelefonocontacto(String Telefonocontacto) {
        this.Telefonocontacto = Telefonocontacto;
    }

    

    
    @Override
    public String toString() {
        return super.toString();
}
}