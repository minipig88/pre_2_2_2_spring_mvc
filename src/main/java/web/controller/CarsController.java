package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import web.service.CarService;

@Controller
@RequestMapping("/")

public class CarsController {
    @Autowired
    private CarService carService;

    @RequestMapping(value = "cars", method = RequestMethod.GET)
    public String AllCarsList(ModelMap model) {
        model.addAttribute("cars", carService.getAllCar());
        return "cars";
    }
}
