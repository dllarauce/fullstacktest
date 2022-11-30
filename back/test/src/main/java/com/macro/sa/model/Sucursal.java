package com.macro.sa.model;

package com.macro.sa.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sucursal {

  @Id
  private Integer sucursalId;
  private String nombre;
  private String ciudad;
  private String provincia;

  public Integer getSucursalId() {
    return sucursalId;
  }

  public void setSucursalId(Integer sucursalId) {
    this.sucursalId = sucursalId;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getCiudad() {
    return ciudad;
  }

  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }

  public String getProvincia() {
    return provincia;
  }

  public void setProvincia(String provincia) {
    this.provincia = provincia;
  }
}
