/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mongodb.api_mongo.repository;

import com.mongodb.api_mongo.model.Serie;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author TUF Gaming
 */
public interface SerieRepository extends MongoRepository<Serie,Long> {
    
}
