package com.one.clxj.service.impl;

import com.one.clxj.pojo.Organization;
import com.one.clxj.service.OrganizationSer;
import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Transactional;@Service
@Transactional public  class OrganizationSerImpl extends SuperServiceImpl<Organization>implements OrganizationSer {}