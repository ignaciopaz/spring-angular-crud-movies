package edu.utn.frro.isi.ds.movies;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MoviesControllers {

    private final MovieRepository moviesRepository;

	@Autowired
	public MoviesControllers(MovieRepository moviesRepository) {
		this.moviesRepository = moviesRepository;
	}
	@RequestMapping(method=RequestMethod.GET)
	public List<Movie> getAll() {
		return moviesRepository.findAll();
	}
	@RequestMapping(method=RequestMethod.GET, value="{id}")
	public Movie view(@PathVariable Long id) {
		Movie movie = moviesRepository.findOne(id);
		return movie;
	}
	  
	@RequestMapping(method=RequestMethod.POST)
	public Movie create(@RequestBody Movie movie) {
		moviesRepository.save(movie);
		return movie;
	}
	  
	@RequestMapping(method=RequestMethod.DELETE, value="{id}")
	public void delete(@PathVariable Long id) {
		moviesRepository.delete(id);
	}
	  
	@RequestMapping(method=RequestMethod.PUT, value="{id}")
	public Movie update(@PathVariable Long id, @RequestBody Movie updatedMovie) {
		//Movie movie = moviesRepository.findOne(id);
		moviesRepository.save(updatedMovie);
		return updatedMovie;
	}

   
}
