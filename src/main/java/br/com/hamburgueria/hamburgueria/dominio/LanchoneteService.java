package br.com.hamburgueria.hamburgueria.dominio;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.*;

@Component
public class LanchoneteService {
    Carrinho carrinho;

    public LanchoneteService(Carrinho carrinho) {

        this.carrinho = carrinho;
    }


    public void adiciona(Hamburger hamburger, int quantidade) {

        carrinho.adicionarHamburger(hamburger, quantidade);
    }

    ;

    public Set<Hamburger> listar() {

        return carrinho.getAllHamburger();
    }

    public Map<LocalDate, Double> finalizarCompra() {

        Map<LocalDate, Double> cupom = new HashMap();

        cupom.put(LocalDate.now(), carrinho.valorTotal());


        return cupom;

    }


}