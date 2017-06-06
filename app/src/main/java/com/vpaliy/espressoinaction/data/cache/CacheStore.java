package com.vpaliy.espressoinaction.data.cache;

import android.util.SparseArray;

public class CacheStore<T> {

    private SparseArray<T> inMemoryCache;

    public CacheStore(int size){
        this.inMemoryCache=new SparseArray<>(size);
    }

    public void put(int key, T item){
        inMemoryCache.put(key,item);
    }

    public boolean isInCache(int key){
        return inMemoryCache.get(key,null)!=null;
    }

    public T get(int key){
        return inMemoryCache.get(key);
    }

}
