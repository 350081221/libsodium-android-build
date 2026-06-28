package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.collections.o;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.ranges.u;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010*\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B5\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u001b\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0011J#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J\u001d\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016J\u0016\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\tH\u0096\u0002¢\u0006\u0002\u0010\u0019JG\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001c\u001a\u00020\u001dH\u0002¢\u0006\u0002\u0010\u001eJ5\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010 \u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0002\u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010\u0012\u001a\u00020\tH\u0016J?\u0010$\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u001dH\u0002¢\u0006\u0002\u0010&J3\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010(\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\tH\u0002¢\u0006\u0002\u0010)JC\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u000e\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0002¢\u0006\u0002\u0010-J?\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00052\u0006\u0010\u001b\u001a\u00020\t2\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0002¢\u0006\u0002\u0010/J\"\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020302H\u0016J\u0016\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0012\u001a\u00020\tH\u0016J=\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u001dH\u0002¢\u0006\u0002\u0010&J;\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010(\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0002\u00107J\b\u0010(\u001a\u00020\tH\u0002J#\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J?\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\b\u0010:\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0002\u0010;R\u0018\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006<"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList;", "root", "", "", "tail", "size", "", "rootShift", "([Ljava/lang/Object;[Ljava/lang/Object;II)V", "[Ljava/lang/Object;", "getSize", "()I", "add", "element", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "index", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "bufferFor", "(I)[Ljava/lang/Object;", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", "get", "(I)Ljava/lang/Object;", "insertIntoRoot", "shift", "elementCarry", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;", "([Ljava/lang/Object;IILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)[Ljava/lang/Object;", "insertIntoTail", "tailIndex", "([Ljava/lang/Object;ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector;", "listIterator", "", "pullLastBuffer", "tailCarry", "([Ljava/lang/Object;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)[Ljava/lang/Object;", "pullLastBufferFromRoot", "rootSize", "([Ljava/lang/Object;II)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "pushFilledTail", "filledTail", "newTail", "([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector;", "pushTail", "([Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;", "removeAll", "predicate", "Lkotlin/Function1;", "", "removeAt", "removeFromRootAt", "removeFromTailAt", "([Ljava/lang/Object;III)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "set", "setInRoot", "e", "([Ljava/lang/Object;IILjava/lang/Object;)[Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nPersistentVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentVector.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,325:1\n1#2:326\n*E\n"})
/* loaded from: classes.dex */
public final class PersistentVector<E> extends AbstractPersistentList<E> implements PersistentList<E> {
    public static final int $stable = 8;

    @l
    private final Object[] root;
    private final int rootShift;
    private final int size;

    @l
    private final Object[] tail;

    public PersistentVector(@l Object[] objArr, @l Object[] objArr2, int i5, int i6) {
        boolean z4;
        int B;
        this.root = objArr;
        this.tail = objArr2;
        this.size = i5;
        this.rootShift = i6;
        if (size() > 32) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            int size = size() - UtilsKt.rootSize(size());
            B = u.B(objArr2.length, 32);
            CommonFunctionsKt.m3350assert(size <= B);
        } else {
            throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + size()).toString());
        }
    }

    private final Object[] bufferFor(int i5) {
        if (rootSize() <= i5) {
            return this.tail;
        }
        Object[] objArr = this.root;
        for (int i6 = this.rootShift; i6 > 0; i6 -= 5) {
            Object[] objArr2 = objArr[UtilsKt.indexSegment(i5, i6)];
            l0.n(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] insertIntoRoot(Object[] objArr, int i5, int i6, Object obj, ObjectRef objectRef) {
        Object[] copyOf;
        int indexSegment = UtilsKt.indexSegment(i6, i5);
        if (i5 == 0) {
            if (indexSegment == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                l0.o(copyOf, "copyOf(this, newSize)");
            }
            o.B0(objArr, copyOf, indexSegment + 1, indexSegment, 31);
            objectRef.setValue(objArr[31]);
            copyOf[indexSegment] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        l0.o(copyOf2, "copyOf(this, newSize)");
        int i7 = i5 - 5;
        Object obj2 = objArr[indexSegment];
        String str = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>";
        l0.n(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[indexSegment] = insertIntoRoot((Object[]) obj2, i7, i6, obj, objectRef);
        int i8 = indexSegment + 1;
        while (i8 < 32 && copyOf2[i8] != null) {
            Object obj3 = objArr[i8];
            l0.n(obj3, str);
            Object[] objArr2 = copyOf2;
            objArr2[i8] = insertIntoRoot((Object[]) obj3, i7, 0, objectRef.getValue(), objectRef);
            i8++;
            copyOf2 = objArr2;
            str = str;
        }
        return copyOf2;
    }

    private final PersistentVector<E> insertIntoTail(Object[] objArr, int i5, Object obj) {
        int size = size() - rootSize();
        Object[] copyOf = Arrays.copyOf(this.tail, 32);
        l0.o(copyOf, "copyOf(this, newSize)");
        if (size < 32) {
            o.B0(this.tail, copyOf, i5 + 1, i5, size);
            copyOf[i5] = obj;
            return new PersistentVector<>(objArr, copyOf, size() + 1, this.rootShift);
        }
        Object[] objArr2 = this.tail;
        Object obj2 = objArr2[31];
        o.B0(objArr2, copyOf, i5 + 1, i5, size - 1);
        copyOf[i5] = obj;
        return pushFilledTail(objArr, copyOf, UtilsKt.presizedBufferWith(obj2));
    }

    private final Object[] pullLastBuffer(Object[] objArr, int i5, int i6, ObjectRef objectRef) {
        Object[] pullLastBuffer;
        int indexSegment = UtilsKt.indexSegment(i6, i5);
        if (i5 == 5) {
            objectRef.setValue(objArr[indexSegment]);
            pullLastBuffer = null;
        } else {
            Object obj = objArr[indexSegment];
            l0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            pullLastBuffer = pullLastBuffer((Object[]) obj, i5 - 5, i6, objectRef);
        }
        if (pullLastBuffer == null && indexSegment == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        l0.o(copyOf, "copyOf(this, newSize)");
        copyOf[indexSegment] = pullLastBuffer;
        return copyOf;
    }

    private final PersistentList<E> pullLastBufferFromRoot(Object[] objArr, int i5, int i6) {
        if (i6 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                l0.o(objArr, "copyOf(this, newSize)");
            }
            return new SmallPersistentVector(objArr);
        }
        ObjectRef objectRef = new ObjectRef(null);
        Object[] pullLastBuffer = pullLastBuffer(objArr, i6, i5 - 1, objectRef);
        l0.m(pullLastBuffer);
        Object value = objectRef.getValue();
        l0.n(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) value;
        if (pullLastBuffer[1] == null) {
            Object obj = pullLastBuffer[0];
            l0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            return new PersistentVector((Object[]) obj, objArr2, i5, i6 - 5);
        }
        return new PersistentVector(pullLastBuffer, objArr2, i5, i6);
    }

    private final PersistentVector<E> pushFilledTail(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i5 = this.rootShift;
        if (size > (1 << i5)) {
            Object[] presizedBufferWith = UtilsKt.presizedBufferWith(objArr);
            int i6 = this.rootShift + 5;
            return new PersistentVector<>(pushTail(presizedBufferWith, i6, objArr2), objArr3, size() + 1, i6);
        }
        return new PersistentVector<>(pushTail(objArr, i5, objArr2), objArr3, size() + 1, this.rootShift);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r4 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object[] pushTail(java.lang.Object[] r4, int r5, java.lang.Object[] r6) {
        /*
            r3 = this;
            int r0 = r3.size()
            int r0 = r0 + (-1)
            int r0 = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.indexSegment(r0, r5)
            r1 = 32
            if (r4 == 0) goto L19
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            java.lang.String r2 = "copyOf(this, newSize)"
            kotlin.jvm.internal.l0.o(r4, r2)
            if (r4 != 0) goto L1b
        L19:
            java.lang.Object[] r4 = new java.lang.Object[r1]
        L1b:
            r1 = 5
            if (r5 != r1) goto L21
            r4[r0] = r6
            goto L2c
        L21:
            r2 = r4[r0]
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r5 = r5 - r1
            java.lang.Object[] r5 = r3.pushTail(r2, r5, r6)
            r4[r0] = r5
        L2c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector.pushTail(java.lang.Object[], int, java.lang.Object[]):java.lang.Object[]");
    }

    private final Object[] removeFromRootAt(Object[] objArr, int i5, int i6, ObjectRef objectRef) {
        Object[] copyOf;
        int indexSegment = UtilsKt.indexSegment(i6, i5);
        int i7 = 31;
        if (i5 == 0) {
            if (indexSegment == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                l0.o(copyOf, "copyOf(this, newSize)");
            }
            o.B0(objArr, copyOf, indexSegment, indexSegment + 1, 32);
            copyOf[31] = objectRef.getValue();
            objectRef.setValue(objArr[indexSegment]);
            return copyOf;
        }
        if (objArr[31] == null) {
            i7 = UtilsKt.indexSegment(rootSize() - 1, i5);
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        l0.o(copyOf2, "copyOf(this, newSize)");
        int i8 = i5 - 5;
        int i9 = indexSegment + 1;
        if (i9 <= i7) {
            while (true) {
                Object obj = copyOf2[i7];
                l0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                copyOf2[i7] = removeFromRootAt((Object[]) obj, i8, 0, objectRef);
                if (i7 == i9) {
                    break;
                }
                i7--;
            }
        }
        Object obj2 = copyOf2[indexSegment];
        l0.n(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[indexSegment] = removeFromRootAt((Object[]) obj2, i8, i6, objectRef);
        return copyOf2;
    }

    private final PersistentList<E> removeFromTailAt(Object[] objArr, int i5, int i6, int i7) {
        boolean z4;
        int size = size() - i5;
        if (i7 < size) {
            z4 = true;
        } else {
            z4 = false;
        }
        CommonFunctionsKt.m3350assert(z4);
        if (size == 1) {
            return pullLastBufferFromRoot(objArr, i5, i6);
        }
        Object[] copyOf = Arrays.copyOf(this.tail, 32);
        l0.o(copyOf, "copyOf(this, newSize)");
        int i8 = size - 1;
        if (i7 < i8) {
            o.B0(this.tail, copyOf, i7, i7 + 1, size);
        }
        copyOf[i8] = null;
        return new PersistentVector(objArr, copyOf, (i5 + size) - 1, i6);
    }

    private final int rootSize() {
        return UtilsKt.rootSize(size());
    }

    private final Object[] setInRoot(Object[] objArr, int i5, int i6, Object obj) {
        int indexSegment = UtilsKt.indexSegment(i6, i5);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        l0.o(copyOf, "copyOf(this, newSize)");
        if (i5 == 0) {
            copyOf[indexSegment] = obj;
        } else {
            Object obj2 = copyOf[indexSegment];
            l0.n(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf[indexSegment] = setInRoot((Object[]) obj2, i5 - 5, i6, obj);
        }
        return copyOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public /* bridge */ /* synthetic */ PersistentCollection add(Object obj) {
        return add((PersistentVector<E>) obj);
    }

    @Override // kotlin.collections.c, java.util.List
    public E get(int i5) {
        ListImplementation.checkElementIndex$runtime_release(i5, size());
        return (E) bufferFor(i5)[i5 & 31];
    }

    @Override // kotlin.collections.c, kotlin.collections.a
    public int getSize() {
        return this.size;
    }

    @Override // kotlin.collections.c, java.util.List
    @l
    public ListIterator<E> listIterator(int i5) {
        ListImplementation.checkPositionIndex$runtime_release(i5, size());
        return new PersistentVectorIterator(this.root, this.tail, i5, size(), (this.rootShift / 5) + 1);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @l
    public PersistentList<E> removeAt(int i5) {
        ListImplementation.checkElementIndex$runtime_release(i5, size());
        int rootSize = rootSize();
        if (i5 >= rootSize) {
            return removeFromTailAt(this.root, rootSize, this.rootShift, i5 - rootSize);
        }
        return removeFromTailAt(removeFromRootAt(this.root, this.rootShift, i5, new ObjectRef(this.tail[0])), rootSize, this.rootShift, 0);
    }

    @Override // kotlin.collections.c, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @l
    public PersistentList<E> set(int i5, E e5) {
        ListImplementation.checkElementIndex$runtime_release(i5, size());
        if (rootSize() <= i5) {
            Object[] copyOf = Arrays.copyOf(this.tail, 32);
            l0.o(copyOf, "copyOf(this, newSize)");
            copyOf[i5 & 31] = e5;
            return new PersistentVector(this.root, copyOf, size(), this.rootShift);
        }
        return new PersistentVector(setInRoot(this.root, this.rootShift, i5, e5), this.tail, size(), this.rootShift);
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @l
    public PersistentList<E> add(E e5) {
        int size = size() - rootSize();
        if (size < 32) {
            Object[] copyOf = Arrays.copyOf(this.tail, 32);
            l0.o(copyOf, "copyOf(this, newSize)");
            copyOf[size] = e5;
            return new PersistentVector(this.root, copyOf, size() + 1, this.rootShift);
        }
        return pushFilledTail(this.root, this.tail, UtilsKt.presizedBufferWith(e5));
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @l
    public PersistentList<E> removeAll(@l v3.l<? super E, Boolean> lVar) {
        PersistentVectorBuilder<E> builder = builder();
        builder.removeAllWithPredicate(lVar);
        return builder.build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @l
    public PersistentVectorBuilder<E> builder() {
        return new PersistentVectorBuilder<>(this, this.root, this.tail, this.rootShift);
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @l
    public PersistentList<E> add(int i5, E e5) {
        ListImplementation.checkPositionIndex$runtime_release(i5, size());
        if (i5 == size()) {
            return add((PersistentVector<E>) e5);
        }
        int rootSize = rootSize();
        if (i5 >= rootSize) {
            return insertIntoTail(this.root, i5 - rootSize, e5);
        }
        ObjectRef objectRef = new ObjectRef(null);
        return insertIntoTail(insertIntoRoot(this.root, this.rootShift, i5, e5, objectRef), 0, objectRef.getValue());
    }
}
