package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlin.ranges.j;
import kotlin.ranges.u;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import t0.b;
import v3.s;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b.\b\u0000\u0018\u0000 \u0085\u0001*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0004\u0085\u0001\u0086\u0001B3\u0012\u0006\u0010W\u001a\u00020\u0007\u0012\u0006\u0010X\u001a\u00020\u0007\u0012\u000e\u0010~\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030'\u0012\b\u0010{\u001a\u0004\u0018\u00010\u0013¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001B+\b\u0016\u0012\u0006\u0010W\u001a\u00020\u0007\u0012\u0006\u0010X\u001a\u00020\u0007\u0012\u000e\u0010~\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030'¢\u0006\u0006\b\u0082\u0001\u0010\u0084\u0001J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0002J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0017\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\rJ3\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00012\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J?\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00028\u00012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ8\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002J8\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001d\u001a\u00020\u00072\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J&\u0010!\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J.\u0010\"\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002JQ\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030'2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00028\u00002\u0006\u0010%\u001a\u00028\u00012\u0006\u0010&\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b(\u0010)JK\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00028\u00002\u0006\u0010%\u001a\u00028\u00012\u0006\u0010&\u001a\u00020\u0007H\u0002¢\u0006\u0004\b*\u0010+JS\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00028\u00002\u0006\u0010%\u001a\u00028\u00012\u0006\u0010&\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b,\u0010-J]\u00104\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00028\u00002\u0006\u00100\u001a\u00028\u00012\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00028\u00002\u0006\u00103\u001a\u00028\u00012\u0006\u0010&\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b4\u00105J&\u00106\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J:\u00107\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019H\u0002J\u001e\u00109\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u00108\u001a\u00020\u0007H\u0002J2\u0010:\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u00108\u001a\u00020\u00072\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019H\u0002J\u0017\u0010;\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b;\u0010<J\u0019\u0010=\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b=\u0010>J-\u0010?\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001H\u0002¢\u0006\u0004\b?\u0010@J?\u0010A\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019H\u0002¢\u0006\u0004\bA\u0010BJ%\u0010C\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\bC\u0010DJ9\u0010E\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u000f\u001a\u00028\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019H\u0002¢\u0006\u0004\bE\u0010FJ-\u0010C\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001H\u0002¢\u0006\u0004\bC\u0010GJA\u0010E\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019H\u0002¢\u0006\u0004\bE\u0010BJ8\u0010K\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010J\u001a\u00020I2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002JT\u0010L\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u0010J\u001a\u00020I2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019H\u0002J\b\u0010M\u001a\u00020\u0007H\u0002J\u001c\u0010N\u001a\u00020\t2\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002JP\u0010P\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0012\u0010O\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002JX\u0010Q\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0012\u0010O\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u009c\u0001\u0010[\u001a\u00020Y2\u0081\u0001\u0010Z\u001a}\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(U\u0012\u0013\u0012\u00110\u0007¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(&\u0012\u0013\u0012\u00110\u0007¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(V\u0012\u0013\u0012\u00110\u0007¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(W\u0012\u0013\u0012\u00110\u0007¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(X\u0012\u0004\u0012\u00020Y0R2\u0006\u0010V\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0007H\u0002J\u000f\u0010^\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\\\u0010]J\u0017\u0010a\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b_\u0010`J\u0017\u0010d\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\bb\u0010cJ\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\be\u0010cJ#\u0010h\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001d\u001a\u00020\u0007H\u0000¢\u0006\u0004\bf\u0010gJ%\u0010j\u001a\u00020\t2\u0006\u0010i\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\u0007¢\u0006\u0004\bj\u0010kJ'\u0010l\u001a\u0004\u0018\u00018\u00012\u0006\u0010i\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\u0007¢\u0006\u0004\bl\u0010mJJ\u0010n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010&\u001a\u00020\u00072\u0006\u0010J\u001a\u00020I2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019J;\u0010o\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u0006\u0010i\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00012\u0006\u0010&\u001a\u00020\u0007¢\u0006\u0004\bo\u0010pJM\u0010q\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010i\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00012\u0006\u0010&\u001a\u00020\u00072\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019¢\u0006\u0004\bq\u0010rJ3\u0010s\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010i\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\u0007¢\u0006\u0004\bs\u0010tJG\u0010u\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010i\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\u00072\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019¢\u0006\u0004\bu\u0010vJ;\u0010s\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010i\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00012\u0006\u0010&\u001a\u00020\u0007¢\u0006\u0004\bs\u0010wJO\u0010u\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010i\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00012\u0006\u0010&\u001a\u00020\u00072\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019¢\u0006\u0004\bu\u0010rJ\u0093\u0001\u0010[\u001a\u00020Y2\u0081\u0001\u0010Z\u001a}\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(U\u0012\u0013\u0012\u00110\u0007¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(&\u0012\u0013\u0012\u00110\u0007¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(V\u0012\u0013\u0012\u00110\u0007¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(W\u0012\u0013\u0012\u00110\u0007¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(X\u0012\u0004\u0012\u00020Y0RH\u0000¢\u0006\u0004\bx\u0010yR\u0016\u0010W\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010zR\u0016\u0010X\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010zR\u0016\u0010{\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R6\u0010~\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030'2\u000e\u0010}\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030'8\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001¨\u0006\u0087\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "K", "V", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "asInsertResult", "asUpdateResult", "", "positionMask", "", "hasNodeAt", "keyIndex", "keyAtIndex", "(I)Ljava/lang/Object;", "valueAtKeyIndex", DatabaseFileArchive.COLUMN_KEY, b.f22420d, "insertEntryAt", "(ILjava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "owner", "mutableInsertEntryAt", "(ILjava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "updateValueAtIndex", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "mutator", "mutableUpdateValueAtIndex", "(ILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "nodeIndex", "newNode", "updateNodeAtIndex", "mutableUpdateNodeAtIndex", "removeNodeAtIndex", "mutableRemoveNodeAtIndex", "newKeyHash", "newKey", "newValue", "shift", "", "bufferMoveEntryToNode", "(IIILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)[Ljava/lang/Object;", "moveEntryToNode", "(IIILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableMoveEntryToNode", "(IIILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "keyHash1", "key1", "value1", "keyHash2", "key2", "value2", "makeNode", "(ILjava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "removeEntryAtIndex", "mutableRemoveEntryAtIndex", "i", "collisionRemoveEntryAtIndex", "mutableCollisionRemoveEntryAtIndex", "collisionContainsKey", "(Ljava/lang/Object;)Z", "collisionGet", "(Ljava/lang/Object;)Ljava/lang/Object;", "collisionPut", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "mutableCollisionPut", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "collisionRemove", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableCollisionRemove", "(Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "otherNode", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;", "intersectionCounter", "mutableCollisionPutAll", "mutablePutAllFromOtherNodeCell", "calculateSize", "elementsIdentityEquals", "targetNode", "replaceNode", "mutableReplaceNode", "Lkotlin/Function5;", "Lkotlin/v0;", "name", "node", "hash", "dataMap", "nodeMap", "Lkotlin/r2;", "visitor", "accept", "entryCount$runtime_release", "()I", "entryCount", "hasEntryAt$runtime_release", "(I)Z", "hasEntryAt", "entryKeyIndex$runtime_release", "(I)I", "entryKeyIndex", "nodeIndex$runtime_release", "nodeAtIndex$runtime_release", "(I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "nodeAtIndex", "keyHash", "containsKey", "(ILjava/lang/Object;I)Z", "get", "(ILjava/lang/Object;I)Ljava/lang/Object;", "mutablePutAll", "put", "(ILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "mutablePut", "(ILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "remove", "(ILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableRemove", "(ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "(ILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "accept$runtime_release", "(Lv3/s;)V", "I", "ownedBy", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "<set-?>", "buffer", "[Ljava/lang/Object;", "getBuffer$runtime_release", "()[Ljava/lang/Object;", "<init>", "(II[Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "(II[Ljava/lang/Object;)V", "Companion", "ModificationResult", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode\n+ 2 ForEachOneBit.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/ForEachOneBitKt\n+ 3 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,898:1\n10#2,9:899\n10#2,9:908\n10#2,9:917\n83#3:926\n1#4:927\n26#5:928\n*S KotlinDebug\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode\n*L\n629#1:899,9\n647#1:908,9\n651#1:917,9\n699#1:926\n699#1:927\n896#1:928\n*E\n"})
/* loaded from: classes.dex */
public final class TrieNode<K, V> {

    @l
    private Object[] buffer;
    private int dataMap;
    private int nodeMap;

    @m
    private final MutabilityOwnership ownedBy;

    @l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @l
    private static final TrieNode EMPTY = new TrieNode(0, 0, new Object[0]);

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "", "getEMPTY$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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

    @StabilityInferred(parameters = 0)
    @i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B!\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJA\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002*\u0010\u0010\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00050\u0011H\u0086\bR&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "K", "V", "", "node", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "sizeDelta", "", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;I)V", "getNode", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "setNode", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;)V", "getSizeDelta", "()I", "replaceNode", "operation", "Lkotlin/Function1;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,898:1\n1#2:899\n*E\n"})
    /* loaded from: classes.dex */
    public static final class ModificationResult<K, V> {
        public static final int $stable = 8;

        @l
        private TrieNode<K, V> node;
        private final int sizeDelta;

        public ModificationResult(@l TrieNode<K, V> trieNode, int i5) {
            this.node = trieNode;
            this.sizeDelta = i5;
        }

        @l
        public final TrieNode<K, V> getNode() {
            return this.node;
        }

        public final int getSizeDelta() {
            return this.sizeDelta;
        }

        @l
        public final ModificationResult<K, V> replaceNode(@l v3.l<? super TrieNode<K, V>, TrieNode<K, V>> lVar) {
            setNode(lVar.invoke(getNode()));
            return this;
        }

        public final void setNode(@l TrieNode<K, V> trieNode) {
            this.node = trieNode;
        }
    }

    public TrieNode(int i5, int i6, @l Object[] objArr, @m MutabilityOwnership mutabilityOwnership) {
        this.dataMap = i5;
        this.nodeMap = i6;
        this.ownedBy = mutabilityOwnership;
        this.buffer = objArr;
    }

    private final void accept(s<? super TrieNode<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, r2> sVar, int i5, int i6) {
        sVar.invoke(this, Integer.valueOf(i6), Integer.valueOf(i5), Integer.valueOf(this.dataMap), Integer.valueOf(this.nodeMap));
        int i7 = this.nodeMap;
        while (i7 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i7);
            nodeAtIndex$runtime_release(nodeIndex$runtime_release(lowestOneBit)).accept(sVar, (Integer.numberOfTrailingZeros(lowestOneBit) << i6) + i5, i6 + 5);
            i7 -= lowestOneBit;
        }
    }

    private final ModificationResult<K, V> asInsertResult() {
        return new ModificationResult<>(this, 1);
    }

    private final ModificationResult<K, V> asUpdateResult() {
        return new ModificationResult<>(this, 0);
    }

    private final Object[] bufferMoveEntryToNode(int i5, int i6, int i7, K k5, V v4, int i8, MutabilityOwnership mutabilityOwnership) {
        int i9;
        K keyAtIndex = keyAtIndex(i5);
        if (keyAtIndex != null) {
            i9 = keyAtIndex.hashCode();
        } else {
            i9 = 0;
        }
        TrieNode<K, V> makeNode = makeNode(i9, keyAtIndex, valueAtKeyIndex(i5), i7, k5, v4, i8 + 5, mutabilityOwnership);
        return TrieNodeKt.access$replaceEntryWithNode(this.buffer, i5, nodeIndex$runtime_release(i6) + 1, makeNode);
    }

    private final int calculateSize() {
        if (this.nodeMap == 0) {
            return this.buffer.length / 2;
        }
        int bitCount = Integer.bitCount(this.dataMap);
        int length = this.buffer.length;
        for (int i5 = bitCount * 2; i5 < length; i5++) {
            bitCount += nodeAtIndex$runtime_release(i5).calculateSize();
        }
        return bitCount;
    }

    private final boolean collisionContainsKey(K k5) {
        kotlin.ranges.l W1;
        j B1;
        W1 = u.W1(0, this.buffer.length);
        B1 = u.B1(W1, 2);
        int e5 = B1.e();
        int g5 = B1.g();
        int i5 = B1.i();
        if ((i5 > 0 && e5 <= g5) || (i5 < 0 && g5 <= e5)) {
            while (!l0.g(k5, this.buffer[e5])) {
                if (e5 != g5) {
                    e5 += i5;
                }
            }
            return true;
        }
        return false;
    }

    private final V collisionGet(K k5) {
        kotlin.ranges.l W1;
        j B1;
        W1 = u.W1(0, this.buffer.length);
        B1 = u.B1(W1, 2);
        int e5 = B1.e();
        int g5 = B1.g();
        int i5 = B1.i();
        if ((i5 > 0 && e5 <= g5) || (i5 < 0 && g5 <= e5)) {
            while (!l0.g(k5, keyAtIndex(e5))) {
                if (e5 != g5) {
                    e5 += i5;
                } else {
                    return null;
                }
            }
            return valueAtKeyIndex(e5);
        }
        return null;
    }

    private final ModificationResult<K, V> collisionPut(K k5, V v4) {
        kotlin.ranges.l W1;
        j B1;
        W1 = u.W1(0, this.buffer.length);
        B1 = u.B1(W1, 2);
        int e5 = B1.e();
        int g5 = B1.g();
        int i5 = B1.i();
        if ((i5 > 0 && e5 <= g5) || (i5 < 0 && g5 <= e5)) {
            while (!l0.g(k5, keyAtIndex(e5))) {
                if (e5 != g5) {
                    e5 += i5;
                }
            }
            if (v4 == valueAtKeyIndex(e5)) {
                return null;
            }
            Object[] objArr = this.buffer;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            l0.o(copyOf, "copyOf(this, size)");
            copyOf[e5 + 1] = v4;
            return new TrieNode(0, 0, copyOf).asUpdateResult();
        }
        return new TrieNode(0, 0, TrieNodeKt.access$insertEntryAtIndex(this.buffer, 0, k5, v4)).asInsertResult();
    }

    private final TrieNode<K, V> collisionRemove(K k5) {
        kotlin.ranges.l W1;
        j B1;
        W1 = u.W1(0, this.buffer.length);
        B1 = u.B1(W1, 2);
        int e5 = B1.e();
        int g5 = B1.g();
        int i5 = B1.i();
        if ((i5 > 0 && e5 <= g5) || (i5 < 0 && g5 <= e5)) {
            while (!l0.g(k5, keyAtIndex(e5))) {
                if (e5 != g5) {
                    e5 += i5;
                }
            }
            return collisionRemoveEntryAtIndex(e5);
        }
        return this;
    }

    private final TrieNode<K, V> collisionRemoveEntryAtIndex(int i5) {
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        return new TrieNode<>(0, 0, TrieNodeKt.access$removeEntryAtIndex(objArr, i5));
    }

    private final boolean elementsIdentityEquals(TrieNode<K, V> trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (this.nodeMap != trieNode.nodeMap || this.dataMap != trieNode.dataMap) {
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

    private final boolean hasNodeAt(int i5) {
        return (i5 & this.nodeMap) != 0;
    }

    private final TrieNode<K, V> insertEntryAt(int i5, K k5, V v4) {
        return new TrieNode<>(i5 | this.dataMap, this.nodeMap, TrieNodeKt.access$insertEntryAtIndex(this.buffer, entryKeyIndex$runtime_release(i5), k5, v4));
    }

    private final K keyAtIndex(int i5) {
        return (K) this.buffer[i5];
    }

    private final TrieNode<K, V> makeNode(int i5, K k5, V v4, int i6, K k6, V v5, int i7, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr;
        if (i7 > 30) {
            return new TrieNode<>(0, 0, new Object[]{k5, v4, k6, v5}, mutabilityOwnership);
        }
        int indexSegment = TrieNodeKt.indexSegment(i5, i7);
        int indexSegment2 = TrieNodeKt.indexSegment(i6, i7);
        if (indexSegment != indexSegment2) {
            if (indexSegment < indexSegment2) {
                objArr = new Object[]{k5, v4, k6, v5};
            } else {
                objArr = new Object[]{k6, v5, k5, v4};
            }
            return new TrieNode<>((1 << indexSegment) | (1 << indexSegment2), 0, objArr, mutabilityOwnership);
        }
        return new TrieNode<>(0, 1 << indexSegment, new Object[]{makeNode(i5, k5, v4, i6, k6, v5, i7 + 5, mutabilityOwnership)}, mutabilityOwnership);
    }

    private final TrieNode<K, V> moveEntryToNode(int i5, int i6, int i7, K k5, V v4, int i8) {
        return new TrieNode<>(this.dataMap ^ i6, i6 | this.nodeMap, bufferMoveEntryToNode(i5, i6, i7, k5, v4, i8, null));
    }

    private final TrieNode<K, V> mutableCollisionPut(K k5, V v4, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        kotlin.ranges.l W1;
        j B1;
        W1 = u.W1(0, this.buffer.length);
        B1 = u.B1(W1, 2);
        int e5 = B1.e();
        int g5 = B1.g();
        int i5 = B1.i();
        if ((i5 > 0 && e5 <= g5) || (i5 < 0 && g5 <= e5)) {
            while (!l0.g(k5, keyAtIndex(e5))) {
                if (e5 != g5) {
                    e5 += i5;
                }
            }
            persistentHashMapBuilder.setOperationResult$runtime_release(valueAtKeyIndex(e5));
            if (this.ownedBy == persistentHashMapBuilder.getOwnership()) {
                this.buffer[e5 + 1] = v4;
                return this;
            }
            persistentHashMapBuilder.setModCount$runtime_release(persistentHashMapBuilder.getModCount$runtime_release() + 1);
            Object[] objArr = this.buffer;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            l0.o(copyOf, "copyOf(this, size)");
            copyOf[e5 + 1] = v4;
            return new TrieNode<>(0, 0, copyOf, persistentHashMapBuilder.getOwnership());
        }
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() + 1);
        return new TrieNode<>(0, 0, TrieNodeKt.access$insertEntryAtIndex(this.buffer, 0, k5, v4), persistentHashMapBuilder.getOwnership());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final TrieNode<K, V> mutableCollisionPutAll(TrieNode<K, V> trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        kotlin.ranges.l W1;
        j B1;
        if (this.nodeMap == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        CommonFunctionsKt.m3350assert(z4);
        if (this.dataMap == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        CommonFunctionsKt.m3350assert(z5);
        if (trieNode.nodeMap == 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        CommonFunctionsKt.m3350assert(z6);
        if (trieNode.dataMap == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        CommonFunctionsKt.m3350assert(z7);
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + trieNode.buffer.length);
        l0.o(copyOf, "copyOf(this, newSize)");
        int length = this.buffer.length;
        W1 = u.W1(0, trieNode.buffer.length);
        B1 = u.B1(W1, 2);
        int e5 = B1.e();
        int g5 = B1.g();
        int i5 = B1.i();
        if ((i5 > 0 && e5 <= g5) || (i5 < 0 && g5 <= e5)) {
            while (true) {
                if (!collisionContainsKey(trieNode.buffer[e5])) {
                    Object[] objArr2 = trieNode.buffer;
                    copyOf[length] = objArr2[e5];
                    copyOf[length + 1] = objArr2[e5 + 1];
                    length += 2;
                } else {
                    deltaCounter.setCount(deltaCounter.getCount() + 1);
                }
                if (e5 == g5) {
                    break;
                }
                e5 += i5;
            }
        }
        if (length == this.buffer.length) {
            return this;
        }
        if (length != trieNode.buffer.length) {
            if (length == copyOf.length) {
                return new TrieNode<>(0, 0, copyOf, mutabilityOwnership);
            }
            Object[] copyOf2 = Arrays.copyOf(copyOf, length);
            l0.o(copyOf2, "copyOf(this, newSize)");
            return new TrieNode<>(0, 0, copyOf2, mutabilityOwnership);
        }
        return trieNode;
    }

    private final TrieNode<K, V> mutableCollisionRemove(K k5, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        kotlin.ranges.l W1;
        j B1;
        W1 = u.W1(0, this.buffer.length);
        B1 = u.B1(W1, 2);
        int e5 = B1.e();
        int g5 = B1.g();
        int i5 = B1.i();
        if ((i5 > 0 && e5 <= g5) || (i5 < 0 && g5 <= e5)) {
            while (!l0.g(k5, keyAtIndex(e5))) {
                if (e5 != g5) {
                    e5 += i5;
                }
            }
            return mutableCollisionRemoveEntryAtIndex(e5, persistentHashMapBuilder);
        }
        return this;
    }

    private final TrieNode<K, V> mutableCollisionRemoveEntryAtIndex(int i5, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() - 1);
        persistentHashMapBuilder.setOperationResult$runtime_release(valueAtKeyIndex(i5));
        if (this.buffer.length == 2) {
            return null;
        }
        if (this.ownedBy == persistentHashMapBuilder.getOwnership()) {
            this.buffer = TrieNodeKt.access$removeEntryAtIndex(this.buffer, i5);
            return this;
        }
        return new TrieNode<>(0, 0, TrieNodeKt.access$removeEntryAtIndex(this.buffer, i5), persistentHashMapBuilder.getOwnership());
    }

    private final TrieNode<K, V> mutableInsertEntryAt(int i5, K k5, V v4, MutabilityOwnership mutabilityOwnership) {
        int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(i5);
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer = TrieNodeKt.access$insertEntryAtIndex(this.buffer, entryKeyIndex$runtime_release, k5, v4);
            this.dataMap = i5 | this.dataMap;
            return this;
        }
        return new TrieNode<>(i5 | this.dataMap, this.nodeMap, TrieNodeKt.access$insertEntryAtIndex(this.buffer, entryKeyIndex$runtime_release, k5, v4), mutabilityOwnership);
    }

    private final TrieNode<K, V> mutableMoveEntryToNode(int i5, int i6, int i7, K k5, V v4, int i8, MutabilityOwnership mutabilityOwnership) {
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer = bufferMoveEntryToNode(i5, i6, i7, k5, v4, i8, mutabilityOwnership);
            this.dataMap ^= i6;
            this.nodeMap |= i6;
            return this;
        }
        return new TrieNode<>(this.dataMap ^ i6, i6 | this.nodeMap, bufferMoveEntryToNode(i5, i6, i7, k5, v4, i8, mutabilityOwnership), mutabilityOwnership);
    }

    private final TrieNode<K, V> mutablePutAllFromOtherNodeCell(TrieNode<K, V> trieNode, int i5, int i6, DeltaCounter deltaCounter, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        int i7;
        int i8;
        int i9 = 0;
        if (hasNodeAt(i5)) {
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release(i5));
            if (trieNode.hasNodeAt(i5)) {
                return nodeAtIndex$runtime_release.mutablePutAll(trieNode.nodeAtIndex$runtime_release(trieNode.nodeIndex$runtime_release(i5)), i6 + 5, deltaCounter, persistentHashMapBuilder);
            }
            if (trieNode.hasEntryAt$runtime_release(i5)) {
                int entryKeyIndex$runtime_release = trieNode.entryKeyIndex$runtime_release(i5);
                K keyAtIndex = trieNode.keyAtIndex(entryKeyIndex$runtime_release);
                V valueAtKeyIndex = trieNode.valueAtKeyIndex(entryKeyIndex$runtime_release);
                int size = persistentHashMapBuilder.size();
                if (keyAtIndex != null) {
                    i9 = keyAtIndex.hashCode();
                }
                TrieNode<K, V> mutablePut = nodeAtIndex$runtime_release.mutablePut(i9, keyAtIndex, valueAtKeyIndex, i6 + 5, persistentHashMapBuilder);
                if (persistentHashMapBuilder.size() == size) {
                    deltaCounter.setCount(deltaCounter.getCount() + 1);
                    return mutablePut;
                }
                return mutablePut;
            }
            return nodeAtIndex$runtime_release;
        }
        if (trieNode.hasNodeAt(i5)) {
            TrieNode<K, V> nodeAtIndex$runtime_release2 = trieNode.nodeAtIndex$runtime_release(trieNode.nodeIndex$runtime_release(i5));
            if (hasEntryAt$runtime_release(i5)) {
                int entryKeyIndex$runtime_release2 = entryKeyIndex$runtime_release(i5);
                K keyAtIndex2 = keyAtIndex(entryKeyIndex$runtime_release2);
                if (keyAtIndex2 != null) {
                    i8 = keyAtIndex2.hashCode();
                } else {
                    i8 = 0;
                }
                int i10 = i6 + 5;
                if (nodeAtIndex$runtime_release2.containsKey(i8, keyAtIndex2, i10)) {
                    deltaCounter.setCount(deltaCounter.getCount() + 1);
                } else {
                    V valueAtKeyIndex2 = valueAtKeyIndex(entryKeyIndex$runtime_release2);
                    if (keyAtIndex2 != null) {
                        i9 = keyAtIndex2.hashCode();
                    }
                    return nodeAtIndex$runtime_release2.mutablePut(i9, keyAtIndex2, valueAtKeyIndex2, i10, persistentHashMapBuilder);
                }
            }
            return nodeAtIndex$runtime_release2;
        }
        int entryKeyIndex$runtime_release3 = entryKeyIndex$runtime_release(i5);
        K keyAtIndex3 = keyAtIndex(entryKeyIndex$runtime_release3);
        V valueAtKeyIndex3 = valueAtKeyIndex(entryKeyIndex$runtime_release3);
        int entryKeyIndex$runtime_release4 = trieNode.entryKeyIndex$runtime_release(i5);
        K keyAtIndex4 = trieNode.keyAtIndex(entryKeyIndex$runtime_release4);
        V valueAtKeyIndex4 = trieNode.valueAtKeyIndex(entryKeyIndex$runtime_release4);
        if (keyAtIndex3 != null) {
            i7 = keyAtIndex3.hashCode();
        } else {
            i7 = 0;
        }
        if (keyAtIndex4 != null) {
            i9 = keyAtIndex4.hashCode();
        }
        return makeNode(i7, keyAtIndex3, valueAtKeyIndex3, i9, keyAtIndex4, valueAtKeyIndex4, i6 + 5, persistentHashMapBuilder.getOwnership());
    }

    private final TrieNode<K, V> mutableRemoveEntryAtIndex(int i5, int i6, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() - 1);
        persistentHashMapBuilder.setOperationResult$runtime_release(valueAtKeyIndex(i5));
        if (this.buffer.length == 2) {
            return null;
        }
        if (this.ownedBy == persistentHashMapBuilder.getOwnership()) {
            this.buffer = TrieNodeKt.access$removeEntryAtIndex(this.buffer, i5);
            this.dataMap ^= i6;
            return this;
        }
        return new TrieNode<>(i6 ^ this.dataMap, this.nodeMap, TrieNodeKt.access$removeEntryAtIndex(this.buffer, i5), persistentHashMapBuilder.getOwnership());
    }

    private final TrieNode<K, V> mutableRemoveNodeAtIndex(int i5, int i6, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer = TrieNodeKt.access$removeNodeAtIndex(objArr, i5);
            this.nodeMap ^= i6;
            return this;
        }
        return new TrieNode<>(this.dataMap, i6 ^ this.nodeMap, TrieNodeKt.access$removeNodeAtIndex(objArr, i5), mutabilityOwnership);
    }

    private final TrieNode<K, V> mutableReplaceNode(TrieNode<K, V> trieNode, TrieNode<K, V> trieNode2, int i5, int i6, MutabilityOwnership mutabilityOwnership) {
        if (trieNode2 == null) {
            return mutableRemoveNodeAtIndex(i5, i6, mutabilityOwnership);
        }
        if (this.ownedBy != mutabilityOwnership && trieNode == trieNode2) {
            return this;
        }
        return mutableUpdateNodeAtIndex(i5, trieNode2, mutabilityOwnership);
    }

    private final TrieNode<K, V> mutableUpdateNodeAtIndex(int i5, TrieNode<K, V> trieNode, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1 && trieNode.buffer.length == 2 && trieNode.nodeMap == 0) {
            trieNode.dataMap = this.nodeMap;
            return trieNode;
        }
        if (this.ownedBy == mutabilityOwnership) {
            objArr[i5] = trieNode;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        copyOf[i5] = trieNode;
        return new TrieNode<>(this.dataMap, this.nodeMap, copyOf, mutabilityOwnership);
    }

    private final TrieNode<K, V> mutableUpdateValueAtIndex(int i5, V v4, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        if (this.ownedBy == persistentHashMapBuilder.getOwnership()) {
            this.buffer[i5 + 1] = v4;
            return this;
        }
        persistentHashMapBuilder.setModCount$runtime_release(persistentHashMapBuilder.getModCount$runtime_release() + 1);
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        copyOf[i5 + 1] = v4;
        return new TrieNode<>(this.dataMap, this.nodeMap, copyOf, persistentHashMapBuilder.getOwnership());
    }

    private final TrieNode<K, V> removeEntryAtIndex(int i5, int i6) {
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        return new TrieNode<>(i6 ^ this.dataMap, this.nodeMap, TrieNodeKt.access$removeEntryAtIndex(objArr, i5));
    }

    private final TrieNode<K, V> removeNodeAtIndex(int i5, int i6) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        return new TrieNode<>(this.dataMap, i6 ^ this.nodeMap, TrieNodeKt.access$removeNodeAtIndex(objArr, i5));
    }

    private final TrieNode<K, V> replaceNode(TrieNode<K, V> trieNode, TrieNode<K, V> trieNode2, int i5, int i6) {
        if (trieNode2 == null) {
            return removeNodeAtIndex(i5, i6);
        }
        if (trieNode != trieNode2) {
            return updateNodeAtIndex(i5, i6, trieNode2);
        }
        return this;
    }

    private final TrieNode<K, V> updateNodeAtIndex(int i5, int i6, TrieNode<K, V> trieNode) {
        Object[] objArr = trieNode.buffer;
        if (objArr.length == 2 && trieNode.nodeMap == 0) {
            if (this.buffer.length == 1) {
                trieNode.dataMap = this.nodeMap;
                return trieNode;
            }
            return new TrieNode<>(this.dataMap ^ i6, i6 ^ this.nodeMap, TrieNodeKt.access$replaceNodeWithEntry(this.buffer, i5, entryKeyIndex$runtime_release(i6), objArr[0], objArr[1]));
        }
        Object[] objArr2 = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
        l0.o(copyOf, "copyOf(this, newSize)");
        copyOf[i5] = trieNode;
        return new TrieNode<>(this.dataMap, this.nodeMap, copyOf);
    }

    private final TrieNode<K, V> updateValueAtIndex(int i5, V v4) {
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        copyOf[i5 + 1] = v4;
        return new TrieNode<>(this.dataMap, this.nodeMap, copyOf);
    }

    private final V valueAtKeyIndex(int i5) {
        return (V) this.buffer[i5 + 1];
    }

    public final void accept$runtime_release(@l s<? super TrieNode<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, r2> sVar) {
        accept(sVar, 0, 0);
    }

    public final boolean containsKey(int i5, K k5, int i6) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i5, i6);
        if (hasEntryAt$runtime_release(indexSegment)) {
            return l0.g(k5, keyAtIndex(entryKeyIndex$runtime_release(indexSegment)));
        }
        if (hasNodeAt(indexSegment)) {
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release(indexSegment));
            if (i6 == 30) {
                return nodeAtIndex$runtime_release.collisionContainsKey(k5);
            }
            return nodeAtIndex$runtime_release.containsKey(i5, k5, i6 + 5);
        }
        return false;
    }

    public final int entryCount$runtime_release() {
        return Integer.bitCount(this.dataMap);
    }

    public final int entryKeyIndex$runtime_release(int i5) {
        return Integer.bitCount((i5 - 1) & this.dataMap) * 2;
    }

    @m
    public final V get(int i5, K k5, int i6) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i5, i6);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            if (!l0.g(k5, keyAtIndex(entryKeyIndex$runtime_release))) {
                return null;
            }
            return valueAtKeyIndex(entryKeyIndex$runtime_release);
        }
        if (!hasNodeAt(indexSegment)) {
            return null;
        }
        TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release(indexSegment));
        if (i6 == 30) {
            return nodeAtIndex$runtime_release.collisionGet(k5);
        }
        return nodeAtIndex$runtime_release.get(i5, k5, i6 + 5);
    }

    @l
    public final Object[] getBuffer$runtime_release() {
        return this.buffer;
    }

    public final boolean hasEntryAt$runtime_release(int i5) {
        return (i5 & this.dataMap) != 0;
    }

    @l
    public final TrieNode<K, V> mutablePut(int i5, K k5, V v4, int i6, @l PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        TrieNode<K, V> mutablePut;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i5, i6);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            if (l0.g(k5, keyAtIndex(entryKeyIndex$runtime_release))) {
                persistentHashMapBuilder.setOperationResult$runtime_release(valueAtKeyIndex(entryKeyIndex$runtime_release));
                if (valueAtKeyIndex(entryKeyIndex$runtime_release) == v4) {
                    return this;
                }
                return mutableUpdateValueAtIndex(entryKeyIndex$runtime_release, v4, persistentHashMapBuilder);
            }
            persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() + 1);
            return mutableMoveEntryToNode(entryKeyIndex$runtime_release, indexSegment, i5, k5, v4, i6, persistentHashMapBuilder.getOwnership());
        }
        if (hasNodeAt(indexSegment)) {
            int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
            if (i6 == 30) {
                mutablePut = nodeAtIndex$runtime_release.mutableCollisionPut(k5, v4, persistentHashMapBuilder);
            } else {
                mutablePut = nodeAtIndex$runtime_release.mutablePut(i5, k5, v4, i6 + 5, persistentHashMapBuilder);
            }
            if (nodeAtIndex$runtime_release == mutablePut) {
                return this;
            }
            return mutableUpdateNodeAtIndex(nodeIndex$runtime_release, mutablePut, persistentHashMapBuilder.getOwnership());
        }
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() + 1);
        return mutableInsertEntryAt(indexSegment, k5, v4, persistentHashMapBuilder.getOwnership());
    }

    @l
    public final TrieNode<K, V> mutablePutAll(@l TrieNode<K, V> trieNode, int i5, @l DeltaCounter deltaCounter, @l PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        boolean z4;
        TrieNode<K, V> trieNode2;
        if (this == trieNode) {
            deltaCounter.plusAssign(calculateSize());
            return this;
        }
        if (i5 > 30) {
            return mutableCollisionPutAll(trieNode, deltaCounter, persistentHashMapBuilder.getOwnership());
        }
        int i6 = this.nodeMap | trieNode.nodeMap;
        int i7 = this.dataMap;
        int i8 = trieNode.dataMap;
        int i9 = (i7 ^ i8) & (~i6);
        int i10 = i7 & i8;
        int i11 = i9;
        while (i10 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i10);
            if (l0.g(keyAtIndex(entryKeyIndex$runtime_release(lowestOneBit)), trieNode.keyAtIndex(trieNode.entryKeyIndex$runtime_release(lowestOneBit)))) {
                i11 |= lowestOneBit;
            } else {
                i6 |= lowestOneBit;
            }
            i10 ^= lowestOneBit;
        }
        int i12 = 0;
        if ((i6 & i11) == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (l0.g(this.ownedBy, persistentHashMapBuilder.getOwnership()) && this.dataMap == i11 && this.nodeMap == i6) {
                trieNode2 = this;
            } else {
                trieNode2 = new TrieNode<>(i11, i6, new Object[(Integer.bitCount(i11) * 2) + Integer.bitCount(i6)]);
            }
            int i13 = i6;
            int i14 = 0;
            while (i13 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr = trieNode2.buffer;
                objArr[(objArr.length - 1) - i14] = mutablePutAllFromOtherNodeCell(trieNode, lowestOneBit2, i5, deltaCounter, persistentHashMapBuilder);
                i14++;
                i13 ^= lowestOneBit2;
            }
            while (i11 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i11);
                int i15 = i12 * 2;
                if (!trieNode.hasEntryAt$runtime_release(lowestOneBit3)) {
                    int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(lowestOneBit3);
                    trieNode2.buffer[i15] = keyAtIndex(entryKeyIndex$runtime_release);
                    trieNode2.buffer[i15 + 1] = valueAtKeyIndex(entryKeyIndex$runtime_release);
                } else {
                    int entryKeyIndex$runtime_release2 = trieNode.entryKeyIndex$runtime_release(lowestOneBit3);
                    trieNode2.buffer[i15] = trieNode.keyAtIndex(entryKeyIndex$runtime_release2);
                    trieNode2.buffer[i15 + 1] = trieNode.valueAtKeyIndex(entryKeyIndex$runtime_release2);
                    if (hasEntryAt$runtime_release(lowestOneBit3)) {
                        deltaCounter.setCount(deltaCounter.getCount() + 1);
                    }
                }
                i12++;
                i11 ^= lowestOneBit3;
            }
            if (elementsIdentityEquals(trieNode2)) {
                return this;
            }
            if (trieNode.elementsIdentityEquals(trieNode2)) {
                return trieNode;
            }
            return trieNode2;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @m
    public final TrieNode<K, V> mutableRemove(int i5, K k5, int i6, @l PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        TrieNode<K, V> mutableRemove;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i5, i6);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            return l0.g(k5, keyAtIndex(entryKeyIndex$runtime_release)) ? mutableRemoveEntryAtIndex(entryKeyIndex$runtime_release, indexSegment, persistentHashMapBuilder) : this;
        }
        if (!hasNodeAt(indexSegment)) {
            return this;
        }
        int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
        TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
        if (i6 == 30) {
            mutableRemove = nodeAtIndex$runtime_release.mutableCollisionRemove(k5, persistentHashMapBuilder);
        } else {
            mutableRemove = nodeAtIndex$runtime_release.mutableRemove(i5, k5, i6 + 5, persistentHashMapBuilder);
        }
        return mutableReplaceNode(nodeAtIndex$runtime_release, mutableRemove, nodeIndex$runtime_release, indexSegment, persistentHashMapBuilder.getOwnership());
    }

    @l
    public final TrieNode<K, V> nodeAtIndex$runtime_release(int i5) {
        Object obj = this.buffer[i5];
        l0.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (TrieNode) obj;
    }

    public final int nodeIndex$runtime_release(int i5) {
        return (this.buffer.length - 1) - Integer.bitCount((i5 - 1) & this.nodeMap);
    }

    @m
    public final ModificationResult<K, V> put(int i5, K k5, V v4, int i6) {
        ModificationResult<K, V> put;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i5, i6);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            if (l0.g(k5, keyAtIndex(entryKeyIndex$runtime_release))) {
                if (valueAtKeyIndex(entryKeyIndex$runtime_release) == v4) {
                    return null;
                }
                return updateValueAtIndex(entryKeyIndex$runtime_release, v4).asUpdateResult();
            }
            return moveEntryToNode(entryKeyIndex$runtime_release, indexSegment, i5, k5, v4, i6).asInsertResult();
        }
        if (hasNodeAt(indexSegment)) {
            int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
            if (i6 == 30) {
                put = nodeAtIndex$runtime_release.collisionPut(k5, v4);
                if (put == null) {
                    return null;
                }
            } else {
                put = nodeAtIndex$runtime_release.put(i5, k5, v4, i6 + 5);
                if (put == null) {
                    return null;
                }
            }
            put.setNode(updateNodeAtIndex(nodeIndex$runtime_release, indexSegment, put.getNode()));
            return put;
        }
        return insertEntryAt(indexSegment, k5, v4).asInsertResult();
    }

    @m
    public final TrieNode<K, V> remove(int i5, K k5, int i6) {
        TrieNode<K, V> remove;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i5, i6);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            return l0.g(k5, keyAtIndex(entryKeyIndex$runtime_release)) ? removeEntryAtIndex(entryKeyIndex$runtime_release, indexSegment) : this;
        }
        if (!hasNodeAt(indexSegment)) {
            return this;
        }
        int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
        TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
        if (i6 == 30) {
            remove = nodeAtIndex$runtime_release.collisionRemove(k5);
        } else {
            remove = nodeAtIndex$runtime_release.remove(i5, k5, i6 + 5);
        }
        return replaceNode(nodeAtIndex$runtime_release, remove, nodeIndex$runtime_release, indexSegment);
    }

    private final TrieNode<K, V> collisionRemove(K k5, V v4) {
        kotlin.ranges.l W1;
        j B1;
        W1 = u.W1(0, this.buffer.length);
        B1 = u.B1(W1, 2);
        int e5 = B1.e();
        int g5 = B1.g();
        int i5 = B1.i();
        if ((i5 > 0 && e5 <= g5) || (i5 < 0 && g5 <= e5)) {
            while (true) {
                if (!l0.g(k5, keyAtIndex(e5)) || !l0.g(v4, valueAtKeyIndex(e5))) {
                    if (e5 == g5) {
                        break;
                    }
                    e5 += i5;
                } else {
                    return collisionRemoveEntryAtIndex(e5);
                }
            }
        }
        return this;
    }

    private final TrieNode<K, V> mutableCollisionRemove(K k5, V v4, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        kotlin.ranges.l W1;
        j B1;
        W1 = u.W1(0, this.buffer.length);
        B1 = u.B1(W1, 2);
        int e5 = B1.e();
        int g5 = B1.g();
        int i5 = B1.i();
        if ((i5 > 0 && e5 <= g5) || (i5 < 0 && g5 <= e5)) {
            while (true) {
                if (!l0.g(k5, keyAtIndex(e5)) || !l0.g(v4, valueAtKeyIndex(e5))) {
                    if (e5 == g5) {
                        break;
                    }
                    e5 += i5;
                } else {
                    return mutableCollisionRemoveEntryAtIndex(e5, persistentHashMapBuilder);
                }
            }
        }
        return this;
    }

    public TrieNode(int i5, int i6, @l Object[] objArr) {
        this(i5, i6, objArr, null);
    }

    @m
    public final TrieNode<K, V> mutableRemove(int i5, K k5, V v4, int i6, @l PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        TrieNode<K, V> mutableRemove;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i5, i6);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            return (l0.g(k5, keyAtIndex(entryKeyIndex$runtime_release)) && l0.g(v4, valueAtKeyIndex(entryKeyIndex$runtime_release))) ? mutableRemoveEntryAtIndex(entryKeyIndex$runtime_release, indexSegment, persistentHashMapBuilder) : this;
        }
        if (!hasNodeAt(indexSegment)) {
            return this;
        }
        int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
        TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
        if (i6 == 30) {
            mutableRemove = nodeAtIndex$runtime_release.mutableCollisionRemove(k5, v4, persistentHashMapBuilder);
        } else {
            mutableRemove = nodeAtIndex$runtime_release.mutableRemove(i5, k5, v4, i6 + 5, persistentHashMapBuilder);
        }
        return mutableReplaceNode(nodeAtIndex$runtime_release, mutableRemove, nodeIndex$runtime_release, indexSegment, persistentHashMapBuilder.getOwnership());
    }

    @m
    public final TrieNode<K, V> remove(int i5, K k5, V v4, int i6) {
        TrieNode<K, V> remove;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i5, i6);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            return (l0.g(k5, keyAtIndex(entryKeyIndex$runtime_release)) && l0.g(v4, valueAtKeyIndex(entryKeyIndex$runtime_release))) ? removeEntryAtIndex(entryKeyIndex$runtime_release, indexSegment) : this;
        }
        if (!hasNodeAt(indexSegment)) {
            return this;
        }
        int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
        TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
        if (i6 == 30) {
            remove = nodeAtIndex$runtime_release.collisionRemove(k5, v4);
        } else {
            remove = nodeAtIndex$runtime_release.remove(i5, k5, v4, i6 + 5);
        }
        return replaceNode(nodeAtIndex$runtime_release, remove, nodeIndex$runtime_release, indexSegment);
    }
}
