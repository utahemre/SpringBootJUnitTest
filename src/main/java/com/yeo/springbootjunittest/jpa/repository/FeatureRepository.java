/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yeo.springbootjunittest.jpa.repository;

import com.yeo.springbootjunittest.jpa.model.Feature;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author yunusemreozkaya
 */

@Repository
public interface FeatureRepository extends JpaRepository<Feature, Long>{
}
