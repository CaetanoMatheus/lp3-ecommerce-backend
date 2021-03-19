package br.com.unialfa.ecommerce.pedido.repository;

import br.com.unialfa.ecommerce.pedido.domain.Pedido;
import org.springframework.data.repository.CrudRepository;

public interface PedidoRepository extends CrudRepository<Pedido, Long> {}
