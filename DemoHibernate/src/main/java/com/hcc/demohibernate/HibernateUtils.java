/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hcc.demohibernate;


import com.hcc.pojo.Category;
import com.hcc.pojo.Comment;
import com.hcc.pojo.OrderDetail;
import com.hcc.pojo.ProdTag;
import com.hcc.pojo.Product;
import com.hcc.pojo.SaleOrder;
import com.hcc.pojo.Tag;
import com.hcc.pojo.User;
import java.util.Properties;
import javax.imageio.spi.ServiceRegistry;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import org.hibernate.cfg.Environment;




/**
 *
 * @author admin
 */
public class HibernateUtils {

    
   private static SessionFactory factory;
    
    static {
        Configuration conf = new Configuration();
        conf.configure("hibernate.cfg.xml");
//        Properties props = new Properties();
//        props.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
//        props.put(Environment.URL,"jdbc:mysql://localhost/saledb");
//        props.put(Environment.USER,"root");
//        props.put(Environment.PASS,"Admin@123");
//        props.put(Environment.SHOW_SQL,"true");
//        conf.setProperties(props);

        
        conf.addAnnotatedClass(Category.class);
        conf.addAnnotatedClass(Comment.class);
        conf.addAnnotatedClass(OrderDetail.class);
        conf.addAnnotatedClass(ProdTag.class);
        conf.addAnnotatedClass(Product.class);
        conf.addAnnotatedClass(SaleOrder.class);
        conf.addAnnotatedClass(Tag.class);
        conf.addAnnotatedClass(User.class);
        
        
        
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
        setFactory(conf.buildSessionFactory(registry));
    }
    
    /**
     * @return the factory
     */
    public static SessionFactory getFactory() {
        return factory;
    }

    /**
     * @param aFactory the factory to set
     */
    public static void setFactory(SessionFactory aFactory) {
        factory = aFactory;
    }
}


