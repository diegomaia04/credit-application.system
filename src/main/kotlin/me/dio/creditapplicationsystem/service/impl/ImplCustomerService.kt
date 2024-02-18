package me.dio.creditapplicationsystem.service.impl

import me.dio.creditapplicationsystem.entity.Customer
import me.dio.creditapplicationsystem.repository.CustomerRepository
import me.dio.creditapplicationsystem.service.iCustomerService
import org.springframework.stereotype.Service

@Service
class implCustomerService(
    private val customerRepository: CustomerRepository
) : iCustomerService {

    override fun save(customer: Customer): Customer =
        this.customerRepository.save(customer)

    override fun findById(id: Long): Customer =
        this.customerRepository.findById(id).orElseThrow {
            throw RuntimeException("id $id not found")
        }

    override fun delete(id: Long) =
        this.customerRepository.deleteById(id)

}