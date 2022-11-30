public interface SucursalService {
    public List<Sucursal> obtenerSucursales();
    public Sucursal obtenerSucursal(int id);
    public void agregarSucursal(Sucursal sucursal);
    public void actualizarSucursal(int id, Sucursal sucursal);
    public void eliminarSucursal(int id);
}
