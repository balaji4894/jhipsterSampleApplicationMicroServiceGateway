package org.bars.jhipster.sample.jhipster.sampleapplicationmicroservice.repository;

import org.bars.jhipster.sample.jhipster.sampleapplicationmicroservice.domain.Authority;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for the Authority entity.
 */
public interface AuthorityRepository extends MongoRepository<Authority, String> {
}
