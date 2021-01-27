package question3;

public class Phone extends Device implements MobileNetwork {
    private int batteryLevel;
    private String networkType;

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

    @Override
    public String getNetworkType() {
        return networkType;
    }

    @Override
    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    @Override
    public String networkType() {
        MobileNetwork mobileNetwork = new Phone();
        mobileNetwork.setNetworkType("4G");

        return mobileNetwork.getNetworkType();
    }
}
