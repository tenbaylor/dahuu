package com.dahuu.core.error;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author
 * @deprecated
 */
@ControllerAdvice
public class GlobalExceptionHandle {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandle.class);

    /**
     * 运行时异常
     *
     * @param exception
     * @return
     */
    @ExceptionHandler({RuntimeException.class})
//    @ResponseStatus(HttpStatus.OK)
    public ModelAndView processException(RuntimeException exception) {
        logger.info("自定义异常处理-RuntimeException:" + exception.getMessage());
        exception.printStackTrace();
        ModelAndView m = new ModelAndView();
        m.addObject("exception", exception.getMessage());
        m.setViewName("error/500");
        return m;

    }

    /**
     * Excepiton异常
     *
     * @param exception
     * @return
     */
    @ExceptionHandler({Exception.class})
//    @ResponseStatus(HttpStatus.OK)
    public ModelAndView processException(Exception exception) {
        logger.info("自定义异常处理-Exception:" + exception.getMessage());
        exception.printStackTrace();
        ModelAndView m = new ModelAndView();
        m.addObject("exception", exception.getMessage());
        m.setViewName("error/500");
        return m;

    }


}
