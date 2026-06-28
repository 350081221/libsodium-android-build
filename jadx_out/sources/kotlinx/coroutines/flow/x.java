package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.bi;
import kotlin.b1;
import kotlin.e1;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.d1;

@kotlin.i0(d1 = {"\u0000\u0082\u0001\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0000\u001a&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u001a&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u001a&\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u001a,\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001a,\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001a\u0018\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001aF\u0010\u0012\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001aj\u0010\u0016\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000e2\"\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001aX\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00032(\u0010\u0019\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a>\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u001cH\u0007\u001a$\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0003H\u0007\u001a$\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0003H\u0007\u001aI\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00032#\u0010!\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u001c¢\u0006\u0002\b H\u0007\u001a&\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010$\u001a\u00020#H\u0007\u001aU\u0010*\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u000321\u0010)\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010\u0013\u001a\u0080\u0001\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010+\u001a\u00028\u00012H\b\u0001\u0010.\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(-\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100,H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a-\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\t\u001a\u00028\u0000H\u0007¢\u0006\u0004\b1\u00102\u001aC\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\t\u001a\u00028\u00002\u0014\b\u0002\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u0002030\u001cH\u0007¢\u0006\u0004\b5\u00106\u001a-\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010(\u001a\u00028\u0000H\u0007¢\u0006\u0004\b7\u00102\u001a,\u00109\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001a-\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010(\u001a\u00028\u0000H\u0007¢\u0006\u0004\b:\u00102\u001a,\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001al\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010<\"\u0004\b\u0001\u0010=\"\u0004\b\u0002\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032(\u0010>\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100,H\u0007ø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001a\u0086\u0001\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00030\u0003\"\u0004\b\u0000\u0010<\"\u0004\b\u0001\u0010=\"\u0004\b\u0002\u0010A\"\u0004\b\u0003\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032.\u0010>\u001a*\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100CH\u0007ø\u0001\u0000¢\u0006\u0004\bD\u0010E\u001a \u0001\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00040\u0003\"\u0004\b\u0000\u0010<\"\u0004\b\u0001\u0010=\"\u0004\b\u0002\u0010A\"\u0004\b\u0003\u0010F\"\u0004\b\u0004\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00030\u000324\u0010>\u001a0\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100HH\u0007ø\u0001\u0000¢\u0006\u0004\bI\u0010J\u001aº\u0001\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00050\u0003\"\u0004\b\u0000\u0010<\"\u0004\b\u0001\u0010=\"\u0004\b\u0002\u0010A\"\u0004\b\u0003\u0010F\"\u0004\b\u0004\u0010K\"\u0004\b\u0005\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00030\u00032\f\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00040\u00032:\u0010>\u001a6\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00050\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100MH\u0007ø\u0001\u0000¢\u0006\u0004\bN\u0010O\u001a&\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010Q\u001a\u00020PH\u0007\u001a&\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010Q\u001a\u00020PH\u0007\u001ag\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u000327\u0010>\u001a3\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\bT\u0010\u001b\u001ap\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032F\u0010.\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(-\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100,H\u0007ø\u0001\u0000¢\u0006\u0004\bU\u0010V\u001a\u001e\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001a&\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010X\u001a\u00020#H\u0007\u001a\u001e\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001a&\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010X\u001a\u00020#H\u0007\u001a\u001e\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006]"}, d2 = {"", bi.aA, "T", "Lkotlinx/coroutines/flow/i;", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "q", "y", "J", "fallback", "r", bi.aE, "Lkotlin/r2;", "G", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "onEach", "H", "(Lkotlinx/coroutines/flow/i;Lv3/p;)V", "", "onError", "I", "(Lkotlinx/coroutines/flow/i;Lv3/p;Lv3/p;)V", "R", "mapper", "l", "(Lkotlinx/coroutines/flow/i;Lv3/p;)Lkotlinx/coroutines/flow/i;", "Lkotlin/Function1;", socket.g.f22386a, "o", "m", "Lkotlin/u;", "transformer", "f", "", "count", "D", "Lkotlin/v0;", "name", t0.b.f22420d, "action", "n", "initial", "Lkotlin/Function3;", "accumulator", "operation", "B", "(Lkotlinx/coroutines/flow/i;Ljava/lang/Object;Lv3/q;)Lkotlinx/coroutines/flow/i;", bi.aL, "(Lkotlinx/coroutines/flow/i;Ljava/lang/Object;)Lkotlinx/coroutines/flow/i;", "", "predicate", bi.aK, "(Lkotlinx/coroutines/flow/i;Ljava/lang/Object;Lv3/l;)Lkotlinx/coroutines/flow/i;", "E", "other", "F", bi.aJ, "i", "T1", "T2", "transform", "e", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lv3/q;)Lkotlinx/coroutines/flow/i;", "T3", "other2", "Lkotlin/Function4;", "d", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lv3/r;)Lkotlinx/coroutines/flow/i;", "T4", "other3", "Lkotlin/Function5;", "c", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lv3/s;)Lkotlinx/coroutines/flow/i;", "T5", "other4", "Lkotlin/Function6;", "b", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lv3/t;)Lkotlinx/coroutines/flow/i;", "", "timeMillis", "k", "j", "K", "C", "(Lkotlinx/coroutines/flow/i;Lv3/q;)Lkotlinx/coroutines/flow/i;", "w", "bufferSize", "x", bi.aG, "A", bi.ay, "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
@r1({"SMAP\nMigration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Migration.kt\nkotlinx/coroutines/flow/FlowKt__MigrationKt\n+ 2 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,496:1\n193#2:497\n*S KotlinDebug\n*F\n+ 1 Migration.kt\nkotlinx/coroutines/flow/FlowKt__MigrationKt\n*L\n435#1:497\n*E\n"})
/* loaded from: classes4.dex */
public final /* synthetic */ class x {

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayEach$1", f = "Migration.kt", i = {}, l = {427}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "it", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class a<T> extends kotlin.coroutines.jvm.internal.o implements v3.p<T, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ long $timeMillis;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j5, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.$timeMillis = j5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new a(this.$timeMillis, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v3.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, kotlin.coroutines.d<? super r2> dVar) {
            return invoke2((a<T>) obj, dVar);
        }

        @p4.m
        /* renamed from: invoke */
        public final Object invoke2(T t5, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((a) create(t5, dVar)).invokeSuspend(r2.f19517a);
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
                long j5 = this.$timeMillis;
                this.label = 1;
                if (d1.b(j5, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayFlow$1", f = "Migration.kt", i = {}, l = {415}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/flow/j;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class b<T> extends kotlin.coroutines.jvm.internal.o implements v3.p<j<? super T>, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ long $timeMillis;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j5, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.$timeMillis = j5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new b(this.$timeMillis, dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l j<? super T> jVar, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(r2.f19517a);
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
                long j5 = this.$timeMillis;
                this.label = 1;
                if (d1.b(j5, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "it", "", "invoke", "(Ljava/lang/Throwable;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.jvm.internal.n0 implements v3.l<Throwable, Boolean> {
        public static final c INSTANCE = new c();

        c() {
            super(1);
        }

        @Override // v3.l
        @p4.l
        public final Boolean invoke(@p4.l Throwable th) {
            return Boolean.TRUE;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2", f = "Migration.kt", i = {}, l = {306}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/flow/j;", "", "e", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class d<T> extends kotlin.coroutines.jvm.internal.o implements v3.q<j<? super T>, Throwable, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ T $fallback;
        final /* synthetic */ v3.l<Throwable, Boolean> $predicate;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(v3.l<? super Throwable, Boolean> lVar, T t5, kotlin.coroutines.d<? super d> dVar) {
            super(3, dVar);
            this.$predicate = lVar;
            this.$fallback = t5;
        }

        @Override // v3.q
        @p4.m
        public final Object invoke(@p4.l j<? super T> jVar, @p4.l Throwable th, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            d dVar2 = new d(this.$predicate, this.$fallback, dVar);
            dVar2.L$0 = jVar;
            dVar2.L$1 = th;
            return dVar2.invokeSuspend(r2.f19517a);
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
                j jVar = (j) this.L$0;
                Throwable th = (Throwable) this.L$1;
                if (this.$predicate.invoke(th).booleanValue()) {
                    T t5 = this.$fallback;
                    this.L$0 = null;
                    this.label = 1;
                    if (jVar.emit(t5, this) == l5) {
                        return l5;
                    }
                } else {
                    throw th;
                }
            }
            return r2.f19517a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1", f = "Migration.kt", i = {}, l = {193, 193}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/r2;", "kotlinx/coroutines/flow/w$b", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n*L\n1#1,218:1\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class e<R, T> extends kotlin.coroutines.jvm.internal.o implements v3.q<j<? super R>, T, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ v3.p $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(v3.p pVar, kotlin.coroutines.d dVar) {
            super(3, dVar);
            this.$transform = pVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v3.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, kotlin.coroutines.d<? super r2> dVar) {
            return invoke((j) obj, (j<? super R>) obj2, dVar);
        }

        @p4.m
        public final Object invoke(@p4.l j<? super R> jVar, T t5, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            e eVar = new e(this.$transform, dVar);
            eVar.L$0 = jVar;
            eVar.L$1 = t5;
            return eVar.invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            j jVar;
            l5 = kotlin.coroutines.intrinsics.d.l();
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        e1.n(obj);
                        return r2.f19517a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jVar = (j) this.L$0;
                e1.n(obj);
            } else {
                e1.n(obj);
                jVar = (j) this.L$0;
                Object obj2 = this.L$1;
                v3.p pVar = this.$transform;
                this.L$0 = jVar;
                this.label = 1;
                obj = pVar.invoke(obj2, this);
                if (obj == l5) {
                    return l5;
                }
            }
            this.L$0 = null;
            this.label = 2;
            if (k.m0(jVar, (i) obj, this) == l5) {
                return l5;
            }
            return r2.f19517a;
        }
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'replay(bufferSize)' is 'shareIn' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @b1(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    public static final <T> i<T> A(@p4.l i<? extends T> iVar, int i5) {
        k.c1();
        throw new kotlin.y();
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow has less verbose 'scan' shortcut", replaceWith = @b1(expression = "scan(initial, operation)", imports = {}))
    public static final <T, R> i<R> B(@p4.l i<? extends T> iVar, R r5, @kotlin.b @p4.l v3.q<? super R, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar) {
        k.c1();
        throw new kotlin.y();
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "'scanReduce' was renamed to 'runningReduce' to be consistent with Kotlin standard library", replaceWith = @b1(expression = "runningReduce(operation)", imports = {}))
    public static final <T> i<T> C(@p4.l i<? extends T> iVar, @p4.l v3.q<? super T, ? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> qVar) {
        return k.A1(iVar, qVar);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'skip' is 'drop'", replaceWith = @b1(expression = "drop(count)", imports = {}))
    public static final <T> i<T> D(@p4.l i<? extends T> iVar, int i5) {
        k.c1();
        throw new kotlin.y();
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emit(value) }'", replaceWith = @b1(expression = "onStart { emit(value) }", imports = {}))
    public static final <T> i<T> E(@p4.l i<? extends T> iVar, T t5) {
        k.c1();
        throw new kotlin.y();
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emitAll(other) }'", replaceWith = @b1(expression = "onStart { emitAll(other) }", imports = {}))
    public static final <T> i<T> F(@p4.l i<? extends T> iVar, @p4.l i<? extends T> iVar2) {
        k.c1();
        throw new kotlin.y();
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void G(@p4.l i<? extends T> iVar) {
        k.c1();
        throw new kotlin.y();
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void H(@p4.l i<? extends T> iVar, @p4.l v3.p<? super T, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar) {
        k.c1();
        throw new kotlin.y();
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void I(@p4.l i<? extends T> iVar, @p4.l v3.p<? super T, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar, @p4.l v3.p<? super Throwable, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar2) {
        k.c1();
        throw new kotlin.y();
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Use 'flowOn' instead")
    public static final <T> i<T> J(@p4.l i<? extends T> iVar, @p4.l kotlin.coroutines.g gVar) {
        k.c1();
        throw new kotlin.y();
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogues of 'switchMap' are 'transformLatest', 'flatMapLatest' and 'mapLatest'", replaceWith = @b1(expression = "this.flatMapLatest(transform)", imports = {}))
    public static final <T, R> i<R> K(@p4.l i<? extends T> iVar, @p4.l v3.p<? super T, ? super kotlin.coroutines.d<? super i<? extends R>>, ? extends Object> pVar) {
        return k.d2(iVar, new e(pVar, null));
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'cache()' is 'shareIn' with unlimited replay and 'started = SharingStared.Lazily' argument'", replaceWith = @b1(expression = "this.shareIn(scope, Int.MAX_VALUE, started = SharingStared.Lazily)", imports = {}))
    public static final <T> i<T> a(@p4.l i<? extends T> iVar) {
        k.c1();
        throw new kotlin.y();
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @b1(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    public static final <T1, T2, T3, T4, T5, R> i<R> b(@p4.l i<? extends T1> iVar, @p4.l i<? extends T2> iVar2, @p4.l i<? extends T3> iVar3, @p4.l i<? extends T4> iVar4, @p4.l i<? extends T5> iVar5, @p4.l v3.t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.d<? super R>, ? extends Object> tVar) {
        return k.D(iVar, iVar2, iVar3, iVar4, iVar5, tVar);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @b1(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    public static final <T1, T2, T3, T4, R> i<R> c(@p4.l i<? extends T1> iVar, @p4.l i<? extends T2> iVar2, @p4.l i<? extends T3> iVar3, @p4.l i<? extends T4> iVar4, @p4.l v3.s<? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.d<? super R>, ? extends Object> sVar) {
        return k.E(iVar, iVar2, iVar3, iVar4, sVar);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @b1(expression = "combine(this, other, other2, transform)", imports = {}))
    public static final <T1, T2, T3, R> i<R> d(@p4.l i<? extends T1> iVar, @p4.l i<? extends T2> iVar2, @p4.l i<? extends T3> iVar3, @p4.l v3.r<? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.d<? super R>, ? extends Object> rVar) {
        return k.F(iVar, iVar2, iVar3, rVar);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @b1(expression = "this.combine(other, transform)", imports = {}))
    public static final <T1, T2, R> i<R> e(@p4.l i<? extends T1> iVar, @p4.l i<? extends T2> iVar2, @p4.l v3.q<? super T1, ? super T2, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar) {
        return k.G(iVar, iVar2, qVar);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'compose' is 'let'", replaceWith = @b1(expression = "let(transformer)", imports = {}))
    public static final <T, R> i<R> f(@p4.l i<? extends T> iVar, @p4.l v3.l<? super i<? extends T>, ? extends i<? extends R>> lVar) {
        k.c1();
        throw new kotlin.y();
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'concatMap' is 'flatMapConcat'", replaceWith = @b1(expression = "flatMapConcat(mapper)", imports = {}))
    public static final <T, R> i<R> g(@p4.l i<? extends T> iVar, @p4.l v3.l<? super T, ? extends i<? extends R>> lVar) {
        k.c1();
        throw new kotlin.y();
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { emit(value) }'", replaceWith = @b1(expression = "onCompletion { emit(value) }", imports = {}))
    public static final <T> i<T> h(@p4.l i<? extends T> iVar, T t5) {
        k.c1();
        throw new kotlin.y();
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { if (it == null) emitAll(other) }'", replaceWith = @b1(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    public static final <T> i<T> i(@p4.l i<? extends T> iVar, @p4.l i<? extends T> iVar2) {
        k.c1();
        throw new kotlin.y();
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Use 'onEach { delay(timeMillis) }'", replaceWith = @b1(expression = "onEach { delay(timeMillis) }", imports = {}))
    public static final <T> i<T> j(@p4.l i<? extends T> iVar, long j5) {
        return k.f1(iVar, new a(j5, null));
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Use 'onStart { delay(timeMillis) }'", replaceWith = @b1(expression = "onStart { delay(timeMillis) }", imports = {}))
    public static final <T> i<T> k(@p4.l i<? extends T> iVar, long j5) {
        return k.m1(iVar, new b(j5, null));
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue is 'flatMapConcat'", replaceWith = @b1(expression = "flatMapConcat(mapper)", imports = {}))
    public static final <T, R> i<R> l(@p4.l i<? extends T> iVar, @p4.l v3.p<? super T, ? super kotlin.coroutines.d<? super i<? extends R>>, ? extends Object> pVar) {
        k.c1();
        throw new kotlin.y();
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'flatten' is 'flattenConcat'", replaceWith = @b1(expression = "flattenConcat()", imports = {}))
    public static final <T> i<T> m(@p4.l i<? extends i<? extends T>> iVar) {
        k.c1();
        throw new kotlin.y();
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'forEach' is 'collect'", replaceWith = @b1(expression = "collect(action)", imports = {}))
    public static final <T> void n(@p4.l i<? extends T> iVar, @p4.l v3.p<? super T, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar) {
        k.c1();
        throw new kotlin.y();
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'merge' is 'flattenConcat'", replaceWith = @b1(expression = "flattenConcat()", imports = {}))
    public static final <T> i<T> o(@p4.l i<? extends i<? extends T>> iVar) {
        k.c1();
        throw new kotlin.y();
    }

    @p4.l
    public static final Void p() {
        throw new UnsupportedOperationException("Not implemented, should not be called");
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Collect flow in the desired context instead")
    public static final <T> i<T> q(@p4.l i<? extends T> iVar, @p4.l kotlin.coroutines.g gVar) {
        k.c1();
        throw new kotlin.y();
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @b1(expression = "catch { emitAll(fallback) }", imports = {}))
    public static final <T> i<T> r(@p4.l i<? extends T> iVar, @p4.l i<? extends T> iVar2) {
        k.c1();
        throw new kotlin.y();
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @b1(expression = "catch { emitAll(fallback) }", imports = {}))
    public static final <T> i<T> s(@p4.l i<? extends T> iVar, @p4.l i<? extends T> iVar2) {
        k.c1();
        throw new kotlin.y();
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emit(fallback) }'", replaceWith = @b1(expression = "catch { emit(fallback) }", imports = {}))
    public static final <T> i<T> t(@p4.l i<? extends T> iVar, T t5) {
        k.c1();
        throw new kotlin.y();
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { e -> if (predicate(e)) emit(fallback) else throw e }'", replaceWith = @b1(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    public static final <T> i<T> u(@p4.l i<? extends T> iVar, T t5, @p4.l v3.l<? super Throwable, Boolean> lVar) {
        return k.u(iVar, new d(lVar, t5, null));
    }

    public static /* synthetic */ i v(i iVar, Object obj, v3.l lVar, int i5, Object obj2) {
        if ((i5 & 2) != 0) {
            lVar = c.INSTANCE;
        }
        return k.k1(iVar, obj, lVar);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'publish()' is 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @b1(expression = "this.shareIn(scope, 0)", imports = {}))
    public static final <T> i<T> w(@p4.l i<? extends T> iVar) {
        k.c1();
        throw new kotlin.y();
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'publish(bufferSize)' is 'buffer' followed by 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @b1(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    public static final <T> i<T> x(@p4.l i<? extends T> iVar, int i5) {
        k.c1();
        throw new kotlin.y();
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Collect flow in the desired context instead")
    public static final <T> i<T> y(@p4.l i<? extends T> iVar, @p4.l kotlin.coroutines.g gVar) {
        k.c1();
        throw new kotlin.y();
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Flow analogue of 'replay()' is 'shareIn' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @b1(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    public static final <T> i<T> z(@p4.l i<? extends T> iVar) {
        k.c1();
        throw new kotlin.y();
    }
}
