package com.ot.man.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ot.man.admin.data.dao.AdminDAO;
import com.ot.man.admin.data.entity.Admin;
import com.ot.man.admin.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

    private final AdminDAO adminDAO;

    @Autowired
    public AdminServiceImpl(AdminDAO adminDAO) {
        this.adminDAO = adminDAO;
    }

    @Override
    public Admin getAdminById(String id) {
        return adminDAO.findById(id);
    }
}