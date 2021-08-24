public class ScanRegister extends ScanDecorator{
    public ScanRegister(Scan scan) {
        super(scan);
    }

    @Override
    public float getScanTimeSeconds() {
        return 300.0f;
    }

    @Override
    public String getScanInfoSpecific() {
        return "Registry Scan";
    }
}
