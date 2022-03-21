package com.example.demo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.models.ProductoDTO;

public interface IProductoDAO extends MongoRepository<ProductoDTO, String>{

}
