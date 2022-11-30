package com.macro.sa.controller;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {

  @Autowired
  private ComentarioService comentarioService;

  @GetMapping("/")
  public List<Comentario> getAllComentarios() {
    return comentarioService.getAllComentarios();
  }

  @GetMapping("/{comentarioId}")
  public Comentario getComentarioById(@PathVariable("comentarioId") Integer comentarioId) {
    return comentarioService.getComentarioById(comentarioId);
  }

  @PostMapping("/")
  public Comentario createComentario(@RequestBody Comentario comentario) {
    return comentarioService.createComentario(comentario);
  }

  @PutMapping("/{comentarioId}")
  public Comentario updateComentario(@PathVariable("comentarioId") Integer comentarioId, @RequestBody Comentario comentario) {
    return comentarioService.updateComentario(comentarioId, comentario);
  }

  @DeleteMapping("/{comentarioId}")
  public void deleteComentario(@PathVariable("comentarioId") Integer comentarioId) {
    comentarioService.deleteComentario(comentarioId);
  }
}