package com.designpatterns.strategy.fileCompression.behaviors.Impl;

import com.designpatterns.strategy.fileCompression.behaviors.CompressionStrategy;

/**
 * created by saurabhgupta on 2020-12-12
 */
public class ZipCompressionStrategy implements CompressionStrategy {
    @Override
    public void compressFiles() {
//        use zip technique
        System.out.println("compress using zip technique");
    }
}
