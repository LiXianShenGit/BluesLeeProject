package io.renren;

import io.renren.common.utils.RedisUtils;
import io.renren.modules.sys.entity.SysUserEntity;
import io.renren.test.TestCompont;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {
	@Autowired
	private RedisUtils redisUtils;
    @Autowired
    private TestCompont testCompont;


	@Test
	public void contextLoads() {

		SysUserEntity user = new SysUserEntity();
		user.setEmail("qqq@qq.com");
		redisUtils.set("user", user);

		System.out.println(ToStringBuilder.reflectionToString(redisUtils.get("user", SysUserEntity.class)));
	}

	@Test
	public void tetsMethod(){
        Assert.assertEquals("良好",testCompont.testMethod(89));

    }

}
