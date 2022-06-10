package com.example.springboottutorial.repositories;

import com.example.springboottutorial.models.UsersModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepo extends JpaRepository<UsersModel, Long> {

    @Query("SELECT t FROM UsersModel t WHERE t.name like %:username%")
    public List<UsersModel> findUsersByName(@Param("username") String username);
}
