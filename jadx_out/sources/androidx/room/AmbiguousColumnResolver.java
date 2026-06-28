package androidx.room;

import androidx.annotation.RestrictTo;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.e0;
import kotlin.collections.k1;
import kotlin.collections.s0;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u001c\u001d\u001eB\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\bJQ\u0010\u0011\u001a\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022$\u0010\u0010\u001a \u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000f0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012JV\u0010\u0019\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u00132\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\t2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u000e2\u0018\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0004\u0012\u00020\u000f0\u0017H\u0002¨\u0006\u001f"}, d2 = {"Landroidx/room/AmbiguousColumnResolver;", "", "", "", "resultColumns", "mappings", "", "resolve", "([Ljava/lang/String;[[Ljava/lang/String;)[[I", "", "Landroidx/room/AmbiguousColumnResolver$ResultColumn;", "content", "pattern", "Lkotlin/Function3;", "", "Lkotlin/r2;", "onHashMatch", "rabinKarpSearch", "(Ljava/util/List;[Ljava/lang/String;Lv3/q;)V", "T", "", "current", "depth", "Lkotlin/Function1;", "block", "dfs", "<init>", "()V", "Match", "ResultColumn", "Solution", "room-common"}, k = 1, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@r1({"SMAP\nAmbiguousColumnResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,253:1\n1#2:254\n13579#3,2:255\n13644#3,3:257\n13644#3,2:260\n11335#3:262\n11670#3,2:263\n11672#3:267\n13646#3:268\n1855#4,2:265\n1726#4,3:269\n1549#4:272\n1620#4,3:273\n1855#4,2:278\n37#5,2:276\n*S KotlinDebug\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver\n*L\n85#1:255,2\n87#1:257,3\n96#1:260,2\n118#1:262\n118#1:263,2\n118#1:267\n96#1:268\n120#1:265,2\n141#1:269,3\n151#1:272\n151#1:273,3\n188#1:278,2\n151#1:276,2\n*E\n"})
/* loaded from: classes2.dex */
public final class AmbiguousColumnResolver {

    @p4.l
    public static final AmbiguousColumnResolver INSTANCE = new AmbiguousColumnResolver();

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$Match;", "", "Lkotlin/ranges/l;", "resultRange", "Lkotlin/ranges/l;", "getResultRange", "()Lkotlin/ranges/l;", "", "", "resultIndices", "Ljava/util/List;", "getResultIndices", "()Ljava/util/List;", "<init>", "(Lkotlin/ranges/l;Ljava/util/List;)V", "room-common"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Match {

        @p4.l
        private final List<Integer> resultIndices;

        @p4.l
        private final kotlin.ranges.l resultRange;

        public Match(@p4.l kotlin.ranges.l resultRange, @p4.l List<Integer> resultIndices) {
            l0.p(resultRange, "resultRange");
            l0.p(resultIndices, "resultIndices");
            this.resultRange = resultRange;
            this.resultIndices = resultIndices;
        }

        @p4.l
        public final List<Integer> getResultIndices() {
            return this.resultIndices;
        }

        @p4.l
        public final kotlin.ranges.l getResultRange() {
            return this.resultRange;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$ResultColumn;", "", "name", "", "index", "", "(Ljava/lang/String;I)V", "getIndex", "()I", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "toString", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class ResultColumn {
        private final int index;

        @p4.l
        private final String name;

        public ResultColumn(@p4.l String name, int i5) {
            l0.p(name, "name");
            this.name = name;
            this.index = i5;
        }

        public static /* synthetic */ ResultColumn copy$default(ResultColumn resultColumn, String str, int i5, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                str = resultColumn.name;
            }
            if ((i6 & 2) != 0) {
                i5 = resultColumn.index;
            }
            return resultColumn.copy(str, i5);
        }

        @p4.l
        public final String component1() {
            return this.name;
        }

        public final int component2() {
            return this.index;
        }

        @p4.l
        public final ResultColumn copy(@p4.l String name, int i5) {
            l0.p(name, "name");
            return new ResultColumn(name, i5);
        }

        public boolean equals(@p4.m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResultColumn)) {
                return false;
            }
            ResultColumn resultColumn = (ResultColumn) obj;
            return l0.g(this.name, resultColumn.name) && this.index == resultColumn.index;
        }

        public final int getIndex() {
            return this.index;
        }

        @p4.l
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + Integer.hashCode(this.index);
        }

        @p4.l
        public String toString() {
            return "ResultColumn(name=" + this.name + ", index=" + this.index + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u0011\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0000H\u0096\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0011"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$Solution;", "", "matches", "", "Landroidx/room/AmbiguousColumnResolver$Match;", "coverageOffset", "", "overlaps", "(Ljava/util/List;II)V", "getCoverageOffset", "()I", "getMatches", "()Ljava/util/List;", "getOverlaps", "compareTo", "other", "Companion", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Solution implements Comparable<Solution> {

        @p4.l
        public static final Companion Companion = new Companion(null);

        @p4.l
        private static final Solution NO_SOLUTION;
        private final int coverageOffset;

        @p4.l
        private final List<Match> matches;
        private final int overlaps;

        @i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0007\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$Solution$Companion;", "", "()V", "NO_SOLUTION", "Landroidx/room/AmbiguousColumnResolver$Solution;", "getNO_SOLUTION", "()Landroidx/room/AmbiguousColumnResolver$Solution;", "build", "matches", "", "Landroidx/room/AmbiguousColumnResolver$Match;", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nAmbiguousColumnResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver$Solution$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,253:1\n1#2:254\n1774#3,3:255\n1855#3,2:258\n1777#3:260\n*S KotlinDebug\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver$Solution$Companion\n*L\n232#1:255,3\n234#1:258,2\n232#1:260\n*E\n"})
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
                this();
            }

            @p4.l
            public final Solution build(@p4.l List<Match> matches) {
                boolean z4;
                l0.p(matches, "matches");
                List<Match> list = matches;
                int i5 = 0;
                int i6 = 0;
                for (Match match : list) {
                    i6 += ((match.getResultRange().g() - match.getResultRange().e()) + 1) - match.getResultIndices().size();
                }
                Iterator<T> it = list.iterator();
                if (it.hasNext()) {
                    int e5 = ((Match) it.next()).getResultRange().e();
                    while (it.hasNext()) {
                        int e6 = ((Match) it.next()).getResultRange().e();
                        if (e5 > e6) {
                            e5 = e6;
                        }
                    }
                    Iterator<T> it2 = list.iterator();
                    if (it2.hasNext()) {
                        int g5 = ((Match) it2.next()).getResultRange().g();
                        while (it2.hasNext()) {
                            int g6 = ((Match) it2.next()).getResultRange().g();
                            if (g5 < g6) {
                                g5 = g6;
                            }
                        }
                        Iterable lVar = new kotlin.ranges.l(e5, g5);
                        if (!(lVar instanceof Collection) || !((Collection) lVar).isEmpty()) {
                            Iterator it3 = lVar.iterator();
                            int i7 = 0;
                            while (it3.hasNext()) {
                                int nextInt = ((s0) it3).nextInt();
                                Iterator<T> it4 = list.iterator();
                                int i8 = 0;
                                while (true) {
                                    if (it4.hasNext()) {
                                        if (((Match) it4.next()).getResultRange().l(nextInt)) {
                                            i8++;
                                        }
                                        if (i8 > 1) {
                                            z4 = true;
                                            break;
                                        }
                                    } else {
                                        z4 = false;
                                        break;
                                    }
                                }
                                if (z4 && (i7 = i7 + 1) < 0) {
                                    kotlin.collections.w.V();
                                }
                            }
                            i5 = i7;
                        }
                        return new Solution(matches, i6, i5);
                    }
                    throw new NoSuchElementException();
                }
                throw new NoSuchElementException();
            }

            @p4.l
            public final Solution getNO_SOLUTION() {
                return Solution.NO_SOLUTION;
            }
        }

        static {
            List E;
            E = kotlin.collections.w.E();
            NO_SOLUTION = new Solution(E, Integer.MAX_VALUE, Integer.MAX_VALUE);
        }

        public Solution(@p4.l List<Match> matches, int i5, int i6) {
            l0.p(matches, "matches");
            this.matches = matches;
            this.coverageOffset = i5;
            this.overlaps = i6;
        }

        public final int getCoverageOffset() {
            return this.coverageOffset;
        }

        @p4.l
        public final List<Match> getMatches() {
            return this.matches;
        }

        public final int getOverlaps() {
            return this.overlaps;
        }

        @Override // java.lang.Comparable
        public int compareTo(@p4.l Solution other) {
            l0.p(other, "other");
            int t5 = l0.t(this.overlaps, other.overlaps);
            return t5 != 0 ? t5 : l0.t(this.coverageOffset, other.coverageOffset);
        }
    }

    private AmbiguousColumnResolver() {
    }

    private final <T> void dfs(List<? extends List<? extends T>> list, List<T> list2, int i5, v3.l<? super List<? extends T>, r2> lVar) {
        List S5;
        if (i5 == list.size()) {
            S5 = e0.S5(list2);
            lVar.invoke(S5);
            return;
        }
        Iterator<T> it = list.get(i5).iterator();
        while (it.hasNext()) {
            list2.add(it.next());
            INSTANCE.dfs(list, list2, i5 + 1, lVar);
            b0.L0(list2);
        }
    }

    static /* synthetic */ void dfs$default(AmbiguousColumnResolver ambiguousColumnResolver, List list, List list2, int i5, v3.l lVar, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            list2 = new ArrayList();
        }
        if ((i6 & 4) != 0) {
            i5 = 0;
        }
        ambiguousColumnResolver.dfs(list, list2, i5, lVar);
    }

    private final void rabinKarpSearch(List<ResultColumn> list, String[] strArr, v3.q<? super Integer, ? super Integer, ? super List<ResultColumn>, r2> qVar) {
        int i5 = 0;
        int i6 = 0;
        for (String str : strArr) {
            i6 += str.hashCode();
        }
        int length = strArr.length;
        Iterator<T> it = list.subList(0, length).iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 += ((ResultColumn) it.next()).getName().hashCode();
        }
        while (true) {
            if (i6 == i7) {
                qVar.invoke(Integer.valueOf(i5), Integer.valueOf(length), list.subList(i5, length));
            }
            i5++;
            length++;
            if (length > list.size()) {
                return;
            } else {
                i7 = (i7 - list.get(i5 - 1).getName().hashCode()) + list.get(length - 1).getName().hashCode();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, androidx.room.AmbiguousColumnResolver$Solution] */
    @p4.l
    @u3.m
    public static final int[][] resolve(@p4.l String[] resultColumns, @p4.l String[][] mappings) {
        boolean z4;
        Set d5;
        Set a5;
        List i5;
        List<ResultColumn> a6;
        int Y;
        int[] R5;
        List i6;
        List a7;
        l0.p(resultColumns, "resultColumns");
        l0.p(mappings, "mappings");
        int length = resultColumns.length;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            z4 = true;
            if (i8 >= length) {
                break;
            }
            String str = resultColumns[i8];
            if (str.charAt(0) == '`' && str.charAt(str.length() - 1) == '`') {
                str = str.substring(1, str.length() - 1);
                l0.o(str, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            Locale US = Locale.US;
            l0.o(US, "US");
            String lowerCase = str.toLowerCase(US);
            l0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            resultColumns[i8] = lowerCase;
            i8++;
        }
        int length2 = mappings.length;
        for (int i9 = 0; i9 < length2; i9++) {
            int length3 = mappings[i9].length;
            for (int i10 = 0; i10 < length3; i10++) {
                String[] strArr = mappings[i9];
                String str2 = strArr[i10];
                Locale US2 = Locale.US;
                l0.o(US2, "US");
                String lowerCase2 = str2.toLowerCase(US2);
                l0.o(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                strArr[i10] = lowerCase2;
            }
        }
        d5 = k1.d();
        for (String[] strArr2 : mappings) {
            b0.p0(d5, strArr2);
        }
        a5 = k1.a(d5);
        i5 = kotlin.collections.v.i();
        int length4 = resultColumns.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length4) {
            String str3 = resultColumns[i11];
            int i13 = i12 + 1;
            if (a5.contains(str3)) {
                i5.add(new ResultColumn(str3, i12));
            }
            i11++;
            i12 = i13;
        }
        a6 = kotlin.collections.v.a(i5);
        int length5 = mappings.length;
        ArrayList arrayList = new ArrayList(length5);
        for (int i14 = 0; i14 < length5; i14++) {
            arrayList.add(new ArrayList());
        }
        int length6 = mappings.length;
        int i15 = 0;
        int i16 = 0;
        while (i15 < length6) {
            String[] strArr3 = mappings[i15];
            int i17 = i16 + 1;
            INSTANCE.rabinKarpSearch(a6, strArr3, new AmbiguousColumnResolver$resolve$1$1(strArr3, arrayList, i16));
            if (((List) arrayList.get(i16)).isEmpty()) {
                ArrayList arrayList2 = new ArrayList(strArr3.length);
                int length7 = strArr3.length;
                for (int i18 = i7; i18 < length7; i18++) {
                    String str4 = strArr3[i18];
                    i6 = kotlin.collections.v.i();
                    for (ResultColumn resultColumn : a6) {
                        if (l0.g(str4, resultColumn.getName())) {
                            i6.add(Integer.valueOf(resultColumn.getIndex()));
                        }
                    }
                    a7 = kotlin.collections.v.a(i6);
                    if (!a7.isEmpty()) {
                        arrayList2.add(a7);
                    } else {
                        throw new IllegalStateException(("Column " + str4 + " not found in result").toString());
                    }
                }
                dfs$default(INSTANCE, arrayList2, null, 0, new AmbiguousColumnResolver$resolve$1$2(arrayList, i16), 6, null);
            }
            i15++;
            i16 = i17;
            i7 = 0;
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!(!((List) it.next()).isEmpty())) {
                    z4 = false;
                    break;
                }
            }
        }
        if (z4) {
            k1.h hVar = new k1.h();
            hVar.element = Solution.Companion.getNO_SOLUTION();
            dfs$default(INSTANCE, arrayList, null, 0, new AmbiguousColumnResolver$resolve$4(hVar), 6, null);
            List<Match> matches = ((Solution) hVar.element).getMatches();
            Y = kotlin.collections.x.Y(matches, 10);
            ArrayList arrayList3 = new ArrayList(Y);
            Iterator<T> it2 = matches.iterator();
            while (it2.hasNext()) {
                R5 = e0.R5(((Match) it2.next()).getResultIndices());
                arrayList3.add(R5);
            }
            return (int[][]) arrayList3.toArray(new int[0]);
        }
        throw new IllegalStateException("Failed to find matches for all mappings".toString());
    }
}
