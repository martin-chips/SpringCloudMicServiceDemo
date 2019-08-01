package com.dimple.entites;

import lombok.Data;

import java.io.Serializable;

/**
 * @className: Dept
 * @description:
 * @auther: Dimple
 * @date: 08/01/19
 * @version: 1.0
 */
@Data
public class Dept implements Serializable {//需要序列化
    private Long deptNo;
    private String deptName;
    private String dbSource;
}
