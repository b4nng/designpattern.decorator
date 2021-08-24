import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testScan {
    @Test
    public void deveRetornarTempoBasico(){
        Scan scan = new ScanBasic();
        Assertions.assertEquals(120.0f, scan.getScanTime());
    }
    @Test
    public void deveRetornarInfoDoBasico(){
        Scan scan = new ScanBasic();
        Assertions.assertEquals("Basic Scan", scan.getScanInfo());
    }
    @Test
    public void deveRetornarTempoHeuristicoBasico(){
        Scan scan = new ScanHeuristic(new ScanBasic());
        Assertions.assertEquals(420.0f, scan.getScanTime());
    }
    @Test
    public void deveRetornarInfoHeuristicoBasico(){
        Scan scan = new ScanHeuristic(new ScanBasic());
        Assertions.assertEquals("Basic Scan/Heuristic Scan", scan.getScanInfo());
    }
    @Test
    public void deveRetornarTempoRegisterHeuristicoBasico(){
        Scan scan = new ScanRegister(new ScanHeuristic(new ScanBasic()));
        Assertions.assertEquals(720.0f, scan.getScanTime());
    }
    @Test
    public void deveRetornarInfoRegisterHeuristicoBasico(){
        Scan scan = new ScanRegister(new ScanHeuristic(new ScanBasic()));
        Assertions.assertEquals("Basic Scan/Heuristic Scan/Registry Scan", scan.getScanInfo());
    }
    @Test
    public void deveRetornarTempoCompleteRegisterHeuristicoBasico(){
        Scan scan = new ScanComplete(new ScanRegister(new ScanHeuristic(new ScanBasic())));
        Assertions.assertEquals(4320.0f, scan.getScanTime());
    }
    @Test
    public void deveRetornarInfoCompleteRegisterHeuristicoBasico(){
        Scan scan = new ScanComplete(new ScanRegister(new ScanHeuristic(new ScanBasic())));
        Assertions.assertEquals("Basic Scan/Heuristic Scan/Registry Scan/Complete Scan", scan.getScanInfo());
    }
}
