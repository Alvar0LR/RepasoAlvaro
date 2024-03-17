import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa el carrito de compras.
 */
public class CarritoDeCompras {
    private ArrayList<Item> items;

    
    /**
     * Constructor para crear un nuevo carrito de compras vacío.
     */
    public CarritoDeCompras() {
        this.items = new ArrayList<>();
    }

    /**
     * Agrega un artículo al carrito.
     * @param item El artículo a agregar.
     */
    public void agregarItem(Item item) {
        items.add(item);
    }

    /**
     * Elimina un artículo del carrito.
     * @param item El artículo a eliminar.
     */
    public void removerItem(Item item) {
        items.remove(item);
    }

    /**
     * Calcula y devuelve el precio total de los artículos en el carrito.
     * @return El precio total del carrito.
     */
    public double calcularTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrecio();
        }
        return total;
    }

    /**
     * Imprime los detalles del carrito de compras, incluidos los artículos y el precio total.
     */
    public void imprimirDetalle() {
        System.out.println("Detalles del carrito de compras:");
        for (Item item : items) {
            System.out.println(item);
        }
        System.out.println("Total: €" + calcularTotal());
    }

    /**
     * Obtiene la lista de artículos en el carrito.
     * @return La lista de artículos.
     */
    public List<Item> getItems() {
        return items;
    }
}
// hola