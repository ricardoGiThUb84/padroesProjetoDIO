package br.com.hamburgueria.hamburgueria.dominio;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
@Component
public class CarrinhoHamburger implements Carrinho {

    private Map<Hamburger, Integer> lista;

    public CarrinhoHamburger() {

        this.lista = new HashMap<>();
    }

    @Override
    public Double valorTotal() {

        final List<Hamburger> hamburgers = lista.keySet().stream().toList();
        final List<Integer> integers = lista.values().stream().toList();

        Double total = 0.0;

        for (int i = 0; i < hamburgers.size(); i++) {

            total += hamburgers.get(i).getValor() * integers.get(i);

        }

        return total;
    }

    @Override
    public void adicionarHamburger(Hamburger hamburger, int quantidade) {

        lista.put(hamburger, quantidade);

    }

    @Override
    public Set<Hamburger> getAllHamburger() {
        return lista.keySet();
    }


}