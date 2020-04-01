package edu.nf.movie.moviehall.service.impl;

import com.github.pagehelper.PageInfo;
import edu.nf.movie.moviehall.dao.MovieHallDao;
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
    public PageInfo<MovieHallInfo> listMovieHall(MovieHallInfo movieHallInfo,Integer pageNum, Integer pageSize) {
        List<MovieHallInfo> list = movieHallDao.listMovieHall(movieHallInfo,pageNum,pageSize);
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
    public MovieHallInfo getMovieHallById(Integer movieHallId) {
        MovieHallInfo info = movieHallDao.getMovieHallById(movieHallId);
        return info;
    }

    @Override
    public void updateHallInfo(MovieHallInfo movieHallInfo) {
        movieHallDao.updateHallInfo(movieHallInfo);
    }
}
