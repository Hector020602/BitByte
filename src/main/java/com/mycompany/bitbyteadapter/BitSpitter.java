/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bitbyteadapter;

import java.util.Random;

/**
 *
 * @author alu10571073
 */
public class BitSpitter {
    public String nextBit() {
        double n = Math.random();
        if (n > 0.5) {
            return "0";
        }else {
            return "1";
        }
    }
    
}
