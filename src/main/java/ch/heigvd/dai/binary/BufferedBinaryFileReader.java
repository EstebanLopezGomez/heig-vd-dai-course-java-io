package ch.heigvd.dai.binary;

import ch.heigvd.dai.Readable;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BufferedBinaryFileReader implements Readable {

    @Override
    public void read(String filename) throws IOException {
        InputStream inputStream = new BufferedInputStream(new FileInputStream(filename));
        byte[] buffer = new byte[16384]; //16kB buffer size

        while(inputStream.read(buffer)!=-1){};
    }
}
