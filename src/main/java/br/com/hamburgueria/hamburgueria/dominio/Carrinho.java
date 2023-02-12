package br.com.hamburgueria.hamburgueria.dominio;

import java.util.Set;

public interface Carrinho {

    void adicionarHamburger(Hamburger hamburger, int quantidade);

    Set<Hamburger> getAllHamburger();

    Double valorTotal();


}