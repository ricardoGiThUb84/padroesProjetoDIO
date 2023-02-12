package br.com.hamburgueria.hamburgueria.Lanchonete;

import br.com.hamburgueria.hamburgueria.dominio.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/lanchonete")
public class LanchoneteRest {

    @Autowired
    Diretor diretor;
    @Autowired
    CarrinhoHamburger carrinho;

    @Autowired
    LanchoneteService lanchoneteService;

    HamburgerBuilder hamburgerBuilder = new HamburgerCarneBuilder();
    HamburgerBuilder hamburgerVeganoBuilder = new HamburgerVeganoBuilder();


    @PostMapping("/carrinho/carne")
    public void salvarHamburger(@RequestBody DadosCompra dadosCompra) {

        final Hamburger hamburger = diretor.hamburgerCarnePicanhaGrega(hamburgerBuilder);
        lanchoneteService.adiciona(hamburger, Integer.parseInt(String.valueOf(dadosCompra.quantidade())));

    }

    @PostMapping("/carrinho/vegano")
    public void salvarHamburgerVegano(@RequestBody DadosCompra dadosCompra) {

        final Hamburger hamburger = diretor.hamburgerVeganoSoja(hamburgerVeganoBuilder);
        lanchoneteService.adiciona(hamburger, Integer.parseInt(String.valueOf(dadosCompra.quantidade())));

    }

    @GetMapping("/carrinho/listar")
    public Set<Hamburger> salvarHamburger() {

        return lanchoneteService.listar();

    }

    @GetMapping("/carrinho/finalizar")
    public Map<LocalDate, Double> finalizar() {

        return lanchoneteService.finalizarCompra();

    }
}
