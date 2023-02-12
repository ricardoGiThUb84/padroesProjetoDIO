package br.com.hamburgueria.hamburgueria.dominio;

import org.springframework.stereotype.Component;

@Component
public interface HamburgerBuilder {

    public void tipoPao(String pao);

    public void tipoCarne(String carne);

    public void tipoSlada(String salada);

    public Hamburger getHamburger();

    void valor(Double valor);
}
