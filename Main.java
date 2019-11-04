//Daniela te amo!!funciona xd

import java.util.*;
import maps.coordenadas;

class Main {

  public static void maps() {
    ArrayList<coordenadas> lista = new ArrayList<coordenadas>();
    // Lista es una coleccion

    // datos
    double Latitud, Longitud;
    int numeroLados;
    Scanner input = new Scanner(System.in);

    do { 
    System.out.println("Ingrese Numero de lados");
    System.out.println("===========================");
    numeroLados = input.nextInt();
    if(numeroLados <= 2){
      System.out.println("Numero No válido, ingrese un numero mayor o igual a 3");
      System.out.println("");
    }
    }while (numeroLados <= 2);

    
    for (int x = 0; x < numeroLados; x++) {
      // Ingreso de datos
      System.out.println("Ingrese la latitud " + (x + 1));
      Latitud = input.nextDouble();
      System.out.println("Ingrese la longitud " + (x + 1));
      Longitud = input.nextDouble();

      coordenadas o = new coordenadas();
      o.lat = Latitud;
      o.lonj = Longitud;

      lista.add(x, o);

    }
    System.out.println("===========================");

    System.out.println("https://www.keene.edu/campus/maps/tool/?coordinates=");
    for (int x = 0; x <= numeroLados; x++) {
      if (x != numeroLados) {
        System.out.print(lista.get(x).lat);
        System.out.print("%2C%20");
        System.out.print(lista.get(x).lonj);
        System.out.print("%0A");
      } else {
        System.out.print(lista.get(0).lat);
        System.out.print("%2C%20");
        System.out.print(lista.get(0).lonj);
      }
    }
  }

  public static void main(String[] args) {
    System.out.println("");
    System.out.println("===========================");
    System.out.println("Bienvenidos a la tarea sem4");
    System.out.println("===========================");
    System.out.println("");
    maps();

  }
}