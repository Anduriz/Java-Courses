import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Functions {

    public static void main(String[] args) {
        //Area de un circulo
        //pi * r2
        double y = 3;
        System.out.println(circleArea(y));
        System.out.println(sphereArea(y));
        System.out.println(sphereVolumen(y));

        System.out.println("PESOS A DOLARES: " + convertToDolar( 200, "MXN" ));


    }

    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }

    public static double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r,2);
    }

    public static double sphereVolumen(double r){
        return (4/3) * Math.PI * Math.pow(r,3);
    }

    /**
     * Descripcion: Funcion que especificando su moneda convierte una cantidad de dinero a dolares.
     *
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda: Solo acepta MXN o COP
     * @return quantity Devuelve la cantidad actualizada en Dolares
     * */
    public static double convertToDolar(double quantity, String currency){
        //MXN COP
        switch (currency){
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }
            return  quantity;
    }

}
