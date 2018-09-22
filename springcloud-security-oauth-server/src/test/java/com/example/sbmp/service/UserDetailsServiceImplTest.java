package com.example.sbmp.service;

import org.junit.Test;
import org.springframework.security.authentication.encoding.PlaintextPasswordEncoder;

import static org.junit.Assert.*;

/**
 * @email wangiegie@gmail.com
 * @data 2017-08
 */
public class UserDetailsServiceImplTest {
    @Test
    public void loadUserByUsername() throws Exception {
        PlaintextPasswordEncoder plaintextPasswordEncoder = new PlaintextPasswordEncoder();
        System.out.println(plaintextPasswordEncoder.encodePassword("456",null));

        System.out.println(plaintextPasswordEncoder.isPasswordValid("456","456",null));
    }

}