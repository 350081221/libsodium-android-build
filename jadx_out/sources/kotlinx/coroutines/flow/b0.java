package kotlinx.coroutines.flow;

import com.android.dx.io.Opcodes;
import com.umeng.analytics.pro.bi;
import java.util.List;
import kotlin.e1;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000l\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0006\u001a\u008a\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032F\u0010\f\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u008c\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032F\u0010\f\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u009d\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032Y\b\u0001\u0010\f\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0012\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0011¢\u0006\u0002\b\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u009f\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032Y\b\u0001\u0010\f\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0012\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0011¢\u0006\u0002\b\u0014ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0016\u001a\u008a\u0001\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00030\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u000320\b\u0001\u0010\f\u001a*\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0011ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u009b\u0001\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00030\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032A\b\u0001\u0010\f\u001a;\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001c¢\u0006\u0002\b\u0014ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a¢\u0001\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00040\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u001f\"\u0004\b\u0004\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00030\u000324\u0010\f\u001a0\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001cø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001aµ\u0001\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00040\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u001f\"\u0004\b\u0004\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00030\u00032G\b\u0001\u0010\f\u001aA\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0#¢\u0006\u0002\b\u0014ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a¼\u0001\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00050\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u001f\"\u0004\b\u0004\u0010&\"\u0004\b\u0005\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00030\u00032\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00040\u00032:\u0010\f\u001a6\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0#ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001aÏ\u0001\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00050\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u001f\"\u0004\b\u0004\u0010&\"\u0004\b\u0005\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00030\u00032\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00040\u00032M\b\u0001\u0010\f\u001aG\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00050\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0*¢\u0006\u0002\b\u0014ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001as\u00101\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010/\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030.\"\b\u0012\u0004\u0012\u00028\u00000\u00032*\b\u0004\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b00H\u0086\bø\u0001\u0000¢\u0006\u0004\b1\u00102\u001a\u0084\u0001\u00103\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010/\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030.\"\b\u0012\u0004\u0012\u00028\u00000\u00032;\b\u0005\u0010\f\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005¢\u0006\u0002\b\u0014H\u0086\bø\u0001\u0000¢\u0006\u0004\b3\u00104\u001as\u00105\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010/\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030.\"\b\u0012\u0004\u0012\u00028\u00000\u00032*\b\u0004\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b00H\u0082\bø\u0001\u0000¢\u0006\u0004\b5\u00102\u001a\u0084\u0001\u00106\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010/\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030.\"\b\u0012\u0004\u0012\u00028\u00000\u00032;\b\u0005\u0010\f\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005¢\u0006\u0002\b\u0014H\u0082\bø\u0001\u0000¢\u0006\u0004\b6\u00104\u001a#\u00108\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010.07\"\u0004\b\u0000\u0010-H\u0002¢\u0006\u0004\b8\u00109\u001ag\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u0012\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030:2*\b\u0004\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b00H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010;\u001ax\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u0012\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030:2;\b\u0005\u0010\f\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005¢\u0006\u0002\b\u0014H\u0086\bø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001aj\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032(\u0010\f\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005ø\u0001\u0000¢\u0006\u0004\b?\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006@"}, d2 = {"T1", "T2", "R", "Lkotlinx/coroutines/flow/i;", "flow", "Lkotlin/Function3;", "Lkotlin/v0;", "name", bi.ay, "b", "Lkotlin/coroutines/d;", "", "transform", bi.aA, "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lv3/q;)Lkotlinx/coroutines/flow/i;", "flow2", "f", "Lkotlin/Function4;", "Lkotlinx/coroutines/flow/j;", "Lkotlin/r2;", "Lkotlin/u;", "q", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lv3/r;)Lkotlinx/coroutines/flow/i;", "l", "T3", "flow3", "e", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lv3/r;)Lkotlinx/coroutines/flow/i;", "Lkotlin/Function5;", "k", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lv3/s;)Lkotlinx/coroutines/flow/i;", "T4", "flow4", "d", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lv3/s;)Lkotlinx/coroutines/flow/i;", "Lkotlin/Function6;", "j", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lv3/t;)Lkotlinx/coroutines/flow/i;", "T5", "flow5", "c", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lv3/t;)Lkotlinx/coroutines/flow/i;", "Lkotlin/Function7;", "i", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Lv3/u;)Lkotlinx/coroutines/flow/i;", "T", "", "flows", "Lkotlin/Function2;", socket.g.f22386a, "([Lkotlinx/coroutines/flow/i;Lv3/p;)Lkotlinx/coroutines/flow/i;", "m", "([Lkotlinx/coroutines/flow/i;Lv3/q;)Lkotlinx/coroutines/flow/i;", "o", "n", "Lkotlin/Function0;", "r", "()Lv3/a;", "", "(Ljava/lang/Iterable;Lv3/p;)Lkotlinx/coroutines/flow/i;", bi.aJ, "(Ljava/lang/Iterable;Lv3/q;)Lkotlinx/coroutines/flow/i;", "other", bi.aE, "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
@r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,332:1\n272#1,3:334\n272#1,3:337\n261#1:340\n263#1:342\n272#1,3:343\n261#1:346\n263#1:348\n272#1,3:349\n261#1:352\n263#1:354\n272#1,3:355\n106#2:333\n106#2:341\n106#2:347\n106#2:353\n106#2:358\n106#2:359\n106#2:362\n37#3,2:360\n37#3,2:363\n*S KotlinDebug\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n75#1:334,3\n103#1:337,3\n119#1:340\n119#1:342\n138#1:343,3\n156#1:346\n156#1:348\n177#1:349,3\n197#1:352\n197#1:354\n220#1:355,3\n32#1:333\n119#1:341\n156#1:347\n197#1:353\n237#1:358\n261#1:359\n288#1:362\n287#1:360,2\n306#1:363,2\n*E\n"})
/* loaded from: classes4.dex */
public final /* synthetic */ class b0 {

    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/b0$t"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,112:1\n262#2,2:113\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class a<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: a */
        final /* synthetic */ kotlinx.coroutines.flow.i[] f20069a;

        /* renamed from: b */
        final /* synthetic */ v3.r f20070b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", i = {}, l = {333, 262}, m = "invokeSuspend", n = {}, s = {})
        @kotlin.i0(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/r2;", "kotlinx/coroutines/flow/b0$u", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,332:1\n120#2,4:333\n*E\n"})
        /* renamed from: kotlinx.coroutines.flow.b0$a$a */
        /* loaded from: classes4.dex */
        public static final class C0582a extends kotlin.coroutines.jvm.internal.o implements v3.q<kotlinx.coroutines.flow.j<? super R>, Object[], kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ v3.r $transform$inlined;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0582a(kotlin.coroutines.d dVar, v3.r rVar) {
                super(3, dVar);
                this.$transform$inlined = rVar;
            }

            @Override // v3.q
            @p4.m
            public final Object invoke(@p4.l kotlinx.coroutines.flow.j<? super R> jVar, @p4.l Object[] objArr, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                C0582a c0582a = new C0582a(dVar, this.$transform$inlined);
                c0582a.L$0 = jVar;
                c0582a.L$1 = objArr;
                return c0582a.invokeSuspend(r2.f19517a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.m
            public final Object invokeSuspend(@p4.l Object obj) {
                Object l5;
                kotlinx.coroutines.flow.j jVar;
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
                    jVar = (kotlinx.coroutines.flow.j) this.L$0;
                    e1.n(obj);
                } else {
                    e1.n(obj);
                    jVar = (kotlinx.coroutines.flow.j) this.L$0;
                    Object[] objArr = (Object[]) this.L$1;
                    v3.r rVar = this.$transform$inlined;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    this.L$0 = jVar;
                    this.label = 1;
                    kotlin.jvm.internal.i0.e(6);
                    obj = rVar.invoke(obj2, obj3, obj4, this);
                    kotlin.jvm.internal.i0.e(7);
                    if (obj == l5) {
                        return l5;
                    }
                }
                this.L$0 = null;
                this.label = 2;
                if (jVar.emit(obj, this) == l5) {
                    return l5;
                }
                return r2.f19517a;
            }
        }

        public a(kotlinx.coroutines.flow.i[] iVarArr, v3.r rVar) {
            this.f20069a = iVarArr;
            this.f20070b = rVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @p4.m
        public Object collect(@p4.l kotlinx.coroutines.flow.j jVar, @p4.l kotlin.coroutines.d dVar) {
            Object l5;
            Object a5 = kotlinx.coroutines.flow.internal.m.a(jVar, this.f20069a, b0.a(), new C0582a(null, this.f20070b), dVar);
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (a5 == l5) {
                return a5;
            }
            return r2.f19517a;
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/b0$t"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,112:1\n262#2,2:113\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class b<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: a */
        final /* synthetic */ kotlinx.coroutines.flow.i[] f20071a;

        /* renamed from: b */
        final /* synthetic */ v3.s f20072b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", f = "Zip.kt", i = {}, l = {333, 262}, m = "invokeSuspend", n = {}, s = {})
        @kotlin.i0(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/r2;", "kotlinx/coroutines/flow/b0$u", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,332:1\n157#2,5:333\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.o implements v3.q<kotlinx.coroutines.flow.j<? super R>, Object[], kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ v3.s $transform$inlined;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlin.coroutines.d dVar, v3.s sVar) {
                super(3, dVar);
                this.$transform$inlined = sVar;
            }

            @Override // v3.q
            @p4.m
            public final Object invoke(@p4.l kotlinx.coroutines.flow.j<? super R> jVar, @p4.l Object[] objArr, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                a aVar = new a(dVar, this.$transform$inlined);
                aVar.L$0 = jVar;
                aVar.L$1 = objArr;
                return aVar.invokeSuspend(r2.f19517a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.m
            public final Object invokeSuspend(@p4.l Object obj) {
                Object l5;
                kotlinx.coroutines.flow.j jVar;
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
                    jVar = (kotlinx.coroutines.flow.j) this.L$0;
                    e1.n(obj);
                } else {
                    e1.n(obj);
                    jVar = (kotlinx.coroutines.flow.j) this.L$0;
                    Object[] objArr = (Object[]) this.L$1;
                    v3.s sVar = this.$transform$inlined;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    this.L$0 = jVar;
                    this.label = 1;
                    kotlin.jvm.internal.i0.e(6);
                    obj = sVar.invoke(obj2, obj3, obj4, obj5, this);
                    kotlin.jvm.internal.i0.e(7);
                    if (obj == l5) {
                        return l5;
                    }
                }
                this.L$0 = null;
                this.label = 2;
                if (jVar.emit(obj, this) == l5) {
                    return l5;
                }
                return r2.f19517a;
            }
        }

        public b(kotlinx.coroutines.flow.i[] iVarArr, v3.s sVar) {
            this.f20071a = iVarArr;
            this.f20072b = sVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @p4.m
        public Object collect(@p4.l kotlinx.coroutines.flow.j jVar, @p4.l kotlin.coroutines.d dVar) {
            Object l5;
            Object a5 = kotlinx.coroutines.flow.internal.m.a(jVar, this.f20071a, b0.a(), new a(null, this.f20072b), dVar);
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (a5 == l5) {
                return a5;
            }
            return r2.f19517a;
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/b0$t"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,112:1\n262#2,2:113\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class c<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: a */
        final /* synthetic */ kotlinx.coroutines.flow.i[] f20073a;

        /* renamed from: b */
        final /* synthetic */ v3.t f20074b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2", f = "Zip.kt", i = {}, l = {333, 262}, m = "invokeSuspend", n = {}, s = {})
        @kotlin.i0(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/r2;", "kotlinx/coroutines/flow/b0$u", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,332:1\n198#2,6:333\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.o implements v3.q<kotlinx.coroutines.flow.j<? super R>, Object[], kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ v3.t $transform$inlined;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlin.coroutines.d dVar, v3.t tVar) {
                super(3, dVar);
                this.$transform$inlined = tVar;
            }

            @Override // v3.q
            @p4.m
            public final Object invoke(@p4.l kotlinx.coroutines.flow.j<? super R> jVar, @p4.l Object[] objArr, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                a aVar = new a(dVar, this.$transform$inlined);
                aVar.L$0 = jVar;
                aVar.L$1 = objArr;
                return aVar.invokeSuspend(r2.f19517a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.m
            public final Object invokeSuspend(@p4.l Object obj) {
                Object l5;
                kotlinx.coroutines.flow.j jVar;
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
                    jVar = (kotlinx.coroutines.flow.j) this.L$0;
                    e1.n(obj);
                } else {
                    e1.n(obj);
                    jVar = (kotlinx.coroutines.flow.j) this.L$0;
                    Object[] objArr = (Object[]) this.L$1;
                    v3.t tVar = this.$transform$inlined;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    this.L$0 = jVar;
                    this.label = 1;
                    kotlin.jvm.internal.i0.e(6);
                    obj = tVar.invoke(obj2, obj3, obj4, obj5, obj6, this);
                    kotlin.jvm.internal.i0.e(7);
                    if (obj == l5) {
                        return l5;
                    }
                }
                this.L$0 = null;
                this.label = 2;
                if (jVar.emit(obj, this) == l5) {
                    return l5;
                }
                return r2.f19517a;
            }
        }

        public c(kotlinx.coroutines.flow.i[] iVarArr, v3.t tVar) {
            this.f20073a = iVarArr;
            this.f20074b = tVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @p4.m
        public Object collect(@p4.l kotlinx.coroutines.flow.j jVar, @p4.l kotlin.coroutines.d dVar) {
            Object l5;
            Object a5 = kotlinx.coroutines.flow.internal.m.a(jVar, this.f20073a, b0.a(), new a(null, this.f20074b), dVar);
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (a5 == l5) {
                return a5;
            }
            return r2.f19517a;
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/x$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,112:1\n33#2,2:113\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class d<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: a */
        final /* synthetic */ kotlinx.coroutines.flow.i f20075a;

        /* renamed from: b */
        final /* synthetic */ kotlinx.coroutines.flow.i f20076b;

        /* renamed from: c */
        final /* synthetic */ v3.q f20077c;

        public d(kotlinx.coroutines.flow.i iVar, kotlinx.coroutines.flow.i iVar2, v3.q qVar) {
            this.f20075a = iVar;
            this.f20076b = iVar2;
            this.f20077c = qVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @p4.m
        public Object collect(@p4.l kotlinx.coroutines.flow.j<? super R> jVar, @p4.l kotlin.coroutines.d<? super r2> dVar) {
            Object l5;
            Object a5 = kotlinx.coroutines.flow.internal.m.a(jVar, new kotlinx.coroutines.flow.i[]{this.f20075a, this.f20076b}, b0.a(), new g(this.f20077c, null), dVar);
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (a5 == l5) {
                return a5;
            }
            return r2.f19517a;
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/x$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,112:1\n238#2,2:113\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class e<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: a */
        final /* synthetic */ kotlinx.coroutines.flow.i[] f20078a;

        /* renamed from: b */
        final /* synthetic */ v3.p f20079b;

        @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 176)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,112:1\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {
            int label;
            /* synthetic */ Object result;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.m
            public final Object invokeSuspend(@p4.l Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return e.this.collect(null, this);
            }
        }

        public e(kotlinx.coroutines.flow.i[] iVarArr, v3.p pVar) {
            this.f20078a = iVarArr;
            this.f20079b = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @p4.m
        public Object collect(@p4.l kotlinx.coroutines.flow.j<? super R> jVar, @p4.l kotlin.coroutines.d<? super r2> dVar) {
            Object l5;
            kotlinx.coroutines.flow.i[] iVarArr = this.f20078a;
            kotlin.jvm.internal.l0.w();
            h hVar = new h(this.f20078a);
            kotlin.jvm.internal.l0.w();
            Object a5 = kotlinx.coroutines.flow.internal.m.a(jVar, iVarArr, hVar, new i(this.f20079b, null), dVar);
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (a5 == l5) {
                return a5;
            }
            return r2.f19517a;
        }

        @p4.m
        public Object e(@p4.l kotlinx.coroutines.flow.j jVar, @p4.l kotlin.coroutines.d dVar) {
            kotlin.jvm.internal.i0.e(4);
            new a(dVar);
            kotlin.jvm.internal.i0.e(5);
            kotlinx.coroutines.flow.i[] iVarArr = this.f20078a;
            kotlin.jvm.internal.l0.w();
            h hVar = new h(this.f20078a);
            kotlin.jvm.internal.l0.w();
            i iVar = new i(this.f20079b, null);
            kotlin.jvm.internal.i0.e(0);
            kotlinx.coroutines.flow.internal.m.a(jVar, iVarArr, hVar, iVar, dVar);
            kotlin.jvm.internal.i0.e(1);
            return r2.f19517a;
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/x$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,112:1\n289#2,5:113\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class f<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: a */
        final /* synthetic */ kotlinx.coroutines.flow.i[] f20080a;

        /* renamed from: b */
        final /* synthetic */ v3.p f20081b;

        @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 176)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,112:1\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {
            int label;
            /* synthetic */ Object result;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.m
            public final Object invokeSuspend(@p4.l Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return f.this.collect(null, this);
            }
        }

        public f(kotlinx.coroutines.flow.i[] iVarArr, v3.p pVar) {
            this.f20080a = iVarArr;
            this.f20081b = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @p4.m
        public Object collect(@p4.l kotlinx.coroutines.flow.j<? super R> jVar, @p4.l kotlin.coroutines.d<? super r2> dVar) {
            Object l5;
            kotlinx.coroutines.flow.i[] iVarArr = this.f20080a;
            kotlin.jvm.internal.l0.w();
            j jVar2 = new j(this.f20080a);
            kotlin.jvm.internal.l0.w();
            Object a5 = kotlinx.coroutines.flow.internal.m.a(jVar, iVarArr, jVar2, new k(this.f20081b, null), dVar);
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (a5 == l5) {
                return a5;
            }
            return r2.f19517a;
        }

        @p4.m
        public Object e(@p4.l kotlinx.coroutines.flow.j jVar, @p4.l kotlin.coroutines.d dVar) {
            kotlin.jvm.internal.i0.e(4);
            new a(dVar);
            kotlin.jvm.internal.i0.e(5);
            kotlinx.coroutines.flow.i[] iVarArr = this.f20080a;
            kotlin.jvm.internal.l0.w();
            j jVar2 = new j(this.f20080a);
            kotlin.jvm.internal.l0.w();
            k kVar = new k(this.f20081b, null);
            kotlin.jvm.internal.i0.e(0);
            kotlinx.coroutines.flow.internal.m.a(jVar, iVarArr, jVar2, kVar, dVar);
            kotlin.jvm.internal.i0.e(1);
            return r2.f19517a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", i = {}, l = {33, 33}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\u0018\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u008a@"}, d2 = {"T1", "T2", "R", "Lkotlinx/coroutines/flow/j;", "", "", "it", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    static final class g<R> extends kotlin.coroutines.jvm.internal.o implements v3.q<kotlinx.coroutines.flow.j<? super R>, Object[], kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ v3.q<T1, T2, kotlin.coroutines.d<? super R>, Object> $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(v3.q<? super T1, ? super T2, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar, kotlin.coroutines.d<? super g> dVar) {
            super(3, dVar);
            this.$transform = qVar;
        }

        @Override // v3.q
        @p4.m
        public final Object invoke(@p4.l kotlinx.coroutines.flow.j<? super R> jVar, @p4.l Object[] objArr, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            g gVar = new g(this.$transform, dVar);
            gVar.L$0 = jVar;
            gVar.L$1 = objArr;
            return gVar.invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            kotlinx.coroutines.flow.j jVar;
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
                jVar = (kotlinx.coroutines.flow.j) this.L$0;
                e1.n(obj);
            } else {
                e1.n(obj);
                jVar = (kotlinx.coroutines.flow.j) this.L$0;
                Object[] objArr = (Object[]) this.L$1;
                v3.q<T1, T2, kotlin.coroutines.d<? super R>, Object> qVar = this.$transform;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                this.L$0 = jVar;
                this.label = 1;
                obj = qVar.invoke(obj2, obj3, this);
                if (obj == l5) {
                    return l5;
                }
            }
            this.L$0 = null;
            this.label = 2;
            if (jVar.emit(obj, this) == l5) {
                return l5;
            }
            return r2.f19517a;
        }
    }

    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "R", "invoke", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combine$5$1\n*L\n1#1,332:1\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class h<T> extends kotlin.jvm.internal.n0 implements v3.a<T[]> {
        final /* synthetic */ kotlinx.coroutines.flow.i<T>[] $flows;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(kotlinx.coroutines.flow.i<? extends T>[] iVarArr) {
            super(0);
            this.$flows = iVarArr;
        }

        @Override // v3.a
        @p4.m
        public final T[] invoke() {
            int length = this.$flows.length;
            kotlin.jvm.internal.l0.y(0, "T?");
            return (T[]) new Object[length];
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$2", f = "Zip.kt", i = {}, l = {238, 238}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combine$5$2\n*L\n1#1,332:1\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class i<R, T> extends kotlin.coroutines.jvm.internal.o implements v3.q<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ v3.p<T[], kotlin.coroutines.d<? super R>, Object> $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(v3.p<? super T[], ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar, kotlin.coroutines.d<? super i> dVar) {
            super(3, dVar);
            this.$transform = pVar;
        }

        @Override // v3.q
        @p4.m
        public final Object invoke(@p4.l kotlinx.coroutines.flow.j<? super R> jVar, @p4.l T[] tArr, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            kotlin.jvm.internal.l0.w();
            i iVar = new i(this.$transform, dVar);
            iVar.L$0 = jVar;
            iVar.L$1 = tArr;
            return iVar.invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            kotlinx.coroutines.flow.j jVar;
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
                kotlinx.coroutines.flow.j jVar2 = (kotlinx.coroutines.flow.j) this.L$0;
                e1.n(obj);
                jVar = jVar2;
            } else {
                e1.n(obj);
                kotlinx.coroutines.flow.j jVar3 = (kotlinx.coroutines.flow.j) this.L$0;
                Object[] objArr = (Object[]) this.L$1;
                v3.p<T[], kotlin.coroutines.d<? super R>, Object> pVar = this.$transform;
                this.L$0 = jVar3;
                this.label = 1;
                obj = pVar.invoke(objArr, this);
                jVar = jVar3;
                if (obj == l5) {
                    return l5;
                }
            }
            this.L$0 = null;
            this.label = 2;
            if (jVar.emit(obj, this) == l5) {
                return l5;
            }
            return r2.f19517a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @p4.m
        public final Object invokeSuspend$$forInline(@p4.l Object obj) {
            kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.L$0;
            Object invoke = this.$transform.invoke((Object[]) this.L$1, this);
            kotlin.jvm.internal.i0.e(0);
            jVar.emit(invoke, this);
            kotlin.jvm.internal.i0.e(1);
            return r2.f19517a;
        }
    }

    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "R", "invoke", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$1\n*L\n1#1,332:1\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class j<T> extends kotlin.jvm.internal.n0 implements v3.a<T[]> {
        final /* synthetic */ kotlinx.coroutines.flow.i<T>[] $flowArray;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(kotlinx.coroutines.flow.i<T>[] iVarArr) {
            super(0);
            this.$flowArray = iVarArr;
        }

        @Override // v3.a
        @p4.m
        public final T[] invoke() {
            int length = this.$flowArray.length;
            kotlin.jvm.internal.l0.y(0, "T?");
            return (T[]) new Object[length];
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$2", f = "Zip.kt", i = {}, l = {292, 292}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$2\n*L\n1#1,332:1\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class k<R, T> extends kotlin.coroutines.jvm.internal.o implements v3.q<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ v3.p<T[], kotlin.coroutines.d<? super R>, Object> $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(v3.p<? super T[], ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar, kotlin.coroutines.d<? super k> dVar) {
            super(3, dVar);
            this.$transform = pVar;
        }

        @Override // v3.q
        @p4.m
        public final Object invoke(@p4.l kotlinx.coroutines.flow.j<? super R> jVar, @p4.l T[] tArr, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            kotlin.jvm.internal.l0.w();
            k kVar = new k(this.$transform, dVar);
            kVar.L$0 = jVar;
            kVar.L$1 = tArr;
            return kVar.invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            kotlinx.coroutines.flow.j jVar;
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
                kotlinx.coroutines.flow.j jVar2 = (kotlinx.coroutines.flow.j) this.L$0;
                e1.n(obj);
                jVar = jVar2;
            } else {
                e1.n(obj);
                kotlinx.coroutines.flow.j jVar3 = (kotlinx.coroutines.flow.j) this.L$0;
                Object[] objArr = (Object[]) this.L$1;
                v3.p<T[], kotlin.coroutines.d<? super R>, Object> pVar = this.$transform;
                this.L$0 = jVar3;
                this.label = 1;
                obj = pVar.invoke(objArr, this);
                jVar = jVar3;
                if (obj == l5) {
                    return l5;
                }
            }
            this.L$0 = null;
            this.label = 2;
            if (jVar.emit(obj, this) == l5) {
                return l5;
            }
            return r2.f19517a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @p4.m
        public final Object invokeSuspend$$forInline(@p4.l Object obj) {
            kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.L$0;
            Object invoke = this.$transform.invoke((Object[]) this.L$1, this);
            kotlin.jvm.internal.i0.e(0);
            jVar.emit(invoke, this);
            kotlin.jvm.internal.i0.e(1);
            return r2.f19517a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1", f = "Zip.kt", i = {}, l = {com.umeng.commonsdk.stateless.b.f13225a}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¨\u0006\u0004"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/r2;", "kotlinx/coroutines/flow/b0$s", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1\n*L\n1#1,332:1\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class l<R> extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.flow.j<? super R>, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ kotlinx.coroutines.flow.i[] $flows;
        final /* synthetic */ v3.r $transform$inlined;
        private /* synthetic */ Object L$0;
        int label;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
        @kotlin.i0(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/r2;", "kotlinx/coroutines/flow/b0$s$a", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,332:1\n76#2,5:333\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.o implements v3.q<kotlinx.coroutines.flow.j<? super R>, Object[], kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ v3.r $transform$inlined;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlin.coroutines.d dVar, v3.r rVar) {
                super(3, dVar);
                this.$transform$inlined = rVar;
            }

            @Override // v3.q
            @p4.m
            public final Object invoke(@p4.l kotlinx.coroutines.flow.j<? super R> jVar, @p4.l Object[] objArr, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                a aVar = new a(dVar, this.$transform$inlined);
                aVar.L$0 = jVar;
                aVar.L$1 = objArr;
                return aVar.invokeSuspend(r2.f19517a);
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
                    kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.L$0;
                    Object[] objArr = (Object[]) this.L$1;
                    v3.r rVar = this.$transform$inlined;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    this.label = 1;
                    kotlin.jvm.internal.i0.e(6);
                    Object invoke = rVar.invoke(jVar, obj2, obj3, this);
                    kotlin.jvm.internal.i0.e(7);
                    if (invoke == l5) {
                        return l5;
                    }
                }
                return r2.f19517a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(kotlinx.coroutines.flow.i[] iVarArr, kotlin.coroutines.d dVar, v3.r rVar) {
            super(2, dVar);
            this.$flows = iVarArr;
            this.$transform$inlined = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            l lVar = new l(this.$flows, dVar, this.$transform$inlined);
            lVar.L$0 = obj;
            return lVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l kotlinx.coroutines.flow.j<? super R> jVar, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((l) create(jVar, dVar)).invokeSuspend(r2.f19517a);
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
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.L$0;
                kotlinx.coroutines.flow.i[] iVarArr = this.$flows;
                v3.a a5 = b0.a();
                a aVar = new a(null, this.$transform$inlined);
                this.label = 1;
                if (kotlinx.coroutines.flow.internal.m.a(jVar, iVarArr, a5, aVar, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2", f = "Zip.kt", i = {}, l = {com.umeng.commonsdk.stateless.b.f13225a}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¨\u0006\u0004"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/r2;", "kotlinx/coroutines/flow/b0$s", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1\n*L\n1#1,332:1\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class m<R> extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.flow.j<? super R>, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ kotlinx.coroutines.flow.i[] $flows;
        final /* synthetic */ v3.r $transform$inlined;
        private /* synthetic */ Object L$0;
        int label;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
        @kotlin.i0(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/r2;", "kotlinx/coroutines/flow/b0$s$a", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,332:1\n104#2,5:333\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.o implements v3.q<kotlinx.coroutines.flow.j<? super R>, Object[], kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ v3.r $transform$inlined;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlin.coroutines.d dVar, v3.r rVar) {
                super(3, dVar);
                this.$transform$inlined = rVar;
            }

            @Override // v3.q
            @p4.m
            public final Object invoke(@p4.l kotlinx.coroutines.flow.j<? super R> jVar, @p4.l Object[] objArr, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                a aVar = new a(dVar, this.$transform$inlined);
                aVar.L$0 = jVar;
                aVar.L$1 = objArr;
                return aVar.invokeSuspend(r2.f19517a);
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
                    kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.L$0;
                    Object[] objArr = (Object[]) this.L$1;
                    v3.r rVar = this.$transform$inlined;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    this.label = 1;
                    kotlin.jvm.internal.i0.e(6);
                    Object invoke = rVar.invoke(jVar, obj2, obj3, this);
                    kotlin.jvm.internal.i0.e(7);
                    if (invoke == l5) {
                        return l5;
                    }
                }
                return r2.f19517a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(kotlinx.coroutines.flow.i[] iVarArr, kotlin.coroutines.d dVar, v3.r rVar) {
            super(2, dVar);
            this.$flows = iVarArr;
            this.$transform$inlined = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            m mVar = new m(this.$flows, dVar, this.$transform$inlined);
            mVar.L$0 = obj;
            return mVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l kotlinx.coroutines.flow.j<? super R> jVar, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((m) create(jVar, dVar)).invokeSuspend(r2.f19517a);
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
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.L$0;
                kotlinx.coroutines.flow.i[] iVarArr = this.$flows;
                v3.a a5 = b0.a();
                a aVar = new a(null, this.$transform$inlined);
                this.label = 1;
                if (kotlinx.coroutines.flow.internal.m.a(jVar, iVarArr, a5, aVar, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3", f = "Zip.kt", i = {}, l = {com.umeng.commonsdk.stateless.b.f13225a}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¨\u0006\u0004"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/r2;", "kotlinx/coroutines/flow/b0$s", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1\n*L\n1#1,332:1\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class n<R> extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.flow.j<? super R>, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ kotlinx.coroutines.flow.i[] $flows;
        final /* synthetic */ v3.s $transform$inlined;
        private /* synthetic */ Object L$0;
        int label;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
        @kotlin.i0(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/r2;", "kotlinx/coroutines/flow/b0$s$a", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,332:1\n139#2,6:333\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.o implements v3.q<kotlinx.coroutines.flow.j<? super R>, Object[], kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ v3.s $transform$inlined;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlin.coroutines.d dVar, v3.s sVar) {
                super(3, dVar);
                this.$transform$inlined = sVar;
            }

            @Override // v3.q
            @p4.m
            public final Object invoke(@p4.l kotlinx.coroutines.flow.j<? super R> jVar, @p4.l Object[] objArr, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                a aVar = new a(dVar, this.$transform$inlined);
                aVar.L$0 = jVar;
                aVar.L$1 = objArr;
                return aVar.invokeSuspend(r2.f19517a);
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
                    kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.L$0;
                    Object[] objArr = (Object[]) this.L$1;
                    v3.s sVar = this.$transform$inlined;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    this.label = 1;
                    kotlin.jvm.internal.i0.e(6);
                    Object invoke = sVar.invoke(jVar, obj2, obj3, obj4, this);
                    kotlin.jvm.internal.i0.e(7);
                    if (invoke == l5) {
                        return l5;
                    }
                }
                return r2.f19517a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(kotlinx.coroutines.flow.i[] iVarArr, kotlin.coroutines.d dVar, v3.s sVar) {
            super(2, dVar);
            this.$flows = iVarArr;
            this.$transform$inlined = sVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            n nVar = new n(this.$flows, dVar, this.$transform$inlined);
            nVar.L$0 = obj;
            return nVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l kotlinx.coroutines.flow.j<? super R> jVar, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((n) create(jVar, dVar)).invokeSuspend(r2.f19517a);
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
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.L$0;
                kotlinx.coroutines.flow.i[] iVarArr = this.$flows;
                v3.a a5 = b0.a();
                a aVar = new a(null, this.$transform$inlined);
                this.label = 1;
                if (kotlinx.coroutines.flow.internal.m.a(jVar, iVarArr, a5, aVar, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4", f = "Zip.kt", i = {}, l = {com.umeng.commonsdk.stateless.b.f13225a}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¨\u0006\u0004"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/r2;", "kotlinx/coroutines/flow/b0$s", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1\n*L\n1#1,332:1\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class o<R> extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.flow.j<? super R>, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ kotlinx.coroutines.flow.i[] $flows;
        final /* synthetic */ v3.t $transform$inlined;
        private /* synthetic */ Object L$0;
        int label;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
        @kotlin.i0(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/r2;", "kotlinx/coroutines/flow/b0$s$a", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,332:1\n178#2,7:333\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.o implements v3.q<kotlinx.coroutines.flow.j<? super R>, Object[], kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ v3.t $transform$inlined;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlin.coroutines.d dVar, v3.t tVar) {
                super(3, dVar);
                this.$transform$inlined = tVar;
            }

            @Override // v3.q
            @p4.m
            public final Object invoke(@p4.l kotlinx.coroutines.flow.j<? super R> jVar, @p4.l Object[] objArr, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                a aVar = new a(dVar, this.$transform$inlined);
                aVar.L$0 = jVar;
                aVar.L$1 = objArr;
                return aVar.invokeSuspend(r2.f19517a);
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
                    kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.L$0;
                    Object[] objArr = (Object[]) this.L$1;
                    v3.t tVar = this.$transform$inlined;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    this.label = 1;
                    kotlin.jvm.internal.i0.e(6);
                    Object invoke = tVar.invoke(jVar, obj2, obj3, obj4, obj5, this);
                    kotlin.jvm.internal.i0.e(7);
                    if (invoke == l5) {
                        return l5;
                    }
                }
                return r2.f19517a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(kotlinx.coroutines.flow.i[] iVarArr, kotlin.coroutines.d dVar, v3.t tVar) {
            super(2, dVar);
            this.$flows = iVarArr;
            this.$transform$inlined = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            o oVar = new o(this.$flows, dVar, this.$transform$inlined);
            oVar.L$0 = obj;
            return oVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l kotlinx.coroutines.flow.j<? super R> jVar, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((o) create(jVar, dVar)).invokeSuspend(r2.f19517a);
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
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.L$0;
                kotlinx.coroutines.flow.i[] iVarArr = this.$flows;
                v3.a a5 = b0.a();
                a aVar = new a(null, this.$transform$inlined);
                this.label = 1;
                if (kotlinx.coroutines.flow.internal.m.a(jVar, iVarArr, a5, aVar, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5", f = "Zip.kt", i = {}, l = {com.umeng.commonsdk.stateless.b.f13225a}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¨\u0006\u0004"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/r2;", "kotlinx/coroutines/flow/b0$s", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1\n*L\n1#1,332:1\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class p<R> extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.flow.j<? super R>, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ kotlinx.coroutines.flow.i[] $flows;
        final /* synthetic */ v3.u $transform$inlined;
        private /* synthetic */ Object L$0;
        int label;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
        @kotlin.i0(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/r2;", "kotlinx/coroutines/flow/b0$s$a", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,332:1\n221#2,8:333\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.o implements v3.q<kotlinx.coroutines.flow.j<? super R>, Object[], kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ v3.u $transform$inlined;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlin.coroutines.d dVar, v3.u uVar) {
                super(3, dVar);
                this.$transform$inlined = uVar;
            }

            @Override // v3.q
            @p4.m
            public final Object invoke(@p4.l kotlinx.coroutines.flow.j<? super R> jVar, @p4.l Object[] objArr, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                a aVar = new a(dVar, this.$transform$inlined);
                aVar.L$0 = jVar;
                aVar.L$1 = objArr;
                return aVar.invokeSuspend(r2.f19517a);
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
                    kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.L$0;
                    Object[] objArr = (Object[]) this.L$1;
                    v3.u uVar = this.$transform$inlined;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    this.label = 1;
                    kotlin.jvm.internal.i0.e(6);
                    Object invoke = uVar.invoke(jVar, obj2, obj3, obj4, obj5, obj6, this);
                    kotlin.jvm.internal.i0.e(7);
                    if (invoke == l5) {
                        return l5;
                    }
                }
                return r2.f19517a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(kotlinx.coroutines.flow.i[] iVarArr, kotlin.coroutines.d dVar, v3.u uVar) {
            super(2, dVar);
            this.$flows = iVarArr;
            this.$transform$inlined = uVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            p pVar = new p(this.$flows, dVar, this.$transform$inlined);
            pVar.L$0 = obj;
            return pVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l kotlinx.coroutines.flow.j<? super R> jVar, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((p) create(jVar, dVar)).invokeSuspend(r2.f19517a);
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
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.L$0;
                kotlinx.coroutines.flow.i[] iVarArr = this.$flows;
                v3.a a5 = b0.a();
                a aVar = new a(null, this.$transform$inlined);
                this.label = 1;
                if (kotlinx.coroutines.flow.internal.m.a(jVar, iVarArr, a5, aVar, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6", f = "Zip.kt", i = {}, l = {Opcodes.INVOKE_POLYMORPHIC_RANGE}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransform$6\n*L\n1#1,332:1\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class q<R> extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.flow.j<? super R>, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ kotlinx.coroutines.flow.i<T>[] $flows;
        final /* synthetic */ v3.q<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super r2>, Object> $transform;
        private /* synthetic */ Object L$0;
        int label;

        @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "R", "invoke", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 176)
        @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransform$6$1\n*L\n1#1,332:1\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class a<T> extends kotlin.jvm.internal.n0 implements v3.a<T[]> {
            final /* synthetic */ kotlinx.coroutines.flow.i<T>[] $flows;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(kotlinx.coroutines.flow.i<? extends T>[] iVarArr) {
                super(0);
                this.$flows = iVarArr;
            }

            @Override // v3.a
            @p4.m
            public final T[] invoke() {
                int length = this.$flows.length;
                kotlin.jvm.internal.l0.y(0, "T?");
                return (T[]) new Object[length];
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2", f = "Zip.kt", i = {}, l = {Opcodes.INVOKE_POLYMORPHIC_RANGE}, m = "invokeSuspend", n = {}, s = {})
        @kotlin.i0(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransform$6$2\n*L\n1#1,332:1\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class b<T> extends kotlin.coroutines.jvm.internal.o implements v3.q<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ v3.q<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super r2>, Object> $transform;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(v3.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super kotlin.coroutines.d<? super r2>, ? extends Object> qVar, kotlin.coroutines.d<? super b> dVar) {
                super(3, dVar);
                this.$transform = qVar;
            }

            @Override // v3.q
            @p4.m
            public final Object invoke(@p4.l kotlinx.coroutines.flow.j<? super R> jVar, @p4.l T[] tArr, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                kotlin.jvm.internal.l0.w();
                b bVar = new b(this.$transform, dVar);
                bVar.L$0 = jVar;
                bVar.L$1 = tArr;
                return bVar.invokeSuspend(r2.f19517a);
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
                    kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.L$0;
                    Object[] objArr = (Object[]) this.L$1;
                    v3.q<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super r2>, Object> qVar = this.$transform;
                    this.L$0 = null;
                    this.label = 1;
                    if (qVar.invoke(jVar, objArr, this) == l5) {
                        return l5;
                    }
                }
                return r2.f19517a;
            }

            @p4.m
            public final Object invokeSuspend$$forInline(@p4.l Object obj) {
                this.$transform.invoke((kotlinx.coroutines.flow.j) this.L$0, (Object[]) this.L$1, this);
                return r2.f19517a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public q(kotlinx.coroutines.flow.i<? extends T>[] iVarArr, v3.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super kotlin.coroutines.d<? super r2>, ? extends Object> qVar, kotlin.coroutines.d<? super q> dVar) {
            super(2, dVar);
            this.$flows = iVarArr;
            this.$transform = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            q qVar = new q(this.$flows, this.$transform, dVar);
            qVar.L$0 = obj;
            return qVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l kotlinx.coroutines.flow.j<? super R> jVar, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((q) create(jVar, dVar)).invokeSuspend(r2.f19517a);
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
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.L$0;
                kotlinx.coroutines.flow.i<T>[] iVarArr = this.$flows;
                kotlin.jvm.internal.l0.w();
                a aVar = new a(this.$flows);
                kotlin.jvm.internal.l0.w();
                b bVar = new b(this.$transform, null);
                this.label = 1;
                if (kotlinx.coroutines.flow.internal.m.a(jVar, iVarArr, aVar, bVar, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }

        @p4.m
        public final Object invokeSuspend$$forInline(@p4.l Object obj) {
            kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.L$0;
            kotlinx.coroutines.flow.i<T>[] iVarArr = this.$flows;
            kotlin.jvm.internal.l0.w();
            a aVar = new a(this.$flows);
            kotlin.jvm.internal.l0.w();
            b bVar = new b(this.$transform, null);
            kotlin.jvm.internal.i0.e(0);
            kotlinx.coroutines.flow.internal.m.a(jVar, iVarArr, aVar, bVar, this);
            kotlin.jvm.internal.i0.e(1);
            return r2.f19517a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7", f = "Zip.kt", i = {}, l = {308}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransform$7\n*L\n1#1,332:1\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class r<R> extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.flow.j<? super R>, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ kotlinx.coroutines.flow.i<T>[] $flowArray;
        final /* synthetic */ v3.q<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super r2>, Object> $transform;
        private /* synthetic */ Object L$0;
        int label;

        @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "R", "invoke", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 176)
        @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransform$7$1\n*L\n1#1,332:1\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class a<T> extends kotlin.jvm.internal.n0 implements v3.a<T[]> {
            final /* synthetic */ kotlinx.coroutines.flow.i<T>[] $flowArray;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlinx.coroutines.flow.i<T>[] iVarArr) {
                super(0);
                this.$flowArray = iVarArr;
            }

            @Override // v3.a
            @p4.m
            public final T[] invoke() {
                int length = this.$flowArray.length;
                kotlin.jvm.internal.l0.y(0, "T?");
                return (T[]) new Object[length];
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2", f = "Zip.kt", i = {}, l = {308}, m = "invokeSuspend", n = {}, s = {})
        @kotlin.i0(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransform$7$2\n*L\n1#1,332:1\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class b<T> extends kotlin.coroutines.jvm.internal.o implements v3.q<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ v3.q<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super r2>, Object> $transform;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(v3.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super kotlin.coroutines.d<? super r2>, ? extends Object> qVar, kotlin.coroutines.d<? super b> dVar) {
                super(3, dVar);
                this.$transform = qVar;
            }

            @Override // v3.q
            @p4.m
            public final Object invoke(@p4.l kotlinx.coroutines.flow.j<? super R> jVar, @p4.l T[] tArr, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                kotlin.jvm.internal.l0.w();
                b bVar = new b(this.$transform, dVar);
                bVar.L$0 = jVar;
                bVar.L$1 = tArr;
                return bVar.invokeSuspend(r2.f19517a);
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
                    kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.L$0;
                    Object[] objArr = (Object[]) this.L$1;
                    v3.q<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super r2>, Object> qVar = this.$transform;
                    this.L$0 = null;
                    this.label = 1;
                    if (qVar.invoke(jVar, objArr, this) == l5) {
                        return l5;
                    }
                }
                return r2.f19517a;
            }

            @p4.m
            public final Object invokeSuspend$$forInline(@p4.l Object obj) {
                this.$transform.invoke((kotlinx.coroutines.flow.j) this.L$0, (Object[]) this.L$1, this);
                return r2.f19517a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public r(kotlinx.coroutines.flow.i<T>[] iVarArr, v3.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super kotlin.coroutines.d<? super r2>, ? extends Object> qVar, kotlin.coroutines.d<? super r> dVar) {
            super(2, dVar);
            this.$flowArray = iVarArr;
            this.$transform = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            r rVar = new r(this.$flowArray, this.$transform, dVar);
            rVar.L$0 = obj;
            return rVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l kotlinx.coroutines.flow.j<? super R> jVar, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((r) create(jVar, dVar)).invokeSuspend(r2.f19517a);
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
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.L$0;
                kotlinx.coroutines.flow.i<T>[] iVarArr = this.$flowArray;
                kotlin.jvm.internal.l0.w();
                a aVar = new a(this.$flowArray);
                kotlin.jvm.internal.l0.w();
                b bVar = new b(this.$transform, null);
                this.label = 1;
                if (kotlinx.coroutines.flow.internal.m.a(jVar, iVarArr, aVar, bVar, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }

        @p4.m
        public final Object invokeSuspend$$forInline(@p4.l Object obj) {
            kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.L$0;
            kotlinx.coroutines.flow.i<T>[] iVarArr = this.$flowArray;
            kotlin.jvm.internal.l0.w();
            a aVar = new a(this.$flowArray);
            kotlin.jvm.internal.l0.w();
            b bVar = new b(this.$transform, null);
            kotlin.jvm.internal.i0.e(0);
            kotlinx.coroutines.flow.internal.m.a(jVar, iVarArr, aVar, bVar, this);
            kotlin.jvm.internal.i0.e(1);
            return r2.f19517a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1", f = "Zip.kt", i = {}, l = {com.umeng.commonsdk.stateless.b.f13225a}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1\n*L\n1#1,332:1\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class s<R> extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.flow.j<? super R>, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ kotlinx.coroutines.flow.i<T>[] $flows;
        final /* synthetic */ v3.q<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super r2>, Object> $transform;
        private /* synthetic */ Object L$0;
        int label;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1$1", f = "Zip.kt", i = {}, l = {com.umeng.commonsdk.stateless.b.f13225a}, m = "invokeSuspend", n = {}, s = {})
        @kotlin.i0(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1\n*L\n1#1,332:1\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class a<T> extends kotlin.coroutines.jvm.internal.o implements v3.q<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ v3.q<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super r2>, Object> $transform;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(v3.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super kotlin.coroutines.d<? super r2>, ? extends Object> qVar, kotlin.coroutines.d<? super a> dVar) {
                super(3, dVar);
                this.$transform = qVar;
            }

            @Override // v3.q
            @p4.m
            public final Object invoke(@p4.l kotlinx.coroutines.flow.j<? super R> jVar, @p4.l T[] tArr, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                kotlin.jvm.internal.l0.w();
                a aVar = new a(this.$transform, dVar);
                aVar.L$0 = jVar;
                aVar.L$1 = tArr;
                return aVar.invokeSuspend(r2.f19517a);
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
                    kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.L$0;
                    Object[] objArr = (Object[]) this.L$1;
                    v3.q<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super r2>, Object> qVar = this.$transform;
                    this.L$0 = null;
                    this.label = 1;
                    if (qVar.invoke(jVar, objArr, this) == l5) {
                        return l5;
                    }
                }
                return r2.f19517a;
            }

            @p4.m
            public final Object invokeSuspend$$forInline(@p4.l Object obj) {
                this.$transform.invoke((kotlinx.coroutines.flow.j) this.L$0, (Object[]) this.L$1, this);
                return r2.f19517a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public s(kotlinx.coroutines.flow.i<? extends T>[] iVarArr, v3.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super kotlin.coroutines.d<? super r2>, ? extends Object> qVar, kotlin.coroutines.d<? super s> dVar) {
            super(2, dVar);
            this.$flows = iVarArr;
            this.$transform = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            s sVar = new s(this.$flows, this.$transform, dVar);
            sVar.L$0 = obj;
            return sVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l kotlinx.coroutines.flow.j<? super R> jVar, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((s) create(jVar, dVar)).invokeSuspend(r2.f19517a);
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
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.L$0;
                kotlinx.coroutines.flow.i<T>[] iVarArr = this.$flows;
                v3.a a5 = b0.a();
                kotlin.jvm.internal.l0.w();
                a aVar = new a(this.$transform, null);
                this.label = 1;
                if (kotlinx.coroutines.flow.internal.m.a(jVar, iVarArr, a5, aVar, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }

        @p4.m
        public final Object invokeSuspend$$forInline(@p4.l Object obj) {
            kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.L$0;
            kotlinx.coroutines.flow.i<T>[] iVarArr = this.$flows;
            v3.a a5 = b0.a();
            kotlin.jvm.internal.l0.w();
            a aVar = new a(this.$transform, null);
            kotlin.jvm.internal.i0.e(0);
            kotlinx.coroutines.flow.internal.m.a(jVar, iVarArr, a5, aVar, this);
            kotlin.jvm.internal.i0.e(1);
            return r2.f19517a;
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/x$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/r2;", "collect", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,112:1\n262#2,2:113\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class t<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: a */
        final /* synthetic */ kotlinx.coroutines.flow.i[] f20082a;

        /* renamed from: b */
        final /* synthetic */ v3.p f20083b;

        @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,112:1\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {
            int label;
            /* synthetic */ Object result;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.m
            public final Object invokeSuspend(@p4.l Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return t.this.collect(null, this);
            }
        }

        public t(kotlinx.coroutines.flow.i[] iVarArr, v3.p pVar) {
            this.f20082a = iVarArr;
            this.f20083b = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @p4.m
        public Object collect(@p4.l kotlinx.coroutines.flow.j<? super R> jVar, @p4.l kotlin.coroutines.d<? super r2> dVar) {
            Object l5;
            kotlinx.coroutines.flow.i[] iVarArr = this.f20082a;
            v3.a a5 = b0.a();
            kotlin.jvm.internal.l0.w();
            Object a6 = kotlinx.coroutines.flow.internal.m.a(jVar, iVarArr, a5, new u(this.f20083b, null), dVar);
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (a6 == l5) {
                return a6;
            }
            return r2.f19517a;
        }

        @p4.m
        public Object e(@p4.l kotlinx.coroutines.flow.j jVar, @p4.l kotlin.coroutines.d dVar) {
            kotlin.jvm.internal.i0.e(4);
            new a(dVar);
            kotlin.jvm.internal.i0.e(5);
            kotlinx.coroutines.flow.i[] iVarArr = this.f20082a;
            v3.a a5 = b0.a();
            kotlin.jvm.internal.l0.w();
            u uVar = new u(this.f20083b, null);
            kotlin.jvm.internal.i0.e(0);
            kotlinx.coroutines.flow.internal.m.a(jVar, iVarArr, a5, uVar, dVar);
            kotlin.jvm.internal.i0.e(1);
            return r2.f19517a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineUnsafe$1$1", f = "Zip.kt", i = {}, l = {262, 262}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1\n*L\n1#1,332:1\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class u<R, T> extends kotlin.coroutines.jvm.internal.o implements v3.q<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ v3.p<T[], kotlin.coroutines.d<? super R>, Object> $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public u(v3.p<? super T[], ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar, kotlin.coroutines.d<? super u> dVar) {
            super(3, dVar);
            this.$transform = pVar;
        }

        @Override // v3.q
        @p4.m
        public final Object invoke(@p4.l kotlinx.coroutines.flow.j<? super R> jVar, @p4.l T[] tArr, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            kotlin.jvm.internal.l0.w();
            u uVar = new u(this.$transform, dVar);
            uVar.L$0 = jVar;
            uVar.L$1 = tArr;
            return uVar.invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            kotlinx.coroutines.flow.j jVar;
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
                kotlinx.coroutines.flow.j jVar2 = (kotlinx.coroutines.flow.j) this.L$0;
                e1.n(obj);
                jVar = jVar2;
            } else {
                e1.n(obj);
                kotlinx.coroutines.flow.j jVar3 = (kotlinx.coroutines.flow.j) this.L$0;
                Object[] objArr = (Object[]) this.L$1;
                v3.p<T[], kotlin.coroutines.d<? super R>, Object> pVar = this.$transform;
                this.L$0 = jVar3;
                this.label = 1;
                obj = pVar.invoke(objArr, this);
                jVar = jVar3;
                if (obj == l5) {
                    return l5;
                }
            }
            this.L$0 = null;
            this.label = 2;
            if (jVar.emit(obj, this) == l5) {
                return l5;
            }
            return r2.f19517a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @p4.m
        public final Object invokeSuspend$$forInline(@p4.l Object obj) {
            kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.L$0;
            Object invoke = this.$transform.invoke((Object[]) this.L$1, this);
            kotlin.jvm.internal.i0.e(0);
            jVar.emit(invoke, this);
            kotlin.jvm.internal.i0.e(1);
            return r2.f19517a;
        }
    }

    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class v extends kotlin.jvm.internal.n0 implements v3.a {
        public static final v INSTANCE = new v();

        v() {
            super(0);
        }

        @Override // v3.a
        @p4.m
        public final Void invoke() {
            return null;
        }
    }

    public static final /* synthetic */ v3.a a() {
        return r();
    }

    public static final /* synthetic */ <T, R> kotlinx.coroutines.flow.i<R> b(Iterable<? extends kotlinx.coroutines.flow.i<? extends T>> iterable, v3.p<? super T[], ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar) {
        List S5;
        S5 = kotlin.collections.e0.S5(iterable);
        kotlinx.coroutines.flow.i[] iVarArr = (kotlinx.coroutines.flow.i[]) S5.toArray(new kotlinx.coroutines.flow.i[0]);
        kotlin.jvm.internal.l0.w();
        return new f(iVarArr, pVar);
    }

    @p4.l
    public static final <T1, T2, T3, T4, T5, R> kotlinx.coroutines.flow.i<R> c(@p4.l kotlinx.coroutines.flow.i<? extends T1> iVar, @p4.l kotlinx.coroutines.flow.i<? extends T2> iVar2, @p4.l kotlinx.coroutines.flow.i<? extends T3> iVar3, @p4.l kotlinx.coroutines.flow.i<? extends T4> iVar4, @p4.l kotlinx.coroutines.flow.i<? extends T5> iVar5, @p4.l v3.t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.d<? super R>, ? extends Object> tVar) {
        return new c(new kotlinx.coroutines.flow.i[]{iVar, iVar2, iVar3, iVar4, iVar5}, tVar);
    }

    @p4.l
    public static final <T1, T2, T3, T4, R> kotlinx.coroutines.flow.i<R> d(@p4.l kotlinx.coroutines.flow.i<? extends T1> iVar, @p4.l kotlinx.coroutines.flow.i<? extends T2> iVar2, @p4.l kotlinx.coroutines.flow.i<? extends T3> iVar3, @p4.l kotlinx.coroutines.flow.i<? extends T4> iVar4, @p4.l v3.s<? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.d<? super R>, ? extends Object> sVar) {
        return new b(new kotlinx.coroutines.flow.i[]{iVar, iVar2, iVar3, iVar4}, sVar);
    }

    @p4.l
    public static final <T1, T2, T3, R> kotlinx.coroutines.flow.i<R> e(@p4.l kotlinx.coroutines.flow.i<? extends T1> iVar, @p4.l kotlinx.coroutines.flow.i<? extends T2> iVar2, @p4.l kotlinx.coroutines.flow.i<? extends T3> iVar3, @kotlin.b @p4.l v3.r<? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.d<? super R>, ? extends Object> rVar) {
        return new a(new kotlinx.coroutines.flow.i[]{iVar, iVar2, iVar3}, rVar);
    }

    @p4.l
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> f(@p4.l kotlinx.coroutines.flow.i<? extends T1> iVar, @p4.l kotlinx.coroutines.flow.i<? extends T2> iVar2, @p4.l v3.q<? super T1, ? super T2, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar) {
        return kotlinx.coroutines.flow.k.K0(iVar, iVar2, qVar);
    }

    public static final /* synthetic */ <T, R> kotlinx.coroutines.flow.i<R> g(kotlinx.coroutines.flow.i<? extends T>[] iVarArr, v3.p<? super T[], ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar) {
        kotlin.jvm.internal.l0.w();
        return new e(iVarArr, pVar);
    }

    public static final /* synthetic */ <T, R> kotlinx.coroutines.flow.i<R> h(Iterable<? extends kotlinx.coroutines.flow.i<? extends T>> iterable, @kotlin.b v3.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super kotlin.coroutines.d<? super r2>, ? extends Object> qVar) {
        List S5;
        S5 = kotlin.collections.e0.S5(iterable);
        kotlinx.coroutines.flow.i[] iVarArr = (kotlinx.coroutines.flow.i[]) S5.toArray(new kotlinx.coroutines.flow.i[0]);
        kotlin.jvm.internal.l0.w();
        return kotlinx.coroutines.flow.k.J0(new r(iVarArr, qVar, null));
    }

    @p4.l
    public static final <T1, T2, T3, T4, T5, R> kotlinx.coroutines.flow.i<R> i(@p4.l kotlinx.coroutines.flow.i<? extends T1> iVar, @p4.l kotlinx.coroutines.flow.i<? extends T2> iVar2, @p4.l kotlinx.coroutines.flow.i<? extends T3> iVar3, @p4.l kotlinx.coroutines.flow.i<? extends T4> iVar4, @p4.l kotlinx.coroutines.flow.i<? extends T5> iVar5, @kotlin.b @p4.l v3.u<? super kotlinx.coroutines.flow.j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.d<? super r2>, ? extends Object> uVar) {
        return kotlinx.coroutines.flow.k.J0(new p(new kotlinx.coroutines.flow.i[]{iVar, iVar2, iVar3, iVar4, iVar5}, null, uVar));
    }

    @p4.l
    public static final <T1, T2, T3, T4, R> kotlinx.coroutines.flow.i<R> j(@p4.l kotlinx.coroutines.flow.i<? extends T1> iVar, @p4.l kotlinx.coroutines.flow.i<? extends T2> iVar2, @p4.l kotlinx.coroutines.flow.i<? extends T3> iVar3, @p4.l kotlinx.coroutines.flow.i<? extends T4> iVar4, @kotlin.b @p4.l v3.t<? super kotlinx.coroutines.flow.j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.d<? super r2>, ? extends Object> tVar) {
        return kotlinx.coroutines.flow.k.J0(new o(new kotlinx.coroutines.flow.i[]{iVar, iVar2, iVar3, iVar4}, null, tVar));
    }

    @p4.l
    public static final <T1, T2, T3, R> kotlinx.coroutines.flow.i<R> k(@p4.l kotlinx.coroutines.flow.i<? extends T1> iVar, @p4.l kotlinx.coroutines.flow.i<? extends T2> iVar2, @p4.l kotlinx.coroutines.flow.i<? extends T3> iVar3, @kotlin.b @p4.l v3.s<? super kotlinx.coroutines.flow.j<? super R>, ? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.d<? super r2>, ? extends Object> sVar) {
        return kotlinx.coroutines.flow.k.J0(new n(new kotlinx.coroutines.flow.i[]{iVar, iVar2, iVar3}, null, sVar));
    }

    @p4.l
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> l(@p4.l kotlinx.coroutines.flow.i<? extends T1> iVar, @p4.l kotlinx.coroutines.flow.i<? extends T2> iVar2, @kotlin.b @p4.l v3.r<? super kotlinx.coroutines.flow.j<? super R>, ? super T1, ? super T2, ? super kotlin.coroutines.d<? super r2>, ? extends Object> rVar) {
        return kotlinx.coroutines.flow.k.J0(new m(new kotlinx.coroutines.flow.i[]{iVar, iVar2}, null, rVar));
    }

    public static final /* synthetic */ <T, R> kotlinx.coroutines.flow.i<R> m(kotlinx.coroutines.flow.i<? extends T>[] iVarArr, @kotlin.b v3.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super kotlin.coroutines.d<? super r2>, ? extends Object> qVar) {
        kotlin.jvm.internal.l0.w();
        return kotlinx.coroutines.flow.k.J0(new q(iVarArr, qVar, null));
    }

    private static final /* synthetic */ <T, R> kotlinx.coroutines.flow.i<R> n(kotlinx.coroutines.flow.i<? extends T>[] iVarArr, @kotlin.b v3.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super kotlin.coroutines.d<? super r2>, ? extends Object> qVar) {
        kotlin.jvm.internal.l0.w();
        return kotlinx.coroutines.flow.k.J0(new s(iVarArr, qVar, null));
    }

    private static final /* synthetic */ <T, R> kotlinx.coroutines.flow.i<R> o(kotlinx.coroutines.flow.i<? extends T>[] iVarArr, v3.p<? super T[], ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar) {
        kotlin.jvm.internal.l0.w();
        return new t(iVarArr, pVar);
    }

    @p4.l
    @u3.h(name = "flowCombine")
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> p(@p4.l kotlinx.coroutines.flow.i<? extends T1> iVar, @p4.l kotlinx.coroutines.flow.i<? extends T2> iVar2, @p4.l v3.q<? super T1, ? super T2, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar) {
        return new d(iVar, iVar2, qVar);
    }

    @p4.l
    @u3.h(name = "flowCombineTransform")
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> q(@p4.l kotlinx.coroutines.flow.i<? extends T1> iVar, @p4.l kotlinx.coroutines.flow.i<? extends T2> iVar2, @kotlin.b @p4.l v3.r<? super kotlinx.coroutines.flow.j<? super R>, ? super T1, ? super T2, ? super kotlin.coroutines.d<? super r2>, ? extends Object> rVar) {
        return kotlinx.coroutines.flow.k.J0(new l(new kotlinx.coroutines.flow.i[]{iVar, iVar2}, null, rVar));
    }

    private static final <T> v3.a<T[]> r() {
        return v.INSTANCE;
    }

    @p4.l
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> s(@p4.l kotlinx.coroutines.flow.i<? extends T1> iVar, @p4.l kotlinx.coroutines.flow.i<? extends T2> iVar2, @p4.l v3.q<? super T1, ? super T2, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar) {
        return kotlinx.coroutines.flow.internal.m.b(iVar, iVar2, qVar);
    }
}
