/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mongodb.api_mongo.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author TUF Gaming
 */
public abstract class GenericServiceImp <T,ID extends Serializable> implements GenericService<T,ID> {

    @Override
    public T save(T entity) {
        return getDao().save(entity);
    }

    @Override
    public T findById(ID id) {
         Optional<T> obj=getDao().findById(id);
        if(obj.isPresent()){
            return obj.get();
        }
        return null;
    }

    @Override
    public List<T> findByAll() {
         
        List<T> list=new ArrayList<>();
        
        getDao().findAll().forEach(obj-> list.add(obj));
        return list;
    }

    @Override
    public void delete(ID id) {
        
        getDao().deleteById(id);
    }
    
    public abstract CrudRepository<T,ID> getDao();
}
