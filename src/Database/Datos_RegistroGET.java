
package Database;

public class Datos_RegistroGET {
    private int Id_user;
    private String nombre_user;
    private String apellido_user;
    private String Correo_user;
    private String Clave_user;
    private String cargo_user;
    private String salario_user;
    
    public String getCargo_user() {
        return cargo_user;
    }

    public void setCargo_user(String cargo_user) {
        this.cargo_user = cargo_user;
    }

    public String getSalario_user() {
        return salario_user;
    }

    public void setSalario_user(String salario_user) {
        this.salario_user = salario_user;
    }
  

    public Datos_RegistroGET() {
    }

    public Datos_RegistroGET(int id_user, String nombre_user, String apellido_user, 
            String Correo_user, String Clave_user, String cargo_user, String salario_user) {
        this.Id_user = id_user;
        this.nombre_user = nombre_user;
        this.apellido_user = apellido_user;
        this.Correo_user = Correo_user;
        this.Clave_user = Clave_user;
        this.cargo_user = cargo_user;
        this.salario_user = salario_user;
        
    }

    public int getId_user() {
        return Id_user;
    }

    public void setId_user(int Id_user) {
        this.Id_user = Id_user;
    }

    public String getNombre_user() {
        return nombre_user;
    }

    public void setNombre_user(String nombre_user) {
        this.nombre_user = nombre_user;
    }

    public String getApellido_user() {
        return apellido_user;
    }

    public void setApellido_user(String apellido_user) {
        this.apellido_user = apellido_user;
    }

    public String getCorreo_user() {
        return Correo_user;
    }

    public void setCorreo_user(String Correo_user) {
        this.Correo_user = Correo_user;
    }

    public String getClave_user() {
        return Clave_user;
    }

    public void setClave_user(String Clave_user) {
        this.Clave_user = Clave_user;
    }

 

    

    @Override
    public String toString() {
        return "Agenda_get{" + "id_user=" + Id_user + ", nombre=" + nombre_user + ", apellido=" + apellido_user + ", correo=" + Correo_user 
                + ", clave=" + Clave_user +  '}';
    }
}
