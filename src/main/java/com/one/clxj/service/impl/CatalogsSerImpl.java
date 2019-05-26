package com.one.clxj.service.impl;

import com.one.clxj.pojo.Catalogs;
import com.one.clxj.service.CatalogsSer;
import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Transactional;@Service
@Transactional public  class CatalogsSerImpl extends SuperServiceImpl<Catalogs>implements CatalogsSer {}