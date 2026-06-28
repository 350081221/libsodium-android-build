package com.bytedance.tools.b;

import android.os.HandlerThread;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import com.bytedance.tools.b.d;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes2.dex */
public class a extends HandlerThread implements d.a {

    /* renamed from: a, reason: collision with root package name */
    private d f6269a;

    /* renamed from: b, reason: collision with root package name */
    private String f6270b;

    /* renamed from: c, reason: collision with root package name */
    private BufferedWriter f6271c;

    /* renamed from: d, reason: collision with root package name */
    private File f6272d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.bytedance.tools.b.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0131a {

        /* renamed from: a, reason: collision with root package name */
        String f6273a;

        /* renamed from: b, reason: collision with root package name */
        String f6274b;

        /* renamed from: c, reason: collision with root package name */
        String f6275c;

        /* renamed from: d, reason: collision with root package name */
        int f6276d;

        /* renamed from: e, reason: collision with root package name */
        long f6277e;

        public C0131a(String str, String str2, String str3, int i5, long j5) {
            this.f6273a = str;
            this.f6274b = str2;
            this.f6275c = str3;
            this.f6276d = i5;
            this.f6277e = j5;
        }
    }

    public a(String str) {
        super("tt-tool-log");
        Log.i("TT_TOOLS", "init BigStringLogger :" + str);
        this.f6270b = str;
        start();
    }

    private void a() throws IOException {
        File file = new File(this.f6270b, "TOOL_LOG_BIG_STR");
        this.f6272d = file;
        if (!file.exists()) {
            this.f6272d.getParentFile().mkdirs();
            this.f6272d.createNewFile();
        } else if (this.f6272d.length() > 5242880) {
            this.f6272d.renameTo(new File(this.f6270b, "TOOL_LOG_BIG_STR_BACK"));
            File file2 = new File(this.f6270b, "TOOL_LOG_BIG_STR");
            this.f6272d = file2;
            file2.createNewFile();
        }
    }

    private void b(C0131a c0131a) {
        if (!this.f6272d.exists() || this.f6272d.length() > 5242880) {
            e();
            d();
        }
        BufferedWriter bufferedWriter = this.f6271c;
        if (bufferedWriter != null) {
            try {
                bufferedWriter.newLine();
                this.f6271c.write("[" + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.S").format(new Date(c0131a.f6277e)) + "][" + c0131a.f6276d + "][" + c0131a.f6274b + "]");
                this.f6271c.newLine();
                this.f6271c.write(c0131a.f6273a);
                this.f6271c.newLine();
                this.f6271c.write(c0131a.f6275c);
                this.f6271c.newLine();
            } catch (IOException e5) {
                Log.w("TT_TOOLS", e5);
            }
        }
    }

    private void d() {
        try {
            a();
            this.f6271c = new BufferedWriter(new FileWriter(this.f6272d, true));
        } catch (IOException e5) {
            Log.w("TT_TOOLS", e5);
        }
    }

    private void e() {
        try {
            BufferedWriter bufferedWriter = this.f6271c;
            if (bufferedWriter != null) {
                bufferedWriter.flush();
                this.f6271c.close();
            }
        } catch (IOException e5) {
            Log.w("TT_TOOLS", e5);
        }
    }

    public void c(String str, String str2, String str3) {
        d dVar = this.f6269a;
        if (dVar == null) {
            return;
        }
        Message obtain = Message.obtain(dVar);
        obtain.obj = new C0131a(str, str2, str3, Process.myTid(), System.currentTimeMillis());
        obtain.what = 0;
        this.f6269a.sendMessage(obtain);
    }

    @Override // android.os.HandlerThread
    protected void onLooperPrepared() {
        this.f6269a = new d(getLooper(), this);
        d();
    }

    @Override // com.bytedance.tools.b.d.a
    public void a(Message message) {
        if (message.what != 0) {
            return;
        }
        b((C0131a) message.obj);
    }
}
