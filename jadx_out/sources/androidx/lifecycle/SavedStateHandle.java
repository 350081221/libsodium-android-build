package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.core.os.BundleKt;
import androidx.savedstate.SavedStateRegistry;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.a1;
import kotlin.collections.m1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.q1;
import kotlinx.coroutines.flow.e0;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.t0;
import kotlinx.coroutines.flow.v0;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import u3.m;

@i0(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\u0018\u0000 -2\u00020\u0001:\u0002-.B\u001f\b\u0016\u0012\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010(¢\u0006\u0004\b*\u0010+B\t\b\u0016¢\u0006\u0004\b*\u0010,J3\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0007J\u0011\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0087\u0002J\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J+\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013H\u0007J \u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u0019\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00018\u0000H\u0087\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001b\u0010\u0016J\u0018\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u000bH\u0007J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0003H\u0007R\"\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R$\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030#0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010!R(\u0010&\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010%0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010!R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010'¨\u0006/"}, d2 = {"Landroidx/lifecycle/SavedStateHandle;", "", "T", "", DatabaseFileArchive.COLUMN_KEY, "", "hasInitialValue", "initialValue", "Landroidx/lifecycle/MutableLiveData;", "getLiveDataInternal", "(Ljava/lang/String;ZLjava/lang/Object;)Landroidx/lifecycle/MutableLiveData;", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "savedStateProvider", "contains", "getLiveData", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/lifecycle/MutableLiveData;", "Lkotlinx/coroutines/flow/t0;", "getStateFlow", "(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/t0;", "", SavedStateHandle.KEYS, "get", "(Ljava/lang/String;)Ljava/lang/Object;", t0.b.f22420d, "Lkotlin/r2;", "set", "(Ljava/lang/String;Ljava/lang/Object;)V", "remove", "provider", "setSavedStateProvider", "clearSavedStateProvider", "", "regular", "Ljava/util/Map;", "savedStateProviders", "Landroidx/lifecycle/SavedStateHandle$SavingStateLiveData;", "liveDatas", "Lkotlinx/coroutines/flow/e0;", "flows", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "", "initialState", "<init>", "(Ljava/util/Map;)V", "()V", "Companion", "SavingStateLiveData", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSavedStateHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandle.kt\nandroidx/lifecycle/SavedStateHandle\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,489:1\n361#2,3:490\n364#2,4:494\n1#3:493\n*S KotlinDebug\n*F\n+ 1 SavedStateHandle.kt\nandroidx/lifecycle/SavedStateHandle\n*L\n227#1:490,3\n227#1:494,4\n*E\n"})
/* loaded from: classes2.dex */
public final class SavedStateHandle {

    @l
    private static final String KEYS = "keys";

    @l
    private static final String VALUES = "values";

    @l
    private final Map<String, e0<Object>> flows;

    @l
    private final Map<String, SavingStateLiveData<?>> liveDatas;

    @l
    private final Map<String, Object> regular;

    @l
    private final SavedStateRegistry.SavedStateProvider savedStateProvider;

    @l
    private final Map<String, SavedStateRegistry.SavedStateProvider> savedStateProviders;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final Class<? extends Object>[] ACCEPTABLE_CLASSES = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    @i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0007R \u0010\u0003\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/lifecycle/SavedStateHandle$Companion;", "", "()V", "ACCEPTABLE_CLASSES", "", "Ljava/lang/Class;", "[Ljava/lang/Class;", "KEYS", "", "VALUES", "createHandle", "Landroidx/lifecycle/SavedStateHandle;", "restoredState", "Landroid/os/Bundle;", "defaultState", "validateValue", "", t0.b.f22420d, "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @m
        public final SavedStateHandle createHandle(@p4.m Bundle bundle, @p4.m Bundle bundle2) {
            boolean z4;
            if (bundle == null) {
                if (bundle2 == null) {
                    return new SavedStateHandle();
                }
                HashMap hashMap = new HashMap();
                for (String key : bundle2.keySet()) {
                    l0.o(key, "key");
                    hashMap.put(key, bundle2.get(key));
                }
                return new SavedStateHandle(hashMap);
            }
            ClassLoader classLoader = SavedStateHandle.class.getClassLoader();
            l0.m(classLoader);
            bundle.setClassLoader(classLoader);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(SavedStateHandle.KEYS);
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(SavedStateHandle.VALUES);
            if (parcelableArrayList != null && parcelableArrayList2 != null && parcelableArrayList.size() == parcelableArrayList2.size()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int size = parcelableArrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    Object obj = parcelableArrayList.get(i5);
                    l0.n(obj, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put((String) obj, parcelableArrayList2.get(i5));
                }
                return new SavedStateHandle(linkedHashMap);
            }
            throw new IllegalStateException("Invalid bundle passed as restored state".toString());
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final boolean validateValue(@p4.m Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : SavedStateHandle.ACCEPTABLE_CLASSES) {
                l0.m(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    public SavedStateHandle(@l Map<String, ? extends Object> initialState) {
        l0.p(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.regular = linkedHashMap;
        this.savedStateProviders = new LinkedHashMap();
        this.liveDatas = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.savedStateProvider = new SavedStateRegistry.SavedStateProvider() { // from class: androidx.lifecycle.j
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                Bundle savedStateProvider$lambda$0;
                savedStateProvider$lambda$0 = SavedStateHandle.savedStateProvider$lambda$0(SavedStateHandle.this);
                return savedStateProvider$lambda$0;
            }
        };
        linkedHashMap.putAll(initialState);
    }

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @m
    public static final SavedStateHandle createHandle(@p4.m Bundle bundle, @p4.m Bundle bundle2) {
        return Companion.createHandle(bundle, bundle2);
    }

    private final <T> MutableLiveData<T> getLiveDataInternal(String str, boolean z4, T t5) {
        SavingStateLiveData<?> savingStateLiveData;
        SavingStateLiveData<?> savingStateLiveData2;
        SavingStateLiveData<?> savingStateLiveData3 = this.liveDatas.get(str);
        if (savingStateLiveData3 instanceof MutableLiveData) {
            savingStateLiveData = savingStateLiveData3;
        } else {
            savingStateLiveData = null;
        }
        if (savingStateLiveData != null) {
            return savingStateLiveData;
        }
        if (this.regular.containsKey(str)) {
            savingStateLiveData2 = new SavingStateLiveData<>(this, str, this.regular.get(str));
        } else if (z4) {
            this.regular.put(str, t5);
            savingStateLiveData2 = new SavingStateLiveData<>(this, str, t5);
        } else {
            savingStateLiveData2 = new SavingStateLiveData<>(this, str);
        }
        this.liveDatas.put(str, savingStateLiveData2);
        return savingStateLiveData2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle savedStateProvider$lambda$0(SavedStateHandle this$0) {
        Map D0;
        l0.p(this$0, "this$0");
        D0 = a1.D0(this$0.savedStateProviders);
        for (Map.Entry entry : D0.entrySet()) {
            this$0.set((String) entry.getKey(), ((SavedStateRegistry.SavedStateProvider) entry.getValue()).saveState());
        }
        Set<String> keySet = this$0.regular.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(this$0.regular.get(str));
        }
        return BundleKt.bundleOf(q1.a(KEYS, arrayList), q1.a(VALUES, arrayList2));
    }

    @MainThread
    public final void clearSavedStateProvider(@l String key) {
        l0.p(key, "key");
        this.savedStateProviders.remove(key);
    }

    @MainThread
    public final boolean contains(@l String key) {
        l0.p(key, "key");
        return this.regular.containsKey(key);
    }

    @MainThread
    @p4.m
    public final <T> T get(@l String key) {
        l0.p(key, "key");
        try {
            return (T) this.regular.get(key);
        } catch (ClassCastException unused) {
            remove(key);
            return null;
        }
    }

    @l
    @MainThread
    public final <T> MutableLiveData<T> getLiveData(@l String key) {
        l0.p(key, "key");
        MutableLiveData<T> liveDataInternal = getLiveDataInternal(key, false, null);
        l0.n(liveDataInternal, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<T of androidx.lifecycle.SavedStateHandle.getLiveData>");
        return liveDataInternal;
    }

    @l
    @MainThread
    public final <T> t0<T> getStateFlow(@l String key, T t5) {
        l0.p(key, "key");
        Map<String, e0<Object>> map = this.flows;
        e0<Object> e0Var = map.get(key);
        if (e0Var == null) {
            if (!this.regular.containsKey(key)) {
                this.regular.put(key, t5);
            }
            e0Var = v0.a(this.regular.get(key));
            this.flows.put(key, e0Var);
            map.put(key, e0Var);
        }
        t0<T> m5 = k.m(e0Var);
        l0.n(m5, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<T of androidx.lifecycle.SavedStateHandle.getStateFlow>");
        return m5;
    }

    @l
    @MainThread
    public final Set<String> keys() {
        Set C;
        Set<String> C2;
        C = m1.C(this.regular.keySet(), this.savedStateProviders.keySet());
        C2 = m1.C(C, this.liveDatas.keySet());
        return C2;
    }

    @MainThread
    @p4.m
    public final <T> T remove(@l String key) {
        l0.p(key, "key");
        T t5 = (T) this.regular.remove(key);
        SavingStateLiveData<?> remove = this.liveDatas.remove(key);
        if (remove != null) {
            remove.detach();
        }
        this.flows.remove(key);
        return t5;
    }

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final SavedStateRegistry.SavedStateProvider savedStateProvider() {
        return this.savedStateProvider;
    }

    @MainThread
    public final <T> void set(@l String key, @p4.m T t5) {
        SavingStateLiveData<?> savingStateLiveData;
        l0.p(key, "key");
        if (Companion.validateValue(t5)) {
            SavingStateLiveData<?> savingStateLiveData2 = this.liveDatas.get(key);
            if (savingStateLiveData2 instanceof MutableLiveData) {
                savingStateLiveData = savingStateLiveData2;
            } else {
                savingStateLiveData = null;
            }
            if (savingStateLiveData != null) {
                savingStateLiveData.setValue(t5);
            } else {
                this.regular.put(key, t5);
            }
            e0<Object> e0Var = this.flows.get(key);
            if (e0Var != null) {
                e0Var.setValue(t5);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't put value with type ");
        l0.m(t5);
        sb.append(t5.getClass());
        sb.append(" into saved state");
        throw new IllegalArgumentException(sb.toString());
    }

    @MainThread
    public final void setSavedStateProvider(@l String key, @l SavedStateRegistry.SavedStateProvider provider) {
        l0.p(key, "key");
        l0.p(provider, "provider");
        this.savedStateProviders.put(key, provider);
    }

    @l
    @MainThread
    public final <T> MutableLiveData<T> getLiveData(@l String key, T t5) {
        l0.p(key, "key");
        return getLiveDataInternal(key, true, t5);
    }

    @i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fB\u001b\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u0010J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Landroidx/lifecycle/SavedStateHandle$SavingStateLiveData;", "T", "Landroidx/lifecycle/MutableLiveData;", t0.b.f22420d, "Lkotlin/r2;", "setValue", "(Ljava/lang/Object;)V", "detach", "", DatabaseFileArchive.COLUMN_KEY, "Ljava/lang/String;", "Landroidx/lifecycle/SavedStateHandle;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;)V", "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class SavingStateLiveData<T> extends MutableLiveData<T> {

        @p4.m
        private SavedStateHandle handle;

        @l
        private String key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavingStateLiveData(@p4.m SavedStateHandle savedStateHandle, @l String key, T t5) {
            super(t5);
            l0.p(key, "key");
            this.key = key;
            this.handle = savedStateHandle;
        }

        public final void detach() {
            this.handle = null;
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(T t5) {
            SavedStateHandle savedStateHandle = this.handle;
            if (savedStateHandle != null) {
                savedStateHandle.regular.put(this.key, t5);
                e0 e0Var = (e0) savedStateHandle.flows.get(this.key);
                if (e0Var != null) {
                    e0Var.setValue(t5);
                }
            }
            super.setValue(t5);
        }

        public SavingStateLiveData(@p4.m SavedStateHandle savedStateHandle, @l String key) {
            l0.p(key, "key");
            this.key = key;
            this.handle = savedStateHandle;
        }
    }

    public SavedStateHandle() {
        this.regular = new LinkedHashMap();
        this.savedStateProviders = new LinkedHashMap();
        this.liveDatas = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.savedStateProvider = new SavedStateRegistry.SavedStateProvider() { // from class: androidx.lifecycle.j
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                Bundle savedStateProvider$lambda$0;
                savedStateProvider$lambda$0 = SavedStateHandle.savedStateProvider$lambda$0(SavedStateHandle.this);
                return savedStateProvider$lambda$0;
            }
        };
    }
}
