package com.lody.virtual.client.ipc;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.lody.virtual.client.env.VirtualRuntime;
import com.lody.virtual.helper.utils.FileUtils;
import com.lody.virtual.helper.utils.IInterfaceUtils;
import com.lody.virtual.remote.FileInfo;
import com.lody.virtual.server.fs.IFileTransfer;
import java.io.File;
import java.io.IOException;

/* loaded from: classes3.dex */
public class FileTransfer {
    private static final FileTransfer sInstance = new FileTransfer();
    private IFileTransfer mTransfer;

    public static FileTransfer get() {
        return sInstance;
    }

    private Object getStubInterface() {
        return IFileTransfer.Stub.asInterface(ServiceManagerNative.getService(ServiceManagerNative.FILE_TRANSFER));
    }

    public void copyDirectory(File file, File file2) {
        FileInfo[] listFiles;
        if (file.equals(file2) || (listFiles = listFiles(file)) == null) {
            return;
        }
        FileUtils.ensureDirCreate(file2);
        for (FileInfo fileInfo : listFiles) {
            File file3 = new File(fileInfo.path);
            File file4 = new File(file2, file3.getName());
            if (fileInfo.isDirectory) {
                copyDirectory(file3, file4);
            } else {
                copyFile(file3, file4);
            }
        }
    }

    public void copyFile(File file, File file2) {
        if (file.equals(file2)) {
            return;
        }
        FileUtils.ensureDirCreate(file2.getParentFile());
        ParcelFileDescriptor openFile = openFile(file);
        if (openFile == null) {
            return;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(openFile);
        try {
            FileUtils.writeToFile(autoCloseInputStream, file2);
        } catch (IOException e5) {
            e5.printStackTrace();
        }
        FileUtils.closeQuietly(autoCloseInputStream);
    }

    public IFileTransfer getService() {
        if (!IInterfaceUtils.isAlive(this.mTransfer)) {
            synchronized (FileTransfer.class) {
                this.mTransfer = (IFileTransfer) LocalProxyUtils.genProxy(IFileTransfer.class, getStubInterface());
            }
        }
        return this.mTransfer;
    }

    public FileInfo[] listFiles(File file) {
        return listFiles(file.getPath());
    }

    public ParcelFileDescriptor openFile(File file) {
        return openFile(file.getAbsolutePath());
    }

    public FileInfo[] listFiles(String str) {
        try {
            return getService().listFiles(str);
        } catch (RemoteException e5) {
            return (FileInfo[]) VirtualRuntime.crash(e5);
        }
    }

    public ParcelFileDescriptor openFile(String str) {
        try {
            return getService().openFile(str);
        } catch (RemoteException e5) {
            return (ParcelFileDescriptor) VirtualRuntime.crash(e5);
        }
    }
}
