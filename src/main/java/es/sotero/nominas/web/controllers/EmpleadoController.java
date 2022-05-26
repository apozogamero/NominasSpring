package es.sotero.nominas.web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import es.sotero.nominas.business.services.EmpleadoManager;

@Controller
public class EmpleadoController {

	protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private EmpleadoManager empManager;
    
    @RequestMapping(value="/getEmpleadoAll.htm")
    public ModelAndView handleRequest() {
		logger.info("Returning mostrarEmpleados view");
		
        Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("listaEmp", this.empManager.getEmpleadoAll());

        return new ModelAndView("mostrarEmpleados", "model", myModel);
    }
	
}
