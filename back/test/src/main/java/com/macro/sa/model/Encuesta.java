
package com.macro.sa.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Encuesta {

  @Id
  private Integer encuestaId;
  private String pregunta;
  private String escala;
  private String categoria;

  public Integer getEncuestaId() {
    return encuestaId;
  }

  public void setEncuestaId(Integer encuestaId) {
    this.encuestaId = encuestaId;
  }

  public String getPregunta() {
    return pregunta;
  }

  public void setPregunta(String pregunta) {
    this.pregunta = pregunta;
  }

  public String getEscala() {
    return escala;
  }

  public void setEscala(String escala) {
    this.escala = escala;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }
}
