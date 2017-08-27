package com.sam.dao;

import com.sam.model.Person;

import java.util.List;

/**
 * Created by root on 4/8/17.
 */
public interface PersonDao {

    List<Person> getPersonByEmail(String email);

}
