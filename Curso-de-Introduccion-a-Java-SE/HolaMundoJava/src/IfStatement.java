public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = true;
        int fileSended = 3;

        if(isBluetoothEnabled){
            //Send file
            fileSended++;
            System.out.println("Archivo Enviado");
        } else {
            System.out.printf("Por favor enciente tu Bluetooth, para iniciar la transferencia");
        }

        System.out.println(fileSended);
    }
}