package androidx.core.util;

import java.io.FileOutputStream;
import java.nio.charset.Charset;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;

@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a0\u0010\b\u001a\u00020\u0006*\u00020\u00002!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001H\u0086\b\u001a\u0012\u0010\u000b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\n\u001a\u00020\t\u001a\u001c\u0010\u0010\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u001a\r\u0010\u0011\u001a\u00020\t*\u00020\u0000H\u0086\b\u001a\u0014\u0010\u0012\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000e¨\u0006\u0013"}, d2 = {"Landroid/util/AtomicFile;", "Lkotlin/Function1;", "Ljava/io/FileOutputStream;", "Lkotlin/v0;", "name", "out", "Lkotlin/r2;", "block", "tryWrite", "", "array", "writeBytes", "", "text", "Ljava/nio/charset/Charset;", "charset", "writeText", "readBytes", "readText", "core-ktx_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nAtomicFile.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AtomicFile.kt\nandroidx/core/util/AtomicFileKt\n*L\n1#1,76:1\n30#1,13:77\n*S KotlinDebug\n*F\n+ 1 AtomicFile.kt\nandroidx/core/util/AtomicFileKt\n*L\n48#1:77,13\n*E\n"})
/* loaded from: classes2.dex */
public final class AtomicFileKt {
    @l
    public static final byte[] readBytes(@l android.util.AtomicFile atomicFile) {
        return atomicFile.readFully();
    }

    @l
    public static final String readText(@l android.util.AtomicFile atomicFile, @l Charset charset) {
        return new String(atomicFile.readFully(), charset);
    }

    public static /* synthetic */ String readText$default(android.util.AtomicFile atomicFile, Charset charset, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charset = kotlin.text.f.f19703b;
        }
        return readText(atomicFile, charset);
    }

    public static final void tryWrite(@l android.util.AtomicFile atomicFile, @l v3.l<? super FileOutputStream, r2> lVar) {
        FileOutputStream startWrite = atomicFile.startWrite();
        try {
            lVar.invoke(startWrite);
            kotlin.jvm.internal.i0.d(1);
            atomicFile.finishWrite(startWrite);
            kotlin.jvm.internal.i0.c(1);
        } catch (Throwable th) {
            kotlin.jvm.internal.i0.d(1);
            atomicFile.failWrite(startWrite);
            kotlin.jvm.internal.i0.c(1);
            throw th;
        }
    }

    public static final void writeBytes(@l android.util.AtomicFile atomicFile, @l byte[] bArr) {
        FileOutputStream startWrite = atomicFile.startWrite();
        try {
            startWrite.write(bArr);
            atomicFile.finishWrite(startWrite);
        } catch (Throwable th) {
            atomicFile.failWrite(startWrite);
            throw th;
        }
    }

    public static final void writeText(@l android.util.AtomicFile atomicFile, @l String str, @l Charset charset) {
        byte[] bytes = str.getBytes(charset);
        l0.o(bytes, "this as java.lang.String).getBytes(charset)");
        writeBytes(atomicFile, bytes);
    }

    public static /* synthetic */ void writeText$default(android.util.AtomicFile atomicFile, String str, Charset charset, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            charset = kotlin.text.f.f19703b;
        }
        writeText(atomicFile, str, charset);
    }
}
