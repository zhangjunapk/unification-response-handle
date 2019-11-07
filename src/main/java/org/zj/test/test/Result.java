package org.zj.test.test;

/**
 * @ProjectName: test
 * @ClassName: Result
 * @Description: 结果
 * @Author: ZhangJun
 * @Date: 2019/11/7 15:19
 */
public class Result<T> {
    private int code;
    private String message;
    private T data;

    public int getCode() {
        return code;
    }

    public Result setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Result setMessage(String message) {
        this.message = message;
        return this;
    }

    public T getData() {
        return data;
    }

    public Result setData(T data) {
        this.data = data;
        return this;
    }
}
