import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class EleitorTest {

    @ParameterizedTest
    @DisplayName("Situação esperada pela idade")
    @CsvSource({
            "15, Proibido votar",
            "16, Voto facultativo",
            "17, Voto facultativo",
            "18, Voto obrigatório",
            "19, Voto obrigatório",
            "69, Voto obrigatório",
            "70, Voto facultativo",
            "71, Voto facultativo",
    })
    void CT01(int idade, String situacaoEsperada) {
        Assertions.assertEquals(situacaoEsperada, new Eleitor("Fulano", idade).getSituacao());
    }
}
