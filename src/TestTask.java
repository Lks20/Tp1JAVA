import java.util.Scanner;
import java.util.Date;

public class TestTask {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opc;
        int opc2;
        Task tarea1=null;
        Task tarea2=null;
        Task tarea3=null;

        System.out.println("!Bienvenido al sistema de tareas¡");
        System.out.println("Ingrese 1 para crear una nueva tarea o editar una ya creada");
        System.out.println("Ingrese 2 para ver el estado de todas las tareas");
        System.out.println("Ingrese 3 para eliminar una tarea");
        opc= leer.nextInt();
        leer.nextLine();
        switch(opc){
            case 1:
                System.out.println("Selecione uno de los espacios para crear una tarea o editar");
                System.out.println("Espacio 1");
                System.out.println("Espacio 2");
                System.out.println("Espacio 3");
                opc2=leer.nextInt();
                leer.nextLine();
                    switch(opc2){
                        
                        case 1:
                            System.out.println("Ingrese el Nombre de la tarea");
                            String Nombre;
                               Nombre=leer.nextLine();
                            System.out.println("Ingrese la descripcion de la tarea");
                                String Desc;
                                Desc=leer.nextLine();
                            System.out.println("Ingrese El estado de la tarea");
                                Boolean est;
                                est=leer.nextBoolean();
                                leer.nextLine();
                            System.out.println("Ingrese el dia,mes y año limite de la tarea");
                                int dia;
                                int mes;
                                int año;
                                dia=leer.nextInt();
                                mes=leer.nextInt();
                                año=leer.nextInt();
                            tarea1=new Task(Nombre,Desc,est,new Date(año-1900,mes-1,dia));
                            tarea1.mostrar();
                        break;

                        case 2:
                        System.out.println("Ingrese el Nombre de la tarea");
                            String Nombre2;
                                Nombre2=leer.nextLine();
                            System.out.println("Ingrese la descripcion de la tarea");
                                String Desc2;
                                Desc2=leer.nextLine();
                            System.out.println("Ingrese El estado de la tarea");
                                Boolean est2;
                                est2=leer.nextBoolean();
                                leer.nextLine();
                            System.out.println("Ingrese el dia,mes y año limite de la tarea");
                                int dia2;
                                int mes2;
                                int año2;
                                dia2=leer.nextInt();
                                mes2=leer.nextInt();
                                año2=leer.nextInt();
                            tarea2=new Task(Nombre2,Desc2,est2,new Date(año2-1900,mes2-1,dia2));
                            tarea2.mostrar();
                        break;

                        case 3:
                            System.out.println("Ingrese el Nombre de la tarea");
                            String Nombre3;
                                Nombre3=leer.nextLine();
                            System.out.println("Ingrese la descripcion de la tarea");
                            String Desc3;
                                Desc3=leer.nextLine();
                            System.out.println("Ingrese El estado de la tarea");
                            Boolean est3;
                                est3=leer.nextBoolean();
                                leer.nextLine();
                            System.out.println("Ingrese el dia,mes y año limite de la tarea");
                                int dia3;
                                int mes3;
                                int año3;
                                dia3=leer.nextInt();
                                mes3=leer.nextInt();
                                año3=leer.nextInt();
                            tarea3=new Task(Nombre3,Desc3,est3,new Date(año3-1900,mes3-1,dia3));
                            tarea3.mostrar();
                        break;
                    }

            break;

            case 2:
           
            break;

            case 3:
            break;

            case 4:
            break;


        }
        
        
      




    }
}
