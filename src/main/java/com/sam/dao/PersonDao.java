package com.sam.dao;

import com.sam.dao.generic.GenericDao;
import com.sam.model.Person;

import java.util.List;

/**
 * Created by root on 4/8/17.
 */
public interface PersonDao extends GenericDao<Person, String> {

    List<Person> getPersonByEmail(String email);

    void add(Person person);

}
