package com.lectura.backend.service;

import com.lectura.backend.model.OrderDto;
import com.lectura.backend.model.SimulateSaleResponse;

import javax.transaction.NotSupportedException;
import javax.transaction.SystemException;
import java.net.URI;
import java.time.LocalDateTime;

public interface IWooCommerceService {
    void synchronization(LocalDateTime dateTime) throws Exception;

    SimulateSaleResponse simulateSale(Long productId, Double price) throws Exception;

    void registerSale(OrderDto order) throws Exception;

    URI getDownloadUrl(Long orderId, String username);
}
