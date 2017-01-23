package test.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum ParaiskosBusena implements EnumClass<Integer> {

    Ruosiama(1),
    Paruosta(2),
    Eileje(3),
    Apdorojama(4),
    Priimta(5),
    Atmesta(6);

    private Integer id;

    ParaiskosBusena(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static ParaiskosBusena fromId(Integer id) {
        for (ParaiskosBusena at : ParaiskosBusena.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}