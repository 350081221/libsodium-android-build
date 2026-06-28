package androidx.navigation;

import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import p4.l;

@i0(d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¨\u0006\t"}, d2 = {"", "name", "Lkotlin/Function1;", "Landroidx/navigation/NavArgumentBuilder;", "Lkotlin/r2;", "Lkotlin/u;", "builder", "Landroidx/navigation/NamedNavArgument;", "navArgument", "navigation-common_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class NamedNavArgumentKt {
    @l
    public static final NamedNavArgument navArgument(@l String name, @l v3.l<? super NavArgumentBuilder, r2> builder) {
        l0.p(name, "name");
        l0.p(builder, "builder");
        NavArgumentBuilder navArgumentBuilder = new NavArgumentBuilder();
        builder.invoke(navArgumentBuilder);
        return new NamedNavArgument(name, navArgumentBuilder.build());
    }
}
