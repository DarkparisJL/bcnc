package com.ecommerce.prices.infrastructure.outbound.persistence.mapper;

import com.ecommerce.prices.domain.model.Price;
import com.ecommerce.prices.infrastructure.outbound.persistence.entity.PriceEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-10-17T10:31:22+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.12.1 (Microsoft)"
)
@Component
public class PriceMapperImpl implements PriceMapper {

    @Override
    public Price toDomain(PriceEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Price price = new Price();

        price.setBrandId( entity.getBrandId() );
        price.setStartDate( entity.getStartDate() );
        price.setEndDate( entity.getEndDate() );
        price.setPriceList( entity.getPriceList() );
        price.setProductId( entity.getProductId() );
        price.setPriority( entity.getPriority() );
        price.setPrice( entity.getPrice() );
        price.setCurr( entity.getCurr() );

        return price;
    }
}
