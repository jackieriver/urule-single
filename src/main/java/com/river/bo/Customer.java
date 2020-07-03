package com.river.bo;

import com.bstek.urule.model.Label;
import lombok.Data;

@Data
public class Customer {
    @Label("id")
    private Long id;

    private String name;

    private Integer age;

    private Integer status;
}
