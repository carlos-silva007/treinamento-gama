package br.itau.spring01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.itau.spring01.model.Client;
import br.itau.spring01.repository.ClientRepo;

@RestController
@CrossOrigin("*")
@RequestMapping("/client") // quais os dados q estou trabalhando

public class ClientController {

    @Autowired // injeção de dependencia = cria classe, escreve objetos, e cria um objeto p uso
    private ClientRepo repo;

    @GetMapping("/all") // rota/path seria o caminho que leva pra esse metodo
    public List<Client> listarTodos() {
        List<Client> list = (List<Client>) repo.findAll(); // findall retorna todos itens no BD
        return list;
    }

    @GetMapping("/list") // rota/path seria o caminho que leva pra esse metodo PAGINADO
    public Page<Client> listarTodosPaginado(Pageable pageable) {
        Page<Client> list = repo.findAll(pageable); // findall retorna todos itens no BD
        return list;
    }

    @GetMapping("/{codigo}") // chaves indica uma variavel
    public ResponseEntity<Client> buscarCliente(@PathVariable long codigo) {
        // buscar um cliente e se nao encontrat retorna nulo
        Client clienteEncontrado = repo.findById(codigo).orElse(null);

        if (clienteEncontrado != null) { // achou o cliente no BD
            return ResponseEntity.ok(clienteEncontrado); // retorna o cliente com status 200 ok

        }
        return ResponseEntity.notFound().build(); // retorna status 404 sem corpo (cliente)

    }

    @PostMapping
    public ResponseEntity<Client> inserirCliente(@RequestBody Client cliente) {
        Client novoCliente = repo.save(cliente);
        return ResponseEntity.ok(novoCliente);
    }

    @PutMapping // atualizar
    public ResponseEntity<Client> atualizarCliente(@RequestBody Client cliente) {
        if (cliente.getCod() > 0) {
            Client novoCliente = repo.save(cliente);
            return ResponseEntity.ok(novoCliente);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{codigo}")
    public ResponseEntity<Void> apagarCliente(@PathVariable long codigo) {
        // antes de apagar, verificar se este cliente existe
        Client clienteEncontrado = repo.findById(codigo).orElse(null);
        if (clienteEncontrado != null) { // achou cliente no BD,
            try {
                repo.deleteById(codigo);
                return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

            } catch (Exception e) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            }
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/email")
    public ResponseEntity<Client> buscarPorEmail(@RequestBody Client cliente) {
        Client clienteEncontrado = repo.findByEmail(cliente.getEmail());
        if (clienteEncontrado != null) {
            return ResponseEntity.ok(clienteEncontrado);
        }
        return ResponseEntity.notFound().build();
    }

    // pra ver no chrome >>http://localhost:8080/client/all -pra ver todos
    // http://localhost:8080/client/8 -> no final informa o codigo q deseja ver do
    // cliente
}
