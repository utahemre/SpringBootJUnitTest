/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yeo.springbootjunittest.jpa.service;

import com.yeo.springbootjunittest.jpa.model.Feature;
import com.yeo.springbootjunittest.jpa.model.FeatureAttribute;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yunusemreozkaya
 */
public class FeatureServiceImplTest {

    public FeatureServiceImplTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        //MockitoAnnotations.initMocks(this);
    }

    @After
    public void tearDown() {
    }

    /*@InjectMocks
    FeatureServiceImpl aFeatureServiceImpl = new FeatureServiceImpl();

    @Autowired
    FeatureService aFeatureService;*/
    /**
     * Test of addNewFeature method, of class FeatureServiceImpl.
     */
    @Test
    public void testAddNewFeature() {
        Feature aFeature = new Feature();
        FeatureAttribute aFeatureAttribute = new FeatureAttribute(100L, "attributeName100");
        FeatureServiceImpl aFeatureServiceImpl = new FeatureServiceImpl();
        assertTrue(aFeatureServiceImpl.addNewFeature(aFeature, aFeatureAttribute));
    }

    /**
     * Test of getFeatureAttributeCount method, of class FeatureServiceImpl.
     */
    @Test
    public void testGetFeatureAttributeCount() {
        Feature aFeature = new Feature();
        FeatureAttribute aFeatureAttribute = new FeatureAttribute(100L, "attributeName100");
        FeatureAttribute aFeatureAttribute2 = new FeatureAttribute(200L, "attributeName200");
        FeatureServiceImpl aFeatureServiceImpl = new FeatureServiceImpl();
        aFeatureServiceImpl.addNewFeature(aFeature, aFeatureAttribute);
        aFeatureServiceImpl.addNewFeature(aFeature, aFeatureAttribute2);
        assertEquals(aFeatureServiceImpl.getFeatureAttributeCount(aFeature), 2);
    }

    /**
     * Test of removeFeatureById method, of class FeatureServiceImpl.
     */
    @Test
    public void testRemoveFeatureById() {
        Feature aFeature = new Feature();
        FeatureAttribute aFeatureAttribute = new FeatureAttribute(100L, "attributeName100");
        FeatureServiceImpl aFeatureServiceImpl = new FeatureServiceImpl();
        aFeatureServiceImpl.addNewFeature(aFeature, aFeatureAttribute);
        assertTrue(aFeatureServiceImpl.removeFeatureById(aFeature, 100L));
        assertEquals(aFeatureServiceImpl.getFeatureAttributeCount(aFeature), 0);
    }

}
