package test.service;

import org.springframework.stereotype.Service;
import test.entity.VirtualTable;

import java.util.List;

@Service(VirtualTableService.NAME)
public class VirtualTableServiceBean implements VirtualTableService {

    public void fillTable(List<VirtualTable> vts) {
        vts.removeAll(vts);
        for(Integer i = 0; i < 10; i++){
            VirtualTable vt = new VirtualTable();
            Integer x = i + 1;
            vt.setDarbuotojas("darbuotojas " + x);
            vt.setDiena1("D");
            vt.setDiena2("D");
            vt.setDiena3("D");
            vt.setDiena4("D");
            vt.setDiena5("D");
            vt.setDiena6("N");
            vt.setDiena7("N");
            vts.add(vt);
        }
    }
}