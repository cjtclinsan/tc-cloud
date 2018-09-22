package com.example.sbmp.service;

import com.example.sbmp.entity.BizUser;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lengleng
 * @since 2017-08-19
 */
public interface IBizUserService extends IService<BizUser> {
    List<BizUser> findUserAndScoreById();
}
