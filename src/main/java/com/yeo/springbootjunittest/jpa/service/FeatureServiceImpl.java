/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yeo.springbootjunittest.jpa.service;

import com.yeo.springbootjunittest.jpa.model.Feature;
import com.yeo.springbootjunittest.jpa.model.FeatureAttribute;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author yunusemreozkaya
 */

@Service
public class FeatureServiceImpl implements FeatureService {

    @Override
    public boolean addNewFeature(Feature aFeature, FeatureAttribute aFeatureAttribute) {
        return aFeature.getAttributes().add(aFeatureAttribute);
    }
    
    @Override
    public int getFeatureAttributeCount(Feature aFeature) {
        return aFeature.getAttributes().size();
    }

    @Override
    public boolean removeFeatureById(Feature aFeature, Long id) {
        
        Optional<FeatureAttribute> findFirst = aFeature.getAttributes().stream().filter(aFetureAttribute -> aFetureAttribute.getId().longValue() == id).findFirst();
        return aFeature.getAttributes().remove(findFirst.get());
    }

}
