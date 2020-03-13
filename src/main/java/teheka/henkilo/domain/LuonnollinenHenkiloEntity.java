package teheka.henkilo.domain;

public class LuonnollinenHenkiloEntity /*extends AbstractConditionalRestResponse*/ {

    private Integer id;
    private String nimi;
    private String henkiloTunnus;
    private String osoite;
    private String siviiliSääty;
    private String kansalaisuus;

    // tietokantaan tarvittavat
    // private Integer optlock;
    // + mahdollisesti aikaleimat


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getHenkiloTunnus() {
        return henkiloTunnus;
    }

    public void setHenkiloTunnus(String henkiloTunnus) {
        this.henkiloTunnus = henkiloTunnus;
    }

    public String getOsoite() {
        return osoite;
    }

    public void setOsoite(String osoite) {
        this.osoite = osoite;
    }


    public String getKansalaisuus() {
        return kansalaisuus;
    }

    public void setKansalaisuus(String kansalaisuus) {
        this.kansalaisuus = kansalaisuus;
    }

    public String getSiviiliSääty() {
        return siviiliSääty;
    }

    public void setSiviiliSääty(String siviiliSääty) {
        this.siviiliSääty = siviiliSääty;
    }

}
