package org.finals.foodstore.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.finals.foodstore.persistence.entity.Cuisine;
import org.finals.foodstore.persistence.service.ICuisineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CuisineController {
	
	@Autowired
	ICuisineService cuisineService;

	@RequestMapping(value = "/menu")
    public String CuisineList(Model model) {
		List<Cuisine> cuisines = cuisineService.findAll();
		model.addAttribute("cuis", cuisines);
        return "menu";
    }
	
	@RequestMapping(value = "/cuisine_detail")
    public String CuisineDetail(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException {
		final Integer cuiId = Integer.valueOf(request.getParameter("cuiId"));
		Cuisine cuisine = cuisineService.findById(cuiId);
		model.addAttribute("cui", cuisine);
        return "cuisine_detail";
    }
	
}
