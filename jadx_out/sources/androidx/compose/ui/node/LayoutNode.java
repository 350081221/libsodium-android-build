package androidx.compose.ui.node;

import android.view.View;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.InternalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.umeng.analytics.pro.d;
import java.util.Comparator;
import java.util.List;
import kotlin.a1;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.r2;
import p4.l;
import p4.m;
import t0.b;
import v3.p;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000Ö\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u0000 ÿ\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\bÿ\u0002\u0080\u0003\u0081\u0003\u0082\u0003B\u001f\u0012\t\b\u0002\u0010\u009a\u0001\u001a\u00020\u0015\u0012\t\b\u0002\u0010\u009c\u0001\u001a\u00020\r¢\u0006\u0006\bý\u0002\u0010þ\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0000H\u0002J\u0012\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0011\u001a\u00020\bH\u0002J\b\u0010\u0012\u001a\u00020\bH\u0002J\b\u0010\u0013\u001a\u00020\bH\u0002J\b\u0010\u0014\u001a\u00020\bH\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\bH\u0002J\u000f\u0010\u001a\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u001bH\u0086\bJ#\u0010\u001f\u001a\u00020\b2\u0018\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u001eH\u0086\bJ\u0010\u0010\"\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!H\u0017J\u001f\u0010'\u001a\u00020\b2\u0006\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u0000H\u0000¢\u0006\u0004\b%\u0010&J\u000f\u0010)\u001a\u00020\bH\u0000¢\u0006\u0004\b(\u0010\u0019J\u001f\u0010-\u001a\u00020\b2\u0006\u0010#\u001a\u00020\r2\u0006\u0010*\u001a\u00020\rH\u0000¢\u0006\u0004\b+\u0010,J\u000f\u0010/\u001a\u00020\bH\u0000¢\u0006\u0004\b.\u0010\u0019J'\u00104\u001a\u00020\b2\u0006\u00100\u001a\u00020\r2\u0006\u00101\u001a\u00020\r2\u0006\u0010*\u001a\u00020\rH\u0000¢\u0006\u0004\b2\u00103J\u000f\u00106\u001a\u00020\bH\u0000¢\u0006\u0004\b5\u0010\u0019J\u0017\u0010;\u001a\u00020\b2\u0006\u00108\u001a\u000207H\u0000¢\u0006\u0004\b9\u0010:J\u000f\u0010=\u001a\u00020\bH\u0000¢\u0006\u0004\b<\u0010\u0019J\b\u0010>\u001a\u00020\u000fH\u0016J\u000f\u0010@\u001a\u00020\bH\u0000¢\u0006\u0004\b?\u0010\u0019J\u000f\u0010B\u001a\u00020\bH\u0000¢\u0006\u0004\bA\u0010\u0019J\u001f\u0010F\u001a\u00020\b2\u0006\u0010C\u001a\u00020\r2\u0006\u0010D\u001a\u00020\rH\u0000¢\u0006\u0004\bE\u0010,J\u000f\u0010H\u001a\u00020\bH\u0000¢\u0006\u0004\bG\u0010\u0019J\u000f\u0010J\u001a\u00020\bH\u0000¢\u0006\u0004\bI\u0010\u0019J\u0017\u0010O\u001a\u00020\b2\u0006\u0010L\u001a\u00020KH\u0000¢\u0006\u0004\bM\u0010NJ6\u0010X\u001a\u00020\b2\u0006\u0010Q\u001a\u00020P2\u0006\u0010S\u001a\u00020R2\b\b\u0002\u0010T\u001a\u00020\u00152\b\b\u0002\u0010U\u001a\u00020\u0015H\u0000ø\u0001\u0000¢\u0006\u0004\bV\u0010WJ6\u0010[\u001a\u00020\b2\u0006\u0010Q\u001a\u00020P2\u0006\u0010Y\u001a\u00020R2\b\b\u0002\u0010T\u001a\u00020\u00152\b\b\u0002\u0010U\u001a\u00020\u0015H\u0000ø\u0001\u0000¢\u0006\u0004\bZ\u0010WJ\u0017\u0010_\u001a\u00020\b2\u0006\u0010\\\u001a\u00020\u0000H\u0000¢\u0006\u0004\b]\u0010^J#\u0010d\u001a\u00020\b2\b\b\u0002\u0010`\u001a\u00020\u00152\b\b\u0002\u0010a\u001a\u00020\u0015H\u0000¢\u0006\u0004\bb\u0010cJ#\u0010f\u001a\u00020\b2\b\b\u0002\u0010`\u001a\u00020\u00152\b\b\u0002\u0010a\u001a\u00020\u0015H\u0000¢\u0006\u0004\be\u0010cJ\u000f\u0010h\u001a\u00020\bH\u0000¢\u0006\u0004\bg\u0010\u0019J\u001e\u0010l\u001a\u00020\b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0iH\u0080\b¢\u0006\u0004\bj\u0010kJ\u0019\u0010o\u001a\u00020\b2\b\b\u0002\u0010`\u001a\u00020\u0015H\u0000¢\u0006\u0004\bm\u0010nJ\u0019\u0010q\u001a\u00020\b2\b\b\u0002\u0010`\u001a\u00020\u0015H\u0000¢\u0006\u0004\bp\u0010nJ\u000f\u0010s\u001a\u00020\bH\u0000¢\u0006\u0004\br\u0010\u0019J\u000e\u0010v\u001a\b\u0012\u0004\u0012\u00020u0tH\u0016J\u000f\u0010x\u001a\u00020\bH\u0000¢\u0006\u0004\bw\u0010\u0019J\u001e\u0010}\u001a\u00020\u00152\n\b\u0002\u0010z\u001a\u0004\u0018\u00010yH\u0000ø\u0001\u0000¢\u0006\u0004\b{\u0010|J\u001e\u0010\u007f\u001a\u00020\u00152\n\b\u0002\u0010z\u001a\u0004\u0018\u00010yH\u0000ø\u0001\u0000¢\u0006\u0004\b~\u0010|J\u0011\u0010\u0081\u0001\u001a\u00020\bH\u0000¢\u0006\u0005\b\u0080\u0001\u0010\u0019J\u0011\u0010\u0083\u0001\u001a\u00020\bH\u0000¢\u0006\u0005\b\u0082\u0001\u0010\u0019J\u0011\u0010\u0085\u0001\u001a\u00020\bH\u0000¢\u0006\u0005\b\u0084\u0001\u0010\u0019J\u0012\u0010\u0087\u0001\u001a\u00020\b2\t\b\u0002\u0010\u0086\u0001\u001a\u00020\u0015J\u0011\u0010\u0089\u0001\u001a\u00020\bH\u0000¢\u0006\u0005\b\u0088\u0001\u0010\u0019J\t\u0010\u008a\u0001\u001a\u00020\bH\u0016J\t\u0010\u008b\u0001\u001a\u00020\bH\u0016J(\u0010\u008f\u0001\u001a\u00020\b2\u0013\u0010\u001c\u001a\u000f\u0012\u0005\u0012\u00030\u008c\u0001\u0012\u0004\u0012\u00020\b0\u001bH\u0080\b¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J(\u0010\u0092\u0001\u001a\u00020\b2\u0013\u0010\u001c\u001a\u000f\u0012\u0005\u0012\u00030\u0090\u0001\u0012\u0004\u0012\u00020\b0\u001bH\u0080\b¢\u0006\u0006\b\u0091\u0001\u0010\u008e\u0001J\u0011\u0010\u0094\u0001\u001a\u00020\bH\u0000¢\u0006\u0005\b\u0093\u0001\u0010\u0019J\u0011\u0010\u0096\u0001\u001a\u00020\bH\u0000¢\u0006\u0005\b\u0095\u0001\u0010\u0019J\t\u0010\u0097\u0001\u001a\u00020\bH\u0016J\t\u0010\u0098\u0001\u001a\u00020\bH\u0016J\t\u0010\u0099\u0001\u001a\u00020\bH\u0016R\u0017\u0010\u009a\u0001\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R)\u0010\u009c\u0001\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R9\u0010£\u0001\u001a\u00020\r2\u0007\u0010¢\u0001\u001a\u00020\r8W@WX\u0097\u000e¢\u0006\u001f\n\u0006\b£\u0001\u0010\u009d\u0001\u0012\u0005\b¦\u0001\u0010\u0019\u001a\u0006\b¤\u0001\u0010\u009f\u0001\"\u0006\b¥\u0001\u0010¡\u0001R(\u0010§\u0001\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b§\u0001\u0010\u009b\u0001\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0005\bª\u0001\u0010nR5\u0010¬\u0001\u001a\u0004\u0018\u00010\u00002\t\u0010«\u0001\u001a\u0004\u0018\u00010\u00008\u0000@BX\u0080\u000e¢\u0006\u0017\n\u0006\b¬\u0001\u0010\u00ad\u0001\u001a\u0006\b®\u0001\u0010¯\u0001\"\u0005\b°\u0001\u0010^R\u0019\u0010±\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010\u009d\u0001R\u001e\u0010³\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000²\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R\"\u0010¶\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010µ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R\u0019\u0010¸\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010\u009b\u0001R\u001b\u0010¹\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010\u00ad\u0001R,\u00108\u001a\u0004\u0018\u0001072\t\u0010¢\u0001\u001a\u0004\u0018\u0001078\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0005\b8\u0010º\u0001\u001a\u0006\b»\u0001\u0010¼\u0001R3\u0010¿\u0001\u001a\f\u0018\u00010½\u0001j\u0005\u0018\u0001`¾\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¿\u0001\u0010À\u0001\u001a\u0006\bÁ\u0001\u0010Â\u0001\"\u0006\bÃ\u0001\u0010Ä\u0001R'\u0010\u000e\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u000e\u0010\u009d\u0001\u001a\u0006\bÅ\u0001\u0010\u009f\u0001\"\u0006\bÆ\u0001\u0010¡\u0001R\u0017\u0010l\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bl\u0010\u009b\u0001R\u001c\u0010È\u0001\u001a\u0005\u0018\u00010Ç\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001R\u001e\u0010Ê\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000µ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÊ\u0001\u0010·\u0001R\u0019\u0010Ë\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0001\u0010\u009b\u0001R4\u0010Î\u0001\u001a\u00030Ì\u00012\b\u0010Í\u0001\u001a\u00030Ì\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\bÎ\u0001\u0010Ï\u0001\u001a\u0006\bÐ\u0001\u0010Ñ\u0001\"\u0006\bÒ\u0001\u0010Ó\u0001R \u0010Õ\u0001\u001a\u00030Ô\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bÕ\u0001\u0010Ö\u0001\u001a\u0006\b×\u0001\u0010Ø\u0001R4\u0010Ú\u0001\u001a\u00030Ù\u00012\b\u0010Í\u0001\u001a\u00030Ù\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\bÚ\u0001\u0010Û\u0001\u001a\u0006\bÜ\u0001\u0010Ý\u0001\"\u0006\bÞ\u0001\u0010ß\u0001R4\u0010á\u0001\u001a\u00030à\u00012\b\u0010Í\u0001\u001a\u00030à\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\bá\u0001\u0010â\u0001\u001a\u0006\bã\u0001\u0010ä\u0001\"\u0006\bå\u0001\u0010æ\u0001R4\u0010è\u0001\u001a\u00030ç\u00012\b\u0010Í\u0001\u001a\u00030ç\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\bè\u0001\u0010é\u0001\u001a\u0006\bê\u0001\u0010ë\u0001\"\u0006\bì\u0001\u0010í\u0001R4\u0010ï\u0001\u001a\u00030î\u00012\b\u0010Í\u0001\u001a\u00030î\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\bï\u0001\u0010ð\u0001\u001a\u0006\bñ\u0001\u0010ò\u0001\"\u0006\bó\u0001\u0010ô\u0001R*\u0010ö\u0001\u001a\u00030õ\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bö\u0001\u0010÷\u0001\u001a\u0006\bø\u0001\u0010ù\u0001\"\u0006\bú\u0001\u0010û\u0001R\u001a\u0010ü\u0001\u001a\u00030õ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bü\u0001\u0010÷\u0001R/\u0010ý\u0001\u001a\u00020\u00158\u0000@\u0000X\u0081\u000e¢\u0006\u001e\n\u0006\bý\u0001\u0010\u009b\u0001\u0012\u0005\b\u0080\u0002\u0010\u0019\u001a\u0006\bþ\u0001\u0010©\u0001\"\u0005\bÿ\u0001\u0010nR \u0010\u0082\u0002\u001a\u00030\u0081\u00028\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0082\u0002\u0010\u0083\u0002\u001a\u0006\b\u0084\u0002\u0010\u0085\u0002R \u0010\u0087\u0002\u001a\u00030\u0086\u00028\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0087\u0002\u0010\u0088\u0002\u001a\u0006\b\u0089\u0002\u0010\u008a\u0002R,\u0010\u008c\u0002\u001a\u0005\u0018\u00010\u008b\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008c\u0002\u0010\u008d\u0002\u001a\u0006\b\u008e\u0002\u0010\u008f\u0002\"\u0006\b\u0090\u0002\u0010\u0091\u0002R\u001c\u0010\u0092\u0002\u001a\u0005\u0018\u00010\u0090\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0002\u0010\u0093\u0002R(\u0010\u0094\u0002\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0094\u0002\u0010\u009b\u0001\u001a\u0006\b\u0095\u0002\u0010©\u0001\"\u0005\b\u0096\u0002\u0010nR4\u0010\u0098\u0002\u001a\u00030\u0097\u00022\b\u0010Í\u0001\u001a\u00030\u0097\u00028\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\b\u0098\u0002\u0010\u0099\u0002\u001a\u0006\b\u009a\u0002\u0010\u009b\u0002\"\u0006\b\u009c\u0002\u0010\u009d\u0002R7\u0010\u009e\u0002\u001a\u0010\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\b\u0018\u00010\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u009e\u0002\u0010\u009f\u0002\u001a\u0006\b \u0002\u0010¡\u0002\"\u0006\b¢\u0002\u0010\u008e\u0001R7\u0010£\u0002\u001a\u0010\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\b\u0018\u00010\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b£\u0002\u0010\u009f\u0002\u001a\u0006\b¤\u0002\u0010¡\u0002\"\u0006\b¥\u0002\u0010\u008e\u0001R(\u0010¦\u0002\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b¦\u0002\u0010\u009b\u0001\u001a\u0006\b§\u0002\u0010©\u0001\"\u0005\b¨\u0002\u0010nR*\u0010©\u0002\u001a\u00020\u00152\u0007\u0010¢\u0001\u001a\u00020\u00158\u0016@RX\u0096\u000e¢\u0006\u0010\n\u0006\b©\u0002\u0010\u009b\u0001\u001a\u0006\b©\u0002\u0010©\u0001R\u0018\u0010\u00ad\u0002\u001a\u00030ª\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b«\u0002\u0010¬\u0002R\u001a\u0010°\u0002\u001a\u0005\u0018\u00010\u0090\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b®\u0002\u0010¯\u0002R\u0016\u0010±\u0002\u001a\u0004\u0018\u00010\u00158F¢\u0006\b\u001a\u0006\b±\u0002\u0010²\u0002R\u001d\u0010µ\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000t8@X\u0080\u0004¢\u0006\b\u001a\u0006\b³\u0002\u0010´\u0002R\u001e\u0010¸\u0002\u001a\t\u0012\u0005\u0012\u00030¶\u00020t8@X\u0080\u0004¢\u0006\b\u001a\u0006\b·\u0002\u0010´\u0002R\u001e\u0010º\u0002\u001a\t\u0012\u0005\u0012\u00030¶\u00020t8@X\u0080\u0004¢\u0006\b\u001a\u0006\b¹\u0002\u0010´\u0002R\u001e\u0010½\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000µ\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b»\u0002\u0010¼\u0002R\u001d\u0010¿\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000t8@X\u0080\u0004¢\u0006\b\u001a\u0006\b¾\u0002\u0010´\u0002R\u0019\u0010Á\u0002\u001a\u0004\u0018\u00010\u00008@X\u0080\u0004¢\u0006\b\u001a\u0006\bÀ\u0002\u0010¯\u0001R\u0017\u0010Â\u0002\u001a\u00020\u00158VX\u0096\u0004¢\u0006\b\u001a\u0006\bÂ\u0002\u0010©\u0001R\u0018\u0010Æ\u0002\u001a\u00030Ã\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bÄ\u0002\u0010Å\u0002R\u001f\u0010Ê\u0002\u001a\n\u0018\u00010Ç\u0002R\u00030\u0086\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bÈ\u0002\u0010É\u0002R\u001d\u0010Î\u0002\u001a\b0Ë\u0002R\u00030\u0086\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bÌ\u0002\u0010Í\u0002R\u001a\u0010Ñ\u0002\u001a\u0005\u0018\u00010Ç\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bÏ\u0002\u0010Ð\u0002R%\u0010Ô\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000µ\u00018@X\u0081\u0004¢\u0006\u000f\u0012\u0005\bÓ\u0002\u0010\u0019\u001a\u0006\bÒ\u0002\u0010¼\u0002R\u0017\u0010Õ\u0002\u001a\u00020\u00158VX\u0096\u0004¢\u0006\b\u001a\u0006\bÕ\u0002\u0010©\u0001R\u0017\u0010×\u0002\u001a\u00020\u00158@X\u0080\u0004¢\u0006\b\u001a\u0006\bÖ\u0002\u0010©\u0001R\u0017\u0010Ù\u0002\u001a\u00020\r8VX\u0096\u0004¢\u0006\b\u001a\u0006\bØ\u0002\u0010\u009f\u0001R\u0017\u0010Û\u0002\u001a\u00020\r8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÚ\u0002\u0010\u009f\u0001R\u0017\u0010Ý\u0002\u001a\u00020\u00158@X\u0080\u0004¢\u0006\b\u001a\u0006\bÜ\u0002\u0010©\u0001R\u0018\u0010á\u0002\u001a\u00030Þ\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bß\u0002\u0010à\u0002R\u0017\u0010â\u0002\u001a\u00020\u00158VX\u0096\u0004¢\u0006\b\u001a\u0006\bâ\u0002\u0010©\u0001R\u0014\u0010ã\u0002\u001a\u00020\u00158F¢\u0006\b\u001a\u0006\bã\u0002\u0010©\u0001R\u0017\u0010å\u0002\u001a\u00020\r8@X\u0080\u0004¢\u0006\b\u001a\u0006\bä\u0002\u0010\u009f\u0001R\u0018\u0010ç\u0002\u001a\u00030õ\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bæ\u0002\u0010ù\u0001R\u0018\u0010é\u0002\u001a\u00030õ\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bè\u0002\u0010ù\u0001R\u0018\u0010ë\u0002\u001a\u00030\u0090\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bê\u0002\u0010¯\u0002R\u0018\u0010í\u0002\u001a\u00030\u0090\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bì\u0002\u0010¯\u0002R\u0018\u0010ñ\u0002\u001a\u00030î\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bï\u0002\u0010ð\u0002R\u0017\u0010ó\u0002\u001a\u00020\u00158@X\u0080\u0004¢\u0006\b\u001a\u0006\bò\u0002\u0010©\u0001R\u0017\u0010õ\u0002\u001a\u00020\u00158@X\u0080\u0004¢\u0006\b\u001a\u0006\bô\u0002\u0010©\u0001R\u0017\u0010÷\u0002\u001a\u00020\u00158@X\u0080\u0004¢\u0006\b\u001a\u0006\bö\u0002\u0010©\u0001R\u0017\u0010ù\u0002\u001a\u00020\u00158@X\u0080\u0004¢\u0006\b\u001a\u0006\bø\u0002\u0010©\u0001R\u0019\u0010ü\u0002\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\b\u001a\u0006\bú\u0002\u0010û\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0083\u0003"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "Landroidx/compose/ui/layout/Remeasurement;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/layout/LayoutInfo;", "Landroidx/compose/ui/node/ComposeUiNode;", "Landroidx/compose/ui/node/InteroperableComposeUiNode;", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "Lkotlin/r2;", "recreateUnfoldedChildrenIfDirty", "invalidateUnfoldedVirtualChildren", "child", "onChildRemoved", "", "depth", "", "debugTreeToString", "onDensityOrLayoutDirectionChanged", "resetModifierState", "invalidateFocusOnAttach", "invalidateFocusOnDetach", "", "shouldInvalidateParentLayer", "clearSubtreePlacementIntrinsicsUsage", "updateChildrenIfDirty$ui_release", "()V", "updateChildrenIfDirty", "Lkotlin/Function1;", "block", "forEachChild", "Lkotlin/Function2;", "forEachChildIndexed", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/InteropView;", "getInteropView", "index", "instance", "insertAt$ui_release", "(ILandroidx/compose/ui/node/LayoutNode;)V", "insertAt", "onZSortedChildrenInvalidated$ui_release", "onZSortedChildrenInvalidated", "count", "removeAt$ui_release", "(II)V", "removeAt", "removeAll$ui_release", "removeAll", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "move$ui_release", "(III)V", "move", "invalidateSemantics$ui_release", "invalidateSemantics", "Landroidx/compose/ui/node/Owner;", "owner", "attach$ui_release", "(Landroidx/compose/ui/node/Owner;)V", "attach", "detach$ui_release", "detach", "toString", "invalidateLayer$ui_release", "invalidateLayer", "invalidateParentData$ui_release", "invalidateParentData", "x", "y", "place$ui_release", "place", "replace$ui_release", "replace", "lookaheadReplace$ui_release", "lookaheadReplace", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "draw$ui_release", "(Landroidx/compose/ui/graphics/Canvas;)V", MediationConstant.RIT_TYPE_DRAW, "Landroidx/compose/ui/geometry/Offset;", "pointerPosition", "Landroidx/compose/ui/node/HitTestResult;", "hitTestResult", "isTouchEvent", "isInLayer", "hitTest-M_7yMNQ$ui_release", "(JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "hitTest", "hitSemanticsEntities", "hitTestSemantics-M_7yMNQ$ui_release", "hitTestSemantics", "it", "rescheduleRemeasureOrRelayout$ui_release", "(Landroidx/compose/ui/node/LayoutNode;)V", "rescheduleRemeasureOrRelayout", "forceRequest", "scheduleMeasureAndLayout", "requestRemeasure$ui_release", "(ZZ)V", "requestRemeasure", "requestLookaheadRemeasure$ui_release", "requestLookaheadRemeasure", "invalidateMeasurements$ui_release", "invalidateMeasurements", "Lkotlin/Function0;", "ignoreRemeasureRequests$ui_release", "(Lv3/a;)V", "ignoreRemeasureRequests", "requestRelayout$ui_release", "(Z)V", "requestRelayout", "requestLookaheadRelayout$ui_release", "requestLookaheadRelayout", "dispatchOnPositionedCallbacks$ui_release", "dispatchOnPositionedCallbacks", "", "Landroidx/compose/ui/layout/ModifierInfo;", "getModifierInfo", "invalidateLayers$ui_release", "invalidateLayers", "Landroidx/compose/ui/unit/Constraints;", "constraints", "lookaheadRemeasure-_Sx5XlM$ui_release", "(Landroidx/compose/ui/unit/Constraints;)Z", "lookaheadRemeasure", "remeasure-_Sx5XlM$ui_release", "remeasure", "markLayoutPending$ui_release", "markLayoutPending", "markMeasurePending$ui_release", "markMeasurePending", "markLookaheadLayoutPending$ui_release", "markLookaheadLayoutPending", "isRootOfInvalidation", "invalidateSubtree", "markLookaheadMeasurePending$ui_release", "markLookaheadMeasurePending", "forceRemeasure", "onLayoutComplete", "Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;", "forEachCoordinator$ui_release", "(Lv3/l;)V", "forEachCoordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "forEachCoordinatorIncludingInner$ui_release", "forEachCoordinatorIncludingInner", "clearSubtreeIntrinsicsUsage$ui_release", "clearSubtreeIntrinsicsUsage", "resetSubtreeIntrinsicsUsage$ui_release", "resetSubtreeIntrinsicsUsage", "onReuse", "onDeactivate", "onRelease", "isVirtual", "Z", "semanticsId", "I", "getSemanticsId", "()I", "setSemanticsId", "(I)V", "<set-?>", "compositeKeyHash", "getCompositeKeyHash", "setCompositeKeyHash", "getCompositeKeyHash$annotations", "isVirtualLookaheadRoot", "isVirtualLookaheadRoot$ui_release", "()Z", "setVirtualLookaheadRoot$ui_release", "newRoot", "lookaheadRoot", "Landroidx/compose/ui/node/LayoutNode;", "getLookaheadRoot$ui_release", "()Landroidx/compose/ui/node/LayoutNode;", "setLookaheadRoot", "virtualChildrenCount", "Landroidx/compose/ui/node/MutableVectorWithMutationTracking;", "_foldedChildren", "Landroidx/compose/ui/node/MutableVectorWithMutationTracking;", "Landroidx/compose/runtime/collection/MutableVector;", "_unfoldedChildren", "Landroidx/compose/runtime/collection/MutableVector;", "unfoldedVirtualChildrenListDirty", "_foldedParent", "Landroidx/compose/ui/node/Owner;", "getOwner$ui_release", "()Landroidx/compose/ui/node/Owner;", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroidx/compose/ui/viewinterop/InteropViewFactoryHolder;", "interopViewFactoryHolder", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "getInteropViewFactoryHolder$ui_release", "()Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "setInteropViewFactoryHolder$ui_release", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V", "getDepth$ui_release", "setDepth$ui_release", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "_collapsedSemantics", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "_zSortedChildren", "zSortedChildrenInvalidated", "Landroidx/compose/ui/layout/MeasurePolicy;", b.f22420d, "measurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "getMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "setMeasurePolicy", "(Landroidx/compose/ui/layout/MeasurePolicy;)V", "Landroidx/compose/ui/node/IntrinsicsPolicy;", "intrinsicsPolicy", "Landroidx/compose/ui/node/IntrinsicsPolicy;", "getIntrinsicsPolicy$ui_release", "()Landroidx/compose/ui/node/IntrinsicsPolicy;", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "setViewConfiguration", "(Landroidx/compose/ui/platform/ViewConfiguration;)V", "Landroidx/compose/runtime/CompositionLocalMap;", "compositionLocalMap", "Landroidx/compose/runtime/CompositionLocalMap;", "getCompositionLocalMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "setCompositionLocalMap", "(Landroidx/compose/runtime/CompositionLocalMap;)V", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "intrinsicsUsageByParent", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "getIntrinsicsUsageByParent$ui_release", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "setIntrinsicsUsageByParent$ui_release", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "previousIntrinsicsUsageByParent", "canMultiMeasure", "getCanMultiMeasure$ui_release", "setCanMultiMeasure$ui_release", "getCanMultiMeasure$ui_release$annotations", "Landroidx/compose/ui/node/NodeChain;", "nodes", "Landroidx/compose/ui/node/NodeChain;", "getNodes$ui_release", "()Landroidx/compose/ui/node/NodeChain;", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "layoutDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "getLayoutDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "subcompositionsState", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "getSubcompositionsState$ui_release", "()Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "setSubcompositionsState$ui_release", "(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)V", "_innerLayerCoordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "innerLayerCoordinatorIsDirty", "getInnerLayerCoordinatorIsDirty$ui_release", "setInnerLayerCoordinatorIsDirty$ui_release", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "onAttach", "Lv3/l;", "getOnAttach$ui_release", "()Lv3/l;", "setOnAttach$ui_release", "onDetach", "getOnDetach$ui_release", "setOnDetach$ui_release", "needsOnPositionedDispatch", "getNeedsOnPositionedDispatch$ui_release", "setNeedsOnPositionedDispatch$ui_release", "isDeactivated", "", "getZIndex", "()F", "zIndex", "getInnerLayerCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "innerLayerCoordinator", "isPlacedInLookahead", "()Ljava/lang/Boolean;", "getFoldedChildren$ui_release", "()Ljava/util/List;", "foldedChildren", "Landroidx/compose/ui/layout/Measurable;", "getChildMeasurables$ui_release", "childMeasurables", "getChildLookaheadMeasurables$ui_release", "childLookaheadMeasurables", "get_children$ui_release", "()Landroidx/compose/runtime/collection/MutableVector;", "_children", "getChildren$ui_release", "children", "getParent$ui_release", "parent", "isAttached", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "getLayoutState$ui_release", "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "layoutState", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "getLookaheadPassDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "lookaheadPassDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "getMeasurePassDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "measurePassDelegate", "getCollapsedSemantics$ui_release", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "collapsedSemantics", "getZSortedChildren", "getZSortedChildren$annotations", "zSortedChildren", "isValidOwnerScope", "getHasFixedInnerContentConstraints$ui_release", "hasFixedInnerContentConstraints", "getWidth", "width", "getHeight", "height", "getAlignmentLinesRequired$ui_release", "alignmentLinesRequired", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "getMDrawScope$ui_release", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "mDrawScope", "isPlaced", "isPlacedByParent", "getPlaceOrder$ui_release", "placeOrder", "getMeasuredByParent$ui_release", "measuredByParent", "getMeasuredByParentInLookahead$ui_release", "measuredByParentInLookahead", "getInnerCoordinator$ui_release", "innerCoordinator", "getOuterCoordinator$ui_release", "outerCoordinator", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "getMeasurePending$ui_release", "measurePending", "getLayoutPending$ui_release", "layoutPending", "getLookaheadMeasurePending$ui_release", "lookaheadMeasurePending", "getLookaheadLayoutPending$ui_release", "lookaheadLayoutPending", "getParentInfo", "()Landroidx/compose/ui/layout/LayoutInfo;", "parentInfo", "<init>", "(ZI)V", "Companion", "LayoutState", "NoIntrinsicsMeasurePolicy", "UsageByParent", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLayoutNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 8 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 9 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 10 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 11 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 12 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n+ 13 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n*L\n1#1,1477:1\n1247#1,7:1484\n1247#1,7:1556\n1072#1,2:1564\n1074#1,2:1578\n197#1:1581\n1235#1,7:1964\n197#1:2139\n197#1:2151\n197#1:2163\n1247#1,7:2175\n1208#2:1478\n1187#2,2:1479\n1208#2:1481\n1187#2,2:1482\n1208#2:1491\n1187#2,2:1492\n1208#2:1627\n1187#2,2:1628\n1208#2:1691\n1187#2,2:1692\n1208#2:1765\n1187#2,2:1766\n1208#2:1861\n1187#2,2:1862\n1208#2:1925\n1187#2,2:1926\n1208#2:2007\n1187#2,2:2008\n1208#2:2092\n1187#2,2:2093\n48#3:1494\n48#3:1529\n48#3:1544\n48#3:1566\n460#4,7:1495\n146#4:1502\n467#4,4:1503\n460#4,11:1507\n476#4,11:1518\n460#4,11:1530\n460#4,11:1545\n460#4,11:1567\n146#4:1580\n460#4,11:1582\n460#4,11:2046\n460#4,11:2140\n460#4,11:2152\n460#4,11:2164\n76#5:1541\n76#5:1543\n76#5:1563\n78#5:1593\n78#5:1656\n101#5:1730\n88#5:1804\n90#5,3:1805\n94#5:1809\n90#5:1814\n92#5,3:1816\n90#5:1822\n86#5:1889\n86#5:1909\n72#5:1971\n72#5:1991\n84#5:2057\n74#5:2126\n72#5:2127\n72#5:2131\n72#5:2133\n74#5:2134\n1#6:1542\n702#7,8:1594\n725#7,3:1602\n710#7,2:1605\n713#7,2:1650\n728#7,3:1652\n715#7:1655\n702#7,8:1657\n725#7,3:1665\n710#7,2:1668\n703#7:1670\n704#7,11:1714\n728#7,3:1725\n715#7:1728\n705#7:1729\n702#7,8:1731\n725#7,3:1739\n710#7,2:1742\n703#7:1744\n704#7,11:1788\n728#7,3:1799\n715#7:1802\n705#7:1803\n725#7,3:1811\n728#7,3:1819\n741#7,18:1823\n759#7,3:1884\n753#7:1887\n744#7:1888\n702#7,8:1890\n725#7,3:1898\n710#7,2:1901\n703#7:1903\n704#7,11:1948\n728#7,3:1959\n715#7:1962\n705#7:1963\n702#7,8:1972\n725#7,3:1980\n710#7,2:1983\n703#7:1985\n704#7,11:2030\n728#7,3:2041\n715#7:2044\n705#7:2045\n725#7,3:2128\n728#7,3:2136\n385#8,6:1607\n395#8,2:1614\n397#8,8:1619\n405#8,9:1630\n414#8,8:1642\n385#8,6:1671\n395#8,2:1678\n397#8,8:1683\n405#8,9:1694\n414#8,8:1706\n385#8,6:1745\n395#8,2:1752\n397#8,8:1757\n405#8,9:1768\n414#8,8:1780\n385#8,6:1841\n395#8,2:1848\n397#8,8:1853\n405#8,9:1864\n414#8,8:1876\n385#8,5:1904\n390#8:1910\n395#8,2:1912\n397#8,8:1917\n405#8,9:1928\n414#8,8:1940\n385#8,5:1986\n390#8:1992\n395#8,2:1994\n397#8,8:1999\n405#8,9:2010\n414#8,8:2022\n385#8,6:2072\n395#8,2:2079\n397#8,8:2084\n405#8,9:2095\n414#8,8:2107\n261#9:1613\n261#9:1677\n261#9:1751\n261#9:1815\n261#9:1847\n261#9:1911\n261#9:1993\n261#9:2078\n261#9:2132\n261#9:2135\n234#10,3:1616\n237#10,3:1639\n234#10,3:1680\n237#10,3:1703\n234#10,3:1754\n237#10,3:1777\n234#10,3:1850\n237#10,3:1873\n234#10,3:1914\n237#10,3:1937\n234#10,3:1996\n237#10,3:2019\n234#10,3:2081\n237#10,3:2104\n47#11:1808\n52#12:1810\n106#13:2058\n95#13,13:2059\n108#13:2115\n100#13,10:2116\n*S KotlinDebug\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n114#1:1484,7\n490#1:1556,7\n524#1:1564,2\n524#1:1578,2\n593#1:1581\n1115#1:1964,7\n1283#1:2139\n1305#1:2151\n1317#1:2163\n1363#1:2175,7\n128#1:1478\n128#1:1479,2\n539#1:1481\n539#1:1482,2\n140#1:1491\n140#1:1492,2\n656#1:1627\n656#1:1628,2\n678#1:1691\n678#1:1692,2\n690#1:1765\n690#1:1766,2\n1063#1:1861\n1063#1:1862,2\n1099#1:1925\n1099#1:1926,2\n1197#1:2007\n1197#1:2008,2\n1226#1:2092\n1226#1:2093,2\n144#1:1494\n368#1:1529\n480#1:1544\n525#1:1566\n144#1:1495,7\n146#1:1502\n144#1:1503,4\n197#1:1507,11\n199#1:1518,11\n368#1:1530,11\n480#1:1545,11\n525#1:1567,11\n555#1:1580\n593#1:1582,11\n1201#1:2046,11\n1283#1:2140,11\n1305#1:2152,11\n1317#1:2164,11\n416#1:1541\n463#1:1543\n520#1:1563\n656#1:1593\n678#1:1656\n690#1:1730\n856#1:1804\n1053#1:1805,3\n1053#1:1809\n1055#1:1814\n1055#1:1816,3\n1063#1:1822\n1099#1:1889\n1100#1:1909\n1197#1:1971\n1198#1:1991\n1226#1:2057\n1256#1:2126\n1256#1:2127\n1258#1:2131\n1259#1:2133\n1263#1:2134\n656#1:1594,8\n656#1:1602,3\n656#1:1605,2\n656#1:1650,2\n656#1:1652,3\n656#1:1655\n678#1:1657,8\n678#1:1665,3\n678#1:1668,2\n678#1:1670\n678#1:1714,11\n678#1:1725,3\n678#1:1728\n678#1:1729\n690#1:1731,8\n690#1:1739,3\n690#1:1742,2\n690#1:1744\n690#1:1788,11\n690#1:1799,3\n690#1:1802\n690#1:1803\n1054#1:1811,3\n1054#1:1819,3\n1063#1:1823,18\n1063#1:1884,3\n1063#1:1887\n1063#1:1888\n1099#1:1890,8\n1099#1:1898,3\n1099#1:1901,2\n1099#1:1903\n1099#1:1948,11\n1099#1:1959,3\n1099#1:1962\n1099#1:1963\n1197#1:1972,8\n1197#1:1980,3\n1197#1:1983,2\n1197#1:1985\n1197#1:2030,11\n1197#1:2041,3\n1197#1:2044\n1197#1:2045\n1257#1:2128,3\n1257#1:2136,3\n656#1:1607,6\n656#1:1614,2\n656#1:1619,8\n656#1:1630,9\n656#1:1642,8\n678#1:1671,6\n678#1:1678,2\n678#1:1683,8\n678#1:1694,9\n678#1:1706,8\n690#1:1745,6\n690#1:1752,2\n690#1:1757,8\n690#1:1768,9\n690#1:1780,8\n1063#1:1841,6\n1063#1:1848,2\n1063#1:1853,8\n1063#1:1864,9\n1063#1:1876,8\n1099#1:1904,5\n1099#1:1910\n1099#1:1912,2\n1099#1:1917,8\n1099#1:1928,9\n1099#1:1940,8\n1197#1:1986,5\n1197#1:1992\n1197#1:1994,2\n1197#1:1999,8\n1197#1:2010,9\n1197#1:2022,8\n1226#1:2072,6\n1226#1:2079,2\n1226#1:2084,8\n1226#1:2095,9\n1226#1:2107,8\n656#1:1613\n678#1:1677\n690#1:1751\n1055#1:1815\n1063#1:1847\n1099#1:1911\n1197#1:1993\n1226#1:2078\n1258#1:2132\n1263#1:2135\n656#1:1616,3\n656#1:1639,3\n678#1:1680,3\n678#1:1703,3\n690#1:1754,3\n690#1:1777,3\n1063#1:1850,3\n1063#1:1873,3\n1099#1:1914,3\n1099#1:1937,3\n1197#1:1996,3\n1197#1:2019,3\n1226#1:2081,3\n1226#1:2104,3\n1053#1:1808\n1053#1:1810\n1226#1:2058\n1226#1:2059,13\n1226#1:2115\n1226#1:2116,10\n*E\n"})
/* loaded from: classes.dex */
public final class LayoutNode implements ComposeNodeLifecycleCallback, Remeasurement, OwnerScope, LayoutInfo, ComposeUiNode, InteroperableComposeUiNode, Owner.OnLayoutCompletedListener {
    public static final int NotPlacedPlaceOrder = Integer.MAX_VALUE;

    @m
    private SemanticsConfiguration _collapsedSemantics;

    @l
    private final MutableVectorWithMutationTracking<LayoutNode> _foldedChildren;

    @m
    private LayoutNode _foldedParent;

    @m
    private NodeCoordinator _innerLayerCoordinator;

    @m
    private MutableVector<LayoutNode> _unfoldedChildren;

    @l
    private final MutableVector<LayoutNode> _zSortedChildren;
    private boolean canMultiMeasure;
    private int compositeKeyHash;

    @l
    private CompositionLocalMap compositionLocalMap;

    @l
    private Density density;
    private int depth;
    private boolean ignoreRemeasureRequests;
    private boolean innerLayerCoordinatorIsDirty;

    @m
    private AndroidViewHolder interopViewFactoryHolder;

    @l
    private final IntrinsicsPolicy intrinsicsPolicy;

    @l
    private UsageByParent intrinsicsUsageByParent;
    private boolean isDeactivated;
    private final boolean isVirtual;
    private boolean isVirtualLookaheadRoot;

    @l
    private final LayoutNodeLayoutDelegate layoutDelegate;

    @l
    private LayoutDirection layoutDirection;

    @m
    private LayoutNode lookaheadRoot;

    @l
    private MeasurePolicy measurePolicy;

    @l
    private Modifier modifier;
    private boolean needsOnPositionedDispatch;

    @l
    private final NodeChain nodes;

    @m
    private v3.l<? super Owner, r2> onAttach;

    @m
    private v3.l<? super Owner, r2> onDetach;

    @m
    private Owner owner;

    @l
    private UsageByParent previousIntrinsicsUsageByParent;
    private int semanticsId;

    @m
    private LayoutNodeSubcompositionsState subcompositionsState;
    private boolean unfoldedVirtualChildrenListDirty;

    @l
    private ViewConfiguration viewConfiguration;
    private int virtualChildrenCount;
    private boolean zSortedChildrenInvalidated;

    @l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @l
    private static final NoIntrinsicsMeasurePolicy ErrorMeasurePolicy = new NoIntrinsicsMeasurePolicy() { // from class: androidx.compose.ui.node.LayoutNode$Companion$ErrorMeasurePolicy$1
        @Override // androidx.compose.ui.layout.MeasurePolicy
        /* renamed from: measure-3p2s80s */
        public /* bridge */ /* synthetic */ MeasureResult mo30measure3p2s80s(MeasureScope measureScope, List list, long j5) {
            return (MeasureResult) m5132measure3p2s80s(measureScope, (List<? extends Measurable>) list, j5);
        }

        @l
        /* renamed from: measure-3p2s80s, reason: not valid java name */
        public Void m5132measure3p2s80s(@l MeasureScope measureScope, @l List<? extends Measurable> list, long j5) {
            throw new IllegalStateException("Undefined measure and it is required".toString());
        }
    };

    @l
    private static final v3.a<LayoutNode> Constructor = LayoutNode$Companion$Constructor$1.INSTANCE;

    @l
    private static final ViewConfiguration DummyViewConfiguration = new ViewConfiguration() { // from class: androidx.compose.ui.node.LayoutNode$Companion$DummyViewConfiguration$1
        @Override // androidx.compose.ui.platform.ViewConfiguration
        public long getDoubleTapMinTimeMillis() {
            return 40L;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public long getDoubleTapTimeoutMillis() {
            return 300L;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public long getLongPressTimeoutMillis() {
            return 400L;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        /* renamed from: getMinimumTouchTargetSize-MYxV2XQ, reason: not valid java name */
        public long mo5131getMinimumTouchTargetSizeMYxV2XQ() {
            return DpSize.Companion.m6152getZeroMYxV2XQ();
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public float getTouchSlop() {
            return 16.0f;
        }
    };

    @l
    private static final Comparator<LayoutNode> ZComparator = new Comparator() { // from class: androidx.compose.ui.node.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int ZComparator$lambda$39;
            ZComparator$lambda$39 = LayoutNode.ZComparator$lambda$39((LayoutNode) obj, (LayoutNode) obj2);
            return ZComparator$lambda$39;
        }
    };

    @i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$Companion;", "", "Lkotlin/Function0;", "Landroidx/compose/ui/node/LayoutNode;", "Constructor", "Lv3/a;", "getConstructor$ui_release", "()Lv3/a;", "Landroidx/compose/ui/platform/ViewConfiguration;", "DummyViewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getDummyViewConfiguration$ui_release", "()Landroidx/compose/ui/platform/ViewConfiguration;", "Ljava/util/Comparator;", "ZComparator", "Ljava/util/Comparator;", "getZComparator$ui_release", "()Ljava/util/Comparator;", "Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "ErrorMeasurePolicy", "Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "", "NotPlacedPlaceOrder", "I", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final v3.a<LayoutNode> getConstructor$ui_release() {
            return LayoutNode.Constructor;
        }

        @l
        public final ViewConfiguration getDummyViewConfiguration$ui_release() {
            return LayoutNode.DummyViewConfiguration;
        }

        @l
        public final Comparator<LayoutNode> getZComparator$ui_release() {
            return LayoutNode.ZComparator;
        }
    }

    @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$LayoutState;", "", "(Ljava/lang/String;I)V", "Measuring", "LookaheadMeasuring", "LayingOut", "LookaheadLayingOut", "Idle", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public enum LayoutState {
        Measuring,
        LookaheadMeasuring,
        LayingOut,
        LookaheadLayingOut,
        Idle
    }

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\r\u001a\u00020\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\"\u0010\u000f\u001a\u00020\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\u0010\u001a\u00020\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000e\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", d.U, "", "(Ljava/lang/String;)V", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "", "maxIntrinsicWidth", "height", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static abstract class NoIntrinsicsMeasurePolicy implements MeasurePolicy {
        public static final int $stable = 0;

        @l
        private final String error;

        public NoIntrinsicsMeasurePolicy(@l String str) {
            this.error = str;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i5) {
            return ((Number) m5133maxIntrinsicHeight(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i5)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i5) {
            return ((Number) m5134maxIntrinsicWidth(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i5)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i5) {
            return ((Number) m5135minIntrinsicHeight(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i5)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i5) {
            return ((Number) m5136minIntrinsicWidth(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i5)).intValue();
        }

        @l
        /* renamed from: maxIntrinsicHeight */
        public Void m5133maxIntrinsicHeight(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i5) {
            throw new IllegalStateException(this.error.toString());
        }

        @l
        /* renamed from: maxIntrinsicWidth */
        public Void m5134maxIntrinsicWidth(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i5) {
            throw new IllegalStateException(this.error.toString());
        }

        @l
        /* renamed from: minIntrinsicHeight */
        public Void m5135minIntrinsicHeight(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i5) {
            throw new IllegalStateException(this.error.toString());
        }

        @l
        /* renamed from: minIntrinsicWidth */
        public Void m5136minIntrinsicWidth(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i5) {
            throw new IllegalStateException(this.error.toString());
        }
    }

    @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "", "(Ljava/lang/String;I)V", "InMeasureBlock", "InLayoutBlock", "NotUsed", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public enum UsageByParent {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutState.values().length];
            try {
                iArr[LayoutState.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LayoutNode() {
        this(false, 0, 3, null);
    }

    public LayoutNode(boolean z4, int i5) {
        Density density;
        this.isVirtual = z4;
        this.semanticsId = i5;
        this._foldedChildren = new MutableVectorWithMutationTracking<>(new MutableVector(new LayoutNode[16], 0), new LayoutNode$_foldedChildren$1(this));
        this._zSortedChildren = new MutableVector<>(new LayoutNode[16], 0);
        this.zSortedChildrenInvalidated = true;
        this.measurePolicy = ErrorMeasurePolicy;
        this.intrinsicsPolicy = new IntrinsicsPolicy(this);
        density = LayoutNodeKt.DefaultDensity;
        this.density = density;
        this.layoutDirection = LayoutDirection.Ltr;
        this.viewConfiguration = DummyViewConfiguration;
        this.compositionLocalMap = CompositionLocalMap.Companion.getEmpty();
        UsageByParent usageByParent = UsageByParent.NotUsed;
        this.intrinsicsUsageByParent = usageByParent;
        this.previousIntrinsicsUsageByParent = usageByParent;
        this.nodes = new NodeChain(this);
        this.layoutDelegate = new LayoutNodeLayoutDelegate(this);
        this.innerLayerCoordinatorIsDirty = true;
        this.modifier = Modifier.Companion;
    }

    public static final int ZComparator$lambda$39(LayoutNode layoutNode, LayoutNode layoutNode2) {
        boolean z4;
        if (layoutNode.getZIndex() == layoutNode2.getZIndex()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return l0.t(layoutNode.getPlaceOrder$ui_release(), layoutNode2.getPlaceOrder$ui_release());
        }
        return Float.compare(layoutNode.getZIndex(), layoutNode2.getZIndex());
    }

    public static final /* synthetic */ void access$setIgnoreRemeasureRequests$p(LayoutNode layoutNode, boolean z4) {
        layoutNode.ignoreRemeasureRequests = z4;
    }

    private final void clearSubtreePlacementIntrinsicsUsage() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i5 = 0;
            do {
                LayoutNode layoutNode = content[i5];
                if (layoutNode.intrinsicsUsageByParent == UsageByParent.InLayoutBlock) {
                    layoutNode.clearSubtreePlacementIntrinsicsUsage();
                }
                i5++;
            } while (i5 < size);
        }
    }

    private final String debugTreeToString(int i5) {
        StringBuilder sb = new StringBuilder();
        for (int i6 = 0; i6 < i5; i6++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i7 = 0;
            do {
                sb.append(content[i7].debugTreeToString(i5 + 1));
                i7++;
            } while (i7 < size);
        }
        String sb2 = sb.toString();
        if (i5 == 0) {
            String substring = sb2.substring(0, sb2.length() - 1);
            l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return sb2;
    }

    static /* synthetic */ String debugTreeToString$default(LayoutNode layoutNode, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = 0;
        }
        return layoutNode.debugTreeToString(i5);
    }

    @k(message = "Temporary API to support ConstraintLayout prototyping.")
    public static /* synthetic */ void getCanMultiMeasure$ui_release$annotations() {
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getCompositeKeyHash$annotations() {
    }

    private final NodeCoordinator getInnerLayerCoordinator() {
        OwnedLayer ownedLayer;
        if (this.innerLayerCoordinatorIsDirty) {
            NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
            NodeCoordinator wrappedBy$ui_release = getOuterCoordinator$ui_release().getWrappedBy$ui_release();
            this._innerLayerCoordinator = null;
            while (true) {
                if (l0.g(innerCoordinator$ui_release, wrappedBy$ui_release)) {
                    break;
                }
                if (innerCoordinator$ui_release != null) {
                    ownedLayer = innerCoordinator$ui_release.getLayer();
                } else {
                    ownedLayer = null;
                }
                if (ownedLayer != null) {
                    this._innerLayerCoordinator = innerCoordinator$ui_release;
                    break;
                }
                if (innerCoordinator$ui_release != null) {
                    innerCoordinator$ui_release = innerCoordinator$ui_release.getWrappedBy$ui_release();
                } else {
                    innerCoordinator$ui_release = null;
                }
            }
        }
        NodeCoordinator nodeCoordinator = this._innerLayerCoordinator;
        if (nodeCoordinator != null && nodeCoordinator.getLayer() == null) {
            throw new IllegalStateException("layer was not set".toString());
        }
        return nodeCoordinator;
    }

    private final float getZIndex() {
        return getMeasurePassDelegate$ui_release().getZIndex$ui_release();
    }

    @a1
    public static /* synthetic */ void getZSortedChildren$annotations() {
    }

    /* renamed from: hitTest-M_7yMNQ$ui_release$default */
    public static /* synthetic */ void m5123hitTestM_7yMNQ$ui_release$default(LayoutNode layoutNode, long j5, HitTestResult hitTestResult, boolean z4, boolean z5, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        boolean z6 = z4;
        if ((i5 & 8) != 0) {
            z5 = true;
        }
        layoutNode.m5127hitTestM_7yMNQ$ui_release(j5, hitTestResult, z6, z5);
    }

    private final void invalidateFocusOnAttach() {
        boolean z4;
        boolean z5;
        if (this.nodes.has$ui_release(NodeKind.m5204constructorimpl(1024) | NodeKind.m5204constructorimpl(2048) | NodeKind.m5204constructorimpl(4096))) {
            for (Modifier.Node head$ui_release = this.nodes.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                boolean z6 = true;
                if ((NodeKind.m5204constructorimpl(1024) & head$ui_release.getKindSet$ui_release()) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if ((NodeKind.m5204constructorimpl(2048) & head$ui_release.getKindSet$ui_release()) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean z7 = z4 | z5;
                if ((NodeKind.m5204constructorimpl(4096) & head$ui_release.getKindSet$ui_release()) == 0) {
                    z6 = false;
                }
                if (z7 | z6) {
                    NodeKindKt.autoInvalidateInsertedNode(head$ui_release);
                }
            }
        }
    }

    private final void invalidateFocusOnDetach() {
        boolean z4;
        boolean z5;
        NodeChain nodeChain = this.nodes;
        int m5204constructorimpl = NodeKind.m5204constructorimpl(1024);
        if ((nodeChain.getAggregateChildKindSet() & m5204constructorimpl) != 0) {
            for (Modifier.Node tail$ui_release = nodeChain.getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
                if ((tail$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                    Modifier.Node node = tail$ui_release;
                    MutableVector mutableVector = null;
                    while (node != null) {
                        if (node instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) node;
                            if (focusTargetNode.getFocusState().isFocused()) {
                                LayoutNodeKt.requireOwner(this).getFocusOwner().clearFocus(true, false);
                                focusTargetNode.scheduleInvalidationForFocusEvents$ui_release();
                            }
                        } else {
                            if ((node.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4 && (node instanceof DelegatingNode)) {
                                int i5 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z5) {
                                        i5++;
                                        if (i5 == 1) {
                                            node = delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                mutableVector.add(node);
                                                node = null;
                                            }
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                        }
                        node = DelegatableNodeKt.pop(mutableVector);
                    }
                }
            }
        }
    }

    public static /* synthetic */ void invalidateSubtree$default(LayoutNode layoutNode, boolean z4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = true;
        }
        layoutNode.invalidateSubtree(z4);
    }

    private final void invalidateUnfoldedVirtualChildren() {
        LayoutNode layoutNode;
        if (this.virtualChildrenCount > 0) {
            this.unfoldedVirtualChildrenListDirty = true;
        }
        if (this.isVirtual && (layoutNode = this._foldedParent) != null) {
            layoutNode.invalidateUnfoldedVirtualChildren();
        }
    }

    /* renamed from: lookaheadRemeasure-_Sx5XlM$ui_release$default */
    public static /* synthetic */ boolean m5125lookaheadRemeasure_Sx5XlM$ui_release$default(LayoutNode layoutNode, Constraints constraints, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            constraints = layoutNode.layoutDelegate.m5144getLastLookaheadConstraintsDWUhwKw();
        }
        return layoutNode.m5129lookaheadRemeasure_Sx5XlM$ui_release(constraints);
    }

    private final void onChildRemoved(LayoutNode layoutNode) {
        if (layoutNode.layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            this.layoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(r0.getChildrenAccessingCoordinatesDuringPlacement() - 1);
        }
        if (this.owner != null) {
            layoutNode.detach$ui_release();
        }
        layoutNode._foldedParent = null;
        layoutNode.getOuterCoordinator$ui_release().setWrappedBy$ui_release(null);
        if (layoutNode.isVirtual) {
            this.virtualChildrenCount--;
            MutableVector<LayoutNode> vector = layoutNode._foldedChildren.getVector();
            int size = vector.getSize();
            if (size > 0) {
                LayoutNode[] content = vector.getContent();
                int i5 = 0;
                do {
                    content[i5].getOuterCoordinator$ui_release().setWrappedBy$ui_release(null);
                    i5++;
                } while (i5 < size);
            }
        }
        invalidateUnfoldedVirtualChildren();
        onZSortedChildrenInvalidated$ui_release();
    }

    private final void onDensityOrLayoutDirectionChanged() {
        invalidateMeasurements$ui_release();
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
        invalidateLayers$ui_release();
    }

    private final void recreateUnfoldedChildrenIfDirty() {
        if (this.unfoldedVirtualChildrenListDirty) {
            int i5 = 0;
            this.unfoldedVirtualChildrenListDirty = false;
            MutableVector<LayoutNode> mutableVector = this._unfoldedChildren;
            if (mutableVector == null) {
                mutableVector = new MutableVector<>(new LayoutNode[16], 0);
                this._unfoldedChildren = mutableVector;
            }
            mutableVector.clear();
            MutableVector<LayoutNode> vector = this._foldedChildren.getVector();
            int size = vector.getSize();
            if (size > 0) {
                LayoutNode[] content = vector.getContent();
                do {
                    LayoutNode layoutNode = content[i5];
                    if (layoutNode.isVirtual) {
                        mutableVector.addAll(mutableVector.getSize(), layoutNode.get_children$ui_release());
                    } else {
                        mutableVector.add(layoutNode);
                    }
                    i5++;
                } while (i5 < size);
            }
            this.layoutDelegate.markChildrenDirty();
        }
    }

    /* renamed from: remeasure-_Sx5XlM$ui_release$default */
    public static /* synthetic */ boolean m5126remeasure_Sx5XlM$ui_release$default(LayoutNode layoutNode, Constraints constraints, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            constraints = layoutNode.layoutDelegate.m5143getLastConstraintsDWUhwKw();
        }
        return layoutNode.m5130remeasure_Sx5XlM$ui_release(constraints);
    }

    public static /* synthetic */ void requestLookaheadRelayout$ui_release$default(LayoutNode layoutNode, boolean z4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = false;
        }
        layoutNode.requestLookaheadRelayout$ui_release(z4);
    }

    public static /* synthetic */ void requestLookaheadRemeasure$ui_release$default(LayoutNode layoutNode, boolean z4, boolean z5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = false;
        }
        if ((i5 & 2) != 0) {
            z5 = true;
        }
        layoutNode.requestLookaheadRemeasure$ui_release(z4, z5);
    }

    public static /* synthetic */ void requestRelayout$ui_release$default(LayoutNode layoutNode, boolean z4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = false;
        }
        layoutNode.requestRelayout$ui_release(z4);
    }

    public static /* synthetic */ void requestRemeasure$ui_release$default(LayoutNode layoutNode, boolean z4, boolean z5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = false;
        }
        if ((i5 & 2) != 0) {
            z5 = true;
        }
        layoutNode.requestRemeasure$ui_release(z4, z5);
    }

    private final void resetModifierState() {
        this.nodes.resetState$ui_release();
    }

    private final void setLookaheadRoot(LayoutNode layoutNode) {
        if (!l0.g(layoutNode, this.lookaheadRoot)) {
            this.lookaheadRoot = layoutNode;
            if (layoutNode != null) {
                this.layoutDelegate.ensureLookaheadDelegateCreated$ui_release();
                NodeCoordinator wrapped$ui_release = getInnerCoordinator$ui_release().getWrapped$ui_release();
                for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !l0.g(outerCoordinator$ui_release, wrapped$ui_release) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release()) {
                    outerCoordinator$ui_release.ensureLookaheadDelegateCreated();
                }
            }
            invalidateMeasurements$ui_release();
        }
    }

    private final boolean shouldInvalidateParentLayer() {
        boolean z4;
        if (this.nodes.m5167hasH91voCI$ui_release(NodeKind.m5204constructorimpl(4)) && !this.nodes.m5167hasH91voCI$ui_release(NodeKind.m5204constructorimpl(2))) {
            return true;
        }
        for (Modifier.Node head$ui_release = this.nodes.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
            boolean z5 = false;
            if ((NodeKind.m5204constructorimpl(2) & head$ui_release.getKindSet$ui_release()) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4 && DelegatableNodeKt.m5101requireCoordinator64DMado(head$ui_release, NodeKind.m5204constructorimpl(2)).getLayer() != null) {
                return false;
            }
            if ((NodeKind.m5204constructorimpl(4) & head$ui_release.getKindSet$ui_release()) != 0) {
                z5 = true;
            }
            if (z5) {
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void attach$ui_release(@p4.l androidx.compose.ui.node.Owner r7) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNode.attach$ui_release(androidx.compose.ui.node.Owner):void");
    }

    public final void clearSubtreeIntrinsicsUsage$ui_release() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i5 = 0;
            do {
                LayoutNode layoutNode = content[i5];
                if (layoutNode.intrinsicsUsageByParent != UsageByParent.NotUsed) {
                    layoutNode.clearSubtreeIntrinsicsUsage$ui_release();
                }
                i5++;
            } while (i5 < size);
        }
    }

    public final void detach$ui_release() {
        Owner owner = this.owner;
        String str = null;
        if (owner == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot detach node that is already detached!  Tree: ");
            LayoutNode parent$ui_release = getParent$ui_release();
            if (parent$ui_release != null) {
                str = debugTreeToString$default(parent$ui_release, 0, 1, null);
            }
            sb.append(str);
            throw new IllegalStateException(sb.toString().toString());
        }
        invalidateFocusOnDetach();
        LayoutNode parent$ui_release2 = getParent$ui_release();
        if (parent$ui_release2 != null) {
            parent$ui_release2.invalidateLayer$ui_release();
            parent$ui_release2.invalidateMeasurements$ui_release();
            LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate$ui_release = getMeasurePassDelegate$ui_release();
            UsageByParent usageByParent = UsageByParent.NotUsed;
            measurePassDelegate$ui_release.setMeasuredByParent$ui_release(usageByParent);
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
            if (lookaheadPassDelegate$ui_release != null) {
                lookaheadPassDelegate$ui_release.setMeasuredByParent$ui_release(usageByParent);
            }
        }
        this.layoutDelegate.resetAlignmentLines();
        v3.l<? super Owner, r2> lVar = this.onDetach;
        if (lVar != null) {
            lVar.invoke(owner);
        }
        if (this.nodes.m5167hasH91voCI$ui_release(NodeKind.m5204constructorimpl(8))) {
            invalidateSemantics$ui_release();
        }
        this.nodes.runDetachLifecycle$ui_release();
        this.ignoreRemeasureRequests = true;
        MutableVector<LayoutNode> vector = this._foldedChildren.getVector();
        int size = vector.getSize();
        if (size > 0) {
            LayoutNode[] content = vector.getContent();
            int i5 = 0;
            do {
                content[i5].detach$ui_release();
                i5++;
            } while (i5 < size);
        }
        this.ignoreRemeasureRequests = false;
        this.nodes.markAsDetached$ui_release();
        owner.onDetach(this);
        this.owner = null;
        setLookaheadRoot(null);
        this.depth = 0;
        getMeasurePassDelegate$ui_release().onNodeDetached();
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release2 = getLookaheadPassDelegate$ui_release();
        if (lookaheadPassDelegate$ui_release2 != null) {
            lookaheadPassDelegate$ui_release2.onNodeDetached();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void dispatchOnPositionedCallbacks$ui_release() {
        boolean z4;
        boolean z5;
        if (getLayoutState$ui_release() != LayoutState.Idle || getLayoutPending$ui_release() || getMeasurePending$ui_release() || isDeactivated() || !isPlaced()) {
            return;
        }
        NodeChain nodeChain = this.nodes;
        int m5204constructorimpl = NodeKind.m5204constructorimpl(256);
        if ((nodeChain.getAggregateChildKindSet() & m5204constructorimpl) != 0) {
            for (Modifier.Node head$ui_release = nodeChain.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                if ((head$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                    DelegatingNode delegatingNode = head$ui_release;
                    MutableVector mutableVector = null;
                    while (delegatingNode != 0) {
                        if (delegatingNode instanceof GlobalPositionAwareModifierNode) {
                            GlobalPositionAwareModifierNode globalPositionAwareModifierNode = (GlobalPositionAwareModifierNode) delegatingNode;
                            globalPositionAwareModifierNode.onGloballyPositioned(DelegatableNodeKt.m5101requireCoordinator64DMado(globalPositionAwareModifierNode, NodeKind.m5204constructorimpl(256)));
                        } else {
                            if ((delegatingNode.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4 && (delegatingNode instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                int i5 = 0;
                                delegatingNode = delegatingNode;
                                while (delegate$ui_release != null) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z5) {
                                        i5++;
                                        if (i5 == 1) {
                                            delegatingNode = delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNode != 0) {
                                                mutableVector.add(delegatingNode);
                                                delegatingNode = 0;
                                            }
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                    delegatingNode = delegatingNode;
                                }
                                if (i5 == 1) {
                                }
                            }
                        }
                        delegatingNode = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & m5204constructorimpl) == 0) {
                    return;
                }
            }
        }
    }

    public final void draw$ui_release(@l Canvas canvas) {
        getOuterCoordinator$ui_release().draw(canvas);
    }

    public final void forEachChild(@l v3.l<? super LayoutNode, r2> lVar) {
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i5 = 0;
            do {
                lVar.invoke(content[i5]);
                i5++;
            } while (i5 < size);
        }
    }

    public final void forEachChildIndexed(@l p<? super Integer, ? super LayoutNode, r2> pVar) {
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i5 = 0;
            do {
                pVar.invoke(Integer.valueOf(i5), content[i5]);
                i5++;
            } while (i5 < size);
        }
    }

    public final void forEachCoordinator$ui_release(@l v3.l<? super LayoutModifierNodeCoordinator, r2> lVar) {
        NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release();
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        while (outerCoordinator$ui_release != innerCoordinator$ui_release) {
            l0.n(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) outerCoordinator$ui_release;
            lVar.invoke(layoutModifierNodeCoordinator);
            outerCoordinator$ui_release = layoutModifierNodeCoordinator.getWrapped$ui_release();
        }
    }

    public final void forEachCoordinatorIncludingInner$ui_release(@l v3.l<? super NodeCoordinator, r2> lVar) {
        NodeCoordinator wrapped$ui_release = getInnerCoordinator$ui_release().getWrapped$ui_release();
        for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !l0.g(outerCoordinator$ui_release, wrapped$ui_release) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release()) {
            lVar.invoke(outerCoordinator$ui_release);
        }
    }

    @Override // androidx.compose.ui.layout.Remeasurement
    public void forceRemeasure() {
        if (this.lookaheadRoot != null) {
            requestLookaheadRemeasure$ui_release$default(this, false, false, 1, null);
        } else {
            requestRemeasure$ui_release$default(this, false, false, 1, null);
        }
        Constraints m5143getLastConstraintsDWUhwKw = this.layoutDelegate.m5143getLastConstraintsDWUhwKw();
        if (m5143getLastConstraintsDWUhwKw != null) {
            Owner owner = this.owner;
            if (owner != null) {
                owner.mo5260measureAndLayout0kLqBqw(this, m5143getLastConstraintsDWUhwKw.m6006unboximpl());
                return;
            }
            return;
        }
        Owner owner2 = this.owner;
        if (owner2 != null) {
            Owner.measureAndLayout$default(owner2, false, 1, null);
        }
    }

    public final boolean getAlignmentLinesRequired$ui_release() {
        boolean z4;
        AlignmentLines alignmentLines;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
        if (layoutNodeLayoutDelegate.getAlignmentLinesOwner$ui_release().getAlignmentLines().getRequired$ui_release()) {
            return true;
        }
        AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = layoutNodeLayoutDelegate.getLookaheadAlignmentLinesOwner$ui_release();
        if (lookaheadAlignmentLinesOwner$ui_release != null && (alignmentLines = lookaheadAlignmentLinesOwner$ui_release.getAlignmentLines()) != null && alignmentLines.getRequired$ui_release()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return true;
        }
        return false;
    }

    public final boolean getCanMultiMeasure$ui_release() {
        return this.canMultiMeasure;
    }

    @l
    public final List<Measurable> getChildLookaheadMeasurables$ui_release() {
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        l0.m(lookaheadPassDelegate$ui_release);
        return lookaheadPassDelegate$ui_release.getChildDelegates$ui_release();
    }

    @l
    public final List<Measurable> getChildMeasurables$ui_release() {
        return getMeasurePassDelegate$ui_release().getChildDelegates$ui_release();
    }

    @l
    public final List<LayoutNode> getChildren$ui_release() {
        return get_children$ui_release().asMutableList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.ui.semantics.SemanticsConfiguration, T] */
    @m
    public final SemanticsConfiguration getCollapsedSemantics$ui_release() {
        if (this.nodes.m5167hasH91voCI$ui_release(NodeKind.m5204constructorimpl(8)) && this._collapsedSemantics == null) {
            k1.h hVar = new k1.h();
            hVar.element = new SemanticsConfiguration();
            LayoutNodeKt.requireOwner(this).getSnapshotObserver().observeSemanticsReads$ui_release(this, new LayoutNode$collapsedSemantics$1(this, hVar));
            T t5 = hVar.element;
            this._collapsedSemantics = (SemanticsConfiguration) t5;
            return (SemanticsConfiguration) t5;
        }
        return this._collapsedSemantics;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    @ExperimentalComposeUiApi
    public int getCompositeKeyHash() {
        return this.compositeKeyHash;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    @l
    public CompositionLocalMap getCompositionLocalMap() {
        return this.compositionLocalMap;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    @l
    public LayoutCoordinates getCoordinates() {
        return getInnerCoordinator$ui_release();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    @l
    public Density getDensity() {
        return this.density;
    }

    public final int getDepth$ui_release() {
        return this.depth;
    }

    @l
    public final List<LayoutNode> getFoldedChildren$ui_release() {
        return this._foldedChildren.asList();
    }

    public final boolean getHasFixedInnerContentConstraints$ui_release() {
        long m5188getLastMeasurementConstraintsmsEJaDk$ui_release = getInnerCoordinator$ui_release().m5188getLastMeasurementConstraintsmsEJaDk$ui_release();
        if (Constraints.m5998getHasFixedWidthimpl(m5188getLastMeasurementConstraintsmsEJaDk$ui_release) && Constraints.m5997getHasFixedHeightimpl(m5188getLastMeasurementConstraintsmsEJaDk$ui_release)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public int getHeight() {
        return this.layoutDelegate.getHeight$ui_release();
    }

    @l
    public final NodeCoordinator getInnerCoordinator$ui_release() {
        return this.nodes.getInnerCoordinator$ui_release();
    }

    public final boolean getInnerLayerCoordinatorIsDirty$ui_release() {
        return this.innerLayerCoordinatorIsDirty;
    }

    @Override // androidx.compose.ui.node.InteroperableComposeUiNode
    @InternalComposeUiApi
    @m
    public View getInteropView() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            return androidViewHolder.getInteropView();
        }
        return null;
    }

    @m
    public final AndroidViewHolder getInteropViewFactoryHolder$ui_release() {
        return this.interopViewFactoryHolder;
    }

    @l
    public final IntrinsicsPolicy getIntrinsicsPolicy$ui_release() {
        return this.intrinsicsPolicy;
    }

    @l
    public final UsageByParent getIntrinsicsUsageByParent$ui_release() {
        return this.intrinsicsUsageByParent;
    }

    @l
    public final LayoutNodeLayoutDelegate getLayoutDelegate$ui_release() {
        return this.layoutDelegate;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    @l
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    public final boolean getLayoutPending$ui_release() {
        return this.layoutDelegate.getLayoutPending$ui_release();
    }

    @l
    public final LayoutState getLayoutState$ui_release() {
        return this.layoutDelegate.getLayoutState$ui_release();
    }

    public final boolean getLookaheadLayoutPending$ui_release() {
        return this.layoutDelegate.getLookaheadLayoutPending$ui_release();
    }

    public final boolean getLookaheadMeasurePending$ui_release() {
        return this.layoutDelegate.getLookaheadMeasurePending$ui_release();
    }

    @m
    public final LayoutNodeLayoutDelegate.LookaheadPassDelegate getLookaheadPassDelegate$ui_release() {
        return this.layoutDelegate.getLookaheadPassDelegate$ui_release();
    }

    @m
    public final LayoutNode getLookaheadRoot$ui_release() {
        return this.lookaheadRoot;
    }

    @l
    public final LayoutNodeDrawScope getMDrawScope$ui_release() {
        return LayoutNodeKt.requireOwner(this).getSharedDrawScope();
    }

    @l
    public final LayoutNodeLayoutDelegate.MeasurePassDelegate getMeasurePassDelegate$ui_release() {
        return this.layoutDelegate.getMeasurePassDelegate$ui_release();
    }

    public final boolean getMeasurePending$ui_release() {
        return this.layoutDelegate.getMeasurePending$ui_release();
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    @l
    public MeasurePolicy getMeasurePolicy() {
        return this.measurePolicy;
    }

    @l
    public final UsageByParent getMeasuredByParent$ui_release() {
        return getMeasurePassDelegate$ui_release().getMeasuredByParent$ui_release();
    }

    @l
    public final UsageByParent getMeasuredByParentInLookahead$ui_release() {
        UsageByParent measuredByParent$ui_release;
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        return (lookaheadPassDelegate$ui_release == null || (measuredByParent$ui_release = lookaheadPassDelegate$ui_release.getMeasuredByParent$ui_release()) == null) ? UsageByParent.NotUsed : measuredByParent$ui_release;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    @l
    public Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    @l
    public List<ModifierInfo> getModifierInfo() {
        return this.nodes.getModifierInfo();
    }

    public final boolean getNeedsOnPositionedDispatch$ui_release() {
        return this.needsOnPositionedDispatch;
    }

    @l
    public final NodeChain getNodes$ui_release() {
        return this.nodes;
    }

    @m
    public final v3.l<Owner, r2> getOnAttach$ui_release() {
        return this.onAttach;
    }

    @m
    public final v3.l<Owner, r2> getOnDetach$ui_release() {
        return this.onDetach;
    }

    @l
    public final NodeCoordinator getOuterCoordinator$ui_release() {
        return this.nodes.getOuterCoordinator$ui_release();
    }

    @m
    public final Owner getOwner$ui_release() {
        return this.owner;
    }

    @m
    public final LayoutNode getParent$ui_release() {
        LayoutNode layoutNode = this._foldedParent;
        while (true) {
            boolean z4 = false;
            if (layoutNode != null && layoutNode.isVirtual) {
                z4 = true;
            }
            if (z4) {
                layoutNode = layoutNode._foldedParent;
            } else {
                return layoutNode;
            }
        }
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    @m
    public LayoutInfo getParentInfo() {
        return getParent$ui_release();
    }

    public final int getPlaceOrder$ui_release() {
        return getMeasurePassDelegate$ui_release().getPlaceOrder$ui_release();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public int getSemanticsId() {
        return this.semanticsId;
    }

    @m
    public final LayoutNodeSubcompositionsState getSubcompositionsState$ui_release() {
        return this.subcompositionsState;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    @l
    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public int getWidth() {
        return this.layoutDelegate.getWidth$ui_release();
    }

    @l
    public final MutableVector<LayoutNode> getZSortedChildren() {
        if (this.zSortedChildrenInvalidated) {
            this._zSortedChildren.clear();
            MutableVector<LayoutNode> mutableVector = this._zSortedChildren;
            mutableVector.addAll(mutableVector.getSize(), get_children$ui_release());
            this._zSortedChildren.sortWith(ZComparator);
            this.zSortedChildrenInvalidated = false;
        }
        return this._zSortedChildren;
    }

    @l
    public final MutableVector<LayoutNode> get_children$ui_release() {
        updateChildrenIfDirty$ui_release();
        if (this.virtualChildrenCount == 0) {
            return this._foldedChildren.getVector();
        }
        MutableVector<LayoutNode> mutableVector = this._unfoldedChildren;
        l0.m(mutableVector);
        return mutableVector;
    }

    /* renamed from: hitTest-M_7yMNQ$ui_release */
    public final void m5127hitTestM_7yMNQ$ui_release(long j5, @l HitTestResult hitTestResult, boolean z4, boolean z5) {
        getOuterCoordinator$ui_release().m5191hitTestYqVAtuI(NodeCoordinator.Companion.getPointerInputSource(), getOuterCoordinator$ui_release().m5187fromParentPositionMKHz9U(j5), hitTestResult, z4, z5);
    }

    /* renamed from: hitTestSemantics-M_7yMNQ$ui_release */
    public final void m5128hitTestSemanticsM_7yMNQ$ui_release(long j5, @l HitTestResult hitTestResult, boolean z4, boolean z5) {
        getOuterCoordinator$ui_release().m5191hitTestYqVAtuI(NodeCoordinator.Companion.getSemanticsSource(), getOuterCoordinator$ui_release().m5187fromParentPositionMKHz9U(j5), hitTestResult, true, z5);
    }

    public final void ignoreRemeasureRequests$ui_release(@l v3.a<r2> aVar) {
        this.ignoreRemeasureRequests = true;
        aVar.invoke();
        this.ignoreRemeasureRequests = false;
    }

    public final void insertAt$ui_release(int i5, @l LayoutNode layoutNode) {
        boolean z4;
        boolean z5;
        if (layoutNode._foldedParent == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        String str = null;
        if (!z4) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot insert ");
            sb.append(layoutNode);
            sb.append(" because it already has a parent. This tree: ");
            sb.append(debugTreeToString$default(this, 0, 1, null));
            sb.append(" Other tree: ");
            LayoutNode layoutNode2 = layoutNode._foldedParent;
            if (layoutNode2 != null) {
                str = debugTreeToString$default(layoutNode2, 0, 1, null);
            }
            sb.append(str);
            throw new IllegalStateException(sb.toString().toString());
        }
        if (layoutNode.owner == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            layoutNode._foldedParent = this;
            this._foldedChildren.add(i5, layoutNode);
            onZSortedChildrenInvalidated$ui_release();
            if (layoutNode.isVirtual) {
                this.virtualChildrenCount++;
            }
            invalidateUnfoldedVirtualChildren();
            Owner owner = this.owner;
            if (owner != null) {
                layoutNode.attach$ui_release(owner);
            }
            if (layoutNode.layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
                layoutNodeLayoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(layoutNodeLayoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() + 1);
                return;
            }
            return;
        }
        throw new IllegalStateException(("Cannot insert " + layoutNode + " because it already has an owner. This tree: " + debugTreeToString$default(this, 0, 1, null) + " Other tree: " + debugTreeToString$default(layoutNode, 0, 1, null)).toString());
    }

    public final void invalidateLayer$ui_release() {
        NodeCoordinator innerLayerCoordinator = getInnerLayerCoordinator();
        if (innerLayerCoordinator != null) {
            innerLayerCoordinator.invalidateLayer();
            return;
        }
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
    }

    public final void invalidateLayers$ui_release() {
        NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release();
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        while (outerCoordinator$ui_release != innerCoordinator$ui_release) {
            l0.n(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) outerCoordinator$ui_release;
            OwnedLayer layer = layoutModifierNodeCoordinator.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
            outerCoordinator$ui_release = layoutModifierNodeCoordinator.getWrapped$ui_release();
        }
        OwnedLayer layer2 = getInnerCoordinator$ui_release().getLayer();
        if (layer2 != null) {
            layer2.invalidate();
        }
    }

    public final void invalidateMeasurements$ui_release() {
        if (this.lookaheadRoot != null) {
            requestLookaheadRemeasure$ui_release$default(this, false, false, 3, null);
        } else {
            requestRemeasure$ui_release$default(this, false, false, 3, null);
        }
    }

    public final void invalidateParentData$ui_release() {
        this.layoutDelegate.invalidateParentData();
    }

    public final void invalidateSemantics$ui_release() {
        this._collapsedSemantics = null;
        LayoutNodeKt.requireOwner(this).onSemanticsChange();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.compose.ui.Modifier$Node] */
    public final void invalidateSubtree(boolean z4) {
        boolean z5;
        boolean z6;
        LayoutNode parent$ui_release;
        if (z4 && (parent$ui_release = getParent$ui_release()) != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
        invalidateSemantics$ui_release();
        requestRemeasure$ui_release$default(this, false, false, 3, null);
        NodeChain nodeChain = this.nodes;
        int m5204constructorimpl = NodeKind.m5204constructorimpl(2);
        if ((nodeChain.getAggregateChildKindSet() & m5204constructorimpl) != 0) {
            for (Modifier.Node head$ui_release = nodeChain.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                if ((head$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                    DelegatingNode delegatingNode = head$ui_release;
                    MutableVector mutableVector = null;
                    while (delegatingNode != 0) {
                        if (delegatingNode instanceof LayoutModifierNode) {
                            OwnedLayer layer = DelegatableNodeKt.m5101requireCoordinator64DMado((LayoutModifierNode) delegatingNode, NodeKind.m5204constructorimpl(2)).getLayer();
                            if (layer != null) {
                                layer.invalidate();
                            }
                        } else {
                            if ((delegatingNode.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z5 && (delegatingNode instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                int i5 = 0;
                                delegatingNode = delegatingNode;
                                while (delegate$ui_release != null) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (z6) {
                                        i5++;
                                        if (i5 == 1) {
                                            delegatingNode = delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNode != 0) {
                                                mutableVector.add(delegatingNode);
                                                delegatingNode = 0;
                                            }
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                    delegatingNode = delegatingNode;
                                }
                                if (i5 == 1) {
                                }
                            }
                        }
                        delegatingNode = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & m5204constructorimpl) == 0) {
                    break;
                }
            }
        }
        MutableVector<LayoutNode> mutableVector2 = get_children$ui_release();
        int size = mutableVector2.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector2.getContent();
            int i6 = 0;
            do {
                content[i6].invalidateSubtree(false);
                i6++;
            } while (i6 < size);
        }
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public boolean isAttached() {
        return this.owner != null;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public boolean isDeactivated() {
        return this.isDeactivated;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public boolean isPlaced() {
        return getMeasurePassDelegate$ui_release().isPlaced();
    }

    public final boolean isPlacedByParent() {
        return getMeasurePassDelegate$ui_release().isPlacedByParent();
    }

    @m
    public final Boolean isPlacedInLookahead() {
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        if (lookaheadPassDelegate$ui_release != null) {
            return Boolean.valueOf(lookaheadPassDelegate$ui_release.isPlaced());
        }
        return null;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return isAttached();
    }

    public final boolean isVirtualLookaheadRoot$ui_release() {
        return this.isVirtualLookaheadRoot;
    }

    /* renamed from: lookaheadRemeasure-_Sx5XlM$ui_release */
    public final boolean m5129lookaheadRemeasure_Sx5XlM$ui_release(@m Constraints constraints) {
        if (constraints != null && this.lookaheadRoot != null) {
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
            l0.m(lookaheadPassDelegate$ui_release);
            return lookaheadPassDelegate$ui_release.m5147remeasureBRTryo0(constraints.m6006unboximpl());
        }
        return false;
    }

    public final void lookaheadReplace$ui_release() {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        l0.m(lookaheadPassDelegate$ui_release);
        lookaheadPassDelegate$ui_release.replace();
    }

    public final void markLayoutPending$ui_release() {
        this.layoutDelegate.markLayoutPending$ui_release();
    }

    public final void markLookaheadLayoutPending$ui_release() {
        this.layoutDelegate.markLookaheadLayoutPending$ui_release();
    }

    public final void markLookaheadMeasurePending$ui_release() {
        this.layoutDelegate.markLookaheadMeasurePending$ui_release();
    }

    public final void markMeasurePending$ui_release() {
        this.layoutDelegate.markMeasurePending$ui_release();
    }

    public final void move$ui_release(int i5, int i6, int i7) {
        int i8;
        if (i5 == i6) {
            return;
        }
        for (int i9 = 0; i9 < i7; i9++) {
            if (i5 > i6) {
                i8 = i5 + i9;
            } else {
                i8 = i5;
            }
            this._foldedChildren.add(i5 > i6 ? i6 + i9 : (i6 + i7) - 2, this._foldedChildren.removeAt(i8));
        }
        onZSortedChildrenInvalidated$ui_release();
        invalidateUnfoldedVirtualChildren();
        invalidateMeasurements$ui_release();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            androidViewHolder.onDeactivate();
        }
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.subcompositionsState;
        if (layoutNodeSubcompositionsState != null) {
            layoutNodeSubcompositionsState.onDeactivate();
        }
        this.isDeactivated = true;
        resetModifierState();
        if (isAttached()) {
            invalidateSemantics$ui_release();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // androidx.compose.ui.node.Owner.OnLayoutCompletedListener
    public void onLayoutComplete() {
        boolean z4;
        boolean z5;
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        int m5204constructorimpl = NodeKind.m5204constructorimpl(128);
        boolean m5213getIncludeSelfInTraversalH91voCI = NodeKindKt.m5213getIncludeSelfInTraversalH91voCI(m5204constructorimpl);
        Modifier.Node tail = innerCoordinator$ui_release.getTail();
        if (m5213getIncludeSelfInTraversalH91voCI || (tail = tail.getParent$ui_release()) != null) {
            for (Modifier.Node headNode = innerCoordinator$ui_release.headNode(m5213getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet$ui_release() & m5204constructorimpl) != 0; headNode = headNode.getChild$ui_release()) {
                if ((headNode.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                    DelegatingNode delegatingNode = headNode;
                    MutableVector mutableVector = null;
                    while (delegatingNode != 0) {
                        if (delegatingNode instanceof LayoutAwareModifierNode) {
                            ((LayoutAwareModifierNode) delegatingNode).onPlaced(getInnerCoordinator$ui_release());
                        } else {
                            if ((delegatingNode.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4 && (delegatingNode instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                int i5 = 0;
                                delegatingNode = delegatingNode;
                                while (delegate$ui_release != null) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z5) {
                                        i5++;
                                        if (i5 == 1) {
                                            delegatingNode = delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNode != 0) {
                                                mutableVector.add(delegatingNode);
                                                delegatingNode = 0;
                                            }
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                    delegatingNode = delegatingNode;
                                }
                                if (i5 == 1) {
                                }
                            }
                        }
                        delegatingNode = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if (headNode == tail) {
                    return;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            androidViewHolder.onRelease();
        }
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.subcompositionsState;
        if (layoutNodeSubcompositionsState != null) {
            layoutNodeSubcompositionsState.onRelease();
        }
        NodeCoordinator wrapped$ui_release = getInnerCoordinator$ui_release().getWrapped$ui_release();
        for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !l0.g(outerCoordinator$ui_release, wrapped$ui_release) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release()) {
            outerCoordinator$ui_release.onRelease();
        }
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        if (isAttached()) {
            AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
            if (androidViewHolder != null) {
                androidViewHolder.onReuse();
            }
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.subcompositionsState;
            if (layoutNodeSubcompositionsState != null) {
                layoutNodeSubcompositionsState.onReuse();
            }
            if (isDeactivated()) {
                this.isDeactivated = false;
                invalidateSemantics$ui_release();
            } else {
                resetModifierState();
            }
            setSemanticsId(SemanticsModifierKt.generateSemanticsId());
            this.nodes.markAsAttached();
            this.nodes.runAttachLifecycle();
            rescheduleRemeasureOrRelayout$ui_release(this);
            return;
        }
        throw new IllegalArgumentException("onReuse is only expected on attached node".toString());
    }

    public final void onZSortedChildrenInvalidated$ui_release() {
        if (this.isVirtual) {
            LayoutNode parent$ui_release = getParent$ui_release();
            if (parent$ui_release != null) {
                parent$ui_release.onZSortedChildrenInvalidated$ui_release();
                return;
            }
            return;
        }
        this.zSortedChildrenInvalidated = true;
    }

    public final void place$ui_release(int i5, int i6) {
        Placeable.PlacementScope placementScope;
        NodeCoordinator innerCoordinator$ui_release;
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release == null || (innerCoordinator$ui_release = parent$ui_release.getInnerCoordinator$ui_release()) == null || (placementScope = innerCoordinator$ui_release.getPlacementScope()) == null) {
            placementScope = LayoutNodeKt.requireOwner(this).getPlacementScope();
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, getMeasurePassDelegate$ui_release(), i5, i6, 0.0f, 4, null);
    }

    /* renamed from: remeasure-_Sx5XlM$ui_release */
    public final boolean m5130remeasure_Sx5XlM$ui_release(@m Constraints constraints) {
        if (constraints != null) {
            if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
                clearSubtreeIntrinsicsUsage$ui_release();
            }
            return getMeasurePassDelegate$ui_release().m5150remeasureBRTryo0(constraints.m6006unboximpl());
        }
        return false;
    }

    public final void removeAll$ui_release() {
        int size = this._foldedChildren.getSize();
        while (true) {
            size--;
            if (-1 < size) {
                onChildRemoved(this._foldedChildren.get(size));
            } else {
                this._foldedChildren.clear();
                return;
            }
        }
    }

    public final void removeAt$ui_release(int i5, int i6) {
        boolean z4;
        if (i6 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            int i7 = (i6 + i5) - 1;
            if (i5 > i7) {
                return;
            }
            while (true) {
                onChildRemoved(this._foldedChildren.removeAt(i7));
                if (i7 != i5) {
                    i7--;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException(("count (" + i6 + ") must be greater than 0").toString());
        }
    }

    public final void replace$ui_release() {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        getMeasurePassDelegate$ui_release().replace();
    }

    public final void requestLookaheadRelayout$ui_release(boolean z4) {
        Owner owner;
        if (!this.isVirtual && (owner = this.owner) != null) {
            owner.onRequestRelayout(this, true, z4);
        }
    }

    public final void requestLookaheadRemeasure$ui_release(boolean z4, boolean z5) {
        boolean z6;
        if (this.lookaheadRoot != null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            Owner owner = this.owner;
            if (owner != null && !this.ignoreRemeasureRequests && !this.isVirtual) {
                owner.onRequestMeasure(this, true, z4, z5);
                LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
                l0.m(lookaheadPassDelegate$ui_release);
                lookaheadPassDelegate$ui_release.invalidateIntrinsicsParent(z4);
                return;
            }
            return;
        }
        throw new IllegalStateException("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope".toString());
    }

    public final void requestRelayout$ui_release(boolean z4) {
        Owner owner;
        if (!this.isVirtual && (owner = this.owner) != null) {
            Owner.onRequestRelayout$default(owner, this, false, z4, 2, null);
        }
    }

    public final void requestRemeasure$ui_release(boolean z4, boolean z5) {
        Owner owner;
        if (this.ignoreRemeasureRequests || this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        Owner.onRequestMeasure$default(owner, this, false, z4, z5, 2, null);
        getMeasurePassDelegate$ui_release().invalidateIntrinsicsParent(z4);
    }

    public final void rescheduleRemeasureOrRelayout$ui_release(@l LayoutNode layoutNode) {
        if (WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()] == 1) {
            if (layoutNode.getLookaheadMeasurePending$ui_release()) {
                requestLookaheadRemeasure$ui_release$default(layoutNode, true, false, 2, null);
                return;
            }
            if (layoutNode.getLookaheadLayoutPending$ui_release()) {
                layoutNode.requestLookaheadRelayout$ui_release(true);
            }
            if (layoutNode.getMeasurePending$ui_release()) {
                requestRemeasure$ui_release$default(layoutNode, true, false, 2, null);
                return;
            } else {
                if (layoutNode.getLayoutPending$ui_release()) {
                    layoutNode.requestRelayout$ui_release(true);
                    return;
                }
                return;
            }
        }
        throw new IllegalStateException("Unexpected state " + layoutNode.getLayoutState$ui_release());
    }

    public final void resetSubtreeIntrinsicsUsage$ui_release() {
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i5 = 0;
            do {
                LayoutNode layoutNode = content[i5];
                UsageByParent usageByParent = layoutNode.previousIntrinsicsUsageByParent;
                layoutNode.intrinsicsUsageByParent = usageByParent;
                if (usageByParent != UsageByParent.NotUsed) {
                    layoutNode.resetSubtreeIntrinsicsUsage$ui_release();
                }
                i5++;
            } while (i5 < size);
        }
    }

    public final void setCanMultiMeasure$ui_release(boolean z4) {
        this.canMultiMeasure = z4;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    @ExperimentalComposeUiApi
    public void setCompositeKeyHash(int i5) {
        this.compositeKeyHash = i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setCompositionLocalMap(@l CompositionLocalMap compositionLocalMap) {
        boolean z4;
        boolean z5;
        this.compositionLocalMap = compositionLocalMap;
        setDensity((Density) compositionLocalMap.get(CompositionLocalsKt.getLocalDensity()));
        setLayoutDirection((LayoutDirection) compositionLocalMap.get(CompositionLocalsKt.getLocalLayoutDirection()));
        setViewConfiguration((ViewConfiguration) compositionLocalMap.get(CompositionLocalsKt.getLocalViewConfiguration()));
        NodeChain nodeChain = this.nodes;
        int m5204constructorimpl = NodeKind.m5204constructorimpl(32768);
        if ((nodeChain.getAggregateChildKindSet() & m5204constructorimpl) != 0) {
            for (Modifier.Node head$ui_release = nodeChain.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                if ((head$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                    DelegatingNode delegatingNode = head$ui_release;
                    MutableVector mutableVector = null;
                    while (delegatingNode != 0) {
                        if (delegatingNode instanceof CompositionLocalConsumerModifierNode) {
                            Modifier.Node node = ((CompositionLocalConsumerModifierNode) delegatingNode).getNode();
                            if (node.isAttached()) {
                                NodeKindKt.autoInvalidateUpdatedNode(node);
                            } else {
                                node.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
                            }
                        } else {
                            if ((delegatingNode.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4 && (delegatingNode instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                int i5 = 0;
                                delegatingNode = delegatingNode;
                                while (delegate$ui_release != null) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z5) {
                                        i5++;
                                        if (i5 == 1) {
                                            delegatingNode = delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNode != 0) {
                                                mutableVector.add(delegatingNode);
                                                delegatingNode = 0;
                                            }
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                    delegatingNode = delegatingNode;
                                }
                                if (i5 == 1) {
                                }
                            }
                        }
                        delegatingNode = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & m5204constructorimpl) == 0) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setDensity(@l Density density) {
        boolean z4;
        boolean z5;
        if (!l0.g(this.density, density)) {
            this.density = density;
            onDensityOrLayoutDirectionChanged();
            NodeChain nodeChain = this.nodes;
            int m5204constructorimpl = NodeKind.m5204constructorimpl(16);
            if ((nodeChain.getAggregateChildKindSet() & m5204constructorimpl) != 0) {
                for (Modifier.Node head$ui_release = nodeChain.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                    if ((head$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                        DelegatingNode delegatingNode = head$ui_release;
                        MutableVector mutableVector = null;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof PointerInputModifierNode) {
                                ((PointerInputModifierNode) delegatingNode).onDensityChange();
                            } else {
                                if ((delegatingNode.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z4 && (delegatingNode instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                    int i5 = 0;
                                    delegatingNode = delegatingNode;
                                    while (delegate$ui_release != null) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        if (z5) {
                                            i5++;
                                            if (i5 == 1) {
                                                delegatingNode = delegate$ui_release;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (delegatingNode != 0) {
                                                    mutableVector.add(delegatingNode);
                                                    delegatingNode = 0;
                                                }
                                                mutableVector.add(delegate$ui_release);
                                            }
                                        }
                                        delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                        delegatingNode = delegatingNode;
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                            }
                            delegatingNode = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    if ((head$ui_release.getAggregateChildKindSet$ui_release() & m5204constructorimpl) == 0) {
                        return;
                    }
                }
            }
        }
    }

    public final void setDepth$ui_release(int i5) {
        this.depth = i5;
    }

    public final void setInnerLayerCoordinatorIsDirty$ui_release(boolean z4) {
        this.innerLayerCoordinatorIsDirty = z4;
    }

    public final void setInteropViewFactoryHolder$ui_release(@m AndroidViewHolder androidViewHolder) {
        this.interopViewFactoryHolder = androidViewHolder;
    }

    public final void setIntrinsicsUsageByParent$ui_release(@l UsageByParent usageByParent) {
        this.intrinsicsUsageByParent = usageByParent;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setLayoutDirection(@l LayoutDirection layoutDirection) {
        if (this.layoutDirection != layoutDirection) {
            this.layoutDirection = layoutDirection;
            onDensityOrLayoutDirectionChanged();
        }
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setMeasurePolicy(@l MeasurePolicy measurePolicy) {
        if (!l0.g(this.measurePolicy, measurePolicy)) {
            this.measurePolicy = measurePolicy;
            this.intrinsicsPolicy.updateFrom(getMeasurePolicy());
            invalidateMeasurements$ui_release();
        }
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setModifier(@l Modifier modifier) {
        boolean z4;
        if (this.isVirtual && getModifier() != Modifier.Companion) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4) {
            if (!isDeactivated()) {
                this.modifier = modifier;
                this.nodes.updateFrom$ui_release(modifier);
                this.layoutDelegate.updateParentData();
                if (this.nodes.m5167hasH91voCI$ui_release(NodeKind.m5204constructorimpl(512)) && this.lookaheadRoot == null) {
                    setLookaheadRoot(this);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("modifier is updated when deactivated".toString());
        }
        throw new IllegalArgumentException("Modifiers are not supported on virtual LayoutNodes".toString());
    }

    public final void setNeedsOnPositionedDispatch$ui_release(boolean z4) {
        this.needsOnPositionedDispatch = z4;
    }

    public final void setOnAttach$ui_release(@m v3.l<? super Owner, r2> lVar) {
        this.onAttach = lVar;
    }

    public final void setOnDetach$ui_release(@m v3.l<? super Owner, r2> lVar) {
        this.onDetach = lVar;
    }

    public void setSemanticsId(int i5) {
        this.semanticsId = i5;
    }

    public final void setSubcompositionsState$ui_release(@m LayoutNodeSubcompositionsState layoutNodeSubcompositionsState) {
        this.subcompositionsState = layoutNodeSubcompositionsState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setViewConfiguration(@l ViewConfiguration viewConfiguration) {
        boolean z4;
        boolean z5;
        if (!l0.g(this.viewConfiguration, viewConfiguration)) {
            this.viewConfiguration = viewConfiguration;
            NodeChain nodeChain = this.nodes;
            int m5204constructorimpl = NodeKind.m5204constructorimpl(16);
            if ((nodeChain.getAggregateChildKindSet() & m5204constructorimpl) != 0) {
                for (Modifier.Node head$ui_release = nodeChain.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                    if ((head$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                        DelegatingNode delegatingNode = head$ui_release;
                        MutableVector mutableVector = null;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof PointerInputModifierNode) {
                                ((PointerInputModifierNode) delegatingNode).onViewConfigurationChange();
                            } else {
                                if ((delegatingNode.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z4 && (delegatingNode instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                    int i5 = 0;
                                    delegatingNode = delegatingNode;
                                    while (delegate$ui_release != null) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        if (z5) {
                                            i5++;
                                            if (i5 == 1) {
                                                delegatingNode = delegate$ui_release;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (delegatingNode != 0) {
                                                    mutableVector.add(delegatingNode);
                                                    delegatingNode = 0;
                                                }
                                                mutableVector.add(delegate$ui_release);
                                            }
                                        }
                                        delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                        delegatingNode = delegatingNode;
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                            }
                            delegatingNode = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    if ((head$ui_release.getAggregateChildKindSet$ui_release() & m5204constructorimpl) == 0) {
                        return;
                    }
                }
            }
        }
    }

    public final void setVirtualLookaheadRoot$ui_release(boolean z4) {
        this.isVirtualLookaheadRoot = z4;
    }

    @l
    public String toString() {
        return JvmActuals_jvmKt.simpleIdentityToString(this, null) + " children: " + getChildren$ui_release().size() + " measurePolicy: " + getMeasurePolicy();
    }

    public final void updateChildrenIfDirty$ui_release() {
        if (this.virtualChildrenCount > 0) {
            recreateUnfoldedChildrenIfDirty();
        }
    }

    public /* synthetic */ LayoutNode(boolean z4, int i5, int i6, w wVar) {
        this((i6 & 1) != 0 ? false : z4, (i6 & 2) != 0 ? SemanticsModifierKt.generateSemanticsId() : i5);
    }
}
