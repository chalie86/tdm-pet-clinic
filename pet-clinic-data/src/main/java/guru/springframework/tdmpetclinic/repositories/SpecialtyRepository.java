package guru.springframework.tdmpetclinic.repositories;

import guru.springframework.tdmpetclinic.module.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
