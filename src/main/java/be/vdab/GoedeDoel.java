package be.vdab;

import java.math.BigDecimal;
import java.util.Objects;

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

    @Override
    public boolean equals(Object object) {
        return object instanceof GoedeDoel ander && naam.equalsIgnoreCase(ander.naam);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(naam, opbrengst);
//    }
}

