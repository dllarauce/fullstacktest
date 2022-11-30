public interface RespuestaService {
    public List<Respuesta> obtenerRespuestas();
    public Respuesta obtenerRespuesta(int id);
    public void agregarRespuesta(Respuesta respuesta);
    public void actualizarRespuesta(int id, Respuesta respuesta);
    public void eliminarRespuesta(int id);
}
