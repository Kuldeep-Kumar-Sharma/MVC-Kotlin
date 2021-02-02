package com.learning.mvc.MVCKotlin.Controllers

import com.learning.mvc.MVCKotlin.Services.AllOperations
import com.learning.mvc.MVCKotlin.models.Employee
import org.springframework.web.bind.annotation.*

@RestController
class EmployeeController(val allOperations: AllOperations) {
        @GetMapping("/all")
        fun getEmployees(): List<Employee> = allOperations.getAll()

        @GetMapping("/employee")
        fun getEmployee(@RequestParam(value = "name",defaultValue = "") name:String) = allOperations.getEmployee(name)

        @PostMapping("/save")
        fun postEmployee(@RequestBody employee: Employee): Boolean = allOperations.save(employee)
}