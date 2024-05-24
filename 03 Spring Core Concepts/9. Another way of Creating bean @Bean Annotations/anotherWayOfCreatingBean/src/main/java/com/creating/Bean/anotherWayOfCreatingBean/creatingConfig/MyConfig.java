package com.creating.Bean.anotherWayOfCreatingBean.creatingConfig;

import com.creating.Bean.anotherWayOfCreatingBean.creatingBeanAnnotation.Samosa;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//4th way making myconfig class
@Configuration
public class MyConfig {
    @Bean(name ="samosa1")
	public Samosa getSamosa1()
	{
		return new Samosa("Tandoori Samosa");
	}

	@Bean(name ="samosa2")
	public Samosa getSamosa2()
	{
		return new Samosa("Meeta Samosa");
	}
}
