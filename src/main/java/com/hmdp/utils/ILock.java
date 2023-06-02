package com.hmdp.utils;

/**
 * @author YJ
 * @create 2023-05-25 18:22
 */
public interface ILock {
    //尝试获取锁
    boolean tryLock(long timeoutSec);

    //释放锁
    void unlock();

}
