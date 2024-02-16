package me.dio.creditapplicationsystem

import me.dio.creditapplicationsystem.entity.Credit
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface creditRepository: JpaRepository<Credit, Long>{
}