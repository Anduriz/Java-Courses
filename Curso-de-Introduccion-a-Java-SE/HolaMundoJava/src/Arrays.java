public class Arrays {
    public static void main(String[] args) {
        //No siempre lo mas adecuado es utilizar arreglos
        String[] androidVersiones = new String[17];
        //Otra forma de declarar arrays
        String days[] = new String[7];

        //Cuando estas usando arreglos de tres dimensiones lo mas recomendable es llevar estos datos a una base de datos
        String[][][] estudiantes = new String[5][5][5];

        //Inicializar arrays
        String[][] nombres = new String[4][2];

        nombres[0][0] = "Andy";
        nombres[1][0] = "Pablo";
        nombres[2][0] = "Jose";
        nombres[0][1] = "Arellano";
        nombres[1][1] = "Perez";
        nombres[2][1] = "Javier";

        //For anidados
        /*
        for(int x = 0; x < nombres.length; x++){
            for(int y = 0; y < nombres[y].length;y++){
                System.out.println(nombres[x][y] );
            }
        }
        */

        //For each

        for (String x[] : nombres) {
            for(String y : x) {
                System.out.println(y);
            }
        }


    }
}


