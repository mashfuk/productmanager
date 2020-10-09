package net.crowdcode;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LedgerBookController {

	@Autowired
	private LedgerBookService service; 
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<LedgerBook> listLedgerBooks = service.listAll();
		model.addAttribute("listLedgerBooks", listLedgerBooks);
		
		return "index";
	}
	
	@RequestMapping("/new")
	public String showNewLedgerBook(Model model) {
		LedgerBook ledgerbook = new LedgerBook();
		model.addAttribute("ledgerbook", ledgerbook);
		
		return "new_ledgerbook";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveLedgerBook(@ModelAttribute("ledgerbook") LedgerBook ledgerbook) {
		service.save(ledgerbook);
		
		return "redirect:/";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditLedgerBook(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_ledgerbook");
		LedgerBook ledgerbook = service.get(id);
		mav.addObject("ledgerbook", ledgerbook);
		
		return mav;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteLedgerBook(@PathVariable(name = "id") int id) {
		service.delete(id);
		return "redirect:/";		
	}
}
