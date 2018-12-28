package com.tripathi.punit.petclinic.service;

import com.tripathi.punit.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
