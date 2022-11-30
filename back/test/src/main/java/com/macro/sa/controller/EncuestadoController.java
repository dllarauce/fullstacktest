package com.macro.sa.controller;

@RestController
@RequestMapping("/encuestados")
public class EncuestadoController {

  @Autowired
  private EncuestadoService encuestadoService;

  @GetMapping("/")
  public List<Encuestado> getAllEncuestados() {
    return encuestadoService.getAllEncuestados();
  }

  @GetMapping("/{ci}")
  public Encuestado getEncuestadoByCi(@PathVariable("ci") Integer ci) {
    return encuestadoService.getEncuestadoByCi(ci);
  }

  @PostMapping("/")
  public Encuestado createEncuestado(@RequestBody Encuestado encuestado) {
    return encuestadoService.createEncuestado(encuestado);
  }

  @PutMapping("/{ci}")
  public Encuestado updateEncuestado(@PathVariable("ci") Integer ci, @RequestBody Encuestado encuestado) {
    return encuestadoService.updateEncuestado(ci, encuestado);
  }

  @DeleteMapping("/{ci}")
  public void deleteEncuestado(@PathVariable("ci") Integer ci) {
    encuestadoService.deleteEncuestado(ci);
  }
}
