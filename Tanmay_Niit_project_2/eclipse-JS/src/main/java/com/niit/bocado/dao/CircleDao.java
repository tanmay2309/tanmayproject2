package com.niit.bocado.dao;

import java.util.List;

import com.niit.bocado.model.Circle;

public interface CircleDao {
	boolean addCircle(Circle circle);
	boolean deleteCircle(String emailId,String circleName);

	List<Circle> getAllCircles();
	Circle getCircleByName(String circleName);
	List<Circle> getCircleByUser(String emailId);
	
	

}
