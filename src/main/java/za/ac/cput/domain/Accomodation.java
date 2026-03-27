package za.ac.cput.domain;

public class Accomodation {
    private String accomodationId;
    private String name;
    private GenderType gender;
    private String contactNumber;
    private Address address;
    private AccomodationStatus accomodationStatus;

    public Accomodation() {
    }

    public Accomodation(Builder builder) {
        this.accomodationId = builder.accomodationId;
        this.name = builder.name;
        this.gender =builder.gender;
        this.contactNumber = builder.contactNumber;
        this.address = builder.address;
        this.accomodationStatus = builder.accomodationStatus;
    }

    // Getters
    public String getaccomodationId() {
        return accomodationId;
    }

    public String getName() {
        return name;
    }

    public GenderType getGender() {
        return gender;
    }

    public String getContactNumber() {

        return contactNumber;
    }

    public Address getAddress() {

        return address;
    }

    public AccomodationStatus getAccomodationStatus() {
        return accomodationStatus;
    }

    @Override
    public String toString() {
        return "Accomodation{" +
                "accomodationId='" + accomodationId + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", location='" + address + '\'' +
                ", accomodationStatus=" + accomodationStatus +
                '}';
    }

    public String getAccomodationId() {
        return accomodationId;
    }


    // Builder class
    public static class Builder {

        private String accomodationId;
        private String name;
        private GenderType gender;
        private String contactNumber;
        private Address address;
        private AccomodationStatus accomodationStatus;

        public Builder setAccomodationId(String accomodationId) {
            this.accomodationId = accomodationId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setGender(GenderType gender) {
            this.gender = gender;
            return this;
        }

        public Builder setContactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
            return this;
        }

        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public Builder setAccomodationStatus(AccomodationStatus accomodationStatus) {
            this.accomodationStatus = accomodationStatus;
            return this;
        }

        public Builder copy(Accomodation accomodation) {
            this.accomodationId = accomodation.accomodationId;
            this.name = accomodation.name;
            this.gender = accomodation.gender;
            this.contactNumber = accomodation.contactNumber;
            this.address = accomodation.address;
            this.accomodationStatus = accomodation.accomodationStatus;
            return this;
        }

        public Accomodation build() {
            return new Accomodation(this);
        }
    }
}


