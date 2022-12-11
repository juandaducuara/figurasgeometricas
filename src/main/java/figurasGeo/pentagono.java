package figurasGeo;
//package figurasGeometricas;

public class pentagono  extends figura{
    private double areaP , perimetroP , ladoP ,apotemaP;
   
    
    public double getAreaP() {
        return areaP;
    }
    public void setAreaP(double areaP) {
        this.areaP = areaP;
    }
    public double getPerimetroP() {
        return perimetroP;
    }
    public void setPerimetroP(double perimetroP) {
        this.perimetroP = perimetroP;
    }
    public double getLadoP() {
        return ladoP;
    }
    public void setLadoP(double ladoP) {
        this.ladoP = ladoP;
    }
    public double getApotemaP() {
        return apotemaP;
    }
    public void setApotemaP(double apotemaP) {
        this.apotemaP = apotemaP;
    }
    public pentagono() {
    }
    public pentagono(double areaP, double perimetroP, double ladoP, double apotemaP) {
        this.areaP = areaP;
        this.perimetroP = perimetroP;
        this.ladoP = ladoP;
        this.apotemaP = apotemaP;
    }
    public void hallarArea(){
        setAreaP((5*getLadoP()*getApotemaP())/2);
        System.out.println("El area del pentagono es : "+getAreaP());

    }
    
    public void hallarPerimetro(){
        setPerimetroP(getLadoP() * 5 );
        System.out.println("El perimetro del pentagono es : " + getPerimetroP());
    }
}
    

