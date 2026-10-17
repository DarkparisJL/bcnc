package com.ecommerce.prices.infrastructure.outbound.persistence.mapper;

import com.ecommerce.prices.domain.model.Price;
import com.ecommerce.prices.infrastructure.outbound.persistence.entity.PriceEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PriceMapper {

    Price toDomain(PriceEntity entity);
}
