package ar.edu.unju.fi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UsoBox {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @ManyToOne
  private Automovil automovil;
  @ManyToOne
  private BoxDeEstacionamiento box;
  private int cantidadHoras;
  private double costoPagado;

  public Automovil getAutomovil() {
      return automovil;
  }

  public void setAutomovil(Automovil automovil) {
      this.automovil = automovil;
  }

  public BoxDeEstacionamiento getBox() {
      return box;
  }

  public void setBox(BoxDeEstacionamiento box) {
      this.box = box;
  }

  public int getCantidadHoras() {
      return cantidadHoras;
  }

  public void setCantidadHoras(int cantidadHoras) {
      this.cantidadHoras = cantidadHoras;
  }

  public double getCostoPagado() {
      return costoPagado;
  }

  public void setCostoPagado(double costoPagado) {
      this.costoPagado = costoPagado;
  }
}
