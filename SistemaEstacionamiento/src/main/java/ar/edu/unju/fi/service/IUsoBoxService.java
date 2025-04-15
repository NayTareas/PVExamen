package ar.edu.unju.fi.service;

import java.util.List;

import ar.edu.unju.fi.model.UsoBox;

public interface IUsoBoxService {
  public void ocuparBox(Long boxId, Long autoId, int horas);

  public List<UsoBox> obternerBoxes();

  public double calcularCosto(int zona, int horas);
}