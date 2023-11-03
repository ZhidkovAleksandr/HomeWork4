package Task3;

public class Player implements Playable, Recodable{

    @Override
    public void play() {
        System.out.println("playing");
    }

    @Override
    public void pause() {
        System.out.println("on pause");
    }

    @Override
    public void stop() {
        System.out.println("Stopped");
    }

    @Override
    public void record() {
        System.out.println("recording");
    }
}
