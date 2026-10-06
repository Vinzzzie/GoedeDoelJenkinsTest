package be.vdab;

import java.math.BigDecimal;

class GoedeDoel {
    private final String naam;
    private BigDecimal opbrengst;

    public  GoedeDoel(String naam) {
        this.naam = naam;
    }

    String getNaam() {
        return naam;
    }

    BigDecimal getOpbrengst() {
        return opbrengst;
    }

    void setOpbrengst(BigDecimal opbrengst) {
        this.opbrengst = opbrengst;
    }
}

