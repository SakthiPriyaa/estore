package estore.frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nec.estore.backend.dao.CategoryDao;
import com.nec.estore.backend.model.Category;

@Controller
public class CategoryController {
	@Autowired
	private CategoryDao categoryDao;
	@RequestMapping(value="/addcategory", method=RequestMethod.GET)
	public ModelAndView viewAddCategory(){
		ModelAndView mv=new ModelAndView("add","command",new Category());
		//ModelAndView mv1=new ModelAndView("add","command",new Category());
		return mv;
		
}
	@RequestMapping(value="/addcategory", method=RequestMethod.POST)
	 public ModelAndView addCategory(@ModelAttribute("category") Category category){
		categoryDao.save(category);
		ModelAndView mv=new ModelAndView("stock");
		return mv;
	 }

}
