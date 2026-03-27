package za.ac.cput.repository;

import za.ac.cput.domain.Accomodation;
import za.ac.cput.domain.Student;

import java.util.ArrayList;
import java.util.List;

public class AccomodationRepository implements IAccomodationRepository{
    private static IAccomodationRepository repository = null;
    private List<Accomodation>accomodationList;

    private AccomodationRepository(){
        accomodationList = new ArrayList<>();
    }
    public static IAccomodationRepository getRepository(){
        if(repository == null){
            repository = new AccomodationRepository();
        }
        return repository;
    }

    @Override
    public Accomodation create(Accomodation accomodation) {
        boolean success = accomodationList.add(accomodation);
        if(success){
            return accomodation;
        }
        return null;

    }

    @Override
    public Accomodation read(String accomodationId) {
        for(Accomodation accomodation : accomodationList){
            if (accomodation.getaccomodationId().equals(accomodationId)){
                return accomodation;
            }
        }
        return null;
    }

    @Override
    public Accomodation update(Accomodation accomodation) {
        String id = accomodation.getaccomodationId();
        Accomodation oldAccomodation = read(id);
        if (oldAccomodation == null) {
            return null;
        }
        boolean success  = accomodationList.remove(oldAccomodation);
        if (!success) {
            return accomodation;
        }
        if(accomodationList.add(accomodation)) {
            return accomodation;
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        Accomodation accomodationToDelete = read(id);
        if (accomodationToDelete == null){
            return false;
        }
        return accomodationList.remove(accomodationToDelete);
    }

    @Override
    public List<Accomodation> getAll() {
        return accomodationList;
    }
}
