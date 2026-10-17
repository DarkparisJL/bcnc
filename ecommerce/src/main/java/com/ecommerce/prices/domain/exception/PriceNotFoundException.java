package com.ecommerce.prices.domain.exception;

public class PriceNotFoundException extends RuntimeException {

    public PriceNotFoundException(Long productId, Long brandId) {
        super(String.format("No se encontró ningún precio aplicable para el producto %d y la cadena %d", productId, brandId));
    }
}
