package com.uyumao;

import android.content.BroadcastReceiver;
import android.content.Context;
import java.io.File;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class h extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public long f13669a = 0;

    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f13670a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JSONObject f13671b;

        public a(h hVar, Context context, JSONObject jSONObject) {
            this.f13670a = context;
            this.f13671b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            File file = new File(this.f13670a.getCacheDir().getPath() + File.separator + "net_change");
            StringBuilder sb = new StringBuilder();
            sb.append(this.f13671b.toString());
            sb.append("\n");
            e.a(file, sb.toString().getBytes(), true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0114 A[Catch: all -> 0x0130, TRY_LEAVE, TryCatch #0 {all -> 0x0130, blocks: (B:3:0x0002, B:5:0x000c, B:9:0x0015, B:12:0x0034, B:14:0x003a, B:16:0x0040, B:19:0x004c, B:36:0x0114, B:42:0x012d, B:48:0x010e, B:51:0x006e, B:53:0x0074, B:55:0x007a, B:56:0x008c, B:58:0x0092, B:60:0x0098, B:62:0x009e, B:65:0x00aa, B:66:0x00c0, B:38:0x011b), top: B:2:0x0002, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onReceive(android.content.Context r14, android.content.Intent r15) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uyumao.h.onReceive(android.content.Context, android.content.Intent):void");
    }
}
