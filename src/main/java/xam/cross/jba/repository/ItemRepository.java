package xam.cross.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import xam.cross.jba.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
