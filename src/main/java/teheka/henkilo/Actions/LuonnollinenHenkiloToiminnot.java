package teheka.henkilo.Actions;

import teheka.henkilo.domain.LuonnollinenHenkiloEntity;

import java.util.List;

public class LuonnollinenHenkiloToiminnot {

    // testi tietokanta toimivuuden näyttämiseksi
    static List<LuonnollinenHenkiloEntity> db;

    //@Inject
    //parametrina oikeassa tietokannassa LuonnollinenHenkiloDao, mapperit, validaattorit
    public LuonnollinenHenkiloToiminnot(List<LuonnollinenHenkiloEntity> kanta) {
        db = kanta;
    }


    /**
     * luo kantaan uuden Luonnollisen henkilon ja palauttaa sen
     * @param luonnollinenHenkiloEntity
     * @return luonnollinenHenkiloEntity
     */
    public LuonnollinenHenkiloEntity luoLuonnolinenHenkilo(final LuonnollinenHenkiloEntity luonnollinenHenkiloEntity) {

        // TODO mahdollinen tietokanta tyyppinen ratkaisu
        //LuonnollinenHenkilo luonnollinenHenkilo = luonnollinenHenkiloEntityToLuonnollinenModelMapper.map(luonnollinenHenkiloEntity)
        //luonnollinenHenkilo.validator(luonnollinenHenkilo);
        //return luonnollinenHenkiloModelToLuonnollinenHenkiloMapper.map(luonnollinenHenkiloDao.update(luonnollinenHenkilo)

        db.add(luonnollinenHenkiloEntity);

        return luonnollinenHenkiloEntity;
    }

    /**
     * päivittää parametrin tiedot jo kannassa olevaan objektiin.
     * @param luonnollinenHenkiloEntity1
     * @return luonnollinenHenkiloEntityOikea
     */
    public LuonnollinenHenkiloEntity paivitaLuonnollinenHenkilo(LuonnollinenHenkiloEntity luonnollinenHenkiloEntity) {

        LuonnollinenHenkiloEntity luonnollinenHenkiloEntityOikea = db.get(luonnollinenHenkiloEntity.getId());
        luonnollinenHenkiloEntityOikea.setHenkiloTunnus(luonnollinenHenkiloEntity.getHenkiloTunnus());

        return luonnollinenHenkiloEntityOikea;
    }

    /**
     * Poistaa kannasta ID:tä vastaavan objektin tiedot ja palauttaa true onnistuessaan
     * @param Integer id
     * @return Boolean
     */
    public Boolean poistaLuonnollinenHenkilo(final Integer id) {

        try {
            db.remove(id);
            return true;

        } catch (Exception e) {
            System.out.println("Ei ole kannassa");
        }
        return false;

    }

    /**
     * Etsii kannasta oikean Luonnollisenhenkilön annetun parametrin tiedoilla
     * annettuun parametriin on päivitetty jotain attribuutteja joiden avulla etsitään esim henkilötunnus
     * en testi listaa varten laita kunnon etsimis methodia, koska liikaa eroa tietokanta käsittelyyn
     * @param luonnollinenHenkiloEntity1
     * @return LuonnollinenHenkilöEntityOikea
     */
    public LuonnollinenHenkiloEntity haeLuonnollinenHenkilo(LuonnollinenHenkiloEntity luonnollinenHenkiloEntity1) {

        LuonnollinenHenkiloEntity luonnollinenHenkiloEntityOikea = db.get(luonnollinenHenkiloEntity1.getId());

        return luonnollinenHenkiloEntityOikea;
    }
}

