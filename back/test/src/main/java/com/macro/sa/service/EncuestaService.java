public interface EncuestaService {
    public List<Encuesta> obtenerEncuestas();
    public Encuesta obtenerEncuesta(int id);
    public void agregarEncuesta(Encuesta encuesta);
    public void actualizarEncuesta(int id, Encuesta encuesta);
    public void eliminarEncuesta(int id);
}