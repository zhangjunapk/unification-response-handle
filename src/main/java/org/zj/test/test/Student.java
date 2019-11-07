package org.zj.test.test;

/**
 * @ProjectName: test
 * @ClassName: Student
 * @Description: 学生
 * @Author: ZhangJun
 * @Date: 2019/11/7 15:18
 */
public class Student {
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Student setPassword(String password) {
        this.password = password;
        return this;
    }
}
