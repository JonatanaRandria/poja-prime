package school.hei.poja.endpoint.rest.controller;

import school.hei.poja.conf.FacadeIT;
import java.math.BigInteger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeNumberControllerIT extends FacadeIT {
    @Autowired PrimeNumberController primeNumberController;

    @Test
    void new_prime_ok() {
        BigInteger actual = primeNumberController.generatePrime();

        int certainty = (int) (99.99 * 100);
        assertTrue(actual.isProbablePrime(certainty));
    }
}