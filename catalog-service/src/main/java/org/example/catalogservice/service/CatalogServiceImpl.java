package org.example.catalogservice.service;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.example.catalogservice.jpa.CatalogEntity;
import org.example.catalogservice.jpa.CatalogRepository;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@Data
public class CatalogServiceImpl implements CatalogService{

    private final CatalogRepository catalogRepository;

    public CatalogServiceImpl(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }

    @Override
    public Iterable<CatalogEntity> getAllCatalogs() {
        return catalogRepository.findAll();
    }
}
