package crudapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import crudapi.exception.NotFound;
import crudapi.model.Cliente;
import crudapi.repository.ClienteRepository;

@RestController
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;

	// método que retorna todos os clientes
	@GetMapping("/api/clientes/list")
	public List<Cliente> getClientes() {
		return this.clienteRepository.findAll();
	}

	// metódo que retorna o cliente por meio de um id
	@GetMapping("/api/clientes/search/{id}")
	public Cliente getClienteById(@PathVariable(value = "id") Integer id) {
		return this.clienteRepository.findById(id).orElseThrow(() -> new NotFound("Usuário Não Encontrado"));
	}

	// método para inserir um cliente
	@PostMapping("/api/clientes/insert")
	public Cliente insertCliente(@RequestBody Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}

	// método para atualizar um cliente
	@PutMapping("/api/clientes/update/{id}")
	public Cliente updateCliente(@RequestBody Cliente cliente, @PathVariable("id") Integer id) {
		Cliente existing = this.clienteRepository.findById(id)
				.orElseThrow(() -> new NotFound("Usuário Não Encontrado"));
		
		existing.setNome(cliente.getNome());
		existing.setCpf(cliente.getCpf());
		existing.setEmail(cliente.getEmail());
		existing.setTelefone(cliente.getTelefone());

		return this.clienteRepository.save(existing);

	} 
	
	// método para deletar um cliente
	@DeleteMapping("/api/clientes/delete/{id}")
	public ResponseEntity<Cliente> deleteCliente(@PathVariable("id") Integer id) {

		Cliente existing = this.clienteRepository.findById(id)
				.orElseThrow(() -> new NotFound("Usuário Não Encontrado"));

		this.clienteRepository.delete(existing);
		return ResponseEntity.ok().build();

	}
	
	

}
