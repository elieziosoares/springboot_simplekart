package ifrn.eliezio.simplekart.simplekart.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ifrn.eliezio.simplekart.simplekart.domain.Pedido;
import ifrn.eliezio.simplekart.simplekart.repositories.PedidoRepository;
import ifrn.eliezio.simplekart.simplekart.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
    
    @Autowired
    PedidoRepository repo;

    public Pedido buscar(final int id) {
        final Optional<Pedido> cat = repo.findById(id);
        //return cat.orElse(null);
        return cat.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
    }
}
