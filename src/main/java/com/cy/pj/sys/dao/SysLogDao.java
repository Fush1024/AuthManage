package com.cy.pj.sys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.cy.pj.sys.entity.SysLog;
@Mapper
public interface SysLogDao extends BaseDao<SysLog>{
	void insertObject(SysLog entity);
	int deleteObjects(@Param("ids")Integer...ids);
}
