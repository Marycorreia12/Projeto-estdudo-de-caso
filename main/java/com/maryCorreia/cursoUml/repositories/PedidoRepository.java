package com.maryCorreia.cursoUml.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maryCorreia.cursoUml.domain.Pedido;

    @Repository
	public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
		
	}
 