package me.dio.creditapplicationsystem.service.impl

import me.dio.creditapplicationsystem.entity.Credit
import me.dio.creditapplicationsystem.repository.creditRepository
import me.dio.creditapplicationsystem.service.iCreditService
import org.springframework.stereotype.Service
import java.util.*

@Service
class CreditService(
    private val customerService: implCustomerService,
    private val creditRepository: creditRepository
) : iCreditService {
    override fun save(credit: Credit): Credit {
        credit.apply {
            customer = customerService.findById(credit.customer?.id!!)
        }
        return this.creditRepository.save(credit)
    }

    override fun findAllByCustomer(customerId: Long): List<Credit> =
        this.creditRepository.FindAllByCredtis(customerId)

    override fun findByCreditCode(customerId: Long, creditCode: UUID): Credit {
        val credit: Credit = (this.creditRepository.findByCreditCode(creditCode)
            ?: throw RuntimeException("CreditCode $creditCode not found"))
        return if (credit.customer?.id == customerId) credit else throw RuntimeException("Contact admin")
    }
}