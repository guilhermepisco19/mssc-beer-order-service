package guru.sfg.beer.order.service.web.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

public record BeerDto(
        UUID id,
        Integer version,
        @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssZ", shape = JsonFormat.Shape.STRING)
        OffsetDateTime createdDate,
        @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssZ", shape = JsonFormat.Shape.STRING)
        OffsetDateTime lastModifiedDate,
        String beerName,
        String beerStyle,
        String upc,
        Integer quantityOnHand,
        @JsonFormat(shape = JsonFormat.Shape.STRING)
        BigDecimal price
) {}