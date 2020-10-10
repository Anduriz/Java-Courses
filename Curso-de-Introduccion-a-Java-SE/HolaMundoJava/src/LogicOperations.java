public class LogicOperations {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;

        // System.out.println("a es igual a b?  = " + (a == b));
        //System.out.println("a es diferente a b?  = " + (a != b));

        //Operadores Relacionales
        //System.out.println("a es mayor que b?  = " + (a > b));
        //System.out.println("a es menor que b?  = " + (a < b));
        //System.out.println("a es mayor o igual que b?  = " + (a >= b));
        //System.out.println("a es menor o igual que b?  = " + (a <= b));

        if( a == b ){
            System.out.printf("A es igual a B");
        } else if (a != b){
            System.out.printf("A no es igual a B");
        } else if (a > b){
            System.out.printf("A es mayor a B");
        } else if (a < b){
            System.out.printf("A es menor a B");
        } else if (a >= b){
            System.out.printf("A es mayor o igual a B");
        } else if (a <= b){
            System.out.println("A es menor o igual a B");
        }

    }
}