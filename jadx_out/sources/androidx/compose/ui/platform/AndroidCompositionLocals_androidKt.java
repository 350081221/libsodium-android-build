package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.res.ImageVectorCache;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\"\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00138\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017\" \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00138\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017\"\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00138\u0006¢\u0006\f\n\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\u0017\"\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00138\u0006¢\u0006\f\n\u0004\b#\u0010\u0015\u001a\u0004\b$\u0010\u0017¨\u0006%²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "content", "ProvideAndroidCompositionLocals", "(Landroidx/compose/ui/platform/AndroidComposeView;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "Landroid/content/Context;", com.umeng.analytics.pro.d.X, "Landroid/content/res/Configuration;", "configuration", "Landroidx/compose/ui/res/ImageVectorCache;", "obtainImageVectorCache", "(Landroid/content/Context;Landroid/content/res/Configuration;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/res/ImageVectorCache;", "", "name", "", "noLocalProvidedFor", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalConfiguration", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalConfiguration", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalContext", "getLocalContext", "LocalImageVectorCache", "getLocalImageVectorCache", "Landroidx/lifecycle/LifecycleOwner;", "LocalLifecycleOwner", "getLocalLifecycleOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "LocalSavedStateRegistryOwner", "getLocalSavedStateRegistryOwner", "Landroid/view/View;", "LocalView", "getLocalView", "ui_release"}, k = 2, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nAndroidCompositionLocals.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,166:1\n25#2:167\n25#2:180\n25#2:187\n25#2:194\n25#2:201\n25#2:209\n1116#3,6:168\n1116#3,6:174\n1116#3,6:181\n1116#3,6:188\n1116#3,6:195\n1116#3,3:202\n1119#3,3:206\n1116#3,6:210\n1#4:205\n81#5:216\n107#5,2:217\n*S KotlinDebug\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt\n*L\n89#1:167\n95#1:180\n100#1:187\n133#1:194\n134#1:201\n137#1:209\n89#1:168,6\n93#1:174,6\n95#1:181,6\n100#1:188,6\n133#1:195,6\n134#1:202,3\n134#1:206,3\n137#1:210,6\n89#1:216\n89#1:217,2\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {

    @p4.l
    private static final ProvidableCompositionLocal<Configuration> LocalConfiguration = CompositionLocalKt.compositionLocalOf$default(null, AndroidCompositionLocals_androidKt$LocalConfiguration$1.INSTANCE, 1, null);

    @p4.l
    private static final ProvidableCompositionLocal<Context> LocalContext = CompositionLocalKt.staticCompositionLocalOf(AndroidCompositionLocals_androidKt$LocalContext$1.INSTANCE);

    @p4.l
    private static final ProvidableCompositionLocal<ImageVectorCache> LocalImageVectorCache = CompositionLocalKt.staticCompositionLocalOf(AndroidCompositionLocals_androidKt$LocalImageVectorCache$1.INSTANCE);

    @p4.l
    private static final ProvidableCompositionLocal<LifecycleOwner> LocalLifecycleOwner = CompositionLocalKt.staticCompositionLocalOf(AndroidCompositionLocals_androidKt$LocalLifecycleOwner$1.INSTANCE);

    @p4.l
    private static final ProvidableCompositionLocal<SavedStateRegistryOwner> LocalSavedStateRegistryOwner = CompositionLocalKt.staticCompositionLocalOf(AndroidCompositionLocals_androidKt$LocalSavedStateRegistryOwner$1.INSTANCE);

    @p4.l
    private static final ProvidableCompositionLocal<View> LocalView = CompositionLocalKt.staticCompositionLocalOf(AndroidCompositionLocals_androidKt$LocalView$1.INSTANCE);

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void ProvideAndroidCompositionLocals(@p4.l AndroidComposeView androidComposeView, @p4.l v3.p<? super Composer, ? super Integer, r2> pVar, @p4.m Composer composer, int i5) {
        Composer startRestartGroup = composer.startRestartGroup(1396852028);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1396852028, i5, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals (AndroidCompositionLocals.android.kt:83)");
        }
        Context context = androidComposeView.getContext();
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Configuration(context.getResources().getConfiguration()), null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        startRestartGroup.startReplaceableGroup(-230243351);
        boolean changed = startRestartGroup.changed(mutableState);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$1(mutableState);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        androidComposeView.setConfigurationChangeObserver((v3.l) rememberedValue2);
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new AndroidUriHandler(context);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        startRestartGroup.endReplaceableGroup();
        AndroidUriHandler androidUriHandler = (AndroidUriHandler) rememberedValue3;
        AndroidComposeView.ViewTreeOwners viewTreeOwners = androidComposeView.getViewTreeOwners();
        if (viewTreeOwners != null) {
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry(androidComposeView, viewTreeOwners.getSavedStateRegistryOwner());
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceableGroup();
            DisposableSaveableStateRegistry disposableSaveableStateRegistry = (DisposableSaveableStateRegistry) rememberedValue4;
            EffectsKt.DisposableEffect(r2.f19517a, new AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2(disposableSaveableStateRegistry), startRestartGroup, 6);
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{LocalConfiguration.provides(ProvideAndroidCompositionLocals$lambda$1(mutableState)), LocalContext.provides(context), LocalLifecycleOwner.provides(viewTreeOwners.getLifecycleOwner()), LocalSavedStateRegistryOwner.provides(viewTreeOwners.getSavedStateRegistryOwner()), SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(disposableSaveableStateRegistry), LocalView.provides(androidComposeView.getView()), LocalImageVectorCache.provides(obtainImageVectorCache(context, ProvideAndroidCompositionLocals$lambda$1(mutableState), startRestartGroup, 72))}, ComposableLambdaKt.composableLambda(startRestartGroup, 1471621628, true, new AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$3(androidComposeView, androidUriHandler, pVar)), startRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$4(androidComposeView, pVar, i5));
                return;
            }
            return;
        }
        throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
    }

    private static final Configuration ProvideAndroidCompositionLocals$lambda$1(MutableState<Configuration> mutableState) {
        return mutableState.getValue();
    }

    @p4.l
    public static final ProvidableCompositionLocal<Configuration> getLocalConfiguration() {
        return LocalConfiguration;
    }

    @p4.l
    public static final ProvidableCompositionLocal<Context> getLocalContext() {
        return LocalContext;
    }

    @p4.l
    public static final ProvidableCompositionLocal<ImageVectorCache> getLocalImageVectorCache() {
        return LocalImageVectorCache;
    }

    @p4.l
    public static final ProvidableCompositionLocal<LifecycleOwner> getLocalLifecycleOwner() {
        return LocalLifecycleOwner;
    }

    @p4.l
    public static final ProvidableCompositionLocal<SavedStateRegistryOwner> getLocalSavedStateRegistryOwner() {
        return LocalSavedStateRegistryOwner;
    }

    @p4.l
    public static final ProvidableCompositionLocal<View> getLocalView() {
        return LocalView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void noLocalProvidedFor(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    @Stable
    @Composable
    private static final ImageVectorCache obtainImageVectorCache(Context context, Configuration configuration, Composer composer, int i5) {
        composer.startReplaceableGroup(-485908294);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-485908294, i5, -1, "androidx.compose.ui.platform.obtainImageVectorCache (AndroidCompositionLocals.android.kt:131)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new ImageVectorCache();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final ImageVectorCache imageVectorCache = (ImageVectorCache) rememberedValue;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        Object obj = rememberedValue2;
        if (rememberedValue2 == companion.getEmpty()) {
            Configuration configuration2 = new Configuration();
            if (configuration != null) {
                configuration2.setTo(configuration);
            }
            composer.updateRememberedValue(configuration2);
            obj = configuration2;
        }
        composer.endReplaceableGroup();
        final Configuration configuration3 = (Configuration) obj;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new ComponentCallbacks2() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1
                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(@p4.l Configuration configuration4) {
                    imageVectorCache.prune(configuration3.updateFrom(configuration4));
                    configuration3.setTo(configuration4);
                }

                @Override // android.content.ComponentCallbacks
                public void onLowMemory() {
                    imageVectorCache.clear();
                }

                @Override // android.content.ComponentCallbacks2
                public void onTrimMemory(int i6) {
                    imageVectorCache.clear();
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        EffectsKt.DisposableEffect(imageVectorCache, new AndroidCompositionLocals_androidKt$obtainImageVectorCache$1(context, (AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1) rememberedValue3), composer, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return imageVectorCache;
    }
}
