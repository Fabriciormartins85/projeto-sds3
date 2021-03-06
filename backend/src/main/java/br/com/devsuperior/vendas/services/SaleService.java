package br.com.devsuperior.vendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.devsuperior.vendas.dto.SaleDTO;
import br.com.devsuperior.vendas.dto.SaleSuccessDTO;
import br.com.devsuperior.vendas.dto.SaleSumDTO;
import br.com.devsuperior.vendas.entities.Sale;
import br.com.devsuperior.vendas.repositories.SaleRepository;
import br.com.devsuperior.vendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	@Autowired
	private SellerRepository sellerRepository;

	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable) {
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));

	}

	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller() {
		List<SaleSumDTO> result = repository.amountGroupedBySeller();
		return result;
	}
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupedBySeller() {
		List<SaleSuccessDTO> result = repository.successGroupedBySeller();
		return result;
	}
}
