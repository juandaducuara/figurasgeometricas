package figurasGeo;
//package figurasGeometricas;

import java.util.Scanner;

public class ejecucion {
    
    public static void main(String[] args) {
        decagono decagono = new decagono();
        Scanner sc = new Scanner(System.in);

        System.out.println("Area del decagono");
        System.out.println("Digite un lado del decagono :");
        decagono.setLadoD(sc.nextDouble());
        System.out.println("Digite el apotema del decagono :");
        decagono.setApotemaD(sc.nextDouble());

        decagono.hallarArea();
        sc.close();
        
    }
    
}
