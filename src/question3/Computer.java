package question3;

public class Computer extends Device implements Ethernet {
    private int ramSlot;
    private String videoCardname;
    private boolean isCableConnected;

    public int getRamSlot() {
        return ramSlot;
    }

    public void setRamSlot(int ramSlot) {
        this.ramSlot = ramSlot;
    }

    public String getVideoCardname() {
        return videoCardname;
    }

    public void setVideoCardname(String videoCardname) {
        this.videoCardname = videoCardname;
    }

    @Override
    public boolean isCableConnected() { return isCableConnected; }

    @Override
    public void setCableConnected(boolean cableConnected) { isCableConnected = cableConnected; }

    @Override
    public boolean cableConnected() {
        Ethernet ethernet = new Computer();
        ethernet.setCableConnected(true);

        return ethernet.isCableConnected();
    }
}
