package com.maryCorreia.cursoUml.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maryCorreia.cursoUml.domain.Estado;

    @Repository
	public interface EstadoRepository extends JpaRepository<Estado, Integer> {
		
	}
 