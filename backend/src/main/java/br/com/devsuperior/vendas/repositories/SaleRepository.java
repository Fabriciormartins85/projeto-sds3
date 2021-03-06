package br.com.devsuperior.vendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.devsuperior.vendas.dto.SaleSuccessDTO;
import br.com.devsuperior.vendas.dto.SaleSumDTO;
import br.com.devsuperior.vendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

	@Query("SELECT new br.com.devsuperior.vendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount))  "
			+ "FROM Sale as obj GROUP BY obj.seller")
	List<SaleSumDTO>amountGroupedBySeller();
	
	
	@Query("SELECT new br.com.devsuperior.vendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals))  "
			+ "FROM Sale as obj GROUP BY obj.seller")
	List<SaleSuccessDTO>successGroupedBySeller();
	
}
