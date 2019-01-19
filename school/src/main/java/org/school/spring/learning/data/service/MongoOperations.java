package org.school.spring.learning.data.service;

import java.io.Serializable;
import java.util.concurrent.Future;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.repository.CrudRepository;

public class MongoOperations<T> implements CrudRepository<T, Serializable>{

	@Override
	public <S extends T> S save(S entity) {
	
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends T> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T findOne(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Serializable id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<T> findAll(Iterable<Serializable> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Serializable id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends T> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}
