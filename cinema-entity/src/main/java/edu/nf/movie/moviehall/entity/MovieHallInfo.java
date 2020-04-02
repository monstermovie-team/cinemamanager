package edu.nf.movie.moviehall.entity;

import lombok.Data;

/**
 * @author Administrator
 * 影厅
 */
@Data
public class MovieHallInfo {

    /**
     * ID
     */
    private Integer hallId;
    /**
     * 影院ID
     */
    private Integer cinemaId;
    /**
     * 影厅名称
     */
    private String hallName;
    /**
     * 影厅类型
     */
    private String hallType;
    /**
     * 座位行
     */
    private Integer hallRow;
    /**
     * 座位列
     */
    private Integer hallCol;
    /**
     * 影厅价格
     */
    private Double hallPrice;
    /**
     * 状态id
     */
    private Integer stateId;



    /**
     * 外键状态id
     */
    private HallState hallState;

    /**
     * 外键影院表id
     */
    private MovieCinema movieCinema;


}
