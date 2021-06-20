package com.dahuu.core.error;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//import com.yd.ibuznet.core.framework.response.Response;

/**
 * <p>
 * 描述:
 * </p>
 * <p>
 * 版本1.0: 2017年2月21日 新建
 * </p>
 *
 * @author
 * @version 1.0
 * @deprecated
 */
//@Controller
//@RequestMapping(value = "error")
public class MainsiteErrorController implements ErrorController {


    //	@RequestMapping(value="403",produces = "text/html")
//    public String html403Error(){ 
//        return "403";  
//    }  
//    @RequestMapping("403")  
//    @ResponseBody
//    public Response json403Error(){ 
//    	Response response = new Response();
//    	response.setCodeAndMsg("403", "访问的资源无权限");
//        return response;  
//    }  
//	@RequestMapping(value="404",produces = "text/html")  
//    public String html404Error(){ 
//        return "404";  
//    }  
//    @RequestMapping("404")  
//    @ResponseBody
//    public Response json404Error(){ 
//    	Response response = new Response();
//    	response.setCodeAndMsg("404", "访问的资源不存在");
//        return response;  
//    }  
//    @RequestMapping(value="500",produces = "text/html")  
//    public String html500Error(){ 
//        return "500";  
//    }  
//    @RequestMapping("500")  
//    @ResponseBody
//    public Response json500Error(){ 
//    	Response response = new Response();
//    	response.setCodeAndMsg("500", "访问的资源有问题");
//        return response;  
//    } 
//    public String error(){ 
//    	return "redirect:login";
//    } 
//    
//    
//    
    @Override
    public String getErrorPath() {
        return null;
    }
}
