package com.maryCorreia.cursoUml.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maryCorreia.cursoUml.domain.Produto;

    @Repository
	public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
		
	}
 