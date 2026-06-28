package androidx.compose.runtime.saveable;

import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.a1;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.text.e0;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import t0.b;
import v3.a;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B9\u0012\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000e\u0018\u00010\r\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\tH\u0016J\u001c\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000e0\rH\u0016R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R(\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000e0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R.\u0010\u0016\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t0\u00150\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateRegistryImpl;", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "", b.f22420d, "", "canBeSaved", "", DatabaseFileArchive.COLUMN_KEY, "consumeRestored", "Lkotlin/Function0;", "valueProvider", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "registerProvider", "", "", "performSave", "Lkotlin/Function1;", "Lv3/l;", "", "restored", "Ljava/util/Map;", "", "valueProviders", "<init>", "(Ljava/util/Map;Lv3/l;)V", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSaveableStateRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveableStateRegistry.kt\nandroidx/compose/runtime/saveable/SaveableStateRegistryImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,159:1\n1#2:160\n361#3,7:161\n215#4,2:168\n*S KotlinDebug\n*F\n+ 1 SaveableStateRegistry.kt\nandroidx/compose/runtime/saveable/SaveableStateRegistryImpl\n*L\n119#1:161,7\n134#1:168,2\n*E\n"})
/* loaded from: classes.dex */
public final class SaveableStateRegistryImpl implements SaveableStateRegistry {

    @l
    private final v3.l<Object, Boolean> canBeSaved;

    @l
    private final Map<String, List<Object>> restored;

    @l
    private final Map<String, List<a<Object>>> valueProviders;

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        r1 = kotlin.collections.a1.J0(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SaveableStateRegistryImpl(@p4.m java.util.Map<java.lang.String, ? extends java.util.List<? extends java.lang.Object>> r1, @p4.l v3.l<java.lang.Object, java.lang.Boolean> r2) {
        /*
            r0 = this;
            r0.<init>()
            r0.canBeSaved = r2
            if (r1 == 0) goto Ld
            java.util.Map r1 = kotlin.collections.x0.J0(r1)
            if (r1 != 0) goto L12
        Ld:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
        L12:
            r0.restored = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r0.valueProviders = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.saveable.SaveableStateRegistryImpl.<init>(java.util.Map, v3.l):void");
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public boolean canBeSaved(@l Object obj) {
        return this.canBeSaved.invoke(obj).booleanValue();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    @m
    public Object consumeRestored(@l String str) {
        List<Object> remove = this.restored.remove(str);
        if (remove != null && (!remove.isEmpty())) {
            if (remove.size() > 1) {
                this.restored.put(str, remove.subList(1, remove.size()));
            }
            return remove.get(0);
        }
        return null;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    @l
    public Map<String, List<Object>> performSave() {
        Map<String, List<Object>> J0;
        ArrayList r5;
        J0 = a1.J0(this.restored);
        for (Map.Entry<String, List<a<Object>>> entry : this.valueProviders.entrySet()) {
            String key = entry.getKey();
            List<a<Object>> value = entry.getValue();
            if (value.size() == 1) {
                Object invoke = value.get(0).invoke();
                if (invoke == null) {
                    continue;
                } else if (canBeSaved(invoke)) {
                    r5 = w.r(invoke);
                    J0.put(key, r5);
                } else {
                    throw new IllegalStateException("item can't be saved".toString());
                }
            } else {
                int size = value.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i5 = 0; i5 < size; i5++) {
                    Object invoke2 = value.get(i5).invoke();
                    if (invoke2 != null && !canBeSaved(invoke2)) {
                        throw new IllegalStateException("item can't be saved".toString());
                    }
                    arrayList.add(invoke2);
                }
                J0.put(key, arrayList);
            }
        }
        return J0;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    @l
    public SaveableStateRegistry.Entry registerProvider(@l final String str, @l final a<? extends Object> aVar) {
        boolean S1;
        S1 = e0.S1(str);
        if (!S1) {
            Map<String, List<a<Object>>> map = this.valueProviders;
            List<a<Object>> list = map.get(str);
            if (list == null) {
                list = new ArrayList<>();
                map.put(str, list);
            }
            list.add(aVar);
            return new SaveableStateRegistry.Entry() { // from class: androidx.compose.runtime.saveable.SaveableStateRegistryImpl$registerProvider$3
                @Override // androidx.compose.runtime.saveable.SaveableStateRegistry.Entry
                public void unregister() {
                    Map map2;
                    Map map3;
                    map2 = SaveableStateRegistryImpl.this.valueProviders;
                    List list2 = (List) map2.remove(str);
                    if (list2 != null) {
                        list2.remove(aVar);
                    }
                    if (list2 != null && (!list2.isEmpty())) {
                        map3 = SaveableStateRegistryImpl.this.valueProviders;
                        map3.put(str, list2);
                    }
                }
            };
        }
        throw new IllegalArgumentException("Registered key is empty or blank".toString());
    }
}
