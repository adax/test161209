package test.entity;

import com.haulmont.chile.core.annotations.MetaClass;
import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.cuba.core.entity.AbstractNotPersistentEntity;

@MetaClass(name = "test$VirtualTable")
public class VirtualTable extends AbstractNotPersistentEntity {
    private static final long serialVersionUID = 5530789110834689415L;

    @MetaProperty
    protected String darbuotojas;

    @MetaProperty
    protected String diena1;

    @MetaProperty
    protected String diena2;

    @MetaProperty
    protected String diena3;

    @MetaProperty
    protected String diena4;

    @MetaProperty
    protected String diena5;

    @MetaProperty
    protected String diena6;

    @MetaProperty
    protected String diena7;

    public void setDiena6(String diena6) {
        this.diena6 = diena6;
    }

    public String getDiena6() {
        return diena6;
    }

    public void setDiena7(String diena7) {
        this.diena7 = diena7;
    }

    public String getDiena7() {
        return diena7;
    }


    public void setDiena5(String diena5) {
        this.diena5 = diena5;
    }

    public String getDiena5() {
        return diena5;
    }


    public void setDiena4(String diena4) {
        this.diena4 = diena4;
    }

    public String getDiena4() {
        return diena4;
    }


    public void setDiena3(String diena3) {
        this.diena3 = diena3;
    }

    public String getDiena3() {
        return diena3;
    }


    public String getDiena1() {
        return diena1;
    }

    public void setDiena1(String diena1) {
        this.diena1 = diena1;
    }


    public String getDiena2() {
        return diena2;
    }

    public void setDiena2(String diena2) {
        this.diena2 = diena2;
    }



    public void setDarbuotojas(String darbuotojas) {
        this.darbuotojas = darbuotojas;
    }

    public String getDarbuotojas() {
        return darbuotojas;
    }


}