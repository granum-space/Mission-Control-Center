/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.packet;

/**
 *
 * @author Kirs67
 */
public class dtpkt_t {
    int beacon; //must be 0xFFFF or 65535
    int number;
    int time, time_part;
    int temperature1, temperature2,
		pressure,
		humidity,
		O2, CO2,
		rezistance12, rezistance23, rezistance13;
    int legs, parachute;
    int cntrl;
    public String toString() {
        String str = new String();
        str+= "Data packet number";
        str+= Integer.toString(number);
        return str;
    }
}
