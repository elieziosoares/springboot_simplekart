package ifrn.eliezio.simplekart.simplekart.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ifrn.eliezio.simplekart.simplekart.domain.Estado;
import ifrn.eliezio.simplekart.simplekart.repositories.EstadoRepository;

@Service
public class EstadoService {
    
    @Autowired
    EstadoRepository repo;

    public Estado buscar(Integer id){
        Optional<Estado> cat = repo.findById(id);
        return cat.orElse(null);
    }
}
