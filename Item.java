/**
 * Clase que representa un artículo que se puede agregar al carrito de compras.
 */
class Item {
    private String nombre;
    private double precio;

    /**
     * Constructor para crear un nuevo artículo con nombre y precio.
     * @param nombre El nombre del artículo.
     * @param precio El precio del artículo.
     * @throws IllegalArgumentException si el precio es negativo o superior a 1000.
     */
    public Item(String nombre, double precio) {
        if (precio < 0 || precio > 1000) {
            throw new IllegalArgumentException("Precio inválido");
        }
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters y Setters para nombre y precio
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0 || precio > 1000) {
            throw new IllegalArgumentException("Precio inválido");
        }
        this.precio = precio;
    }

    /**
     * Representación en cadena del artículo.
     * @return Una cadena que representa el artículo.
     */
    @Override
    public String toString() {
        return nombre + " - $" + precio;
    }
}
