package br.com.hamburgueria.hamburgueria.dominio;

public class HamburgerVeganoBuilder implements HamburgerBuilder{

    private Hamburger hamburger;
    public HamburgerVeganoBuilder() {

        this.hamburger = new HamburgerVegano();
    }

    @Override
    public void tipoPao(String pao) {

        hamburger.setPao(pao);
    }

    @Override
    public void tipoCarne(String carne) {

        hamburger.setCarne(carne);

    }

    @Override
    public void tipoSlada(String salada) {

        hamburger.setSalada(salada);

    }

    @Override
    public void valor(Double s) {

        hamburger.setValor(s);
    }

    @Override
    public Hamburger getHamburger() {
        return hamburger;
    }
}
