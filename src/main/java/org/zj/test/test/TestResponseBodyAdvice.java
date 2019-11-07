package org.zj.test.test;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @ProjectName: test
 * @ClassName: TestResponseBodyAdvince
 * @Description: 统一的响应返回
 * @Author: ZhangJun
 * @Date: 2019/11/7 15:28
 */
@ControllerAdvice(basePackages = "org.zj.test.test")
public class TestResponseBodyAdvice<T> implements ResponseBodyAdvice<T> {
    @Override
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
        return methodParameter.getParameterType()!=Result.class;
    }

    @Override
    public T beforeBodyWrite(T t, MethodParameter methodParameter, MediaType mediaType, Class<? extends HttpMessageConverter<?>> aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        Result<T> tResult = new Result<>();
        tResult.setCode(200);
        tResult.setMessage("操作成功");
        tResult.setData(t);
        return (T) tResult;
    }
}
