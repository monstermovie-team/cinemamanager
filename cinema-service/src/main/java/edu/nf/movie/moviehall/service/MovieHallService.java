package edu.nf.movie.moviehall.service;

import com.github.pagehelper.PageInfo;
import edu.nf.movie.moviehall.entity.MovieHallInfo;
import edu.nf.movie.moviehall.entity.MovieUpdown;

import java.util.List;


/**
 * @author Administrator
 */
public interface MovieHallService {

    PageInfo<MovieUpdown> listMoveUpdownInfo(Integer pageNum,Integer pageSize);

    PageInfo<MovieHallInfo> listMovieHall(MovieHallInfo movieHallInfo,Integer pageNum,Integer pageSize);

    void addMovieHall(MovieHallInfo movieHallInfo);

    int removeMovieHall(Integer hallId);

    MovieHallInfo getMovieHallById(Integer movieHallId);

    void updateHallInfo(MovieHallInfo movieHallInfo);
}
