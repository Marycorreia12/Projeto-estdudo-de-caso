package com.maryCorreia.cursoUml.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maryCorreia.cursoUml.domain.Categoria;

    @Repository
	public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
		
	}
 