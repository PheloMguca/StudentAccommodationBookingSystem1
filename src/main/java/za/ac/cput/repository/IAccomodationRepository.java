package za.ac.cput.repository;

import za.ac.cput.domain.Accomodation;



import java.util.List;

public interface IAccomodationRepository extends IRepository<Accomodation, String>{
    List<Accomodation> getAll() ;

}
