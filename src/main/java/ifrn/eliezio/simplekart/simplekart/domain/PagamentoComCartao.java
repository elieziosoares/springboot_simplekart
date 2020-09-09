package ifrn.eliezio.simplekart.simplekart.domain;

import javax.persistence.Entity;

import ifrn.eliezio.simplekart.simplekart.domain.enums.EstadoPagamento;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public @Data class PagamentoComCartao extends Pagamento {
    private static final long serialVersionUID = 1L;

    private Integer numeroParcelas;

    public PagamentoComCartao(EstadoPagamento estado, Pedido pedido,Integer numeroParcelas) {
        super(estado, pedido);
        this.numeroParcelas = numeroParcelas;
    }

    
}
