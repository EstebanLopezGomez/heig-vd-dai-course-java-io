package ch.heigvd.dai.binary;

import ch.heigvd.dai.Writable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BinaryFileWriter implements Writable {

    @Override
    public void write(String filename, int sizeInBytes) throws IOException {
        // TODO : implement this method
        FileOutputStream outputStream = new FileOutputStream(filename);
        outputStream.write(sizeInBytes);
        //throw new UnsupportedOperationException("Not implemented yet");
    }

    public void write_byte_per_byte(String filename, int sizeInBytes) throws IOException {
        // TODO : implement this method
        FileOutputStream outputStream = new FileOutputStream(filename);
        outputStream.write(sizeInBytes);
        //throw new UnsupportedOperationException("Not implemented yet");
    }
}
