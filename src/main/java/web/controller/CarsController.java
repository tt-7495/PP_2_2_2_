package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;
import web.Service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @Autowired
    private CarService carServ;

    @GetMapping(value = "/cars")
    public String printCar(ModelMap model) {
        model.addAttribute("cars", carServ.index());
        return "cars";
    }

    @GetMapping(value = "/cars", params = "count")
    public String getCars(@RequestParam(name = "count", required = false) int count, ModelMap model) {
        model.addAttribute("cars", carServ.getCars(count));
        return "cars";
    }
}
