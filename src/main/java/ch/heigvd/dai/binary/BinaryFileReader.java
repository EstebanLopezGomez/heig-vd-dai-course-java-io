package ch.heigvd.dai.binary;

import ch.heigvd.dai.Readable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class BinaryFileReader implements Readable {

    @Override
    public void read(String filename) throws IOException {
        // TODO : implement this method
        FileInputStream inputStream = new FileInputStream(filename);

        while(inputStream.read()!=-1);

        //reading byte-per-byte
        //byte[] reading = inputStream.readAllBytes();

    }
}
