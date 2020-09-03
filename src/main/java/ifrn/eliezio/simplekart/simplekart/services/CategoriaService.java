package ifrn.eliezio.simplekart.simplekart.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ifrn.eliezio.simplekart.simplekart.domain.Categoria;
import ifrn.eliezio.simplekart.simplekart.repositories.CategoriaRepository;


@Service
public class CategoriaService {
    
    @Autowired
    private CategoriaRepository repo;

    public Categoria buscar(int id){
        Optional<Categoria> cat = repo.findById(id);
        return cat.orElse(null);
    }
}
