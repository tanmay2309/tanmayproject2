package com.niit.bocado.service;



import java.util.List;

import com.niit.bocado.model.Circle;

public interface Circle_service {
	boolean addCircle(Circle circle);
	boolean deleteCircle(String emailId,String circleName);
	List<Circle> getCircleByUSer(String emailId);
	List<Circle> getAllCircles();
	Circle getCircleByName(String circleName);
	
	

}
