package xam.cross.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import xam.cross.jba.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
