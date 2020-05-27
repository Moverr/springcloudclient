/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springcloudclient.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author muyin
 */
@RestController
public class LuckyWordController {

   // @Value("${lucky-word}")
   // String luckyWord; 
    @GetMapping("/lucky-word")
    public String showLuckyWord(@RequestParam  String luckyWord ) {
        return "The lucky word is: " + luckyWord;
    }
}
