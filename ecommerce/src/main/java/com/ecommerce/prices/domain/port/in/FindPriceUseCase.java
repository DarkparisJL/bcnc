package com.ecommerce.prices.domain.port.in;

import com.ecommerce.prices.domain.model.Price;

import java.time.LocalDateTime;
import java.util.Optional;

public interface FindPriceUseCase {
    Price findApplicablePrice(LocalDateTime applicationDate, Long productId, Long brandId);
}
