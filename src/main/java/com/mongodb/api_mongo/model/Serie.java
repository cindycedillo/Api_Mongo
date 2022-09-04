/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mongodb.api_mongo.model;

import org.springframework.data.annotation.Id;

/**
 *
 * @author TUF Gaming
 */
public class Serie {
    
    @Id
    Long id;
    String nombre_serie;
    Integer episodios;
    Integer temporadas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre_serie() {
        return nombre_serie;
    }

    public void setNombre_serie(String nombre_serie) {
        this.nombre_serie = nombre_serie;
    }

    public Integer getEpisodios() {
        return episodios;
    }

    public void setEpisodios(Integer episodios) {
        this.episodios = episodios;
    }

    public Integer getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Integer temporadas) {
        this.temporadas = temporadas;
    }

    
    
    
    
}
