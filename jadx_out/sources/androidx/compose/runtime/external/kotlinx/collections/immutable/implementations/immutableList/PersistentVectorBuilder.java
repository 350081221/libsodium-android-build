package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.f;
import kotlin.collections.o;
import kotlin.i0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.ranges.u;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010*\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010)\n\u0000\n\u0002\u0010+\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003BA\u0012\f\u0010r\u001a\b\u0012\u0004\u0012\u00028\u00000b\u0012\u0010\u0010t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b\u0012\u000e\u0010v\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\u0006\u0010w\u001a\u00020\u0004¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u001f\u0010\f\u001a\u00020\u000b2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ)\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017JA\u0010\u001c\u001a\u00020\u001b2\u0010\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b2\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJA\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0010\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b2\u000e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u001f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010!J?\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\"\u001a\u00020\u00042\u000e\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0#H\u0002¢\u0006\u0004\b%\u0010&JG\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0010\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b0\bH\u0002¢\u0006\u0004\b(\u0010)JO\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0010\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0014\u0010*\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b0#H\u0002¢\u0006\u0004\b+\u0010,J1\u0010.\u001a\u00020\u001b2\u0010\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b.\u0010/JI\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J]\u00102\u001a\u00020\u001b2\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u0000042\u0006\u0010-\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u00042\u0016\u0010'\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b0\b2\u0006\u00107\u001a\u00020\u00042\u000e\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002¢\u0006\u0004\b2\u00109JW\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010:\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u00042\u0016\u0010'\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b0\b2\u0006\u00107\u001a\u00020\u00042\u000e\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002¢\u0006\u0004\b;\u0010<Jm\u0010?\u001a\u00020\u001b2\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u0000042\u0006\u0010-\u001a\u00020\u00042\u000e\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010>\u001a\u00020\u00042\u0016\u0010'\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b0\b2\u0006\u00107\u001a\u00020\u00042\u000e\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002¢\u0006\u0004\b?\u0010@J\u001f\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010-\u001a\u00020\u0004H\u0002¢\u0006\u0004\bA\u0010BJ;\u0010C\u001a\u0004\u0018\u00010\t2\u0010\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0004H\u0002¢\u0006\u0004\bC\u0010DJ?\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00042\u0006\u0010E\u001a\u000200H\u0002¢\u0006\u0004\bF\u0010GJ1\u0010H\u001a\u00020\u001b2\u0010\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004H\u0002¢\u0006\u0004\bH\u0010IJA\u0010J\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b2\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010E\u001a\u000200H\u0002¢\u0006\u0004\bJ\u0010GJ\u001c\u0010M\u001a\u00020\u000b2\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0KH\u0002J1\u0010N\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b2\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\bN\u0010\u0012J7\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004H\u0002¢\u0006\u0004\bO\u0010PJ,\u0010R\u001a\u00020\u00042\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0K2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010Q\u001a\u000200H\u0002JC\u0010M\u001a\u00020\u00042\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0K2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010S\u001a\u00020\u00042\u0006\u0010Q\u001a\u000200H\u0002¢\u0006\u0004\bM\u0010TJw\u0010X\u001a\u00020\u00042\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0K2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010S\u001a\u00020\u00042\u0006\u0010U\u001a\u00020\u00042\u0006\u0010Q\u001a\u0002002\u0014\u0010W\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b0V2\u0014\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b0VH\u0002¢\u0006\u0004\bX\u0010YJG\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00042\u0006\u0010Z\u001a\u00028\u00002\u0006\u0010[\u001a\u000200H\u0002¢\u0006\u0004\b\\\u00103J\u001e\u0010^\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b0]2\u0006\u0010-\u001a\u00020\u0004H\u0002J\u000f\u0010a\u001a\u00020\u0004H\u0000¢\u0006\u0004\b_\u0010`J\u000e\u0010c\u001a\b\u0012\u0004\u0012\u00028\u00000bH\u0016J\u0017\u0010d\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\bd\u0010eJ\u0016\u0010f\u001a\u00020\u000b2\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u000004H\u0016J\u001f\u0010d\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\bd\u0010gJ\u001e\u0010f\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u00042\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u000004H\u0016J\u0018\u0010h\u001a\u00028\u00002\u0006\u0010-\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\bh\u0010iJ\u0017\u0010j\u001a\u00028\u00002\u0006\u0010-\u001a\u00020\u0004H\u0016¢\u0006\u0004\bj\u0010iJ\u0016\u0010M\u001a\u00020\u000b2\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u000004H\u0016J\u001a\u0010k\u001a\u00020\u000b2\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0KJ \u0010l\u001a\u00028\u00002\u0006\u0010-\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\bl\u0010mJ\u000f\u0010o\u001a\b\u0012\u0004\u0012\u00028\u00000nH\u0096\u0002J\u000e\u0010q\u001a\b\u0012\u0004\u0012\u00028\u00000pH\u0016J\u0016\u0010q\u001a\b\u0012\u0004\u0012\u00028\u00000p2\u0006\u0010-\u001a\u00020\u0004H\u0016R\u001c\u0010r\u001a\b\u0012\u0004\u0012\u00028\u00000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR \u0010t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u001e\u0010v\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010uR\"\u0010w\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010`\"\u0004\bz\u0010{R\u0016\u0010}\u001a\u00020|8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R9\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b2\u0010\u0010\u007f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b8\u0000@BX\u0080\u000e¢\u0006\r\n\u0004\b\u0018\u0010u\u001a\u0005\b\u0080\u0001\u0010\u0017R5\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u000e\u0010\u007f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0000@BX\u0080\u000e¢\u0006\r\n\u0004\b\u001e\u0010u\u001a\u0005\b\u0081\u0001\u0010\u0017R%\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u007f\u001a\u00020\u00048\u0016@RX\u0096\u000e¢\u0006\r\n\u0004\b\u0006\u0010x\u001a\u0005\b\u0082\u0001\u0010`¨\u0006\u0085\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", "E", "Lkotlin/collections/f;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;", "", "rootSize", "size", "tailSize", "", "", "buffer", "", "isMutable", "([Ljava/lang/Object;)Z", "makeMutable", "([Ljava/lang/Object;)[Ljava/lang/Object;", "distance", "makeMutableShiftingRight", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "element", "mutableBufferWith", "(Ljava/lang/Object;)[Ljava/lang/Object;", "mutableBuffer", "()[Ljava/lang/Object;", "root", "filledTail", "newTail", "Lkotlin/r2;", "pushFilledTail", "([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)V", "tail", "shift", "pushTail", "([Ljava/lang/Object;[Ljava/lang/Object;I)[Ljava/lang/Object;", "bufferIndex", "", "sourceIterator", "copyToBuffer", "([Ljava/lang/Object;ILjava/util/Iterator;)[Ljava/lang/Object;", "buffers", "pushBuffersIncreasingHeightIfNeeded", "([Ljava/lang/Object;I[[Ljava/lang/Object;)[Ljava/lang/Object;", "buffersIterator", "pushBuffers", "([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;", "index", "insertIntoTail", "([Ljava/lang/Object;ILjava/lang/Object;)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;", "elementCarry", "insertIntoRoot", "([Ljava/lang/Object;IILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)[Ljava/lang/Object;", "", "elements", "rightShift", "nullBuffers", "nextBuffer", "(Ljava/util/Collection;II[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "startLeafIndex", "shiftLeafBuffers", "(II[[Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;", "startBuffer", "startBufferSize", "splitToBuffers", "(Ljava/util/Collection;I[Ljava/lang/Object;I[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "bufferFor", "(I)[Ljava/lang/Object;", "removeFromTailAt", "([Ljava/lang/Object;III)Ljava/lang/Object;", "tailCarry", "removeFromRootAt", "([Ljava/lang/Object;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)[Ljava/lang/Object;", "pullLastBufferFromRoot", "([Ljava/lang/Object;II)V", "pullLastBuffer", "Lkotlin/Function1;", "predicate", "removeAll", "retainFirst", "nullifyAfter", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "bufferRef", "removeAllFromTail", "bufferSize", "(Lv3/l;[Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)I", "toBufferSize", "", "recyclableBuffers", "recyclableRemoveAll", "(Lv3/l;[Ljava/lang/Object;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;Ljava/util/List;Ljava/util/List;)I", "e", "oldElementCarry", "setInRoot", "", "leafBufferIterator", "getModCount$runtime_release", "()I", "getModCount", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "build", "add", "(Ljava/lang/Object;)Z", "addAll", "(ILjava/lang/Object;)V", "get", "(I)Ljava/lang/Object;", "removeAt", "removeAllWithPredicate", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "", "iterator", "", "listIterator", "vector", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "vectorRoot", "[Ljava/lang/Object;", "vectorTail", "rootShift", "I", "getRootShift$runtime_release", "setRootShift$runtime_release", "(I)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "ownership", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "<set-?>", "getRoot$runtime_release", "getTail$runtime_release", "getSize", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;[Ljava/lang/Object;[Ljava/lang/Object;I)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nPersistentVectorBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentVectorBuilder.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,991:1\n1#2:992\n26#3:993\n*S KotlinDebug\n*F\n+ 1 PersistentVectorBuilder.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder\n*L\n622#1:993\n*E\n"})
/* loaded from: classes.dex */
public final class PersistentVectorBuilder<E> extends f<E> implements PersistentList.Builder<E> {
    public static final int $stable = 8;

    @l
    private MutabilityOwnership ownership = new MutabilityOwnership();

    @m
    private Object[] root;
    private int rootShift;
    private int size;

    @l
    private Object[] tail;

    @l
    private PersistentList<? extends E> vector;

    @m
    private Object[] vectorRoot;

    @l
    private Object[] vectorTail;

    public PersistentVectorBuilder(@l PersistentList<? extends E> persistentList, @m Object[] objArr, @l Object[] objArr2, int i5) {
        this.vector = persistentList;
        this.vectorRoot = objArr;
        this.vectorTail = objArr2;
        this.rootShift = i5;
        this.root = this.vectorRoot;
        this.tail = this.vectorTail;
        this.size = this.vector.size();
    }

    private final Object[] bufferFor(int i5) {
        if (rootSize() <= i5) {
            return this.tail;
        }
        Object[] objArr = this.root;
        l0.m(objArr);
        for (int i6 = this.rootShift; i6 > 0; i6 -= 5) {
            Object[] objArr2 = objArr[UtilsKt.indexSegment(i5, i6)];
            l0.n(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] copyToBuffer(Object[] objArr, int i5, Iterator<? extends Object> it) {
        while (i5 < 32 && it.hasNext()) {
            objArr[i5] = it.next();
            i5++;
        }
        return objArr;
    }

    private final Object[] insertIntoRoot(Object[] objArr, int i5, int i6, Object obj, ObjectRef objectRef) {
        Object obj2;
        Object[] B0;
        int indexSegment = UtilsKt.indexSegment(i6, i5);
        if (i5 == 0) {
            objectRef.setValue(objArr[31]);
            B0 = o.B0(objArr, makeMutable(objArr), indexSegment + 1, indexSegment, 31);
            B0[indexSegment] = obj;
            return B0;
        }
        Object[] makeMutable = makeMutable(objArr);
        int i7 = i5 - 5;
        Object obj3 = makeMutable[indexSegment];
        l0.n(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        makeMutable[indexSegment] = insertIntoRoot((Object[]) obj3, i7, i6, obj, objectRef);
        while (true) {
            indexSegment++;
            if (indexSegment >= 32 || (obj2 = makeMutable[indexSegment]) == null) {
                break;
            }
            l0.n(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            makeMutable[indexSegment] = insertIntoRoot((Object[]) obj2, i7, 0, objectRef.getValue(), objectRef);
        }
        return makeMutable;
    }

    private final void insertIntoTail(Object[] objArr, int i5, E e5) {
        int tailSize = tailSize();
        Object[] makeMutable = makeMutable(this.tail);
        if (tailSize < 32) {
            o.B0(this.tail, makeMutable, i5 + 1, i5, tailSize);
            makeMutable[i5] = e5;
            this.root = objArr;
            this.tail = makeMutable;
            this.size = size() + 1;
            return;
        }
        Object[] objArr2 = this.tail;
        Object obj = objArr2[31];
        o.B0(objArr2, makeMutable, i5 + 1, i5, 31);
        makeMutable[i5] = e5;
        pushFilledTail(objArr, makeMutable, mutableBufferWith(obj));
    }

    private final boolean isMutable(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.ownership;
    }

    private final ListIterator<Object[]> leafBufferIterator(int i5) {
        Object[] objArr = this.root;
        if (objArr != null) {
            int rootSize = rootSize() >> 5;
            ListImplementation.checkPositionIndex$runtime_release(i5, rootSize);
            int i6 = this.rootShift;
            if (i6 == 0) {
                return new SingleElementListIterator(objArr, i5);
            }
            return new TrieIterator(objArr, i5, rootSize, i6 / 5);
        }
        throw new IllegalStateException("Invalid root".toString());
    }

    private final Object[] makeMutable(Object[] objArr) {
        int B;
        Object[] K0;
        if (objArr == null) {
            return mutableBuffer();
        }
        if (isMutable(objArr)) {
            return objArr;
        }
        Object[] mutableBuffer = mutableBuffer();
        B = u.B(objArr.length, 32);
        K0 = o.K0(objArr, mutableBuffer, 0, 0, B, 6, null);
        return K0;
    }

    private final Object[] makeMutableShiftingRight(Object[] objArr, int i5) {
        Object[] B0;
        Object[] B02;
        if (isMutable(objArr)) {
            B02 = o.B0(objArr, objArr, i5, 0, 32 - i5);
            return B02;
        }
        B0 = o.B0(objArr, mutableBuffer(), i5, 0, 32 - i5);
        return B0;
    }

    private final Object[] mutableBuffer() {
        Object[] objArr = new Object[33];
        objArr[32] = this.ownership;
        return objArr;
    }

    private final Object[] mutableBufferWith(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.ownership;
        return objArr;
    }

    private final Object[] nullifyAfter(Object[] objArr, int i5, int i6) {
        boolean z4;
        if (i6 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (i6 == 0) {
                return objArr;
            }
            int indexSegment = UtilsKt.indexSegment(i5, i6);
            Object obj = objArr[indexSegment];
            l0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            Object nullifyAfter = nullifyAfter((Object[]) obj, i5, i6 - 5);
            if (indexSegment < 31) {
                int i7 = indexSegment + 1;
                if (objArr[i7] != null) {
                    if (isMutable(objArr)) {
                        o.M1(objArr, null, i7, 32);
                    }
                    objArr = o.B0(objArr, mutableBuffer(), 0, 0, i7);
                }
            }
            if (nullifyAfter != objArr[indexSegment]) {
                Object[] makeMutable = makeMutable(objArr);
                makeMutable[indexSegment] = nullifyAfter;
                return makeMutable;
            }
            return objArr;
        }
        throw new IllegalArgumentException("shift should be positive".toString());
    }

    private final Object[] pullLastBuffer(Object[] objArr, int i5, int i6, ObjectRef objectRef) {
        Object[] pullLastBuffer;
        int indexSegment = UtilsKt.indexSegment(i6 - 1, i5);
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
        Object[] makeMutable = makeMutable(objArr);
        makeMutable[indexSegment] = pullLastBuffer;
        return makeMutable;
    }

    private final void pullLastBufferFromRoot(Object[] objArr, int i5, int i6) {
        if (i6 == 0) {
            this.root = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.tail = objArr;
            this.size = i5;
            this.rootShift = i6;
            return;
        }
        ObjectRef objectRef = new ObjectRef(null);
        l0.m(objArr);
        Object[] pullLastBuffer = pullLastBuffer(objArr, i6, i5, objectRef);
        l0.m(pullLastBuffer);
        Object value = objectRef.getValue();
        l0.n(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.tail = (Object[]) value;
        this.size = i5;
        if (pullLastBuffer[1] == null) {
            this.root = (Object[]) pullLastBuffer[0];
            this.rootShift = i6 - 5;
        } else {
            this.root = pullLastBuffer;
            this.rootShift = i6;
        }
    }

    private final Object[] pushBuffers(Object[] objArr, int i5, int i6, Iterator<Object[]> it) {
        boolean z4;
        if (it.hasNext()) {
            if (i6 >= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                if (i6 == 0) {
                    return it.next();
                }
                Object[] makeMutable = makeMutable(objArr);
                int indexSegment = UtilsKt.indexSegment(i5, i6);
                int i7 = i6 - 5;
                makeMutable[indexSegment] = pushBuffers((Object[]) makeMutable[indexSegment], i5, i7, it);
                while (true) {
                    indexSegment++;
                    if (indexSegment >= 32 || !it.hasNext()) {
                        break;
                    }
                    makeMutable[indexSegment] = pushBuffers((Object[]) makeMutable[indexSegment], 0, i7, it);
                }
                return makeMutable;
            }
            throw new IllegalArgumentException("negative shift".toString());
        }
        throw new IllegalArgumentException("invalid buffersIterator".toString());
    }

    private final Object[] pushBuffersIncreasingHeightIfNeeded(Object[] objArr, int i5, Object[][] objArr2) {
        Object[] makeMutable;
        Iterator<Object[]> a5 = i.a(objArr2);
        int i6 = i5 >> 5;
        int i7 = this.rootShift;
        if (i6 < (1 << i7)) {
            makeMutable = pushBuffers(objArr, i5, i7, a5);
        } else {
            makeMutable = makeMutable(objArr);
        }
        while (a5.hasNext()) {
            this.rootShift += 5;
            makeMutable = mutableBufferWith(makeMutable);
            int i8 = this.rootShift;
            pushBuffers(makeMutable, 1 << i8, i8, a5);
        }
        return makeMutable;
    }

    private final void pushFilledTail(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i5 = this.rootShift;
        if (size > (1 << i5)) {
            this.root = pushTail(mutableBufferWith(objArr), objArr2, this.rootShift + 5);
            this.tail = objArr3;
            this.rootShift += 5;
            this.size = size() + 1;
            return;
        }
        if (objArr == null) {
            this.root = objArr2;
            this.tail = objArr3;
            this.size = size() + 1;
        } else {
            this.root = pushTail(objArr, objArr2, i5);
            this.tail = objArr3;
            this.size = size() + 1;
        }
    }

    private final Object[] pushTail(Object[] objArr, Object[] objArr2, int i5) {
        int indexSegment = UtilsKt.indexSegment(size() - 1, i5);
        Object[] makeMutable = makeMutable(objArr);
        if (i5 == 5) {
            makeMutable[indexSegment] = objArr2;
        } else {
            makeMutable[indexSegment] = pushTail((Object[]) makeMutable[indexSegment], objArr2, i5 - 5);
        }
        return makeMutable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int recyclableRemoveAll(v3.l<? super E, Boolean> lVar, Object[] objArr, int i5, int i6, ObjectRef objectRef, List<Object[]> list, List<Object[]> list2) {
        Object[] mutableBuffer;
        if (isMutable(objArr)) {
            list.add(objArr);
        }
        Object value = objectRef.getValue();
        l0.n(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) value;
        Object[] objArr3 = objArr2;
        for (int i7 = 0; i7 < i5; i7++) {
            Object obj = objArr[i7];
            if (!lVar.invoke(obj).booleanValue()) {
                if (i6 == 32) {
                    if (!list.isEmpty()) {
                        mutableBuffer = list.remove(list.size() - 1);
                    } else {
                        mutableBuffer = mutableBuffer();
                    }
                    objArr3 = mutableBuffer;
                    i6 = 0;
                }
                objArr3[i6] = obj;
                i6++;
            }
        }
        objectRef.setValue(objArr3);
        if (objArr2 != objectRef.getValue()) {
            list2.add(objArr2);
        }
        return i6;
    }

    private final int removeAllFromTail(v3.l<? super E, Boolean> lVar, int i5, ObjectRef objectRef) {
        boolean z4;
        int removeAll = removeAll(lVar, this.tail, i5, objectRef);
        if (removeAll == i5) {
            if (objectRef.getValue() == this.tail) {
                z4 = true;
            } else {
                z4 = false;
            }
            CommonFunctionsKt.m3350assert(z4);
            return i5;
        }
        Object value = objectRef.getValue();
        l0.n(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        o.M1(objArr, null, removeAll, i5);
        this.tail = objArr;
        this.size = size() - (i5 - removeAll);
        return removeAll;
    }

    private final Object[] removeFromRootAt(Object[] objArr, int i5, int i6, ObjectRef objectRef) {
        Object[] B0;
        int indexSegment = UtilsKt.indexSegment(i6, i5);
        int i7 = 31;
        if (i5 == 0) {
            Object obj = objArr[indexSegment];
            B0 = o.B0(objArr, makeMutable(objArr), indexSegment, indexSegment + 1, 32);
            B0[31] = objectRef.getValue();
            objectRef.setValue(obj);
            return B0;
        }
        if (objArr[31] == null) {
            i7 = UtilsKt.indexSegment(rootSize() - 1, i5);
        }
        Object[] makeMutable = makeMutable(objArr);
        int i8 = i5 - 5;
        int i9 = indexSegment + 1;
        if (i9 <= i7) {
            while (true) {
                Object obj2 = makeMutable[i7];
                l0.n(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                makeMutable[i7] = removeFromRootAt((Object[]) obj2, i8, 0, objectRef);
                if (i7 == i9) {
                    break;
                }
                i7--;
            }
        }
        Object obj3 = makeMutable[indexSegment];
        l0.n(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        makeMutable[indexSegment] = removeFromRootAt((Object[]) obj3, i8, i6, objectRef);
        return makeMutable;
    }

    private final Object removeFromTailAt(Object[] objArr, int i5, int i6, int i7) {
        boolean z4;
        Object[] B0;
        int size = size() - i5;
        if (i7 < size) {
            z4 = true;
        } else {
            z4 = false;
        }
        CommonFunctionsKt.m3350assert(z4);
        if (size == 1) {
            Object obj = this.tail[0];
            pullLastBufferFromRoot(objArr, i5, i6);
            return obj;
        }
        Object[] objArr2 = this.tail;
        Object obj2 = objArr2[i7];
        B0 = o.B0(objArr2, makeMutable(objArr2), i7, i7 + 1, size);
        B0[size - 1] = null;
        this.root = objArr;
        this.tail = B0;
        this.size = (i5 + size) - 1;
        this.rootShift = i6;
        return obj2;
    }

    private final Object[] retainFirst(Object[] objArr, int i5) {
        boolean z4;
        if ((i5 & 31) == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (i5 == 0) {
                this.rootShift = 0;
                return null;
            }
            int i6 = i5 - 1;
            while (true) {
                int i7 = this.rootShift;
                if ((i6 >> i7) == 0) {
                    this.rootShift = i7 - 5;
                    Object[] objArr2 = objArr[0];
                    l0.n(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArr = objArr2;
                } else {
                    return nullifyAfter(objArr, i6, i7);
                }
            }
        } else {
            throw new IllegalArgumentException("invalid size".toString());
        }
    }

    private final int rootSize() {
        if (size() <= 32) {
            return 0;
        }
        return UtilsKt.rootSize(size());
    }

    private final Object[] setInRoot(Object[] objArr, int i5, int i6, E e5, ObjectRef objectRef) {
        int indexSegment = UtilsKt.indexSegment(i6, i5);
        Object[] makeMutable = makeMutable(objArr);
        if (i5 == 0) {
            if (makeMutable != objArr) {
                ((AbstractList) this).modCount++;
            }
            objectRef.setValue(makeMutable[indexSegment]);
            makeMutable[indexSegment] = e5;
            return makeMutable;
        }
        Object obj = makeMutable[indexSegment];
        l0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        makeMutable[indexSegment] = setInRoot((Object[]) obj, i5 - 5, i6, e5, objectRef);
        return makeMutable;
    }

    private final Object[] shiftLeafBuffers(int i5, int i6, Object[][] objArr, int i7, Object[] objArr2) {
        if (this.root != null) {
            ListIterator<Object[]> leafBufferIterator = leafBufferIterator(rootSize() >> 5);
            while (leafBufferIterator.previousIndex() != i5) {
                Object[] previous = leafBufferIterator.previous();
                o.B0(previous, objArr2, 0, 32 - i6, 32);
                objArr2 = makeMutableShiftingRight(previous, i6);
                i7--;
                objArr[i7] = objArr2;
            }
            return leafBufferIterator.previous();
        }
        throw new IllegalStateException("root is null".toString());
    }

    private final void splitToBuffers(Collection<? extends E> collection, int i5, Object[] objArr, int i6, Object[][] objArr2, int i7, Object[] objArr3) {
        boolean z4;
        Object[] mutableBuffer;
        if (i7 >= 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            Object[] makeMutable = makeMutable(objArr);
            objArr2[0] = makeMutable;
            int i8 = i5 & 31;
            int size = ((i5 + collection.size()) - 1) & 31;
            int i9 = (i6 - i8) + size;
            if (i9 < 32) {
                o.B0(makeMutable, objArr3, size + 1, i8, i6);
            } else {
                int i10 = (i9 - 32) + 1;
                if (i7 == 1) {
                    mutableBuffer = makeMutable;
                } else {
                    mutableBuffer = mutableBuffer();
                    i7--;
                    objArr2[i7] = mutableBuffer;
                }
                int i11 = i6 - i10;
                o.B0(makeMutable, objArr3, 0, i11, i6);
                o.B0(makeMutable, mutableBuffer, size + 1, i8, i11);
                objArr3 = mutableBuffer;
            }
            Iterator<? extends E> it = collection.iterator();
            copyToBuffer(makeMutable, i8, it);
            for (int i12 = 1; i12 < i7; i12++) {
                objArr2[i12] = copyToBuffer(mutableBuffer(), 0, it);
            }
            copyToBuffer(objArr3, 0, it);
            return;
        }
        throw new IllegalArgumentException("requires at least one nullBuffer".toString());
    }

    private final int tailSize(int i5) {
        return i5 <= 32 ? i5 : i5 - UtilsKt.rootSize(i5);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e5) {
        ((AbstractList) this).modCount++;
        int tailSize = tailSize();
        if (tailSize < 32) {
            Object[] makeMutable = makeMutable(this.tail);
            makeMutable[tailSize] = e5;
            this.tail = makeMutable;
            this.size = size() + 1;
        } else {
            pushFilledTail(this.root, this.tail, mutableBufferWith(e5));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@l Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int tailSize = tailSize();
        Iterator<? extends E> it = collection.iterator();
        if (32 - tailSize >= collection.size()) {
            this.tail = copyToBuffer(makeMutable(this.tail), tailSize, it);
            this.size = size() + collection.size();
        } else {
            int size = ((collection.size() + tailSize) - 1) / 32;
            Object[][] objArr = new Object[size];
            objArr[0] = copyToBuffer(makeMutable(this.tail), tailSize, it);
            for (int i5 = 1; i5 < size; i5++) {
                objArr[i5] = copyToBuffer(mutableBuffer(), 0, it);
            }
            this.root = pushBuffersIncreasingHeightIfNeeded(this.root, rootSize(), objArr);
            this.tail = copyToBuffer(mutableBuffer(), 0, it);
            this.size = size() + collection.size();
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i5) {
        ListImplementation.checkElementIndex$runtime_release(i5, size());
        return (E) bufferFor(i5)[i5 & 31];
    }

    public final int getModCount$runtime_release() {
        return ((AbstractList) this).modCount;
    }

    @m
    public final Object[] getRoot$runtime_release() {
        return this.root;
    }

    public final int getRootShift$runtime_release() {
        return this.rootShift;
    }

    @Override // kotlin.collections.f
    public int getSize() {
        return this.size;
    }

    @l
    public final Object[] getTail$runtime_release() {
        return this.tail;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @l
    public Iterator<E> iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    @l
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@l Collection<? extends Object> collection) {
        return removeAllWithPredicate(new PersistentVectorBuilder$removeAll$1(collection));
    }

    public final boolean removeAllWithPredicate(@l v3.l<? super E, Boolean> lVar) {
        boolean removeAll = removeAll(lVar);
        if (removeAll) {
            ((AbstractList) this).modCount++;
        }
        return removeAll;
    }

    @Override // kotlin.collections.f
    public E removeAt(int i5) {
        ListImplementation.checkElementIndex$runtime_release(i5, size());
        ((AbstractList) this).modCount++;
        int rootSize = rootSize();
        if (i5 >= rootSize) {
            return (E) removeFromTailAt(this.root, rootSize, this.rootShift, i5 - rootSize);
        }
        ObjectRef objectRef = new ObjectRef(this.tail[0]);
        Object[] objArr = this.root;
        l0.m(objArr);
        removeFromTailAt(removeFromRootAt(objArr, this.rootShift, i5, objectRef), rootSize, this.rootShift, 0);
        return (E) objectRef.getValue();
    }

    @Override // kotlin.collections.f, java.util.AbstractList, java.util.List
    public E set(int i5, E e5) {
        ListImplementation.checkElementIndex$runtime_release(i5, size());
        if (rootSize() <= i5) {
            Object[] makeMutable = makeMutable(this.tail);
            if (makeMutable != this.tail) {
                ((AbstractList) this).modCount++;
            }
            int i6 = i5 & 31;
            E e6 = (E) makeMutable[i6];
            makeMutable[i6] = e5;
            this.tail = makeMutable;
            return e6;
        }
        ObjectRef objectRef = new ObjectRef(null);
        Object[] objArr = this.root;
        l0.m(objArr);
        this.root = setInRoot(objArr, this.rootShift, i5, e5, objectRef);
        return (E) objectRef.getValue();
    }

    public final void setRootShift$runtime_release(int i5) {
        this.rootShift = i5;
    }

    private final boolean removeAll(v3.l<? super E, Boolean> lVar) {
        Object[] pushBuffers;
        int tailSize = tailSize();
        ObjectRef objectRef = new ObjectRef(null);
        if (this.root == null) {
            return removeAllFromTail(lVar, tailSize, objectRef) != tailSize;
        }
        ListIterator<Object[]> leafBufferIterator = leafBufferIterator(0);
        int i5 = 32;
        while (i5 == 32 && leafBufferIterator.hasNext()) {
            i5 = removeAll(lVar, leafBufferIterator.next(), 32, objectRef);
        }
        if (i5 == 32) {
            CommonFunctionsKt.m3350assert(!leafBufferIterator.hasNext());
            int removeAllFromTail = removeAllFromTail(lVar, tailSize, objectRef);
            if (removeAllFromTail == 0) {
                pullLastBufferFromRoot(this.root, size(), this.rootShift);
            }
            return removeAllFromTail != tailSize;
        }
        int previousIndex = leafBufferIterator.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i6 = i5;
        while (leafBufferIterator.hasNext()) {
            i6 = recyclableRemoveAll(lVar, leafBufferIterator.next(), 32, i6, objectRef, arrayList2, arrayList);
            previousIndex = previousIndex;
        }
        int i7 = previousIndex;
        int recyclableRemoveAll = recyclableRemoveAll(lVar, this.tail, tailSize, i6, objectRef, arrayList2, arrayList);
        Object value = objectRef.getValue();
        l0.n(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        o.M1(objArr, null, recyclableRemoveAll, 32);
        if (arrayList.isEmpty()) {
            pushBuffers = this.root;
            l0.m(pushBuffers);
        } else {
            pushBuffers = pushBuffers(this.root, i7, this.rootShift, arrayList.iterator());
        }
        int size = i7 + (arrayList.size() << 5);
        this.root = retainFirst(pushBuffers, size);
        this.tail = objArr;
        this.size = size + recyclableRemoveAll;
        return true;
    }

    private final int tailSize() {
        return tailSize(size());
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder
    @l
    public PersistentList<E> build() {
        PersistentVector persistentVector;
        if (this.root == this.vectorRoot && this.tail == this.vectorTail) {
            persistentVector = this.vector;
        } else {
            this.ownership = new MutabilityOwnership();
            Object[] objArr = this.root;
            this.vectorRoot = objArr;
            Object[] objArr2 = this.tail;
            this.vectorTail = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    persistentVector = UtilsKt.persistentVectorOf();
                } else {
                    Object[] copyOf = Arrays.copyOf(this.tail, size());
                    l0.o(copyOf, "copyOf(this, newSize)");
                    persistentVector = new SmallPersistentVector(copyOf);
                }
            } else {
                Object[] objArr3 = this.root;
                l0.m(objArr3);
                persistentVector = new PersistentVector(objArr3, this.tail, size(), this.rootShift);
            }
        }
        this.vector = persistentVector;
        return (PersistentList<E>) persistentVector;
    }

    @Override // java.util.AbstractList, java.util.List
    @l
    public ListIterator<E> listIterator(int i5) {
        ListImplementation.checkPositionIndex$runtime_release(i5, size());
        return new PersistentVectorMutableIterator(this, i5);
    }

    private final void insertIntoRoot(Collection<? extends E> collection, int i5, int i6, Object[][] objArr, int i7, Object[] objArr2) {
        if (this.root != null) {
            int i8 = i5 >> 5;
            Object[] shiftLeafBuffers = shiftLeafBuffers(i8, i6, objArr, i7, objArr2);
            int rootSize = i7 - (((rootSize() >> 5) - 1) - i8);
            if (rootSize < i7) {
                objArr2 = objArr[rootSize];
                l0.m(objArr2);
            }
            splitToBuffers(collection, i5, shiftLeafBuffers, 32, objArr, rootSize, objArr2);
            return;
        }
        throw new IllegalStateException("root is null".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.f, java.util.AbstractList, java.util.List
    public void add(int i5, E e5) {
        ListImplementation.checkPositionIndex$runtime_release(i5, size());
        if (i5 == size()) {
            add(e5);
            return;
        }
        ((AbstractList) this).modCount++;
        int rootSize = rootSize();
        if (i5 >= rootSize) {
            insertIntoTail(this.root, i5 - rootSize, e5);
            return;
        }
        ObjectRef objectRef = new ObjectRef(null);
        Object[] objArr = this.root;
        l0.m(objArr);
        insertIntoTail(insertIntoRoot(objArr, this.rootShift, i5, e5, objectRef), 0, objectRef.getValue());
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i5, @l Collection<? extends E> collection) {
        Object[] B0;
        Object[] B02;
        ListImplementation.checkPositionIndex$runtime_release(i5, size());
        if (i5 == size()) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i6 = (i5 >> 5) << 5;
        int size = (((size() - i6) + collection.size()) - 1) / 32;
        if (size == 0) {
            CommonFunctionsKt.m3350assert(i5 >= rootSize());
            int i7 = i5 & 31;
            int size2 = ((i5 + collection.size()) - 1) & 31;
            Object[] objArr = this.tail;
            B02 = o.B0(objArr, makeMutable(objArr), size2 + 1, i7, tailSize());
            copyToBuffer(B02, i7, collection.iterator());
            this.tail = B02;
            this.size = size() + collection.size();
            return true;
        }
        Object[][] objArr2 = new Object[size];
        int tailSize = tailSize();
        int tailSize2 = tailSize(size() + collection.size());
        if (i5 >= rootSize()) {
            B0 = mutableBuffer();
            splitToBuffers(collection, i5, this.tail, tailSize, objArr2, size, B0);
        } else if (tailSize2 > tailSize) {
            int i8 = tailSize2 - tailSize;
            B0 = makeMutableShiftingRight(this.tail, i8);
            insertIntoRoot(collection, i5, i8, objArr2, size, B0);
        } else {
            int i9 = tailSize - tailSize2;
            B0 = o.B0(this.tail, mutableBuffer(), 0, i9, tailSize);
            int i10 = 32 - i9;
            Object[] makeMutableShiftingRight = makeMutableShiftingRight(this.tail, i10);
            int i11 = size - 1;
            objArr2[i11] = makeMutableShiftingRight;
            insertIntoRoot(collection, i5, i10, objArr2, i11, makeMutableShiftingRight);
        }
        this.root = pushBuffersIncreasingHeightIfNeeded(this.root, i6, objArr2);
        this.tail = B0;
        this.size = size() + collection.size();
        return true;
    }

    private final int removeAll(v3.l<? super E, Boolean> lVar, Object[] objArr, int i5, ObjectRef objectRef) {
        Object[] objArr2 = objArr;
        int i6 = i5;
        boolean z4 = false;
        for (int i7 = 0; i7 < i5; i7++) {
            Object obj = objArr[i7];
            if (lVar.invoke(obj).booleanValue()) {
                if (!z4) {
                    objArr2 = makeMutable(objArr);
                    z4 = true;
                    i6 = i7;
                }
            } else if (z4) {
                objArr2[i6] = obj;
                i6++;
            }
        }
        objectRef.setValue(objArr2);
        return i6;
    }
}
