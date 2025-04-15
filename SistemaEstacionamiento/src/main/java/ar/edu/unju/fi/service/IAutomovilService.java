package ar.edu.unju.fi.service;

import java.util.List;

import ar.edu.unju.fi.model.Automovil;

public interface IAutomovilService {
  public void guardarAutomovil(Automovil automovil);

  public void eliminarAutomovil(Long id);

  public void modificarAutomovil(Long id, Automovil automovil);

  public List<Automovil> mostrarAutomoviles();

  public List<Automovil> obtenerAutomoviles();

  public Automovil obtenerAutomovilPorId(Long id);
}

