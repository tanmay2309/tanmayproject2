package com.niit.bocado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.niit.bocado.model.User;
import com.niit.bocado.model.Workspace;

import com.niit.bocado.service.Workspace_service;

@RestController  
@CrossOrigin(origins="http://localhost:4200")  
@RequestMapping(value="/api")  
public class WorkspaceController {
	@Autowired  
    private Workspace_service workspaceservice;
	
	@PostMapping("createWorkspace-Workspace")  
    public boolean createWorkspace(@RequestBody Workspace workspace) {  
         return workspaceservice.createWorkspace(workspace);

    }
	@ResponseBody
	 @RequestMapping(value = "/Workspace/{emailId}", method = RequestMethod.GET)
	    public ResponseEntity<List<Workspace>> getWorkspaceByAdminEmailId(@PathVariable("emailId") String emailId) {
	        System.out.println("Fetching User with id " + emailId);
	        User user = (User) workspaceservice.getWorkspaceByAdminEmailId(emailId);
	        if (user == null) {
	            System.out.println("User with id " + emailId + " not found");
	            return new ResponseEntity<List<Workspace>>(HttpStatus.NOT_FOUND);
	        }
	        return new ResponseEntity<List<Workspace>>(HttpStatus.OK);
	    }
}