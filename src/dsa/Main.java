package dsa;

public class Main {

    public static void main(String[] args) {
	GestorFiguras gestor=new GestorFiguras();
	Figuras[]f=new Figuras[10];
	f[0]=new Rectangulo(5,6);
	f[1]=new Triangulo(3,2);
	System.out.println(gestor.Suma(f));
    }
}
