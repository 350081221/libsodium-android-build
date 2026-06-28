package kotlin.io;

import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import java.io.File;
import java.io.IOException;
import kotlin.i0;

@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/io/FileSystemException;", "Ljava/io/IOException;", "file", "Ljava/io/File;", "other", MediationConstant.KEY_REASON, "", "(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V", "getFile", "()Ljava/io/File;", "getOther", "getReason", "()Ljava/lang/String;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public class j extends IOException {

    @p4.l
    private final File file;

    @p4.m
    private final File other;

    @p4.m
    private final String reason;

    public /* synthetic */ j(File file, File file2, String str, int i5, kotlin.jvm.internal.w wVar) {
        this(file, (i5 & 2) != 0 ? null : file2, (i5 & 4) != 0 ? null : str);
    }

    @p4.l
    public final File getFile() {
        return this.file;
    }

    @p4.m
    public final File getOther() {
        return this.other;
    }

    @p4.m
    public final String getReason() {
        return this.reason;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j(@p4.l java.io.File r2, @p4.m java.io.File r3, @p4.m java.lang.String r4) {
        /*
            r1 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.l0.p(r2, r0)
            java.lang.String r0 = kotlin.io.f.a(r2, r3, r4)
            r1.<init>(r0)
            r1.file = r2
            r1.other = r3
            r1.reason = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.j.<init>(java.io.File, java.io.File, java.lang.String):void");
    }
}
