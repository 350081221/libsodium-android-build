package androidx.compose.runtime;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.android.live.base.api.push.ILivePush;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.o;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlin.ranges.u;
import kotlin.y;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import t0.b;
import v3.p;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b+\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u0000 º\u00012\u00020\u0001:\u0002º\u0001B\u0011\u0012\u0006\u0010|\u001a\u00020{¢\u0006\u0006\b¸\u0001\u0010¹\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J,\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0002J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0012\u001a\u00020\rH\u0002J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0018\u001a\u00020\rH\u0002J\b\u0010\u0019\u001a\u00020\u0002H\u0002J \u0010\u001c\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H\u0002J\u0010\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0002H\u0002J\u0018\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010 \u001a\u00020\rH\u0002J\u0010\u0010\"\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u0002H\u0002J\u0018\u0010#\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0002J\u0018\u0010&\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u0002H\u0002J\u0012\u0010'\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u0002H\u0002J \u0010(\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0002J\u001a\u0010*\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u0002J\u0018\u0010-\u001a\u00020\r2\u0006\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u0002H\u0002J@\u00103\u001a\u00020\n2\u0006\u0010.\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022&\u00102\u001a\"\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0006\u0018\u00010/j\u0010\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0006\u0018\u0001`1H\u0002J \u00106\u001a\u00020\r2\u0006\u00104\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H\u0002J\u0018\u00109\u001a\u00020\r*\u000607j\u0002`82\u0006\u0010\u001d\u001a\u00020\u0002H\u0002J\u0010\u0010:\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002H\u0002J\u0010\u0010<\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u0002H\u0002J\u0014\u0010\u0003\u001a\u00020\u0002*\u00020=2\u0006\u0010\u001d\u001a\u00020\u0002H\u0002J\u0010\u0010;\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002H\u0002J\u0014\u0010;\u001a\u00020\u0002*\u00020=2\u0006\u0010>\u001a\u00020\u0002H\u0002J\u0014\u0010?\u001a\u00020\u0002*\u00020=2\u0006\u0010>\u001a\u00020\u0002H\u0002J\u001c\u0010@\u001a\u00020\r*\u00020=2\u0006\u0010>\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u0002H\u0002J\u0014\u0010A\u001a\u00020\u0002*\u00020=2\u0006\u0010>\u001a\u00020\u0002H\u0002J\u0014\u0010B\u001a\u00020\u0002*\u00020=2\u0006\u0010>\u001a\u00020\u0002H\u0002J\u0012\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00020C*\u00020=H\u0002J\u000e\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00020CH\u0002J(\u0010H\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u00022\u0006\u0010G\u001a\u00020\u0002H\u0002J \u0010J\u001a\u00020\u00022\u0006\u0010I\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u00022\u0006\u0010G\u001a\u00020\u0002H\u0002J\u0018\u0010K\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0002H\u0002J\u0010\u0010L\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002H\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0002J\u000e\u0010M\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002J\u000e\u0010N\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002J\u0010\u0010O\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001d\u001a\u00020\u0002J\u000e\u0010P\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002J\u0010\u0010Q\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001d\u001a\u00020\u0002J\u000e\u0010R\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0002J\u000e\u0010S\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0002J\u0016\u0010T\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002J\u0010\u0010U\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001d\u001a\u00020\u0002J\u0010\u0010U\u001a\u0004\u0018\u00010\u00012\u0006\u0010I\u001a\u000200J\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002J\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010I\u001a\u000200J\u0006\u0010V\u001a\u00020\rJ\u0006\u0010W\u001a\u00020\rJ\u0012\u0010X\u001a\u0004\u0018\u00010\u00012\b\u0010)\u001a\u0004\u0018\u00010\u0001J\u0010\u0010Y\u001a\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010\u0001J\u0010\u0010Z\u001a\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010\u0001J\u000e\u0010[\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\\\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u0004J\u0006\u0010]\u001a\u00020\rJ\u0010\u0010^\u001a\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010\u0001J\u0018\u0010^\u001a\u00020\r2\u0006\u0010I\u001a\u0002002\b\u0010)\u001a\u0004\u0018\u00010\u0001J\u0010\u0010_\u001a\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\u0015\u001a\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010\u0001J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001d\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\u0001J\"\u0010\u0015\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\u0001J\b\u0010`\u001a\u0004\u0018\u00010\u0001J\u0018\u0010a\u001a\u0004\u0018\u00010\u00012\u0006\u0010I\u001a\u0002002\u0006\u0010\u001d\u001a\u00020\u0002J\u0018\u0010a\u001a\u0004\u0018\u00010\u00012\u0006\u0010b\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002J\u000e\u0010d\u001a\u00020\r2\u0006\u0010c\u001a\u00020\u0002J\u000e\u0010e\u001a\u00020\r2\u0006\u0010I\u001a\u000200J\u0006\u0010f\u001a\u00020\rJ\u0006\u0010g\u001a\u00020\rJ\u0006\u0010h\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0002J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00022\b\u0010i\u001a\u0004\u0018\u00010\u0001J\u0018\u0010j\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0001J\"\u0010j\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00012\b\u0010U\u001a\u0004\u0018\u00010\u0001J\"\u0010k\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u0001J\u0018\u0010k\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001J\u0006\u0010\u001a\u001a\u00020\u0002J\u000e\u0010l\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0002J\u000e\u0010l\u001a\u00020\r2\u0006\u0010I\u001a\u000200J\u0006\u0010m\u001a\u00020\u0002J\u0006\u0010n\u001a\u00020\nJ\u000e\u0010p\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010oJK\u0010v\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000228\u0010u\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\br\u0012\b\bs\u0012\u0004\b\b(\u001d\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\br\u0012\b\bs\u0012\u0004\b\b(t\u0012\u0004\u0012\u00020\r0qH\u0086\bJ\u000e\u0010x\u001a\u00020\r2\u0006\u0010w\u001a\u00020\u0002J$\u0010z\u001a\b\u0012\u0004\u0012\u0002000C2\u0006\u0010I\u001a\u0002002\u0006\u0010w\u001a\u00020\u00022\u0006\u0010y\u001a\u00020\u0000J&\u0010~\u001a\b\u0012\u0004\u0012\u0002000C2\u0006\u0010|\u001a\u00020{2\u0006\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010}\u001a\u00020\nJ\u0006\u0010\u007f\u001a\u00020\rJ%\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u0002000C2\u0006\u0010w\u001a\u00020\u00022\u0006\u0010|\u001a\u00020{2\u0006\u0010\u001d\u001a\u00020\u0002J\u0010\u0010I\u001a\u0002002\b\b\u0002\u0010\u001d\u001a\u00020\u0002J\u0011\u0010\u0081\u0001\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0002J\u000f\u0010\u0082\u0001\u001a\u00020\u00022\u0006\u0010I\u001a\u000200J\t\u0010\u0083\u0001\u001a\u00020\u0004H\u0016J\u001c\u0010\u0086\u0001\u001a\u0004\u0018\u0001002\u0006\u0010\u000f\u001a\u00020\u0002H\u0000¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u0007\u0010\u0087\u0001\u001a\u00020\u0004J\u0012\u0010\u008a\u0001\u001a\u00020\rH\u0000¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u0012\u0010\u008c\u0001\u001a\u00020\rH\u0000¢\u0006\u0006\b\u008b\u0001\u0010\u0089\u0001R\u001d\u0010|\u001a\u00020{8\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b|\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0019\u0010\u0090\u0001\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\"\u0010\u0093\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0092\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R+\u0010\u0097\u0001\u001a\u0014\u0012\u0004\u0012\u0002000\u0095\u0001j\t\u0012\u0004\u0012\u000200`\u0096\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R7\u00102\u001a\"\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0006\u0018\u00010/j\u0010\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0006\u0018\u0001`18\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b2\u0010\u0099\u0001R\u0019\u0010\u009a\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0019\u0010\u009c\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009b\u0001R\u0019\u0010\u009d\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009b\u0001R\u0019\u0010\u009e\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009b\u0001R\u0019\u0010\u009f\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u009b\u0001R\u0019\u0010 \u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010\u009b\u0001R\u0019\u0010¡\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010\u009b\u0001R\u0019\u0010¢\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010\u009b\u0001R\u0017\u0010M\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bM\u0010\u009b\u0001R\u0018\u0010¤\u0001\u001a\u00030£\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u0018\u0010¦\u0001\u001a\u00030£\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010¥\u0001R\u0018\u0010§\u0001\u001a\u00030£\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¥\u0001R*\u0010©\u0001\u001a\u00020\u00022\u0007\u0010¨\u0001\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b©\u0001\u0010\u009b\u0001\u001a\u0006\bª\u0001\u0010«\u0001R*\u0010¬\u0001\u001a\u00020\u00022\u0007\u0010¨\u0001\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b¬\u0001\u0010\u009b\u0001\u001a\u0006\b\u00ad\u0001\u0010«\u0001R(\u0010\u0003\u001a\u00020\u00022\u0007\u0010¨\u0001\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b\u0003\u0010\u009b\u0001\u001a\u0006\b®\u0001\u0010«\u0001R*\u0010¯\u0001\u001a\u00020\n2\u0007\u0010¨\u0001\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b¯\u0001\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001R\u001b\u0010³\u0001\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R\u0016\u0010G\u001a\u00020\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\bµ\u0001\u0010«\u0001R\u0014\u0010¶\u0001\u001a\u00020\n8F¢\u0006\b\u001a\u0006\b¶\u0001\u0010²\u0001R\u0012\u0010\u000b\u001a\u00020\n8F¢\u0006\u0007\u001a\u0005\b\u000b\u0010²\u0001R\u0016\u0010!\u001a\u00020\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b·\u0001\u0010«\u0001¨\u0006»\u0001"}, d2 = {"Landroidx/compose/runtime/SlotWriter;", "", "", "parent", "", "sourceInformation", "Landroidx/compose/runtime/GroupSourceInformation;", "groupSourceInformationFor", DatabaseFileArchive.COLUMN_KEY, "objectKey", "", "isNode", "aux", "Lkotlin/r2;", "startGroup", "group", "containsGroupMark", "containsAnyGroupMarks", "recalculateMarks", "updateContainsMark", "Landroidx/compose/runtime/PrioritySet;", "set", "updateContainsMarkNow", "childContainsAnyMarks", "saveCurrentGroupEnd", "restoreCurrentGroupEnd", "endGroup", "firstChild", "fixParentAnchorsFor", "index", "moveGroupGapTo", "moveSlotGapTo", "clearSlotGap", "size", "insertGroups", "insertSlots", "start", "len", "removeGroups", "sourceInformationOf", "removeSlots", b.f22420d, "updateNodeOfGroup", "previousGapStart", "newGapStart", "updateAnchors", "gapStart", "Ljava/util/HashMap;", "Landroidx/compose/runtime/Anchor;", "Lkotlin/collections/HashMap;", "sourceInformationMap", "removeAnchors", "originalLocation", "newLocation", "moveAnchors", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "groupAsString", "groupIndexToAddress", "dataIndex", "dataIndexToDataAddress", "", "address", "slotIndex", "updateDataIndex", "nodeIndex", "auxIndex", "", "dataIndexes", "keys", "gapLen", "capacity", "dataIndexToDataAnchor", "anchor", "dataAnchorToDataIndex", "parentIndexToAnchor", "parentAnchorToIndex", "nodeCount", "groupKey", "groupObjectKey", "groupSize", "groupAux", "indexInParent", "indexInCurrentGroup", "indexInGroup", "node", ILivePush.ClickType.CLOSE, "reset", "update", "updateAux", "insertAux", "recordGroupSourceInformation", "recordGrouplessCallSourceInformationStart", "recordGrouplessCallSourceInformationEnd", "updateNode", "updateParentNode", "skip", "slot", "groupIndex", "amount", "advanceBy", "seek", "skipToGroupEnd", "beginInsert", "endInsert", "dataKey", "startNode", "startData", "ensureStarted", "skipGroup", "removeGroup", "", "groupSlots", "Lkotlin/Function2;", "Lkotlin/v0;", "name", "data", "block", "forEachData", TypedValues.CycleType.S_WAVE_OFFSET, "moveGroup", "writer", "moveTo", "Landroidx/compose/runtime/SlotTable;", "table", "removeSourceGroup", "moveFrom", "bashCurrentGroup", "moveIntoGroupFrom", "markGroup", "anchorIndex", "toString", "tryAnchor$runtime_release", "(I)Landroidx/compose/runtime/Anchor;", "tryAnchor", "groupsAsString", "verifyDataAnchors$runtime_release", "()V", "verifyDataAnchors", "verifyParentAnchors$runtime_release", "verifyParentAnchors", "Landroidx/compose/runtime/SlotTable;", "getTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "groups", "[I", "", "slots", "[Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "anchors", "Ljava/util/ArrayList;", "Ljava/util/HashMap;", "groupGapStart", "I", "groupGapLen", "currentSlot", "currentSlotEnd", "slotsGapStart", "slotsGapLen", "slotsGapOwner", "insertCount", "Landroidx/compose/runtime/IntStack;", "startStack", "Landroidx/compose/runtime/IntStack;", "endStack", "nodeCountStack", "<set-?>", "currentGroup", "getCurrentGroup", "()I", "currentGroupEnd", "getCurrentGroupEnd", "getParent", "closed", "Z", "getClosed", "()Z", "pendingRecalculateMarks", "Landroidx/compose/runtime/PrioritySet;", "getCapacity", "isGroupEnd", "getSize$runtime_release", "<init>", "(Landroidx/compose/runtime/SlotTable;)V", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 6 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 7 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,3745:1\n4178#2,5:3746\n4178#2,5:3751\n4178#2,5:3756\n4178#2,5:3761\n4178#2,5:3774\n4178#2,5:3779\n4178#2,5:3784\n4178#2,5:3789\n4178#2,5:3794\n4178#2,5:3799\n4178#2,5:3804\n4178#2,5:3809\n4178#2,5:3814\n4178#2,5:3819\n4178#2,5:3824\n4178#2,5:3829\n4178#2,5:3834\n4178#2,5:3839\n4178#2,5:3866\n4178#2,5:3871\n4178#2,5:3876\n1#3:3766\n361#4,7:3767\n166#5,8:3844\n166#5,8:3852\n3616#6,6:3860\n33#7,6:3881\n82#7,3:3887\n33#7,4:3890\n85#7,2:3894\n38#7:3896\n87#7:3897\n231#7,3:3898\n64#7,4:3901\n234#7,2:3905\n69#7:3907\n236#7:3908\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n*L\n1526#1:3746,5\n1550#1:3751,5\n1563#1:3756,5\n1566#1:3761,5\n1649#1:3774,5\n1670#1:3779,5\n1717#1:3784,5\n1722#1:3789,5\n1762#1:3794,5\n1773#1:3799,5\n1903#1:3804,5\n1967#1:3809,5\n1972#1:3814,5\n2004#1:3819,5\n2064#1:3824,5\n2065#1:3829,5\n2078#1:3834,5\n2172#1:3839,5\n2735#1:3866,5\n2747#1:3871,5\n2957#1:3876,5\n1611#1:3767,7\n2479#1:3844,8\n2520#1:3852,8\n2540#1:3860,6\n3058#1:3881,6\n3228#1:3887,3\n3228#1:3890,4\n3228#1:3894,2\n3228#1:3896\n3228#1:3897\n3231#1:3898,3\n3231#1:3901,4\n3231#1:3905,2\n3231#1:3907\n3231#1:3908\n*E\n"})
/* loaded from: classes.dex */
public final class SlotWriter {

    @l
    private ArrayList<Anchor> anchors;
    private boolean closed;
    private int currentGroup;
    private int currentGroupEnd;
    private int currentSlot;
    private int currentSlotEnd;
    private int groupGapLen;
    private int groupGapStart;

    @l
    private int[] groups;
    private int insertCount;
    private int nodeCount;

    @m
    private PrioritySet pendingRecalculateMarks;

    @l
    private Object[] slots;
    private int slotsGapLen;
    private int slotsGapOwner;
    private int slotsGapStart;

    @m
    private HashMap<Anchor, GroupSourceInformation> sourceInformationMap;

    @l
    private final SlotTable table;

    @l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @l
    private final IntStack startStack = new IntStack();

    @l
    private final IntStack endStack = new IntStack();

    @l
    private final IntStack nodeCountStack = new IntStack();
    private int parent = -1;

    @i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J@\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0002¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/SlotWriter$Companion;", "", "()V", "moveGroup", "", "Landroidx/compose/runtime/Anchor;", "fromWriter", "Landroidx/compose/runtime/SlotWriter;", "fromIndex", "", "toWriter", "updateFromCursor", "", "updateToCursor", "removeSourceGroup", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,3745:1\n1#2:3746\n33#3,6:3747\n4178#4,5:3753\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter$Companion\n*L\n2302#1:3747,6\n2367#1:3753,5\n*E\n"})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final List<Anchor> moveGroup(SlotWriter slotWriter, int i5, SlotWriter slotWriter2, boolean z4, boolean z5, boolean z6) {
            boolean z7;
            int locationOf;
            int locationOf2;
            List<Anchor> E;
            List<Anchor> list;
            boolean isNode;
            boolean z8;
            int groupSize;
            HashMap hashMap;
            int locationOf3;
            int i6;
            int parentAnchor;
            int groupSize2 = slotWriter.groupSize(i5);
            int i7 = i5 + groupSize2;
            int dataIndex = slotWriter.dataIndex(i5);
            int dataIndex2 = slotWriter.dataIndex(i7);
            int i8 = dataIndex2 - dataIndex;
            boolean containsAnyGroupMarks = slotWriter.containsAnyGroupMarks(i5);
            slotWriter2.insertGroups(groupSize2);
            slotWriter2.insertSlots(i8, slotWriter2.getCurrentGroup());
            if (slotWriter.groupGapStart < i7) {
                slotWriter.moveGroupGapTo(i7);
            }
            if (slotWriter.slotsGapStart < dataIndex2) {
                slotWriter.moveSlotGapTo(dataIndex2, i7);
            }
            int[] iArr = slotWriter2.groups;
            int currentGroup = slotWriter2.getCurrentGroup();
            o.z0(slotWriter.groups, iArr, currentGroup * 5, i5 * 5, i7 * 5);
            Object[] objArr = slotWriter2.slots;
            int i9 = slotWriter2.currentSlot;
            o.B0(slotWriter.slots, objArr, i9, dataIndex, dataIndex2);
            int parent = slotWriter2.getParent();
            SlotTableKt.updateParentAnchor(iArr, currentGroup, parent);
            int i10 = currentGroup - i5;
            int i11 = currentGroup + groupSize2;
            int dataIndex3 = i9 - slotWriter2.dataIndex(iArr, currentGroup);
            int i12 = slotWriter2.slotsGapOwner;
            int i13 = slotWriter2.slotsGapLen;
            int length = objArr.length;
            int i14 = i12;
            int i15 = currentGroup;
            while (true) {
                z7 = 0;
                int i16 = 0;
                z8 = false;
                if (i15 >= i11) {
                    break;
                }
                if (i15 != currentGroup) {
                    parentAnchor = SlotTableKt.parentAnchor(iArr, i15);
                    i6 = i11;
                    SlotTableKt.updateParentAnchor(iArr, i15, parentAnchor + i10);
                } else {
                    i6 = i11;
                }
                int dataIndex4 = slotWriter2.dataIndex(iArr, i15) + dataIndex3;
                if (i14 >= i15) {
                    i16 = slotWriter2.slotsGapStart;
                }
                int i17 = dataIndex3;
                SlotTableKt.updateDataAnchor(iArr, i15, slotWriter2.dataIndexToDataAnchor(dataIndex4, i16, i13, length));
                if (i15 == i14) {
                    i14++;
                }
                i15++;
                dataIndex3 = i17;
                i11 = i6;
            }
            int i18 = i11;
            slotWriter2.slotsGapOwner = i14;
            locationOf = SlotTableKt.locationOf(slotWriter.anchors, i5, slotWriter.getSize$runtime_release());
            locationOf2 = SlotTableKt.locationOf(slotWriter.anchors, i7, slotWriter.getSize$runtime_release());
            if (locationOf < locationOf2) {
                ArrayList arrayList = slotWriter.anchors;
                ArrayList arrayList2 = new ArrayList(locationOf2 - locationOf);
                for (int i19 = locationOf; i19 < locationOf2; i19++) {
                    Anchor anchor = (Anchor) arrayList.get(i19);
                    anchor.setLocation$runtime_release(anchor.getLocation$runtime_release() + i10);
                    arrayList2.add(anchor);
                }
                locationOf3 = SlotTableKt.locationOf(slotWriter2.anchors, slotWriter2.getCurrentGroup(), slotWriter2.getSize$runtime_release());
                slotWriter2.anchors.addAll(locationOf3, arrayList2);
                arrayList.subList(locationOf, locationOf2).clear();
                list = arrayList2;
            } else {
                E = kotlin.collections.w.E();
                list = E;
            }
            int i20 = 1;
            if ((!list.isEmpty()) && (hashMap = slotWriter.sourceInformationMap) != null) {
                HashMap hashMap2 = slotWriter2.sourceInformationMap;
                int size = list.size();
                for (int i21 = 0; i21 < size; i21++) {
                    Anchor anchor2 = list.get(i21);
                    GroupSourceInformation groupSourceInformation = (GroupSourceInformation) hashMap.get(anchor2);
                    if (groupSourceInformation != null) {
                        hashMap.remove(anchor2);
                        if (hashMap2 == null) {
                            Companion companion = SlotWriter.Companion;
                            hashMap2 = new HashMap();
                            slotWriter2.sourceInformationMap = hashMap2;
                        }
                        hashMap2.put(anchor2, groupSourceInformation);
                    }
                }
                if (hashMap.isEmpty()) {
                    slotWriter.sourceInformationMap = null;
                }
            }
            int parent2 = slotWriter2.getParent();
            GroupSourceInformation sourceInformationOf = slotWriter2.sourceInformationOf(parent);
            if (sourceInformationOf != null) {
                int i22 = parent2 + 1;
                int currentGroup2 = slotWriter2.getCurrentGroup();
                int i23 = -1;
                while (i22 < currentGroup2) {
                    groupSize = SlotTableKt.groupSize(slotWriter2.groups, i22);
                    int i24 = groupSize + i22;
                    i23 = i22;
                    i22 = i24;
                }
                sourceInformationOf.addGroupAfter(slotWriter2, i23, currentGroup2);
            }
            int parent3 = slotWriter.parent(i5);
            if (z6) {
                if (z4) {
                    if (parent3 >= 0) {
                        z8 = true;
                    }
                    if (z8) {
                        slotWriter.startGroup();
                        slotWriter.advanceBy(parent3 - slotWriter.getCurrentGroup());
                        slotWriter.startGroup();
                    }
                    slotWriter.advanceBy(i5 - slotWriter.getCurrentGroup());
                    boolean removeGroup = slotWriter.removeGroup();
                    if (z8) {
                        slotWriter.skipToGroupEnd();
                        slotWriter.endGroup();
                        slotWriter.skipToGroupEnd();
                        slotWriter.endGroup();
                    }
                    z7 = removeGroup;
                } else {
                    boolean removeGroups = slotWriter.removeGroups(i5, groupSize2);
                    slotWriter.removeSlots(dataIndex, i8, i5 - 1);
                    z7 = removeGroups;
                }
            }
            if ((!z7) != 0) {
                int i25 = slotWriter2.nodeCount;
                isNode = SlotTableKt.isNode(iArr, currentGroup);
                if (!isNode) {
                    i20 = SlotTableKt.nodeCount(iArr, currentGroup);
                }
                slotWriter2.nodeCount = i25 + i20;
                if (z5) {
                    slotWriter2.currentGroup = i18;
                    slotWriter2.currentSlot = i9 + i8;
                }
                if (containsAnyGroupMarks) {
                    slotWriter2.updateContainsMark(parent);
                }
                return list;
            }
            ComposerKt.composeRuntimeError("Unexpectedly removed anchors".toString());
            throw new y();
        }

        static /* synthetic */ List moveGroup$default(Companion companion, SlotWriter slotWriter, int i5, SlotWriter slotWriter2, boolean z4, boolean z5, boolean z6, int i6, Object obj) {
            if ((i6 & 32) != 0) {
                z6 = true;
            }
            return companion.moveGroup(slotWriter, i5, slotWriter2, z4, z5, z6);
        }
    }

    public SlotWriter(@l SlotTable slotTable) {
        this.table = slotTable;
        this.groups = slotTable.getGroups();
        this.slots = slotTable.getSlots();
        this.anchors = slotTable.getAnchors$runtime_release();
        this.sourceInformationMap = slotTable.getSourceInformationMap$runtime_release();
        this.groupGapStart = slotTable.getGroupsSize();
        this.groupGapLen = (this.groups.length / 5) - slotTable.getGroupsSize();
        this.slotsGapStart = slotTable.getSlotsSize();
        this.slotsGapLen = this.slots.length - slotTable.getSlotsSize();
        this.slotsGapOwner = slotTable.getGroupsSize();
        this.currentGroupEnd = slotTable.getGroupsSize();
    }

    public static final /* synthetic */ int access$dataIndexToDataAddress(SlotWriter slotWriter, int i5) {
        return slotWriter.dataIndexToDataAddress(i5);
    }

    public static final /* synthetic */ int[] access$getGroups$p(SlotWriter slotWriter) {
        return slotWriter.groups;
    }

    public static final /* synthetic */ Object[] access$getSlots$p(SlotWriter slotWriter) {
        return slotWriter.slots;
    }

    public static final /* synthetic */ int access$groupIndexToAddress(SlotWriter slotWriter, int i5) {
        return slotWriter.groupIndexToAddress(i5);
    }

    public static final /* synthetic */ int access$slotIndex(SlotWriter slotWriter, int[] iArr, int i5) {
        return slotWriter.slotIndex(iArr, i5);
    }

    public static /* synthetic */ Anchor anchor$default(SlotWriter slotWriter, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = slotWriter.currentGroup;
        }
        return slotWriter.anchor(i5);
    }

    private final int auxIndex(int[] iArr, int i5) {
        int groupInfo;
        int countOneBits;
        int dataIndex = dataIndex(iArr, i5);
        groupInfo = SlotTableKt.groupInfo(iArr, i5);
        countOneBits = SlotTableKt.countOneBits(groupInfo >> 29);
        return dataIndex + countOneBits;
    }

    private final boolean childContainsAnyMarks(int i5) {
        boolean containsAnyMark;
        int i6 = i5 + 1;
        int groupSize = i5 + groupSize(i5);
        while (i6 < groupSize) {
            containsAnyMark = SlotTableKt.containsAnyMark(this.groups, groupIndexToAddress(i6));
            if (containsAnyMark) {
                return true;
            }
            i6 += groupSize(i6);
        }
        return false;
    }

    private final void clearSlotGap() {
        int i5 = this.slotsGapStart;
        o.M1(this.slots, null, i5, this.slotsGapLen + i5);
    }

    public final boolean containsAnyGroupMarks(int i5) {
        boolean containsAnyMark;
        if (i5 >= 0) {
            containsAnyMark = SlotTableKt.containsAnyMark(this.groups, groupIndexToAddress(i5));
            if (containsAnyMark) {
                return true;
            }
        }
        return false;
    }

    private final boolean containsGroupMark(int i5) {
        boolean containsMark;
        if (i5 >= 0) {
            containsMark = SlotTableKt.containsMark(this.groups, groupIndexToAddress(i5));
            if (containsMark) {
                return true;
            }
        }
        return false;
    }

    private final int dataAnchorToDataIndex(int i5, int i6, int i7) {
        return i5 < 0 ? (i7 - i6) + i5 + 1 : i5;
    }

    public final int dataIndex(int i5) {
        return dataIndex(this.groups, groupIndexToAddress(i5));
    }

    public final int dataIndexToDataAddress(int i5) {
        return i5 < this.slotsGapStart ? i5 : i5 + this.slotsGapLen;
    }

    public final int dataIndexToDataAnchor(int i5, int i6, int i7, int i8) {
        return i5 > i6 ? -(((i8 - i7) - i5) + 1) : i5;
    }

    private final List<Integer> dataIndexes(int[] iArr) {
        kotlin.ranges.l W1;
        List j5;
        kotlin.ranges.l W12;
        List j52;
        List A4;
        List dataAnchors$default = SlotTableKt.dataAnchors$default(this.groups, 0, 1, null);
        W1 = u.W1(0, this.groupGapStart);
        j5 = e0.j5(dataAnchors$default, W1);
        W12 = u.W1(this.groupGapStart + this.groupGapLen, iArr.length / 5);
        j52 = e0.j5(dataAnchors$default, W12);
        A4 = e0.A4(j5, j52);
        ArrayList arrayList = new ArrayList(A4.size());
        int size = A4.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(Integer.valueOf(dataAnchorToDataIndex(((Number) A4.get(i5)).intValue(), this.slotsGapLen, this.slots.length)));
        }
        return arrayList;
    }

    private final void fixParentAnchorsFor(int i5, int i6, int i7) {
        int groupSize;
        int parentIndexToAnchor = parentIndexToAnchor(i5, this.groupGapStart);
        while (i7 < i6) {
            SlotTableKt.updateParentAnchor(this.groups, groupIndexToAddress(i7), parentIndexToAnchor);
            groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress(i7));
            int i8 = groupSize + i7;
            fixParentAnchorsFor(i7, i8, i7 + 1);
            i7 = i8;
        }
    }

    private final int getCapacity() {
        return this.groups.length / 5;
    }

    private final void groupAsString(StringBuilder sb, int i5) {
        int groupSize;
        int parentAnchor;
        int key;
        int nodeCount;
        int dataAnchor;
        int parentAnchor2;
        boolean isNode;
        int groupIndexToAddress = groupIndexToAddress(i5);
        sb.append("Group(");
        if (i5 < 10) {
            sb.append(' ');
        }
        if (i5 < 100) {
            sb.append(' ');
        }
        if (i5 < 1000) {
            sb.append(' ');
        }
        sb.append(i5);
        if (groupIndexToAddress != i5) {
            sb.append("(");
            sb.append(groupIndexToAddress);
            sb.append(")");
        }
        sb.append('#');
        groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress);
        sb.append(groupSize);
        boolean groupAsString$isStarted = groupAsString$isStarted(this, i5);
        if (groupAsString$isStarted) {
            sb.append('?');
        }
        sb.append('^');
        parentAnchor = SlotTableKt.parentAnchor(this.groups, groupIndexToAddress);
        sb.append(parentAnchorToIndex(parentAnchor));
        sb.append(": key=");
        key = SlotTableKt.key(this.groups, groupIndexToAddress);
        sb.append(key);
        sb.append(", nodes=");
        nodeCount = SlotTableKt.nodeCount(this.groups, groupIndexToAddress);
        sb.append(nodeCount);
        if (groupAsString$isStarted) {
            sb.append('?');
        }
        sb.append(", dataAnchor=");
        dataAnchor = SlotTableKt.dataAnchor(this.groups, groupIndexToAddress);
        sb.append(dataAnchor);
        sb.append(", parentAnchor=");
        parentAnchor2 = SlotTableKt.parentAnchor(this.groups, groupIndexToAddress);
        sb.append(parentAnchor2);
        isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress);
        if (isNode) {
            sb.append(", node=" + this.slots[dataIndexToDataAddress(nodeIndex(this.groups, groupIndexToAddress))]);
        }
        int slotIndex = slotIndex(this.groups, groupIndexToAddress);
        int dataIndex = dataIndex(this.groups, groupIndexToAddress + 1);
        if (dataIndex > slotIndex) {
            sb.append(", [");
            for (int i6 = slotIndex; i6 < dataIndex; i6++) {
                if (i6 != slotIndex) {
                    sb.append(", ");
                }
                sb.append(String.valueOf(this.slots[dataIndexToDataAddress(i6)]));
            }
            sb.append(']');
        }
        sb.append(")");
    }

    private static final boolean groupAsString$isStarted(SlotWriter slotWriter, int i5) {
        if (i5 < slotWriter.currentGroup && (i5 == slotWriter.parent || slotWriter.startStack.indexOf(i5) >= 0 || groupAsString$isStarted(slotWriter, slotWriter.parent(i5)))) {
            return true;
        }
        return false;
    }

    public final int groupIndexToAddress(int i5) {
        return i5 < this.groupGapStart ? i5 : i5 + this.groupGapLen;
    }

    private final GroupSourceInformation groupSourceInformationFor(int i5, String str) {
        int groupSize;
        HashMap<Anchor, GroupSourceInformation> hashMap = this.sourceInformationMap;
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        this.sourceInformationMap = hashMap;
        Anchor anchor = anchor(i5);
        GroupSourceInformation groupSourceInformation = hashMap.get(anchor);
        if (groupSourceInformation == null) {
            groupSourceInformation = new GroupSourceInformation(0, str);
            if (str == null) {
                int i6 = i5 + 1;
                int i7 = this.currentGroup;
                while (i6 < i7) {
                    groupSourceInformation.reportGroup(this, i6);
                    groupSize = SlotTableKt.groupSize(this.groups, i6);
                    i6 += groupSize;
                }
            }
            hashMap.put(anchor, groupSourceInformation);
        }
        return groupSourceInformation;
    }

    public final void insertGroups(int i5) {
        int i6;
        if (i5 > 0) {
            int i7 = this.currentGroup;
            moveGroupGapTo(i7);
            int i8 = this.groupGapStart;
            int i9 = this.groupGapLen;
            int[] iArr = this.groups;
            int length = iArr.length / 5;
            int i10 = length - i9;
            int i11 = 0;
            if (i9 < i5) {
                int max = Math.max(Math.max(length * 2, i10 + i5), 32);
                int[] iArr2 = new int[max * 5];
                int i12 = max - i10;
                o.z0(iArr, iArr2, 0, 0, i8 * 5);
                o.z0(iArr, iArr2, (i8 + i12) * 5, (i9 + i8) * 5, length * 5);
                this.groups = iArr2;
                i9 = i12;
            }
            int i13 = this.currentGroupEnd;
            if (i13 >= i8) {
                this.currentGroupEnd = i13 + i5;
            }
            int i14 = i8 + i5;
            this.groupGapStart = i14;
            this.groupGapLen = i9 - i5;
            if (i10 > 0) {
                i6 = dataIndex(i7 + i5);
            } else {
                i6 = 0;
            }
            if (this.slotsGapOwner >= i8) {
                i11 = this.slotsGapStart;
            }
            int dataIndexToDataAnchor = dataIndexToDataAnchor(i6, i11, this.slotsGapLen, this.slots.length);
            for (int i15 = i8; i15 < i14; i15++) {
                SlotTableKt.updateDataAnchor(this.groups, i15, dataIndexToDataAnchor);
            }
            int i16 = this.slotsGapOwner;
            if (i16 >= i8) {
                this.slotsGapOwner = i16 + i5;
            }
        }
    }

    public final void insertSlots(int i5, int i6) {
        if (i5 > 0) {
            moveSlotGapTo(this.currentSlot, i6);
            int i7 = this.slotsGapStart;
            int i8 = this.slotsGapLen;
            if (i8 < i5) {
                Object[] objArr = this.slots;
                int length = objArr.length;
                int i9 = length - i8;
                int max = Math.max(Math.max(length * 2, i9 + i5), 32);
                Object[] objArr2 = new Object[max];
                for (int i10 = 0; i10 < max; i10++) {
                    objArr2[i10] = null;
                }
                int i11 = max - i9;
                int i12 = i8 + i7;
                o.B0(objArr, objArr2, 0, 0, i7);
                o.B0(objArr, objArr2, i7 + i11, i12, length);
                this.slots = objArr2;
                i8 = i11;
            }
            int i13 = this.currentSlotEnd;
            if (i13 >= i7) {
                this.currentSlotEnd = i13 + i5;
            }
            this.slotsGapStart = i7 + i5;
            this.slotsGapLen = i8 - i5;
        }
    }

    private final List<Integer> keys() {
        boolean z4;
        List keys$default = SlotTableKt.keys$default(this.groups, 0, 1, null);
        ArrayList arrayList = new ArrayList(keys$default.size());
        int size = keys$default.size();
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = keys$default.get(i5);
            ((Number) obj).intValue();
            int i6 = this.groupGapStart;
            if (i5 >= i6 && i5 < i6 + this.groupGapLen) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z4) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void markGroup$default(SlotWriter slotWriter, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = slotWriter.parent;
        }
        slotWriter.markGroup(i5);
    }

    private final void moveAnchors(int i5, int i6, int i7) {
        int locationOf;
        int locationOf2;
        Anchor anchor;
        int anchorIndex;
        int i8 = i7 + i5;
        int size$runtime_release = getSize$runtime_release();
        locationOf = SlotTableKt.locationOf(this.anchors, i5, size$runtime_release);
        ArrayList arrayList = new ArrayList();
        if (locationOf >= 0) {
            while (locationOf < this.anchors.size() && (anchorIndex = anchorIndex((anchor = this.anchors.get(locationOf)))) >= i5 && anchorIndex < i8) {
                arrayList.add(anchor);
                this.anchors.remove(locationOf);
            }
        }
        int i9 = i6 - i5;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Anchor anchor2 = (Anchor) arrayList.get(i10);
            int anchorIndex2 = anchorIndex(anchor2) + i9;
            if (anchorIndex2 >= this.groupGapStart) {
                anchor2.setLocation$runtime_release(-(size$runtime_release - anchorIndex2));
            } else {
                anchor2.setLocation$runtime_release(anchorIndex2);
            }
            locationOf2 = SlotTableKt.locationOf(this.anchors, anchorIndex2, size$runtime_release);
            this.anchors.add(locationOf2, anchor2);
        }
    }

    public static /* synthetic */ List moveFrom$default(SlotWriter slotWriter, SlotTable slotTable, int i5, boolean z4, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            z4 = true;
        }
        return slotWriter.moveFrom(slotTable, i5, z4);
    }

    public final void moveGroupGapTo(int i5) {
        int parentAnchor;
        int i6 = this.groupGapLen;
        int i7 = this.groupGapStart;
        if (i7 != i5) {
            boolean z4 = true;
            if (!this.anchors.isEmpty()) {
                updateAnchors(i7, i5);
            }
            if (i6 > 0) {
                int[] iArr = this.groups;
                int i8 = i5 * 5;
                int i9 = i6 * 5;
                int i10 = i7 * 5;
                if (i5 < i7) {
                    o.z0(iArr, iArr, i9 + i8, i8, i10);
                } else {
                    o.z0(iArr, iArr, i10, i10 + i9, i8 + i9);
                }
            }
            if (i5 < i7) {
                i7 = i5 + i6;
            }
            int capacity = getCapacity();
            if (i7 >= capacity) {
                z4 = false;
            }
            ComposerKt.runtimeCheck(z4);
            while (i7 < capacity) {
                parentAnchor = SlotTableKt.parentAnchor(this.groups, i7);
                int parentIndexToAnchor = parentIndexToAnchor(parentAnchorToIndex(parentAnchor), i5);
                if (parentIndexToAnchor != parentAnchor) {
                    SlotTableKt.updateParentAnchor(this.groups, i7, parentIndexToAnchor);
                }
                i7++;
                if (i7 == i5) {
                    i7 += i6;
                }
            }
        }
        this.groupGapStart = i5;
    }

    public final void moveSlotGapTo(int i5, int i6) {
        int dataAnchor;
        boolean z4;
        int dataAnchor2;
        boolean z5;
        int i7 = this.slotsGapLen;
        int i8 = this.slotsGapStart;
        int i9 = this.slotsGapOwner;
        if (i8 != i5) {
            Object[] objArr = this.slots;
            if (i5 < i8) {
                o.B0(objArr, objArr, i5 + i7, i5, i8);
            } else {
                o.B0(objArr, objArr, i8, i8 + i7, i5 + i7);
            }
        }
        int min = Math.min(i6 + 1, getSize$runtime_release());
        if (i9 != min) {
            int length = this.slots.length - i7;
            if (min < i9) {
                int groupIndexToAddress = groupIndexToAddress(min);
                int groupIndexToAddress2 = groupIndexToAddress(i9);
                int i10 = this.groupGapStart;
                while (groupIndexToAddress < groupIndexToAddress2) {
                    dataAnchor2 = SlotTableKt.dataAnchor(this.groups, groupIndexToAddress);
                    if (dataAnchor2 >= 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        SlotTableKt.updateDataAnchor(this.groups, groupIndexToAddress, -((length - dataAnchor2) + 1));
                        groupIndexToAddress++;
                        if (groupIndexToAddress == i10) {
                            groupIndexToAddress += this.groupGapLen;
                        }
                    } else {
                        ComposerKt.composeRuntimeError("Unexpected anchor value, expected a positive anchor".toString());
                        throw new y();
                    }
                }
            } else {
                int groupIndexToAddress3 = groupIndexToAddress(i9);
                int groupIndexToAddress4 = groupIndexToAddress(min);
                while (groupIndexToAddress3 < groupIndexToAddress4) {
                    dataAnchor = SlotTableKt.dataAnchor(this.groups, groupIndexToAddress3);
                    if (dataAnchor < 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        SlotTableKt.updateDataAnchor(this.groups, groupIndexToAddress3, dataAnchor + length + 1);
                        groupIndexToAddress3++;
                        if (groupIndexToAddress3 == this.groupGapStart) {
                            groupIndexToAddress3 += this.groupGapLen;
                        }
                    } else {
                        ComposerKt.composeRuntimeError("Unexpected anchor value, expected a negative anchor".toString());
                        throw new y();
                    }
                }
            }
            this.slotsGapOwner = min;
        }
        this.slotsGapStart = i5;
    }

    private final int nodeIndex(int[] iArr, int i5) {
        return dataIndex(iArr, i5);
    }

    private final int parentAnchorToIndex(int i5) {
        return i5 > -2 ? i5 : getSize$runtime_release() + i5 + 2;
    }

    private final int parentIndexToAnchor(int i5, int i6) {
        return i5 < i6 ? i5 : -((getSize$runtime_release() - i5) + 2);
    }

    private final void recalculateMarks() {
        PrioritySet prioritySet = this.pendingRecalculateMarks;
        if (prioritySet != null) {
            while (prioritySet.isNotEmpty()) {
                updateContainsMarkNow(prioritySet.takeMax(), prioritySet);
            }
        }
    }

    private final boolean removeAnchors(int i5, int i6, HashMap<Anchor, GroupSourceInformation> hashMap) {
        int locationOf;
        int i7 = i6 + i5;
        locationOf = SlotTableKt.locationOf(this.anchors, i7, getCapacity() - this.groupGapLen);
        if (locationOf >= this.anchors.size()) {
            locationOf--;
        }
        int i8 = locationOf + 1;
        boolean z4 = false;
        int i9 = 0;
        while (locationOf >= 0) {
            Anchor anchor = this.anchors.get(locationOf);
            int anchorIndex = anchorIndex(anchor);
            if (anchorIndex < i5) {
                break;
            }
            if (anchorIndex < i7) {
                anchor.setLocation$runtime_release(Integer.MIN_VALUE);
                if (hashMap != null) {
                    hashMap.remove(anchor);
                }
                if (i9 == 0) {
                    i9 = locationOf + 1;
                }
                i8 = locationOf;
            }
            locationOf--;
        }
        if (i8 < i9) {
            z4 = true;
        }
        if (z4) {
            this.anchors.subList(i8, i9).clear();
        }
        return z4;
    }

    public final boolean removeGroups(int i5, int i6) {
        boolean z4 = false;
        if (i6 > 0) {
            ArrayList<Anchor> arrayList = this.anchors;
            moveGroupGapTo(i5);
            if (!arrayList.isEmpty()) {
                z4 = removeAnchors(i5, i6, this.sourceInformationMap);
            }
            this.groupGapStart = i5;
            this.groupGapLen += i6;
            int i7 = this.slotsGapOwner;
            if (i7 > i5) {
                this.slotsGapOwner = Math.max(i5, i7 - i6);
            }
            int i8 = this.currentGroupEnd;
            if (i8 >= this.groupGapStart) {
                this.currentGroupEnd = i8 - i6;
            }
            int i9 = this.parent;
            if (containsGroupMark(i9)) {
                updateContainsMark(i9);
            }
        }
        return z4;
    }

    public final void removeSlots(int i5, int i6, int i7) {
        if (i6 > 0) {
            int i8 = this.slotsGapLen;
            int i9 = i5 + i6;
            moveSlotGapTo(i9, i7);
            this.slotsGapStart = i5;
            this.slotsGapLen = i8 + i6;
            o.M1(this.slots, null, i5, i9);
            int i10 = this.currentSlotEnd;
            if (i10 >= i5) {
                this.currentSlotEnd = i10 - i6;
            }
        }
    }

    private final int restoreCurrentGroupEnd() {
        int capacity = (getCapacity() - this.groupGapLen) - this.endStack.pop();
        this.currentGroupEnd = capacity;
        return capacity;
    }

    private final void saveCurrentGroupEnd() {
        this.endStack.push((getCapacity() - this.groupGapLen) - this.currentGroupEnd);
    }

    public final int slotIndex(int[] iArr, int i5) {
        int slotAnchor;
        if (i5 >= getCapacity()) {
            return this.slots.length - this.slotsGapLen;
        }
        slotAnchor = SlotTableKt.slotAnchor(iArr, i5);
        return dataAnchorToDataIndex(slotAnchor, this.slotsGapLen, this.slots.length);
    }

    public final GroupSourceInformation sourceInformationOf(int i5) {
        Anchor tryAnchor$runtime_release;
        HashMap<Anchor, GroupSourceInformation> hashMap = this.sourceInformationMap;
        if (hashMap == null || (tryAnchor$runtime_release = tryAnchor$runtime_release(i5)) == null) {
            return null;
        }
        return hashMap.get(tryAnchor$runtime_release);
    }

    private final void updateAnchors(int i5, int i6) {
        int locationOf;
        Anchor anchor;
        int location$runtime_release;
        int locationOf2;
        Anchor anchor2;
        int location$runtime_release2;
        int i7;
        int capacity = getCapacity() - this.groupGapLen;
        if (i5 < i6) {
            for (locationOf2 = SlotTableKt.locationOf(this.anchors, i5, capacity); locationOf2 < this.anchors.size() && (location$runtime_release2 = (anchor2 = this.anchors.get(locationOf2)).getLocation$runtime_release()) < 0 && (i7 = location$runtime_release2 + capacity) < i6; locationOf2++) {
                anchor2.setLocation$runtime_release(i7);
            }
            return;
        }
        for (locationOf = SlotTableKt.locationOf(this.anchors, i6, capacity); locationOf < this.anchors.size() && (location$runtime_release = (anchor = this.anchors.get(locationOf)).getLocation$runtime_release()) >= 0; locationOf++) {
            anchor.setLocation$runtime_release(-(capacity - location$runtime_release));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void updateContainsMark(int i5) {
        if (i5 >= 0) {
            PrioritySet prioritySet = this.pendingRecalculateMarks;
            if (prioritySet == null) {
                prioritySet = new PrioritySet(null, 1, 0 == true ? 1 : 0);
                this.pendingRecalculateMarks = prioritySet;
            }
            prioritySet.add(i5);
        }
    }

    private final void updateContainsMarkNow(int i5, PrioritySet prioritySet) {
        boolean containsMark;
        boolean z4;
        int groupIndexToAddress = groupIndexToAddress(i5);
        boolean childContainsAnyMarks = childContainsAnyMarks(i5);
        containsMark = SlotTableKt.containsMark(this.groups, groupIndexToAddress);
        if (containsMark != childContainsAnyMarks) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            SlotTableKt.updateContainsMark(this.groups, groupIndexToAddress, childContainsAnyMarks);
            int parent = parent(i5);
            if (parent >= 0) {
                prioritySet.add(parent);
            }
        }
    }

    private final void updateDataIndex(int[] iArr, int i5, int i6) {
        SlotTableKt.updateDataAnchor(iArr, i5, dataIndexToDataAnchor(i6, this.slotsGapStart, this.slotsGapLen, this.slots.length));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updateNodeOfGroup(int r4, java.lang.Object r5) {
        /*
            r3 = this;
            int r0 = r3.groupIndexToAddress(r4)
            int[] r1 = r3.groups
            int r2 = r1.length
            if (r0 >= r2) goto L11
            boolean r1 = androidx.compose.runtime.SlotTableKt.access$isNode(r1, r0)
            if (r1 == 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            if (r1 == 0) goto L23
            java.lang.Object[] r4 = r3.slots
            int[] r1 = r3.groups
            int r0 = r3.nodeIndex(r1, r0)
            int r0 = r3.dataIndexToDataAddress(r0)
            r4[r0] = r5
            return
        L23:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Updating the node of a group at "
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = " that was not created with as a node group"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r4 = r4.toString()
            androidx.compose.runtime.ComposerKt.composeRuntimeError(r4)
            kotlin.y r4 = new kotlin.y
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SlotWriter.updateNodeOfGroup(int, java.lang.Object):void");
    }

    public final void advanceBy(int i5) {
        boolean z4;
        boolean z5;
        boolean z6 = true;
        if (i5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (this.insertCount <= 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                if (i5 == 0) {
                    return;
                }
                int i6 = this.currentGroup + i5;
                if (i6 < this.parent || i6 > this.currentGroupEnd) {
                    z6 = false;
                }
                if (z6) {
                    this.currentGroup = i6;
                    int dataIndex = dataIndex(this.groups, groupIndexToAddress(i6));
                    this.currentSlot = dataIndex;
                    this.currentSlotEnd = dataIndex;
                    return;
                }
                ComposerKt.composeRuntimeError(("Cannot seek outside the current group (" + this.parent + '-' + this.currentGroupEnd + ')').toString());
                throw new y();
            }
            throw new IllegalStateException("Cannot call seek() while inserting".toString());
        }
        ComposerKt.composeRuntimeError("Cannot seek backwards".toString());
        throw new y();
    }

    @l
    public final Anchor anchor(int i5) {
        ArrayList<Anchor> arrayList = this.anchors;
        int search = SlotTableKt.search(arrayList, i5, getSize$runtime_release());
        if (search < 0) {
            if (i5 > this.groupGapStart) {
                i5 = -(getSize$runtime_release() - i5);
            }
            Anchor anchor = new Anchor(i5);
            arrayList.add(-(search + 1), anchor);
            return anchor;
        }
        return arrayList.get(search);
    }

    public final int anchorIndex(@l Anchor anchor) {
        int location$runtime_release = anchor.getLocation$runtime_release();
        return location$runtime_release < 0 ? location$runtime_release + getSize$runtime_release() : location$runtime_release;
    }

    public final void bashCurrentGroup() {
        SlotTableKt.updateGroupKey(this.groups, this.currentGroup, -3);
    }

    public final void beginInsert() {
        int i5 = this.insertCount;
        this.insertCount = i5 + 1;
        if (i5 == 0) {
            saveCurrentGroupEnd();
        }
    }

    public final void close() {
        this.closed = true;
        if (this.startStack.isEmpty()) {
            moveGroupGapTo(getSize$runtime_release());
            moveSlotGapTo(this.slots.length - this.slotsGapLen, this.groupGapStart);
            clearSlotGap();
            recalculateMarks();
        }
        this.table.close$runtime_release(this, this.groups, this.groupGapStart, this.slots, this.slotsGapStart, this.anchors, this.sourceInformationMap);
    }

    public final int endGroup() {
        boolean z4;
        boolean isNode;
        int groupSize;
        int nodeCount;
        int i5;
        boolean isNode2;
        int nodeCount2;
        int groupSize2;
        int i6 = 1;
        int i7 = 0;
        if (this.insertCount > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        int i8 = this.currentGroup;
        int i9 = this.currentGroupEnd;
        int i10 = this.parent;
        int groupIndexToAddress = groupIndexToAddress(i10);
        int i11 = this.nodeCount;
        int i12 = i8 - i10;
        isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress);
        if (z4) {
            SlotTableKt.updateGroupSize(this.groups, groupIndexToAddress, i12);
            SlotTableKt.updateNodeCount(this.groups, groupIndexToAddress, i11);
            int pop = this.nodeCountStack.pop();
            if (!isNode) {
                i6 = i11;
            }
            this.nodeCount = pop + i6;
            this.parent = parent(this.groups, i10);
        } else {
            if (i8 != i9) {
                i6 = 0;
            }
            if (i6 != 0) {
                groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress);
                nodeCount = SlotTableKt.nodeCount(this.groups, groupIndexToAddress);
                SlotTableKt.updateGroupSize(this.groups, groupIndexToAddress, i12);
                SlotTableKt.updateNodeCount(this.groups, groupIndexToAddress, i11);
                int pop2 = this.startStack.pop();
                restoreCurrentGroupEnd();
                this.parent = pop2;
                int parent = parent(this.groups, i10);
                int pop3 = this.nodeCountStack.pop();
                this.nodeCount = pop3;
                if (parent == pop2) {
                    if (!isNode) {
                        i7 = i11 - nodeCount;
                    }
                    this.nodeCount = pop3 + i7;
                } else {
                    int i13 = i12 - groupSize;
                    if (isNode) {
                        i5 = 0;
                    } else {
                        i5 = i11 - nodeCount;
                    }
                    if (i13 != 0 || i5 != 0) {
                        while (parent != 0 && parent != pop2 && (i5 != 0 || i13 != 0)) {
                            int groupIndexToAddress2 = groupIndexToAddress(parent);
                            if (i13 != 0) {
                                groupSize2 = SlotTableKt.groupSize(this.groups, groupIndexToAddress2);
                                SlotTableKt.updateGroupSize(this.groups, groupIndexToAddress2, groupSize2 + i13);
                            }
                            if (i5 != 0) {
                                int[] iArr = this.groups;
                                nodeCount2 = SlotTableKt.nodeCount(iArr, groupIndexToAddress2);
                                SlotTableKt.updateNodeCount(iArr, groupIndexToAddress2, nodeCount2 + i5);
                            }
                            isNode2 = SlotTableKt.isNode(this.groups, groupIndexToAddress2);
                            if (isNode2) {
                                i5 = 0;
                            }
                            parent = parent(this.groups, parent);
                        }
                    }
                    this.nodeCount += i5;
                }
            } else {
                ComposerKt.composeRuntimeError("Expected to be at the end of a group".toString());
                throw new y();
            }
        }
        return i11;
    }

    public final void endInsert() {
        boolean z4;
        int i5 = this.insertCount;
        boolean z5 = true;
        if (i5 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            int i6 = i5 - 1;
            this.insertCount = i6;
            if (i6 == 0) {
                if (this.nodeCountStack.getSize() != this.startStack.getSize()) {
                    z5 = false;
                }
                if (z5) {
                    restoreCurrentGroupEnd();
                    return;
                } else {
                    ComposerKt.composeRuntimeError("startGroup/endGroup mismatch while inserting".toString());
                    throw new y();
                }
            }
            return;
        }
        throw new IllegalStateException("Unbalanced begin/end insert".toString());
    }

    public final void ensureStarted(int i5) {
        if (this.insertCount <= 0) {
            int i6 = this.parent;
            if (i6 != i5) {
                if (i5 >= i6 && i5 < this.currentGroupEnd) {
                    int i7 = this.currentGroup;
                    int i8 = this.currentSlot;
                    int i9 = this.currentSlotEnd;
                    this.currentGroup = i5;
                    startGroup();
                    this.currentGroup = i7;
                    this.currentSlot = i8;
                    this.currentSlotEnd = i9;
                    return;
                }
                ComposerKt.composeRuntimeError(("Started group at " + i5 + " must be a subgroup of the group at " + i6).toString());
                throw new y();
            }
            return;
        }
        ComposerKt.composeRuntimeError("Cannot call ensureStarted() while inserting".toString());
        throw new y();
    }

    public final void forEachData(int i5, @l p<? super Integer, Object, r2> pVar) {
        int slotIndex = slotIndex(this.groups, groupIndexToAddress(i5));
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(i5 + 1));
        for (int i6 = slotIndex; i6 < dataIndex; i6++) {
            pVar.invoke(Integer.valueOf(i6 - slotIndex), this.slots[dataIndexToDataAddress(i6)]);
        }
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final int getCurrentGroupEnd() {
        return this.currentGroupEnd;
    }

    public final int getParent() {
        return this.parent;
    }

    public final int getSize$runtime_release() {
        return getCapacity() - this.groupGapLen;
    }

    @l
    public final SlotTable getTable$runtime_release() {
        return this.table;
    }

    @m
    public final Object groupAux(int i5) {
        boolean hasAux;
        int groupIndexToAddress = groupIndexToAddress(i5);
        hasAux = SlotTableKt.hasAux(this.groups, groupIndexToAddress);
        if (hasAux) {
            return this.slots[auxIndex(this.groups, groupIndexToAddress)];
        }
        return Composer.Companion.getEmpty();
    }

    public final int groupKey(int i5) {
        int key;
        key = SlotTableKt.key(this.groups, groupIndexToAddress(i5));
        return key;
    }

    @m
    public final Object groupObjectKey(int i5) {
        boolean hasObjectKey;
        int objectKeyIndex;
        int groupIndexToAddress = groupIndexToAddress(i5);
        hasObjectKey = SlotTableKt.hasObjectKey(this.groups, groupIndexToAddress);
        if (hasObjectKey) {
            Object[] objArr = this.slots;
            objectKeyIndex = SlotTableKt.objectKeyIndex(this.groups, groupIndexToAddress);
            return objArr[objectKeyIndex];
        }
        return null;
    }

    public final int groupSize(int i5) {
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress(i5));
        return groupSize;
    }

    @l
    public final Iterator<Object> groupSlots() {
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(this.currentGroup));
        int[] iArr = this.groups;
        int i5 = this.currentGroup;
        return new SlotWriter$groupSlots$1(dataIndex, dataIndex(iArr, groupIndexToAddress(i5 + groupSize(i5))), this);
    }

    @l
    public final String groupsAsString() {
        StringBuilder sb = new StringBuilder();
        int size$runtime_release = getSize$runtime_release();
        for (int i5 = 0; i5 < size$runtime_release; i5++) {
            groupAsString(sb, i5);
            sb.append('\n');
        }
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final boolean indexInCurrentGroup(int i5) {
        return indexInGroup(i5, this.currentGroup);
    }

    public final boolean indexInGroup(int i5, int i6) {
        int capacity;
        int groupSize;
        if (i6 == this.parent) {
            capacity = this.currentGroupEnd;
        } else {
            if (i6 > this.startStack.peekOr(0)) {
                groupSize = groupSize(i6);
            } else {
                int indexOf = this.startStack.indexOf(i6);
                if (indexOf < 0) {
                    groupSize = groupSize(i6);
                } else {
                    capacity = (getCapacity() - this.groupGapLen) - this.endStack.peek(indexOf);
                }
            }
            capacity = groupSize + i6;
        }
        if (i5 <= i6 || i5 >= capacity) {
            return false;
        }
        return true;
    }

    public final boolean indexInParent(int i5) {
        int i6 = this.parent;
        return (i5 > i6 && i5 < this.currentGroupEnd) || (i6 == 0 && i5 == 0);
    }

    public final void insertAux(@m Object obj) {
        boolean z4;
        boolean hasAux;
        boolean z5 = false;
        if (this.insertCount >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            int i5 = this.parent;
            int groupIndexToAddress = groupIndexToAddress(i5);
            hasAux = SlotTableKt.hasAux(this.groups, groupIndexToAddress);
            if (!hasAux) {
                insertSlots(1, i5);
                int auxIndex = auxIndex(this.groups, groupIndexToAddress);
                int dataIndexToDataAddress = dataIndexToDataAddress(auxIndex);
                int i6 = this.currentSlot;
                if (i6 > auxIndex) {
                    int i7 = i6 - auxIndex;
                    if (i7 < 3) {
                        z5 = true;
                    }
                    if (z5) {
                        if (i7 > 1) {
                            Object[] objArr = this.slots;
                            objArr[dataIndexToDataAddress + 2] = objArr[dataIndexToDataAddress + 1];
                        }
                        Object[] objArr2 = this.slots;
                        objArr2[dataIndexToDataAddress + 1] = objArr2[dataIndexToDataAddress];
                    } else {
                        throw new IllegalStateException("Moving more than two slot not supported".toString());
                    }
                }
                SlotTableKt.addAux(this.groups, groupIndexToAddress);
                this.slots[dataIndexToDataAddress] = obj;
                this.currentSlot++;
                return;
            }
            ComposerKt.composeRuntimeError("Group already has auxiliary data".toString());
            throw new y();
        }
        ComposerKt.composeRuntimeError("Cannot insert auxiliary data when not inserting".toString());
        throw new y();
    }

    public final boolean isGroupEnd() {
        return this.currentGroup == this.currentGroupEnd;
    }

    public final boolean isNode() {
        boolean isNode;
        int i5 = this.currentGroup;
        if (i5 < this.currentGroupEnd) {
            isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress(i5));
            if (isNode) {
                return true;
            }
        }
        return false;
    }

    public final void markGroup(int i5) {
        boolean hasMark;
        boolean containsMark;
        int groupIndexToAddress = groupIndexToAddress(i5);
        hasMark = SlotTableKt.hasMark(this.groups, groupIndexToAddress);
        if (!hasMark) {
            SlotTableKt.updateMark(this.groups, groupIndexToAddress, true);
            containsMark = SlotTableKt.containsMark(this.groups, groupIndexToAddress);
            if (!containsMark) {
                updateContainsMark(parent(i5));
            }
        }
    }

    @l
    public final List<Anchor> moveFrom(@l SlotTable slotTable, int i5, boolean z4) {
        boolean z5;
        int groupSize;
        if (this.insertCount > 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        ComposerKt.runtimeCheck(z5);
        if (i5 == 0 && this.currentGroup == 0 && this.table.getGroupsSize() == 0) {
            groupSize = SlotTableKt.groupSize(slotTable.getGroups(), i5);
            if (groupSize == slotTable.getGroupsSize()) {
                int[] iArr = this.groups;
                Object[] objArr = this.slots;
                ArrayList<Anchor> arrayList = this.anchors;
                HashMap<Anchor, GroupSourceInformation> hashMap = this.sourceInformationMap;
                int[] groups = slotTable.getGroups();
                int groupsSize = slotTable.getGroupsSize();
                Object[] slots = slotTable.getSlots();
                int slotsSize = slotTable.getSlotsSize();
                HashMap<Anchor, GroupSourceInformation> sourceInformationMap$runtime_release = slotTable.getSourceInformationMap$runtime_release();
                this.groups = groups;
                this.slots = slots;
                this.anchors = slotTable.getAnchors$runtime_release();
                this.groupGapStart = groupsSize;
                this.groupGapLen = (groups.length / 5) - groupsSize;
                this.slotsGapStart = slotsSize;
                this.slotsGapLen = slots.length - slotsSize;
                this.slotsGapOwner = groupsSize;
                this.sourceInformationMap = sourceInformationMap$runtime_release;
                slotTable.setTo$runtime_release(iArr, 0, objArr, 0, arrayList, hashMap);
                return this.anchors;
            }
        }
        SlotWriter openWriter = slotTable.openWriter();
        try {
            return Companion.moveGroup(openWriter, i5, this, true, true, z4);
        } finally {
            openWriter.close();
        }
    }

    public final void moveGroup(int i5) {
        boolean z4;
        boolean z5;
        int groupSize;
        int i6;
        int groupSize2;
        boolean z6;
        if (this.insertCount == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (i5 >= 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                if (i5 == 0) {
                    return;
                }
                int i7 = this.currentGroup;
                int i8 = this.parent;
                int i9 = this.currentGroupEnd;
                int i10 = i7;
                for (int i11 = i5; i11 > 0; i11--) {
                    groupSize2 = SlotTableKt.groupSize(this.groups, groupIndexToAddress(i10));
                    i10 += groupSize2;
                    if (i10 <= i9) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (!z6) {
                        ComposerKt.composeRuntimeError("Parameter offset is out of bounds".toString());
                        throw new y();
                    }
                }
                groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress(i10));
                int i12 = this.currentSlot;
                int dataIndex = dataIndex(this.groups, groupIndexToAddress(i10));
                int i13 = i10 + groupSize;
                int dataIndex2 = dataIndex(this.groups, groupIndexToAddress(i13));
                int i14 = dataIndex2 - dataIndex;
                insertSlots(i14, Math.max(this.currentGroup - 1, 0));
                insertGroups(groupSize);
                int[] iArr = this.groups;
                int groupIndexToAddress = groupIndexToAddress(i13) * 5;
                o.z0(iArr, iArr, groupIndexToAddress(i7) * 5, groupIndexToAddress, (groupSize * 5) + groupIndexToAddress);
                if (i14 > 0) {
                    Object[] objArr = this.slots;
                    o.B0(objArr, objArr, i12, dataIndexToDataAddress(dataIndex + i14), dataIndexToDataAddress(dataIndex2 + i14));
                }
                int i15 = dataIndex + i14;
                int i16 = i15 - i12;
                int i17 = this.slotsGapStart;
                int i18 = this.slotsGapLen;
                int length = this.slots.length;
                int i19 = this.slotsGapOwner;
                int i20 = i7 + groupSize;
                int i21 = i7;
                while (i21 < i20) {
                    int groupIndexToAddress2 = groupIndexToAddress(i21);
                    int i22 = i17;
                    int dataIndex3 = dataIndex(iArr, groupIndexToAddress2) - i16;
                    int i23 = i16;
                    if (i19 < groupIndexToAddress2) {
                        i6 = 0;
                    } else {
                        i6 = i22;
                    }
                    updateDataIndex(iArr, groupIndexToAddress2, dataIndexToDataAnchor(dataIndex3, i6, i18, length));
                    i21++;
                    i17 = i22;
                    i16 = i23;
                }
                moveAnchors(i13, i7, groupSize);
                if (!removeGroups(i13, groupSize)) {
                    fixParentAnchorsFor(i8, this.currentGroupEnd, i7);
                    if (i14 > 0) {
                        removeSlots(i15, i14, i13 - 1);
                        return;
                    }
                    return;
                }
                ComposerKt.composeRuntimeError("Unexpectedly removed anchors".toString());
                throw new y();
            }
            ComposerKt.composeRuntimeError("Parameter offset is out of bounds".toString());
            throw new y();
        }
        ComposerKt.composeRuntimeError("Cannot move a group while inserting".toString());
        throw new y();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (groupSize(r12.currentGroup + r13) == 1) goto L25;
     */
    @p4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<androidx.compose.runtime.Anchor> moveIntoGroupFrom(int r13, @p4.l androidx.compose.runtime.SlotTable r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.insertCount
            if (r0 > 0) goto Lf
            int r0 = r12.currentGroup
            int r0 = r0 + r13
            int r0 = r12.groupSize(r0)
            r1 = 1
            if (r0 != r1) goto Lf
            goto L10
        Lf:
            r1 = 0
        L10:
            androidx.compose.runtime.ComposerKt.runtimeCheck(r1)
            int r0 = r12.currentGroup
            int r1 = r12.currentSlot
            int r2 = r12.currentSlotEnd
            r12.advanceBy(r13)
            r12.startGroup()
            r12.beginInsert()
            androidx.compose.runtime.SlotWriter r13 = r14.openWriter()
            androidx.compose.runtime.SlotWriter$Companion r3 = androidx.compose.runtime.SlotWriter.Companion     // Catch: java.lang.Throwable -> L45
            r7 = 0
            r8 = 1
            r9 = 0
            r10 = 32
            r11 = 0
            r4 = r13
            r5 = r15
            r6 = r12
            java.util.List r14 = androidx.compose.runtime.SlotWriter.Companion.moveGroup$default(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L45
            r13.close()
            r12.endInsert()
            r12.endGroup()
            r12.currentGroup = r0
            r12.currentSlot = r1
            r12.currentSlotEnd = r2
            return r14
        L45:
            r14 = move-exception
            r13.close()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SlotWriter.moveIntoGroupFrom(int, androidx.compose.runtime.SlotTable, int):java.util.List");
    }

    @l
    public final List<Anchor> moveTo(@l Anchor anchor, int i5, @l SlotWriter slotWriter) {
        boolean z4;
        boolean z5;
        boolean z6;
        int nodeCount;
        boolean z7;
        int groupSize;
        boolean isNode;
        int nodeCount2;
        boolean z8 = true;
        if (slotWriter.insertCount > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        ComposerKt.runtimeCheck(z4);
        if (this.insertCount == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        ComposerKt.runtimeCheck(z5);
        ComposerKt.runtimeCheck(anchor.getValid());
        int anchorIndex = anchorIndex(anchor) + i5;
        int i6 = this.currentGroup;
        if (i6 <= anchorIndex && anchorIndex < this.currentGroupEnd) {
            z6 = true;
        } else {
            z6 = false;
        }
        ComposerKt.runtimeCheck(z6);
        int parent = parent(anchorIndex);
        int groupSize2 = groupSize(anchorIndex);
        if (isNode(anchorIndex)) {
            nodeCount = 1;
        } else {
            nodeCount = nodeCount(anchorIndex);
        }
        List<Anchor> moveGroup$default = Companion.moveGroup$default(Companion, this, anchorIndex, slotWriter, false, false, false, 32, null);
        updateContainsMark(parent);
        if (nodeCount > 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        while (parent >= i6) {
            int groupIndexToAddress = groupIndexToAddress(parent);
            int[] iArr = this.groups;
            groupSize = SlotTableKt.groupSize(iArr, groupIndexToAddress);
            SlotTableKt.updateGroupSize(iArr, groupIndexToAddress, groupSize - groupSize2);
            if (z7) {
                isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress);
                if (isNode) {
                    z7 = false;
                } else {
                    int[] iArr2 = this.groups;
                    nodeCount2 = SlotTableKt.nodeCount(iArr2, groupIndexToAddress);
                    SlotTableKt.updateNodeCount(iArr2, groupIndexToAddress, nodeCount2 - nodeCount);
                }
            }
            parent = parent(parent);
        }
        if (z7) {
            if (this.nodeCount < nodeCount) {
                z8 = false;
            }
            ComposerKt.runtimeCheck(z8);
            this.nodeCount -= nodeCount;
        }
        return moveGroup$default;
    }

    @m
    public final Object node(int i5) {
        boolean isNode;
        int groupIndexToAddress = groupIndexToAddress(i5);
        isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress);
        if (isNode) {
            return this.slots[dataIndexToDataAddress(nodeIndex(this.groups, groupIndexToAddress))];
        }
        return null;
    }

    public final int nodeCount(int i5) {
        int nodeCount;
        nodeCount = SlotTableKt.nodeCount(this.groups, groupIndexToAddress(i5));
        return nodeCount;
    }

    public final int parent(int i5) {
        return parent(this.groups, i5);
    }

    public final void recordGroupSourceInformation(@l String str) {
        if (this.insertCount > 0) {
            groupSourceInformationFor(this.parent, str);
        }
    }

    public final void recordGrouplessCallSourceInformationEnd() {
        if (this.insertCount > 0) {
            groupSourceInformationFor(this.parent, null).endGrouplessCall();
        }
    }

    public final void recordGrouplessCallSourceInformationStart(int i5, @l String str) {
        if (this.insertCount > 0) {
            groupSourceInformationFor(this.parent, null).startGrouplessCall(i5, str);
        }
    }

    public final boolean removeGroup() {
        boolean z4;
        Anchor tryAnchor$runtime_release;
        if (this.insertCount == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            int i5 = this.currentGroup;
            int i6 = this.currentSlot;
            int skipGroup = skipGroup();
            GroupSourceInformation sourceInformationOf = sourceInformationOf(this.parent);
            if (sourceInformationOf != null && (tryAnchor$runtime_release = tryAnchor$runtime_release(i5)) != null) {
                sourceInformationOf.removeAnchor(tryAnchor$runtime_release);
            }
            PrioritySet prioritySet = this.pendingRecalculateMarks;
            if (prioritySet != null) {
                while (prioritySet.isNotEmpty() && prioritySet.peek() >= i5) {
                    prioritySet.takeMax();
                }
            }
            boolean removeGroups = removeGroups(i5, this.currentGroup - i5);
            removeSlots(i6, this.currentSlot - i6, i5 - 1);
            this.currentGroup = i5;
            this.currentSlot = i6;
            this.nodeCount -= skipGroup;
            return removeGroups;
        }
        ComposerKt.composeRuntimeError("Cannot remove group while inserting".toString());
        throw new y();
    }

    public final void reset() {
        boolean z4;
        if (this.insertCount == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            recalculateMarks();
            this.currentGroup = 0;
            this.currentGroupEnd = getCapacity() - this.groupGapLen;
            this.currentSlot = 0;
            this.currentSlotEnd = 0;
            this.nodeCount = 0;
            return;
        }
        ComposerKt.composeRuntimeError("Cannot reset when inserting".toString());
        throw new y();
    }

    public final void seek(@l Anchor anchor) {
        advanceBy(anchor.toIndexFor(this) - this.currentGroup);
    }

    public final void set(@m Object obj) {
        int i5 = this.currentSlot;
        if (i5 <= this.currentSlotEnd) {
            this.slots[dataIndexToDataAddress(i5 - 1)] = obj;
        } else {
            ComposerKt.composeRuntimeError("Writing to an invalid slot".toString());
            throw new y();
        }
    }

    @m
    public final Object skip() {
        if (this.insertCount > 0) {
            insertSlots(1, this.parent);
        }
        Object[] objArr = this.slots;
        int i5 = this.currentSlot;
        this.currentSlot = i5 + 1;
        return objArr[dataIndexToDataAddress(i5)];
    }

    public final int skipGroup() {
        int groupSize;
        boolean isNode;
        int nodeCount;
        int groupIndexToAddress = groupIndexToAddress(this.currentGroup);
        int i5 = this.currentGroup;
        groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress);
        int i6 = i5 + groupSize;
        this.currentGroup = i6;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(i6));
        isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress);
        if (isNode) {
            return 1;
        }
        nodeCount = SlotTableKt.nodeCount(this.groups, groupIndexToAddress);
        return nodeCount;
    }

    public final void skipToGroupEnd() {
        int i5 = this.currentGroupEnd;
        this.currentGroup = i5;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(i5));
    }

    @m
    public final Object slot(@l Anchor anchor, int i5) {
        return slot(anchorIndex(anchor), i5);
    }

    public final void startData(int i5, @m Object obj, @m Object obj2) {
        startGroup(i5, obj, false, obj2);
    }

    public final void startGroup() {
        if (this.insertCount == 0) {
            Composer.Companion companion = Composer.Companion;
            startGroup(0, companion.getEmpty(), false, companion.getEmpty());
        } else {
            ComposerKt.composeRuntimeError("Key must be supplied when inserting".toString());
            throw new y();
        }
    }

    public final void startNode(int i5, @m Object obj) {
        startGroup(i5, obj, true, Composer.Companion.getEmpty());
    }

    @l
    public String toString() {
        return "SlotWriter(current = " + this.currentGroup + " end=" + this.currentGroupEnd + " size = " + getSize$runtime_release() + " gap=" + this.groupGapStart + '-' + (this.groupGapStart + this.groupGapLen) + ')';
    }

    @m
    public final Anchor tryAnchor$runtime_release(int i5) {
        Anchor find;
        boolean z4 = false;
        if (i5 >= 0 && i5 < getSize$runtime_release()) {
            z4 = true;
        }
        if (!z4) {
            return null;
        }
        find = SlotTableKt.find(this.anchors, i5, getSize$runtime_release());
        return find;
    }

    @m
    public final Object update(@m Object obj) {
        Object skip = skip();
        set(obj);
        return skip;
    }

    public final void updateAux(@m Object obj) {
        boolean hasAux;
        int groupIndexToAddress = groupIndexToAddress(this.currentGroup);
        hasAux = SlotTableKt.hasAux(this.groups, groupIndexToAddress);
        if (hasAux) {
            this.slots[dataIndexToDataAddress(auxIndex(this.groups, groupIndexToAddress))] = obj;
        } else {
            ComposerKt.composeRuntimeError("Updating the data of a group that was not created with a data slot".toString());
            throw new y();
        }
    }

    public final void updateNode(@m Object obj) {
        updateNodeOfGroup(this.currentGroup, obj);
    }

    public final void updateParentNode(@m Object obj) {
        updateNodeOfGroup(this.parent, obj);
    }

    public final void verifyDataAnchors$runtime_release() {
        int dataAnchor;
        boolean z4;
        boolean z5;
        boolean z6;
        int i5 = this.slotsGapOwner;
        int length = this.slots.length - this.slotsGapLen;
        int size$runtime_release = getSize$runtime_release();
        int i6 = 0;
        int i7 = 0;
        boolean z7 = false;
        while (i6 < size$runtime_release) {
            int groupIndexToAddress = groupIndexToAddress(i6);
            dataAnchor = SlotTableKt.dataAnchor(this.groups, groupIndexToAddress);
            int dataIndex = dataIndex(this.groups, groupIndexToAddress);
            if (dataIndex >= i7) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                if (dataIndex <= length) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    if (dataAnchor < 0 && !z7) {
                        if (i5 == i6) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (z6) {
                            z7 = true;
                        } else {
                            throw new IllegalStateException(("Expected the slot gap owner to be " + i5 + " found gap at " + i6).toString());
                        }
                    }
                    i6++;
                    i7 = dataIndex;
                } else {
                    throw new IllegalStateException(("Data index, " + dataIndex + ", out of bound at " + i6).toString());
                }
            } else {
                throw new IllegalStateException(("Data index out of order at " + i6 + ", previous = " + i7 + ", current = " + dataIndex).toString());
            }
        }
    }

    public final void verifyParentAnchors$runtime_release() {
        int parentAnchor;
        boolean z4;
        boolean z5;
        int parentAnchor2;
        int i5 = this.groupGapStart;
        int i6 = this.groupGapLen;
        int capacity = getCapacity();
        int i7 = 0;
        while (true) {
            boolean z6 = true;
            if (i7 < i5) {
                parentAnchor2 = SlotTableKt.parentAnchor(this.groups, i7);
                if (parentAnchor2 <= -2) {
                    z6 = false;
                }
                if (z6) {
                    i7++;
                } else {
                    throw new IllegalStateException(("Expected a start relative anchor at " + i7).toString());
                }
            } else {
                for (int i8 = i6 + i5; i8 < capacity; i8++) {
                    parentAnchor = SlotTableKt.parentAnchor(this.groups, i8);
                    if (parentAnchorToIndex(parentAnchor) < i5) {
                        if (parentAnchor > -2) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (!z5) {
                            throw new IllegalStateException(("Expected a start relative anchor at " + i8).toString());
                        }
                    } else {
                        if (parentAnchor <= -2) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (!z4) {
                            throw new IllegalStateException(("Expected an end relative anchor at " + i8).toString());
                        }
                    }
                }
                return;
            }
        }
    }

    public static final /* synthetic */ int access$dataIndex(SlotWriter slotWriter, int[] iArr, int i5) {
        return slotWriter.dataIndex(iArr, i5);
    }

    public final int dataIndex(int[] iArr, int i5) {
        int dataAnchor;
        if (i5 >= getCapacity()) {
            return this.slots.length - this.slotsGapLen;
        }
        dataAnchor = SlotTableKt.dataAnchor(iArr, i5);
        return dataAnchorToDataIndex(dataAnchor, this.slotsGapLen, this.slots.length);
    }

    public final boolean isNode(int i5) {
        boolean isNode;
        isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress(i5));
        return isNode;
    }

    public final int parent(@l Anchor anchor) {
        if (anchor.getValid()) {
            return parent(this.groups, anchorIndex(anchor));
        }
        return -1;
    }

    @m
    public final Object slot(int i5, int i6) {
        int slotIndex = slotIndex(this.groups, groupIndexToAddress(i5));
        int i7 = i6 + slotIndex;
        if (!(slotIndex <= i7 && i7 < dataIndex(this.groups, groupIndexToAddress(i5 + 1)))) {
            return Composer.Companion.getEmpty();
        }
        return this.slots[dataIndexToDataAddress(i7)];
    }

    public final void startData(int i5, @m Object obj) {
        startGroup(i5, Composer.Companion.getEmpty(), false, obj);
    }

    public final void startNode(int i5, @m Object obj, @m Object obj2) {
        startGroup(i5, obj, true, obj2);
    }

    public final void updateNode(@l Anchor anchor, @m Object obj) {
        updateNodeOfGroup(anchor.toIndexFor(this), obj);
    }

    private final int parent(int[] iArr, int i5) {
        int parentAnchor;
        parentAnchor = SlotTableKt.parentAnchor(iArr, groupIndexToAddress(i5));
        return parentAnchorToIndex(parentAnchor);
    }

    @m
    public final Object node(@l Anchor anchor) {
        return node(anchor.toIndexFor(this));
    }

    @m
    public final Object set(int i5, @m Object obj) {
        return set(this.currentGroup, i5, obj);
    }

    public final void startGroup(int i5) {
        Composer.Companion companion = Composer.Companion;
        startGroup(i5, companion.getEmpty(), false, companion.getEmpty());
    }

    @m
    public final Object set(int i5, int i6, @m Object obj) {
        int slotIndex = slotIndex(this.groups, groupIndexToAddress(i5));
        int i7 = slotIndex + i6;
        if (i7 >= slotIndex && i7 < dataIndex(this.groups, groupIndexToAddress(i5 + 1))) {
            int dataIndexToDataAddress = dataIndexToDataAddress(i7);
            Object[] objArr = this.slots;
            Object obj2 = objArr[dataIndexToDataAddress];
            objArr[dataIndexToDataAddress] = obj;
            return obj2;
        }
        ComposerKt.composeRuntimeError(("Write to an invalid slot index " + i6 + " for group " + i5).toString());
        throw new y();
    }

    public final void startGroup(int i5, @m Object obj) {
        startGroup(i5, obj, false, Composer.Companion.getEmpty());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void startGroup(int i5, Object obj, boolean z4, Object obj2) {
        int nodeCount;
        int groupSize;
        int i6;
        GroupSourceInformation sourceInformationOf;
        int i7 = this.parent;
        Object[] objArr = this.insertCount > 0;
        this.nodeCountStack.push(this.nodeCount);
        if (objArr != false) {
            insertGroups(1);
            int i8 = this.currentGroup;
            int groupIndexToAddress = groupIndexToAddress(i8);
            Composer.Companion companion = Composer.Companion;
            int i9 = obj != companion.getEmpty() ? 1 : 0;
            int i10 = (z4 || obj2 == companion.getEmpty()) ? 0 : 1;
            SlotTableKt.initGroup(this.groups, groupIndexToAddress, i5, z4, i9, i10, this.parent, this.currentSlot);
            this.currentSlotEnd = this.currentSlot;
            int i11 = (z4 ? 1 : 0) + i9 + i10;
            if (i11 > 0) {
                insertSlots(i11, i8);
                Object[] objArr2 = this.slots;
                int i12 = this.currentSlot;
                if (z4) {
                    objArr2[i12] = obj2;
                    i12++;
                }
                if (i9 != 0) {
                    objArr2[i12] = obj;
                    i12++;
                }
                if (i10 != 0) {
                    objArr2[i12] = obj2;
                    i12++;
                }
                this.currentSlot = i12;
            }
            this.nodeCount = 0;
            i6 = i8 + 1;
            this.parent = i8;
            this.currentGroup = i6;
            if (i7 >= 0 && (sourceInformationOf = sourceInformationOf(i7)) != null) {
                sourceInformationOf.reportGroup(this, i8);
            }
        } else {
            this.startStack.push(i7);
            saveCurrentGroupEnd();
            int i13 = this.currentGroup;
            int groupIndexToAddress2 = groupIndexToAddress(i13);
            if (!l0.g(obj2, Composer.Companion.getEmpty())) {
                if (z4) {
                    updateNode(obj2);
                } else {
                    updateAux(obj2);
                }
            }
            this.currentSlot = slotIndex(this.groups, groupIndexToAddress2);
            this.currentSlotEnd = dataIndex(this.groups, groupIndexToAddress(this.currentGroup + 1));
            nodeCount = SlotTableKt.nodeCount(this.groups, groupIndexToAddress2);
            this.nodeCount = nodeCount;
            this.parent = i13;
            this.currentGroup = i13 + 1;
            groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress2);
            i6 = i13 + groupSize;
        }
        this.currentGroupEnd = i6;
    }

    public final void ensureStarted(@l Anchor anchor) {
        ensureStarted(anchor.toIndexFor(this));
    }
}
