public class Transit implements ITravelMode{
    @Override
    public int calcETA() {
        System.out.println("Calculating ETA (transit)");
        return 3;
    }

    @Override
    public int calcDirection() {
        System.out.println("Calculating Direction (transit)");
        return 3;    }
}
