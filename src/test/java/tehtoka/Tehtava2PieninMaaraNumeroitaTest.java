package tehtoka;

import org.junit.Assert;
import org.junit.Test;


public class Tehtava2PieninMaaraNumeroitaTest {

    @Test
    public void testSuurenevaJarjestys() {
        TokaTehtNumerot tokaTehtNumerot = new TokaTehtNumerot();
        int [] taulukko = {1,4,10};
        int maara = tokaTehtNumerot.etsiMinHyppy(taulukko);

        Assert.assertSame(2, maara);
        Assert.assertNotSame(0,maara);

    }

    @Test
    public void testlaskevaJarjestys() {
        TokaTehtNumerot tokaTehtNumerot = new TokaTehtNumerot();
        int [] taulukko = {35,20,10,4,1};
        int maara = tokaTehtNumerot.etsiMinHyppy(taulukko);

        Assert.assertSame(2, maara);
        Assert.assertNotSame(0,maara);

    }

    @Test
    public void testSekaJarjestys() {
        TokaTehtNumerot tokaTehtNumerot = new TokaTehtNumerot();
        int [] taulukko = {4,10,1,20,27,50};
        int maara = tokaTehtNumerot.etsiMinHyppy(taulukko);

        Assert.assertSame(5, maara);
        Assert.assertNotSame(0,maara);

    }

    @Test
    public void testsSamatNumerot() {
        TokaTehtNumerot tokaTehtNumerot = new TokaTehtNumerot();
        int [] taulukko = {1,1,4,4,10,16,25};
        int maara = tokaTehtNumerot.etsiMinHyppy(taulukko);

        Assert.assertSame(2, maara);
        Assert.assertNotSame(0,maara);
    }

    @Test
    public void testSamaVali() {
        TokaTehtNumerot tokaTehtNumerot = new TokaTehtNumerot();
        int [] taulukko = {1,3,5,7,11,16};
        int maara = tokaTehtNumerot.etsiMinHyppy(taulukko);

        Assert.assertSame(1, maara);
        Assert.assertNotSame(0,maara);

    }

    @Test
    public void testEiValeja() {
        TokaTehtNumerot tokaTehtNumerot = new TokaTehtNumerot();
        int [] taulukko = {0,1};
        int maara = tokaTehtNumerot.etsiMinHyppy(taulukko);

        Assert.assertSame(0, maara);

    }

    @Test (expected = RuntimeException.class)
    public void testTyhjaTaulu() {
        TokaTehtNumerot tokaTehtNumerot = new TokaTehtNumerot();
        int [] taulukko = {};
        tokaTehtNumerot.etsiMinHyppy(taulukko);

    }

}
