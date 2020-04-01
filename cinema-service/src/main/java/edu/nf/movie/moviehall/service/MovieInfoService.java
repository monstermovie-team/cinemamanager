package edu.nf.movie.moviehall.service;


import edu.nf.movie.moviehall.entity.MovieInfo;

import java.util.List;

/**
 * @author Administrator
 */
public interface MovieInfoService {

    List<MovieInfo> listMovieInfo();

    List<MovieInfo> findMovieInfoById(Integer movieId);

    List<MovieInfo> findMovieInfoByName(String movieName);
}
