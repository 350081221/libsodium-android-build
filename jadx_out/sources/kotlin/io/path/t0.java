package kotlin.io.path;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.v2;

@kotlin.i0(d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a%\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a%\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a\u001e\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u001a:\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u0010\u0015\u001a:\u0010\u0016\u001a\u00020\u0017*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u0010\u0018\u001a=\u0010\u0019\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00010\u001bH\u0087\bø\u0001\u0000\u001a&\u0010 \u001a\u00020!*\u00020\u00022\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u0010\"\u001a&\u0010#\u001a\u00020$*\u00020\u00022\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u0010%\u001a\r\u0010&\u001a\u00020\u0004*\u00020\u0002H\u0087\b\u001a\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001c0(*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a\u0016\u0010)\u001a\u00020\u001c*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u001a0\u0010*\u001a\u00020+*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u0010,\u001a?\u0010-\u001a\u0002H.\"\u0004\b\u0000\u0010.*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\u0018\u0010/\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u000b\u0012\u0004\u0012\u0002H.0\u001bH\u0087\bø\u0001\u0000¢\u0006\u0002\u00100\u001a.\u00101\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u00102\u001a>\u00103\u001a\u00020\u0002*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u00104\u001a>\u00103\u001a\u00020\u0002*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u00105\u001a7\u00106\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0007¢\u0006\u0002\u00107\u001a0\u00108\u001a\u000209*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u0010:\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006;"}, d2 = {"appendBytes", "", "Ljava/nio/file/Path;", "array", "", "appendLines", "lines", "", "", "charset", "Ljava/nio/charset/Charset;", "Lkotlin/sequences/Sequence;", "appendText", "text", "bufferedReader", "Ljava/io/BufferedReader;", "bufferSize", "", "options", "", "Ljava/nio/file/OpenOption;", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;I[Ljava/nio/file/OpenOption;)Ljava/io/BufferedReader;", "bufferedWriter", "Ljava/io/BufferedWriter;", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;I[Ljava/nio/file/OpenOption;)Ljava/io/BufferedWriter;", "forEachLine", "action", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "line", "inputStream", "Ljava/io/InputStream;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/InputStream;", "outputStream", "Ljava/io/OutputStream;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/OutputStream;", "readBytes", "readLines", "", "readText", "reader", "Ljava/io/InputStreamReader;", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/io/InputStreamReader;", "useLines", "T", "block", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "writeBytes", "(Ljava/nio/file/Path;[B[Ljava/nio/file/OpenOption;)V", "writeLines", "(Ljava/nio/file/Path;Ljava/lang/Iterable;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;", "(Ljava/nio/file/Path;Lkotlin/sequences/Sequence;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;", "writeText", "(Ljava/nio/file/Path;Ljava/lang/CharSequence;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)V", "writer", "Ljava/io/OutputStreamWriter;", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/io/OutputStreamWriter;", "kotlin-stdlib-jdk7"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/path/PathsKt")
@kotlin.jvm.internal.r1({"SMAP\nPathReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathReadWrite.kt\nkotlin/io/path/PathsKt__PathReadWriteKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,326:1\n1#2:327\n1#2:329\n52#3:328\n1313#4,2:330\n*S KotlinDebug\n*F\n+ 1 PathReadWrite.kt\nkotlin/io/path/PathsKt__PathReadWriteKt\n*L\n202#1:329\n202#1:328\n202#1:330,2\n*E\n"})
/* loaded from: classes4.dex */
class t0 {
    @kotlin.g1(version = "1.5")
    @v2(markerClass = {o.class})
    @kotlin.internal.f
    private static final Path A(Path path, kotlin.sequences.m<? extends CharSequence> lines, Charset charset, OpenOption... options) throws IOException {
        Iterable N;
        Path write;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(lines, "lines");
        kotlin.jvm.internal.l0.p(charset, "charset");
        kotlin.jvm.internal.l0.p(options, "options");
        N = kotlin.sequences.u.N(lines);
        write = Files.write(path, N, charset, (OpenOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.l0.o(write, "write(this, lines.asIterable(), charset, *options)");
        return write;
    }

    static /* synthetic */ Path B(Path path, Iterable lines, Charset charset, OpenOption[] options, int i5, Object obj) throws IOException {
        Path write;
        if ((i5 & 2) != 0) {
            charset = kotlin.text.f.f19703b;
        }
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(lines, "lines");
        kotlin.jvm.internal.l0.p(charset, "charset");
        kotlin.jvm.internal.l0.p(options, "options");
        write = Files.write(path, lines, charset, (OpenOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.l0.o(write, "write(this, lines, charset, *options)");
        return write;
    }

    static /* synthetic */ Path C(Path path, kotlin.sequences.m lines, Charset charset, OpenOption[] options, int i5, Object obj) throws IOException {
        Iterable N;
        Path write;
        if ((i5 & 2) != 0) {
            charset = kotlin.text.f.f19703b;
        }
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(lines, "lines");
        kotlin.jvm.internal.l0.p(charset, "charset");
        kotlin.jvm.internal.l0.p(options, "options");
        N = kotlin.sequences.u.N(lines);
        write = Files.write(path, N, charset, (OpenOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.l0.o(write, "write(this, lines.asIterable(), charset, *options)");
        return write;
    }

    @kotlin.g1(version = "1.5")
    @v2(markerClass = {o.class})
    public static final void D(@p4.l Path path, @p4.l CharSequence text, @p4.l Charset charset, @p4.l OpenOption... options) throws IOException {
        OutputStream newOutputStream;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(text, "text");
        kotlin.jvm.internal.l0.p(charset, "charset");
        kotlin.jvm.internal.l0.p(options, "options");
        newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.l0.o(newOutputStream, "newOutputStream(this, *options)");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(newOutputStream, charset);
        try {
            outputStreamWriter.append(text);
            kotlin.io.c.a(outputStreamWriter, null);
        } finally {
        }
    }

    public static /* synthetic */ void E(Path path, CharSequence charSequence, Charset charset, OpenOption[] openOptionArr, int i5, Object obj) throws IOException {
        if ((i5 & 2) != 0) {
            charset = kotlin.text.f.f19703b;
        }
        D(path, charSequence, charset, openOptionArr);
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final OutputStreamWriter F(Path path, Charset charset, OpenOption... options) throws IOException {
        OutputStream newOutputStream;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(charset, "charset");
        kotlin.jvm.internal.l0.p(options, "options");
        newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        return new OutputStreamWriter(newOutputStream, charset);
    }

    static /* synthetic */ OutputStreamWriter G(Path path, Charset charset, OpenOption[] options, int i5, Object obj) throws IOException {
        OutputStream newOutputStream;
        if ((i5 & 1) != 0) {
            charset = kotlin.text.f.f19703b;
        }
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(charset, "charset");
        kotlin.jvm.internal.l0.p(options, "options");
        newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        return new OutputStreamWriter(newOutputStream, charset);
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final void a(Path path, byte[] array) throws IOException {
        StandardOpenOption standardOpenOption;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(array, "array");
        standardOpenOption = StandardOpenOption.APPEND;
        Files.write(path, array, standardOpenOption);
    }

    @kotlin.g1(version = "1.5")
    @v2(markerClass = {o.class})
    @kotlin.internal.f
    private static final Path b(Path path, Iterable<? extends CharSequence> lines, Charset charset) throws IOException {
        StandardOpenOption standardOpenOption;
        Path write;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(lines, "lines");
        kotlin.jvm.internal.l0.p(charset, "charset");
        standardOpenOption = StandardOpenOption.APPEND;
        write = Files.write(path, lines, charset, standardOpenOption);
        kotlin.jvm.internal.l0.o(write, "write(this, lines, chars…tandardOpenOption.APPEND)");
        return write;
    }

    @kotlin.g1(version = "1.5")
    @v2(markerClass = {o.class})
    @kotlin.internal.f
    private static final Path c(Path path, kotlin.sequences.m<? extends CharSequence> lines, Charset charset) throws IOException {
        Iterable N;
        StandardOpenOption standardOpenOption;
        Path write;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(lines, "lines");
        kotlin.jvm.internal.l0.p(charset, "charset");
        N = kotlin.sequences.u.N(lines);
        standardOpenOption = StandardOpenOption.APPEND;
        write = Files.write(path, N, charset, standardOpenOption);
        kotlin.jvm.internal.l0.o(write, "write(this, lines.asIter…tandardOpenOption.APPEND)");
        return write;
    }

    static /* synthetic */ Path d(Path path, Iterable lines, Charset charset, int i5, Object obj) throws IOException {
        StandardOpenOption standardOpenOption;
        Path write;
        if ((i5 & 2) != 0) {
            charset = kotlin.text.f.f19703b;
        }
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(lines, "lines");
        kotlin.jvm.internal.l0.p(charset, "charset");
        standardOpenOption = StandardOpenOption.APPEND;
        write = Files.write(path, lines, charset, standardOpenOption);
        kotlin.jvm.internal.l0.o(write, "write(this, lines, chars…tandardOpenOption.APPEND)");
        return write;
    }

    static /* synthetic */ Path e(Path path, kotlin.sequences.m lines, Charset charset, int i5, Object obj) throws IOException {
        Iterable N;
        StandardOpenOption standardOpenOption;
        Path write;
        if ((i5 & 2) != 0) {
            charset = kotlin.text.f.f19703b;
        }
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(lines, "lines");
        kotlin.jvm.internal.l0.p(charset, "charset");
        N = kotlin.sequences.u.N(lines);
        standardOpenOption = StandardOpenOption.APPEND;
        write = Files.write(path, N, charset, standardOpenOption);
        kotlin.jvm.internal.l0.o(write, "write(this, lines.asIter…tandardOpenOption.APPEND)");
        return write;
    }

    @kotlin.g1(version = "1.5")
    @v2(markerClass = {o.class})
    public static final void f(@p4.l Path path, @p4.l CharSequence text, @p4.l Charset charset) throws IOException {
        StandardOpenOption standardOpenOption;
        OutputStream newOutputStream;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(text, "text");
        kotlin.jvm.internal.l0.p(charset, "charset");
        standardOpenOption = StandardOpenOption.APPEND;
        newOutputStream = Files.newOutputStream(path, standardOpenOption);
        kotlin.jvm.internal.l0.o(newOutputStream, "newOutputStream(this, StandardOpenOption.APPEND)");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(newOutputStream, charset);
        try {
            outputStreamWriter.append(text);
            kotlin.io.c.a(outputStreamWriter, null);
        } finally {
        }
    }

    public static /* synthetic */ void g(Path path, CharSequence charSequence, Charset charset, int i5, Object obj) throws IOException {
        if ((i5 & 2) != 0) {
            charset = kotlin.text.f.f19703b;
        }
        f(path, charSequence, charset);
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final BufferedReader h(Path path, Charset charset, int i5, OpenOption... options) throws IOException {
        InputStream newInputStream;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(charset, "charset");
        kotlin.jvm.internal.l0.p(options, "options");
        newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        return new BufferedReader(new InputStreamReader(newInputStream, charset), i5);
    }

    static /* synthetic */ BufferedReader i(Path path, Charset charset, int i5, OpenOption[] options, int i6, Object obj) throws IOException {
        InputStream newInputStream;
        if ((i6 & 1) != 0) {
            charset = kotlin.text.f.f19703b;
        }
        if ((i6 & 2) != 0) {
            i5 = 8192;
        }
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(charset, "charset");
        kotlin.jvm.internal.l0.p(options, "options");
        newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        return new BufferedReader(new InputStreamReader(newInputStream, charset), i5);
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final BufferedWriter j(Path path, Charset charset, int i5, OpenOption... options) throws IOException {
        OutputStream newOutputStream;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(charset, "charset");
        kotlin.jvm.internal.l0.p(options, "options");
        newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        return new BufferedWriter(new OutputStreamWriter(newOutputStream, charset), i5);
    }

    static /* synthetic */ BufferedWriter k(Path path, Charset charset, int i5, OpenOption[] options, int i6, Object obj) throws IOException {
        OutputStream newOutputStream;
        if ((i6 & 1) != 0) {
            charset = kotlin.text.f.f19703b;
        }
        if ((i6 & 2) != 0) {
            i5 = 8192;
        }
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(charset, "charset");
        kotlin.jvm.internal.l0.p(options, "options");
        newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        return new BufferedWriter(new OutputStreamWriter(newOutputStream, charset), i5);
    }

    @kotlin.g1(version = "1.5")
    @v2(markerClass = {o.class})
    @kotlin.internal.f
    private static final void l(Path path, Charset charset, v3.l<? super String, kotlin.r2> action) throws IOException {
        BufferedReader newBufferedReader;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(charset, "charset");
        kotlin.jvm.internal.l0.p(action, "action");
        newBufferedReader = Files.newBufferedReader(path, charset);
        kotlin.jvm.internal.l0.o(newBufferedReader, "newBufferedReader(this, charset)");
        try {
            Iterator<String> it = kotlin.io.y.h(newBufferedReader).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            kotlin.r2 r2Var = kotlin.r2.f19517a;
            kotlin.jvm.internal.i0.d(1);
            kotlin.io.c.a(newBufferedReader, null);
            kotlin.jvm.internal.i0.c(1);
        } finally {
        }
    }

    static /* synthetic */ void m(Path path, Charset charset, v3.l action, int i5, Object obj) throws IOException {
        BufferedReader newBufferedReader;
        if ((i5 & 1) != 0) {
            charset = kotlin.text.f.f19703b;
        }
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(charset, "charset");
        kotlin.jvm.internal.l0.p(action, "action");
        newBufferedReader = Files.newBufferedReader(path, charset);
        kotlin.jvm.internal.l0.o(newBufferedReader, "newBufferedReader(this, charset)");
        try {
            Iterator<String> it = kotlin.io.y.h(newBufferedReader).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            kotlin.r2 r2Var = kotlin.r2.f19517a;
            kotlin.jvm.internal.i0.d(1);
            kotlin.io.c.a(newBufferedReader, null);
            kotlin.jvm.internal.i0.c(1);
        } finally {
        }
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final InputStream n(Path path, OpenOption... options) throws IOException {
        InputStream newInputStream;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(options, "options");
        newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.l0.o(newInputStream, "newInputStream(this, *options)");
        return newInputStream;
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final OutputStream o(Path path, OpenOption... options) throws IOException {
        OutputStream newOutputStream;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(options, "options");
        newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.l0.o(newOutputStream, "newOutputStream(this, *options)");
        return newOutputStream;
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final byte[] p(Path path) throws IOException {
        byte[] readAllBytes;
        kotlin.jvm.internal.l0.p(path, "<this>");
        readAllBytes = Files.readAllBytes(path);
        kotlin.jvm.internal.l0.o(readAllBytes, "readAllBytes(this)");
        return readAllBytes;
    }

    @kotlin.g1(version = "1.5")
    @v2(markerClass = {o.class})
    @kotlin.internal.f
    private static final List<String> q(Path path, Charset charset) throws IOException {
        List<String> readAllLines;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(charset, "charset");
        readAllLines = Files.readAllLines(path, charset);
        kotlin.jvm.internal.l0.o(readAllLines, "readAllLines(this, charset)");
        return readAllLines;
    }

    static /* synthetic */ List r(Path path, Charset charset, int i5, Object obj) throws IOException {
        List readAllLines;
        if ((i5 & 1) != 0) {
            charset = kotlin.text.f.f19703b;
        }
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(charset, "charset");
        readAllLines = Files.readAllLines(path, charset);
        kotlin.jvm.internal.l0.o(readAllLines, "readAllLines(this, charset)");
        return readAllLines;
    }

    @p4.l
    @kotlin.g1(version = "1.5")
    @v2(markerClass = {o.class})
    public static final String s(@p4.l Path path, @p4.l Charset charset) throws IOException {
        InputStream newInputStream;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(charset, "charset");
        newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0));
        InputStreamReader inputStreamReader = new InputStreamReader(newInputStream, charset);
        try {
            String k5 = kotlin.io.y.k(inputStreamReader);
            kotlin.io.c.a(inputStreamReader, null);
            return k5;
        } finally {
        }
    }

    public static /* synthetic */ String t(Path path, Charset charset, int i5, Object obj) throws IOException {
        if ((i5 & 1) != 0) {
            charset = kotlin.text.f.f19703b;
        }
        return s(path, charset);
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final InputStreamReader u(Path path, Charset charset, OpenOption... options) throws IOException {
        InputStream newInputStream;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(charset, "charset");
        kotlin.jvm.internal.l0.p(options, "options");
        newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        return new InputStreamReader(newInputStream, charset);
    }

    static /* synthetic */ InputStreamReader v(Path path, Charset charset, OpenOption[] options, int i5, Object obj) throws IOException {
        InputStream newInputStream;
        if ((i5 & 1) != 0) {
            charset = kotlin.text.f.f19703b;
        }
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(charset, "charset");
        kotlin.jvm.internal.l0.p(options, "options");
        newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        return new InputStreamReader(newInputStream, charset);
    }

    @kotlin.g1(version = "1.5")
    @v2(markerClass = {o.class})
    @kotlin.internal.f
    private static final <T> T w(Path path, Charset charset, v3.l<? super kotlin.sequences.m<String>, ? extends T> block) throws IOException {
        BufferedReader it;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(charset, "charset");
        kotlin.jvm.internal.l0.p(block, "block");
        it = Files.newBufferedReader(path, charset);
        try {
            kotlin.jvm.internal.l0.o(it, "it");
            T invoke = block.invoke(kotlin.io.y.h(it));
            kotlin.jvm.internal.i0.d(1);
            kotlin.io.c.a(it, null);
            kotlin.jvm.internal.i0.c(1);
            return invoke;
        } finally {
        }
    }

    static /* synthetic */ Object x(Path path, Charset charset, v3.l block, int i5, Object obj) throws IOException {
        BufferedReader it;
        if ((i5 & 1) != 0) {
            charset = kotlin.text.f.f19703b;
        }
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(charset, "charset");
        kotlin.jvm.internal.l0.p(block, "block");
        it = Files.newBufferedReader(path, charset);
        try {
            kotlin.jvm.internal.l0.o(it, "it");
            Object invoke = block.invoke(kotlin.io.y.h(it));
            kotlin.jvm.internal.i0.d(1);
            kotlin.io.c.a(it, null);
            kotlin.jvm.internal.i0.c(1);
            return invoke;
        } finally {
        }
    }

    @kotlin.g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {o.class})
    private static final void y(Path path, byte[] array, OpenOption... options) throws IOException {
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(array, "array");
        kotlin.jvm.internal.l0.p(options, "options");
        Files.write(path, array, (OpenOption[]) Arrays.copyOf(options, options.length));
    }

    @kotlin.g1(version = "1.5")
    @v2(markerClass = {o.class})
    @kotlin.internal.f
    private static final Path z(Path path, Iterable<? extends CharSequence> lines, Charset charset, OpenOption... options) throws IOException {
        Path write;
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(lines, "lines");
        kotlin.jvm.internal.l0.p(charset, "charset");
        kotlin.jvm.internal.l0.p(options, "options");
        write = Files.write(path, lines, charset, (OpenOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.l0.o(write, "write(this, lines, charset, *options)");
        return write;
    }
}
