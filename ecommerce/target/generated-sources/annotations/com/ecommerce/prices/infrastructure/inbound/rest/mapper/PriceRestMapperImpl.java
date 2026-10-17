package com.ecommerce.prices.infrastructure.inbound.rest.mapper;

import com.ecommerce.prices.domain.model.Price;
import com.ecommerce.prices.infrastructure.inbound.rest.dto.PriceResponseDto;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-10-17T10:31:21+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.12.1 (Microsoft)"
)
@Component
public class PriceRestMapperImpl implements PriceRestMapper {

    @Override
    public PriceResponseDto toDto(Price domainPrice) {
        if ( domainPrice == null ) {
            return null;
        }

        Long productId = null;
        Long brandId = null;
        Long priceList = null;
        LocalDateTime startDate = null;
        LocalDateTime endDate = null;
        BigDecimal price = null;
        String curr = null;

        productId = domainPrice.getProductId();
        brandId = domainPrice.getBrandId();
        priceList = domainPrice.getPriceList();
        startDate = domainPrice.getStartDate();
        endDate = domainPrice.getEndDate();
        price = domainPrice.getPrice();
        curr = domainPrice.getCurr();

        PriceResponseDto priceResponseDto = new PriceResponseDto( productId, brandId, priceList, startDate, endDate, price, curr );

        return priceResponseDto;
    }
}
