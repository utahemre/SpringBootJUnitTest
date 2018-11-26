/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yeo.springbootjunittest.business;

import com.yeo.springbootjunittest.jpa.model.Feature;
import com.yeo.springbootjunittest.jpa.service.FeatureService;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author yunusemreozkaya
 */
public class FeatureBusiness {
    
    @Autowired
    FeatureService aFeatureService;
    
    
    public int calculateTotalAttrbiuteCount(List<Feature> features){
        
        AtomicInteger totalCount = new AtomicInteger(0);
        features.stream().forEach((feature) -> {
            totalCount.addAndGet(aFeatureService.getFeatureAttributeCount(feature));
        });
        
        return totalCount.get();
    }
    
    
    
}
