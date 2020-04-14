package com.maryCorreia.cursoUml.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maryCorreia.cursoUml.domain.Endereco;

    @Repository
	public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
		
	}
 