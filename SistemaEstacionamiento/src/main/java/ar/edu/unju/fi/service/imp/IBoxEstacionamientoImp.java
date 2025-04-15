package ar.edu.unju.fi.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.model.BoxDeEstacionamiento;
import ar.edu.unju.fi.repository.BoxEstacionamientoRepository;
import ar.edu.unju.fi.service.IBoxEstacionamientoService;

@Service
public class IBoxEstacionamientoImp implements IBoxEstacionamientoService {
  @Autowired
  BoxEstacionamientoRepository boxEstacionamientoRepository;

  @Override
  public void guardarBoxEstacionamiento(BoxDeEstacionamiento boxEstacionamiento) {
    boxEstacionamiento.setDisponibilidad(true);
    boxEstacionamientoRepository.save(boxEstacionamiento);
  }

  @Override
  public void ocuparBoxEstacionamiento(Long id) {
    BoxDeEstacionamiento box = boxEstacionamientoRepository.findById(id).orElseThrow();
    box.setDisponibilidad(false);
    boxEstacionamientoRepository.save(box);
  }

  @Override
  public void modificarBoxEstacionamiento(BoxDeEstacionamiento boxEstacionamiento) {
    boxEstacionamientoRepository.save(boxEstacionamiento);
  }

  @Override
  public List<BoxDeEstacionamiento> obtenerBoxesDisponibles() {
    List<BoxDeEstacionamiento> boxes = boxEstacionamientoRepository.findAll();
    List<BoxDeEstacionamiento> boxesDisponibles = new ArrayList<>();
    for (BoxDeEstacionamiento box : boxes) {
      if (box.getDisponibilidad() == true) {
        boxesDisponibles.add(box);
      }
    }
    return boxesDisponibles;
  }

  @Override
  public List<BoxDeEstacionamiento> mostrarBoxEstacionamiento() {
    return boxEstacionamientoRepository.findAll();
  }

  @Override
  public BoxDeEstacionamiento obtenerBoxPorId(Long id) {
    return boxEstacionamientoRepository.findById(id).orElseThrow();
  }

  @Override
  public void desocuparBoxEstacionamiento(Long id) {
    BoxDeEstacionamiento box = boxEstacionamientoRepository.findById(id).orElseThrow();
    box.setDisponibilidad(true);
    boxEstacionamientoRepository.save(box);
  }

}

