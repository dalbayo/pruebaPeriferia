package co.gtcloud.riopaila.service.impl;

import co.gtcloud.riopaila.model.Cargo;
import co.gtcloud.riopaila.repository.CargoRepository;
import co.gtcloud.riopaila.service.ICargoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CargoServiceImpl implements ICargoService {
    private final CargoRepository repository;

    @Override @Transactional(readOnly = true)
    public List<Cargo> findAll() { return repository.findAll(); }
    @Override @Transactional(readOnly = true)
    public Optional<Cargo> findById(Long id) { return repository.findById(id); }
    @Override @Transactional
    public Cargo save(Cargo entity) { return repository.save(entity); }
    @Override @Transactional
    public void deleteById(Long id) { repository.deleteById(id); }
}
