package com.example.springBaseSecuryty.controller;


import com.example.springBaseSecuryty.model.Countres;
import com.example.springBaseSecuryty.reposytory.ReposytoryCountry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
public class ControllerCountrys {
    @Autowired
    ReposytoryCountry reposytoryCountry;

    @GetMapping(value="/countreshtml")
    public String greetingForm(Model model) {
        model.addAttribute("postform", new CountresModel());
        return "countreshtml";
    }

    @GetMapping(value = "/countreslist")
        public String test(Model model){
           Iterable<Countres> list = reposytoryCountry.findAll();
           model.addAttribute("list", list);
           return "countres";
        }


    @RequestMapping(value="/countreshtml", method=RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute CountresModel countres, Model model) {
        reposytoryCountry.save(new Countres(countres.getId(), countres.getName(), countres.getPopulation(),countres.getGdp()));
        model.addAttribute("result", countres);
        //return "countres";
        return "redirect:/countreslist";
    }

    @RequestMapping(value="/countresdelite", method = RequestMethod.POST)
    public String delitCountryId(@ModelAttribute CountresModel countres, Model midel){
        reposytoryCountry.deleteById(countres.getId());
        return "redirect:/countreslist";
    }

    @GetMapping(value="/countresdelite")
    public String returnDelitePage(Model model){
        model.addAttribute("postform", new CountresModel());
        return "countresdelite";
    }


        @Autowired
        private ApplicationContext appContext;
        @RequestMapping(value = "/beans", method = RequestMethod.GET)
        public @ResponseBody List<String> getBeanList() {
            return Arrays.asList(appContext.getBeanDefinitionNames());
        }

        @GetMapping(value="/test")
    public String getTestPage(){
            return "test";
        }

}
