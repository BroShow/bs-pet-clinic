package bs.springframework.bspetclinic.services;

import bs.springframework.bspetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
