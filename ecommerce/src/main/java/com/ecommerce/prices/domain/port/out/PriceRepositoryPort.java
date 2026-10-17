package com.ecommerce.prices.domain.port.out;


import com.ecommerce.prices.domain.model.Price;

import java.time.LocalDateTime;
import java.util.List;

public interface PriceRepositoryPort {
    List<Price> findPrices(LocalDateTime applicationDate, Long productId, Long brandId);
}
