package com.macro.sa.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Comentario {

  @Id
  private Integer comentarioId;
  private Integer sucursalId;
  private Integer ci;
  private String comentario;

  public Integer getComentarioId() {
    return comentarioId;
  }

  public void setComentarioId(Integer comentarioId) {
    this.comentarioId = comentarioId;
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

  public String getComentario() {
    return comentario;
  }

  public void setComentario(String comentario) {
    this.comentario = comentario;
  }

}