public class Camera {
	private double fstop; 
	private double shutterspeed;
	private double batterylife;


    public double getFstop() {
        return fstop;
    }

    public double getShutterspeed() {
        return shutterspeed;
    }

    public double getBatterylife() {
        return batterylife;
    }

    public void setBatterylife(double batterylife) {
        this.batterylife = batterylife;
    }

    public void setFstop(double fstop) {
        this.fstop = fstop;
    }

    public void setShutterspeed(double shutterspeed) {
        this.shutterspeed = shutterspeed;
    }
}
