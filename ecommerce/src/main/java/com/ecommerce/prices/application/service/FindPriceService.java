package com.ecommerce.prices.application.service;

import com.ecommerce.prices.domain.exception.PriceNotFoundException;
import com.ecommerce.prices.domain.model.Price;
import com.ecommerce.prices.domain.port.in.FindPriceUseCase;
import com.ecommerce.prices.domain.port.out.PriceRepositoryPort;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.Optional;

@Service
public class FindPriceService implements FindPriceUseCase {

    private final PriceRepositoryPort priceRepositoryPort;

    public FindPriceService(PriceRepositoryPort priceRepositoryPort) {
        this.priceRepositoryPort = priceRepositoryPort;
    }

    @Override
    public Price findApplicablePrice(LocalDateTime applicationDate, Long productId, Long brandId) {
        return priceRepositoryPort.findPrices(applicationDate, productId, brandId).stream()
                .max(Comparator.comparingInt(Price::getPriority))
                .orElseThrow(() -> new PriceNotFoundException(productId, brandId));
    }
}
