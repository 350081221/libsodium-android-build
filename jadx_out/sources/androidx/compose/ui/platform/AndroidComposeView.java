package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.ViewTranslationCallback;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.SessionMutex;
import androidx.compose.ui.autofill.AndroidAutofill;
import androidx.compose.ui.autofill.AndroidAutofill_androidKt;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillCallback;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.draganddrop.ComposeDragShadowBuilder;
import androidx.compose.ui.draganddrop.DragAndDropManager;
import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusTransactionManager;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.input.InputMode;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.InputModeManagerImpl;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.MotionEventAdapter;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.input.pointer.PointerInputEvent;
import androidx.compose.ui.input.pointer.PointerInputEventData;
import androidx.compose.ui.input.pointer.PointerInputEventProcessor;
import androidx.compose.ui.input.pointer.PointerInputEventProcessorKt;
import androidx.compose.ui.input.pointer.PointerKeyboardModifiers;
import androidx.compose.ui.input.pointer.PositionCalculator;
import androidx.compose.ui.input.pointer.ProcessResult;
import androidx.compose.ui.input.rotary.RotaryInputModifierKt;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.layout.RootMeasurePolicy;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.MeasureAndLayoutDelegate;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.node.RootForTest;
import androidx.compose.ui.platform.ViewLayer;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyResolver_androidKt;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputServiceAndroid;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.app.NotificationCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.umeng.analytics.pro.bi;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.r2;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000ú\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0002Ë\u0003\b\u0000\u0018\u0000 ý\u00032\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0006þ\u0003ý\u0003ÿ\u0003B\u001d\u0012\b\u0010ú\u0003\u001a\u00030ù\u0003\u0012\b\u0010å\u0001\u001a\u00030ä\u0001¢\u0006\u0006\bû\u0003\u0010ü\u0003J;\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0001H\u0002J \u0010\u001b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\u0014\u0010\u001e\u001a\u00020\f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002J\f\u0010\u001f\u001a\u00020\u000f*\u00020\u001cH\u0002J\u0017\u0010#\u001a\u00020\u0015*\u00020 H\u0082\nø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u0015*\u00020 H\u0082\nø\u0001\u0000¢\u0006\u0004\b$\u0010\"J%\u0010*\u001a\u00020 2\u0006\u0010&\u001a\u00020\u00152\u0006\u0010'\u001a\u00020\u0015H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001d\u0010.\u001a\u00020 2\u0006\u0010+\u001a\u00020\u0015H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\b\u0010/\u001a\u00020\fH\u0002J\u0010\u00101\u001a\u00020\f2\u0006\u00100\u001a\u00020\u001cH\u0002J\u0010\u00102\u001a\u00020\f2\u0006\u00100\u001a\u00020\u001cH\u0002J\u0010\u00105\u001a\u00020\u000f2\u0006\u00104\u001a\u000203H\u0002J\u001d\u0010:\u001a\u0002072\u0006\u00106\u001a\u000203H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00109J\u0018\u0010<\u001a\u00020\u000f2\u0006\u00104\u001a\u0002032\u0006\u0010;\u001a\u000203H\u0002J\u0010\u0010=\u001a\u00020\u000f2\u0006\u00104\u001a\u000203H\u0002J\u001d\u0010?\u001a\u0002072\u0006\u00106\u001a\u000203H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b>\u00109J*\u0010D\u001a\u00020\f2\u0006\u00106\u001a\u0002032\u0006\u0010@\u001a\u00020\u00152\u0006\u0010B\u001a\u00020A2\b\b\u0002\u0010C\u001a\u00020\u000fH\u0002J\u0010\u0010E\u001a\u00020\u000f2\u0006\u00106\u001a\u000203H\u0002J\b\u0010F\u001a\u00020\fH\u0002J\u0010\u0010F\u001a\u00020\f2\u0006\u00106\u001a\u000203H\u0002J\b\u0010G\u001a\u00020\fH\u0002J\b\u0010H\u001a\u00020\u000fH\u0002J\u0010\u0010I\u001a\u00020\u000f2\u0006\u00104\u001a\u000203H\u0002J\u0010\u0010J\u001a\u00020\u000f2\u0006\u00104\u001a\u000203H\u0002J\u001a\u0010N\u001a\u0004\u0018\u00010L2\u0006\u0010K\u001a\u00020\u00152\u0006\u0010M\u001a\u00020LH\u0002J9\u0010U\u001a\u00020R2'\u0010T\u001a#\b\u0001\u0012\u0004\u0012\u00020P\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0Q\u0012\u0006\u0012\u0004\u0018\u00010S0O¢\u0006\u0002\b\rH\u0096@¢\u0006\u0004\bU\u0010VJ\u0010\u0010Y\u001a\u00020\f2\u0006\u0010X\u001a\u00020WH\u0016J\u0010\u0010\\\u001a\u00020\f2\u0006\u0010[\u001a\u00020ZH\u0016J\"\u0010`\u001a\u00020\f2\u0006\u0010]\u001a\u00020\u000f2\u0006\u0010^\u001a\u00020\u00152\b\u0010_\u001a\u0004\u0018\u00010WH\u0014J\u0010\u0010b\u001a\u00020\f2\u0006\u0010a\u001a\u00020\u000fH\u0016J\u001a\u0010g\u001a\u00020\u000f2\u0006\u0010d\u001a\u00020cH\u0016ø\u0001\u0000¢\u0006\u0004\be\u0010fJ\u0010\u0010i\u001a\u00020\u000f2\u0006\u00104\u001a\u00020hH\u0016J\u0010\u0010j\u001a\u00020\u000f2\u0006\u00104\u001a\u00020hH\u0016J\u0010\u0010k\u001a\u00020\f2\u0006\u00100\u001a\u00020\u001cH\u0016J\u0010\u0010l\u001a\u00020\f2\u0006\u00100\u001a\u00020\u001cH\u0016J\u0006\u0010m\u001a\u00020\fJ\b\u0010n\u001a\u00020\fH\u0016J\u0016\u0010q\u001a\u00020\f2\f\u0010p\u001a\b\u0012\u0004\u0012\u00020\f0oH\u0016J\u0016\u0010u\u001a\u00020\f2\u0006\u0010s\u001a\u00020r2\u0006\u0010t\u001a\u00020\u001cJ\u000e\u0010v\u001a\u00020\f2\u0006\u0010s\u001a\u00020rJ\u0016\u0010y\u001a\u00020\f2\u0006\u0010s\u001a\u00020r2\u0006\u0010x\u001a\u00020wJ\u0010\u0010{\u001a\u00020\f2\u0006\u0010z\u001a\u00020\u000fH\u0016J\"\u0010{\u001a\u00020\f2\u0006\u0010t\u001a\u00020\u001c2\u0006\u0010}\u001a\u00020|H\u0016ø\u0001\u0000¢\u0006\u0004\b~\u0010\u007fJ\u001a\u0010\u0081\u0001\u001a\u00020\f2\u0006\u0010t\u001a\u00020\u001c2\u0007\u0010\u0080\u0001\u001a\u00020\u000fH\u0016J+\u0010\u0083\u0001\u001a\u00020\f2\u0006\u0010t\u001a\u00020\u001c2\u0007\u0010\u0080\u0001\u001a\u00020\u000f2\u0007\u0010\u0082\u0001\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000fH\u0016J#\u0010\u0084\u0001\u001a\u00020\f2\u0006\u0010t\u001a\u00020\u001c2\u0007\u0010\u0080\u0001\u001a\u00020\u000f2\u0007\u0010\u0082\u0001\u001a\u00020\u000fH\u0016J\u0011\u0010\u0085\u0001\u001a\u00020\f2\u0006\u0010t\u001a\u00020\u001cH\u0016J\t\u0010\u0086\u0001\u001a\u00020\fH\u0016J\u001b\u0010\u0089\u0001\u001a\u00020\f2\u0007\u0010\u0087\u0001\u001a\u00020\u00152\u0007\u0010\u0088\u0001\u001a\u00020\u0015H\u0014J5\u0010\u008e\u0001\u001a\u00020\f2\u0007\u0010\u008a\u0001\u001a\u00020\u000f2\u0007\u0010\u008b\u0001\u001a\u00020\u00152\u0007\u0010\u008c\u0001\u001a\u00020\u00152\u0007\u0010\u008d\u0001\u001a\u00020\u00152\u0006\u0010'\u001a\u00020\u0015H\u0014J\u0011\u0010\u008f\u0001\u001a\u00020\f2\u0006\u0010x\u001a\u00020wH\u0014J/\u0010\u0094\u0001\u001a\u00030\u0093\u00012\u0014\u0010\u0091\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0090\u0001\u0012\u0004\u0012\u00020\f0\n2\r\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00020\f0oH\u0016J\u001c\u0010\u0098\u0001\u001a\u00020\u000f2\b\u0010\u0095\u0001\u001a\u00030\u0093\u0001H\u0000¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\t\u0010\u0099\u0001\u001a\u00020\fH\u0016J\u0011\u0010\u009a\u0001\u001a\u00020\f2\u0006\u0010t\u001a\u00020\u001cH\u0016J\u0012\u0010\u009c\u0001\u001a\u00020\f2\u0007\u0010p\u001a\u00030\u009b\u0001H\u0016J \u0010 \u0001\u001a\u0005\u0018\u00010\u009d\u00012\u0006\u0010d\u001a\u00020cH\u0016ø\u0001\u0000¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u0011\u0010¡\u0001\u001a\u00020\f2\u0006\u0010x\u001a\u00020wH\u0014J%\u0010¥\u0001\u001a\u00020\f2\b\u0010\u0095\u0001\u001a\u00030\u0093\u00012\u0007\u0010¢\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u001d\u0010¨\u0001\u001a\u00020\f2\u0014\u0010§\u0001\u001a\u000f\u0012\u0005\u0012\u00030¦\u0001\u0012\u0004\u0012\u00020\f0\nJ\u0013\u0010©\u0001\u001a\u00020\fH\u0086@¢\u0006\u0006\b©\u0001\u0010ª\u0001J\t\u0010«\u0001\u001a\u00020\fH\u0016J\t\u0010¬\u0001\u001a\u00020\fH\u0014J\t\u0010\u00ad\u0001\u001a\u00020\fH\u0014J\u001e\u0010±\u0001\u001a\u00020\f2\n\u0010¯\u0001\u001a\u0005\u0018\u00010®\u00012\u0007\u0010°\u0001\u001a\u00020\u0015H\u0016J\u001a\u0010µ\u0001\u001a\u00020\f2\u000f\u0010´\u0001\u001a\n\u0012\u0005\u0012\u00030³\u00010²\u0001H\u0016J0\u0010½\u0001\u001a\u00020\f2\b\u0010·\u0001\u001a\u00030¶\u00012\b\u0010¹\u0001\u001a\u00030¸\u00012\u0011\u0010¼\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010»\u00010º\u0001H\u0017J\u001c\u0010Á\u0001\u001a\u00020\f2\u0011\u0010À\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010¿\u00010¾\u0001H\u0017J\u0011\u0010Â\u0001\u001a\u00020\u000f2\u0006\u00104\u001a\u000203H\u0016J\u0011\u0010Ã\u0001\u001a\u00020\u000f2\u0006\u00106\u001a\u000203H\u0016J\u0011\u0010Ä\u0001\u001a\u00020\u000f2\u0006\u0010^\u001a\u00020\u0015H\u0016J\u0011\u0010Å\u0001\u001a\u00020\u000f2\u0006\u0010^\u001a\u00020\u0015H\u0016J \u0010Ê\u0001\u001a\u00030Æ\u00012\b\u0010Ç\u0001\u001a\u00030Æ\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\bÈ\u0001\u0010É\u0001J\u001f\u0010Ê\u0001\u001a\u00020\f2\b\u0010Ì\u0001\u001a\u00030Ë\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\bÍ\u0001\u0010Î\u0001J \u0010Ñ\u0001\u001a\u00030Æ\u00012\b\u0010Ï\u0001\u001a\u00030Æ\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\bÐ\u0001\u0010É\u0001J\t\u0010Ò\u0001\u001a\u00020\u000fH\u0016J\u0016\u0010Ö\u0001\u001a\u0005\u0018\u00010Õ\u00012\b\u0010Ô\u0001\u001a\u00030Ó\u0001H\u0016J \u0010Ù\u0001\u001a\u00030Æ\u00012\b\u0010×\u0001\u001a\u00030Æ\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\bØ\u0001\u0010É\u0001J \u0010Û\u0001\u001a\u00030Æ\u00012\b\u0010Ç\u0001\u001a\u00030Æ\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\bÚ\u0001\u0010É\u0001J\u0013\u0010Þ\u0001\u001a\u00020\f2\b\u0010Ý\u0001\u001a\u00030Ü\u0001H\u0014J\u0012\u0010à\u0001\u001a\u00020\f2\u0007\u0010ß\u0001\u001a\u00020\u0015H\u0016J\u0011\u0010á\u0001\u001a\u00020\u000f2\u0006\u00104\u001a\u000203H\u0016J\u0011\u0010â\u0001\u001a\u0004\u0018\u00010L2\u0006\u0010K\u001a\u00020\u0015J\t\u0010ã\u0001\u001a\u00020\u000fH\u0016R \u0010å\u0001\u001a\u00030ä\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bå\u0001\u0010æ\u0001\u001a\u0006\bç\u0001\u0010è\u0001R \u0010é\u0001\u001a\u00030Æ\u00018\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\bé\u0001\u0010ê\u0001R\u0019\u0010ë\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bë\u0001\u0010ì\u0001R \u0010î\u0001\u001a\u00030í\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bî\u0001\u0010ï\u0001\u001a\u0006\bð\u0001\u0010ñ\u0001R,\u0010ô\u0001\u001a\u00030ò\u00012\b\u0010ó\u0001\u001a\u00030ò\u00018\u0016@RX\u0096\u000e¢\u0006\u0010\n\u0006\bô\u0001\u0010õ\u0001\u001a\u0006\bö\u0001\u0010÷\u0001R\u0018\u0010ù\u0001\u001a\u00030ø\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bù\u0001\u0010ú\u0001R \u0010ü\u0001\u001a\u00030û\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bü\u0001\u0010ý\u0001\u001a\u0006\bþ\u0001\u0010ÿ\u0001R\u0018\u0010\u0081\u0002\u001a\u00030\u0080\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0002\u0010\u0082\u0002R \u0010\u0084\u0002\u001a\u00030\u0083\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0084\u0002\u0010\u0085\u0002\u001a\u0006\b\u0086\u0002\u0010\u0087\u0002R\u0018\u0010\u0089\u0002\u001a\u00030\u0088\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0002\u0010\u008a\u0002R\u0018\u0010\u008c\u0002\u001a\u00030\u008b\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0002\u0010\u008d\u0002R\u0018\u0010\u008e\u0002\u001a\u00030\u008b\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0002\u0010\u008d\u0002R\u0018\u0010\u0090\u0002\u001a\u00030\u008f\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0002\u0010\u0091\u0002R\u001f\u0010\u0092\u0002\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0092\u0002\u0010\u0093\u0002\u001a\u0006\b\u0094\u0002\u0010\u0095\u0002R \u0010\u0097\u0002\u001a\u00030\u0096\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0097\u0002\u0010\u0098\u0002\u001a\u0006\b\u0099\u0002\u0010\u009a\u0002R \u0010\u009c\u0002\u001a\u00030\u009b\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u009c\u0002\u0010\u009d\u0002\u001a\u0006\b\u009e\u0002\u0010\u009f\u0002R\u0018\u0010¡\u0002\u001a\u00030 \u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0002\u0010¢\u0002R \u0010¤\u0002\u001a\u00030£\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¤\u0002\u0010¥\u0002\u001a\u0006\b¦\u0002\u0010§\u0002R\u001f\u0010©\u0002\u001a\n\u0012\u0005\u0012\u00030\u0093\u00010¨\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0002\u0010ª\u0002R#\u0010«\u0002\u001a\f\u0012\u0005\u0012\u00030\u0093\u0001\u0018\u00010¨\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0002\u0010ª\u0002R\u0019\u0010¬\u0002\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0002\u0010ì\u0001R\u0018\u0010®\u0002\u001a\u00030\u00ad\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0002\u0010¯\u0002R\u0018\u0010±\u0002\u001a\u00030°\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0002\u0010²\u0002R6\u0010³\u0002\u001a\u000f\u0012\u0005\u0012\u00030Ü\u0001\u0012\u0004\u0012\u00020\f0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b³\u0002\u0010´\u0002\u001a\u0006\bµ\u0002\u0010¶\u0002\"\u0006\b·\u0002\u0010¸\u0002R\u001a\u0010º\u0002\u001a\u0005\u0018\u00010¹\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0002\u0010»\u0002R\u0019\u0010¼\u0002\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0002\u0010ì\u0001R \u0010¾\u0002\u001a\u00030½\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¾\u0002\u0010¿\u0002\u001a\u0006\bÀ\u0002\u0010Á\u0002R \u0010Ã\u0002\u001a\u00030Â\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÃ\u0002\u0010Ä\u0002\u001a\u0006\bÅ\u0002\u0010Æ\u0002R \u0010È\u0002\u001a\u00030Ç\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÈ\u0002\u0010É\u0002\u001a\u0006\bÊ\u0002\u0010Ë\u0002R1\u0010Ì\u0002\u001a\u00020\u000f8\u0016@\u0016X\u0096\u000e¢\u0006 \n\u0006\bÌ\u0002\u0010ì\u0001\u0012\u0006\bÑ\u0002\u0010Ò\u0002\u001a\u0006\bÍ\u0002\u0010Î\u0002\"\u0006\bÏ\u0002\u0010Ð\u0002R\u001c\u0010Ô\u0002\u001a\u0005\u0018\u00010Ó\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÔ\u0002\u0010Õ\u0002R\u001c\u0010×\u0002\u001a\u0005\u0018\u00010Ö\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b×\u0002\u0010Ø\u0002R!\u0010Ù\u0002\u001a\u0004\u0018\u00010|8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\bÙ\u0002\u0010Ú\u0002R\u0019\u0010Û\u0002\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0002\u0010ì\u0001R\u0018\u0010Ý\u0002\u001a\u00030Ü\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÝ\u0002\u0010Þ\u0002R \u0010à\u0002\u001a\u00030ß\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bà\u0002\u0010á\u0002\u001a\u0006\bâ\u0002\u0010ã\u0002R \u0010å\u0002\u001a\u00030ä\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\bå\u0002\u0010ê\u0001R\u0018\u0010æ\u0002\u001a\u00030¸\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bæ\u0002\u0010ç\u0002R\u001e\u0010è\u0002\u001a\u00030Ë\u00018\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\bè\u0002\u0010é\u0002R\u001e\u0010ê\u0002\u001a\u00030Ë\u00018\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\bê\u0002\u0010é\u0002R\u001e\u0010ë\u0002\u001a\u00030Ë\u00018\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\bë\u0002\u0010é\u0002R1\u0010ì\u0002\u001a\u00020A8\u0000@\u0000X\u0081\u000e¢\u0006 \n\u0006\bì\u0002\u0010ê\u0001\u0012\u0006\bñ\u0002\u0010Ò\u0002\u001a\u0006\bí\u0002\u0010î\u0002\"\u0006\bï\u0002\u0010ð\u0002R\u0019\u0010ò\u0002\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bò\u0002\u0010ì\u0001R \u0010ó\u0002\u001a\u00030Æ\u00018\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\bó\u0002\u0010ê\u0001R\u0019\u0010ô\u0002\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bô\u0002\u0010ì\u0001R9\u0010û\u0002\u001a\u0005\u0018\u00010¦\u00012\n\u0010ó\u0001\u001a\u0005\u0018\u00010¦\u00018B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\bõ\u0002\u0010ö\u0002\u001a\u0006\b÷\u0002\u0010ø\u0002\"\u0006\bù\u0002\u0010ú\u0002R#\u0010ÿ\u0002\u001a\u0005\u0018\u00010¦\u00018FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\bü\u0002\u0010ý\u0002\u001a\u0006\bþ\u0002\u0010ø\u0002R(\u0010\u0080\u0003\u001a\u0011\u0012\u0005\u0012\u00030¦\u0001\u0012\u0004\u0012\u00020\f\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0003\u0010´\u0002R\u0018\u0010\u0082\u0003\u001a\u00030\u0081\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0003\u0010\u0083\u0003R\u0018\u0010\u0085\u0003\u001a\u00030\u0084\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0003\u0010\u0086\u0003R\u0018\u0010\u0088\u0003\u001a\u00030\u0087\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0003\u0010\u0089\u0003R\u0018\u0010\u008b\u0003\u001a\u00030\u008a\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0003\u0010\u008c\u0003R \u0010\u008e\u0003\u001a\u00030\u008d\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008e\u0003\u0010\u008f\u0003\u001a\u0006\b\u0090\u0003\u0010\u0091\u0003R%\u0010\u0094\u0003\u001a\n\u0012\u0005\u0012\u00030\u0093\u00030\u0092\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\b\u0094\u0003\u0010\u0095\u0003R \u0010\u0097\u0003\u001a\u00030\u0096\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0097\u0003\u0010\u0098\u0003\u001a\u0006\b\u0099\u0003\u0010\u009a\u0003R(\u0010\u009c\u0003\u001a\u00030\u009b\u00038\u0016X\u0097\u0004¢\u0006\u0018\n\u0006\b\u009c\u0003\u0010\u009d\u0003\u0012\u0006\b \u0003\u0010Ò\u0002\u001a\u0006\b\u009e\u0003\u0010\u009f\u0003R5\u0010§\u0003\u001a\u00030¡\u00032\b\u0010ó\u0001\u001a\u00030¡\u00038V@RX\u0096\u008e\u0002¢\u0006\u0018\n\u0006\b¢\u0003\u0010ö\u0002\u001a\u0006\b£\u0003\u0010¤\u0003\"\u0006\b¥\u0003\u0010¦\u0003R\u0019\u0010¨\u0003\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0003\u0010©\u0003R5\u0010ß\u0001\u001a\u00030ª\u00032\b\u0010ó\u0001\u001a\u00030ª\u00038V@RX\u0096\u008e\u0002¢\u0006\u0018\n\u0006\b«\u0003\u0010ö\u0002\u001a\u0006\b¬\u0003\u0010\u00ad\u0003\"\u0006\b®\u0003\u0010¯\u0003R \u0010±\u0003\u001a\u00030°\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b±\u0003\u0010²\u0003\u001a\u0006\b³\u0003\u0010´\u0003R\u0018\u0010¶\u0003\u001a\u00030µ\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0003\u0010·\u0003R \u0010¹\u0003\u001a\u00030¸\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¹\u0003\u0010º\u0003\u001a\u0006\b»\u0003\u0010¼\u0003R \u0010¾\u0003\u001a\u00030½\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¾\u0003\u0010¿\u0003\u001a\u0006\bÀ\u0003\u0010Á\u0003R\u001b\u0010Â\u0003\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0003\u0010Ã\u0003R\u0019\u0010Ä\u0003\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0003\u0010ê\u0001R\u001f\u0010Æ\u0003\u001a\n\u0012\u0005\u0012\u00030\u0093\u00010Å\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0003\u0010Ç\u0003R&\u0010É\u0003\u001a\u0011\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010o0È\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÉ\u0003\u0010Ê\u0003R\u0018\u0010Ì\u0003\u001a\u00030Ë\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÌ\u0003\u0010Í\u0003R\u0018\u0010Ï\u0003\u001a\u00030Î\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÏ\u0003\u0010Ð\u0003R\u0019\u0010Ñ\u0003\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÑ\u0003\u0010ì\u0001R\u001d\u0010Ò\u0003\u001a\b\u0012\u0004\u0012\u00020\f0o8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÒ\u0003\u0010Ó\u0003R\u0018\u0010Õ\u0003\u001a\u00030Ô\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÕ\u0003\u0010Ö\u0003R\u0019\u0010×\u0003\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b×\u0003\u0010ì\u0001R \u0010Ù\u0003\u001a\u00030Ø\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÙ\u0003\u0010Ú\u0003\u001a\u0006\bÛ\u0003\u0010Ü\u0003R\u001c\u0010ß\u0003\u001a\u00020\u0015*\u00030Ü\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÝ\u0003\u0010Þ\u0003R\u0016\u0010s\u001a\u00020L8VX\u0096\u0004¢\u0006\b\u001a\u0006\bà\u0003\u0010á\u0003R\u0018\u0010å\u0003\u001a\u00030â\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\bã\u0003\u0010ä\u0003R\u001a\u0010µ\u0001\u001a\u0005\u0018\u00010æ\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\bç\u0003\u0010è\u0003R\u0018\u0010ë\u0003\u001a\u00030Ó\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bé\u0003\u0010ê\u0003R\u0017\u0010í\u0003\u001a\u00020A8VX\u0096\u0004¢\u0006\b\u001a\u0006\bì\u0003\u0010î\u0002R\u0017\u0010ï\u0003\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\b\u001a\u0006\bî\u0003\u0010Î\u0002R\u0018\u0010ó\u0003\u001a\u00030ð\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\bñ\u0003\u0010ò\u0003R\u0018\u0010÷\u0003\u001a\u00030ô\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\bõ\u0003\u0010ö\u0003R\u0017\u0010ø\u0003\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\b\u001a\u0006\bø\u0003\u0010Î\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0080\u0004"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "Landroidx/compose/ui/node/Owner;", "Landroidx/compose/ui/platform/ViewRootForTest;", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "transferData", "Landroidx/compose/ui/geometry/Size;", "decorationSize", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/r2;", "Lkotlin/u;", "drawDragDecoration", "", "startDrag-12SF9DM", "(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLv3/l;)Z", "startDrag", "viewGroup", "clearChildInvalidObservations", "", "virtualViewId", "Landroid/view/accessibility/AccessibilityNodeInfo;", "info", "", "extraDataKey", "addExtraDataToAccessibilityNodeInfoHelper", "Landroidx/compose/ui/node/LayoutNode;", "nodeToRemeasure", "scheduleMeasureAndLayout", "childSizeCanAffectParentSize", "Lkotlin/g2;", "component1-VKZWuLQ", "(J)I", "component1", "component2-VKZWuLQ", "component2", bi.ay, "b", "pack-ZIaKswc", "(II)J", "pack", "measureSpec", "convertMeasureSpec-I7RO_PI", "(I)J", "convertMeasureSpec", "updatePositionCacheAndDispatch", "node", "invalidateLayoutNodeMeasurement", "invalidateLayers", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "handleRotaryEvent", "motionEvent", "Landroidx/compose/ui/input/pointer/ProcessResult;", "handleMotionEvent-8iAsVTc", "(Landroid/view/MotionEvent;)I", "handleMotionEvent", "lastEvent", "hasChangedDevices", "isDevicePressEvent", "sendMotionEvent-8iAsVTc", "sendMotionEvent", "action", "", "eventTime", "forceHover", "sendSimulatedEvent", "isInBounds", "recalculateWindowPosition", "recalculateWindowViewTransforms", "autofillSupported", "isBadMotionEvent", "isPositionChanged", "accessibilityId", "Landroid/view/View;", "currentView", "findViewByAccessibilityIdRootedAtCurrentView", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;", "Lkotlin/coroutines/d;", "", "", com.umeng.analytics.pro.d.aC, "textInputSession", "(Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroid/graphics/Rect;", "rect", "getFocusedRect", "Landroidx/lifecycle/LifecycleOwner;", "owner", "onResume", "gainFocus", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "previouslyFocusedRect", "onFocusChanged", "hasWindowFocus", "onWindowFocusChanged", "Landroidx/compose/ui/input/key/KeyEvent;", "keyEvent", "sendKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "sendKeyEvent", "Landroid/view/KeyEvent;", "dispatchKeyEvent", "dispatchKeyEventPreIme", "onAttach", "onDetach", "requestClearInvalidObservations", "onEndApplyChanges", "Lkotlin/Function0;", "listener", "registerOnEndApplyChangesListener", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "view", "layoutNode", "addAndroidView", "removeAndroidView", "Landroid/graphics/Canvas;", "canvas", "drawAndroidView", "sendPointerUpdate", "measureAndLayout", "Landroidx/compose/ui/unit/Constraints;", "constraints", "measureAndLayout-0kLqBqw", "(Landroidx/compose/ui/node/LayoutNode;J)V", "affectsLookahead", "forceMeasureTheSubtree", "forceRequest", "onRequestMeasure", "onRequestRelayout", "requestOnPositionedCallback", "measureAndLayoutForTest", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "changed", "l", bi.aL, "r", "onLayout", "onDraw", "Landroidx/compose/ui/graphics/Canvas;", "drawBlock", "invalidateParentLayer", "Landroidx/compose/ui/node/OwnedLayer;", "createLayer", "layer", "recycle$ui_release", "(Landroidx/compose/ui/node/OwnedLayer;)Z", "recycle", "onSemanticsChange", "onLayoutChange", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "registerOnLayoutCompletedListener", "Landroidx/compose/ui/focus/FocusDirection;", "getFocusDirection-P8AzH3I", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/focus/FocusDirection;", "getFocusDirection", "dispatchDraw", "isDirty", "notifyLayerIsDirty$ui_release", "(Landroidx/compose/ui/node/OwnedLayer;Z)V", "notifyLayerIsDirty", "Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "callback", "setOnViewTreeOwnersAvailable", "boundsUpdatesEventLoop", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "invalidateDescendants", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/view/ViewStructure;", "structure", "flags", "onProvideAutofillVirtualStructure", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "values", "autofill", "", "virtualIds", "", "supportedFormats", "Ljava/util/function/Consumer;", "Landroid/view/translation/ViewTranslationRequest;", "requestsCollector", "onCreateVirtualViewTranslationRequests", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "response", "onVirtualViewTranslationResponses", "dispatchGenericMotionEvent", "dispatchTouchEvent", "canScrollHorizontally", "canScrollVertically", "Landroidx/compose/ui/geometry/Offset;", "localPosition", "localToScreen-MK-Hz9U", "(J)J", "localToScreen", "Landroidx/compose/ui/graphics/Matrix;", "localTransform", "localToScreen-58bKbWc", "([F)V", "positionOnScreen", "screenToLocal-MK-Hz9U", "screenToLocal", "onCheckIsTextEditor", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "onCreateInputConnection", "positionInWindow", "calculateLocalPosition-MK-Hz9U", "calculateLocalPosition", "calculatePositionInWindow-MK-Hz9U", "calculatePositionInWindow", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "layoutDirection", "onRtlPropertiesChanged", "dispatchHoverEvent", "findViewByAccessibilityIdTraversal", "shouldDelayChildPressedState", "Lkotlin/coroutines/g;", "coroutineContext", "Lkotlin/coroutines/g;", "getCoroutineContext", "()Lkotlin/coroutines/g;", "lastDownPointerPosition", "J", "superclassInitComplete", "Z", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "sharedDrawScope", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "getSharedDrawScope", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "Landroidx/compose/ui/unit/Density;", "<set-?>", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/semantics/EmptySemanticsElement;", "semanticsModifier", "Landroidx/compose/ui/semantics/EmptySemanticsElement;", "Landroidx/compose/ui/focus/FocusOwner;", "focusOwner", "Landroidx/compose/ui/focus/FocusOwner;", "getFocusOwner", "()Landroidx/compose/ui/focus/FocusOwner;", "Landroidx/compose/ui/platform/DragAndDropModifierOnDragListener;", "dragAndDropModifierOnDragListener", "Landroidx/compose/ui/platform/DragAndDropModifierOnDragListener;", "Landroidx/compose/ui/draganddrop/DragAndDropManager;", "dragAndDropManager", "Landroidx/compose/ui/draganddrop/DragAndDropManager;", "getDragAndDropManager", "()Landroidx/compose/ui/draganddrop/DragAndDropManager;", "Landroidx/compose/ui/platform/WindowInfoImpl;", "_windowInfo", "Landroidx/compose/ui/platform/WindowInfoImpl;", "Landroidx/compose/ui/Modifier;", "keyInputModifier", "Landroidx/compose/ui/Modifier;", "rotaryInputModifier", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "Landroidx/compose/ui/graphics/CanvasHolder;", "root", "Landroidx/compose/ui/node/LayoutNode;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/RootForTest;", "rootForTest", "Landroidx/compose/ui/node/RootForTest;", "getRootForTest", "()Landroidx/compose/ui/node/RootForTest;", "Landroidx/compose/ui/semantics/SemanticsOwner;", "semanticsOwner", "Landroidx/compose/ui/semantics/SemanticsOwner;", "getSemanticsOwner", "()Landroidx/compose/ui/semantics/SemanticsOwner;", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "composeAccessibilityDelegate", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "Landroidx/compose/ui/autofill/AutofillTree;", "autofillTree", "Landroidx/compose/ui/autofill/AutofillTree;", "getAutofillTree", "()Landroidx/compose/ui/autofill/AutofillTree;", "", "dirtyLayers", "Ljava/util/List;", "postponedDirtyLayers", "isDrawingContent", "Landroidx/compose/ui/input/pointer/MotionEventAdapter;", "motionEventAdapter", "Landroidx/compose/ui/input/pointer/MotionEventAdapter;", "Landroidx/compose/ui/input/pointer/PointerInputEventProcessor;", "pointerInputEventProcessor", "Landroidx/compose/ui/input/pointer/PointerInputEventProcessor;", "configurationChangeObserver", "Lv3/l;", "getConfigurationChangeObserver", "()Lv3/l;", "setConfigurationChangeObserver", "(Lv3/l;)V", "Landroidx/compose/ui/autofill/AndroidAutofill;", "_autofill", "Landroidx/compose/ui/autofill/AndroidAutofill;", "observationClearRequested", "Landroidx/compose/ui/platform/AndroidClipboardManager;", "clipboardManager", "Landroidx/compose/ui/platform/AndroidClipboardManager;", "getClipboardManager", "()Landroidx/compose/ui/platform/AndroidClipboardManager;", "Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "accessibilityManager", "Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "showLayoutBounds", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "(Z)V", "getShowLayoutBounds$annotations", "()V", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "_androidViewsHandler", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "Landroidx/compose/ui/platform/DrawChildContainer;", "viewLayersContainer", "Landroidx/compose/ui/platform/DrawChildContainer;", "onMeasureConstraints", "Landroidx/compose/ui/unit/Constraints;", "wasMeasuredWithMultipleConstraints", "Landroidx/compose/ui/node/MeasureAndLayoutDelegate;", "measureAndLayoutDelegate", "Landroidx/compose/ui/node/MeasureAndLayoutDelegate;", "Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "Landroidx/compose/ui/unit/IntOffset;", "globalPosition", "tmpPositionArray", "[I", "tmpMatrix", "[F", "viewToWindowMatrix", "windowToViewMatrix", "lastMatrixRecalculationAnimationTime", "getLastMatrixRecalculationAnimationTime$ui_release", "()J", "setLastMatrixRecalculationAnimationTime$ui_release", "(J)V", "getLastMatrixRecalculationAnimationTime$ui_release$annotations", "forceUseMatrixCache", "windowPosition", "isRenderNodeCompatible", "_viewTreeOwners$delegate", "Landroidx/compose/runtime/MutableState;", "get_viewTreeOwners", "()Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "set_viewTreeOwners", "(Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;)V", "_viewTreeOwners", "viewTreeOwners$delegate", "Landroidx/compose/runtime/State;", "getViewTreeOwners", "viewTreeOwners", "onViewTreeOwnersAvailable", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "globalLayoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "scrollChangedListener", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;", "touchModeChangeListener", "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;", "Landroidx/compose/ui/text/input/TextInputServiceAndroid;", "legacyTextInputServiceAndroid", "Landroidx/compose/ui/text/input/TextInputServiceAndroid;", "Landroidx/compose/ui/text/input/TextInputService;", "textInputService", "Landroidx/compose/ui/text/input/TextInputService;", "getTextInputService", "()Landroidx/compose/ui/text/input/TextInputService;", "Landroidx/compose/ui/SessionMutex;", "Landroidx/compose/ui/platform/AndroidPlatformTextInputSession;", "textInputSessionMutex", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "softwareKeyboardController", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "getSoftwareKeyboardController", "()Landroidx/compose/ui/platform/SoftwareKeyboardController;", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "fontLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getFontLoader", "()Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getFontLoader$annotations", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver$delegate", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "setFontFamilyResolver", "(Landroidx/compose/ui/text/font/FontFamily$Resolver;)V", "fontFamilyResolver", "currentFontWeightAdjustment", "I", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection$delegate", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "Landroidx/compose/ui/input/InputModeManagerImpl;", "_inputModeManager", "Landroidx/compose/ui/input/InputModeManagerImpl;", "Landroidx/compose/ui/modifier/ModifierLocalManager;", "modifierLocalManager", "Landroidx/compose/ui/modifier/ModifierLocalManager;", "getModifierLocalManager", "()Landroidx/compose/ui/modifier/ModifierLocalManager;", "Landroidx/compose/ui/platform/TextToolbar;", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "previousMotionEvent", "Landroid/view/MotionEvent;", "relayoutTime", "Landroidx/compose/ui/platform/WeakCache;", "layerCache", "Landroidx/compose/ui/platform/WeakCache;", "Landroidx/compose/runtime/collection/MutableVector;", "endApplyChangesListeners", "Landroidx/compose/runtime/collection/MutableVector;", "androidx/compose/ui/platform/AndroidComposeView$resendMotionEventRunnable$1", "resendMotionEventRunnable", "Landroidx/compose/ui/platform/AndroidComposeView$resendMotionEventRunnable$1;", "Ljava/lang/Runnable;", "sendHoverExitEvent", "Ljava/lang/Runnable;", "hoverExitReceived", "resendMotionEventOnLayout", "Lv3/a;", "Landroidx/compose/ui/platform/CalculateMatrixToWindow;", "matrixToWindow", "Landroidx/compose/ui/platform/CalculateMatrixToWindow;", "keyboardModifiersRequireUpdate", "Landroidx/compose/ui/input/pointer/PointerIconService;", "pointerIconService", "Landroidx/compose/ui/input/pointer/PointerIconService;", "getPointerIconService", "()Landroidx/compose/ui/input/pointer/PointerIconService;", "getFontWeightAdjustmentCompat", "(Landroid/content/res/Configuration;)I", "fontWeightAdjustmentCompat", "getView", "()Landroid/view/View;", "Landroidx/compose/ui/platform/WindowInfo;", "getWindowInfo", "()Landroidx/compose/ui/platform/WindowInfo;", "windowInfo", "Landroidx/compose/ui/autofill/Autofill;", "getAutofill", "()Landroidx/compose/ui/autofill/Autofill;", "getAndroidViewsHandler$ui_release", "()Landroidx/compose/ui/platform/AndroidViewsHandler;", "androidViewsHandler", "getMeasureIteration", "measureIteration", "getHasPendingMeasureOrLayout", "hasPendingMeasureOrLayout", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getPlacementScope", "()Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placementScope", "Landroidx/compose/ui/input/InputModeManager;", "getInputModeManager", "()Landroidx/compose/ui/input/InputModeManager;", "inputModeManager", "isLifecycleInResumedState", "Landroid/content/Context;", com.umeng.analytics.pro.d.X, "<init>", "(Landroid/content/Context;Lkotlin/coroutines/g;)V", "Companion", "AndroidComposeViewTranslationCallback", "ViewTreeOwners", "ui_release"}, k = 1, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nAndroidComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 7 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 8 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n+ 9 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 10 DebugUtils.kt\nandroidx/compose/ui/platform/DebugUtilsKt\n+ 11 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,2348:1\n1071#1,4:2388\n1071#1,4:2392\n1208#2:2349\n1187#2,2:2350\n81#3:2352\n107#3,2:2353\n81#3:2355\n81#3:2356\n107#3,2:2357\n81#3:2359\n107#3,2:2360\n62#4:2362\n63#4,6:2366\n1#5:2363\n1#5:2402\n728#6,2:2364\n523#6:2372\n728#6,2:2373\n460#6,11:2404\n460#6,11:2416\n26#7,5:2375\n26#7,5:2380\n26#7,3:2385\n30#7:2396\n26#7,5:2431\n47#8,5:2397\n197#9:2403\n197#9:2415\n20#10,2:2427\n20#10,2:2429\n217#11,6:2436\n*S KotlinDebug\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView\n*L\n1045#1:2388,4\n1046#1:2392,4\n524#1:2349\n524#1:2350,2\n377#1:2352\n377#1:2353,2\n386#1:2355\n448#1:2356\n448#1:2357,2\n462#1:2359\n462#1:2360,2\n652#1:2362\n652#1:2366,6\n652#1:2363\n652#1:2364,2\n739#1:2372\n752#1:2373,2\n1305#1:2404,11\n1313#1:2416,11\n969#1:2375,5\n981#1:2380,5\n1041#1:2385,3\n1041#1:2396\n1493#1:2431,5\n1231#1:2397,5\n1305#1:2403\n1313#1:2415\n1325#1:2427,2\n1389#1:2429,2\n1572#1:2436,6\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidComposeView extends ViewGroup implements Owner, ViewRootForTest, PositionCalculator, DefaultLifecycleObserver {

    @p4.l
    private static final String FocusTag = "Compose Focus";
    private static final int MaximumLayerCacheSize = 10;

    @p4.m
    private static Method getBooleanMethod;

    @p4.m
    private static Class<?> systemPropertiesClass;

    @p4.m
    private AndroidViewsHandler _androidViewsHandler;

    @p4.m
    private final AndroidAutofill _autofill;

    @p4.l
    private final InputModeManagerImpl _inputModeManager;

    @p4.l
    private final MutableState _viewTreeOwners$delegate;

    @p4.l
    private final WindowInfoImpl _windowInfo;

    @p4.l
    private final AndroidAccessibilityManager accessibilityManager;

    @p4.l
    private final AutofillTree autofillTree;

    @p4.l
    private final CanvasHolder canvasHolder;

    @p4.l
    private final AndroidClipboardManager clipboardManager;

    @p4.l
    private final AndroidComposeViewAccessibilityDelegateCompat composeAccessibilityDelegate;

    @p4.l
    private v3.l<? super Configuration, r2> configurationChangeObserver;

    @p4.l
    private final kotlin.coroutines.g coroutineContext;
    private int currentFontWeightAdjustment;

    @p4.l
    private Density density;

    @p4.l
    private final List<OwnedLayer> dirtyLayers;

    @p4.l
    private final DragAndDropManager dragAndDropManager;

    @p4.l
    private final DragAndDropModifierOnDragListener dragAndDropModifierOnDragListener;

    @p4.l
    private final MutableVector<v3.a<r2>> endApplyChangesListeners;

    @p4.l
    private final FocusOwner focusOwner;

    @p4.l
    private final MutableState fontFamilyResolver$delegate;

    @p4.l
    private final Font.ResourceLoader fontLoader;
    private boolean forceUseMatrixCache;

    @p4.l
    private final ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener;
    private long globalPosition;

    @p4.l
    private final HapticFeedback hapticFeedBack;
    private boolean hoverExitReceived;
    private boolean isDrawingContent;
    private boolean isRenderNodeCompatible;

    @p4.l
    private final Modifier keyInputModifier;
    private boolean keyboardModifiersRequireUpdate;
    private long lastDownPointerPosition;
    private long lastMatrixRecalculationAnimationTime;

    @p4.l
    private final WeakCache<OwnedLayer> layerCache;

    @p4.l
    private final MutableState layoutDirection$delegate;

    @p4.l
    private final TextInputServiceAndroid legacyTextInputServiceAndroid;

    @p4.l
    private final CalculateMatrixToWindow matrixToWindow;

    @p4.l
    private final MeasureAndLayoutDelegate measureAndLayoutDelegate;

    @p4.l
    private final ModifierLocalManager modifierLocalManager;

    @p4.l
    private final MotionEventAdapter motionEventAdapter;
    private boolean observationClearRequested;

    @p4.m
    private Constraints onMeasureConstraints;

    @p4.m
    private v3.l<? super ViewTreeOwners, r2> onViewTreeOwnersAvailable;

    @p4.l
    private final PointerIconService pointerIconService;

    @p4.l
    private final PointerInputEventProcessor pointerInputEventProcessor;

    @p4.m
    private List<OwnedLayer> postponedDirtyLayers;

    @p4.m
    private MotionEvent previousMotionEvent;
    private long relayoutTime;

    @p4.l
    private final v3.a<r2> resendMotionEventOnLayout;

    @p4.l
    private final AndroidComposeView$resendMotionEventRunnable$1 resendMotionEventRunnable;

    @p4.l
    private final LayoutNode root;

    @p4.l
    private final RootForTest rootForTest;

    @p4.l
    private final Modifier rotaryInputModifier;

    @p4.l
    private final ViewTreeObserver.OnScrollChangedListener scrollChangedListener;

    @p4.l
    private final EmptySemanticsElement semanticsModifier;

    @p4.l
    private final SemanticsOwner semanticsOwner;

    @p4.l
    private final Runnable sendHoverExitEvent;

    @p4.l
    private final LayoutNodeDrawScope sharedDrawScope;
    private boolean showLayoutBounds;

    @p4.l
    private final OwnerSnapshotObserver snapshotObserver;

    @p4.l
    private final SoftwareKeyboardController softwareKeyboardController;
    private boolean superclassInitComplete;

    @p4.l
    private final TextInputService textInputService;

    @p4.l
    private final AtomicReference<SessionMutex.Session<Object>> textInputSessionMutex;

    @p4.l
    private final TextToolbar textToolbar;

    @p4.l
    private final float[] tmpMatrix;

    @p4.l
    private final int[] tmpPositionArray;

    @p4.l
    private final ViewTreeObserver.OnTouchModeChangeListener touchModeChangeListener;

    @p4.l
    private final ViewConfiguration viewConfiguration;

    @p4.m
    private DrawChildContainer viewLayersContainer;

    @p4.l
    private final float[] viewToWindowMatrix;

    @p4.l
    private final State viewTreeOwners$delegate;
    private boolean wasMeasuredWithMultipleConstraints;
    private long windowPosition;

    @p4.l
    private final float[] windowToViewMatrix;

    @p4.l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @kotlin.i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$AndroidComposeViewTranslationCallback;", "Landroid/view/translation/ViewTranslationCallback;", "()V", "onClearTranslation", "", "view", "Landroid/view/View;", "onHideTranslation", "onShowTranslation", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RequiresApi(31)
    /* loaded from: classes.dex */
    private static final class AndroidComposeViewTranslationCallback implements ViewTranslationCallback {
        @Override // android.view.translation.ViewTranslationCallback
        public boolean onClearTranslation(@p4.l View view) {
            kotlin.jvm.internal.l0.n(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
            ((AndroidComposeView) view).composeAccessibilityDelegate.onClearTranslation$ui_release();
            return true;
        }

        @Override // android.view.translation.ViewTranslationCallback
        public boolean onHideTranslation(@p4.l View view) {
            kotlin.jvm.internal.l0.n(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
            ((AndroidComposeView) view).composeAccessibilityDelegate.onHideTranslation$ui_release();
            return true;
        }

        @Override // android.view.translation.ViewTranslationCallback
        public boolean onShowTranslation(@p4.l View view) {
            kotlin.jvm.internal.l0.n(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
            ((AndroidComposeView) view).composeAccessibilityDelegate.onShowTranslation$ui_release();
            return true;
        }
    }

    @kotlin.i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$Companion;", "", "()V", "FocusTag", "", "MaximumLayerCacheSize", "", "getBooleanMethod", "Ljava/lang/reflect/Method;", "systemPropertiesClass", "Ljava/lang/Class;", "getIsShowingLayoutBounds", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean getIsShowingLayoutBounds() {
            Object obj;
            Method method;
            try {
                Boolean bool = null;
                if (AndroidComposeView.systemPropertiesClass == null) {
                    AndroidComposeView.systemPropertiesClass = Class.forName("android.os.SystemProperties");
                    Class cls = AndroidComposeView.systemPropertiesClass;
                    if (cls != null) {
                        method = cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
                    } else {
                        method = null;
                    }
                    AndroidComposeView.getBooleanMethod = method;
                }
                Method method2 = AndroidComposeView.getBooleanMethod;
                if (method2 != null) {
                    obj = method2.invoke(null, "debug.layout", Boolean.FALSE);
                } else {
                    obj = null;
                }
                if (obj instanceof Boolean) {
                    bool = (Boolean) obj;
                }
                if (bool == null) {
                    return false;
                }
                return bool.booleanValue();
            } catch (Exception unused) {
                return false;
            }
        }
    }

    @StabilityInferred(parameters = 0)
    @kotlin.i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "savedStateRegistryOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/savedstate/SavedStateRegistryOwner;)V", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "getSavedStateRegistryOwner", "()Landroidx/savedstate/SavedStateRegistryOwner;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class ViewTreeOwners {
        public static final int $stable = 8;

        @p4.l
        private final LifecycleOwner lifecycleOwner;

        @p4.l
        private final SavedStateRegistryOwner savedStateRegistryOwner;

        public ViewTreeOwners(@p4.l LifecycleOwner lifecycleOwner, @p4.l SavedStateRegistryOwner savedStateRegistryOwner) {
            this.lifecycleOwner = lifecycleOwner;
            this.savedStateRegistryOwner = savedStateRegistryOwner;
        }

        @p4.l
        public final LifecycleOwner getLifecycleOwner() {
            return this.lifecycleOwner;
        }

        @p4.l
        public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
            return this.savedStateRegistryOwner;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11, types: [androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1] */
    public AndroidComposeView(@p4.l Context context, @p4.l kotlin.coroutines.g gVar) {
        super(context);
        AndroidAutofill androidAutofill;
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        int m4418getKeyboardaOaMEAU;
        CalculateMatrixToWindow calculateMatrixToWindowApi21;
        this.coroutineContext = gVar;
        Offset.Companion companion = Offset.Companion;
        this.lastDownPointerPosition = companion.m3508getUnspecifiedF1C5BW0();
        this.superclassInitComplete = true;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        this.sharedDrawScope = new LayoutNodeDrawScope(null, 1, 0 == true ? 1 : 0);
        this.density = AndroidDensity_androidKt.Density(context);
        EmptySemanticsElement emptySemanticsElement = EmptySemanticsElement.INSTANCE;
        this.semanticsModifier = emptySemanticsElement;
        this.focusOwner = new FocusOwnerImpl(new AndroidComposeView$focusOwner$1(this));
        DragAndDropModifierOnDragListener dragAndDropModifierOnDragListener = new DragAndDropModifierOnDragListener(new AndroidComposeView$dragAndDropModifierOnDragListener$1(this));
        this.dragAndDropModifierOnDragListener = dragAndDropModifierOnDragListener;
        this.dragAndDropManager = dragAndDropModifierOnDragListener;
        this._windowInfo = new WindowInfoImpl();
        Modifier.Companion companion2 = Modifier.Companion;
        Modifier onKeyEvent = KeyInputModifierKt.onKeyEvent(companion2, new AndroidComposeView$keyInputModifier$1(this));
        this.keyInputModifier = onKeyEvent;
        Modifier onRotaryScrollEvent = RotaryInputModifierKt.onRotaryScrollEvent(companion2, AndroidComposeView$rotaryInputModifier$1.INSTANCE);
        this.rotaryInputModifier = onRotaryScrollEvent;
        this.canvasHolder = new CanvasHolder();
        LayoutNode layoutNode = new LayoutNode(false, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        layoutNode.setMeasurePolicy(RootMeasurePolicy.INSTANCE);
        layoutNode.setDensity(getDensity());
        layoutNode.setModifier(companion2.then(emptySemanticsElement).then(onRotaryScrollEvent).then(getFocusOwner().getModifier()).then(onKeyEvent).then(dragAndDropModifierOnDragListener.getModifier()));
        this.root = layoutNode;
        this.rootForTest = this;
        this.semanticsOwner = new SemanticsOwner(getRoot());
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.composeAccessibilityDelegate = androidComposeViewAccessibilityDelegateCompat;
        this.autofillTree = new AutofillTree();
        this.dirtyLayers = new ArrayList();
        this.motionEventAdapter = new MotionEventAdapter();
        this.pointerInputEventProcessor = new PointerInputEventProcessor(getRoot());
        this.configurationChangeObserver = AndroidComposeView$configurationChangeObserver$1.INSTANCE;
        if (autofillSupported()) {
            androidAutofill = new AndroidAutofill(this, getAutofillTree());
        } else {
            androidAutofill = null;
        }
        this._autofill = androidAutofill;
        this.clipboardManager = new AndroidClipboardManager(context);
        this.accessibilityManager = new AndroidAccessibilityManager(context);
        this.snapshotObserver = new OwnerSnapshotObserver(new AndroidComposeView$snapshotObserver$1(this));
        this.measureAndLayoutDelegate = new MeasureAndLayoutDelegate(getRoot());
        this.viewConfiguration = new AndroidViewConfiguration(android.view.ViewConfiguration.get(context));
        this.globalPosition = IntOffsetKt.IntOffset(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.tmpPositionArray = new int[]{0, 0};
        float[] m3964constructorimpl$default = Matrix.m3964constructorimpl$default(null, 1, null);
        this.tmpMatrix = m3964constructorimpl$default;
        this.viewToWindowMatrix = Matrix.m3964constructorimpl$default(null, 1, null);
        this.windowToViewMatrix = Matrix.m3964constructorimpl$default(null, 1, null);
        this.lastMatrixRecalculationAnimationTime = -1L;
        this.windowPosition = companion.m3507getInfiniteF1C5BW0();
        this.isRenderNodeCompatible = true;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this._viewTreeOwners$delegate = mutableStateOf$default;
        this.viewTreeOwners$delegate = SnapshotStateKt.derivedStateOf(new AndroidComposeView$viewTreeOwners$2(this));
        this.globalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.compose.ui.platform.c
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AndroidComposeView.this.updatePositionCacheAndDispatch();
            }
        };
        this.scrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.compose.ui.platform.d
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                AndroidComposeView.this.updatePositionCacheAndDispatch();
            }
        };
        this.touchModeChangeListener = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: androidx.compose.ui.platform.e
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z4) {
                AndroidComposeView.touchModeChangeListener$lambda$3(AndroidComposeView.this, z4);
            }
        };
        TextInputServiceAndroid textInputServiceAndroid = new TextInputServiceAndroid(getView(), this);
        this.legacyTextInputServiceAndroid = textInputServiceAndroid;
        this.textInputService = new TextInputService(AndroidComposeView_androidKt.getPlatformTextInputServiceInterceptor().invoke(textInputServiceAndroid));
        this.textInputSessionMutex = SessionMutex.m3373constructorimpl();
        this.softwareKeyboardController = new DelegatingSoftwareKeyboardController(getTextInputService());
        this.fontLoader = new AndroidFontResourceLoader(context);
        this.fontFamilyResolver$delegate = SnapshotStateKt.mutableStateOf(FontFamilyResolver_androidKt.createFontFamilyResolver(context), SnapshotStateKt.referentialEqualityPolicy());
        this.currentFontWeightAdjustment = getFontWeightAdjustmentCompat(context.getResources().getConfiguration());
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AndroidComposeView_androidKt.getLocaleLayoutDirection(context.getResources().getConfiguration()), null, 2, null);
        this.layoutDirection$delegate = mutableStateOf$default2;
        this.hapticFeedBack = new PlatformHapticFeedback(this);
        if (isInTouchMode()) {
            m4418getKeyboardaOaMEAU = InputMode.Companion.m4419getTouchaOaMEAU();
        } else {
            m4418getKeyboardaOaMEAU = InputMode.Companion.m4418getKeyboardaOaMEAU();
        }
        this._inputModeManager = new InputModeManagerImpl(m4418getKeyboardaOaMEAU, new AndroidComposeView$_inputModeManager$1(this), objArr2 == true ? 1 : 0);
        this.modifierLocalManager = new ModifierLocalManager(this);
        this.textToolbar = new AndroidTextToolbar(this);
        this.layerCache = new WeakCache<>();
        this.endApplyChangesListeners = new MutableVector<>(new v3.a[16], 0);
        this.resendMotionEventRunnable = new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1
            @Override // java.lang.Runnable
            public void run() {
                MotionEvent motionEvent;
                boolean z4;
                long j5;
                AndroidComposeView.this.removeCallbacks(this);
                motionEvent = AndroidComposeView.this.previousMotionEvent;
                if (motionEvent != null) {
                    boolean z5 = false;
                    if (motionEvent.getToolType(0) == 3) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (!z4 ? actionMasked != 1 : !(actionMasked == 10 || actionMasked == 1)) {
                        z5 = true;
                    }
                    if (z5) {
                        int i5 = 7;
                        if (actionMasked != 7 && actionMasked != 9) {
                            i5 = 2;
                        }
                        AndroidComposeView androidComposeView = AndroidComposeView.this;
                        j5 = androidComposeView.relayoutTime;
                        androidComposeView.sendSimulatedEvent(motionEvent, i5, j5, false);
                    }
                }
            }
        };
        this.sendHoverExitEvent = new Runnable() { // from class: androidx.compose.ui.platform.f
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeView.sendHoverExitEvent$lambda$5(AndroidComposeView.this);
            }
        };
        this.resendMotionEventOnLayout = new AndroidComposeView$resendMotionEventOnLayout$1(this);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            calculateMatrixToWindowApi21 = new CalculateMatrixToWindowApi29();
        } else {
            calculateMatrixToWindowApi21 = new CalculateMatrixToWindowApi21(m3964constructorimpl$default, objArr == true ? 1 : 0);
        }
        this.matrixToWindow = calculateMatrixToWindowApi21;
        setWillNotDraw(false);
        setFocusable(true);
        if (i5 >= 26) {
            AndroidComposeViewVerificationHelperMethodsO.INSTANCE.focusable(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        ViewCompat.setAccessibilityDelegate(this, androidComposeViewAccessibilityDelegateCompat);
        v3.l<ViewRootForTest, r2> onViewCreatedCallback = ViewRootForTest.Companion.getOnViewCreatedCallback();
        if (onViewCreatedCallback != null) {
            onViewCreatedCallback.invoke(this);
        }
        setOnDragListener(dragAndDropModifierOnDragListener);
        getRoot().attach$ui_release(this);
        if (i5 >= 29) {
            AndroidComposeViewForceDarkModeQ.INSTANCE.disallowForceDark(this);
        }
        this.pointerIconService = new PointerIconService() { // from class: androidx.compose.ui.platform.AndroidComposeView$pointerIconService$1

            @p4.l
            private PointerIcon currentIcon = PointerIcon.Companion.getDefault();

            @Override // androidx.compose.ui.input.pointer.PointerIconService
            @p4.l
            public PointerIcon getIcon() {
                return this.currentIcon;
            }

            @Override // androidx.compose.ui.input.pointer.PointerIconService
            public void setIcon(@p4.m PointerIcon pointerIcon) {
                if (pointerIcon == null) {
                    pointerIcon = PointerIcon.Companion.getDefault();
                }
                this.currentIcon = pointerIcon;
                AndroidComposeViewVerificationHelperMethodsN.INSTANCE.setPointerIcon(AndroidComposeView.this, pointerIcon);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addExtraDataToAccessibilityNodeInfoHelper(int i5, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        Integer num;
        if (kotlin.jvm.internal.l0.g(str, this.composeAccessibilityDelegate.getExtraDataTestTraversalBeforeVal$ui_release())) {
            Integer num2 = this.composeAccessibilityDelegate.getIdToBeforeMap$ui_release().get(Integer.valueOf(i5));
            if (num2 != null) {
                accessibilityNodeInfo.getExtras().putInt(str, num2.intValue());
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.l0.g(str, this.composeAccessibilityDelegate.getExtraDataTestTraversalAfterVal$ui_release()) && (num = this.composeAccessibilityDelegate.getIdToAfterMap$ui_release().get(Integer.valueOf(i5))) != null) {
            accessibilityNodeInfo.getExtras().putInt(str, num.intValue());
        }
    }

    private final boolean autofillSupported() {
        return Build.VERSION.SDK_INT >= 26;
    }

    private final boolean childSizeCanAffectParentSize(LayoutNode layoutNode) {
        boolean z4;
        if (this.wasMeasuredWithMultipleConstraints) {
            return true;
        }
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        if (parent$ui_release != null && !parent$ui_release.getHasFixedInnerContentConstraints$ui_release()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return true;
        }
        return false;
    }

    private final void clearChildInvalidObservations(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = viewGroup.getChildAt(i5);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).onEndApplyChanges();
            } else if (childAt instanceof ViewGroup) {
                clearChildInvalidObservations((ViewGroup) childAt);
            }
        }
    }

    /* renamed from: component1-VKZWuLQ, reason: not valid java name */
    private final int m5279component1VKZWuLQ(long j5) {
        return (int) kotlin.g2.l(j5 >>> 32);
    }

    /* renamed from: component2-VKZWuLQ, reason: not valid java name */
    private final int m5280component2VKZWuLQ(long j5) {
        return (int) kotlin.g2.l(j5 & 4294967295L);
    }

    /* renamed from: convertMeasureSpec-I7RO_PI, reason: not valid java name */
    private final long m5281convertMeasureSpecI7RO_PI(int i5) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    return m5283packZIaKswc(size, size);
                }
                throw new IllegalStateException();
            }
            return m5283packZIaKswc(0, Integer.MAX_VALUE);
        }
        return m5283packZIaKswc(0, size);
    }

    private final View findViewByAccessibilityIdRootedAtCurrentView(int i5, View view) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
            declaredMethod.setAccessible(true);
            if (kotlin.jvm.internal.l0.g(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i5))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i6 = 0; i6 < childCount; i6++) {
                    View findViewByAccessibilityIdRootedAtCurrentView = findViewByAccessibilityIdRootedAtCurrentView(i5, viewGroup.getChildAt(i6));
                    if (findViewByAccessibilityIdRootedAtCurrentView != null) {
                        return findViewByAccessibilityIdRootedAtCurrentView;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @kotlin.k(message = "fontLoader is deprecated, use fontFamilyResolver", replaceWith = @kotlin.b1(expression = "fontFamilyResolver", imports = {}))
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    private final int getFontWeightAdjustmentCompat(Configuration configuration) {
        int i5;
        if (Build.VERSION.SDK_INT < 31) {
            return 0;
        }
        i5 = configuration.fontWeightAdjustment;
        return i5;
    }

    @VisibleForTesting
    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final ViewTreeOwners get_viewTreeOwners() {
        return (ViewTreeOwners) this._viewTreeOwners$delegate.getValue();
    }

    /* renamed from: handleMotionEvent-8iAsVTc, reason: not valid java name */
    private final int m5282handleMotionEvent8iAsVTc(MotionEvent motionEvent) {
        boolean z4;
        removeCallbacks(this.resendMotionEventRunnable);
        try {
            recalculateWindowPosition(motionEvent);
            boolean z5 = true;
            this.forceUseMatrixCache = true;
            measureAndLayout(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.previousMotionEvent;
                if (motionEvent2 != null && motionEvent2.getToolType(0) == 3) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (motionEvent2 != null && hasChangedDevices(motionEvent, motionEvent2)) {
                    if (isDevicePressEvent(motionEvent2)) {
                        this.pointerInputEventProcessor.processCancel();
                    } else if (motionEvent2.getActionMasked() != 10 && z4) {
                        sendSimulatedEvent$default(this, motionEvent2, 10, motionEvent2.getEventTime(), false, 8, null);
                    }
                }
                if (motionEvent.getToolType(0) != 3) {
                    z5 = false;
                }
                if (!z4 && z5 && actionMasked != 3 && actionMasked != 9 && isInBounds(motionEvent)) {
                    sendSimulatedEvent$default(this, motionEvent, 9, motionEvent.getEventTime(), false, 8, null);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.previousMotionEvent = MotionEvent.obtainNoHistory(motionEvent);
                return m5284sendMotionEvent8iAsVTc(motionEvent);
            } finally {
                Trace.endSection();
            }
        } finally {
            this.forceUseMatrixCache = false;
        }
    }

    private final boolean handleRotaryEvent(MotionEvent motionEvent) {
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        float f5 = -motionEvent.getAxisValue(26);
        return getFocusOwner().dispatchRotaryEvent(new RotaryScrollEvent(f5 * ViewConfigurationCompat.getScaledVerticalScrollFactor(viewConfiguration, getContext()), f5 * ViewConfigurationCompat.getScaledHorizontalScrollFactor(viewConfiguration, getContext()), motionEvent.getEventTime(), motionEvent.getDeviceId()));
    }

    private final boolean hasChangedDevices(MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
            return false;
        }
        return true;
    }

    private final void invalidateLayers(LayoutNode layoutNode) {
        layoutNode.invalidateLayers$ui_release();
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i5 = 0;
            do {
                invalidateLayers(content[i5]);
                i5++;
            } while (i5 < size);
        }
    }

    private final void invalidateLayoutNodeMeasurement(LayoutNode layoutNode) {
        int i5 = 0;
        MeasureAndLayoutDelegate.requestRemeasure$default(this.measureAndLayoutDelegate, layoutNode, false, 2, null);
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            do {
                invalidateLayoutNodeMeasurement(content[i5]);
                i5++;
            } while (i5 < size);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a6 A[LOOP:0: B:28:0x0061->B:49:0x00a6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a9 A[EDGE_INSN: B:50:0x00a9->B:56:0x00a9 BREAK  A[LOOP:0: B:28:0x0061->B:49:0x00a6], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean isBadMotionEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            float r0 = r7.getX()
            boolean r1 = java.lang.Float.isInfinite(r0)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L14
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L14
            r0 = r3
            goto L15
        L14:
            r0 = r2
        L15:
            if (r0 == 0) goto L59
            float r0 = r7.getY()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L29
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L29
            r0 = r3
            goto L2a
        L29:
            r0 = r2
        L2a:
            if (r0 == 0) goto L59
            float r0 = r7.getRawX()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L3e
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L3e
            r0 = r3
            goto L3f
        L3e:
            r0 = r2
        L3f:
            if (r0 == 0) goto L59
            float r0 = r7.getRawY()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L53
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L53
            r0 = r3
            goto L54
        L53:
            r0 = r2
        L54:
            if (r0 != 0) goto L57
            goto L59
        L57:
            r0 = r2
            goto L5a
        L59:
            r0 = r3
        L5a:
            if (r0 != 0) goto La9
            int r1 = r7.getPointerCount()
            r4 = r3
        L61:
            if (r4 >= r1) goto La9
            float r0 = r7.getX(r4)
            boolean r5 = java.lang.Float.isInfinite(r0)
            if (r5 != 0) goto L75
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L75
            r0 = r3
            goto L76
        L75:
            r0 = r2
        L76:
            if (r0 == 0) goto La3
            float r0 = r7.getY(r4)
            boolean r5 = java.lang.Float.isInfinite(r0)
            if (r5 != 0) goto L8a
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L8a
            r0 = r3
            goto L8b
        L8a:
            r0 = r2
        L8b:
            if (r0 == 0) goto La3
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r0 < r5) goto L9d
            androidx.compose.ui.platform.MotionEventVerifierApi29 r0 = androidx.compose.ui.platform.MotionEventVerifierApi29.INSTANCE
            boolean r0 = r0.isValidMotionEvent(r7, r4)
            if (r0 != 0) goto L9d
            r0 = r3
            goto L9e
        L9d:
            r0 = r2
        L9e:
            if (r0 == 0) goto La1
            goto La3
        La1:
            r0 = r2
            goto La4
        La3:
            r0 = r3
        La4:
            if (r0 != 0) goto La9
            int r4 = r4 + 1
            goto L61
        La9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.isBadMotionEvent(android.view.MotionEvent):boolean");
    }

    private final boolean isDevicePressEvent(MotionEvent motionEvent) {
        int actionMasked;
        if (motionEvent.getButtonState() != 0 || (actionMasked = motionEvent.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
            return true;
        }
        return false;
    }

    private final boolean isInBounds(MotionEvent motionEvent) {
        boolean z4;
        boolean z5;
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        if (0.0f <= x4 && x4 <= getWidth()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (0.0f <= y4 && y4 <= getHeight()) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                return true;
            }
        }
        return false;
    }

    private final boolean isPositionChanged(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        boolean z4;
        boolean z5;
        if (motionEvent.getPointerCount() != 1 || (motionEvent2 = this.previousMotionEvent) == null || motionEvent2.getPointerCount() != motionEvent.getPointerCount()) {
            return true;
        }
        if (motionEvent.getRawX() == motionEvent2.getRawX()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return true;
        }
        if (motionEvent.getRawY() == motionEvent2.getRawY()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            return true;
        }
        return false;
    }

    /* renamed from: pack-ZIaKswc, reason: not valid java name */
    private final long m5283packZIaKswc(int i5, int i6) {
        return kotlin.g2.l(kotlin.g2.l(i6) | kotlin.g2.l(kotlin.g2.l(i5) << 32));
    }

    private final void recalculateWindowPosition() {
        if (this.forceUseMatrixCache) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
            this.lastMatrixRecalculationAnimationTime = currentAnimationTimeMillis;
            recalculateWindowViewTransforms();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            view.getLocationOnScreen(this.tmpPositionArray);
            int[] iArr = this.tmpPositionArray;
            float f5 = iArr[0];
            float f6 = iArr[1];
            view.getLocationInWindow(iArr);
            int[] iArr2 = this.tmpPositionArray;
            this.windowPosition = OffsetKt.Offset(f5 - iArr2[0], f6 - iArr2[1]);
        }
    }

    private final void recalculateWindowViewTransforms() {
        this.matrixToWindow.mo5298calculateMatrixToWindowEL8BTi8(this, this.viewToWindowMatrix);
        InvertMatrixKt.m5322invertToJiSxe2E(this.viewToWindowMatrix, this.windowToViewMatrix);
    }

    private final void scheduleMeasureAndLayout(LayoutNode layoutNode) {
        if (!isLayoutRequested() && isAttachedToWindow()) {
            if (layoutNode != null) {
                while (layoutNode != null && layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock && childSizeCanAffectParentSize(layoutNode)) {
                    layoutNode = layoutNode.getParent$ui_release();
                }
                if (layoutNode == getRoot()) {
                    requestLayout();
                    return;
                }
            }
            if (getWidth() != 0 && getHeight() != 0) {
                invalidate();
            } else {
                requestLayout();
            }
        }
    }

    static /* synthetic */ void scheduleMeasureAndLayout$default(AndroidComposeView androidComposeView, LayoutNode layoutNode, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            layoutNode = null;
        }
        androidComposeView.scheduleMeasureAndLayout(layoutNode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendHoverExitEvent$lambda$5(AndroidComposeView androidComposeView) {
        boolean z4 = false;
        androidComposeView.hoverExitReceived = false;
        MotionEvent motionEvent = androidComposeView.previousMotionEvent;
        kotlin.jvm.internal.l0.m(motionEvent);
        if (motionEvent.getActionMasked() == 10) {
            z4 = true;
        }
        if (z4) {
            androidComposeView.m5284sendMotionEvent8iAsVTc(motionEvent);
            return;
        }
        throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.".toString());
    }

    /* renamed from: sendMotionEvent-8iAsVTc, reason: not valid java name */
    private final int m5284sendMotionEvent8iAsVTc(MotionEvent motionEvent) {
        PointerInputEventData pointerInputEventData;
        if (this.keyboardModifiersRequireUpdate) {
            this.keyboardModifiersRequireUpdate = false;
            this._windowInfo.m5355setKeyboardModifiers5xRPYO0(PointerKeyboardModifiers.m4935constructorimpl(motionEvent.getMetaState()));
        }
        PointerInputEvent convertToPointerInputEvent$ui_release = this.motionEventAdapter.convertToPointerInputEvent$ui_release(motionEvent, this);
        if (convertToPointerInputEvent$ui_release != null) {
            List<PointerInputEventData> pointers = convertToPointerInputEvent$ui_release.getPointers();
            int size = pointers.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i5 = size - 1;
                    pointerInputEventData = pointers.get(size);
                    if (pointerInputEventData.getDown()) {
                        break;
                    }
                    if (i5 < 0) {
                        break;
                    }
                    size = i5;
                }
            }
            pointerInputEventData = null;
            PointerInputEventData pointerInputEventData2 = pointerInputEventData;
            if (pointerInputEventData2 != null) {
                this.lastDownPointerPosition = pointerInputEventData2.m4889getPositionF1C5BW0();
            }
            int m4894processBIzXfog = this.pointerInputEventProcessor.m4894processBIzXfog(convertToPointerInputEvent$ui_release, this, isInBounds(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked == 0 || actionMasked == 5) && !ProcessResult.m4961getDispatchedToAPointerInputModifierimpl(m4894processBIzXfog)) {
                this.motionEventAdapter.endStream(motionEvent.getPointerId(motionEvent.getActionIndex()));
                return m4894processBIzXfog;
            }
            return m4894processBIzXfog;
        }
        this.pointerInputEventProcessor.processCancel();
        return PointerInputEventProcessorKt.ProcessResult(false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendSimulatedEvent(MotionEvent motionEvent, int i5, long j5, boolean z4) {
        int i6;
        int buttonState;
        long downTime;
        int i7;
        int actionMasked = motionEvent.getActionMasked();
        int i8 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i8 = motionEvent.getActionIndex();
            }
        } else if (i5 != 9 && i5 != 10) {
            i8 = 0;
        }
        int pointerCount = motionEvent.getPointerCount();
        if (i8 >= 0) {
            i6 = 1;
        } else {
            i6 = 0;
        }
        int i9 = pointerCount - i6;
        if (i9 == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            pointerPropertiesArr[i10] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[i9];
        for (int i11 = 0; i11 < i9; i11++) {
            pointerCoordsArr[i11] = new MotionEvent.PointerCoords();
        }
        for (int i12 = 0; i12 < i9; i12++) {
            if (i8 >= 0 && i12 >= i8) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            int i13 = i7 + i12;
            motionEvent.getPointerProperties(i13, pointerPropertiesArr[i12]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i12];
            motionEvent.getPointerCoords(i13, pointerCoords);
            long mo4954localToScreenMKHz9U = mo4954localToScreenMKHz9U(OffsetKt.Offset(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = Offset.m3493getXimpl(mo4954localToScreenMKHz9U);
            pointerCoords.y = Offset.m3494getYimpl(mo4954localToScreenMKHz9U);
        }
        if (z4) {
            buttonState = 0;
        } else {
            buttonState = motionEvent.getButtonState();
        }
        if (motionEvent.getDownTime() == motionEvent.getEventTime()) {
            downTime = j5;
        } else {
            downTime = motionEvent.getDownTime();
        }
        MotionEvent obtain = MotionEvent.obtain(downTime, j5, i5, i9, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), buttonState, motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        PointerInputEvent convertToPointerInputEvent$ui_release = this.motionEventAdapter.convertToPointerInputEvent$ui_release(obtain, this);
        kotlin.jvm.internal.l0.m(convertToPointerInputEvent$ui_release);
        this.pointerInputEventProcessor.m4894processBIzXfog(convertToPointerInputEvent$ui_release, this, true);
        obtain.recycle();
    }

    static /* synthetic */ void sendSimulatedEvent$default(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i5, long j5, boolean z4, int i6, Object obj) {
        if ((i6 & 8) != 0) {
            z4 = true;
        }
        androidComposeView.sendSimulatedEvent(motionEvent, i5, j5, z4);
    }

    private void setFontFamilyResolver(FontFamily.Resolver resolver) {
        this.fontFamilyResolver$delegate.setValue(resolver);
    }

    private void setLayoutDirection(LayoutDirection layoutDirection) {
        this.layoutDirection$delegate.setValue(layoutDirection);
    }

    private final void set_viewTreeOwners(ViewTreeOwners viewTreeOwners) {
        this._viewTreeOwners$delegate.setValue(viewTreeOwners);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startDrag-12SF9DM, reason: not valid java name */
    public final boolean m5285startDrag12SF9DM(DragAndDropTransferData dragAndDropTransferData, long j5, v3.l<? super DrawScope, r2> lVar) {
        Resources resources = getContext().getResources();
        return AndroidComposeViewStartDragAndDropN.INSTANCE.startDragAndDrop(this, dragAndDropTransferData, new ComposeDragShadowBuilder(DensityKt.Density(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), j5, lVar, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void touchModeChangeListener$lambda$3(AndroidComposeView androidComposeView, boolean z4) {
        androidComposeView._inputModeManager.m4422setInputModeiuPiT84(z4 ? InputMode.Companion.m4419getTouchaOaMEAU() : InputMode.Companion.m4418getKeyboardaOaMEAU());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePositionCacheAndDispatch() {
        getLocationOnScreen(this.tmpPositionArray);
        long j5 = this.globalPosition;
        int m6164component1impl = IntOffset.m6164component1impl(j5);
        int m6165component2impl = IntOffset.m6165component2impl(j5);
        int[] iArr = this.tmpPositionArray;
        boolean z4 = false;
        int i5 = iArr[0];
        if (m6164component1impl != i5 || m6165component2impl != iArr[1]) {
            this.globalPosition = IntOffsetKt.IntOffset(i5, iArr[1]);
            if (m6164component1impl != Integer.MAX_VALUE && m6165component2impl != Integer.MAX_VALUE) {
                getRoot().getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
                z4 = true;
            }
        }
        this.measureAndLayoutDelegate.dispatchOnPositionedCallbacks(z4);
    }

    public final void addAndroidView(@p4.l AndroidViewHolder androidViewHolder, @p4.l final LayoutNode layoutNode) {
        getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(androidViewHolder, layoutNode);
        getAndroidViewsHandler$ui_release().addView(androidViewHolder);
        getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(layoutNode, androidViewHolder);
        ViewCompat.setImportantForAccessibility(androidViewHolder, 1);
        ViewCompat.setAccessibilityDelegate(androidViewHolder, new AccessibilityDelegateCompat() { // from class: androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1
            /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
            
                if (r6.intValue() == r5.this$0.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) goto L12;
             */
            @Override // androidx.core.view.AccessibilityDelegateCompat
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onInitializeAccessibilityNodeInfo(@p4.l android.view.View r6, @p4.l androidx.core.view.accessibility.AccessibilityNodeInfoCompat r7) {
                /*
                    r5 = this;
                    super.onInitializeAccessibilityNodeInfo(r6, r7)
                    androidx.compose.ui.platform.AndroidComposeView r6 = androidx.compose.ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r6 = androidx.compose.ui.platform.AndroidComposeView.access$getComposeAccessibilityDelegate$p(r6)
                    boolean r6 = r6.isEnabledForAccessibility$ui_release()
                    if (r6 == 0) goto L13
                    r6 = 0
                    r7.setVisibleToUser(r6)
                L13:
                    androidx.compose.ui.node.LayoutNode r6 = r2
                    androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1 r0 = androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1.INSTANCE
                    androidx.compose.ui.node.LayoutNode r6 = androidx.compose.ui.semantics.SemanticsNodeKt.findClosestParentNode(r6, r0)
                    if (r6 == 0) goto L26
                    int r6 = r6.getSemanticsId()
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                    goto L27
                L26:
                    r6 = 0
                L27:
                    if (r6 == 0) goto L3d
                    androidx.compose.ui.platform.AndroidComposeView r0 = androidx.compose.ui.platform.AndroidComposeView.this
                    androidx.compose.ui.semantics.SemanticsOwner r0 = r0.getSemanticsOwner()
                    androidx.compose.ui.semantics.SemanticsNode r0 = r0.getUnmergedRootSemanticsNode()
                    int r0 = r0.getId()
                    int r1 = r6.intValue()
                    if (r1 != r0) goto L42
                L3d:
                    r6 = -1
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                L42:
                    androidx.compose.ui.platform.AndroidComposeView r0 = r3
                    int r6 = r6.intValue()
                    r7.setParent(r0, r6)
                    androidx.compose.ui.node.LayoutNode r6 = r2
                    int r6 = r6.getSemanticsId()
                    androidx.compose.ui.platform.AndroidComposeView r0 = androidx.compose.ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r0 = androidx.compose.ui.platform.AndroidComposeView.access$getComposeAccessibilityDelegate$p(r0)
                    java.util.HashMap r0 = r0.getIdToBeforeMap$ui_release()
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
                    java.lang.Object r0 = r0.get(r1)
                    java.lang.Integer r0 = (java.lang.Integer) r0
                    if (r0 == 0) goto L93
                    androidx.compose.ui.platform.AndroidComposeView r1 = androidx.compose.ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidComposeView r2 = r3
                    int r3 = r0.intValue()
                    androidx.compose.ui.platform.AndroidViewsHandler r4 = r1.getAndroidViewsHandler$ui_release()
                    int r0 = r0.intValue()
                    android.view.View r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.semanticsIdToView(r4, r0)
                    if (r0 == 0) goto L81
                    r7.setTraversalBefore(r0)
                    goto L84
                L81:
                    r7.setTraversalBefore(r2, r3)
                L84:
                    android.view.accessibility.AccessibilityNodeInfo r0 = r7.unwrap()
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r2 = androidx.compose.ui.platform.AndroidComposeView.access$getComposeAccessibilityDelegate$p(r1)
                    java.lang.String r2 = r2.getExtraDataTestTraversalBeforeVal$ui_release()
                    androidx.compose.ui.platform.AndroidComposeView.access$addExtraDataToAccessibilityNodeInfoHelper(r1, r6, r0, r2)
                L93:
                    androidx.compose.ui.platform.AndroidComposeView r0 = androidx.compose.ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r0 = androidx.compose.ui.platform.AndroidComposeView.access$getComposeAccessibilityDelegate$p(r0)
                    java.util.HashMap r0 = r0.getIdToAfterMap$ui_release()
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
                    java.lang.Object r0 = r0.get(r1)
                    java.lang.Integer r0 = (java.lang.Integer) r0
                    if (r0 == 0) goto Ld5
                    androidx.compose.ui.platform.AndroidComposeView r1 = androidx.compose.ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidComposeView r2 = r3
                    int r3 = r0.intValue()
                    androidx.compose.ui.platform.AndroidViewsHandler r4 = r1.getAndroidViewsHandler$ui_release()
                    int r0 = r0.intValue()
                    android.view.View r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.semanticsIdToView(r4, r0)
                    if (r0 == 0) goto Lc3
                    r7.setTraversalAfter(r0)
                    goto Lc6
                Lc3:
                    r7.setTraversalAfter(r2, r3)
                Lc6:
                    android.view.accessibility.AccessibilityNodeInfo r7 = r7.unwrap()
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r0 = androidx.compose.ui.platform.AndroidComposeView.access$getComposeAccessibilityDelegate$p(r1)
                    java.lang.String r0 = r0.getExtraDataTestTraversalAfterVal$ui_release()
                    androidx.compose.ui.platform.AndroidComposeView.access$addExtraDataToAccessibilityNodeInfoHelper(r1, r6, r7, r0)
                Ld5:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1.onInitializeAccessibilityNodeInfo(android.view.View, androidx.core.view.accessibility.AccessibilityNodeInfoCompat):void");
            }
        });
    }

    @Override // android.view.View
    public void autofill(@p4.l SparseArray<AutofillValue> sparseArray) {
        AndroidAutofill androidAutofill;
        if (!autofillSupported() || (androidAutofill = this._autofill) == null) {
            return;
        }
        AndroidAutofill_androidKt.performAutofill(androidAutofill, sparseArray);
    }

    @p4.m
    public final Object boundsUpdatesEventLoop(@p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object boundsUpdatesEventLoop$ui_release = this.composeAccessibilityDelegate.boundsUpdatesEventLoop$ui_release(dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return boundsUpdatesEventLoop$ui_release == l5 ? boundsUpdatesEventLoop$ui_release : r2.f19517a;
    }

    @Override // androidx.compose.ui.node.Owner
    /* renamed from: calculateLocalPosition-MK-Hz9U */
    public long mo5257calculateLocalPositionMKHz9U(long j5) {
        recalculateWindowPosition();
        return Matrix.m3970mapMKHz9U(this.windowToViewMatrix, j5);
    }

    @Override // androidx.compose.ui.node.Owner
    /* renamed from: calculatePositionInWindow-MK-Hz9U */
    public long mo5258calculatePositionInWindowMKHz9U(long j5) {
        recalculateWindowPosition();
        return Matrix.m3970mapMKHz9U(this.viewToWindowMatrix, j5);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i5) {
        return this.composeAccessibilityDelegate.m5290canScroll0AR0LA0$ui_release(false, i5, this.lastDownPointerPosition);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i5) {
        return this.composeAccessibilityDelegate.m5290canScroll0AR0LA0$ui_release(true, i5, this.lastDownPointerPosition);
    }

    @Override // androidx.compose.ui.node.Owner
    @p4.l
    public OwnedLayer createLayer(@p4.l v3.l<? super Canvas, r2> lVar, @p4.l v3.a<r2> aVar) {
        DrawChildContainer viewLayerContainer;
        OwnedLayer pop = this.layerCache.pop();
        if (pop != null) {
            pop.reuseLayer(lVar, aVar);
            return pop;
        }
        if (isHardwareAccelerated() && this.isRenderNodeCompatible) {
            try {
                return new RenderNodeLayer(this, lVar, aVar);
            } catch (Throwable unused) {
                this.isRenderNodeCompatible = false;
            }
        }
        if (this.viewLayersContainer == null) {
            ViewLayer.Companion companion = ViewLayer.Companion;
            if (!companion.getHasRetrievedMethod()) {
                companion.updateDisplayList(new View(getContext()));
            }
            if (companion.getShouldUseDispatchDraw()) {
                viewLayerContainer = new DrawChildContainer(getContext());
            } else {
                viewLayerContainer = new ViewLayerContainer(getContext());
            }
            this.viewLayersContainer = viewLayerContainer;
            addView(viewLayerContainer);
        }
        DrawChildContainer drawChildContainer = this.viewLayersContainer;
        kotlin.jvm.internal.l0.m(drawChildContainer);
        return new ViewLayer(this, drawChildContainer, lVar, aVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@p4.l android.graphics.Canvas canvas) {
        if (!isAttachedToWindow()) {
            invalidateLayers(getRoot());
        }
        Owner.measureAndLayout$default(this, false, 1, null);
        Snapshot.Companion.sendApplyNotifications();
        this.isDrawingContent = true;
        CanvasHolder canvasHolder = this.canvasHolder;
        android.graphics.Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
        getRoot().draw$ui_release(canvasHolder.getAndroidCanvas());
        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        if (!this.dirtyLayers.isEmpty()) {
            int size = this.dirtyLayers.size();
            for (int i5 = 0; i5 < size; i5++) {
                this.dirtyLayers.get(i5).updateDisplayList();
            }
        }
        if (ViewLayer.Companion.getShouldUseDispatchDraw()) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        this.dirtyLayers.clear();
        this.isDrawingContent = false;
        List<OwnedLayer> list = this.postponedDirtyLayers;
        if (list != null) {
            kotlin.jvm.internal.l0.m(list);
            this.dirtyLayers.addAll(list);
            list.clear();
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(@p4.l MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 8) {
            if (motionEvent.isFromSource(4194304)) {
                return handleRotaryEvent(motionEvent);
            }
            if (!isBadMotionEvent(motionEvent) && isAttachedToWindow()) {
                return ProcessResult.m4961getDispatchedToAPointerInputModifierimpl(m5282handleMotionEvent8iAsVTc(motionEvent));
            }
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(@p4.l MotionEvent motionEvent) {
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            this.sendHoverExitEvent.run();
        }
        if (isBadMotionEvent(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        this.composeAccessibilityDelegate.dispatchHoverEvent$ui_release(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && isInBounds(motionEvent)) {
                if (motionEvent.getToolType(0) == 3 && motionEvent.getButtonState() != 0) {
                    return false;
                }
                MotionEvent motionEvent2 = this.previousMotionEvent;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.previousMotionEvent = MotionEvent.obtainNoHistory(motionEvent);
                this.hoverExitReceived = true;
                post(this.sendHoverExitEvent);
                return false;
            }
        } else if (!isPositionChanged(motionEvent)) {
            return false;
        }
        return ProcessResult.m4961getDispatchedToAPointerInputModifierimpl(m5282handleMotionEvent8iAsVTc(motionEvent));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(@p4.l KeyEvent keyEvent) {
        if (isFocused()) {
            this._windowInfo.m5355setKeyboardModifiers5xRPYO0(PointerKeyboardModifiers.m4935constructorimpl(keyEvent.getMetaState()));
            if (!getFocusOwner().mo3429dispatchKeyEventZmokQxo(androidx.compose.ui.input.key.KeyEvent.m4720constructorimpl(keyEvent)) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(@p4.l KeyEvent keyEvent) {
        if ((isFocused() && getFocusOwner().mo3428dispatchInterceptedSoftKeyboardEventZmokQxo(androidx.compose.ui.input.key.KeyEvent.m4720constructorimpl(keyEvent))) || super.dispatchKeyEventPreIme(keyEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@p4.l MotionEvent motionEvent) {
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            MotionEvent motionEvent2 = this.previousMotionEvent;
            kotlin.jvm.internal.l0.m(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && !hasChangedDevices(motionEvent, motionEvent2)) {
                this.hoverExitReceived = false;
            } else {
                this.sendHoverExitEvent.run();
            }
        }
        if (isBadMotionEvent(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !isPositionChanged(motionEvent)) {
            return false;
        }
        int m5282handleMotionEvent8iAsVTc = m5282handleMotionEvent8iAsVTc(motionEvent);
        if (ProcessResult.m4960getAnyMovementConsumedimpl(m5282handleMotionEvent8iAsVTc)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return ProcessResult.m4961getDispatchedToAPointerInputModifierimpl(m5282handleMotionEvent8iAsVTc);
    }

    public final void drawAndroidView(@p4.l AndroidViewHolder androidViewHolder, @p4.l android.graphics.Canvas canvas) {
        getAndroidViewsHandler$ui_release().drawView(androidViewHolder, canvas);
    }

    @p4.m
    public final View findViewByAccessibilityIdTraversal(int i5) {
        View view = null;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(this, Integer.valueOf(i5));
                if (invoke instanceof View) {
                    view = (View) invoke;
                }
            } else {
                view = findViewByAccessibilityIdRootedAtCurrentView(i5, this);
            }
        } catch (NoSuchMethodException unused) {
        }
        return view;
    }

    @Override // androidx.compose.ui.node.Owner
    public void forceMeasureTheSubtree(@p4.l LayoutNode layoutNode, boolean z4) {
        this.measureAndLayoutDelegate.forceMeasureTheSubtree(layoutNode, z4);
    }

    @p4.l
    public final AndroidViewsHandler getAndroidViewsHandler$ui_release() {
        if (this._androidViewsHandler == null) {
            AndroidViewsHandler androidViewsHandler = new AndroidViewsHandler(getContext());
            this._androidViewsHandler = androidViewsHandler;
            addView(androidViewsHandler);
        }
        AndroidViewsHandler androidViewsHandler2 = this._androidViewsHandler;
        kotlin.jvm.internal.l0.m(androidViewsHandler2);
        return androidViewsHandler2;
    }

    @Override // androidx.compose.ui.node.Owner
    @p4.m
    public Autofill getAutofill() {
        return this._autofill;
    }

    @Override // androidx.compose.ui.node.Owner
    @p4.l
    public AutofillTree getAutofillTree() {
        return this.autofillTree;
    }

    @p4.l
    public final v3.l<Configuration, r2> getConfigurationChangeObserver() {
        return this.configurationChangeObserver;
    }

    @Override // androidx.compose.ui.node.Owner
    @p4.l
    public kotlin.coroutines.g getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.compose.ui.node.Owner, androidx.compose.ui.node.RootForTest
    @p4.l
    public Density getDensity() {
        return this.density;
    }

    @Override // androidx.compose.ui.node.Owner
    @p4.l
    public DragAndDropManager getDragAndDropManager() {
        return this.dragAndDropManager;
    }

    @Override // androidx.compose.ui.node.Owner
    @p4.m
    /* renamed from: getFocusDirection-P8AzH3I */
    public FocusDirection mo5259getFocusDirectionP8AzH3I(@p4.l KeyEvent keyEvent) {
        boolean m4428equalsimpl0;
        boolean m4428equalsimpl02;
        boolean m4428equalsimpl03;
        boolean m4428equalsimpl04;
        int m3423getNextdhqQ8s;
        long m4736getKeyZmokQxo = KeyEvent_androidKt.m4736getKeyZmokQxo(keyEvent);
        Key.Companion companion = Key.Companion;
        if (Key.m4428equalsimpl0(m4736getKeyZmokQxo, companion.m4664getTabEK5gGoQ())) {
            if (KeyEvent_androidKt.m4742isShiftPressedZmokQxo(keyEvent)) {
                m3423getNextdhqQ8s = FocusDirection.Companion.m3424getPreviousdhqQ8s();
            } else {
                m3423getNextdhqQ8s = FocusDirection.Companion.m3423getNextdhqQ8s();
            }
            return FocusDirection.m3410boximpl(m3423getNextdhqQ8s);
        }
        if (Key.m4428equalsimpl0(m4736getKeyZmokQxo, companion.m4505getDirectionRightEK5gGoQ())) {
            return FocusDirection.m3410boximpl(FocusDirection.Companion.m3425getRightdhqQ8s());
        }
        if (Key.m4428equalsimpl0(m4736getKeyZmokQxo, companion.m4504getDirectionLeftEK5gGoQ())) {
            return FocusDirection.m3410boximpl(FocusDirection.Companion.m3422getLeftdhqQ8s());
        }
        boolean z4 = true;
        if (Key.m4428equalsimpl0(m4736getKeyZmokQxo, companion.m4506getDirectionUpEK5gGoQ())) {
            m4428equalsimpl0 = true;
        } else {
            m4428equalsimpl0 = Key.m4428equalsimpl0(m4736getKeyZmokQxo, companion.m4617getPageUpEK5gGoQ());
        }
        if (m4428equalsimpl0) {
            return FocusDirection.m3410boximpl(FocusDirection.Companion.m3426getUpdhqQ8s());
        }
        if (Key.m4428equalsimpl0(m4736getKeyZmokQxo, companion.m4501getDirectionDownEK5gGoQ())) {
            m4428equalsimpl02 = true;
        } else {
            m4428equalsimpl02 = Key.m4428equalsimpl0(m4736getKeyZmokQxo, companion.m4616getPageDownEK5gGoQ());
        }
        if (m4428equalsimpl02) {
            return FocusDirection.m3410boximpl(FocusDirection.Companion.m3419getDowndhqQ8s());
        }
        if (Key.m4428equalsimpl0(m4736getKeyZmokQxo, companion.m4500getDirectionCenterEK5gGoQ())) {
            m4428equalsimpl03 = true;
        } else {
            m4428equalsimpl03 = Key.m4428equalsimpl0(m4736getKeyZmokQxo, companion.m4514getEnterEK5gGoQ());
        }
        if (m4428equalsimpl03) {
            m4428equalsimpl04 = true;
        } else {
            m4428equalsimpl04 = Key.m4428equalsimpl0(m4736getKeyZmokQxo, companion.m4606getNumPadEnterEK5gGoQ());
        }
        if (m4428equalsimpl04) {
            return FocusDirection.m3410boximpl(FocusDirection.Companion.m3420getEnterdhqQ8s());
        }
        if (!Key.m4428equalsimpl0(m4736getKeyZmokQxo, companion.m4443getBackEK5gGoQ())) {
            z4 = Key.m4428equalsimpl0(m4736getKeyZmokQxo, companion.m4517getEscapeEK5gGoQ());
        }
        if (z4) {
            return FocusDirection.m3410boximpl(FocusDirection.Companion.m3421getExitdhqQ8s());
        }
        return null;
    }

    @Override // androidx.compose.ui.node.Owner
    @p4.l
    public FocusOwner getFocusOwner() {
        return this.focusOwner;
    }

    @Override // android.view.View
    public void getFocusedRect(@p4.l Rect rect) {
        r2 r2Var;
        int L0;
        int L02;
        int L03;
        int L04;
        androidx.compose.ui.geometry.Rect focusRect = getFocusOwner().getFocusRect();
        if (focusRect != null) {
            L0 = kotlin.math.d.L0(focusRect.getLeft());
            rect.left = L0;
            L02 = kotlin.math.d.L0(focusRect.getTop());
            rect.top = L02;
            L03 = kotlin.math.d.L0(focusRect.getRight());
            rect.right = L03;
            L04 = kotlin.math.d.L0(focusRect.getBottom());
            rect.bottom = L04;
            r2Var = r2.f19517a;
        } else {
            r2Var = null;
        }
        if (r2Var == null) {
            super.getFocusedRect(rect);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    @p4.l
    public FontFamily.Resolver getFontFamilyResolver() {
        return (FontFamily.Resolver) this.fontFamilyResolver$delegate.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    @p4.l
    public Font.ResourceLoader getFontLoader() {
        return this.fontLoader;
    }

    @Override // androidx.compose.ui.node.Owner
    @p4.l
    public HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public boolean getHasPendingMeasureOrLayout() {
        return this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout();
    }

    @Override // androidx.compose.ui.node.Owner
    @p4.l
    public InputModeManager getInputModeManager() {
        return this._inputModeManager;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View, android.view.ViewParent, androidx.compose.ui.node.Owner
    @p4.l
    public LayoutDirection getLayoutDirection() {
        return (LayoutDirection) this.layoutDirection$delegate.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    public long getMeasureIteration() {
        return this.measureAndLayoutDelegate.getMeasureIteration();
    }

    @Override // androidx.compose.ui.node.Owner
    @p4.l
    public ModifierLocalManager getModifierLocalManager() {
        return this.modifierLocalManager;
    }

    @Override // androidx.compose.ui.node.Owner
    @p4.l
    public Placeable.PlacementScope getPlacementScope() {
        return PlaceableKt.PlacementScope(this);
    }

    @Override // androidx.compose.ui.node.Owner
    @p4.l
    public PointerIconService getPointerIconService() {
        return this.pointerIconService;
    }

    @Override // androidx.compose.ui.node.Owner
    @p4.l
    public LayoutNode getRoot() {
        return this.root;
    }

    @Override // androidx.compose.ui.node.Owner
    @p4.l
    public RootForTest getRootForTest() {
        return this.rootForTest;
    }

    @Override // androidx.compose.ui.node.RootForTest
    @p4.l
    public SemanticsOwner getSemanticsOwner() {
        return this.semanticsOwner;
    }

    @Override // androidx.compose.ui.node.Owner
    @p4.l
    public LayoutNodeDrawScope getSharedDrawScope() {
        return this.sharedDrawScope;
    }

    @Override // androidx.compose.ui.node.Owner
    public boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    @Override // androidx.compose.ui.node.Owner
    @p4.l
    public OwnerSnapshotObserver getSnapshotObserver() {
        return this.snapshotObserver;
    }

    @Override // androidx.compose.ui.node.Owner
    @p4.l
    public SoftwareKeyboardController getSoftwareKeyboardController() {
        return this.softwareKeyboardController;
    }

    @Override // androidx.compose.ui.node.Owner, androidx.compose.ui.node.RootForTest
    @p4.l
    public TextInputService getTextInputService() {
        return this.textInputService;
    }

    @Override // androidx.compose.ui.node.Owner
    @p4.l
    public TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    @p4.l
    public View getView() {
        return this;
    }

    @Override // androidx.compose.ui.node.Owner
    @p4.l
    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    @p4.m
    public final ViewTreeOwners getViewTreeOwners() {
        return (ViewTreeOwners) this.viewTreeOwners$delegate.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    @p4.l
    public WindowInfo getWindowInfo() {
        return this._windowInfo;
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public void invalidateDescendants() {
        invalidateLayers(getRoot());
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public boolean isLifecycleInResumedState() {
        Lifecycle.State state;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            state = lifecycle.getCurrentState();
        } else {
            state = null;
        }
        if (state == Lifecycle.State.RESUMED) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.input.pointer.PositionCalculator
    /* renamed from: localToScreen-58bKbWc */
    public void mo4953localToScreen58bKbWc(@p4.l float[] fArr) {
        recalculateWindowPosition();
        Matrix.m3981timesAssign58bKbWc(fArr, this.viewToWindowMatrix);
        AndroidComposeView_androidKt.m5294access$preTranslatecG2Xzmc(fArr, Offset.m3493getXimpl(this.windowPosition), Offset.m3494getYimpl(this.windowPosition), this.tmpMatrix);
    }

    @Override // androidx.compose.ui.input.pointer.PositionCalculator
    /* renamed from: localToScreen-MK-Hz9U */
    public long mo4954localToScreenMKHz9U(long j5) {
        recalculateWindowPosition();
        long m3970mapMKHz9U = Matrix.m3970mapMKHz9U(this.viewToWindowMatrix, j5);
        return OffsetKt.Offset(Offset.m3493getXimpl(m3970mapMKHz9U) + Offset.m3493getXimpl(this.windowPosition), Offset.m3494getYimpl(m3970mapMKHz9U) + Offset.m3494getYimpl(this.windowPosition));
    }

    @Override // androidx.compose.ui.node.Owner
    public void measureAndLayout(boolean z4) {
        v3.a<r2> aVar;
        if (this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout() || this.measureAndLayoutDelegate.getHasPendingOnPositionedCallbacks()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z4) {
                try {
                    aVar = this.resendMotionEventOnLayout;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                aVar = null;
            }
            if (this.measureAndLayoutDelegate.measureAndLayout(aVar)) {
                requestLayout();
            }
            MeasureAndLayoutDelegate.dispatchOnPositionedCallbacks$default(this.measureAndLayoutDelegate, false, 1, null);
            r2 r2Var = r2.f19517a;
            Trace.endSection();
        }
    }

    @Override // androidx.compose.ui.node.Owner
    /* renamed from: measureAndLayout-0kLqBqw */
    public void mo5260measureAndLayout0kLqBqw(@p4.l LayoutNode layoutNode, long j5) {
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.measureAndLayoutDelegate.m5160measureAndLayout0kLqBqw(layoutNode, j5);
            if (!this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout()) {
                MeasureAndLayoutDelegate.dispatchOnPositionedCallbacks$default(this.measureAndLayoutDelegate, false, 1, null);
            }
            r2 r2Var = r2.f19517a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.compose.ui.node.RootForTest
    public void measureAndLayoutForTest() {
        Owner.measureAndLayout$default(this, false, 1, null);
    }

    public final void notifyLayerIsDirty$ui_release(@p4.l OwnedLayer ownedLayer, boolean z4) {
        if (!z4) {
            if (!this.isDrawingContent) {
                this.dirtyLayers.remove(ownedLayer);
                List<OwnedLayer> list = this.postponedDirtyLayers;
                if (list != null) {
                    list.remove(ownedLayer);
                    return;
                }
                return;
            }
            return;
        }
        if (!this.isDrawingContent) {
            this.dirtyLayers.add(ownedLayer);
            return;
        }
        List list2 = this.postponedDirtyLayers;
        if (list2 == null) {
            list2 = new ArrayList();
            this.postponedDirtyLayers = list2;
        }
        list2.add(ownedLayer);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onAttach(@p4.l LayoutNode layoutNode) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        boolean z4;
        int m4418getKeyboardaOaMEAU;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        AndroidAutofill androidAutofill;
        super.onAttachedToWindow();
        invalidateLayoutNodeMeasurement(getRoot());
        invalidateLayers(getRoot());
        getSnapshotObserver().startObserving$ui_release();
        if (autofillSupported() && (androidAutofill = this._autofill) != null) {
            AutofillCallback.INSTANCE.register(androidAutofill);
        }
        LifecycleOwner lifecycleOwner2 = ViewTreeLifecycleOwner.get(this);
        SavedStateRegistryOwner savedStateRegistryOwner = ViewTreeSavedStateRegistryOwner.get(this);
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (lifecycleOwner2 == null || savedStateRegistryOwner == null || (lifecycleOwner2 == viewTreeOwners.getLifecycleOwner() && savedStateRegistryOwner == viewTreeOwners.getLifecycleOwner()))) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4) {
            if (lifecycleOwner2 != null) {
                if (savedStateRegistryOwner != null) {
                    if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                        lifecycle.removeObserver(this);
                    }
                    lifecycleOwner2.getLifecycle().addObserver(this);
                    ViewTreeOwners viewTreeOwners2 = new ViewTreeOwners(lifecycleOwner2, savedStateRegistryOwner);
                    set_viewTreeOwners(viewTreeOwners2);
                    v3.l<? super ViewTreeOwners, r2> lVar = this.onViewTreeOwnersAvailable;
                    if (lVar != null) {
                        lVar.invoke(viewTreeOwners2);
                    }
                    this.onViewTreeOwnersAvailable = null;
                } else {
                    throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
                }
            } else {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
        }
        InputModeManagerImpl inputModeManagerImpl = this._inputModeManager;
        if (isInTouchMode()) {
            m4418getKeyboardaOaMEAU = InputMode.Companion.m4419getTouchaOaMEAU();
        } else {
            m4418getKeyboardaOaMEAU = InputMode.Companion.m4418getKeyboardaOaMEAU();
        }
        inputModeManagerImpl.m4422setInputModeiuPiT84(m4418getKeyboardaOaMEAU);
        ViewTreeOwners viewTreeOwners3 = getViewTreeOwners();
        kotlin.jvm.internal.l0.m(viewTreeOwners3);
        viewTreeOwners3.getLifecycleOwner().getLifecycle().addObserver(this);
        ViewTreeOwners viewTreeOwners4 = getViewTreeOwners();
        kotlin.jvm.internal.l0.m(viewTreeOwners4);
        viewTreeOwners4.getLifecycleOwner().getLifecycle().addObserver(this.composeAccessibilityDelegate);
        getViewTreeObserver().addOnGlobalLayoutListener(this.globalLayoutListener);
        getViewTreeObserver().addOnScrollChangedListener(this.scrollChangedListener);
        getViewTreeObserver().addOnTouchModeChangeListener(this.touchModeChangeListener);
        if (Build.VERSION.SDK_INT >= 31) {
            AndroidComposeViewTranslationCallbackS.INSTANCE.setViewTranslationCallback(this, new AndroidComposeViewTranslationCallback());
        }
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        AndroidPlatformTextInputSession androidPlatformTextInputSession = (AndroidPlatformTextInputSession) SessionMutex.m3377getCurrentSessionimpl(this.textInputSessionMutex);
        if (androidPlatformTextInputSession == null) {
            return this.legacyTextInputServiceAndroid.isEditorFocused();
        }
        return androidPlatformTextInputSession.isReadyForConnection();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(@p4.l Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.density = AndroidDensity_androidKt.Density(getContext());
        if (getFontWeightAdjustmentCompat(configuration) != this.currentFontWeightAdjustment) {
            this.currentFontWeightAdjustment = getFontWeightAdjustmentCompat(configuration);
            setFontFamilyResolver(FontFamilyResolver_androidKt.createFontFamilyResolver(getContext()));
        }
        this.configurationChangeObserver.invoke(configuration);
    }

    @Override // android.view.View
    @p4.m
    public InputConnection onCreateInputConnection(@p4.l EditorInfo editorInfo) {
        AndroidPlatformTextInputSession androidPlatformTextInputSession = (AndroidPlatformTextInputSession) SessionMutex.m3377getCurrentSessionimpl(this.textInputSessionMutex);
        if (androidPlatformTextInputSession == null) {
            return this.legacyTextInputServiceAndroid.createInputConnection(editorInfo);
        }
        return androidPlatformTextInputSession.createInputConnection(editorInfo);
    }

    @Override // android.view.View
    @RequiresApi(31)
    public void onCreateVirtualViewTranslationRequests(@p4.l long[] jArr, @p4.l int[] iArr, @p4.l Consumer<ViewTranslationRequest> consumer) {
        this.composeAccessibilityDelegate.onCreateVirtualViewTranslationRequests$ui_release(jArr, iArr, consumer);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onDetach(@p4.l LayoutNode layoutNode) {
        this.measureAndLayoutDelegate.onNodeDetached(layoutNode);
        requestClearInvalidObservations();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        AndroidAutofill androidAutofill;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        LifecycleOwner lifecycleOwner2;
        Lifecycle lifecycle2;
        super.onDetachedFromWindow();
        getSnapshotObserver().stopObserving$ui_release();
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (lifecycleOwner2 = viewTreeOwners.getLifecycleOwner()) != null && (lifecycle2 = lifecycleOwner2.getLifecycle()) != null) {
            lifecycle2.removeObserver(this);
        }
        ViewTreeOwners viewTreeOwners2 = getViewTreeOwners();
        if (viewTreeOwners2 != null && (lifecycleOwner = viewTreeOwners2.getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this.composeAccessibilityDelegate);
        }
        if (autofillSupported() && (androidAutofill = this._autofill) != null) {
            AutofillCallback.INSTANCE.unregister(androidAutofill);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.globalLayoutListener);
        getViewTreeObserver().removeOnScrollChangedListener(this.scrollChangedListener);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.touchModeChangeListener);
        if (Build.VERSION.SDK_INT >= 31) {
            AndroidComposeViewTranslationCallbackS.INSTANCE.clearViewTranslationCallback(this);
        }
    }

    @Override // android.view.View
    protected void onDraw(@p4.l android.graphics.Canvas canvas) {
    }

    @Override // androidx.compose.ui.node.Owner
    public void onEndApplyChanges() {
        if (this.observationClearRequested) {
            getSnapshotObserver().clearInvalidObservations$ui_release();
            this.observationClearRequested = false;
        }
        AndroidViewsHandler androidViewsHandler = this._androidViewsHandler;
        if (androidViewsHandler != null) {
            clearChildInvalidObservations(androidViewsHandler);
        }
        while (this.endApplyChangesListeners.isNotEmpty()) {
            int size = this.endApplyChangesListeners.getSize();
            for (int i5 = 0; i5 < size; i5++) {
                v3.a<r2> aVar = this.endApplyChangesListeners.getContent()[i5];
                this.endApplyChangesListeners.set(i5, null);
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            this.endApplyChangesListeners.removeRange(0, size);
        }
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z4, int i5, @p4.m Rect rect) {
        super.onFocusChanged(z4, i5, rect);
        Log.d(FocusTag, "Owner FocusChanged(" + z4 + ')');
        FocusTransactionManager focusTransactionManager = getFocusOwner().getFocusTransactionManager();
        FocusTransactionManager.access$getCancellationListener$p(focusTransactionManager).add(new AndroidComposeView$onFocusChanged$1(z4, this));
        if (FocusTransactionManager.access$getOngoingTransaction$p(focusTransactionManager)) {
            if (z4) {
                getFocusOwner().takeFocus();
                return;
            } else {
                getFocusOwner().releaseFocus();
                return;
            }
        }
        try {
            FocusTransactionManager.access$beginTransaction(focusTransactionManager);
            if (z4) {
                getFocusOwner().takeFocus();
            } else {
                getFocusOwner().releaseFocus();
            }
            r2 r2Var = r2.f19517a;
        } finally {
            FocusTransactionManager.access$commitTransaction(focusTransactionManager);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        this.measureAndLayoutDelegate.measureAndLayout(this.resendMotionEventOnLayout);
        this.onMeasureConstraints = null;
        updatePositionCacheAndDispatch();
        if (this._androidViewsHandler != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i7 - i5, i8 - i6);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void onLayoutChange(@p4.l LayoutNode layoutNode) {
        this.composeAccessibilityDelegate.onLayoutChange$ui_release(layoutNode);
    }

    @Override // android.view.View
    protected void onMeasure(int i5, int i6) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                invalidateLayoutNodeMeasurement(getRoot());
            }
            long m5281convertMeasureSpecI7RO_PI = m5281convertMeasureSpecI7RO_PI(i5);
            int l5 = (int) kotlin.g2.l(m5281convertMeasureSpecI7RO_PI >>> 32);
            int l6 = (int) kotlin.g2.l(m5281convertMeasureSpecI7RO_PI & 4294967295L);
            long m5281convertMeasureSpecI7RO_PI2 = m5281convertMeasureSpecI7RO_PI(i6);
            long Constraints = ConstraintsKt.Constraints(l5, l6, (int) kotlin.g2.l(m5281convertMeasureSpecI7RO_PI2 >>> 32), (int) kotlin.g2.l(4294967295L & m5281convertMeasureSpecI7RO_PI2));
            Constraints constraints = this.onMeasureConstraints;
            boolean z4 = false;
            if (constraints == null) {
                this.onMeasureConstraints = Constraints.m5988boximpl(Constraints);
                this.wasMeasuredWithMultipleConstraints = false;
            } else {
                if (constraints != null) {
                    z4 = Constraints.m5993equalsimpl0(constraints.m6006unboximpl(), Constraints);
                }
                if (!z4) {
                    this.wasMeasuredWithMultipleConstraints = true;
                }
            }
            this.measureAndLayoutDelegate.m5161updateRootConstraintsBRTryo0(Constraints);
            this.measureAndLayoutDelegate.measureOnly();
            setMeasuredDimension(getRoot().getWidth(), getRoot().getHeight());
            if (this._androidViewsHandler != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().getHeight(), 1073741824));
            }
            r2 r2Var = r2.f19517a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(@p4.m ViewStructure viewStructure, int i5) {
        AndroidAutofill androidAutofill;
        if (!autofillSupported() || viewStructure == null || (androidAutofill = this._autofill) == null) {
            return;
        }
        AndroidAutofill_androidKt.populateViewStructure(androidAutofill, viewStructure);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onRequestMeasure(@p4.l LayoutNode layoutNode, boolean z4, boolean z5, boolean z6) {
        if (z4) {
            if (this.measureAndLayoutDelegate.requestLookaheadRemeasure(layoutNode, z5) && z6) {
                scheduleMeasureAndLayout(layoutNode);
                return;
            }
            return;
        }
        if (this.measureAndLayoutDelegate.requestRemeasure(layoutNode, z5) && z6) {
            scheduleMeasureAndLayout(layoutNode);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void onRequestRelayout(@p4.l LayoutNode layoutNode, boolean z4, boolean z5) {
        if (z4) {
            if (this.measureAndLayoutDelegate.requestLookaheadRelayout(layoutNode, z5)) {
                scheduleMeasureAndLayout$default(this, null, 1, null);
            }
        } else if (this.measureAndLayoutDelegate.requestRelayout(layoutNode, z5)) {
            scheduleMeasureAndLayout$default(this, null, 1, null);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@p4.l LifecycleOwner lifecycleOwner) {
        setShowLayoutBounds(Companion.getIsShowingLayoutBounds());
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i5) {
        if (this.superclassInitComplete) {
            LayoutDirection access$layoutDirectionFromInt = AndroidComposeView_androidKt.access$layoutDirectionFromInt(i5);
            setLayoutDirection(access$layoutDirectionFromInt);
            getFocusOwner().setLayoutDirection(access$layoutDirectionFromInt);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void onSemanticsChange() {
        this.composeAccessibilityDelegate.onSemanticsChange$ui_release();
    }

    @Override // android.view.View
    @RequiresApi(31)
    public void onVirtualViewTranslationResponses(@p4.l LongSparseArray<ViewTranslationResponse> longSparseArray) {
        this.composeAccessibilityDelegate.onVirtualViewTranslationResponses$ui_release(longSparseArray);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z4) {
        boolean isShowingLayoutBounds;
        this._windowInfo.setWindowFocused(z4);
        this.keyboardModifiersRequireUpdate = true;
        super.onWindowFocusChanged(z4);
        if (z4 && getShowLayoutBounds() != (isShowingLayoutBounds = Companion.getIsShowingLayoutBounds())) {
            setShowLayoutBounds(isShowingLayoutBounds);
            invalidateDescendants();
        }
    }

    public final boolean recycle$ui_release(@p4.l OwnedLayer ownedLayer) {
        if (this.viewLayersContainer != null) {
            ViewLayer.Companion.getShouldUseDispatchDraw();
        }
        this.layerCache.push(ownedLayer);
        return true;
    }

    @Override // androidx.compose.ui.node.Owner
    public void registerOnEndApplyChangesListener(@p4.l v3.a<r2> aVar) {
        if (!this.endApplyChangesListeners.contains(aVar)) {
            this.endApplyChangesListeners.add(aVar);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void registerOnLayoutCompletedListener(@p4.l Owner.OnLayoutCompletedListener onLayoutCompletedListener) {
        this.measureAndLayoutDelegate.registerOnLayoutCompletedListener(onLayoutCompletedListener);
        scheduleMeasureAndLayout$default(this, null, 1, null);
    }

    public final void removeAndroidView(@p4.l AndroidViewHolder androidViewHolder) {
        registerOnEndApplyChangesListener(new AndroidComposeView$removeAndroidView$1(this, androidViewHolder));
    }

    public final void requestClearInvalidObservations() {
        this.observationClearRequested = true;
    }

    @Override // androidx.compose.ui.node.Owner
    public void requestOnPositionedCallback(@p4.l LayoutNode layoutNode) {
        this.measureAndLayoutDelegate.requestOnPositionedCallback(layoutNode);
        scheduleMeasureAndLayout$default(this, null, 1, null);
    }

    @Override // androidx.compose.ui.input.pointer.PositionCalculator
    /* renamed from: screenToLocal-MK-Hz9U */
    public long mo4955screenToLocalMKHz9U(long j5) {
        recalculateWindowPosition();
        return Matrix.m3970mapMKHz9U(this.windowToViewMatrix, OffsetKt.Offset(Offset.m3493getXimpl(j5) - Offset.m3493getXimpl(this.windowPosition), Offset.m3494getYimpl(j5) - Offset.m3494getYimpl(this.windowPosition)));
    }

    @Override // androidx.compose.ui.node.RootForTest
    /* renamed from: sendKeyEvent-ZmokQxo */
    public boolean mo5261sendKeyEventZmokQxo(@p4.l KeyEvent keyEvent) {
        if (!getFocusOwner().mo3428dispatchInterceptedSoftKeyboardEventZmokQxo(keyEvent) && !getFocusOwner().mo3429dispatchKeyEventZmokQxo(keyEvent)) {
            return false;
        }
        return true;
    }

    public final void setConfigurationChangeObserver(@p4.l v3.l<? super Configuration, r2> lVar) {
        this.configurationChangeObserver = lVar;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j5) {
        this.lastMatrixRecalculationAnimationTime = j5;
    }

    public final void setOnViewTreeOwnersAvailable(@p4.l v3.l<? super ViewTreeOwners, r2> lVar) {
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            lVar.invoke(viewTreeOwners);
        }
        if (!isAttachedToWindow()) {
            this.onViewTreeOwnersAvailable = lVar;
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void setShowLayoutBounds(boolean z4) {
        this.showLayoutBounds = z4;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.ui.platform.PlatformTextInputSessionHandler
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object textInputSession(@p4.l v3.p<? super androidx.compose.ui.platform.PlatformTextInputSessionScope, ? super kotlin.coroutines.d<?>, ? extends java.lang.Object> r5, @p4.l kotlin.coroutines.d<?> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.ui.platform.AndroidComposeView$textInputSession$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.ui.platform.AndroidComposeView$textInputSession$1 r0 = (androidx.compose.ui.platform.AndroidComposeView$textInputSession$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.platform.AndroidComposeView$textInputSession$1 r0 = new androidx.compose.ui.platform.AndroidComposeView$textInputSession$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            kotlin.e1.n(r6)
            goto L44
        L31:
            kotlin.e1.n(r6)
            java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex$Session<java.lang.Object>> r6 = r4.textInputSessionMutex
            androidx.compose.ui.platform.AndroidComposeView$textInputSession$2 r2 = new androidx.compose.ui.platform.AndroidComposeView$textInputSession$2
            r2.<init>(r4)
            r0.label = r3
            java.lang.Object r5 = androidx.compose.ui.SessionMutex.m3380withSessionCancellingPreviousimpl(r6, r2, r5, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            kotlin.y r5 = new kotlin.y
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.textInputSession(v3.p, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // androidx.compose.ui.node.Owner
    @p4.l
    public AndroidAccessibilityManager getAccessibilityManager() {
        return this.accessibilityManager;
    }

    @Override // androidx.compose.ui.node.Owner
    @p4.l
    public AndroidClipboardManager getClipboardManager() {
        return this.clipboardManager;
    }

    private final void recalculateWindowPosition(MotionEvent motionEvent) {
        this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
        recalculateWindowViewTransforms();
        long m3970mapMKHz9U = Matrix.m3970mapMKHz9U(this.viewToWindowMatrix, OffsetKt.Offset(motionEvent.getX(), motionEvent.getY()));
        this.windowPosition = OffsetKt.Offset(motionEvent.getRawX() - Offset.m3493getXimpl(m3970mapMKHz9U), motionEvent.getRawY() - Offset.m3494getYimpl(m3970mapMKHz9U));
    }
}
