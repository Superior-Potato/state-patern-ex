public class Bicycling implements ITravelMode{
    @Override
    public int calcETA() {
        System.out.println("Calculating ETA (bicycling)");
        return 2;
    }

    @Override
    public int calcDirection() {
        System.out.println("Calculating Direction (bicycling)");
        return 2;    }
}
