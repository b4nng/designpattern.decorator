public abstract class ScanDecorator implements Scan{
    private Scan scan;
    private String scanInfo;

    public ScanDecorator(Scan scan){this.scan = scan;}

    public Scan getScan() {
        return scan;
    }

    public void setScan(Scan scan) {
        this.scan = scan;
    }

    public void setScanInfo(String scanInfo) {
        this.scanInfo = scanInfo;
    }

    public abstract float getScanTimeSeconds();

    @Override
    public float getScanTime() {
        return this.scan.getScanTime() + getScanTimeSeconds();
    }

    public abstract String getScanInfoSpecific();

    @Override
    public String getScanInfo() {
        return this.scan.getScanInfo() + "/" + getScanInfoSpecific();
    }
}
