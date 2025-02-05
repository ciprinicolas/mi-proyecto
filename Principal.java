import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        System.out.println("¡Hola Mundo!");
        mostrarFechaHora();
    }

    public static void mostrarFechaHora() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fechaHora = sdf.format(new Date());
        System.out.println("Fecha y Hora actual: " + fechaHora);
    }
}
import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        System.out.println("¡Hola Mundo!");
        mostrarFechaHora();
    }

    public static void mostrarFechaHora() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fechaHora = sdf.format(new Date());
        System.out.println("Fecha y Hora actual: " + fechaHora);
    }
}

