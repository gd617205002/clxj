package com.one.clxj.configruation;

import com.one.clxj.util.DateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.support.GenericConversionService;
import org.springframework.web.bind.support.ConfigurableWebBindingInitializer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import javax.annotation.PostConstruct;

@Configuration
public class WebSocketConfig {
//    socket暂时有bug，先不配置
//    @Bean
   /*public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }*/
    /**
     * 配置日期转换器
     */
   @Autowired
    private RequestMappingHandlerAdapter handlerAdapter;

    @PostConstruct
    public void initEditableAvlidation(){
        ConfigurableWebBindingInitializer initializer = (ConfigurableWebBindingInitializer)handlerAdapter.getWebBindingInitializer();
        if(initializer.getConversionService()!=null) {
            GenericConversionService genericConversionService = (GenericConversionService) initializer.getConversionService();
            genericConversionService.addConverter(new DateFormat());//添加自定义的类型转换器
        }
    }
}

