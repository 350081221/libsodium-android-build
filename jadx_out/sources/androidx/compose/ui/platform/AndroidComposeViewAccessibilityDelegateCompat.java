package androidx.compose.ui.platform;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.annotation.DoNotInline;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import androidx.collection.SparseArrayCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.R;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AccessibilityIterators;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt;
import androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import androidx.compose.ui.platform.coreshims.ViewStructureCompat;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesAndroid;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.platform.AndroidAccessibilitySpannableString_androidKt;
import androidx.compose.ui.text.platform.URLSpanCache;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.app.NotificationCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.umeng.analytics.pro.bi;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import kotlin.r2;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000Ä\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u0000 Ï\u00022\u00020\u00012\u00020\u0002:\u0016Ð\u0002Ñ\u0002Ï\u0002Ò\u0002Ó\u0002Ô\u0002Õ\u0002Ö\u0002×\u0002Ø\u0002Ù\u0002B\u0013\u0012\b\u0010Ñ\u0001\u001a\u00030Ð\u0001¢\u0006\u0006\bÍ\u0002\u0010Î\u0002J8\u0010\u000e\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\bH\u0002J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J!\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u00182\u0006\u0010\u0015\u001a\u00020\u0006H\u0082\bJJ\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u001e2\u0006\u0010\u0015\u001a\u00020\u00062\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u001aj\b\u0012\u0004\u0012\u00020\u0017`\u001b2\u001a\b\u0002\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001e0\u001dH\u0002JB\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020\u00172\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u001aj\b\u0012\u0004\u0012\u00020\u0017`\u001b2\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001e0\u001dH\u0002J$\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00170\u001e2\u0006\u0010\u0015\u001a\u00020\u00062\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00170\u001eH\u0002J\b\u0010(\u001a\u00020$H\u0002J\u0010\u0010)\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0017H\u0002J \u0010-\u001a\u00020$2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u0017H\u0002J\u0018\u0010.\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020\u00172\u0006\u0010+\u001a\u00020*H\u0002J\u0012\u00100\u001a\u0004\u0018\u00010/2\u0006\u0010\u0012\u001a\u00020\u0017H\u0002J\u0018\u00101\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020\u00172\u0006\u0010+\u001a\u00020*H\u0002J\u0010\u00102\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0017H\u0002J\u0018\u00103\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020\u00172\u0006\u0010+\u001a\u00020*H\u0002J\u0012\u00105\u001a\u0004\u0018\u0001042\u0006\u0010\u0012\u001a\u00020\u0017H\u0002J\u0018\u00106\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020\u00172\u0006\u0010+\u001a\u00020*H\u0002J\u0010\u00107\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\bH\u0002J\u0010\u00108\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\bH\u0002J=\u0010=\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\b2\u0006\u00109\u001a\u00020\b2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010<\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010;H\u0002¢\u0006\u0004\b=\u0010>J\u0010\u0010A\u001a\u00020\u00062\u0006\u0010@\u001a\u00020?H\u0002J\u0018\u0010B\u001a\u00020?2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u00109\u001a\u00020\bH\u0003J?\u0010H\u001a\u00020?2\u0006\u0010\u000f\u001a\u00020\b2\b\u0010C\u001a\u0004\u0018\u00010\b2\b\u0010D\u001a\u0004\u0018\u00010\b2\b\u0010E\u001a\u0004\u0018\u00010\b2\b\u0010G\u001a\u0004\u0018\u00010FH\u0002¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\bH\u0002J\"\u0010N\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010K\u001a\u00020\b2\b\u0010M\u001a\u0004\u0018\u00010LH\u0002J*\u0010P\u001a\u00020$2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010+\u001a\u00020\u00102\u0006\u0010O\u001a\u00020/2\b\u0010M\u001a\u0004\u0018\u00010LH\u0002J\u001c\u0010U\u001a\u0004\u0018\u00010T2\b\u0010Q\u001a\u0004\u0018\u00010\u00172\u0006\u0010S\u001a\u00020RH\u0002J\u0010\u0010V\u001a\u00020$2\u0006\u0010\u000f\u001a\u00020\bH\u0002J/\u0010Y\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010W*\u00020F2\b\u0010G\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010X\u001a\u00020\bH\u0002¢\u0006\u0004\bY\u0010ZJ\u0010\u0010]\u001a\u00020$2\u0006\u0010\\\u001a\u00020[H\u0002J\u0010\u0010^\u001a\u00020$2\u0006\u0010\\\u001a\u00020[H\u0002J\u001e\u0010a\u001a\u00020$2\u0006\u0010\\\u001a\u00020[2\f\u0010`\u001a\b\u0012\u0004\u0012\u00020\b0_H\u0002J\b\u0010b\u001a\u00020$H\u0002J\b\u0010c\u001a\u00020$H\u0002J\u001c\u0010f\u001a\u00020$2\u0012\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040dH\u0002J\u0018\u0010i\u001a\u00020$2\u0006\u0010g\u001a\u00020\b2\u0006\u0010h\u001a\u00020/H\u0002J\u001e\u0010l\u001a\u00020\u00062\u0006\u0010g\u001a\u00020\b2\f\u0010k\u001a\b\u0012\u0004\u0012\u00020j0;H\u0002J\u0010\u0010n\u001a\u00020$2\u0006\u0010m\u001a\u00020jH\u0002J\"\u0010q\u001a\u00020$2\u0006\u0010o\u001a\u00020\b2\u0006\u0010:\u001a\u00020\b2\b\u0010p\u001a\u0004\u0018\u00010/H\u0002J\u000e\u0010t\u001a\u0004\u0018\u00010s*\u00020rH\u0002J\u0012\u0010x\u001a\u0004\u0018\u00010w2\u0006\u0010v\u001a\u00020uH\u0002J\u000e\u0010z\u001a\u0004\u0018\u00010y*\u00020\u0017H\u0002J\u001a\u0010}\u001a\u00020$2\u0006\u0010{\u001a\u00020\b2\b\u0010|\u001a\u0004\u0018\u00010yH\u0002J\u0010\u0010~\u001a\u00020$2\u0006\u0010{\u001a\u00020\bH\u0002J\b\u0010\u007f\u001a\u00020$H\u0002J\u0011\u0010\u0080\u0001\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020\u0017H\u0002J\u0011\u0010\u0081\u0001\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020\u0017H\u0002J\u0011\u0010\u0082\u0001\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020\u0017H\u0002J\t\u0010\u0083\u0001\u001a\u00020$H\u0002J\t\u0010\u0084\u0001\u001a\u00020$H\u0002J\t\u0010\u0085\u0001\u001a\u00020$H\u0002J\u001c\u0010\u0089\u0001\u001a\u00020$2\u0007\u0010\u0086\u0001\u001a\u00020\u00172\b\u0010\u0088\u0001\u001a\u00030\u0087\u0001H\u0002J\u0012\u0010\u008b\u0001\u001a\u00020$2\u0007\u0010\u008a\u0001\u001a\u00020\u0006H\u0002J\u001c\u0010\u008c\u0001\u001a\u00020$2\u0007\u0010\u0086\u0001\u001a\u00020\u00172\b\u0010\u0088\u0001\u001a\u00030\u0087\u0001H\u0002J\u0011\u0010\u008d\u0001\u001a\u00020\b2\u0006\u0010g\u001a\u00020\bH\u0002J,\u0010\u0091\u0001\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00172\u0007\u0010\u008e\u0001\u001a\u00020\b2\u0007\u0010\u008f\u0001\u001a\u00020\u00062\u0007\u0010\u0090\u0001\u001a\u00020\u0006H\u0002J\u0011\u0010\u0092\u0001\u001a\u00020$2\u0006\u0010o\u001a\u00020\bH\u0002J,\u0010\u0096\u0001\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00172\u0007\u0010\u0093\u0001\u001a\u00020\b2\u0007\u0010\u0094\u0001\u001a\u00020\b2\u0007\u0010\u0095\u0001\u001a\u00020\u0006H\u0002J\u0011\u0010\u0097\u0001\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0017H\u0002J\u0011\u0010\u0098\u0001\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0017H\u0002J\u0011\u0010\u0099\u0001\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0017H\u0002J\u001f\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u009a\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u00172\u0007\u0010\u008e\u0001\u001a\u00020\bH\u0002J\u0015\u0010\u009c\u0001\u001a\u0004\u0018\u00010/2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0017H\u0002J\u0010\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009d\u0001*\u00020uH\u0002J\u0013\u0010\u008a\u0001\u001a\u00020$2\b\u0010 \u0001\u001a\u00030\u009f\u0001H\u0016J\u0013\u0010¡\u0001\u001a\u00020$2\b\u0010 \u0001\u001a\u00030\u009f\u0001H\u0016J,\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000ø\u0001\u0000¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u001b\u0010§\u0001\u001a\u00020\u00062\u0007\u0010@\u001a\u00030¤\u0001H\u0000¢\u0006\u0006\b¥\u0001\u0010¦\u0001J&\u0010\u00ad\u0001\u001a\u00020\b2\b\u0010©\u0001\u001a\u00030¨\u00012\b\u0010ª\u0001\u001a\u00030¨\u0001H\u0001¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u0013\u0010°\u0001\u001a\u00030¯\u00012\u0007\u0010®\u0001\u001a\u00020rH\u0016J\u0012\u0010³\u0001\u001a\u00020$H\u0000¢\u0006\u0006\b±\u0001\u0010²\u0001J\u0013\u0010¶\u0001\u001a\u00020$H\u0080@¢\u0006\u0006\b´\u0001\u0010µ\u0001J\u001a\u0010¹\u0001\u001a\u00020$2\u0006\u0010\\\u001a\u00020[H\u0000¢\u0006\u0006\b·\u0001\u0010¸\u0001J\u0012\u0010»\u0001\u001a\u00020$H\u0000¢\u0006\u0006\bº\u0001\u0010²\u0001J\u0012\u0010½\u0001\u001a\u00020$H\u0000¢\u0006\u0006\b¼\u0001\u0010²\u0001J\u0012\u0010¿\u0001\u001a\u00020$H\u0000¢\u0006\u0006\b¾\u0001\u0010²\u0001J9\u0010É\u0001\u001a\u00020$2\b\u0010Á\u0001\u001a\u00030À\u00012\b\u0010Ã\u0001\u001a\u00030Â\u00012\u0011\u0010Æ\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010Å\u00010Ä\u0001H\u0001¢\u0006\u0006\bÇ\u0001\u0010È\u0001J%\u0010Ï\u0001\u001a\u00020$2\u0011\u0010Ì\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010Ë\u00010Ê\u0001H\u0001¢\u0006\u0006\bÍ\u0001\u0010Î\u0001R\u001d\u0010Ñ\u0001\u001a\u00030Ð\u00018\u0006¢\u0006\u0010\n\u0006\bÑ\u0001\u0010Ò\u0001\u001a\u0006\bÓ\u0001\u0010Ô\u0001R1\u0010Õ\u0001\u001a\u00020\b8\u0000@\u0000X\u0081\u000e¢\u0006 \n\u0006\bÕ\u0001\u0010Ö\u0001\u0012\u0006\bÛ\u0001\u0010²\u0001\u001a\u0006\b×\u0001\u0010Ø\u0001\"\u0006\bÙ\u0001\u0010Ú\u0001R>\u0010Ý\u0001\u001a\u000f\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u00060Ü\u00018\u0000@\u0000X\u0081\u000e¢\u0006 \n\u0006\bÝ\u0001\u0010Þ\u0001\u0012\u0006\bã\u0001\u0010²\u0001\u001a\u0006\bß\u0001\u0010à\u0001\"\u0006\bá\u0001\u0010â\u0001R\u0018\u0010å\u0001\u001a\u00030ä\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bå\u0001\u0010æ\u0001R2\u0010è\u0001\u001a\u00020\u00062\u0007\u0010ç\u0001\u001a\u00020\u00068\u0000@@X\u0080\u000e¢\u0006\u0018\n\u0006\bè\u0001\u0010é\u0001\u001a\u0006\bê\u0001\u0010ë\u0001\"\u0006\bì\u0001\u0010í\u0001R\u0018\u0010ï\u0001\u001a\u00030î\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bï\u0001\u0010ð\u0001R\u0018\u0010ò\u0001\u001a\u00030ñ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bò\u0001\u0010ó\u0001RD\u0010ö\u0001\u001a-\u0012\u000f\u0012\r õ\u0001*\u0005\u0018\u00010ô\u00010ô\u0001 õ\u0001*\u0015\u0012\u000f\u0012\r õ\u0001*\u0005\u0018\u00010ô\u00010ô\u0001\u0018\u00010;0\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bö\u0001\u0010÷\u0001R\u001a\u0010ù\u0001\u001a\u00030ø\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bù\u0001\u0010ú\u0001R\u0018\u0010ü\u0001\u001a\u00030û\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bü\u0001\u0010ý\u0001R\u001a\u0010þ\u0001\u001a\u00030¯\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bþ\u0001\u0010ÿ\u0001R\u0019\u0010\u0080\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0002\u0010Ö\u0001R\u001b\u0010\u0081\u0002\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0002\u0010\u0082\u0002R\u0019\u0010\u0083\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0002\u0010é\u0001R7\u0010\u0087\u0002\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0005\u0012\u00030\u0085\u00020\u0084\u0002j\u0010\u0012\u0004\u0012\u00020\b\u0012\u0005\u0012\u00030\u0085\u0002`\u0086\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0002\u0010\u0088\u0002R7\u0010\u0089\u0002\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0005\u0012\u00030\u0085\u00020\u0084\u0002j\u0010\u0012\u0004\u0012\u00020\b\u0012\u0005\u0012\u00030\u0085\u0002`\u0086\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0002\u0010\u0088\u0002R'\u0010\u008b\u0002\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020F0\u008a\u00020\u008a\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0002\u0010\u008c\u0002R,\u0010\u008d\u0002\u001a\u0015\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\b0d0\u008a\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0002\u0010\u008c\u0002R\u0019\u0010\u008e\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0002\u0010Ö\u0001R\u001b\u0010\u008f\u0002\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0002\u0010\u0090\u0002R\u001d\u0010\u0091\u0002\u001a\b\u0012\u0004\u0012\u00020[0_8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0002\u0010\u0092\u0002R\u001e\u0010\u0094\u0002\u001a\t\u0012\u0004\u0012\u00020$0\u0093\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0002\u0010\u0095\u0002R\u0019\u0010\u0096\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0002\u0010é\u0001R1\u0010\u0097\u0002\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006 \n\u0006\b\u0097\u0002\u0010é\u0001\u0012\u0006\b\u009a\u0002\u0010²\u0001\u001a\u0006\b\u0098\u0002\u0010ë\u0001\"\u0006\b\u0099\u0002\u0010í\u0001R3\u0010\u009b\u0002\u001a\u0004\u0018\u00010s8\u0000@\u0000X\u0081\u000e¢\u0006 \n\u0006\b\u009b\u0002\u0010\u009c\u0002\u0012\u0006\b¡\u0002\u0010²\u0001\u001a\u0006\b\u009d\u0002\u0010\u009e\u0002\"\u0006\b\u009f\u0002\u0010 \u0002R$\u0010£\u0002\u001a\u000f\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020y0¢\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0002\u0010¤\u0002R\u001d\u0010¥\u0002\u001a\b\u0012\u0004\u0012\u00020\b0_8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0002\u0010\u0092\u0002R\u001c\u0010§\u0002\u001a\u0005\u0018\u00010¦\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0002\u0010¨\u0002R+\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040d8B@\u0002X\u0082\u000e¢\u0006\u000f\n\u0005\b\u0005\u0010©\u0002\u001a\u0006\bª\u0002\u0010«\u0002R\u001f\u0010¬\u0002\u001a\b\u0012\u0004\u0012\u00020\b0_8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0002\u0010\u0092\u0002RG\u0010\u00ad\u0002\u001a \u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0084\u0002j\u000f\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b`\u0086\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u00ad\u0002\u0010\u0088\u0002\u001a\u0006\b®\u0002\u0010¯\u0002\"\u0006\b°\u0002\u0010±\u0002RG\u0010²\u0002\u001a \u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0084\u0002j\u000f\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b`\u0086\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b²\u0002\u0010\u0088\u0002\u001a\u0006\b³\u0002\u0010¯\u0002\"\u0006\b´\u0002\u0010±\u0002R\u001f\u0010µ\u0002\u001a\u00020/8\u0000X\u0080D¢\u0006\u0010\n\u0006\bµ\u0002\u0010¶\u0002\u001a\u0006\b·\u0002\u0010¸\u0002R\u001f\u0010¹\u0002\u001a\u00020/8\u0000X\u0080D¢\u0006\u0010\n\u0006\b¹\u0002\u0010¶\u0002\u001a\u0006\bº\u0002\u0010¸\u0002R\u0018\u0010¼\u0002\u001a\u00030»\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0002\u0010½\u0002R&\u0010¾\u0002\u001a\u000f\u0012\u0004\u0012\u00020\b\u0012\u0005\u0012\u00030\u0087\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0002\u0010©\u0002R\u001a\u0010¿\u0002\u001a\u00030\u0087\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0002\u0010À\u0002R\u0019\u0010Á\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0002\u0010é\u0001R\u0018\u0010Ã\u0002\u001a\u00030Â\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÃ\u0002\u0010Ä\u0002R\u001d\u0010Å\u0002\u001a\b\u0012\u0004\u0012\u00020j0\u001e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÅ\u0002\u0010÷\u0001R$\u0010Æ\u0002\u001a\u000f\u0012\u0004\u0012\u00020j\u0012\u0004\u0012\u00020$0Ü\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0002\u0010Þ\u0001R\u0017\u0010Ç\u0002\u001a\u00020\u00068BX\u0082\u0004¢\u0006\b\u001a\u0006\bÇ\u0002\u0010ë\u0001R\u001f\u0010È\u0002\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0010\u0012\u0006\bÉ\u0002\u0010²\u0001\u001a\u0006\bÈ\u0002\u0010ë\u0001R\u0017\u0010Ê\u0002\u001a\u00020\u00068BX\u0082\u0004¢\u0006\b\u001a\u0006\bÊ\u0002\u0010ë\u0001R\u0017\u0010Ì\u0002\u001a\u00020\u00068@X\u0080\u0004¢\u0006\b\u001a\u0006\bË\u0002\u0010ë\u0001\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Ú\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "Landroidx/core/view/AccessibilityDelegateCompat;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "currentSemanticsNodes", "", "vertical", "", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "Landroidx/compose/ui/geometry/Offset;", "position", "canScroll-moWRBKg", "(Ljava/util/Collection;ZIJ)Z", "canScroll", "virtualViewId", "Landroid/view/accessibility/AccessibilityNodeInfo;", "createNodeInfo", "node", "Landroid/graphics/Rect;", "boundsInScreen", "layoutIsRtl", "Ljava/util/Comparator;", "Landroidx/compose/ui/semantics/SemanticsNode;", "Lkotlin/Comparator;", "semanticComparator", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "parentListToSort", "", "", "containerChildrenMapping", "sortByGeometryGroupings", "currNode", "geometryList", "containerMapToChildren", "Lkotlin/r2;", "geometryDepthFirstSearch", "listToSort", "subtreeSortedByGeometryGrouping", "setTraversalValues", "isScreenReaderFocusable", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "info", "semanticsNode", "populateAccessibilityNodeInfoProperties", "setContentInvalid", "", "getInfoStateDescriptionOrNull", "setStateDescription", "getInfoIsCheckable", "setIsCheckable", "Landroid/text/SpannableString;", "getInfoText", "setText", "isAccessibilityFocused", "requestAccessibilityFocus", "eventType", "contentChangeType", "", "contentDescription", "sendEventForVirtualView", "(IILjava/lang/Integer;Ljava/util/List;)Z", "Landroid/view/accessibility/AccessibilityEvent;", NotificationCompat.CATEGORY_EVENT, "sendEvent", "createEvent", "fromIndex", "toIndex", "itemCount", "", "text", "createTextSelectionChangedEvent", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;", "clearAccessibilityFocus", "action", "Landroid/os/Bundle;", "arguments", "performActionHelper", "extraDataKey", "addExtraDataToAccessibilityNodeInfoHelper", "textNode", "Landroidx/compose/ui/geometry/Rect;", "bounds", "Landroid/graphics/RectF;", "toScreenCoords", "updateHoveredVirtualView", "T", "size", "trimToSize", "(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "notifySubtreeAccessibilityStateChangedIfNeeded", "sendTypeViewScrolledAccessibilityEvent", "Landroidx/collection/ArraySet;", "subtreeChangedSemanticsNodesIds", "sendSubtreeChangeAccessibilityEvents", "checkForSemanticsChanges", "updateSemanticsNodesCopyAndPanes", "", "newSemanticsNodes", "sendSemanticsPropertyChangeEvents", "id", "newText", "sendContentCaptureTextUpdateEvent", "Landroidx/compose/ui/platform/ScrollObservationScope;", "oldScrollObservationScopes", "registerScrollingId", "scrollObservationScope", "scheduleScrollEventIfNeeded", "semanticsNodeId", com.alipay.sdk.m.x.d.f3030v, "sendPaneChangeEvents", "Landroid/view/View;", "Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", "getContentCaptureSessionCompat", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "configuration", "Landroidx/compose/ui/text/TextLayoutResult;", "getTextLayoutResult", "Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;", "toViewStructure", "virtualId", "viewStructure", "bufferContentCaptureViewAppeared", "bufferContentCaptureViewDisappeared", "notifyContentCaptureChanges", "updateContentCaptureBuffersOnAppeared", "updateContentCaptureBuffersOnDisappeared", "updateTranslationOnAppeared", "showTranslatedText", "hideTranslatedText", "clearTranslatedText", "newNode", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy;", "oldNode", "sendAccessibilitySemanticsStructureChangeEvents", "onStart", "initContentCapture", "sendContentCaptureSemanticsStructureChangeEvents", "semanticsNodeIdToAccessibilityVirtualNodeId", "granularity", "forward", "extendSelection", "traverseAtGranularity", "sendPendingTextTraversedAtGranularityEvent", "start", "end", "traversalMode", "setAccessibilitySelection", "getAccessibilitySelectionStart", "getAccessibilitySelectionEnd", "isAccessibilitySelectionExtendable", "Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", "getIteratorForGranularity", "getIterableTextForAccessibility", "Landroidx/compose/ui/text/AnnotatedString;", "getTextForTextField", "Landroidx/lifecycle/LifecycleOwner;", "owner", "onStop", "canScroll-0AR0LA0$ui_release", "(ZIJ)Z", "Landroid/view/MotionEvent;", "dispatchHoverEvent$ui_release", "(Landroid/view/MotionEvent;)Z", "dispatchHoverEvent", "", "x", "y", "hitTestSemanticsAt$ui_release", "(FF)I", "hitTestSemanticsAt", k0.c.f19042f, "Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "getAccessibilityNodeProvider", "onSemanticsChange$ui_release", "()V", "onSemanticsChange", "boundsUpdatesEventLoop$ui_release", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "boundsUpdatesEventLoop", "onLayoutChange$ui_release", "(Landroidx/compose/ui/node/LayoutNode;)V", "onLayoutChange", "onShowTranslation$ui_release", "onShowTranslation", "onHideTranslation$ui_release", "onHideTranslation", "onClearTranslation$ui_release", "onClearTranslation", "", "virtualIds", "", "supportedFormats", "Ljava/util/function/Consumer;", "Landroid/view/translation/ViewTranslationRequest;", "requestsCollector", "onCreateVirtualViewTranslationRequests$ui_release", "([J[ILjava/util/function/Consumer;)V", "onCreateVirtualViewTranslationRequests", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "response", "onVirtualViewTranslationResponses$ui_release", "(Landroid/util/LongSparseArray;)V", "onVirtualViewTranslationResponses", "Landroidx/compose/ui/platform/AndroidComposeView;", "view", "Landroidx/compose/ui/platform/AndroidComposeView;", "getView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "hoveredVirtualViewId", "I", "getHoveredVirtualViewId$ui_release", "()I", "setHoveredVirtualViewId$ui_release", "(I)V", "getHoveredVirtualViewId$ui_release$annotations", "Lkotlin/Function1;", "onSendAccessibilityEvent", "Lv3/l;", "getOnSendAccessibilityEvent$ui_release", "()Lv3/l;", "setOnSendAccessibilityEvent$ui_release", "(Lv3/l;)V", "getOnSendAccessibilityEvent$ui_release$annotations", "Landroid/view/accessibility/AccessibilityManager;", "accessibilityManager", "Landroid/view/accessibility/AccessibilityManager;", t0.b.f22420d, "accessibilityForceEnabledForTesting", "Z", "getAccessibilityForceEnabledForTesting$ui_release", "()Z", "setAccessibilityForceEnabledForTesting$ui_release", "(Z)V", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "enabledStateListener", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "touchExplorationStateListener", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "Landroid/accessibilityservice/AccessibilityServiceInfo;", "kotlin.jvm.PlatformType", "enabledServices", "Ljava/util/List;", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$TranslateStatus;", "translateStatus", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$TranslateStatus;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "nodeProvider", "Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "focusedVirtualViewId", "currentlyFocusedANI", "Landroid/view/accessibility/AccessibilityNodeInfo;", "sendingFocusAffectingEvent", "Ljava/util/HashMap;", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "Lkotlin/collections/HashMap;", "pendingHorizontalScrollEvents", "Ljava/util/HashMap;", "pendingVerticalScrollEvents", "Landroidx/collection/SparseArrayCompat;", "actionIdToLabel", "Landroidx/collection/SparseArrayCompat;", "labelToActionId", "accessibilityCursorPosition", "previousTraversedNode", "Ljava/lang/Integer;", "subtreeChangedLayoutNodes", "Landroidx/collection/ArraySet;", "Lkotlinx/coroutines/channels/l;", "boundsUpdateChannel", "Lkotlinx/coroutines/channels/l;", "currentSemanticsNodesInvalidated", "contentCaptureForceEnabledForTesting", "getContentCaptureForceEnabledForTesting$ui_release", "setContentCaptureForceEnabledForTesting$ui_release", "getContentCaptureForceEnabledForTesting$ui_release$annotations", "contentCaptureSession", "Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", "getContentCaptureSession$ui_release", "()Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", "setContentCaptureSession$ui_release", "(Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;)V", "getContentCaptureSession$ui_release$annotations", "Landroidx/collection/ArrayMap;", "bufferedContentCaptureAppearedNodes", "Landroidx/collection/ArrayMap;", "bufferedContentCaptureDisappearedNodes", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "pendingTextTraversedEvent", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "Ljava/util/Map;", "getCurrentSemanticsNodes", "()Ljava/util/Map;", "paneDisplayed", "idToBeforeMap", "getIdToBeforeMap$ui_release", "()Ljava/util/HashMap;", "setIdToBeforeMap$ui_release", "(Ljava/util/HashMap;)V", "idToAfterMap", "getIdToAfterMap$ui_release", "setIdToAfterMap$ui_release", "ExtraDataTestTraversalBeforeVal", "Ljava/lang/String;", "getExtraDataTestTraversalBeforeVal$ui_release", "()Ljava/lang/String;", "ExtraDataTestTraversalAfterVal", "getExtraDataTestTraversalAfterVal$ui_release", "Landroidx/compose/ui/text/platform/URLSpanCache;", "urlSpanCache", "Landroidx/compose/ui/text/platform/URLSpanCache;", "previousSemanticsNodes", "previousSemanticsRoot", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy;", "checkingForSemanticsChanges", "Ljava/lang/Runnable;", "semanticsChangeChecker", "Ljava/lang/Runnable;", "scrollObservationScopes", "scheduleScrollEventIfNeededLambda", "isEnabled", "isEnabledForContentCapture", "isEnabledForContentCapture$annotations", "isTouchExplorationEnabled", "isEnabledForAccessibility$ui_release", "isEnabledForAccessibility", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "Companion", "Api24Impl", "Api29Impl", "ComposeAccessibilityNodeProvider", "LtrBoundsComparator", "PendingTextTraversedEvent", "RtlBoundsComparator", "SemanticsNodeCopy", "TopBottomBoundsComparator", "TranslateStatus", "ViewTranslationHelperMethodsS", "ui_release"}, k = 1, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat_androidKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 7 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,3790:1\n583#1,5:3798\n1747#2,3:3791\n33#3,4:3794\n38#3:3803\n33#3,6:3806\n33#3,6:3812\n33#3,6:3820\n33#3,6:3830\n69#3,6:3836\n69#3,6:3842\n33#3,6:3852\n33#3,6:3867\n33#3,6:3873\n151#3,3:3879\n33#3,4:3882\n154#3,2:3886\n38#3:3888\n156#3:3889\n151#3,3:3890\n33#3,4:3893\n154#3,2:3897\n38#3:3899\n156#3:3900\n33#3,6:3901\n33#3,6:3907\n33#3,6:3913\n33#3,6:3919\n33#3,6:3925\n33#3,6:3931\n3586#4:3804\n3588#4:3805\n3586#4:3818\n3585#4:3819\n3583#4:3826\n3585#4:3827\n3586#4:3828\n3586#4:3829\n3583#4:3848\n3586#4:3850\n3586#4:3851\n3585#4:3862\n3585#4:3863\n3583#4:3864\n3585#4:3865\n3583#4:3866\n3585#4:3937\n1#5:3849\n37#6,2:3858\n76#7:3860\n76#7:3861\n*S KotlinDebug\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat\n*L\n661#1:3798,5\n459#1:3791,3\n659#1:3794,4\n659#1:3803\n720#1:3806,6\n742#1:3812,6\n830#1:3820,6\n1227#1:3830,6\n1238#1:3836,6\n1245#1:3842,6\n1942#1:3852,6\n2703#1:3867,6\n2707#1:3873,6\n2980#1:3879,3\n2980#1:3882,4\n2980#1:3886,2\n2980#1:3888\n2980#1:3889\n2987#1:3890,3\n2987#1:3893,4\n2987#1:3897,2\n2987#1:3899\n2987#1:3900\n3001#1:3901,6\n3009#1:3907,6\n3084#1:3913,6\n3102#1:3919,6\n3124#1:3925,6\n3137#1:3931,6\n703#1:3804\n707#1:3805\n756#1:3818\n811#1:3819\n908#1:3826\n910#1:3827\n1132#1:3828\n1142#1:3829\n1591#1:3848\n1775#1:3850\n1929#1:3851\n2563#1:3862\n2596#1:3863\n2597#1:3864\n2598#1:3865\n2599#1:3866\n3368#1:3937\n1998#1:3858,2\n2113#1:3860\n2332#1:3861\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat extends AccessibilityDelegateCompat implements DefaultLifecycleObserver {
    public static final int AccessibilityCursorPositionUndefined = -1;
    public static final int AccessibilitySliderStepsCount = 20;

    @p4.l
    public static final String ClassName = "android.view.View";

    @p4.l
    public static final String ExtraDataIdKey = "androidx.compose.ui.semantics.id";

    @p4.l
    public static final String ExtraDataTestTagKey = "androidx.compose.ui.semantics.testTag";
    public static final int InvalidId = Integer.MIN_VALUE;

    @p4.l
    public static final String LogTag = "AccessibilityDelegate";
    public static final int ParcelSafeTextLength = 100000;
    public static final long SendRecurringAccessibilityEventsIntervalMillis = 100;

    @p4.l
    public static final String TextClassName = "android.widget.TextView";

    @p4.l
    public static final String TextFieldClassName = "android.widget.EditText";
    public static final long TextTraversedEventTimeoutMillis = 1000;

    @p4.l
    private final String ExtraDataTestTraversalAfterVal;

    @p4.l
    private final String ExtraDataTestTraversalBeforeVal;
    private int accessibilityCursorPosition;
    private boolean accessibilityForceEnabledForTesting;

    @p4.l
    private final android.view.accessibility.AccessibilityManager accessibilityManager;

    @p4.l
    private SparseArrayCompat<SparseArrayCompat<CharSequence>> actionIdToLabel;

    @p4.l
    private final kotlinx.coroutines.channels.l<r2> boundsUpdateChannel;

    @p4.l
    private final ArrayMap<Integer, ViewStructureCompat> bufferedContentCaptureAppearedNodes;

    @p4.l
    private final ArraySet<Integer> bufferedContentCaptureDisappearedNodes;
    private boolean checkingForSemanticsChanges;
    private boolean contentCaptureForceEnabledForTesting;

    @p4.m
    private ContentCaptureSessionCompat contentCaptureSession;

    @p4.l
    private Map<Integer, SemanticsNodeWithAdjustedBounds> currentSemanticsNodes;
    private boolean currentSemanticsNodesInvalidated;

    @p4.m
    private AccessibilityNodeInfo currentlyFocusedANI;
    private List<AccessibilityServiceInfo> enabledServices;

    @p4.l
    private final AccessibilityManager.AccessibilityStateChangeListener enabledStateListener;
    private int focusedVirtualViewId;

    @p4.l
    private final Handler handler;

    @p4.l
    private HashMap<Integer, Integer> idToAfterMap;

    @p4.l
    private HashMap<Integer, Integer> idToBeforeMap;

    @p4.l
    private SparseArrayCompat<Map<CharSequence, Integer>> labelToActionId;

    @p4.l
    private AccessibilityNodeProviderCompat nodeProvider;

    @p4.l
    private ArraySet<Integer> paneDisplayed;

    @p4.l
    private final HashMap<Integer, ScrollAxisRange> pendingHorizontalScrollEvents;

    @p4.m
    private PendingTextTraversedEvent pendingTextTraversedEvent;

    @p4.l
    private final HashMap<Integer, ScrollAxisRange> pendingVerticalScrollEvents;

    @p4.l
    private Map<Integer, SemanticsNodeCopy> previousSemanticsNodes;

    @p4.l
    private SemanticsNodeCopy previousSemanticsRoot;

    @p4.m
    private Integer previousTraversedNode;

    @p4.l
    private final v3.l<ScrollObservationScope, r2> scheduleScrollEventIfNeededLambda;

    @p4.l
    private final List<ScrollObservationScope> scrollObservationScopes;

    @p4.l
    private final Runnable semanticsChangeChecker;
    private boolean sendingFocusAffectingEvent;

    @p4.l
    private final ArraySet<LayoutNode> subtreeChangedLayoutNodes;

    @p4.l
    private final AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateListener;

    @p4.l
    private TranslateStatus translateStatus;

    @p4.l
    private final URLSpanCache urlSpanCache;

    @p4.l
    private final AndroidComposeView view;

    @p4.l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @p4.l
    private static final int[] AccessibilityActionsResourceIds = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    private int hoveredVirtualViewId = Integer.MIN_VALUE;

    @p4.l
    private v3.l<? super AccessibilityEvent, Boolean> onSendAccessibilityEvent = new AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1(this);

    /* JADX INFO: Access modifiers changed from: private */
    @kotlin.i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api24Impl;", "", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "info", "Landroidx/compose/ui/semantics/SemanticsNode;", "semanticsNode", "Lkotlin/r2;", "addSetProgressAction", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    @RequiresApi(24)
    /* loaded from: classes.dex */
    public static final class Api24Impl {

        @p4.l
        public static final Api24Impl INSTANCE = new Api24Impl();

        private Api24Impl() {
        }

        @DoNotInline
        @u3.m
        public static final void addSetProgressAction(@p4.l AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, @p4.l SemanticsNode semanticsNode) {
            boolean enabled;
            AccessibilityAction accessibilityAction;
            enabled = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getSetProgress())) != null) {
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionSetProgress, accessibilityAction.getLabel()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @kotlin.i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api29Impl;", "", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "info", "Landroidx/compose/ui/semantics/SemanticsNode;", "semanticsNode", "Lkotlin/r2;", "addPageActions", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    @RequiresApi(29)
    /* loaded from: classes.dex */
    public static final class Api29Impl {

        @p4.l
        public static final Api29Impl INSTANCE = new Api29Impl();

        private Api29Impl() {
        }

        @DoNotInline
        @u3.m
        public static final void addPageActions(@p4.l AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, @p4.l SemanticsNode semanticsNode) {
            boolean enabled;
            enabled = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled) {
                SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
                SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
                AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsActions.getPageUp());
                if (accessibilityAction != null) {
                    accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageUp, accessibilityAction.getLabel()));
                }
                AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getPageDown());
                if (accessibilityAction2 != null) {
                    accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageDown, accessibilityAction2.getLabel()));
                }
                AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getPageLeft());
                if (accessibilityAction3 != null) {
                    accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageLeft, accessibilityAction3.getLabel()));
                }
                AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getPageRight());
                if (accessibilityAction4 != null) {
                    accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageRight, accessibilityAction4.getLabel()));
                }
            }
        }
    }

    @kotlin.i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Companion;", "", "()V", "AccessibilityActionsResourceIds", "", "AccessibilityCursorPositionUndefined", "", "AccessibilitySliderStepsCount", "ClassName", "", "ExtraDataIdKey", "ExtraDataTestTagKey", "InvalidId", "LogTag", "ParcelSafeTextLength", "SendRecurringAccessibilityEventsIntervalMillis", "", "TextClassName", "TextFieldClassName", "TextTraversedEventTimeoutMillis", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    @kotlin.i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\"\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J*\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$ComposeAccessibilityNodeProvider;", "Landroid/view/accessibility/AccessibilityNodeProvider;", "", "virtualViewId", "Landroid/view/accessibility/AccessibilityNodeInfo;", "createAccessibilityNodeInfo", "action", "Landroid/os/Bundle;", "arguments", "", "performAction", "info", "", "extraDataKey", "Lkotlin/r2;", "addExtraDataToAccessibilityNodeInfo", "focus", "findFocus", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    private final class ComposeAccessibilityNodeProvider extends AccessibilityNodeProvider {
        public ComposeAccessibilityNodeProvider() {
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i5, @p4.l AccessibilityNodeInfo accessibilityNodeInfo, @p4.l String str, @p4.m Bundle bundle) {
            AndroidComposeViewAccessibilityDelegateCompat.this.addExtraDataToAccessibilityNodeInfoHelper(i5, accessibilityNodeInfo, str, bundle);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        @p4.m
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i5) {
            AccessibilityNodeInfo createNodeInfo = AndroidComposeViewAccessibilityDelegateCompat.this.createNodeInfo(i5);
            if (AndroidComposeViewAccessibilityDelegateCompat.this.sendingFocusAffectingEvent && i5 == AndroidComposeViewAccessibilityDelegateCompat.this.focusedVirtualViewId) {
                AndroidComposeViewAccessibilityDelegateCompat.this.currentlyFocusedANI = createNodeInfo;
            }
            return createNodeInfo;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        @p4.m
        public AccessibilityNodeInfo findFocus(int i5) {
            return createAccessibilityNodeInfo(AndroidComposeViewAccessibilityDelegateCompat.this.focusedVirtualViewId);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i5, int i6, @p4.m Bundle bundle) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.performActionHelper(i5, i6, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @kotlin.i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$LtrBoundsComparator;", "Ljava/util/Comparator;", "Landroidx/compose/ui/semantics/SemanticsNode;", "Lkotlin/Comparator;", "()V", "compare", "", bi.ay, "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class LtrBoundsComparator implements Comparator<SemanticsNode> {

        @p4.l
        public static final LtrBoundsComparator INSTANCE = new LtrBoundsComparator();

        private LtrBoundsComparator() {
        }

        @Override // java.util.Comparator
        public int compare(@p4.l SemanticsNode semanticsNode, @p4.l SemanticsNode semanticsNode2) {
            Rect boundsInWindow = semanticsNode.getBoundsInWindow();
            Rect boundsInWindow2 = semanticsNode2.getBoundsInWindow();
            int compare = Float.compare(boundsInWindow.getLeft(), boundsInWindow2.getLeft());
            if (compare != 0) {
                return compare;
            }
            int compare2 = Float.compare(boundsInWindow.getTop(), boundsInWindow2.getTop());
            if (compare2 != 0) {
                return compare2;
            }
            int compare3 = Float.compare(boundsInWindow.getBottom(), boundsInWindow2.getBottom());
            return compare3 != 0 ? compare3 : Float.compare(boundsInWindow.getRight(), boundsInWindow2.getRight());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @kotlin.i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "", "node", "Landroidx/compose/ui/semantics/SemanticsNode;", "action", "", "granularity", "fromIndex", "toIndex", "traverseTime", "", "(Landroidx/compose/ui/semantics/SemanticsNode;IIIIJ)V", "getAction", "()I", "getFromIndex", "getGranularity", "getNode", "()Landroidx/compose/ui/semantics/SemanticsNode;", "getToIndex", "getTraverseTime", "()J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class PendingTextTraversedEvent {
        private final int action;
        private final int fromIndex;
        private final int granularity;

        @p4.l
        private final SemanticsNode node;
        private final int toIndex;
        private final long traverseTime;

        public PendingTextTraversedEvent(@p4.l SemanticsNode semanticsNode, int i5, int i6, int i7, int i8, long j5) {
            this.node = semanticsNode;
            this.action = i5;
            this.granularity = i6;
            this.fromIndex = i7;
            this.toIndex = i8;
            this.traverseTime = j5;
        }

        public final int getAction() {
            return this.action;
        }

        public final int getFromIndex() {
            return this.fromIndex;
        }

        public final int getGranularity() {
            return this.granularity;
        }

        @p4.l
        public final SemanticsNode getNode() {
            return this.node;
        }

        public final int getToIndex() {
            return this.toIndex;
        }

        public final long getTraverseTime() {
            return this.traverseTime;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @kotlin.i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$RtlBoundsComparator;", "Ljava/util/Comparator;", "Landroidx/compose/ui/semantics/SemanticsNode;", "Lkotlin/Comparator;", "()V", "compare", "", bi.ay, "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class RtlBoundsComparator implements Comparator<SemanticsNode> {

        @p4.l
        public static final RtlBoundsComparator INSTANCE = new RtlBoundsComparator();

        private RtlBoundsComparator() {
        }

        @Override // java.util.Comparator
        public int compare(@p4.l SemanticsNode semanticsNode, @p4.l SemanticsNode semanticsNode2) {
            Rect boundsInWindow = semanticsNode.getBoundsInWindow();
            Rect boundsInWindow2 = semanticsNode2.getBoundsInWindow();
            int compare = Float.compare(boundsInWindow2.getRight(), boundsInWindow.getRight());
            if (compare != 0) {
                return compare;
            }
            int compare2 = Float.compare(boundsInWindow.getTop(), boundsInWindow2.getTop());
            if (compare2 != 0) {
                return compare2;
            }
            int compare3 = Float.compare(boundsInWindow.getBottom(), boundsInWindow2.getBottom());
            return compare3 != 0 ? compare3 : Float.compare(boundsInWindow2.getLeft(), boundsInWindow.getLeft());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @kotlin.i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\u0006\u0010\u0013\u001a\u00020\u0014R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy;", "", "semanticsNode", "Landroidx/compose/ui/semantics/SemanticsNode;", "currentSemanticsNodes", "", "", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "(Landroidx/compose/ui/semantics/SemanticsNode;Ljava/util/Map;)V", "children", "", "getChildren", "()Ljava/util/Set;", "getSemanticsNode", "()Landroidx/compose/ui/semantics/SemanticsNode;", "unmergedConfig", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getUnmergedConfig", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "hasPaneTitle", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,3790:1\n33#2,6:3791\n*S KotlinDebug\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy\n*L\n372#1:3791,6\n*E\n"})
    /* loaded from: classes.dex */
    public static final class SemanticsNodeCopy {

        @p4.l
        private final Set<Integer> children = new LinkedHashSet();

        @p4.l
        private final SemanticsNode semanticsNode;

        @p4.l
        private final SemanticsConfiguration unmergedConfig;

        public SemanticsNodeCopy(@p4.l SemanticsNode semanticsNode, @p4.l Map<Integer, SemanticsNodeWithAdjustedBounds> map) {
            this.semanticsNode = semanticsNode;
            this.unmergedConfig = semanticsNode.getUnmergedConfig$ui_release();
            List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i5 = 0; i5 < size; i5++) {
                SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i5);
                if (map.containsKey(Integer.valueOf(semanticsNode2.getId()))) {
                    this.children.add(Integer.valueOf(semanticsNode2.getId()));
                }
            }
        }

        @p4.l
        public final Set<Integer> getChildren() {
            return this.children;
        }

        @p4.l
        public final SemanticsNode getSemanticsNode() {
            return this.semanticsNode;
        }

        @p4.l
        public final SemanticsConfiguration getUnmergedConfig() {
            return this.unmergedConfig;
        }

        public final boolean hasPaneTitle() {
            return this.unmergedConfig.contains(SemanticsProperties.INSTANCE.getPaneTitle());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @kotlin.i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÂ\u0002\u0018\u000026\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00020\u0001j\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002`\u0006B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ<\u0010\n\u001a\u00020\t2\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00022\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H\u0016¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$TopBottomBoundsComparator;", "Ljava/util/Comparator;", "Lkotlin/u0;", "Landroidx/compose/ui/geometry/Rect;", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "Lkotlin/Comparator;", bi.ay, "b", "", "compare", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class TopBottomBoundsComparator implements Comparator<kotlin.u0<? extends Rect, ? extends List<SemanticsNode>>> {

        @p4.l
        public static final TopBottomBoundsComparator INSTANCE = new TopBottomBoundsComparator();

        private TopBottomBoundsComparator() {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(kotlin.u0<? extends Rect, ? extends List<SemanticsNode>> u0Var, kotlin.u0<? extends Rect, ? extends List<SemanticsNode>> u0Var2) {
            return compare2((kotlin.u0<Rect, ? extends List<SemanticsNode>>) u0Var, (kotlin.u0<Rect, ? extends List<SemanticsNode>>) u0Var2);
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(@p4.l kotlin.u0<Rect, ? extends List<SemanticsNode>> u0Var, @p4.l kotlin.u0<Rect, ? extends List<SemanticsNode>> u0Var2) {
            int compare = Float.compare(u0Var.getFirst().getTop(), u0Var2.getFirst().getTop());
            return compare != 0 ? compare : Float.compare(u0Var.getFirst().getBottom(), u0Var2.getFirst().getBottom());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$TranslateStatus;", "", "(Ljava/lang/String;I)V", "SHOW_ORIGINAL", "SHOW_TRANSLATED", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public enum TranslateStatus {
        SHOW_ORIGINAL,
        SHOW_TRANSLATED
    }

    /* JADX INFO: Access modifiers changed from: private */
    @kotlin.i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002J0\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0007J \u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0007¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$ViewTranslationHelperMethodsS;", "", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "accessibilityDelegateCompat", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "response", "Lkotlin/r2;", "doTranslation", "", "virtualIds", "", "supportedFormats", "Ljava/util/function/Consumer;", "Landroid/view/translation/ViewTranslationRequest;", "requestsCollector", "onCreateVirtualViewTranslationRequests", "onVirtualViewTranslationResponses", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    @RequiresApi(31)
    @kotlin.jvm.internal.r1({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$ViewTranslationHelperMethodsS\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3790:1\n13607#2,2:3791\n*S KotlinDebug\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$ViewTranslationHelperMethodsS\n*L\n3490#1:3791,2\n*E\n"})
    /* loaded from: classes.dex */
    public static final class ViewTranslationHelperMethodsS {

        @p4.l
        public static final ViewTranslationHelperMethodsS INSTANCE = new ViewTranslationHelperMethodsS();

        private ViewTranslationHelperMethodsS() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
        
            r3 = r3.getText();
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            r3 = r3.getValue("android:text");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void doTranslation(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r11, android.util.LongSparseArray<android.view.translation.ViewTranslationResponse> r12) {
            /*
                r10 = this;
                kotlin.collections.t0 r0 = androidx.core.util.LongSparseArrayKt.keyIterator(r12)
            L4:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L6a
                long r1 = r0.nextLong()
                java.lang.Object r3 = r12.get(r1)
                android.view.translation.ViewTranslationResponse r3 = (android.view.translation.ViewTranslationResponse) r3
                if (r3 == 0) goto L4
                java.lang.String r4 = "android:text"
                android.view.translation.TranslationResponseValue r3 = androidx.compose.ui.platform.o.a(r3, r4)
                if (r3 == 0) goto L4
                java.lang.CharSequence r3 = androidx.compose.ui.platform.p.a(r3)
                if (r3 == 0) goto L4
                java.util.Map r4 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.access$getCurrentSemanticsNodes(r11)
                int r1 = (int) r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.Object r1 = r4.get(r1)
                androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds r1 = (androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds) r1
                if (r1 == 0) goto L4
                androidx.compose.ui.semantics.SemanticsNode r1 = r1.getSemanticsNode()
                if (r1 == 0) goto L4
                androidx.compose.ui.semantics.SemanticsConfiguration r1 = r1.getUnmergedConfig$ui_release()
                androidx.compose.ui.semantics.SemanticsActions r2 = androidx.compose.ui.semantics.SemanticsActions.INSTANCE
                androidx.compose.ui.semantics.SemanticsPropertyKey r2 = r2.getSetTextSubstitution()
                java.lang.Object r1 = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r1, r2)
                androidx.compose.ui.semantics.AccessibilityAction r1 = (androidx.compose.ui.semantics.AccessibilityAction) r1
                if (r1 == 0) goto L4
                kotlin.v r1 = r1.getAction()
                v3.l r1 = (v3.l) r1
                if (r1 == 0) goto L4
                androidx.compose.ui.text.AnnotatedString r2 = new androidx.compose.ui.text.AnnotatedString
                java.lang.String r5 = r3.toString()
                r6 = 0
                r7 = 0
                r8 = 6
                r9 = 0
                r4 = r2
                r4.<init>(r5, r6, r7, r8, r9)
                java.lang.Object r1 = r1.invoke(r2)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                goto L4
            L6a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.ViewTranslationHelperMethodsS.doTranslation(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat, android.util.LongSparseArray):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onVirtualViewTranslationResponses$lambda$1(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, LongSparseArray longSparseArray) {
            INSTANCE.doTranslation(androidComposeViewAccessibilityDelegateCompat, longSparseArray);
        }

        @DoNotInline
        @RequiresApi(31)
        public final void onCreateVirtualViewTranslationRequests(@p4.l AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, @p4.l long[] jArr, @p4.l int[] iArr, @p4.l Consumer<ViewTranslationRequest> consumer) {
            SemanticsNode semanticsNode;
            String textForTranslation;
            TranslationRequestValue forText;
            ViewTranslationRequest build;
            for (long j5 : jArr) {
                SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) androidComposeViewAccessibilityDelegateCompat.getCurrentSemanticsNodes().get(Integer.valueOf((int) j5));
                if (semanticsNodeWithAdjustedBounds != null && (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) != null) {
                    ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(androidComposeViewAccessibilityDelegateCompat.getView().getAutofillId(), semanticsNode.getId());
                    textForTranslation = AndroidComposeViewAccessibilityDelegateCompat_androidKt.getTextForTranslation(semanticsNode);
                    if (textForTranslation != null) {
                        forText = TranslationRequestValue.forText(new AnnotatedString(textForTranslation, null, null, 6, null));
                        builder.setValue("android:text", forText);
                        build = builder.build();
                        consumer.accept(build);
                    }
                }
            }
        }

        @DoNotInline
        @RequiresApi(31)
        public final void onVirtualViewTranslationResponses(@p4.l final AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, @p4.l final LongSparseArray<ViewTranslationResponse> longSparseArray) {
            if (Build.VERSION.SDK_INT < 31) {
                return;
            }
            if (kotlin.jvm.internal.l0.g(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                doTranslation(androidComposeViewAccessibilityDelegateCompat, longSparseArray);
            } else {
                androidComposeViewAccessibilityDelegateCompat.getView().post(new Runnable() { // from class: androidx.compose.ui.platform.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        AndroidComposeViewAccessibilityDelegateCompat.ViewTranslationHelperMethodsS.onVirtualViewTranslationResponses$lambda$1(AndroidComposeViewAccessibilityDelegateCompat.this, longSparseArray);
                    }
                });
            }
        }
    }

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AndroidComposeViewAccessibilityDelegateCompat(@p4.l AndroidComposeView androidComposeView) {
        Map<Integer, SemanticsNodeWithAdjustedBounds> z4;
        Map z5;
        this.view = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        kotlin.jvm.internal.l0.n(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) systemService;
        this.accessibilityManager = accessibilityManager;
        this.enabledStateListener = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: androidx.compose.ui.platform.h
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z6) {
                AndroidComposeViewAccessibilityDelegateCompat.enabledStateListener$lambda$0(AndroidComposeViewAccessibilityDelegateCompat.this, z6);
            }
        };
        this.touchExplorationStateListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: androidx.compose.ui.platform.i
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z6) {
                AndroidComposeViewAccessibilityDelegateCompat.touchExplorationStateListener$lambda$1(AndroidComposeViewAccessibilityDelegateCompat.this, z6);
            }
        };
        this.enabledServices = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.translateStatus = TranslateStatus.SHOW_ORIGINAL;
        this.handler = new Handler(Looper.getMainLooper());
        this.nodeProvider = new AccessibilityNodeProviderCompat(new ComposeAccessibilityNodeProvider());
        this.focusedVirtualViewId = Integer.MIN_VALUE;
        this.pendingHorizontalScrollEvents = new HashMap<>();
        this.pendingVerticalScrollEvents = new HashMap<>();
        this.actionIdToLabel = new SparseArrayCompat<>(0, 1, null);
        this.labelToActionId = new SparseArrayCompat<>(0, 1, null);
        this.accessibilityCursorPosition = -1;
        this.subtreeChangedLayoutNodes = new ArraySet<>(0, 1, null);
        this.boundsUpdateChannel = kotlinx.coroutines.channels.o.d(1, null, null, 6, null);
        this.currentSemanticsNodesInvalidated = true;
        this.bufferedContentCaptureAppearedNodes = new ArrayMap<>();
        this.bufferedContentCaptureDisappearedNodes = new ArraySet<>(0, 1, null);
        z4 = kotlin.collections.a1.z();
        this.currentSemanticsNodes = z4;
        this.paneDisplayed = new ArraySet<>(0, 1, null);
        this.idToBeforeMap = new HashMap<>();
        this.idToAfterMap = new HashMap<>();
        this.ExtraDataTestTraversalBeforeVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.ExtraDataTestTraversalAfterVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.urlSpanCache = new URLSpanCache();
        this.previousSemanticsNodes = new LinkedHashMap();
        SemanticsNode unmergedRootSemanticsNode = androidComposeView.getSemanticsOwner().getUnmergedRootSemanticsNode();
        z5 = kotlin.collections.a1.z();
        this.previousSemanticsRoot = new SemanticsNodeCopy(unmergedRootSemanticsNode, z5);
        androidComposeView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@p4.l View view) {
                android.view.accessibility.AccessibilityManager accessibilityManager2 = AndroidComposeViewAccessibilityDelegateCompat.this.accessibilityManager;
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
                accessibilityManager2.addAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.enabledStateListener);
                accessibilityManager2.addTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.touchExplorationStateListener);
                if (!AndroidComposeViewAccessibilityDelegateCompat.this.getContentCaptureForceEnabledForTesting$ui_release()) {
                    AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2 = AndroidComposeViewAccessibilityDelegateCompat.this;
                    androidComposeViewAccessibilityDelegateCompat2.setContentCaptureSession$ui_release(androidComposeViewAccessibilityDelegateCompat2.getContentCaptureSessionCompat(view));
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@p4.l View view) {
                AndroidComposeViewAccessibilityDelegateCompat.this.handler.removeCallbacks(AndroidComposeViewAccessibilityDelegateCompat.this.semanticsChangeChecker);
                android.view.accessibility.AccessibilityManager accessibilityManager2 = AndroidComposeViewAccessibilityDelegateCompat.this.accessibilityManager;
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
                accessibilityManager2.removeAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.enabledStateListener);
                accessibilityManager2.removeTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.touchExplorationStateListener);
                AndroidComposeViewAccessibilityDelegateCompat.this.setContentCaptureSession$ui_release(null);
            }
        });
        this.semanticsChangeChecker = new Runnable() { // from class: androidx.compose.ui.platform.j
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeViewAccessibilityDelegateCompat.semanticsChangeChecker$lambda$46(AndroidComposeViewAccessibilityDelegateCompat.this);
            }
        };
        this.scrollObservationScopes = new ArrayList();
        this.scheduleScrollEventIfNeededLambda = new AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addExtraDataToAccessibilityNodeInfoHelper(int i5, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        SemanticsNode semanticsNode;
        int i6;
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(Integer.valueOf(i5));
        if (semanticsNodeWithAdjustedBounds != null && (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) != null) {
            String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
            if (kotlin.jvm.internal.l0.g(str, this.ExtraDataTestTraversalBeforeVal)) {
                Integer num = this.idToBeforeMap.get(Integer.valueOf(i5));
                if (num != null) {
                    accessibilityNodeInfo.getExtras().putInt(str, num.intValue());
                    return;
                }
                return;
            }
            if (kotlin.jvm.internal.l0.g(str, this.ExtraDataTestTraversalAfterVal)) {
                Integer num2 = this.idToAfterMap.get(Integer.valueOf(i5));
                if (num2 != null) {
                    accessibilityNodeInfo.getExtras().putInt(str, num2.intValue());
                    return;
                }
                return;
            }
            if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult()) && bundle != null && kotlin.jvm.internal.l0.g(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                int i7 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                int i8 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                if (i8 > 0 && i7 >= 0) {
                    if (iterableTextForAccessibility != null) {
                        i6 = iterableTextForAccessibility.length();
                    } else {
                        i6 = Integer.MAX_VALUE;
                    }
                    if (i7 < i6) {
                        TextLayoutResult textLayoutResult = getTextLayoutResult(semanticsNode.getUnmergedConfig$ui_release());
                        if (textLayoutResult == null) {
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i9 = 0; i9 < i8; i9++) {
                            int i10 = i7 + i9;
                            if (i10 >= textLayoutResult.getLayoutInput().getText().length()) {
                                arrayList.add(null);
                            } else {
                                arrayList.add(toScreenCoords(semanticsNode, textLayoutResult.getBoundingBox(i10)));
                            }
                        }
                        accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                        return;
                    }
                }
                Log.e(LogTag, "Invalid arguments for accessibility character locations");
                return;
            }
            SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
            SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
            if (unmergedConfig$ui_release.contains(semanticsProperties.getTestTag()) && bundle != null && kotlin.jvm.internal.l0.g(str, ExtraDataTestTagKey)) {
                String str2 = (String) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getTestTag());
                if (str2 != null) {
                    accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
            if (kotlin.jvm.internal.l0.g(str, ExtraDataIdKey)) {
                accessibilityNodeInfo.getExtras().putInt(str, semanticsNode.getId());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.graphics.Rect boundsInScreen(SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds) {
        android.graphics.Rect adjustedBounds = semanticsNodeWithAdjustedBounds.getAdjustedBounds();
        long mo4954localToScreenMKHz9U = this.view.mo4954localToScreenMKHz9U(OffsetKt.Offset(adjustedBounds.left, adjustedBounds.top));
        long mo4954localToScreenMKHz9U2 = this.view.mo4954localToScreenMKHz9U(OffsetKt.Offset(adjustedBounds.right, adjustedBounds.bottom));
        return new android.graphics.Rect((int) Math.floor(Offset.m3493getXimpl(mo4954localToScreenMKHz9U)), (int) Math.floor(Offset.m3494getYimpl(mo4954localToScreenMKHz9U)), (int) Math.ceil(Offset.m3493getXimpl(mo4954localToScreenMKHz9U2)), (int) Math.ceil(Offset.m3494getYimpl(mo4954localToScreenMKHz9U2)));
    }

    private final void bufferContentCaptureViewAppeared(int i5, ViewStructureCompat viewStructureCompat) {
        if (viewStructureCompat == null) {
            return;
        }
        if (this.bufferedContentCaptureDisappearedNodes.contains(Integer.valueOf(i5))) {
            this.bufferedContentCaptureDisappearedNodes.remove(Integer.valueOf(i5));
        } else {
            this.bufferedContentCaptureAppearedNodes.put(Integer.valueOf(i5), viewStructureCompat);
        }
    }

    private final void bufferContentCaptureViewDisappeared(int i5) {
        if (this.bufferedContentCaptureAppearedNodes.containsKey(Integer.valueOf(i5))) {
            this.bufferedContentCaptureAppearedNodes.remove(Integer.valueOf(i5));
        } else {
            this.bufferedContentCaptureDisappearedNodes.add(Integer.valueOf(i5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:15:0x003c->B:25:?, LOOP_END, SYNTHETIC] */
    /* renamed from: canScroll-moWRBKg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean m5289canScrollmoWRBKg(java.util.Collection<androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds> r6, boolean r7, int r8, long r9) {
        /*
            r5 = this;
            androidx.compose.ui.geometry.Offset$Companion r0 = androidx.compose.ui.geometry.Offset.Companion
            long r0 = r0.m3508getUnspecifiedF1C5BW0()
            boolean r0 = androidx.compose.ui.geometry.Offset.m3490equalsimpl0(r9, r0)
            r1 = 0
            if (r0 != 0) goto Lbc
            boolean r0 = androidx.compose.ui.geometry.Offset.m3496isValidimpl(r9)
            if (r0 != 0) goto L15
            goto Lbc
        L15:
            r0 = 1
            if (r7 != r0) goto L1f
            androidx.compose.ui.semantics.SemanticsProperties r7 = androidx.compose.ui.semantics.SemanticsProperties.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r7 = r7.getVerticalScrollAxisRange()
            goto L27
        L1f:
            if (r7 != 0) goto Lb6
            androidx.compose.ui.semantics.SemanticsProperties r7 = androidx.compose.ui.semantics.SemanticsProperties.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r7 = r7.getHorizontalScrollAxisRange()
        L27:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r2 = r6 instanceof java.util.Collection
            if (r2 == 0) goto L38
            r2 = r6
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L38
            goto Lb5
        L38:
            java.util.Iterator r6 = r6.iterator()
        L3c:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto Lb5
            java.lang.Object r2 = r6.next()
            androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds r2 = (androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds) r2
            android.graphics.Rect r3 = r2.getAdjustedBounds()
            androidx.compose.ui.geometry.Rect r3 = androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(r3)
            boolean r3 = r3.m3519containsk4lQ0M(r9)
            if (r3 != 0) goto L58
        L56:
            r2 = r1
            goto Lb2
        L58:
            androidx.compose.ui.semantics.SemanticsNode r2 = r2.getSemanticsNode()
            androidx.compose.ui.semantics.SemanticsConfiguration r2 = r2.getConfig()
            java.lang.Object r2 = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r2, r7)
            androidx.compose.ui.semantics.ScrollAxisRange r2 = (androidx.compose.ui.semantics.ScrollAxisRange) r2
            if (r2 != 0) goto L69
            goto L56
        L69:
            boolean r3 = r2.getReverseScrolling()
            if (r3 == 0) goto L71
            int r3 = -r8
            goto L72
        L71:
            r3 = r8
        L72:
            if (r8 != 0) goto L7b
            boolean r4 = r2.getReverseScrolling()
            if (r4 == 0) goto L7b
            r3 = -1
        L7b:
            if (r3 >= 0) goto L91
            v3.a r2 = r2.getValue()
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L56
            goto Lb1
        L91:
            v3.a r3 = r2.getValue()
            java.lang.Object r3 = r3.invoke()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            v3.a r2 = r2.getMaxValue()
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 >= 0) goto L56
        Lb1:
            r2 = r0
        Lb2:
            if (r2 == 0) goto L3c
            r1 = r0
        Lb5:
            return r1
        Lb6:
            kotlin.j0 r6 = new kotlin.j0
            r6.<init>()
            throw r6
        Lbc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.m5289canScrollmoWRBKg(java.util.Collection, boolean, int, long):boolean");
    }

    private final void checkForSemanticsChanges() {
        if (isEnabledForAccessibility$ui_release()) {
            sendAccessibilitySemanticsStructureChangeEvents(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), this.previousSemanticsRoot);
        }
        if (isEnabledForContentCapture()) {
            sendContentCaptureSemanticsStructureChangeEvents(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), this.previousSemanticsRoot);
        }
        sendSemanticsPropertyChangeEvents(getCurrentSemanticsNodes());
        updateSemanticsNodesCopyAndPanes();
    }

    private final boolean clearAccessibilityFocus(int i5) {
        if (isAccessibilityFocused(i5)) {
            this.focusedVirtualViewId = Integer.MIN_VALUE;
            this.currentlyFocusedANI = null;
            this.view.invalidate();
            sendEventForVirtualView$default(this, i5, 65536, null, null, 12, null);
            return true;
        }
        return false;
    }

    private final void clearTranslatedText() {
        AccessibilityAction accessibilityAction;
        v3.a aVar;
        Iterator<SemanticsNodeWithAdjustedBounds> it = getCurrentSemanticsNodes().values().iterator();
        while (it.hasNext()) {
            SemanticsConfiguration unmergedConfig$ui_release = it.next().getSemanticsNode().getUnmergedConfig$ui_release();
            if (SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()) != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getClearTextSubstitution())) != null && (aVar = (v3.a) accessibilityAction.getAction()) != null) {
            }
        }
    }

    @VisibleForTesting
    private final AccessibilityEvent createEvent(int i5, int i6) {
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i6);
        obtain.setEnabled(true);
        obtain.setClassName(ClassName);
        obtain.setPackageName(this.view.getContext().getPackageName());
        obtain.setSource(this.view, i5);
        if (isEnabledForAccessibility$ui_release() && (semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(Integer.valueOf(i5))) != null) {
            obtain.setPassword(semanticsNodeWithAdjustedBounds.getSemanticsNode().getConfig().contains(SemanticsProperties.INSTANCE.getPassword()));
        }
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final AccessibilityNodeInfo createNodeInfo(int i5) {
        Lifecycle.State state;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        AndroidComposeView.ViewTreeOwners viewTreeOwners = this.view.getViewTreeOwners();
        Integer num = null;
        View view = null;
        if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            state = lifecycle.getCurrentState();
        } else {
            state = null;
        }
        if (state == Lifecycle.State.DESTROYED) {
            return null;
        }
        AccessibilityNodeInfoCompat obtain = AccessibilityNodeInfoCompat.obtain();
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(Integer.valueOf(i5));
        if (semanticsNodeWithAdjustedBounds == null) {
            return null;
        }
        SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode();
        int i6 = -1;
        if (i5 == -1) {
            ViewParent parentForAccessibility = ViewCompat.getParentForAccessibility(this.view);
            if (parentForAccessibility instanceof View) {
                view = (View) parentForAccessibility;
            }
            obtain.setParent(view);
        } else {
            SemanticsNode parent = semanticsNode.getParent();
            if (parent != null) {
                num = Integer.valueOf(parent.getId());
            }
            if (num != null) {
                int intValue = num.intValue();
                if (intValue != this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) {
                    i6 = intValue;
                }
                obtain.setParent(this.view, i6);
            } else {
                throw new IllegalStateException(("semanticsNode " + i5 + " has null parent").toString());
            }
        }
        obtain.setSource(this.view, i5);
        obtain.setBoundsInScreen(boundsInScreen(semanticsNodeWithAdjustedBounds));
        populateAccessibilityNodeInfoProperties(i5, obtain, semanticsNode);
        return obtain.unwrap();
    }

    private final AccessibilityEvent createTextSelectionChangedEvent(int i5, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent createEvent = createEvent(i5, 8192);
        if (num != null) {
            createEvent.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            createEvent.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            createEvent.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            createEvent.getText().add(charSequence);
        }
        return createEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enabledStateListener$lambda$0(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z4) {
        List<AccessibilityServiceInfo> E;
        if (z4) {
            E = androidComposeViewAccessibilityDelegateCompat.accessibilityManager.getEnabledAccessibilityServiceList(-1);
        } else {
            E = kotlin.collections.w.E();
        }
        androidComposeViewAccessibilityDelegateCompat.enabledServices = E;
    }

    private final void geometryDepthFirstSearch(SemanticsNode semanticsNode, ArrayList<SemanticsNode> arrayList, Map<Integer, List<SemanticsNode>> map) {
        boolean z4;
        List<SemanticsNode> V5;
        if (semanticsNode.getLayoutInfo().getLayoutDirection() == LayoutDirection.Rtl) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean booleanValue = ((Boolean) semanticsNode.getConfig().getOrElse(SemanticsProperties.INSTANCE.getIsTraversalGroup(), AndroidComposeViewAccessibilityDelegateCompat_androidKt$isTraversalGroup$1.INSTANCE)).booleanValue();
        if ((booleanValue || isScreenReaderFocusable(semanticsNode)) && getCurrentSemanticsNodes().keySet().contains(Integer.valueOf(semanticsNode.getId()))) {
            arrayList.add(semanticsNode);
        }
        if (booleanValue) {
            Integer valueOf = Integer.valueOf(semanticsNode.getId());
            V5 = kotlin.collections.e0.V5(semanticsNode.getChildren());
            map.put(valueOf, subtreeSortedByGeometryGrouping(z4, V5));
        } else {
            List<SemanticsNode> children = semanticsNode.getChildren();
            int size = children.size();
            for (int i5 = 0; i5 < size; i5++) {
                geometryDepthFirstSearch(children.get(i5), arrayList, map);
            }
        }
    }

    private final int getAccessibilitySelectionEnd(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (!unmergedConfig$ui_release.contains(semanticsProperties.getContentDescription()) && semanticsNode.getUnmergedConfig$ui_release().contains(semanticsProperties.getTextSelectionRange())) {
            return TextRange.m5540getEndimpl(((TextRange) semanticsNode.getUnmergedConfig$ui_release().get(semanticsProperties.getTextSelectionRange())).m5549unboximpl());
        }
        return this.accessibilityCursorPosition;
    }

    private final int getAccessibilitySelectionStart(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (!unmergedConfig$ui_release.contains(semanticsProperties.getContentDescription()) && semanticsNode.getUnmergedConfig$ui_release().contains(semanticsProperties.getTextSelectionRange())) {
            return TextRange.m5545getStartimpl(((TextRange) semanticsNode.getUnmergedConfig$ui_release().get(semanticsProperties.getTextSelectionRange())).m5549unboximpl());
        }
        return this.accessibilityCursorPosition;
    }

    @VisibleForTesting
    public static /* synthetic */ void getContentCaptureForceEnabledForTesting$ui_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getContentCaptureSession$ui_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContentCaptureSessionCompat getContentCaptureSessionCompat(View view) {
        ViewCompatShims.setImportantForContentCapture(view, 1);
        return ViewCompatShims.getContentCaptureSession(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<Integer, SemanticsNodeWithAdjustedBounds> getCurrentSemanticsNodes() {
        Map<Integer, SemanticsNodeWithAdjustedBounds> allUncoveredSemanticsNodesToMap;
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            allUncoveredSemanticsNodesToMap = AndroidComposeViewAccessibilityDelegateCompat_androidKt.getAllUncoveredSemanticsNodesToMap(this.view.getSemanticsOwner());
            this.currentSemanticsNodes = allUncoveredSemanticsNodesToMap;
            if (isEnabledForAccessibility$ui_release()) {
                setTraversalValues();
            }
        }
        return this.currentSemanticsNodes;
    }

    @VisibleForTesting
    public static /* synthetic */ void getHoveredVirtualViewId$ui_release$annotations() {
    }

    private final boolean getInfoIsCheckable(SemanticsNode semanticsNode) {
        boolean z4;
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getToggleableState());
        Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getRole());
        boolean z5 = true;
        boolean z6 = false;
        if (toggleableState != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getSelected());
        if (bool != null) {
            bool.booleanValue();
            int m5379getTabo7Vup1c = Role.Companion.m5379getTabo7Vup1c();
            if (role != null) {
                z6 = Role.m5369equalsimpl0(role.m5372unboximpl(), m5379getTabo7Vup1c);
            }
            if (z6) {
                z5 = z4;
            }
            return z5;
        }
        return z4;
    }

    private final String getInfoStateDescriptionOrNull(SemanticsNode semanticsNode) {
        Object string;
        boolean z4;
        float current;
        float H;
        boolean z5;
        boolean z6;
        int i5;
        int L0;
        boolean m5369equalsimpl0;
        boolean m5369equalsimpl02;
        boolean m5369equalsimpl03;
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        Object orNull = SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getStateDescription());
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getToggleableState());
        Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getRole());
        if (toggleableState != null) {
            int i6 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 == 3 && orNull == null) {
                        orNull = this.view.getContext().getResources().getString(R.string.indeterminate);
                    }
                } else {
                    int m5378getSwitcho7Vup1c = Role.Companion.m5378getSwitcho7Vup1c();
                    if (role == null) {
                        m5369equalsimpl03 = false;
                    } else {
                        m5369equalsimpl03 = Role.m5369equalsimpl0(role.m5372unboximpl(), m5378getSwitcho7Vup1c);
                    }
                    if (m5369equalsimpl03 && orNull == null) {
                        orNull = this.view.getContext().getResources().getString(R.string.off);
                    }
                }
            } else {
                int m5378getSwitcho7Vup1c2 = Role.Companion.m5378getSwitcho7Vup1c();
                if (role == null) {
                    m5369equalsimpl02 = false;
                } else {
                    m5369equalsimpl02 = Role.m5369equalsimpl0(role.m5372unboximpl(), m5378getSwitcho7Vup1c2);
                }
                if (m5369equalsimpl02 && orNull == null) {
                    orNull = this.view.getContext().getResources().getString(R.string.on);
                }
            }
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getSelected());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            int m5379getTabo7Vup1c = Role.Companion.m5379getTabo7Vup1c();
            if (role == null) {
                m5369equalsimpl0 = false;
            } else {
                m5369equalsimpl0 = Role.m5369equalsimpl0(role.m5372unboximpl(), m5379getTabo7Vup1c);
            }
            if (!m5369equalsimpl0 && orNull == null) {
                if (booleanValue) {
                    orNull = this.view.getContext().getResources().getString(R.string.selected);
                } else {
                    orNull = this.view.getContext().getResources().getString(R.string.not_selected);
                }
            }
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getProgressBarRangeInfo());
        if (progressBarRangeInfo != null) {
            if (progressBarRangeInfo != ProgressBarRangeInfo.Companion.getIndeterminate()) {
                if (orNull == null) {
                    kotlin.ranges.f<Float> range = progressBarRangeInfo.getRange();
                    if (range.getEndInclusive().floatValue() - range.getStart().floatValue() == 0.0f) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        current = 0.0f;
                    } else {
                        current = (progressBarRangeInfo.getCurrent() - range.getStart().floatValue()) / (range.getEndInclusive().floatValue() - range.getStart().floatValue());
                    }
                    H = kotlin.ranges.u.H(current, 0.0f, 1.0f);
                    if (H == 0.0f) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        i5 = 0;
                    } else {
                        if (H == 1.0f) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        i5 = 100;
                        if (!z6) {
                            L0 = kotlin.math.d.L0(H * 100);
                            i5 = kotlin.ranges.u.I(L0, 1, 99);
                        }
                    }
                    string = this.view.getContext().getResources().getString(R.string.template_percent, Integer.valueOf(i5));
                    orNull = string;
                }
            } else if (orNull == null) {
                string = this.view.getContext().getResources().getString(R.string.in_progress);
                orNull = string;
            }
        }
        return (String) orNull;
    }

    private final SpannableString getInfoText(SemanticsNode semanticsNode) {
        SpannableString spannableString;
        Object D2;
        FontFamily.Resolver fontFamilyResolver = this.view.getFontFamilyResolver();
        AnnotatedString textForTextField = getTextForTextField(semanticsNode.getUnmergedConfig$ui_release());
        SpannableString spannableString2 = null;
        if (textForTextField != null) {
            spannableString = AndroidAccessibilitySpannableString_androidKt.toAccessibilitySpannableString(textForTextField, this.view.getDensity(), fontFamilyResolver, this.urlSpanCache);
        } else {
            spannableString = null;
        }
        SpannableString spannableString3 = (SpannableString) trimToSize(spannableString, 100000);
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getText());
        if (list != null) {
            D2 = kotlin.collections.e0.D2(list);
            AnnotatedString annotatedString = (AnnotatedString) D2;
            if (annotatedString != null) {
                spannableString2 = AndroidAccessibilitySpannableString_androidKt.toAccessibilitySpannableString(annotatedString, this.view.getDensity(), fontFamilyResolver, this.urlSpanCache);
            }
        }
        SpannableString spannableString4 = (SpannableString) trimToSize(spannableString2, 100000);
        if (spannableString3 == null) {
            return spannableString4;
        }
        return spannableString3;
    }

    private final String getIterableTextForAccessibility(SemanticsNode semanticsNode) {
        Object D2;
        if (semanticsNode == null) {
            return null;
        }
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui_release.contains(semanticsProperties.getContentDescription())) {
            return ListUtilsKt.fastJoinToString$default((List) semanticsNode.getUnmergedConfig$ui_release().get(semanticsProperties.getContentDescription()), ",", null, null, 0, null, null, 62, null);
        }
        if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getSetText())) {
            AnnotatedString textForTextField = getTextForTextField(semanticsNode.getUnmergedConfig$ui_release());
            if (textForTextField == null) {
                return null;
            }
            return textForTextField.getText();
        }
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getText());
        if (list == null) {
            return null;
        }
        D2 = kotlin.collections.e0.D2(list);
        AnnotatedString annotatedString = (AnnotatedString) D2;
        if (annotatedString == null) {
            return null;
        }
        return annotatedString.getText();
    }

    private final AccessibilityIterators.TextSegmentIterator getIteratorForGranularity(SemanticsNode semanticsNode, int i5) {
        boolean z4;
        TextLayoutResult textLayoutResult;
        if (semanticsNode == null) {
            return null;
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        if (iterableTextForAccessibility != null && iterableTextForAccessibility.length() != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4) {
            return null;
        }
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 4) {
                    if (i5 != 8) {
                        if (i5 != 16) {
                            return null;
                        }
                    } else {
                        AccessibilityIterators.ParagraphTextSegmentIterator companion = AccessibilityIterators.ParagraphTextSegmentIterator.Companion.getInstance();
                        companion.initialize(iterableTextForAccessibility);
                        return companion;
                    }
                }
                if (!semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult()) || (textLayoutResult = getTextLayoutResult(semanticsNode.getUnmergedConfig$ui_release())) == null) {
                    return null;
                }
                if (i5 == 4) {
                    AccessibilityIterators.LineTextSegmentIterator companion2 = AccessibilityIterators.LineTextSegmentIterator.Companion.getInstance();
                    companion2.initialize(iterableTextForAccessibility, textLayoutResult);
                    return companion2;
                }
                AccessibilityIterators.PageTextSegmentIterator companion3 = AccessibilityIterators.PageTextSegmentIterator.Companion.getInstance();
                companion3.initialize(iterableTextForAccessibility, textLayoutResult, semanticsNode);
                return companion3;
            }
            AccessibilityIterators.WordTextSegmentIterator companion4 = AccessibilityIterators.WordTextSegmentIterator.Companion.getInstance(this.view.getContext().getResources().getConfiguration().locale);
            companion4.initialize(iterableTextForAccessibility);
            return companion4;
        }
        AccessibilityIterators.CharacterTextSegmentIterator companion5 = AccessibilityIterators.CharacterTextSegmentIterator.Companion.getInstance(this.view.getContext().getResources().getConfiguration().locale);
        companion5.initialize(iterableTextForAccessibility);
        return companion5;
    }

    @VisibleForTesting
    public static /* synthetic */ void getOnSendAccessibilityEvent$ui_release$annotations() {
    }

    private final AnnotatedString getTextForTextField(SemanticsConfiguration semanticsConfiguration) {
        return (AnnotatedString) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getEditableText());
    }

    private final TextLayoutResult getTextLayoutResult(SemanticsConfiguration semanticsConfiguration) {
        v3.l lVar;
        ArrayList arrayList = new ArrayList();
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsActions.INSTANCE.getGetTextLayoutResult());
        if (accessibilityAction == null || (lVar = (v3.l) accessibilityAction.getAction()) == null || !((Boolean) lVar.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (TextLayoutResult) arrayList.get(0);
    }

    private final void hideTranslatedText() {
        AccessibilityAction accessibilityAction;
        v3.l lVar;
        Iterator<SemanticsNodeWithAdjustedBounds> it = getCurrentSemanticsNodes().values().iterator();
        while (it.hasNext()) {
            SemanticsConfiguration unmergedConfig$ui_release = it.next().getSemanticsNode().getUnmergedConfig$ui_release();
            if (kotlin.jvm.internal.l0.g(SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()), Boolean.TRUE) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getShowTextSubstitution())) != null && (lVar = (v3.l) accessibilityAction.getAction()) != null) {
            }
        }
    }

    private final void initContentCapture(boolean z4) {
        if (z4) {
            updateContentCaptureBuffersOnAppeared(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode());
        } else {
            updateContentCaptureBuffersOnDisappeared(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode());
        }
        notifyContentCaptureChanges();
    }

    private final boolean isAccessibilityFocused(int i5) {
        return this.focusedVirtualViewId == i5;
    }

    private final boolean isAccessibilitySelectionExtendable(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (!unmergedConfig$ui_release.contains(semanticsProperties.getContentDescription()) && semanticsNode.getUnmergedConfig$ui_release().contains(semanticsProperties.getEditableText())) {
            return true;
        }
        return false;
    }

    private final boolean isEnabled() {
        return isEnabledForAccessibility$ui_release() || isEnabledForContentCapture();
    }

    private final boolean isEnabledForContentCapture() {
        if (!AndroidComposeViewAccessibilityDelegateCompat_androidKt.getDisableContentCapture() && (this.contentCaptureSession != null || this.contentCaptureForceEnabledForTesting)) {
            return true;
        }
        return false;
    }

    private static /* synthetic */ void isEnabledForContentCapture$annotations() {
    }

    private final boolean isScreenReaderFocusable(SemanticsNode semanticsNode) {
        String infoContentDescriptionOrNull;
        boolean z4;
        infoContentDescriptionOrNull = AndroidComposeViewAccessibilityDelegateCompat_androidKt.getInfoContentDescriptionOrNull(semanticsNode);
        if (infoContentDescriptionOrNull == null && getInfoText(semanticsNode) == null && getInfoStateDescriptionOrNull(semanticsNode) == null && !getInfoIsCheckable(semanticsNode)) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!semanticsNode.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants() && (!semanticsNode.isUnmergedLeafNode$ui_release() || !z4)) {
            return false;
        }
        return true;
    }

    private final boolean isTouchExplorationEnabled() {
        if (!this.accessibilityForceEnabledForTesting && (!this.accessibilityManager.isEnabled() || !this.accessibilityManager.isTouchExplorationEnabled())) {
            return false;
        }
        return true;
    }

    private final void notifyContentCaptureChanges() {
        List S5;
        long[] T5;
        List S52;
        ContentCaptureSessionCompat contentCaptureSessionCompat = this.contentCaptureSession;
        if (contentCaptureSessionCompat == null || Build.VERSION.SDK_INT < 29) {
            return;
        }
        if (!this.bufferedContentCaptureAppearedNodes.isEmpty()) {
            S52 = kotlin.collections.e0.S5(this.bufferedContentCaptureAppearedNodes.values());
            ArrayList arrayList = new ArrayList(S52.size());
            int size = S52.size();
            for (int i5 = 0; i5 < size; i5++) {
                arrayList.add(((ViewStructureCompat) S52.get(i5)).toViewStructure());
            }
            contentCaptureSessionCompat.notifyViewsAppeared(arrayList);
            this.bufferedContentCaptureAppearedNodes.clear();
        }
        if (!this.bufferedContentCaptureDisappearedNodes.isEmpty()) {
            S5 = kotlin.collections.e0.S5(this.bufferedContentCaptureDisappearedNodes);
            ArrayList arrayList2 = new ArrayList(S5.size());
            int size2 = S5.size();
            for (int i6 = 0; i6 < size2; i6++) {
                arrayList2.add(Long.valueOf(((Number) S5.get(i6)).intValue()));
            }
            T5 = kotlin.collections.e0.T5(arrayList2);
            contentCaptureSessionCompat.notifyViewsDisappeared(T5);
            this.bufferedContentCaptureDisappearedNodes.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifySubtreeAccessibilityStateChangedIfNeeded(LayoutNode layoutNode) {
        if (this.subtreeChangedLayoutNodes.add(layoutNode)) {
            this.boundsUpdateChannel.p(r2.f19517a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ad A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01cc  */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:125:0x01aa -> B:86:0x01ab). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean performActionHelper(int r18, int r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 1716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.performActionHelper(int, int, android.os.Bundle):boolean");
    }

    private static final boolean performActionHelper$canScroll(ScrollAxisRange scrollAxisRange, float f5) {
        return (f5 < 0.0f && scrollAxisRange.getValue().invoke().floatValue() > 0.0f) || (f5 > 0.0f && scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue());
    }

    private static final float performActionHelper$scrollDelta(float f5, float f6) {
        if (Math.signum(f5) == Math.signum(f6)) {
            return Math.abs(f5) < Math.abs(f6) ? f5 : f6;
        }
        return 0.0f;
    }

    private final void populateAccessibilityNodeInfoProperties(int i5, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, SemanticsNode semanticsNode) {
        boolean isImportantForAccessibility;
        String infoContentDescriptionOrNull;
        boolean enabled;
        boolean isVisible;
        boolean enabled2;
        boolean enabled3;
        List Ry;
        boolean enabled4;
        boolean enabled5;
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat;
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat2;
        boolean enabled6;
        float t5;
        float A;
        boolean excludeLineAndPageGranularities;
        boolean enabled7;
        boolean enabled8;
        boolean z4;
        String m5292toLegacyClassNameV4PA4sw;
        accessibilityNodeInfoCompat.setClassName(ClassName);
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        Role role = (Role) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getRole());
        if (role != null) {
            role.m5372unboximpl();
            if (semanticsNode.isFake$ui_release() || semanticsNode.getReplacedChildren$ui_release().isEmpty()) {
                Role.Companion companion = Role.Companion;
                if (Role.m5369equalsimpl0(role.m5372unboximpl(), companion.m5379getTabo7Vup1c())) {
                    accessibilityNodeInfoCompat.setRoleDescription(this.view.getContext().getResources().getString(R.string.tab));
                } else if (Role.m5369equalsimpl0(role.m5372unboximpl(), companion.m5378getSwitcho7Vup1c())) {
                    accessibilityNodeInfoCompat.setRoleDescription(this.view.getContext().getResources().getString(R.string.switch_role));
                } else {
                    m5292toLegacyClassNameV4PA4sw = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m5292toLegacyClassNameV4PA4sw(role.m5372unboximpl());
                    if (!Role.m5369equalsimpl0(role.m5372unboximpl(), companion.m5376getImageo7Vup1c()) || semanticsNode.isUnmergedLeafNode$ui_release() || semanticsNode.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants()) {
                        accessibilityNodeInfoCompat.setClassName(m5292toLegacyClassNameV4PA4sw);
                    }
                }
            }
            r2 r2Var = r2.f19517a;
        }
        if (semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getSetText())) {
            accessibilityNodeInfoCompat.setClassName(TextFieldClassName);
        }
        if (semanticsNode.getConfig().contains(semanticsProperties.getText())) {
            accessibilityNodeInfoCompat.setClassName(TextClassName);
        }
        accessibilityNodeInfoCompat.setPackageName(this.view.getContext().getPackageName());
        isImportantForAccessibility = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isImportantForAccessibility(semanticsNode);
        accessibilityNodeInfoCompat.setImportantForAccessibility(isImportantForAccessibility);
        List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i6 = 0; i6 < size; i6++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i6);
            if (getCurrentSemanticsNodes().containsKey(Integer.valueOf(semanticsNode2.getId()))) {
                AndroidViewHolder androidViewHolder = this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(semanticsNode2.getLayoutNode$ui_release());
                if (androidViewHolder != null) {
                    accessibilityNodeInfoCompat.addChild(androidViewHolder);
                } else if (semanticsNode2.getId() != -1) {
                    accessibilityNodeInfoCompat.addChild(this.view, semanticsNode2.getId());
                }
            }
        }
        if (i5 == this.focusedVirtualViewId) {
            accessibilityNodeInfoCompat.setAccessibilityFocused(true);
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
        } else {
            accessibilityNodeInfoCompat.setAccessibilityFocused(false);
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_ACCESSIBILITY_FOCUS);
        }
        setText(semanticsNode, accessibilityNodeInfoCompat);
        setContentInvalid(semanticsNode, accessibilityNodeInfoCompat);
        setStateDescription(semanticsNode, accessibilityNodeInfoCompat);
        setIsCheckable(semanticsNode, accessibilityNodeInfoCompat);
        SemanticsConfiguration unmergedConfig$ui_release2 = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties2 = SemanticsProperties.INSTANCE;
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release2, semanticsProperties2.getToggleableState());
        if (toggleableState != null) {
            if (toggleableState == ToggleableState.On) {
                accessibilityNodeInfoCompat.setChecked(true);
            } else if (toggleableState == ToggleableState.Off) {
                accessibilityNodeInfoCompat.setChecked(false);
            }
            r2 r2Var2 = r2.f19517a;
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties2.getSelected());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (role == null ? false : Role.m5369equalsimpl0(role.m5372unboximpl(), Role.Companion.m5379getTabo7Vup1c())) {
                accessibilityNodeInfoCompat.setSelected(booleanValue);
            } else {
                accessibilityNodeInfoCompat.setChecked(booleanValue);
            }
            r2 r2Var3 = r2.f19517a;
        }
        if (!semanticsNode.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants() || semanticsNode.getReplacedChildren$ui_release().isEmpty()) {
            infoContentDescriptionOrNull = AndroidComposeViewAccessibilityDelegateCompat_androidKt.getInfoContentDescriptionOrNull(semanticsNode);
            accessibilityNodeInfoCompat.setContentDescription(infoContentDescriptionOrNull);
        }
        String str = (String) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties2.getTestTag());
        if (str != null) {
            SemanticsNode semanticsNode3 = semanticsNode;
            while (true) {
                if (semanticsNode3 == null) {
                    z4 = false;
                    break;
                }
                SemanticsConfiguration unmergedConfig$ui_release3 = semanticsNode3.getUnmergedConfig$ui_release();
                SemanticsPropertiesAndroid semanticsPropertiesAndroid = SemanticsPropertiesAndroid.INSTANCE;
                if (unmergedConfig$ui_release3.contains(semanticsPropertiesAndroid.getTestTagsAsResourceId())) {
                    z4 = ((Boolean) semanticsNode3.getUnmergedConfig$ui_release().get(semanticsPropertiesAndroid.getTestTagsAsResourceId())).booleanValue();
                    break;
                }
                semanticsNode3 = semanticsNode3.getParent();
            }
            if (z4) {
                accessibilityNodeInfoCompat.setViewIdResourceName(str);
            }
        }
        SemanticsConfiguration unmergedConfig$ui_release4 = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties3 = SemanticsProperties.INSTANCE;
        if (((r2) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release4, semanticsProperties3.getHeading())) != null) {
            accessibilityNodeInfoCompat.setHeading(true);
            r2 r2Var4 = r2.f19517a;
        }
        accessibilityNodeInfoCompat.setPassword(semanticsNode.getConfig().contains(semanticsProperties3.getPassword()));
        SemanticsConfiguration unmergedConfig$ui_release5 = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        accessibilityNodeInfoCompat.setEditable(unmergedConfig$ui_release5.contains(semanticsActions.getSetText()));
        enabled = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
        accessibilityNodeInfoCompat.setEnabled(enabled);
        accessibilityNodeInfoCompat.setFocusable(semanticsNode.getUnmergedConfig$ui_release().contains(semanticsProperties3.getFocused()));
        if (accessibilityNodeInfoCompat.isFocusable()) {
            accessibilityNodeInfoCompat.setFocused(((Boolean) semanticsNode.getUnmergedConfig$ui_release().get(semanticsProperties3.getFocused())).booleanValue());
            if (accessibilityNodeInfoCompat.isFocused()) {
                accessibilityNodeInfoCompat.addAction(2);
            } else {
                accessibilityNodeInfoCompat.addAction(1);
            }
        }
        isVisible = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isVisible(semanticsNode);
        accessibilityNodeInfoCompat.setVisibleToUser(isVisible);
        LiveRegionMode liveRegionMode = (LiveRegionMode) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getLiveRegion());
        if (liveRegionMode != null) {
            int m5363unboximpl = liveRegionMode.m5363unboximpl();
            LiveRegionMode.Companion companion2 = LiveRegionMode.Companion;
            accessibilityNodeInfoCompat.setLiveRegion((LiveRegionMode.m5360equalsimpl0(m5363unboximpl, companion2.m5365getPolite0phEisY()) || !LiveRegionMode.m5360equalsimpl0(m5363unboximpl, companion2.m5364getAssertive0phEisY())) ? 1 : 2);
            r2 r2Var5 = r2.f19517a;
        }
        accessibilityNodeInfoCompat.setClickable(false);
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getOnClick());
        if (accessibilityAction != null) {
            boolean g5 = kotlin.jvm.internal.l0.g(SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getSelected()), Boolean.TRUE);
            accessibilityNodeInfoCompat.setClickable(!g5);
            enabled8 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled8 && !g5) {
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, accessibilityAction.getLabel()));
            }
            r2 r2Var6 = r2.f19517a;
        }
        accessibilityNodeInfoCompat.setLongClickable(false);
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getOnLongClick());
        if (accessibilityAction2 != null) {
            accessibilityNodeInfoCompat.setLongClickable(true);
            enabled7 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled7) {
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(32, accessibilityAction2.getLabel()));
            }
            r2 r2Var7 = r2.f19517a;
        }
        AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getCopyText());
        if (accessibilityAction3 != null) {
            accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16384, accessibilityAction3.getLabel()));
            r2 r2Var8 = r2.f19517a;
        }
        enabled2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
        if (enabled2) {
            AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getSetText());
            if (accessibilityAction4 != null) {
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(2097152, accessibilityAction4.getLabel()));
                r2 r2Var9 = r2.f19517a;
            }
            AccessibilityAction accessibilityAction5 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getOnImeAction());
            if (accessibilityAction5 != null) {
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionImeEnter, accessibilityAction5.getLabel()));
                r2 r2Var10 = r2.f19517a;
            }
            AccessibilityAction accessibilityAction6 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getCutText());
            if (accessibilityAction6 != null) {
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(65536, accessibilityAction6.getLabel()));
                r2 r2Var11 = r2.f19517a;
            }
            AccessibilityAction accessibilityAction7 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getPasteText());
            if (accessibilityAction7 != null) {
                if (accessibilityNodeInfoCompat.isFocused() && this.view.getClipboardManager().hasText()) {
                    accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(32768, accessibilityAction7.getLabel()));
                }
                r2 r2Var12 = r2.f19517a;
            }
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        if (!(iterableTextForAccessibility == null || iterableTextForAccessibility.length() == 0)) {
            accessibilityNodeInfoCompat.setTextSelection(getAccessibilitySelectionStart(semanticsNode), getAccessibilitySelectionEnd(semanticsNode));
            AccessibilityAction accessibilityAction8 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getSetSelection());
            accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(131072, accessibilityAction8 != null ? accessibilityAction8.getLabel() : null));
            accessibilityNodeInfoCompat.addAction(256);
            accessibilityNodeInfoCompat.addAction(512);
            accessibilityNodeInfoCompat.setMovementGranularities(11);
            List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getContentDescription());
            if ((list == null || list.isEmpty()) && semanticsNode.getUnmergedConfig$ui_release().contains(semanticsActions.getGetTextLayoutResult())) {
                excludeLineAndPageGranularities = AndroidComposeViewAccessibilityDelegateCompat_androidKt.excludeLineAndPageGranularities(semanticsNode);
                if (!excludeLineAndPageGranularities) {
                    accessibilityNodeInfoCompat.setMovementGranularities(accessibilityNodeInfoCompat.getMovementGranularities() | 4 | 16);
                }
            }
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ExtraDataIdKey);
            CharSequence text = accessibilityNodeInfoCompat.getText();
            if (!(text == null || text.length() == 0) && semanticsNode.getUnmergedConfig$ui_release().contains(semanticsActions.getGetTextLayoutResult())) {
                arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
            }
            if (semanticsNode.getUnmergedConfig$ui_release().contains(semanticsProperties3.getTestTag())) {
                arrayList.add(ExtraDataTestTagKey);
            }
            AccessibilityNodeInfoVerificationHelperMethods.INSTANCE.setAvailableExtraData(accessibilityNodeInfoCompat.unwrap(), arrayList);
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getProgressBarRangeInfo());
        if (progressBarRangeInfo != null) {
            if (semanticsNode.getUnmergedConfig$ui_release().contains(semanticsActions.getSetProgress())) {
                accessibilityNodeInfoCompat.setClassName("android.widget.SeekBar");
            } else {
                accessibilityNodeInfoCompat.setClassName("android.widget.ProgressBar");
            }
            if (progressBarRangeInfo != ProgressBarRangeInfo.Companion.getIndeterminate()) {
                accessibilityNodeInfoCompat.setRangeInfo(AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(1, progressBarRangeInfo.getRange().getStart().floatValue(), progressBarRangeInfo.getRange().getEndInclusive().floatValue(), progressBarRangeInfo.getCurrent()));
            }
            if (semanticsNode.getUnmergedConfig$ui_release().contains(semanticsActions.getSetProgress())) {
                enabled6 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
                if (enabled6) {
                    float current = progressBarRangeInfo.getCurrent();
                    t5 = kotlin.ranges.u.t(progressBarRangeInfo.getRange().getEndInclusive().floatValue(), progressBarRangeInfo.getRange().getStart().floatValue());
                    if (current < t5) {
                        accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    }
                    float current2 = progressBarRangeInfo.getCurrent();
                    A = kotlin.ranges.u.A(progressBarRangeInfo.getRange().getStart().floatValue(), progressBarRangeInfo.getRange().getEndInclusive().floatValue());
                    if (current2 > A) {
                        accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    }
                }
            }
        }
        Api24Impl.addSetProgressAction(accessibilityNodeInfoCompat, semanticsNode);
        CollectionInfo_androidKt.setCollectionInfo(semanticsNode, accessibilityNodeInfoCompat);
        CollectionInfo_androidKt.setCollectionItemInfo(semanticsNode, accessibilityNodeInfoCompat);
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getHorizontalScrollAxisRange());
        AccessibilityAction accessibilityAction9 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getScrollBy());
        if (scrollAxisRange != null && accessibilityAction9 != null) {
            if (!CollectionInfo_androidKt.hasCollectionInfo(semanticsNode)) {
                accessibilityNodeInfoCompat.setClassName("android.widget.HorizontalScrollView");
            }
            if (scrollAxisRange.getMaxValue().invoke().floatValue() > 0.0f) {
                accessibilityNodeInfoCompat.setScrollable(true);
            }
            enabled5 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled5) {
                if (populateAccessibilityNodeInfoProperties$canScrollForward(scrollAxisRange)) {
                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    if (!(semanticsNode.getLayoutInfo().getLayoutDirection() == LayoutDirection.Rtl)) {
                        accessibilityActionCompat2 = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT;
                    } else {
                        accessibilityActionCompat2 = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT;
                    }
                    accessibilityNodeInfoCompat.addAction(accessibilityActionCompat2);
                }
                if (populateAccessibilityNodeInfoProperties$canScrollBackward(scrollAxisRange)) {
                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    if (!(semanticsNode.getLayoutInfo().getLayoutDirection() == LayoutDirection.Rtl)) {
                        accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT;
                    } else {
                        accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT;
                    }
                    accessibilityNodeInfoCompat.addAction(accessibilityActionCompat);
                }
            }
        }
        ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getVerticalScrollAxisRange());
        if (scrollAxisRange2 != null && accessibilityAction9 != null) {
            if (!CollectionInfo_androidKt.hasCollectionInfo(semanticsNode)) {
                accessibilityNodeInfoCompat.setClassName("android.widget.ScrollView");
            }
            if (scrollAxisRange2.getMaxValue().invoke().floatValue() > 0.0f) {
                accessibilityNodeInfoCompat.setScrollable(true);
            }
            enabled4 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled4) {
                if (populateAccessibilityNodeInfoProperties$canScrollForward(scrollAxisRange2)) {
                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_DOWN);
                }
                if (populateAccessibilityNodeInfoProperties$canScrollBackward(scrollAxisRange2)) {
                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_UP);
                }
            }
        }
        if (i7 >= 29) {
            Api29Impl.addPageActions(accessibilityNodeInfoCompat, semanticsNode);
        }
        accessibilityNodeInfoCompat.setPaneTitle((CharSequence) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties3.getPaneTitle()));
        enabled3 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
        if (enabled3) {
            AccessibilityAction accessibilityAction10 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getExpand());
            if (accessibilityAction10 != null) {
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(262144, accessibilityAction10.getLabel()));
                r2 r2Var13 = r2.f19517a;
            }
            AccessibilityAction accessibilityAction11 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getCollapse());
            if (accessibilityAction11 != null) {
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(524288, accessibilityAction11.getLabel()));
                r2 r2Var14 = r2.f19517a;
            }
            AccessibilityAction accessibilityAction12 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsActions.getDismiss());
            if (accessibilityAction12 != null) {
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(1048576, accessibilityAction12.getLabel()));
                r2 r2Var15 = r2.f19517a;
            }
            if (semanticsNode.getUnmergedConfig$ui_release().contains(semanticsActions.getCustomActions())) {
                List list2 = (List) semanticsNode.getUnmergedConfig$ui_release().get(semanticsActions.getCustomActions());
                int size2 = list2.size();
                int[] iArr = AccessibilityActionsResourceIds;
                if (size2 < iArr.length) {
                    SparseArrayCompat<CharSequence> sparseArrayCompat = new SparseArrayCompat<>(0, 1, null);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (this.labelToActionId.containsKey(i5)) {
                        Map<CharSequence, Integer> map = this.labelToActionId.get(i5);
                        Ry = kotlin.collections.p.Ry(iArr);
                        ArrayList arrayList2 = new ArrayList();
                        int size3 = list2.size();
                        for (int i8 = 0; i8 < size3; i8++) {
                            CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) list2.get(i8);
                            kotlin.jvm.internal.l0.m(map);
                            if (map.containsKey(customAccessibilityAction.getLabel())) {
                                Integer num = map.get(customAccessibilityAction.getLabel());
                                kotlin.jvm.internal.l0.m(num);
                                sparseArrayCompat.put(num.intValue(), customAccessibilityAction.getLabel());
                                linkedHashMap.put(customAccessibilityAction.getLabel(), num);
                                Ry.remove(num);
                                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(num.intValue(), customAccessibilityAction.getLabel()));
                            } else {
                                arrayList2.add(customAccessibilityAction);
                            }
                        }
                        int size4 = arrayList2.size();
                        for (int i9 = 0; i9 < size4; i9++) {
                            CustomAccessibilityAction customAccessibilityAction2 = (CustomAccessibilityAction) arrayList2.get(i9);
                            int intValue = ((Number) Ry.get(i9)).intValue();
                            sparseArrayCompat.put(intValue, customAccessibilityAction2.getLabel());
                            linkedHashMap.put(customAccessibilityAction2.getLabel(), Integer.valueOf(intValue));
                            accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(intValue, customAccessibilityAction2.getLabel()));
                        }
                    } else {
                        int size5 = list2.size();
                        for (int i10 = 0; i10 < size5; i10++) {
                            CustomAccessibilityAction customAccessibilityAction3 = (CustomAccessibilityAction) list2.get(i10);
                            int i11 = AccessibilityActionsResourceIds[i10];
                            sparseArrayCompat.put(i11, customAccessibilityAction3.getLabel());
                            linkedHashMap.put(customAccessibilityAction3.getLabel(), Integer.valueOf(i11));
                            accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i11, customAccessibilityAction3.getLabel()));
                        }
                    }
                    this.actionIdToLabel.put(i5, sparseArrayCompat);
                    this.labelToActionId.put(i5, linkedHashMap);
                } else {
                    throw new IllegalStateException("Can't have more than " + iArr.length + " custom actions for one widget");
                }
            }
        }
        accessibilityNodeInfoCompat.setScreenReaderFocusable(isScreenReaderFocusable(semanticsNode));
        Integer num2 = this.idToBeforeMap.get(Integer.valueOf(i5));
        if (num2 != null) {
            num2.intValue();
            View semanticsIdToView = AndroidComposeViewAccessibilityDelegateCompat_androidKt.semanticsIdToView(this.view.getAndroidViewsHandler$ui_release(), num2.intValue());
            if (semanticsIdToView != null) {
                accessibilityNodeInfoCompat.setTraversalBefore(semanticsIdToView);
            } else {
                accessibilityNodeInfoCompat.setTraversalBefore(this.view, num2.intValue());
            }
            addExtraDataToAccessibilityNodeInfoHelper(i5, accessibilityNodeInfoCompat.unwrap(), this.ExtraDataTestTraversalBeforeVal, null);
            r2 r2Var16 = r2.f19517a;
        }
        Integer num3 = this.idToAfterMap.get(Integer.valueOf(i5));
        if (num3 != null) {
            num3.intValue();
            View semanticsIdToView2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.semanticsIdToView(this.view.getAndroidViewsHandler$ui_release(), num3.intValue());
            if (semanticsIdToView2 != null) {
                accessibilityNodeInfoCompat.setTraversalAfter(semanticsIdToView2);
                addExtraDataToAccessibilityNodeInfoHelper(i5, accessibilityNodeInfoCompat.unwrap(), this.ExtraDataTestTraversalAfterVal, null);
            }
            r2 r2Var17 = r2.f19517a;
        }
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollBackward(ScrollAxisRange scrollAxisRange) {
        return (scrollAxisRange.getValue().invoke().floatValue() > 0.0f && !scrollAxisRange.getReverseScrolling()) || (scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue() && scrollAxisRange.getReverseScrolling());
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollForward(ScrollAxisRange scrollAxisRange) {
        return (scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue() && !scrollAxisRange.getReverseScrolling()) || (scrollAxisRange.getValue().invoke().floatValue() > 0.0f && scrollAxisRange.getReverseScrolling());
    }

    private final boolean registerScrollingId(int i5, List<ScrollObservationScope> list) {
        ScrollObservationScope findById;
        boolean z4;
        findById = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findById(list, i5);
        if (findById != null) {
            z4 = false;
        } else {
            findById = new ScrollObservationScope(i5, this.scrollObservationScopes, null, null, null, null);
            z4 = true;
        }
        this.scrollObservationScopes.add(findById);
        return z4;
    }

    private final boolean requestAccessibilityFocus(int i5) {
        if (!isTouchExplorationEnabled() || isAccessibilityFocused(i5)) {
            return false;
        }
        int i6 = this.focusedVirtualViewId;
        if (i6 != Integer.MIN_VALUE) {
            sendEventForVirtualView$default(this, i6, 65536, null, null, 12, null);
        }
        this.focusedVirtualViewId = i5;
        this.view.invalidate();
        sendEventForVirtualView$default(this, i5, 32768, null, null, 12, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleScrollEventIfNeeded(ScrollObservationScope scrollObservationScope) {
        if (!scrollObservationScope.isValidOwnerScope()) {
            return;
        }
        this.view.getSnapshotObserver().observeReads$ui_release(scrollObservationScope, this.scheduleScrollEventIfNeededLambda, new AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1(scrollObservationScope, this));
    }

    private final Comparator<SemanticsNode> semanticComparator(boolean z4) {
        Comparator comparator;
        if (z4) {
            comparator = RtlBoundsComparator.INSTANCE;
        } else {
            comparator = LtrBoundsComparator.INSTANCE;
        }
        return new AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$2(new AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$1(comparator, LayoutNode.Companion.getZComparator$ui_release()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void semanticsChangeChecker$lambda$46(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        Owner.measureAndLayout$default(androidComposeViewAccessibilityDelegateCompat.view, false, 1, null);
        androidComposeViewAccessibilityDelegateCompat.checkForSemanticsChanges();
        androidComposeViewAccessibilityDelegateCompat.checkingForSemanticsChanges = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int semanticsNodeIdToAccessibilityVirtualNodeId(int i5) {
        if (i5 == this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) {
            return -1;
        }
        return i5;
    }

    private final void sendAccessibilitySemanticsStructureChangeEvents(SemanticsNode semanticsNode, SemanticsNodeCopy semanticsNodeCopy) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i5 = 0; i5 < size; i5++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i5);
            if (getCurrentSemanticsNodes().containsKey(Integer.valueOf(semanticsNode2.getId()))) {
                if (!semanticsNodeCopy.getChildren().contains(Integer.valueOf(semanticsNode2.getId()))) {
                    notifySubtreeAccessibilityStateChangedIfNeeded(semanticsNode.getLayoutNode$ui_release());
                    return;
                }
                linkedHashSet.add(Integer.valueOf(semanticsNode2.getId()));
            }
        }
        Iterator<Integer> it = semanticsNodeCopy.getChildren().iterator();
        while (it.hasNext()) {
            if (!linkedHashSet.contains(Integer.valueOf(it.next().intValue()))) {
                notifySubtreeAccessibilityStateChangedIfNeeded(semanticsNode.getLayoutNode$ui_release());
                return;
            }
        }
        List<SemanticsNode> replacedChildren$ui_release2 = semanticsNode.getReplacedChildren$ui_release();
        int size2 = replacedChildren$ui_release2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            SemanticsNode semanticsNode3 = replacedChildren$ui_release2.get(i6);
            if (getCurrentSemanticsNodes().containsKey(Integer.valueOf(semanticsNode3.getId()))) {
                SemanticsNodeCopy semanticsNodeCopy2 = this.previousSemanticsNodes.get(Integer.valueOf(semanticsNode3.getId()));
                kotlin.jvm.internal.l0.m(semanticsNodeCopy2);
                sendAccessibilitySemanticsStructureChangeEvents(semanticsNode3, semanticsNodeCopy2);
            }
        }
    }

    private final void sendContentCaptureSemanticsStructureChangeEvents(SemanticsNode semanticsNode, SemanticsNodeCopy semanticsNodeCopy) {
        List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i5 = 0; i5 < size; i5++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i5);
            if (getCurrentSemanticsNodes().containsKey(Integer.valueOf(semanticsNode2.getId())) && !semanticsNodeCopy.getChildren().contains(Integer.valueOf(semanticsNode2.getId()))) {
                updateContentCaptureBuffersOnAppeared(semanticsNode2);
            }
        }
        for (Map.Entry<Integer, SemanticsNodeCopy> entry : this.previousSemanticsNodes.entrySet()) {
            if (!getCurrentSemanticsNodes().containsKey(entry.getKey())) {
                bufferContentCaptureViewDisappeared(entry.getKey().intValue());
            }
        }
        List<SemanticsNode> replacedChildren$ui_release2 = semanticsNode.getReplacedChildren$ui_release();
        int size2 = replacedChildren$ui_release2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            SemanticsNode semanticsNode3 = replacedChildren$ui_release2.get(i6);
            if (getCurrentSemanticsNodes().containsKey(Integer.valueOf(semanticsNode3.getId())) && this.previousSemanticsNodes.containsKey(Integer.valueOf(semanticsNode3.getId()))) {
                SemanticsNodeCopy semanticsNodeCopy2 = this.previousSemanticsNodes.get(Integer.valueOf(semanticsNode3.getId()));
                kotlin.jvm.internal.l0.m(semanticsNodeCopy2);
                sendContentCaptureSemanticsStructureChangeEvents(semanticsNode3, semanticsNodeCopy2);
            }
        }
    }

    private final void sendContentCaptureTextUpdateEvent(int i5, String str) {
        ContentCaptureSessionCompat contentCaptureSessionCompat = this.contentCaptureSession;
        if (contentCaptureSessionCompat == null || Build.VERSION.SDK_INT < 29) {
            return;
        }
        AutofillId newAutofillId = contentCaptureSessionCompat.newAutofillId(i5);
        if (newAutofillId != null) {
            contentCaptureSessionCompat.notifyViewTextChanged(newAutofillId, str);
            return;
        }
        throw new IllegalStateException("Invalid content capture ID".toString());
    }

    private final boolean sendEvent(AccessibilityEvent accessibilityEvent) {
        if (!isEnabledForAccessibility$ui_release()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.sendingFocusAffectingEvent = true;
        }
        try {
            return this.onSendAccessibilityEvent.invoke(accessibilityEvent).booleanValue();
        } finally {
            this.sendingFocusAffectingEvent = false;
        }
    }

    private final boolean sendEventForVirtualView(int i5, int i6, Integer num, List<String> list) {
        if (i5 != Integer.MIN_VALUE && isEnabled()) {
            AccessibilityEvent createEvent = createEvent(i5, i6);
            if (num != null) {
                createEvent.setContentChangeTypes(num.intValue());
            }
            if (list != null) {
                createEvent.setContentDescription(ListUtilsKt.fastJoinToString$default(list, ",", null, null, 0, null, null, 62, null));
            }
            return sendEvent(createEvent);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean sendEventForVirtualView$default(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i5, int i6, Integer num, List list, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            num = null;
        }
        if ((i7 & 8) != 0) {
            list = null;
        }
        return androidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView(i5, i6, num, list);
    }

    private final void sendPaneChangeEvents(int i5, int i6, String str) {
        AccessibilityEvent createEvent = createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(i5), 32);
        createEvent.setContentChangeTypes(i6);
        if (str != null) {
            createEvent.getText().add(str);
        }
        sendEvent(createEvent);
    }

    private final void sendPendingTextTraversedAtGranularityEvent(int i5) {
        PendingTextTraversedEvent pendingTextTraversedEvent = this.pendingTextTraversedEvent;
        if (pendingTextTraversedEvent != null) {
            if (i5 != pendingTextTraversedEvent.getNode().getId()) {
                return;
            }
            if (SystemClock.uptimeMillis() - pendingTextTraversedEvent.getTraverseTime() <= 1000) {
                AccessibilityEvent createEvent = createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(pendingTextTraversedEvent.getNode().getId()), 131072);
                createEvent.setFromIndex(pendingTextTraversedEvent.getFromIndex());
                createEvent.setToIndex(pendingTextTraversedEvent.getToIndex());
                createEvent.setAction(pendingTextTraversedEvent.getAction());
                createEvent.setMovementGranularity(pendingTextTraversedEvent.getGranularity());
                createEvent.getText().add(getIterableTextForAccessibility(pendingTextTraversedEvent.getNode()));
                sendEvent(createEvent);
            }
        }
        this.pendingTextTraversedEvent = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:183:0x05fe, code lost:
    
        if (r0 == false) goto L182;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0413 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void sendSemanticsPropertyChangeEvents(java.util.Map<java.lang.Integer, androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds> r28) {
        /*
            Method dump skipped, instructions count: 1591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSemanticsPropertyChangeEvents(java.util.Map):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(r8, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1.INSTANCE);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void sendSubtreeChangeAccessibilityEvents(androidx.compose.ui.node.LayoutNode r8, androidx.collection.ArraySet<java.lang.Integer> r9) {
        /*
            r7 = this;
            boolean r0 = r8.isAttached()
            if (r0 != 0) goto L7
            return
        L7:
            androidx.compose.ui.platform.AndroidComposeView r0 = r7.view
            androidx.compose.ui.platform.AndroidViewsHandler r0 = r0.getAndroidViewsHandler$ui_release()
            java.util.HashMap r0 = r0.getLayoutNodeToHolder()
            boolean r0 = r0.containsKey(r8)
            if (r0 == 0) goto L18
            return
        L18:
            androidx.collection.ArraySet<androidx.compose.ui.node.LayoutNode> r0 = r7.subtreeChangedLayoutNodes
            int r0 = r0.size()
            r1 = 0
        L1f:
            if (r1 >= r0) goto L33
            androidx.collection.ArraySet<androidx.compose.ui.node.LayoutNode> r2 = r7.subtreeChangedLayoutNodes
            java.lang.Object r2 = r2.valueAt(r1)
            androidx.compose.ui.node.LayoutNode r2 = (androidx.compose.ui.node.LayoutNode) r2
            boolean r2 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$isAncestorOf(r2, r8)
            if (r2 == 0) goto L30
            return
        L30:
            int r1 = r1 + 1
            goto L1f
        L33:
            androidx.compose.ui.node.NodeChain r0 = r8.getNodes$ui_release()
            r1 = 8
            int r1 = androidx.compose.ui.node.NodeKind.m5204constructorimpl(r1)
            boolean r0 = r0.m5167hasH91voCI$ui_release(r1)
            if (r0 == 0) goto L44
            goto L4a
        L44:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1 r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1.INSTANCE
            androidx.compose.ui.node.LayoutNode r8 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$findClosestParentNode(r8, r0)
        L4a:
            if (r8 == 0) goto L84
            androidx.compose.ui.semantics.SemanticsConfiguration r0 = r8.getCollapsedSemantics$ui_release()
            if (r0 != 0) goto L53
            goto L84
        L53:
            boolean r0 = r0.isMergingSemanticsOfDescendants()
            if (r0 != 0) goto L62
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1 r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1.INSTANCE
            androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.access$findClosestParentNode(r8, r0)
            if (r0 == 0) goto L62
            r8 = r0
        L62:
            int r8 = r8.getSemanticsId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            boolean r9 = r9.add(r0)
            if (r9 != 0) goto L71
            return
        L71:
            int r1 = r7.semanticsNodeIdToAccessibilityVirtualNodeId(r8)
            r2 = 2048(0x800, float:2.87E-42)
            r8 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r7
            sendEventForVirtualView$default(r0, r1, r2, r3, r4, r5, r6)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSubtreeChangeAccessibilityEvents(androidx.compose.ui.node.LayoutNode, androidx.collection.ArraySet):void");
    }

    private final void sendTypeViewScrolledAccessibilityEvent(LayoutNode layoutNode) {
        if (!layoutNode.isAttached() || this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            return;
        }
        int semanticsId = layoutNode.getSemanticsId();
        ScrollAxisRange scrollAxisRange = this.pendingHorizontalScrollEvents.get(Integer.valueOf(semanticsId));
        ScrollAxisRange scrollAxisRange2 = this.pendingVerticalScrollEvents.get(Integer.valueOf(semanticsId));
        if (scrollAxisRange == null && scrollAxisRange2 == null) {
            return;
        }
        AccessibilityEvent createEvent = createEvent(semanticsId, 4096);
        if (scrollAxisRange != null) {
            createEvent.setScrollX((int) scrollAxisRange.getValue().invoke().floatValue());
            createEvent.setMaxScrollX((int) scrollAxisRange.getMaxValue().invoke().floatValue());
        }
        if (scrollAxisRange2 != null) {
            createEvent.setScrollY((int) scrollAxisRange2.getValue().invoke().floatValue());
            createEvent.setMaxScrollY((int) scrollAxisRange2.getMaxValue().invoke().floatValue());
        }
        sendEvent(createEvent);
    }

    private final boolean setAccessibilitySelection(SemanticsNode semanticsNode, int i5, int i6, boolean z4) {
        String iterableTextForAccessibility;
        Integer num;
        Integer num2;
        boolean enabled;
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        boolean z5 = false;
        if (unmergedConfig$ui_release.contains(semanticsActions.getSetSelection())) {
            enabled = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled) {
                v3.q qVar = (v3.q) ((AccessibilityAction) semanticsNode.getUnmergedConfig$ui_release().get(semanticsActions.getSetSelection())).getAction();
                if (qVar == null) {
                    return false;
                }
                return ((Boolean) qVar.invoke(Integer.valueOf(i5), Integer.valueOf(i6), Boolean.valueOf(z4))).booleanValue();
            }
        }
        if ((i5 == i6 && i6 == this.accessibilityCursorPosition) || (iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode)) == null) {
            return false;
        }
        if (i5 < 0 || i5 != i6 || i6 > iterableTextForAccessibility.length()) {
            i5 = -1;
        }
        this.accessibilityCursorPosition = i5;
        if (iterableTextForAccessibility.length() > 0) {
            z5 = true;
        }
        int semanticsNodeIdToAccessibilityVirtualNodeId = semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode.getId());
        Integer num3 = null;
        if (z5) {
            num = Integer.valueOf(this.accessibilityCursorPosition);
        } else {
            num = null;
        }
        if (z5) {
            num2 = Integer.valueOf(this.accessibilityCursorPosition);
        } else {
            num2 = null;
        }
        if (z5) {
            num3 = Integer.valueOf(iterableTextForAccessibility.length());
        }
        sendEvent(createTextSelectionChangedEvent(semanticsNodeIdToAccessibilityVirtualNodeId, num, num2, num3, iterableTextForAccessibility));
        sendPendingTextTraversedAtGranularityEvent(semanticsNode.getId());
        return true;
    }

    private final void setContentInvalid(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui_release.contains(semanticsProperties.getError())) {
            accessibilityNodeInfoCompat.setContentInvalid(true);
            accessibilityNodeInfoCompat.setError((CharSequence) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getError()));
        }
    }

    private final void setIsCheckable(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        accessibilityNodeInfoCompat.setCheckable(getInfoIsCheckable(semanticsNode));
    }

    private final void setStateDescription(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        accessibilityNodeInfoCompat.setStateDescription(getInfoStateDescriptionOrNull(semanticsNode));
    }

    private final void setText(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        accessibilityNodeInfoCompat.setText(getInfoText(semanticsNode));
    }

    private final void setTraversalValues() {
        SemanticsNode semanticsNode;
        boolean z4;
        List<SemanticsNode> P;
        int G;
        this.idToBeforeMap.clear();
        this.idToAfterMap.clear();
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(-1);
        if (semanticsNodeWithAdjustedBounds != null) {
            semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode();
        } else {
            semanticsNode = null;
        }
        kotlin.jvm.internal.l0.m(semanticsNode);
        int i5 = 1;
        if (semanticsNode.getLayoutInfo().getLayoutDirection() == LayoutDirection.Rtl) {
            z4 = true;
        } else {
            z4 = false;
        }
        P = kotlin.collections.w.P(semanticsNode);
        List<SemanticsNode> subtreeSortedByGeometryGrouping = subtreeSortedByGeometryGrouping(z4, P);
        G = kotlin.collections.w.G(subtreeSortedByGeometryGrouping);
        if (1 > G) {
            return;
        }
        while (true) {
            int id = subtreeSortedByGeometryGrouping.get(i5 - 1).getId();
            int id2 = subtreeSortedByGeometryGrouping.get(i5).getId();
            this.idToBeforeMap.put(Integer.valueOf(id), Integer.valueOf(id2));
            this.idToAfterMap.put(Integer.valueOf(id2), Integer.valueOf(id));
            if (i5 != G) {
                i5++;
            } else {
                return;
            }
        }
    }

    private final void showTranslatedText() {
        AccessibilityAction accessibilityAction;
        v3.l lVar;
        Iterator<SemanticsNodeWithAdjustedBounds> it = getCurrentSemanticsNodes().values().iterator();
        while (it.hasNext()) {
            SemanticsConfiguration unmergedConfig$ui_release = it.next().getSemanticsNode().getUnmergedConfig$ui_release();
            if (kotlin.jvm.internal.l0.g(SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()), Boolean.FALSE) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getShowTextSubstitution())) != null && (lVar = (v3.l) accessibilityAction.getAction()) != null) {
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:24:0x0086 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<androidx.compose.ui.semantics.SemanticsNode> sortByGeometryGroupings(boolean r10, java.util.ArrayList<androidx.compose.ui.semantics.SemanticsNode> r11, java.util.Map<java.lang.Integer, java.util.List<androidx.compose.ui.semantics.SemanticsNode>> r12) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = kotlin.collections.u.G(r11)
            r2 = 0
            if (r1 < 0) goto L35
            r3 = r2
        Ld:
            java.lang.Object r4 = r11.get(r3)
            androidx.compose.ui.semantics.SemanticsNode r4 = (androidx.compose.ui.semantics.SemanticsNode) r4
            if (r3 == 0) goto L1b
            boolean r5 = sortByGeometryGroupings$placedEntryRowOverlaps(r0, r4)
            if (r5 != 0) goto L30
        L1b:
            androidx.compose.ui.geometry.Rect r5 = r4.getBoundsInWindow()
            kotlin.u0 r6 = new kotlin.u0
            r7 = 1
            androidx.compose.ui.semantics.SemanticsNode[] r7 = new androidx.compose.ui.semantics.SemanticsNode[r7]
            r7[r2] = r4
            java.util.List r4 = kotlin.collections.u.P(r7)
            r6.<init>(r5, r4)
            r0.add(r6)
        L30:
            if (r3 == r1) goto L35
            int r3 = r3 + 1
            goto Ld
        L35:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$TopBottomBoundsComparator r11 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.TopBottomBoundsComparator.INSTANCE
            kotlin.collections.u.m0(r0, r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r1 = r0.size()
            r3 = r2
        L44:
            if (r3 >= r1) goto L78
            java.lang.Object r4 = r0.get(r3)
            kotlin.u0 r4 = (kotlin.u0) r4
            java.lang.Object r5 = r4.getSecond()
            java.util.List r5 = (java.util.List) r5
            if (r10 == 0) goto L57
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$RtlBoundsComparator r6 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.RtlBoundsComparator.INSTANCE
            goto L59
        L57:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$LtrBoundsComparator r6 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.LtrBoundsComparator.INSTANCE
        L59:
            androidx.compose.ui.node.LayoutNode$Companion r7 = androidx.compose.ui.node.LayoutNode.Companion
            java.util.Comparator r7 = r7.getZComparator$ui_release()
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$1 r8 = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$1
            r8.<init>(r6, r7)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$2 r6 = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$2
            r6.<init>(r8)
            kotlin.collections.u.m0(r5, r6)
            java.lang.Object r4 = r4.getSecond()
            java.util.Collection r4 = (java.util.Collection) r4
            r11.addAll(r4)
            int r3 = r3 + 1
            goto L44
        L78:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2 r10 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2.INSTANCE
            androidx.compose.ui.platform.k r0 = new androidx.compose.ui.platform.k
            r0.<init>()
            kotlin.collections.u.m0(r11, r0)
        L82:
            int r10 = kotlin.collections.u.G(r11)
            if (r2 > r10) goto Lbf
            java.lang.Object r10 = r11.get(r2)
            androidx.compose.ui.semantics.SemanticsNode r10 = (androidx.compose.ui.semantics.SemanticsNode) r10
            int r10 = r10.getId()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object r10 = r12.get(r10)
            java.util.List r10 = (java.util.List) r10
            if (r10 == 0) goto Lbc
            java.lang.Object r0 = r11.get(r2)
            androidx.compose.ui.semantics.SemanticsNode r0 = (androidx.compose.ui.semantics.SemanticsNode) r0
            boolean r0 = r9.isScreenReaderFocusable(r0)
            if (r0 != 0) goto Lae
            r11.remove(r2)
            goto Lb0
        Lae:
            int r2 = r2 + 1
        Lb0:
            r0 = r10
            java.util.Collection r0 = (java.util.Collection) r0
            r11.addAll(r2, r0)
            int r10 = r10.size()
            int r2 = r2 + r10
            goto L82
        Lbc:
            int r2 = r2 + 1
            goto L82
        Lbf:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sortByGeometryGroupings(boolean, java.util.ArrayList, java.util.Map):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ List sortByGeometryGroupings$default(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z4, ArrayList arrayList, Map map, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            map = new LinkedHashMap();
        }
        return androidComposeViewAccessibilityDelegateCompat.sortByGeometryGroupings(z4, arrayList, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sortByGeometryGroupings$lambda$7(v3.p pVar, Object obj, Object obj2) {
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }

    private static final boolean sortByGeometryGroupings$placedEntryRowOverlaps(ArrayList<kotlin.u0<Rect, List<SemanticsNode>>> arrayList, SemanticsNode semanticsNode) {
        boolean z4;
        int G;
        boolean z5;
        boolean z6;
        float top = semanticsNode.getBoundsInWindow().getTop();
        float bottom = semanticsNode.getBoundsInWindow().getBottom();
        if (top >= bottom) {
            z4 = true;
        } else {
            z4 = false;
        }
        G = kotlin.collections.w.G(arrayList);
        if (G >= 0) {
            int i5 = 0;
            while (true) {
                Rect first = arrayList.get(i5).getFirst();
                if (first.getTop() >= first.getBottom()) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (!z4 && !z5 && Math.max(top, first.getTop()) < Math.min(bottom, first.getBottom())) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6) {
                    arrayList.set(i5, new kotlin.u0<>(first.intersect(0.0f, top, Float.POSITIVE_INFINITY, bottom), arrayList.get(i5).getSecond()));
                    arrayList.get(i5).getSecond().add(semanticsNode);
                    return true;
                }
                if (i5 == G) {
                    break;
                }
                i5++;
            }
        }
        return false;
    }

    private final List<SemanticsNode> subtreeSortedByGeometryGrouping(boolean z4, List<SemanticsNode> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList<SemanticsNode> arrayList = new ArrayList<>();
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            geometryDepthFirstSearch(list.get(i5), arrayList, linkedHashMap);
        }
        return sortByGeometryGroupings(z4, arrayList, linkedHashMap);
    }

    private final RectF toScreenCoords(SemanticsNode semanticsNode, Rect rect) {
        Rect rect2;
        if (semanticsNode == null) {
            return null;
        }
        Rect m3530translatek4lQ0M = rect.m3530translatek4lQ0M(semanticsNode.m5381getPositionInRootF1C5BW0());
        Rect boundsInRoot = semanticsNode.getBoundsInRoot();
        if (m3530translatek4lQ0M.overlaps(boundsInRoot)) {
            rect2 = m3530translatek4lQ0M.intersect(boundsInRoot);
        } else {
            rect2 = null;
        }
        if (rect2 == null) {
            return null;
        }
        long mo4954localToScreenMKHz9U = this.view.mo4954localToScreenMKHz9U(OffsetKt.Offset(rect2.getLeft(), rect2.getTop()));
        long mo4954localToScreenMKHz9U2 = this.view.mo4954localToScreenMKHz9U(OffsetKt.Offset(rect2.getRight(), rect2.getBottom()));
        return new RectF(Offset.m3493getXimpl(mo4954localToScreenMKHz9U), Offset.m3494getYimpl(mo4954localToScreenMKHz9U), Offset.m3493getXimpl(mo4954localToScreenMKHz9U2), Offset.m3494getYimpl(mo4954localToScreenMKHz9U2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
    
        r1 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.m5292toLegacyClassNameV4PA4sw(r1.m5372unboximpl());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.compose.ui.platform.coreshims.ViewStructureCompat toViewStructure(androidx.compose.ui.semantics.SemanticsNode r14) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.toViewStructure(androidx.compose.ui.semantics.SemanticsNode):androidx.compose.ui.platform.coreshims.ViewStructureCompat");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void touchExplorationStateListener$lambda$1(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z4) {
        androidComposeViewAccessibilityDelegateCompat.enabledServices = androidComposeViewAccessibilityDelegateCompat.accessibilityManager.getEnabledAccessibilityServiceList(-1);
    }

    private final boolean traverseAtGranularity(SemanticsNode semanticsNode, int i5, boolean z4, boolean z5) {
        boolean z6;
        AccessibilityIterators.TextSegmentIterator iteratorForGranularity;
        int[] preceding;
        int i6;
        int i7;
        int i8;
        int id = semanticsNode.getId();
        Integer num = this.previousTraversedNode;
        if (num == null || id != num.intValue()) {
            this.accessibilityCursorPosition = -1;
            this.previousTraversedNode = Integer.valueOf(semanticsNode.getId());
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        if (iterableTextForAccessibility != null && iterableTextForAccessibility.length() != 0) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (z6 || (iteratorForGranularity = getIteratorForGranularity(semanticsNode, i5)) == null) {
            return false;
        }
        int accessibilitySelectionEnd = getAccessibilitySelectionEnd(semanticsNode);
        if (accessibilitySelectionEnd == -1) {
            if (z4) {
                accessibilitySelectionEnd = 0;
            } else {
                accessibilitySelectionEnd = iterableTextForAccessibility.length();
            }
        }
        if (z4) {
            preceding = iteratorForGranularity.following(accessibilitySelectionEnd);
        } else {
            preceding = iteratorForGranularity.preceding(accessibilitySelectionEnd);
        }
        if (preceding == null) {
            return false;
        }
        int i9 = preceding[0];
        int i10 = preceding[1];
        if (z5 && isAccessibilitySelectionExtendable(semanticsNode)) {
            i6 = getAccessibilitySelectionStart(semanticsNode);
            if (i6 == -1) {
                if (z4) {
                    i6 = i9;
                } else {
                    i6 = i10;
                }
            }
            if (z4) {
                i7 = i10;
            } else {
                i7 = i9;
            }
        } else {
            if (z4) {
                i6 = i10;
            } else {
                i6 = i9;
            }
            i7 = i6;
        }
        if (z4) {
            i8 = 256;
        } else {
            i8 = 512;
        }
        this.pendingTextTraversedEvent = new PendingTextTraversedEvent(semanticsNode, i8, i5, i9, i10, SystemClock.uptimeMillis());
        setAccessibilitySelection(semanticsNode, i6, i7, true);
        return true;
    }

    private final <T extends CharSequence> T trimToSize(T t5, @IntRange(from = 1) int i5) {
        boolean z4;
        boolean z5 = true;
        if (i5 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (t5 != null && t5.length() != 0) {
                z5 = false;
            }
            if (!z5 && t5.length() > i5) {
                int i6 = i5 - 1;
                if (Character.isHighSurrogate(t5.charAt(i6)) && Character.isLowSurrogate(t5.charAt(i5))) {
                    i5 = i6;
                }
                T t6 = (T) t5.subSequence(0, i5);
                kotlin.jvm.internal.l0.n(t6, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return t6;
            }
            return t5;
        }
        throw new IllegalArgumentException("size should be greater than 0".toString());
    }

    private final void updateContentCaptureBuffersOnAppeared(SemanticsNode semanticsNode) {
        if (!isEnabledForContentCapture()) {
            return;
        }
        updateTranslationOnAppeared(semanticsNode);
        bufferContentCaptureViewAppeared(semanticsNode.getId(), toViewStructure(semanticsNode));
        List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i5 = 0; i5 < size; i5++) {
            updateContentCaptureBuffersOnAppeared(replacedChildren$ui_release.get(i5));
        }
    }

    private final void updateContentCaptureBuffersOnDisappeared(SemanticsNode semanticsNode) {
        if (!isEnabledForContentCapture()) {
            return;
        }
        bufferContentCaptureViewDisappeared(semanticsNode.getId());
        List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i5 = 0; i5 < size; i5++) {
            updateContentCaptureBuffersOnDisappeared(replacedChildren$ui_release.get(i5));
        }
    }

    private final void updateHoveredVirtualView(int i5) {
        int i6 = this.hoveredVirtualViewId;
        if (i6 == i5) {
            return;
        }
        this.hoveredVirtualViewId = i5;
        sendEventForVirtualView$default(this, i5, 128, null, null, 12, null);
        sendEventForVirtualView$default(this, i6, 256, null, null, 12, null);
    }

    private final void updateSemanticsNodesCopyAndPanes() {
        boolean hasPaneTitle;
        SemanticsNode semanticsNode;
        String str;
        SemanticsConfiguration unmergedConfig;
        boolean hasPaneTitle2;
        ArraySet<? extends Integer> arraySet = new ArraySet<>(0, 1, null);
        Iterator<Integer> it = this.paneDisplayed.iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(Integer.valueOf(intValue));
            if (semanticsNodeWithAdjustedBounds != null) {
                semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode();
            } else {
                semanticsNode = null;
            }
            if (semanticsNode != null) {
                hasPaneTitle2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.hasPaneTitle(semanticsNode);
                if (!hasPaneTitle2) {
                }
            }
            arraySet.add(Integer.valueOf(intValue));
            SemanticsNodeCopy semanticsNodeCopy = this.previousSemanticsNodes.get(Integer.valueOf(intValue));
            if (semanticsNodeCopy != null && (unmergedConfig = semanticsNodeCopy.getUnmergedConfig()) != null) {
                str = (String) SemanticsConfigurationKt.getOrNull(unmergedConfig, SemanticsProperties.INSTANCE.getPaneTitle());
            } else {
                str = null;
            }
            sendPaneChangeEvents(intValue, 32, str);
        }
        this.paneDisplayed.removeAll(arraySet);
        this.previousSemanticsNodes.clear();
        for (Map.Entry<Integer, SemanticsNodeWithAdjustedBounds> entry : getCurrentSemanticsNodes().entrySet()) {
            hasPaneTitle = AndroidComposeViewAccessibilityDelegateCompat_androidKt.hasPaneTitle(entry.getValue().getSemanticsNode());
            if (hasPaneTitle && this.paneDisplayed.add(entry.getKey())) {
                sendPaneChangeEvents(entry.getKey().intValue(), 16, (String) entry.getValue().getSemanticsNode().getUnmergedConfig$ui_release().get(SemanticsProperties.INSTANCE.getPaneTitle()));
            }
            this.previousSemanticsNodes.put(entry.getKey(), new SemanticsNodeCopy(entry.getValue().getSemanticsNode(), getCurrentSemanticsNodes()));
        }
        this.previousSemanticsRoot = new SemanticsNodeCopy(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), getCurrentSemanticsNodes());
    }

    private final void updateTranslationOnAppeared(SemanticsNode semanticsNode) {
        AccessibilityAction accessibilityAction;
        v3.l lVar;
        v3.l lVar2;
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution());
        if (this.translateStatus == TranslateStatus.SHOW_ORIGINAL && kotlin.jvm.internal.l0.g(bool, Boolean.TRUE)) {
            AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getShowTextSubstitution());
            if (accessibilityAction2 != null && (lVar2 = (v3.l) accessibilityAction2.getAction()) != null) {
                return;
            }
            return;
        }
        if (this.translateStatus == TranslateStatus.SHOW_TRANSLATED && kotlin.jvm.internal.l0.g(bool, Boolean.FALSE) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getShowTextSubstitution())) != null && (lVar = (v3.l) accessibilityAction.getAction()) != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:12:0x0035, B:14:0x0065, B:19:0x0077, B:21:0x007f, B:23:0x0088, B:24:0x008b, B:26:0x0091, B:28:0x009a, B:30:0x00ab, B:32:0x00b2, B:33:0x00bb, B:42:0x004e), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00d8 -> B:13:0x0038). Please report as a decompilation issue!!! */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object boundsUpdatesEventLoop$ui_release(@p4.l kotlin.coroutines.d<? super kotlin.r2> r12) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.boundsUpdatesEventLoop$ui_release(kotlin.coroutines.d):java.lang.Object");
    }

    /* renamed from: canScroll-0AR0LA0$ui_release, reason: not valid java name */
    public final boolean m5290canScroll0AR0LA0$ui_release(boolean z4, int i5, long j5) {
        if (!kotlin.jvm.internal.l0.g(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        return m5289canScrollmoWRBKg(getCurrentSemanticsNodes().values(), z4, i5, j5);
    }

    public final boolean dispatchHoverEvent$ui_release(@p4.l MotionEvent motionEvent) {
        if (!isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7 && action != 9) {
            if (action != 10) {
                return false;
            }
            if (this.hoveredVirtualViewId != Integer.MIN_VALUE) {
                updateHoveredVirtualView(Integer.MIN_VALUE);
                return true;
            }
            return this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
        }
        int hitTestSemanticsAt$ui_release = hitTestSemanticsAt$ui_release(motionEvent.getX(), motionEvent.getY());
        boolean dispatchGenericMotionEvent = this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
        updateHoveredVirtualView(hitTestSemanticsAt$ui_release);
        if (hitTestSemanticsAt$ui_release != Integer.MIN_VALUE) {
            return true;
        }
        return dispatchGenericMotionEvent;
    }

    public final boolean getAccessibilityForceEnabledForTesting$ui_release() {
        return this.accessibilityForceEnabledForTesting;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    @p4.l
    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(@p4.l View view) {
        return this.nodeProvider;
    }

    public final boolean getContentCaptureForceEnabledForTesting$ui_release() {
        return this.contentCaptureForceEnabledForTesting;
    }

    @p4.m
    public final ContentCaptureSessionCompat getContentCaptureSession$ui_release() {
        return this.contentCaptureSession;
    }

    @p4.l
    public final String getExtraDataTestTraversalAfterVal$ui_release() {
        return this.ExtraDataTestTraversalAfterVal;
    }

    @p4.l
    public final String getExtraDataTestTraversalBeforeVal$ui_release() {
        return this.ExtraDataTestTraversalBeforeVal;
    }

    public final int getHoveredVirtualViewId$ui_release() {
        return this.hoveredVirtualViewId;
    }

    @p4.l
    public final HashMap<Integer, Integer> getIdToAfterMap$ui_release() {
        return this.idToAfterMap;
    }

    @p4.l
    public final HashMap<Integer, Integer> getIdToBeforeMap$ui_release() {
        return this.idToBeforeMap;
    }

    @p4.l
    public final v3.l<AccessibilityEvent, Boolean> getOnSendAccessibilityEvent$ui_release() {
        return this.onSendAccessibilityEvent;
    }

    @p4.l
    public final AndroidComposeView getView() {
        return this.view;
    }

    @VisibleForTesting
    public final int hitTestSemanticsAt$ui_release(float f5, float f6) {
        Object s32;
        boolean isVisible;
        NodeChain nodes$ui_release;
        boolean z4 = true;
        LayoutNode layoutNode = null;
        Owner.measureAndLayout$default(this.view, false, 1, null);
        HitTestResult hitTestResult = new HitTestResult();
        this.view.getRoot().m5128hitTestSemanticsM_7yMNQ$ui_release(OffsetKt.Offset(f5, f6), hitTestResult, (r13 & 4) != 0, (r13 & 8) != 0);
        s32 = kotlin.collections.e0.s3(hitTestResult);
        Modifier.Node node = (Modifier.Node) s32;
        if (node != null) {
            layoutNode = DelegatableNodeKt.requireLayoutNode(node);
        }
        if (layoutNode == null || (nodes$ui_release = layoutNode.getNodes$ui_release()) == null || !nodes$ui_release.m5167hasH91voCI$ui_release(NodeKind.m5204constructorimpl(8))) {
            z4 = false;
        }
        if (z4) {
            isVisible = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isVisible(SemanticsNodeKt.SemanticsNode(layoutNode, false));
            if (isVisible && this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(layoutNode) == null) {
                return semanticsNodeIdToAccessibilityVirtualNodeId(layoutNode.getSemanticsId());
            }
        }
        return Integer.MIN_VALUE;
    }

    public final boolean isEnabledForAccessibility$ui_release() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        if (this.accessibilityManager.isEnabled() && (!this.enabledServices.isEmpty())) {
            return true;
        }
        return false;
    }

    public final void onClearTranslation$ui_release() {
        this.translateStatus = TranslateStatus.SHOW_ORIGINAL;
        clearTranslatedText();
    }

    @RequiresApi(31)
    public final void onCreateVirtualViewTranslationRequests$ui_release(@p4.l long[] jArr, @p4.l int[] iArr, @p4.l Consumer<ViewTranslationRequest> consumer) {
        ViewTranslationHelperMethodsS.INSTANCE.onCreateVirtualViewTranslationRequests(this, jArr, iArr, consumer);
    }

    public final void onHideTranslation$ui_release() {
        this.translateStatus = TranslateStatus.SHOW_ORIGINAL;
        hideTranslatedText();
    }

    public final void onLayoutChange$ui_release(@p4.l LayoutNode layoutNode) {
        this.currentSemanticsNodesInvalidated = true;
        if (!isEnabled()) {
            return;
        }
        notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode);
    }

    public final void onSemanticsChange$ui_release() {
        this.currentSemanticsNodesInvalidated = true;
        if (isEnabled() && !this.checkingForSemanticsChanges) {
            this.checkingForSemanticsChanges = true;
            this.handler.post(this.semanticsChangeChecker);
        }
    }

    public final void onShowTranslation$ui_release() {
        this.translateStatus = TranslateStatus.SHOW_TRANSLATED;
        showTranslatedText();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@p4.l LifecycleOwner lifecycleOwner) {
        initContentCapture(true);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@p4.l LifecycleOwner lifecycleOwner) {
        initContentCapture(false);
    }

    @RequiresApi(31)
    public final void onVirtualViewTranslationResponses$ui_release(@p4.l LongSparseArray<ViewTranslationResponse> longSparseArray) {
        ViewTranslationHelperMethodsS.INSTANCE.onVirtualViewTranslationResponses(this, longSparseArray);
    }

    public final void setAccessibilityForceEnabledForTesting$ui_release(boolean z4) {
        this.accessibilityForceEnabledForTesting = z4;
        this.currentSemanticsNodesInvalidated = true;
    }

    public final void setContentCaptureForceEnabledForTesting$ui_release(boolean z4) {
        this.contentCaptureForceEnabledForTesting = z4;
    }

    public final void setContentCaptureSession$ui_release(@p4.m ContentCaptureSessionCompat contentCaptureSessionCompat) {
        this.contentCaptureSession = contentCaptureSessionCompat;
    }

    public final void setHoveredVirtualViewId$ui_release(int i5) {
        this.hoveredVirtualViewId = i5;
    }

    public final void setIdToAfterMap$ui_release(@p4.l HashMap<Integer, Integer> hashMap) {
        this.idToAfterMap = hashMap;
    }

    public final void setIdToBeforeMap$ui_release(@p4.l HashMap<Integer, Integer> hashMap) {
        this.idToBeforeMap = hashMap;
    }

    public final void setOnSendAccessibilityEvent$ui_release(@p4.l v3.l<? super AccessibilityEvent, Boolean> lVar) {
        this.onSendAccessibilityEvent = lVar;
    }
}
