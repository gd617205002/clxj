package com.one.clxj.service.impl;

import com.one.clxj.pojo.City;
import com.one.clxj.service.CitySer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CitySerImpl extends SuperServiceImpl<City> implements CitySer {
}