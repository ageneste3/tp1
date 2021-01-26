package question3;

public class Phone extends Device implements MobileNetwork {
    private int batteryLevel;

    public Phone() {
    }

    public Phone(int width, int height) {
        this.setWidth(width);
        this.setHeight(height);
    }

    public Phone(String operatingSystem) {
        this.setOperatingSystem(operatingSystem);
    }

    public boolean isTactile() {
        return true;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public String getNetworkType() { return networkType; }

    public void setNetworkType(String networkType) { this.networkType = networkType; }

    @Override
    public String networkType() {
    }

}
