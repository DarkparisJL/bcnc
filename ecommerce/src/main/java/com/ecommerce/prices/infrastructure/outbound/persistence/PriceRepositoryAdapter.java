package com.ecommerce.prices.infrastructure.outbound.persistence;

import com.ecommerce.prices.domain.model.Price;
import com.ecommerce.prices.domain.port.out.PriceRepositoryPort;
import com.ecommerce.prices.infrastructure.outbound.persistence.mapper.PriceMapper;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class PriceRepositoryAdapter implements PriceRepositoryPort {

    private final PriceJpaRepository repository;
    private final PriceMapper priceMapper;

    public PriceRepositoryAdapter(PriceJpaRepository repository, PriceMapper priceMapper) {
        this.repository = repository;
        this.priceMapper = priceMapper;
    }

    @Override
    public List<Price> findPrices(LocalDateTime applicationDate, Long productId, Long brandId) {
        return repository.findApplicablePrices(applicationDate, productId, brandId).stream()
                .map(priceMapper::toDomain)
                .collect(Collectors.toList());
    }
}
