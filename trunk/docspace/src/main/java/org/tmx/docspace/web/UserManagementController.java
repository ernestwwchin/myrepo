package org.tmx.docspace.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.tmx.docspace.domain.DocUser;
import org.tmx.docspace.repository.DocUserRepository;

@Controller
@RequestMapping("/um/")
public class UserManagementController {
	
	@Autowired
	private DocUserRepository userRepo;
	
	
	@RequestMapping("/docusers")
	public ModelAndView listDocUsers(){
		ModelAndView mov = new ModelAndView();
		
		List<DocUser> users = userRepo.findAll();
		mov.addObject("docUsers", users);
		mov.addObject("docuser", new DocUser());
		mov.setViewName("um/docusers/list");
		return mov;
	}
	
	@RequestMapping("/docusers/add")
	public String addDocUser(@ModelAttribute("docUser") DocUser docUser){
		userRepo.saveAndFlush(docUser);
		return "redirect:/um/docusers";
	}
	
	@RequestMapping("/docusers/edit")
	public String editDocUser(@ModelAttribute DocUser docUser){
		userRepo.save(docUser);
		return "um/docusers/view";
	}
	
	@RequestMapping("/docusers/delete")
	public String deleteDocUser(Integer docUserId){
		userRepo.delete(docUserId);
		return "um/docusers/list";
	}
}
