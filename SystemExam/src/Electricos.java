public class Electricos extends Vehiculos {

    private boolean fastCharge;

    private double autonomy;

    private double batteryCharge;

    public double batteryCharge() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean fastCharge() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public Electricos( boolean fastCharge, double autonomy, double batterCharge){
        this.fastCharge = fastCharge;
        this.autonomy = autonomy;
        this.batteryCharge = batteryCharge; 
        
    }
}
