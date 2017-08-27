package com.sam.service;

import com.sam.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by root on 4/8/17.
 */
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    public PersonDao getPersonDao() {
        return personDao;
    }

}
