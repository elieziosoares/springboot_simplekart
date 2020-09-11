package ifrn.eliezio.simplekart.simplekart.domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public @Data class ItemPedido implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @EmbeddedId
    private ItemPedidoPK id = new ItemPedidoPK();

    private Double desconto;
    private Integer quantidade;
    private Double preco;

    public ItemPedido(Pedido pedido, Produto produto, Double desconto, Integer quantidade, Double preco) {
        super();
        this.id.setPedido(pedido);
        this.id.setProduto(produto);
        this.desconto = desconto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Pedido getPedido() {
        return this.id.getPedido();
    }

    public Produto getProduto() {
        return this.id.getProduto();
    }

}