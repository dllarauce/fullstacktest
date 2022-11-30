package com.macro.sa.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Encuestado {

  @Id
  private Integer ci;
  private String nombreApellido;
  private String sexo;
  private Integer edad;

  public Integer getCi() {
    return ci;
  }

  public void setCi(Integer ci) {
    this.ci = ci;
  }

  public String getNombreApellido() {
    return nombreApellido;
  }

  public void setNombreApellido(String nombreApellido) {
    this.nombreApellido = nombreApellido;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public Integer getEdad() {
    return edad;
  }

  public void setEdad(Integer edad) {
    this.edad = edad;
  }
}