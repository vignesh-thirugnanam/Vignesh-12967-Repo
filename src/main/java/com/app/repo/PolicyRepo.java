package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.app.pojo.PolicyDetails;

public interface PolicyRepo extends JpaRepository<PolicyDetails, Integer>{

}
