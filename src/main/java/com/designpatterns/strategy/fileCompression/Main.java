package com.designpatterns.strategy.fileCompression;

import com.designpatterns.strategy.fileCompression.Impl.RarCompressionStrategy;

/**
 * created by saurabhgupta on 2020-12-12
 */
public class Main {
    public static void main(String[] args) {
        Compression compression = new Compression(new RarCompressionStrategy());
        compression.createArchive();
    }
}
