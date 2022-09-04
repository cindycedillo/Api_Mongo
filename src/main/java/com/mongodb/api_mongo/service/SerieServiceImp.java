/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mongodb.api_mongo.service;

import com.mongodb.api_mongo.model.Serie;
import com.mongodb.api_mongo.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author TUF Gaming
 */
@Service
public class SerieServiceImp extends GenericServiceImp<Serie,Long> implements SerieService{
    
    @Autowired
    SerieRepository serieRepository;

    @Override
    public CrudRepository<Serie, Long> getDao() {
        return serieRepository;
    }
    
}
