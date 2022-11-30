package com.macro.sa.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Respuesta {

  @Id
  private Integer respuestaId;
  private Integer encuestaId;
  private Integer sucursalId;
  private Integer ci;
  private String respuesta;

  public Integer getRespuestaId() {
    return respuestaId;
  }

  public void setRespuestaId(Integer respuestaId) {
    this.respuestaId = respuestaId;
  }

  public Integer getEncuestaId() {
    return encuestaId;
  }

  public void setEncuestaId(Integer encuestaId) {
    this.encuestaId = encuestaId;
  }

  public Integer getSucursalId() {
    return sucursalId;
  }

  public void setSucursalId(Integer sucursalId) {
    this.sucursalId = sucursalId;
  }

  public Integer getCi() {
    return ci;
  }

  public void setCi(Integer ci) {
    this.ci = ci;
  }

  public String getRespuesta() {
    return respuesta;
  }

  public void setRespuesta(String respuesta) {
    this.respuesta = respuesta;
  }

}