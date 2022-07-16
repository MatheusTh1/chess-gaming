package controllers;

import models.PositionModels;
import org.springframework.beans.factory.annotation.Autowired;
import services.PositionService;

public class PositionControler {

    @Autowired
    PositionService positionService;

    public PositionModels startGaming(){
         var start = positionService.enterValues();
        return start;
    }
}
