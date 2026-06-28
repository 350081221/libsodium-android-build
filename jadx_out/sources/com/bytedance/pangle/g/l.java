package com.bytedance.pangle.g;

import android.system.Os;
import android.system.OsConstants;
import java.io.FileDescriptor;

/* loaded from: classes2.dex */
final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    private static final long f4432a = Os.sysconf(OsConstants._SC_PAGESIZE);

    /* renamed from: b, reason: collision with root package name */
    private final FileDescriptor f4433b;

    /* renamed from: c, reason: collision with root package name */
    private final long f4434c;

    /* renamed from: d, reason: collision with root package name */
    private final long f4435d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(FileDescriptor fileDescriptor, long j5, long j6) {
        this.f4433b = fileDescriptor;
        this.f4434c = j5;
        this.f4435d = j6;
    }

    @Override // com.bytedance.pangle.g.k
    public final long a() {
        return this.f4435d;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0110 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.bytedance.pangle.g.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.bytedance.pangle.g.j r19, long r20, int r22) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pangle.g.l.a(com.bytedance.pangle.g.j, long, int):void");
    }
}
