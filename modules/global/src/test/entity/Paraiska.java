package test.entity;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.util.Random;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.StandardEntity;
import test.service.AutonumberService;
import java.util.Set;
import javax.persistence.OneToMany;

@Table(name = "TEST_PARAISKA")
@Entity(name = "test$Paraiska")
public class Paraiska extends StandardEntity {
    private static final long serialVersionUID = -4558349216694128500L;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "PAR_DATA", nullable = false)
    protected Date parData;

    @Column(name = "PAR_NR")
    protected Integer parNr;

    @Column(name = "BUSENA", nullable = false)
    protected Integer busena;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "BUSENOS_DATA", nullable = false)
    protected Date busenosData;

    @Column(name = "PASTABA")
    protected String pastaba;

    @Column(name = "KLAIDOS_PRANESIMAS")
    protected String klaidosPranesimas;


    @OneToMany(mappedBy = "paraiska")
    protected Set<ParaiskosPreke> paraiskosPrekes;

    public void setParaiskosPrekes(Set<ParaiskosPreke> paraiskosPrekes) {
        this.paraiskosPrekes = paraiskosPrekes;
    }

    public Set<ParaiskosPreke> getParaiskosPrekes() {
        return paraiskosPrekes;
    }


    public ParaiskosBusena getBusena() {
        return busena == null ? null : ParaiskosBusena.fromId(busena);
    }

    public void setBusena(ParaiskosBusena busena) {
        this.busena = busena == null ? null : busena.getId();
    }


    public void setParData(Date parData) {
        this.parData = parData;
    }

    public Date getParData() {
        return parData;
    }

    public void setParNr(Integer parNr) {
        this.parNr = parNr;
    }

    public Integer getParNr() {
        return parNr;
    }

    public void setBusenosData(Date busenosData) {
        this.busenosData = busenosData;
    }

    public Date getBusenosData() {
        return busenosData;
    }

    public void setPastaba(String pastaba) {
        this.pastaba = pastaba;
    }

    public String getPastaba() {
        return pastaba;
    }

    public void setKlaidosPranesimas(String klaidosPranesimas) {
        this.klaidosPranesimas = klaidosPranesimas;
    }

    public String getKlaidosPranesimas() {
        return klaidosPranesimas;
    }


//    @Inject
//    private AutonumberService as;
//
//    @PostConstruct
//    protected void init(){
//
//        int _nr =  as.paraiskaNextNr();
//        setParNr(_nr);
//    }


}