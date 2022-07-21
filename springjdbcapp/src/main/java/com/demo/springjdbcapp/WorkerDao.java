package com.demo.springjdbcapp;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component
public class WorkerDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
//   public int saveWorker(Worker worker) {
//       String query = "insert into worker values( '"+worker.getId()+"','"+ worker.getName()+"','"+worker.getAddress()+"')";  
//       return jdbcTemplate.update(query);
//   }
    
//public int updateWorker(Worker worker) {
//String query = "UPDATE worker SET name='John', address='New York' WHERE id=1000";   
//return jdbcTemplate.update(query);
//}
    
    // insert into tablename values(column value, column2);
    
    public int deleteWorker(Worker worker){  
    	String query="DELETE from worker where id='"+worker.getId()+"' ";  
    	return jdbcTemplate.update(query);  
}   
}