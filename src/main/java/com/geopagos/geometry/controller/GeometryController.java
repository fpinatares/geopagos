package com.geopagos.geometry.controller;

import com.geopagos.geometry.domain.IFigure;
import com.geopagos.geometry.service.FigureService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.Map;

@RestController
@EnableAutoConfiguration
public class GeometryController {

    @Autowired
    private FigureService figureService;

    Logger logger = LoggerFactory.getLogger(GeometryController.class);

    @PostMapping(value = "/figures", consumes = "application/json", produces = "application/json")
    ResponseEntity<IFigure> create(@RequestBody Map<String, String> request){
        try {
            IFigure figure = figureService.create(request.get("type"));

            return ResponseEntity.ok()
                    .header("Content-type", "application/json")
                    .body(figure);
        } catch (IllegalArgumentException | NotImplementedException ex){
            logger.error(ex.getMessage());
            return ResponseEntity.badRequest().body(null);
        } catch (Exception ex){
            logger.error(ex.getMessage());
            return ResponseEntity.status(500).body(null);
        }
    }

    @GetMapping("/figures")
    public ResponseEntity<List<IFigure>> getFigures(){
        List<IFigure> figures = figureService.getAll();
        return ResponseEntity.ok()
                .header("Content-type", "application/json")
                .body(figures);
    }
}
