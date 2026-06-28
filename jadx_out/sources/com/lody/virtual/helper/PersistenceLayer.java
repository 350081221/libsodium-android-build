package com.lody.virtual.helper;

import android.os.Parcel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class PersistenceLayer {
    private File mPersistenceFile;

    public PersistenceLayer(File file) {
        this.mPersistenceFile = file;
    }

    public abstract int getCurrentVersion();

    public final File getPersistenceFile() {
        return this.mPersistenceFile;
    }

    public void onPersistenceFileDamage() {
    }

    public void read() {
        int length;
        byte[] bArr;
        int read;
        File file = this.mPersistenceFile;
        Parcel obtain = Parcel.obtain();
        try {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                length = (int) file.length();
                bArr = new byte[length];
                read = fileInputStream.read(bArr);
                fileInputStream.close();
            } catch (Exception e5) {
                if (!(e5 instanceof FileNotFoundException)) {
                    e5.printStackTrace();
                }
            }
            if (read == length) {
                obtain.unmarshall(bArr, 0, length);
                obtain.setDataPosition(0);
                if (verifyMagic(obtain)) {
                    readPersistenceData(obtain, obtain.readInt());
                    return;
                } else {
                    onPersistenceFileDamage();
                    throw new IOException("Invalid persistence file.");
                }
            }
            throw new IOException("Unable to read Persistence file.");
        } finally {
            obtain.recycle();
        }
    }

    public abstract void readPersistenceData(Parcel parcel, int i5);

    public void save() {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                writeMagic(obtain);
                obtain.writeInt(getCurrentVersion());
                writePersistenceData(obtain);
                FileOutputStream fileOutputStream = new FileOutputStream(this.mPersistenceFile);
                fileOutputStream.write(obtain.marshall());
                fileOutputStream.close();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        } finally {
            obtain.recycle();
        }
    }

    public boolean verifyMagic(Parcel parcel) {
        return true;
    }

    public void writeMagic(Parcel parcel) {
    }

    public abstract void writePersistenceData(Parcel parcel);
}
