package com.covid.covid.mapper;

import com.covid.covid.pojo.Country;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

/**
 * @author 李珈鋆
 * @version 1.0
 */
@Mapper
public interface CountryMapper {
    List<Country> getCountryDataByMonth(Date date);
}
