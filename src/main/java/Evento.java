public class Evento {

    private Certificado certificado;
    private Ingresso ingresso;

    public Evento(FabricaAbstrata fabrica) {
        this.certificado = fabrica.createCertificado();
        this.ingresso = fabrica.createIngresso();
    }

    public String emitirCertificado() {
        return this.certificado.emitir();
    }

    public String emitirIngresso() {
        return this.ingresso.emitir();
    }
}