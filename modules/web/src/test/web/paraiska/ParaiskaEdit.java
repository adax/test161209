package test.web.paraiska;

import com.haulmont.cuba.gui.components.AbstractEditor;
import org.eclipse.persistence.jpa.jpql.parser.DateTime;
import test.entity.Paraiska;
import test.entity.ParaiskosBusena;
import test.service.AutonumberService;

import javax.inject.Inject;
import java.util.Date;

public class ParaiskaEdit extends AbstractEditor<Paraiska> {

    @Inject
    private AutonumberService as;

    @Override
    protected void initNewItem(Paraiska item){
        super.initNewItem(item);
        item.setBusena(ParaiskosBusena.Ruosiama);
        item.setParData(new Date());
        item.setBusenosData(item.getParData());
        item.setParNr(as.paraiskaNextNr());
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