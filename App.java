import java.util.Arrays;

/**
 * App
 */
public class App {
    public static void main(String[] args) {
        double[] ventas = { 150000, 230000, 180000, 320000, 450000, 520000, 290000 };
        String[] dias = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado",
            "Domingo" };
        double valor=0;
        int diaSup=0;
        int diaInfe=0;
        for (int i = 0; i < dias.length; i++) {
            //System.out.println(dias[i]+" : "+ ventas[i]);
            valor+=ventas[i];
            //dias mayores y menores
            if (ventas[i]>=300000) {
                diaSup ++;
            }else if (ventas[i] <= 200000) {
                diaInfe ++;
            }

            // clasificar en una sola impresión
            String clasificacion;
            if (ventas[i] < 200000) {
                clasificacion = "Venta baja";
            } else if (ventas[i] >= 200000 && ventas[i] <= 399999) {
                clasificacion = "Venta normal";
            } else {
                clasificacion = "Venta alta";
            }

            System.out.println(dias[i] + " : $" + ventas[i] + " -> " + clasificacion);

        }

        
        System.out.println("Total de ventas: " + valor);

        double promedio=valor/7;
        System.out.println("Promedio es: "+ promedio);

        double maximo = Arrays.stream(ventas).max().getAsDouble();
        double minimo = Arrays.stream(ventas).min().getAsDouble();

        System.out.println("El valor más alto es: " + maximo);
        System.out.println("El valor más bajo es: " + minimo);

        System.out.println("Dias ventas superiores: "+diaSup+ " Dias ventas inferiores: "+diaInfe);

                // encontrar mayor y segunda mayor venta
        double mayor = Double.MIN_VALUE;
        double segundaMayor = Double.MIN_VALUE;
        String diaMayor = "";
        String diaSegunda = "";

        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] > mayor) {
                segundaMayor = mayor;
                diaSegunda = diaMayor;

                mayor = ventas[i];
                diaMayor = dias[i];
            } else if (ventas[i] > segundaMayor) {
                segundaMayor = ventas[i];
                diaSegunda = dias[i];
            }
        }

        System.out.println("La mayor venta fue: $" + mayor + " en " + diaMayor);
        System.out.println("La segunda mayor venta fue: $" + segundaMayor + " en " + diaSegunda);
    
    }

}