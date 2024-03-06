/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hcc.repository.impl;

import com.hcc.demohibernate.HibernateUtils;
import com.hcc.pojo.Product;
import java.util.List;
import java.util.Map;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class ProductRepositoryImpl {

    public List<Product> getProducts(Map<String, String> params) {
        try ( Session session = HibernateUtils.getFactory().openSession()) {
            CriteriaBuilder b = session.getCriteriaBuilder();
            CriteriaQuery<Product> q = b.createQuery(Product.class);
            Root root = q.from(Product.class);
            q.select(root);
            
            
            q.orderBy(b.desc(root.get("id")));
            
            Query query = session.createQuery(q);
            List<Product> products = query.getResultList();
            
            
            

            return products;
        }
    }
}
