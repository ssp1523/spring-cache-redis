package com.ssp.cache;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

/**
 * @author: sunshaoping
 * @date: Create by in 5:20 PM 2018/12/3
 */
@ConfigurationProperties("spring.cache.redis")
public class RedisCacheProperties {

    /**
     * Entry expiration. By default the entries never expire.
     */
    private Long defaultExpiration;

    /**
     * Allow caching null values.
     */
    private boolean cacheNullValues = true;

    /**
     * Key prefix.
     */
    private String keyPrefix = "spring-cache";

    /**
     * Whether to use the key prefix when writing to Redis.
     */
    private boolean useKeyPrefix = true;


    private Map<String, Long> expires;



    public boolean isCacheNullValues() {
        return cacheNullValues;
    }

    public void setCacheNullValues(boolean cacheNullValues) {
        this.cacheNullValues = cacheNullValues;
    }

    public String getKeyPrefix() {
        return keyPrefix;
    }

    public void setKeyPrefix(String keyPrefix) {
        this.keyPrefix = keyPrefix;
    }

    public boolean isUseKeyPrefix() {
        return useKeyPrefix;
    }

    public void setUseKeyPrefix(boolean useKeyPrefix) {
        this.useKeyPrefix = useKeyPrefix;
    }

    public Long getDefaultExpiration() {
        return defaultExpiration;
    }

    public void setDefaultExpiration(Long defaultExpiration) {
        this.defaultExpiration = defaultExpiration;
    }

    public Map<String, Long> getExpires() {
        return expires;
    }

    public void setExpires(Map<String, Long> expires) {
        this.expires = expires;
    }
}
