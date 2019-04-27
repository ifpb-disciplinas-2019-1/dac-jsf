package br.edu.ifpb.domain;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 26/04/2019, 08:25:16
 */
public class CPF {

    //12312312312
    private final String numero;

    public CPF(String numero) {
        this.numero = numero;
    }

    public String valor() {
        return this.numero;
    }

    public String formatado() {
        return String.format(
            "%s.%s.%s-%s",
            this.numero.substring(0,3), // 111222
            this.numero.substring(3,6),
            this.numero.substring(6,9),
            this.numero.substring(9,11)
        );
    }

    public boolean naoValido() {
        return (11 != this.numero.length());
    }

    public CPF() {
        this.numero = "";
    }

}
