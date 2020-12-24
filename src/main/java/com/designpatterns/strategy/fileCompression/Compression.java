package com.designpatterns.strategy.fileCompression;

import com.designpatterns.strategy.fileCompression.behaviors.CompressionStrategy;

/**
 * created by saurabhgupta on 2020-12-12
 */
public class Compression {
    final private CompressionStrategy compressionStrategy;

    public Compression(CompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }
    public void createArchive() {
        compressionStrategy.compressFiles();
    }

}