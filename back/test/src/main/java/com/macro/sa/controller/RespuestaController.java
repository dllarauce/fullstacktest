package com.macro.sa.controller;


@RestController
@RequestMapping("/respuestas")
public class RespuestaController {

  @Autowired
  private RespuestaService respuestaService;

  @GetMapping("/")
  public List<Respuesta> getAllRespuestas() {
    return respuestaService.getAllRespuestas();
  }

  @GetMapping("/{respuestaId}")
  public Respuesta getRespuestaById(@PathVariable("respuestaId") Integer respuestaId) {
    return respuestaService.getRespuestaById(respuestaId);
  }

  @PostMapping("/")
  public Respuesta createRespuesta(@RequestBody Respuesta respuesta) {
    return respuestaService.createRespuesta(respuesta);
  }

  @PutMapping("/{respuestaId}")
  public Respuesta updateRespuesta(@PathVariable("respuestaId") Integer respuestaId, @RequestBody Respuesta respuesta) {
    return respuestaService.updateRespuesta(respuestaId, respuesta);
  }

  @DeleteMapping("/{respuestaId}")
  public void deleteRespuesta(@PathVariable("respuestaId") Integer respuestaId) {
    respuestaService.deleteRespuesta(respuestaId);
  }
}
