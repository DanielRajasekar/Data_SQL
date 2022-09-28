package com.techtutes.profswitch.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;

import com.techtutes.profswitch.entity.Library;
import com.techtutes.profswitch.repository.LibraryRepository;

@Service
public class LibraryReadServiceImpl {
	
	@Autowired
	LibraryRepository readRepository;
	
	public List<Library> getAllLibrary(){
		
		return readRepository.findAll();
	}
	
}
