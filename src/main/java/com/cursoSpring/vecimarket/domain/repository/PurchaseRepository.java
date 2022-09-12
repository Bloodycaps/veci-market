package com.cursoSpring.vecimarket.domain.repository;

import com.cursoSpring.vecimarket.domain.Purchase;
import com.cursoSpring.vecimarket.domain.PurchaseItem;

import java.util.List;
import java.util.Optional;

public interface PurchaseRepository {
    List<Purchase> getAll();
    Optional<List<Purchase>> getByClient(String clientId);
    Purchase save(Purchase purchase);
}
