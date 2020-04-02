package edu.nf.movie.moviehall.dao;


import edu.nf.movie.moviehall.entity.MovieCinema;
import edu.nf.movie.moviehall.entity.MovieHallInfo;
import edu.nf.movie.moviehall.entity.MovieInfo;
import edu.nf.movie.moviehall.entity.MovieUpdown;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieHallDao {

    List<MovieUpdown> listMovieUpdownInfo(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);

    MovieUpdown getMovieUpdownInfoById(Integer updownId);

    List<MovieInfo> listMovieInfo();

    List<MovieInfo> findMovieInfoById(Integer movieId);

    List<MovieInfo> findMovieInfoByName(String movieName);

    void addMovieUpdown(MovieUpdown movieUpdown);

    List<MovieHallInfo> listMovieHall(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);

    /*List<MovieHallInfo> listMovieHallByName(String hallName);*/

    List<MovieHallInfo> getMovieHallById(Integer movieHallId);

    MovieHallInfo getMovieHallById2(Integer movieHallId);

    void addMovieHall(MovieHallInfo movieHallInfo);

    int removeMovieHall(Integer hallId);

    void updateHallInfo(MovieHallInfo movieHallInfo);

    List<MovieCinema> listMovieCinemaInfo();

    MovieCinema getInfoByName(String cinemaName);
}
