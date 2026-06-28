package androidx.compose.runtime;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import v3.p;
import v3.q;
import v3.r;
import v3.s;
import v3.t;

@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a+\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a=\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002\"\u0004\b\u0000\u0010\u00062\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0004\b\u0004\u0010\b\u001aO\u0010\u0004\u001a\u0019\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\u0002\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n2\u001d\u0010\u0003\u001a\u0019\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\u0002¢\u0006\u0004\b\u0004\u0010\f\u001aa\u0010\u0004\u001a\u001f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u0002\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n\"\u0004\b\u0002\u0010\r2#\u0010\u0003\u001a\u001f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u0002¢\u0006\u0004\b\u0004\u0010\u000f\u001as\u0010\u0004\u001a%\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0002\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n\"\u0004\b\u0002\u0010\r\"\u0004\b\u0003\u0010\u00102)\u0010\u0003\u001a%\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0002¢\u0006\u0004\b\u0004\u0010\u0012\u001aG\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u0014\"\u0004\b\u0000\u0010\u00132\u001c\u0010\u0003\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u0014¢\u0006\u0004\b\u0015\u0010\b\u001aY\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u0014\"\u0004\b\u0000\u0010\u0013\"\u0004\b\u0001\u0010\u00062\"\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u0014¢\u0006\u0004\b\u0015\u0010\f\u001ak\u0010\u0015\u001a$\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u0014\"\u0004\b\u0000\u0010\u0013\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\n2(\u0010\u0003\u001a$\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u0014¢\u0006\u0004\b\u0015\u0010\u000f\u001a}\u0010\u0015\u001a*\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u0014\"\u0004\b\u0000\u0010\u0013\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\n\"\u0004\b\u0003\u0010\r2.\u0010\u0003\u001a*\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u0014¢\u0006\u0004\b\u0015\u0010\u0012\"\u0014\u0010\u0017\u001a\u00020\u00168\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "content", "movableContentOf", "(Lv3/p;)Lv3/p;", "P", "Lkotlin/Function1;", "(Lv3/q;)Lv3/q;", "P1", "P2", "Lkotlin/Function2;", "(Lv3/r;)Lv3/r;", "P3", "Lkotlin/Function3;", "(Lv3/s;)Lv3/s;", "P4", "Lkotlin/Function4;", "(Lv3/t;)Lv3/t;", "R", "Lkotlin/u;", "movableContentWithReceiverOf", "", "movableContentKey", "I", "runtime_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MovableContentKt {
    public static final int movableContentKey = 126665345;

    @l
    public static final p<Composer, Integer, r2> movableContentOf(@l p<? super Composer, ? super Integer, r2> pVar) {
        return ComposableLambdaKt.composableLambdaInstance(-642339857, true, new MovableContentKt$movableContentOf$1(new MovableContent(ComposableLambdaKt.composableLambdaInstance(-1079330685, true, new MovableContentKt$movableContentOf$movableContent$1(pVar)))));
    }

    @l
    @ComposableInferredTarget(scheme = "[0[0]:[_]]")
    public static final <R> q<R, Composer, Integer, r2> movableContentWithReceiverOf(@l q<? super R, ? super Composer, ? super Integer, r2> qVar) {
        return ComposableLambdaKt.composableLambdaInstance(506997506, true, new MovableContentKt$movableContentWithReceiverOf$1(new MovableContent(ComposableLambdaKt.composableLambdaInstance(250838178, true, new MovableContentKt$movableContentWithReceiverOf$movableContent$1(qVar)))));
    }

    @l
    public static final <P> q<P, Composer, Integer, r2> movableContentOf(@l q<? super P, ? super Composer, ? super Integer, r2> qVar) {
        return ComposableLambdaKt.composableLambdaInstance(-434707029, true, new MovableContentKt$movableContentOf$2(new MovableContent(qVar)));
    }

    @l
    public static final <R, P> r<R, P, Composer, Integer, r2> movableContentWithReceiverOf(@l r<? super R, ? super P, ? super Composer, ? super Integer, r2> rVar) {
        return ComposableLambdaKt.composableLambdaInstance(627354118, true, new MovableContentKt$movableContentWithReceiverOf$2(new MovableContent(ComposableLambdaKt.composableLambdaInstance(812082854, true, new MovableContentKt$movableContentWithReceiverOf$movableContent$2(rVar)))));
    }

    @l
    public static final <P1, P2> r<P1, P2, Composer, Integer, r2> movableContentOf(@l r<? super P1, ? super P2, ? super Composer, ? super Integer, r2> rVar) {
        return ComposableLambdaKt.composableLambdaInstance(-1200019734, true, new MovableContentKt$movableContentOf$3(new MovableContent(ComposableLambdaKt.composableLambdaInstance(1849814513, true, new MovableContentKt$movableContentOf$movableContent$2(rVar)))));
    }

    @l
    public static final <R, P1, P2> s<R, P1, P2, Composer, Integer, r2> movableContentWithReceiverOf(@l s<? super R, ? super P1, ? super P2, ? super Composer, ? super Integer, r2> sVar) {
        return ComposableLambdaKt.composableLambdaInstance(583402949, true, new MovableContentKt$movableContentWithReceiverOf$3(new MovableContent(ComposableLambdaKt.composableLambdaInstance(-1322148760, true, new MovableContentKt$movableContentWithReceiverOf$movableContent$3(sVar)))));
    }

    @l
    public static final <P1, P2, P3> s<P1, P2, P3, Composer, Integer, r2> movableContentOf(@l s<? super P1, ? super P2, ? super P3, ? super Composer, ? super Integer, r2> sVar) {
        return ComposableLambdaKt.composableLambdaInstance(-1083870185, true, new MovableContentKt$movableContentOf$4(new MovableContent(ComposableLambdaKt.composableLambdaInstance(-284417101, true, new MovableContentKt$movableContentOf$movableContent$3(sVar)))));
    }

    @l
    public static final <R, P1, P2, P3> t<R, P1, P2, P3, Composer, Integer, r2> movableContentWithReceiverOf(@l t<? super R, ? super P1, ? super P2, ? super P3, ? super Composer, ? super Integer, r2> tVar) {
        return ComposableLambdaKt.composableLambdaInstance(1468683306, true, new MovableContentKt$movableContentWithReceiverOf$4(new MovableContent(ComposableLambdaKt.composableLambdaInstance(838586922, true, new MovableContentKt$movableContentWithReceiverOf$movableContent$4(tVar)))));
    }

    @l
    public static final <P1, P2, P3, P4> t<P1, P2, P3, P4, Composer, Integer, r2> movableContentOf(@l t<? super P1, ? super P2, ? super P3, ? super P4, ? super Composer, ? super Integer, r2> tVar) {
        return ComposableLambdaKt.composableLambdaInstance(-1741877681, true, new MovableContentKt$movableContentOf$5(new MovableContent(ComposableLambdaKt.composableLambdaInstance(1876318581, true, new MovableContentKt$movableContentOf$movableContent$4(tVar)))));
    }
}
