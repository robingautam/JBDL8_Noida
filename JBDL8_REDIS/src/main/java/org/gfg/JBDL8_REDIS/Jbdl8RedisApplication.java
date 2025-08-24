package org.gfg.JBDL8_REDIS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class Jbdl8RedisApplication implements CommandLineRunner {

	@Autowired
	RedisTemplate<String,String> redisTemplate;

	/*@Autowired
	RedisUtil<String,String> redisUtil;*/

	public static void main(String[] args) {
		SpringApplication.run(Jbdl8RedisApplication.class, args);
	}

	@Bean
	public RedisTemplate<String,String> redisTemplate(RedisConnectionFactory connection){
		RedisTemplate<String,String> redisTemplate1 = new RedisTemplate<>();

		LettuceConnectionFactory lettuceConnectionFactory = new LettuceConnectionFactory();
		lettuceConnectionFactory.setHostName("localhost");
		lettuceConnectionFactory.setPort(6379);

		redisTemplate1.setConnectionFactory(lettuceConnectionFactory);
		redisTemplate1.setKeySerializer(new StringRedisSerializer());
		redisTemplate1.setValueSerializer(new StringRedisSerializer());

		return redisTemplate1;
	}


	@Override
	public void run(String... args) throws Exception {
		/*redisTemplate.opsForValue().set("robin","971768372362");

		String mobile = redisTemplate.opsForValue().get("robin");

		System.out.println(mobile);*/

		/*redisUtil.setDataExpirable("aakash","aakash@gmail.com", 20, TimeUnit.SECONDS);

		String data = redisUtil.geData("11111");

		System.out.println(data);*/

		redisTemplate.opsForValue().set("hi", "hello");

		System.out.println(redisTemplate.opsForValue().get("hi"));

	}
}
