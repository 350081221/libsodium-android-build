package org.osmdroid.tileprovider.util;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class StreamUtils {
    public static final int IO_BUFFER_SIZE = 8192;

    private StreamUtils() {
    }

    public static void closeStream(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
        }
    }

    public static long copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        long j5 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
                j5 += read;
            } else {
                return j5;
            }
        }
    }
}
