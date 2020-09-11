package ifrn.eliezio.simplekart.simplekart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ifrn.eliezio.simplekart.simplekart.domain.ItemPedido;
import ifrn.eliezio.simplekart.simplekart.domain.ItemPedidoPK;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido,ItemPedidoPK>{
    
}
