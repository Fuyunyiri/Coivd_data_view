package com.covid.covid.controller;

import com.covid.covid.pojo.Country;
import com.covid.covid.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @author 李珈鋆
 * @version 1.0
 */

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class CountryController {

    @Autowired
    private CountryService countryService;


    @RequestMapping("/selectByMonth")
    public List<Country> getCountryDataByMonth(@RequestParam("date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
        return countryService.getCountryDataByMonth(date);
    }

}
