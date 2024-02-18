package me.dio.creditapplicationsystem.entity

// import jdk.jshell.Snippet.Status
import jakarta.persistence.*
import java.math.BigDecimal
import me.dio.creditapplicationsystem.ennumeration.Status
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*

@Entity
@Table(name = "Credit")

class Credit {
    @Column(nullable = false, unique = true) val creditCode: UUID = UUID.randomUUID()
    @Column(nullable = false) val creditValue: BigDecimal = BigDecimal.ZERO
    @Column(nullable = false) val dayFirstInstallment: Int = 0
    @Column(nullable = false) val numberOfInstallments: Int = 0
    @Enumerated val status: Status = Status.IN_PROGESS
    @ManyToOne var customer: Customer? = null
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long? = null

}
