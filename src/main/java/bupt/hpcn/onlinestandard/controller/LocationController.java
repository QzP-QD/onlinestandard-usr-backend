package bupt.hpcn.onlinestandard.controller;

import bupt.hpcn.onlinestandard.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/location")
public class LocationController {
    @Autowired
    private LocationService locationService;

    @RequestMapping("/getProv")
    public Object getProv(){
        return locationService.getProvince();
    }

    @RequestMapping("/getCity")
    public Object getCity(){
        return locationService.getCity();
    }
}
