
import org.junit.Assert.*
import org.junit.Test

class TestKt {

    @Test
    fun cardControl_shouldIdentifyError() {
        // arrange
        val cardType = "Mastercard"
        val amountPerMonth = 0
        val amountOfTransaction = 1405555000

        // act
        val result = cardControl(
            type = cardType,
            transaction = amountPerMonth,
            sumLastTransaction = amountOfTransaction
        )
        // assert
        assertEquals(-1.0, result, 0.1)
    }


    @Test
    fun cardControl_shouldNotIdentifyError() {
        // arrange
        val cardType = "Mastercard"
        val amountPerMonth = 0
        val amountOfTransaction = 140000

        // act
        val result = cardControl(
            type = cardType,
            transaction = amountPerMonth,
            sumLastTransaction = amountOfTransaction
        )

        // assert
        assertEquals(0.0, result, 0.1)
    }

    @Test
    fun raschet_shouldNotIdentifyError_VkPay() {
        // arrange
        val cardType = "Vk Pay"
        val amountPerMonth = 0
        val amountOfTransaction = 14000

        // act
        val result = cardControl(
            type = cardType,
            transaction = amountPerMonth,
            sumLastTransaction = amountOfTransaction
        )

        // assert
        assertEquals(0.0, result, 0.1)
    }

    @Test
    fun raschet_shouldIdentifyError_VkPay() {
        // arrange
        val cardType = "Mastercard"
        val amountPerMonth = 0
        val amountOfTransaction = 1405555000

        // act
        val result = cardControl(
            type = cardType,
            transaction = amountPerMonth,
            sumLastTransaction = amountOfTransaction
        )
        // assert
        assertEquals(-1.0, result, 0.1)
    }

    @Test
    fun visaMirTransaction_lessThenMinCommission() {
        // arrange
        val transaction = 1500

        // act
        val result = visaMirTransaction(
            transaction = transaction,
        )
        // assert
        assertEquals(35.0, result, 0.1)
    }

    @Test
    fun visaMirTransaction_moreThenMinCommission() {
        // arrange
        val transaction = 125000

        // act
        val result = visaMirTransaction(
            transaction = transaction,
        )
        // assert
        assertEquals(937.0, result, 0.1)
    }

    @Test
    fun raschet_ErrorTrueReturn() {
        // arrange
        val cardType = "Mastercard"
        val amountPerMonth = 1234567890
        val amountOfTransaction = 1405555000

        // act
        val result = Raschet(
            type = cardType,
            amountPerMonth = amountPerMonth,
            amountOfTransaction = amountOfTransaction
        )
        // assert
        assertEquals(-1.0, result, 0.1)
    }

    @Test
    fun raschet_ErrorFalseReturn_Vkpay() {
        // arrange
        val cardType = "Vk Pay"
        val amountPerMonth = 0
        val amountOfTransaction = 1500

        // act
        val result = Raschet(
            type = cardType,
            amountPerMonth = amountPerMonth,
            amountOfTransaction = amountOfTransaction
        )
        // assert
        assertEquals(0.0, result, 0.1)
    }

    @Test
    fun raschet_ErrorFalseReturn_Unknown() {
        // arrange
        val cardType = "Vk___Pay"
        val amountPerMonth = 0
        val amountOfTransaction = 1500

        // act
        val result = Raschet(
            type = cardType,
            amountPerMonth = amountPerMonth,
            amountOfTransaction = amountOfTransaction
        )
        // assert
        assertEquals(-1.0, result, 0.1)
    }

    @Test
    fun raschet_ErrorFalseReturn_Mastercard() {
        // arrange
        val cardType = "Mastercard"
        val amountPerMonth = 0
        val amountOfTransaction = 1500

        // act
        val result = Raschet(
            type = cardType,
            amountPerMonth = amountPerMonth,
            amountOfTransaction = amountOfTransaction
        )
        // assert
        assertEquals(0.0, result, 0.1)
    }

    @Test
    fun raschet_ErrorFalseReturn_Maestro() {
        // arrange
        val cardType = "Maestro"
        val amountPerMonth = 0
        val amountOfTransaction = 1500

        // act
        val result = Raschet(
            type = cardType,
            amountPerMonth = amountPerMonth,
            amountOfTransaction = amountOfTransaction
        )
        // assert
        assertEquals(0.0, result, 0.1)
    }

    @Test
    fun raschet_ErrorFalseReturn_Mir() {
        // arrange
        val cardType = "Мир"
        val amountPerMonth = 0
        val amountOfTransaction = 1500

        // act
        val result = Raschet(
            type = cardType,
            amountPerMonth = amountPerMonth,
            amountOfTransaction = amountOfTransaction
        )
        // assert
        assertEquals(35.0, result, 0.1)
    }

    @Test
    fun raschet_ErrorFalseReturn_Visa() {
        // arrange
        val cardType = "Visa"
        val amountPerMonth = 0
        val amountOfTransaction = 1500

        // act
        val result = Raschet(
            type = cardType,
            amountPerMonth = amountPerMonth,
            amountOfTransaction = amountOfTransaction
        )
        // assert
        assertEquals(35.0, result, 0.1)
    }

    @Test
    fun masterMaestroTransaction_moreThenMinCommission() {
        // arrange
        val transaction = 125000

        // act
        val result = masterMaestroTransaction(
            transaction = transaction,
        )
        // assert
        assertEquals(770.0, result, 0.1)
    }



}