package com.zbb.jdk.jdk8Test.optional;

import com.zbb.jdk.comm.OptionalUtil;

import java.util.Optional;
import java.util.Properties;

/**
 * 描述：
 *  配置文件
 * @author bbzhou
 * @created 2018/11/24
 */
public class PropertyOptional {

    public static void main(String[] args) {
        Properties properties = setPropertyValue();

        int valueFromProperty = getValueFromProperty(properties, "b");
        System.out.println(valueFromProperty);

    }

    private static int getValueFromProperty(Properties properties, String key) {
        return Optional.ofNullable(properties)
                .flatMap(p -> OptionalUtil.stringToInt(p.getProperty(key)))
                .filter(i -> i > 0)
                .orElse(0);
    }

    private static Properties setPropertyValue() {
        Properties props = new Properties();
        props.setProperty("a", "5");
        props.setProperty("b", "true");
        props.setProperty("c", "-3");
        props.setProperty("d", "10");
        return props;
    }


}
