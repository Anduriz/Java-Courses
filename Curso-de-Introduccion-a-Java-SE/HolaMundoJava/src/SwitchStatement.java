public class SwitchStatement {
    public static void main(String[] args) {
        String colorModeSelecter = "Dark";

        switch (colorModeSelecter){
            case "Light":
                System.out.println("Seleccionaste Light Mode");
                break;
            case "Dark":
                System.out.println("Seleccionaste Dark Mode");
                break;
            case "Night":
                System.out.printf("Seleccionaste Night Mode");
                break;
            case "Blue Dark":
                System.out.println("Seleccionaste Blue Dark Mode");
                break;
            default:
                System.out.println("Selecciona una opcion");
        }
    }
}