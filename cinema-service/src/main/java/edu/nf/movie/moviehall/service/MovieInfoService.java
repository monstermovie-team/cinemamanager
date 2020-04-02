package edu.nf.movie.moviehall.service;


import edu.nf.movie.moviehall.entity.MovieInfo;
import edu.nf.movie.moviehall.entity.MovieUpdown;

import java.util.List;

/**
 * @author Administrator
 */
public interface MovieInfoService {

    List<MovieInfo> listMovieInfo();

    List<MovieInfo> findMovieInfoById(Integer movieId);

    List<MovieInfo> findMovieInfoByName(String movieName);

    void addMovieUpdown(MovieUpdown movieUpdown);
}
