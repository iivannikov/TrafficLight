/**
 * Created by Winner on 20.03.2017.
 */
public class TrafficLight extends Thread {
    public final int time = 1; //При значении = 60 аймер будет считать минуты
    public int lightningTime;
    public int greenLightningTime;
    public int yellowLightningTime;
    public int redLightningTime;

    enum Lights {Green, Yellow, Red}

    TrafficLight(int lTime, int greenTime, int yellowTime, int redTime) {
        this.lightningTime = lTime;
        this.greenLightningTime = greenTime;
        this.yellowLightningTime = yellowTime;
        this.redLightningTime = redTime;
    }

    @Override
    public void run() {
        try {
            System.out.println();
            System.out.println(Lights.Green);
            sleep(1000 * greenLightningTime * time);

            System.out.println(Lights.Yellow);
            sleep(1000 * yellowLightningTime * time);

            System.out.println(Lights.Red);
            sleep(1000 * redLightningTime * time);
        } catch (InterruptedException e) {
            System.out.println();
            System.out.println("Светофор выключен!");
        }
    }
}
