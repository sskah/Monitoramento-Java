import java.util.ArrayList;
import java.util.List;

public class SistemaMonitoramento {
    private List<Sensor> sensoresValidos;
    private List<ErroSensor> sensoresInvalidos;

    public SistemaMonitoramento(List<Sensor> sensoresValidos, List<ErroSensor> sensoresInvalidos) {
        this.sensoresValidos = new ArrayList<>();
        this.sensoresInvalidos = new ArrayList<>();
    }

    public void exibirRelatorio(){
        System.out.println("===== Sensores Válidos =====");
        for(Sensor sensor : sensoresValidos) {
            System.out.println("Sensor: " + sensor.getId());
        }

        System.out.println("===== Sensores Com Erro =====");
        for(ErroSensor sensor : sensoresInvalidos) {
            System.out.println("Sensor: " + sensor.getIdSensor());
            System.out.println("Sensor: " + sensor.getMensagemErro());
        }
    }

    public void processarSensores(List<Sensor> listaSensor, List<List<Double>> listaLeituras ){
        for (int i = 0; i < listaSensor.size(); i++) {
            Sensor sensor = listaSensor.get(i);
            List<Double> lista = listaLeituras.get(i);

            try {
                sensor.registrarLeituras(lista);
                sensoresValidos.add(sensor);
            }
            // multicast
            catch (LeituraInvalidaException | IllegalArgumentException e){
                sensoresInvalidos.add(new ErroSensor(e.getMessage(), sensor.getId()));
            }
        }
    }
}
