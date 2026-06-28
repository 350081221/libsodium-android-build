package androidx.compose.ui.node;

import android.view.KeyEvent;
import androidx.annotation.RestrictTo;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.draganddrop.DragAndDropManager;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.PlatformTextInputSessionHandler;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.b1;
import kotlin.coroutines.g;
import kotlin.i0;
import kotlin.k;
import kotlin.r2;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000¤\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u0000 ¤\u00012\u00020\u0001:\u0004¤\u0001¥\u0001J.\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004H&J$\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H&J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002H&J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002H&J\u001a\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH&ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH&ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0012J\b\u0010\u0017\u001a\u00020\u0004H&J\u0012\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u0004H&J\"\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH&ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&J*\u0010%\u001a\u00020$2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\b0\u001f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\"H&J\b\u0010&\u001a\u00020\bH&J\u0010\u0010'\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001c\u0010-\u001a\u0004\u0018\u00010*2\u0006\u0010)\u001a\u00020(H&ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u0016\u0010/\u001a\u00020\b2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\b0\"H&J\b\u00100\u001a\u00020\bH&J\u0010\u00102\u001a\u00020\b2\u0006\u0010.\u001a\u000201H&R\u0014\u00105\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8&X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8&X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8&X¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8&X¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8&X¦\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010Q\u001a\u00020N8&X¦\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u001a\u0010W\u001a\u00020R8gX§\u0004¢\u0006\f\u0012\u0004\bU\u0010V\u001a\u0004\bS\u0010TR\u001c\u0010\\\u001a\u0004\u0018\u00010X8gX§\u0004¢\u0006\f\u0012\u0004\b[\u0010V\u001a\u0004\bY\u0010ZR\u0014\u0010`\u001a\u00020]8&X¦\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0014\u0010d\u001a\u00020a8&X¦\u0004¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0014\u0010h\u001a\u00020e8&X¦\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0014\u0010l\u001a\u00020i8&X¦\u0004¢\u0006\u0006\u001a\u0004\bj\u0010kR\u0014\u0010p\u001a\u00020m8&X¦\u0004¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0014\u0010t\u001a\u00020q8&X¦\u0004¢\u0006\u0006\u001a\u0004\br\u0010sR\u001a\u0010y\u001a\u00020u8&X§\u0004¢\u0006\f\u0012\u0004\bx\u0010V\u001a\u0004\bv\u0010wR\u0014\u0010}\u001a\u00020z8&X¦\u0004¢\u0006\u0006\u001a\u0004\b{\u0010|R\u0016\u0010\u0081\u0001\u001a\u00020~8&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R*\u0010\u0087\u0001\u001a\u00020\u00042\u0007\u0010\u0082\u0001\u001a\u00020\u00048&@gX¦\u000e¢\u0006\u0010\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u0088\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0018\u0010\u008f\u0001\u001a\u00030\u008c\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0018\u0010\u0093\u0001\u001a\u00030\u0090\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0018\u0010\u0097\u0001\u001a\u00030\u0094\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0018\u0010\u009b\u0001\u001a\u00030\u0098\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0018\u0010\u009f\u0001\u001a\u00030\u009c\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0018\u0010£\u0001\u001a\u00030 \u00018&X¦\u0004¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006¦\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/Owner;", "Landroidx/compose/ui/platform/PlatformTextInputSessionHandler;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "", "affectsLookahead", "forceRequest", "scheduleMeasureAndLayout", "Lkotlin/r2;", "onRequestMeasure", "onRequestRelayout", "requestOnPositionedCallback", "node", "onAttach", "onDetach", "Landroidx/compose/ui/geometry/Offset;", "localPosition", "calculatePositionInWindow-MK-Hz9U", "(J)J", "calculatePositionInWindow", "positionInWindow", "calculateLocalPosition-MK-Hz9U", "calculateLocalPosition", "requestFocus", "sendPointerUpdate", "measureAndLayout", "Landroidx/compose/ui/unit/Constraints;", "constraints", "measureAndLayout-0kLqBqw", "(Landroidx/compose/ui/node/LayoutNode;J)V", "forceMeasureTheSubtree", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "Landroidx/compose/ui/node/OwnedLayer;", "createLayer", "onSemanticsChange", "onLayoutChange", "Landroidx/compose/ui/input/key/KeyEvent;", "keyEvent", "Landroidx/compose/ui/focus/FocusDirection;", "getFocusDirection-P8AzH3I", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/focus/FocusDirection;", "getFocusDirection", "listener", "registerOnEndApplyChangesListener", "onEndApplyChanges", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "registerOnLayoutCompletedListener", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "root", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "getSharedDrawScope", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "sharedDrawScope", "Landroidx/compose/ui/node/RootForTest;", "getRootForTest", "()Landroidx/compose/ui/node/RootForTest;", "rootForTest", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "hapticFeedBack", "Landroidx/compose/ui/input/InputModeManager;", "getInputModeManager", "()Landroidx/compose/ui/input/InputModeManager;", "inputModeManager", "Landroidx/compose/ui/platform/ClipboardManager;", "getClipboardManager", "()Landroidx/compose/ui/platform/ClipboardManager;", "clipboardManager", "Landroidx/compose/ui/platform/AccessibilityManager;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/AccessibilityManager;", "accessibilityManager", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "textToolbar", "Landroidx/compose/ui/autofill/AutofillTree;", "getAutofillTree", "()Landroidx/compose/ui/autofill/AutofillTree;", "getAutofillTree$annotations", "()V", "autofillTree", "Landroidx/compose/ui/autofill/Autofill;", "getAutofill", "()Landroidx/compose/ui/autofill/Autofill;", "getAutofill$annotations", "autofill", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/input/TextInputService;", "getTextInputService", "()Landroidx/compose/ui/text/input/TextInputService;", "textInputService", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "getSoftwareKeyboardController", "()Landroidx/compose/ui/platform/SoftwareKeyboardController;", "softwareKeyboardController", "Landroidx/compose/ui/input/pointer/PointerIconService;", "getPointerIconService", "()Landroidx/compose/ui/input/pointer/PointerIconService;", "pointerIconService", "Landroidx/compose/ui/focus/FocusOwner;", "getFocusOwner", "()Landroidx/compose/ui/focus/FocusOwner;", "focusOwner", "Landroidx/compose/ui/platform/WindowInfo;", "getWindowInfo", "()Landroidx/compose/ui/platform/WindowInfo;", "windowInfo", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getFontLoader", "()Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getFontLoader$annotations", "fontLoader", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "<set-?>", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "(Z)V", "showLayoutBounds", "", "getMeasureIteration", "()J", "measureIteration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "Landroidx/compose/ui/modifier/ModifierLocalManager;", "getModifierLocalManager", "()Landroidx/compose/ui/modifier/ModifierLocalManager;", "modifierLocalManager", "Lkotlin/coroutines/g;", "getCoroutineContext", "()Lkotlin/coroutines/g;", "coroutineContext", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getPlacementScope", "()Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placementScope", "Landroidx/compose/ui/draganddrop/DragAndDropManager;", "getDragAndDropManager", "()Landroidx/compose/ui/draganddrop/DragAndDropManager;", "dragAndDropManager", "Companion", "OnLayoutCompletedListener", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface Owner extends PlatformTextInputSessionHandler {

    @l
    public static final Companion Companion = Companion.$$INSTANCE;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/node/Owner$Companion;", "", "()V", "enableExtraAssertions", "", "getEnableExtraAssertions", "()Z", "setEnableExtraAssertions", "(Z)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static boolean enableExtraAssertions;

        private Companion() {
        }

        public final boolean getEnableExtraAssertions() {
            return enableExtraAssertions;
        }

        public final void setEnableExtraAssertions(boolean z4) {
            enableExtraAssertions = z4;
        }
    }

    @i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "", "Lkotlin/r2;", "onLayoutComplete", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public interface OnLayoutCompletedListener {
        void onLayoutComplete();
    }

    static /* synthetic */ void forceMeasureTheSubtree$default(Owner owner, LayoutNode layoutNode, boolean z4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
        }
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        owner.forceMeasureTheSubtree(layoutNode, z4);
    }

    @ExperimentalComposeUiApi
    static /* synthetic */ void getAutofill$annotations() {
    }

    @ExperimentalComposeUiApi
    static /* synthetic */ void getAutofillTree$annotations() {
    }

    @k(message = "fontLoader is deprecated, use fontFamilyResolver", replaceWith = @b1(expression = "fontFamilyResolver", imports = {}))
    static /* synthetic */ void getFontLoader$annotations() {
    }

    static /* synthetic */ void measureAndLayout$default(Owner owner, boolean z4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
        if ((i5 & 1) != 0) {
            z4 = true;
        }
        owner.measureAndLayout(z4);
    }

    static /* synthetic */ void onRequestMeasure$default(Owner owner, LayoutNode layoutNode, boolean z4, boolean z5, boolean z6, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
        }
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        if ((i5 & 4) != 0) {
            z5 = false;
        }
        if ((i5 & 8) != 0) {
            z6 = true;
        }
        owner.onRequestMeasure(layoutNode, z4, z5, z6);
    }

    static /* synthetic */ void onRequestRelayout$default(Owner owner, LayoutNode layoutNode, boolean z4, boolean z5, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
        }
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        if ((i5 & 4) != 0) {
            z5 = false;
        }
        owner.onRequestRelayout(layoutNode, z4, z5);
    }

    /* renamed from: calculateLocalPosition-MK-Hz9U */
    long mo5257calculateLocalPositionMKHz9U(long j5);

    /* renamed from: calculatePositionInWindow-MK-Hz9U */
    long mo5258calculatePositionInWindowMKHz9U(long j5);

    @l
    OwnedLayer createLayer(@l v3.l<? super Canvas, r2> lVar, @l v3.a<r2> aVar);

    void forceMeasureTheSubtree(@l LayoutNode layoutNode, boolean z4);

    @l
    AccessibilityManager getAccessibilityManager();

    @ExperimentalComposeUiApi
    @m
    Autofill getAutofill();

    @l
    @ExperimentalComposeUiApi
    AutofillTree getAutofillTree();

    @l
    ClipboardManager getClipboardManager();

    @l
    g getCoroutineContext();

    @l
    Density getDensity();

    @l
    DragAndDropManager getDragAndDropManager();

    @m
    /* renamed from: getFocusDirection-P8AzH3I */
    FocusDirection mo5259getFocusDirectionP8AzH3I(@l KeyEvent keyEvent);

    @l
    FocusOwner getFocusOwner();

    @l
    FontFamily.Resolver getFontFamilyResolver();

    @l
    Font.ResourceLoader getFontLoader();

    @l
    HapticFeedback getHapticFeedBack();

    @l
    InputModeManager getInputModeManager();

    @l
    LayoutDirection getLayoutDirection();

    long getMeasureIteration();

    @l
    ModifierLocalManager getModifierLocalManager();

    @l
    default Placeable.PlacementScope getPlacementScope() {
        return PlaceableKt.PlacementScope(this);
    }

    @l
    PointerIconService getPointerIconService();

    @l
    LayoutNode getRoot();

    @l
    RootForTest getRootForTest();

    @l
    LayoutNodeDrawScope getSharedDrawScope();

    boolean getShowLayoutBounds();

    @l
    OwnerSnapshotObserver getSnapshotObserver();

    @l
    SoftwareKeyboardController getSoftwareKeyboardController();

    @l
    TextInputService getTextInputService();

    @l
    TextToolbar getTextToolbar();

    @l
    ViewConfiguration getViewConfiguration();

    @l
    WindowInfo getWindowInfo();

    void measureAndLayout(boolean z4);

    /* renamed from: measureAndLayout-0kLqBqw */
    void mo5260measureAndLayout0kLqBqw(@l LayoutNode layoutNode, long j5);

    void onAttach(@l LayoutNode layoutNode);

    void onDetach(@l LayoutNode layoutNode);

    void onEndApplyChanges();

    void onLayoutChange(@l LayoutNode layoutNode);

    void onRequestMeasure(@l LayoutNode layoutNode, boolean z4, boolean z5, boolean z6);

    void onRequestRelayout(@l LayoutNode layoutNode, boolean z4, boolean z5);

    void onSemanticsChange();

    void registerOnEndApplyChangesListener(@l v3.a<r2> aVar);

    void registerOnLayoutCompletedListener(@l OnLayoutCompletedListener onLayoutCompletedListener);

    boolean requestFocus();

    void requestOnPositionedCallback(@l LayoutNode layoutNode);

    @InternalCoreApi
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    void setShowLayoutBounds(boolean z4);
}
