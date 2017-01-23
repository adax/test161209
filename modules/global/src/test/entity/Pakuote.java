package test.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s %s|kodas,pavadinimas")
@Table(name = "TEST_PAKUOTE")
@Entity(name = "test$Pakuote")
public class Pakuote extends StandardEntity {
    private static final long serialVersionUID = -3316278959261291339L;

    @Column(name = "KODAS", nullable = false)
    protected Integer kodas;

    @Column(name = "PAVADINIMAS", nullable = false)
    protected String pavadinimas;

    public void setKodas(Integer kodas) {
        this.kodas = kodas;
    }

    public Integer getKodas() {
        return kodas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }


}