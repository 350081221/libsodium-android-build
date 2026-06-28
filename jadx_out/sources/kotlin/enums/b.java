package kotlin.enums;

import kotlin.a1;
import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;

@i0(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a2\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00060\u0005H\u0001\u001a1\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"enumEntries", "Lkotlin/enums/EnumEntries;", "E", "", "entriesProvider", "Lkotlin/Function0;", "", "entries", "([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {
    @l
    @g1(version = "1.8")
    @a1
    public static final <E extends Enum<E>> a<E> a(@l v3.a<E[]> entriesProvider) {
        l0.p(entriesProvider, "entriesProvider");
        return new c(entriesProvider.invoke());
    }

    @l
    @g1(version = "1.8")
    @a1
    public static final <E extends Enum<E>> a<E> b(@l E[] entries) {
        l0.p(entries, "entries");
        return new c(entries);
    }
}
