package edu.nf.movie.moviehall.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @author Administrator
 * 影片放映
 */
@Data
public class MovieUpdown {

    /**
     * 上下映id
     */
    private Integer updownId;
    /**
     * 上映日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date upDate;
    /**
     * 影片id
     */
    private Integer movieId;
    /**
     * 影片名称
     */
    private String movieName;
    /**
     * 状态
     */
    private Integer hallId;
    /**
     * 开始时间
     */
    @JsonFormat(pattern = "hh:mm:ss", timezone = "GMT+12")
    private Date movieStartTime;
    /**
     * 结束时间
     */
    @JsonFormat(pattern = "hh:mm:ss", timezone = "GMT+12")
    private Date movieEndTime;

    private MovieHallInfo movieHallInfo;

    private MovieInfo movieInfo;

    private HallState hallState;
}
