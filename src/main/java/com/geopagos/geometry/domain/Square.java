package com.geopagos.geometry.domain;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "figures")
public class Square extends Figure {

    private double base;

    public Square(double base){
        super.type = GeometricType.SQUARE;
        this.base = base;
    }

    @Override
    public Double getArea() { return this.base * this.base; }

    @Override
    public Double getBase() { return this.base; }

    @Override
    public Double getHeight() { return this.base; }

    @Override
    public Double getDiameter() { return null; }

}
