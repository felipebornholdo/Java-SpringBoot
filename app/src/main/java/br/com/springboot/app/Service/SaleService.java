package br.com.springboot.app.Service;

import br.com.springboot.app.Service.Mapper.SaleMapper;
import br.com.springboot.app.model.Sale;
import br.com.springboot.app.repository.SaleRepository;
import br.com.springboot.app.resources.dto.SaleDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleService {

    private final SaleRepository saleRepository;

    @Autowired
    public SaleService(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

    public void save(SaleDTO saleDTO) {
        Sale sale = SaleMapper.toSale(saleDTO);
        saleRepository.save(sale);
    }
}
