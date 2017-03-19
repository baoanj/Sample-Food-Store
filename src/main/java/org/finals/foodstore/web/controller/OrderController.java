package org.finals.foodstore.web.controller;

import org.finals.foodstore.persistence.entity.Order;
import org.finals.foodstore.persistence.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {
	
	@Autowired
	IOrderService orderService;

	@RequestMapping(value = "/order")
    public String orderDetail(Model model) {
		Order order = orderService.findAll().get(0);
		model.addAttribute("order", order);
		model.addAttribute("orderLines", order.getOrderLines());
        return "order";
    }
	
}
