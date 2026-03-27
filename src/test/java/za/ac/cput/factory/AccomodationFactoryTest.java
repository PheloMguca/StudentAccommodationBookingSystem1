package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Factory.AccomodationFactory;
import za.ac.cput.domain.*;

import static org.junit.jupiter.api.Assertions.*;

class AccomodationFactoryTest {

    @Test
    void createAccomodation() {

        Address address = new Address.Builder()
                .setPostalCode("7410")
                .setCity("Cape Town")
                .setStreet("WoodStock")
                .build();

        Accomodation accomodation = AccomodationFactory.createAccomodation(
                "0101",
                "NMJ",
                GenderType.FEMALE,
                "079052559",
                address,
                AccomodationStatus.OCCUPIED
        );

        assertNotNull(accomodation);
        System.out.println(accomodation);
    }
}