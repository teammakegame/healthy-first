package com.lhtrung.healthyfirst.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Collection;

@Component
public class Area {
    private String area_code;
    private String area_name;
    private String area_type;
    private Boolean is_managed;

    public Boolean getIs_managed() {
        return is_managed;
    }

    public void setIs_managed(Boolean is_managed) {
        this.is_managed = is_managed;
    }

    public String getArea_code() {
        return area_code;
    }

    public void setArea_code(String area_code) {
        this.area_code = area_code;
    }

    public String getArea_name() {
        return area_name;
    }

    public void setArea_name(String area_name) {
        this.area_name = area_name;
    }

    public String getArea_type() {
        return area_type;
    }

    public void setArea_type(String area_type) {
        this.area_type = area_type;
    }
}
