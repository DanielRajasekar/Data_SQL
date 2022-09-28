package com.techtutes.profswitch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techtutes.profswitch.entity.Library;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Long>{
	
}