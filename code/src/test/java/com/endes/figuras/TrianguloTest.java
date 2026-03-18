package com.endes.figuras;

public class TrianguloTest {

private Triangulo triangulo;


void setUp() throws Exception {
//String nombre, String color, Punto punto1, Punto punto2, Punto punto3
       Punto v1 = new Punto(0, 1);
       Punto v2 = new Punto(0, 0);
       Punto v3 = new Punto(2, 0);
       
       triangulo = new Triangulo("triangulo", "negro", v1, v2, v3);
}

void testConstructor() {
    Punto v1_esperando = new Punto(0, 1);
    Punto v2_esperando = new Punto(0, 0);
    Punto v3_esperando = new Punto(2, 0);
}


}
