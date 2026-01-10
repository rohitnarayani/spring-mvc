package com.spring.dao;

import com.spring.model.User;

import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
public class UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public int saveUser(User user){
        entityManager.persist(user);
        return user.getId();
    }
}