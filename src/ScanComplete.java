public class ScanComplete extends ScanDecorator{
    public ScanComplete(Scan scan) {
        super(scan);
    }

    @Override
    public float getScanTimeSeconds() {
        return 3600.0f;
    }

    @Override
    public String getScanInfoSpecific() {
        return "Complete Scan";
    }
}
