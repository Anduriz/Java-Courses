public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        //Bono $200
        //salary = salary + 200;
        salary += 200;
        System.out.println(salary);

        //Pension $50 descuento
        salary -= 50;
        System.out.println(salary);

        //2 Horas extras $30 c/u
        //Comida $45
        salary += (30*2) - 45;
        System.out.println(salary);

        //Actualizando cadenas de texto
        String employeeName = "Guillermo";
        employeeName = employeeName + " Arellano Anleu";
        employeeName = "Andy " + employeeName;
        System.out.println("Tu nombre es: " + employeeName);
    }
}