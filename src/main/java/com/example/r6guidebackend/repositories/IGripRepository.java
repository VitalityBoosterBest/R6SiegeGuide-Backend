package com.example.r6guidebackend.repositories;

import com.example.r6guidebackend.models.Grip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGripRepository extends JpaRepository<Grip, Integer> {
}