package com.example.EVENTMANAGEMENT.REPOSITORY;

import com.example.EVENTMANAGEMENT.MODEL.ITEM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepo extends JpaRepository<ITEM, Long> {
}
