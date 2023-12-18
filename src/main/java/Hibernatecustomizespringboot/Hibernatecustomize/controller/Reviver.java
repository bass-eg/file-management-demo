package Hibernatecustomizespringboot.Hibernatecustomize.controller;


import Hibernatecustomizespringboot.Hibernatecustomize.utils.HibernateUtils;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
public class Reviver {


    @Autowired
    private HibernateUtils hibernateUtils;

    @GetMapping("/revive")
    public void revive(){
        hibernateUtils.sessionFactory();
    }


}
