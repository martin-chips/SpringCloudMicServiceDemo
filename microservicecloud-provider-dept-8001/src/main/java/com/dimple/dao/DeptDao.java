package com.dimple.dao;

import com.dimple.entites.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @className: DeptDao
 * @description:
 * @auther: Dimple
 * @date: 08/01/19
 * @version: 1.0
 */
@Mapper
public interface DeptDao {
    boolean addDept(Dept dept);

    Dept findById(Long id);

    List<Dept> findAll();
}
