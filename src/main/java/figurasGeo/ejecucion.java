package figurasGeo;
//package figurasGeometricas;

import java.util.Scanner;

public class ejecucion {
    
    public static void main(String[] args) {
        int op;
        decagono decagono = new decagono();
        pentagono pentagono = new pentagono();
        rectangulo rectangulo = new rectangulo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a las figuras geometricas \n Digite 1 si desea el decagono \n Digite 2 si desea el pentagono \n Digite 3 si desea el rectangulo");
        op=sc.nextInt();
        switch (op) {
            case 1:
                System.out.println("Digite 1 si quiere hallar el area \n Digite 2 si quiere hallar el perimetro");
                op=sc.nextInt();
                switch (op) {
                    case 1:
                        System.out.println("Area del decagono");
                        System.out.println("Digite un lado del decagono :");
                        decagono.setLadoD(sc.nextDouble());
                        System.out.println("Digite el apotema del decagono :");
                        decagono.setApotemaD(sc.nextDouble());
                        decagono.hallarArea();                        
                        break;
                    case 2:
                        System.out.println("Perimetro del decagono");
                        System.out.println("Digite un lado del decagono :");
                        decagono.setLadoD(sc.nextDouble());                        
                        decagono.hallarPerimetro();                                               
                        break;                
                    default:
                        break;
                }
                break;
            case 2:
                System.out.println("Digite 1 si quiere hallar el area \n Digite 2 si quiere hallar el perimetro");
                op=sc.nextInt();
                    switch (op) {
                        case 1:
                            System.out.println("Area del pentagono");
                            System.out.println("Digite un lado del pentagono :");
                            pentagono.setLadoP(sc.nextDouble());
                            System.out.println("Digite el apotema del decagono :");
                            pentagono.setApotemaP(sc.nextDouble());
                            pentagono.hallarArea();                            
                            break;
                        case 2:
                            System.out.println("Perimetro del pentagono");
                            System.out.println("Digite un lado del pentagono :");
                            pentagono.setLadoP(sc.nextDouble());                        
                            decagono.hallarPerimetro();                                                 
                            break;                
                        default:
                            break;
                    }                
                break;
            case 3:
                System.out.println("Digite 1 si quiere hallar el area \n Digite 2 si quiere hallar el perimetro");
                op=sc.nextInt();
                    switch (op) {
                        case 1:
                            System.out.println("Area del rectangulo");
                            System.out.println("Digite un lado corto del rectangulo :");
                            rectangulo.setLadoA(sc.nextDouble());
                            System.out.println("Digite el lado largo del rectangulo :");
                            rectangulo.setLadoB(sc.nextDouble());
                            rectangulo.hallarArea();                            
                            break;
                        case 2:
                            System.out.println("Perimetro del pentagono");
                            System.out.println("Digite un lado corto del rectangulo :");
                            rectangulo.setLadoA(sc.nextDouble());
                            System.out.println("Digite el lado largo del rectangulo :");
                            rectangulo.setLadoB(sc.nextDouble());                                                    
                            decagono.hallarPerimetro();                                                 
                            break;                
                        default:
                            break;
                    }                 
                break;
        
            default:
                System.out.println("Opcion no valida");
                break;
        }
        
       sc.close(); 
    }
    
}
