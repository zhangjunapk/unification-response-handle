package org.zj.test.test;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;

import javax.servlet.http.HttpServletRequest;

/**
 * @ProjectName: test
 * @ClassName: ResultHandler
 * @Description: 返回结果处理
 * @Author: ZhangJun
 * @Date: 2019/11/7 15:21
 */
@ControllerAdvice
public class ResultHandler extends ExceptionHandlerExceptionResolver {
    @ResponseBody
    @ExceptionHandler(TestException.class)
    public <T>Result<T> handle(HttpServletRequest request,TestException exception){
        Result<T> objectResult = new Result<>();
        objectResult.setMessage(exception.getMessage());
        objectResult.setCode(400000);
        return objectResult;
    }
}
