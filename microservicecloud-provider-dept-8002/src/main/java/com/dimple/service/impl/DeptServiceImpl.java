package com.dimple.service.impl;

import com.dimple.dao.DeptDao;
import com.dimple.entites.Dept;
import com.dimple.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @className: DeptServiceImpl
 * @description:
 * @auther: Dimple
 * @date: 08/01/19
 * @version: 1.0
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao dao;

    @Override
    public boolean add(Dept dept) {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return dao.findAll();
    }

}

