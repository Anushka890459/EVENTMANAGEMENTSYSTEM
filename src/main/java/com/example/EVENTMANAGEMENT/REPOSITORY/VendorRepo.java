package com.example.EVENTMANAGEMENT.REPOSITORY;

import com.example.EVENTMANAGEMENT.MODEL.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorRepo extends JpaRepository<Vendor, Long> {
}