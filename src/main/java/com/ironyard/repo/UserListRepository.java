package com.ironyard.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ironyard.springboot.data.UserList;

public interface UserListRepository extends PagingAndSortingRepository<UserList,Long> {

}

