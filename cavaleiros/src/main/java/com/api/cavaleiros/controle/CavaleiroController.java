package com.api.cavaleiros.controle;

import com.api.cavaleiros.dominio.Cavaleiro;
import com.api.cavaleiros.repositorio.CavaleiroRepository;
import com.api.cavaleiros.requisicao.CavaleiroNovaForcaRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cavaleiros")
public class CavaleiroController {

    @Autowired
    private CavaleiroRepository repository;

    @PostMapping
    public ResponseEntity cadastrar(@RequestBody Cavaleiro novoCavaleiro){
        repository.save(novoCavaleiro);

        return ResponseEntity.status(201).build();

    }

    @GetMapping
    public ResponseEntity getCavaleiros() {

        List<Cavaleiro> cavaleiros = repository.findAll();

        if (cavaleiros.isEmpty()) {
            return ResponseEntity.status(204).build();
        }
        else {
            return ResponseEntity.status(200).body(cavaleiros);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity getCavaleiro(@PathVariable int id){

        //List<Cavaleiro> cavaleiro = repository.findAll();

        return ResponseEntity.of(repository.findById(id));
        //return ResponseEntity.status(200).body(cavaleiro);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteCavaleiro(@PathVariable int id){

        if(repository.existsById(id)){
            repository.deleteById(id);

            return ResponseEntity.status(200).build();

        } else

            return ResponseEntity.status(404).build();

    }

    @PutMapping("/{id}")
    public ResponseEntity putCavaleiro(@PathVariable int id,
                                       @RequestBody Cavaleiro cavaleiroAtualizado){
        if(repository.existsById(id)) {

            cavaleiroAtualizado.setId(id);
            repository.save(cavaleiroAtualizado);

            return ResponseEntity.status(200).build();
        }
        else
            return ResponseEntity.status(404).build();
    }

    @PatchMapping("/atualizar-forca")
    public void atualizarForca(@RequestBody CavaleiroNovaForcaRequest request) {

        repository.atualizarForca(request.getForcaAtualizada(), request.getId());
    }
}
