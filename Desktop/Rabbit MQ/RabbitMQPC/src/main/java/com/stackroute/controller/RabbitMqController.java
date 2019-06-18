package com.stackroute.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.model.Employee;
import com.stackroute.service.RabbitMqService;
@RestController
@RequestMapping(value = "/javainuse-rabbitmq/")
public class RabbitMqController {
    @Autowired
    RabbitMqService rabbitMqService;

    @GetMapping(value = "/producer")
    public String producer(@RequestParam("empName") String empName,@RequestParam("empId") String empId) {

        Employee emp=new Employee();
        emp.setEmpId(empId);
        emp.setEmpName(empName);
        rabbitMqService.send(emp);

        return "Message sent to the RabbitMQ JavaInUse Successfully";
    }
}
