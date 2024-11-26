public class FabricaFesta implements FabricaAbstrata {

    @Override
    public Certificado createCertificado() {
        return new CertificadoFesta();
    }

    @Override
    public Ingresso createIngresso() {
        return new IngressoFesta();
    }
}
