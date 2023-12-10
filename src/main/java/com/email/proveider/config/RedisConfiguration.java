//package com.email.proveider.config;
//
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class RedisConfiguration {
//
//	@Bean
//    public StringRedisTemplate stringRedisTemplate(RedisConnectionFactory redisConnectionFactory) {
//        StringRedisTemplate template = new StringRedisTemplate();
//        template.setConnectionFactory(redisConnectionFactory);
//        template.setKeySerializer(new StringRedisSerializer());
//        template.setValueSerializer(new StringRedisSerializer());
//        return template;
//    }
//	
//}
