package com.zbb.jdk.comm;

import java.util.Optional;

/**
 * 描述：
 *
 * @author bbzhou
 * @created 2018/11/24
 */
public class Car {

    // 保险
    private Insurance insurance;

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public Optional<Insurance> getInsuranceOptional(){
        return Optional.ofNullable(insurance);
    }
}
