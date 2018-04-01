package me.pregroup.h2o.data.repository;

import me.pregroup.h2o.data.entity.Buyer;
import org.springframework.data.repository.CrudRepository;

public interface BuyerRepository extends CrudRepository<Buyer, Long> {
}
