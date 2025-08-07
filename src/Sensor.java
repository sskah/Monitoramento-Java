import java.util.ArrayList;
import java.util.List;

public class Sensor {
    private String id;
    private List<Double> leituras;

    public Sensor(String id) {
        this.id = id;
        this.leituras = new ArrayList<>();
    }

    public List<Double> getLeituras() {
        return leituras;
    }

    public void registrarLeituras(List<Double> lista) throws LeituraInvalidaException {
        if(lista.size() != 100){
            throw new IllegalArgumentException("É obrigatório ter 100 leituras");
        }

        for (int i = 0; i < lista.size() ; i++) {
            double temp = lista.get(i);

            if(temp < -60 || temp > 60){
                throw new LeituraInvalidaException(i, temp);
            }
        }
        this.leituras = lista;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "id='" + id + '\'' +
                ", leituras=" + leituras +
                '}';
    }
}
