package com.codeup.springblog;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class PostInsertRepository {

    @PersistenceContext
    private EntityManager entityManager;
}