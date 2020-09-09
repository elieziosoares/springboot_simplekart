package ifrn.eliezio.simplekart.simplekart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ifrn.eliezio.simplekart.simplekart.domain.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido,Integer>{
    
}
