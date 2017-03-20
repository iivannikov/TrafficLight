import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Winner on 20.03.2017.
 */
public class TrafficLightSetUp {
    TrafficLight trafficLight;
    public TrafficLight setUp() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите время работы светофора: ");
        int lTime = Integer.parseInt(reader.readLine());
        System.out.print("Введите время работы зелёного сигнала: ");
        int greenTime = Integer.parseInt(reader.readLine());
        System.out.print("Введите время работы желтого сигнала: ");
        int yellowTime = Integer.parseInt(reader.readLine());
        System.out.print("Введите время работы красного сигнала: ");
        int redTime = Integer.parseInt(reader.readLine());

        trafficLight = new TrafficLight(lTime, greenTime, yellowTime, redTime);
        return trafficLight;
    }
}


