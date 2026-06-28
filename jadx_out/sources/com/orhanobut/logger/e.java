package com.orhanobut.logger;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/* loaded from: classes3.dex */
public class e implements h {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final Handler f9351a;

    /* loaded from: classes3.dex */
    static class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        private final String f9352a;

        /* renamed from: b, reason: collision with root package name */
        private final int f9353b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(@NonNull Looper looper, @NonNull String str, int i5) {
            super((Looper) o.a(looper));
            this.f9352a = (String) o.a(str);
            this.f9353b = i5;
        }

        private File a(@NonNull String str, @NonNull String str2) {
            o.a(str);
            o.a(str2);
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, String.format("%s_%s.csv", str2, 0));
            File file3 = null;
            int i5 = 0;
            while (file2.exists()) {
                i5++;
                file3 = file2;
                file2 = new File(file, String.format("%s_%s.csv", str2, Integer.valueOf(i5)));
            }
            if (file3 != null) {
                if (file3.length() >= this.f9353b) {
                    return file2;
                }
                return file3;
            }
            return file2;
        }

        private void b(@NonNull FileWriter fileWriter, @NonNull String str) throws IOException {
            o.a(fileWriter);
            o.a(str);
            fileWriter.append((CharSequence) str);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            String str = (String) message.obj;
            FileWriter fileWriter = null;
            try {
                FileWriter fileWriter2 = new FileWriter(a(this.f9352a, "logs"), true);
                try {
                    b(fileWriter2, str);
                    fileWriter2.flush();
                    fileWriter2.close();
                } catch (IOException unused) {
                    fileWriter = fileWriter2;
                    if (fileWriter != null) {
                        try {
                            fileWriter.flush();
                            fileWriter.close();
                        } catch (IOException unused2) {
                        }
                    }
                }
            } catch (IOException unused3) {
            }
        }
    }

    public e(@NonNull Handler handler) {
        this.f9351a = (Handler) o.a(handler);
    }

    @Override // com.orhanobut.logger.h
    public void a(int i5, @Nullable String str, @NonNull String str2) {
        o.a(str2);
        Handler handler = this.f9351a;
        handler.sendMessage(handler.obtainMessage(i5, str2));
    }
}
