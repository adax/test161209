package test.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service(AutonumberService.NAME)
public class AutonumberServiceBean implements AutonumberService {
    public int paraiskaNextNr(){
        int retval = new Random().nextInt(9999) + 1;
        return retval;
    }
}