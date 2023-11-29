package com.email.proveider.infra;

import org.springframework.data.repository.CrudRepository;

import com.email.proveider.core.Entity.Email;

public interface SalvarEmailRepository extends CrudRepository<Email, Integer>{

}
