package ar.edu.unju.fi.service;

import java.util.List;

import ar.edu.unju.fi.model.BoxDeEstacionamiento;

public interface IBoxEstacionamientoService {
  public void guardarBoxEstacionamiento(BoxDeEstacionamiento boxEstacionamiento);

  public void ocuparBoxEstacionamiento(Long id);

  public void desocuparBoxEstacionamiento(Long id);

  public BoxDeEstacionamiento obtenerBoxPorId(Long id);

  public void modificarBoxEstacionamiento(BoxDeEstacionamiento boxEstacionamiento);

  public List<BoxDeEstacionamiento> obtenerBoxesDisponibles();

  public List<BoxDeEstacionamiento> mostrarBoxEstacionamiento();
}

