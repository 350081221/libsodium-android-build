package androidx.lifecycle.viewmodel.compose;

import android.os.Bundle;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.core.os.BundleKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.savedstate.SavedStateRegistry;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.properties.e;
import kotlin.properties.f;
import kotlin.q1;
import kotlin.reflect.o;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import u3.h;

@i0(d1 = {"\u00004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aK\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001aJ\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00052\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u0007H\u0007\u001aX\u0010\t\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00028\u00000\u000e0\r\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007\u001ao\u0010\t\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00028\u00000\u00100\r\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\f*\u00020\u00022\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a>\u0010\u0014\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\f0\u0005\"\u0004\b\u0000\u0010\u00012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u0005H\u0002¨\u0006\u0015"}, d2 = {"", "T", "Landroidx/lifecycle/SavedStateHandle;", "", DatabaseFileArchive.COLUMN_KEY, "Landroidx/compose/runtime/saveable/Saver;", "saver", "Lkotlin/Function0;", "init", "saveable", "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Landroidx/compose/runtime/saveable/Saver;Lv3/a;)Ljava/lang/Object;", "stateSaver", "Landroidx/compose/runtime/MutableState;", "Lkotlin/properties/d;", "Lkotlin/properties/e;", "M", "Lkotlin/properties/f;", "saveableMutableState", "(Landroidx/lifecycle/SavedStateHandle;Landroidx/compose/runtime/saveable/Saver;Lv3/a;)Lkotlin/properties/d;", bi.ax, "mutableStateSaver", "lifecycle-viewmodel-compose_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nSavedStateHandleSaver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSaver.kt\nandroidx/lifecycle/viewmodel/compose/SavedStateHandleSaverKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1#2:197\n*E\n"})
/* loaded from: classes2.dex */
public final class SavedStateHandleSaverKt {
    private static final <T> Saver<MutableState<T>, MutableState<Object>> mutableStateSaver(Saver<T, ? extends Object> saver) {
        l0.n(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver, kotlin.Any>");
        return SaverKt.Saver(new SavedStateHandleSaverKt$mutableStateSaver$1$1(saver), new SavedStateHandleSaverKt$mutableStateSaver$1$2(saver));
    }

    @l
    @SavedStateHandleSaveableApi
    /* renamed from: saveable, reason: collision with other method in class */
    public static final <T> T m6407saveable(@l SavedStateHandle savedStateHandle, @l String str, @l final Saver<T, ? extends Object> saver, @l v3.a<? extends T> aVar) {
        final T invoke;
        Object obj;
        l0.n(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.saveable, kotlin.Any>");
        Bundle bundle = (Bundle) savedStateHandle.get(str);
        if (bundle == null || (obj = bundle.get(t0.b.f22420d)) == null || (invoke = saver.restore(obj)) == null) {
            invoke = aVar.invoke();
        }
        savedStateHandle.setSavedStateProvider(str, new SavedStateRegistry.SavedStateProvider() { // from class: androidx.lifecycle.viewmodel.compose.b
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                Bundle saveable$lambda$1;
                saveable$lambda$1 = SavedStateHandleSaverKt.saveable$lambda$1(Saver.this, invoke);
                return saveable$lambda$1;
            }
        });
        return invoke;
    }

    public static /* synthetic */ Object saveable$default(SavedStateHandle savedStateHandle, String str, Saver saver, v3.a aVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            saver = SaverKt.autoSaver();
        }
        return m6407saveable(savedStateHandle, str, saver, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle saveable$lambda$1(Saver saver, Object obj) {
        return BundleKt.bundleOf(q1.a(t0.b.f22420d, saver.save(new SavedStateHandleSaverKt$saveable$1$1$1(SavedStateHandle.Companion), obj)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e saveable$lambda$3(SavedStateHandle savedStateHandle, Saver saver, v3.a aVar, Object obj, o oVar) {
        final Object m6407saveable = m6407saveable(savedStateHandle, oVar.getName(), (Saver<Object, ? extends Object>) saver, (v3.a<? extends Object>) aVar);
        return new e() { // from class: androidx.lifecycle.viewmodel.compose.c
            @Override // kotlin.properties.e
            public final Object getValue(Object obj2, o oVar2) {
                Object saveable$lambda$3$lambda$2;
                saveable$lambda$3$lambda$2 = SavedStateHandleSaverKt.saveable$lambda$3$lambda$2(m6407saveable, obj2, oVar2);
                return saveable$lambda$3$lambda$2;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object saveable$lambda$3$lambda$2(Object obj, Object obj2, o oVar) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f saveable$lambda$4(SavedStateHandle savedStateHandle, Saver saver, v3.a aVar, Object obj, o oVar) {
        final MutableState saveable = saveable(savedStateHandle, oVar.getName(), saver, aVar);
        return new f<Object, T>() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$saveable$3$1
            @Override // kotlin.properties.f, kotlin.properties.e
            @l
            public T getValue(@m Object obj2, @l o<?> oVar2) {
                return saveable.getValue();
            }

            @Override // kotlin.properties.f
            public void setValue(@m Object obj2, @l o<?> oVar2, @l T t5) {
                saveable.setValue(t5);
            }
        };
    }

    @l
    @h(name = "saveableMutableState")
    @SavedStateHandleSaveableApi
    public static final <T, M extends MutableState<T>> kotlin.properties.d<Object, f<Object, T>> saveableMutableState(@l final SavedStateHandle savedStateHandle, @l final Saver<T, ? extends Object> saver, @l final v3.a<? extends M> aVar) {
        return new kotlin.properties.d() { // from class: androidx.lifecycle.viewmodel.compose.a
            @Override // kotlin.properties.d
            public final Object a(Object obj, o oVar) {
                f saveable$lambda$4;
                saveable$lambda$4 = SavedStateHandleSaverKt.saveable$lambda$4(SavedStateHandle.this, saver, aVar, obj, oVar);
                return saveable$lambda$4;
            }
        };
    }

    public static /* synthetic */ kotlin.properties.d saveableMutableState$default(SavedStateHandle savedStateHandle, Saver saver, v3.a aVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            saver = SaverKt.autoSaver();
        }
        return saveableMutableState(savedStateHandle, saver, aVar);
    }

    public static /* synthetic */ kotlin.properties.d saveable$default(SavedStateHandle savedStateHandle, Saver saver, v3.a aVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            saver = SaverKt.autoSaver();
        }
        return saveable(savedStateHandle, saver, aVar);
    }

    @l
    @SavedStateHandleSaveableApi
    public static final <T> MutableState<T> saveable(@l SavedStateHandle savedStateHandle, @l String str, @l Saver<T, ? extends Object> saver, @l v3.a<? extends MutableState<T>> aVar) {
        return (MutableState) m6407saveable(savedStateHandle, str, mutableStateSaver(saver), (v3.a) aVar);
    }

    @l
    @SavedStateHandleSaveableApi
    public static final <T> kotlin.properties.d<Object, e<Object, T>> saveable(@l final SavedStateHandle savedStateHandle, @l final Saver<T, ? extends Object> saver, @l final v3.a<? extends T> aVar) {
        return new kotlin.properties.d() { // from class: androidx.lifecycle.viewmodel.compose.d
            @Override // kotlin.properties.d
            public final Object a(Object obj, o oVar) {
                e saveable$lambda$3;
                saveable$lambda$3 = SavedStateHandleSaverKt.saveable$lambda$3(SavedStateHandle.this, saver, aVar, obj, oVar);
                return saveable$lambda$3;
            }
        };
    }
}
