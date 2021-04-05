import java.util.Date;

public class Task {
    //atributos 
    private String Nombre;
    private String descripcion; 
    private boolean estado; 
    private Date vencimiento;

    //constructor 
    public Task (String Nombre,String descripcion, boolean estado, Date vencimiento){
        this.Nombre=Nombre;
        this.descripcion=descripcion;
        this.estado=estado;
        this.vencimiento=vencimiento;
    }

    public Task (String descripcion){
        this.Nombre=null;
        this.descripcion=descripcion;
        this.estado=false;
        this.vencimiento=null;
    }
    
    //funcion 
    void mostrar (){
        System.out.println("Nombre: "+Nombre);
        System.out.println("Descripcion: "+descripcion);
        System.out.println("Estado: "+estado);
        System.out.println("Vencimiento: "+vencimiento);
    }

    //Gets y Sets 
    String GetNombre(){
        return this.Nombre;
    }
    void SetNombre(String Nombre){
        this.Nombre=Nombre;
    }

    String GetDescripcion(){
        return this.descripcion;
    }
    void SetDescripcion(String descripcion){
        this.descripcion=descripcion;
    }

    boolean GetEstado(){
        return this.estado;
    }
    void SetEstado(boolean estado){
        this.estado=estado;
    }

    Date Getvencimiento(){
        return this.vencimiento;
    }
    void Setvencimiento(Date vencimiento){
        this.vencimiento=vencimiento;
    }
}
