package com.maryCorreia.cursoUml.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maryCorreia.cursoUml.domain.ItemPedido;

    @Repository
	public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {
		
	}
 