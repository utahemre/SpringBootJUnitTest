/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yeo.springbootjunittest.jpa.service;

import com.yeo.springbootjunittest.jpa.model.Feature;
import com.yeo.springbootjunittest.jpa.model.FeatureAttribute;

/**
 *
 * @author yunusemreozkaya
 */
public interface FeatureService {
    boolean addNewFeature(Feature aFeature, FeatureAttribute aFeatureAttribute);
    int getFeatureAttributeCount(Feature aFeature);
    boolean removeFeatureById(Feature aFeature, Long id);
}
