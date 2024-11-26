public class FabricaCampeonato implements FabricaAbstrata {

    @Override
    public Certificado createCertificado() {
        return new CertificadoCampeonato();
    }

    @Override
    public Ingresso createIngresso() {
        return new IngressoCampeonato();
    }
}
