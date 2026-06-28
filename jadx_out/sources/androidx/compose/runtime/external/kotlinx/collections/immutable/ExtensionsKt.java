package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.b1;
import kotlin.collections.a1;
import kotlin.collections.b0;
import kotlin.collections.o;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import kotlin.r2;
import kotlin.sequences.m;
import kotlin.text.h0;
import kotlin.u0;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;

@i0(d1 = {"\u0000x\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0080\b\u001a9\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0080\b\u001aS\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b2\u001e\u0010\u0005\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\u0012\u0004\u0012\u00020\u00040\u0002H\u0080\b\u001a.\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u000f\u001a\u00028\u0000H\u0080\n¢\u0006\u0004\b\u0010\u0010\u0011\u001a.\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u000f\u001a\u00028\u0000H\u0080\n¢\u0006\u0004\b\u0012\u0010\u0011\u001a-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0080\u0002\u001a6\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0015H\u0080\u0002¢\u0006\u0004\b\u0010\u0010\u0016\u001a-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0080\u0002\u001a-\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0080\u0002\u001a6\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0015H\u0080\u0002¢\u0006\u0004\b\u0012\u0010\u0016\u001a-\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0080\u0002\u001a.\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u000f\u001a\u00028\u0000H\u0080\n¢\u0006\u0004\b\u0010\u0010\u0018\u001a.\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u000f\u001a\u00028\u0000H\u0080\n¢\u0006\u0004\b\u0012\u0010\u0018\u001a-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0080\u0002\u001a6\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00072\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0015H\u0080\u0002¢\u0006\u0004\b\u0010\u0010\u0019\u001a-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0080\u0002\u001a-\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0080\u0002\u001a6\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00072\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0015H\u0080\u0002¢\u0006\u0004\b\u0012\u0010\u0019\u001a-\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0080\u0002\u001a.\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000f\u001a\u00028\u0000H\u0080\n¢\u0006\u0004\b\u0010\u0010\u001a\u001a.\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000f\u001a\u00028\u0000H\u0080\n¢\u0006\u0004\b\u0012\u0010\u001a\u001a-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0080\u0002\u001a6\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0015H\u0080\u0002¢\u0006\u0004\b\u0010\u0010\u001b\u001a-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0080\u0002\u001a-\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0080\u0002\u001a6\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0015H\u0080\u0002¢\u0006\u0004\b\u0012\u0010\u001b\u001a-\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0080\u0002\u001a-\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0080\u0004\u001a-\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0080\u0004\u001aG\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001dH\u0080\n\u001aM\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b2\u0018\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d0\u0013H\u0080\n\u001aV\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b2\u001a\u0010\u001f\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d0\u0015H\u0080\n¢\u0006\u0004\b\u0010\u0010 \u001aM\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b2\u0018\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d0\u0017H\u0080\n\u001aI\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b2\u0014\u0010\"\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!H\u0080\n\u001aH\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b2\u0014\u0010\"\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!H\u0000\u001aL\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b2\u0018\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d0\u0013H\u0000\u001aU\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b2\u001a\u0010\u001f\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d0\u0015H\u0000¢\u0006\u0004\b#\u0010 \u001aL\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b2\u0018\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d0\u0017H\u0000\u001aB\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b2\u0006\u0010$\u001a\u00028\u0000H\u0080\u0002¢\u0006\u0004\b\u0012\u0010%\u001aA\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0080\u0002\u001aJ\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b2\u000e\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0015H\u0080\u0002¢\u0006\u0004\b\u0012\u0010'\u001aA\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0080\u0002\u001a/\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\r2\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0015\"\u00028\u0000H\u0000¢\u0006\u0004\b(\u0010)\u001a\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\rH\u0000\u001a/\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\r2\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0015\"\u00028\u0000H\u0000¢\u0006\u0004\b*\u0010+\u001a\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\rH\u0000\u001a/\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\r2\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0015\"\u00028\u0000H\u0000¢\u0006\u0004\b,\u0010+\u001a\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\rH\u0000\u001aS\u0010-\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n2*\u0010\u001f\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d0\u0015\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001dH\u0000¢\u0006\u0004\b-\u0010.\u001a \u0010-\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\nH\u0000\u001aS\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n2*\u0010\u001f\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d0\u0015\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001dH\u0000¢\u0006\u0004\b/\u0010.\u001a \u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\nH\u0000\u001a/\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\r2\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0015\"\u00028\u0000H\u0001¢\u0006\u0004\b0\u0010)\u001a\u0014\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\rH\u0001\u001a/\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\r2\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0015\"\u00028\u0000H\u0001¢\u0006\u0004\b1\u0010+\u001a\u0014\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\rH\u0001\u001a/\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\r2\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0015\"\u00028\u0000H\u0001¢\u0006\u0004\b2\u0010+\u001aS\u00103\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n2*\u0010\u001f\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d0\u0015\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001dH\u0001¢\u0006\u0004\b3\u0010.\u001aS\u00104\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n2*\u0010\u001f\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d0\u0015\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001dH\u0001¢\u0006\u0004\b4\u0010.\u001a\u001e\u00106\u001a\b\u0012\u0004\u0012\u00028\u000005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0000\u001a\u001e\u00106\u001a\b\u0012\u0004\u0012\u00028\u000005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0000\u001a\u0012\u00106\u001a\b\u0012\u0004\u0012\u00020805*\u000207H\u0000\u001a\u001e\u00109\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0000\u001a\u001e\u00109\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0000\u001a\u0012\u00109\u001a\b\u0012\u0004\u0012\u0002080\u0007*\u000207H\u0000\u001a\u001e\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0000\u001a\u001e\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0000\u001a\u0012\u0010;\u001a\b\u0012\u0004\u0012\u0002080\u0001*\u000207H\u0000\u001a\u001e\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0000\u001a\u001e\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0000\u001a\u0012\u0010<\u001a\b\u0012\u0004\u0012\u0002080\u0001*\u000207H\u0000\u001a\u001e\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0000\u001a\u001e\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0000\u001a\u0012\u0010=\u001a\b\u0012\u0004\u0012\u0002080\u0001*\u000207H\u0000\u001a0\u0010?\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010>\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!H\u0000\u001a0\u0010@\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!H\u0000\u001a0\u0010A\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!H\u0000¨\u0006B"}, d2 = {"T", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "Lkotlin/Function1;", "", "Lkotlin/r2;", "mutator", "mutate", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "element", "plus", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "minus", "", "elements", "", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;[Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "Lkotlin/sequences/m;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;[Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;[Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "intersect", "Lkotlin/u0;", "pair", "pairs", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;[Lkotlin/u0;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "", "map", "putAll", DatabaseFileArchive.COLUMN_KEY, "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "keys", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;[Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "persistentListOf", "([Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "persistentSetOf", "([Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "persistentHashSetOf", "persistentMapOf", "([Lkotlin/u0;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "persistentHashMapOf", "immutableListOf", "immutableSetOf", "immutableHashSetOf", "immutableMapOf", "immutableHashMapOf", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "toImmutableList", "", "", "toPersistentList", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "toImmutableSet", "toPersistentSet", "toPersistentHashSet", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableMap;", "toImmutableMap", "toPersistentMap", "toPersistentHashMap", "runtime_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nextensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,741:1\n41#1:743\n41#1:744\n41#1:745\n41#1:746\n41#1:747\n41#1:748\n31#1:749\n31#1:750\n31#1:751\n31#1:752\n31#1:753\n31#1:754\n31#1:755\n53#1:756\n53#1:757\n53#1:758\n53#1:759\n53#1:760\n53#1:761\n53#1:762\n53#1:763\n41#1:764\n31#1:765\n31#1:766\n1#2:742\n*S KotlinDebug\n*F\n+ 1 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n158#1:743\n169#1:744\n180#1:745\n192#1:746\n203#1:747\n214#1:748\n241#1:749\n250#1:750\n259#1:751\n271#1:752\n282#1:753\n293#1:754\n304#1:755\n385#1:756\n394#1:757\n403#1:758\n423#1:759\n432#1:760\n441#1:761\n489#1:762\n505#1:763\n616#1:764\n672#1:765\n701#1:766\n*E\n"})
/* loaded from: classes.dex */
public final class ExtensionsKt {
    @l
    @k(message = "Use persistentHashMapOf instead.", replaceWith = @b1(expression = "persistentHashMapOf(*pairs)", imports = {}))
    public static final <K, V> PersistentMap<K, V> immutableHashMapOf(@l u0<? extends K, ? extends V>... u0VarArr) {
        return persistentHashMapOf((u0[]) Arrays.copyOf(u0VarArr, u0VarArr.length));
    }

    @l
    @k(message = "Use persistentHashSetOf instead.", replaceWith = @b1(expression = "persistentHashSetOf(*elements)", imports = {}))
    public static final <E> PersistentSet<E> immutableHashSetOf(@l E... eArr) {
        return persistentHashSetOf(Arrays.copyOf(eArr, eArr.length));
    }

    @l
    @k(message = "Use persistentListOf instead.", replaceWith = @b1(expression = "persistentListOf(*elements)", imports = {}))
    public static final <E> PersistentList<E> immutableListOf(@l E... eArr) {
        return persistentListOf(Arrays.copyOf(eArr, eArr.length));
    }

    @l
    @k(message = "Use persistentMapOf instead.", replaceWith = @b1(expression = "persistentMapOf(*pairs)", imports = {}))
    public static final <K, V> PersistentMap<K, V> immutableMapOf(@l u0<? extends K, ? extends V>... u0VarArr) {
        return persistentMapOf((u0[]) Arrays.copyOf(u0VarArr, u0VarArr.length));
    }

    @l
    @k(message = "Use persistentSetOf instead.", replaceWith = @b1(expression = "persistentSetOf(*elements)", imports = {}))
    public static final <E> PersistentSet<E> immutableSetOf(@l E... eArr) {
        return persistentSetOf(Arrays.copyOf(eArr, eArr.length));
    }

    @l
    public static final <E> PersistentSet<E> intersect(@l PersistentSet<? extends E> persistentSet, @l Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return persistentSet.retainAll((Collection<? extends Object>) iterable);
        }
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        b0.O0(builder, iterable);
        return builder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public static final <E> PersistentCollection<E> minus(@l PersistentCollection<? extends E> persistentCollection, E e5) {
        return persistentCollection.remove((PersistentCollection<? extends E>) e5);
    }

    @l
    public static final <T> PersistentSet<T> mutate(@l PersistentSet<? extends T> persistentSet, @l v3.l<? super Set<T>, r2> lVar) {
        PersistentSet.Builder<? extends T> builder = persistentSet.builder();
        lVar.invoke(builder);
        return builder.build();
    }

    @l
    public static final <K, V> PersistentMap<K, V> persistentHashMapOf(@l u0<? extends K, ? extends V>... u0VarArr) {
        PersistentHashMap<K, V> emptyOf$runtime_release = PersistentHashMap.Companion.emptyOf$runtime_release();
        l0.n(emptyOf$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<K, V> builder2 = emptyOf$runtime_release.builder2();
        a1.y0(builder2, u0VarArr);
        return builder2.build2();
    }

    @l
    public static final <E> PersistentSet<E> persistentHashSetOf(@l E... eArr) {
        List t5;
        PersistentSet<E> emptyOf$runtime_release = PersistentHashSet.Companion.emptyOf$runtime_release();
        t5 = o.t(eArr);
        return emptyOf$runtime_release.addAll((Collection) t5);
    }

    @l
    public static final <E> PersistentList<E> persistentListOf(@l E... eArr) {
        List t5;
        PersistentList persistentVectorOf = UtilsKt.persistentVectorOf();
        t5 = o.t(eArr);
        return persistentVectorOf.addAll((Collection) t5);
    }

    @l
    public static final <K, V> PersistentMap<K, V> persistentMapOf(@l u0<? extends K, ? extends V>... u0VarArr) {
        PersistentOrderedMap<K, V> emptyOf$runtime_release = PersistentOrderedMap.Companion.emptyOf$runtime_release();
        l0.n(emptyOf$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<K, V> builder2 = emptyOf$runtime_release.builder2();
        a1.y0(builder2, u0VarArr);
        return builder2.build2();
    }

    @l
    public static final <E> PersistentSet<E> persistentSetOf(@l E... eArr) {
        List t5;
        PersistentSet<E> emptyOf$runtime_release = PersistentOrderedSet.Companion.emptyOf$runtime_release();
        t5 = o.t(eArr);
        return emptyOf$runtime_release.addAll((Collection) t5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public static final <E> PersistentCollection<E> plus(@l PersistentCollection<? extends E> persistentCollection, E e5) {
        return persistentCollection.add((PersistentCollection<? extends E>) e5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public static final <K, V> PersistentMap<K, V> putAll(@l PersistentMap<? extends K, ? extends V> persistentMap, @l Map<? extends K, ? extends V> map) {
        l0.n(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.putAll, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.putAll>");
        return persistentMap.putAll((Map<? extends Object, ? extends Object>) map);
    }

    @l
    public static final <T> ImmutableList<T> toImmutableList(@l Iterable<? extends T> iterable) {
        ImmutableList<T> immutableList = iterable instanceof ImmutableList ? (ImmutableList) iterable : null;
        return immutableList == null ? toPersistentList(iterable) : immutableList;
    }

    @l
    public static final <K, V> ImmutableMap<K, V> toImmutableMap(@l Map<K, ? extends V> map) {
        ImmutableMap<K, V> immutableMap;
        PersistentMap.Builder builder;
        PersistentMap<K, V> persistentMap = null;
        if (map instanceof ImmutableMap) {
            immutableMap = (ImmutableMap) map;
        } else {
            immutableMap = null;
        }
        if (immutableMap == null) {
            if (map instanceof PersistentMap.Builder) {
                builder = (PersistentMap.Builder) map;
            } else {
                builder = null;
            }
            if (builder != null) {
                persistentMap = builder.build2();
            }
            if (persistentMap != null) {
                return persistentMap;
            }
            return persistentMapOf().putAll((Map) map);
        }
        return immutableMap;
    }

    @l
    public static final <T> ImmutableSet<T> toImmutableSet(@l Iterable<? extends T> iterable) {
        ImmutableSet<T> immutableSet = iterable instanceof ImmutableSet ? (ImmutableSet) iterable : null;
        if (immutableSet != null) {
            return immutableSet;
        }
        PersistentSet.Builder builder = iterable instanceof PersistentSet.Builder ? (PersistentSet.Builder) iterable : null;
        PersistentSet build = builder != null ? builder.build() : null;
        return build != null ? build : plus(persistentSetOf(), (Iterable) iterable);
    }

    @l
    public static final <K, V> PersistentMap<K, V> toPersistentHashMap(@l Map<K, ? extends V> map) {
        PersistentHashMap persistentHashMap;
        PersistentHashMapBuilder persistentHashMapBuilder;
        PersistentHashMap<K, V> persistentHashMap2 = null;
        if (map instanceof PersistentHashMap) {
            persistentHashMap = (PersistentHashMap) map;
        } else {
            persistentHashMap = null;
        }
        if (persistentHashMap == null) {
            if (map instanceof PersistentHashMapBuilder) {
                persistentHashMapBuilder = (PersistentHashMapBuilder) map;
            } else {
                persistentHashMapBuilder = null;
            }
            if (persistentHashMapBuilder != null) {
                persistentHashMap2 = persistentHashMapBuilder.build2();
            }
            if (persistentHashMap2 != null) {
                return persistentHashMap2;
            }
            return PersistentHashMap.Companion.emptyOf$runtime_release().putAll((Map) map);
        }
        return persistentHashMap;
    }

    @l
    public static final <T> PersistentSet<T> toPersistentHashSet(@l Iterable<? extends T> iterable) {
        PersistentHashSet persistentHashSet = iterable instanceof PersistentHashSet ? (PersistentHashSet) iterable : null;
        if (persistentHashSet != null) {
            return persistentHashSet;
        }
        PersistentHashSetBuilder persistentHashSetBuilder = iterable instanceof PersistentHashSetBuilder ? (PersistentHashSetBuilder) iterable : null;
        PersistentHashSet build = persistentHashSetBuilder != null ? persistentHashSetBuilder.build() : null;
        return build != null ? build : plus(PersistentHashSet.Companion.emptyOf$runtime_release(), (Iterable) iterable);
    }

    @l
    public static final <T> PersistentList<T> toPersistentList(@l Iterable<? extends T> iterable) {
        PersistentList<T> persistentList = iterable instanceof PersistentList ? (PersistentList) iterable : null;
        if (persistentList != null) {
            return persistentList;
        }
        PersistentList.Builder builder = iterable instanceof PersistentList.Builder ? (PersistentList.Builder) iterable : null;
        PersistentList<T> build = builder != null ? builder.build() : null;
        return build == null ? plus(persistentListOf(), (Iterable) iterable) : build;
    }

    @l
    public static final <K, V> PersistentMap<K, V> toPersistentMap(@l Map<K, ? extends V> map) {
        PersistentOrderedMap persistentOrderedMap;
        PersistentOrderedMapBuilder persistentOrderedMapBuilder;
        PersistentMap<K, V> persistentMap = null;
        if (map instanceof PersistentOrderedMap) {
            persistentOrderedMap = (PersistentOrderedMap) map;
        } else {
            persistentOrderedMap = null;
        }
        if (persistentOrderedMap == null) {
            if (map instanceof PersistentOrderedMapBuilder) {
                persistentOrderedMapBuilder = (PersistentOrderedMapBuilder) map;
            } else {
                persistentOrderedMapBuilder = null;
            }
            if (persistentOrderedMapBuilder != null) {
                persistentMap = persistentOrderedMapBuilder.build2();
            }
            if (persistentMap == null) {
                return PersistentOrderedMap.Companion.emptyOf$runtime_release().putAll((Map) map);
            }
            return persistentMap;
        }
        return persistentOrderedMap;
    }

    @l
    public static final <T> PersistentSet<T> toPersistentSet(@l Iterable<? extends T> iterable) {
        PersistentOrderedSet persistentOrderedSet = iterable instanceof PersistentOrderedSet ? (PersistentOrderedSet) iterable : null;
        if (persistentOrderedSet != null) {
            return persistentOrderedSet;
        }
        PersistentOrderedSetBuilder persistentOrderedSetBuilder = iterable instanceof PersistentOrderedSetBuilder ? (PersistentOrderedSetBuilder) iterable : null;
        PersistentSet<T> build = persistentOrderedSetBuilder != null ? persistentOrderedSetBuilder.build() : null;
        return build == null ? plus(PersistentOrderedSet.Companion.emptyOf$runtime_release(), (Iterable) iterable) : build;
    }

    @l
    @k(message = "Use persistentListOf instead.", replaceWith = @b1(expression = "persistentListOf()", imports = {}))
    public static final <E> PersistentList<E> immutableListOf() {
        return persistentListOf();
    }

    @l
    @k(message = "Use persistentSetOf instead.", replaceWith = @b1(expression = "persistentSetOf()", imports = {}))
    public static final <E> PersistentSet<E> immutableSetOf() {
        return persistentSetOf();
    }

    @l
    public static final <E> PersistentCollection<E> minus(@l PersistentCollection<? extends E> persistentCollection, @l Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return persistentCollection.removeAll((Collection<? extends Object>) iterable);
        }
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        b0.E0(builder, iterable);
        return builder.build();
    }

    @l
    public static final <T> PersistentList<T> mutate(@l PersistentList<? extends T> persistentList, @l v3.l<? super List<T>, r2> lVar) {
        PersistentList.Builder<? extends T> builder = persistentList.builder();
        lVar.invoke(builder);
        return builder.build();
    }

    @l
    public static final <E> PersistentSet<E> persistentHashSetOf() {
        return PersistentHashSet.Companion.emptyOf$runtime_release();
    }

    @l
    public static final <E> PersistentList<E> persistentListOf() {
        return UtilsKt.persistentVectorOf();
    }

    @l
    public static final <E> PersistentSet<E> persistentSetOf() {
        return PersistentOrderedSet.Companion.emptyOf$runtime_release();
    }

    @l
    public static final <E> PersistentCollection<E> plus(@l PersistentCollection<? extends E> persistentCollection, @l Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return persistentCollection.addAll((Collection<? extends Object>) iterable);
        }
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        b0.n0(builder, iterable);
        return builder.build();
    }

    @l
    public static final <K, V> PersistentMap<K, V> putAll(@l PersistentMap<? extends K, ? extends V> persistentMap, @l Iterable<? extends u0<? extends K, ? extends V>> iterable) {
        l0.n(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<? extends K, ? extends V> builder2 = persistentMap.builder2();
        a1.w0(builder2, iterable);
        return builder2.build2();
    }

    @l
    public static final <E> PersistentCollection<E> minus(@l PersistentCollection<? extends E> persistentCollection, @l E[] eArr) {
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        b0.H0(builder, eArr);
        return builder.build();
    }

    @l
    public static final <K, V> PersistentMap<K, V> mutate(@l PersistentMap<? extends K, ? extends V> persistentMap, @l v3.l<? super Map<K, V>, r2> lVar) {
        l0.n(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<? extends K, ? extends V> builder2 = persistentMap.builder2();
        lVar.invoke(builder2);
        return builder2.build2();
    }

    @l
    public static final <E> PersistentCollection<E> plus(@l PersistentCollection<? extends E> persistentCollection, @l E[] eArr) {
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        b0.p0(builder, eArr);
        return builder.build();
    }

    @l
    public static final <T> ImmutableList<T> toImmutableList(@l m<? extends T> mVar) {
        return toPersistentList(mVar);
    }

    @l
    public static final <E> PersistentCollection<E> minus(@l PersistentCollection<? extends E> persistentCollection, @l m<? extends E> mVar) {
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        b0.G0(builder, mVar);
        return builder.build();
    }

    @l
    public static final <E> PersistentCollection<E> plus(@l PersistentCollection<? extends E> persistentCollection, @l m<? extends E> mVar) {
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        b0.o0(builder, mVar);
        return builder.build();
    }

    @l
    public static final ImmutableList<Character> toImmutableList(@l CharSequence charSequence) {
        return toPersistentList(charSequence);
    }

    @l
    public static final <T> ImmutableSet<T> toImmutableSet(@l m<? extends T> mVar) {
        return toPersistentSet(mVar);
    }

    @l
    public static final <T> PersistentSet<T> toPersistentHashSet(@l m<? extends T> mVar) {
        return plus(persistentHashSetOf(), (m) mVar);
    }

    @l
    public static final <T> PersistentList<T> toPersistentList(@l m<? extends T> mVar) {
        return plus(persistentListOf(), (m) mVar);
    }

    @l
    public static final <T> PersistentSet<T> toPersistentSet(@l m<? extends T> mVar) {
        return plus(persistentSetOf(), (m) mVar);
    }

    @l
    public static final <E> PersistentSet<E> intersect(@l PersistentCollection<? extends E> persistentCollection, @l Iterable<? extends E> iterable) {
        return intersect(toPersistentSet(persistentCollection), (Iterable) iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public static final <E> PersistentList<E> minus(@l PersistentList<? extends E> persistentList, E e5) {
        return persistentList.remove((PersistentList<? extends E>) e5);
    }

    @l
    public static final <K, V> PersistentMap<K, V> persistentHashMapOf() {
        return PersistentHashMap.Companion.emptyOf$runtime_release();
    }

    @l
    public static final <K, V> PersistentMap<K, V> persistentMapOf() {
        return PersistentOrderedMap.Companion.emptyOf$runtime_release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public static final <E> PersistentList<E> plus(@l PersistentList<? extends E> persistentList, E e5) {
        return persistentList.add((PersistentList<? extends E>) e5);
    }

    @l
    public static final <K, V> PersistentMap<K, V> putAll(@l PersistentMap<? extends K, ? extends V> persistentMap, @l u0<? extends K, ? extends V>[] u0VarArr) {
        l0.n(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<? extends K, ? extends V> builder2 = persistentMap.builder2();
        a1.y0(builder2, u0VarArr);
        return builder2.build2();
    }

    @l
    public static final PersistentSet<Character> toImmutableSet(@l CharSequence charSequence) {
        return toPersistentSet(charSequence);
    }

    @l
    public static final PersistentSet<Character> toPersistentHashSet(@l CharSequence charSequence) {
        PersistentSet.Builder builder = persistentHashSetOf().builder();
        h0.c9(charSequence, builder);
        return builder.build();
    }

    @l
    public static final PersistentList<Character> toPersistentList(@l CharSequence charSequence) {
        PersistentList.Builder builder = persistentListOf().builder();
        h0.c9(charSequence, builder);
        return builder.build();
    }

    @l
    public static final PersistentSet<Character> toPersistentSet(@l CharSequence charSequence) {
        PersistentSet.Builder builder = persistentSetOf().builder();
        h0.c9(charSequence, builder);
        return builder.build();
    }

    @l
    public static final <E> PersistentList<E> minus(@l PersistentList<? extends E> persistentList, @l Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return persistentList.removeAll((Collection<? extends Object>) iterable);
        }
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        b0.E0(builder, iterable);
        return builder.build();
    }

    @l
    public static final <E> PersistentList<E> plus(@l PersistentList<? extends E> persistentList, @l Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return persistentList.addAll((Collection<? extends Object>) iterable);
        }
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        b0.n0(builder, iterable);
        return builder.build();
    }

    @l
    public static final <K, V> PersistentMap<K, V> putAll(@l PersistentMap<? extends K, ? extends V> persistentMap, @l m<? extends u0<? extends K, ? extends V>> mVar) {
        l0.n(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<? extends K, ? extends V> builder2 = persistentMap.builder2();
        a1.x0(builder2, mVar);
        return builder2.build2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public static final <E> PersistentSet<E> minus(@l PersistentSet<? extends E> persistentSet, E e5) {
        return persistentSet.remove((PersistentSet<? extends E>) e5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public static final <E> PersistentSet<E> plus(@l PersistentSet<? extends E> persistentSet, E e5) {
        return persistentSet.add((PersistentSet<? extends E>) e5);
    }

    @l
    public static final <E> PersistentSet<E> minus(@l PersistentSet<? extends E> persistentSet, @l Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return persistentSet.removeAll((Collection<? extends Object>) iterable);
        }
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        b0.E0(builder, iterable);
        return builder.build();
    }

    @l
    public static final <E> PersistentSet<E> plus(@l PersistentSet<? extends E> persistentSet, @l Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return persistentSet.addAll((Collection<? extends Object>) iterable);
        }
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        b0.n0(builder, iterable);
        return builder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public static final <K, V> PersistentMap<K, V> minus(@l PersistentMap<? extends K, ? extends V> persistentMap, K k5) {
        l0.n(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.minus, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.minus>");
        return persistentMap.remove((PersistentMap<? extends K, ? extends V>) k5);
    }

    @l
    public static final <K, V> PersistentMap<K, V> plus(@l PersistentMap<? extends K, ? extends V> persistentMap, @l u0<? extends K, ? extends V> u0Var) {
        l0.n(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.plus, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.plus>");
        return persistentMap.put((PersistentMap<? extends K, ? extends V>) u0Var.getFirst(), (K) u0Var.getSecond());
    }

    @l
    public static final <E> PersistentList<E> minus(@l PersistentList<? extends E> persistentList, @l E[] eArr) {
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        b0.H0(builder, eArr);
        return builder.build();
    }

    @l
    public static final <K, V> PersistentMap<K, V> plus(@l PersistentMap<? extends K, ? extends V> persistentMap, @l Iterable<? extends u0<? extends K, ? extends V>> iterable) {
        return putAll(persistentMap, iterable);
    }

    @l
    public static final <K, V> PersistentMap<K, V> plus(@l PersistentMap<? extends K, ? extends V> persistentMap, @l u0<? extends K, ? extends V>[] u0VarArr) {
        return putAll(persistentMap, u0VarArr);
    }

    @l
    public static final <K, V> PersistentMap<K, V> plus(@l PersistentMap<? extends K, ? extends V> persistentMap, @l m<? extends u0<? extends K, ? extends V>> mVar) {
        return putAll(persistentMap, mVar);
    }

    @l
    public static final <E> PersistentList<E> minus(@l PersistentList<? extends E> persistentList, @l m<? extends E> mVar) {
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        b0.G0(builder, mVar);
        return builder.build();
    }

    @l
    public static final <K, V> PersistentMap<K, V> plus(@l PersistentMap<? extends K, ? extends V> persistentMap, @l Map<? extends K, ? extends V> map) {
        return putAll(persistentMap, map);
    }

    @l
    public static final <E> PersistentList<E> plus(@l PersistentList<? extends E> persistentList, @l E[] eArr) {
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        b0.p0(builder, eArr);
        return builder.build();
    }

    @l
    public static final <E> PersistentSet<E> minus(@l PersistentSet<? extends E> persistentSet, @l E[] eArr) {
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        b0.H0(builder, eArr);
        return builder.build();
    }

    @l
    public static final <E> PersistentList<E> plus(@l PersistentList<? extends E> persistentList, @l m<? extends E> mVar) {
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        b0.o0(builder, mVar);
        return builder.build();
    }

    @l
    public static final <E> PersistentSet<E> minus(@l PersistentSet<? extends E> persistentSet, @l m<? extends E> mVar) {
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        b0.G0(builder, mVar);
        return builder.build();
    }

    @l
    public static final <E> PersistentSet<E> plus(@l PersistentSet<? extends E> persistentSet, @l E[] eArr) {
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        b0.p0(builder, eArr);
        return builder.build();
    }

    @l
    public static final <K, V> PersistentMap<K, V> minus(@l PersistentMap<? extends K, ? extends V> persistentMap, @l Iterable<? extends K> iterable) {
        l0.n(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<? extends K, ? extends V> builder2 = persistentMap.builder2();
        b0.E0(builder2.keySet(), iterable);
        return builder2.build2();
    }

    @l
    public static final <E> PersistentSet<E> plus(@l PersistentSet<? extends E> persistentSet, @l m<? extends E> mVar) {
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        b0.o0(builder, mVar);
        return builder.build();
    }

    @l
    public static final <K, V> PersistentMap<K, V> minus(@l PersistentMap<? extends K, ? extends V> persistentMap, @l K[] kArr) {
        l0.n(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<? extends K, ? extends V> builder2 = persistentMap.builder2();
        b0.H0(builder2.keySet(), kArr);
        return builder2.build2();
    }

    @l
    public static final <K, V> PersistentMap<K, V> minus(@l PersistentMap<? extends K, ? extends V> persistentMap, @l m<? extends K> mVar) {
        l0.n(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<? extends K, ? extends V> builder2 = persistentMap.builder2();
        b0.G0(builder2.keySet(), mVar);
        return builder2.build2();
    }
}
