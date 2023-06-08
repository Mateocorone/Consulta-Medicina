public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Medicina medicina1 = new Medicina("#001", "Ibuprofeno", "Medicamento para el dolor y la inflamación.");
        Medicina medicina2 = new Medicina("#002", "Paracetamol", "Medicamento para el dolor y la fiebre.");
        inventario.agregarMedicina(medicina1);
        inventario.agregarMedicina(medicina2);
        inventario.consultarMedicina();
    }
}
