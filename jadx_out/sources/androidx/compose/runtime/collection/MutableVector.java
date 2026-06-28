package androidx.compose.runtime.collection;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.a1;
import kotlin.collections.o;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.v;
import kotlin.r2;
import kotlin.y;
import p4.l;
import p4.m;
import v3.p;
import v3.q;
import w3.e;
import w3.f;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u0003vwxB!\b\u0001\u0012\u000e\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000f\u0012\u0006\u0010j\u001a\u00020\b¢\u0006\u0004\bt\u0010uJ\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u0006\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u000bJ\u001c\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fJ\u001c\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0017\u0010\u000e\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0086\bJ\u0017\u0010\u000e\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086\bJ\u001b\u0010\u000e\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u000e\u0010\u0010J\u001c\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J\u0014\u0010\u000e\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J(\u0010\u0014\u001a\u00020\u00052\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0012H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J(\u0010\u0015\u001a\u00020\u00052\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0012H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016J\u0006\u0010\u0018\u001a\u00020\nJ\u0018\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u0007J\u0014\u0010\u001a\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fJ\u0014\u0010\u001a\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J\u0014\u0010\u001a\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0014\u0010\u001c\u001a\u00020\u00052\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u000e\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\bJ\r\u0010\u001f\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010 J/\u0010\u001f\u001a\u00028\u00002\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0012H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u001f\u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0004\b\"\u0010 J1\u0010\"\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0012H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\"\u0010!JR\u0010*\u001a\u00028\u0001\"\u0004\b\u0001\u0010#2\u0006\u0010$\u001a\u00028\u00012'\u0010)\u001a#\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b*\u0010+Jg\u0010-\u001a\u00028\u0001\"\u0004\b\u0001\u0010#2\u0006\u0010$\u001a\u00028\u00012<\u0010)\u001a8\u0012\u0013\u0012\u00110\b¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010,H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b-\u0010.JR\u0010/\u001a\u00028\u0001\"\u0004\b\u0001\u0010#2\u0006\u0010$\u001a\u00028\u00012'\u0010)\u001a#\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00028\u00010%H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b/\u0010+Jg\u00100\u001a\u00028\u0001\"\u0004\b\u0001\u0010#2\u0006\u0010$\u001a\u00028\u00012<\u0010)\u001a8\u0012\u0013\u0012\u00110\b¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00028\u00010,H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b0\u0010.J(\u00102\u001a\u00020\n2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u0012H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J.\u00103\u001a\u00020\n2\u0018\u00101\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0%H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J(\u00104\u001a\u00020\n2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u0012H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J.\u00105\u001a\u00020\n2\u0018\u00101\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0%H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0018\u00106\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH\u0086\n¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b8\u00109J(\u0010:\u001a\u00020\b2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0012H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J(\u0010;\u001a\u00020\b2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0012H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0006\u0010<\u001a\u00020\u0005J\u0006\u0010=\u001a\u00020\u0005J\r\u0010>\u001a\u00028\u0000¢\u0006\u0004\b>\u0010 J/\u0010>\u001a\u00028\u00002\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0012H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b>\u0010!J\u0015\u0010?\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b?\u00109J\u0012\u0010@\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0004\b@\u0010 J1\u0010@\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0012H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b@\u0010!J=\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f\"\u0006\b\u0001\u0010#\u0018\u00012\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bB\u0010CJR\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f\"\u0006\b\u0001\u0010#\u0018\u00012'\u0010A\u001a#\u0012\u0013\u0012\u00110\b¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bD\u0010EJM\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0006\b\u0001\u0010#\u0018\u00012)\u0010A\u001a%\u0012\u0013\u0012\u00110\b¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010%H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J8\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0006\b\u0001\u0010#\u0018\u00012\u0014\u0010A\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0012H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0018\u0010H\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\bH\u0010IJ\u0018\u0010J\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\bJ\u0010IJ\u0015\u0010K\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\bK\u0010\u0007J\u0014\u0010L\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fJ\u0014\u0010L\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0014\u0010L\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J\u0015\u0010M\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bM\u00107J\u0016\u0010P\u001a\u00020\n2\u0006\u0010N\u001a\u00020\b2\u0006\u0010O\u001a\u00020\bJ\u0010\u0010R\u001a\u00020\n2\u0006\u0010Q\u001a\u00020\bH\u0001J\u001d\u0010S\u001a\u00020\n2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0012H\u0086\bJ\u0014\u0010T\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J \u0010U\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\bU\u0010VJ\u001e\u0010Z\u001a\u00020\n2\u0016\u0010Y\u001a\u0012\u0012\u0004\u0012\u00028\u00000Wj\b\u0012\u0004\u0012\u00028\u0000`XJ(\u0010\\\u001a\u00020\b2\u0012\u0010[\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0012H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\b\u0010^\u001a\u00020]H\u0001R0\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b_\u0010`\u0012\u0004\be\u0010f\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u001e\u0010g\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR$\u0010j\u001a\u00020\b2\u0006\u0010i\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR\u0012\u0010o\u001a\u00020\b8Æ\u0002¢\u0006\u0006\u001a\u0004\bn\u0010mR\u0012\u0010s\u001a\u00020p8Æ\u0002¢\u0006\u0006\u001a\u0004\bq\u0010r¨\u0006y"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector;", "T", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "element", "", "add", "(Ljava/lang/Object;)Z", "", "index", "Lkotlin/r2;", "(ILjava/lang/Object;)V", "", "elements", "addAll", "", "([Ljava/lang/Object;)Z", "", "Lkotlin/Function1;", "predicate", "any", "reversedAny", "", "asMutableList", "clear", "contains", "containsAll", "other", "contentEquals", "capacity", "ensureCapacity", "first", "()Ljava/lang/Object;", "(Lv3/l;)Ljava/lang/Object;", "firstOrNull", "R", "initial", "Lkotlin/Function2;", "Lkotlin/v0;", "name", "acc", "operation", "fold", "(Ljava/lang/Object;Lv3/p;)Ljava/lang/Object;", "Lkotlin/Function3;", "foldIndexed", "(Ljava/lang/Object;Lv3/q;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "block", "forEach", "forEachIndexed", "forEachReversed", "forEachReversedIndexed", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "indexOfFirst", "indexOfLast", "isEmpty", "isNotEmpty", "last", "lastIndexOf", "lastOrNull", "transform", "map", "(Lv3/l;)[Ljava/lang/Object;", "mapIndexed", "(Lv3/p;)[Ljava/lang/Object;", "mapIndexedNotNull", "mapNotNull", "plusAssign", "(Ljava/lang/Object;)V", "minusAssign", "remove", "removeAll", "removeAt", "start", "end", "removeRange", "newSize", "setSize", "removeIf", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "sortWith", "selector", "sumBy", "", "throwNoSuchElementException", "content", "[Ljava/lang/Object;", "getContent", "()[Ljava/lang/Object;", "setContent", "([Ljava/lang/Object;)V", "getContent$annotations", "()V", "list", "Ljava/util/List;", "<set-?>", "size", "I", "getSize", "()I", "getLastIndex", "lastIndex", "Lkotlin/ranges/l;", "getIndices", "()Lkotlin/ranges/l;", "indices", "<init>", "([Ljava/lang/Object;I)V", "MutableVectorList", "SubList", "VectorListIterator", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1220:1\n48#1:1224\n48#1:1225\n523#1:1226\n53#1:1229\n523#1:1230\n48#1:1231\n523#1:1232\n523#1:1233\n523#1:1234\n48#1:1235\n523#1:1236\n48#1:1237\n523#1:1238\n523#1:1239\n523#1:1240\n48#1:1241\n523#1:1242\n48#1:1245\n48#1:1246\n48#1:1247\n523#1:1248\n1864#2,3:1221\n1855#2,2:1227\n1855#2,2:1243\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n249#1:1224\n259#1:1225\n260#1:1226\n292#1:1229\n293#1:1230\n307#1:1231\n308#1:1232\n334#1:1233\n359#1:1234\n595#1:1235\n595#1:1236\n637#1:1237\n637#1:1238\n665#1:1239\n675#1:1240\n768#1:1241\n769#1:1242\n794#1:1245\n821#1:1246\n859#1:1247\n860#1:1248\n185#1:1221,3\n281#1:1227,2\n782#1:1243,2\n*E\n"})
/* loaded from: classes.dex */
public final class MutableVector<T> implements RandomAccess {
    public static final int $stable = 8;

    @l
    private T[] content;

    @m
    private List<T> list;
    private int size;

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010+\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00010$¢\u0006\u0004\b*\u0010+J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0018\u0010\f\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0096\u0002J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0006J\u001f\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0016J\u001e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0016\u0010\u0017\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0019H\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u0006J\u0016\u0010\u001c\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0017\u0010\u001d\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\rJ\u0016\u0010\u001e\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J \u0010\u001f\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\nH\u0016R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00010$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector$MutableVectorList;", "T", "", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "", "iterator", "lastIndexOf", "add", "Lkotlin/r2;", "(ILjava/lang/Object;)V", "addAll", "clear", "", "listIterator", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "Landroidx/compose/runtime/collection/MutableVector;", "vector", "Landroidx/compose/runtime/collection/MutableVector;", "getSize", "()I", "size", "<init>", "(Landroidx/compose/runtime/collection/MutableVector;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$MutableVectorList\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1220:1\n523#2:1221\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$MutableVectorList\n*L\n967#1:1221\n*E\n"})
    /* loaded from: classes.dex */
    public static final class MutableVectorList<T> implements List<T>, e {

        @l
        private final MutableVector<T> vector;

        public MutableVectorList(@l MutableVector<T> mutableVector) {
            this.vector = mutableVector;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t5) {
            return this.vector.add(t5);
        }

        @Override // java.util.List
        public boolean addAll(int i5, @l Collection<? extends T> collection) {
            return this.vector.addAll(i5, collection);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.vector.clear();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.vector.contains(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@l Collection<? extends Object> collection) {
            return this.vector.containsAll(collection);
        }

        @Override // java.util.List
        public T get(int i5) {
            MutableVectorKt.checkIndex(this, i5);
            return this.vector.getContent()[i5];
        }

        public int getSize() {
            return this.vector.getSize();
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.vector.indexOf(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.vector.isEmpty();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @l
        public Iterator<T> iterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.vector.lastIndexOf(obj);
        }

        @Override // java.util.List
        @l
        public ListIterator<T> listIterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i5) {
            return removeAt(i5);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(@l Collection<? extends Object> collection) {
            return this.vector.removeAll(collection);
        }

        public T removeAt(int i5) {
            MutableVectorKt.checkIndex(this, i5);
            return this.vector.removeAt(i5);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(@l Collection<? extends Object> collection) {
            return this.vector.retainAll(collection);
        }

        @Override // java.util.List
        public T set(int i5, T t5) {
            MutableVectorKt.checkIndex(this, i5);
            return this.vector.set(i5, t5);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        @l
        public List<T> subList(int i5, int i6) {
            MutableVectorKt.checkSubIndex(this, i5, i6);
            return new SubList(this, i5, i6);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return v.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) v.b(this, tArr);
        }

        @Override // java.util.List
        public void add(int i5, T t5) {
            this.vector.add(i5, t5);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(@l Collection<? extends T> collection) {
            return this.vector.addAll(collection);
        }

        @Override // java.util.List
        @l
        public ListIterator<T> listIterator(int i5) {
            return new VectorListIterator(this, i5);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.vector.remove(obj);
        }
    }

    @i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010+\n\u0002\b\u0015\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B%\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010&\u001a\u00020\n\u0012\u0006\u0010(\u001a\u00020\n¢\u0006\u0004\b,\u0010-J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0018\u0010\f\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0096\u0002J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0006J\u001f\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0016J\u001e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0016\u0010\u0017\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0019H\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u0006J\u0016\u0010\u001c\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0017\u0010\u001d\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\rJ\u0016\u0010\u001e\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J \u0010\u001f\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\nH\u0016R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010+\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Landroidx/compose/runtime/collection/MutableVector$SubList;", "T", "", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "", "iterator", "lastIndexOf", "add", "Lkotlin/r2;", "(ILjava/lang/Object;)V", "addAll", "clear", "", "listIterator", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "list", "Ljava/util/List;", "start", "I", "end", "getSize", "()I", "size", "<init>", "(Ljava/util/List;II)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1220:1\n1855#2,2:1221\n1855#2,2:1223\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$SubList\n*L\n1039#1:1221,2\n1121#1:1223,2\n*E\n"})
    /* loaded from: classes.dex */
    private static final class SubList<T> implements List<T>, e {
        private int end;

        @l
        private final List<T> list;
        private final int start;

        public SubList(@l List<T> list, int i5, int i6) {
            this.list = list;
            this.start = i5;
            this.end = i6;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t5) {
            List<T> list = this.list;
            int i5 = this.end;
            this.end = i5 + 1;
            list.add(i5, t5);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int i5, @l Collection<? extends T> collection) {
            this.list.addAll(i5 + this.start, collection);
            this.end += collection.size();
            return collection.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i5 = this.end - 1;
            int i6 = this.start;
            if (i6 <= i5) {
                while (true) {
                    this.list.remove(i5);
                    if (i5 == i6) {
                        break;
                    } else {
                        i5--;
                    }
                }
            }
            this.end = this.start;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i5 = this.end;
            for (int i6 = this.start; i6 < i5; i6++) {
                if (l0.g(this.list.get(i6), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@l Collection<? extends Object> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public T get(int i5) {
            MutableVectorKt.checkIndex(this, i5);
            return this.list.get(i5 + this.start);
        }

        public int getSize() {
            return this.end - this.start;
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i5 = this.end;
            for (int i6 = this.start; i6 < i5; i6++) {
                if (l0.g(this.list.get(i6), obj)) {
                    return i6 - this.start;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.end == this.start;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @l
        public Iterator<T> iterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i5 = this.end - 1;
            int i6 = this.start;
            if (i6 <= i5) {
                while (!l0.g(this.list.get(i5), obj)) {
                    if (i5 != i6) {
                        i5--;
                    } else {
                        return -1;
                    }
                }
                return i5 - this.start;
            }
            return -1;
        }

        @Override // java.util.List
        @l
        public ListIterator<T> listIterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i5) {
            return removeAt(i5);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(@l Collection<? extends Object> collection) {
            int i5 = this.end;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            if (i5 != this.end) {
                return true;
            }
            return false;
        }

        public T removeAt(int i5) {
            MutableVectorKt.checkIndex(this, i5);
            this.end--;
            return this.list.remove(i5 + this.start);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(@l Collection<? extends Object> collection) {
            int i5 = this.end;
            int i6 = i5 - 1;
            int i7 = this.start;
            if (i7 <= i6) {
                while (true) {
                    if (!collection.contains(this.list.get(i6))) {
                        this.list.remove(i6);
                        this.end--;
                    }
                    if (i6 == i7) {
                        break;
                    }
                    i6--;
                }
            }
            if (i5 != this.end) {
                return true;
            }
            return false;
        }

        @Override // java.util.List
        public T set(int i5, T t5) {
            MutableVectorKt.checkIndex(this, i5);
            return this.list.set(i5 + this.start, t5);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        @l
        public List<T> subList(int i5, int i6) {
            MutableVectorKt.checkSubIndex(this, i5, i6);
            return new SubList(this, i5, i6);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return v.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) v.b(this, tArr);
        }

        @Override // java.util.List
        public void add(int i5, T t5) {
            this.list.add(i5 + this.start, t5);
            this.end++;
        }

        @Override // java.util.List
        @l
        public ListIterator<T> listIterator(int i5) {
            return new VectorListIterator(this, i5);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i5 = this.end;
            for (int i6 = this.start; i6 < i5; i6++) {
                if (l0.g(this.list.get(i6), obj)) {
                    this.list.remove(i6);
                    this.end--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(@l Collection<? extends T> collection) {
            this.list.addAll(this.end, collection);
            this.end += collection.size();
            return collection.size() > 0;
        }
    }

    @i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001d\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\u0010\u0010\u0005\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u000f\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\f\u0010\u0006J\b\u0010\r\u001a\u00020\nH\u0016J\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector$VectorListIterator;", "T", "", "", "hasNext", "next", "()Ljava/lang/Object;", "Lkotlin/r2;", "remove", "hasPrevious", "", "nextIndex", "previous", "previousIndex", "element", "add", "(Ljava/lang/Object;)V", "set", "", "list", "Ljava/util/List;", "index", "I", "<init>", "(Ljava/util/List;I)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    private static final class VectorListIterator<T> implements ListIterator<T>, f {
        private int index;

        @l
        private final List<T> list;

        public VectorListIterator(@l List<T> list, int i5) {
            this.list = list;
            this.index = i5;
        }

        @Override // java.util.ListIterator
        public void add(T t5) {
            this.list.add(this.index, t5);
            this.index++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < this.list.size();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.list;
            int i5 = this.index;
            this.index = i5 + 1;
            return list.get(i5);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i5 = this.index - 1;
            this.index = i5;
            return this.list.get(i5);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i5 = this.index - 1;
            this.index = i5;
            this.list.remove(i5);
        }

        @Override // java.util.ListIterator
        public void set(T t5) {
            this.list.set(this.index, t5);
        }
    }

    @a1
    public MutableVector(@l T[] tArr, int i5) {
        this.content = tArr;
        this.size = i5;
    }

    @a1
    public static /* synthetic */ void getContent$annotations() {
    }

    public final boolean add(T t5) {
        ensureCapacity(this.size + 1);
        T[] tArr = this.content;
        int i5 = this.size;
        tArr[i5] = t5;
        this.size = i5 + 1;
        return true;
    }

    public final boolean addAll(int i5, @l List<? extends T> list) {
        if (list.isEmpty()) {
            return false;
        }
        ensureCapacity(this.size + list.size());
        T[] tArr = this.content;
        if (i5 != this.size) {
            o.B0(tArr, tArr, list.size() + i5, i5, this.size);
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            tArr[i5 + i6] = list.get(i6);
        }
        this.size += list.size();
        return true;
    }

    public final boolean any(@l v3.l<? super T, Boolean> lVar) {
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i5 = 0;
            while (!lVar.invoke(content[i5]).booleanValue()) {
                i5++;
                if (i5 >= size) {
                }
            }
            return true;
        }
        return false;
    }

    @l
    public final List<T> asMutableList() {
        List<T> list = this.list;
        if (list == null) {
            MutableVectorList mutableVectorList = new MutableVectorList(this);
            this.list = mutableVectorList;
            return mutableVectorList;
        }
        return list;
    }

    public final void clear() {
        T[] tArr = this.content;
        int size = getSize();
        while (true) {
            size--;
            if (-1 < size) {
                tArr[size] = null;
            } else {
                this.size = 0;
                return;
            }
        }
    }

    public final boolean contains(T t5) {
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i5 = 0; !l0.g(getContent()[i5], t5); i5++) {
                if (i5 != size) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean containsAll(@l List<? extends T> list) {
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (!contains(list.get(i5))) {
                return false;
            }
        }
        return true;
    }

    public final boolean contentEquals(@l MutableVector<T> mutableVector) {
        if (mutableVector.size != this.size) {
            return false;
        }
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i5 = 0; l0.g(mutableVector.getContent()[i5], getContent()[i5]); i5++) {
                if (i5 != size) {
                }
            }
            return false;
        }
        return true;
    }

    public final void ensureCapacity(int i5) {
        T[] tArr = this.content;
        if (tArr.length < i5) {
            T[] tArr2 = (T[]) Arrays.copyOf(tArr, Math.max(i5, tArr.length * 2));
            l0.o(tArr2, "copyOf(this, newSize)");
            this.content = tArr2;
        }
    }

    public final T first() {
        if (!isEmpty()) {
            return getContent()[0];
        }
        throw new NoSuchElementException("MutableVector is empty.");
    }

    @m
    public final T firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return getContent()[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> R fold(R r5, @l p<? super R, ? super T, ? extends R> pVar) {
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i5 = 0;
            do {
                r5 = pVar.invoke(r5, content[i5]);
                i5++;
            } while (i5 < size);
        }
        return r5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> R foldIndexed(R r5, @l q<? super Integer, ? super R, ? super T, ? extends R> qVar) {
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i5 = 0;
            do {
                r5 = qVar.invoke(Integer.valueOf(i5), r5, content[i5]);
                i5++;
            } while (i5 < size);
        }
        return r5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> R foldRight(R r5, @l p<? super T, ? super R, ? extends R> pVar) {
        int size = getSize();
        if (size > 0) {
            int i5 = size - 1;
            T[] content = getContent();
            do {
                r5 = pVar.invoke(content[i5], r5);
                i5--;
            } while (i5 >= 0);
        }
        return r5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> R foldRightIndexed(R r5, @l q<? super Integer, ? super T, ? super R, ? extends R> qVar) {
        int size = getSize();
        if (size > 0) {
            int i5 = size - 1;
            T[] content = getContent();
            do {
                r5 = qVar.invoke(Integer.valueOf(i5), content[i5], r5);
                i5--;
            } while (i5 >= 0);
        }
        return r5;
    }

    public final void forEach(@l v3.l<? super T, r2> lVar) {
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i5 = 0;
            do {
                lVar.invoke(content[i5]);
                i5++;
            } while (i5 < size);
        }
    }

    public final void forEachIndexed(@l p<? super Integer, ? super T, r2> pVar) {
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i5 = 0;
            do {
                pVar.invoke(Integer.valueOf(i5), content[i5]);
                i5++;
            } while (i5 < size);
        }
    }

    public final void forEachReversed(@l v3.l<? super T, r2> lVar) {
        int size = getSize();
        if (size > 0) {
            int i5 = size - 1;
            T[] content = getContent();
            do {
                lVar.invoke(content[i5]);
                i5--;
            } while (i5 >= 0);
        }
    }

    public final void forEachReversedIndexed(@l p<? super Integer, ? super T, r2> pVar) {
        if (getSize() > 0) {
            int size = getSize() - 1;
            T[] content = getContent();
            do {
                pVar.invoke(Integer.valueOf(size), content[size]);
                size--;
            } while (size >= 0);
        }
    }

    public final T get(int i5) {
        return getContent()[i5];
    }

    @l
    public final T[] getContent() {
        return this.content;
    }

    @l
    public final kotlin.ranges.l getIndices() {
        return new kotlin.ranges.l(0, getSize() - 1);
    }

    public final int getLastIndex() {
        return getSize() - 1;
    }

    public final int getSize() {
        return this.size;
    }

    public final int indexOf(T t5) {
        int i5 = this.size;
        if (i5 > 0) {
            T[] tArr = this.content;
            int i6 = 0;
            while (!l0.g(t5, tArr[i6])) {
                i6++;
                if (i6 >= i5) {
                    return -1;
                }
            }
            return i6;
        }
        return -1;
    }

    public final int indexOfFirst(@l v3.l<? super T, Boolean> lVar) {
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i5 = 0;
            while (!lVar.invoke(content[i5]).booleanValue()) {
                i5++;
                if (i5 >= size) {
                    return -1;
                }
            }
            return i5;
        }
        return -1;
    }

    public final int indexOfLast(@l v3.l<? super T, Boolean> lVar) {
        int size = getSize();
        if (size > 0) {
            int i5 = size - 1;
            T[] content = getContent();
            while (!lVar.invoke(content[i5]).booleanValue()) {
                i5--;
                if (i5 < 0) {
                    return -1;
                }
            }
            return i5;
        }
        return -1;
    }

    public final boolean isEmpty() {
        return this.size == 0;
    }

    public final boolean isNotEmpty() {
        return this.size != 0;
    }

    public final T last() {
        if (!isEmpty()) {
            return getContent()[getSize() - 1];
        }
        throw new NoSuchElementException("MutableVector is empty.");
    }

    public final int lastIndexOf(T t5) {
        int i5 = this.size;
        if (i5 > 0) {
            int i6 = i5 - 1;
            T[] tArr = this.content;
            while (!l0.g(t5, tArr[i6])) {
                i6--;
                if (i6 < 0) {
                    return -1;
                }
            }
            return i6;
        }
        return -1;
    }

    @m
    public final T lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return getContent()[getSize() - 1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <R> R[] map(v3.l<? super T, ? extends R> lVar) {
        int size = getSize();
        l0.y(0, "R");
        R[] rArr = (R[]) new Object[size];
        for (int i5 = 0; i5 < size; i5++) {
            rArr[i5] = lVar.invoke(getContent()[i5]);
        }
        return rArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <R> R[] mapIndexed(p<? super Integer, ? super T, ? extends R> pVar) {
        int size = getSize();
        l0.y(0, "R");
        R[] rArr = (R[]) new Object[size];
        for (int i5 = 0; i5 < size; i5++) {
            rArr[i5] = pVar.invoke(Integer.valueOf(i5), getContent()[i5]);
        }
        return rArr;
    }

    public final /* synthetic */ <R> MutableVector<R> mapIndexedNotNull(p<? super Integer, ? super T, ? extends R> pVar) {
        int size = getSize();
        int i5 = 0;
        l0.y(0, "R?");
        Object[] objArr = new Object[size];
        if (size > 0) {
            T[] content = getContent();
            int i6 = 0;
            do {
                R invoke = pVar.invoke(Integer.valueOf(i5), content[i5]);
                if (invoke != null) {
                    objArr[i6] = invoke;
                    i6++;
                }
                i5++;
            } while (i5 < size);
            i5 = i6;
        }
        return new MutableVector<>(objArr, i5);
    }

    public final /* synthetic */ <R> MutableVector<R> mapNotNull(v3.l<? super T, ? extends R> lVar) {
        int size = getSize();
        int i5 = 0;
        l0.y(0, "R?");
        Object[] objArr = new Object[size];
        if (size > 0) {
            T[] content = getContent();
            int i6 = 0;
            do {
                R invoke = lVar.invoke(content[i5]);
                if (invoke != null) {
                    objArr[i6] = invoke;
                    i6++;
                }
                i5++;
            } while (i5 < size);
            i5 = i6;
        }
        return new MutableVector<>(objArr, i5);
    }

    public final void minusAssign(T t5) {
        remove(t5);
    }

    public final void plusAssign(T t5) {
        add(t5);
    }

    public final boolean remove(T t5) {
        int indexOf = indexOf(t5);
        if (indexOf >= 0) {
            removeAt(indexOf);
            return true;
        }
        return false;
    }

    public final boolean removeAll(@l List<? extends T> list) {
        int i5 = this.size;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            remove(list.get(i6));
        }
        return i5 != this.size;
    }

    public final T removeAt(int i5) {
        T[] tArr = this.content;
        T t5 = tArr[i5];
        if (i5 != getSize() - 1) {
            o.B0(tArr, tArr, i5, i5 + 1, this.size);
        }
        int i6 = this.size - 1;
        this.size = i6;
        tArr[i6] = null;
        return t5;
    }

    public final void removeIf(@l v3.l<? super T, Boolean> lVar) {
        int size = getSize();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            if (lVar.invoke(getContent()[i6]).booleanValue()) {
                i5++;
            } else if (i5 > 0) {
                getContent()[i6 - i5] = getContent()[i6];
            }
        }
        int i7 = size - i5;
        o.M1(getContent(), null, i7, size);
        setSize(i7);
    }

    public final void removeRange(int i5, int i6) {
        if (i6 > i5) {
            int i7 = this.size;
            if (i6 < i7) {
                T[] tArr = this.content;
                o.B0(tArr, tArr, i5, i6, i7);
            }
            int i8 = this.size - (i6 - i5);
            int size = getSize() - 1;
            if (i8 <= size) {
                int i9 = i8;
                while (true) {
                    this.content[i9] = null;
                    if (i9 == size) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            this.size = i8;
        }
    }

    public final boolean retainAll(@l Collection<? extends T> collection) {
        int i5 = this.size;
        for (int size = getSize() - 1; -1 < size; size--) {
            if (!collection.contains(getContent()[size])) {
                removeAt(size);
            }
        }
        if (i5 != this.size) {
            return true;
        }
        return false;
    }

    public final boolean reversedAny(@l v3.l<? super T, Boolean> lVar) {
        int size = getSize();
        if (size > 0) {
            int i5 = size - 1;
            T[] content = getContent();
            while (!lVar.invoke(content[i5]).booleanValue()) {
                i5--;
                if (i5 < 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final T set(int i5, T t5) {
        T[] tArr = this.content;
        T t6 = tArr[i5];
        tArr[i5] = t5;
        return t6;
    }

    public final void setContent(@l T[] tArr) {
        this.content = tArr;
    }

    @a1
    public final void setSize(int i5) {
        this.size = i5;
    }

    public final void sortWith(@l Comparator<T> comparator) {
        o.i4(this.content, comparator, 0, this.size);
    }

    public final int sumBy(@l v3.l<? super T, Integer> lVar) {
        int size = getSize();
        int i5 = 0;
        if (size > 0) {
            T[] content = getContent();
            int i6 = 0;
            do {
                i5 += lVar.invoke(content[i6]).intValue();
                i6++;
            } while (i6 < size);
        }
        return i5;
    }

    @l
    @a1
    public final Void throwNoSuchElementException() {
        throw new NoSuchElementException("MutableVector contains no element matching the predicate.");
    }

    public final boolean containsAll(@l Collection<? extends T> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @m
    public final T firstOrNull(@l v3.l<? super T, Boolean> lVar) {
        int size = getSize();
        if (size <= 0) {
            return null;
        }
        T[] content = getContent();
        int i5 = 0;
        do {
            T t5 = content[i5];
            if (lVar.invoke(t5).booleanValue()) {
                return t5;
            }
            i5++;
        } while (i5 < size);
        return null;
    }

    public final void add(int i5, T t5) {
        ensureCapacity(this.size + 1);
        T[] tArr = this.content;
        int i6 = this.size;
        if (i5 != i6) {
            o.B0(tArr, tArr, i5 + 1, i5, i6);
        }
        tArr[i5] = t5;
        this.size++;
    }

    public final T first(@l v3.l<? super T, Boolean> lVar) {
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i5 = 0;
            do {
                T t5 = content[i5];
                if (lVar.invoke(t5).booleanValue()) {
                    return t5;
                }
                i5++;
            } while (i5 < size);
        }
        throwNoSuchElementException();
        throw new y();
    }

    @m
    public final T lastOrNull(@l v3.l<? super T, Boolean> lVar) {
        int size = getSize();
        if (size <= 0) {
            return null;
        }
        int i5 = size - 1;
        T[] content = getContent();
        do {
            T t5 = content[i5];
            if (lVar.invoke(t5).booleanValue()) {
                return t5;
            }
            i5--;
        } while (i5 >= 0);
        return null;
    }

    public final T last(@l v3.l<? super T, Boolean> lVar) {
        int size = getSize();
        if (size > 0) {
            int i5 = size - 1;
            T[] content = getContent();
            do {
                T t5 = content[i5];
                if (lVar.invoke(t5).booleanValue()) {
                    return t5;
                }
                i5--;
            } while (i5 >= 0);
        }
        throwNoSuchElementException();
        throw new y();
    }

    public final boolean removeAll(@l MutableVector<T> mutableVector) {
        int i5 = this.size;
        int size = mutableVector.getSize() - 1;
        if (size >= 0) {
            int i6 = 0;
            while (true) {
                remove(mutableVector.getContent()[i6]);
                if (i6 == size) {
                    break;
                }
                i6++;
            }
        }
        return i5 != this.size;
    }

    public final boolean containsAll(@l MutableVector<T> mutableVector) {
        kotlin.ranges.l lVar = new kotlin.ranges.l(0, mutableVector.getSize() - 1);
        int e5 = lVar.e();
        int g5 = lVar.g();
        if (e5 <= g5) {
            while (contains(mutableVector.getContent()[e5])) {
                if (e5 != g5) {
                    e5++;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean removeAll(@l Collection<? extends T> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int i5 = this.size;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i5 != this.size;
    }

    public final boolean addAll(int i5, @l MutableVector<T> mutableVector) {
        if (mutableVector.isEmpty()) {
            return false;
        }
        ensureCapacity(this.size + mutableVector.size);
        T[] tArr = this.content;
        int i6 = this.size;
        if (i5 != i6) {
            o.B0(tArr, tArr, mutableVector.size + i5, i5, i6);
        }
        o.B0(mutableVector.content, tArr, i5, 0, mutableVector.size);
        this.size += mutableVector.size;
        return true;
    }

    public final boolean addAll(@l List<? extends T> list) {
        return addAll(getSize(), (List) list);
    }

    public final boolean addAll(@l MutableVector<T> mutableVector) {
        return addAll(getSize(), mutableVector);
    }

    public final boolean addAll(@l T[] tArr) {
        if (tArr.length == 0) {
            return false;
        }
        ensureCapacity(this.size + tArr.length);
        o.K0(tArr, this.content, this.size, 0, 0, 12, null);
        this.size += tArr.length;
        return true;
    }

    public final boolean addAll(int i5, @l Collection<? extends T> collection) {
        int i6 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        ensureCapacity(this.size + collection.size());
        T[] tArr = this.content;
        if (i5 != this.size) {
            o.B0(tArr, tArr, collection.size() + i5, i5, this.size);
        }
        for (T t5 : collection) {
            int i7 = i6 + 1;
            if (i6 < 0) {
                w.W();
            }
            tArr[i6 + i5] = t5;
            i6 = i7;
        }
        this.size += collection.size();
        return true;
    }

    public final boolean addAll(@l Collection<? extends T> collection) {
        return addAll(this.size, collection);
    }
}
