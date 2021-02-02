package com.learning.mvc.MVCKotlin.Services

import com.learning.mvc.MVCKotlin.Repositories.EmployeeRepository
import com.learning.mvc.MVCKotlin.models.Employee
import org.springframework.stereotype.Service

@Service
class AllOperations(val employeeRepository: EmployeeRepository) {
    fun save(employee: Employee):Boolean = employeeRepository.save(employee) != null
    fun getAll():List<Employee> = employeeRepository.findAll().toList()
    fun getEmployee(name:String):Employee = employeeRepository.findAllByName(name)
}