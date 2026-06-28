package com.airbnb.lottie.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import java.util.Arrays;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0015\u001a)\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\"\u0006\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0002\u0010\u0005\u001a=\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0004\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u0002H\u00072\u0006\u0010\t\u001a\u0002H\u00072\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u0003\"\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001a^\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0004\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u0002H\u00072\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u0003\"\u00020\u000b2'\u0010\r\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\u00070\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u0002H\u00070\u000eH\u0007¢\u0006\u0002\u0010\u0013\u001a>\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0015\"\u0004\b\u0000\u0010\u0007*#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\u00070\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u0002H\u00070\u000eH\u0002¢\u0006\u0002\u0010\u0016¨\u0006\u0017²\u00061\u0010\u0018\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\u00070\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u0002H\u00070\u000e\"\u0004\b\u0000\u0010\u0007X\u008a\u0084\u0002"}, d2 = {"rememberLottieDynamicProperties", "Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "properties", "", "Lcom/airbnb/lottie/compose/LottieDynamicProperty;", "([Lcom/airbnb/lottie/compose/LottieDynamicProperty;Landroidx/compose/runtime/Composer;I)Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "rememberLottieDynamicProperty", "T", "property", t0.b.f22420d, "keyPath", "", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Lcom/airbnb/lottie/compose/LottieDynamicProperty;", "callback", "Lkotlin/Function1;", "Lcom/airbnb/lottie/value/LottieFrameInfo;", "Lkotlin/ParameterName;", "name", "frameInfo", "(Ljava/lang/Object;[Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lcom/airbnb/lottie/compose/LottieDynamicProperty;", "toValueCallback", "com/airbnb/lottie/compose/LottieDynamicPropertiesKt$toValueCallback$1", "(Lkotlin/jvm/functions/Function1;)Lcom/airbnb/lottie/compose/LottieDynamicPropertiesKt$toValueCallback$1;", "lottie-compose_release", "callbackState"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nLottieDynamicProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LottieDynamicProperties.kt\ncom/airbnb/lottie/compose/LottieDynamicPropertiesKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,194:1\n36#2:195\n36#2:202\n67#2,3:209\n66#2:212\n36#2:219\n50#2:226\n49#2:227\n1097#3,6:196\n1097#3,6:203\n1097#3,6:213\n1097#3,6:220\n1097#3,6:228\n81#4:234\n*S KotlinDebug\n*F\n+ 1 LottieDynamicProperties.kt\ncom/airbnb/lottie/compose/LottieDynamicPropertiesKt\n*L\n29#1:195\n48#1:202\n49#1:209,3\n49#1:212\n71#1:219\n73#1:226\n73#1:227\n29#1:196,6\n48#1:203,6\n49#1:213,6\n71#1:220,6\n73#1:228,6\n72#1:234\n*E\n"})
/* loaded from: classes2.dex */
public final class l {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @i0(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "T", "it", "Lcom/airbnb/lottie/value/LottieFrameInfo;", "invoke", "(Lcom/airbnb/lottie/value/LottieFrameInfo;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    static final class a<T> extends n0 implements v3.l<com.airbnb.lottie.value.b<T>, T> {
        final /* synthetic */ State<v3.l<com.airbnb.lottie.value.b<T>, T>> $callbackState$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(State<? extends v3.l<? super com.airbnb.lottie.value.b<T>, ? extends T>> state) {
            super(1);
            this.$callbackState$delegate = state;
        }

        @Override // v3.l
        public final T invoke(@p4.l com.airbnb.lottie.value.b<T> it) {
            l0.p(it, "it");
            return (T) l.f(this.$callbackState$delegate).invoke(it);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @i0(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0002\u001a\u00028\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"com/airbnb/lottie/compose/LottieDynamicPropertiesKt$toValueCallback$1", "Lcom/airbnb/lottie/value/LottieValueCallback;", "getValue", "frameInfo", "Lcom/airbnb/lottie/value/LottieFrameInfo;", "(Lcom/airbnb/lottie/value/LottieFrameInfo;)Ljava/lang/Object;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b<T> extends com.airbnb.lottie.value.j<T> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ v3.l<com.airbnb.lottie.value.b<T>, T> f1246d;

        /* JADX WARN: Multi-variable type inference failed */
        b(v3.l<? super com.airbnb.lottie.value.b<T>, ? extends T> lVar) {
            this.f1246d = lVar;
        }

        @Override // com.airbnb.lottie.value.j
        public T a(@p4.l com.airbnb.lottie.value.b<T> frameInfo) {
            l0.p(frameInfo, "frameInfo");
            return this.f1246d.invoke(frameInfo);
        }
    }

    @p4.l
    @Composable
    public static final k c(@p4.l m<?>[] properties, @p4.m Composer composer, int i5) {
        List Jy;
        l0.p(properties, "properties");
        composer.startReplaceableGroup(-395574495);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-395574495, i5, -1, "com.airbnb.lottie.compose.rememberLottieDynamicProperties (LottieDynamicProperties.kt:27)");
        }
        Integer valueOf = Integer.valueOf(Arrays.hashCode(properties));
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(valueOf);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            Jy = kotlin.collections.p.Jy(properties);
            rememberedValue = new k(Jy);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        k kVar = (k) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return kVar;
    }

    @p4.l
    @Composable
    public static final <T> m<T> d(T t5, T t6, @p4.l String[] keyPath, @p4.m Composer composer, int i5) {
        l0.p(keyPath, "keyPath");
        composer.startReplaceableGroup(-1788530187);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1788530187, i5, -1, "com.airbnb.lottie.compose.rememberLottieDynamicProperty (LottieDynamicProperties.kt:46)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(keyPath);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new com.airbnb.lottie.model.e((String[]) Arrays.copyOf(keyPath, keyPath.length));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        com.airbnb.lottie.model.e eVar = (com.airbnb.lottie.model.e) rememberedValue;
        composer.startReplaceableGroup(1618982084);
        boolean changed2 = composer.changed(eVar) | composer.changed(t5) | composer.changed(t6);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new m(t5, eVar, t6);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        m<T> mVar = (m) rememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mVar;
    }

    @p4.l
    @Composable
    public static final <T> m<T> e(T t5, @p4.l String[] keyPath, @p4.l v3.l<? super com.airbnb.lottie.value.b<T>, ? extends T> callback, @p4.m Composer composer, int i5) {
        l0.p(keyPath, "keyPath");
        l0.p(callback, "callback");
        composer.startReplaceableGroup(1331897370);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1331897370, i5, -1, "com.airbnb.lottie.compose.rememberLottieDynamicProperty (LottieDynamicProperties.kt:69)");
        }
        Object valueOf = Integer.valueOf(Arrays.hashCode(keyPath));
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(valueOf);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new com.airbnb.lottie.model.e((String[]) Arrays.copyOf(keyPath, keyPath.length));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        com.airbnb.lottie.model.e eVar = (com.airbnb.lottie.model.e) rememberedValue;
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(callback, composer, (i5 >> 6) & 14);
        composer.startReplaceableGroup(511388516);
        boolean changed2 = composer.changed(eVar) | composer.changed(t5);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new m((Object) t5, eVar, (v3.l) new a(rememberUpdatedState));
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        m<T> mVar = (m) rememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> v3.l<com.airbnb.lottie.value.b<T>, T> f(State<? extends v3.l<? super com.airbnb.lottie.value.b<T>, ? extends T>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> b g(v3.l<? super com.airbnb.lottie.value.b<T>, ? extends T> lVar) {
        return new b(lVar);
    }
}
