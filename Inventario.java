import java.util.ArrayList;
import java.util.Scanner;
public class Inventario {
    private ArrayList<Medicina> listaMedicinas;

    public Inventario() {
        listaMedicinas = new ArrayList<Medicina>();

    }

    public void agregarMedicina(Medicina medicina) {
        listaMedicinas.add(medicina);
    }

    public void consultarMedicina() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el código de producto o el nombre de la medicina: ");
        String codigoONombre = sc.nextLine();
        boolean encontrado = false;
        for (Medicina medicina : listaMedicinas) {
            if (medicina.getCodigoProducto().equals(codigoONombre) || medicina.getNombre().equals(codigoONombre)) {
                System.out.println("Detalles de la medicina:");
                System.out.println("Código de producto: " + medicina.getCodigoProducto());
                System.out.println("Nombre: " + medicina.getNombre());
                System.out.println("Descripción: " + medicina.getDescripcion());

                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("La medicina no está registrada en el inventario.");
        }
    }
}
