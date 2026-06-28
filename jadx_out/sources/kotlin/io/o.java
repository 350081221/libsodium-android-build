package kotlin.io;

import com.umeng.analytics.pro.o;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000z\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t\u001a!\u0010\n\u001a\u00020\u000b*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\rH\u0087\b\u001a!\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\rH\u0087\b\u001aB\u0010\u0010\u001a\u00020\u0001*\u00020\u000226\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00010\u0012\u001aJ\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\r26\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00010\u0012\u001a7\u0010\u0018\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00010\u0019\u001a\r\u0010\u001b\u001a\u00020\u001c*\u00020\u0002H\u0087\b\u001a\r\u0010\u001d\u001a\u00020\u001e*\u00020\u0002H\u0087\b\u001a\u0017\u0010\u001f\u001a\u00020 *\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\tH\u0087\b\u001a\n\u0010!\u001a\u00020\u0004*\u00020\u0002\u001a\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070#*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t\u001a\u0014\u0010$\u001a\u00020\u0007*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t\u001a\u0017\u0010%\u001a\u00020&*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\tH\u0087\b\u001a?\u0010'\u001a\u0002H(\"\u0004\b\u0000\u0010(*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t2\u0018\u0010)\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070*\u0012\u0004\u0012\u0002H(0\u0019H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010+\u001a\u0012\u0010,\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010-\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t\u001a\u0017\u0010.\u001a\u00020/*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\tH\u0087\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00060"}, d2 = {"appendBytes", "", "Ljava/io/File;", "array", "", "appendText", "text", "", "charset", "Ljava/nio/charset/Charset;", "bufferedReader", "Ljava/io/BufferedReader;", "bufferSize", "", "bufferedWriter", "Ljava/io/BufferedWriter;", "forEachBlock", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "buffer", "bytesRead", "blockSize", "forEachLine", "Lkotlin/Function1;", "line", "inputStream", "Ljava/io/FileInputStream;", "outputStream", "Ljava/io/FileOutputStream;", "printWriter", "Ljava/io/PrintWriter;", "readBytes", "readLines", "", "readText", "reader", "Ljava/io/InputStreamReader;", "useLines", "T", "block", "Lkotlin/sequences/Sequence;", "(Ljava/io/File;Ljava/nio/charset/Charset;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "writeBytes", "writeText", "writer", "Ljava/io/OutputStreamWriter;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/FilesKt")
@r1({"SMAP\nFileReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileReadWrite.kt\nkotlin/io/FilesKt__FileReadWriteKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,232:1\n231#1:234\n1#2:233\n1#2:235\n*S KotlinDebug\n*F\n+ 1 FileReadWrite.kt\nkotlin/io/FilesKt__FileReadWriteKt\n*L\n230#1:234\n230#1:235\n*E\n"})
/* loaded from: classes2.dex */
public class o extends n {

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a extends n0 implements v3.l<String, r2> {
        final /* synthetic */ ArrayList<String> $result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ArrayList<String> arrayList) {
            super(1);
            this.$result = arrayList;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(String str) {
            invoke2(str);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l String it) {
            l0.p(it, "it");
            this.$result.add(it);
        }
    }

    @kotlin.internal.f
    private static final InputStreamReader A(File file, Charset charset) {
        l0.p(file, "<this>");
        l0.p(charset, "charset");
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    static /* synthetic */ InputStreamReader B(File file, Charset charset, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charset = kotlin.text.f.f19703b;
        }
        l0.p(file, "<this>");
        l0.p(charset, "charset");
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    public static final <T> T C(@p4.l File file, @p4.l Charset charset, @p4.l v3.l<? super kotlin.sequences.m<String>, ? extends T> block) {
        BufferedReader bufferedReader;
        l0.p(file, "<this>");
        l0.p(charset, "charset");
        l0.p(block, "block");
        Reader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        if (inputStreamReader instanceof BufferedReader) {
            bufferedReader = (BufferedReader) inputStreamReader;
        } else {
            bufferedReader = new BufferedReader(inputStreamReader, 8192);
        }
        try {
            T invoke = block.invoke(y.h(bufferedReader));
            kotlin.jvm.internal.i0.d(1);
            c.a(bufferedReader, null);
            kotlin.jvm.internal.i0.c(1);
            return invoke;
        } finally {
        }
    }

    public static /* synthetic */ Object D(File file, Charset charset, v3.l lVar, int i5, Object obj) {
        BufferedReader bufferedReader;
        if ((i5 & 1) != 0) {
            charset = kotlin.text.f.f19703b;
        }
        Reader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        if (inputStreamReader instanceof BufferedReader) {
            bufferedReader = (BufferedReader) inputStreamReader;
        } else {
            bufferedReader = new BufferedReader(inputStreamReader, 8192);
        }
        try {
            Object invoke = lVar.invoke(y.h(bufferedReader));
            kotlin.jvm.internal.i0.d(1);
            c.a(bufferedReader, null);
            kotlin.jvm.internal.i0.c(1);
            return invoke;
        } finally {
        }
    }

    public static final void E(@p4.l File file, @p4.l byte[] array) {
        l0.p(file, "<this>");
        l0.p(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(array);
            r2 r2Var = r2.f19517a;
            c.a(fileOutputStream, null);
        } finally {
        }
    }

    public static final void F(@p4.l File file, @p4.l String text, @p4.l Charset charset) {
        l0.p(file, "<this>");
        l0.p(text, "text");
        l0.p(charset, "charset");
        byte[] bytes = text.getBytes(charset);
        l0.o(bytes, "this as java.lang.String).getBytes(charset)");
        E(file, bytes);
    }

    public static /* synthetic */ void G(File file, String str, Charset charset, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            charset = kotlin.text.f.f19703b;
        }
        F(file, str, charset);
    }

    @kotlin.internal.f
    private static final OutputStreamWriter H(File file, Charset charset) {
        l0.p(file, "<this>");
        l0.p(charset, "charset");
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    static /* synthetic */ OutputStreamWriter I(File file, Charset charset, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charset = kotlin.text.f.f19703b;
        }
        l0.p(file, "<this>");
        l0.p(charset, "charset");
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    public static final void g(@p4.l File file, @p4.l byte[] array) {
        l0.p(file, "<this>");
        l0.p(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            fileOutputStream.write(array);
            r2 r2Var = r2.f19517a;
            c.a(fileOutputStream, null);
        } finally {
        }
    }

    public static final void h(@p4.l File file, @p4.l String text, @p4.l Charset charset) {
        l0.p(file, "<this>");
        l0.p(text, "text");
        l0.p(charset, "charset");
        byte[] bytes = text.getBytes(charset);
        l0.o(bytes, "this as java.lang.String).getBytes(charset)");
        g(file, bytes);
    }

    public static /* synthetic */ void i(File file, String str, Charset charset, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            charset = kotlin.text.f.f19703b;
        }
        h(file, str, charset);
    }

    @kotlin.internal.f
    private static final BufferedReader j(File file, Charset charset, int i5) {
        l0.p(file, "<this>");
        l0.p(charset, "charset");
        Reader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        if (inputStreamReader instanceof BufferedReader) {
            return (BufferedReader) inputStreamReader;
        }
        return new BufferedReader(inputStreamReader, i5);
    }

    static /* synthetic */ BufferedReader k(File file, Charset charset, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            charset = kotlin.text.f.f19703b;
        }
        if ((i6 & 2) != 0) {
            i5 = 8192;
        }
        l0.p(file, "<this>");
        l0.p(charset, "charset");
        Reader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        if (inputStreamReader instanceof BufferedReader) {
            return (BufferedReader) inputStreamReader;
        }
        return new BufferedReader(inputStreamReader, i5);
    }

    @kotlin.internal.f
    private static final BufferedWriter l(File file, Charset charset, int i5) {
        l0.p(file, "<this>");
        l0.p(charset, "charset");
        Writer outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        if (outputStreamWriter instanceof BufferedWriter) {
            return (BufferedWriter) outputStreamWriter;
        }
        return new BufferedWriter(outputStreamWriter, i5);
    }

    static /* synthetic */ BufferedWriter m(File file, Charset charset, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            charset = kotlin.text.f.f19703b;
        }
        if ((i6 & 2) != 0) {
            i5 = 8192;
        }
        l0.p(file, "<this>");
        l0.p(charset, "charset");
        Writer outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        if (outputStreamWriter instanceof BufferedWriter) {
            return (BufferedWriter) outputStreamWriter;
        }
        return new BufferedWriter(outputStreamWriter, i5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [byte[], java.lang.Object] */
    public static final void n(@p4.l File file, int i5, @p4.l v3.p<? super byte[], ? super Integer, r2> action) {
        int u4;
        l0.p(file, "<this>");
        l0.p(action, "action");
        u4 = kotlin.ranges.u.u(i5, 512);
        ?? r22 = new byte[u4];
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(r22);
                if (read <= 0) {
                    r2 r2Var = r2.f19517a;
                    c.a(fileInputStream, null);
                    return;
                }
                action.invoke(r22, Integer.valueOf(read));
            } finally {
            }
        }
    }

    public static final void o(@p4.l File file, @p4.l v3.p<? super byte[], ? super Integer, r2> action) {
        l0.p(file, "<this>");
        l0.p(action, "action");
        n(file, 4096, action);
    }

    public static final void p(@p4.l File file, @p4.l Charset charset, @p4.l v3.l<? super String, r2> action) {
        l0.p(file, "<this>");
        l0.p(charset, "charset");
        l0.p(action, "action");
        y.g(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), action);
    }

    public static /* synthetic */ void q(File file, Charset charset, v3.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charset = kotlin.text.f.f19703b;
        }
        p(file, charset, lVar);
    }

    @kotlin.internal.f
    private static final FileInputStream r(File file) {
        l0.p(file, "<this>");
        return new FileInputStream(file);
    }

    @kotlin.internal.f
    private static final FileOutputStream s(File file) {
        l0.p(file, "<this>");
        return new FileOutputStream(file);
    }

    @kotlin.internal.f
    private static final PrintWriter t(File file, Charset charset) {
        BufferedWriter bufferedWriter;
        l0.p(file, "<this>");
        l0.p(charset, "charset");
        Writer outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        if (outputStreamWriter instanceof BufferedWriter) {
            bufferedWriter = (BufferedWriter) outputStreamWriter;
        } else {
            bufferedWriter = new BufferedWriter(outputStreamWriter, 8192);
        }
        return new PrintWriter(bufferedWriter);
    }

    static /* synthetic */ PrintWriter u(File file, Charset charset, int i5, Object obj) {
        BufferedWriter bufferedWriter;
        if ((i5 & 1) != 0) {
            charset = kotlin.text.f.f19703b;
        }
        l0.p(file, "<this>");
        l0.p(charset, "charset");
        Writer outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        if (outputStreamWriter instanceof BufferedWriter) {
            bufferedWriter = (BufferedWriter) outputStreamWriter;
        } else {
            bufferedWriter = new BufferedWriter(outputStreamWriter, 8192);
        }
        return new PrintWriter(bufferedWriter);
    }

    @p4.l
    public static byte[] v(@p4.l File file) {
        l0.p(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length <= 2147483647L) {
                int i5 = (int) length;
                byte[] bArr = new byte[i5];
                int i6 = i5;
                int i7 = 0;
                while (i6 > 0) {
                    int read = fileInputStream.read(bArr, i7, i6);
                    if (read < 0) {
                        break;
                    }
                    i6 -= read;
                    i7 += read;
                }
                if (i6 > 0) {
                    bArr = Arrays.copyOf(bArr, i7);
                    l0.o(bArr, "copyOf(this, newSize)");
                } else {
                    int read2 = fileInputStream.read();
                    if (read2 != -1) {
                        g gVar = new g(o.a.f12708r);
                        gVar.write(read2);
                        b.l(fileInputStream, gVar, 0, 2, null);
                        int size = gVar.size() + i5;
                        if (size >= 0) {
                            byte[] a5 = gVar.a();
                            byte[] copyOf = Arrays.copyOf(bArr, size);
                            l0.o(copyOf, "copyOf(this, newSize)");
                            bArr = kotlin.collections.o.v0(a5, copyOf, i5, 0, gVar.size());
                        } else {
                            throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                        }
                    }
                }
                c.a(fileInputStream, null);
                return bArr;
            }
            throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c.a(fileInputStream, th);
                throw th2;
            }
        }
    }

    @p4.l
    public static final List<String> w(@p4.l File file, @p4.l Charset charset) {
        l0.p(file, "<this>");
        l0.p(charset, "charset");
        ArrayList arrayList = new ArrayList();
        p(file, charset, new a(arrayList));
        return arrayList;
    }

    public static /* synthetic */ List x(File file, Charset charset, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charset = kotlin.text.f.f19703b;
        }
        return w(file, charset);
    }

    @p4.l
    public static final String y(@p4.l File file, @p4.l Charset charset) {
        l0.p(file, "<this>");
        l0.p(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String k5 = y.k(inputStreamReader);
            c.a(inputStreamReader, null);
            return k5;
        } finally {
        }
    }

    public static /* synthetic */ String z(File file, Charset charset, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charset = kotlin.text.f.f19703b;
        }
        return y(file, charset);
    }
}
