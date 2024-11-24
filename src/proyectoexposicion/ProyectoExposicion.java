
package proyectoexposicion;
import java.util.Scanner;
import java.util.Random;

// ADMINISTRADOR DE TAREAS
public class ProyectoExposicion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rd = new Random();
        
        // Crear objeto "TAREA"
        // False indica pendiente
        Clase1 tarea_default = new Clase1("Tarea1", "primera tarea", 0, false, "00:00");
        
        Clase1[] tareas = new Clase1[5];
        
        int opcion = 0; // Eleccion de accion del usuario
        for (int i = 0; opcion != 6; i++) {
            
            System.out.println("OPCIONES");
            System.out.println("1. Nueva tarea");
            System.out.println("2. Mostrar tareas");
            System.out.println("3. Editar tarea");
            System.out.println("4. Eliminar tarea");
            System.out.println("5. Marcar tarea como hecha");
            System.out.println("6. Salir / Mostrar lo trabajado");
            
            System.out.print("Ingresa el numero de la opcion -> ");
            opcion = input.nextInt();
            
            switch (opcion){
                case 1:
                    
                    if (i < tareas.length){
                    // Crear tarea

                    System.out.print("Nombre de la tarea -> "); String nombre_tarea = input.nextLine();
                    tarea_default.setNombre_tarea(nombre_tarea);
                    System.out.print("Descripcion -> "); String descripcion = input.nextLine();
                    tarea_default.setDescripcion(descripcion);

                    // El numero identificador de la tarea es en la posicion donde se encuentra en el arreglo
                    int identificador = i;

                    System.out.print("Identificador de tarea = " + identificador);
                    tarea_default.setIdentificador(identificador);
                    System.out.println(); // Salto de línea

                    System.out.print("Estado (Pendiente)"); boolean estado = false;
                    tarea_default.setEstado(estado);
                    System.out.println(); // Salto de línea

                    System.out.print("Ingresa limite de tiempo. formato: HH:MM -> "); String tiempo_limite = input.next();
                    tarea_default.setTiempo_limite(tiempo_limite);
                    // Alessandro, create el método de validación del formato

                    // Agregar tarea al array de tareas
                    tareas [i] = new Clase1(nombre_tarea, descripcion, identificador, estado, tiempo_limite);
                    
                    input.nextLine();
                    
                    // El arreglo solo soporta para 5 tareas
                    } else if (i == tareas.length -1) {
                        System.out.println("Solo tienes espacio para una tarea mas");
                        System.out.println("Seguro quieres agregar otra? Si o No -> ");
                        char eleccion = input.next().charAt(0);
                        
                        if (eleccion == 's' || eleccion == 'S'){
                            // LLamamos al método de crear tarea
                        } else {
                            break;
                        }
                    }
                    
                    break;
                    
                case 2:
                    // Mostrar detalles de tarea elegida por el usuario
                    
                    System.out.print("Imprimir detalles de tarea: (Ingrese numero identifiacador) -> "); int n_tarea = input.nextInt();
                    System.out.println("Nomnre de la tarea: " + tareas[n_tarea].getNombre_tarea());
                    System.out.println("Descripcion de la tarea: " + tareas[n_tarea].getDescripcion());
                    System.out.println("Identificador de la tarea: " + tareas[n_tarea].getIdentificador());
                    System.out.print("Estado de la tarea: ");
                    if (tareas[n_tarea].isEstado() == false){
                        System.out.print("PENDIENTE");
                    } else {
                        System.out.print("TERMINADA");
                    }
                    System.out.println(); // Salto de linea

                    System.out.println("Tiempo limite de la tarea: " + tareas[n_tarea].getTiempo_limite());
                    
                    break;
                    
                case 3:
                    // Edicion de la tarea elegida por el usuario
                    
                    /// Hacelo en la otra clase Alessandro
                    
                    break;
                    
                case 4:
                    // Eliminar tarea
                    
                    System.out.println("Que tarea deseas eliminar?");
                    
                    // Imprimir todas las tareas registradas en el arreglo
                    for (int tareas_registradas = 0; tareas_registradas < tareas.length; tareas_registradas++) {
                        
                        if (tareas[tareas_registradas] != tarea_default) {
                            
                            System.out.println("Tarea " + tareas[tareas_registradas].getIdentificador());
                            
                            // En vez de esto hay que usar el método
                            n_tarea = tareas[tareas_registradas].getIdentificador();
                            System.out.println("Nomnre de la tarea: " + tareas[n_tarea].getNombre_tarea());
                            System.out.println("Descripcion de la tarea: " + tareas[n_tarea].getDescripcion());
                            System.out.println("Identificador de la tarea: " + tareas[n_tarea].getIdentificador());
                            System.out.print("Estado de la tarea: ");
                            if (tareas[n_tarea].isEstado() == false){
                                System.out.print("PENDIENTE");
                            } else {
                                System.out.print("TERMINADA");
                            }
                            System.out.println(); // Salto de linea

                            System.out.println("Tiempo limite de la tarea: " + tareas[n_tarea].getTiempo_limite());

                        }
                        
                    }
                    System.out.println("Ingresa el numero (identificador) de la tarea para eliminarla -> ");
                    int remove = input.nextInt();
                            
                    // Proceso de eliminar
                    tareas[remove] = tarea_default;
                            
                    System.out.println("Tarea eliminada con éxito");
                    
                    break;
                    
                case 5:
                    // Marcar tarea como hecha
                    
                    // Usamos el método de imprimir y luego le preguntamos al user cual quiere marcar
                    
                    // Yo voy a hacer el método para marcarla
                    
                    break;
                    
                default:
                    System.out.println("Opcion no valida");
                    
                    
            
            }
            
            
        }
        
        System.out.println("Vuelve pronto");
        System.out.println("Trabajado hoy");
        // usar el método de impresion
                    
        // Si nos da tiempo, hcaemos la suma del total de hora trabajadas y lo imprimimos
            
        

    }
    
}
