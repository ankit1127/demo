package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {

   // select * from user where id = 2 and name = "xyz"

    User findByIdAndFirstName(Long id,String firstName);

    @Query(value = "select count(*) from user",nativeQuery = true)
    Long countUsers();

}
