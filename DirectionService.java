public class DirectionService {
    private ITravelMode travelMode;


    public Object getEta() {
        return travelMode.calcETA();
    }

    public Object getDirection() {
        return travelMode.calcDirection();
    }

    public ITravelMode getTravelMode() {
        return travelMode;
    }

    public void setTravelMode(ITravelMode travelMode) {
        this.travelMode = travelMode;
    }
}