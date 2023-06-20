/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tendencias.app.VM;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author ASUS ROG
 */
@Data
@AllArgsConstructor
public class Asset {
    private byte[] content;
    private String contentType;  
}
