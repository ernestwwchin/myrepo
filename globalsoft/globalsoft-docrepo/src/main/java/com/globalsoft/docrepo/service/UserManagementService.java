package com.globalsoft.docrepo.service;

import com.globalsoft.docrepo.domain.DocUser;

public interface UserManagementService {

	void saveDocUser(DocUser entity);

	void deleteDocUser(DocUser entity);

	void updateDocUser(DocUser entityDto);
	
}
