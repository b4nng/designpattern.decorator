public class ScanHeuristic extends ScanDecorator{
    public ScanHeuristic(Scan scan) {
        super(scan);
    }

    @Override
    public float getScanTimeSeconds() {
        return 300.0f;
    }

    @Override
    public String getScanInfoSpecific() {
        return "Heuristic Scan";
    }
}
