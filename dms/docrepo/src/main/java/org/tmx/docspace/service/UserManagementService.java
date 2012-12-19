package org.tmx.docspace.service;

import org.tmx.docspace.domain.DocUser;

public interface UserManagementService {

	void saveDocUser(DocUser entity);

	void deleteDocUser(DocUser entity);

	void updateDocUser(DocUser entityDto);
	
}
