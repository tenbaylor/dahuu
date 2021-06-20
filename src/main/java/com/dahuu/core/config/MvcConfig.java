package com.dahuu.core.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.resource.VersionResourceResolver;


/**
 * @author
 */
@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

    /**
     * 静态资源路径配置
     *
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/")
                .resourceChain(false) //
                .addResolver(new VersionResourceResolver()
                        .addFixedVersionStrategy("1.0.0", "/static/**"));
    }
}
