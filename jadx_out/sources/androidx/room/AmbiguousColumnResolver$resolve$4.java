package androidx.room;

import androidx.room.AmbiguousColumnResolver;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;

@i0(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Landroidx/room/AmbiguousColumnResolver$Match;", "it", "Lkotlin/r2;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class AmbiguousColumnResolver$resolve$4 extends n0 implements v3.l<List<? extends AmbiguousColumnResolver.Match>, r2> {
    final /* synthetic */ k1.h<AmbiguousColumnResolver.Solution> $bestSolution;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmbiguousColumnResolver$resolve$4(k1.h<AmbiguousColumnResolver.Solution> hVar) {
        super(1);
        this.$bestSolution = hVar;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(List<? extends AmbiguousColumnResolver.Match> list) {
        invoke2((List<AmbiguousColumnResolver.Match>) list);
        return r2.f19517a;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.room.AmbiguousColumnResolver$Solution] */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l List<AmbiguousColumnResolver.Match> it) {
        l0.p(it, "it");
        ?? build = AmbiguousColumnResolver.Solution.Companion.build(it);
        if (build.compareTo(this.$bestSolution.element) < 0) {
            this.$bestSolution.element = build;
        }
    }
}
