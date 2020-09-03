package ifrn.eliezio.simplekart.simplekart.repositories;

import org.springframework.stereotype.Repository;

import ifrn.eliezio.simplekart.simplekart.domain.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
    
}
