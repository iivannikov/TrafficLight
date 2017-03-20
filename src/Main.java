import java.io.IOException;

/**
 * Created by Winner on 20.03.2017.
 */
public class Main {

    public static void main(String[] args) {
        try {
            new TrafficLightAction().startTrafficight();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
