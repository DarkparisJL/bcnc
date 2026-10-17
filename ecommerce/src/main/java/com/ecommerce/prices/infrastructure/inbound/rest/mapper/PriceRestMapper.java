package com.ecommerce.prices.infrastructure.inbound.rest.mapper;

import com.ecommerce.prices.domain.model.Price;
import com.ecommerce.prices.infrastructure.inbound.rest.dto.PriceResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PriceRestMapper {

    PriceResponseDto toDto(Price domainPrice);
}
