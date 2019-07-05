package org.brazil.generation.gfood.costumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CostumerController {
// ORDEM : TIPO, RETORNO, NOME

    @Autowired
    private CostumerRepository costumerRepository;
    @GetMapping("/Costumers")
    public List<Costumer> findAll() {
        return costumerRepository.findAll();
    }


}
