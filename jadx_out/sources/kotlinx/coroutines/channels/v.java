package kotlinx.coroutines.channels;

import com.android.dx.io.Opcodes;
import com.umeng.analytics.pro.bi;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.a1;
import kotlin.collections.p0;
import kotlin.e1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.q1;
import kotlin.r2;
import kotlin.u0;
import kotlinx.coroutines.c2;
import kotlinx.coroutines.k1;

@kotlin.i0(d1 = {"\u0000\u009e\u0001\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001aL\u0010\n\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003j\u0002`\t2\u001a\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000\"\u0006\u0012\u0002\b\u00030\u0001H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a-\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0010\u001a#\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0013\u001a+\u0010\u0016\u001a\u00020\r\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0015\u001a\u00028\u0000H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a#\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0013\u001a+\u0010\u0019\u001a\u00020\r\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0015\u001a\u00028\u0000H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0017\u001a%\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0013\u001a#\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0013\u001a%\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0013\u001a0\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007\u001aV\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\"\u0010%\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001aV\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\"\u0010%\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010'\u001ak\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e27\u0010%\u001a3\b\u0001\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0012\u0006\u0012\u0004\u0018\u00010$0(H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001aV\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\"\u0010%\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010'\u001a$\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\f*\u00020$*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001H\u0001\u001aC\u0010/\u001a\u00028\u0001\"\b\b\u0000\u0010\f*\u00020$\"\u0010\b\u0001\u0010\u0019*\n\u0012\u0006\b\u0000\u0012\u00028\u00000-*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00012\u0006\u0010.\u001a\u00028\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001aA\u00102\u001a\u00028\u0001\"\b\b\u0000\u0010\f*\u00020$\"\u000e\b\u0001\u0010\u0019*\b\u0012\u0004\u0012\u00028\u000001*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00012\u0006\u0010.\u001a\u00028\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a0\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007\u001aV\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\"\u0010%\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0007ø\u0001\u0000¢\u0006\u0004\b5\u0010'\u001a;\u00106\u001a\u00028\u0001\"\u0004\b\u0000\u0010\f\"\u000e\b\u0001\u0010\u0019*\b\u0012\u0004\u0012\u00028\u000001*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010.\u001a\u00028\u0001H\u0081@ø\u0001\u0000¢\u0006\u0004\b6\u00103\u001a=\u00107\u001a\u00028\u0001\"\u0004\b\u0000\u0010\f\"\u0010\b\u0001\u0010\u0019*\n\u0012\u0006\b\u0000\u0012\u00028\u00000-*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010.\u001a\u00028\u0001H\u0081@ø\u0001\u0000¢\u0006\u0004\b7\u00100\u001aA\u0010<\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010;\"\u0004\b\u0000\u00108\"\u0004\b\u0001\u00109*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010:0\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b<\u0010\u0013\u001aW\u0010?\u001a\u00028\u0002\"\u0004\b\u0000\u00108\"\u0004\b\u0001\u00109\"\u0018\b\u0002\u0010>*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010=*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010:0\u00012\u0006\u0010.\u001a\u00028\u0002H\u0081@ø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001a)\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000A\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\bB\u0010\u0013\u001a)\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000C\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\bD\u0010\u0013\u001ab\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\u001c*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2(\u0010E\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0007ø\u0001\u0000¢\u0006\u0004\bF\u0010'\u001a\\\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\u001c*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\"\u0010E\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010'\u001aq\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\u001c*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e27\u0010E\u001a3\b\u0001\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010$0(H\u0001ø\u0001\u0000¢\u0006\u0004\bG\u0010*\u001aw\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\f\"\b\b\u0001\u0010\u001c*\u00020$*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e29\u0010E\u001a5\b\u0001\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010$0(H\u0007ø\u0001\u0000¢\u0006\u0004\bH\u0010*\u001ab\u00108\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\f\"\b\b\u0001\u0010\u001c*\u00020$*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2$\u0010E\u001a \b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0007ø\u0001\u0000¢\u0006\u0004\b8\u0010'\u001a.\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000I0\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007\u001a\u001e\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007\u001a\\\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u00108*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\"\u0010L\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0001ø\u0001\u0000¢\u0006\u0004\bM\u0010'\u001a)\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00000N\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0081@ø\u0001\u0000¢\u0006\u0004\bO\u0010\u0013\u001a#\u0010P\u001a\u00020#\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\bP\u0010\u0013\u001a#\u0010Q\u001a\u00020\r\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\bQ\u0010\u0013\u001aA\u0010>\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010T\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000Rj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`SH\u0087@ø\u0001\u0000¢\u0006\u0004\b>\u0010U\u001aA\u0010V\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010T\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000Rj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`SH\u0087@ø\u0001\u0000¢\u0006\u0004\bV\u0010U\u001a#\u0010W\u001a\u00020#\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\bW\u0010\u0013\u001a$\u0010X\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\f*\u00020$*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001H\u0007\u001a?\u0010Z\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010:0\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\u001c*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u0087\u0004\u001az\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00020\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\u001c\"\u0004\b\u0002\u00109*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00010\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e26\u0010E\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(P\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b([\u0012\u0004\u0012\u00028\u00020!H\u0001\u001a1\u0010[\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003j\u0002`\t*\u0006\u0012\u0002\b\u00030\u0001H\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006]"}, d2 = {"", "Lkotlinx/coroutines/channels/g0;", "channels", "Lkotlin/Function1;", "", "Lkotlin/v0;", "name", "cause", "Lkotlin/r2;", "Lkotlinx/coroutines/CompletionHandler;", "c", "([Lkotlinx/coroutines/channels/g0;)Lv3/l;", "E", "", "index", "l", "(Lkotlinx/coroutines/channels/g0;ILkotlin/coroutines/d;)Ljava/lang/Object;", "m", "w", "(Lkotlinx/coroutines/channels/g0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "x", "element", "A", "(Lkotlinx/coroutines/channels/g0;Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "B", "C", "D", "Q", "R", "n", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, bi.aJ, "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "", "predicate", "j", "(Lkotlinx/coroutines/channels/g0;Lkotlin/coroutines/g;Lv3/p;)Lkotlinx/coroutines/channels/g0;", "Lkotlin/Function3;", bi.aA, "(Lkotlinx/coroutines/channels/g0;Lkotlin/coroutines/g;Lv3/q;)Lkotlinx/coroutines/channels/g0;", "r", bi.aL, "", "destination", bi.aK, "(Lkotlinx/coroutines/channels/g0;Ljava/util/Collection;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/h0;", "v", "(Lkotlinx/coroutines/channels/g0;Lkotlinx/coroutines/channels/h0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "S", "U", "W", "X", "K", "V", "Lkotlin/u0;", "", "Z", "", "M", "Y", "(Lkotlinx/coroutines/channels/g0;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "a0", "", "c0", "transform", "y", "G", "I", "Lkotlin/collections/p0;", "d0", "e", "selector", "f", "", "b0", bi.ay, "d", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "(Lkotlinx/coroutines/channels/g0;Ljava/util/Comparator;Lkotlin/coroutines/d;)Ljava/lang/Object;", "N", "O", "P", "other", "f0", "b", "g0", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xs = "kotlinx/coroutines/channels/ChannelsKt")
@r1({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,479:1\n82#2,11:480\n82#2,11:491\n82#2,11:502\n82#2,11:513\n105#2:524\n82#2,6:525\n106#2:531\n92#2:532\n107#2:533\n88#2,3:534\n82#2,11:537\n105#2:548\n82#2,6:549\n106#2,2:555\n92#2:557\n88#2,3:558\n82#2,11:561\n82#2,11:572\n82#2,11:583\n105#2:594\n82#2,6:595\n106#2,2:601\n92#2:603\n88#2,3:604\n105#2:607\n82#2,6:608\n106#2,2:614\n92#2:616\n88#2,3:617\n105#2:620\n82#2,6:621\n106#2,2:627\n92#2:629\n88#2,3:630\n105#2:633\n82#2,6:634\n106#2,2:640\n92#2:642\n88#2,3:643\n105#2:646\n82#2,6:647\n106#2,2:653\n92#2:655\n88#2,3:656\n82#2,11:659\n105#2:670\n82#2,6:671\n106#2,2:677\n92#2:679\n88#2,3:680\n82#2,11:683\n82#2,11:694\n82#2,11:705\n*S KotlinDebug\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt\n*L\n34#1:480,11\n49#1:491,11\n63#1:502,11\n73#1:513,11\n84#1:524\n84#1:525,6\n84#1:531\n84#1:532\n84#1:533\n84#1:534,3\n95#1:537,11\n110#1:548\n110#1:549,6\n110#1:555,2\n110#1:557\n110#1:558,3\n121#1:561,11\n134#1:572,11\n147#1:583,11\n232#1:594\n232#1:595,6\n232#1:601,2\n232#1:603\n232#1:604,3\n241#1:607\n241#1:608,6\n241#1:614,2\n241#1:616\n241#1:617,3\n277#1:620\n277#1:621,6\n277#1:627,2\n277#1:629\n277#1:630,3\n285#1:633\n285#1:634,6\n285#1:640,2\n285#1:642\n285#1:643,3\n298#1:646\n298#1:647,6\n298#1:653,2\n298#1:655\n298#1:656,3\n403#1:659,11\n411#1:670\n411#1:671,6\n411#1:677,2\n411#1:679\n411#1:680,3\n418#1:683,11\n432#1:694,11\n446#1:705,11\n*E\n"})
/* loaded from: classes4.dex */
public final /* synthetic */ class v {

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0}, l = {404}, m = "any", n = {"$this$consume$iv"}, s = {"L$0"})
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a<E> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object a5;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            a5 = v.a(null, this);
            return a5;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {434, 436}, m = "minWith", n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", "min"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a0<E> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        a0(kotlin.coroutines.d<? super a0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object N;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            N = v.N(null, null, this);
            return N;
        }
    }

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "cause", "Lkotlin/r2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class b extends n0 implements v3.l<Throwable, r2> {
        final /* synthetic */ kotlinx.coroutines.channels.g0<?> $this_consumes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlinx.coroutines.channels.g0<?> g0Var) {
            super(1);
            this.$this_consumes = g0Var;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Throwable th) {
            invoke2(th);
            return r2.f19517a;
        }

        /* renamed from: invoke */
        public final void invoke2(@p4.m Throwable th) {
            kotlinx.coroutines.channels.s.b(this.$this_consumes, th);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0}, l = {447}, m = "none", n = {"$this$consume$iv"}, s = {"L$0"})
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class b0<E> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        b0(kotlin.coroutines.d<? super b0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object O;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            O = v.O(null, this);
            return O;
        }
    }

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "cause", "Lkotlin/r2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$consumesAll$1\n+ 2 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,479:1\n75#2:480\n1#3:481\n*S KotlinDebug\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$consumesAll$1\n*L\n26#1:480\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class c extends n0 implements v3.l<Throwable, r2> {
        final /* synthetic */ kotlinx.coroutines.channels.g0<?>[] $channels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(kotlinx.coroutines.channels.g0<?>[] g0VarArr) {
            super(1);
            this.$channels = g0VarArr;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Throwable th) {
            invoke2(th);
            return r2.f19517a;
        }

        /* renamed from: invoke */
        public final void invoke2(@p4.m Throwable th) {
            Throwable th2 = null;
            for (kotlinx.coroutines.channels.g0<?> g0Var : this.$channels) {
                try {
                    kotlinx.coroutines.channels.s.b(g0Var, th);
                } catch (Throwable th3) {
                    if (th2 == null) {
                        th2 = th3;
                    } else {
                        kotlin.p.a(th2, th3);
                    }
                }
            }
            if (th2 != null) {
                throw th2;
            }
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000H\u008a@"}, d2 = {"", "E", "it", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class c0 extends kotlin.coroutines.jvm.internal.o implements v3.p<Object, kotlin.coroutines.d<Object>, Object> {
        final /* synthetic */ kotlinx.coroutines.channels.g0<Object> $this_requireNoNulls;
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(kotlinx.coroutines.channels.g0<Object> g0Var, kotlin.coroutines.d<? super c0> dVar) {
            super(2, dVar);
            this.$this_requireNoNulls = g0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            c0 c0Var = new c0(this.$this_requireNoNulls, dVar);
            c0Var.L$0 = obj;
            return c0Var;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.m Object obj, @p4.m kotlin.coroutines.d<Object> dVar) {
            return ((c0) create(obj, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                e1.n(obj);
                Object obj2 = this.L$0;
                if (obj2 != null) {
                    return obj2;
                }
                throw new IllegalArgumentException("null element found in " + this.$this_requireNoNulls + external.org.apache.commons.lang3.d.f15957a);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {487}, m = "count", n = {"count", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class d<E> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object d5;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            d5 = v.d(null, this);
            return d5;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {136, 139}, m = "single", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "single"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class d0<E> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        d0(kotlin.coroutines.d<? super d0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object Q;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Q = v.Q(null, this);
            return Q;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {"E", "it", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.o implements v3.p<Object, kotlin.coroutines.d<Object>, Object> {
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        public e(kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            e eVar = new e(dVar);
            eVar.L$0 = obj;
            return eVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(Object obj, @p4.m kotlin.coroutines.d<Object> dVar) {
            return ((e) create(obj, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                e1.n(obj);
                return this.L$0;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {149, 152}, m = "singleOrNull", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "single"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class e0<E> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        e0(kotlin.coroutines.d<? super e0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object R;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            R = v.R(null, this);
            return R;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2, 2}, l = {387, 388, 390}, m = "invokeSuspend", n = {"$this$produce", "keys", "$this$produce", "keys", "e", "$this$produce", "keys", "k"}, s = {"L$0", "L$1", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3"})
    @kotlin.i0(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@"}, d2 = {"E", "K", "Lkotlinx/coroutines/channels/e0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class f<E> extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.channels.e0<? super E>, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ v3.p<E, kotlin.coroutines.d<? super K>, Object> $selector;
        final /* synthetic */ kotlinx.coroutines.channels.g0<E> $this_distinctBy;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(kotlinx.coroutines.channels.g0<? extends E> g0Var, v3.p<? super E, ? super kotlin.coroutines.d<? super K>, ? extends Object> pVar, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.$this_distinctBy = g0Var;
            this.$selector = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            f fVar = new f(this.$this_distinctBy, this.$selector, dVar);
            fVar.L$0 = obj;
            return fVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l kotlinx.coroutines.channels.e0<? super E> e0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((f) create(e0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0082 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00d8  */
        /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v19 */
        /* JADX WARN: Type inference failed for: r6v4 */
        /* JADX WARN: Type inference failed for: r6v9, types: [java.util.Collection] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00c5 -> B:7:0x00cb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00d2 -> B:8:0x0071). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 219
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {Opcodes.CONST_METHOD_HANDLE, 255}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "remaining"}, s = {"L$0", "I$0", "L$0", "I$0"})
    @kotlin.i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"E", "Lkotlinx/coroutines/channels/e0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$take$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,479:1\n1#2:480\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class f0 extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.channels.e0<Object>, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ int $n;
        final /* synthetic */ kotlinx.coroutines.channels.g0<Object> $this_take;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(int i5, kotlinx.coroutines.channels.g0<Object> g0Var, kotlin.coroutines.d<? super f0> dVar) {
            super(2, dVar);
            this.$n = i5;
            this.$this_take = g0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            f0 f0Var = new f0(this.$n, this.$this_take, dVar);
            f0Var.L$0 = obj;
            return f0Var;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l kotlinx.coroutines.channels.e0<Object> e0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((f0) create(e0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0060 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0080 -> B:6:0x0082). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r8.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L36
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1f
                int r1 = r8.I$0
                java.lang.Object r4 = r8.L$1
                kotlinx.coroutines.channels.n r4 = (kotlinx.coroutines.channels.n) r4
                java.lang.Object r5 = r8.L$0
                kotlinx.coroutines.channels.e0 r5 = (kotlinx.coroutines.channels.e0) r5
                kotlin.e1.n(r9)
                r9 = r5
                r5 = r8
                goto L82
            L1f:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L27:
                int r1 = r8.I$0
                java.lang.Object r4 = r8.L$1
                kotlinx.coroutines.channels.n r4 = (kotlinx.coroutines.channels.n) r4
                java.lang.Object r5 = r8.L$0
                kotlinx.coroutines.channels.e0 r5 = (kotlinx.coroutines.channels.e0) r5
                kotlin.e1.n(r9)
                r6 = r8
                goto L65
            L36:
                kotlin.e1.n(r9)
                java.lang.Object r9 = r8.L$0
                kotlinx.coroutines.channels.e0 r9 = (kotlinx.coroutines.channels.e0) r9
                int r1 = r8.$n
                if (r1 != 0) goto L44
                kotlin.r2 r9 = kotlin.r2.f19517a
                return r9
            L44:
                if (r1 < 0) goto L48
                r4 = r3
                goto L49
            L48:
                r4 = 0
            L49:
                if (r4 == 0) goto L8c
                kotlinx.coroutines.channels.g0<java.lang.Object> r4 = r8.$this_take
                kotlinx.coroutines.channels.n r4 = r4.iterator()
                r5 = r8
            L52:
                r5.L$0 = r9
                r5.L$1 = r4
                r5.I$0 = r1
                r5.label = r3
                java.lang.Object r6 = r4.c(r5)
                if (r6 != r0) goto L61
                return r0
            L61:
                r7 = r5
                r5 = r9
                r9 = r6
                r6 = r7
            L65:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L89
                java.lang.Object r9 = r4.next()
                r6.L$0 = r5
                r6.L$1 = r4
                r6.I$0 = r1
                r6.label = r2
                java.lang.Object r9 = r5.F(r9, r6)
                if (r9 != r0) goto L80
                return r0
            L80:
                r9 = r5
                r5 = r6
            L82:
                int r1 = r1 + (-1)
                if (r1 != 0) goto L52
                kotlin.r2 r9 = kotlin.r2.f19517a
                return r9
            L89:
                kotlin.r2 r9 = kotlin.r2.f19517a
                return r9
            L8c:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r0 = "Requested element count "
                r9.append(r0)
                r9.append(r1)
                java.lang.String r0 = " is less than zero."
                r9.append(r0)
                java.lang.String r9 = r9.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r9 = r9.toString()
                r0.<init>(r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.f0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1", f = "Deprecated.kt", i = {0, 0, 1, 2}, l = {164, 169, 170}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "$this$produce"}, s = {"L$0", "I$0", "L$0", "L$0"})
    @kotlin.i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"E", "Lkotlinx/coroutines/channels/e0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$drop$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,479:1\n1#2:480\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.channels.e0<Object>, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ int $n;
        final /* synthetic */ kotlinx.coroutines.channels.g0<Object> $this_drop;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i5, kotlinx.coroutines.channels.g0<Object> g0Var, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.$n = i5;
            this.$this_drop = g0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            g gVar = new g(this.$n, this.$this_drop, dVar);
            gVar.L$0 = obj;
            return gVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l kotlinx.coroutines.channels.e0<Object> e0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((g) create(e0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00ca  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0076 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x00ab A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00c8 -> B:7:0x009f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0077 -> B:24:0x007e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 237
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1", f = "Deprecated.kt", i = {0, 1, 1, 2}, l = {269, 270, 271}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0"})
    @kotlin.i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"E", "Lkotlinx/coroutines/channels/e0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class g0 extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.channels.e0<Object>, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ v3.p<Object, kotlin.coroutines.d<? super Boolean>, Object> $predicate;
        final /* synthetic */ kotlinx.coroutines.channels.g0<Object> $this_takeWhile;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g0(kotlinx.coroutines.channels.g0<Object> g0Var, v3.p<Object, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar, kotlin.coroutines.d<? super g0> dVar) {
            super(2, dVar);
            this.$this_takeWhile = g0Var;
            this.$predicate = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            g0 g0Var = new g0(this.$this_takeWhile, this.$predicate, dVar);
            g0Var.L$0 = obj;
            return g0Var;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l kotlinx.coroutines.channels.e0<Object> e0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((g0) create(e0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0063 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00ac  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a7 -> B:8:0x0057). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r9.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L48
                if (r1 == r4) goto L38
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r9.L$1
                kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
                java.lang.Object r5 = r9.L$0
                kotlinx.coroutines.channels.e0 r5 = (kotlinx.coroutines.channels.e0) r5
                kotlin.e1.n(r10)
                goto L56
            L1d:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L25:
                java.lang.Object r1 = r9.L$2
                java.lang.Object r5 = r9.L$1
                kotlinx.coroutines.channels.n r5 = (kotlinx.coroutines.channels.n) r5
                java.lang.Object r6 = r9.L$0
                kotlinx.coroutines.channels.e0 r6 = (kotlinx.coroutines.channels.e0) r6
                kotlin.e1.n(r10)
                r7 = r6
                r6 = r5
                r5 = r1
                r1 = r0
                r0 = r9
                goto L8c
            L38:
                java.lang.Object r1 = r9.L$1
                kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
                java.lang.Object r5 = r9.L$0
                kotlinx.coroutines.channels.e0 r5 = (kotlinx.coroutines.channels.e0) r5
                kotlin.e1.n(r10)
                r6 = r5
                r5 = r1
                r1 = r0
                r0 = r9
                goto L6a
            L48:
                kotlin.e1.n(r10)
                java.lang.Object r10 = r9.L$0
                kotlinx.coroutines.channels.e0 r10 = (kotlinx.coroutines.channels.e0) r10
                kotlinx.coroutines.channels.g0<java.lang.Object> r1 = r9.$this_takeWhile
                kotlinx.coroutines.channels.n r1 = r1.iterator()
                r5 = r10
            L56:
                r10 = r9
            L57:
                r10.L$0 = r5
                r10.L$1 = r1
                r10.label = r4
                java.lang.Object r6 = r1.c(r10)
                if (r6 != r0) goto L64
                return r0
            L64:
                r8 = r0
                r0 = r10
                r10 = r6
                r6 = r5
                r5 = r1
                r1 = r8
            L6a:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto Lac
                java.lang.Object r10 = r5.next()
                v3.p<java.lang.Object, kotlin.coroutines.d<? super java.lang.Boolean>, java.lang.Object> r7 = r0.$predicate
                r0.L$0 = r6
                r0.L$1 = r5
                r0.L$2 = r10
                r0.label = r3
                java.lang.Object r7 = r7.invoke(r10, r0)
                if (r7 != r1) goto L87
                return r1
            L87:
                r8 = r5
                r5 = r10
                r10 = r7
                r7 = r6
                r6 = r8
            L8c:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 != 0) goto L97
                kotlin.r2 r10 = kotlin.r2.f19517a
                return r10
            L97:
                r0.L$0 = r7
                r0.L$1 = r6
                r10 = 0
                r0.L$2 = r10
                r0.label = r2
                java.lang.Object r10 = r7.F(r5, r0)
                if (r10 != r1) goto La7
                return r1
            La7:
                r10 = r0
                r0 = r1
                r1 = r6
                r5 = r7
                goto L57
            Lac:
                kotlin.r2 r10 = kotlin.r2.f19517a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.g0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1", f = "Deprecated.kt", i = {0, 1, 1, 2, 3, 4}, l = {181, 182, 183, 187, 188}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0", "L$0", "L$0"})
    @kotlin.i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"E", "Lkotlinx/coroutines/channels/e0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.channels.e0<Object>, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ v3.p<Object, kotlin.coroutines.d<? super Boolean>, Object> $predicate;
        final /* synthetic */ kotlinx.coroutines.channels.g0<Object> $this_dropWhile;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(kotlinx.coroutines.channels.g0<Object> g0Var, v3.p<Object, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.$this_dropWhile = g0Var;
            this.$predicate = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            h hVar = new h(this.$this_dropWhile, this.$predicate, dVar);
            hVar.L$0 = obj;
            return hVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l kotlinx.coroutines.channels.e0<Object> e0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((h) create(e0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x00e5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:13:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x00f1  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0104  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x008d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0102 -> B:9:0x00d9). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00b1 -> B:29:0x00b5). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 263
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {487, 278}, m = "toChannel", n = {"destination", "$this$consume$iv$iv", "destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class h0<E, C extends kotlinx.coroutines.channels.h0<? super E>> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        h0(kotlin.coroutines.d<? super h0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.channels.s.e0(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {38}, m = "elementAt", n = {"$this$consume$iv", "index", "count"}, s = {"L$0", "I$0", "I$1"})
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class i<E> extends kotlin.coroutines.jvm.internal.d {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        i(kotlin.coroutines.d<? super i> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            l5 = v.l(null, 0, this);
            return l5;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {487}, m = "toCollection", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class i0<E, C extends Collection<? super E>> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        i0(kotlin.coroutines.d<? super i0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.channels.s.f0(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {53}, m = "elementAtOrNull", n = {"$this$consume$iv", "index", "count"}, s = {"L$0", "I$0", "I$1"})
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class j<E> extends kotlin.coroutines.jvm.internal.d {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        j(kotlin.coroutines.d<? super j> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object m5;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            m5 = v.m(null, 0, this);
            return m5;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {487}, m = "toMap", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class j0<K, V, M extends Map<? super K, ? super V>> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        j0(kotlin.coroutines.d<? super j0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.channels.s.h0(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1", f = "Deprecated.kt", i = {0, 1, 1, 2}, l = {198, 199, 199}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0"})
    @kotlin.i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"E", "Lkotlinx/coroutines/channels/e0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class k<E> extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.channels.e0<? super E>, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ v3.p<E, kotlin.coroutines.d<? super Boolean>, Object> $predicate;
        final /* synthetic */ kotlinx.coroutines.channels.g0<E> $this_filter;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(kotlinx.coroutines.channels.g0<? extends E> g0Var, v3.p<? super E, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar, kotlin.coroutines.d<? super k> dVar) {
            super(2, dVar);
            this.$this_filter = g0Var;
            this.$predicate = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            k kVar = new k(this.$this_filter, this.$predicate, dVar);
            kVar.L$0 = obj;
            return kVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l kotlinx.coroutines.channels.e0<? super E> e0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((k) create(e0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
        
            r11 = r0;
            r0 = r1;
            r1 = r6;
            r6 = r8;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0065 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r10.label
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L48
                if (r1 == r5) goto L38
                if (r1 == r4) goto L26
                if (r1 != r3) goto L1e
                java.lang.Object r1 = r10.L$1
                kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
                java.lang.Object r6 = r10.L$0
                kotlinx.coroutines.channels.e0 r6 = (kotlinx.coroutines.channels.e0) r6
                kotlin.e1.n(r11)
                goto L56
            L1e:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L26:
                java.lang.Object r1 = r10.L$2
                java.lang.Object r6 = r10.L$1
                kotlinx.coroutines.channels.n r6 = (kotlinx.coroutines.channels.n) r6
                java.lang.Object r7 = r10.L$0
                kotlinx.coroutines.channels.e0 r7 = (kotlinx.coroutines.channels.e0) r7
                kotlin.e1.n(r11)
                r8 = r7
                r7 = r1
                r1 = r0
                r0 = r10
                goto L8d
            L38:
                java.lang.Object r1 = r10.L$1
                kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
                java.lang.Object r6 = r10.L$0
                kotlinx.coroutines.channels.e0 r6 = (kotlinx.coroutines.channels.e0) r6
                kotlin.e1.n(r11)
                r7 = r6
                r6 = r1
                r1 = r0
                r0 = r10
                goto L6c
            L48:
                kotlin.e1.n(r11)
                java.lang.Object r11 = r10.L$0
                kotlinx.coroutines.channels.e0 r11 = (kotlinx.coroutines.channels.e0) r11
                kotlinx.coroutines.channels.g0<E> r1 = r10.$this_filter
                kotlinx.coroutines.channels.n r1 = r1.iterator()
                r6 = r11
            L56:
                r11 = r10
            L57:
                r11.L$0 = r6
                r11.L$1 = r1
                r11.L$2 = r2
                r11.label = r5
                java.lang.Object r7 = r1.c(r11)
                if (r7 != r0) goto L66
                return r0
            L66:
                r9 = r0
                r0 = r11
                r11 = r7
                r7 = r6
                r6 = r1
                r1 = r9
            L6c:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto La9
                java.lang.Object r11 = r6.next()
                v3.p<E, kotlin.coroutines.d<? super java.lang.Boolean>, java.lang.Object> r8 = r0.$predicate
                r0.L$0 = r7
                r0.L$1 = r6
                r0.L$2 = r11
                r0.label = r4
                java.lang.Object r8 = r8.invoke(r11, r0)
                if (r8 != r1) goto L89
                return r1
            L89:
                r9 = r7
                r7 = r11
                r11 = r8
                r8 = r9
            L8d:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto La4
                r0.L$0 = r8
                r0.L$1 = r6
                r0.L$2 = r2
                r0.label = r3
                java.lang.Object r11 = r8.F(r7, r0)
                if (r11 != r1) goto La4
                return r1
            La4:
                r11 = r0
                r0 = r1
                r1 = r6
                r6 = r8
                goto L57
            La9:
                kotlin.r2 r11 = kotlin.r2.f19517a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {370, 371}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "I$0"})
    @kotlin.i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u008a@"}, d2 = {"E", "Lkotlinx/coroutines/channels/e0;", "Lkotlin/collections/p0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class k0 extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.channels.e0<? super p0<Object>>, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ kotlinx.coroutines.channels.g0<Object> $this_withIndex;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(kotlinx.coroutines.channels.g0<Object> g0Var, kotlin.coroutines.d<? super k0> dVar) {
            super(2, dVar);
            this.$this_withIndex = g0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            k0 k0Var = new k0(this.$this_withIndex, dVar);
            k0Var.L$0 = obj;
            return k0Var;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l kotlinx.coroutines.channels.e0<? super p0<Object>> e0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((k0) create(e0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x007f -> B:6:0x0047). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r11.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L38
                if (r1 == r3) goto L29
                if (r1 != r2) goto L21
                int r1 = r11.I$0
                java.lang.Object r4 = r11.L$1
                kotlinx.coroutines.channels.n r4 = (kotlinx.coroutines.channels.n) r4
                java.lang.Object r5 = r11.L$0
                kotlinx.coroutines.channels.e0 r5 = (kotlinx.coroutines.channels.e0) r5
                kotlin.e1.n(r12)
                r12 = r5
                r5 = r11
                r9 = r4
                r4 = r1
                r1 = r9
                goto L47
            L21:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L29:
                int r1 = r11.I$0
                java.lang.Object r4 = r11.L$1
                kotlinx.coroutines.channels.n r4 = (kotlinx.coroutines.channels.n) r4
                java.lang.Object r5 = r11.L$0
                kotlinx.coroutines.channels.e0 r5 = (kotlinx.coroutines.channels.e0) r5
                kotlin.e1.n(r12)
                r6 = r11
                goto L5d
            L38:
                kotlin.e1.n(r12)
                java.lang.Object r12 = r11.L$0
                kotlinx.coroutines.channels.e0 r12 = (kotlinx.coroutines.channels.e0) r12
                kotlinx.coroutines.channels.g0<java.lang.Object> r1 = r11.$this_withIndex
                kotlinx.coroutines.channels.n r1 = r1.iterator()
                r4 = 0
                r5 = r11
            L47:
                r5.L$0 = r12
                r5.L$1 = r1
                r5.I$0 = r4
                r5.label = r3
                java.lang.Object r6 = r1.c(r5)
                if (r6 != r0) goto L56
                return r0
            L56:
                r9 = r5
                r5 = r12
                r12 = r6
                r6 = r9
                r10 = r4
                r4 = r1
                r1 = r10
            L5d:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto L84
                java.lang.Object r12 = r4.next()
                kotlin.collections.p0 r7 = new kotlin.collections.p0
                int r8 = r1 + 1
                r7.<init>(r1, r12)
                r6.L$0 = r5
                r6.L$1 = r4
                r6.I$0 = r8
                r6.label = r2
                java.lang.Object r12 = r5.F(r7, r6)
                if (r12 != r0) goto L7f
                return r0
            L7f:
                r1 = r4
                r12 = r5
                r5 = r6
                r4 = r8
                goto L47
            L84:
                kotlin.r2 r12 = kotlin.r2.f19517a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.k0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2}, l = {Opcodes.DIV_INT_LIT16, Opcodes.REM_INT_LIT16, Opcodes.REM_INT_LIT16}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "e", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "L$2", "I$0", "L$0", "I$0"})
    @kotlin.i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"E", "Lkotlinx/coroutines/channels/e0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.channels.e0<Object>, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ v3.q<Integer, Object, kotlin.coroutines.d<? super Boolean>, Object> $predicate;
        final /* synthetic */ kotlinx.coroutines.channels.g0<Object> $this_filterIndexed;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(kotlinx.coroutines.channels.g0<Object> g0Var, v3.q<? super Integer, Object, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> qVar, kotlin.coroutines.d<? super l> dVar) {
            super(2, dVar);
            this.$this_filterIndexed = g0Var;
            this.$predicate = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            l lVar = new l(this.$this_filterIndexed, this.$predicate, dVar);
            lVar.L$0 = obj;
            return lVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l kotlinx.coroutines.channels.e0<Object> e0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((l) create(e0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
        
            r13 = r0;
            r0 = r1;
            r7 = r8;
            r1 = r10;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00c5  */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 200
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @kotlin.i0(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"E", "R", "t1", "t2", "Lkotlin/u0;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class l0 extends n0 implements v3.p<Object, Object, u0<Object, Object>> {
        public static final l0 INSTANCE = new l0();

        l0() {
            super(2);
        }

        @Override // v3.p
        @p4.l
        public final u0<Object, Object> invoke(Object obj, Object obj2) {
            return q1.a(obj, obj2);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1", f = "Deprecated.kt", i = {}, l = {Opcodes.OR_INT_LIT8}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {"E", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class m extends kotlin.coroutines.jvm.internal.o implements v3.p<Object, kotlin.coroutines.d<? super Boolean>, Object> {
        final /* synthetic */ v3.p<Object, kotlin.coroutines.d<? super Boolean>, Object> $predicate;
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public m(v3.p<Object, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar, kotlin.coroutines.d<? super m> dVar) {
            super(2, dVar);
            this.$predicate = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            m mVar = new m(this.$predicate, dVar);
            mVar.L$0 = obj;
            return mVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(Object obj, @p4.m kotlin.coroutines.d<? super Boolean> dVar) {
            return ((m) create(obj, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            l5 = kotlin.coroutines.intrinsics.d.l();
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 == 1) {
                    e1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                e1.n(obj);
                Object obj2 = this.L$0;
                v3.p<Object, kotlin.coroutines.d<? super Boolean>, Object> pVar = this.$predicate;
                this.label = 1;
                obj = pVar.invoke(obj2, this);
                if (obj == l5) {
                    return l5;
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(!((Boolean) obj).booleanValue());
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, l = {487, 469, 471}, m = "invokeSuspend", n = {"$this$produce", "otherIterator", "$this$consume$iv$iv", "$this$produce", "otherIterator", "$this$consume$iv$iv", "element1", "$this$produce", "otherIterator", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$5", "L$0", "L$1", "L$3"})
    @kotlin.i0(d1 = {"\u0000\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u0003H\u008a@"}, d2 = {"E", "R", "V", "Lkotlinx/coroutines/channels/e0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$zip$2\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,479:1\n105#2:480\n82#2,6:481\n106#2,2:487\n92#2:489\n88#2,3:490\n*S KotlinDebug\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$zip$2\n*L\n468#1:480\n468#1:481,6\n468#1:487,2\n468#1:489\n468#1:490,3\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class m0<V> extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.channels.e0<? super V>, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ kotlinx.coroutines.channels.g0<R> $other;
        final /* synthetic */ kotlinx.coroutines.channels.g0<E> $this_zip;
        final /* synthetic */ v3.p<E, R, V> $transform;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        m0(kotlinx.coroutines.channels.g0<? extends R> g0Var, kotlinx.coroutines.channels.g0<? extends E> g0Var2, v3.p<? super E, ? super R, ? extends V> pVar, kotlin.coroutines.d<? super m0> dVar) {
            super(2, dVar);
            this.$other = g0Var;
            this.$this_zip = g0Var2;
            this.$transform = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            m0 m0Var = new m0(this.$other, this.$this_zip, this.$transform, dVar);
            m0Var.L$0 = obj;
            return m0Var;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l kotlinx.coroutines.channels.e0<? super V> e0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((m0) create(e0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x00ab A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00bd A[Catch: all -> 0x005a, TRY_LEAVE, TryCatch #1 {all -> 0x005a, blocks: (B:16:0x00b5, B:18:0x00bd, B:39:0x0115, B:50:0x004e), top: B:49:0x004e }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00e5 A[Catch: all -> 0x0112, TRY_LEAVE, TryCatch #0 {all -> 0x0112, blocks: (B:23:0x00dd, B:25:0x00e5), top: B:22:0x00dd }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x010a  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0115 A[Catch: all -> 0x005a, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x005a, blocks: (B:16:0x00b5, B:18:0x00bd, B:39:0x0115, B:50:0x004e), top: B:49:0x004e }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0102 -> B:10:0x0104). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x010a -> B:11:0x0097). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 290
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.m0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000H\u008a@"}, d2 = {"", "E", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class n<E> extends kotlin.coroutines.jvm.internal.o implements v3.p<E, kotlin.coroutines.d<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        n(kotlin.coroutines.d<? super n> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            n nVar = new n(dVar);
            nVar.L$0 = obj;
            return nVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v3.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, kotlin.coroutines.d<? super Boolean> dVar) {
            return invoke2((n<E>) obj, dVar);
        }

        @p4.m
        /* renamed from: invoke */
        public final Object invoke2(@p4.m E e5, @p4.m kotlin.coroutines.d<? super Boolean> dVar) {
            return ((n) create(e5, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            boolean z4;
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                e1.n(obj);
                if (this.L$0 != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                return kotlin.coroutines.jvm.internal.b.a(z4);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {487}, m = "filterNotNullTo", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class o<E, C extends Collection<? super E>> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        o(kotlin.coroutines.d<? super o> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object u4;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            u4 = v.u(null, null, this);
            return u4;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {487, 242}, m = "filterNotNullTo", n = {"destination", "$this$consume$iv$iv", "destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class p<E, C extends kotlinx.coroutines.channels.h0<? super E>> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        p(kotlin.coroutines.d<? super p> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object v4;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            v4 = v.v(null, null, this);
            return v4;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {65}, m = "first", n = {"$this$consume$iv", "iterator"}, s = {"L$0", "L$1"})
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class q<E> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        q(kotlin.coroutines.d<? super q> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object w4;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            w4 = v.w(null, this);
            return w4;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {75}, m = "firstOrNull", n = {"$this$consume$iv", "iterator"}, s = {"L$0", "L$1"})
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class r<E> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        r(kotlin.coroutines.d<? super r> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object x4;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            x4 = v.x(null, this);
            return x4;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1", f = "Deprecated.kt", i = {0, 1, 2}, l = {321, 322, 322}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
    @kotlin.i0(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"E", "R", "Lkotlinx/coroutines/channels/e0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class s extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.channels.e0<Object>, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ kotlinx.coroutines.channels.g0<Object> $this_flatMap;
        final /* synthetic */ v3.p<Object, kotlin.coroutines.d<? super kotlinx.coroutines.channels.g0<Object>>, Object> $transform;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public s(kotlinx.coroutines.channels.g0<Object> g0Var, v3.p<Object, ? super kotlin.coroutines.d<? super kotlinx.coroutines.channels.g0<Object>>, ? extends Object> pVar, kotlin.coroutines.d<? super s> dVar) {
            super(2, dVar);
            this.$this_flatMap = g0Var;
            this.$transform = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            s sVar = new s(this.$this_flatMap, this.$transform, dVar);
            sVar.L$0 = obj;
            return sVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l kotlinx.coroutines.channels.e0<Object> e0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((s) create(e0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0060 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0090 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0096  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0091 -> B:8:0x0054). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r9.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L45
                if (r1 == r4) goto L35
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r9.L$1
                kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
                java.lang.Object r5 = r9.L$0
                kotlinx.coroutines.channels.e0 r5 = (kotlinx.coroutines.channels.e0) r5
                kotlin.e1.n(r10)
                goto L53
            L1d:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L25:
                java.lang.Object r1 = r9.L$1
                kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
                java.lang.Object r5 = r9.L$0
                kotlinx.coroutines.channels.e0 r5 = (kotlinx.coroutines.channels.e0) r5
                kotlin.e1.n(r10)
                r6 = r5
                r5 = r1
                r1 = r0
                r0 = r9
                goto L82
            L35:
                java.lang.Object r1 = r9.L$1
                kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
                java.lang.Object r5 = r9.L$0
                kotlinx.coroutines.channels.e0 r5 = (kotlinx.coroutines.channels.e0) r5
                kotlin.e1.n(r10)
                r6 = r5
                r5 = r1
                r1 = r0
                r0 = r9
                goto L67
            L45:
                kotlin.e1.n(r10)
                java.lang.Object r10 = r9.L$0
                kotlinx.coroutines.channels.e0 r10 = (kotlinx.coroutines.channels.e0) r10
                kotlinx.coroutines.channels.g0<java.lang.Object> r1 = r9.$this_flatMap
                kotlinx.coroutines.channels.n r1 = r1.iterator()
                r5 = r10
            L53:
                r10 = r9
            L54:
                r10.L$0 = r5
                r10.L$1 = r1
                r10.label = r4
                java.lang.Object r6 = r1.c(r10)
                if (r6 != r0) goto L61
                return r0
            L61:
                r8 = r0
                r0 = r10
                r10 = r6
                r6 = r5
                r5 = r1
                r1 = r8
            L67:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto L96
                java.lang.Object r10 = r5.next()
                v3.p<java.lang.Object, kotlin.coroutines.d<? super kotlinx.coroutines.channels.g0<java.lang.Object>>, java.lang.Object> r7 = r0.$transform
                r0.L$0 = r6
                r0.L$1 = r5
                r0.label = r3
                java.lang.Object r10 = r7.invoke(r10, r0)
                if (r10 != r1) goto L82
                return r1
            L82:
                kotlinx.coroutines.channels.g0 r10 = (kotlinx.coroutines.channels.g0) r10
                r0.L$0 = r6
                r0.L$1 = r5
                r0.label = r2
                java.lang.Object r10 = kotlinx.coroutines.channels.s.e0(r10, r6, r0)
                if (r10 != r1) goto L91
                return r1
            L91:
                r10 = r0
                r0 = r1
                r1 = r5
                r5 = r6
                goto L54
            L96:
                kotlin.r2 r10 = kotlin.r2.f19517a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.s.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {487}, m = "indexOf", n = {"element", "index", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2"})
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class t<E> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        t(kotlin.coroutines.d<? super t> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object A;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            A = v.A(null, null, this);
            return A;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1, 1}, l = {97, 100}, m = "last", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class u<E> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        u(kotlin.coroutines.d<? super u> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object B;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            B = v.B(null, this);
            return B;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 0}, l = {487}, m = "lastIndexOf", n = {"element", "lastIndex", "index", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3"})
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.channels.v$v */
    /* loaded from: classes4.dex */
    public static final class C0571v<E> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C0571v(kotlin.coroutines.d<? super C0571v> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object C;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            C = v.C(null, null, this);
            return C;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1, 1}, l = {123, 126}, m = "lastOrNull", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class w<E> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        w(kotlin.coroutines.d<? super w> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object D;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            D = v.D(null, this);
            return D;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {487, 333, 333}, m = "invokeSuspend", n = {"$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv"}, s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2"})
    @kotlin.i0(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"E", "R", "Lkotlinx/coroutines/channels/e0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$map$1\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,479:1\n105#2:480\n82#2,6:481\n106#2,2:487\n92#2:489\n88#2,3:490\n*S KotlinDebug\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$map$1\n*L\n332#1:480\n332#1:481,6\n332#1:487,2\n332#1:489\n332#1:490,3\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class x<R> extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.channels.e0<? super R>, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ kotlinx.coroutines.channels.g0<E> $this_map;
        final /* synthetic */ v3.p<E, kotlin.coroutines.d<? super R>, Object> $transform;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        x(kotlinx.coroutines.channels.g0<? extends E> g0Var, v3.p<? super E, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar, kotlin.coroutines.d<? super x> dVar) {
            super(2, dVar);
            this.$this_map = g0Var;
            this.$transform = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            x xVar = new x(this.$this_map, this.$transform, dVar);
            xVar.L$0 = obj;
            return xVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l kotlinx.coroutines.channels.e0<? super R> e0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((x) create(e0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0093 A[Catch: all -> 0x00cf, TRY_LEAVE, TryCatch #2 {all -> 0x00cf, blocks: (B:8:0x0022, B:10:0x0076, B:15:0x008b, B:17:0x0093, B:34:0x00c9, B:45:0x005e, B:48:0x006e), top: B:2:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00c2 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00c9 A[Catch: all -> 0x00cf, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00cf, blocks: (B:8:0x0022, B:10:0x0076, B:15:0x008b, B:17:0x0093, B:34:0x00c9, B:45:0x005e, B:48:0x006e), top: B:2:0x000a }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00c3 -> B:10:0x0076). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 214
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.x.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {344, 345, 345}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "I$0", "L$0", "I$0"})
    @kotlin.i0(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"E", "R", "Lkotlinx/coroutines/channels/e0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class y<R> extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.channels.e0<? super R>, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ kotlinx.coroutines.channels.g0<E> $this_mapIndexed;
        final /* synthetic */ v3.q<Integer, E, kotlin.coroutines.d<? super R>, Object> $transform;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        y(kotlinx.coroutines.channels.g0<? extends E> g0Var, v3.q<? super Integer, ? super E, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar, kotlin.coroutines.d<? super y> dVar) {
            super(2, dVar);
            this.$this_mapIndexed = g0Var;
            this.$transform = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            y yVar = new y(this.$this_mapIndexed, this.$transform, dVar);
            yVar.L$0 = obj;
            return yVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l kotlinx.coroutines.channels.e0<? super R> e0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((y) create(e0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00ac A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00b1  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00ad -> B:7:0x005e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r11.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L4c
                if (r1 == r4) goto L3d
                if (r1 == r3) goto L29
                if (r1 != r2) goto L21
                int r1 = r11.I$0
                java.lang.Object r5 = r11.L$1
                kotlinx.coroutines.channels.n r5 = (kotlinx.coroutines.channels.n) r5
                java.lang.Object r6 = r11.L$0
                kotlinx.coroutines.channels.e0 r6 = (kotlinx.coroutines.channels.e0) r6
                kotlin.e1.n(r12)
                r12 = r6
                r6 = r11
                goto L5e
            L21:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L29:
                int r1 = r11.I$0
                java.lang.Object r5 = r11.L$2
                kotlinx.coroutines.channels.e0 r5 = (kotlinx.coroutines.channels.e0) r5
                java.lang.Object r6 = r11.L$1
                kotlinx.coroutines.channels.n r6 = (kotlinx.coroutines.channels.n) r6
                java.lang.Object r7 = r11.L$0
                kotlinx.coroutines.channels.e0 r7 = (kotlinx.coroutines.channels.e0) r7
                kotlin.e1.n(r12)
                r8 = r11
                goto L9b
            L3d:
                int r1 = r11.I$0
                java.lang.Object r5 = r11.L$1
                kotlinx.coroutines.channels.n r5 = (kotlinx.coroutines.channels.n) r5
                java.lang.Object r6 = r11.L$0
                kotlinx.coroutines.channels.e0 r6 = (kotlinx.coroutines.channels.e0) r6
                kotlin.e1.n(r12)
                r7 = r11
                goto L71
            L4c:
                kotlin.e1.n(r12)
                java.lang.Object r12 = r11.L$0
                kotlinx.coroutines.channels.e0 r12 = (kotlinx.coroutines.channels.e0) r12
                kotlinx.coroutines.channels.g0<E> r1 = r11.$this_mapIndexed
                kotlinx.coroutines.channels.n r1 = r1.iterator()
                r5 = 0
                r6 = r11
                r10 = r5
                r5 = r1
                r1 = r10
            L5e:
                r6.L$0 = r12
                r6.L$1 = r5
                r6.I$0 = r1
                r6.label = r4
                java.lang.Object r7 = r5.c(r6)
                if (r7 != r0) goto L6d
                return r0
            L6d:
                r10 = r6
                r6 = r12
                r12 = r7
                r7 = r10
            L71:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto Lb1
                java.lang.Object r12 = r5.next()
                v3.q<java.lang.Integer, E, kotlin.coroutines.d<? super R>, java.lang.Object> r8 = r7.$transform
                int r9 = r1 + 1
                java.lang.Integer r1 = kotlin.coroutines.jvm.internal.b.f(r1)
                r7.L$0 = r6
                r7.L$1 = r5
                r7.L$2 = r6
                r7.I$0 = r9
                r7.label = r3
                java.lang.Object r12 = r8.invoke(r1, r12, r7)
                if (r12 != r0) goto L96
                return r0
            L96:
                r8 = r7
                r1 = r9
                r7 = r6
                r6 = r5
                r5 = r7
            L9b:
                r8.L$0 = r7
                r8.L$1 = r6
                r9 = 0
                r8.L$2 = r9
                r8.I$0 = r1
                r8.label = r2
                java.lang.Object r12 = r5.F(r12, r8)
                if (r12 != r0) goto Lad
                return r0
            Lad:
                r5 = r6
                r12 = r7
                r6 = r8
                goto L5e
            Lb1:
                kotlin.r2 r12 = kotlin.r2.f19517a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.y.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {420, 422}, m = "maxWith", n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", "max"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class z<E> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        z(kotlin.coroutines.d<? super z> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object M;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            M = v.M(null, null, this);
            return M;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0070 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:11:0x0033, B:12:0x0067, B:14:0x0070, B:16:0x007a, B:20:0x0084, B:21:0x0053, B:25:0x008b), top: B:10:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #1 {all -> 0x0037, blocks: (B:11:0x0033, B:12:0x0067, B:14:0x0070, B:16:0x007a, B:20:0x0084, B:21:0x0053, B:25:0x008b), top: B:10:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0064 -> B:12:0x0067). Please report as a decompilation issue!!! */
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object A(kotlinx.coroutines.channels.g0 r7, java.lang.Object r8, kotlin.coroutines.d r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.v.t
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.channels.v$t r0 = (kotlinx.coroutines.channels.v.t) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.v$t r0 = new kotlinx.coroutines.channels.v$t
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r7 = r0.L$3
            kotlinx.coroutines.channels.n r7 = (kotlinx.coroutines.channels.n) r7
            java.lang.Object r8 = r0.L$2
            kotlinx.coroutines.channels.g0 r8 = (kotlinx.coroutines.channels.g0) r8
            java.lang.Object r2 = r0.L$1
            kotlin.jvm.internal.k1$f r2 = (kotlin.jvm.internal.k1.f) r2
            java.lang.Object r4 = r0.L$0
            kotlin.e1.n(r9)     // Catch: java.lang.Throwable -> L37
            goto L67
        L37:
            r7 = move-exception
            goto L9a
        L3a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L42:
            kotlin.e1.n(r9)
            kotlin.jvm.internal.k1$f r9 = new kotlin.jvm.internal.k1$f
            r9.<init>()
            kotlinx.coroutines.channels.n r2 = r7.iterator()     // Catch: java.lang.Throwable -> L96
            r6 = r8
            r8 = r7
            r7 = r2
            r2 = r9
            r9 = r6
        L53:
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L37
            r0.L$1 = r2     // Catch: java.lang.Throwable -> L37
            r0.L$2 = r8     // Catch: java.lang.Throwable -> L37
            r0.L$3 = r7     // Catch: java.lang.Throwable -> L37
            r0.label = r3     // Catch: java.lang.Throwable -> L37
            java.lang.Object r4 = r7.c(r0)     // Catch: java.lang.Throwable -> L37
            if (r4 != r1) goto L64
            return r1
        L64:
            r6 = r4
            r4 = r9
            r9 = r6
        L67:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L37
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L37
            r5 = 0
            if (r9 == 0) goto L8b
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L37
            boolean r9 = kotlin.jvm.internal.l0.g(r4, r9)     // Catch: java.lang.Throwable -> L37
            if (r9 == 0) goto L84
            int r7 = r2.element     // Catch: java.lang.Throwable -> L37
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.b.f(r7)     // Catch: java.lang.Throwable -> L37
            kotlinx.coroutines.channels.s.b(r8, r5)
            return r7
        L84:
            int r9 = r2.element     // Catch: java.lang.Throwable -> L37
            int r9 = r9 + r3
            r2.element = r9     // Catch: java.lang.Throwable -> L37
            r9 = r4
            goto L53
        L8b:
            kotlin.r2 r7 = kotlin.r2.f19517a     // Catch: java.lang.Throwable -> L37
            kotlinx.coroutines.channels.s.b(r8, r5)
            r7 = -1
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.b.f(r7)
            return r7
        L96:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L9a:
            throw r7     // Catch: java.lang.Throwable -> L9b
        L9b:
            r9 = move-exception
            kotlinx.coroutines.channels.s.b(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.A(kotlinx.coroutines.channels.g0, java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0092 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x0032, B:13:0x008a, B:15:0x0092), top: B:11:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0070 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #3 {all -> 0x004e, blocks: (B:40:0x004a, B:41:0x0068, B:43:0x0070, B:45:0x009d, B:46:0x00a4), top: B:39:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009d A[Catch: all -> 0x004e, TRY_ENTER, TryCatch #3 {all -> 0x004e, blocks: (B:40:0x004a, B:41:0x0068, B:43:0x0070, B:45:0x009d, B:46:0x00a4), top: B:39:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0086 -> B:13:0x008a). Please report as a decompilation issue!!! */
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object B(kotlinx.coroutines.channels.g0 r6, kotlin.coroutines.d r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.v.u
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.v$u r0 = (kotlinx.coroutines.channels.v.u) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.v$u r0 = new kotlinx.coroutines.channels.v$u
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L50
            if (r2 == r4) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r6 = r0.L$2
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.n r2 = (kotlinx.coroutines.channels.n) r2
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.channels.g0 r4 = (kotlinx.coroutines.channels.g0) r4
            kotlin.e1.n(r7)     // Catch: java.lang.Throwable -> L36
            goto L8a
        L36:
            r6 = move-exception
            r2 = r4
            goto La8
        L3a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L42:
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.n r6 = (kotlinx.coroutines.channels.n) r6
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.g0 r2 = (kotlinx.coroutines.channels.g0) r2
            kotlin.e1.n(r7)     // Catch: java.lang.Throwable -> L4e
            goto L68
        L4e:
            r6 = move-exception
            goto La8
        L50:
            kotlin.e1.n(r7)
            kotlinx.coroutines.channels.n r7 = r6.iterator()     // Catch: java.lang.Throwable -> La5
            r0.L$0 = r6     // Catch: java.lang.Throwable -> La5
            r0.L$1 = r7     // Catch: java.lang.Throwable -> La5
            r0.label = r4     // Catch: java.lang.Throwable -> La5
            java.lang.Object r2 = r7.c(r0)     // Catch: java.lang.Throwable -> La5
            if (r2 != r1) goto L64
            return r1
        L64:
            r5 = r2
            r2 = r6
            r6 = r7
            r7 = r5
        L68:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L4e
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L4e
            if (r7 == 0) goto L9d
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L4e
            r5 = r2
            r2 = r6
            r6 = r5
        L77:
            r0.L$0 = r6     // Catch: java.lang.Throwable -> La5
            r0.L$1 = r2     // Catch: java.lang.Throwable -> La5
            r0.L$2 = r7     // Catch: java.lang.Throwable -> La5
            r0.label = r3     // Catch: java.lang.Throwable -> La5
            java.lang.Object r4 = r2.c(r0)     // Catch: java.lang.Throwable -> La5
            if (r4 != r1) goto L86
            return r1
        L86:
            r5 = r4
            r4 = r6
            r6 = r7
            r7 = r5
        L8a:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L36
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r7 == 0) goto L98
            java.lang.Object r7 = r2.next()     // Catch: java.lang.Throwable -> L36
            r6 = r4
            goto L77
        L98:
            r7 = 0
            kotlinx.coroutines.channels.s.b(r4, r7)
            return r6
        L9d:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L4e
            java.lang.String r7 = "ReceiveChannel is empty."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L4e
            throw r6     // Catch: java.lang.Throwable -> L4e
        La5:
            r7 = move-exception
            r2 = r6
            r6 = r7
        La8:
            throw r6     // Catch: java.lang.Throwable -> La9
        La9:
            r7 = move-exception
            kotlinx.coroutines.channels.s.b(r2, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.B(kotlinx.coroutines.channels.g0, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007d A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:11:0x0037, B:12:0x0075, B:14:0x007d, B:16:0x0087, B:17:0x008b, B:18:0x005f, B:23:0x0092), top: B:10:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:11:0x0037, B:12:0x0075, B:14:0x007d, B:16:0x0087, B:17:0x008b, B:18:0x005f, B:23:0x0092), top: B:10:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0072 -> B:12:0x0075). Please report as a decompilation issue!!! */
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object C(kotlinx.coroutines.channels.g0 r7, java.lang.Object r8, kotlin.coroutines.d r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.v.C0571v
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.channels.v$v r0 = (kotlinx.coroutines.channels.v.C0571v) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.v$v r0 = new kotlinx.coroutines.channels.v$v
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L46
            if (r2 != r3) goto L3e
            java.lang.Object r7 = r0.L$4
            kotlinx.coroutines.channels.n r7 = (kotlinx.coroutines.channels.n) r7
            java.lang.Object r8 = r0.L$3
            kotlinx.coroutines.channels.g0 r8 = (kotlinx.coroutines.channels.g0) r8
            java.lang.Object r2 = r0.L$2
            kotlin.jvm.internal.k1$f r2 = (kotlin.jvm.internal.k1.f) r2
            java.lang.Object r4 = r0.L$1
            kotlin.jvm.internal.k1$f r4 = (kotlin.jvm.internal.k1.f) r4
            java.lang.Object r5 = r0.L$0
            kotlin.e1.n(r9)     // Catch: java.lang.Throwable -> L3b
            goto L75
        L3b:
            r7 = move-exception
            goto La3
        L3e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L46:
            kotlin.e1.n(r9)
            kotlin.jvm.internal.k1$f r9 = new kotlin.jvm.internal.k1$f
            r9.<init>()
            r2 = -1
            r9.element = r2
            kotlin.jvm.internal.k1$f r2 = new kotlin.jvm.internal.k1$f
            r2.<init>()
            kotlinx.coroutines.channels.n r4 = r7.iterator()     // Catch: java.lang.Throwable -> L9f
            r6 = r8
            r8 = r7
            r7 = r4
            r4 = r9
            r9 = r6
        L5f:
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L3b
            r0.L$1 = r4     // Catch: java.lang.Throwable -> L3b
            r0.L$2 = r2     // Catch: java.lang.Throwable -> L3b
            r0.L$3 = r8     // Catch: java.lang.Throwable -> L3b
            r0.L$4 = r7     // Catch: java.lang.Throwable -> L3b
            r0.label = r3     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r5 = r7.c(r0)     // Catch: java.lang.Throwable -> L3b
            if (r5 != r1) goto L72
            return r1
        L72:
            r6 = r5
            r5 = r9
            r9 = r6
        L75:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3b
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3b
            if (r9 == 0) goto L92
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L3b
            boolean r9 = kotlin.jvm.internal.l0.g(r5, r9)     // Catch: java.lang.Throwable -> L3b
            if (r9 == 0) goto L8b
            int r9 = r2.element     // Catch: java.lang.Throwable -> L3b
            r4.element = r9     // Catch: java.lang.Throwable -> L3b
        L8b:
            int r9 = r2.element     // Catch: java.lang.Throwable -> L3b
            int r9 = r9 + r3
            r2.element = r9     // Catch: java.lang.Throwable -> L3b
            r9 = r5
            goto L5f
        L92:
            kotlin.r2 r7 = kotlin.r2.f19517a     // Catch: java.lang.Throwable -> L3b
            r7 = 0
            kotlinx.coroutines.channels.s.b(r8, r7)
            int r7 = r4.element
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.b.f(r7)
            return r7
        L9f:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        La3:
            throw r7     // Catch: java.lang.Throwable -> La4
        La4:
            r9 = move-exception
            kotlinx.coroutines.channels.s.b(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.C(kotlinx.coroutines.channels.g0, java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0097 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #2 {all -> 0x0037, blocks: (B:12:0x0033, B:13:0x008f, B:15:0x0097), top: B:11:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075 A[Catch: all -> 0x004f, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x004f, blocks: (B:40:0x004b, B:41:0x0069, B:45:0x0075), top: B:39:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x008b -> B:13:0x008f). Please report as a decompilation issue!!! */
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object D(kotlinx.coroutines.channels.g0 r7, kotlin.coroutines.d r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.v.w
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.v$w r0 = (kotlinx.coroutines.channels.v.w) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.v$w r0 = new kotlinx.coroutines.channels.v$w
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L51
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r7 = r0.L$2
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.n r2 = (kotlinx.coroutines.channels.n) r2
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.channels.g0 r4 = (kotlinx.coroutines.channels.g0) r4
            kotlin.e1.n(r8)     // Catch: java.lang.Throwable -> L37
            goto L8f
        L37:
            r7 = move-exception
            r2 = r4
            goto La4
        L3b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L43:
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.n r7 = (kotlinx.coroutines.channels.n) r7
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.g0 r2 = (kotlinx.coroutines.channels.g0) r2
            kotlin.e1.n(r8)     // Catch: java.lang.Throwable -> L4f
            goto L69
        L4f:
            r7 = move-exception
            goto La4
        L51:
            kotlin.e1.n(r8)
            kotlinx.coroutines.channels.n r8 = r7.iterator()     // Catch: java.lang.Throwable -> La1
            r0.L$0 = r7     // Catch: java.lang.Throwable -> La1
            r0.L$1 = r8     // Catch: java.lang.Throwable -> La1
            r0.label = r4     // Catch: java.lang.Throwable -> La1
            java.lang.Object r2 = r8.c(r0)     // Catch: java.lang.Throwable -> La1
            if (r2 != r1) goto L65
            return r1
        L65:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L69:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L4f
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L4f
            if (r8 != 0) goto L75
            kotlinx.coroutines.channels.s.b(r2, r5)
            return r5
        L75:
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L4f
            r6 = r2
            r2 = r7
            r7 = r6
        L7c:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> La1
            r0.L$1 = r2     // Catch: java.lang.Throwable -> La1
            r0.L$2 = r8     // Catch: java.lang.Throwable -> La1
            r0.label = r3     // Catch: java.lang.Throwable -> La1
            java.lang.Object r4 = r2.c(r0)     // Catch: java.lang.Throwable -> La1
            if (r4 != r1) goto L8b
            return r1
        L8b:
            r6 = r4
            r4 = r7
            r7 = r8
            r8 = r6
        L8f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L37
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r8 == 0) goto L9d
            java.lang.Object r8 = r2.next()     // Catch: java.lang.Throwable -> L37
            r7 = r4
            goto L7c
        L9d:
            kotlinx.coroutines.channels.s.b(r4, r5)
            return r7
        La1:
            r8 = move-exception
            r2 = r7
            r7 = r8
        La4:
            throw r7     // Catch: java.lang.Throwable -> La5
        La5:
            r8 = move-exception
            kotlinx.coroutines.channels.s.b(r2, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.D(kotlinx.coroutines.channels.g0, kotlin.coroutines.d):java.lang.Object");
    }

    @p4.l
    @a1
    public static final <E, R> kotlinx.coroutines.channels.g0<R> E(@p4.l kotlinx.coroutines.channels.g0<? extends E> g0Var, @p4.l kotlin.coroutines.g gVar, @p4.l v3.p<? super E, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar) {
        return kotlinx.coroutines.channels.c0.f(c2.f19867a, gVar, 0, null, kotlinx.coroutines.channels.s.g(g0Var), new x(g0Var, pVar, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.g0 F(kotlinx.coroutines.channels.g0 g0Var, kotlin.coroutines.g gVar, v3.p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            gVar = k1.g();
        }
        return kotlinx.coroutines.channels.s.J(g0Var, gVar, pVar);
    }

    @p4.l
    @a1
    public static final <E, R> kotlinx.coroutines.channels.g0<R> G(@p4.l kotlinx.coroutines.channels.g0<? extends E> g0Var, @p4.l kotlin.coroutines.g gVar, @p4.l v3.q<? super Integer, ? super E, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar) {
        return kotlinx.coroutines.channels.c0.f(c2.f19867a, gVar, 0, null, kotlinx.coroutines.channels.s.g(g0Var), new y(g0Var, qVar, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.g0 H(kotlinx.coroutines.channels.g0 g0Var, kotlin.coroutines.g gVar, v3.q qVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            gVar = k1.g();
        }
        return kotlinx.coroutines.channels.s.L(g0Var, gVar, qVar);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.g0 I(kotlinx.coroutines.channels.g0 g0Var, kotlin.coroutines.g gVar, v3.q qVar) {
        return kotlinx.coroutines.channels.s.y(kotlinx.coroutines.channels.s.L(g0Var, gVar, qVar));
    }

    public static /* synthetic */ kotlinx.coroutines.channels.g0 J(kotlinx.coroutines.channels.g0 g0Var, kotlin.coroutines.g gVar, v3.q qVar, int i5, Object obj) {
        kotlinx.coroutines.channels.g0 I;
        if ((i5 & 1) != 0) {
            gVar = k1.g();
        }
        I = I(g0Var, gVar, qVar);
        return I;
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.g0 K(kotlinx.coroutines.channels.g0 g0Var, kotlin.coroutines.g gVar, v3.p pVar) {
        return kotlinx.coroutines.channels.s.y(kotlinx.coroutines.channels.s.J(g0Var, gVar, pVar));
    }

    public static /* synthetic */ kotlinx.coroutines.channels.g0 L(kotlinx.coroutines.channels.g0 g0Var, kotlin.coroutines.g gVar, v3.p pVar, int i5, Object obj) {
        kotlinx.coroutines.channels.g0 K;
        if ((i5 & 1) != 0) {
            gVar = k1.g();
        }
        K = K(g0Var, gVar, pVar);
        return K;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ac A[Catch: all -> 0x00bf, TRY_LEAVE, TryCatch #3 {all -> 0x00bf, blocks: (B:15:0x00a4, B:17:0x00ac, B:21:0x008f, B:55:0x0063), top: B:54:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087 A[Catch: all -> 0x005d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x005d, blocks: (B:44:0x0059, B:45:0x007b, B:49:0x0087), top: B:43:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00a0 -> B:14:0x003d). Please report as a decompilation issue!!! */
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object M(kotlinx.coroutines.channels.g0 r8, java.util.Comparator r9, kotlin.coroutines.d r10) {
        /*
            Method dump skipped, instructions count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.M(kotlinx.coroutines.channels.g0, java.util.Comparator, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ac A[Catch: all -> 0x00bf, TRY_LEAVE, TryCatch #3 {all -> 0x00bf, blocks: (B:15:0x00a4, B:17:0x00ac, B:21:0x008f, B:55:0x0063), top: B:54:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087 A[Catch: all -> 0x005d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x005d, blocks: (B:44:0x0059, B:45:0x007b, B:49:0x0087), top: B:43:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00a0 -> B:14:0x003d). Please report as a decompilation issue!!! */
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object N(kotlinx.coroutines.channels.g0 r8, java.util.Comparator r9, kotlin.coroutines.d r10) {
        /*
            Method dump skipped, instructions count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.N(kotlinx.coroutines.channels.g0, java.util.Comparator, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object O(kotlinx.coroutines.channels.g0 r4, kotlin.coroutines.d r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.v.b0
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.channels.v$b0 r0 = (kotlinx.coroutines.channels.v.b0) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.v$b0 r0 = new kotlinx.coroutines.channels.v$b0
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.channels.g0 r4 = (kotlinx.coroutines.channels.g0) r4
            kotlin.e1.n(r5)     // Catch: java.lang.Throwable -> L5a
            goto L47
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.e1.n(r5)
            kotlinx.coroutines.channels.n r5 = r4.iterator()     // Catch: java.lang.Throwable -> L5a
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L5a
            r0.label = r3     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r5 = r5.c(r0)     // Catch: java.lang.Throwable -> L5a
            if (r5 != r1) goto L47
            return r1
        L47:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L5a
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L5a
            if (r5 != 0) goto L50
            goto L51
        L50:
            r3 = 0
        L51:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r3)     // Catch: java.lang.Throwable -> L5a
            r0 = 0
            kotlinx.coroutines.channels.s.b(r4, r0)
            return r5
        L5a:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L5c
        L5c:
            r0 = move-exception
            kotlinx.coroutines.channels.s.b(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.O(kotlinx.coroutines.channels.g0, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #1 {all -> 0x0032, blocks: (B:12:0x002e, B:13:0x0081, B:18:0x008e, B:19:0x0095), top: B:11:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #2 {all -> 0x004a, blocks: (B:33:0x0046, B:34:0x0064, B:36:0x006c, B:40:0x0096, B:41:0x009d), top: B:32:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0096 A[Catch: all -> 0x004a, TRY_ENTER, TryCatch #2 {all -> 0x004a, blocks: (B:33:0x0046, B:34:0x0064, B:36:0x006c, B:40:0x0096, B:41:0x009d), top: B:32:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object Q(kotlinx.coroutines.channels.g0 r6, kotlin.coroutines.d r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.v.d0
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.v$d0 r0 = (kotlinx.coroutines.channels.v.d0) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.v$d0 r0 = new kotlinx.coroutines.channels.v$d0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r6 = r0.L$1
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.channels.g0 r0 = (kotlinx.coroutines.channels.g0) r0
            kotlin.e1.n(r7)     // Catch: java.lang.Throwable -> L32
            goto L81
        L32:
            r6 = move-exception
            r2 = r0
            goto La1
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.n r6 = (kotlinx.coroutines.channels.n) r6
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.g0 r2 = (kotlinx.coroutines.channels.g0) r2
            kotlin.e1.n(r7)     // Catch: java.lang.Throwable -> L4a
            goto L64
        L4a:
            r6 = move-exception
            goto La1
        L4c:
            kotlin.e1.n(r7)
            kotlinx.coroutines.channels.n r7 = r6.iterator()     // Catch: java.lang.Throwable -> L9e
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L9e
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L9e
            r0.label = r4     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r2 = r7.c(r0)     // Catch: java.lang.Throwable -> L9e
            if (r2 != r1) goto L60
            return r1
        L60:
            r5 = r2
            r2 = r6
            r6 = r7
            r7 = r5
        L64:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L4a
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L96
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L4a
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L4a
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L4a
            r0.label = r3     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r6 = r6.c(r0)     // Catch: java.lang.Throwable -> L4a
            if (r6 != r1) goto L7d
            return r1
        L7d:
            r0 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L81:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L32
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L32
            if (r7 != 0) goto L8e
            r7 = 0
            kotlinx.coroutines.channels.s.b(r0, r7)
            return r6
        L8e:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L32
            java.lang.String r7 = "ReceiveChannel has more than one element."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L32
            throw r6     // Catch: java.lang.Throwable -> L32
        L96:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L4a
            java.lang.String r7 = "ReceiveChannel is empty."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L4a
            throw r6     // Catch: java.lang.Throwable -> L4a
        L9e:
            r7 = move-exception
            r2 = r6
            r6 = r7
        La1:
            throw r6     // Catch: java.lang.Throwable -> La2
        La2:
            r7 = move-exception
            kotlinx.coroutines.channels.s.b(r2, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.Q(kotlinx.coroutines.channels.g0, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071 A[Catch: all -> 0x004b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x004b, blocks: (B:33:0x0047, B:34:0x0065, B:38:0x0071), top: B:32:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object R(kotlinx.coroutines.channels.g0 r7, kotlin.coroutines.d r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.v.e0
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.v$e0 r0 = (kotlinx.coroutines.channels.v.e0) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.v$e0 r0 = new kotlinx.coroutines.channels.v$e0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4d
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r7 = r0.L$1
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.channels.g0 r0 = (kotlinx.coroutines.channels.g0) r0
            kotlin.e1.n(r8)     // Catch: java.lang.Throwable -> L33
            goto L86
        L33:
            r7 = move-exception
            r2 = r0
            goto L99
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.n r7 = (kotlinx.coroutines.channels.n) r7
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.g0 r2 = (kotlinx.coroutines.channels.g0) r2
            kotlin.e1.n(r8)     // Catch: java.lang.Throwable -> L4b
            goto L65
        L4b:
            r7 = move-exception
            goto L99
        L4d:
            kotlin.e1.n(r8)
            kotlinx.coroutines.channels.n r8 = r7.iterator()     // Catch: java.lang.Throwable -> L96
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L96
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L96
            r0.label = r4     // Catch: java.lang.Throwable -> L96
            java.lang.Object r2 = r8.c(r0)     // Catch: java.lang.Throwable -> L96
            if (r2 != r1) goto L61
            return r1
        L61:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L65:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L4b
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L4b
            if (r8 != 0) goto L71
            kotlinx.coroutines.channels.s.b(r2, r5)
            return r5
        L71:
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L4b
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L4b
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L4b
            r0.label = r3     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r7 = r7.c(r0)     // Catch: java.lang.Throwable -> L4b
            if (r7 != r1) goto L82
            return r1
        L82:
            r0 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L86:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L33
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r8 == 0) goto L92
            kotlinx.coroutines.channels.s.b(r0, r5)
            return r5
        L92:
            kotlinx.coroutines.channels.s.b(r0, r5)
            return r7
        L96:
            r8 = move-exception
            r2 = r7
            r7 = r8
        L99:
            throw r7     // Catch: java.lang.Throwable -> L9a
        L9a:
            r8 = move-exception
            kotlinx.coroutines.channels.s.b(r2, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.R(kotlinx.coroutines.channels.g0, kotlin.coroutines.d):java.lang.Object");
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.g0 S(kotlinx.coroutines.channels.g0 g0Var, int i5, kotlin.coroutines.g gVar) {
        return kotlinx.coroutines.channels.c0.f(c2.f19867a, gVar, 0, null, kotlinx.coroutines.channels.s.g(g0Var), new f0(i5, g0Var, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.g0 T(kotlinx.coroutines.channels.g0 g0Var, int i5, kotlin.coroutines.g gVar, int i6, Object obj) {
        kotlinx.coroutines.channels.g0 S;
        if ((i6 & 2) != 0) {
            gVar = k1.g();
        }
        S = S(g0Var, i5, gVar);
        return S;
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.g0 U(kotlinx.coroutines.channels.g0 g0Var, kotlin.coroutines.g gVar, v3.p pVar) {
        return kotlinx.coroutines.channels.c0.f(c2.f19867a, gVar, 0, null, kotlinx.coroutines.channels.s.g(g0Var), new g0(g0Var, pVar, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.g0 V(kotlinx.coroutines.channels.g0 g0Var, kotlin.coroutines.g gVar, v3.p pVar, int i5, Object obj) {
        kotlinx.coroutines.channels.g0 U;
        if ((i5 & 1) != 0) {
            gVar = k1.g();
        }
        U = U(g0Var, gVar, pVar);
        return U;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[Catch: all -> 0x0053, TryCatch #1 {all -> 0x0053, blocks: (B:12:0x0034, B:19:0x0070, B:21:0x0078, B:24:0x008b, B:40:0x004f), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #1 {all -> 0x0053, blocks: (B:12:0x0034, B:19:0x0070, B:21:0x0078, B:24:0x008b, B:40:0x004f), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r7v0, types: [C extends kotlinx.coroutines.channels.h0<? super E>] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlinx.coroutines.channels.g0] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [kotlinx.coroutines.channels.g0, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0088 -> B:13:0x0037). Please report as a decompilation issue!!! */
    @kotlin.a1
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E, C extends kotlinx.coroutines.channels.h0<? super E>> java.lang.Object W(@p4.l kotlinx.coroutines.channels.g0<? extends E> r6, @p4.l C r7, @p4.l kotlin.coroutines.d<? super C> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.v.h0
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.v$h0 r0 = (kotlinx.coroutines.channels.v.h0) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.v$h0 r0 = new kotlinx.coroutines.channels.v$h0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L55
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.n r6 = (kotlinx.coroutines.channels.n) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.g0 r7 = (kotlinx.coroutines.channels.g0) r7
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.h0 r2 = (kotlinx.coroutines.channels.h0) r2
            kotlin.e1.n(r8)     // Catch: java.lang.Throwable -> L53
        L37:
            r8 = r6
            r6 = r7
            r7 = r2
            goto L5c
        L3b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L43:
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.n r6 = (kotlinx.coroutines.channels.n) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.g0 r7 = (kotlinx.coroutines.channels.g0) r7
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.h0 r2 = (kotlinx.coroutines.channels.h0) r2
            kotlin.e1.n(r8)     // Catch: java.lang.Throwable -> L53
            goto L70
        L53:
            r6 = move-exception
            goto L96
        L55:
            kotlin.e1.n(r8)
            kotlinx.coroutines.channels.n r8 = r6.iterator()     // Catch: java.lang.Throwable -> L92
        L5c:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L92
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L92
            r0.L$2 = r8     // Catch: java.lang.Throwable -> L92
            r0.label = r4     // Catch: java.lang.Throwable -> L92
            java.lang.Object r2 = r8.c(r0)     // Catch: java.lang.Throwable -> L92
            if (r2 != r1) goto L6b
            return r1
        L6b:
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r2
            r2 = r5
        L70:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L53
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L53
            if (r8 == 0) goto L8b
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L53
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L53
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L53
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L53
            r0.label = r3     // Catch: java.lang.Throwable -> L53
            java.lang.Object r8 = r2.F(r8, r0)     // Catch: java.lang.Throwable -> L53
            if (r8 != r1) goto L37
            return r1
        L8b:
            kotlin.r2 r6 = kotlin.r2.f19517a     // Catch: java.lang.Throwable -> L53
            r6 = 0
            kotlinx.coroutines.channels.s.b(r7, r6)
            return r2
        L92:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L96:
            throw r6     // Catch: java.lang.Throwable -> L97
        L97:
            r8 = move-exception
            kotlinx.coroutines.channels.s.b(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.W(kotlinx.coroutines.channels.g0, kotlinx.coroutines.channels.h0, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x005c, B:14:0x0064, B:15:0x004a, B:20:0x006d), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x005c, B:14:0x0064, B:15:0x004a, B:20:0x006d), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0059 -> B:12:0x005c). Please report as a decompilation issue!!! */
    @kotlin.a1
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E, C extends java.util.Collection<? super E>> java.lang.Object X(@p4.l kotlinx.coroutines.channels.g0<? extends E> r5, @p4.l C r6, @p4.l kotlin.coroutines.d<? super C> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.v.i0
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.v$i0 r0 = (kotlinx.coroutines.channels.v.i0) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.v$i0 r0 = new kotlinx.coroutines.channels.v$i0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r5 = r0.L$2
            kotlinx.coroutines.channels.n r5 = (kotlinx.coroutines.channels.n) r5
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.g0 r6 = (kotlinx.coroutines.channels.g0) r6
            java.lang.Object r2 = r0.L$0
            java.util.Collection r2 = (java.util.Collection) r2
            kotlin.e1.n(r7)     // Catch: java.lang.Throwable -> L35
            goto L5c
        L35:
            r5 = move-exception
            goto L78
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            kotlin.e1.n(r7)
            kotlinx.coroutines.channels.n r7 = r5.iterator()     // Catch: java.lang.Throwable -> L74
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L4a:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L35
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L35
            r0.L$2 = r5     // Catch: java.lang.Throwable -> L35
            r0.label = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r5.c(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L59
            return r1
        L59:
            r4 = r2
            r2 = r7
            r7 = r4
        L5c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L35
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L6d
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L35
            r2.add(r7)     // Catch: java.lang.Throwable -> L35
            r7 = r2
            goto L4a
        L6d:
            kotlin.r2 r5 = kotlin.r2.f19517a     // Catch: java.lang.Throwable -> L35
            r5 = 0
            kotlinx.coroutines.channels.s.b(r6, r5)
            return r2
        L74:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L78:
            throw r5     // Catch: java.lang.Throwable -> L79
        L79:
            r7 = move-exception
            kotlinx.coroutines.channels.s.b(r6, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.X(kotlinx.coroutines.channels.g0, java.util.Collection, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x005c, B:14:0x0064, B:15:0x004a, B:20:0x0077), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x005c, B:14:0x0064, B:15:0x004a, B:20:0x0077), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0059 -> B:12:0x005c). Please report as a decompilation issue!!! */
    @kotlin.a1
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <K, V, M extends java.util.Map<? super K, ? super V>> java.lang.Object Y(@p4.l kotlinx.coroutines.channels.g0<? extends kotlin.u0<? extends K, ? extends V>> r6, @p4.l M r7, @p4.l kotlin.coroutines.d<? super M> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.v.j0
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.v$j0 r0 = (kotlinx.coroutines.channels.v.j0) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.v$j0 r0 = new kotlinx.coroutines.channels.v$j0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.n r6 = (kotlinx.coroutines.channels.n) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.g0 r7 = (kotlinx.coroutines.channels.g0) r7
            java.lang.Object r2 = r0.L$0
            java.util.Map r2 = (java.util.Map) r2
            kotlin.e1.n(r8)     // Catch: java.lang.Throwable -> L35
            goto L5c
        L35:
            r6 = move-exception
            goto L82
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3f:
            kotlin.e1.n(r8)
            kotlinx.coroutines.channels.n r8 = r6.iterator()     // Catch: java.lang.Throwable -> L7e
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L4a:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L35
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L35
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L35
            r0.label = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r6.c(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L59
            return r1
        L59:
            r5 = r2
            r2 = r8
            r8 = r5
        L5c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L35
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r8 == 0) goto L77
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L35
            kotlin.u0 r8 = (kotlin.u0) r8     // Catch: java.lang.Throwable -> L35
            java.lang.Object r4 = r8.getFirst()     // Catch: java.lang.Throwable -> L35
            java.lang.Object r8 = r8.getSecond()     // Catch: java.lang.Throwable -> L35
            r2.put(r4, r8)     // Catch: java.lang.Throwable -> L35
            r8 = r2
            goto L4a
        L77:
            kotlin.r2 r6 = kotlin.r2.f19517a     // Catch: java.lang.Throwable -> L35
            r6 = 0
            kotlinx.coroutines.channels.s.b(r7, r6)
            return r2
        L7e:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L82:
            throw r6     // Catch: java.lang.Throwable -> L83
        L83:
            r8 = move-exception
            kotlinx.coroutines.channels.s.b(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.Y(kotlinx.coroutines.channels.g0, java.util.Map, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object a(kotlinx.coroutines.channels.g0 r4, kotlin.coroutines.d r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.v.a
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.channels.v$a r0 = (kotlinx.coroutines.channels.v.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.v$a r0 = new kotlinx.coroutines.channels.v$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.channels.g0 r4 = (kotlinx.coroutines.channels.g0) r4
            kotlin.e1.n(r5)     // Catch: java.lang.Throwable -> L4c
            goto L47
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.e1.n(r5)
            kotlinx.coroutines.channels.n r5 = r4.iterator()     // Catch: java.lang.Throwable -> L4c
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L4c
            r0.label = r3     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r5 = r5.c(r0)     // Catch: java.lang.Throwable -> L4c
            if (r5 != r1) goto L47
            return r1
        L47:
            r0 = 0
            kotlinx.coroutines.channels.s.b(r4, r0)
            return r5
        L4c:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L4e
        L4e:
            r0 = move-exception
            kotlinx.coroutines.channels.s.b(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.a(kotlinx.coroutines.channels.g0, kotlin.coroutines.d):java.lang.Object");
    }

    @p4.l
    @a1
    public static final v3.l<Throwable, r2> b(@p4.l kotlinx.coroutines.channels.g0<?> g0Var) {
        return new b(g0Var);
    }

    @a1
    @p4.m
    public static final <E> Object b0(@p4.l kotlinx.coroutines.channels.g0<? extends E> g0Var, @p4.l kotlin.coroutines.d<? super Set<E>> dVar) {
        return kotlinx.coroutines.channels.s.f0(g0Var, new LinkedHashSet(), dVar);
    }

    @p4.l
    @a1
    public static final v3.l<Throwable, r2> c(@p4.l kotlinx.coroutines.channels.g0<?>... g0VarArr) {
        return new c(g0VarArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0068 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x0060, B:14:0x0068, B:30:0x0072), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x0060, B:14:0x0068, B:30:0x0072), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x005d -> B:12:0x0060). Please report as a decompilation issue!!! */
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object d(kotlinx.coroutines.channels.g0 r6, kotlin.coroutines.d r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.v.d
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.v$d r0 = (kotlinx.coroutines.channels.v.d) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.v$d r0 = new kotlinx.coroutines.channels.v$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.n r6 = (kotlinx.coroutines.channels.n) r6
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.g0 r2 = (kotlinx.coroutines.channels.g0) r2
            java.lang.Object r4 = r0.L$0
            kotlin.jvm.internal.k1$f r4 = (kotlin.jvm.internal.k1.f) r4
            kotlin.e1.n(r7)     // Catch: java.lang.Throwable -> L35
            goto L60
        L35:
            r6 = move-exception
            goto L85
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3f:
            kotlin.e1.n(r7)
            kotlin.jvm.internal.k1$f r7 = new kotlin.jvm.internal.k1$f
            r7.<init>()
            kotlinx.coroutines.channels.n r2 = r6.iterator()     // Catch: java.lang.Throwable -> L82
            r4 = r7
            r7 = r6
            r6 = r2
        L4e:
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L7f
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L7f
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L7f
            r0.label = r3     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r2 = r6.c(r0)     // Catch: java.lang.Throwable -> L7f
            if (r2 != r1) goto L5d
            return r1
        L5d:
            r5 = r2
            r2 = r7
            r7 = r5
        L60:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L35
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L72
            r6.next()     // Catch: java.lang.Throwable -> L35
            int r7 = r4.element     // Catch: java.lang.Throwable -> L35
            int r7 = r7 + r3
            r4.element = r7     // Catch: java.lang.Throwable -> L35
            r7 = r2
            goto L4e
        L72:
            kotlin.r2 r6 = kotlin.r2.f19517a     // Catch: java.lang.Throwable -> L35
            r6 = 0
            kotlinx.coroutines.channels.s.b(r2, r6)
            int r6 = r4.element
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.b.f(r6)
            return r6
        L7f:
            r6 = move-exception
            r2 = r7
            goto L85
        L82:
            r7 = move-exception
            r2 = r6
            r6 = r7
        L85:
            throw r6     // Catch: java.lang.Throwable -> L86
        L86:
            r7 = move-exception
            kotlinx.coroutines.channels.s.b(r2, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.d(kotlinx.coroutines.channels.g0, kotlin.coroutines.d):java.lang.Object");
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.g0 d0(kotlinx.coroutines.channels.g0 g0Var, kotlin.coroutines.g gVar) {
        return kotlinx.coroutines.channels.c0.f(c2.f19867a, gVar, 0, null, kotlinx.coroutines.channels.s.g(g0Var), new k0(g0Var, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.g0 e0(kotlinx.coroutines.channels.g0 g0Var, kotlin.coroutines.g gVar, int i5, Object obj) {
        kotlinx.coroutines.channels.g0 d02;
        if ((i5 & 1) != 0) {
            gVar = k1.g();
        }
        d02 = d0(g0Var, gVar);
        return d02;
    }

    @p4.l
    @a1
    public static final <E, K> kotlinx.coroutines.channels.g0<E> f(@p4.l kotlinx.coroutines.channels.g0<? extends E> g0Var, @p4.l kotlin.coroutines.g gVar, @p4.l v3.p<? super E, ? super kotlin.coroutines.d<? super K>, ? extends Object> pVar) {
        return kotlinx.coroutines.channels.c0.f(c2.f19867a, gVar, 0, null, kotlinx.coroutines.channels.s.g(g0Var), new f(g0Var, pVar, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.g0 g(kotlinx.coroutines.channels.g0 g0Var, kotlin.coroutines.g gVar, v3.p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            gVar = k1.g();
        }
        return kotlinx.coroutines.channels.s.k(g0Var, gVar, pVar);
    }

    @p4.l
    @a1
    public static final <E, R, V> kotlinx.coroutines.channels.g0<V> g0(@p4.l kotlinx.coroutines.channels.g0<? extends E> g0Var, @p4.l kotlinx.coroutines.channels.g0<? extends R> g0Var2, @p4.l kotlin.coroutines.g gVar, @p4.l v3.p<? super E, ? super R, ? extends V> pVar) {
        return kotlinx.coroutines.channels.c0.f(c2.f19867a, gVar, 0, null, kotlinx.coroutines.channels.s.h(g0Var, g0Var2), new m0(g0Var2, g0Var, pVar, null), 6, null);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.g0 h(kotlinx.coroutines.channels.g0 g0Var, int i5, kotlin.coroutines.g gVar) {
        return kotlinx.coroutines.channels.c0.f(c2.f19867a, gVar, 0, null, kotlinx.coroutines.channels.s.g(g0Var), new g(i5, g0Var, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.g0 h0(kotlinx.coroutines.channels.g0 g0Var, kotlinx.coroutines.channels.g0 g0Var2, kotlin.coroutines.g gVar, v3.p pVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            gVar = k1.g();
        }
        return kotlinx.coroutines.channels.s.q0(g0Var, g0Var2, gVar, pVar);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.g0 i(kotlinx.coroutines.channels.g0 g0Var, int i5, kotlin.coroutines.g gVar, int i6, Object obj) {
        kotlinx.coroutines.channels.g0 h5;
        if ((i6 & 2) != 0) {
            gVar = k1.g();
        }
        h5 = h(g0Var, i5, gVar);
        return h5;
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.g0 j(kotlinx.coroutines.channels.g0 g0Var, kotlin.coroutines.g gVar, v3.p pVar) {
        return kotlinx.coroutines.channels.c0.f(c2.f19867a, gVar, 0, null, kotlinx.coroutines.channels.s.g(g0Var), new h(g0Var, pVar, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.g0 k(kotlinx.coroutines.channels.g0 g0Var, kotlin.coroutines.g gVar, v3.p pVar, int i5, Object obj) {
        kotlinx.coroutines.channels.g0 j5;
        if ((i5 & 1) != 0) {
            gVar = k1.g();
        }
        j5 = j(g0Var, gVar, pVar);
        return j5;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006c A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #2 {all -> 0x0039, blocks: (B:12:0x0035, B:13:0x0064, B:15:0x006c, B:26:0x007d, B:27:0x0094), top: B:11:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d A[Catch: all -> 0x0039, TRY_ENTER, TryCatch #2 {all -> 0x0039, blocks: (B:12:0x0035, B:13:0x0064, B:15:0x006c, B:26:0x007d, B:27:0x0094), top: B:11:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x005f -> B:13:0x0064). Please report as a decompilation issue!!! */
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object l(kotlinx.coroutines.channels.g0 r9, int r10, kotlin.coroutines.d r11) {
        /*
            boolean r0 = r11 instanceof kotlinx.coroutines.channels.v.i
            if (r0 == 0) goto L13
            r0 = r11
            kotlinx.coroutines.channels.v$i r0 = (kotlinx.coroutines.channels.v.i) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.v$i r0 = new kotlinx.coroutines.channels.v$i
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 46
            java.lang.String r4 = "ReceiveChannel doesn't contain element at index "
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 != r5) goto L3c
            int r9 = r0.I$1
            int r10 = r0.I$0
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.n r2 = (kotlinx.coroutines.channels.n) r2
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.g0 r6 = (kotlinx.coroutines.channels.g0) r6
            kotlin.e1.n(r11)     // Catch: java.lang.Throwable -> L39
            goto L64
        L39:
            r9 = move-exception
            goto Lb1
        L3c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L44:
            kotlin.e1.n(r11)
            if (r10 < 0) goto L99
            kotlinx.coroutines.channels.n r11 = r9.iterator()     // Catch: java.lang.Throwable -> L95
            r2 = 0
        L4e:
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L95
            r0.L$1 = r11     // Catch: java.lang.Throwable -> L95
            r0.I$0 = r10     // Catch: java.lang.Throwable -> L95
            r0.I$1 = r2     // Catch: java.lang.Throwable -> L95
            r0.label = r5     // Catch: java.lang.Throwable -> L95
            java.lang.Object r6 = r11.c(r0)     // Catch: java.lang.Throwable -> L95
            if (r6 != r1) goto L5f
            return r1
        L5f:
            r8 = r6
            r6 = r9
            r9 = r2
            r2 = r11
            r11 = r8
        L64:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L39
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L39
            if (r11 == 0) goto L7d
            java.lang.Object r11 = r2.next()     // Catch: java.lang.Throwable -> L39
            int r7 = r9 + 1
            if (r10 != r9) goto L79
            r9 = 0
            kotlinx.coroutines.channels.s.b(r6, r9)
            return r11
        L79:
            r11 = r2
            r9 = r6
            r2 = r7
            goto L4e
        L7d:
            java.lang.IndexOutOfBoundsException r9 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> L39
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            r11.<init>()     // Catch: java.lang.Throwable -> L39
            r11.append(r4)     // Catch: java.lang.Throwable -> L39
            r11.append(r10)     // Catch: java.lang.Throwable -> L39
            r11.append(r3)     // Catch: java.lang.Throwable -> L39
            java.lang.String r10 = r11.toString()     // Catch: java.lang.Throwable -> L39
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L39
            throw r9     // Catch: java.lang.Throwable -> L39
        L95:
            r10 = move-exception
            r6 = r9
            r9 = r10
            goto Lb1
        L99:
            java.lang.IndexOutOfBoundsException r11 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> L95
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L95
            r0.<init>()     // Catch: java.lang.Throwable -> L95
            r0.append(r4)     // Catch: java.lang.Throwable -> L95
            r0.append(r10)     // Catch: java.lang.Throwable -> L95
            r0.append(r3)     // Catch: java.lang.Throwable -> L95
            java.lang.String r10 = r0.toString()     // Catch: java.lang.Throwable -> L95
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L95
            throw r11     // Catch: java.lang.Throwable -> L95
        Lb1:
            throw r9     // Catch: java.lang.Throwable -> Lb2
        Lb2:
            r10 = move-exception
            kotlinx.coroutines.channels.s.b(r6, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.l(kotlinx.coroutines.channels.g0, int, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0072 A[Catch: all -> 0x0087, TRY_LEAVE, TryCatch #0 {all -> 0x0087, blocks: (B:13:0x006a, B:15:0x0072, B:22:0x0054, B:46:0x004f), top: B:45:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0065 -> B:13:0x006a). Please report as a decompilation issue!!! */
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object m(kotlinx.coroutines.channels.g0 r8, int r9, kotlin.coroutines.d r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.channels.v.j
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.channels.v$j r0 = (kotlinx.coroutines.channels.v.j) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.v$j r0 = new kotlinx.coroutines.channels.v$j
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L46
            if (r2 != r3) goto L3e
            int r8 = r0.I$1
            int r9 = r0.I$0
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.n r2 = (kotlinx.coroutines.channels.n) r2
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.channels.g0 r5 = (kotlinx.coroutines.channels.g0) r5
            kotlin.e1.n(r10)     // Catch: java.lang.Throwable -> L3c
            r7 = r2
            r2 = r8
            r8 = r5
            r5 = r1
            r1 = r0
            r0 = r7
            goto L6a
        L3c:
            r8 = move-exception
            goto L8a
        L3e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L46:
            kotlin.e1.n(r10)
            if (r9 >= 0) goto L4f
            kotlinx.coroutines.channels.s.b(r8, r4)
            return r4
        L4f:
            kotlinx.coroutines.channels.n r10 = r8.iterator()     // Catch: java.lang.Throwable -> L87
            r2 = 0
        L54:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L87
            r0.L$1 = r10     // Catch: java.lang.Throwable -> L87
            r0.I$0 = r9     // Catch: java.lang.Throwable -> L87
            r0.I$1 = r2     // Catch: java.lang.Throwable -> L87
            r0.label = r3     // Catch: java.lang.Throwable -> L87
            java.lang.Object r5 = r10.c(r0)     // Catch: java.lang.Throwable -> L87
            if (r5 != r1) goto L65
            return r1
        L65:
            r7 = r0
            r0 = r10
            r10 = r5
            r5 = r1
            r1 = r7
        L6a:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L87
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L87
            if (r10 == 0) goto L83
            java.lang.Object r10 = r0.next()     // Catch: java.lang.Throwable -> L87
            int r6 = r2 + 1
            if (r9 != r2) goto L7e
            kotlinx.coroutines.channels.s.b(r8, r4)
            return r10
        L7e:
            r10 = r0
            r0 = r1
            r1 = r5
            r2 = r6
            goto L54
        L83:
            kotlinx.coroutines.channels.s.b(r8, r4)
            return r4
        L87:
            r9 = move-exception
            r5 = r8
            r8 = r9
        L8a:
            throw r8     // Catch: java.lang.Throwable -> L8b
        L8b:
            r9 = move-exception
            kotlinx.coroutines.channels.s.b(r5, r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.m(kotlinx.coroutines.channels.g0, int, kotlin.coroutines.d):java.lang.Object");
    }

    @p4.l
    @a1
    public static final <E> kotlinx.coroutines.channels.g0<E> n(@p4.l kotlinx.coroutines.channels.g0<? extends E> g0Var, @p4.l kotlin.coroutines.g gVar, @p4.l v3.p<? super E, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar) {
        return kotlinx.coroutines.channels.c0.f(c2.f19867a, gVar, 0, null, kotlinx.coroutines.channels.s.g(g0Var), new k(g0Var, pVar, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.g0 o(kotlinx.coroutines.channels.g0 g0Var, kotlin.coroutines.g gVar, v3.p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            gVar = k1.g();
        }
        return kotlinx.coroutines.channels.s.s(g0Var, gVar, pVar);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.g0 p(kotlinx.coroutines.channels.g0 g0Var, kotlin.coroutines.g gVar, v3.q qVar) {
        return kotlinx.coroutines.channels.c0.f(c2.f19867a, gVar, 0, null, kotlinx.coroutines.channels.s.g(g0Var), new l(g0Var, qVar, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.g0 q(kotlinx.coroutines.channels.g0 g0Var, kotlin.coroutines.g gVar, v3.q qVar, int i5, Object obj) {
        kotlinx.coroutines.channels.g0 p5;
        if ((i5 & 1) != 0) {
            gVar = k1.g();
        }
        p5 = p(g0Var, gVar, qVar);
        return p5;
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.g0 r(kotlinx.coroutines.channels.g0 g0Var, kotlin.coroutines.g gVar, v3.p pVar) {
        return kotlinx.coroutines.channels.s.s(g0Var, gVar, new m(pVar, null));
    }

    public static /* synthetic */ kotlinx.coroutines.channels.g0 s(kotlinx.coroutines.channels.g0 g0Var, kotlin.coroutines.g gVar, v3.p pVar, int i5, Object obj) {
        kotlinx.coroutines.channels.g0 r5;
        if ((i5 & 1) != 0) {
            gVar = k1.g();
        }
        r5 = r(g0Var, gVar, pVar);
        return r5;
    }

    @p4.l
    @a1
    public static final <E> kotlinx.coroutines.channels.g0<E> t(@p4.l kotlinx.coroutines.channels.g0<? extends E> g0Var) {
        kotlinx.coroutines.channels.g0<E> o5;
        o5 = o(g0Var, null, new n(null), 1, null);
        kotlin.jvm.internal.l0.n(o5, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterNotNull>");
        return o5;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x005c, B:14:0x0064, B:16:0x006a, B:18:0x004a, B:23:0x006f), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x005c, B:14:0x0064, B:16:0x006a, B:18:0x004a, B:23:0x006f), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0059 -> B:12:0x005c). Please report as a decompilation issue!!! */
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object u(kotlinx.coroutines.channels.g0 r5, java.util.Collection r6, kotlin.coroutines.d r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.v.o
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.v$o r0 = (kotlinx.coroutines.channels.v.o) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.v$o r0 = new kotlinx.coroutines.channels.v$o
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r5 = r0.L$2
            kotlinx.coroutines.channels.n r5 = (kotlinx.coroutines.channels.n) r5
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.g0 r6 = (kotlinx.coroutines.channels.g0) r6
            java.lang.Object r2 = r0.L$0
            java.util.Collection r2 = (java.util.Collection) r2
            kotlin.e1.n(r7)     // Catch: java.lang.Throwable -> L35
            goto L5c
        L35:
            r5 = move-exception
            goto L7a
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            kotlin.e1.n(r7)
            kotlinx.coroutines.channels.n r7 = r5.iterator()     // Catch: java.lang.Throwable -> L76
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L4a:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L35
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L35
            r0.L$2 = r5     // Catch: java.lang.Throwable -> L35
            r0.label = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r5.c(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L59
            return r1
        L59:
            r4 = r2
            r2 = r7
            r7 = r4
        L5c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L35
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L6f
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L6d
            r2.add(r7)     // Catch: java.lang.Throwable -> L35
        L6d:
            r7 = r2
            goto L4a
        L6f:
            kotlin.r2 r5 = kotlin.r2.f19517a     // Catch: java.lang.Throwable -> L35
            r5 = 0
            kotlinx.coroutines.channels.s.b(r6, r5)
            return r2
        L76:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L7a:
            throw r5     // Catch: java.lang.Throwable -> L7b
        L7b:
            r7 = move-exception
            kotlinx.coroutines.channels.s.b(r6, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.u(kotlinx.coroutines.channels.g0, java.util.Collection, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:12:0x0034, B:19:0x006d, B:21:0x0075, B:23:0x007b, B:26:0x008e, B:42:0x004c), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {all -> 0x0050, blocks: (B:12:0x0034, B:19:0x006d, B:21:0x0075, B:23:0x007b, B:26:0x008e, B:42:0x004c), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlinx.coroutines.channels.h0] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlinx.coroutines.channels.g0] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [kotlinx.coroutines.channels.g0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0079 -> B:13:0x008a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0087 -> B:13:0x008a). Please report as a decompilation issue!!! */
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object v(kotlinx.coroutines.channels.g0 r6, kotlinx.coroutines.channels.h0 r7, kotlin.coroutines.d r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.v.p
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.v$p r0 = (kotlinx.coroutines.channels.v.p) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.v$p r0 = new kotlinx.coroutines.channels.v$p
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L52
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.n r6 = (kotlinx.coroutines.channels.n) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.g0 r7 = (kotlinx.coroutines.channels.g0) r7
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.h0 r2 = (kotlinx.coroutines.channels.h0) r2
            kotlin.e1.n(r8)     // Catch: java.lang.Throwable -> L50
            goto L8a
        L38:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L40:
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.n r6 = (kotlinx.coroutines.channels.n) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.g0 r7 = (kotlinx.coroutines.channels.g0) r7
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.h0 r2 = (kotlinx.coroutines.channels.h0) r2
            kotlin.e1.n(r8)     // Catch: java.lang.Throwable -> L50
            goto L6d
        L50:
            r6 = move-exception
            goto L99
        L52:
            kotlin.e1.n(r8)
            kotlinx.coroutines.channels.n r8 = r6.iterator()     // Catch: java.lang.Throwable -> L95
        L59:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L95
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L95
            r0.L$2 = r8     // Catch: java.lang.Throwable -> L95
            r0.label = r4     // Catch: java.lang.Throwable -> L95
            java.lang.Object r2 = r8.c(r0)     // Catch: java.lang.Throwable -> L95
            if (r2 != r1) goto L68
            return r1
        L68:
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r2
            r2 = r5
        L6d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L50
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L50
            if (r8 == 0) goto L8e
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L50
            if (r8 == 0) goto L8a
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L50
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L50
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L50
            r0.label = r3     // Catch: java.lang.Throwable -> L50
            java.lang.Object r8 = r2.F(r8, r0)     // Catch: java.lang.Throwable -> L50
            if (r8 != r1) goto L8a
            return r1
        L8a:
            r8 = r6
            r6 = r7
            r7 = r2
            goto L59
        L8e:
            kotlin.r2 r6 = kotlin.r2.f19517a     // Catch: java.lang.Throwable -> L50
            r6 = 0
            kotlinx.coroutines.channels.s.b(r7, r6)
            return r2
        L95:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L99:
            throw r6     // Catch: java.lang.Throwable -> L9a
        L9a:
            r8 = move-exception
            kotlinx.coroutines.channels.s.b(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.v(kotlinx.coroutines.channels.g0, kotlinx.coroutines.channels.h0, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #1 {all -> 0x0031, blocks: (B:11:0x002d, B:12:0x0053, B:14:0x005b, B:18:0x0064, B:19:0x006b), top: B:10:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064 A[Catch: all -> 0x0031, TRY_ENTER, TryCatch #1 {all -> 0x0031, blocks: (B:11:0x002d, B:12:0x0053, B:14:0x005b, B:18:0x0064, B:19:0x006b), top: B:10:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object w(kotlinx.coroutines.channels.g0 r5, kotlin.coroutines.d r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.v.q
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.channels.v$q r0 = (kotlinx.coroutines.channels.v.q) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.v$q r0 = new kotlinx.coroutines.channels.v$q
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r5 = r0.L$1
            kotlinx.coroutines.channels.n r5 = (kotlinx.coroutines.channels.n) r5
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.channels.g0 r0 = (kotlinx.coroutines.channels.g0) r0
            kotlin.e1.n(r6)     // Catch: java.lang.Throwable -> L31
            goto L53
        L31:
            r5 = move-exception
            goto L6f
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            kotlin.e1.n(r6)
            kotlinx.coroutines.channels.n r6 = r5.iterator()     // Catch: java.lang.Throwable -> L6c
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L6c
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L6c
            r0.label = r3     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r0 = r6.c(r0)     // Catch: java.lang.Throwable -> L6c
            if (r0 != r1) goto L4f
            return r1
        L4f:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L53:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L31
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r6 == 0) goto L64
            java.lang.Object r5 = r5.next()     // Catch: java.lang.Throwable -> L31
            r6 = 0
            kotlinx.coroutines.channels.s.b(r0, r6)
            return r5
        L64:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L31
            java.lang.String r6 = "ReceiveChannel is empty."
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L31
            throw r5     // Catch: java.lang.Throwable -> L31
        L6c:
            r6 = move-exception
            r0 = r5
            r5 = r6
        L6f:
            throw r5     // Catch: java.lang.Throwable -> L70
        L70:
            r6 = move-exception
            kotlinx.coroutines.channels.s.b(r0, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.w(kotlinx.coroutines.channels.g0, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[Catch: all -> 0x0031, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:11:0x002d, B:12:0x0053, B:18:0x0060), top: B:10:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object x(kotlinx.coroutines.channels.g0 r5, kotlin.coroutines.d r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.v.r
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.channels.v$r r0 = (kotlinx.coroutines.channels.v.r) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.v$r r0 = new kotlinx.coroutines.channels.v$r
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r5 = r0.L$1
            kotlinx.coroutines.channels.n r5 = (kotlinx.coroutines.channels.n) r5
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.channels.g0 r0 = (kotlinx.coroutines.channels.g0) r0
            kotlin.e1.n(r6)     // Catch: java.lang.Throwable -> L31
            goto L53
        L31:
            r5 = move-exception
            goto L6b
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            kotlin.e1.n(r6)
            kotlinx.coroutines.channels.n r6 = r5.iterator()     // Catch: java.lang.Throwable -> L68
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L68
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L68
            r0.label = r3     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r6.c(r0)     // Catch: java.lang.Throwable -> L68
            if (r0 != r1) goto L4f
            return r1
        L4f:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L53:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L31
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L31
            r1 = 0
            if (r6 != 0) goto L60
            kotlinx.coroutines.channels.s.b(r0, r1)
            return r1
        L60:
            java.lang.Object r5 = r5.next()     // Catch: java.lang.Throwable -> L31
            kotlinx.coroutines.channels.s.b(r0, r1)
            return r5
        L68:
            r6 = move-exception
            r0 = r5
            r5 = r6
        L6b:
            throw r5     // Catch: java.lang.Throwable -> L6c
        L6c:
            r6 = move-exception
            kotlinx.coroutines.channels.s.b(r0, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.x(kotlinx.coroutines.channels.g0, kotlin.coroutines.d):java.lang.Object");
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.g0 y(kotlinx.coroutines.channels.g0 g0Var, kotlin.coroutines.g gVar, v3.p pVar) {
        return kotlinx.coroutines.channels.c0.f(c2.f19867a, gVar, 0, null, kotlinx.coroutines.channels.s.g(g0Var), new s(g0Var, pVar, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.g0 z(kotlinx.coroutines.channels.g0 g0Var, kotlin.coroutines.g gVar, v3.p pVar, int i5, Object obj) {
        kotlinx.coroutines.channels.g0 y4;
        if ((i5 & 1) != 0) {
            gVar = k1.g();
        }
        y4 = y(g0Var, gVar, pVar);
        return y4;
    }
}
