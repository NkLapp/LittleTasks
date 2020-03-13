package teheka.henkilo.Facade;

import teheka.henkilo.domain.LuonnollinenHenkiloEntity;

public interface HenkiloFacade {

    /**
     * Interface Luokka, Implementoidaan metodit ja tietokanta eri luokassa -  HenkiloFacadeImpl
     *
     */
    public LuonnollinenHenkiloEntity luoLuonnollinenHenkilo(LuonnollinenHenkiloEntity luonnollinenHenkiloEntity);

    public LuonnollinenHenkiloEntity paivitaLuonnollinenHenkilo(LuonnollinenHenkiloEntity luonnollinenHenkiloEntity1);

    public Boolean poistaLuonnollinenHenkilo(Integer id);

    public LuonnollinenHenkiloEntity haeLuonnollinenHenkilo(LuonnollinenHenkiloEntity luonnollinenHenkiloEntity);

}
