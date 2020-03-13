package teheka.henkilo;

import teheka.henkilo.Facade.HenkiloFacade;
import teheka.henkilo.Facade.HenkiloFacedeImpl;
import teheka.henkilo.domain.LuonnollinenHenkiloEntity;

public class LuonnollinenHenkiloRajapinta {

    /**
     * Minkä tahansa rajapinta. Oletuksena että rajapinta käsittelee LuonnollinenHenkilöEntityjä
     * Frontista tai mistä tahansa käyttäjän syötöstä saadaa tehtyä LuonnollinenHenkilöEntity ja se tuodaan tänne
     */

    HenkiloFacade henkiloFacade = new HenkiloFacedeImpl();

    public LuonnollinenHenkiloEntity luoHenkilo(LuonnollinenHenkiloEntity luonnollinenHenkiloEntity) {
        return henkiloFacade.luoLuonnollinenHenkilo(luonnollinenHenkiloEntity);
    }

    public LuonnollinenHenkiloEntity paivitaHenkilo(LuonnollinenHenkiloEntity luonnollinenHenkiloEntity) {
        return henkiloFacade.paivitaLuonnollinenHenkilo(luonnollinenHenkiloEntity);
    }

    public Boolean poistaHenkilo(final Integer id) {
        return henkiloFacade.poistaLuonnollinenHenkilo(id);
    }

    public LuonnollinenHenkiloEntity haeHenkilo(LuonnollinenHenkiloEntity luonnollinenHenkiloEntity) {
        return henkiloFacade.haeLuonnollinenHenkilo(luonnollinenHenkiloEntity);
    }

}
