package com.lody.virtual.server.fs;

import android.os.ParcelFileDescriptor;
import com.lody.virtual.remote.FileInfo;
import com.lody.virtual.server.fs.IFileTransfer;
import java.io.File;

/* loaded from: classes3.dex */
public class FileTransfer extends IFileTransfer.Stub {
    private static final FileTransfer sInstance = new FileTransfer();

    public static FileTransfer get() {
        return sInstance;
    }

    @Override // com.lody.virtual.server.fs.IFileTransfer
    public FileInfo[] listFiles(String str) {
        File[] listFiles = new File(str).listFiles();
        if (listFiles == null) {
            return null;
        }
        FileInfo[] fileInfoArr = new FileInfo[listFiles.length];
        for (int i5 = 0; i5 < listFiles.length; i5++) {
            fileInfoArr[i5] = new FileInfo(listFiles[i5]);
        }
        return fileInfoArr;
    }

    @Override // com.lody.virtual.server.fs.IFileTransfer
    public ParcelFileDescriptor openFile(String str) {
        try {
            return ParcelFileDescriptor.open(new File(str), 268435456);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }
}
