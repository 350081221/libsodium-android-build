package kotlinx.coroutines.channels;

import com.umeng.analytics.pro.bi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.b1;
import kotlin.d1;
import kotlin.e1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.u1;
import kotlin.r2;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.channels.l;
import kotlinx.coroutines.channels.n;
import kotlinx.coroutines.internal.g1;
import kotlinx.coroutines.internal.q0;
import kotlinx.coroutines.internal.r0;
import kotlinx.coroutines.internal.s0;
import kotlinx.coroutines.internal.t0;
import kotlinx.coroutines.x0;
import kotlinx.coroutines.z3;

@kotlin.i0(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003\u008d\u0001@B8\u0012\u0007\u0010\u009b\u0001\u001a\u00020\t\u0012$\b\u0002\u0010\u009e\u0001\u001a\u001d\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u000100j\u000b\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u009c\u0001¢\u0006\u0006\bÝ\u0001\u0010Þ\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J9\u0010\r\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0010\u001a\u00020\u0004*\u00020\u000f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J%\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014JZ\u0010\u0019\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016H\u0082\b¢\u0006\u0004\b\u0019\u0010\u001aJG\u0010\u001e\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJG\u0010 \u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u000bH\u0003J\u0010\u0010$\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u000bH\u0002J\u001b\u0010%\u001a\u00020\u001c*\u00020\u001b2\u0006\u0010\u0003\u001a\u00028\u0000H\u0002¢\u0006\u0004\b%\u0010&J1\u0010(\u001a\u00028\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\"\u0010*\u001a\u00020\u0004*\u00020\u000f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0016\u0010+\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0002J@\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u000bH\u0082@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b-\u0010)J\u001f\u0010.\u001a\u00020\u00042\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000,0\u0011H\u0002ø\u0001\u0000Jù\u0001\u00109\u001a\u00028\u0001\"\u0004\b\u0001\u0010/2\b\u0010\u0015\u001a\u0004\u0018\u00010\u001b2!\u00103\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00028\u0001002Q\u00107\u001aM\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(5\u0012\u0013\u0012\u00110\t¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(6\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b('\u0012\u0004\u0012\u00028\u0001042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00162S\b\u0002\u00108\u001aM\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(5\u0012\u0013\u0012\u00110\t¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(6\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b('\u0012\u0004\u0012\u00028\u000104H\u0082\b¢\u0006\u0004\b9\u0010:J`\u0010;\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000f2!\u00103\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u0004002\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016H\u0082\bJ2\u0010<\u001a\u0004\u0018\u00010\u001b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u001bH\u0002J2\u0010=\u001a\u0004\u0018\u00010\u001b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u001bH\u0002J\"\u0010>\u001a\u00020\u001c*\u00020\u001b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010?\u001a\u00020\u0004H\u0002J&\u0010A\u001a\u00020\u001c2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010@\u001a\u00020\u000bH\u0002J&\u0010B\u001a\u00020\u001c2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010@\u001a\u00020\u000bH\u0002J\u0012\u0010D\u001a\u00020\u00042\b\b\u0002\u0010C\u001a\u00020\u000bH\u0002J#\u0010G\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u00002\n\u0010F\u001a\u0006\u0012\u0002\b\u00030EH\u0002¢\u0006\u0004\bG\u0010HJ\u001e\u0010K\u001a\u0004\u0018\u00010\u001b2\b\u0010I\u001a\u0004\u0018\u00010\u001b2\b\u0010J\u001a\u0004\u0018\u00010\u001bH\u0002J\u001e\u0010L\u001a\u00020\u00042\n\u0010F\u001a\u0006\u0012\u0002\b\u00030E2\b\u0010I\u001a\u0004\u0018\u00010\u001bH\u0002J\u0014\u0010M\u001a\u00020\u00042\n\u0010F\u001a\u0006\u0012\u0002\b\u00030EH\u0002J\u001e\u0010N\u001a\u0004\u0018\u00010\u001b2\b\u0010I\u001a\u0004\u0018\u00010\u001b2\b\u0010J\u001a\u0004\u0018\u00010\u001bH\u0002J\u001e\u0010O\u001a\u0004\u0018\u00010\u001b2\b\u0010I\u001a\u0004\u0018\u00010\u001b2\b\u0010J\u001a\u0004\u0018\u00010\u001bH\u0002J\u001e\u0010P\u001a\u0004\u0018\u00010\u001b2\b\u0010I\u001a\u0004\u0018\u00010\u001b2\b\u0010J\u001a\u0004\u0018\u00010\u001bH\u0002J\b\u0010Q\u001a\u00020\u0004H\u0002J\b\u0010R\u001a\u00020\u0004H\u0002J\b\u0010S\u001a\u00020\u0004H\u0002J\b\u0010T\u001a\u00020\u0004H\u0002J\b\u0010U\u001a\u00020\u0004H\u0002J\u0016\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010V\u001a\u00020\u000bH\u0002J\u0010\u0010X\u001a\u00020\u00042\u0006\u0010V\u001a\u00020\u000bH\u0002J\u000e\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002J\u0016\u0010[\u001a\u00020\u000b2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002J\u0016\u0010\\\u001a\u00020\u00042\f\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002J\u001e\u0010^\u001a\u00020\u00042\f\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010]\u001a\u00020\u000bH\u0002J\f\u0010_\u001a\u00020\u0004*\u00020\u000fH\u0002J\f\u0010`\u001a\u00020\u0004*\u00020\u000fH\u0002J\u0014\u0010b\u001a\u00020\u0004*\u00020\u000f2\u0006\u0010a\u001a\u00020\u001cH\u0002J\u0018\u0010e\u001a\u00020\u001c2\u0006\u0010c\u001a\u00020\u000b2\u0006\u0010d\u001a\u00020\u001cH\u0002J&\u0010g\u001a\u00020\u001c2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010f\u001a\u00020\u000bH\u0002J&\u0010j\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u0006\u0010h\u001a\u00020\u000b2\f\u0010i\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002J&\u0010k\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u0006\u0010h\u001a\u00020\u000b2\f\u0010i\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002J.\u0010m\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u0006\u0010h\u001a\u00020\u000b2\f\u0010i\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010l\u001a\u00020\u000bH\u0002J\u001e\u0010n\u001a\u00020\u00042\u0006\u0010h\u001a\u00020\u000b2\f\u0010i\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002J\u0010\u0010p\u001a\u00020\u00042\u0006\u0010o\u001a\u00020\u000bH\u0002J\u0010\u0010q\u001a\u00020\u00042\u0006\u0010o\u001a\u00020\u000bH\u0002J\u001b\u0010r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\br\u0010\u0006J&\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00040,2\u0006\u0010\u0003\u001a\u00028\u0000H\u0016ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\bs\u0010tJ\u001b\u0010u\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00028\u0000H\u0090@ø\u0001\u0000¢\u0006\u0004\bu\u0010\u0006Jì\u0001\u0010x\u001a\u00028\u0001\"\u0004\b\u0001\u0010/2\u0006\u0010\u0003\u001a\u00028\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u001b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00162<\u00107\u001a8\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(5\u0012\u0013\u0012\u00110\t¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(6\u0012\u0004\u0012\u00028\u00010v2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00162h\b\u0002\u00108\u001ab\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(5\u0012\u0013\u0012\u00110\t¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(6\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00028\u00010wH\u0084\b¢\u0006\u0004\bx\u0010yJ\u000f\u0010z\u001a\u00020\u001cH\u0010¢\u0006\u0004\bz\u0010{J\b\u0010|\u001a\u00020\u0004H\u0014J\b\u0010}\u001a\u00020\u0004H\u0014J\u0013\u0010~\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b~\u0010\u007fJ$\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000,H\u0096@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0005\b\u0080\u0001\u0010\u007fJ!\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000,H\u0016ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u0012\u0010\u0084\u0001\u001a\u00020\u00042\u0007\u0010\u0083\u0001\u001a\u00020\u000bH\u0004J\u001a\u0010\u0085\u0001\u001a\u00020\u00042\u0006\u0010f\u001a\u00020\u000bH\u0000¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001f\u0010\u0087\u0001\u001a\u00020\u00042\n\u0010F\u001a\u0006\u0012\u0002\b\u00030E2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001bH\u0014J\u0011\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0088\u0001H\u0096\u0002J\t\u0010\u008a\u0001\u001a\u00020\u0004H\u0014J\u0014\u0010\u0001\u001a\u00020\u001c2\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008b\u0001H\u0016J\u0013\u0010\u008d\u0001\u001a\u00020\u001c2\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008b\u0001J\u0007\u0010\u008e\u0001\u001a\u00020\u0004J\u001a\u0010\u008e\u0001\u001a\u00020\u00042\u0011\u0010\u008c\u0001\u001a\f\u0018\u00010\u008f\u0001j\u0005\u0018\u0001`\u0090\u0001J\u001e\u0010\u0091\u0001\u001a\u00020\u001c2\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008b\u0001H\u0010¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u001e\u0010\u0093\u0001\u001a\u00020\u001c2\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008b\u00012\u0007\u0010\u008e\u0001\u001a\u00020\u001cH\u0014J1\u0010\u0095\u0001\u001a\u00020\u00042&\u0010\u0094\u0001\u001a!\u0012\u0017\u0012\u0015\u0018\u00010\u008b\u0001¢\u0006\r\b1\u0012\t\b2\u0012\u0005\b\b(\u008c\u0001\u0012\u0004\u0012\u00020\u000400H\u0016J\u0011\u0010\u0096\u0001\u001a\u00020\u001cH\u0000¢\u0006\u0005\b\u0096\u0001\u0010{J\n\u0010\u0098\u0001\u001a\u00030\u0097\u0001H\u0016J\u0013\u0010\u0099\u0001\u001a\u00030\u0097\u0001H\u0000¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u0006\u0010/\u001a\u00020\u0004R\u0017\u0010\u009b\u0001\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u0095\u0001R1\u0010\u009e\u0001\u001a\u001d\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u000100j\u000b\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u009c\u00018\u0000X\u0081\u0004¢\u0006\u0007\n\u0005\b@\u0010\u009d\u0001R\u0084\u0001\u0010¦\u0001\u001ag\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030E¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(F\u0012\u0016\u0012\u0014\u0018\u00010\u001b¢\u0006\r\b1\u0012\t\b2\u0012\u0005\b\b(\u009f\u0001\u0012\u0016\u0012\u0014\u0018\u00010\u001b¢\u0006\r\b1\u0012\t\b2\u0012\u0005\b\b( \u0001\u0012\u0011\u0012\u000f\u0012\u0005\u0012\u00030\u008b\u0001\u0012\u0004\u0012\u00020\u000400\u0018\u000104j\u0005\u0018\u0001`¡\u00018\u0002X\u0082\u0004¢\u0006\u0010\n\u0006\b¢\u0001\u0010£\u0001\u0012\u0006\b¤\u0001\u0010¥\u0001R\u0017\u0010©\u0001\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\b\u001a\u0006\b§\u0001\u0010¨\u0001R\u0016\u0010«\u0001\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bª\u0001\u0010{R\u0018\u0010®\u0001\u001a\u00030\u008b\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u001b\u0010±\u0001\u001a\u00020\u001c*\u00020\u000b8BX\u0082\u0004¢\u0006\b\u001a\u0006\b¯\u0001\u0010°\u0001R\u001b\u0010³\u0001\u001a\u00020\u001c*\u00020\u000b8BX\u0082\u0004¢\u0006\b\u001a\u0006\b²\u0001\u0010°\u0001R\u0016\u0010]\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\b\u001a\u0006\b´\u0001\u0010¨\u0001R\u0017\u0010¶\u0001\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\b\u001a\u0006\bµ\u0001\u0010¨\u0001R2\u0010»\u0001\u001a\u0015\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000·\u00018VX\u0096\u0004¢\u0006\u0010\u0012\u0006\bº\u0001\u0010¥\u0001\u001a\u0006\b¸\u0001\u0010¹\u0001R%\u0010¿\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000¼\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0006\b¾\u0001\u0010¥\u0001\u001a\u0005\b'\u0010½\u0001R.\u0010Á\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000,0¼\u00018VX\u0096\u0004ø\u0001\u0000¢\u0006\u000f\u0012\u0006\bÀ\u0001\u0010¥\u0001\u001a\u0005\b\f\u0010½\u0001R(\u0010Ä\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u00000¼\u00018VX\u0096\u0004¢\u0006\u0010\u0012\u0006\bÃ\u0001\u0010¥\u0001\u001a\u0006\bÂ\u0001\u0010½\u0001R\u001a\u0010Æ\u0001\u001a\u0005\u0018\u00010\u008b\u00018DX\u0084\u0004¢\u0006\b\u001a\u0006\bÅ\u0001\u0010\u00ad\u0001R\u0018\u0010È\u0001\u001a\u00030\u008b\u00018DX\u0084\u0004¢\u0006\b\u001a\u0006\bÇ\u0001\u0010\u00ad\u0001R\u0016\u0010Ê\u0001\u001a\u00020\u001c8TX\u0094\u0004¢\u0006\u0007\u001a\u0005\bÉ\u0001\u0010{R\u001e\u0010Í\u0001\u001a\u00020\u001c8VX\u0097\u0004¢\u0006\u000f\u0012\u0006\bÌ\u0001\u0010¥\u0001\u001a\u0005\bË\u0001\u0010{R\u001d\u0010d\u001a\u00020\u001c8VX\u0097\u0004¢\u0006\u000f\u0012\u0006\bÏ\u0001\u0010¥\u0001\u001a\u0005\bÎ\u0001\u0010{R\u001e\u0010Ð\u0001\u001a\u00020\u001c8VX\u0097\u0004¢\u0006\u000f\u0012\u0006\bÑ\u0001\u0010¥\u0001\u001a\u0005\bÐ\u0001\u0010{R\u0015\u0010Ó\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001b0Ò\u00018\u0002X\u0082\u0004R\r\u0010Õ\u0001\u001a\u00030Ô\u00018\u0002X\u0082\u0004R\u0019\u0010Ö\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070Ò\u00018\u0002X\u0082\u0004R\u0015\u0010×\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001b0Ò\u00018\u0002X\u0082\u0004R\r\u0010Ø\u0001\u001a\u00030Ô\u00018\u0002X\u0082\u0004R\u0019\u0010Ù\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070Ò\u00018\u0002X\u0082\u0004R\r\u0010Ú\u0001\u001a\u00030Ô\u00018\u0002X\u0082\u0004R\u0019\u0010Û\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070Ò\u00018\u0002X\u0082\u0004R\r\u0010Ü\u0001\u001a\u00030Ô\u00018\u0002X\u0082\u0004\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006ß\u0001"}, d2 = {"Lkotlinx/coroutines/channels/j;", "E", "Lkotlinx/coroutines/channels/l;", "element", "Lkotlin/r2;", "N0", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/r;", "segment", "", "index", "", bi.aE, "q1", "(Lkotlinx/coroutines/channels/r;ILjava/lang/Object;JLkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/z3;", "S0", "Lkotlinx/coroutines/p;", "cont", "O0", "(Ljava/lang/Object;Lkotlinx/coroutines/p;)V", "waiter", "Lkotlin/Function0;", "onRendezvousOrBuffered", "onClosed", "p1", "(Lkotlinx/coroutines/channels/r;ILjava/lang/Object;JLkotlinx/coroutines/z3;Lv3/a;Lv3/a;)V", "", "", "closed", "B1", "(Lkotlinx/coroutines/channels/r;ILjava/lang/Object;JLjava/lang/Object;Z)I", "C1", "curSendersAndCloseStatus", "r1", "curSenders", "O", "u1", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "r", "d1", "(Lkotlinx/coroutines/channels/r;IJLkotlin/coroutines/d;)Ljava/lang/Object;", "R0", "K0", "Lkotlinx/coroutines/channels/p;", "Z0", "J0", "R", "Lkotlin/Function1;", "Lkotlin/v0;", "name", "onElementRetrieved", "Lkotlin/Function3;", "segm", "i", "onSuspend", "onNoWaiterSuspend", "a1", "(Ljava/lang/Object;Lv3/l;Lv3/q;Lv3/a;Lv3/q;)Ljava/lang/Object;", "c1", "z1", "A1", com.alipay.sdk.m.x.c.f3016c, "Y", "b", "x1", "y1", "nAttempts", "p0", "Lkotlinx/coroutines/selects/m;", "select", "M0", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/m;)V", "ignoredParam", "selectResult", "W0", "e1", "L0", "T0", "V0", "U0", "r0", "G0", "F0", "E0", "W", "sendersCur", "V", "U", "S", "lastSegment", "D0", "g1", "sendersCounter", "Q", "h1", "i1", "receiver", "j1", "sendersAndCloseStatusCur", "isClosedForReceive", "t0", "globalIndex", "s0", "id", "startFrom", "b0", "a0", "currentBufferEndCounter", "Z", "H0", t0.b.f22420d, "E1", "D1", "F", bi.aA, "(Ljava/lang/Object;)Ljava/lang/Object;", "l1", "Lkotlin/Function2;", "Lkotlin/Function4;", "n1", "(Ljava/lang/Object;Ljava/lang/Object;Lv3/a;Lv3/p;Lv3/a;Lv3/r;)Ljava/lang/Object;", "s1", "()Z", "Q0", "P0", "D", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "x", "v", "()Ljava/lang/Object;", "globalCellIndex", "X", "F1", "(J)V", "f1", "Lkotlinx/coroutines/channels/n;", "iterator", "I0", "", "cause", bi.ay, "cancel", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "P", "(Ljava/lang/Throwable;)Z", "T", "handler", "I", "o0", "", "toString", "t1", "()Ljava/lang/String;", "capacity", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "Lv3/l;", "onUndeliveredElement", "param", "internalResult", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "c", "Lv3/q;", "getOnUndeliveredElementReceiveCancellationConstructor$annotations", "()V", "onUndeliveredElementReceiveCancellationConstructor", "d0", "()J", "bufferEndCounter", "A0", "isRendezvousOrUnlimited", "k0", "()Ljava/lang/Throwable;", "receiveException", "x0", "(J)Z", "isClosedForSend0", "v0", "isClosedForReceive0", "n0", "l0", "receiversCounter", "Lkotlinx/coroutines/selects/i;", "l", "()Lkotlinx/coroutines/selects/i;", "getOnSend$annotations", "onSend", "Lkotlinx/coroutines/selects/g;", "()Lkotlinx/coroutines/selects/g;", "getOnReceive$annotations", "onReceive", "getOnReceiveCatching$annotations", "onReceiveCatching", bi.aL, "getOnReceiveOrNull$annotations", "onReceiveOrNull", "e0", "closeCause", "m0", "sendException", "y0", "isConflatedDropOldest", "G", "isClosedForSend$annotations", "isClosedForSend", "f", "isClosedForReceive$annotations", "isEmpty", "isEmpty$annotations", "Lkotlinx/atomicfu/AtomicRef;", "_closeCause", "Lkotlinx/atomicfu/AtomicLong;", "bufferEnd", "bufferEndSegment", "closeHandler", "completedExpandBuffersAndPauseFlag", "receiveSegment", "receivers", "sendSegment", "sendersAndCloseStatus", "<init>", "(ILv3/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannelKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 5 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 6 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 7 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$sendImpl$1\n+ 8 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$receiveImpl$1\n+ 9 InlineList.kt\nkotlinx/coroutines/internal/InlineList\n+ 10 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,3055:1\n273#1,6:3058\n280#1,68:3065\n374#1,18:3156\n244#1:3174\n269#1,10:3175\n280#1,48:3186\n395#1:3234\n334#1,14:3235\n399#1,3:3250\n244#1:3263\n269#1,10:3264\n280#1,68:3275\n244#1:3353\n269#1,10:3354\n280#1,68:3365\n244#1:3437\n269#1,10:3438\n280#1,68:3449\n886#1,52:3519\n964#1,8:3575\n858#1:3583\n882#1,33:3584\n974#1:3617\n916#1,14:3618\n935#1,3:3633\n979#1,6:3636\n886#1,52:3650\n964#1,8:3706\n858#1:3714\n882#1,33:3715\n974#1:3748\n916#1,14:3749\n935#1,3:3764\n979#1,6:3767\n858#1:3782\n882#1,48:3783\n935#1,3:3832\n858#1:3835\n882#1,48:3836\n935#1,3:3885\n244#1:3897\n269#1,10:3898\n280#1,68:3909\n858#1:3978\n882#1,48:3979\n935#1,3:4028\n1#2:3056\n3038#3:3057\n3038#3:3064\n3038#3:3185\n3038#3:3274\n3038#3:3364\n3038#3:3436\n3038#3:3448\n3038#3:3518\n3038#3:3781\n3038#3:3888\n3038#3:3889\n3052#3:3890\n3052#3:3891\n3051#3:3892\n3051#3:3893\n3051#3:3894\n3052#3:3895\n3051#3:3896\n3038#3:3908\n3039#3:4031\n3038#3:4032\n3038#3:4033\n3038#3:4034\n3039#3:4035\n3038#3:4036\n3039#3:4059\n3038#3:4060\n3038#3:4061\n3039#3:4062\n3038#3:4112\n3039#3:4113\n3039#3:4114\n3039#3:4132\n3039#3:4133\n314#4,9:3133\n323#4,2:3150\n332#4,4:3152\n336#4,8:3253\n314#4,9:3344\n323#4,2:3434\n332#4,4:3571\n336#4,8:3642\n332#4,4:3702\n336#4,8:3773\n218#5:3142\n219#5:3145\n218#5:3146\n219#5:3149\n61#6,2:3143\n61#6,2:3147\n61#6,2:3261\n269#7:3249\n269#7:3343\n269#7:3433\n269#7:3517\n269#7:3977\n882#8:3632\n882#8:3763\n882#8:3831\n882#8:3884\n882#8:4027\n37#9,11:4037\n37#9,11:4048\n72#10,3:4063\n46#10,8:4066\n72#10,3:4074\n46#10,8:4077\n46#10,8:4085\n72#10,3:4093\n46#10,8:4096\n46#10,8:4104\n766#11:4115\n857#11,2:4116\n2310#11,14:4118\n766#11:4134\n857#11,2:4135\n2310#11,14:4137\n766#11:4151\n857#11,2:4152\n2310#11,14:4154\n*S KotlinDebug\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n*L\n113#1:3058,6\n113#1:3065,68\n154#1:3156,18\n154#1:3174\n154#1:3175,10\n154#1:3186,48\n154#1:3234\n154#1:3235,14\n154#1:3250,3\n194#1:3263\n194#1:3264,10\n194#1:3275,68\n225#1:3353\n225#1:3354,10\n225#1:3365,68\n391#1:3437\n391#1:3438,10\n391#1:3449,68\n667#1:3519,52\n696#1:3575,8\n696#1:3583\n696#1:3584,33\n696#1:3617\n696#1:3618,14\n696#1:3633,3\n696#1:3636,6\n732#1:3650,52\n748#1:3706,8\n748#1:3714\n748#1:3715,33\n748#1:3748\n748#1:3749,14\n748#1:3764,3\n748#1:3767,6\n781#1:3782\n781#1:3783,48\n781#1:3832,3\n971#1:3835\n971#1:3836,48\n971#1:3885,3\n1464#1:3897\n1464#1:3898,10\n1464#1:3909,68\n1512#1:3978\n1512#1:3979,48\n1512#1:4028,3\n70#1:3057\n113#1:3064\n154#1:3185\n194#1:3274\n225#1:3364\n278#1:3436\n391#1:3448\n606#1:3518\n771#1:3781\n1007#1:3888\n1056#1:3889\n1374#1:3890\n1376#1:3891\n1406#1:3892\n1416#1:3893\n1425#1:3894\n1426#1:3895\n1433#1:3896\n1464#1:3908\n1865#1:4031\n1867#1:4032\n1869#1:4033\n1882#1:4034\n1893#1:4035\n1894#1:4036\n2196#1:4059\n2209#1:4060\n2219#1:4061\n2222#1:4062\n2539#1:4112\n2541#1:4113\n2566#1:4114\n2628#1:4132\n2629#1:4133\n134#1:3133,9\n134#1:3150,2\n153#1:3152,4\n153#1:3253,8\n221#1:3344,9\n221#1:3434,2\n695#1:3571,4\n695#1:3642,8\n746#1:3702,4\n746#1:3773,8\n138#1:3142\n138#1:3145\n141#1:3146\n141#1:3149\n138#1:3143,2\n141#1:3147,2\n183#1:3261,2\n154#1:3249\n194#1:3343\n225#1:3433\n391#1:3517\n1464#1:3977\n696#1:3632\n748#1:3763\n781#1:3831\n971#1:3884\n1512#1:4027\n2098#1:4037,11\n2153#1:4048,11\n2361#1:4063,3\n2361#1:4066,8\n2416#1:4074,3\n2416#1:4077,8\n2435#1:4085,8\n2465#1:4093,3\n2465#1:4096,8\n2526#1:4104,8\n2575#1:4115\n2575#1:4116,2\n2576#1:4118,14\n2640#1:4134\n2640#1:4135,2\n2641#1:4137,14\n2681#1:4151\n2681#1:4152,2\n2682#1:4154,14\n*E\n"})
/* loaded from: classes4.dex */
public class j<E> implements kotlinx.coroutines.channels.l<E> {

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    private static final AtomicLongFieldUpdater f19881d = AtomicLongFieldUpdater.newUpdater(j.class, "sendersAndCloseStatus");

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private static final AtomicLongFieldUpdater f19882e = AtomicLongFieldUpdater.newUpdater(j.class, "receivers");

    /* renamed from: f, reason: collision with root package name */
    @p4.l
    private static final AtomicLongFieldUpdater f19883f = AtomicLongFieldUpdater.newUpdater(j.class, "bufferEnd");

    /* renamed from: g, reason: collision with root package name */
    @p4.l
    private static final AtomicLongFieldUpdater f19884g = AtomicLongFieldUpdater.newUpdater(j.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: h, reason: collision with root package name */
    @p4.l
    private static final AtomicReferenceFieldUpdater f19885h = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "sendSegment");

    /* renamed from: i, reason: collision with root package name */
    @p4.l
    private static final AtomicReferenceFieldUpdater f19886i = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "receiveSegment");

    /* renamed from: j, reason: collision with root package name */
    @p4.l
    private static final AtomicReferenceFieldUpdater f19887j = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "bufferEndSegment");

    /* renamed from: k, reason: collision with root package name */
    @p4.l
    private static final AtomicReferenceFieldUpdater f19888k = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_closeCause");

    /* renamed from: l, reason: collision with root package name */
    @p4.l
    private static final AtomicReferenceFieldUpdater f19889l = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "closeHandler");

    @u3.w
    @p4.m
    private volatile Object _closeCause;

    /* renamed from: a, reason: collision with root package name */
    private final int f19890a;

    /* renamed from: b, reason: collision with root package name */
    @p4.m
    @u3.e
    public final v3.l<E, r2> f19891b;

    @u3.w
    private volatile long bufferEnd;

    @u3.w
    @p4.m
    private volatile Object bufferEndSegment;

    /* renamed from: c, reason: collision with root package name */
    @p4.m
    private final v3.q<kotlinx.coroutines.selects.m<?>, Object, Object, v3.l<Throwable, r2>> f19892c;

    @u3.w
    @p4.m
    private volatile Object closeHandler;

    @u3.w
    private volatile long completedExpandBuffersAndPauseFlag;

    @u3.w
    @p4.m
    private volatile Object receiveSegment;

    @u3.w
    private volatile long receivers;

    @u3.w
    @p4.m
    private volatile Object sendSegment;

    @u3.w
    private volatile long sendersAndCloseStatus;

    /* JADX INFO: Access modifiers changed from: private */
    @kotlin.i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002B\u0007¢\u0006\u0004\b \u0010!J\b\u0010\u0004\u001a\u00020\u0003H\u0002J1\u0010\u000b\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000e\u001a\u00020\rH\u0002J\u0013\u0010\u000f\u001a\u00020\u0003H\u0096Bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0012\u001a\u00020\r2\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u0013\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0018\u001a\u00020\rR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lkotlinx/coroutines/channels/j$a;", "Lkotlinx/coroutines/channels/n;", "Lkotlinx/coroutines/z3;", "", "i", "Lkotlinx/coroutines/channels/r;", "segment", "", "index", "", "r", bi.aJ, "(Lkotlinx/coroutines/channels/r;IJLkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/r2;", "j", "c", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/q0;", "b", "next", "()Ljava/lang/Object;", "element", "k", "(Ljava/lang/Object;)Z", "l", "", bi.ay, "Ljava/lang/Object;", "receiveResult", "Lkotlinx/coroutines/q;", "Lkotlinx/coroutines/q;", "continuation", "<init>", "(Lkotlinx/coroutines/channels/j;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator\n+ 2 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$receiveImpl$1\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3055:1\n886#2,52:3056\n964#2,8:3112\n858#2:3120\n882#2,33:3121\n974#2:3154\n916#2,14:3155\n935#2,3:3170\n979#2,6:3173\n332#3,4:3108\n336#3,8:3179\n882#4:3169\n61#5,2:3187\n61#5,2:3190\n1#6:3189\n*S KotlinDebug\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator\n*L\n1590#1:3056,52\n1627#1:3112,8\n1627#1:3120\n1627#1:3121,33\n1627#1:3154\n1627#1:3155,14\n1627#1:3170,3\n1627#1:3173,6\n1625#1:3108,4\n1625#1:3179,8\n1627#1:3169\n1663#1:3187,2\n1708#1:3190,2\n*E\n"})
    /* loaded from: classes4.dex */
    public final class a implements kotlinx.coroutines.channels.n<E>, z3 {

        /* renamed from: a, reason: collision with root package name */
        @p4.m
        private Object f19893a = kotlinx.coroutines.channels.k.m();

        /* renamed from: b, reason: collision with root package name */
        @p4.m
        private kotlinx.coroutines.q<? super Boolean> f19894b;

        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object h(r<E> rVar, int i5, long j5, kotlin.coroutines.d<? super Boolean> dVar) {
            kotlin.coroutines.d e5;
            Boolean a5;
            Object l5;
            j<E> jVar = j.this;
            e5 = kotlin.coroutines.intrinsics.c.e(dVar);
            kotlinx.coroutines.q b5 = kotlinx.coroutines.s.b(e5);
            try {
                this.f19894b = b5;
                Object z12 = jVar.z1(rVar, i5, j5, this);
                if (z12 == kotlinx.coroutines.channels.k.r()) {
                    jVar.R0(this, rVar, i5);
                } else {
                    v3.l<Throwable, r2> lVar = null;
                    if (z12 == kotlinx.coroutines.channels.k.h()) {
                        if (j5 < jVar.n0()) {
                            rVar.b();
                        }
                        r rVar2 = (r) j.f19886i.get(jVar);
                        while (true) {
                            if (jVar.f()) {
                                j();
                                break;
                            }
                            long andIncrement = j.f19882e.getAndIncrement(jVar);
                            int i6 = kotlinx.coroutines.channels.k.f19899b;
                            long j6 = andIncrement / i6;
                            int i7 = (int) (andIncrement % i6);
                            if (rVar2.f20383c != j6) {
                                r a02 = jVar.a0(j6, rVar2);
                                if (a02 != null) {
                                    rVar2 = a02;
                                }
                            }
                            Object z13 = jVar.z1(rVar2, i7, andIncrement, this);
                            if (z13 == kotlinx.coroutines.channels.k.r()) {
                                jVar.R0(this, rVar2, i7);
                                break;
                            }
                            if (z13 == kotlinx.coroutines.channels.k.h()) {
                                if (andIncrement < jVar.n0()) {
                                    rVar2.b();
                                }
                            } else if (z13 != kotlinx.coroutines.channels.k.s()) {
                                rVar2.b();
                                this.f19893a = z13;
                                this.f19894b = null;
                                a5 = kotlin.coroutines.jvm.internal.b.a(true);
                                v3.l<E, r2> lVar2 = jVar.f19891b;
                                if (lVar2 != null) {
                                    lVar = kotlinx.coroutines.internal.k0.a(lVar2, z13, b5.getContext());
                                }
                            } else {
                                throw new IllegalStateException("unexpected".toString());
                            }
                        }
                    } else {
                        rVar.b();
                        this.f19893a = z12;
                        this.f19894b = null;
                        a5 = kotlin.coroutines.jvm.internal.b.a(true);
                        v3.l<E, r2> lVar3 = jVar.f19891b;
                        if (lVar3 != null) {
                            lVar = kotlinx.coroutines.internal.k0.a(lVar3, z12, b5.getContext());
                        }
                    }
                    b5.C(a5, lVar);
                }
                Object E = b5.E();
                l5 = kotlin.coroutines.intrinsics.d.l();
                if (E == l5) {
                    kotlin.coroutines.jvm.internal.h.c(dVar);
                }
                return E;
            } catch (Throwable th) {
                b5.R();
                throw th;
            }
        }

        private final boolean i() {
            this.f19893a = kotlinx.coroutines.channels.k.z();
            Throwable e02 = j.this.e0();
            if (e02 == null) {
                return false;
            }
            throw s0.o(e02);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void j() {
            kotlinx.coroutines.q<? super Boolean> qVar = this.f19894b;
            l0.m(qVar);
            this.f19894b = null;
            this.f19893a = kotlinx.coroutines.channels.k.z();
            Throwable e02 = j.this.e0();
            if (e02 == null) {
                d1.a aVar = d1.Companion;
                qVar.resumeWith(d1.m6444constructorimpl(Boolean.FALSE));
            } else {
                d1.a aVar2 = d1.Companion;
                qVar.resumeWith(d1.m6444constructorimpl(e1.a(e02)));
            }
        }

        @Override // kotlinx.coroutines.channels.n
        @u3.h(name = "next")
        @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        public /* synthetic */ Object a(kotlin.coroutines.d dVar) {
            return n.a.a(this, dVar);
        }

        @Override // kotlinx.coroutines.z3
        public void b(@p4.l q0<?> q0Var, int i5) {
            kotlinx.coroutines.q<? super Boolean> qVar = this.f19894b;
            if (qVar != null) {
                qVar.b(q0Var, i5);
            }
        }

        @Override // kotlinx.coroutines.channels.n
        @p4.m
        public Object c(@p4.l kotlin.coroutines.d<? super Boolean> dVar) {
            r<E> rVar;
            j<E> jVar = j.this;
            r<E> rVar2 = (r) j.f19886i.get(jVar);
            while (!jVar.f()) {
                long andIncrement = j.f19882e.getAndIncrement(jVar);
                int i5 = kotlinx.coroutines.channels.k.f19899b;
                long j5 = andIncrement / i5;
                int i6 = (int) (andIncrement % i5);
                if (rVar2.f20383c != j5) {
                    r<E> a02 = jVar.a0(j5, rVar2);
                    if (a02 == null) {
                        continue;
                    } else {
                        rVar = a02;
                    }
                } else {
                    rVar = rVar2;
                }
                Object z12 = jVar.z1(rVar, i6, andIncrement, null);
                if (z12 != kotlinx.coroutines.channels.k.r()) {
                    if (z12 == kotlinx.coroutines.channels.k.h()) {
                        if (andIncrement < jVar.n0()) {
                            rVar.b();
                        }
                        rVar2 = rVar;
                    } else {
                        if (z12 == kotlinx.coroutines.channels.k.s()) {
                            return h(rVar, i6, andIncrement, dVar);
                        }
                        rVar.b();
                        this.f19893a = z12;
                        return kotlin.coroutines.jvm.internal.b.a(true);
                    }
                } else {
                    throw new IllegalStateException("unreachable".toString());
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(i());
        }

        public final boolean k(E e5) {
            kotlinx.coroutines.q<? super Boolean> qVar = this.f19894b;
            l0.m(qVar);
            v3.l<Throwable, r2> lVar = null;
            this.f19894b = null;
            this.f19893a = e5;
            Boolean bool = Boolean.TRUE;
            v3.l<E, r2> lVar2 = j.this.f19891b;
            if (lVar2 != null) {
                lVar = kotlinx.coroutines.internal.k0.a(lVar2, e5, qVar.getContext());
            }
            return kotlinx.coroutines.channels.k.u(qVar, bool, lVar);
        }

        public final void l() {
            kotlinx.coroutines.q<? super Boolean> qVar = this.f19894b;
            l0.m(qVar);
            this.f19894b = null;
            this.f19893a = kotlinx.coroutines.channels.k.z();
            Throwable e02 = j.this.e0();
            if (e02 == null) {
                d1.a aVar = d1.Companion;
                qVar.resumeWith(d1.m6444constructorimpl(Boolean.FALSE));
            } else {
                d1.a aVar2 = d1.Companion;
                qVar.resumeWith(d1.m6444constructorimpl(e1.a(e02)));
            }
        }

        @Override // kotlinx.coroutines.channels.n
        public E next() {
            boolean z4;
            E e5 = (E) this.f19893a;
            if (e5 != kotlinx.coroutines.channels.k.m()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                this.f19893a = kotlinx.coroutines.channels.k.m();
                if (e5 != kotlinx.coroutines.channels.k.z()) {
                    return e5;
                }
                throw s0.o(j.this.k0());
            }
            throw new IllegalStateException("`hasNext()` has not been invoked".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @kotlin.i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0001R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/channels/j$b;", "Lkotlinx/coroutines/z3;", "Lkotlinx/coroutines/internal/q0;", "segment", "", "index", "Lkotlin/r2;", "b", "Lkotlinx/coroutines/p;", "", bi.ay, "Lkotlinx/coroutines/p;", "()Lkotlinx/coroutines/p;", "cont", "<init>", "(Lkotlinx/coroutines/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class b implements z3 {

        /* renamed from: a, reason: collision with root package name */
        @p4.l
        private final kotlinx.coroutines.p<Boolean> f19896a;

        /* renamed from: b, reason: collision with root package name */
        private final /* synthetic */ kotlinx.coroutines.q<Boolean> f19897b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@p4.l kotlinx.coroutines.p<? super Boolean> pVar) {
            this.f19896a = pVar;
            l0.n(pVar, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlin.Boolean>");
            this.f19897b = (kotlinx.coroutines.q) pVar;
        }

        @p4.l
        public final kotlinx.coroutines.p<Boolean> a() {
            return this.f19896a;
        }

        @Override // kotlinx.coroutines.z3
        public void b(@p4.l q0<?> q0Var, int i5) {
            this.f19897b.b(q0Var, i5);
        }
    }

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    /* synthetic */ class c extends kotlin.jvm.internal.h0 implements v3.q<j<?>, kotlinx.coroutines.selects.m<?>, Object, r2> {
        public static final c INSTANCE = new c();

        c() {
            super(3, j.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // v3.q
        public /* bridge */ /* synthetic */ r2 invoke(j<?> jVar, kotlinx.coroutines.selects.m<?> mVar, Object obj) {
            invoke2(jVar, mVar, obj);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l j<?> jVar, @p4.l kotlinx.coroutines.selects.m<?> mVar, @p4.m Object obj) {
            jVar.e1(mVar, obj);
        }
    }

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    /* synthetic */ class d extends kotlin.jvm.internal.h0 implements v3.q<j<?>, Object, Object, Object> {
        public static final d INSTANCE = new d();

        d() {
            super(3, j.class, "processResultSelectReceive", "processResultSelectReceive(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // v3.q
        @p4.m
        public final Object invoke(@p4.l j<?> jVar, @p4.m Object obj, @p4.m Object obj2) {
            return jVar.T0(obj, obj2);
        }
    }

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    /* synthetic */ class e extends kotlin.jvm.internal.h0 implements v3.q<j<?>, kotlinx.coroutines.selects.m<?>, Object, r2> {
        public static final e INSTANCE = new e();

        e() {
            super(3, j.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // v3.q
        public /* bridge */ /* synthetic */ r2 invoke(j<?> jVar, kotlinx.coroutines.selects.m<?> mVar, Object obj) {
            invoke2(jVar, mVar, obj);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l j<?> jVar, @p4.l kotlinx.coroutines.selects.m<?> mVar, @p4.m Object obj) {
            jVar.e1(mVar, obj);
        }
    }

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    /* synthetic */ class f extends kotlin.jvm.internal.h0 implements v3.q<j<?>, Object, Object, Object> {
        public static final f INSTANCE = new f();

        f() {
            super(3, j.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // v3.q
        @p4.m
        public final Object invoke(@p4.l j<?> jVar, @p4.m Object obj, @p4.m Object obj2) {
            return jVar.U0(obj, obj2);
        }
    }

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    /* synthetic */ class g extends kotlin.jvm.internal.h0 implements v3.q<j<?>, kotlinx.coroutines.selects.m<?>, Object, r2> {
        public static final g INSTANCE = new g();

        g() {
            super(3, j.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // v3.q
        public /* bridge */ /* synthetic */ r2 invoke(j<?> jVar, kotlinx.coroutines.selects.m<?> mVar, Object obj) {
            invoke2(jVar, mVar, obj);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l j<?> jVar, @p4.l kotlinx.coroutines.selects.m<?> mVar, @p4.m Object obj) {
            jVar.e1(mVar, obj);
        }
    }

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    /* synthetic */ class h extends kotlin.jvm.internal.h0 implements v3.q<j<?>, Object, Object, Object> {
        public static final h INSTANCE = new h();

        h() {
            super(3, j.class, "processResultSelectReceiveOrNull", "processResultSelectReceiveOrNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // v3.q
        @p4.m
        public final Object invoke(@p4.l j<?> jVar, @p4.m Object obj, @p4.m Object obj2) {
            return jVar.V0(obj, obj2);
        }
    }

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    /* synthetic */ class i extends kotlin.jvm.internal.h0 implements v3.q<j<?>, kotlinx.coroutines.selects.m<?>, Object, r2> {
        public static final i INSTANCE = new i();

        i() {
            super(3, j.class, "registerSelectForSend", "registerSelectForSend(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // v3.q
        public /* bridge */ /* synthetic */ r2 invoke(j<?> jVar, kotlinx.coroutines.selects.m<?> mVar, Object obj) {
            invoke2(jVar, mVar, obj);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l j<?> jVar, @p4.l kotlinx.coroutines.selects.m<?> mVar, @p4.m Object obj) {
            jVar.f1(mVar, obj);
        }
    }

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.channels.j$j, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    /* synthetic */ class C0569j extends kotlin.jvm.internal.h0 implements v3.q<j<?>, Object, Object, Object> {
        public static final C0569j INSTANCE = new C0569j();

        C0569j() {
            super(3, j.class, "processResultSelectSend", "processResultSelectSend(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // v3.q
        @p4.m
        public final Object invoke(@p4.l j<?> jVar, @p4.m Object obj, @p4.m Object obj2) {
            return jVar.W0(obj, obj2);
        }
    }

    @kotlin.i0(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\"\u0004\b\u0000\u0010\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"E", "Lkotlinx/coroutines/selects/m;", "select", "", "<anonymous parameter 1>", "element", "Lkotlin/Function1;", "", "Lkotlin/r2;", "invoke", "(Lkotlinx/coroutines/selects/m;Ljava/lang/Object;Ljava/lang/Object;)Lv3/l;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    static final class k extends n0 implements v3.q<kotlinx.coroutines.selects.m<?>, Object, Object, v3.l<? super Throwable, ? extends r2>> {
        final /* synthetic */ j<E> this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"E", "", "it", "Lkotlin/r2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* loaded from: classes4.dex */
        public static final class a extends n0 implements v3.l<Throwable, r2> {
            final /* synthetic */ Object $element;
            final /* synthetic */ kotlinx.coroutines.selects.m<?> $select;
            final /* synthetic */ j<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, j<E> jVar, kotlinx.coroutines.selects.m<?> mVar) {
                super(1);
                this.$element = obj;
                this.this$0 = jVar;
                this.$select = mVar;
            }

            @Override // v3.l
            public /* bridge */ /* synthetic */ r2 invoke(Throwable th) {
                invoke2(th);
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@p4.l Throwable th) {
                if (this.$element != kotlinx.coroutines.channels.k.z()) {
                    kotlinx.coroutines.internal.k0.b(this.this$0.f19891b, this.$element, this.$select.getContext());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(j<E> jVar) {
            super(3);
            this.this$0 = jVar;
        }

        @Override // v3.q
        @p4.l
        public final v3.l<Throwable, r2> invoke(@p4.l kotlinx.coroutines.selects.m<?> mVar, @p4.m Object obj, @p4.m Object obj2) {
            return new a(obj2, this.this$0, mVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", i = {}, l = {739}, m = "receiveCatching-JP2dKIU$suspendImpl", n = {}, s = {})
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class l<E> extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ j<E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(j<E> jVar, kotlin.coroutines.d<? super l> dVar) {
            super(dVar);
            this.this$0 = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object Y0 = j.Y0(this.this$0, this);
            l5 = kotlin.coroutines.intrinsics.d.l();
            return Y0 == l5 ? Y0 : p.b(Y0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", i = {0, 0, 0, 0}, l = {3056}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk", n = {"this", "segment", "index", "r"}, s = {"L$0", "L$1", "I$0", "J$0"})
    /* loaded from: classes4.dex */
    public static final class m extends kotlin.coroutines.jvm.internal.d {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ j<E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(j<E> jVar, kotlin.coroutines.d<? super m> dVar) {
            super(dVar);
            this.this$0 = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object Z0 = this.this$0.Z0(null, 0, 0L, this);
            l5 = kotlin.coroutines.intrinsics.d.l();
            return Z0 == l5 ? Z0 : p.b(Z0);
        }
    }

    @kotlin.i0(d1 = {"\u0000\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\u0010\u000b\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"R", "E", "Lkotlinx/coroutines/channels/r;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "", "invoke", "(Lkotlinx/coroutines/channels/r;IJ)Ljava/lang/Void;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$receiveImpl$1\n*L\n1#1,3055:1\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class n extends n0 implements v3.q {
        public static final n INSTANCE = new n();

        public n() {
            super(3);
        }

        @Override // v3.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((r) obj, ((Number) obj2).intValue(), ((Number) obj3).longValue());
        }

        @p4.l
        public final Void invoke(@p4.l r<E> rVar, int i5, long j5) {
            throw new IllegalStateException("unexpected".toString());
        }
    }

    @kotlin.i0(d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\u0010\f\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\b\u001a\u00020\u0007H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"R", "E", "Lkotlinx/coroutines/channels/r;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "<anonymous parameter 2>", "", "<anonymous parameter 3>", "", "invoke", "(Lkotlinx/coroutines/channels/r;ILjava/lang/Object;J)Ljava/lang/Void;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$sendImpl$1\n*L\n1#1,3055:1\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class o extends n0 implements v3.r {
        public static final o INSTANCE = new o();

        public o() {
            super(4);
        }

        @Override // v3.r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((r<int>) obj, ((Number) obj2).intValue(), (int) obj3, ((Number) obj4).longValue());
        }

        @p4.l
        public final Void invoke(@p4.l r<E> rVar, int i5, E e5, long j5) {
            throw new IllegalStateException("unexpected".toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(int i5, @p4.m v3.l<? super E, r2> lVar) {
        this.f19890a = i5;
        this.f19891b = lVar;
        if (i5 >= 0) {
            this.bufferEnd = kotlinx.coroutines.channels.k.t(i5);
            this.completedExpandBuffersAndPauseFlag = d0();
            r rVar = new r(0L, null, this, 3);
            this.sendSegment = rVar;
            this.receiveSegment = rVar;
            if (A0()) {
                rVar = kotlinx.coroutines.channels.k.n();
                l0.n(rVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment = rVar;
            this.f19892c = lVar != 0 ? new k(this) : null;
            this._closeCause = kotlinx.coroutines.channels.k.l();
            return;
        }
        throw new IllegalArgumentException(("Invalid channel capacity: " + i5 + ", should be >=0").toString());
    }

    private final boolean A0() {
        long d02 = d0();
        return d02 == 0 || d02 == Long.MAX_VALUE;
    }

    private final Object A1(r<E> rVar, int i5, long j5, Object obj) {
        while (true) {
            Object y4 = rVar.y(i5);
            if (y4 != null && y4 != kotlinx.coroutines.channels.k.k()) {
                if (y4 == kotlinx.coroutines.channels.k.f19903f) {
                    if (rVar.t(i5, y4, kotlinx.coroutines.channels.k.f())) {
                        Y();
                        return rVar.A(i5);
                    }
                } else {
                    if (y4 == kotlinx.coroutines.channels.k.j()) {
                        return kotlinx.coroutines.channels.k.h();
                    }
                    if (y4 == kotlinx.coroutines.channels.k.o()) {
                        return kotlinx.coroutines.channels.k.h();
                    }
                    if (y4 == kotlinx.coroutines.channels.k.z()) {
                        Y();
                        return kotlinx.coroutines.channels.k.h();
                    }
                    if (y4 != kotlinx.coroutines.channels.k.p() && rVar.t(i5, y4, kotlinx.coroutines.channels.k.q())) {
                        boolean z4 = y4 instanceof k0;
                        if (z4) {
                            y4 = ((k0) y4).f19924a;
                        }
                        if (v1(y4, rVar, i5)) {
                            rVar.C(i5, kotlinx.coroutines.channels.k.f());
                            Y();
                            return rVar.A(i5);
                        }
                        rVar.C(i5, kotlinx.coroutines.channels.k.j());
                        rVar.z(i5, false);
                        if (z4) {
                            Y();
                        }
                        return kotlinx.coroutines.channels.k.h();
                    }
                }
            } else if (j5 < (f19881d.get(this) & 1152921504606846975L)) {
                if (rVar.t(i5, y4, kotlinx.coroutines.channels.k.o())) {
                    Y();
                    return kotlinx.coroutines.channels.k.h();
                }
            } else {
                if (obj == null) {
                    return kotlinx.coroutines.channels.k.s();
                }
                if (rVar.t(i5, y4, obj)) {
                    Y();
                    return kotlinx.coroutines.channels.k.r();
                }
            }
        }
    }

    private final void B0(AtomicLongFieldUpdater atomicLongFieldUpdater, v3.l<? super Long, r2> lVar, Object obj) {
        while (true) {
            lVar.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int B1(r<E> rVar, int i5, E e5, long j5, Object obj, boolean z4) {
        rVar.D(i5, e5);
        if (z4) {
            return C1(rVar, i5, e5, j5, obj, z4);
        }
        Object y4 = rVar.y(i5);
        if (y4 == null) {
            if (O(j5)) {
                if (rVar.t(i5, null, kotlinx.coroutines.channels.k.f19903f)) {
                    return 1;
                }
            } else {
                if (obj == null) {
                    return 3;
                }
                if (rVar.t(i5, null, obj)) {
                    return 2;
                }
            }
        } else if (y4 instanceof z3) {
            rVar.u(i5);
            if (u1(y4, e5)) {
                rVar.C(i5, kotlinx.coroutines.channels.k.f());
                P0();
                return 0;
            }
            if (rVar.v(i5, kotlinx.coroutines.channels.k.i()) != kotlinx.coroutines.channels.k.i()) {
                rVar.z(i5, true);
            }
            return 5;
        }
        return C1(rVar, i5, e5, j5, obj, z4);
    }

    private final void C0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, v3.l<Object, r2> lVar, Object obj) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final int C1(r<E> rVar, int i5, E e5, long j5, Object obj, boolean z4) {
        while (true) {
            Object y4 = rVar.y(i5);
            if (y4 == null) {
                if (O(j5) && !z4) {
                    if (rVar.t(i5, null, kotlinx.coroutines.channels.k.f19903f)) {
                        return 1;
                    }
                } else if (z4) {
                    if (rVar.t(i5, null, kotlinx.coroutines.channels.k.j())) {
                        rVar.z(i5, false);
                        return 4;
                    }
                } else {
                    if (obj == null) {
                        return 3;
                    }
                    if (rVar.t(i5, null, obj)) {
                        return 2;
                    }
                }
            } else if (y4 == kotlinx.coroutines.channels.k.k()) {
                if (rVar.t(i5, y4, kotlinx.coroutines.channels.k.f19903f)) {
                    return 1;
                }
            } else {
                if (y4 == kotlinx.coroutines.channels.k.i()) {
                    rVar.u(i5);
                    return 5;
                }
                if (y4 == kotlinx.coroutines.channels.k.o()) {
                    rVar.u(i5);
                    return 5;
                }
                if (y4 == kotlinx.coroutines.channels.k.z()) {
                    rVar.u(i5);
                    W();
                    return 4;
                }
                rVar.u(i5);
                if (y4 instanceof k0) {
                    y4 = ((k0) y4).f19924a;
                }
                if (u1(y4, e5)) {
                    rVar.C(i5, kotlinx.coroutines.channels.k.f());
                    P0();
                    return 0;
                }
                if (rVar.v(i5, kotlinx.coroutines.channels.k.i()) != kotlinx.coroutines.channels.k.i()) {
                    rVar.z(i5, true);
                }
                return 5;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        r8 = (kotlinx.coroutines.channels.r) r8.g();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long D0(kotlinx.coroutines.channels.r<E> r8) {
        /*
            r7 = this;
        L0:
            int r0 = kotlinx.coroutines.channels.k.f19899b
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r3 = -1
            if (r3 >= r0) goto L3c
            long r3 = r8.f20383c
            int r5 = kotlinx.coroutines.channels.k.f19899b
            long r5 = (long) r5
            long r3 = r3 * r5
            long r5 = (long) r0
            long r3 = r3 + r5
            long r5 = r7.l0()
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L1a
            return r1
        L1a:
            java.lang.Object r1 = r8.y(r0)
            if (r1 == 0) goto L2c
            kotlinx.coroutines.internal.t0 r2 = kotlinx.coroutines.channels.k.k()
            if (r1 != r2) goto L27
            goto L2c
        L27:
            kotlinx.coroutines.internal.t0 r2 = kotlinx.coroutines.channels.k.f19903f
            if (r1 != r2) goto L39
            return r3
        L2c:
            kotlinx.coroutines.internal.t0 r2 = kotlinx.coroutines.channels.k.z()
            boolean r1 = r8.t(r0, r1, r2)
            if (r1 == 0) goto L1a
            r8.r()
        L39:
            int r0 = r0 + (-1)
            goto L4
        L3c:
            kotlinx.coroutines.internal.f r8 = r8.g()
            kotlinx.coroutines.channels.r r8 = (kotlinx.coroutines.channels.r) r8
            if (r8 != 0) goto L0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.j.D0(kotlinx.coroutines.channels.r):long");
    }

    private final void D1(long j5) {
        long j6;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f19882e;
        do {
            j6 = atomicLongFieldUpdater.get(this);
            if (j6 >= j5) {
                return;
            }
        } while (!f19882e.compareAndSet(this, j6, j5));
    }

    private final void E0() {
        long j5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f19881d;
        do {
            j5 = atomicLongFieldUpdater.get(this);
            if (((int) (j5 >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j5, kotlinx.coroutines.channels.k.b(1152921504606846975L & j5, 1)));
    }

    private final void E1(long j5) {
        long j6;
        long j7;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f19881d;
        do {
            j6 = atomicLongFieldUpdater.get(this);
            j7 = 1152921504606846975L & j6;
            if (j7 >= j5) {
                return;
            }
        } while (!f19881d.compareAndSet(this, j6, kotlinx.coroutines.channels.k.b(j7, (int) (j6 >> 60))));
    }

    private final void F0() {
        long j5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f19881d;
        do {
            j5 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j5, kotlinx.coroutines.channels.k.b(1152921504606846975L & j5, 3)));
    }

    private final void G0() {
        long j5;
        long b5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f19881d;
        do {
            j5 = atomicLongFieldUpdater.get(this);
            int i5 = (int) (j5 >> 60);
            if (i5 != 0) {
                if (i5 != 1) {
                    return;
                } else {
                    b5 = kotlinx.coroutines.channels.k.b(j5 & 1152921504606846975L, 3);
                }
            } else {
                b5 = kotlinx.coroutines.channels.k.b(j5 & 1152921504606846975L, 2);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j5, b5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void H0(long j5, r<E> rVar) {
        boolean z4;
        r<E> rVar2;
        r<E> rVar3;
        while (rVar.f20383c < j5 && (rVar3 = (r) rVar.e()) != null) {
            rVar = rVar3;
        }
        while (true) {
            if (rVar.h() && (rVar2 = (r) rVar.e()) != null) {
                rVar = rVar2;
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19887j;
                while (true) {
                    q0 q0Var = (q0) atomicReferenceFieldUpdater.get(this);
                    z4 = true;
                    if (q0Var.f20383c >= rVar.f20383c) {
                        break;
                    }
                    if (!rVar.s()) {
                        z4 = false;
                        break;
                    } else if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, q0Var, rVar)) {
                        if (q0Var.o()) {
                            q0Var.l();
                        }
                    } else if (rVar.o()) {
                        rVar.l();
                    }
                }
                if (z4) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J0(kotlinx.coroutines.p<? super p<? extends E>> pVar) {
        d1.a aVar = d1.Companion;
        pVar.resumeWith(d1.m6444constructorimpl(p.b(p.f19939b.a(e0()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K0(kotlinx.coroutines.p<? super E> pVar) {
        d1.a aVar = d1.Companion;
        pVar.resumeWith(d1.m6444constructorimpl(e1.a(k0())));
    }

    private final void L0(kotlinx.coroutines.selects.m<?> mVar) {
        mVar.e(kotlinx.coroutines.channels.k.z());
    }

    private final void M0(E e5, kotlinx.coroutines.selects.m<?> mVar) {
        v3.l<E, r2> lVar = this.f19891b;
        if (lVar != null) {
            kotlinx.coroutines.internal.k0.b(lVar, e5, mVar.getContext());
        }
        mVar.e(kotlinx.coroutines.channels.k.z());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object N0(E e5, kotlin.coroutines.d<? super r2> dVar) {
        kotlin.coroutines.d e6;
        Object l5;
        Object l6;
        g1 d5;
        e6 = kotlin.coroutines.intrinsics.c.e(dVar);
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(e6, 1);
        qVar.B();
        v3.l<E, r2> lVar = this.f19891b;
        if (lVar != null && (d5 = kotlinx.coroutines.internal.k0.d(lVar, e5, null, 2, null)) != null) {
            kotlin.p.a(d5, m0());
            d1.a aVar = d1.Companion;
            qVar.resumeWith(d1.m6444constructorimpl(e1.a(d5)));
        } else {
            Throwable m02 = m0();
            d1.a aVar2 = d1.Companion;
            qVar.resumeWith(d1.m6444constructorimpl(e1.a(m02)));
        }
        Object E = qVar.E();
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (E == l5) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        l6 = kotlin.coroutines.intrinsics.d.l();
        if (E == l6) {
            return E;
        }
        return r2.f19517a;
    }

    private final boolean O(long j5) {
        return j5 < d0() || j5 < l0() + ((long) this.f19890a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O0(E e5, kotlinx.coroutines.p<? super r2> pVar) {
        v3.l<E, r2> lVar = this.f19891b;
        if (lVar != null) {
            kotlinx.coroutines.internal.k0.b(lVar, e5, pVar.getContext());
        }
        Throwable m02 = m0();
        d1.a aVar = d1.Companion;
        pVar.resumeWith(d1.m6444constructorimpl(e1.a(m02)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void Q(r<E> rVar, long j5) {
        Object c5 = kotlinx.coroutines.internal.r.c(null, 1, null);
        loop0: while (rVar != null) {
            for (int i5 = kotlinx.coroutines.channels.k.f19899b - 1; -1 < i5; i5--) {
                if ((rVar.f20383c * kotlinx.coroutines.channels.k.f19899b) + i5 < j5) {
                    break loop0;
                }
                while (true) {
                    Object y4 = rVar.y(i5);
                    if (y4 != null && y4 != kotlinx.coroutines.channels.k.k()) {
                        if (y4 instanceof k0) {
                            if (rVar.t(i5, y4, kotlinx.coroutines.channels.k.z())) {
                                c5 = kotlinx.coroutines.internal.r.h(c5, ((k0) y4).f19924a);
                                rVar.z(i5, true);
                                break;
                            }
                        } else {
                            if (!(y4 instanceof z3)) {
                                break;
                            }
                            if (rVar.t(i5, y4, kotlinx.coroutines.channels.k.z())) {
                                c5 = kotlinx.coroutines.internal.r.h(c5, y4);
                                rVar.z(i5, true);
                                break;
                            }
                        }
                    } else if (rVar.t(i5, y4, kotlinx.coroutines.channels.k.z())) {
                        rVar.r();
                        break;
                    }
                }
            }
            rVar = (r) rVar.g();
        }
        if (c5 != null) {
            if (!(c5 instanceof ArrayList)) {
                h1((z3) c5);
                return;
            }
            l0.n(c5, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ArrayList arrayList = (ArrayList) c5;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                h1((z3) arrayList.get(size));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R0(z3 z3Var, r<E> rVar, int i5) {
        Q0();
        z3Var.b(rVar, i5);
    }

    private final r<E> S() {
        Object obj = f19887j.get(this);
        r rVar = (r) f19885h.get(this);
        if (rVar.f20383c > ((r) obj).f20383c) {
            obj = rVar;
        }
        r rVar2 = (r) f19886i.get(this);
        if (rVar2.f20383c > ((r) obj).f20383c) {
            obj = rVar2;
        }
        return (r) kotlinx.coroutines.internal.e.d((kotlinx.coroutines.internal.f) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S0(z3 z3Var, r<E> rVar, int i5) {
        z3Var.b(rVar, i5 + kotlinx.coroutines.channels.k.f19899b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object T0(Object obj, Object obj2) {
        if (obj2 != kotlinx.coroutines.channels.k.z()) {
            return obj2;
        }
        throw k0();
    }

    private final void U(long j5) {
        g1(V(j5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object U0(Object obj, Object obj2) {
        Object c5;
        if (obj2 == kotlinx.coroutines.channels.k.z()) {
            c5 = p.f19939b.a(e0());
        } else {
            c5 = p.f19939b.c(obj2);
        }
        return p.b(c5);
    }

    private final r<E> V(long j5) {
        r<E> S = S();
        if (y0()) {
            long D0 = D0(S);
            if (D0 != -1) {
                X(D0);
            }
        }
        Q(S, j5);
        return S;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object V0(Object obj, Object obj2) {
        if (obj2 == kotlinx.coroutines.channels.k.z()) {
            if (e0() == null) {
                return null;
            }
            throw k0();
        }
        return obj2;
    }

    private final void W() {
        G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object W0(Object obj, Object obj2) {
        if (obj2 != kotlinx.coroutines.channels.k.z()) {
            return this;
        }
        throw m0();
    }

    static /* synthetic */ <E> Object X0(j<E> jVar, kotlin.coroutines.d<? super E> dVar) {
        r<E> rVar;
        r<E> rVar2 = (r) f19886i.get(jVar);
        while (!jVar.f()) {
            long andIncrement = f19882e.getAndIncrement(jVar);
            int i5 = kotlinx.coroutines.channels.k.f19899b;
            long j5 = andIncrement / i5;
            int i6 = (int) (andIncrement % i5);
            if (rVar2.f20383c != j5) {
                r<E> a02 = jVar.a0(j5, rVar2);
                if (a02 == null) {
                    continue;
                } else {
                    rVar = a02;
                }
            } else {
                rVar = rVar2;
            }
            Object z12 = jVar.z1(rVar, i6, andIncrement, null);
            if (z12 != kotlinx.coroutines.channels.k.r()) {
                if (z12 == kotlinx.coroutines.channels.k.h()) {
                    if (andIncrement < jVar.n0()) {
                        rVar.b();
                    }
                    rVar2 = rVar;
                } else {
                    if (z12 == kotlinx.coroutines.channels.k.s()) {
                        return jVar.d1(rVar, i6, andIncrement, dVar);
                    }
                    rVar.b();
                    return z12;
                }
            } else {
                throw new IllegalStateException("unexpected".toString());
            }
        }
        throw s0.o(jVar.k0());
    }

    private final void Y() {
        if (A0()) {
            return;
        }
        r<E> rVar = (r) f19887j.get(this);
        while (true) {
            long andIncrement = f19883f.getAndIncrement(this);
            int i5 = kotlinx.coroutines.channels.k.f19899b;
            long j5 = andIncrement / i5;
            if (n0() <= andIncrement) {
                if (rVar.f20383c < j5 && rVar.e() != 0) {
                    H0(j5, rVar);
                }
                q0(this, 0L, 1, null);
                return;
            }
            if (rVar.f20383c != j5) {
                r<E> Z = Z(j5, rVar, andIncrement);
                if (Z == null) {
                    continue;
                } else {
                    rVar = Z;
                }
            }
            if (x1(rVar, (int) (andIncrement % i5), andIncrement)) {
                q0(this, 0L, 1, null);
                return;
            }
            q0(this, 0L, 1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ <E> java.lang.Object Y0(kotlinx.coroutines.channels.j<E> r14, kotlin.coroutines.d<? super kotlinx.coroutines.channels.p<? extends E>> r15) {
        /*
            boolean r0 = r15 instanceof kotlinx.coroutines.channels.j.l
            if (r0 == 0) goto L13
            r0 = r15
            kotlinx.coroutines.channels.j$l r0 = (kotlinx.coroutines.channels.j.l) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.j$l r0 = new kotlinx.coroutines.channels.j$l
            r0.<init>(r14, r15)
        L18:
            r6 = r0
            java.lang.Object r15 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            kotlin.e1.n(r15)
            kotlinx.coroutines.channels.p r15 = (kotlinx.coroutines.channels.p) r15
            java.lang.Object r14 = r15.o()
            goto Lb6
        L31:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L39:
            kotlin.e1.n(r15)
            r15 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = e()
            java.lang.Object r1 = r1.get(r14)
            kotlinx.coroutines.channels.r r1 = (kotlinx.coroutines.channels.r) r1
        L47:
            boolean r3 = r14.f()
            if (r3 == 0) goto L59
            kotlinx.coroutines.channels.p$b r15 = kotlinx.coroutines.channels.p.f19939b
            java.lang.Throwable r14 = r14.e0()
            java.lang.Object r14 = r15.a(r14)
            goto Lb6
        L59:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = g()
            long r4 = r3.getAndIncrement(r14)
            int r3 = kotlinx.coroutines.channels.k.f19899b
            long r7 = (long) r3
            long r7 = r4 / r7
            long r9 = (long) r3
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r1.f20383c
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r9 == 0) goto L79
            kotlinx.coroutines.channels.r r7 = b(r14, r7, r1)
            if (r7 != 0) goto L77
            goto L47
        L77:
            r13 = r7
            goto L7a
        L79:
            r13 = r1
        L7a:
            r7 = r14
            r8 = r13
            r9 = r3
            r10 = r4
            r12 = r15
            java.lang.Object r1 = M(r7, r8, r9, r10, r12)
            kotlinx.coroutines.internal.t0 r7 = kotlinx.coroutines.channels.k.r()
            if (r1 == r7) goto Lb7
            kotlinx.coroutines.internal.t0 r7 = kotlinx.coroutines.channels.k.h()
            if (r1 != r7) goto L9c
            long r7 = r14.n0()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L9a
            r13.b()
        L9a:
            r1 = r13
            goto L47
        L9c:
            kotlinx.coroutines.internal.t0 r15 = kotlinx.coroutines.channels.k.s()
            if (r1 != r15) goto Lad
            r6.label = r2
            r1 = r14
            r2 = r13
            java.lang.Object r14 = r1.Z0(r2, r3, r4, r6)
            if (r14 != r0) goto Lb6
            return r0
        Lad:
            r13.b()
            kotlinx.coroutines.channels.p$b r14 = kotlinx.coroutines.channels.p.f19939b
            java.lang.Object r14 = r14.c(r1)
        Lb6:
            return r14
        Lb7:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "unexpected"
            java.lang.String r15 = r15.toString()
            r14.<init>(r15)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.j.Y0(kotlinx.coroutines.channels.j, kotlin.coroutines.d):java.lang.Object");
    }

    private final r<E> Z(long j5, r<E> rVar, long j6) {
        Object g5;
        boolean z4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19887j;
        v3.p pVar = (v3.p) kotlinx.coroutines.channels.k.y();
        do {
            g5 = kotlinx.coroutines.internal.e.g(rVar, j5, pVar);
            if (r0.h(g5)) {
                break;
            }
            q0 f5 = r0.f(g5);
            while (true) {
                q0 q0Var = (q0) atomicReferenceFieldUpdater.get(this);
                if (q0Var.f20383c >= f5.f20383c) {
                    break;
                }
                if (!f5.s()) {
                    z4 = false;
                    break;
                }
                if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, q0Var, f5)) {
                    if (q0Var.o()) {
                        q0Var.l();
                    }
                } else if (f5.o()) {
                    f5.l();
                }
            }
            z4 = true;
        } while (!z4);
        if (r0.h(g5)) {
            W();
            H0(j5, rVar);
            q0(this, 0L, 1, null);
            return null;
        }
        r<E> rVar2 = (r) r0.f(g5);
        long j7 = rVar2.f20383c;
        if (j7 > j5) {
            int i5 = kotlinx.coroutines.channels.k.f19899b;
            if (f19883f.compareAndSet(this, j6 + 1, i5 * j7)) {
                p0((rVar2.f20383c * i5) - j6);
                return null;
            }
            q0(this, 0L, 1, null);
            return null;
        }
        return rVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z0(kotlinx.coroutines.channels.r<E> r11, int r12, long r13, kotlin.coroutines.d<? super kotlinx.coroutines.channels.p<? extends E>> r15) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.j.Z0(kotlinx.coroutines.channels.r, int, long, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r<E> a0(long j5, r<E> rVar) {
        Object g5;
        boolean z4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19886i;
        v3.p pVar = (v3.p) kotlinx.coroutines.channels.k.y();
        do {
            g5 = kotlinx.coroutines.internal.e.g(rVar, j5, pVar);
            if (!r0.h(g5)) {
                q0 f5 = r0.f(g5);
                while (true) {
                    q0 q0Var = (q0) atomicReferenceFieldUpdater.get(this);
                    z4 = true;
                    if (q0Var.f20383c >= f5.f20383c) {
                        break;
                    }
                    if (!f5.s()) {
                        z4 = false;
                        break;
                    }
                    if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, q0Var, f5)) {
                        if (q0Var.o()) {
                            q0Var.l();
                        }
                    } else if (f5.o()) {
                        f5.l();
                    }
                }
            } else {
                break;
            }
        } while (!z4);
        if (r0.h(g5)) {
            W();
            if (rVar.f20383c * kotlinx.coroutines.channels.k.f19899b >= n0()) {
                return null;
            }
            rVar.b();
            return null;
        }
        r<E> rVar2 = (r) r0.f(g5);
        if (!A0() && j5 <= d0() / kotlinx.coroutines.channels.k.f19899b) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f19887j;
            while (true) {
                q0 q0Var2 = (q0) atomicReferenceFieldUpdater2.get(this);
                if (q0Var2.f20383c >= rVar2.f20383c || !rVar2.s()) {
                    break;
                }
                if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater2, this, q0Var2, rVar2)) {
                    if (q0Var2.o()) {
                        q0Var2.l();
                    }
                } else if (rVar2.o()) {
                    rVar2.l();
                }
            }
        }
        long j6 = rVar2.f20383c;
        if (j6 > j5) {
            int i5 = kotlinx.coroutines.channels.k.f19899b;
            D1(j6 * i5);
            if (rVar2.f20383c * i5 >= n0()) {
                return null;
            }
            rVar2.b();
            return null;
        }
        return rVar2;
    }

    private final <R> R a1(Object obj, v3.l<? super E, ? extends R> lVar, v3.q<? super r<E>, ? super Integer, ? super Long, ? extends R> qVar, v3.a<? extends R> aVar, v3.q<? super r<E>, ? super Integer, ? super Long, ? extends R> qVar2) {
        z3 z3Var;
        r rVar = (r) f19886i.get(this);
        while (!f()) {
            long andIncrement = f19882e.getAndIncrement(this);
            int i5 = kotlinx.coroutines.channels.k.f19899b;
            long j5 = andIncrement / i5;
            int i6 = (int) (andIncrement % i5);
            if (rVar.f20383c != j5) {
                r a02 = a0(j5, rVar);
                if (a02 == null) {
                    continue;
                } else {
                    rVar = a02;
                }
            }
            t0 t0Var = (Object) z1(rVar, i6, andIncrement, obj);
            if (t0Var == kotlinx.coroutines.channels.k.r()) {
                if (obj instanceof z3) {
                    z3Var = (z3) obj;
                } else {
                    z3Var = null;
                }
                if (z3Var != null) {
                    R0(z3Var, rVar, i6);
                }
                return qVar.invoke(rVar, Integer.valueOf(i6), Long.valueOf(andIncrement));
            }
            if (t0Var == kotlinx.coroutines.channels.k.h()) {
                if (andIncrement < n0()) {
                    rVar.b();
                }
            } else {
                if (t0Var == kotlinx.coroutines.channels.k.s()) {
                    return qVar2.invoke(rVar, Integer.valueOf(i6), Long.valueOf(andIncrement));
                }
                rVar.b();
                return lVar.invoke(t0Var);
            }
        }
        return aVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r<E> b0(long j5, r<E> rVar) {
        Object g5;
        boolean z4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19885h;
        v3.p pVar = (v3.p) kotlinx.coroutines.channels.k.y();
        do {
            g5 = kotlinx.coroutines.internal.e.g(rVar, j5, pVar);
            if (!r0.h(g5)) {
                q0 f5 = r0.f(g5);
                while (true) {
                    q0 q0Var = (q0) atomicReferenceFieldUpdater.get(this);
                    z4 = true;
                    if (q0Var.f20383c >= f5.f20383c) {
                        break;
                    }
                    if (!f5.s()) {
                        z4 = false;
                        break;
                    }
                    if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, q0Var, f5)) {
                        if (q0Var.o()) {
                            q0Var.l();
                        }
                    } else if (f5.o()) {
                        f5.l();
                    }
                }
            } else {
                break;
            }
        } while (!z4);
        if (r0.h(g5)) {
            W();
            if (rVar.f20383c * kotlinx.coroutines.channels.k.f19899b >= l0()) {
                return null;
            }
            rVar.b();
            return null;
        }
        r<E> rVar2 = (r) r0.f(g5);
        long j6 = rVar2.f20383c;
        if (j6 > j5) {
            int i5 = kotlinx.coroutines.channels.k.f19899b;
            E1(j6 * i5);
            if (rVar2.f20383c * i5 >= l0()) {
                return null;
            }
            rVar2.b();
            return null;
        }
        return rVar2;
    }

    static /* synthetic */ Object b1(j jVar, Object obj, v3.l lVar, v3.q qVar, v3.a aVar, v3.q qVar2, int i5, Object obj2) {
        z3 z3Var;
        if (obj2 == null) {
            if ((i5 & 16) != 0) {
                qVar2 = n.INSTANCE;
            }
            r rVar = (r) f19886i.get(jVar);
            while (!jVar.f()) {
                long andIncrement = f19882e.getAndIncrement(jVar);
                int i6 = kotlinx.coroutines.channels.k.f19899b;
                long j5 = andIncrement / i6;
                int i7 = (int) (andIncrement % i6);
                if (rVar.f20383c != j5) {
                    r a02 = jVar.a0(j5, rVar);
                    if (a02 == null) {
                        continue;
                    } else {
                        rVar = a02;
                    }
                }
                Object z12 = jVar.z1(rVar, i7, andIncrement, obj);
                if (z12 == kotlinx.coroutines.channels.k.r()) {
                    if (obj instanceof z3) {
                        z3Var = (z3) obj;
                    } else {
                        z3Var = null;
                    }
                    if (z3Var != null) {
                        jVar.R0(z3Var, rVar, i7);
                    }
                    return qVar.invoke(rVar, Integer.valueOf(i7), Long.valueOf(andIncrement));
                }
                if (z12 == kotlinx.coroutines.channels.k.h()) {
                    if (andIncrement < jVar.n0()) {
                        rVar.b();
                    }
                } else {
                    if (z12 == kotlinx.coroutines.channels.k.s()) {
                        return qVar2.invoke(rVar, Integer.valueOf(i7), Long.valueOf(andIncrement));
                    }
                    rVar.b();
                    return lVar.invoke(z12);
                }
            }
            return aVar.invoke();
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: receiveImpl");
    }

    private final Object c0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, v3.l<Object, ? extends Object> lVar, Object obj) {
        Object obj2;
        do {
            obj2 = atomicReferenceFieldUpdater.get(obj);
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, obj, obj2, lVar.invoke(obj2)));
        return obj2;
    }

    private final void c1(r<E> rVar, int i5, long j5, z3 z3Var, v3.l<? super E, r2> lVar, v3.a<r2> aVar) {
        t0 t0Var = (Object) z1(rVar, i5, j5, z3Var);
        if (t0Var == kotlinx.coroutines.channels.k.r()) {
            R0(z3Var, rVar, i5);
            return;
        }
        if (t0Var == kotlinx.coroutines.channels.k.h()) {
            if (j5 < n0()) {
                rVar.b();
            }
            r rVar2 = (r) f19886i.get(this);
            while (!f()) {
                long andIncrement = f19882e.getAndIncrement(this);
                int i6 = kotlinx.coroutines.channels.k.f19899b;
                long j6 = andIncrement / i6;
                int i7 = (int) (andIncrement % i6);
                if (rVar2.f20383c != j6) {
                    r a02 = a0(j6, rVar2);
                    if (a02 == null) {
                        continue;
                    } else {
                        rVar2 = a02;
                    }
                }
                t0 t0Var2 = (Object) z1(rVar2, i7, andIncrement, z3Var);
                if (t0Var2 == kotlinx.coroutines.channels.k.r()) {
                    if (!(z3Var instanceof z3)) {
                        z3Var = null;
                    }
                    if (z3Var != null) {
                        R0(z3Var, rVar2, i7);
                    }
                    r2 r2Var = r2.f19517a;
                    return;
                }
                if (t0Var2 == kotlinx.coroutines.channels.k.h()) {
                    if (andIncrement < n0()) {
                        rVar2.b();
                    }
                } else {
                    if (t0Var2 != kotlinx.coroutines.channels.k.s()) {
                        rVar2.b();
                        lVar.invoke(t0Var2);
                        return;
                    }
                    throw new IllegalStateException("unexpected".toString());
                }
            }
            aVar.invoke();
            return;
        }
        rVar.b();
        lVar.invoke(t0Var);
    }

    private final long d0() {
        return f19883f.get(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object d1(r<E> rVar, int i5, long j5, kotlin.coroutines.d<? super E> dVar) {
        kotlin.coroutines.d e5;
        Object l5;
        e5 = kotlin.coroutines.intrinsics.c.e(dVar);
        kotlinx.coroutines.q b5 = kotlinx.coroutines.s.b(e5);
        try {
            Object z12 = z1(rVar, i5, j5, b5);
            if (z12 == kotlinx.coroutines.channels.k.r()) {
                R0(b5, rVar, i5);
            } else {
                v3.l<Throwable, r2> lVar = null;
                lVar = null;
                kotlinx.coroutines.q qVar = null;
                if (z12 == kotlinx.coroutines.channels.k.h()) {
                    if (j5 < n0()) {
                        rVar.b();
                    }
                    r rVar2 = (r) f19886i.get(this);
                    while (true) {
                        if (f()) {
                            K0(b5);
                            break;
                        }
                        long andIncrement = f19882e.getAndIncrement(this);
                        int i6 = kotlinx.coroutines.channels.k.f19899b;
                        long j6 = andIncrement / i6;
                        int i7 = (int) (andIncrement % i6);
                        if (rVar2.f20383c != j6) {
                            r a02 = a0(j6, rVar2);
                            if (a02 != null) {
                                rVar2 = a02;
                            }
                        }
                        z12 = z1(rVar2, i7, andIncrement, b5);
                        if (z12 == kotlinx.coroutines.channels.k.r()) {
                            if (b5 instanceof z3) {
                                qVar = b5;
                            }
                            if (qVar != null) {
                                R0(qVar, rVar2, i7);
                            }
                        } else if (z12 == kotlinx.coroutines.channels.k.h()) {
                            if (andIncrement < n0()) {
                                rVar2.b();
                            }
                        } else if (z12 != kotlinx.coroutines.channels.k.s()) {
                            rVar2.b();
                            v3.l<E, r2> lVar2 = this.f19891b;
                            if (lVar2 != null) {
                                lVar = kotlinx.coroutines.internal.k0.a(lVar2, z12, b5.getContext());
                            }
                        } else {
                            throw new IllegalStateException("unexpected".toString());
                        }
                    }
                } else {
                    rVar.b();
                    v3.l<E, r2> lVar3 = this.f19891b;
                    if (lVar3 != null) {
                        lVar = kotlinx.coroutines.internal.k0.a(lVar3, z12, b5.getContext());
                    }
                }
                b5.C(z12, lVar);
            }
            Object E = b5.E();
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (E == l5) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return E;
        } catch (Throwable th) {
            b5.R();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e1(kotlinx.coroutines.selects.m<?> mVar, Object obj) {
        z3 z3Var;
        r rVar = (r) f19886i.get(this);
        while (!f()) {
            long andIncrement = f19882e.getAndIncrement(this);
            int i5 = kotlinx.coroutines.channels.k.f19899b;
            long j5 = andIncrement / i5;
            int i6 = (int) (andIncrement % i5);
            if (rVar.f20383c != j5) {
                r a02 = a0(j5, rVar);
                if (a02 == null) {
                    continue;
                } else {
                    rVar = a02;
                }
            }
            Object z12 = z1(rVar, i6, andIncrement, mVar);
            if (z12 == kotlinx.coroutines.channels.k.r()) {
                if (mVar instanceof z3) {
                    z3Var = (z3) mVar;
                } else {
                    z3Var = null;
                }
                if (z3Var != null) {
                    R0(z3Var, rVar, i6);
                    return;
                }
                return;
            }
            if (z12 == kotlinx.coroutines.channels.k.h()) {
                if (andIncrement < n0()) {
                    rVar.b();
                }
            } else {
                if (z12 != kotlinx.coroutines.channels.k.s()) {
                    rVar.b();
                    mVar.e(z12);
                    return;
                }
                throw new IllegalStateException("unexpected".toString());
            }
        }
        L0(mVar);
    }

    public static /* synthetic */ void f0() {
    }

    public static /* synthetic */ void g0() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x00b3, code lost:
    
        r12 = (kotlinx.coroutines.channels.r) r12.g();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void g1(kotlinx.coroutines.channels.r<E> r12) {
        /*
            r11 = this;
            v3.l<E, kotlin.r2> r0 = r11.f19891b
            r1 = 0
            r2 = 1
            java.lang.Object r3 = kotlinx.coroutines.internal.r.c(r1, r2, r1)
        L8:
            int r4 = kotlinx.coroutines.channels.k.f19899b
            int r4 = r4 - r2
        Lb:
            r5 = -1
            if (r5 >= r4) goto Lb3
            long r6 = r12.f20383c
            int r8 = kotlinx.coroutines.channels.k.f19899b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L16:
            java.lang.Object r8 = r12.y(r4)
            kotlinx.coroutines.internal.t0 r9 = kotlinx.coroutines.channels.k.f()
            if (r8 == r9) goto Lbb
            kotlinx.coroutines.internal.t0 r9 = kotlinx.coroutines.channels.k.f19903f
            if (r8 != r9) goto L48
            long r9 = r11.l0()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbb
            kotlinx.coroutines.internal.t0 r9 = kotlinx.coroutines.channels.k.z()
            boolean r8 = r12.t(r4, r8, r9)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L40
            java.lang.Object r5 = r12.x(r4)
            kotlinx.coroutines.internal.g1 r1 = kotlinx.coroutines.internal.k0.c(r0, r5, r1)
        L40:
            r12.u(r4)
            r12.r()
            goto Laf
        L48:
            kotlinx.coroutines.internal.t0 r9 = kotlinx.coroutines.channels.k.k()
            if (r8 == r9) goto La2
            if (r8 != 0) goto L51
            goto La2
        L51:
            boolean r9 = r8 instanceof kotlinx.coroutines.z3
            if (r9 != 0) goto L6e
            boolean r9 = r8 instanceof kotlinx.coroutines.channels.k0
            if (r9 == 0) goto L5a
            goto L6e
        L5a:
            kotlinx.coroutines.internal.t0 r9 = kotlinx.coroutines.channels.k.p()
            if (r8 == r9) goto Lbb
            kotlinx.coroutines.internal.t0 r9 = kotlinx.coroutines.channels.k.q()
            if (r8 != r9) goto L67
            goto Lbb
        L67:
            kotlinx.coroutines.internal.t0 r9 = kotlinx.coroutines.channels.k.p()
            if (r8 == r9) goto L16
            goto Laf
        L6e:
            long r9 = r11.l0()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbb
            boolean r9 = r8 instanceof kotlinx.coroutines.channels.k0
            if (r9 == 0) goto L80
            r9 = r8
            kotlinx.coroutines.channels.k0 r9 = (kotlinx.coroutines.channels.k0) r9
            kotlinx.coroutines.z3 r9 = r9.f19924a
            goto L83
        L80:
            r9 = r8
            kotlinx.coroutines.z3 r9 = (kotlinx.coroutines.z3) r9
        L83:
            kotlinx.coroutines.internal.t0 r10 = kotlinx.coroutines.channels.k.z()
            boolean r8 = r12.t(r4, r8, r10)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L97
            java.lang.Object r5 = r12.x(r4)
            kotlinx.coroutines.internal.g1 r1 = kotlinx.coroutines.internal.k0.c(r0, r5, r1)
        L97:
            java.lang.Object r3 = kotlinx.coroutines.internal.r.h(r3, r9)
            r12.u(r4)
            r12.r()
            goto Laf
        La2:
            kotlinx.coroutines.internal.t0 r9 = kotlinx.coroutines.channels.k.z()
            boolean r8 = r12.t(r4, r8, r9)
            if (r8 == 0) goto L16
            r12.r()
        Laf:
            int r4 = r4 + (-1)
            goto Lb
        Lb3:
            kotlinx.coroutines.internal.f r12 = r12.g()
            kotlinx.coroutines.channels.r r12 = (kotlinx.coroutines.channels.r) r12
            if (r12 != 0) goto L8
        Lbb:
            if (r3 == 0) goto Le1
            boolean r12 = r3 instanceof java.util.ArrayList
            if (r12 != 0) goto Lc7
            kotlinx.coroutines.z3 r3 = (kotlinx.coroutines.z3) r3
            r11.i1(r3)
            goto Le1
        Lc7:
            java.lang.String r12 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            kotlin.jvm.internal.l0.n(r3, r12)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r12 = r3.size()
            int r12 = r12 - r2
        Ld3:
            if (r5 >= r12) goto Le1
            java.lang.Object r0 = r3.get(r12)
            kotlinx.coroutines.z3 r0 = (kotlinx.coroutines.z3) r0
            r11.i1(r0)
            int r12 = r12 + (-1)
            goto Ld3
        Le1:
            if (r1 != 0) goto Le4
            return
        Le4:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.j.g1(kotlinx.coroutines.channels.r):void");
    }

    public static /* synthetic */ void h0() {
    }

    private final void h1(z3 z3Var) {
        j1(z3Var, true);
    }

    public static /* synthetic */ void i0() {
    }

    private final void i1(z3 z3Var) {
        j1(z3Var, false);
    }

    private static /* synthetic */ void j0() {
    }

    private final void j1(z3 z3Var, boolean z4) {
        Throwable m02;
        if (z3Var instanceof b) {
            kotlinx.coroutines.p<Boolean> a5 = ((b) z3Var).a();
            d1.a aVar = d1.Companion;
            a5.resumeWith(d1.m6444constructorimpl(Boolean.FALSE));
            return;
        }
        if (z3Var instanceof kotlinx.coroutines.p) {
            kotlin.coroutines.d dVar = (kotlin.coroutines.d) z3Var;
            d1.a aVar2 = d1.Companion;
            if (z4) {
                m02 = k0();
            } else {
                m02 = m0();
            }
            dVar.resumeWith(d1.m6444constructorimpl(e1.a(m02)));
            return;
        }
        if (z3Var instanceof f0) {
            kotlinx.coroutines.q<p<? extends E>> qVar = ((f0) z3Var).f19878a;
            d1.a aVar3 = d1.Companion;
            qVar.resumeWith(d1.m6444constructorimpl(p.b(p.f19939b.a(e0()))));
        } else if (z3Var instanceof a) {
            ((a) z3Var).l();
        } else {
            if (z3Var instanceof kotlinx.coroutines.selects.m) {
                ((kotlinx.coroutines.selects.m) z3Var).i(this, kotlinx.coroutines.channels.k.z());
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + z3Var).toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable k0() {
        Throwable e02 = e0();
        return e02 == null ? new w(s.f19945a) : e02;
    }

    static /* synthetic */ <E> Object k1(j<E> jVar, E e5, kotlin.coroutines.d<? super r2> dVar) {
        r<E> rVar;
        Object l5;
        Object l6;
        Object l7;
        Object l8;
        r<E> rVar2 = (r) f19885h.get(jVar);
        while (true) {
            long andIncrement = f19881d.getAndIncrement(jVar);
            long j5 = andIncrement & 1152921504606846975L;
            boolean x02 = jVar.x0(andIncrement);
            int i5 = kotlinx.coroutines.channels.k.f19899b;
            long j6 = j5 / i5;
            int i6 = (int) (j5 % i5);
            if (rVar2.f20383c != j6) {
                r<E> b02 = jVar.b0(j6, rVar2);
                if (b02 == null) {
                    if (x02) {
                        Object N0 = jVar.N0(e5, dVar);
                        l8 = kotlin.coroutines.intrinsics.d.l();
                        if (N0 == l8) {
                            return N0;
                        }
                    }
                } else {
                    rVar = b02;
                }
            } else {
                rVar = rVar2;
            }
            int B1 = jVar.B1(rVar, i6, e5, j5, null, x02);
            if (B1 != 0) {
                if (B1 == 1) {
                    break;
                }
                if (B1 != 2) {
                    if (B1 != 3) {
                        if (B1 != 4) {
                            if (B1 == 5) {
                                rVar.b();
                            }
                            rVar2 = rVar;
                        } else {
                            if (j5 < jVar.l0()) {
                                rVar.b();
                            }
                            Object N02 = jVar.N0(e5, dVar);
                            l7 = kotlin.coroutines.intrinsics.d.l();
                            if (N02 == l7) {
                                return N02;
                            }
                        }
                    } else {
                        Object q12 = jVar.q1(rVar, i6, e5, j5, dVar);
                        l6 = kotlin.coroutines.intrinsics.d.l();
                        if (q12 == l6) {
                            return q12;
                        }
                    }
                } else if (x02) {
                    rVar.r();
                    Object N03 = jVar.N0(e5, dVar);
                    l5 = kotlin.coroutines.intrinsics.d.l();
                    if (N03 == l5) {
                        return N03;
                    }
                }
            } else {
                rVar.b();
                break;
            }
        }
        return r2.f19517a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b6, code lost:
    
        r0 = kotlin.d1.Companion;
        r9.resumeWith(kotlin.d1.m6444constructorimpl(kotlin.coroutines.jvm.internal.b.a(true)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ <E> java.lang.Object m1(kotlinx.coroutines.channels.j<E> r18, E r19, kotlin.coroutines.d<? super java.lang.Boolean> r20) {
        /*
            r8 = r18
            kotlinx.coroutines.q r9 = new kotlinx.coroutines.q
            kotlin.coroutines.d r0 = kotlin.coroutines.intrinsics.b.e(r20)
            r10 = 1
            r9.<init>(r0, r10)
            r9.B()
            v3.l<E, kotlin.r2> r0 = r8.f19891b
            r11 = 0
            if (r0 != 0) goto L16
            r0 = r10
            goto L17
        L16:
            r0 = r11
        L17:
            if (r0 == 0) goto Ld1
            kotlinx.coroutines.channels.j$b r12 = new kotlinx.coroutines.channels.j$b
            r12.<init>(r9)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = h()
            java.lang.Object r0 = r0.get(r8)
            kotlinx.coroutines.channels.r r0 = (kotlinx.coroutines.channels.r) r0
        L28:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = i()
            long r1 = r1.getAndIncrement(r8)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r13 = r1 & r3
            boolean r15 = j(r8, r1)
            int r1 = kotlinx.coroutines.channels.k.f19899b
            long r2 = (long) r1
            long r2 = r13 / r2
            long r4 = (long) r1
            long r4 = r13 % r4
            int r7 = (int) r4
            long r4 = r0.f20383c
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L55
            kotlinx.coroutines.channels.r r1 = c(r8, r2, r0)
            if (r1 != 0) goto L53
            if (r15 == 0) goto L28
            goto L9b
        L53:
            r6 = r1
            goto L56
        L55:
            r6 = r0
        L56:
            r0 = r18
            r1 = r6
            r2 = r7
            r3 = r19
            r4 = r13
            r16 = r6
            r6 = r12
            r17 = r7
            r7 = r15
            int r0 = N(r0, r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto Lb1
            if (r0 == r10) goto Lb6
            r1 = 2
            if (r0 == r1) goto L96
            r1 = 3
            if (r0 == r1) goto L8a
            r1 = 4
            if (r0 == r1) goto L7e
            r1 = 5
            if (r0 == r1) goto L78
            goto L7b
        L78:
            r16.b()
        L7b:
            r0 = r16
            goto L28
        L7e:
            long r0 = r18.l0()
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 >= 0) goto L9b
            r16.b()
            goto L9b
        L8a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unexpected"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L96:
            if (r15 == 0) goto La9
            r16.r()
        L9b:
            kotlin.d1$a r0 = kotlin.d1.Companion
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r11)
            java.lang.Object r0 = kotlin.d1.m6444constructorimpl(r0)
            r9.resumeWith(r0)
            goto Lc3
        La9:
            r1 = r16
            r0 = r17
            y(r8, r12, r1, r0)
            goto Lc3
        Lb1:
            r1 = r16
            r1.b()
        Lb6:
            kotlin.d1$a r0 = kotlin.d1.Companion
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r10)
            java.lang.Object r0 = kotlin.d1.m6444constructorimpl(r0)
            r9.resumeWith(r0)
        Lc3:
            java.lang.Object r0 = r9.E()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            if (r0 != r1) goto Ld0
            kotlin.coroutines.jvm.internal.h.c(r20)
        Ld0:
            return r0
        Ld1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "the `onUndeliveredElement` feature is unsupported for `sendBroadcast(e)`"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.j.m1(kotlinx.coroutines.channels.j, java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }

    public static /* synthetic */ Object o1(j jVar, Object obj, Object obj2, v3.a aVar, v3.p pVar, v3.a aVar2, v3.r rVar, int i5, Object obj3) {
        v3.r rVar2;
        r rVar3;
        z3 z3Var;
        if (obj3 == null) {
            if ((i5 & 32) != 0) {
                rVar2 = o.INSTANCE;
            } else {
                rVar2 = rVar;
            }
            r rVar4 = (r) f19885h.get(jVar);
            while (true) {
                long andIncrement = f19881d.getAndIncrement(jVar);
                long j5 = andIncrement & 1152921504606846975L;
                boolean x02 = jVar.x0(andIncrement);
                int i6 = kotlinx.coroutines.channels.k.f19899b;
                long j6 = j5 / i6;
                int i7 = (int) (j5 % i6);
                if (rVar4.f20383c != j6) {
                    r b02 = jVar.b0(j6, rVar4);
                    if (b02 == null) {
                        if (x02) {
                            return aVar2.invoke();
                        }
                    } else {
                        rVar3 = b02;
                    }
                } else {
                    rVar3 = rVar4;
                }
                int B1 = jVar.B1(rVar3, i7, obj, j5, obj2, x02);
                if (B1 != 0) {
                    if (B1 != 1) {
                        if (B1 != 2) {
                            if (B1 != 3) {
                                if (B1 != 4) {
                                    if (B1 == 5) {
                                        rVar3.b();
                                    }
                                    rVar4 = rVar3;
                                } else {
                                    if (j5 < jVar.l0()) {
                                        rVar3.b();
                                    }
                                    return aVar2.invoke();
                                }
                            } else {
                                return rVar2.invoke(rVar3, Integer.valueOf(i7), obj, Long.valueOf(j5));
                            }
                        } else {
                            if (x02) {
                                rVar3.r();
                                return aVar2.invoke();
                            }
                            if (obj2 instanceof z3) {
                                z3Var = (z3) obj2;
                            } else {
                                z3Var = null;
                            }
                            if (z3Var != null) {
                                jVar.S0(z3Var, rVar3, i7);
                            }
                            return pVar.invoke(rVar3, Integer.valueOf(i7));
                        }
                    } else {
                        return aVar.invoke();
                    }
                } else {
                    rVar3.b();
                    return aVar.invoke();
                }
            }
        } else {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendImpl");
        }
    }

    private final void p0(long j5) {
        boolean z4;
        boolean z5;
        if ((f19884g.addAndGet(this, j5) & 4611686018427387904L) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return;
        }
        do {
            if ((f19884g.get(this) & 4611686018427387904L) != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
        } while (z5);
    }

    private final void p1(r<E> rVar, int i5, E e5, long j5, z3 z3Var, v3.a<r2> aVar, v3.a<r2> aVar2) {
        r rVar2;
        z3 z3Var2 = z3Var;
        int B1 = B1(rVar, i5, e5, j5, z3Var, false);
        if (B1 != 0) {
            if (B1 != 1) {
                if (B1 != 2) {
                    if (B1 != 4) {
                        if (B1 == 5) {
                            rVar.b();
                            r rVar3 = (r) f19885h.get(this);
                            while (true) {
                                long andIncrement = f19881d.getAndIncrement(this);
                                long j6 = andIncrement & 1152921504606846975L;
                                boolean x02 = x0(andIncrement);
                                int i6 = kotlinx.coroutines.channels.k.f19899b;
                                long j7 = j6 / i6;
                                int i7 = (int) (j6 % i6);
                                if (rVar3.f20383c != j7) {
                                    r b02 = b0(j7, rVar3);
                                    if (b02 == null) {
                                        if (x02) {
                                            aVar2.invoke();
                                            return;
                                        }
                                    } else {
                                        rVar2 = b02;
                                    }
                                } else {
                                    rVar2 = rVar3;
                                }
                                r rVar4 = rVar2;
                                int B12 = B1(rVar2, i7, e5, j6, z3Var, x02);
                                if (B12 != 0) {
                                    if (B12 != 1) {
                                        if (B12 != 2) {
                                            if (B12 != 3) {
                                                if (B12 != 4) {
                                                    if (B12 == 5) {
                                                        rVar4.b();
                                                    }
                                                    rVar3 = rVar4;
                                                } else {
                                                    if (j6 < l0()) {
                                                        rVar4.b();
                                                    }
                                                    aVar2.invoke();
                                                    return;
                                                }
                                            } else {
                                                throw new IllegalStateException("unexpected".toString());
                                            }
                                        } else {
                                            if (x02) {
                                                rVar4.r();
                                                aVar2.invoke();
                                                return;
                                            }
                                            if (!(z3Var2 instanceof z3)) {
                                                z3Var2 = null;
                                            }
                                            if (z3Var2 != null) {
                                                S0(z3Var2, rVar4, i7);
                                            }
                                            r2 r2Var = r2.f19517a;
                                            return;
                                        }
                                    } else {
                                        aVar.invoke();
                                        return;
                                    }
                                } else {
                                    rVar4.b();
                                    aVar.invoke();
                                    return;
                                }
                            }
                        } else {
                            throw new IllegalStateException("unexpected".toString());
                        }
                    } else {
                        if (j5 < l0()) {
                            rVar.b();
                        }
                        aVar2.invoke();
                    }
                } else {
                    S0(z3Var2, rVar, i5);
                }
            } else {
                aVar.invoke();
            }
        } else {
            rVar.b();
            aVar.invoke();
        }
    }

    static /* synthetic */ void q0(j jVar, long j5, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i5 & 1) != 0) {
            j5 = 1;
        }
        jVar.p0(j5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0122 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q1(kotlinx.coroutines.channels.r<E> r21, int r22, E r23, long r24, kotlin.coroutines.d<? super kotlin.r2> r26) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.j.q1(kotlinx.coroutines.channels.r, int, java.lang.Object, long, kotlin.coroutines.d):java.lang.Object");
    }

    private final void r0() {
        Object obj;
        t0 e5;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19889l;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                e5 = kotlinx.coroutines.channels.k.d();
            } else {
                e5 = kotlinx.coroutines.channels.k.e();
            }
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, obj, e5));
        if (obj == null) {
            return;
        }
        ((v3.l) obj).invoke(e0());
    }

    private final boolean r1(long j5) {
        if (x0(j5)) {
            return false;
        }
        return !O(j5 & 1152921504606846975L);
    }

    private final boolean s0(r<E> rVar, int i5, long j5) {
        Object y4;
        do {
            y4 = rVar.y(i5);
            if (y4 != null && y4 != kotlinx.coroutines.channels.k.k()) {
                if (y4 == kotlinx.coroutines.channels.k.f19903f) {
                    return true;
                }
                if (y4 == kotlinx.coroutines.channels.k.j() || y4 == kotlinx.coroutines.channels.k.z() || y4 == kotlinx.coroutines.channels.k.f() || y4 == kotlinx.coroutines.channels.k.o()) {
                    return false;
                }
                if (y4 == kotlinx.coroutines.channels.k.p()) {
                    return true;
                }
                if (y4 == kotlinx.coroutines.channels.k.q() || j5 != l0()) {
                    return false;
                }
                return true;
            }
        } while (!rVar.t(i5, y4, kotlinx.coroutines.channels.k.o()));
        Y();
        return false;
    }

    private final boolean t0(long j5, boolean z4) {
        int i5 = (int) (j5 >> 60);
        if (i5 == 0 || i5 == 1) {
            return false;
        }
        if (i5 != 2) {
            if (i5 == 3) {
                U(j5 & 1152921504606846975L);
            } else {
                throw new IllegalStateException(("unexpected close status: " + i5).toString());
            }
        } else {
            V(j5 & 1152921504606846975L);
            if (z4 && o0()) {
                return false;
            }
        }
        return true;
    }

    @a2
    public static /* synthetic */ void u0() {
    }

    private final boolean u1(Object obj, E e5) {
        if (obj instanceof kotlinx.coroutines.selects.m) {
            return ((kotlinx.coroutines.selects.m) obj).i(this, e5);
        }
        v3.l<Throwable, r2> lVar = null;
        if (obj instanceof f0) {
            l0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            f0 f0Var = (f0) obj;
            kotlinx.coroutines.q<p<? extends E>> qVar = f0Var.f19878a;
            p b5 = p.b(p.f19939b.c(e5));
            v3.l<E, r2> lVar2 = this.f19891b;
            if (lVar2 != null) {
                lVar = kotlinx.coroutines.internal.k0.a(lVar2, e5, f0Var.f19878a.getContext());
            }
            return kotlinx.coroutines.channels.k.u(qVar, b5, lVar);
        }
        if (obj instanceof a) {
            l0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).k(e5);
        }
        if (obj instanceof kotlinx.coroutines.p) {
            l0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            kotlinx.coroutines.p pVar = (kotlinx.coroutines.p) obj;
            v3.l<E, r2> lVar3 = this.f19891b;
            if (lVar3 != null) {
                lVar = kotlinx.coroutines.internal.k0.a(lVar3, e5, pVar.getContext());
            }
            return kotlinx.coroutines.channels.k.u(pVar, e5, lVar);
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    private final boolean v0(long j5) {
        return t0(j5, true);
    }

    private final boolean v1(Object obj, r<E> rVar, int i5) {
        if (obj instanceof kotlinx.coroutines.p) {
            l0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return kotlinx.coroutines.channels.k.G((kotlinx.coroutines.p) obj, r2.f19517a, null, 2, null);
        }
        if (obj instanceof kotlinx.coroutines.selects.m) {
            l0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            kotlinx.coroutines.selects.r I = ((kotlinx.coroutines.selects.l) obj).I(this, r2.f19517a);
            if (I == kotlinx.coroutines.selects.r.REREGISTER) {
                rVar.u(i5);
            }
            if (I == kotlinx.coroutines.selects.r.SUCCESSFUL) {
                return true;
            }
            return false;
        }
        if (obj instanceof b) {
            return kotlinx.coroutines.channels.k.G(((b) obj).a(), Boolean.TRUE, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    @a2
    public static /* synthetic */ void w0() {
    }

    private final void w1(AtomicLongFieldUpdater atomicLongFieldUpdater, v3.l<? super Long, Long> lVar, Object obj) {
        long j5;
        do {
            j5 = atomicLongFieldUpdater.get(obj);
        } while (!atomicLongFieldUpdater.compareAndSet(obj, j5, lVar.invoke(Long.valueOf(j5)).longValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean x0(long j5) {
        return t0(j5, false);
    }

    private final boolean x1(r<E> rVar, int i5, long j5) {
        Object y4 = rVar.y(i5);
        if ((y4 instanceof z3) && j5 >= f19882e.get(this) && rVar.t(i5, y4, kotlinx.coroutines.channels.k.p())) {
            if (v1(y4, rVar, i5)) {
                rVar.C(i5, kotlinx.coroutines.channels.k.f19903f);
                return true;
            }
            rVar.C(i5, kotlinx.coroutines.channels.k.j());
            rVar.z(i5, false);
            return false;
        }
        return y1(rVar, i5, j5);
    }

    private final boolean y1(r<E> rVar, int i5, long j5) {
        while (true) {
            Object y4 = rVar.y(i5);
            if (y4 instanceof z3) {
                if (j5 < f19882e.get(this)) {
                    if (rVar.t(i5, y4, new k0((z3) y4))) {
                        return true;
                    }
                } else if (rVar.t(i5, y4, kotlinx.coroutines.channels.k.p())) {
                    if (v1(y4, rVar, i5)) {
                        rVar.C(i5, kotlinx.coroutines.channels.k.f19903f);
                        return true;
                    }
                    rVar.C(i5, kotlinx.coroutines.channels.k.j());
                    rVar.z(i5, false);
                    return false;
                }
            } else {
                if (y4 == kotlinx.coroutines.channels.k.j()) {
                    return false;
                }
                if (y4 == null) {
                    if (rVar.t(i5, y4, kotlinx.coroutines.channels.k.k())) {
                        return true;
                    }
                } else {
                    if (y4 == kotlinx.coroutines.channels.k.f19903f || y4 == kotlinx.coroutines.channels.k.o() || y4 == kotlinx.coroutines.channels.k.f() || y4 == kotlinx.coroutines.channels.k.i() || y4 == kotlinx.coroutines.channels.k.z()) {
                        return true;
                    }
                    if (y4 != kotlinx.coroutines.channels.k.q()) {
                        throw new IllegalStateException(("Unexpected cell state: " + y4).toString());
                    }
                }
            }
        }
    }

    @a2
    public static /* synthetic */ void z0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object z1(r<E> rVar, int i5, long j5, Object obj) {
        Object y4 = rVar.y(i5);
        if (y4 == null) {
            if (j5 >= (f19881d.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return kotlinx.coroutines.channels.k.s();
                }
                if (rVar.t(i5, y4, obj)) {
                    Y();
                    return kotlinx.coroutines.channels.k.r();
                }
            }
        } else if (y4 == kotlinx.coroutines.channels.k.f19903f && rVar.t(i5, y4, kotlinx.coroutines.channels.k.f())) {
            Y();
            return rVar.A(i5);
        }
        return A1(rVar, i5, j5, obj);
    }

    @Override // kotlinx.coroutines.channels.g0
    @p4.m
    public Object D(@p4.l kotlin.coroutines.d<? super E> dVar) {
        return X0(this, dVar);
    }

    @Override // kotlinx.coroutines.channels.h0
    public boolean E(@p4.m Throwable th) {
        return T(th, false);
    }

    @Override // kotlinx.coroutines.channels.h0
    @p4.m
    public Object F(E e5, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        return k1(this, e5, dVar);
    }

    public final void F1(long j5) {
        long j6;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        boolean z4;
        long j7;
        if (A0()) {
            return;
        }
        do {
        } while (d0() <= j5);
        int g5 = kotlinx.coroutines.channels.k.g();
        for (int i5 = 0; i5 < g5; i5++) {
            long d02 = d0();
            if (d02 == (kotlin.time.g.f19821c & f19884g.get(this)) && d02 == d0()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f19884g;
        do {
            j6 = atomicLongFieldUpdater2.get(this);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j6, kotlinx.coroutines.channels.k.a(j6 & kotlin.time.g.f19821c, true)));
        while (true) {
            long d03 = d0();
            atomicLongFieldUpdater = f19884g;
            long j8 = atomicLongFieldUpdater.get(this);
            long j9 = j8 & kotlin.time.g.f19821c;
            if ((4611686018427387904L & j8) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (d03 == j9 && d03 == d0()) {
                break;
            } else if (!z4) {
                atomicLongFieldUpdater.compareAndSet(this, j8, kotlinx.coroutines.channels.k.a(j9, true));
            }
        }
        do {
            j7 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j7, kotlinx.coroutines.channels.k.a(j7 & kotlin.time.g.f19821c, false)));
    }

    @Override // kotlinx.coroutines.channels.h0
    public boolean G() {
        return x0(f19881d.get(this));
    }

    @Override // kotlinx.coroutines.channels.h0
    public void I(@p4.l v3.l<? super Throwable, r2> lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19889l;
        if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, null, lVar)) {
            return;
        }
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != kotlinx.coroutines.channels.k.d()) {
                if (obj == kotlinx.coroutines.channels.k.e()) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        } while (!androidx.concurrent.futures.a.a(f19889l, this, kotlinx.coroutines.channels.k.d(), kotlinx.coroutines.channels.k.e()));
        lVar.invoke(e0());
    }

    protected void I0() {
    }

    public boolean P(@p4.m Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return T(th, true);
    }

    protected void P0() {
    }

    protected void Q0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R() {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.j.R():void");
    }

    protected boolean T(@p4.m Throwable th, boolean z4) {
        if (z4) {
            E0();
        }
        boolean a5 = androidx.concurrent.futures.a.a(f19888k, this, kotlinx.coroutines.channels.k.l(), th);
        if (z4) {
            F0();
        } else {
            G0();
        }
        W();
        I0();
        if (a5) {
            r0();
        }
        return a5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void X(long j5) {
        g1 d5;
        r<E> rVar = (r) f19886i.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f19882e;
            long j6 = atomicLongFieldUpdater.get(this);
            if (j5 < Math.max(this.f19890a + j6, d0())) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j6, j6 + 1)) {
                int i5 = kotlinx.coroutines.channels.k.f19899b;
                long j7 = j6 / i5;
                int i6 = (int) (j6 % i5);
                if (rVar.f20383c != j7) {
                    r<E> a02 = a0(j7, rVar);
                    if (a02 == null) {
                        continue;
                    } else {
                        rVar = a02;
                    }
                }
                Object z12 = z1(rVar, i6, j6, null);
                if (z12 == kotlinx.coroutines.channels.k.h()) {
                    if (j6 < n0()) {
                        rVar.b();
                    }
                } else {
                    rVar.b();
                    v3.l<E, r2> lVar = this.f19891b;
                    if (lVar != null && (d5 = kotlinx.coroutines.internal.k0.d(lVar, z12, null, 2, null)) != null) {
                        throw d5;
                    }
                }
            }
        }
    }

    @Override // kotlinx.coroutines.channels.g0
    public final boolean a(@p4.m Throwable th) {
        return P(th);
    }

    @Override // kotlinx.coroutines.channels.g0
    public final void cancel() {
        P(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @p4.m
    public final Throwable e0() {
        return (Throwable) f19888k.get(this);
    }

    @Override // kotlinx.coroutines.channels.g0
    public boolean f() {
        return v0(f19881d.get(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0088, code lost:
    
        r14.e(kotlin.r2.f19517a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008d, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void f1(@p4.l kotlinx.coroutines.selects.m<?> r14, @p4.m java.lang.Object r15) {
        /*
            r13 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = h()
            java.lang.Object r0 = r0.get(r13)
            kotlinx.coroutines.channels.r r0 = (kotlinx.coroutines.channels.r) r0
        La:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = i()
            long r1 = r1.getAndIncrement(r13)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r3 = r3 & r1
            boolean r1 = j(r13, r1)
            int r2 = kotlinx.coroutines.channels.k.f19899b
            long r5 = (long) r2
            long r5 = r3 / r5
            long r7 = (long) r2
            long r7 = r3 % r7
            int r2 = (int) r7
            long r7 = r0.f20383c
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 == 0) goto L35
            kotlinx.coroutines.channels.r r5 = c(r13, r5, r0)
            if (r5 != 0) goto L34
            if (r1 == 0) goto La
            goto L73
        L34:
            r0 = r5
        L35:
            r5 = r13
            r6 = r0
            r7 = r2
            r8 = r15
            r9 = r3
            r11 = r14
            r12 = r1
            int r5 = N(r5, r6, r7, r8, r9, r11, r12)
            if (r5 == 0) goto L85
            r6 = 1
            if (r5 == r6) goto L88
            r6 = 2
            if (r5 == r6) goto L6e
            r1 = 3
            if (r5 == r1) goto L62
            r1 = 4
            if (r5 == r1) goto L56
            r1 = 5
            if (r5 == r1) goto L52
            goto La
        L52:
            r0.b()
            goto La
        L56:
            long r1 = r13.l0()
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 >= 0) goto L73
            r0.b()
            goto L73
        L62:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "unexpected"
            java.lang.String r15 = r15.toString()
            r14.<init>(r15)
            throw r14
        L6e:
            if (r1 == 0) goto L77
            r0.r()
        L73:
            r13.M0(r15, r14)
            goto L8d
        L77:
            boolean r15 = r14 instanceof kotlinx.coroutines.z3
            if (r15 == 0) goto L7e
            kotlinx.coroutines.z3 r14 = (kotlinx.coroutines.z3) r14
            goto L7f
        L7e:
            r14 = 0
        L7f:
            if (r14 == 0) goto L8d
            y(r13, r14, r0, r2)
            goto L8d
        L85:
            r0.b()
        L88:
            kotlin.r2 r15 = kotlin.r2.f19517a
            r14.e(r15)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.j.f1(kotlinx.coroutines.selects.m, java.lang.Object):void");
    }

    @Override // kotlinx.coroutines.channels.g0
    public boolean isEmpty() {
        if (f() || o0()) {
            return false;
        }
        return !f();
    }

    @Override // kotlinx.coroutines.channels.g0
    @p4.l
    public kotlinx.coroutines.channels.n<E> iterator() {
        return new a();
    }

    @Override // kotlinx.coroutines.channels.h0
    @p4.l
    public kotlinx.coroutines.selects.i<E, j<E>> l() {
        i iVar = i.INSTANCE;
        l0.n(iVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        v3.q qVar = (v3.q) u1.q(iVar, 3);
        C0569j c0569j = C0569j.INSTANCE;
        l0.n(c0569j, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new kotlinx.coroutines.selects.j(this, qVar, (v3.q) u1.q(c0569j, 3), null, 8, null);
    }

    public final long l0() {
        return f19882e.get(this);
    }

    @p4.m
    public Object l1(E e5, @p4.l kotlin.coroutines.d<? super Boolean> dVar) {
        return m1(this, e5, dVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @p4.l
    public final Throwable m0() {
        Throwable e02 = e0();
        return e02 == null ? new x(s.f19945a) : e02;
    }

    public final long n0() {
        return f19881d.get(this) & 1152921504606846975L;
    }

    protected final <R> R n1(E e5, @p4.m Object obj, @p4.l v3.a<? extends R> aVar, @p4.l v3.p<? super r<E>, ? super Integer, ? extends R> pVar, @p4.l v3.a<? extends R> aVar2, @p4.l v3.r<? super r<E>, ? super Integer, ? super E, ? super Long, ? extends R> rVar) {
        r rVar2;
        z3 z3Var;
        r rVar3 = (r) f19885h.get(this);
        while (true) {
            long andIncrement = f19881d.getAndIncrement(this);
            long j5 = andIncrement & 1152921504606846975L;
            boolean x02 = x0(andIncrement);
            int i5 = kotlinx.coroutines.channels.k.f19899b;
            long j6 = j5 / i5;
            int i6 = (int) (j5 % i5);
            if (rVar3.f20383c != j6) {
                r b02 = b0(j6, rVar3);
                if (b02 == null) {
                    if (x02) {
                        return aVar2.invoke();
                    }
                } else {
                    rVar2 = b02;
                }
            } else {
                rVar2 = rVar3;
            }
            int B1 = B1(rVar2, i6, e5, j5, obj, x02);
            if (B1 != 0) {
                if (B1 != 1) {
                    if (B1 != 2) {
                        if (B1 != 3) {
                            if (B1 != 4) {
                                if (B1 == 5) {
                                    rVar2.b();
                                }
                                rVar3 = rVar2;
                            } else {
                                if (j5 < l0()) {
                                    rVar2.b();
                                }
                                return aVar2.invoke();
                            }
                        } else {
                            return rVar.invoke(rVar2, Integer.valueOf(i6), e5, Long.valueOf(j5));
                        }
                    } else {
                        if (x02) {
                            rVar2.r();
                            return aVar2.invoke();
                        }
                        if (obj instanceof z3) {
                            z3Var = (z3) obj;
                        } else {
                            z3Var = null;
                        }
                        if (z3Var != null) {
                            S0(z3Var, rVar2, i6);
                        }
                        return pVar.invoke(rVar2, Integer.valueOf(i6));
                    }
                } else {
                    return aVar.invoke();
                }
            } else {
                rVar2.b();
                return aVar.invoke();
            }
        }
    }

    public final boolean o0() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19886i;
            r<E> rVar = (r) atomicReferenceFieldUpdater.get(this);
            long l02 = l0();
            if (n0() <= l02) {
                return false;
            }
            int i5 = kotlinx.coroutines.channels.k.f19899b;
            long j5 = l02 / i5;
            if (rVar.f20383c != j5 && (rVar = a0(j5, rVar)) == null) {
                if (((r) atomicReferenceFieldUpdater.get(this)).f20383c < j5) {
                    return false;
                }
            } else {
                rVar.b();
                if (s0(rVar, (int) (l02 % i5), l02)) {
                    return true;
                }
                f19882e.compareAndSet(this, l02, l02 + 1);
            }
        }
    }

    @Override // kotlinx.coroutines.channels.h0
    @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @b1(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e5) {
        return l.a.c(this, e5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bb, code lost:
    
        return kotlinx.coroutines.channels.p.f19939b.c(kotlin.r2.f19517a);
     */
    @Override // kotlinx.coroutines.channels.h0
    @p4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(E r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.j.f19881d
            long r0 = r0.get(r14)
            boolean r0 = r14.r1(r0)
            if (r0 == 0) goto L13
            kotlinx.coroutines.channels.p$b r15 = kotlinx.coroutines.channels.p.f19939b
            java.lang.Object r15 = r15.b()
            return r15
        L13:
            kotlinx.coroutines.internal.t0 r8 = kotlinx.coroutines.channels.k.j()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = h()
            java.lang.Object r0 = r0.get(r14)
            kotlinx.coroutines.channels.r r0 = (kotlinx.coroutines.channels.r) r0
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = i()
            long r1 = r1.getAndIncrement(r14)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            boolean r11 = j(r14, r1)
            int r1 = kotlinx.coroutines.channels.k.f19899b
            long r2 = (long) r1
            long r2 = r9 / r2
            long r4 = (long) r1
            long r4 = r9 % r4
            int r12 = (int) r4
            long r4 = r0.f20383c
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L4e
            kotlinx.coroutines.channels.r r1 = c(r14, r2, r0)
            if (r1 != 0) goto L4c
            if (r11 == 0) goto L21
            goto L8e
        L4c:
            r13 = r1
            goto L4f
        L4e:
            r13 = r0
        L4f:
            r0 = r14
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r9
            r6 = r8
            r7 = r11
            int r0 = N(r0, r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto Lb0
            r1 = 1
            if (r0 == r1) goto Lb3
            r1 = 2
            if (r0 == r1) goto L89
            r1 = 3
            if (r0 == r1) goto L7d
            r1 = 4
            if (r0 == r1) goto L71
            r1 = 5
            if (r0 == r1) goto L6c
            goto L6f
        L6c:
            r13.b()
        L6f:
            r0 = r13
            goto L21
        L71:
            long r0 = r14.l0()
            int r15 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r15 >= 0) goto L8e
            r13.b()
            goto L8e
        L7d:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L89:
            if (r11 == 0) goto L99
            r13.r()
        L8e:
            kotlinx.coroutines.channels.p$b r15 = kotlinx.coroutines.channels.p.f19939b
            java.lang.Throwable r0 = r14.m0()
            java.lang.Object r15 = r15.a(r0)
            goto Lbb
        L99:
            boolean r15 = r8 instanceof kotlinx.coroutines.z3
            if (r15 == 0) goto La0
            kotlinx.coroutines.z3 r8 = (kotlinx.coroutines.z3) r8
            goto La1
        La0:
            r8 = 0
        La1:
            if (r8 == 0) goto La6
            y(r14, r8, r13, r12)
        La6:
            r13.r()
            kotlinx.coroutines.channels.p$b r15 = kotlinx.coroutines.channels.p.f19939b
            java.lang.Object r15 = r15.b()
            goto Lbb
        Lb0:
            r13.b()
        Lb3:
            kotlinx.coroutines.channels.p$b r15 = kotlinx.coroutines.channels.p.f19939b
            kotlin.r2 r0 = kotlin.r2.f19517a
            java.lang.Object r15 = r15.c(r0)
        Lbb:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.j.p(java.lang.Object):java.lang.Object");
    }

    @Override // kotlinx.coroutines.channels.g0
    @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @b1(expression = "tryReceive().getOrNull()", imports = {}))
    @p4.m
    public E poll() {
        return (E) l.a.d(this);
    }

    @Override // kotlinx.coroutines.channels.g0
    @p4.l
    public kotlinx.coroutines.selects.g<E> r() {
        c cVar = c.INSTANCE;
        l0.n(cVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        v3.q qVar = (v3.q) u1.q(cVar, 3);
        d dVar = d.INSTANCE;
        l0.n(dVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new kotlinx.coroutines.selects.h(this, qVar, (v3.q) u1.q(dVar, 3), this.f19892c);
    }

    @Override // kotlinx.coroutines.channels.g0
    @p4.l
    public kotlinx.coroutines.selects.g<p<E>> s() {
        e eVar = e.INSTANCE;
        l0.n(eVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        v3.q qVar = (v3.q) u1.q(eVar, 3);
        f fVar = f.INSTANCE;
        l0.n(fVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new kotlinx.coroutines.selects.h(this, qVar, (v3.q) u1.q(fVar, 3), this.f19892c);
    }

    public boolean s1() {
        return r1(f19881d.get(this));
    }

    @Override // kotlinx.coroutines.channels.g0
    @p4.l
    public kotlinx.coroutines.selects.g<E> t() {
        g gVar = g.INSTANCE;
        l0.n(gVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        v3.q qVar = (v3.q) u1.q(gVar, 3);
        h hVar = h.INSTANCE;
        l0.n(hVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new kotlinx.coroutines.selects.h(this, qVar, (v3.q) u1.q(hVar, 3), this.f19892c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p4.l
    public final String t1() {
        List L;
        String valueOf;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("S=");
        sb2.append(n0());
        sb2.append(",R=");
        sb2.append(l0());
        sb2.append(",B=");
        sb2.append(d0());
        sb2.append(",B'=");
        sb2.append(f19884g.get(this));
        sb2.append(",C=");
        AtomicLongFieldUpdater atomicLongFieldUpdater = f19881d;
        sb2.append((int) (atomicLongFieldUpdater.get(this) >> 60));
        sb2.append(',');
        sb.append(sb2.toString());
        int i5 = (int) (atomicLongFieldUpdater.get(this) >> 60);
        if (i5 == 1) {
            sb.append("CANCELLATION_STARTED,");
        } else if (i5 == 2) {
            sb.append("CLOSED,");
        } else if (i5 == 3) {
            sb.append("CANCELLED,");
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("SEND_SEGM=");
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19885h;
        sb3.append(x0.b(atomicReferenceFieldUpdater.get(this)));
        sb3.append(",RCV_SEGM=");
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f19886i;
        sb3.append(x0.b(atomicReferenceFieldUpdater2.get(this)));
        sb.append(sb3.toString());
        if (!A0()) {
            sb.append(",EB_SEGM=" + x0.b(f19887j.get(this)));
        }
        sb.append("  ");
        L = kotlin.collections.w.L(atomicReferenceFieldUpdater2.get(this), atomicReferenceFieldUpdater.get(this), f19887j.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : L) {
            if (((r) obj) != kotlinx.coroutines.channels.k.n()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long j5 = ((r) next).f20383c;
                do {
                    Object next2 = it.next();
                    long j6 = ((r) next2).f20383c;
                    if (j5 > j6) {
                        next = next2;
                        j5 = j6;
                    }
                } while (it.hasNext());
            }
            r rVar = (r) next;
            do {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(x0.b(rVar));
                sb4.append("=[");
                sb4.append(rVar.h() ? org.slf4j.d.ANY_MARKER : "");
                sb4.append(rVar.f20383c);
                sb4.append(",prev=");
                r rVar2 = (r) rVar.g();
                sb4.append(rVar2 != null ? x0.b(rVar2) : null);
                sb4.append(',');
                sb.append(sb4.toString());
                int i6 = kotlinx.coroutines.channels.k.f19899b;
                for (int i7 = 0; i7 < i6; i7++) {
                    Object y4 = rVar.y(i7);
                    Object x4 = rVar.x(i7);
                    if (y4 instanceof kotlinx.coroutines.p) {
                        valueOf = "cont";
                    } else if (y4 instanceof kotlinx.coroutines.selects.m) {
                        valueOf = "select";
                    } else if (y4 instanceof f0) {
                        valueOf = "receiveCatching";
                    } else if (y4 instanceof b) {
                        valueOf = "send(broadcast)";
                    } else if (y4 instanceof k0) {
                        valueOf = "EB(" + y4 + ')';
                    } else {
                        valueOf = String.valueOf(y4);
                    }
                    sb.append('[' + i7 + "]=(" + valueOf + ',' + x4 + "),");
                }
                StringBuilder sb5 = new StringBuilder();
                sb5.append("next=");
                r rVar3 = (r) rVar.e();
                sb5.append(rVar3 != null ? x0.b(rVar3) : null);
                sb5.append("]  ");
                sb.append(sb5.toString());
                rVar = (r) rVar.e();
            } while (rVar != null);
            return sb.toString();
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x01e1, code lost:
    
        r3 = (kotlinx.coroutines.channels.r) r3.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01e8, code lost:
    
        if (r3 != null) goto L101;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @p4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.j.toString():java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.g0
    @p4.l
    public Object v() {
        r rVar;
        z3 z3Var;
        long j5 = f19882e.get(this);
        long j6 = f19881d.get(this);
        if (v0(j6)) {
            return p.f19939b.a(e0());
        }
        if (j5 >= (j6 & 1152921504606846975L)) {
            return p.f19939b.b();
        }
        Object i5 = kotlinx.coroutines.channels.k.i();
        r rVar2 = (r) f19886i.get(this);
        while (!f()) {
            long andIncrement = f19882e.getAndIncrement(this);
            int i6 = kotlinx.coroutines.channels.k.f19899b;
            long j7 = andIncrement / i6;
            int i7 = (int) (andIncrement % i6);
            if (rVar2.f20383c != j7) {
                r a02 = a0(j7, rVar2);
                if (a02 == null) {
                    continue;
                } else {
                    rVar = a02;
                }
            } else {
                rVar = rVar2;
            }
            Object z12 = z1(rVar, i7, andIncrement, i5);
            if (z12 == kotlinx.coroutines.channels.k.r()) {
                if (i5 instanceof z3) {
                    z3Var = (z3) i5;
                } else {
                    z3Var = null;
                }
                if (z3Var != null) {
                    R0(z3Var, rVar, i7);
                }
                F1(andIncrement);
                rVar.r();
                return p.f19939b.b();
            }
            if (z12 == kotlinx.coroutines.channels.k.h()) {
                if (andIncrement < n0()) {
                    rVar.b();
                }
                rVar2 = rVar;
            } else {
                if (z12 != kotlinx.coroutines.channels.k.s()) {
                    rVar.b();
                    return p.f19939b.c(z12);
                }
                throw new IllegalStateException("unexpected".toString());
            }
        }
        return p.f19939b.a(e0());
    }

    @Override // kotlinx.coroutines.channels.g0
    @kotlin.internal.h
    @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @b1(expression = "receiveCatching().getOrNull()", imports = {}))
    @p4.m
    public Object w(@p4.l kotlin.coroutines.d<? super E> dVar) {
        return l.a.e(this, dVar);
    }

    @Override // kotlinx.coroutines.channels.g0
    @p4.m
    public Object x(@p4.l kotlin.coroutines.d<? super p<? extends E>> dVar) {
        return Y0(this, dVar);
    }

    protected boolean y0() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.g0
    public final void cancel(@p4.m CancellationException cancellationException) {
        P(cancellationException);
    }

    public /* synthetic */ j(int i5, v3.l lVar, int i6, kotlin.jvm.internal.w wVar) {
        this(i5, (i6 & 2) != 0 ? null : lVar);
    }
}
