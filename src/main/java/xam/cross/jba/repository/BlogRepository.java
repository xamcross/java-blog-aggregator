package xam.cross.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import xam.cross.jba.entity.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer> {

}
