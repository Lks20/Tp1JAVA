import java.time.LocalDate;
import java.util.*;
public class TestTask {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opc;
        int opc2=1;
        int opc3;

        ArrayList<Task> tareas=new ArrayList<Task>();
        while(opc2!=0){ 
             System.out.println("______________________________________________________");
             System.out.println("!Bienvenido al sistema de tareas¡");
             System.out.println("Ingrese 1 para crear una nueva tarea");
             System.out.println("Ingrese 2 para marcar una tarea como Realizada");
             System.out.println("Ingrese 3 para eliminar una tarea");
             System.out.println("Ingrese 4 para ver una tarea");
             System.out.println("Ingrese 5 para ver todas las tareas");
             System.out.println("Ingrese 0 para Salir de la Aplicacion");
             System.out.println("______________________________________________________");
             opc= leer.nextInt();
             leer.nextLine();
                switch(opc){
                    case 0:
                     System.out.println("Gracias por utilizar esta App");
                     opc2=0;
                    break;
                     case 1:
                     System.out.println("______________________________________________________");
                     System.out.print("Ingrese la Descripcion -->");
                     String desc1=leer.nextLine();
                     System.out.println();
                     System.out.print("El estado de la Tarea se aparecera como 'NO REALIZADA'");
                     boolean est1=false;
                     System.out.println();
                     System.out.println("Ingrese la fecha en formato aaaa/mm/dd --> ");//LocalDate.of utiliza ese formato
                     System.out.print("Año-> ");
                     int año1=leer.nextInt();
                     System.out.print("Mes-> ");
                     int mes1=leer.nextInt();
                     System.out.print("Dia-> ");
                     int dia1=leer.nextInt();
                     tareas.add(new Task(desc1,est1,LocalDate.of(año1, mes1, dia1)));
                     break;

                     case 2:
                        if(tareas.isEmpty()){
                            System.out.println("Usted no tiene niguna tarea guardada");
                        }
                        else{
                            System.out.println("Usted Tiene "+tareas.size()+" Tareas, Selecciones alguna para marcar como Realizada");
                            opc3=leer.nextInt();
                            tareas.get(opc3-1).setEstado(true);
                            System.out.println("La tarea: "+tareas.get(opc3-1).toString());
                        }
                     break;
                     case 3:
                        if(tareas.isEmpty()){
                            System.out.println("Usted no tiene niguna tarea guardada");  
                        }
                        else{
                            System.out.println("Usted Tiene "+tareas.size()+" Tareas, Selecciones alguna para Eliminar");
                            opc3=leer.nextInt();
                            tareas.remove(opc3-1);
                            System.out.println("La tarea numero "+opc3+" fue eliminada");
                        }
                     break;
                     case 4:
                        if(tareas.isEmpty()){
                            System.out.println("Usted no tiene niguna tarea guardada");  
                        }
                        else{
                            System.out.println("Usted Tiene "+tareas.size()+" Tareas, Selecciones alguna ver su contenido"); 
                            opc3=leer.nextInt();
                            System.out.println(tareas.get(opc3-1).toString());
                        }
                     break;
                     case 5:
                        if(tareas.isEmpty()){
                             System.out.println("Usted no tiene niguna tarea guardada");  
                        }
                        else{
                            for(Task cadena:tareas){
                                System.out.println(cadena);
                            }
                        }
                     break;
                }
              }
        }
 }
