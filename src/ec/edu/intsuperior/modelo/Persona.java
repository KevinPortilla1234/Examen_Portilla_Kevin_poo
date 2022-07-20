package ec.edu.intsuperior.modelo;

public class Persona {

    private String Nombre;

    private String Fechadenacimiento;

    private String Apellido;

    private String Direccion;

    private String Correo;
    
    private String Telefonocontacto;
    
    
    public Persona() {
    }

    public Persona(String nombre, String apellido, String telefono, String correo, String direccion, String fechadenacimiento) {
        this.Nombre = nombre;
        this.Apellido = apellido;   
        this.Correo = correo;
        this.Direccion = direccion;
        this.Fechadenacimiento = fechadenacimiento;
        
    }

    public String getFechadenacimiento() {
        return Fechadenacimiento;
    }

    public void setFechadenacimiento(String Fechadenacimiento) {
        this.Fechadenacimiento = Fechadenacimiento;
    }

    public String getTelefonocontacto() {
        return Telefonocontacto;
    }

    public void setTelefonodecontacto(String Telefonocontacto) {
        this.Telefonocontacto = Telefonocontacto;
    }

    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
        
        
    }
@Override
    public String toString() {
       
     return "Los tipos de datos son: \n "
                
                +"apellidos y nombres : "+getApellido()+
                " "+getNombre()+" "+getNombre()+"\n"
                + "Direcion: "+getDireccion()+"\n"             
                +"Correo: "+getCorreo()+"\n"
                +"Edad: "+getFechadenacimiento()+"\n";
    
    
}

    
    }

    




   

    
    

