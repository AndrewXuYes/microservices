package com.xuzhennan.top.component;


import org.redisson.api.RLock;

import java.util.concurrent.TimeUnit;

/**
 * @author andrew
 * @date 2020/6/23 15:20
 */

public interface DistributedLocker {
    RLock lock(String lockKey);

    RLock lock(String lockKey, long timeout);

    RLock lock(String lockKey, TimeUnit unit, long timeout);

    boolean tryLock(String lockKey, TimeUnit unit, long waitTime, long leaseTime);

    void unlock(String lockKey);

    void unlock(RLock lock);

}
