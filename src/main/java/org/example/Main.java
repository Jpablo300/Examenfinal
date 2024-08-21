package org.example;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner lea=new Scanner(System.in);

        //MENU DE OPCIONES
        System.out.println("****************************");
        System.out.println("1. Ingresar pelicula ");
        System.out.println("2. Buscar todos ");
        System.out.println("3. Buscar por nombre ");
        System.out.println("4. modificra clasificacion ");
        System.out.println("0 para salir ");
        System.out.println("********************************");
        //creando menu de opciones
        int opcionElejida;


        ArrayList<HashMap<String, Object>> peliculas=new ArrayList<>();

        do {
           HashMap<String,Object> pelicula=new HashMap<>();
            System.out.println("Dijita una opcion: ");
            opcionElejida=lea.nextInt();
            lea.nextLine();

            if (opcionElejida==1){
                System.out.print("Se ingresa el nombre un pelicula: ");
                String nombrePelicula= lea.nextLine();
                System.out.print("Ingresa la duracion de la pelicula en horas: ");
                 int duracionPelicula= lea.nextInt();
                System.out.print("Ingresa la clasificacion de la pelicula: ");
                lea.nextLine();
                String clasificacionPelicula= lea.nextLine();
                System.out.print("Ingresa la sipnosis de la pelicula: ");
                String sipnisisPelicula =lea.nextLine();
                System.out.println("Esta es la fecha de estreno de la pelicula");
                LocalDate fechaEstreno=LocalDate.of(2024,12,28);

                int idPelicula=new Random().nextInt(200);

                pelicula.put("nombre", nombrePelicula);
                pelicula.put("duracion", duracionPelicula);
                pelicula.put("clasificacion", clasificacionPelicula);
                pelicula.put("sipnosis", sipnisisPelicula);
                pelicula.put("idPelicula", idPelicula);

                peliculas.add(pelicula);


            } else if (opcionElejida==2) {
                System.out.println("Mostrando el todo");
                for (HashMap<String, Object> peliculaAuxiliar: peliculas){
                    System.out.println(peliculaAuxiliar);
                }
            } else if (opcionElejida==3) {
                System.out.println("Buscando pelicula");
                //PARA BUSCAR EN UN ARREGLO NECESITO EL INDICE QUE ESTOY BUSCANDO
                System.out.println("Digita el nombre del pelicula que quieres buscar");
                String nombrePeliculasAbuscar= lea.nextLine();

                //RECORRIENDO EL ARREGLO PARA BUSCAR
                for (HashMap<String, Object> peliculaAuxiliar:peliculas){
                    //COMPARAR SI EL NOMBRE QUE ENCONTRO EL AXULIAR ES EL MISMO DIGITADO
                    if (nombrePeliculasAbuscar.equals(peliculaAuxiliar.get("nombre"))){
                        System.out.println("pelicula encontrado");
                        //MOSTRA LA INFORMACION DEL PELICULA QUE SE ENCONTRO
                        System.out.println(peliculaAuxiliar);

                        //COMO ENCONTRA EL INDICE DEL PElICULA AUXILIAR

                    }
                }


            } else if (opcionElejida==4) {
                System.out.println("Modificando la clasificacion, Digite la nueva clasificacion");
                String nuevaClasificacion=lea.nextLine();
                System.out.println("clasificacion guardad");
            } else if (opcionElejida==0){
                System.out.println("Saliendo....");
            } else {
                System.out.println("Opcion invalida");
            }







        }while (opcionElejida!=0);
    }
}