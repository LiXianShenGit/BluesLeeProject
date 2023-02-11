package io.renren.test;

import org.springframework.stereotype.Component;

/**
 * @author Mr Li
 * @date 2021-05-26下午 10:40
 */
@Component
public class TestCompont {

    public String testMethod(int score){
        String result;
        if (score > 90) {
            result = "优秀";
        } else if (score < 90 && score >= 75) {
            result = "良好";
        } else if (score >= 60) {
            result = "合格";
        } else if (score > 40) {
            result = "不合格";
        } else if (score >= 0) {
            result = "差";
        } else {
            result = "成绩格式不正确";
        }
        return result;
    }
}
