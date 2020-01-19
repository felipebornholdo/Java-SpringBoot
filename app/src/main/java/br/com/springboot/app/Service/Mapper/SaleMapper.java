package br.com.springboot.app.Service.Mapper;

import br.com.springboot.app.model.Sale;
import br.com.springboot.app.resources.dto.SaleDTO;

public class SaleMapper {

    public static Sale toSale(SaleDTO saleDTO) {
        final Sale sale = new Sale();
        sale.setIdBook(saleDTO.getIdBook());
        sale.setIdClient(saleDTO.getIdClient());
        sale.setQuantity(saleDTO.getQuantity());
        return sale;
    }
}
