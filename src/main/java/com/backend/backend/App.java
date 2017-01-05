package com.backend.backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.backend.configuration.ApplicationConfig;
import com.backend.dao.ProductDao;
import com.backend.dao.UsersDao;
import com.backend.model.Product;
import com.backend.model.Users;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(ApplicationConfig.class);
    
        UsersDao userDao=(UsersDao)annotationConfigApplicationContext.getBean("userDaoImpl");
        Users user=new Users();
        user.setUsername("test");
        user.setPassword("text");
        userDao.registerUser(user);
        
        ProductDao productDao=(ProductDao)annotationConfigApplicationContext.getBean("productDaoImpl");
        Product product=new Product();
        product.setPname("bag");
        product.setPrice(670.90f);
        productDao.addProduct(product);
    }
}
