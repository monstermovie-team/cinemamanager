package edu.nf.movie.moviehall.service.impl;

import com.github.pagehelper.PageInfo;
import edu.nf.movie.moviehall.dao.MovieHallDao;
import edu.nf.movie.moviehall.entity.MovieCinema;
import edu.nf.movie.moviehall.entity.MovieHallInfo;
import edu.nf.movie.moviehall.entity.MovieUpdown;
import edu.nf.movie.moviehall.service.MovieHallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 */
@Service("movieHallService")
public class MovieHallServiceImpl implements MovieHallService {

    @Autowired
    private MovieHallDao movieHallDao;

    @Override
    public PageInfo<MovieUpdown> listMoveUpdownInfo(Integer pageNum, Integer pageSize) {
        List<MovieUpdown> movieHallList = movieHallDao.listMovieUpdownInfo(pageNum,pageSize);
        return new PageInfo<>(movieHallList);
    }

    @Override
    public PageInfo<MovieHallInfo> listMovieHall(Integer pageNum, Integer pageSize) {
        List<MovieHallInfo> list = movieHallDao.listMovieHall(pageNum,pageSize);
        return new PageInfo<>(list);
    }

    @Override
    public void addMovieHall(MovieHallInfo movieHallInfo) {
        movieHallDao.addMovieHall(movieHallInfo);
    }

    @Override
    public int removeMovieHall(Integer hallId) {
        int size = movieHallDao.removeMovieHall(hallId);
        return size;
    }

    @Override
    public List<MovieHallInfo> getMovieHallById(Integer movieHallId) {
        List<MovieHallInfo> info = movieHallDao.getMovieHallById(movieHallId);
        return info;
    }

    @Override
    public void updateHallInfo(MovieHallInfo movieHallInfo) {
        movieHallDao.updateHallInfo(movieHallInfo);
    }

    @Override
    public List<MovieCinema> listMovieCinemaInfo() {
        List<MovieCinema> cinemas = movieHallDao.listMovieCinemaInfo();
        return cinemas;
    }

    @Override
    public MovieCinema getInfoByName(String cinemaName) {
        MovieCinema cinema = movieHallDao.getInfoByName(cinemaName);
        return cinema;
    }

    @Override
    public MovieHallInfo getMovieHallById2(Integer movieHallId) {
        MovieHallInfo movieHallInfo = movieHallDao.getMovieHallById2(movieHallId);
        return movieHallInfo;
    }
}
