package com.sprintech.maventemplategenerator.service;

import java.io.File;

import org.springframework.stereotype.Service;

@Service
public class TemplateGeneratorService {
    
    public void generateTempalet(String projectName){

        File projectDirectory = new File(projectName);

        if(!projectDirectory.exists()){
            if(projectDirectory.mkdir()){
                System.out.println("Project Directory Created: "  + projectName);
            }else{
                System.out.println("Failed to create project directory");
            }
        }else{
            System.out.println("Project Directory Already exists");
        }
    }
}
