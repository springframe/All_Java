package com.nt.dao;

import java.util.List;
import java.util.Map;

public interface DBOperations {
public int insert(int no,String name,String job,long sal);
public int getsalary(int no);
public Map<String,Object> listEmpDeatils(int no);
public List<Map<String,Object>> listAllEmpDetails();
public int UpdateStudentSal(int sno,int newsal);
public int deleteSdt(int sno);
}
