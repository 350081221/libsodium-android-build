package kotlin.collections.builders;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.tendcloud.tenddata.cq;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.o;
import kotlin.collections.s0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.ranges.u;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import w3.g;

@i0(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010&\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 }*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u00060\u0004j\u0002`\u0005:\t}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tBE\b\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0002\u0010\u0012J\u0017\u00102\u001a\u00020\b2\u0006\u00103\u001a\u00028\u0000H\u0000¢\u0006\u0004\b4\u00105J\u0013\u00106\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0002¢\u0006\u0002\u00107J\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000109J\r\u0010:\u001a\u00020;H\u0000¢\u0006\u0002\b<J\b\u0010=\u001a\u00020;H\u0016J\b\u0010>\u001a\u00020;H\u0002J\u0019\u0010?\u001a\u00020!2\n\u0010@\u001a\u0006\u0012\u0002\b\u00030AH\u0000¢\u0006\u0002\bBJ!\u0010C\u001a\u00020!2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010EH\u0000¢\u0006\u0002\bFJ\u0015\u0010G\u001a\u00020!2\u0006\u00103\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010HJ\u0015\u0010I\u001a\u00020!2\u0006\u0010J\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010HJ\u0018\u0010K\u001a\u00020!2\u000e\u0010L\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u000309H\u0002J\u0010\u0010M\u001a\u00020;2\u0006\u0010\u0013\u001a\u00020\bH\u0002J\u0010\u0010N\u001a\u00020;2\u0006\u0010O\u001a\u00020\bH\u0002J\u0019\u0010P\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010QH\u0000¢\u0006\u0002\bRJ\u0013\u0010S\u001a\u00020!2\b\u0010L\u001a\u0004\u0018\u00010TH\u0096\u0002J\u0015\u0010U\u001a\u00020\b2\u0006\u00103\u001a\u00028\u0000H\u0002¢\u0006\u0002\u00105J\u0015\u0010V\u001a\u00020\b2\u0006\u0010J\u001a\u00028\u0001H\u0002¢\u0006\u0002\u00105J\u0018\u0010W\u001a\u0004\u0018\u00018\u00012\u0006\u00103\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010XJ\u0015\u0010Y\u001a\u00020\b2\u0006\u00103\u001a\u00028\u0000H\u0002¢\u0006\u0002\u00105J\b\u0010Z\u001a\u00020\bH\u0016J\b\u0010[\u001a\u00020!H\u0016J\u0019\u0010\\\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010]H\u0000¢\u0006\u0002\b^J\u001f\u0010_\u001a\u0004\u0018\u00018\u00012\u0006\u00103\u001a\u00028\u00002\u0006\u0010J\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010`J\u001e\u0010a\u001a\u00020;2\u0014\u0010b\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000109H\u0016J\"\u0010c\u001a\u00020!2\u0018\u0010b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010E0AH\u0002J\u001c\u0010d\u001a\u00020!2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010EH\u0002J\u0010\u0010e\u001a\u00020!2\u0006\u0010f\u001a\u00020\bH\u0002J\u0010\u0010g\u001a\u00020;2\u0006\u0010h\u001a\u00020\bH\u0002J\u0017\u0010i\u001a\u0004\u0018\u00018\u00012\u0006\u00103\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010XJ!\u0010j\u001a\u00020!2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010EH\u0000¢\u0006\u0002\bkJ\u0010\u0010l\u001a\u00020;2\u0006\u0010m\u001a\u00020\bH\u0002J\u0017\u0010n\u001a\u00020\b2\u0006\u00103\u001a\u00028\u0000H\u0000¢\u0006\u0004\bo\u00105J\u0010\u0010p\u001a\u00020;2\u0006\u0010q\u001a\u00020\bH\u0002J\u0017\u0010r\u001a\u00020!2\u0006\u0010s\u001a\u00028\u0001H\u0000¢\u0006\u0004\bt\u0010HJ\u0010\u0010u\u001a\u00020!2\u0006\u0010v\u001a\u00020\bH\u0002J\b\u0010w\u001a\u00020xH\u0016J\u0019\u0010y\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010zH\u0000¢\u0006\u0002\b{J\b\u0010|\u001a\u00020TH\u0002R\u0014\u0010\u0013\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R&\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00180\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0015R\u001e\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020!@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001aR\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010'R\u0016\u0010(\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010*\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0015R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010'R\u0016\u00100\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0083\u0001"}, d2 = {"Lkotlin/collections/builders/MapBuilder;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "initialCapacity", "", "(I)V", "keysArray", "", "valuesArray", "presenceArray", "", "hashArray", "maxProbeDistance", cq.a.LENGTH, "([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V", "capacity", "getCapacity$kotlin_stdlib", "()I", "entries", "", "", "getEntries", "()Ljava/util/Set;", "entriesView", "Lkotlin/collections/builders/MapBuilderEntries;", "hashShift", "hashSize", "getHashSize", "<set-?>", "", "isReadOnly", "isReadOnly$kotlin_stdlib", "()Z", "keys", "getKeys", "[Ljava/lang/Object;", "keysView", "Lkotlin/collections/builders/MapBuilderKeys;", "size", "getSize", "values", "", "getValues", "()Ljava/util/Collection;", "valuesView", "Lkotlin/collections/builders/MapBuilderValues;", "addKey", DatabaseFileArchive.COLUMN_KEY, "addKey$kotlin_stdlib", "(Ljava/lang/Object;)I", "allocateValuesArray", "()[Ljava/lang/Object;", "build", "", "checkIsMutable", "", "checkIsMutable$kotlin_stdlib", "clear", "compact", "containsAllEntries", "m", "", "containsAllEntries$kotlin_stdlib", "containsEntry", "entry", "", "containsEntry$kotlin_stdlib", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", t0.b.f22420d, "contentEquals", "other", "ensureCapacity", "ensureExtraCapacity", "n", "entriesIterator", "Lkotlin/collections/builders/MapBuilder$EntriesItr;", "entriesIterator$kotlin_stdlib", "equals", "", "findKey", "findValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "hash", TTDownloadField.TT_HASHCODE, "isEmpty", "keysIterator", "Lkotlin/collections/builders/MapBuilder$KeysItr;", "keysIterator$kotlin_stdlib", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", TypedValues.TransitionType.S_FROM, "putAllEntries", "putEntry", "putRehash", "i", "rehash", "newHashSize", "remove", "removeEntry", "removeEntry$kotlin_stdlib", "removeHashAt", "removedHash", "removeKey", "removeKey$kotlin_stdlib", "removeKeyAt", "index", "removeValue", "element", "removeValue$kotlin_stdlib", "shouldCompact", "extraCapacity", "toString", "", "valuesIterator", "Lkotlin/collections/builders/MapBuilder$ValuesItr;", "valuesIterator$kotlin_stdlib", "writeReplace", "Companion", "EntriesItr", "EntryRef", "Itr", "KeysItr", "ValuesItr", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\nkotlin/collections/builders/MapBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,697:1\n1#2:698\n*E\n"})
/* loaded from: classes3.dex */
public final class d<K, V> implements Map<K, V>, Serializable, w3.g {

    @l
    public static final a Companion = new a(null);

    @l
    private static final d Empty;
    private static final int INITIAL_CAPACITY = 8;
    private static final int INITIAL_MAX_PROBE_DISTANCE = 2;
    private static final int MAGIC = -1640531527;
    private static final int TOMBSTONE = -1;

    @m
    private kotlin.collections.builders.e<K, V> entriesView;

    @l
    private int[] hashArray;
    private int hashShift;
    private boolean isReadOnly;

    @l
    private K[] keysArray;

    @m
    private kotlin.collections.builders.f<K> keysView;
    private int length;
    private int maxProbeDistance;

    @l
    private int[] presenceArray;
    private int size;

    @m
    private V[] valuesArray;

    @m
    private g<V> valuesView;

    @i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0002J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0002R \u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lkotlin/collections/builders/MapBuilder$Companion;", "", "()V", "Empty", "Lkotlin/collections/builders/MapBuilder;", "", "getEmpty$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder;", "INITIAL_CAPACITY", "", "INITIAL_MAX_PROBE_DISTANCE", "MAGIC", "TOMBSTONE", "computeHashSize", "capacity", "computeShift", "hashSize", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int c(int i5) {
            int u4;
            u4 = u.u(i5, 1);
            return Integer.highestOneBit(u4 * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int d(int i5) {
            return Integer.numberOfLeadingZeros(i5) + 1;
        }

        @l
        public final d e() {
            return d.Empty;
        }
    }

    @i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00050\u0004B\u0019\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\nH\u0096\u0002J\u0012\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u000ej\u0002`\u000fJ\r\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lkotlin/collections/builders/MapBuilder$EntriesItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", "", "", "map", "Lkotlin/collections/builders/MapBuilder;", "(Lkotlin/collections/builders/MapBuilder;)V", "next", "Lkotlin/collections/builders/MapBuilder$EntryRef;", "nextAppendString", "", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "nextHashCode", "", "nextHashCode$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b<K, V> extends C0543d<K, V> implements Iterator<Map.Entry<K, V>>, w3.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@l d<K, V> map) {
            super(map);
            l0.p(map, "map");
        }

        @Override // java.util.Iterator
        @l
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public c<K, V> next() {
            if (a() < ((d) c()).length) {
                int a5 = a();
                e(a5 + 1);
                g(a5);
                c<K, V> cVar = new c<>(c(), b());
                d();
                return cVar;
            }
            throw new NoSuchElementException();
        }

        public final void j(@l StringBuilder sb) {
            l0.p(sb, "sb");
            if (a() < ((d) c()).length) {
                int a5 = a();
                e(a5 + 1);
                g(a5);
                Object obj = ((d) c()).keysArray[b()];
                if (l0.g(obj, c())) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj);
                }
                sb.append(o0.a.f20835h);
                Object[] objArr = ((d) c()).valuesArray;
                l0.m(objArr);
                Object obj2 = objArr[b()];
                if (l0.g(obj2, c())) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj2);
                }
                d();
                return;
            }
            throw new NoSuchElementException();
        }

        public final int k() {
            int i5;
            if (a() < ((d) c()).length) {
                int a5 = a();
                e(a5 + 1);
                g(a5);
                Object obj = ((d) c()).keysArray[b()];
                int i6 = 0;
                if (obj != null) {
                    i5 = obj.hashCode();
                } else {
                    i5 = 0;
                }
                Object[] objArr = ((d) c()).valuesArray;
                l0.m(objArr);
                Object obj2 = objArr[b()];
                if (obj2 != null) {
                    i6 = obj2.hashCode();
                }
                int i7 = i5 ^ i6;
                d();
                return i7;
            }
            throw new NoSuchElementException();
        }
    }

    @i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B!\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\u0015\u0010\u0013\u001a\u00028\u00032\u0006\u0010\u0014\u001a\u00028\u0003H\u0016¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00028\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00028\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, d2 = {"Lkotlin/collections/builders/MapBuilder$EntryRef;", "K", "V", "", "map", "Lkotlin/collections/builders/MapBuilder;", "index", "", "(Lkotlin/collections/builders/MapBuilder;I)V", DatabaseFileArchive.COLUMN_KEY, "getKey", "()Ljava/lang/Object;", t0.b.f22420d, "getValue", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "setValue", "newValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c<K, V> implements Map.Entry<K, V>, g.a {

        /* renamed from: a, reason: collision with root package name */
        @l
        private final d<K, V> f19098a;

        /* renamed from: b, reason: collision with root package name */
        private final int f19099b;

        public c(@l d<K, V> map, int i5) {
            l0.p(map, "map");
            this.f19098a = map;
            this.f19099b = i5;
        }

        @Override // java.util.Map.Entry
        public boolean equals(@m Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (l0.g(entry.getKey(), getKey()) && l0.g(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return (K) ((d) this.f19098a).keysArray[this.f19099b];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            Object[] objArr = ((d) this.f19098a).valuesArray;
            l0.m(objArr);
            return (V) objArr[this.f19099b];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K key = getKey();
            int hashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return hashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v4) {
            this.f19098a.checkIsMutable$kotlin_stdlib();
            Object[] allocateValuesArray = this.f19098a.allocateValuesArray();
            int i5 = this.f19099b;
            V v5 = (V) allocateValuesArray[i5];
            allocateValuesArray[i5] = v4;
            return v5;
        }

        @l
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append(o0.a.f20835h);
            sb.append(getValue());
            return sb.toString();
        }
    }

    @i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0012\u001a\u00020\u0013J\r\u0010\u0014\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u0016J\u0006\u0010\u0017\u001a\u00020\u0015R\u001a\u0010\u0007\u001a\u00020\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lkotlin/collections/builders/MapBuilder$Itr;", "K", "V", "", "map", "Lkotlin/collections/builders/MapBuilder;", "(Lkotlin/collections/builders/MapBuilder;)V", "index", "", "getIndex$kotlin_stdlib", "()I", "setIndex$kotlin_stdlib", "(I)V", "lastIndex", "getLastIndex$kotlin_stdlib", "setLastIndex$kotlin_stdlib", "getMap$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder;", "hasNext", "", "initNext", "", "initNext$kotlin_stdlib", "remove", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\nkotlin/collections/builders/MapBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,697:1\n1#2:698\n*E\n"})
    /* renamed from: kotlin.collections.builders.d$d, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0543d<K, V> {

        /* renamed from: a, reason: collision with root package name */
        @l
        private final d<K, V> f19100a;

        /* renamed from: b, reason: collision with root package name */
        private int f19101b;

        /* renamed from: c, reason: collision with root package name */
        private int f19102c;

        public C0543d(@l d<K, V> map) {
            l0.p(map, "map");
            this.f19100a = map;
            this.f19102c = -1;
            d();
        }

        public final int a() {
            return this.f19101b;
        }

        public final int b() {
            return this.f19102c;
        }

        @l
        public final d<K, V> c() {
            return this.f19100a;
        }

        public final void d() {
            while (this.f19101b < ((d) this.f19100a).length) {
                int[] iArr = ((d) this.f19100a).presenceArray;
                int i5 = this.f19101b;
                if (iArr[i5] < 0) {
                    this.f19101b = i5 + 1;
                } else {
                    return;
                }
            }
        }

        public final void e(int i5) {
            this.f19101b = i5;
        }

        public final void g(int i5) {
            this.f19102c = i5;
        }

        public final boolean hasNext() {
            return this.f19101b < ((d) this.f19100a).length;
        }

        public final void remove() {
            boolean z4;
            if (this.f19102c != -1) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                this.f19100a.checkIsMutable$kotlin_stdlib();
                this.f19100a.removeKeyAt(this.f19102c);
                this.f19102c = -1;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
    }

    @i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0019\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/collections/builders/MapBuilder$KeysItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", "", "map", "Lkotlin/collections/builders/MapBuilder;", "(Lkotlin/collections/builders/MapBuilder;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e<K, V> extends C0543d<K, V> implements Iterator<K>, w3.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@l d<K, V> map) {
            super(map);
            l0.p(map, "map");
        }

        @Override // java.util.Iterator
        public K next() {
            if (a() < ((d) c()).length) {
                int a5 = a();
                e(a5 + 1);
                g(a5);
                K k5 = (K) ((d) c()).keysArray[b()];
                d();
                return k5;
            }
            throw new NoSuchElementException();
        }
    }

    @i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004B\u0019\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00028\u0003H\u0096\u0002¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/collections/builders/MapBuilder$ValuesItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", "", "map", "Lkotlin/collections/builders/MapBuilder;", "(Lkotlin/collections/builders/MapBuilder;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class f<K, V> extends C0543d<K, V> implements Iterator<V>, w3.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@l d<K, V> map) {
            super(map);
            l0.p(map, "map");
        }

        @Override // java.util.Iterator
        public V next() {
            if (a() < ((d) c()).length) {
                int a5 = a();
                e(a5 + 1);
                g(a5);
                Object[] objArr = ((d) c()).valuesArray;
                l0.m(objArr);
                V v4 = (V) objArr[b()];
                d();
                return v4;
            }
            throw new NoSuchElementException();
        }
    }

    static {
        d dVar = new d(0);
        dVar.isReadOnly = true;
        Empty = dVar;
    }

    private d(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i5, int i6) {
        this.keysArray = kArr;
        this.valuesArray = vArr;
        this.presenceArray = iArr;
        this.hashArray = iArr2;
        this.maxProbeDistance = i5;
        this.length = i6;
        this.hashShift = Companion.d(getHashSize());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V[] allocateValuesArray() {
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) kotlin.collections.builders.c.d(getCapacity$kotlin_stdlib());
        this.valuesArray = vArr2;
        return vArr2;
    }

    private final void compact() {
        int i5;
        V[] vArr = this.valuesArray;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i5 = this.length;
            if (i6 >= i5) {
                break;
            }
            if (this.presenceArray[i6] >= 0) {
                K[] kArr = this.keysArray;
                kArr[i7] = kArr[i6];
                if (vArr != null) {
                    vArr[i7] = vArr[i6];
                }
                i7++;
            }
            i6++;
        }
        kotlin.collections.builders.c.g(this.keysArray, i7, i5);
        if (vArr != null) {
            kotlin.collections.builders.c.g(vArr, i7, this.length);
        }
        this.length = i7;
    }

    private final boolean contentEquals(Map<?, ?> map) {
        return size() == map.size() && containsAllEntries$kotlin_stdlib(map.entrySet());
    }

    private final void ensureCapacity(int i5) {
        V[] vArr;
        if (i5 >= 0) {
            if (i5 > getCapacity$kotlin_stdlib()) {
                int capacity$kotlin_stdlib = (getCapacity$kotlin_stdlib() * 3) / 2;
                if (i5 <= capacity$kotlin_stdlib) {
                    i5 = capacity$kotlin_stdlib;
                }
                this.keysArray = (K[]) kotlin.collections.builders.c.e(this.keysArray, i5);
                V[] vArr2 = this.valuesArray;
                if (vArr2 != null) {
                    vArr = (V[]) kotlin.collections.builders.c.e(vArr2, i5);
                } else {
                    vArr = null;
                }
                this.valuesArray = vArr;
                int[] copyOf = Arrays.copyOf(this.presenceArray, i5);
                l0.o(copyOf, "copyOf(this, newSize)");
                this.presenceArray = copyOf;
                int c5 = Companion.c(i5);
                if (c5 > getHashSize()) {
                    rehash(c5);
                    return;
                }
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    private final void ensureExtraCapacity(int i5) {
        if (shouldCompact(i5)) {
            rehash(getHashSize());
        } else {
            ensureCapacity(this.length + i5);
        }
    }

    private final int findKey(K k5) {
        int hash = hash(k5);
        int i5 = this.maxProbeDistance;
        while (true) {
            int i6 = this.hashArray[hash];
            if (i6 == 0) {
                return -1;
            }
            if (i6 > 0) {
                int i7 = i6 - 1;
                if (l0.g(this.keysArray[i7], k5)) {
                    return i7;
                }
            }
            i5--;
            if (i5 < 0) {
                return -1;
            }
            int i8 = hash - 1;
            if (hash == 0) {
                hash = getHashSize() - 1;
            } else {
                hash = i8;
            }
        }
    }

    private final int findValue(V v4) {
        int i5 = this.length;
        while (true) {
            i5--;
            if (i5 < 0) {
                return -1;
            }
            if (this.presenceArray[i5] >= 0) {
                V[] vArr = this.valuesArray;
                l0.m(vArr);
                if (l0.g(vArr[i5], v4)) {
                    return i5;
                }
            }
        }
    }

    private final int getHashSize() {
        return this.hashArray.length;
    }

    private final int hash(K k5) {
        return ((k5 != null ? k5.hashCode() : 0) * MAGIC) >>> this.hashShift;
    }

    private final boolean putAllEntries(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z4 = false;
        if (collection.isEmpty()) {
            return false;
        }
        ensureExtraCapacity(collection.size());
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it = collection.iterator();
        while (it.hasNext()) {
            if (putEntry(it.next())) {
                z4 = true;
            }
        }
        return z4;
    }

    private final boolean putEntry(Map.Entry<? extends K, ? extends V> entry) {
        int addKey$kotlin_stdlib = addKey$kotlin_stdlib(entry.getKey());
        V[] allocateValuesArray = allocateValuesArray();
        if (addKey$kotlin_stdlib >= 0) {
            allocateValuesArray[addKey$kotlin_stdlib] = entry.getValue();
            return true;
        }
        int i5 = (-addKey$kotlin_stdlib) - 1;
        if (!l0.g(entry.getValue(), allocateValuesArray[i5])) {
            allocateValuesArray[i5] = entry.getValue();
            return true;
        }
        return false;
    }

    private final boolean putRehash(int i5) {
        int hash = hash(this.keysArray[i5]);
        int i6 = this.maxProbeDistance;
        while (true) {
            int[] iArr = this.hashArray;
            if (iArr[hash] == 0) {
                iArr[hash] = i5 + 1;
                this.presenceArray[i5] = hash;
                return true;
            }
            i6--;
            if (i6 < 0) {
                return false;
            }
            int i7 = hash - 1;
            if (hash == 0) {
                hash = getHashSize() - 1;
            } else {
                hash = i7;
            }
        }
    }

    private final void rehash(int i5) {
        if (this.length > size()) {
            compact();
        }
        int i6 = 0;
        if (i5 != getHashSize()) {
            this.hashArray = new int[i5];
            this.hashShift = Companion.d(i5);
        } else {
            o.K1(this.hashArray, 0, 0, getHashSize());
        }
        while (i6 < this.length) {
            int i7 = i6 + 1;
            if (putRehash(i6)) {
                i6 = i7;
            } else {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    private final void removeHashAt(int i5) {
        int B;
        B = u.B(this.maxProbeDistance * 2, getHashSize() / 2);
        int i6 = B;
        int i7 = 0;
        int i8 = i5;
        do {
            int i9 = i5 - 1;
            if (i5 == 0) {
                i5 = getHashSize() - 1;
            } else {
                i5 = i9;
            }
            i7++;
            if (i7 > this.maxProbeDistance) {
                this.hashArray[i8] = 0;
                return;
            }
            int[] iArr = this.hashArray;
            int i10 = iArr[i5];
            if (i10 == 0) {
                iArr[i8] = 0;
                return;
            }
            if (i10 < 0) {
                iArr[i8] = -1;
            } else {
                int i11 = i10 - 1;
                if (((hash(this.keysArray[i11]) - i5) & (getHashSize() - 1)) >= i7) {
                    this.hashArray[i8] = i10;
                    this.presenceArray[i11] = i8;
                }
                i6--;
            }
            i8 = i5;
            i7 = 0;
            i6--;
        } while (i6 >= 0);
        this.hashArray[i8] = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeKeyAt(int i5) {
        kotlin.collections.builders.c.f(this.keysArray, i5);
        removeHashAt(this.presenceArray[i5]);
        this.presenceArray[i5] = -1;
        this.size = size() - 1;
    }

    private final boolean shouldCompact(int i5) {
        int capacity$kotlin_stdlib = getCapacity$kotlin_stdlib();
        int i6 = this.length;
        int i7 = capacity$kotlin_stdlib - i6;
        int size = i6 - size();
        if (i7 < i5 && i7 + size >= i5 && size >= getCapacity$kotlin_stdlib() / 4) {
            return true;
        }
        return false;
    }

    private final Object writeReplace() {
        if (this.isReadOnly) {
            return new i(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final int addKey$kotlin_stdlib(K k5) {
        int B;
        checkIsMutable$kotlin_stdlib();
        while (true) {
            int hash = hash(k5);
            B = u.B(this.maxProbeDistance * 2, getHashSize() / 2);
            int i5 = 0;
            while (true) {
                int i6 = this.hashArray[hash];
                if (i6 <= 0) {
                    if (this.length >= getCapacity$kotlin_stdlib()) {
                        ensureExtraCapacity(1);
                    } else {
                        int i7 = this.length;
                        int i8 = i7 + 1;
                        this.length = i8;
                        this.keysArray[i7] = k5;
                        this.presenceArray[i7] = hash;
                        this.hashArray[hash] = i8;
                        this.size = size() + 1;
                        if (i5 > this.maxProbeDistance) {
                            this.maxProbeDistance = i5;
                        }
                        return i7;
                    }
                } else {
                    if (l0.g(this.keysArray[i6 - 1], k5)) {
                        return -i6;
                    }
                    i5++;
                    if (i5 > B) {
                        rehash(getHashSize() * 2);
                        break;
                    }
                    int i9 = hash - 1;
                    if (hash == 0) {
                        hash = getHashSize() - 1;
                    } else {
                        hash = i9;
                    }
                }
            }
        }
    }

    @l
    public final Map<K, V> build() {
        checkIsMutable$kotlin_stdlib();
        this.isReadOnly = true;
        if (size() > 0) {
            return this;
        }
        d dVar = Empty;
        l0.n(dVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return dVar;
    }

    public final void checkIsMutable$kotlin_stdlib() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public void clear() {
        checkIsMutable$kotlin_stdlib();
        s0 it = new kotlin.ranges.l(0, this.length - 1).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            int[] iArr = this.presenceArray;
            int i5 = iArr[nextInt];
            if (i5 >= 0) {
                this.hashArray[i5] = 0;
                iArr[nextInt] = -1;
            }
        }
        kotlin.collections.builders.c.g(this.keysArray, 0, this.length);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            kotlin.collections.builders.c.g(vArr, 0, this.length);
        }
        this.size = 0;
        this.length = 0;
    }

    public final boolean containsAllEntries$kotlin_stdlib(@l Collection<?> m5) {
        l0.p(m5, "m");
        for (Object obj : m5) {
            if (obj != null) {
                try {
                    if (!containsEntry$kotlin_stdlib((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean containsEntry$kotlin_stdlib(@l Map.Entry<? extends K, ? extends V> entry) {
        l0.p(entry, "entry");
        int findKey = findKey(entry.getKey());
        if (findKey < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        l0.m(vArr);
        return l0.g(vArr[findKey], entry.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return findKey(obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return findValue(obj) >= 0;
    }

    @l
    public final b<K, V> entriesIterator$kotlin_stdlib() {
        return new b<>(this);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(@m Object obj) {
        if (obj != this && (!(obj instanceof Map) || !contentEquals((Map) obj))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @m
    public V get(Object obj) {
        int findKey = findKey(obj);
        if (findKey < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        l0.m(vArr);
        return vArr[findKey];
    }

    public final int getCapacity$kotlin_stdlib() {
        return this.keysArray.length;
    }

    @l
    public Set<Map.Entry<K, V>> getEntries() {
        kotlin.collections.builders.e<K, V> eVar = this.entriesView;
        if (eVar == null) {
            kotlin.collections.builders.e<K, V> eVar2 = new kotlin.collections.builders.e<>(this);
            this.entriesView = eVar2;
            return eVar2;
        }
        return eVar;
    }

    @l
    public Set<K> getKeys() {
        kotlin.collections.builders.f<K> fVar = this.keysView;
        if (fVar == null) {
            kotlin.collections.builders.f<K> fVar2 = new kotlin.collections.builders.f<>(this);
            this.keysView = fVar2;
            return fVar2;
        }
        return fVar;
    }

    public int getSize() {
        return this.size;
    }

    @l
    public Collection<V> getValues() {
        g<V> gVar = this.valuesView;
        if (gVar == null) {
            g<V> gVar2 = new g<>(this);
            this.valuesView = gVar2;
            return gVar2;
        }
        return gVar;
    }

    @Override // java.util.Map
    public int hashCode() {
        b<K, V> entriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i5 = 0;
        while (entriesIterator$kotlin_stdlib.hasNext()) {
            i5 += entriesIterator$kotlin_stdlib.k();
        }
        return i5;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public final boolean isReadOnly$kotlin_stdlib() {
        return this.isReadOnly;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @l
    public final e<K, V> keysIterator$kotlin_stdlib() {
        return new e<>(this);
    }

    @Override // java.util.Map
    @m
    public V put(K k5, V v4) {
        checkIsMutable$kotlin_stdlib();
        int addKey$kotlin_stdlib = addKey$kotlin_stdlib(k5);
        V[] allocateValuesArray = allocateValuesArray();
        if (addKey$kotlin_stdlib < 0) {
            int i5 = (-addKey$kotlin_stdlib) - 1;
            V v5 = allocateValuesArray[i5];
            allocateValuesArray[i5] = v4;
            return v5;
        }
        allocateValuesArray[addKey$kotlin_stdlib] = v4;
        return null;
    }

    @Override // java.util.Map
    public void putAll(@l Map<? extends K, ? extends V> from) {
        l0.p(from, "from");
        checkIsMutable$kotlin_stdlib();
        putAllEntries(from.entrySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @m
    public V remove(Object obj) {
        int removeKey$kotlin_stdlib = removeKey$kotlin_stdlib(obj);
        if (removeKey$kotlin_stdlib < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        l0.m(vArr);
        V v4 = vArr[removeKey$kotlin_stdlib];
        kotlin.collections.builders.c.f(vArr, removeKey$kotlin_stdlib);
        return v4;
    }

    public final boolean removeEntry$kotlin_stdlib(@l Map.Entry<? extends K, ? extends V> entry) {
        l0.p(entry, "entry");
        checkIsMutable$kotlin_stdlib();
        int findKey = findKey(entry.getKey());
        if (findKey < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        l0.m(vArr);
        if (!l0.g(vArr[findKey], entry.getValue())) {
            return false;
        }
        removeKeyAt(findKey);
        return true;
    }

    public final int removeKey$kotlin_stdlib(K k5) {
        checkIsMutable$kotlin_stdlib();
        int findKey = findKey(k5);
        if (findKey < 0) {
            return -1;
        }
        removeKeyAt(findKey);
        return findKey;
    }

    public final boolean removeValue$kotlin_stdlib(V v4) {
        checkIsMutable$kotlin_stdlib();
        int findValue = findValue(v4);
        if (findValue < 0) {
            return false;
        }
        removeKeyAt(findValue);
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @l
    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        b<K, V> entriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i5 = 0;
        while (entriesIterator$kotlin_stdlib.hasNext()) {
            if (i5 > 0) {
                sb.append(", ");
            }
            entriesIterator$kotlin_stdlib.j(sb);
            i5++;
        }
        sb.append(a1.i.f138d);
        String sb2 = sb.toString();
        l0.o(sb2, "sb.toString()");
        return sb2;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    @l
    public final f<K, V> valuesIterator$kotlin_stdlib() {
        return new f<>(this);
    }

    public d() {
        this(8);
    }

    public d(int i5) {
        this(kotlin.collections.builders.c.d(i5), null, new int[i5], new int[Companion.c(i5)], 2, 0);
    }
}
