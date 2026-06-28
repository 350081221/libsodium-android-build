package androidx.compose.runtime.saveable;

import java.util.List;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.m;
import v3.l;

@i0(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00070\u00050\u0003H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;", "it", "", "", "", "", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SaveableStateHolderImpl$Companion$Saver$2 extends n0 implements l<Map<Object, Map<String, ? extends List<? extends Object>>>, SaveableStateHolderImpl> {
    public static final SaveableStateHolderImpl$Companion$Saver$2 INSTANCE = new SaveableStateHolderImpl$Companion$Saver$2();

    SaveableStateHolderImpl$Companion$Saver$2() {
        super(1);
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ SaveableStateHolderImpl invoke(Map<Object, Map<String, ? extends List<? extends Object>>> map) {
        return invoke2((Map<Object, Map<String, List<Object>>>) map);
    }

    @m
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final SaveableStateHolderImpl invoke2(@p4.l Map<Object, Map<String, List<Object>>> map) {
        return new SaveableStateHolderImpl(map);
    }
}
