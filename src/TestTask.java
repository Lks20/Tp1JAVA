import java.util.Scanner;

import java.time.LocalDate;

public class TestTask {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opc;
        int opc2=1;
        int opc3=0;
        Task tarea1=null;
        Task tarea2=null;
        Task tarea3=null;
        while(opc2!=0){ 
             System.out.println("______________________________________________________");
             System.out.println("!Bienvenido al sistema de tareas¡");
             System.out.println("Ingrese 1 para crear una nueva tarea");
             System.out.println("Ingrese 2 para marcar una tarea como Realizada");
             System.out.println("Ingrese 3 para eliminar una tarea");
             System.out.println("Ingrese 4 para ver una tarea");
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
                     System.out.println("Ingrese el numero de la tarea");
                     System.out.println("Tarea 1");
                     System.out.println("Tarea 2");
                     System.out.println("Tarea 3");
                     System.out.println("______________________________________________________");
                     opc3=leer.nextInt();
                     leer.nextLine();
                     switch(opc3){
                        case 1:
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
                         tarea1= new Task(desc1,est1,LocalDate.of(año1,mes1,dia1));
                         break;

                         case 2:
                         System.out.print("Ingrese la Descripcion -->");
                         String desc2=leer.nextLine();
                         System.out.println();
                         System.out.print("El estado de la Tarea se aparecera como 'NO REALIZADA'");
                         boolean est2=false;
                         System.out.println();
                         System.out.println("Ingrese la fecha en formato aaaa/mm/dd --> ");//LocalDate.of utiliza ese formato
                         System.out.print("Año-> ");
                         int año2=leer.nextInt();
                         System.out.print("Mes-> ");
                         int mes2=leer.nextInt();
                         System.out.print("Dia-> ");
                         int dia2=leer.nextInt();
                         tarea2= new Task(desc2,est2,LocalDate.of(año2,mes2,dia2));
                         break;

                         case 3:
                         System.out.print("Ingrese la Descripcion -->");
                         String desc3=leer.nextLine();
                         System.out.println();
                         System.out.print("El estado de la Tarea se aparecera como 'NO REALIZADA'");
                         boolean est3=false;
                         System.out.println();
                         System.out.println("Ingrese la fecha en formato aaaa/mm/dd --> ");//LocalDate.of utiliza ese formato
                         System.out.print("Año-> ");
                         int año3=leer.nextInt();
                         System.out.print("Mes-> ");
                         int mes3=leer.nextInt();
                         System.out.print("Dia-> ");
                         int dia3=leer.nextInt();
                         tarea3= new Task(desc3,est3,LocalDate.of(año3,mes3,dia3));
                         break;
                    }
                    break;
                        
                    case 2:
                     System.out.println("Seleccione la tarea que desea marcar como realizada");
                     System.out.println("Tarea 1");
                     System.out.println("Tarea 2");
                     System.out.println("Tarea 3");
                         opc3=leer.nextInt();
                         leer.nextLine(); 
                        switch(opc3){
                         case 1:
                            if(tarea1 != null){
                                tarea1.setEstado(true);
                                System.out.println("!La tarea Fue Realizada¡");
                                
                            }    
                         break;

                         case 2: 
                         if(tarea2 != null){
                            tarea2.setEstado(true);
                            System.out.println("!La tarea Fue Realizada¡");
                            
                            }
                         break;

                         case 3:
                         if(tarea3 != null){
                            tarea3.setEstado(true);
                            System.out.println("!La tarea Fue Realizada¡");
                            
                        }
                         break;
                        } 
                    break;

                    case 3:
                     System.out.println("Seleccione la tarea que desea Eliminar");
                     System.out.println("Tarea 1");
                     System.out.println("Tarea 2");
                     System.out.println("Tarea 3");
                     opc3=leer.nextInt();
                     leer.nextLine();
                     switch(opc3){
                         case 1:
                         if(tarea1 != null){
                             tarea1=null;
                             System.out.println("La tarea fue ELIMINADA");
                         }
                         break;
                         case 2:
                         if(tarea2 != null){
                            tarea2=null;
                            System.out.println("La tarea fue ELIMINADA");
                        }
                         break;
                         case 3:
                         if(tarea3 != null){
                            tarea3=null;
                            System.out.println("La tarea fue ELIMINADA");
                        }
                         break;
                     } 
                    break;

                    case 4:
                     System.out.println("Seleccione la tarea que desea ver");
                     System.out.println("Tarea 1");
                     System.out.println("Tarea 2");
                     System.out.println("Tarea 3");
                     opc3=leer.nextInt();
                     leer.nextLine();
                     switch(opc3){
                         case 1:
                         if(tarea1 != null){
                             System.out.println(tarea1.toString());
                         }
                         else{
                             System.out.println("La tarea 1 Esta VACIA");
                         }
                         break;
                         case 2:
                         if(tarea2 != null){
                            System.out.println(tarea2.toString());
                         }
                         else{
                            System.out.println("La tarea 2 Esta VACIA");
                         }
                         break;
                         case 3:
                         if(tarea3 != null){
                            System.out.println(tarea3.toString());
                         }
                         else{
                            System.out.println("La tarea 3 Esta VACIA");
                         }
                         break;
                     }
                    break;
                    default:
                     System.out.println("!!Lo ingresado No corresponde a ninguna de las opciones disponibles¡¡");
                    break;
             }
        }
    }
}
