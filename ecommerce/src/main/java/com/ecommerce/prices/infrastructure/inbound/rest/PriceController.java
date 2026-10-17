package com.ecommerce.prices.infrastructure.inbound.rest;

import com.ecommerce.prices.domain.model.Price;
import com.ecommerce.prices.domain.port.in.FindPriceUseCase;
import com.ecommerce.prices.infrastructure.inbound.rest.dto.PriceResponseDto;
import com.ecommerce.prices.infrastructure.inbound.rest.mapper.PriceRestMapper;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/prices")
public class PriceController {

    private final FindPriceUseCase findPriceUseCase;
    private final PriceRestMapper priceRestMapper;

    public PriceController(FindPriceUseCase findPriceUseCase, PriceRestMapper priceRestMapper) {
        this.findPriceUseCase = findPriceUseCase;
        this.priceRestMapper = priceRestMapper;
    }

    @GetMapping
    public ResponseEntity<PriceResponseDto> getPrice(
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd-HH.mm.ss") LocalDateTime applicationDate,
            @RequestParam Long productId,
            @RequestParam Long brandId) {

        Price price = findPriceUseCase.findApplicablePrice(applicationDate, productId, brandId);
        return ResponseEntity.ok(priceRestMapper.toDto(price));
    }
}
