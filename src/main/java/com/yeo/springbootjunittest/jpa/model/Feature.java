/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yeo.springbootjunittest.jpa.model;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author yunusemreozkaya
 */

@Entity
public class Feature implements Serializable {
    
    @Id
    private Long id;
    private String name;
    
    @OneToMany
    private List<FeatureAttribute> attributes;

    public Feature(){
        attributes = new LinkedList<>();
    }
    
    public Feature(Long id, String name) {
        attributes = new LinkedList<>();
        this.id = id;
        this.name = name;
    }
    
    public int getAttributeCount(){
        return attributes.size();
    }
    
    public Feature(String name) {
        this.name = name;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<FeatureAttribute> getAttributes() {
        return attributes;
    }

}
