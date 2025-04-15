package ar.edu.unju.fi.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
@Entity
public class BoxDeEstacionamiento {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private Integer zona;
  private Boolean disponibilidad;
  
  //getter manual para evitar problemas con Lombok
  public Boolean getDisponibilidad() {
	  return disponibilidad;
  }
  public void setDisponibilidad(Boolean disponibilidad) {
	  this.disponibilidad = disponibilidad;
  }
  
  public Integer getZona() {
	  return zona;
  }
  public void setZona(Integer zona) {
	  this.zona = zona;
  }
  public Long getId() {
	  return id;
  }
  public void setId(Long id) {
	  this.id = id;
  }
}
