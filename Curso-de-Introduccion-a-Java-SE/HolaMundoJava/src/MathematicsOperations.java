public class MathematicsOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        //Devuelve un entero hacia arriba
        System.out.println(Math.ceil(x));

        //Devuelve un entero hacia abajo
        System.out.println(Math.floor(x));

        //Devuelve un numero elevado a otro numero\
        //El primer dato es el numero y el segundo la potencia
        System.out.println(Math.pow(x,y));

        //Devuelve el numero mayor
        System.out.println(Math.max(x,y));

        //Devuelve la raiz cuadrara
        System.out.println(Math.sqrt(x));

        //Area de un circulo
        //pi * r2
        System.out.println(Math.PI * Math.pow(y,2));

        //Area de una esfera
        //4 * pi * r2
        System.out.println( 4 * Math.PI * Math.pow(y,2) );

        //Volumen de una esfera
        //(4/3) * PI * r3
        System.out.println((4/3) * Math.PI * Math.pow(y,3));

        
    }
}
