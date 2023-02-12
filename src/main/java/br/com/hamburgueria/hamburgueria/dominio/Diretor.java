package br.com.hamburgueria.hamburgueria.dominio;

import org.springframework.stereotype.Component;

@Component
public class Diretor {


    public Hamburger hamburgerCarneRosbifeCeaser(HamburgerBuilder builder) {

        builder.tipoPao("Integral");
        builder.tipoSlada("CAESAR");
        builder.tipoCarne("Rosbife");
        builder.valor(15.00D);

        return builder.getHamburger();
    }

    public Hamburger hamburgerCarnePicanhaGrega(HamburgerBuilder builder) {

        builder.tipoPao("Gergelin");
        builder.tipoSlada("GREGA");
        builder.tipoCarne("Picanha");
        builder.valor(18.00D);

        return builder.getHamburger();
    }

    public Hamburger hamburgerVeganoSoja(HamburgerBuilder builder) {

        builder.tipoPao("Gergelin");
        builder.tipoSlada("GREGA");
        builder.tipoCarne("Soja");
        builder.valor(25.00D);

        return builder.getHamburger();
    }


}
