package be.vdab;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class GoedeDoelTest {
    private static final String GOEDE_DOEL_NAAM = "DamiaanActie";
    private GoedeDoel goedeDoel;

    @BeforeEach
    void setUp() {
        this.goedeDoel = new GoedeDoel(GOEDE_DOEL_NAAM);
//        this.goedeDoel.setOpbrengst(BigDecimal.ZERO);
    }

    @Test
    void getNaam() {
        assertThat(goedeDoel.getNaam()).isEqualTo(GOEDE_DOEL_NAAM);
    }

    @Test
    void getOpbrengst() {
        assertThat(goedeDoel.getOpbrengst()).isEqualTo(BigDecimal.ZERO);
    }

    @Test
    void setOpbrengst() {
        goedeDoel.setOpbrengst(BigDecimal.ONE);
        assertThat(goedeDoel.getOpbrengst()).isEqualTo(BigDecimal.ONE);
    }
}