package edu.nf.movie.moviehall.service;

import com.github.pagehelper.PageInfo;
import edu.nf.movie.moviehall.entity.MovieCinema;
import edu.nf.movie.moviehall.entity.MovieHallInfo;
import edu.nf.movie.moviehall.entity.MovieUpdown;

import java.util.List;


/**
 * @author Administrator
 */
public interface MovieHallService {

    PageInfo<MovieUpdown> listMoveUpdownInfo(Integer pageNum,Integer pageSize);

    PageInfo<MovieHallInfo> listMovieHall(Integer pageNum,Integer pageSize);

    void addMovieHall(MovieHallInfo movieHallInfo);

    int removeMovieHall(Integer hallId);

    List<MovieHallInfo> getMovieHallById(Integer movieHallId);

    void updateHallInfo(MovieHallInfo movieHallInfo);

    List<MovieCinema> listMovieCinemaInfo();

    MovieCinema getInfoByName(String cinemaName);

    MovieHallInfo getMovieHallById2(Integer movieHallId);
}
