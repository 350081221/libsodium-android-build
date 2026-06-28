package okio.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.umeng.analytics.pro.bi;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import kotlin.collections.a1;
import kotlin.collections.e0;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.m2;
import kotlin.q1;
import kotlin.r2;
import kotlin.text.f0;
import kotlin.y1;
import okhttp3.internal.ws.WebSocketProtocol;
import okio.BufferedSource;
import okio.d1;
import okio.s;
import okio.t;
import okio.u;
import okio.y0;
import v3.p;

@i0(d1 = {"\u0000j\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\"\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0017H\u0002\u001a\u001f\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u001b\u001a.\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020#0\"H\u0000\u001a\f\u0010$\u001a\u00020\u0015*\u00020%H\u0000\u001a\f\u0010&\u001a\u00020'*\u00020%H\u0002\u001a.\u0010(\u001a\u00020)*\u00020%2\u0006\u0010*\u001a\u00020\u00012\u0018\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020)0,H\u0002\u001a\u0014\u0010-\u001a\u00020.*\u00020%2\u0006\u0010/\u001a\u00020.H\u0000\u001a\u0018\u00100\u001a\u0004\u0018\u00010.*\u00020%2\b\u0010/\u001a\u0004\u0018\u00010.H\u0002\u001a\u0014\u00101\u001a\u00020'*\u00020%2\u0006\u00102\u001a\u00020'H\u0002\u001a\f\u00103\u001a\u00020)*\u00020%H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u000e\u001a\u00020\u000f*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u00064"}, d2 = {"BIT_FLAG_ENCRYPTED", "", "BIT_FLAG_UNSUPPORTED_MASK", "CENTRAL_FILE_HEADER_SIGNATURE", "COMPRESSION_METHOD_DEFLATED", "COMPRESSION_METHOD_STORED", "END_OF_CENTRAL_DIRECTORY_SIGNATURE", "HEADER_ID_EXTENDED_TIMESTAMP", "HEADER_ID_ZIP64_EXTENDED_INFO", "LOCAL_FILE_HEADER_SIGNATURE", "MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE", "", "ZIP64_EOCD_RECORD_SIGNATURE", "ZIP64_LOCATOR_SIGNATURE", "hex", "", "getHex", "(I)Ljava/lang/String;", "buildIndex", "", "Lokio/Path;", "Lokio/internal/ZipEntry;", "entries", "", "dosDateTimeToEpochMillis", "date", CrashHianalyticsData.TIME, "(II)Ljava/lang/Long;", "openZip", "Lokio/ZipFileSystem;", "zipPath", "fileSystem", "Lokio/FileSystem;", "predicate", "Lkotlin/Function1;", "", "readEntry", "Lokio/BufferedSource;", "readEocdRecord", "Lokio/internal/EocdRecord;", "readExtra", "", "extraSize", "block", "Lkotlin/Function2;", "readLocalHeader", "Lokio/FileMetadata;", "basicMetadata", "readOrSkipLocalHeader", "readZip64EocdRecord", "regularRecord", "skipLocalHeader", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nZipFiles.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZipFiles.kt\nokio/internal/ZipFilesKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,459:1\n1045#2:460\n*S KotlinDebug\n*F\n+ 1 ZipFiles.kt\nokio/internal/ZipFilesKt\n*L\n156#1:460\n*E\n"})
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a */
    private static final int f20966a = 67324752;

    /* renamed from: b */
    private static final int f20967b = 33639248;

    /* renamed from: c */
    private static final int f20968c = 101010256;

    /* renamed from: d */
    private static final int f20969d = 117853008;

    /* renamed from: e */
    private static final int f20970e = 101075792;

    /* renamed from: f */
    public static final int f20971f = 8;

    /* renamed from: g */
    public static final int f20972g = 0;

    /* renamed from: h */
    private static final int f20973h = 1;

    /* renamed from: i */
    private static final int f20974i = 1;

    /* renamed from: j */
    private static final long f20975j = 4294967295L;

    /* renamed from: k */
    private static final int f20976k = 1;

    /* renamed from: l */
    private static final int f20977l = 21589;

    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", bi.ay, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ZipFiles.kt\nokio/internal/ZipFilesKt\n*L\n1#1,328:1\n156#2:329\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t5, T t6) {
            int l5;
            l5 = kotlin.comparisons.g.l(((k) t5).a(), ((k) t6).a());
            return l5;
        }
    }

    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lokio/internal/ZipEntry;", "invoke", "(Lokio/internal/ZipEntry;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class b extends n0 implements v3.l<k, Boolean> {
        public static final b INSTANCE = new b();

        b() {
            super(1);
        }

        @Override // v3.l
        @p4.l
        public final Boolean invoke(@p4.l k it) {
            l0.p(it, "it");
            return Boolean.TRUE;
        }
    }

    @i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "headerId", "", "dataSize", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class c extends n0 implements p<Integer, Long, r2> {
        final /* synthetic */ k1.g $compressedSize;
        final /* synthetic */ k1.a $hasZip64Extra;
        final /* synthetic */ k1.g $offset;
        final /* synthetic */ long $requiredZip64ExtraSize;
        final /* synthetic */ k1.g $size;
        final /* synthetic */ BufferedSource $this_readEntry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(k1.a aVar, long j5, k1.g gVar, BufferedSource bufferedSource, k1.g gVar2, k1.g gVar3) {
            super(2);
            this.$hasZip64Extra = aVar;
            this.$requiredZip64ExtraSize = j5;
            this.$size = gVar;
            this.$this_readEntry = bufferedSource;
            this.$compressedSize = gVar2;
            this.$offset = gVar3;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Integer num, Long l5) {
            invoke(num.intValue(), l5.longValue());
            return r2.f19517a;
        }

        public final void invoke(int i5, long j5) {
            if (i5 == 1) {
                k1.a aVar = this.$hasZip64Extra;
                if (!aVar.element) {
                    aVar.element = true;
                    if (j5 >= this.$requiredZip64ExtraSize) {
                        k1.g gVar = this.$size;
                        long j6 = gVar.element;
                        if (j6 == l.f20975j) {
                            j6 = this.$this_readEntry.R();
                        }
                        gVar.element = j6;
                        k1.g gVar2 = this.$compressedSize;
                        gVar2.element = gVar2.element == l.f20975j ? this.$this_readEntry.R() : 0L;
                        k1.g gVar3 = this.$offset;
                        gVar3.element = gVar3.element == l.f20975j ? this.$this_readEntry.R() : 0L;
                        return;
                    }
                    throw new IOException("bad zip: zip64 extra too short");
                }
                throw new IOException("bad zip: zip64 extra repeated");
            }
        }
    }

    @i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "headerId", "", "dataSize", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class d extends n0 implements p<Integer, Long, r2> {
        final /* synthetic */ k1.h<Long> $createdAtMillis;
        final /* synthetic */ k1.h<Long> $lastAccessedAtMillis;
        final /* synthetic */ k1.h<Long> $lastModifiedAtMillis;
        final /* synthetic */ BufferedSource $this_readOrSkipLocalHeader;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(BufferedSource bufferedSource, k1.h<Long> hVar, k1.h<Long> hVar2, k1.h<Long> hVar3) {
            super(2);
            this.$this_readOrSkipLocalHeader = bufferedSource;
            this.$lastModifiedAtMillis = hVar;
            this.$lastAccessedAtMillis = hVar2;
            this.$createdAtMillis = hVar3;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Integer num, Long l5) {
            invoke(num.intValue(), l5.longValue());
            return r2.f19517a;
        }

        /* JADX WARN: Type inference failed for: r0v13, types: [T, java.lang.Long] */
        /* JADX WARN: Type inference failed for: r10v12, types: [T, java.lang.Long] */
        /* JADX WARN: Type inference failed for: r11v3, types: [T, java.lang.Long] */
        public final void invoke(int i5, long j5) {
            if (i5 == l.f20977l) {
                if (j5 >= 1) {
                    int readByte = this.$this_readOrSkipLocalHeader.readByte() & y1.f19838d;
                    boolean z4 = (readByte & 1) == 1;
                    boolean z5 = (readByte & 2) == 2;
                    boolean z6 = (readByte & 4) == 4;
                    BufferedSource bufferedSource = this.$this_readOrSkipLocalHeader;
                    long j6 = z4 ? 5L : 1L;
                    if (z5) {
                        j6 += 4;
                    }
                    if (z6) {
                        j6 += 4;
                    }
                    if (j5 < j6) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z4) {
                        this.$lastModifiedAtMillis.element = Long.valueOf(bufferedSource.q0() * 1000);
                    }
                    if (z5) {
                        this.$lastAccessedAtMillis.element = Long.valueOf(this.$this_readOrSkipLocalHeader.q0() * 1000);
                    }
                    if (z6) {
                        this.$createdAtMillis.element = Long.valueOf(this.$this_readOrSkipLocalHeader.q0() * 1000);
                        return;
                    }
                    return;
                }
                throw new IOException("bad zip: extended timestamp extra too short");
            }
        }
    }

    private static final Map<d1, k> a(List<k> list) {
        Map<d1, k> j02;
        List<k> r5;
        d1 h5 = d1.a.h(d1.f20879b, "/", false, 1, null);
        j02 = a1.j0(q1.a(h5, new k(h5, true, null, 0L, 0L, 0L, 0, null, 0L, TypedValues.PositionType.TYPE_CURVE_FIT, null)));
        r5 = e0.r5(list, new a());
        for (k kVar : r5) {
            if (j02.put(kVar.a(), kVar) == null) {
                while (true) {
                    d1 v4 = kVar.a().v();
                    if (v4 != null) {
                        k kVar2 = j02.get(v4);
                        if (kVar2 != null) {
                            kVar2.b().add(kVar.a());
                            break;
                        }
                        k kVar3 = new k(v4, true, null, 0L, 0L, 0L, 0, null, 0L, TypedValues.PositionType.TYPE_CURVE_FIT, null);
                        j02.put(v4, kVar3);
                        kVar3.b().add(kVar.a());
                        kVar = kVar3;
                    }
                }
            }
        }
        return j02;
    }

    private static final Long b(int i5, int i6) {
        if (i6 == -1) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(((i5 >> 9) & 127) + 1980, ((i5 >> 5) & 15) - 1, i5 & 31, (i6 >> 11) & 31, (i6 >> 5) & 63, (i6 & 31) << 1);
        return Long.valueOf(gregorianCalendar.getTime().getTime());
    }

    private static final String c(int i5) {
        int a5;
        StringBuilder sb = new StringBuilder();
        sb.append("0x");
        a5 = kotlin.text.d.a(16);
        String num = Integer.toString(i5, a5);
        l0.o(num, "toString(this, checkRadix(radix))");
        sb.append(num);
        return sb.toString();
    }

    @p4.l
    public static final okio.r1 d(@p4.l d1 zipPath, @p4.l u fileSystem, @p4.l v3.l<? super k, Boolean> predicate) throws IOException {
        BufferedSource e5;
        l0.p(zipPath, "zipPath");
        l0.p(fileSystem, "fileSystem");
        l0.p(predicate, "predicate");
        s F = fileSystem.F(zipPath);
        try {
            long t02 = F.t0() - 22;
            if (t02 >= 0) {
                long max = Math.max(t02 - PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH, 0L);
                do {
                    BufferedSource e6 = y0.e(F.A0(t02));
                    try {
                        if (e6.q0() == f20968c) {
                            h g5 = g(e6);
                            String X = e6.X(g5.b());
                            e6.close();
                            long j5 = t02 - 20;
                            if (j5 > 0) {
                                e5 = y0.e(F.A0(j5));
                                try {
                                    if (e5.q0() == f20969d) {
                                        int q02 = e5.q0();
                                        long R = e5.R();
                                        if (e5.q0() == 1 && q02 == 0) {
                                            e5 = y0.e(F.A0(R));
                                            try {
                                                int q03 = e5.q0();
                                                if (q03 == f20970e) {
                                                    g5 = k(e5, g5);
                                                    r2 r2Var = r2.f19517a;
                                                    kotlin.io.c.a(e5, null);
                                                } else {
                                                    throw new IOException("bad zip: expected " + c(f20970e) + " but was " + c(q03));
                                                }
                                            } finally {
                                            }
                                        } else {
                                            throw new IOException("unsupported zip: spanned");
                                        }
                                    }
                                    r2 r2Var2 = r2.f19517a;
                                    kotlin.io.c.a(e5, null);
                                } finally {
                                }
                            }
                            ArrayList arrayList = new ArrayList();
                            e5 = y0.e(F.A0(g5.a()));
                            try {
                                long c5 = g5.c();
                                for (long j6 = 0; j6 < c5; j6++) {
                                    k f5 = f(e5);
                                    if (f5.h() < g5.a()) {
                                        if (predicate.invoke(f5).booleanValue()) {
                                            arrayList.add(f5);
                                        }
                                    } else {
                                        throw new IOException("bad zip: local file header offset >= central directory offset");
                                    }
                                }
                                r2 r2Var3 = r2.f19517a;
                                kotlin.io.c.a(e5, null);
                                okio.r1 r1Var = new okio.r1(zipPath, fileSystem, a(arrayList), X);
                                kotlin.io.c.a(F, null);
                                return r1Var;
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                    kotlin.io.c.a(e5, th);
                                }
                            }
                        }
                        e6.close();
                        t02--;
                    } catch (Throwable th) {
                        e6.close();
                        throw th;
                    }
                } while (t02 >= max);
                throw new IOException("not a zip: end of central directory signature not found");
            }
            throw new IOException("not a zip: size=" + F.t0());
        } finally {
        }
    }

    public static /* synthetic */ okio.r1 e(d1 d1Var, u uVar, v3.l lVar, int i5, Object obj) throws IOException {
        if ((i5 & 4) != 0) {
            lVar = b.INSTANCE;
        }
        return d(d1Var, uVar, lVar);
    }

    @p4.l
    public static final k f(@p4.l BufferedSource bufferedSource) throws IOException {
        boolean S2;
        k1.g gVar;
        long j5;
        boolean J1;
        l0.p(bufferedSource, "<this>");
        int q02 = bufferedSource.q0();
        if (q02 == f20967b) {
            bufferedSource.skip(4L);
            int Q = bufferedSource.Q() & m2.f19496d;
            if ((Q & 1) == 0) {
                int Q2 = bufferedSource.Q() & m2.f19496d;
                Long b5 = b(bufferedSource.Q() & m2.f19496d, bufferedSource.Q() & m2.f19496d);
                long q03 = bufferedSource.q0() & f20975j;
                k1.g gVar2 = new k1.g();
                gVar2.element = bufferedSource.q0() & f20975j;
                k1.g gVar3 = new k1.g();
                gVar3.element = bufferedSource.q0() & f20975j;
                int Q3 = bufferedSource.Q() & m2.f19496d;
                int Q4 = bufferedSource.Q() & m2.f19496d;
                int Q5 = bufferedSource.Q() & m2.f19496d;
                bufferedSource.skip(8L);
                k1.g gVar4 = new k1.g();
                gVar4.element = bufferedSource.q0() & f20975j;
                String X = bufferedSource.X(Q3);
                S2 = f0.S2(X, (char) 0, false, 2, null);
                if (!S2) {
                    if (gVar3.element == f20975j) {
                        j5 = 8 + 0;
                        gVar = gVar4;
                    } else {
                        gVar = gVar4;
                        j5 = 0;
                    }
                    if (gVar2.element == f20975j) {
                        j5 += 8;
                    }
                    k1.g gVar5 = gVar;
                    if (gVar5.element == f20975j) {
                        j5 += 8;
                    }
                    long j6 = j5;
                    k1.a aVar = new k1.a();
                    h(bufferedSource, Q4, new c(aVar, j6, gVar3, bufferedSource, gVar2, gVar5));
                    if (j6 > 0 && !aVar.element) {
                        throw new IOException("bad zip: zip64 extra required but absent");
                    }
                    String X2 = bufferedSource.X(Q5);
                    d1 x4 = d1.a.h(d1.f20879b, "/", false, 1, null).x(X);
                    J1 = kotlin.text.e0.J1(X, "/", false, 2, null);
                    return new k(x4, J1, X2, q03, gVar2.element, gVar3.element, Q2, b5, gVar5.element);
                }
                throw new IOException("bad zip: filename contains 0x00");
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + c(Q));
        }
        throw new IOException("bad zip: expected " + c(f20967b) + " but was " + c(q02));
    }

    private static final h g(BufferedSource bufferedSource) throws IOException {
        int Q = bufferedSource.Q() & m2.f19496d;
        int Q2 = bufferedSource.Q() & m2.f19496d;
        long Q3 = bufferedSource.Q() & m2.f19496d;
        if (Q3 == (bufferedSource.Q() & m2.f19496d) && Q == 0 && Q2 == 0) {
            bufferedSource.skip(4L);
            return new h(Q3, f20975j & bufferedSource.q0(), bufferedSource.Q() & m2.f19496d);
        }
        throw new IOException("unsupported zip: spanned");
    }

    private static final void h(BufferedSource bufferedSource, int i5, p<? super Integer, ? super Long, r2> pVar) {
        long j5 = i5;
        while (j5 != 0) {
            if (j5 >= 4) {
                int Q = bufferedSource.Q() & m2.f19496d;
                long Q2 = bufferedSource.Q() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
                long j6 = j5 - 4;
                if (j6 >= Q2) {
                    bufferedSource.U(Q2);
                    long M0 = bufferedSource.g().M0();
                    pVar.invoke(Integer.valueOf(Q), Long.valueOf(Q2));
                    long M02 = (bufferedSource.g().M0() + Q2) - M0;
                    if (M02 >= 0) {
                        if (M02 > 0) {
                            bufferedSource.g().skip(M02);
                        }
                        j5 = j6 - Q2;
                    } else {
                        throw new IOException("unsupported zip: too many bytes processed for " + Q);
                    }
                } else {
                    throw new IOException("bad zip: truncated value in extra field");
                }
            } else {
                throw new IOException("bad zip: truncated header in extra field");
            }
        }
    }

    @p4.l
    public static final t i(@p4.l BufferedSource bufferedSource, @p4.l t basicMetadata) {
        l0.p(bufferedSource, "<this>");
        l0.p(basicMetadata, "basicMetadata");
        t j5 = j(bufferedSource, basicMetadata);
        l0.m(j5);
        return j5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final t j(BufferedSource bufferedSource, t tVar) {
        T t5;
        k1.h hVar = new k1.h();
        if (tVar != null) {
            t5 = tVar.g();
        } else {
            t5 = 0;
        }
        hVar.element = t5;
        k1.h hVar2 = new k1.h();
        k1.h hVar3 = new k1.h();
        int q02 = bufferedSource.q0();
        if (q02 == f20966a) {
            bufferedSource.skip(2L);
            int Q = bufferedSource.Q() & m2.f19496d;
            if ((Q & 1) == 0) {
                bufferedSource.skip(18L);
                long Q2 = bufferedSource.Q() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
                int Q3 = bufferedSource.Q() & m2.f19496d;
                bufferedSource.skip(Q2);
                if (tVar == null) {
                    bufferedSource.skip(Q3);
                    return null;
                }
                h(bufferedSource, Q3, new d(bufferedSource, hVar, hVar2, hVar3));
                return new t(tVar.k(), tVar.j(), null, tVar.h(), (Long) hVar3.element, (Long) hVar.element, (Long) hVar2.element, null, 128, null);
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + c(Q));
        }
        throw new IOException("bad zip: expected " + c(f20966a) + " but was " + c(q02));
    }

    private static final h k(BufferedSource bufferedSource, h hVar) throws IOException {
        bufferedSource.skip(12L);
        int q02 = bufferedSource.q0();
        int q03 = bufferedSource.q0();
        long R = bufferedSource.R();
        if (R == bufferedSource.R() && q02 == 0 && q03 == 0) {
            bufferedSource.skip(8L);
            return new h(R, bufferedSource.R(), hVar.b());
        }
        throw new IOException("unsupported zip: spanned");
    }

    public static final void l(@p4.l BufferedSource bufferedSource) {
        l0.p(bufferedSource, "<this>");
        j(bufferedSource, null);
    }
}
