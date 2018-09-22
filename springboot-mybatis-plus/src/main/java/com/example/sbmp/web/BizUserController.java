package com.example.sbmp.web;


import com.baomidou.mybatisplus.plugins.Page;
import com.example.sbmp.entity.BizUser;
import com.example.sbmp.service.IBizUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author lengleng
 * @since 2017-08-19
 */
@SuppressWarnings("unused")
@RestController
@RequestMapping("/bizUser")
public class BizUserController {

    private final IBizUserService userService;

    @Autowired
    public BizUserController(IBizUserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/save")
    public boolean saveUser(BizUser user) {
        return userService.insert(user);
    }

    @RequestMapping("/get/{id}")
    public BizUser getUser(@PathVariable Integer id) {
        return userService.selectById(id);
    }

    @RequestMapping("/getUserScore")
    public List<BizUser> getUserScore(){
        return userService.findUserAndScoreById();
    }

    @RequestMapping("/del/{id}")
    public boolean delUser(@PathVariable Integer id) {
        return userService.deleteById(id);
    }

    @RequestMapping("/getPage")
    public Page<BizUser> getUserPage(Page<BizUser> userPage) {
        return userService.selectPage(userPage);
    }

}
