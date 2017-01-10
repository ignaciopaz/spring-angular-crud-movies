/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.utn.frro.isi.ds.movies.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import edu.utn.frro.isi.ds.movies.Movie;
import edu.utn.frro.isi.ds.movies.MovieRepository;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final MovieRepository movieRepository;
	@Autowired
	public DatabaseLoader(MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}

	public void run(String... strings) throws Exception {

		loadMovies();
	}

	private void loadMovies() {
		this.movieRepository.save(new Movie("Matrix", "1999", "Lana Wachowski, Lilly Wachowski", "Action"));
		this.movieRepository.save(new Movie("Swordfish", "2001", "Dominic Sena", "Suspense"));
		this.movieRepository.save(new Movie("War games", "1983", "John Badham", "Science Fiction"));
		this.movieRepository.save(new Movie("Pulp Fiction", "1994", "Quentin Tarantino", "Drama"));
		this.movieRepository.save(new Movie("The Lord of the Rings: The Return of the King ", "2001", "Peter Jackson", "Adventure"));
		this.movieRepository.save(new Movie("Fight Club", "1999", "David Fincher", "Drama"));
		this.movieRepository.save(new Movie("Monty Python's Life of Brian", "1979", "John Goldstone", "Comedy"));
		
		
	}
	
}
