package com.geopagos.geometry.domain;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "figures")
public class Circle extends Figure {

    double radius;

    public Circle(double radius){
        super.type = GeometricType.CIRCLE;
        this.radius = radius;
    }

    @Override
    public Double getArea() {
        Long area = Math.round(Math.PI * this.radius * this.radius);
        return area.doubleValue();
    }

    @Override
    public Double getBase() { return null; }

    @Override
    public Double getHeight() {
        return null;
    }

    @Override
    public Double getDiameter() {
        return radius * 2;
    }
}
