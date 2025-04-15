package ar.edu.unju.fi.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.model.Automovil;
import ar.edu.unju.fi.model.BoxDeEstacionamiento;
import ar.edu.unju.fi.model.UsoBox;
import ar.edu.unju.fi.repository.AutomovilRepository;
import ar.edu.unju.fi.repository.UsoBoxRepository;
import ar.edu.unju.fi.service.IBoxEstacionamientoService;
import ar.edu.unju.fi.service.IUsoBoxService;

@Service
public class IUsoBoxServiceImp implements IUsoBoxService {
  @Autowired
  AutomovilRepository automovilRepo;
  @Autowired
  IBoxEstacionamientoService boxService;
  @Autowired
  UsoBoxRepository usoBoxRepo;

  @Override
  public void ocuparBox(Long boxId, Long autoId, int horas) {
    Automovil auto = automovilRepo.findById(autoId).orElseThrow();
    BoxDeEstacionamiento box = boxService.obtenerBoxPorId(boxId);
    boxService.ocuparBoxEstacionamiento(boxId);
    double costo = calcularCosto(box.getZona(), horas);
    UsoBox uso = new UsoBox();
    uso.setAutomovil(auto);
    uso.setBox(box);
    uso.setCantidadHoras(horas);
    uso.setCostoPagado(costo);
    usoBoxRepo.save(uso);
  }

  @Override
  public double calcularCosto(int zona, int horas) {
    double costo = 0;
    if (zona == 1) {
      costo = horas * 500;
    } else {
      costo = horas * 300;
    }
    return costo;
  }

  @Override
  public List<UsoBox> obternerBoxes() {
    return usoBoxRepo.findAll();
  }

}

