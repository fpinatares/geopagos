package com.geopagos.geometry.repository;

import com.geopagos.geometry.domain.IFigure;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITriangleRepository extends MongoRepository<IFigure, Integer> {

}
