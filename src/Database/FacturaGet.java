
package Database;


public class FacturaGet {
     

    public int getId_venta() {
        return Id_venta;
    }

    public void setId_venta(int Id_venta) {
        this.Id_venta = Id_venta;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getModelo_producto() {
        return modelo_producto;
    }

    public void setModelo_producto(String modelo_producto) {
        this.modelo_producto = modelo_producto;
    }

    public String getCantidad_producto() {
        return cantidad_producto;
    }

    public void setCantidad_producto(String cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }

    public String getTotal_producto() {
        return total_producto;
    }

    public void setTotal_producto(String total_producto) {
        this.total_producto = total_producto;
    }
    public FacturaGet(){
    }
    private int Id_venta;
    private String nombre_producto;
    private String modelo_producto;
    private String cantidad_producto;
    private String total_producto;
    private String marca_producto;
    private String precio_ud;

    public String getPrecio_ud() {
        return precio_ud;
    }

    public void setPrecio_ud(String precio_ud) {
        this.precio_ud = precio_ud;
    }

    public String getMarca_producto() {
        return marca_producto;
    }

    public void setMarca_producto(String marca_producto) {
        this.marca_producto = marca_producto;
    }
    
    public FacturaGet(int Id_venta, String nombre_producto,String marca_producto, String modelo_producto,
            String precio_ud, String cantidad_producto, String total_producto) 
    {
        this.Id_venta = Id_venta;
        this.nombre_producto = nombre_producto;
        this.marca_producto = marca_producto;
        this.modelo_producto = modelo_producto;
        this.precio_ud = precio_ud;
        this.cantidad_producto = cantidad_producto;
        this.total_producto = total_producto;
    }
    
   
}
