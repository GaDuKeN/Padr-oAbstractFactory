import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EventoTest {

    @Test
    void deveEmitirCertificadoFesta() {
        FabricaAbstrata fabrica = new FabricaFesta();
        Evento evento = new Evento(fabrica);
        assertEquals("Certificado de Participação na Festa", evento.emitirCertificado());
    }

    @Test
    void deveEmitirCertificadoCampeonato() {
        FabricaAbstrata fabrica = new FabricaCampeonato();
        Evento evento = new Evento(fabrica);
        assertEquals("Certificado de Vencedor do Campeonato", evento.emitirCertificado());
    }

    @Test
    void deveEmitirIngressoFesta() {
        FabricaAbstrata fabrica = new FabricaFesta();
        Evento evento = new Evento(fabrica);
        assertEquals("Ingresso para a Festa", evento.emitirIngresso());
    }

    @Test
    void deveEmitirIngressoCampeonato() {
        FabricaAbstrata fabrica = new FabricaCampeonato();
        Evento evento = new Evento(fabrica);
        assertEquals("Ingresso para o Campeonato", evento.emitirIngresso());
    }
}
