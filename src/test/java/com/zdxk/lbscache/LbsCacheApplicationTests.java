package com.zdxk.lbscache;

import com.zdxk.lbscache.component.LbsConf;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LbsCacheApplicationTests {

	@Autowired
	LbsConf lbsConf;


	@Test
	public void contextLoads() {
		System.out.print(lbsConf.getApi());
	}

}

