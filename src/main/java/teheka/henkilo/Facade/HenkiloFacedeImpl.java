package teheka.henkilo.Facade;

import teheka.henkilo.Actions.LuonnollinenHenkiloToiminnot;
import teheka.henkilo.domain.LuonnollinenHenkiloEntity;

import java.util.ArrayList;
import java.util.List;

// import javax.xml.ws.Provider;

public class HenkiloFacedeImpl implements HenkiloFacade {

    /**
     * Facade Design pattern
     * Saa toiminnot action luokista. Luokka rajoituksen takia kaikki toiminnot yhdessä luokassa
     * LuonnollinenhenkilöEntity + henkilöfacade + henkilöfacadeImpl on DAO (data access object) Design pattern
     *
     */

    // testi tietokanta toimivuuden näyttämiseksi
    List<LuonnollinenHenkiloEntity> kanta = new ArrayList<LuonnollinenHenkiloEntity>();

    LuonnollinenHenkiloToiminnot LuonnollinenHenkiloToiminnot = new LuonnollinenHenkiloToiminnot(kanta);

    /*@Inject
    // oikean Tietokannan kanssa käytettävä
    public HenkiloFacedeImpl(final Provider<LuonnollinenHenkiloToiminnot> luonnollinenHenkiloActionsProvider,LuonnollinenHenkiloToiminnot luonnolinenHenkiloToiminnot) {
        LuonnolinenHenkiloToiminnot = luonnolinenHenkiloToiminnot;
    }
    */

    @Override
    public LuonnollinenHenkiloEntity luoLuonnollinenHenkilo(LuonnollinenHenkiloEntity luonnollinenHenkiloEntity) {
        return LuonnollinenHenkiloToiminnot.luoLuonnolinenHenkilo(luonnollinenHenkiloEntity);
    }

    @Override
    public LuonnollinenHenkiloEntity paivitaLuonnollinenHenkilo(LuonnollinenHenkiloEntity luonnollinenHenkiloEntity) {
        return LuonnollinenHenkiloToiminnot.paivitaLuonnollinenHenkilo(luonnollinenHenkiloEntity);
    }

    @Override
    public Boolean poistaLuonnollinenHenkilo(Integer id) {
        return LuonnollinenHenkiloToiminnot.poistaLuonnollinenHenkilo(id);
    }

    @Override
    public LuonnollinenHenkiloEntity haeLuonnollinenHenkilo(LuonnollinenHenkiloEntity luonnollinenHenkiloEntity) {
        return LuonnollinenHenkiloToiminnot.haeLuonnollinenHenkilo(luonnollinenHenkiloEntity);
    }
}
