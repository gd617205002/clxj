package com.one.clxj.util;

import org.springframework.data.redis.core.RedisTemplate;
import java.util.Collection;
import java.util.List;

/**
 * redis工具类
 */
public class RedisUtils {
    /*---------------------------------------------------------------普通缓存--------------------------------------------------*/
    /**
     * 普通缓存方法
     * @param key
     * @param object
     * @return
     */
    public static boolean set(final Object key,Object object,RedisTemplate redisTemplate){
        try{
            redisTemplate.opsForValue().set(key,object);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 普通缓存获取
     * @param key
     * @return
     */
   public static Object get(final Object key,RedisTemplate redisTemplate){
        return key==null?null:redisTemplate.opsForValue().get(key);
   }


    /*------------------------------------------------------对list的相关操作---------------------------------------------------------*/
    /**
     * 往List中存入数据
     *
     * @param key Redis键
     * @param value 数据
     * @return 存入的个数
     */
    public static long lPush(final Object key, final Object value,RedisTemplate redisTemplate) {
        Long count = redisTemplate.opsForList().rightPush(key, value);
        return count == null ? 0 : count;
    }

    /**
     * 往List中存入多个数据
     * @param key Redis键
     * @param values 多个数据
     * @return 存入的个数
     */
    public static long lPushAll(final Object key, final Collection<Object> values,RedisTemplate redisTemplate) {
        Long count = redisTemplate.opsForList().rightPushAll(key, values);
        return count == null ? 0 : count;
    }

    /**
     * 往List中存入多个数据
     *
     * @param key Redis键
     * @param values 多个数据
     * @return 存入的个数
     */
    public static long lPushAll(final Object key,RedisTemplate redisTemplate, final Object... values) {
        Long count = redisTemplate.opsForList().rightPushAll(key, values);
        return count == null ? 0 : count;
    }

    /**
     * 从List中获取begin到end之间的元素
     *
     * @param key Redis键
     * @param start 开始位置
     * @param end 结束位置（start=0，end=-1表示获取全部元素）
     * @return List对象
     */
    public static List<Object> lGet(final Object key, final int start, final int end,RedisTemplate redisTemplate) {
        return redisTemplate.opsForList().range(key, start, end);
    }

    /**
     * 判断key是否存在
     * @param key 键
     * @return true存在 false不存在
     */
    public static boolean hasKey(final Object key,RedisTemplate redisTemplate){
        try{
            return redisTemplate.hasKey(key);
        }catch (Exception e){
            e.printStackTrace();
            return  false;
        }
    }

    /*----------------------------------------------------删除key--------------------------------------------------*/
    /**
     * 删除单个key
     *
     * @param key 键
     * @return true=删除成功；false=删除失败
     */
    public static boolean del(final Object key,RedisTemplate redisTemplate) {

        Boolean ret = redisTemplate.delete(key);
        return ret != null && ret;
    }

    /**
     * 删除多个key
     *
     * @param keys 键集合
     * @return 成功删除的个数
     */
    public static long del(final Collection<Object> keys,RedisTemplate redisTemplate) {

        Long ret = redisTemplate.delete(keys);
        return ret == null ? 0 : ret;
    }
}
