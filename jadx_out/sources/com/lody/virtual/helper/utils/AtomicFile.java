package com.lody.virtual.helper.utils;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public class AtomicFile {
    private final File mBackupName;
    private final File mBaseName;

    public AtomicFile(File file) {
        this.mBaseName = file;
        this.mBackupName = new File(file.getPath() + ".bak");
    }

    static boolean sync(FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return true;
        }
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public void delete() {
        this.mBaseName.delete();
        this.mBackupName.delete();
    }

    public void failWrite(FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            sync(fileOutputStream);
            try {
                fileOutputStream.close();
                this.mBaseName.delete();
                this.mBackupName.renameTo(this.mBaseName);
            } catch (IOException e5) {
                Log.w("AtomicFile", "failWrite: Got exception:", e5);
            }
        }
    }

    public void finishWrite(FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            sync(fileOutputStream);
            try {
                fileOutputStream.close();
                this.mBackupName.delete();
            } catch (IOException e5) {
                Log.w("AtomicFile", "finishWrite: Got exception:", e5);
            }
        }
    }

    public File getBaseFile() {
        return this.mBaseName;
    }

    @Deprecated
    public FileOutputStream openAppend() throws IOException {
        try {
            return new FileOutputStream(this.mBaseName, true);
        } catch (FileNotFoundException unused) {
            throw new IOException("Couldn't append " + this.mBaseName);
        }
    }

    public FileInputStream openRead() throws FileNotFoundException {
        if (this.mBackupName.exists()) {
            this.mBaseName.delete();
            this.mBackupName.renameTo(this.mBaseName);
        }
        return new FileInputStream(this.mBaseName);
    }

    public byte[] readFully() throws IOException {
        FileInputStream openRead = openRead();
        try {
            byte[] bArr = new byte[openRead.available()];
            int i5 = 0;
            while (true) {
                int read = openRead.read(bArr, i5, bArr.length - i5);
                if (read <= 0) {
                    return bArr;
                }
                i5 += read;
                int available = openRead.available();
                if (available > bArr.length - i5) {
                    byte[] bArr2 = new byte[available + i5];
                    System.arraycopy(bArr, 0, bArr2, 0, i5);
                    bArr = bArr2;
                }
            }
        } finally {
            openRead.close();
        }
    }

    public FileOutputStream startWrite() throws IOException {
        if (this.mBaseName.exists()) {
            if (!this.mBackupName.exists()) {
                if (!this.mBaseName.renameTo(this.mBackupName)) {
                    Log.w("AtomicFile", "Couldn't rename file " + this.mBaseName + " to backup file " + this.mBackupName);
                }
            } else {
                this.mBaseName.delete();
            }
        }
        try {
            return new FileOutputStream(this.mBaseName);
        } catch (FileNotFoundException unused) {
            if (this.mBaseName.getParentFile().mkdir()) {
                try {
                    return new FileOutputStream(this.mBaseName);
                } catch (FileNotFoundException unused2) {
                    throw new IOException("Couldn't create " + this.mBaseName);
                }
            }
            throw new IOException("Couldn't create directory " + this.mBaseName);
        }
    }

    public void truncate() throws IOException {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.mBaseName);
            fileOutputStream.getFD().sync();
            fileOutputStream.close();
        } catch (FileNotFoundException unused) {
            throw new IOException("Couldn't append " + this.mBaseName);
        } catch (IOException unused2) {
        }
    }
}
