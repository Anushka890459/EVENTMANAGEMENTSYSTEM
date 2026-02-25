package com.example.EVENTMANAGEMENT.REPOSITORY;

import com.example.EVENTMANAGEMENT.MODEL.Membership;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembershipRepo extends JpaRepository<Membership, Long> {
}
