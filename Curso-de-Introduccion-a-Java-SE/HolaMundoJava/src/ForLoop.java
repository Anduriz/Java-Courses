public class ForLoop {

    //Todos los miembros de la clase main deben ser staticos
    static boolean isTurnOnLight = false;

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            printSOS();
        }
    }

    public static void printSOS(){
        System.out.println(". . . _ _ _ . . . ");
    }

    public static boolean turnOnOffLight(){
        isTurnOnLight = (isTurnOnLight)?false:true;
        return isTurnOnLight;
    }

}