package com.first.demo.Repositry;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.first.demo.Entity.user;
import java.util.List;



public interface UserRepo extends CrudRepository<user,Integer> {
    public List<user> findByName(String name);

    public List<user> findByNameAndCity(String name , String city);

    @Query("select u from user u")
    public List<user> getAllUser();

    @Query("select u from user u Where u.name =:n")
    public List<user> getUserByName(@Param("n")String name);

}
