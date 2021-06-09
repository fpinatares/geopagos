package com.geopagos.geometry.domain;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "figures")
public class Triangle extends Figure {

    double base;

    double height;

    public Triangle(double base, double height){
        super.type = GeometricType.TRIANGLE;
        this.base = base;
        this.height = height;
    }

    public Double getBase() { return this.base; }

    public Double getHeight() {
        return this.height;
    }

    public Double getArea() {
        return (this.base * this.height) / 2;
    }

    public Double getDiameter() {
        return null;
    }

}
