package ifrn.eliezio.simplekart.simplekart.repositories;

import org.springframework.stereotype.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import ifrn.eliezio.simplekart.simplekart.domain.Pagamento;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento,Integer>{
    
}

