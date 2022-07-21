package com.demo.springjdbcapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);


        WorkerDao workerdao =(WorkerDao)context.getBean("workerdao",WorkerDao.class);
        
       Worker worker = new Worker();
//        worker.setId(1000);
//        worker.setName("Megha");
//        worker.setAddress("Bengaluru");
//        
//        int statusCode = workerdao.saveWorker(worker);
//        System.out.println(statusCode);
//        
//       int statusCode= workerdao.updateWorker(worker);
//       System.out.println(statusCode);
//       
       worker.setId(1000);
       int status= workerdao.deleteWorker(worker); 
       System.out.println(status);
        
    }
}
