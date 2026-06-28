package okio;

import java.util.List;
import java.util.RandomAccess;
import kotlin.y1;

@kotlin.i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u0015B\u001f\b\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0011\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000eH\u0096\u0002R\u001e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0006X\u0080\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lokio/Options;", "Lkotlin/collections/AbstractList;", "Lokio/ByteString;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "byteStrings", "", "trie", "", "([Lokio/ByteString;[I)V", "getByteStrings$okio", "()[Lokio/ByteString;", "[Lokio/ByteString;", "size", "", "getSize", "()I", "getTrie$okio", "()[I", "get", "index", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b1 extends kotlin.collections.c<n> implements RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    public static final a f20864c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final n[] f20865a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final int[] f20866b;

    @kotlin.i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JT\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0002J!\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u0016\"\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0017R\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lokio/Options$Companion;", "", "()V", "intCount", "", "Lokio/Buffer;", "getIntCount", "(Lokio/Buffer;)J", "buildTrieRecursive", "", "nodeOffset", "node", "byteStringOffset", "", "byteStrings", "", "Lokio/ByteString;", "fromIndex", "toIndex", "indexes", "of", "Lokio/Options;", "", "([Lokio/ByteString;)Lokio/Options;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Options.kt\nokio/Options$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,236:1\n11065#2:237\n11400#2,3:238\n13374#2,3:243\n37#3,2:241\n1#4:246\n74#5:247\n74#5:248\n*S KotlinDebug\n*F\n+ 1 Options.kt\nokio/Options$Companion\n*L\n43#1:237\n43#1:238,3\n44#1:243,3\n43#1:241,2\n151#1:247\n208#1:248\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.w wVar) {
            this();
        }

        private final void a(long j5, l lVar, int i5, List<? extends n> list, int i6, int i7, List<Integer> list2) {
            boolean z4;
            int i8;
            int i9;
            boolean z5;
            int i10;
            int i11;
            l lVar2;
            boolean z6;
            int i12 = i5;
            if (i6 < i7) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                for (int i13 = i6; i13 < i7; i13++) {
                    if (list.get(i13).size() >= i12) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (!z6) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                n nVar = list.get(i6);
                n nVar2 = list.get(i7 - 1);
                int i14 = -1;
                if (i12 == nVar.size()) {
                    int intValue = list2.get(i6).intValue();
                    int i15 = i6 + 1;
                    n nVar3 = list.get(i15);
                    i8 = i15;
                    i9 = intValue;
                    nVar = nVar3;
                } else {
                    i8 = i6;
                    i9 = -1;
                }
                if (nVar.getByte(i12) != nVar2.getByte(i12)) {
                    int i16 = 1;
                    for (int i17 = i8 + 1; i17 < i7; i17++) {
                        if (list.get(i17 - 1).getByte(i12) != list.get(i17).getByte(i12)) {
                            i16++;
                        }
                    }
                    long c5 = j5 + c(lVar) + 2 + (i16 * 2);
                    lVar.writeInt(i16);
                    lVar.writeInt(i9);
                    for (int i18 = i8; i18 < i7; i18++) {
                        byte b5 = list.get(i18).getByte(i12);
                        if (i18 == i8 || b5 != list.get(i18 - 1).getByte(i12)) {
                            lVar.writeInt(b5 & y1.f19838d);
                        }
                    }
                    l lVar3 = new l();
                    while (i8 < i7) {
                        byte b6 = list.get(i8).getByte(i12);
                        int i19 = i8 + 1;
                        int i20 = i19;
                        while (true) {
                            if (i20 < i7) {
                                if (b6 != list.get(i20).getByte(i12)) {
                                    i10 = i20;
                                    break;
                                }
                                i20++;
                            } else {
                                i10 = i7;
                                break;
                            }
                        }
                        if (i19 == i10 && i12 + 1 == list.get(i8).size()) {
                            lVar.writeInt(list2.get(i8).intValue());
                            i11 = i10;
                            lVar2 = lVar3;
                        } else {
                            lVar.writeInt(((int) (c5 + c(lVar3))) * i14);
                            i11 = i10;
                            lVar2 = lVar3;
                            a(c5, lVar3, i12 + 1, list, i8, i10, list2);
                        }
                        lVar3 = lVar2;
                        i8 = i11;
                        i14 = -1;
                    }
                    lVar.G(lVar3);
                    return;
                }
                int min = Math.min(nVar.size(), nVar2.size());
                int i21 = 0;
                for (int i22 = i12; i22 < min && nVar.getByte(i22) == nVar2.getByte(i22); i22++) {
                    i21++;
                }
                long c6 = j5 + c(lVar) + 2 + i21 + 1;
                lVar.writeInt(-i21);
                lVar.writeInt(i9);
                int i23 = i12 + i21;
                while (i12 < i23) {
                    lVar.writeInt(nVar.getByte(i12) & y1.f19838d);
                    i12++;
                }
                if (i8 + 1 == i7) {
                    if (i23 == list.get(i8).size()) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        lVar.writeInt(list2.get(i8).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                l lVar4 = new l();
                lVar.writeInt(((int) (c(lVar4) + c6)) * (-1));
                a(c6, lVar4, i23, list, i8, i7, list2);
                lVar.G(lVar4);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        static /* synthetic */ void b(a aVar, long j5, l lVar, int i5, List list, int i6, int i7, List list2, int i8, Object obj) {
            aVar.a((i8 & 1) != 0 ? 0L : j5, lVar, (i8 & 4) != 0 ? 0 : i5, list, (i8 & 16) != 0 ? 0 : i6, (i8 & 32) != 0 ? list.size() : i7, list2);
        }

        private final long c(l lVar) {
            return lVar.M0() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x00e9, code lost:
        
            continue;
         */
        @p4.l
        @u3.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final okio.b1 d(@p4.l okio.n... r17) {
            /*
                Method dump skipped, instructions count: 320
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.b1.a.d(okio.n[]):okio.b1");
        }
    }

    private b1(n[] nVarArr, int[] iArr) {
        this.f20865a = nVarArr;
        this.f20866b = iArr;
    }

    public /* synthetic */ b1(n[] nVarArr, int[] iArr, kotlin.jvm.internal.w wVar) {
        this(nVarArr, iArr);
    }

    @p4.l
    @u3.m
    public static final b1 k(@p4.l n... nVarArr) {
        return f20864c.d(nVarArr);
    }

    public /* bridge */ boolean a(n nVar) {
        return super.contains(nVar);
    }

    @Override // kotlin.collections.c, java.util.List
    @p4.l
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n get(int i5) {
        return this.f20865a[i5];
    }

    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof n) {
            return a((n) obj);
        }
        return false;
    }

    @p4.l
    public final n[] e() {
        return this.f20865a;
    }

    @p4.l
    public final int[] g() {
        return this.f20866b;
    }

    @Override // kotlin.collections.c, kotlin.collections.a
    public int getSize() {
        return this.f20865a.length;
    }

    public /* bridge */ int i(n nVar) {
        return super.indexOf(nVar);
    }

    @Override // kotlin.collections.c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof n) {
            return i((n) obj);
        }
        return -1;
    }

    public /* bridge */ int j(n nVar) {
        return super.lastIndexOf(nVar);
    }

    @Override // kotlin.collections.c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof n) {
            return j((n) obj);
        }
        return -1;
    }
}
