package com.zbb.jdk.io.serializable;

import com.thoughtworks.xstream.XStream;

public class XStreamSerializable implements ISerializable {

    private XStream xStream = new XStream();

    @Override
    public <T> byte[] serializable(T obj) {
        return xStream.toXML(obj).getBytes();
    }

    @Override
    public <T> T deSerializable(byte[] bytes, Class<T> t) {
        return (T) xStream.fromXML(new String(bytes));
    }
}
