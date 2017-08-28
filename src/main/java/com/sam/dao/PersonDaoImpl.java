package com.sam.dao;

import com.sam.dao.generic.GenericDaoHibernate;
import com.sam.model.Person;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import java.util.List;

/**
 * Created by root on 4/8/17.
 */

public class PersonDaoImpl extends GenericDaoHibernate<Person, String> implements PersonDao{

    @Autowired
    SessionFactory sessionFactory;

    public PersonDaoImpl() {
        super(Person.class);
    }


    public List<Person> getPersonByEmail(String email){
        final HibernateTemplate hibernateTemplate = new HibernateTemplate(sessionFactory);
        final ProjectionList projectionListForIncompleteIterations = Projections.projectionList();
        projectionListForIncompleteIterations.add(Projections.distinct(Projections.property("id")));

        DetachedCriteria criteria = DetachedCriteria.forClass(Person.class)
                .setProjection(projectionListForIncompleteIterations)
                .setResultTransformer(Criteria.ROOT_ENTITY)
                .add(Restrictions.eq("email",email ));


        List<Person> list = (List<Person>) hibernateTemplate.findByCriteria(criteria);
        return list;
    }

    public void add(Person person) {
        save(person);
    }


}
