package com.ironyard.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ironyard.springboot.data.User;

public interface UserRepository extends PagingAndSortingRepository<User, Long>{

}
