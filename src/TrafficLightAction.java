import java.io.IOException;

/**
 * Created by Winner on 21.03.2017.
 */
public class TrafficLightAction {
    public void startTrafficight() throws IOException, InterruptedException {
        TrafficLight trafficLight = new TrafficLightSetUp().setUp();
        Thread trafficLightLife = new Thread();
        trafficLightLife.start();
        trafficLight.start();
        trafficLightLife.sleep(1000 * trafficLight.lightningTime * trafficLight.time);
        trafficLight.interrupt();
        trafficLightLife.interrupt();
    }
}
