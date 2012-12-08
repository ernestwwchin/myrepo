package org.tmx.docspace.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.tmx.docspace.domain.DocUser;

@Repository
public interface DocUserRepository extends JpaRepository<DocUser, Integer> {

	DocUser findByName(String name);
}
