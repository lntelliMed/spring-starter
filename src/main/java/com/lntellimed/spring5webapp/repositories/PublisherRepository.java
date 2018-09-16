package com.lntellimed.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.lntellimed.spring5webapp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
