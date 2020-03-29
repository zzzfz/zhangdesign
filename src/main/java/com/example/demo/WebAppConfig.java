package com.example.demo;

//import com.example.demo.portal.admin.login.controller.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebAppConfig implements WebMvcConfigurer {

//    @Bean
//    public HandlerInterceptor getLoginInterceptor(){
//        return new LoginInterceptor();
//    }

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        注册自定义拦截器，添加拦截路径和排除拦截路径
//        registry.addInterceptor(getLoginInterceptor()).
//                addPathPatterns("/**").
//                excludePathPatterns("/index.jsp","/","/js/**","/css/**","/login","/img/**");
////    }
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry){
//        registry.addResourceHandler("/**").addResourceLocations("/");
//        WebMvcConfigurer.super.addResourceHandlers(registry);
//    }
    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowCredentials(true)
                .allowedMethods(HttpMethod.GET.name(),HttpMethod.POST.name(),HttpMethod.OPTIONS.name())
                .allowedHeaders(HttpHeaders.AUTHORIZATION,HttpHeaders.CONTENT_TYPE,"accessToken","CorrelationId","source")
                .exposedHeaders(HttpHeaders.AUTHORIZATION,HttpHeaders.CONTENT_TYPE,"accessToken","CorrelationId","source")
                .maxAge(4800);
    }


}
