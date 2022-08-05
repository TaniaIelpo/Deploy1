package co.develhope.Deploy1.services;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author Tania Ielpo
 */

@Service
public class NameService {

    @Value("${myCustomVarTree.devName}")
    private String devName;

    public String getName(){
        return devName;
    }
}
