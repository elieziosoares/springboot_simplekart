package ifrn.eliezio.simplekart.simplekart.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public @Data class Categoria implements Serializable{
    private static final long serialVersionUID = 1L;


    private int id;
    private String nome;
}
