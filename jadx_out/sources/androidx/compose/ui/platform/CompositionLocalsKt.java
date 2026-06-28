package androidx.compose.ui.platform;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a2\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002\"\u001f\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"(\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u000e8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0011\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0013\"&\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u000e8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u0011\u0012\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001b\u0010\u0013\"\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000e8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001f\u0010\u0013\"\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u000e8\u0006¢\u0006\f\n\u0004\b!\u0010\u0011\u001a\u0004\b\"\u0010\u0013\"\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u000e8\u0006¢\u0006\f\n\u0004\b$\u0010\u0011\u001a\u0004\b%\u0010\u0013\"&\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u000e8GX\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010\u0011\u0012\u0004\b)\u0010\u0018\u001a\u0004\b(\u0010\u0013\"\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u000e8\u0006¢\u0006\f\n\u0004\b+\u0010\u0011\u001a\u0004\b,\u0010\u0013\"\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u000e8\u0006¢\u0006\f\n\u0004\b.\u0010\u0011\u001a\u0004\b/\u0010\u0013\"\u001d\u00101\u001a\b\u0012\u0004\u0012\u0002000\u000e8\u0006¢\u0006\f\n\u0004\b1\u0010\u0011\u001a\u0004\b2\u0010\u0013\"\u001d\u00104\u001a\b\u0012\u0004\u0012\u0002030\u000e8\u0006¢\u0006\f\n\u0004\b4\u0010\u0011\u001a\u0004\b5\u0010\u0013\"\u001f\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001060\u000e8\u0006¢\u0006\f\n\u0004\b7\u0010\u0011\u001a\u0004\b8\u0010\u0013\"\u001f\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001090\u000e8\u0006¢\u0006\f\n\u0004\b:\u0010\u0011\u001a\u0004\b;\u0010\u0013\"\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u000e8\u0006¢\u0006\f\n\u0004\b=\u0010\u0011\u001a\u0004\b>\u0010\u0013\"\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006¢\u0006\f\n\u0004\b?\u0010\u0011\u001a\u0004\b@\u0010\u0013\"\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020A0\u000e8\u0006¢\u0006\f\n\u0004\bB\u0010\u0011\u001a\u0004\bC\u0010\u0013\"\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00020D0\u000e8\u0006¢\u0006\f\n\u0004\bE\u0010\u0011\u001a\u0004\bF\u0010\u0013\"\"\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010G0\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bH\u0010\u0011\u001a\u0004\bI\u0010\u0013¨\u0006J"}, d2 = {"Landroidx/compose/ui/node/Owner;", "owner", "Landroidx/compose/ui/platform/UriHandler;", "uriHandler", "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "content", "ProvideCommonCompositionLocals", "(Landroidx/compose/ui/node/Owner;Landroidx/compose/ui/platform/UriHandler;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "", "name", "", "noLocalProvidedFor", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/platform/AccessibilityManager;", "LocalAccessibilityManager", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalAccessibilityManager", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/autofill/Autofill;", "LocalAutofill", "getLocalAutofill", "getLocalAutofill$annotations", "()V", "Landroidx/compose/ui/autofill/AutofillTree;", "LocalAutofillTree", "getLocalAutofillTree", "getLocalAutofillTree$annotations", "Landroidx/compose/ui/platform/ClipboardManager;", "LocalClipboardManager", "getLocalClipboardManager", "Landroidx/compose/ui/unit/Density;", "LocalDensity", "getLocalDensity", "Landroidx/compose/ui/focus/FocusManager;", "LocalFocusManager", "getLocalFocusManager", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "LocalFontLoader", "getLocalFontLoader", "getLocalFontLoader$annotations", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "LocalFontFamilyResolver", "getLocalFontFamilyResolver", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "LocalHapticFeedback", "getLocalHapticFeedback", "Landroidx/compose/ui/input/InputModeManager;", "LocalInputModeManager", "getLocalInputModeManager", "Landroidx/compose/ui/unit/LayoutDirection;", "LocalLayoutDirection", "getLocalLayoutDirection", "Landroidx/compose/ui/text/input/TextInputService;", "LocalTextInputService", "getLocalTextInputService", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "LocalSoftwareKeyboardController", "getLocalSoftwareKeyboardController", "Landroidx/compose/ui/platform/TextToolbar;", "LocalTextToolbar", "getLocalTextToolbar", "LocalUriHandler", "getLocalUriHandler", "Landroidx/compose/ui/platform/ViewConfiguration;", "LocalViewConfiguration", "getLocalViewConfiguration", "Landroidx/compose/ui/platform/WindowInfo;", "LocalWindowInfo", "getLocalWindowInfo", "Landroidx/compose/ui/input/pointer/PointerIconService;", "LocalPointerIconService", "getLocalPointerIconService", "ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CompositionLocalsKt {

    @p4.l
    private static final ProvidableCompositionLocal<AccessibilityManager> LocalAccessibilityManager = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalAccessibilityManager$1.INSTANCE);

    @p4.l
    private static final ProvidableCompositionLocal<Autofill> LocalAutofill = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalAutofill$1.INSTANCE);

    @p4.l
    private static final ProvidableCompositionLocal<AutofillTree> LocalAutofillTree = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalAutofillTree$1.INSTANCE);

    @p4.l
    private static final ProvidableCompositionLocal<ClipboardManager> LocalClipboardManager = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalClipboardManager$1.INSTANCE);

    @p4.l
    private static final ProvidableCompositionLocal<Density> LocalDensity = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalDensity$1.INSTANCE);

    @p4.l
    private static final ProvidableCompositionLocal<FocusManager> LocalFocusManager = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalFocusManager$1.INSTANCE);

    @p4.l
    private static final ProvidableCompositionLocal<Font.ResourceLoader> LocalFontLoader = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalFontLoader$1.INSTANCE);

    @p4.l
    private static final ProvidableCompositionLocal<FontFamily.Resolver> LocalFontFamilyResolver = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalFontFamilyResolver$1.INSTANCE);

    @p4.l
    private static final ProvidableCompositionLocal<HapticFeedback> LocalHapticFeedback = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalHapticFeedback$1.INSTANCE);

    @p4.l
    private static final ProvidableCompositionLocal<InputModeManager> LocalInputModeManager = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalInputModeManager$1.INSTANCE);

    @p4.l
    private static final ProvidableCompositionLocal<LayoutDirection> LocalLayoutDirection = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalLayoutDirection$1.INSTANCE);

    @p4.l
    private static final ProvidableCompositionLocal<TextInputService> LocalTextInputService = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalTextInputService$1.INSTANCE);

    @p4.l
    private static final ProvidableCompositionLocal<SoftwareKeyboardController> LocalSoftwareKeyboardController = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalSoftwareKeyboardController$1.INSTANCE);

    @p4.l
    private static final ProvidableCompositionLocal<TextToolbar> LocalTextToolbar = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalTextToolbar$1.INSTANCE);

    @p4.l
    private static final ProvidableCompositionLocal<UriHandler> LocalUriHandler = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalUriHandler$1.INSTANCE);

    @p4.l
    private static final ProvidableCompositionLocal<ViewConfiguration> LocalViewConfiguration = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalViewConfiguration$1.INSTANCE);

    @p4.l
    private static final ProvidableCompositionLocal<WindowInfo> LocalWindowInfo = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalWindowInfo$1.INSTANCE);

    @p4.l
    private static final ProvidableCompositionLocal<PointerIconService> LocalPointerIconService = CompositionLocalKt.staticCompositionLocalOf(CompositionLocalsKt$LocalPointerIconService$1.INSTANCE);

    @Composable
    @ExperimentalComposeUiApi
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void ProvideCommonCompositionLocals(@p4.l Owner owner, @p4.l UriHandler uriHandler, @p4.l v3.p<? super Composer, ? super Integer, r2> pVar, @p4.m Composer composer, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(874662829);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changed(owner)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i6 = i9 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            if (startRestartGroup.changed(uriHandler)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i6 |= i8;
        }
        if ((i5 & 896) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i6 |= i7;
        }
        if ((i6 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(874662829, i6, -1, "androidx.compose.ui.platform.ProvideCommonCompositionLocals (CompositionLocals.kt:184)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{LocalAccessibilityManager.provides(owner.getAccessibilityManager()), LocalAutofill.provides(owner.getAutofill()), LocalAutofillTree.provides(owner.getAutofillTree()), LocalClipboardManager.provides(owner.getClipboardManager()), LocalDensity.provides(owner.getDensity()), LocalFocusManager.provides(owner.getFocusOwner()), LocalFontLoader.providesDefault(owner.getFontLoader()), LocalFontFamilyResolver.providesDefault(owner.getFontFamilyResolver()), LocalHapticFeedback.provides(owner.getHapticFeedBack()), LocalInputModeManager.provides(owner.getInputModeManager()), LocalLayoutDirection.provides(owner.getLayoutDirection()), LocalTextInputService.provides(owner.getTextInputService()), LocalSoftwareKeyboardController.provides(owner.getSoftwareKeyboardController()), LocalTextToolbar.provides(owner.getTextToolbar()), LocalUriHandler.provides(uriHandler), LocalViewConfiguration.provides(owner.getViewConfiguration()), LocalWindowInfo.provides(owner.getWindowInfo()), LocalPointerIconService.provides(owner.getPointerIconService())}, pVar, startRestartGroup, ((i6 >> 3) & 112) | 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new CompositionLocalsKt$ProvideCommonCompositionLocals$1(owner, uriHandler, pVar, i5));
        }
    }

    @p4.l
    public static final ProvidableCompositionLocal<AccessibilityManager> getLocalAccessibilityManager() {
        return LocalAccessibilityManager;
    }

    @p4.l
    @ExperimentalComposeUiApi
    public static final ProvidableCompositionLocal<Autofill> getLocalAutofill() {
        return LocalAutofill;
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getLocalAutofill$annotations() {
    }

    @p4.l
    @ExperimentalComposeUiApi
    public static final ProvidableCompositionLocal<AutofillTree> getLocalAutofillTree() {
        return LocalAutofillTree;
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getLocalAutofillTree$annotations() {
    }

    @p4.l
    public static final ProvidableCompositionLocal<ClipboardManager> getLocalClipboardManager() {
        return LocalClipboardManager;
    }

    @p4.l
    public static final ProvidableCompositionLocal<Density> getLocalDensity() {
        return LocalDensity;
    }

    @p4.l
    public static final ProvidableCompositionLocal<FocusManager> getLocalFocusManager() {
        return LocalFocusManager;
    }

    @p4.l
    public static final ProvidableCompositionLocal<FontFamily.Resolver> getLocalFontFamilyResolver() {
        return LocalFontFamilyResolver;
    }

    @p4.l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final ProvidableCompositionLocal<Font.ResourceLoader> getLocalFontLoader() {
        return LocalFontLoader;
    }

    @kotlin.k(message = "LocalFontLoader is replaced with LocalFontFamilyResolver", replaceWith = @kotlin.b1(expression = "LocalFontFamilyResolver", imports = {}))
    public static /* synthetic */ void getLocalFontLoader$annotations() {
    }

    @p4.l
    public static final ProvidableCompositionLocal<HapticFeedback> getLocalHapticFeedback() {
        return LocalHapticFeedback;
    }

    @p4.l
    public static final ProvidableCompositionLocal<InputModeManager> getLocalInputModeManager() {
        return LocalInputModeManager;
    }

    @p4.l
    public static final ProvidableCompositionLocal<LayoutDirection> getLocalLayoutDirection() {
        return LocalLayoutDirection;
    }

    @p4.l
    public static final ProvidableCompositionLocal<PointerIconService> getLocalPointerIconService() {
        return LocalPointerIconService;
    }

    @p4.l
    public static final ProvidableCompositionLocal<SoftwareKeyboardController> getLocalSoftwareKeyboardController() {
        return LocalSoftwareKeyboardController;
    }

    @p4.l
    public static final ProvidableCompositionLocal<TextInputService> getLocalTextInputService() {
        return LocalTextInputService;
    }

    @p4.l
    public static final ProvidableCompositionLocal<TextToolbar> getLocalTextToolbar() {
        return LocalTextToolbar;
    }

    @p4.l
    public static final ProvidableCompositionLocal<UriHandler> getLocalUriHandler() {
        return LocalUriHandler;
    }

    @p4.l
    public static final ProvidableCompositionLocal<ViewConfiguration> getLocalViewConfiguration() {
        return LocalViewConfiguration;
    }

    @p4.l
    public static final ProvidableCompositionLocal<WindowInfo> getLocalWindowInfo() {
        return LocalWindowInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void noLocalProvidedFor(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
