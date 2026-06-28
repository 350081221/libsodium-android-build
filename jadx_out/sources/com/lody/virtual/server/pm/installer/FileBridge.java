package com.lody.virtual.server.pm.installer;

import android.annotation.TargetApi;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.lody.virtual.helper.utils.ArrayUtils;
import com.lody.virtual.helper.utils.FileUtils;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteOrder;

@TargetApi(21)
/* loaded from: classes3.dex */
public class FileBridge extends Thread {
    private static final int CMD_CLOSE = 3;
    private static final int CMD_FSYNC = 2;
    private static final int CMD_WRITE = 1;
    private static final int MSG_LENGTH = 8;
    private static final String TAG = "FileBridge";
    private final FileDescriptor mClient;
    private volatile boolean mClosed;
    private final FileDescriptor mServer;
    private FileDescriptor mTarget;

    public FileBridge() {
        FileDescriptor fileDescriptor = new FileDescriptor();
        this.mServer = fileDescriptor;
        FileDescriptor fileDescriptor2 = new FileDescriptor();
        this.mClient = fileDescriptor2;
        try {
            Os.socketpair(OsConstants.AF_UNIX, OsConstants.SOCK_STREAM, 0, fileDescriptor, fileDescriptor2);
        } catch (ErrnoException unused) {
            throw new RuntimeException("Failed to create bridge");
        }
    }

    public static void closeQuietly(FileDescriptor fileDescriptor) {
        if (fileDescriptor != null && fileDescriptor.valid()) {
            try {
                Os.close(fileDescriptor);
            } catch (ErrnoException e5) {
                e5.printStackTrace();
            }
        }
    }

    public static int read(FileDescriptor fileDescriptor, byte[] bArr, int i5, int i6) throws IOException {
        ArrayUtils.checkOffsetAndCount(bArr.length, i5, i6);
        if (i6 == 0) {
            return 0;
        }
        try {
            int read = Os.read(fileDescriptor, bArr, i5, i6);
            if (read == 0) {
                return -1;
            }
            return read;
        } catch (ErrnoException e5) {
            if (e5.errno == OsConstants.EAGAIN) {
                return 0;
            }
            throw new IOException(e5);
        }
    }

    public static void write(FileDescriptor fileDescriptor, byte[] bArr, int i5, int i6) throws IOException {
        ArrayUtils.checkOffsetAndCount(bArr.length, i5, i6);
        if (i6 == 0) {
            return;
        }
        while (i6 > 0) {
            try {
                int write = Os.write(fileDescriptor, bArr, i5, i6);
                i6 -= write;
                i5 += write;
            } catch (ErrnoException e5) {
                throw new IOException(e5);
            }
        }
    }

    public void forceClose() {
        closeQuietly(this.mTarget);
        closeQuietly(this.mServer);
        closeQuietly(this.mClient);
        this.mClosed = true;
    }

    public FileDescriptor getClientSocket() {
        return this.mClient;
    }

    public boolean isClosed() {
        return this.mClosed;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        byte[] bArr = new byte[8192];
        while (true) {
            try {
                try {
                    if (read(this.mServer, bArr, 0, 8) != 8) {
                        break;
                    }
                    ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                    int peekInt = FileUtils.peekInt(bArr, 0, byteOrder);
                    if (peekInt == 1) {
                        int peekInt2 = FileUtils.peekInt(bArr, 4, byteOrder);
                        while (peekInt2 > 0) {
                            int read = read(this.mServer, bArr, 0, Math.min(8192, peekInt2));
                            if (read != -1) {
                                write(this.mTarget, bArr, 0, read);
                                peekInt2 -= read;
                            } else {
                                throw new IOException("Unexpected EOF; still expected " + peekInt2 + " bytes");
                            }
                        }
                    } else if (peekInt == 2) {
                        Os.fsync(this.mTarget);
                        write(this.mServer, bArr, 0, 8);
                    } else if (peekInt == 3) {
                        Os.fsync(this.mTarget);
                        Os.close(this.mTarget);
                        this.mClosed = true;
                        write(this.mServer, bArr, 0, 8);
                        break;
                    }
                } finally {
                    forceClose();
                }
            } catch (ErrnoException | IOException e5) {
                Log.wtf(TAG, "Failed during bridge", e5);
            }
        }
    }

    public void setTargetFile(FileDescriptor fileDescriptor) {
        this.mTarget = fileDescriptor;
    }
}
