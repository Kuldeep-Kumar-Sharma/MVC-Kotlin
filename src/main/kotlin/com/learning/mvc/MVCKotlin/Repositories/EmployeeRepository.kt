package com.learning.mvc.MVCKotlin.Repositories

import com.learning.mvc.MVCKotlin.models.Employee
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface EmployeeRepository:CrudRepository<Employee,Long>{
    fun findAllByName(name: String): Employee
}