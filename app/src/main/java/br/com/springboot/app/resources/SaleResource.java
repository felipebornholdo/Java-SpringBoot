package br.com.springboot.app.resources;

import br.com.springboot.app.Service.SaleService;
import br.com.springboot.app.resources.dto.SaleDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/goinside/sale")
public class SaleResource {

    private SaleService saleService;

    @Autowired
    public SaleResource(SaleService saleService) {
        this.saleService = saleService;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/send")
    public ResponseEntity<Void> sendSale(@RequestBody SaleDTO saleDTO) {
        saleService.save(saleDTO);
        return ResponseEntity.ok().build();
    }
}
