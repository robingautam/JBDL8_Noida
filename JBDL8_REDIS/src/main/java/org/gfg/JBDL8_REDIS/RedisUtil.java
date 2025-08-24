package org.gfg.JBDL8_REDIS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class RedisUtil<K,D> {

    @Autowired
    RedisTemplate<K,D> redisTemplate;

    public void setData(K key, D data){
        redisTemplate.opsForValue().set(key,data);
    }

    public void setDataExpirable(K key, D data, long time, TimeUnit timeUnit){
        redisTemplate.opsForValue().set(key,data,time,timeUnit);
    }

    public D geData(K key){
        return redisTemplate.opsForValue().get(key);
    }

}
