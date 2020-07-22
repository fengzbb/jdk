package com.zbb.jdk.io.serializable;

public interface ISerializable {

    <T> byte[] serializable(T obj);

    <T>  T deSerializable(byte[] bytes, Class<T> t);
}
