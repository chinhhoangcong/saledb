/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.hcc.demohibernate;

import com.hcc.pojo.Category;
import com.hcc.pojo.Product;
import com.hcc.repository.impl.ProductRepositoryImpl;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class DemoHibernate {
    public static void main(String[] args) {
        ProductRepositoryImpl s = new ProductRepositoryImpl();
        s.getProducts(null).forEach(p -> System.out.println(p.getId() + " - " + p.getName()));
//        try(Session s = HibernateUtils.getFactory().openSession()){
//            Query q = s.createNamedQuery("Product.findAll");
//            List<Product> pro = q.getResultList();
//            
//            pro.forEach(c -> System.out.println(c.getName()));
//        }
    }
}
