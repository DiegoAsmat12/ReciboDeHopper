package com.diegoasmat.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ReciboSimple {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index(Model model) {
		String name = "Grace";
		String itemName = "Alambre de Plata";
		double price = 5.25;
		
		String description = "Tiras de metal, otra ilustración de nanosegundos";
		String vendor = "Tienda Grandes Logros";
		
		model.addAttribute("nombre",name);
		model.addAttribute("item",itemName);
		model.addAttribute("precio", price);
		model.addAttribute("descripcion",description);
		model.addAttribute("vendedor",vendor);
		
		return "index.jsp";
	}
}
