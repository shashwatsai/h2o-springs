package me.pregroup.h2o.data.repository;

import me.pregroup.h2o.data.entity.Order;
import org.springframework.data.repository.CrudRepository;

import java.sql.Date;
import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {
    List<Order> findByDate(Date date);
}
