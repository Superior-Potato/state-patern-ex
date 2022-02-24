public class Driving implements ITravelMode{
    @Override
    public int calcETA() {
        System.out.println("Calculating ETA (driving)");
        return 1;
    }

    @Override
    public int calcDirection() {
        System.out.println("Calculating Direction (driving)");
        return 1;
    }
}
