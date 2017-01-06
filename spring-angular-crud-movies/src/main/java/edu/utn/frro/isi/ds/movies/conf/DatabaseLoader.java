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
		this.movieRepository.save(new Movie("ABC", "2007", "AA", "Drama"));
		this.movieRepository.save(new Movie("DEF", "2001", "Baggins", "Drama"));
		this.movieRepository.save(new Movie("GHI", "2016", "the Grey", "Terror"));
		this.movieRepository.save(new Movie("JKL", "2011", "Gamgee", "Science Fiction"));
		this.movieRepository.save(new Movie("MNO", "2001", "Brandybuck", "Comedy"));
		this.movieRepository.save(new Movie("PQR", "2005", "Took", "Action"));
	}
	
}
