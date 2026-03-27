package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.GenderType;
import za.ac.cput.factory.AccomodationFactory;
import za.ac.cput.domain.Accomodation;
import za.ac.cput.domain.AccomodationStatus;
import za.ac.cput.domain.Address;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class AccomodationFactoryTest {

    @Test
    void createAccomodation() {

        Address address = new Address.Builder()
                .setPostalCode("7410")
                .setCity("Cape Town")
                .setStreet("Main Road")
                .build();

        Accomodation accomodation = AccomodationFactory.createAccomodation(
                "A001",
                "CPUT Residence",
                GenderType.FEMALE,
                "0824537952",
                address,
                AccomodationStatus.AVAILABLE
        );

        assertNotNull(accomodation);
        assertEquals("A001", accomodation.getAccomodationId());

        System.out.println(accomodation);
    }
}
