/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hcc.repositories.imple;

import com.hcc.configs.HibernateConfig;
import com.hcc.pojo.Category;
import com.hcc.pojo.Product;
import com.hcc.repositories.CategoryRepository;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ACER
 */
@Repository
@Transactional
public class CategoryRepositoryImpl implements CategoryRepository {
    @Autowired
    private LocalSessionFactoryBean factory;
    
    @Override
    public List<Category> getCate() {
        Session s = this.factory.getObject().getCurrentSession();
        Query q = s.createNamedQuery("Category.findAll");
        
        return q.getResultList();
    }


    
}
