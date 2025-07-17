package com.luv2code.cruddemo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.cruddemo.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class StudentDAOImpl implements StudentDAO {

    private EntityManager entityManager;

    @Autowired
    public StudentDAOImpl(EntityManager theEntityManager) {
        this.entityManager = theEntityManager;
    }

    @Override
    @Transactional // since were handling an update
    public void saveStudent(Student theStudent) {
        entityManager.persist(theStudent);
        System.out.println("Saving student: "
                + theStudent.getFirstName() + " " + theStudent.getLastName());
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        // create a query
        TypedQuery<Student> query
                = entityManager.createQuery("FROM Student", Student.class);

        // return query results
        return query.getResultList();
    }

    @Override
    public List<Student> findByLastName(String theLastName) {

        //create a query
        TypedQuery<Student> query
                = entityManager.createQuery("FROM Student WHERE lastName=:theData", Student.class);

        //set parameter
        query.setParameter("theData", theLastName);

        // return query results
        return query.getResultList();
    }

    @Override
    @Transactional // since we're handling an update
    public void update(Student theStudent) {
        entityManager.merge(theStudent);
    }

    @Transactional // since we're handling a delete
    @Override
    public void deleteById(Integer id) {
        // retrieve the student
        Student student = entityManager.find(Student.class, id);
        // then delete it
        entityManager.remove(student);
    }

    @Transactional // since we're handling a delete
    @Override
    public int deleteAll() {
        int numRowsDeleted = entityManager.createQuery("DELETE FROM Student").executeUpdate();
        return numRowsDeleted;
    }

}
