package u.dont.know.what.i.am;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class s extends r {
    @Override // u.dont.know.what.i.am.r
    public boolean a(String str, int i5) {
        File file = new File(str);
        if (i5 == 0 && !file.exists()) {
            return false;
        }
        if ((i5 & 4) != 0 && !file.canRead()) {
            return false;
        }
        if ((i5 & 2) != 0 && !file.canWrite()) {
            return false;
        }
        if ((i5 & 1) != 0 && !file.canExecute()) {
            return false;
        }
        return true;
    }

    @Override // u.dont.know.what.i.am.r
    public boolean b(String str) {
        return new File(str).exists();
    }

    @Override // u.dont.know.what.i.am.r
    public t d(String str, long j5, long j6) throws IOException {
        File file = new File(str);
        long length = file.length();
        long lastModified = file.lastModified();
        if (j5 == length && j6 == lastModified) {
            return new t(length, lastModified);
        }
        return new t(new BufferedInputStream(new FileInputStream(str), 16384), length, lastModified);
    }

    @Override // u.dont.know.what.i.am.r
    public InputStream e(String str) throws IOException {
        return new BufferedInputStream(new FileInputStream(str), 16384);
    }

    @Override // u.dont.know.what.i.am.r
    public boolean h() {
        return true;
    }

    @Override // u.dont.know.what.i.am.r
    public t i(String str, int i5, int i6, long j5, long j6) throws IOException {
        File file = new File(str);
        long length = file.length();
        long lastModified = file.lastModified();
        if (j5 == length && j6 == lastModified) {
            return new t(length, lastModified);
        }
        if (i5 <= 0 && i6 <= 0) {
            return new t(k(str), length, lastModified);
        }
        if (i5 > 0 && i5 >= length) {
            throw new IllegalArgumentException("Offset " + i5 + " is out of range for " + str);
        }
        if (i5 < 0) {
            i5 = 0;
        }
        if (i6 > 0 && i5 + i6 > length) {
            throw new IllegalArgumentException("Length " + i6 + " is out of range for " + str);
        }
        if (i6 <= 0) {
            i6 = (int) (length - i5);
        }
        byte[] bArr = new byte[i6];
        FileInputStream fileInputStream = new FileInputStream(file);
        fileInputStream.skip(i5);
        fileInputStream.read(bArr);
        fileInputStream.close();
        return new t(bArr, length, lastModified);
    }

    @Override // u.dont.know.what.i.am.r
    public t j(String str, long j5, long j6) throws IOException {
        File file = new File(str);
        long length = file.length();
        long lastModified = file.lastModified();
        if (j5 == length && j6 == lastModified) {
            return new t(length, lastModified);
        }
        return new t(k(str), length, lastModified);
    }

    @Override // u.dont.know.what.i.am.r
    public byte[] k(String str) throws IOException {
        File file = new File(str);
        byte[] bArr = new byte[(int) file.length()];
        FileInputStream fileInputStream = new FileInputStream(file);
        fileInputStream.read(bArr);
        fileInputStream.close();
        return bArr;
    }

    @Override // u.dont.know.what.i.am.r
    public t l(String str) throws IOException {
        File file = new File(str);
        return new t(file.length(), file.lastModified());
    }
}
