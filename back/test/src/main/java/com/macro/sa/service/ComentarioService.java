package com.macro.sa.service;

public interface ComentarioService {
    public List<Comentario> obtenerComentarios();
    public Comentario obtenerComentario(int id);
    public void agregarComentario(Comentario comentario);
    public void actualizarComentario(int id, Comentario comentario);
    public void eliminarComentario(int id);
}
