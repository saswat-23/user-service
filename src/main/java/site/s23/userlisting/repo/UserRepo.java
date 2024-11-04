package site.s23.userlisting.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import site.s23.userlisting.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

}
