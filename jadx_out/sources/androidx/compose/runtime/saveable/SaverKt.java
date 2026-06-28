package androidx.compose.runtime.saveable;

import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;
import t0.b;
import v3.p;

@i0(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aw\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012.\u0010\t\u001a*\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0003¢\u0006\u0002\b\b2#\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0006\u0012\u0004\u0018\u00018\u00000\n\u001a\u0018\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\f\"\u0004\b\u0000\u0010\u000e\"\"\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Original", "", "Saveable", "Lkotlin/Function2;", "Landroidx/compose/runtime/saveable/SaverScope;", "Lkotlin/v0;", "name", b.f22420d, "Lkotlin/u;", "save", "Lkotlin/Function1;", "restore", "Landroidx/compose/runtime/saveable/Saver;", "Saver", "T", "autoSaver", "AutoSaver", "Landroidx/compose/runtime/saveable/Saver;", "runtime-saveable_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SaverKt {

    @l
    private static final Saver<Object, Object> AutoSaver = Saver(SaverKt$AutoSaver$1.INSTANCE, SaverKt$AutoSaver$2.INSTANCE);

    @l
    public static final <Original, Saveable> Saver<Original, Saveable> Saver(@l final p<? super SaverScope, ? super Original, ? extends Saveable> pVar, @l final v3.l<? super Saveable, ? extends Original> lVar) {
        return new Saver<Original, Saveable>() { // from class: androidx.compose.runtime.saveable.SaverKt$Saver$1
            @Override // androidx.compose.runtime.saveable.Saver
            @m
            public Original restore(@l Saveable saveable) {
                return lVar.invoke(saveable);
            }

            @Override // androidx.compose.runtime.saveable.Saver
            @m
            public Saveable save(@l SaverScope saverScope, Original original) {
                return pVar.invoke(saverScope, original);
            }
        };
    }

    @l
    public static final <T> Saver<T, Object> autoSaver() {
        Saver<T, Object> saver = (Saver<T, Object>) AutoSaver;
        l0.n(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>");
        return saver;
    }
}
