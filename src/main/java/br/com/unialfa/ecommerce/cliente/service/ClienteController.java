package br.com.unialfa.ecommerce.cliente.service;

import br.com.unialfa.ecommerce.cliente.domain.Cliente;
import br.com.unialfa.ecommerce.cliente.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Cliente> listarCliente() {
        return clienteRepository.findAll();
    }

    @PostMapping()
    public void cadastrarCliente(@RequestBody Cliente cliente) { clienteRepository.save(cliente); }

    @PutMapping()
    public void editarCliente(@RequestBody Cliente cliente) { clienteRepository.save(cliente); }

    @DeleteMapping(value = "/{id}")
    public @ResponseBody void deletarCliente(@PathVariable(name = "id") long id) { clienteRepository.deleteById(id); }
}
