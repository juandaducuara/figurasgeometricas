package figurasGeo;
//package figurasGeometricas;

public class rectangulo extends figura{
    private double ladoA , ladoB , areaR , perimetroR;
    
    public double getLadoA() {
        return ladoA;
    }
    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }
    public double getLadoB() {
        return ladoB;
    }
    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }
    public double getArea() {
        return areaR;
    }
    public void setArea(double areaR) {
        this.areaR = areaR;
    }
    public double getPerimetro() {
        return perimetroR;
    }
    public void setPerimetro(double perimetroR) {
        this.perimetroR = perimetroR;
    }
    public rectangulo(){

    }
    public rectangulo(double area , double perimetro , double ladoA , double ladoB ){
        this.areaR=area;
        this.perimetroR=perimetro;
        this.ladoA=ladoA;
        this.ladoB=ladoB;
    }
    public void hallarArea(){
        setArea(getLadoA()*getLadoB());
        System.out.println("El area del rectangulo es "+ getArea());
    }
    public void hallarPerimetro(){
        setPerimetro(getLadoA()*getLadoB());
        System.out.println("El perimetro del rectangulo es :" + getPerimetro());
        
    }
}
