package com.crpdev.mssc.oil.inventory.failover.web;

import com.crpdev.factory.oil.model.OilInventoryDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
 * Created by rajapandian
 * Date: 14/09/20
 * Project: mssc-oil-eureka
 * Package: com.crpdev.mssc.oil.inventory.failover.web
 **/
@Slf4j
@Component
public class InventoryHandler {

    public Mono<ServerResponse> listInventory(ServerRequest request){
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(Mono.just(Arrays.asList(
                        OilInventoryDto.builder()
                        .id(UUID.randomUUID())
                                .oilId(UUID.fromString("00000000-0000-0000-0000-000000000000"))
                                .quantityOnHand(999)
                                .createdDate(OffsetDateTime.now())
                                .lastModifiedDate(OffsetDateTime.now())
                        .build())),List.class);
    }

}
