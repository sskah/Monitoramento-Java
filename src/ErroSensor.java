public class ErroSensor {
    private String idSensor;
    private String mensagemErro;

    public ErroSensor(String mensagemErro, String idSensor) {
        this.mensagemErro = mensagemErro;
        this.idSensor = idSensor;
    }

    public String getIdSensor() {
        return idSensor;
    }

    public String getMensagemErro() {
        return mensagemErro;
    }

}
