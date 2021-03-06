package com.yj.service;

import com.yj.dao.Video_hostDao;
import com.yj.pojo.Video_host;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Video_hostService {

	@Autowired
	public Video_hostDao video_hostDao;
	
	/**
	 * 添加主播信息到video_host表，如果主播已存在，则更新主播信息
	 * @param video_host
	 * @return
	 */
	public void insertVideo_host(Video_host video_host){
		video_hostDao.save(video_host);
	}
	
	/**
	 * 使用replace into批量更新主播表
	 * @param host_list
	 * @return
	 */
	public void replace_host_list(List<Video_host> host_list){
		video_hostDao.saveAll(host_list);
	}
	
}
