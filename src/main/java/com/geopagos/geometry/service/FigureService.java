package com.geopagos.geometry.service;

import com.geopagos.geometry.domain.*;
import com.geopagos.geometry.repository.ICircleRepository;
import com.geopagos.geometry.repository.IFigureRepository;
import com.geopagos.geometry.repository.ISquareRepository;
import com.geopagos.geometry.repository.ITriangleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

@Service
public class FigureService {

    @Autowired
    private IFigureRepository figureRepository;
    @Autowired
    private ISquareRepository squareRepository;
    @Autowired
    private ITriangleRepository triangleRepository;
    @Autowired
    private ICircleRepository circleRepository;

    public IFigure create(String type) throws Exception{
        GeometricType geometricType = GeometricType.valueOf(type.toUpperCase());
        IFigure figure;
        switch (geometricType){
            case CIRCLE:
                figure = new Circle(Math.random() * 100);
                circleRepository.save(figure);
                break;
            case TRIANGLE:
                figure = new Triangle(Math.random() * 100,Math.random() * 100);
                triangleRepository.save(figure);
                break;
            case SQUARE:
                figure = new Square(Math.random() * 100);
                squareRepository.save(figure);
                break;
            default:
                throw new NotImplementedException();
        }
        return figure;
    }

    public List<IFigure> getAll() {
        return figureRepository.findAll();
    }
}
