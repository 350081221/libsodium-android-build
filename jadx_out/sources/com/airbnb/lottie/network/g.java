package com.airbnb.lottie.network;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final e f1581a;

    public g(@NonNull e eVar) {
        this.f1581a = eVar;
    }

    private static String c(String str, c cVar, boolean z4) {
        String str2;
        if (z4) {
            str2 = cVar.tempExtension();
        } else {
            str2 = cVar.extension;
        }
        String replaceAll = str.replaceAll("\\W+", "");
        int length = 242 - str2.length();
        if (replaceAll.length() > length) {
            replaceAll = e(replaceAll, length);
        }
        return "lottie_cache_" + replaceAll + str2;
    }

    @Nullable
    private File d(String str) throws FileNotFoundException {
        File file = new File(f(), c(str, c.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(f(), c(str, c.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    private static String e(String str, int i5) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b5 : digest) {
                sb.append(String.format("%02x", Byte.valueOf(b5)));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return str.substring(0, i5);
        }
    }

    private File f() {
        File a5 = this.f1581a.a();
        if (a5.isFile()) {
            a5.delete();
        }
        if (!a5.exists()) {
            a5.mkdirs();
        }
        return a5;
    }

    public void a() {
        File f5 = f();
        if (f5.exists()) {
            File[] listFiles = f5.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File file : listFiles) {
                    file.delete();
                }
            }
            f5.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    @WorkerThread
    public Pair<c, InputStream> b(String str) {
        c cVar;
        try {
            File d5 = d(str);
            if (d5 == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(d5);
            if (d5.getAbsolutePath().endsWith(".zip")) {
                cVar = c.ZIP;
            } else {
                cVar = c.JSON;
            }
            com.airbnb.lottie.utils.f.a("Cache hit for " + str + " at " + d5.getAbsolutePath());
            return new Pair<>(cVar, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(String str, c cVar) {
        File file = new File(f(), c(str, cVar, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        com.airbnb.lottie.utils.f.a("Copying temp file to real file (" + file2 + ")");
        if (!renameTo) {
            com.airbnb.lottie.utils.f.e("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public File h(String str, InputStream inputStream, c cVar) throws IOException {
        File file = new File(f(), c(str, cVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        return file;
                    }
                }
            } finally {
                fileOutputStream.close();
            }
        } finally {
            inputStream.close();
        }
    }
}
