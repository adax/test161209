package test.service;


import test.entity.VirtualTable;

import java.util.List;

public interface VirtualTableService {
    String NAME = "test_VirtualTableService";

    public void fillTable(List<VirtualTable> vts);
}