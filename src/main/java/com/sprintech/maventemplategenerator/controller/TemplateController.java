package com.sprintech.maventemplategenerator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sprintech.maventemplategenerator.service.TemplateGeneratorService;

@RestController
@RequestMapping("api/v1/templates")
public class TemplateController {

   @Autowired
   private TemplateGeneratorService templateGeneratorService;

   @PostMapping("/template")
   public String generateTemplate(@RequestBody String projectName){
        templateGeneratorService.generateTempalet(projectName);

        return "Template generated for project: " + projectName;
   }
}
