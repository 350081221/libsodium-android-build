package com.lody.virtual.remote;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;

/* loaded from: classes3.dex */
public class FileInfo implements Parcelable {
    public static final Parcelable.Creator<FileInfo> CREATOR = new Parcelable.Creator<FileInfo>() { // from class: com.lody.virtual.remote.FileInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FileInfo createFromParcel(Parcel parcel) {
            return new FileInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FileInfo[] newArray(int i5) {
            return new FileInfo[i5];
        }
    };
    public boolean isDirectory;
    public String path;

    private FileInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeByte(this.isDirectory ? (byte) 1 : (byte) 0);
        parcel.writeString(this.path);
    }

    public FileInfo(File file) {
        this.isDirectory = file.isDirectory();
        this.path = file.getPath();
    }

    protected FileInfo(Parcel parcel) {
        this.isDirectory = parcel.readByte() != 0;
        this.path = parcel.readString();
    }
}
