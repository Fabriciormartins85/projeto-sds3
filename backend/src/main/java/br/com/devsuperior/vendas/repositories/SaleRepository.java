package br.com.devsuperior.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devsuperior.vendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
