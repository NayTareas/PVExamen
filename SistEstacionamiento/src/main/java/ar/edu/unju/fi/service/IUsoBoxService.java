package ar.edu.unju.fi.service;

public interface IUsoBoxService {
  public void ocuparBox(Long boxId, Long autoId, int horas);

  public double calcularCosto(int zona, int horas);
}
