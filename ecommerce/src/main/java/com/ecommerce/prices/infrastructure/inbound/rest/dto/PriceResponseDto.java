package com.ecommerce.prices.infrastructure.inbound.rest.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PriceResponseDto(
        Long productId,
        Long brandId,
        Long priceList,
        LocalDateTime startDate,
        LocalDateTime endDate,
        BigDecimal price,
        String curr
) {}
