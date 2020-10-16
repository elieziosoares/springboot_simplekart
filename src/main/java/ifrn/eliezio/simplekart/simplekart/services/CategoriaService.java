package ifrn.eliezio.simplekart.simplekart.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import ifrn.eliezio.simplekart.simplekart.domain.Categoria;
import ifrn.eliezio.simplekart.simplekart.repositories.CategoriaRepository;
import ifrn.eliezio.simplekart.simplekart.services.exceptions.DataIntegrityException;
import ifrn.eliezio.simplekart.simplekart.services.exceptions.ObjectNotFoundException;


@Service
public class CategoriaService {
    
    @Autowired
    private CategoriaRepository repo;

    public Categoria find(final int id) {
        final Optional<Categoria> cat = repo.findById(id);
        //return cat.orElse(null);
        return cat.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }

	public Categoria insert(Categoria obj) {
        obj.setId(null);
        return repo.save(obj);
	}

	public Categoria update(Categoria obj) {
        find(obj.getId());
        return repo.save(obj);
    }

	public void delete(Integer id) {
        find(id);
        try{
            repo.deleteById(id);
        }
        catch(DataIntegrityViolationException e){
                throw new DataIntegrityException("Não é possível excluir uma categoria que possui produtos (integridade referencial). Id: "+id);
        }
        
	}
}
