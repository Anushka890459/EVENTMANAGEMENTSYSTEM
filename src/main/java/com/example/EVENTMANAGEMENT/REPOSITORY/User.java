package com.example.EVENTMANAGEMENT.REPOSITORY;

import com.example.EVENTMANAGEMENT.MODEL.USER;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface User extends JpaRepository<USER, Long> {

}
