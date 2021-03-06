package br.com.unialfa.ecommerce;

import br.com.unialfa.ecommerce.cliente.domain.Cliente;
import br.com.unialfa.ecommerce.cliente.repository.ClienteRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class EcommerceApplication {

	@Autowired
	private ClienteRepository clienteRepository;

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}

	@Bean
	InitializingBean sendDatabase() {
		Cliente cliente = new Cliente();
		cliente.setNome("ClienteTeste");
		cliente.setCpf("111.111.111-11");
		cliente.setDataNascimento(LocalDate.now());
		cliente.setVersao(1);
		cliente.setPrimeiroNome("Teste");
		clienteRepository.save(cliente);
		return null;
	}
}
