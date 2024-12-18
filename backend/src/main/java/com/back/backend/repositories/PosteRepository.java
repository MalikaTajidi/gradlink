package com.back.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.back.backend.Entities.Poste;
@Repository
public interface PosteRepository extends JpaRepository<Poste , Integer>{

}
