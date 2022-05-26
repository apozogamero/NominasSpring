package es.sotero.nominas.web.controllers;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.ModelAndView;

import es.sotero.nominas.business.NominasBusinessConfig;
import es.sotero.nominas.web.NominasWebConfig;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {NominasBusinessConfig.class, NominasWebConfig.class})
@WebAppConfiguration
public class EmpleadoControllerTests {

	@Autowired
    private EmpleadoController controller;

    @Test
    public void testHandleRequestView() {	
        ModelAndView modelAndView = controller.handleRequest();	
        assertEquals("mostrarEmpleados", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        String nowValue = (String) modelAndView.getModel().get("listaEmp");
        assertNotNull(nowValue);
    }
	
}
