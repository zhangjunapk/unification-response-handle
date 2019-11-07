package org.zj.test.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: test
 * @ClassName: TestController
 * @Description: 测试控制器
 * @Author: ZhangJun
 * @Date: 2019/11/7 15:18
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/t")
    public Student ttt() throws TestException {
        Result<Student> studentResult = new Result<>();
        studentResult.setCode(1);
        studentResult.setMessage("成功");
//        throw new TestException("我故意的");
        Student student = new Student();
        student.setName("李四");
        student.setPassword("ffff");
        return student;
    }
}
