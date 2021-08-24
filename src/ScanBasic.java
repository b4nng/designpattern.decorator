public class ScanBasic implements Scan{
    float scanTimeSeconds;

    public ScanBasic(){
        this.scanTimeSeconds = 120.0f;
    };
    @Override
    public float getScanTime() {
        return this.scanTimeSeconds;
    }

    @Override
    public String getScanInfo() {
        return "Basic Scan";
    }
}
