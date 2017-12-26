package com.qhit.lh.gr3.lpy.sercive;

import java.io.Serializable;
import java.util.List;

public interface BaseSercive {
	public void add(Object obj);
	public void delete(Object obj);
	public void update(Object obj);
	public List<Object> getAll(String fromObject);
	public Object getUserById(Object obj,Integer id);
}
