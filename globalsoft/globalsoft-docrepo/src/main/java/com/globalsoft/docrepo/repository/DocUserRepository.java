package com.globalsoft.docrepo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.globalsoft.docrepo.domain.DocUser;

@Repository
@Transactional(readOnly=true, timeout=60)
public interface DocUserRepository extends JpaRepository<DocUser, Integer> {

	DocUser findByName(String name);
}
