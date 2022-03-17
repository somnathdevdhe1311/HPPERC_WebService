package com.hpperc.repository;

import javax.transaction.Transactional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.hpperc.model.User;

@Transactional
@Repository
public interface LoginRepositoty extends JpaRepository<User,Long>{

	@Query("select u from User u where u.username=:username and u.password=:password")
	User findUser(String username, String password);

}
