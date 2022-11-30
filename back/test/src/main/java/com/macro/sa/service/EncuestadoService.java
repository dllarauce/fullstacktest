public interface EncuestadoService {
    public List<Encuestado> obtenerEncuestados();
    public Encuestado obtenerEncuestado(int ci);
    public void agregarEncuestado(Encuestado encuestado);
    public void actualizarEncuestado(int ci, Encuestado encuestado);
    public void eliminarEncuestado(int ci);
}