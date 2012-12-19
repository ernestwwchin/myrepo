package org.tmx.docspace.service;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tmx.docspace.domain.DocUser;
import org.tmx.docspace.repository.DocUserRepository;

@Transactional(timeout=60)
@Service
public class UserManagementServiceImpl implements UserManagementService {
	
	@Autowired
	private DocUserRepository userRepo;
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void saveDocUser(DocUser entity){
		Date today = new Date();
		entity.setCreated(today);
		entity.setModified(today);
		userRepo.saveAndFlush(entity);
	}
	
	@Override
	public void deleteDocUser(DocUser entity){
		userRepo.delete(entity);
	}
	
	@Override
	public void updateDocUser(DocUser entityDto){
		DocUser docUser = userRepo.findOne(entityDto.getId());
		Date today = new Date();
		
		// copy wanted attribute...
		docUser.setName(entityDto.getName());
		docUser.setModified(today);
		
		userRepo.saveAndFlush(docUser);
	}
	
}
