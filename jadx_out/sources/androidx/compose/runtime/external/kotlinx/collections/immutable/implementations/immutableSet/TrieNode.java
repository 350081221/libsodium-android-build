package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import kotlin.collections.p;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u0000 _*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001_B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006¢\u0006\u0002\u0010\u0007B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0002\u0010\u001cJ#\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u00020\u0004H\u0002J\u001b\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\"J\u0015\u0010#\u001a\u00020$2\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010%J\u001b\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\"J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010(\u001a\u00020\u0004H\u0002J#\u0010)\u001a\u00020$2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0002\u0010*J\u001c\u0010+\u001a\u00020$2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001b\u001a\u00020\u0004J\u0015\u0010-\u001a\u00028\u00002\u0006\u0010.\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010/J\u0016\u00100\u001a\u00020$2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002J\u0010\u00101\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020\u0004H\u0002J\u0015\u00102\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0000¢\u0006\u0002\b3JE\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00105\u001a\u00020\u00042\u0006\u00106\u001a\u00028\u00002\u0006\u00107\u001a\u00020\u00042\u0006\u00108\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u00042\b\u00109\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0002\u0010:J=\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010<\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u00042\b\u00109\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0002\u0010?J3\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010<\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010AJ5\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u00042\n\u0010C\u001a\u0006\u0012\u0002\b\u00030D¢\u0006\u0002\u0010EJ6\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010G\u001a\u00020H2\n\u0010C\u001a\u0006\u0012\u0002\b\u00030DJ+\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u00109\u001a\u00020\tH\u0002¢\u0006\u0002\u0010JJ'\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001a\u001a\u00028\u00002\n\u0010C\u001a\u0006\u0012\u0002\b\u00030DH\u0002¢\u0006\u0002\u0010LJ,\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010G\u001a\u00020H2\u0006\u00109\u001a\u00020\tH\u0002J'\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001a\u001a\u00028\u00002\n\u0010C\u001a\u0006\u0012\u0002\b\u00030DH\u0002¢\u0006\u0002\u0010LJ(\u0010O\u001a\u0004\u0018\u00010\u00022\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010G\u001a\u00020H2\u0006\u00109\u001a\u00020\tH\u0002J\u001e\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010(\u001a\u00020\u00042\u0006\u00109\u001a\u00020\tH\u0002J(\u0010Q\u001a\u0004\u0018\u00010\u00022\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010G\u001a\u00020H2\u0006\u00109\u001a\u00020\tH\u0002J;\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010<\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u00109\u001a\u00020\tH\u0002¢\u0006\u0002\u0010?J5\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u00042\n\u0010C\u001a\u0006\u0012\u0002\b\u00030D¢\u0006\u0002\u0010EJ2\u0010T\u001a\u0004\u0018\u00010\u00022\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010G\u001a\u00020H2\n\u0010C\u001a\u0006\u0012\u0002\b\u00030DJ&\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010V\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u00109\u001a\u00020\tH\u0002J2\u0010W\u001a\u0004\u0018\u00010\u00022\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010G\u001a\u00020H2\n\u0010C\u001a\u0006\u0012\u0002\b\u00030DJ,\u0010X\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010Y\u001a\u00020\u00042\f\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00109\u001a\u00020\tH\u0002J\u0016\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010.\u001a\u00020\u0004H\u0002J)\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0002\u0010\u001cJ\u001e\u0010]\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010V\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0002J$\u0010^\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010Y\u001a\u00020\u00042\f\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006`"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "E", "", "bitmap", "", "buffer", "", "(I[Ljava/lang/Object;)V", "ownedBy", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "(I[Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "getBitmap", "()I", "setBitmap", "(I)V", "getBuffer", "()[Ljava/lang/Object;", "setBuffer", "([Ljava/lang/Object;)V", "[Ljava/lang/Object;", "getOwnedBy", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "setOwnedBy", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "add", "elementHash", "element", "shift", "(ILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "addElementAt", "positionMask", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "calculateSize", "collisionAdd", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "collisionContainsElement", "", "(Ljava/lang/Object;)Z", "collisionRemove", "collisionRemoveElementAtIndex", "i", "contains", "(ILjava/lang/Object;I)Z", "containsAll", "otherNode", "elementAtIndex", "index", "(I)Ljava/lang/Object;", "elementsIdentityEquals", "hasNoCellAt", "indexOfCellAt", "indexOfCellAt$runtime_release", "makeNode", "elementHash1", "element1", "elementHash2", "element2", "owner", "(ILjava/lang/Object;ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "makeNodeAtIndex", "elementIndex", "newElementHash", "newElement", "(IILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "moveElementToNode", "(IILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableAdd", "mutator", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;", "(ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableAddAll", "intersectionSizeRef", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;", "mutableAddElementAt", "(ILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableCollisionAdd", "(Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableCollisionAddAll", "mutableCollisionRemove", "mutableCollisionRemoveAll", "mutableCollisionRemoveElementAtIndex", "mutableCollisionRetainAll", "mutableMoveElementToNode", "mutableRemove", "mutableRemoveAll", "mutableRemoveCellAtIndex", "cellIndex", "mutableRetainAll", "mutableUpdateNodeAtIndex", "nodeIndex", "newNode", "nodeAtIndex", "remove", "removeCellAtIndex", "updateNodeAtIndex", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode\n+ 2 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeKt\n+ 3 ForEachOneBit.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/ForEachOneBitKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeKt$filterTo$1\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 7 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,851:1\n54#2,13:852\n50#2,17:865\n50#2,17:882\n50#2,10:918\n60#2,7:929\n50#2,10:945\n60#2,7:956\n10#3,5:899\n15#3,4:905\n10#3,9:909\n10#3,9:936\n10#3,9:965\n1#4:904\n53#5:928\n53#5:955\n12541#6,2:963\n26#7:974\n*S KotlinDebug\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode\n*L\n297#1:852,13\n324#1:865,17\n347#1:882,17\n594#1:918,10\n594#1:929,7\n701#1:945,10\n701#1:956,7\n423#1:899,5\n423#1:905,4\n525#1:909,9\n621#1:936,9\n717#1:965,9\n594#1:928\n701#1:955\n710#1:963,2\n849#1:974\n*E\n"})
/* loaded from: classes.dex */
public final class TrieNode<E> {
    private int bitmap;

    @l
    private Object[] buffer;

    @m
    private MutabilityOwnership ownedBy;

    @l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @l
    private static final TrieNode EMPTY = new TrieNode(0, new Object[0]);

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "", "getEMPTY$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final TrieNode getEMPTY$runtime_release() {
            return TrieNode.EMPTY;
        }
    }

    public TrieNode(int i5, @l Object[] objArr, @m MutabilityOwnership mutabilityOwnership) {
        this.bitmap = i5;
        this.buffer = objArr;
        this.ownedBy = mutabilityOwnership;
    }

    private final TrieNode<E> addElementAt(int i5, E e5) {
        return new TrieNode<>(i5 | this.bitmap, TrieNodeKt.access$addElementAtIndex(this.buffer, indexOfCellAt$runtime_release(i5), e5));
    }

    private final int calculateSize() {
        int i5;
        if (this.bitmap == 0) {
            return this.buffer.length;
        }
        int i6 = 0;
        for (Object obj : this.buffer) {
            if (obj instanceof TrieNode) {
                i5 = ((TrieNode) obj).calculateSize();
            } else {
                i5 = 1;
            }
            i6 += i5;
        }
        return i6;
    }

    private final TrieNode<E> collisionAdd(E e5) {
        if (collisionContainsElement(e5)) {
            return this;
        }
        return new TrieNode<>(0, TrieNodeKt.access$addElementAtIndex(this.buffer, 0, e5));
    }

    private final boolean collisionContainsElement(E e5) {
        boolean s8;
        s8 = p.s8(this.buffer, e5);
        return s8;
    }

    private final TrieNode<E> collisionRemove(E e5) {
        int If;
        If = p.If(this.buffer, e5);
        if (If != -1) {
            return collisionRemoveElementAtIndex(If);
        }
        return this;
    }

    private final TrieNode<E> collisionRemoveElementAtIndex(int i5) {
        return new TrieNode<>(0, TrieNodeKt.access$removeCellAtIndex(this.buffer, i5));
    }

    private final E elementAtIndex(int i5) {
        return (E) this.buffer[i5];
    }

    private final boolean elementsIdentityEquals(TrieNode<E> trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (this.bitmap != trieNode.bitmap) {
            return false;
        }
        int length = this.buffer.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (this.buffer[i5] != trieNode.buffer[i5]) {
                return false;
            }
        }
        return true;
    }

    private final boolean hasNoCellAt(int i5) {
        return (i5 & this.bitmap) == 0;
    }

    private final TrieNode<E> makeNode(int i5, E e5, int i6, E e6, int i7, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr;
        if (i7 > 30) {
            return new TrieNode<>(0, new Object[]{e5, e6}, mutabilityOwnership);
        }
        int indexSegment = TrieNodeKt.indexSegment(i5, i7);
        int indexSegment2 = TrieNodeKt.indexSegment(i6, i7);
        if (indexSegment != indexSegment2) {
            if (indexSegment < indexSegment2) {
                objArr = new Object[]{e5, e6};
            } else {
                objArr = new Object[]{e6, e5};
            }
            return new TrieNode<>((1 << indexSegment) | (1 << indexSegment2), objArr, mutabilityOwnership);
        }
        return new TrieNode<>(1 << indexSegment, new Object[]{makeNode(i5, e5, i6, e6, i7 + 5, mutabilityOwnership)}, mutabilityOwnership);
    }

    private final TrieNode<E> makeNodeAtIndex(int i5, int i6, E e5, int i7, MutabilityOwnership mutabilityOwnership) {
        int i8;
        E elementAtIndex = elementAtIndex(i5);
        if (elementAtIndex != null) {
            i8 = elementAtIndex.hashCode();
        } else {
            i8 = 0;
        }
        return makeNode(i8, elementAtIndex, i6, e5, i7 + 5, mutabilityOwnership);
    }

    private final TrieNode<E> moveElementToNode(int i5, int i6, E e5, int i7) {
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        copyOf[i5] = makeNodeAtIndex(i5, i6, e5, i7, null);
        return new TrieNode<>(this.bitmap, copyOf);
    }

    private final TrieNode<E> mutableAddElementAt(int i5, E e5, MutabilityOwnership mutabilityOwnership) {
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(i5);
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer = TrieNodeKt.access$addElementAtIndex(this.buffer, indexOfCellAt$runtime_release, e5);
            this.bitmap = i5 | this.bitmap;
            return this;
        }
        return new TrieNode<>(i5 | this.bitmap, TrieNodeKt.access$addElementAtIndex(this.buffer, indexOfCellAt$runtime_release, e5), mutabilityOwnership);
    }

    private final TrieNode<E> mutableCollisionAdd(E e5, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        if (collisionContainsElement(e5)) {
            return this;
        }
        persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() + 1);
        if (this.ownedBy == persistentHashSetBuilder.getOwnership$runtime_release()) {
            this.buffer = TrieNodeKt.access$addElementAtIndex(this.buffer, 0, e5);
            return this;
        }
        return new TrieNode<>(0, TrieNodeKt.access$addElementAtIndex(this.buffer, 0, e5), persistentHashSetBuilder.getOwnership$runtime_release());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final TrieNode<E> mutableCollisionAddAll(TrieNode<E> trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        boolean z4;
        if (this == trieNode) {
            deltaCounter.plusAssign(this.buffer.length);
            return this;
        }
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + trieNode.buffer.length);
        l0.o(copyOf, "copyOf(this, newSize)");
        Object[] objArr2 = trieNode.buffer;
        int length = this.buffer.length;
        int i5 = 0;
        for (int i6 = 0; i6 < objArr2.length; i6++) {
            boolean z5 = true;
            if (i5 <= i6) {
                z4 = true;
            } else {
                z4 = false;
            }
            CommonFunctionsKt.m3350assert(z4);
            if (!collisionContainsElement(objArr2[i6])) {
                copyOf[length + i5] = objArr2[i6];
                i5++;
                if (length + i5 > copyOf.length) {
                    z5 = false;
                }
                CommonFunctionsKt.m3350assert(z5);
            }
        }
        int length2 = i5 + this.buffer.length;
        deltaCounter.plusAssign(copyOf.length - length2);
        if (length2 == this.buffer.length) {
            return this;
        }
        if (length2 == trieNode.buffer.length) {
            return trieNode;
        }
        if (length2 != copyOf.length) {
            copyOf = Arrays.copyOf(copyOf, length2);
            l0.o(copyOf, "copyOf(this, newSize)");
        }
        if (l0.g(this.ownedBy, mutabilityOwnership)) {
            this.buffer = copyOf;
            return this;
        }
        return new TrieNode<>(0, copyOf, mutabilityOwnership);
    }

    private final TrieNode<E> mutableCollisionRemove(E e5, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        int If;
        If = p.If(this.buffer, e5);
        if (If != -1) {
            persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() - 1);
            return mutableCollisionRemoveElementAtIndex(If, persistentHashSetBuilder.getOwnership$runtime_release());
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object mutableCollisionRemoveAll(TrieNode<E> trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr;
        boolean z4;
        if (this == trieNode) {
            deltaCounter.plusAssign(this.buffer.length);
            return EMPTY;
        }
        if (l0.g(mutabilityOwnership, this.ownedBy)) {
            objArr = this.buffer;
        } else {
            objArr = new Object[this.buffer.length];
        }
        Object[] objArr2 = this.buffer;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            boolean z5 = true;
            if (i5 >= objArr2.length) {
                break;
            }
            if (i6 <= i5) {
                z4 = true;
            } else {
                z4 = false;
            }
            CommonFunctionsKt.m3350assert(z4);
            if (!trieNode.collisionContainsElement(objArr2[i5])) {
                objArr[0 + i6] = objArr2[i5];
                i6++;
                if (0 + i6 > objArr.length) {
                    z5 = false;
                }
                CommonFunctionsKt.m3350assert(z5);
            }
            i5++;
        }
        deltaCounter.plusAssign(this.buffer.length - i6);
        if (i6 == 0) {
            return EMPTY;
        }
        if (i6 == 1) {
            return objArr[0];
        }
        if (i6 == this.buffer.length) {
            return this;
        }
        if (i6 == objArr.length) {
            return new TrieNode(0, objArr, mutabilityOwnership);
        }
        Object[] copyOf = Arrays.copyOf(objArr, i6);
        l0.o(copyOf, "copyOf(this, newSize)");
        return new TrieNode(0, copyOf, mutabilityOwnership);
    }

    private final TrieNode<E> mutableCollisionRemoveElementAtIndex(int i5, MutabilityOwnership mutabilityOwnership) {
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer = TrieNodeKt.access$removeCellAtIndex(this.buffer, i5);
            return this;
        }
        return new TrieNode<>(0, TrieNodeKt.access$removeCellAtIndex(this.buffer, i5), mutabilityOwnership);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object mutableCollisionRetainAll(TrieNode<E> trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr;
        boolean z4;
        if (this == trieNode) {
            deltaCounter.plusAssign(this.buffer.length);
            return this;
        }
        if (l0.g(mutabilityOwnership, this.ownedBy)) {
            objArr = this.buffer;
        } else {
            objArr = new Object[Math.min(this.buffer.length, trieNode.buffer.length)];
        }
        Object[] objArr2 = this.buffer;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            boolean z5 = true;
            if (i5 >= objArr2.length) {
                break;
            }
            if (i6 <= i5) {
                z4 = true;
            } else {
                z4 = false;
            }
            CommonFunctionsKt.m3350assert(z4);
            if (trieNode.collisionContainsElement(objArr2[i5])) {
                objArr[0 + i6] = objArr2[i5];
                i6++;
                if (0 + i6 > objArr.length) {
                    z5 = false;
                }
                CommonFunctionsKt.m3350assert(z5);
            }
            i5++;
        }
        deltaCounter.plusAssign(i6);
        if (i6 == 0) {
            return EMPTY;
        }
        if (i6 == 1) {
            return objArr[0];
        }
        if (i6 == this.buffer.length) {
            return this;
        }
        if (i6 != trieNode.buffer.length) {
            if (i6 == objArr.length) {
                return new TrieNode(0, objArr, mutabilityOwnership);
            }
            Object[] copyOf = Arrays.copyOf(objArr, i6);
            l0.o(copyOf, "copyOf(this, newSize)");
            return new TrieNode(0, copyOf, mutabilityOwnership);
        }
        return trieNode;
    }

    private final TrieNode<E> mutableMoveElementToNode(int i5, int i6, E e5, int i7, MutabilityOwnership mutabilityOwnership) {
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer[i5] = makeNodeAtIndex(i5, i6, e5, i7, mutabilityOwnership);
            return this;
        }
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        copyOf[i5] = makeNodeAtIndex(i5, i6, e5, i7, mutabilityOwnership);
        return new TrieNode<>(this.bitmap, copyOf, mutabilityOwnership);
    }

    private final TrieNode<E> mutableRemoveCellAtIndex(int i5, int i6, MutabilityOwnership mutabilityOwnership) {
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer = TrieNodeKt.access$removeCellAtIndex(this.buffer, i5);
            this.bitmap ^= i6;
            return this;
        }
        return new TrieNode<>(i6 ^ this.bitmap, TrieNodeKt.access$removeCellAtIndex(this.buffer, i5), mutabilityOwnership);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v4 */
    private final TrieNode<E> mutableUpdateNodeAtIndex(int i5, TrieNode<E> trieNode, MutabilityOwnership mutabilityOwnership) {
        ?? r02 = trieNode.buffer;
        if (r02.length == 1) {
            ?? r03 = r02[0];
            if (!(r03 instanceof TrieNode)) {
                if (this.buffer.length == 1) {
                    trieNode.bitmap = this.bitmap;
                    return trieNode;
                }
                trieNode = r03;
            }
        }
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer[i5] = trieNode;
            return this;
        }
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        copyOf[i5] = trieNode;
        return new TrieNode<>(this.bitmap, copyOf, mutabilityOwnership);
    }

    private final TrieNode<E> nodeAtIndex(int i5) {
        Object obj = this.buffer[i5];
        l0.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        return (TrieNode) obj;
    }

    private final TrieNode<E> removeCellAtIndex(int i5, int i6) {
        return new TrieNode<>(i6 ^ this.bitmap, TrieNodeKt.access$removeCellAtIndex(this.buffer, i5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v3 */
    private final TrieNode<E> updateNodeAtIndex(int i5, TrieNode<E> trieNode) {
        ?? r02 = trieNode.buffer;
        if (r02.length == 1) {
            ?? r03 = r02[0];
            if (!(r03 instanceof TrieNode)) {
                if (this.buffer.length == 1) {
                    trieNode.bitmap = this.bitmap;
                    return trieNode;
                }
                trieNode = r03;
            }
        }
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        copyOf[i5] = trieNode;
        return new TrieNode<>(this.bitmap, copyOf);
    }

    @l
    public final TrieNode<E> add(int i5, E e5, int i6) {
        TrieNode<E> add;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i5, i6);
        if (hasNoCellAt(indexSegment)) {
            return addElementAt(indexSegment, e5);
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime_release);
            if (i6 == 30) {
                add = nodeAtIndex.collisionAdd(e5);
            } else {
                add = nodeAtIndex.add(i5, e5, i6 + 5);
            }
            if (nodeAtIndex == add) {
                return this;
            }
            return updateNodeAtIndex(indexOfCellAt$runtime_release, add);
        }
        if (l0.g(e5, obj)) {
            return this;
        }
        return moveElementToNode(indexOfCellAt$runtime_release, i5, e5, i6);
    }

    public final boolean contains(int i5, E e5, int i6) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i5, i6);
        if (hasNoCellAt(indexSegment)) {
            return false;
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime_release);
            if (i6 == 30) {
                return nodeAtIndex.collisionContainsElement(e5);
            }
            return nodeAtIndex.contains(i5, e5, i6 + 5);
        }
        return l0.g(e5, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean containsAll(@l TrieNode<E> trieNode, int i5) {
        int i6;
        boolean s8;
        if (this == trieNode) {
            return true;
        }
        if (i5 > 30) {
            for (Object obj : trieNode.buffer) {
                s8 = p.s8(this.buffer, obj);
                if (!s8) {
                    return false;
                }
            }
            return true;
        }
        int i7 = this.bitmap;
        int i8 = trieNode.bitmap;
        int i9 = i7 & i8;
        if (i9 != i8) {
            return false;
        }
        while (i9 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i9);
            int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(lowestOneBit);
            int indexOfCellAt$runtime_release2 = trieNode.indexOfCellAt$runtime_release(lowestOneBit);
            Object obj2 = this.buffer[indexOfCellAt$runtime_release];
            Object obj3 = trieNode.buffer[indexOfCellAt$runtime_release2];
            boolean z4 = obj2 instanceof TrieNode;
            boolean z5 = obj3 instanceof TrieNode;
            if (z4 && z5) {
                l0.n(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                l0.n(obj3, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                if (!((TrieNode) obj2).containsAll((TrieNode) obj3, i5 + 5)) {
                    return false;
                }
            } else if (z4) {
                l0.n(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                TrieNode trieNode2 = (TrieNode) obj2;
                if (obj3 != null) {
                    i6 = obj3.hashCode();
                } else {
                    i6 = 0;
                }
                if (!trieNode2.contains(i6, obj3, i5 + 5)) {
                    return false;
                }
            } else if (z5 || !l0.g(obj2, obj3)) {
                return false;
            }
            i9 ^= lowestOneBit;
        }
        return true;
    }

    public final int getBitmap() {
        return this.bitmap;
    }

    @l
    public final Object[] getBuffer() {
        return this.buffer;
    }

    @m
    public final MutabilityOwnership getOwnedBy() {
        return this.ownedBy;
    }

    public final int indexOfCellAt$runtime_release(int i5) {
        return Integer.bitCount((i5 - 1) & this.bitmap);
    }

    @l
    public final TrieNode<E> mutableAdd(int i5, E e5, int i6, @l PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        TrieNode<E> mutableAdd;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i5, i6);
        if (hasNoCellAt(indexSegment)) {
            persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() + 1);
            return mutableAddElementAt(indexSegment, e5, persistentHashSetBuilder.getOwnership$runtime_release());
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime_release);
            if (i6 == 30) {
                mutableAdd = nodeAtIndex.mutableCollisionAdd(e5, persistentHashSetBuilder);
            } else {
                mutableAdd = nodeAtIndex.mutableAdd(i5, e5, i6 + 5, persistentHashSetBuilder);
            }
            if (nodeAtIndex == mutableAdd) {
                return this;
            }
            return mutableUpdateNodeAtIndex(indexOfCellAt$runtime_release, mutableAdd, persistentHashSetBuilder.getOwnership$runtime_release());
        }
        if (l0.g(e5, obj)) {
            return this;
        }
        persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() + 1);
        return mutableMoveElementToNode(indexOfCellAt$runtime_release, i5, e5, i6, persistentHashSetBuilder.getOwnership$runtime_release());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public final TrieNode<E> mutableAddAll(@l TrieNode<E> trieNode, int i5, @l DeltaCounter deltaCounter, @l PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        TrieNode<E> trieNode2;
        int i6;
        int i7;
        Object[] objArr;
        int i8;
        Object makeNode;
        int i9;
        TrieNode mutableAdd;
        int i10;
        if (this == trieNode) {
            deltaCounter.setCount(deltaCounter.getCount() + calculateSize());
            return this;
        }
        if (i5 > 30) {
            return mutableCollisionAddAll(trieNode, deltaCounter, persistentHashSetBuilder.getOwnership$runtime_release());
        }
        int i11 = this.bitmap;
        int i12 = trieNode.bitmap | i11;
        if (i12 == i11 && l0.g(this.ownedBy, persistentHashSetBuilder.getOwnership$runtime_release())) {
            trieNode2 = this;
        } else {
            trieNode2 = new TrieNode<>(i12, new Object[Integer.bitCount(i12)], persistentHashSetBuilder.getOwnership$runtime_release());
        }
        int i13 = i12;
        int i14 = 0;
        while (i13 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i13);
            int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(lowestOneBit);
            int indexOfCellAt$runtime_release2 = trieNode.indexOfCellAt$runtime_release(lowestOneBit);
            Object[] objArr2 = trieNode2.buffer;
            if (hasNoCellAt(lowestOneBit)) {
                makeNode = trieNode.buffer[indexOfCellAt$runtime_release2];
            } else if (trieNode.hasNoCellAt(lowestOneBit)) {
                makeNode = this.buffer[indexOfCellAt$runtime_release];
            } else {
                Object obj = this.buffer[indexOfCellAt$runtime_release];
                Object obj2 = trieNode.buffer[indexOfCellAt$runtime_release2];
                boolean z4 = obj instanceof TrieNode;
                boolean z5 = obj2 instanceof TrieNode;
                if (z4 && z5) {
                    l0.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    l0.n(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    makeNode = ((TrieNode) obj).mutableAddAll((TrieNode) obj2, i5 + 5, deltaCounter, persistentHashSetBuilder);
                } else {
                    if (z4) {
                        l0.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                        TrieNode trieNode3 = (TrieNode) obj;
                        int size = persistentHashSetBuilder.size();
                        if (obj2 != null) {
                            i10 = obj2.hashCode();
                        } else {
                            i10 = 0;
                        }
                        mutableAdd = trieNode3.mutableAdd(i10, obj2, i5 + 5, persistentHashSetBuilder);
                        if (persistentHashSetBuilder.size() == size) {
                            deltaCounter.setCount(deltaCounter.getCount() + 1);
                        }
                        r2 r2Var = r2.f19517a;
                    } else if (z5) {
                        l0.n(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                        TrieNode trieNode4 = (TrieNode) obj2;
                        int size2 = persistentHashSetBuilder.size();
                        if (obj != null) {
                            i9 = obj.hashCode();
                        } else {
                            i9 = 0;
                        }
                        mutableAdd = trieNode4.mutableAdd(i9, obj, i5 + 5, persistentHashSetBuilder);
                        if (persistentHashSetBuilder.size() == size2) {
                            deltaCounter.setCount(deltaCounter.getCount() + 1);
                        }
                        r2 r2Var2 = r2.f19517a;
                    } else if (l0.g(obj, obj2)) {
                        deltaCounter.setCount(deltaCounter.getCount() + 1);
                        r2 r2Var3 = r2.f19517a;
                        makeNode = obj;
                    } else {
                        if (obj != null) {
                            i6 = obj.hashCode();
                        } else {
                            i6 = 0;
                        }
                        if (obj2 != null) {
                            i7 = obj2.hashCode();
                        } else {
                            i7 = 0;
                        }
                        objArr = objArr2;
                        i8 = lowestOneBit;
                        makeNode = makeNode(i6, obj, i7, obj2, i5 + 5, persistentHashSetBuilder.getOwnership$runtime_release());
                        objArr[i14] = makeNode;
                        i14++;
                        i13 ^= i8;
                    }
                    makeNode = mutableAdd;
                }
            }
            objArr = objArr2;
            i8 = lowestOneBit;
            objArr[i14] = makeNode;
            i14++;
            i13 ^= i8;
        }
        if (elementsIdentityEquals(trieNode2)) {
            return this;
        }
        if (trieNode.elementsIdentityEquals(trieNode2)) {
            return trieNode;
        }
        return trieNode2;
    }

    @l
    public final TrieNode<E> mutableRemove(int i5, E e5, int i6, @l PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        TrieNode<E> mutableRemove;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i5, i6);
        if (hasNoCellAt(indexSegment)) {
            return this;
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime_release);
            if (i6 == 30) {
                mutableRemove = nodeAtIndex.mutableCollisionRemove(e5, persistentHashSetBuilder);
            } else {
                mutableRemove = nodeAtIndex.mutableRemove(i5, e5, i6 + 5, persistentHashSetBuilder);
            }
            if (this.ownedBy != persistentHashSetBuilder.getOwnership$runtime_release() && nodeAtIndex == mutableRemove) {
                return this;
            }
            return mutableUpdateNodeAtIndex(indexOfCellAt$runtime_release, mutableRemove, persistentHashSetBuilder.getOwnership$runtime_release());
        }
        if (l0.g(e5, obj)) {
            persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() - 1);
            return mutableRemoveCellAtIndex(indexOfCellAt$runtime_release, indexSegment, persistentHashSetBuilder.getOwnership$runtime_release());
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b1, code lost:
    
        if ((r13 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) == false) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mutableRemoveAll(@p4.l androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> r17, int r18, @p4.l androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter r19, @p4.l androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder<?> r20) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode, int, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m
    public final Object mutableRetainAll(@l TrieNode<E> trieNode, int i5, @l DeltaCounter deltaCounter, @l PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        TrieNode<E> trieNode2;
        TrieNode trieNode3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i6;
        int i7;
        if (this == trieNode) {
            deltaCounter.plusAssign(calculateSize());
            return this;
        }
        if (i5 > 30) {
            return mutableCollisionRetainAll(trieNode, deltaCounter, persistentHashSetBuilder.getOwnership$runtime_release());
        }
        int i8 = this.bitmap & trieNode.bitmap;
        if (i8 == 0) {
            return EMPTY;
        }
        if (l0.g(this.ownedBy, persistentHashSetBuilder.getOwnership$runtime_release()) && i8 == this.bitmap) {
            trieNode2 = this;
        } else {
            trieNode2 = new TrieNode<>(i8, new Object[Integer.bitCount(i8)], persistentHashSetBuilder.getOwnership$runtime_release());
        }
        int i9 = i8;
        int i10 = 0;
        int i11 = 0;
        while (i9 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i9);
            int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(lowestOneBit);
            int indexOfCellAt$runtime_release2 = trieNode.indexOfCellAt$runtime_release(lowestOneBit);
            Object obj = this.buffer[indexOfCellAt$runtime_release];
            Object obj2 = trieNode.buffer[indexOfCellAt$runtime_release2];
            boolean z7 = obj instanceof TrieNode;
            boolean z8 = obj2 instanceof TrieNode;
            if (z7 && z8) {
                l0.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                l0.n(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                obj = ((TrieNode) obj).mutableRetainAll((TrieNode) obj2, i5 + 5, deltaCounter, persistentHashSetBuilder);
            } else if (z7) {
                l0.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                TrieNode trieNode4 = (TrieNode) obj;
                if (obj2 != null) {
                    i7 = obj2.hashCode();
                } else {
                    i7 = 0;
                }
                if (trieNode4.contains(i7, obj2, i5 + 5)) {
                    deltaCounter.plusAssign(1);
                    obj = obj2;
                } else {
                    obj = EMPTY;
                }
            } else if (z8) {
                l0.n(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                TrieNode trieNode5 = (TrieNode) obj2;
                if (obj != null) {
                    i6 = obj.hashCode();
                } else {
                    i6 = 0;
                }
                if (trieNode5.contains(i6, obj, i5 + 5)) {
                    deltaCounter.plusAssign(1);
                } else {
                    obj = EMPTY;
                }
            } else if (l0.g(obj, obj2)) {
                deltaCounter.plusAssign(1);
            } else {
                obj = EMPTY;
            }
            if (obj != EMPTY) {
                i10 |= lowestOneBit;
            }
            trieNode2.buffer[i11] = obj;
            i11++;
            i9 ^= lowestOneBit;
        }
        int bitCount = Integer.bitCount(i10);
        if (i10 == 0) {
            return EMPTY;
        }
        if (i10 == i8) {
            if (trieNode2.elementsIdentityEquals(this)) {
                return this;
            }
            if (trieNode2.elementsIdentityEquals(trieNode)) {
                return trieNode;
            }
            return trieNode2;
        }
        if (bitCount == 1 && i5 != 0) {
            Object obj3 = trieNode2.buffer[trieNode2.indexOfCellAt$runtime_release(i10)];
            if (obj3 instanceof TrieNode) {
                trieNode3 = new TrieNode(i10, new Object[]{obj3}, persistentHashSetBuilder.getOwnership$runtime_release());
            } else {
                return obj3;
            }
        } else {
            Object[] objArr = new Object[bitCount];
            Object[] objArr2 = trieNode2.buffer;
            int i12 = 0;
            for (int i13 = 0; i13 < objArr2.length; i13++) {
                if (i12 <= i13) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                CommonFunctionsKt.m3350assert(z4);
                if (objArr2[i13] != Companion.getEMPTY$runtime_release()) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    objArr[0 + i12] = objArr2[i13];
                    i12++;
                    if (0 + i12 <= bitCount) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    CommonFunctionsKt.m3350assert(z6);
                }
            }
            trieNode3 = new TrieNode(i10, objArr, persistentHashSetBuilder.getOwnership$runtime_release());
        }
        return trieNode3;
    }

    @l
    public final TrieNode<E> remove(int i5, E e5, int i6) {
        TrieNode<E> remove;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i5, i6);
        if (hasNoCellAt(indexSegment)) {
            return this;
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime_release);
            if (i6 == 30) {
                remove = nodeAtIndex.collisionRemove(e5);
            } else {
                remove = nodeAtIndex.remove(i5, e5, i6 + 5);
            }
            if (nodeAtIndex == remove) {
                return this;
            }
            return updateNodeAtIndex(indexOfCellAt$runtime_release, remove);
        }
        if (l0.g(e5, obj)) {
            return removeCellAtIndex(indexOfCellAt$runtime_release, indexSegment);
        }
        return this;
    }

    public final void setBitmap(int i5) {
        this.bitmap = i5;
    }

    public final void setBuffer(@l Object[] objArr) {
        this.buffer = objArr;
    }

    public final void setOwnedBy(@m MutabilityOwnership mutabilityOwnership) {
        this.ownedBy = mutabilityOwnership;
    }

    public TrieNode(int i5, @l Object[] objArr) {
        this(i5, objArr, null);
    }
}
