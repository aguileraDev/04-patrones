package org.example.controller;


import org.example.services.lodging.LodgingImpl;



/**
 * @author Manuel Aguilera / @aguileradev
 */
public class SearchLodgingController implements IController {
    private LodgingImpl lodgingService;


    public SearchLodgingController(LodgingImpl lodgingService) {
        this.lodgingService = lodgingService;

    }
    @Override
    public void execute() {
        lodgingService.searchLodging();
    }
}
