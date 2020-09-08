package ifrn.eliezio.simplekart.simplekart.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ifrn.eliezio.simplekart.simplekart.domain.Cliente;
import ifrn.eliezio.simplekart.simplekart.repositories.ClienteRepository;
import ifrn.eliezio.simplekart.simplekart.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
    
    @Autowired
    ClienteRepository repo;

    public Cliente buscar(final int id) {
        final Optional<Cliente> cat = repo.findById(id);
        //return cat.orElse(null);
        return cat.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
    }
}
