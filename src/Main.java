import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Sensor> listaSensores = new ArrayList<>();
        List<List<Double>> listaTemp = new ArrayList<>();

        for (int i = 0; i <= 3 ; i++) {
            listaSensores.add(new Sensor(String.valueOf(i)));
        }
    }
}
