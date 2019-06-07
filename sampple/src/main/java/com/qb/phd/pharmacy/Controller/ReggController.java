package com.qb.phd.pharmacy.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qb.phd.pharmacy.Dao.ReggDao;
import com.qb.phd.pharmacy.model.Regg;

@RestController
@RequestMapping("/api/auth")
public class ReggController {

	@Autowired
	ReggDao rd;
	
	@PostMapping("/create")
	public Regg createuser(@RequestBody Regg r) {
		Regg rg= rd.save(r);
		return rg;
	}
	
	@GetMapping("/get")
	public Optional<Regg> getuser(@PathVariable("id") long id){
		return rd.findById(id);
	}
}
