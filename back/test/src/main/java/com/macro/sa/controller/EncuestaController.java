package com.macro.sa.controller;

@RestController
@RequestMapping("/encuestas")
public class EncuestaController {

  @Autowired
  private EncuestaService encuestaService;

  @GetMapping("/")
  public List<Encuesta> getAllEncuestas() {
    return encuestaService.getAllEncuestas();
  }

  @GetMapping("/{encuestaId}")
  public Encuesta getEncuestaById(@PathVariable("encuestaId") Integer encuestaId) {
    return encuestaService.getEncuestaById(encuestaId);
  }

  @PostMapping("/")
  public Encuesta createEncuesta(@RequestBody Encuesta encuesta) {
    return encuestaService.createEncuesta(encuesta);
  }

  @PutMapping("/{encuestaId}")
  public Encuesta updateEncuesta(@PathVariable("encuestaId") Integer encuestaId, @RequestBody Encuesta encuesta) {
    return encuestaService.updateEncuesta(encuestaId, encuesta);
  }

  @DeleteMapping("/{encuestaId}")
  public void deleteEncuesta(@PathVariable("encuestaId") Integer encuestaId) {
    encuestaService.deleteEncuesta(encuestaId);
  }
}
