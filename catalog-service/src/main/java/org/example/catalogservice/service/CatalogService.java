package org.example.catalogservice.service;

import org.example.catalogservice.jpa.CatalogEntity;
import org.springframework.stereotype.Service;

public interface CatalogService {
    Iterable<CatalogEntity> getAllCatalogs();
}
