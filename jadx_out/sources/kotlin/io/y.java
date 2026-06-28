package kotlin.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@i0(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0017\u0010\u0000\u001a\u00020\u0005*\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u001c\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u001e\u0010\n\u001a\u00020\u000b*\u00020\u00022\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r\u001a\u0010\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010*\u00020\u0001\u001a\n\u0010\u0011\u001a\u00020\u0012*\u00020\u0013\u001a\u0010\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015*\u00020\u0002\u001a\n\u0010\u0016\u001a\u00020\u000e*\u00020\u0002\u001a\u0017\u0010\u0016\u001a\u00020\u000e*\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0087\b\u001a\r\u0010\u0019\u001a\u00020\u001a*\u00020\u000eH\u0087\b\u001a5\u0010\u001b\u001a\u0002H\u001c\"\u0004\b\u0000\u0010\u001c*\u00020\u00022\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u0004\u0012\u0002H\u001c0\rH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u001e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f"}, d2 = {"buffered", "Ljava/io/BufferedReader;", "Ljava/io/Reader;", "bufferSize", "", "Ljava/io/BufferedWriter;", "Ljava/io/Writer;", "copyTo", "", "out", "forEachLine", "", "action", "Lkotlin/Function1;", "", "lineSequence", "Lkotlin/sequences/Sequence;", "readBytes", "", "Ljava/net/URL;", "readLines", "", "readText", "charset", "Ljava/nio/charset/Charset;", "reader", "Ljava/io/StringReader;", "useLines", "T", "block", "(Ljava/io/Reader;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@u3.h(name = "TextStreamsKt")
@r1({"SMAP\nReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,151:1\n52#1:152\n1#2:153\n1#2:156\n1313#3,2:154\n*S KotlinDebug\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n*L\n33#1:152\n33#1:153\n33#1:154,2\n*E\n"})
/* loaded from: classes2.dex */
public final class y {

    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    static final class a extends n0 implements v3.l<String, r2> {
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
    private static final BufferedReader a(Reader reader, int i5) {
        l0.p(reader, "<this>");
        if (reader instanceof BufferedReader) {
            return (BufferedReader) reader;
        }
        return new BufferedReader(reader, i5);
    }

    @kotlin.internal.f
    private static final BufferedWriter b(Writer writer, int i5) {
        l0.p(writer, "<this>");
        if (writer instanceof BufferedWriter) {
            return (BufferedWriter) writer;
        }
        return new BufferedWriter(writer, i5);
    }

    static /* synthetic */ BufferedReader c(Reader reader, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = 8192;
        }
        l0.p(reader, "<this>");
        if (reader instanceof BufferedReader) {
            return (BufferedReader) reader;
        }
        return new BufferedReader(reader, i5);
    }

    static /* synthetic */ BufferedWriter d(Writer writer, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = 8192;
        }
        l0.p(writer, "<this>");
        if (writer instanceof BufferedWriter) {
            return (BufferedWriter) writer;
        }
        return new BufferedWriter(writer, i5);
    }

    public static final long e(@p4.l Reader reader, @p4.l Writer out, int i5) {
        l0.p(reader, "<this>");
        l0.p(out, "out");
        char[] cArr = new char[i5];
        int read = reader.read(cArr);
        long j5 = 0;
        while (read >= 0) {
            out.write(cArr, 0, read);
            j5 += read;
            read = reader.read(cArr);
        }
        return j5;
    }

    public static /* synthetic */ long f(Reader reader, Writer writer, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 8192;
        }
        return e(reader, writer, i5);
    }

    public static final void g(@p4.l Reader reader, @p4.l v3.l<? super String, r2> action) {
        BufferedReader bufferedReader;
        l0.p(reader, "<this>");
        l0.p(action, "action");
        if (reader instanceof BufferedReader) {
            bufferedReader = (BufferedReader) reader;
        } else {
            bufferedReader = new BufferedReader(reader, 8192);
        }
        try {
            Iterator<String> it = h(bufferedReader).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            r2 r2Var = r2.f19517a;
            c.a(bufferedReader, null);
        } finally {
        }
    }

    @p4.l
    public static final kotlin.sequences.m<String> h(@p4.l BufferedReader bufferedReader) {
        kotlin.sequences.m<String> f5;
        l0.p(bufferedReader, "<this>");
        f5 = kotlin.sequences.s.f(new s(bufferedReader));
        return f5;
    }

    @p4.l
    public static final byte[] i(@p4.l URL url) {
        l0.p(url, "<this>");
        InputStream it = url.openStream();
        try {
            l0.o(it, "it");
            byte[] p5 = b.p(it);
            c.a(it, null);
            return p5;
        } finally {
        }
    }

    @p4.l
    public static final List<String> j(@p4.l Reader reader) {
        l0.p(reader, "<this>");
        ArrayList arrayList = new ArrayList();
        g(reader, new a(arrayList));
        return arrayList;
    }

    @p4.l
    public static final String k(@p4.l Reader reader) {
        l0.p(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        f(reader, stringWriter, 0, 2, null);
        String stringWriter2 = stringWriter.toString();
        l0.o(stringWriter2, "buffer.toString()");
        return stringWriter2;
    }

    @kotlin.internal.f
    private static final String l(URL url, Charset charset) {
        l0.p(url, "<this>");
        l0.p(charset, "charset");
        return new String(i(url), charset);
    }

    static /* synthetic */ String m(URL url, Charset charset, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charset = kotlin.text.f.f19703b;
        }
        l0.p(url, "<this>");
        l0.p(charset, "charset");
        return new String(i(url), charset);
    }

    @kotlin.internal.f
    private static final StringReader n(String str) {
        l0.p(str, "<this>");
        return new StringReader(str);
    }

    public static final <T> T o(@p4.l Reader reader, @p4.l v3.l<? super kotlin.sequences.m<String>, ? extends T> block) {
        BufferedReader bufferedReader;
        l0.p(reader, "<this>");
        l0.p(block, "block");
        if (reader instanceof BufferedReader) {
            bufferedReader = (BufferedReader) reader;
        } else {
            bufferedReader = new BufferedReader(reader, 8192);
        }
        try {
            T invoke = block.invoke(h(bufferedReader));
            kotlin.jvm.internal.i0.d(1);
            c.a(bufferedReader, null);
            kotlin.jvm.internal.i0.c(1);
            return invoke;
        } finally {
        }
    }
}
