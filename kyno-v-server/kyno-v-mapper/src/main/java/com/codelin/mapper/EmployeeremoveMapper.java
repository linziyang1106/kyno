package com.codelin.mapper;

import com.codelin.bean.Employeeremove;

public interface EmployeeremoveMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employeeremove record);

    int insertSelective(Employeeremove record);

    Employeeremove selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employeeremove record);

    int updateByPrimaryKey(Employeeremove record);
}