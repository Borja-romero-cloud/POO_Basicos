
package Triangulo_isosceles;


public class Isosceles {
    
    double lado1,lado2;
    double base;
    double altura;
    
    public Isosceles(double lado1, double lado2, double base, double altura){
        
        this.lado1=lado1;
        this.lado2=lado2;
        this.base=base;
        this.altura=altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "Isosceles{" + "lado1=" + lado1 + ", lado2=" + lado2 + ", base=" + base + ", altura=" + altura + '}';
    }

    
    
    public double getPerimetro(){
        
        double perimetro;
        perimetro= lado1+lado2+base;
        
        return perimetro;
    }
    
    public double getArea(){
        
        double area;
        area=(base*altura)/2;
        
        return area;
    }
    
    
}
