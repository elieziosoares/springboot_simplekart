package ifrn.eliezio.simplekart.simplekart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ifrn.eliezio.simplekart.simplekart.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    
}

