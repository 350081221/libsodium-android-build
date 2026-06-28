package androidx.compose.runtime.saveable;

import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.Arrays;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import t0.b;
import v3.a;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003BG\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00028\u0000\u0012\u0010\u0010\u000f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u000e¢\u0006\u0004\b$\u0010\u0011J\b\u0010\u0005\u001a\u00020\u0004H\u0002JM\u0010\u0010\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0010\u0010\u000f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0007H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J!\u0010\u0017\u001a\u0004\u0018\u00018\u00002\u0010\u0010\u000f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u000e¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001bR\u0016\u0010\r\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001cR \u0010\u000f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableHolder;", "T", "Landroidx/compose/runtime/saveable/SaverScope;", "Landroidx/compose/runtime/RememberObserver;", "Lkotlin/r2;", "register", "Landroidx/compose/runtime/saveable/Saver;", "", "saver", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "registry", "", DatabaseFileArchive.COLUMN_KEY, b.f22420d, "", "inputs", "update", "(Landroidx/compose/runtime/saveable/Saver;Landroidx/compose/runtime/saveable/SaveableStateRegistry;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V", "", "canBeSaved", "onRemembered", "onForgotten", "onAbandoned", "getValueIfInputsDidntChange", "([Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "Ljava/lang/String;", "Ljava/lang/Object;", "[Ljava/lang/Object;", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "entry", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "Lkotlin/Function0;", "valueProvider", "Lv3/a;", "<init>", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nRememberSaveable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/SaveableHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,271:1\n1#2:272\n*E\n"})
/* loaded from: classes.dex */
public final class SaveableHolder<T> implements SaverScope, RememberObserver {

    @m
    private SaveableStateRegistry.Entry entry;

    @l
    private Object[] inputs;

    @l
    private String key;

    @m
    private SaveableStateRegistry registry;

    @l
    private Saver<T, Object> saver;
    private T value;

    @l
    private final a<Object> valueProvider = new SaveableHolder$valueProvider$1(this);

    public SaveableHolder(@l Saver<T, Object> saver, @m SaveableStateRegistry saveableStateRegistry, @l String str, T t5, @l Object[] objArr) {
        this.saver = saver;
        this.registry = saveableStateRegistry;
        this.key = str;
        this.value = t5;
        this.inputs = objArr;
    }

    private final void register() {
        boolean z4;
        SaveableStateRegistry saveableStateRegistry = this.registry;
        if (this.entry == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (saveableStateRegistry != null) {
                RememberSaveableKt.requireCanBeSaved(saveableStateRegistry, this.valueProvider.invoke());
                this.entry = saveableStateRegistry.registerProvider(this.key, this.valueProvider);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("entry(" + this.entry + ") is not null").toString());
    }

    @Override // androidx.compose.runtime.saveable.SaverScope
    public boolean canBeSaved(@l Object obj) {
        SaveableStateRegistry saveableStateRegistry = this.registry;
        if (saveableStateRegistry != null && !saveableStateRegistry.canBeSaved(obj)) {
            return false;
        }
        return true;
    }

    @m
    public final T getValueIfInputsDidntChange(@l Object[] objArr) {
        if (Arrays.equals(objArr, this.inputs)) {
            return this.value;
        }
        return null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        SaveableStateRegistry.Entry entry = this.entry;
        if (entry != null) {
            entry.unregister();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        SaveableStateRegistry.Entry entry = this.entry;
        if (entry != null) {
            entry.unregister();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        register();
    }

    public final void update(@l Saver<T, Object> saver, @m SaveableStateRegistry saveableStateRegistry, @l String str, T t5, @l Object[] objArr) {
        boolean z4;
        boolean z5 = true;
        if (this.registry != saveableStateRegistry) {
            this.registry = saveableStateRegistry;
            z4 = true;
        } else {
            z4 = false;
        }
        if (!l0.g(this.key, str)) {
            this.key = str;
        } else {
            z5 = z4;
        }
        this.saver = saver;
        this.value = t5;
        this.inputs = objArr;
        SaveableStateRegistry.Entry entry = this.entry;
        if (entry != null && z5) {
            if (entry != null) {
                entry.unregister();
            }
            this.entry = null;
            register();
        }
    }
}
