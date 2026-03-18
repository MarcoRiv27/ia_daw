package com.endes.figuras;

public class Triangulo extends FiguraGeometrica{

       private Punto vertice1;
       private Punto vertice2;
       private Punto vertice3;
       
       public Triangulo(String nombre, String color, Punto vertice1, Punto vertice2, Punto vertice3) {
       super(nombre, color);
       this.vertice1 = vertice1;
       this.vertice2 = vertice2;
       this.vertice3 = vertice3;
       }
       
       public Punto getVertice1() {
       return vertice1;
       }
       
       public Punto getVertice2() {
       return vertice2;
       }
       
       public Punto getVertice3() {
       return vertice3;
       }
       
       public void setVertice1(Punto vertice1) {
       this.vertice1 = vertice1;
       }
       
       public void setVertice2(Punto vertice2) {
       this.vertice1 = vertice2;
       }
       
       public void setVertice3(Punto vertice3) {
       this.vertice3 = vertice3;
       }
       
       @Override
       public double area() {
            double base = vertice2.getX() - vertice1.getX();
            double altura = vertice1.getY() - vertice2.getY();
            return (base * altura) / 2;
       }

       @Override
       public double perimetro() {
       double lado1 = Math.sqrt(Math.pow(vertice2.getX() - vertice1.getX(), 2) + Math.pow(vertice2.getY() - vertice1.getY(), 2));
       return lado1;
       }
}
      