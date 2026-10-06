package be.vdab;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Een <strong>goed doel</strong> waarvoor men geld inzamelt
 * @author vince
 * */
class GoedeDoel {
    private final String naam;
    private BigDecimal opbrengst;

    /**
     * Maak een goed doel aan met een naam
     * @param naam: De naam van het goede doel
     * */
    public  GoedeDoel(String naam) {
        this.naam = naam;
    }

    /**
     * Haal de naam op van het goede doel
     * @return naam
     * */
    String getNaam() {
        return naam;
    }
    /**
     * Zet de opbrengst van het goede doel
     * @param opbrengst: Wat het goede doel heeft opgebracht
     * */
    void setOpbrengst(BigDecimal opbrengst) {
        this.opbrengst = opbrengst;
    }

    /**
     * Haal de opbrangst van het goede doel op
     * @return opbrengst
     * */
    BigDecimal getOpbrengst() {
        return opbrengst;
    }

    /**
     * @param object   the reference object with which to compare.
     * @return true when equal, false when not equal
     */
    @Override
    public boolean equals(Object object) {
        return object instanceof GoedeDoel ander && naam.equalsIgnoreCase(ander.naam);
    }

    /**
     * De hashcode van het object
     * @return hashcode as integer
     */
    @Override
    public int hashCode() {
        return Objects.hash(naam, opbrengst);
    }
}

