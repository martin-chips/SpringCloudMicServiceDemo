package com.dimple.service;

import com.dimple.entites.Dept;

import java.util.List;

/**
 * @className: DeptService
 * @description:
 * @auther: Dimple
 * @date: 08/01/19
 * @version: 1.0
 */
public interface DeptService {
    boolean add(Dept dept);

    Dept get(Long id);

    List<Dept> list();
}
