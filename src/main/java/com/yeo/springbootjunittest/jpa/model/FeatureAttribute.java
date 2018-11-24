/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yeo.springbootjunittest.jpa.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author yunusemreozkaya
 */
@Entity
public class FeatureAttribute implements Serializable {

    @Id
    private Long id;
    private String attributeName;

    public FeatureAttribute() {
    }

    public FeatureAttribute(Long id, String attributeName) {
        this.id = id;
        this.attributeName = attributeName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setName(String attributeName) {
        this.attributeName = attributeName;
    }

}
