public class Walking implements ITravelMode{
    @Override
    public int calcETA() {
        System.out.println("Calculating ETA (walking)");
        return 4;
    }

    @Override
    public int calcDirection() {
        System.out.println("Calculating Direction (walking)");
        return 4;
    }
}
