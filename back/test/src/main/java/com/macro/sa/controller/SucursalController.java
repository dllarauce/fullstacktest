package com.macro.sa.controller;

	@RestController
	@RequestMapping("/sucursales")
	public class SucursalController {

	  @Autowired
	  private SucursalService sucursalService;

	  @GetMapping("/")
	  public List<Sucursal> getAllSucursales() {
	    return sucursalService.getAllSucursales();
	  }

	  @GetMapping("/{sucursalId}")
	  public Sucursal getSucursalById(@PathVariable("sucursalId") Integer sucursalId) {
	    return sucursalService.getSucursalById(sucursalId);
	  }

	  @PostMapping("/")
	  public Sucursal createSucursal(@RequestBody Sucursal sucursal) {
	    return sucursalService.createSucursal(sucursal);
	  }

	  @PutMapping("/{sucursalId}")
	  public Sucursal updateSucursal(@PathVariable("sucursalId") Integer sucursalId, @RequestBody Sucursal sucursal) {
	    return sucursalService.updateSucursal(sucursalId, sucursal);
	  }

	  @DeleteMapping("/{sucursalId}")
	  public void deleteSucursal(@PathVariable("sucursalId") Integer sucursalId) {
	    sucursalService.deleteSucursal(sucursalId);
	  }
	}

