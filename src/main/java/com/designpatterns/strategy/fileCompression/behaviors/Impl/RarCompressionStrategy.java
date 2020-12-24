package com.designpatterns.strategy.fileCompression.behaviors.Impl;

import com.designpatterns.strategy.fileCompression.behaviors.CompressionStrategy;

/**
 * created by saurabhgupta on 2020-12-12
 */
public class RarCompressionStrategy implements CompressionStrategy {
    @Override
    public void compressFiles() {
//        use rar technique
        System.out.println("compress using rar technique");
    }
}
