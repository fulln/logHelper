package com.log.helper.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author fulln
 * @version 0.0.1
 * @program logHelper
 * @description
 * @date 2021/7/4 15:19
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car implements Serializable {

    private static final long serialVersionUID = 2199389397682166899L;

    private String make;
    private String build;
    private Integer numberOfSeat;
    private String type;

}
