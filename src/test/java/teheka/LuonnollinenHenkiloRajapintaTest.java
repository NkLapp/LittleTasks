package teheka;

import org.junit.Assert;
import org.junit.Test;
import teheka.henkilo.LuonnollinenHenkiloRajapinta;
import teheka.henkilo.domain.LuonnollinenHenkiloEntity;

public class LuonnollinenHenkiloRajapintaTest {

    /**
     * Toiminnallisuuden esittelyyn tehdyt testi. Eivät ole tämän takia oikea oppiset, mutta perus toiminnallisuuden kattavat
     * LuonnollinenHenkilöEntity tulee frontissa, mutta nyt nämä tehdään testien sisällä
     * Jotta toiminnallisuutta voitaisiin esitellä on lisätty lista objekteja toimimaan tietokantana
     */

    @Test
    public void TestLuoLuonnollinenHenkilo() {

        LuonnollinenHenkiloEntity luonnollinenHenkiloEntity1 = new LuonnollinenHenkiloEntity();
        luonnollinenHenkiloEntity1.setId(1);
        luonnollinenHenkiloEntity1.setNimi("heikki");
        luonnollinenHenkiloEntity1.setHenkiloTunnus("250434-1234");
        luonnollinenHenkiloEntity1.setOsoite("Helsinki");
        luonnollinenHenkiloEntity1.setKansalaisuus("Suomalainen");
        luonnollinenHenkiloEntity1.setSiviiliSääty("Naimisissa");

        LuonnollinenHenkiloRajapinta luonnollinenHenkiloRajapinta = new LuonnollinenHenkiloRajapinta();

        LuonnollinenHenkiloEntity luonnollinenHenkiloEntity2 = luonnollinenHenkiloRajapinta.luoHenkilo(luonnollinenHenkiloEntity1);



        Assert.assertNotNull(luonnollinenHenkiloEntity2);
        Assert.assertSame("250434-1234", luonnollinenHenkiloEntity2.getHenkiloTunnus());
    }

    @Test
    public void TestPaivitaLuonnollinenHenkilo() {

        LuonnollinenHenkiloEntity luonnollinenHenkiloEntity1 = new LuonnollinenHenkiloEntity();
        luonnollinenHenkiloEntity1.setId(0);
        luonnollinenHenkiloEntity1.setNimi("heikki");
        luonnollinenHenkiloEntity1.setHenkiloTunnus("111111-1234");
        luonnollinenHenkiloEntity1.setOsoite("Helsinki");
        luonnollinenHenkiloEntity1.setKansalaisuus("Suomalainen");
        luonnollinenHenkiloEntity1.setSiviiliSääty("Naimisissa");

        LuonnollinenHenkiloEntity luonnollinenHenkiloEntity2 = new LuonnollinenHenkiloEntity();
        luonnollinenHenkiloEntity2.setId(0);
        luonnollinenHenkiloEntity2.setHenkiloTunnus("222222-1234");

        LuonnollinenHenkiloEntity luonnollinenHenkiloEntity3 = new LuonnollinenHenkiloEntity();
        luonnollinenHenkiloEntity3.setId(1);
        luonnollinenHenkiloEntity3.setNimi("Niko");
        luonnollinenHenkiloEntity3.setHenkiloTunnus("3333333-1234");
        luonnollinenHenkiloEntity3.setOsoite("Helsinki");
        luonnollinenHenkiloEntity3.setKansalaisuus("Suomalainen");
        luonnollinenHenkiloEntity3.setSiviiliSääty("Naimisissa");

        LuonnollinenHenkiloRajapinta luonnollinenHenkiloRajapinta = new LuonnollinenHenkiloRajapinta();

        luonnollinenHenkiloRajapinta.luoHenkilo(luonnollinenHenkiloEntity1);

        LuonnollinenHenkiloEntity luonnollinenHenkiloEntity = luonnollinenHenkiloRajapinta.paivitaHenkilo(luonnollinenHenkiloEntity2);

        Assert.assertNotNull(luonnollinenHenkiloEntity);
        Assert.assertSame("222222-1234", luonnollinenHenkiloEntity.getHenkiloTunnus());
        Assert.assertSame("heikki", luonnollinenHenkiloEntity.getNimi());
        Assert.assertSame("Helsinki", luonnollinenHenkiloEntity.getOsoite());
        Assert.assertSame("Suomalainen", luonnollinenHenkiloEntity.getKansalaisuus());

    }

    @Test
    public void TestPoistaLuonnollinenHenkilo() {

        LuonnollinenHenkiloEntity luonnollinenHenkiloEntity1 = new LuonnollinenHenkiloEntity();
        luonnollinenHenkiloEntity1.setId(0);
        luonnollinenHenkiloEntity1.setNimi("heikki");
        luonnollinenHenkiloEntity1.setHenkiloTunnus("111111-1234");
        luonnollinenHenkiloEntity1.setOsoite("Helsinki");
        luonnollinenHenkiloEntity1.setKansalaisuus("Suomalainen");
        luonnollinenHenkiloEntity1.setSiviiliSääty("Naimisissa");

        LuonnollinenHenkiloRajapinta luonnollinenHenkiloRajapinta = new LuonnollinenHenkiloRajapinta();

        luonnollinenHenkiloRajapinta.luoHenkilo(luonnollinenHenkiloEntity1);

        Assert.assertTrue(luonnollinenHenkiloRajapinta.poistaHenkilo(0));
    }

    @Test
    public void TestHaeLonnollinenHenkilo() {

        LuonnollinenHenkiloEntity luonnollinenHenkiloEntity1 = new LuonnollinenHenkiloEntity();
        luonnollinenHenkiloEntity1.setId(0);
        luonnollinenHenkiloEntity1.setNimi("heikki");
        luonnollinenHenkiloEntity1.setHenkiloTunnus("111111-1234");
        luonnollinenHenkiloEntity1.setOsoite("Helsinki");
        luonnollinenHenkiloEntity1.setKansalaisuus("Suomalainen");
        luonnollinenHenkiloEntity1.setSiviiliSääty("Naimisissa");

        LuonnollinenHenkiloEntity luonnollinenHenkiloEntity2 = new LuonnollinenHenkiloEntity();
        luonnollinenHenkiloEntity2.setId(0);

        LuonnollinenHenkiloRajapinta luonnollinenHenkiloRajapinta = new LuonnollinenHenkiloRajapinta();
        luonnollinenHenkiloEntity1 = luonnollinenHenkiloRajapinta.luoHenkilo(luonnollinenHenkiloEntity1);

        LuonnollinenHenkiloEntity luonnollinenHenkiloEntityReal = luonnollinenHenkiloRajapinta.haeHenkilo(luonnollinenHenkiloEntity2);

        Assert.assertNotNull(luonnollinenHenkiloEntity1);
        Assert.assertSame("111111-1234", luonnollinenHenkiloEntityReal.getHenkiloTunnus());

    }
}


