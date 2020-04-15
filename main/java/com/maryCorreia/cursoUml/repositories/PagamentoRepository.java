package com.maryCorreia.cursoUml.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maryCorreia.cursoUml.domain.Pagamento;

    @Repository
	public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {
		
	}
 