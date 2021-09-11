package br.com.devsuperior.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devsuperior.vendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
