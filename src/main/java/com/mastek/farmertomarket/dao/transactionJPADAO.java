package com.mastek.farmertomarket.dao;

import org.springframework.data.repository.CrudRepository;

import com.mastek.farmertomarket.entities.transaction;

public interface transactionJPADAO extends CrudRepository<transaction, Integer>{

}
