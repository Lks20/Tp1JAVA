import java.time.LocalDate;

public class Task {
    //atributos 
    private String descripcion; 
    private boolean estado; 
    private LocalDate vencimiento;

    
    //constructores 
    public Task(String descripcion, boolean estado, LocalDate vencimiento) {
        this.descripcion = descripcion;
        this.estado = estado;
        this.vencimiento = vencimiento;
    }

    public Task(boolean estado, LocalDate vencimiento) {
        this.estado = estado;
        this.vencimiento = vencimiento;
    }

    public Task(String descripcion, LocalDate vencimiento) {
        this.descripcion = descripcion;
        this.vencimiento = vencimiento;
    }

    public Task(String descripcion, boolean estado) {
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public Task(String descripcion) {
        this.descripcion = descripcion;
    }

    public Task(boolean estado) {
        this.estado = estado;
    }

    public Task(LocalDate vencimiento) {
        this.vencimiento = vencimiento;
    }

//Gest y Sets

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public boolean isEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }


    public LocalDate getVencimiento() {
        return vencimiento;
    }
    public void setVencimiento(LocalDate vencimiento) {
        this.vencimiento = vencimiento;
    }

/**
 * Obtiene un String con los valores del objeto
 * @return El objeto en formato String
 */
    @Override//El profe lo va a explicar mas adelante
    public String toString() {
        return "Tarea: descripcion: " + descripcion + ", estado: " + estado + ", vencimiento: " + vencimiento ;
    }   
}