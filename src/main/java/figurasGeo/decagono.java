package figurasGeo;
//package figurasGeometricas;

public class decagono extends figura{
    private double areaD , perimetroD , ladoD,apotemaD;   
    
    public double getAreaD() {
        return areaD;
    }
    public void setAreaD(double areaD) {
        this.areaD = areaD;
    }
    public double getPerimetroD() {
        return perimetroD;
    }
    public void setPerimetroD(double perimetroD) {
        this.perimetroD = perimetroD;
    }
    public double getLadoD() {
        return ladoD;
    }
    public void setLadoD(double ladoD) {
        this.ladoD = ladoD;
    }
    public double getApotemaD() {
        return apotemaD;
    }
    public void setApotemaD(double apotemaD) {
        this.apotemaD = apotemaD;
    }
    public decagono() {
    }
    public decagono(double areaD, double perimetroD, double ladoD, double apotemaD) {
        this.areaD = areaD;
        this.perimetroD = perimetroD;
        this.ladoD = ladoD;
        this.apotemaD = apotemaD;
    }
    public void hallarArea(){
       setAreaD(5*getLadoD()*getApotemaD()); 
       System.out.println("El area del decagono es: "+ getAreaD());
    }
    public void hallarPerimetro(){
        setPerimetroD(getLadoD() * 10 );
        System.out.println("El perimetro es decagono es : " + getPerimetroD());
        
    }
}
