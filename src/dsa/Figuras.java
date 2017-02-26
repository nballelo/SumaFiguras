package dsa;

/**
 * Created by Ignacio on 26/02/2017.
 */
public interface Figuras {
    double area();
}
class Rectangulo implements Figuras{
    double c1,c2;
    public Rectangulo (double l1, double l2){
        c1=l1;
        c2=l2;
    }
    public double area(){
        return c1*c2;
    }
}
class Cuadrado extends Rectangulo {
    public Cuadrado (double c){
        super(c,c);
    }
}
class Circulo implements Figuras{
    double r;
    public Circulo (double r){
        this.r=r;
    }
    public double area(){
        return Math.PI*Math.pow(r,2);
    }
}class Triangulo implements Figuras {
    double b,h;
    public Triangulo (double b, double h){
        this.b=b;
        this.h=h;
    }
    public double area(){
        return (this.b*this.h)/2;
    }
}
