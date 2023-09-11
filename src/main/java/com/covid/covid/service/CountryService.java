package com.covid.covid.service;

import com.covid.covid.mapper.CountryMapper;
import com.covid.covid.pojo.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author 李珈鋆
 * @version 1.0
 */

@Service
public class CountryService {

    @Autowired
    private CountryMapper countryMapper;

    public List<Country> getCountryDataByMonth(Date date){
        return countryMapper.getCountryDataByMonth(date);
    }

}
