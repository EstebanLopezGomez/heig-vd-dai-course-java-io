package ch.heigvd.dai.binary;

import ch.heigvd.dai.Writable;

import javax.imageio.stream.FileImageOutputStream;
import java.io.*;

public class BufferedBinaryFileWriter implements Writable {

    @Override
    public void write(String filename, int sizeInBytes) throws IOException {
        OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(filename));
        byte[] buffer = new byte[16384]; //16kB buffer size

        outputStream.write(buffer,0,sizeInBytes);
    }
}
