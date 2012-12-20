package com.globalsoft.docrepo.web;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.globalsoft.docrepo.domain.DocUser;
import com.globalsoft.docrepo.repository.DocUserRepository;
import com.globalsoft.docrepo.service.UserManagementService;

@Controller
@RequestMapping("/um/")
public class UserManagementController {
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private DocUserRepository userRepo;
	
	@Autowired
	private UserManagementService userService;
	
	@RequestMapping("/docusers")
	public String listDocUsers(Model model){
		List<DocUser> users = userRepo.findAll();
		model.addAttribute("docUsers", users);
		return "um/docusers/list";
	}
	
	@RequestMapping("/docusers/add")
	public String addDocUser(Model model){
		model.addAttribute("docUser", new DocUser());
		return "um/docusers/add";
	}
	
	@RequestMapping("/docusers/create")
	public String createDocUser(@ModelAttribute("docUser") DocUser docUser){
		Date today = new Date();
		docUser.setCreated(today);
		docUser.setModified(today);
		userRepo.saveAndFlush(docUser);
		return "redirect:/um/docusers";
	}
	
	@RequestMapping("/docusers/edit")
	public String editDocUser(Model model, @RequestParam("docUserId") Integer id){
		DocUser user = userRepo.findOne(id);
		model.addAttribute("docUser", user);
		return "um/docusers/edit";
	}
	
	@RequestMapping("/docusers/update")
	public String updateDocUser(@ModelAttribute DocUser userDto){
		DocUser user = userRepo.findOne(userDto.getId());
		Date today = new Date();
		
		logger.debug("{}", user);
		
		// copy wanted attribute...
		user.setName(userDto.getName());
		user.setModified(today);
		
		userRepo.save(user);
		
		return "redirect:/um/docusers";
	}
	
	@RequestMapping("/docusers/delete")
	public String deleteDocUser(@RequestParam("docUserId") Integer docUserId){
		userRepo.delete(docUserId);
		return "redirect:/um/docusers";
	}
}
