package co.gtcloud.riopaila.service.impl;

import co.gtcloud.riopaila.model.TurnoReal;
import co.gtcloud.riopaila.repository.TurnoRealRepository;
import co.gtcloud.riopaila.service.ITurnoRealService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TurnoRealServiceImpl implements ITurnoRealService {
    private final TurnoRealRepository repository;

    @Override @Transactional(readOnly = true)
    public List<TurnoReal> findAll() { return repository.findAll(); }
    @Override @Transactional(readOnly = true)
    public Optional<TurnoReal> findById(Long id) { return repository.findById(id); }
    @Override @Transactional
    public TurnoReal save(TurnoReal entity) { return repository.save(entity); }
    @Override @Transactional
    public void deleteById(Long id) { repository.deleteById(id); }
}
