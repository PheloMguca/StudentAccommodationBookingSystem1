package za.ac.cput.Factory;

import za.ac.cput.domain.Accomodation;
import za.ac.cput.domain.AccomodationStatus;
import za.ac.cput.domain.Address;
import za.ac.cput.domain.GenderType;
import za.ac.cput.util.Helper;

public class AccomodationFactory {

    private static String accomodationId;
    private static String name;
    private static String gender;
    private static String contactNumber;
    private static Address address;
    private static AccomodationStatus status;

    public static Accomodation createAccomodation(String accomodationId,
                                                  String name,
                                                  String genderType,
                                                  String contactNumber,

                                                  Address address,
                                                  AccomodationStatus status) {
        AccomodationFactory.accomodationId = accomodationId;
        AccomodationFactory.name = name;
        AccomodationFactory.gender = gender;
        AccomodationFactory.contactNumber = contactNumber;
        AccomodationFactory.address = address;
        AccomodationFactory.status = status;

        // Null / Empty validation
        if (Helper.isNullOrEmpty(accomodationId) ||
                Helper.isNullOrEmpty(name) ||
                Helper.isNullOrEmpty(gender)) {
            throw new IllegalArgumentException("Accomodation ID, name or gender is missing");
        }

        if (address == null) {
            throw new IllegalArgumentException("Address cannot be null");
        }

        if (status == null) {
            throw new IllegalArgumentException("Accomodation status cannot be null");
        }

        // Contact number validation
        if (!Helper.isNumeric(contactNumber)) {
            throw new IllegalArgumentException("Contact number must be numeric");
        }
        if (!Helper.isValidPostalCode(address.getPostalCode())) {
            throw new IllegalArgumentException("Invalid postal code");
        }

        return new Accomodation.Builder()
                .setAccomodationId(accomodationId)
                .setName(name)
                .setGender(GenderType.valueOf(gender))
                .setContactNumber(contactNumber)
                .setAddress(address)
                .setAccomodationStatus(status)
                .build();
    }
}

