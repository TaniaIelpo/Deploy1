package co.develhope.Deploy1.controllers;


import co.develhope.Deploy1.services.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tania Ielpo
 */

@RestController
public class NameController {

    @Autowired
    private NameService nameService;

    @GetMapping
    public String getName(){
        return nameService.getName();
    }
}
