package com.csr.springmvc.dao;

import java.util.List;
 
import com.csr.springmvc.model.UserProfile;
 
 
public interface UserProfileDao {
 
    List<UserProfile> findAll();
     
    UserProfile findByType(String type);
     
    UserProfile findById(int id);
}