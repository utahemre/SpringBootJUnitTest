/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yeo.springbootjunittest.business;

import com.yeo.springbootjunittest.jpa.model.Feature;
import com.yeo.springbootjunittest.jpa.service.FeatureService;
import java.util.LinkedList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;

/**
 *
 * @author yunusemreozkaya
 */
public class FeatureBusinessTest {
    
    public FeatureBusinessTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
    
    @After
    public void tearDown() {
    }
    
    @InjectMocks
    FeatureBusiness aFeatureBusiness = new FeatureBusiness();

    @Mock
    FeatureService aFeatureService;

    /**
     * Test of calculateTotalAttrbiuteCount method, of class FeatureBusiness.
     */
    @Test
    public void testCalculateTotalAttrbiuteCount() {
        
        when(aFeatureService.getFeatureAttributeCount(Mockito.any(Feature.class))).thenReturn(15);
        
        List<Feature> features = new LinkedList<>();
        Feature aFeature = new Feature();
        features.add(aFeature);
        Feature aFeature2 = new Feature();
        features.add(aFeature2);
        Assert.assertEquals(30, aFeatureBusiness.calculateTotalAttrbiuteCount(features));
    }
    
}
