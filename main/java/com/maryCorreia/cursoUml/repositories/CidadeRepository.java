package com.maryCorreia.cursoUml.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maryCorreia.cursoUml.domain.Cidade;

    @Repository
	public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
		
	}
 