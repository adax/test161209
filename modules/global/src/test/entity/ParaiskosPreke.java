package test.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|preke")
@Table(name = "TEST_PARAISKOS_PREKE")
@Entity(name = "test$ParaiskosPreke")
public class ParaiskosPreke extends StandardEntity {
    private static final long serialVersionUID = 2808064029697138186L;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PARAISKA_ID")
    protected Paraiska paraiska;

    @Column(name = "PREKE", nullable = false)
    protected String preke;

    @Column(name = "KIEKIS", nullable = false, precision = 19, scale = 3)
    protected BigDecimal kiekis;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PAKUOTE_ID")
    protected Pakuote pakuote;

    public void setPakuote(Pakuote pakuote) {
        this.pakuote = pakuote;
    }

    public Pakuote getPakuote() {
        return pakuote;
    }


    public void setParaiska(Paraiska paraiska) {
        this.paraiska = paraiska;
    }

    public Paraiska getParaiska() {
        return paraiska;
    }

    public void setPreke(String preke) {
        this.preke = preke;
    }

    public String getPreke() {
        return preke;
    }

    public void setKiekis(BigDecimal kiekis) {
        this.kiekis = kiekis;
    }

    public BigDecimal getKiekis() {
        return kiekis;
    }


}