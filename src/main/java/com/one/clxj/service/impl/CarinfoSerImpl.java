package com.one.clxj.service.impl;

import com.one.clxj.pojo.Carinfo;
import com.one.clxj.service.CarinfoSer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CarinfoSerImpl extends SuperServiceImpl<Carinfo> implements CarinfoSer {


}
