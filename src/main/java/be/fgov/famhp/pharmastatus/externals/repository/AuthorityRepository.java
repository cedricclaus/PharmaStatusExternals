package be.fgov.famhp.pharmastatus.externals.repository;

import be.fgov.famhp.pharmastatus.externals.domain.Authority;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends MongoRepository<Authority, String> {
}
