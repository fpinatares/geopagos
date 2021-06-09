package com.geopagos.geometry.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "figures")
public abstract class Figure implements IFigure {

    @Id
    private String id;

    public GeometricType type;
}
