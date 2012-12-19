package org.tmx.docspace.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.tmx.docspace.domain.DocUser;

@Repository
@Transactional(readOnly=true, timeout=60)
public interface DocUserRepository extends JpaRepository<DocUser, Integer> {

	DocUser findByName(String name);
}
