package tieto.bank.admin



import grails.test.mixin.*
import grails.validation.*;

import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Payment)
class PaymentTests {


	void testAmountConstraint() {
		Payment p = new Payment()
		p.amount = 5000
		p.save(failOnError:true)
	}

	void testAmountConstraintFail() {
		shouldFail (ValidationException){
			Payment p = new Payment()
			p.amount = -1000
			p.save(failOnError:true)
		}
	}
}
