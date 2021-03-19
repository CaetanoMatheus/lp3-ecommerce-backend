package br.com.unialfa.ecommerce.pedido.domain;

import br.com.unialfa.ecommerce.cliente.domain.Cliente;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private BigDecimal subtotal;

    @ManyToOne
    private Cliente cliente;

    private LocalDate criacao;
    private LocalDate ultimaEdicao;
    private LocalDate conclusao;
    private BigDecimal total;
    private BigDecimal valorFrete;

    public Pedido() {}

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public LocalDate getCriacao() { return criacao; }

    public void setCriacao(LocalDate criacao) { this.criacao = criacao; }

    public LocalDate getUltimaEdicao() { return ultimaEdicao; }

    public void setUltimaEdicao(LocalDate ultimaEdicao) { this.ultimaEdicao = ultimaEdicao; }

    public LocalDate getConclusao() { return conclusao; }

    public void setConclusao(LocalDate conclusao) { this.conclusao = conclusao; }

    public BigDecimal getSubtotal() { return subtotal; }

    public void setSubtotal(BigDecimal subtotal) { this.subtotal = subtotal; }

    public BigDecimal getTotal() { return total; }

    public void setTotal(BigDecimal total) { this.total = total; }

    public BigDecimal getValorFrete() { return valorFrete; }

    public void setValorFrete(BigDecimal valorFrete) { this.valorFrete = valorFrete; }

    public Cliente getCliente() { return cliente; }

    public void setCliente(Cliente cliente) { this.cliente = cliente; }
}
