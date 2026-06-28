package com.efs.sdk.base.core.b;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.f.f;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.ProcessUtil;
import java.io.File;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a */
    public boolean f6496a;

    /* renamed from: b */
    public boolean f6497b;

    /* renamed from: c */
    public com.efs.sdk.base.core.b.b f6498c;

    /* renamed from: d */
    public C0140a f6499d;

    /* renamed from: com.efs.sdk.base.core.b.a$a */
    /* loaded from: classes2.dex */
    public static class C0140a implements Comparator<File> {
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(File file, File file2) {
            long lastModified = file.lastModified() - file2.lastModified();
            if (lastModified > 0) {
                return 1;
            }
            if (lastModified == 0) {
                return 0;
            }
            return -1;
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a */
        private static final a f6500a = new a((byte) 0);

        public static /* synthetic */ a a() {
            return f6500a;
        }
    }

    /* synthetic */ a(byte b5) {
        this();
    }

    public static void b(@NonNull File file) {
        com.efs.sdk.base.core.f.f fVar;
        if (!file.getName().startsWith("wa_")) {
            fVar = f.a.f6622a;
            fVar.f6620c.e();
        }
        com.efs.sdk.base.core.util.b.b(file);
    }

    public static void c(File file) {
        com.efs.sdk.base.core.f.f fVar;
        StringBuilder sb = new StringBuilder("file is expire: ");
        sb.append(file.getName());
        sb.append(", now is ");
        com.efs.sdk.base.core.a.a.a();
        sb.append(com.efs.sdk.base.core.a.a.b());
        Log.i("efs.cache", sb.toString());
        if (!file.getName().startsWith("wa_")) {
            fVar = f.a.f6622a;
            fVar.f6620c.d();
        }
        com.efs.sdk.base.core.util.b.b(file);
    }

    public final void a() {
        String[] list;
        File d5 = com.efs.sdk.base.core.util.a.d(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid());
        if (!d5.exists() || !d5.isDirectory() || (list = d5.list()) == null || list.length <= 0) {
            return;
        }
        for (String str : list) {
            if (!ProcessUtil.isProcessExist(ControllerCenter.getGlobalEnvStruct().mAppContext, str)) {
                File file = new File(d5, str);
                List<File> d6 = com.efs.sdk.base.core.util.b.d(file);
                if (!d6.isEmpty()) {
                    for (File file2 : d6) {
                        if (a(file2.getName())) {
                            c(file2);
                        } else {
                            com.efs.sdk.base.core.d.b b5 = com.efs.sdk.base.core.util.b.b(file2.getName());
                            if (b5 == null) {
                                b(file2);
                            } else {
                                e a5 = this.f6498c.a(b5.f6591a.f6585b);
                                if (a5 == null) {
                                    b(file2);
                                } else {
                                    a5.a(file2);
                                }
                            }
                        }
                    }
                }
                com.efs.sdk.base.core.util.b.b(file);
            }
        }
    }

    private a() {
        this.f6496a = false;
        this.f6497b = true;
        this.f6498c = new com.efs.sdk.base.core.b.b();
        this.f6499d = new C0140a();
    }

    public static boolean a(String str) {
        try {
            long parseLong = Long.parseLong(str.substring(str.lastIndexOf("_") + 1));
            com.efs.sdk.base.core.a.a.a();
            return Math.abs(com.efs.sdk.base.core.a.a.b() - parseLong) >= 604800000;
        } catch (Throwable unused) {
            return true;
        }
    }

    @Nullable
    public final com.efs.sdk.base.core.d.b a(File file) {
        try {
            if (!file.exists()) {
                return null;
            }
            if (a(file.getName())) {
                c(file);
                return null;
            }
            com.efs.sdk.base.core.d.b b5 = com.efs.sdk.base.core.util.b.b(file.getName());
            if (b5 == null) {
                b(file);
                return null;
            }
            e a5 = this.f6498c.a(b5.f6591a.f6585b);
            if (a5 == null) {
                b(file);
                return null;
            }
            if (a5.a(file, b5)) {
                return b5;
            }
            b(file);
            return null;
        } catch (Throwable th) {
            Log.w("efs.cache", th);
            b(file);
            return null;
        }
    }
}
