package es.sotero.nominas.web.controllers;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import es.sotero.nominas.business.entities.Nomina;
import es.sotero.nominas.business.services.NominaManager;

@Controller
public class SalarioController {
	
	@Autowired
	private NominaManager nomManager;

	@RequestMapping(value="/getSalario.htm", method = RequestMethod.GET)
	public ModelAndView method() {
	    return new ModelAndView("buscarEmpleados", "nominaModel", new Nomina());
	}
	
	@RequestMapping(value="/procesarForm.htm", method = RequestMethod.POST)
    public ModelAndView submit(@Valid @ModelAttribute("nominaModel") Nomina nomina, BindingResult result, ModelMap model) {
        
        Nomina myModel = new Nomina();
        myModel = this.nomManager.getNomina(nomina.getDni());
        return new ModelAndView("mostrarSalario", "model", myModel);
    }
}





