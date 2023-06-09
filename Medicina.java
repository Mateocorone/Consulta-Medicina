public class Medicina {
    private String codigoProducto;
    private String nombre;
    private String descripcion;

    public Medicina(String codigoProducto, String nombre, String descripcion) {
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;

    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

}
