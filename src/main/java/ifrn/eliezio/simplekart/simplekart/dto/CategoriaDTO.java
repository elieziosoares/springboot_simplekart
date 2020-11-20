package ifrn.eliezio.simplekart.simplekart.dto;

import java.io.Serializable;

import ifrn.eliezio.simplekart.simplekart.domain.Categoria;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public @Data class CategoriaDTO implements Serializable{
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nome;

    public CategoriaDTO(Categoria obj){
        this.id = obj.getId();
        this.nome = obj.getNome();
    }

}
