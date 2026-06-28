package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.material3.tokens.OutlinedTextFieldTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Dp;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.b1;
import kotlin.jvm.internal.r1;

@kotlin.i0(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b?\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\b¡\u0001\u0010\u0091\u0001J9\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJJ\u0010\u0014\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ8\u0010\u001e\u001a\u00020\u00192\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001bJ:\u0010 \u001a\u00020\u00192\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u000fH\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001bJ\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010!JÂ\u0003\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"2\b\b\u0002\u0010&\u001a\u00020\"2\b\b\u0002\u0010'\u001a\u00020\"2\b\b\u0002\u0010(\u001a\u00020\"2\b\b\u0002\u0010)\u001a\u00020\"2\b\b\u0002\u0010*\u001a\u00020\"2\b\b\u0002\u0010+\u001a\u00020\"2\b\b\u0002\u0010,\u001a\u00020\"2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\b\b\u0002\u0010/\u001a\u00020\"2\b\b\u0002\u00100\u001a\u00020\"2\b\b\u0002\u00101\u001a\u00020\"2\b\b\u0002\u00102\u001a\u00020\"2\b\b\u0002\u00103\u001a\u00020\"2\b\b\u0002\u00104\u001a\u00020\"2\b\b\u0002\u00105\u001a\u00020\"2\b\b\u0002\u00106\u001a\u00020\"2\b\b\u0002\u00107\u001a\u00020\"2\b\b\u0002\u00108\u001a\u00020\"2\b\b\u0002\u00109\u001a\u00020\"2\b\b\u0002\u0010:\u001a\u00020\"2\b\b\u0002\u0010;\u001a\u00020\"2\b\b\u0002\u0010<\u001a\u00020\"2\b\b\u0002\u0010=\u001a\u00020\"2\b\b\u0002\u0010>\u001a\u00020\"2\b\b\u0002\u0010?\u001a\u00020\"2\b\b\u0002\u0010@\u001a\u00020\"2\b\b\u0002\u0010A\u001a\u00020\"2\b\b\u0002\u0010B\u001a\u00020\"2\b\b\u0002\u0010C\u001a\u00020\"2\b\b\u0002\u0010D\u001a\u00020\"2\b\b\u0002\u0010E\u001a\u00020\"2\b\b\u0002\u0010F\u001a\u00020\"2\b\b\u0002\u0010G\u001a\u00020\"2\b\b\u0002\u0010H\u001a\u00020\"2\b\b\u0002\u0010I\u001a\u00020\"2\b\b\u0002\u0010J\u001a\u00020\"2\b\b\u0002\u0010K\u001a\u00020\"2\b\b\u0002\u0010L\u001a\u00020\"2\b\b\u0002\u0010M\u001a\u00020\"2\b\b\u0002\u0010N\u001a\u00020\"H\u0007ø\u0001\u0000¢\u0006\u0004\bO\u0010PJ¨\u0002\u0010b\u001a\u00020\u000b2\u0006\u0010R\u001a\u00020Q2\u0011\u0010U\u001a\r\u0012\u0004\u0012\u00020\u000b0S¢\u0006\u0002\bT2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010V\u001a\u00020\u00022\u0006\u0010X\u001a\u00020W2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0015\b\u0002\u0010Y\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010S¢\u0006\u0002\bT2\u0015\b\u0002\u0010Z\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010S¢\u0006\u0002\bT2\u0015\b\u0002\u0010[\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010S¢\u0006\u0002\bT2\u0015\b\u0002\u0010\\\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010S¢\u0006\u0002\bT2\u0015\b\u0002\u0010]\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010S¢\u0006\u0002\bT2\u0015\b\u0002\u0010^\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010S¢\u0006\u0002\bT2\u0015\b\u0002\u0010_\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010S¢\u0006\u0002\bT2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010`\u001a\u00020\u00192\u0013\b\u0002\u0010a\u001a\r\u0012\u0004\u0012\u00020\u000b0S¢\u0006\u0002\bTH\u0007¢\u0006\u0004\bb\u0010cJ9\u0010d\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\bd\u0010\rJP\u0010i\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010e\u001a\u00020\u000f2\b\b\u0002\u0010f\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\bg\u0010hJ:\u0010k\u001a\u00020\u00192\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\bj\u0010\u001bJ:\u0010m\u001a\u00020\u00192\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\bl\u0010\u001bJ:\u0010o\u001a\u00020\u00192\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\bn\u0010\u001bJ¬\u0003\u0010s\u001a\u00020\u00072\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"2\b\b\u0002\u0010&\u001a\u00020\"2\b\b\u0002\u0010p\u001a\u00020\"2\b\b\u0002\u0010*\u001a\u00020\"2\b\b\u0002\u0010+\u001a\u00020\"2\b\b\u0002\u0010,\u001a\u00020\"2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u0010/\u001a\u00020\"2\b\b\u0002\u00100\u001a\u00020\"2\b\b\u0002\u00101\u001a\u00020\"2\b\b\u0002\u00102\u001a\u00020\"2\b\b\u0002\u00103\u001a\u00020\"2\b\b\u0002\u00104\u001a\u00020\"2\b\b\u0002\u00105\u001a\u00020\"2\b\b\u0002\u00106\u001a\u00020\"2\b\b\u0002\u00107\u001a\u00020\"2\b\b\u0002\u00108\u001a\u00020\"2\b\b\u0002\u00109\u001a\u00020\"2\b\b\u0002\u0010:\u001a\u00020\"2\b\b\u0002\u0010;\u001a\u00020\"2\b\b\u0002\u0010<\u001a\u00020\"2\b\b\u0002\u0010=\u001a\u00020\"2\b\b\u0002\u0010>\u001a\u00020\"2\b\b\u0002\u0010?\u001a\u00020\"2\b\b\u0002\u0010@\u001a\u00020\"2\b\b\u0002\u0010A\u001a\u00020\"2\b\b\u0002\u0010B\u001a\u00020\"2\b\b\u0002\u0010C\u001a\u00020\"2\b\b\u0002\u0010D\u001a\u00020\"2\b\b\u0002\u0010E\u001a\u00020\"2\b\b\u0002\u0010F\u001a\u00020\"2\b\b\u0002\u0010G\u001a\u00020\"2\b\b\u0002\u0010H\u001a\u00020\"2\b\b\u0002\u0010I\u001a\u00020\"2\b\b\u0002\u0010J\u001a\u00020\"2\b\b\u0002\u0010K\u001a\u00020\"2\b\b\u0002\u0010L\u001a\u00020\"2\b\b\u0002\u0010M\u001a\u00020\"2\b\b\u0002\u0010N\u001a\u00020\"H\u0007ø\u0001\u0000¢\u0006\u0004\bq\u0010rJ¬\u0003\u0010y\u001a\u00020\u00072\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"2\b\b\u0002\u0010&\u001a\u00020\"2\b\b\u0002\u0010p\u001a\u00020\"2\b\b\u0002\u0010*\u001a\u00020\"2\b\b\u0002\u0010+\u001a\u00020\"2\b\b\u0002\u0010,\u001a\u00020\"2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u0010t\u001a\u00020\"2\b\b\u0002\u0010u\u001a\u00020\"2\b\b\u0002\u0010v\u001a\u00020\"2\b\b\u0002\u0010w\u001a\u00020\"2\b\b\u0002\u00103\u001a\u00020\"2\b\b\u0002\u00104\u001a\u00020\"2\b\b\u0002\u00105\u001a\u00020\"2\b\b\u0002\u00106\u001a\u00020\"2\b\b\u0002\u00107\u001a\u00020\"2\b\b\u0002\u00108\u001a\u00020\"2\b\b\u0002\u00109\u001a\u00020\"2\b\b\u0002\u0010:\u001a\u00020\"2\b\b\u0002\u0010;\u001a\u00020\"2\b\b\u0002\u0010<\u001a\u00020\"2\b\b\u0002\u0010=\u001a\u00020\"2\b\b\u0002\u0010>\u001a\u00020\"2\b\b\u0002\u0010?\u001a\u00020\"2\b\b\u0002\u0010@\u001a\u00020\"2\b\b\u0002\u0010A\u001a\u00020\"2\b\b\u0002\u0010B\u001a\u00020\"2\b\b\u0002\u0010C\u001a\u00020\"2\b\b\u0002\u0010D\u001a\u00020\"2\b\b\u0002\u0010E\u001a\u00020\"2\b\b\u0002\u0010F\u001a\u00020\"2\b\b\u0002\u0010G\u001a\u00020\"2\b\b\u0002\u0010H\u001a\u00020\"2\b\b\u0002\u0010I\u001a\u00020\"2\b\b\u0002\u0010J\u001a\u00020\"2\b\b\u0002\u0010K\u001a\u00020\"2\b\b\u0002\u0010L\u001a\u00020\"2\b\b\u0002\u0010M\u001a\u00020\"2\b\b\u0002\u0010N\u001a\u00020\"H\u0007ø\u0001\u0000¢\u0006\u0004\bx\u0010rJ¨\u0002\u0010z\u001a\u00020\u000b2\u0006\u0010R\u001a\u00020Q2\u0011\u0010U\u001a\r\u0012\u0004\u0012\u00020\u000b0S¢\u0006\u0002\bT2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010V\u001a\u00020\u00022\u0006\u0010X\u001a\u00020W2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0015\b\u0002\u0010Y\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010S¢\u0006\u0002\bT2\u0015\b\u0002\u0010Z\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010S¢\u0006\u0002\bT2\u0015\b\u0002\u0010[\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010S¢\u0006\u0002\bT2\u0015\b\u0002\u0010\\\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010S¢\u0006\u0002\bT2\u0015\b\u0002\u0010]\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010S¢\u0006\u0002\bT2\u0015\b\u0002\u0010^\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010S¢\u0006\u0002\bT2\u0015\b\u0002\u0010_\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010S¢\u0006\u0002\bT2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010`\u001a\u00020\u00192\u0013\b\u0002\u0010a\u001a\r\u0012\u0004\u0012\u00020\u000b0S¢\u0006\u0002\bTH\u0007¢\u0006\u0004\bz\u0010cJ\u009e\u0002\u0010{\u001a\u00020\u000b2\u0006\u0010R\u001a\u00020Q2\u0011\u0010U\u001a\r\u0012\u0004\u0012\u00020\u000b0S¢\u0006\u0002\bT2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010V\u001a\u00020\u00022\u0006\u0010X\u001a\u00020W2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0015\b\u0002\u0010Y\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010S¢\u0006\u0002\bT2\u0015\b\u0002\u0010Z\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010S¢\u0006\u0002\bT2\u0015\b\u0002\u0010[\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010S¢\u0006\u0002\bT2\u0015\b\u0002\u0010\\\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010S¢\u0006\u0002\bT2\u0015\b\u0002\u0010]\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010S¢\u0006\u0002\bT2\u0015\b\u0002\u0010^\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010S¢\u0006\u0002\bT2\u0015\b\u0002\u0010_\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010S¢\u0006\u0002\bT2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010`\u001a\u00020\u00192\u0013\b\u0002\u0010a\u001a\r\u0012\u0004\u0012\u00020\u000b0S¢\u0006\u0002\bTH\u0007¢\u0006\u0004\b{\u0010|Jû\u0002\u0010s\u001a\u00020\u00072\b\b\u0002\u0010}\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"2\b\b\u0002\u0010p\u001a\u00020\"2\b\b\u0002\u0010+\u001a\u00020\"2\b\b\u0002\u0010,\u001a\u00020\"2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u0010/\u001a\u00020\"2\b\b\u0002\u00100\u001a\u00020\"2\b\b\u0002\u00101\u001a\u00020\"2\b\b\u0002\u00102\u001a\u00020\"2\b\b\u0002\u00103\u001a\u00020\"2\b\b\u0002\u00104\u001a\u00020\"2\b\b\u0002\u00105\u001a\u00020\"2\b\b\u0002\u00106\u001a\u00020\"2\b\b\u0002\u00107\u001a\u00020\"2\b\b\u0002\u00108\u001a\u00020\"2\b\b\u0002\u00109\u001a\u00020\"2\b\b\u0002\u0010:\u001a\u00020\"2\b\b\u0002\u0010;\u001a\u00020\"2\b\b\u0002\u0010<\u001a\u00020\"2\b\b\u0002\u0010=\u001a\u00020\"2\b\b\u0002\u0010>\u001a\u00020\"2\b\b\u0002\u0010~\u001a\u00020\"2\b\b\u0002\u0010A\u001a\u00020\"2\b\b\u0002\u0010C\u001a\u00020\"2\b\b\u0002\u0010D\u001a\u00020\"2\b\b\u0002\u0010E\u001a\u00020\"2\b\b\u0002\u0010F\u001a\u00020\"2\b\b\u0002\u0010G\u001a\u00020\"2\b\b\u0002\u0010H\u001a\u00020\"2\b\b\u0002\u0010I\u001a\u00020\"2\b\b\u0002\u0010J\u001a\u00020\"2\b\b\u0002\u0010K\u001a\u00020\"2\b\b\u0002\u0010L\u001a\u00020\"2\b\b\u0002\u0010M\u001a\u00020\"2\b\b\u0002\u0010N\u001a\u00020\"H\u0007ø\u0001\u0000¢\u0006\u0005\b\u007f\u0010\u0080\u0001Jü\u0002\u0010y\u001a\u00020\u00072\b\b\u0002\u0010}\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"2\b\b\u0002\u0010p\u001a\u00020\"2\b\b\u0002\u0010+\u001a\u00020\"2\b\b\u0002\u0010,\u001a\u00020\"2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u0010t\u001a\u00020\"2\b\b\u0002\u0010u\u001a\u00020\"2\b\b\u0002\u0010v\u001a\u00020\"2\b\b\u0002\u0010w\u001a\u00020\"2\b\b\u0002\u00103\u001a\u00020\"2\b\b\u0002\u00104\u001a\u00020\"2\b\b\u0002\u00105\u001a\u00020\"2\b\b\u0002\u00106\u001a\u00020\"2\b\b\u0002\u00107\u001a\u00020\"2\b\b\u0002\u00108\u001a\u00020\"2\b\b\u0002\u00109\u001a\u00020\"2\b\b\u0002\u0010:\u001a\u00020\"2\b\b\u0002\u0010;\u001a\u00020\"2\b\b\u0002\u0010<\u001a\u00020\"2\b\b\u0002\u0010=\u001a\u00020\"2\b\b\u0002\u0010>\u001a\u00020\"2\b\b\u0002\u0010~\u001a\u00020\"2\b\b\u0002\u0010A\u001a\u00020\"2\b\b\u0002\u0010C\u001a\u00020\"2\b\b\u0002\u0010D\u001a\u00020\"2\b\b\u0002\u0010E\u001a\u00020\"2\b\b\u0002\u0010F\u001a\u00020\"2\b\b\u0002\u0010G\u001a\u00020\"2\b\b\u0002\u0010H\u001a\u00020\"2\b\b\u0002\u0010I\u001a\u00020\"2\b\b\u0002\u0010J\u001a\u00020\"2\b\b\u0002\u0010K\u001a\u00020\"2\b\b\u0002\u0010L\u001a\u00020\"2\b\b\u0002\u0010M\u001a\u00020\"2\b\b\u0002\u0010N\u001a\u00020\"H\u0007ø\u0001\u0000¢\u0006\u0006\b\u0081\u0001\u0010\u0080\u0001Jû\u0001\u0010z\u001a\u00020\u000b2\u0006\u0010R\u001a\u00020Q2\u0011\u0010U\u001a\r\u0012\u0004\u0012\u00020\u000b0S¢\u0006\u0002\bT2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010V\u001a\u00020\u00022\u0006\u0010X\u001a\u00020W2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0015\b\u0002\u0010Y\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010S¢\u0006\u0002\bT2\u0015\b\u0002\u0010Z\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010S¢\u0006\u0002\bT2\u0015\b\u0002\u0010[\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010S¢\u0006\u0002\bT2\u0015\b\u0002\u0010\\\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010S¢\u0006\u0002\bT2\u0015\b\u0002\u0010_\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010S¢\u0006\u0002\bT2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010`\u001a\u00020\u00192\u0013\b\u0002\u0010a\u001a\r\u0012\u0004\u0012\u00020\u000b0S¢\u0006\u0002\bTH\u0007¢\u0006\u0005\bz\u0010\u0082\u0001Jñ\u0001\u0010{\u001a\u00020\u000b2\u0006\u0010R\u001a\u00020Q2\u0011\u0010U\u001a\r\u0012\u0004\u0012\u00020\u000b0S¢\u0006\u0002\bT2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010V\u001a\u00020\u00022\u0006\u0010X\u001a\u00020W2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0015\b\u0002\u0010Y\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010S¢\u0006\u0002\bT2\u0015\b\u0002\u0010Z\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010S¢\u0006\u0002\bT2\u0015\b\u0002\u0010[\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010S¢\u0006\u0002\bT2\u0015\b\u0002\u0010\\\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010S¢\u0006\u0002\bT2\u0015\b\u0002\u0010_\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010S¢\u0006\u0002\bT2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010`\u001a\u00020\u00192\u0013\b\u0002\u0010a\u001a\r\u0012\u0004\u0012\u00020\u000b0S¢\u0006\u0002\bTH\u0007¢\u0006\u0005\b{\u0010\u0083\u0001R\"\u0010\u0084\u0001\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\"\u0010\u0088\u0001\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0085\u0001\u001a\u0006\b\u0089\u0001\u0010\u0087\u0001R\"\u0010\u008a\u0001\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u0085\u0001\u001a\u0006\b\u008b\u0001\u0010\u0087\u0001R\"\u0010\u008c\u0001\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u0085\u0001\u001a\u0006\b\u008d\u0001\u0010\u0087\u0001R-\u0010\u008e\u0001\u001a\u00020\u000f8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010\u0085\u0001\u0012\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u008f\u0001\u0010\u0087\u0001R-\u0010\u0092\u0001\u001a\u00020\u000f8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0085\u0001\u0012\u0006\b\u0094\u0001\u0010\u0091\u0001\u001a\u0006\b\u0093\u0001\u0010\u0087\u0001R\u0013\u0010\n\u001a\u00020\t8G¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001c\u0010\u009a\u0001\u001a\u00020\u0007*\u00030\u0097\u00018AX\u0080\u0004¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001f\u0010\u009d\u0001\u001a\u00020\t8GX\u0087\u0004¢\u0006\u0010\u0012\u0006\b\u009c\u0001\u0010\u0091\u0001\u001a\u0006\b\u009b\u0001\u0010\u0096\u0001R\u001f\u0010 \u0001\u001a\u00020\t8GX\u0087\u0004¢\u0006\u0010\u0012\u0006\b\u009f\u0001\u0010\u0091\u0001\u001a\u0006\b\u009e\u0001\u0010\u0096\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¢\u0001"}, d2 = {"Landroidx/compose/material3/TextFieldDefaults;", "", "", "enabled", "isError", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/material3/TextFieldColors;", "colors", "Landroidx/compose/ui/graphics/Shape;", "shape", "Lkotlin/r2;", "ContainerBox", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "focusedIndicatorLineThickness", "unfocusedIndicatorLineThickness", "indicatorLine-gv0btCI", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;FF)Landroidx/compose/ui/Modifier;", "indicatorLine", "start", "end", "top", "bottom", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPaddingWithLabel-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "contentPaddingWithLabel", "contentPaddingWithoutLabel-a9UjIt4", "contentPaddingWithoutLabel", "supportingTextPadding-a9UjIt4$material3_release", "supportingTextPadding", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;", "Landroidx/compose/ui/graphics/Color;", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "selectionColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "colors-0hiis_0", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIIII)Landroidx/compose/material3/TextFieldColors;", "", t0.b.f22420d, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "innerTextField", "singleLine", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", TTDownloadField.TT_LABEL, "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "contentPadding", "container", "DecorationBox", "(Ljava/lang/String;Lv3/p;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lv3/p;Landroidx/compose/runtime/Composer;III)V", "FilledContainerBox", "focusedBorderThickness", "unfocusedBorderThickness", "OutlinedBorderContainerBox-nbWgWpA", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "OutlinedBorderContainerBox", "textFieldWithLabelPadding-a9UjIt4", "textFieldWithLabelPadding", "textFieldWithoutLabelPadding-a9UjIt4", "textFieldWithoutLabelPadding", "outlinedTextFieldPadding-a9UjIt4", "outlinedTextFieldPadding", "containerColor", "textFieldColors-M37tBTI", "(JJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIIII)Landroidx/compose/material3/TextFieldColors;", "textFieldColors", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "outlinedTextFieldColors-M37tBTI", "outlinedTextFieldColors", "TextFieldDecorationBox", "OutlinedTextFieldDecorationBox", "(Ljava/lang/String;Lv3/p;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lv3/p;Landroidx/compose/runtime/Composer;III)V", "textColor", "placeholderColor", "textFieldColors-eS1Emto", "(JJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIII)Landroidx/compose/material3/TextFieldColors;", "outlinedTextFieldColors-eS1Emto", "(Ljava/lang/String;Lv3/p;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lv3/p;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lv3/p;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lv3/p;Landroidx/compose/runtime/Composer;III)V", "MinHeight", "F", "getMinHeight-D9Ej5fM", "()F", "MinWidth", "getMinWidth-D9Ej5fM", "UnfocusedIndicatorThickness", "getUnfocusedIndicatorThickness-D9Ej5fM", "FocusedIndicatorThickness", "getFocusedIndicatorThickness-D9Ej5fM", "UnfocusedBorderThickness", "getUnfocusedBorderThickness-D9Ej5fM", "getUnfocusedBorderThickness-D9Ej5fM$annotations", "()V", "FocusedBorderThickness", "getFocusedBorderThickness-D9Ej5fM", "getFocusedBorderThickness-D9Ej5fM$annotations", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/material3/ColorScheme;", "getDefaultTextFieldColors", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;", "defaultTextFieldColors", "getOutlinedShape", "getOutlinedShape$annotations", "outlinedShape", "getFilledShape", "getFilledShape$annotations", "filledShape", "<init>", "material3_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@r1({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/TextFieldDefaults\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,2400:1\n135#2:2401\n154#3:2402\n154#3:2408\n154#3:2409\n154#3:2410\n154#3:2411\n74#4:2403\n74#4:2404\n74#4:2405\n74#4:2406\n74#4:2407\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/TextFieldDefaults\n*L\n133#1:2401\n190#1:2402\n65#1:2408\n71#1:2409\n76#1:2410\n81#1:2411\n360#1:2403\n743#1:2404\n893#1:2405\n1129#1:2406\n1224#1:2407\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldDefaults {
    public static final int $stable = 0;
    private static final float FocusedBorderThickness;
    private static final float FocusedIndicatorThickness;

    @p4.l
    public static final TextFieldDefaults INSTANCE = new TextFieldDefaults();
    private static final float MinHeight = Dp.m6044constructorimpl(56);
    private static final float MinWidth = Dp.m6044constructorimpl(280);
    private static final float UnfocusedBorderThickness;
    private static final float UnfocusedIndicatorThickness;

    static {
        float m6044constructorimpl = Dp.m6044constructorimpl(1);
        UnfocusedIndicatorThickness = m6044constructorimpl;
        float m6044constructorimpl2 = Dp.m6044constructorimpl(2);
        FocusedIndicatorThickness = m6044constructorimpl2;
        UnfocusedBorderThickness = m6044constructorimpl;
        FocusedBorderThickness = m6044constructorimpl2;
    }

    private TextFieldDefaults() {
    }

    /* renamed from: contentPaddingWithLabel-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2412contentPaddingWithLabela9UjIt4$default(TextFieldDefaults textFieldDefaults, float f5, float f6, float f7, float f8, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i5 & 2) != 0) {
            f6 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i5 & 4) != 0) {
            f7 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        if ((i5 & 8) != 0) {
            f8 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        return textFieldDefaults.m2423contentPaddingWithLabela9UjIt4(f5, f6, f7, f8);
    }

    /* renamed from: contentPaddingWithoutLabel-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2413contentPaddingWithoutLabela9UjIt4$default(TextFieldDefaults textFieldDefaults, float f5, float f6, float f7, float f8, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i5 & 2) != 0) {
            f6 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i5 & 4) != 0) {
            f7 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i5 & 8) != 0) {
            f8 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m2424contentPaddingWithoutLabela9UjIt4(f5, f6, f7, f8);
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Renamed to `TextFieldDefaults.shape`", replaceWith = @b1(expression = "TextFieldDefaults.shape", imports = {}))
    public static /* synthetic */ void getFilledShape$annotations() {
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Split into `TextFieldDefaults.FocusedIndicatorThickness` and `OutlinedTextFieldDefaults.FocusedBorderThickness`. Please update as appropriate.", replaceWith = @b1(expression = "TextFieldDefaults.FocusedIndicatorThickness", imports = {}))
    /* renamed from: getFocusedBorderThickness-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m2414getFocusedBorderThicknessD9Ej5fM$annotations() {
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Renamed to `OutlinedTextFieldDefaults.shape`", replaceWith = @b1(expression = "OutlinedTextFieldDefaults.shape", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    public static /* synthetic */ void getOutlinedShape$annotations() {
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Split into `TextFieldDefaults.UnfocusedIndicatorThickness` and `OutlinedTextFieldDefaults.UnfocusedBorderThickness`. Please update as appropriate.", replaceWith = @b1(expression = "TextFieldDefaults.UnfocusedIndicatorThickness", imports = {}))
    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m2415getUnfocusedBorderThicknessD9Ej5fM$annotations() {
    }

    /* renamed from: indicatorLine-gv0btCI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2416indicatorLinegv0btCI$default(TextFieldDefaults textFieldDefaults, Modifier modifier, boolean z4, boolean z5, InteractionSource interactionSource, TextFieldColors textFieldColors, float f5, float f6, int i5, Object obj) {
        float f7;
        float f8;
        if ((i5 & 16) != 0) {
            f7 = FocusedIndicatorThickness;
        } else {
            f7 = f5;
        }
        if ((i5 & 32) != 0) {
            f8 = UnfocusedIndicatorThickness;
        } else {
            f8 = f6;
        }
        return textFieldDefaults.m2431indicatorLinegv0btCI(modifier, z4, z5, interactionSource, textFieldColors, f7, f8);
    }

    /* renamed from: outlinedTextFieldPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2417outlinedTextFieldPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f5, float f6, float f7, float f8, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i5 & 2) != 0) {
            f6 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i5 & 4) != 0) {
            f7 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i5 & 8) != 0) {
            f8 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m2434outlinedTextFieldPaddinga9UjIt4(f5, f6, f7, f8);
    }

    /* renamed from: supportingTextPadding-a9UjIt4$material3_release$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2418supportingTextPaddinga9UjIt4$material3_release$default(TextFieldDefaults textFieldDefaults, float f5, float f6, float f7, float f8, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i5 & 2) != 0) {
            f6 = TextFieldImplKt.getSupportingTopPadding();
        }
        if ((i5 & 4) != 0) {
            f7 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i5 & 8) != 0) {
            f8 = Dp.m6044constructorimpl(0);
        }
        return textFieldDefaults.m2435supportingTextPaddinga9UjIt4$material3_release(f5, f6, f7, f8);
    }

    /* renamed from: textFieldWithLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2419textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f5, float f6, float f7, float f8, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i5 & 2) != 0) {
            f6 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i5 & 4) != 0) {
            f7 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        if ((i5 & 8) != 0) {
            f8 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        return textFieldDefaults.m2438textFieldWithLabelPaddinga9UjIt4(f5, f6, f7, f8);
    }

    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2420textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f5, float f6, float f7, float f8, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i5 & 2) != 0) {
            f6 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i5 & 4) != 0) {
            f7 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i5 & 8) != 0) {
            f8 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m2439textFieldWithoutLabelPaddinga9UjIt4(f5, f6, f7, f8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00da, code lost:
    
        if ((r27 & 16) != 0) goto L82;
     */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ContainerBox(boolean r20, boolean r21, @p4.l androidx.compose.foundation.interaction.InteractionSource r22, @p4.l androidx.compose.material3.TextFieldColors r23, @p4.m androidx.compose.ui.graphics.Shape r24, @p4.m androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.ContainerBox(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.material3.TextFieldColors, androidx.compose.ui.graphics.Shape, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x027b  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DecorationBox(@p4.l java.lang.String r43, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r44, boolean r45, boolean r46, @p4.l androidx.compose.ui.text.input.VisualTransformation r47, @p4.l androidx.compose.foundation.interaction.InteractionSource r48, boolean r49, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r50, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r51, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r52, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r53, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r54, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r55, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r56, @p4.m androidx.compose.ui.graphics.Shape r57, @p4.m androidx.compose.material3.TextFieldColors r58, @p4.m androidx.compose.foundation.layout.PaddingValues r59, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r60, @p4.m androidx.compose.runtime.Composer r61, int r62, int r63, int r64) {
        /*
            Method dump skipped, instructions count: 1158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.DecorationBox(java.lang.String, v3.p, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, v3.p, v3.p, v3.p, v3.p, v3.p, v3.p, v3.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, v3.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00df, code lost:
    
        if ((r26 & 16) != 0) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x004c  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @kotlin.k(level = kotlin.m.WARNING, message = "Renamed to `TextFieldDefaults.ContainerBox`", replaceWith = @kotlin.b1(expression = "TextFieldDefaults.ContainerBox(\n        enabled = enabled,\n        isError = isError,\n        interactionSource = interactionSource,\n        colors = colors,\n        shape = shape,\n    )", imports = {}))
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FilledContainerBox(boolean r19, boolean r20, @p4.l androidx.compose.foundation.interaction.InteractionSource r21, @p4.l androidx.compose.material3.TextFieldColors r22, @p4.m androidx.compose.ui.graphics.Shape r23, @p4.m androidx.compose.runtime.Composer r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.FilledContainerBox(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.material3.TextFieldColors, androidx.compose.ui.graphics.Shape, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x004c  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @kotlin.k(level = kotlin.m.WARNING, message = "Renamed to `OutlinedTextFieldDefaults.ContainerBox`", replaceWith = @kotlin.b1(expression = "OutlinedTextFieldDefaults.ContainerBox(\n        enabled = enabled,\n        isError = isError,\n        interactionSource = interactionSource,\n        colors = colors,\n        shape = shape,\n        focusedBorderThickness = focusedBorderThickness,\n        unfocusedBorderThickness = unfocusedBorderThickness,\n    )", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.Composable
    /* renamed from: OutlinedBorderContainerBox-nbWgWpA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2421OutlinedBorderContainerBoxnbWgWpA(boolean r23, boolean r24, @p4.l androidx.compose.foundation.interaction.InteractionSource r25, @p4.l androidx.compose.material3.TextFieldColors r26, @p4.m androidx.compose.ui.graphics.Shape r27, float r28, float r29, @p4.m androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.m2421OutlinedBorderContainerBoxnbWgWpA(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.material3.TextFieldColors, androidx.compose.ui.graphics.Shape, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x026e  */
    @kotlin.k(level = kotlin.m.WARNING, message = "Renamed to `OutlinedTextFieldDefaults.DecorationBox`", replaceWith = @kotlin.b1(expression = "OutlinedTextFieldDefaults.DecorationBox(\n        value = value,\n        innerTextField = innerTextField,\n        enabled = enabled,\n        singleLine = singleLine,\n        visualTransformation = visualTransformation,\n        interactionSource = interactionSource,\n        isError = isError,\n        label = label,\n        placeholder = placeholder,\n        leadingIcon = leadingIcon,\n        trailingIcon = trailingIcon,\n        prefix = prefix,\n        suffix = suffix,\n        supportingText = supportingText,\n        colors = colors,\n        contentPadding = contentPadding,\n        container = container,\n    )", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OutlinedTextFieldDecorationBox(@p4.l java.lang.String r37, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r38, boolean r39, boolean r40, @p4.l androidx.compose.ui.text.input.VisualTransformation r41, @p4.l androidx.compose.foundation.interaction.InteractionSource r42, boolean r43, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r44, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r45, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r46, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r47, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r48, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r49, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r50, @p4.m androidx.compose.material3.TextFieldColors r51, @p4.m androidx.compose.foundation.layout.PaddingValues r52, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r53, @p4.m androidx.compose.runtime.Composer r54, int r55, int r56, int r57) {
        /*
            Method dump skipped, instructions count: 995
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox(java.lang.String, v3.p, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, v3.p, v3.p, v3.p, v3.p, v3.p, v3.p, v3.p, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, v3.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0278  */
    @kotlin.k(level = kotlin.m.WARNING, message = "Renamed to `TextFieldDefaults.DecorationBox`", replaceWith = @kotlin.b1(expression = "TextFieldDefaults.DecorationBox(\n        value = value,\n        innerTextField = innerTextField,\n        enabled = enabled,\n        singleLine = singleLine,\n        visualTransformation = visualTransformation,\n        interactionSource = interactionSource,\n        isError = isError,\n        label = label,\n        placeholder = placeholder,\n        leadingIcon = leadingIcon,\n        trailingIcon = trailingIcon,\n        prefix = prefix,\n        suffix = suffix,\n        supportingText = supportingText,\n        shape = shape,\n        colors = colors,\n        contentPadding = contentPadding,\n        container = container,\n    )", imports = {}))
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void TextFieldDecorationBox(@p4.l java.lang.String r39, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r40, boolean r41, boolean r42, @p4.l androidx.compose.ui.text.input.VisualTransformation r43, @p4.l androidx.compose.foundation.interaction.InteractionSource r44, boolean r45, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r46, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r47, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r48, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r49, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r50, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r51, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r52, @p4.m androidx.compose.ui.graphics.Shape r53, @p4.m androidx.compose.material3.TextFieldColors r54, @p4.m androidx.compose.foundation.layout.PaddingValues r55, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r56, @p4.m androidx.compose.runtime.Composer r57, int r58, int r59, int r60) {
        /*
            Method dump skipped, instructions count: 1144
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox(java.lang.String, v3.p, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, v3.p, v3.p, v3.p, v3.p, v3.p, v3.p, v3.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, v3.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @p4.l
    @Composable
    public final TextFieldColors colors(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(831731228);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(831731228, i5, -1, "androidx.compose.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:197)");
        }
        TextFieldColors defaultTextFieldColors = getDefaultTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i5 << 3) & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultTextFieldColors;
    }

    @p4.l
    @Composable
    /* renamed from: colors-0hiis_0, reason: not valid java name */
    public final TextFieldColors m2422colors0hiis_0(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, @p4.m TextSelectionColors textSelectionColors, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, @p4.m Composer composer, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        composer.startReplaceableGroup(1513344955);
        long m3770getUnspecified0d7_KjU = (i10 & 1) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j5;
        long m3770getUnspecified0d7_KjU2 = (i10 & 2) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j6;
        long m3770getUnspecified0d7_KjU3 = (i10 & 4) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j7;
        long m3770getUnspecified0d7_KjU4 = (i10 & 8) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j8;
        long m3770getUnspecified0d7_KjU5 = (i10 & 16) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j9;
        long m3770getUnspecified0d7_KjU6 = (i10 & 32) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j10;
        long m3770getUnspecified0d7_KjU7 = (i10 & 64) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j11;
        long m3770getUnspecified0d7_KjU8 = (i10 & 128) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j12;
        long m3770getUnspecified0d7_KjU9 = (i10 & 256) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j13;
        long m3770getUnspecified0d7_KjU10 = (i10 & 512) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j14;
        TextSelectionColors textSelectionColors2 = (i10 & 1024) != 0 ? null : textSelectionColors;
        long m3770getUnspecified0d7_KjU11 = (i10 & 2048) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j15;
        long m3770getUnspecified0d7_KjU12 = (i10 & 4096) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j16;
        long m3770getUnspecified0d7_KjU13 = (i10 & 8192) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j17;
        long m3770getUnspecified0d7_KjU14 = (i10 & 16384) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j18;
        long m3770getUnspecified0d7_KjU15 = (32768 & i10) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j19;
        long m3770getUnspecified0d7_KjU16 = (65536 & i10) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j20;
        long m3770getUnspecified0d7_KjU17 = (131072 & i10) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j21;
        long m3770getUnspecified0d7_KjU18 = (262144 & i10) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j22;
        long m3770getUnspecified0d7_KjU19 = (524288 & i10) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j23;
        long m3770getUnspecified0d7_KjU20 = (1048576 & i10) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j24;
        long m3770getUnspecified0d7_KjU21 = (2097152 & i10) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j25;
        long m3770getUnspecified0d7_KjU22 = (4194304 & i10) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j26;
        long m3770getUnspecified0d7_KjU23 = (8388608 & i10) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j27;
        long m3770getUnspecified0d7_KjU24 = (16777216 & i10) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j28;
        long m3770getUnspecified0d7_KjU25 = (33554432 & i10) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j29;
        long m3770getUnspecified0d7_KjU26 = (67108864 & i10) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j30;
        long m3770getUnspecified0d7_KjU27 = (134217728 & i10) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j31;
        long m3770getUnspecified0d7_KjU28 = (268435456 & i10) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j32;
        long m3770getUnspecified0d7_KjU29 = (536870912 & i10) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j33;
        long m3770getUnspecified0d7_KjU30 = (i10 & 1073741824) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j34;
        long m3770getUnspecified0d7_KjU31 = (i11 & 1) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j35;
        long m3770getUnspecified0d7_KjU32 = (i11 & 2) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j36;
        long m3770getUnspecified0d7_KjU33 = (i11 & 4) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j37;
        long m3770getUnspecified0d7_KjU34 = (i11 & 8) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j38;
        long m3770getUnspecified0d7_KjU35 = (i11 & 16) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j39;
        long m3770getUnspecified0d7_KjU36 = (i11 & 32) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j40;
        long m3770getUnspecified0d7_KjU37 = (i11 & 64) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j41;
        long m3770getUnspecified0d7_KjU38 = (i11 & 128) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j42;
        long m3770getUnspecified0d7_KjU39 = (i11 & 256) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j43;
        long m3770getUnspecified0d7_KjU40 = (i11 & 512) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j44;
        long m3770getUnspecified0d7_KjU41 = (i11 & 1024) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j45;
        long m3770getUnspecified0d7_KjU42 = (i11 & 2048) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j46;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1513344955, i5, i6, "androidx.compose.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:298)");
        }
        TextFieldColors m2369copyejIjP34 = getDefaultTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i9 >> 6) & 112).m2369copyejIjP34(m3770getUnspecified0d7_KjU, m3770getUnspecified0d7_KjU2, m3770getUnspecified0d7_KjU3, m3770getUnspecified0d7_KjU4, m3770getUnspecified0d7_KjU5, m3770getUnspecified0d7_KjU6, m3770getUnspecified0d7_KjU7, m3770getUnspecified0d7_KjU8, m3770getUnspecified0d7_KjU9, m3770getUnspecified0d7_KjU10, textSelectionColors2, m3770getUnspecified0d7_KjU11, m3770getUnspecified0d7_KjU12, m3770getUnspecified0d7_KjU13, m3770getUnspecified0d7_KjU14, m3770getUnspecified0d7_KjU15, m3770getUnspecified0d7_KjU16, m3770getUnspecified0d7_KjU17, m3770getUnspecified0d7_KjU18, m3770getUnspecified0d7_KjU19, m3770getUnspecified0d7_KjU20, m3770getUnspecified0d7_KjU21, m3770getUnspecified0d7_KjU22, m3770getUnspecified0d7_KjU23, m3770getUnspecified0d7_KjU24, m3770getUnspecified0d7_KjU25, m3770getUnspecified0d7_KjU26, m3770getUnspecified0d7_KjU27, m3770getUnspecified0d7_KjU28, m3770getUnspecified0d7_KjU29, m3770getUnspecified0d7_KjU30, m3770getUnspecified0d7_KjU31, m3770getUnspecified0d7_KjU32, m3770getUnspecified0d7_KjU33, m3770getUnspecified0d7_KjU34, m3770getUnspecified0d7_KjU35, m3770getUnspecified0d7_KjU36, m3770getUnspecified0d7_KjU37, m3770getUnspecified0d7_KjU38, m3770getUnspecified0d7_KjU39, m3770getUnspecified0d7_KjU40, m3770getUnspecified0d7_KjU41, m3770getUnspecified0d7_KjU42);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m2369copyejIjP34;
    }

    @p4.l
    /* renamed from: contentPaddingWithLabel-a9UjIt4, reason: not valid java name */
    public final PaddingValues m2423contentPaddingWithLabela9UjIt4(float f5, float f6, float f7, float f8) {
        return PaddingKt.m549PaddingValuesa9UjIt4(f5, f7, f6, f8);
    }

    @p4.l
    /* renamed from: contentPaddingWithoutLabel-a9UjIt4, reason: not valid java name */
    public final PaddingValues m2424contentPaddingWithoutLabela9UjIt4(float f5, float f6, float f7, float f8) {
        return PaddingKt.m549PaddingValuesa9UjIt4(f5, f6, f7, f8);
    }

    @p4.l
    @u3.h(name = "getDefaultTextFieldColors")
    @Composable
    public final TextFieldColors getDefaultTextFieldColors(@p4.l ColorScheme colorScheme, @p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(1341970309);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1341970309, i5, -1, "androidx.compose.material3.TextFieldDefaults.<get-defaultTextFieldColors> (TextFieldDefaults.kt:346)");
        }
        TextFieldColors defaultTextFieldColorsCached$material3_release = colorScheme.getDefaultTextFieldColorsCached$material3_release();
        if (defaultTextFieldColorsCached$material3_release == null) {
            FilledTextFieldTokens filledTextFieldTokens = FilledTextFieldTokens.INSTANCE;
            defaultTextFieldColorsCached$material3_release = new TextFieldColors(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getFocusInputColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputColor()), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getDisabledInputColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getErrorInputColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getCaretColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getErrorFocusCaretColor()), (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getFocusActiveIndicatorColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getActiveIndicatorColor()), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getDisabledActiveIndicatorColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getErrorActiveIndicatorColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getFocusLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getLeadingIconColor()), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getDisabledLeadingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getErrorLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getFocusTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getTrailingIconColor()), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getDisabledTrailingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getErrorTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getFocusLabelColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getLabelColor()), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getDisabledLabelColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getErrorLabelColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputPlaceholderColor()), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getDisabledInputColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getFocusSupportingColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getSupportingColor()), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getDisabledSupportingColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getErrorSupportingColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputPrefixColor()), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputPrefixColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputSuffixColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputSuffixColor()), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputSuffixColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputSuffixColor()), null);
            colorScheme.setDefaultTextFieldColorsCached$material3_release(defaultTextFieldColorsCached$material3_release);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultTextFieldColorsCached$material3_release;
    }

    @p4.l
    @u3.h(name = "getFilledShape")
    @Composable
    public final Shape getFilledShape(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(611926497);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(611926497, i5, -1, "androidx.compose.material3.TextFieldDefaults.<get-filledShape> (TextFieldDefaults.kt:534)");
        }
        Shape shape = getShape(composer, i5 & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    /* renamed from: getFocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m2425getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* renamed from: getFocusedIndicatorThickness-D9Ej5fM, reason: not valid java name */
    public final float m2426getFocusedIndicatorThicknessD9Ej5fM() {
        return FocusedIndicatorThickness;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m2427getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m2428getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    @p4.l
    @u3.h(name = "getOutlinedShape")
    @Composable
    public final Shape getOutlinedShape(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-584749279);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-584749279, i5, -1, "androidx.compose.material3.TextFieldDefaults.<get-outlinedShape> (TextFieldDefaults.kt:527)");
        }
        Shape shape = OutlinedTextFieldDefaults.INSTANCE.getShape(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @p4.l
    @u3.h(name = "getShape")
    @Composable
    public final Shape getShape(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-1941327459);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1941327459, i5, -1, "androidx.compose.material3.TextFieldDefaults.<get-shape> (TextFieldDefaults.kt:58)");
        }
        Shape value = ShapesKt.getValue(FilledTextFieldTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m2429getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }

    /* renamed from: getUnfocusedIndicatorThickness-D9Ej5fM, reason: not valid java name */
    public final float m2430getUnfocusedIndicatorThicknessD9Ej5fM() {
        return UnfocusedIndicatorThickness;
    }

    @p4.l
    @ExperimentalMaterial3Api
    /* renamed from: indicatorLine-gv0btCI, reason: not valid java name */
    public final Modifier m2431indicatorLinegv0btCI(@p4.l Modifier modifier, boolean z4, boolean z5, @p4.l InteractionSource interactionSource, @p4.l TextFieldColors textFieldColors, float f5, float f6) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new TextFieldDefaults$indicatorLinegv0btCI$$inlined$debugInspectorInfo$1(z4, z5, interactionSource, textFieldColors, f5, f6);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new TextFieldDefaults$indicatorLine$2(z4, z5, interactionSource, textFieldColors, f5, f6));
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Renamed to `OutlinedTextFieldDefaults.colors` with additional parameters tocontrol container color based on state.", replaceWith = @b1(expression = "OutlinedTextFieldDefaults.colors(\n        focusedTextColor = focusedTextColor,\n        unfocusedTextColor = unfocusedTextColor,\n        disabledTextColor = disabledTextColor,\n        errorTextColor = errorTextColor,\n        focusedContainerColor = containerColor,\n        unfocusedContainerColor = containerColor,\n        disabledContainerColor = containerColor,\n        errorContainerColor = errorContainerColor,\n        cursorColor = cursorColor,\n        errorCursorColor = errorCursorColor,\n        selectionColors = selectionColors,\n        focusedBorderColor = focusedBorderColor,\n        unfocusedBorderColor = unfocusedBorderColor,\n        disabledBorderColor = disabledBorderColor,\n        errorBorderColor = errorBorderColor,\n        focusedLeadingIconColor = focusedLeadingIconColor,\n        unfocusedLeadingIconColor = unfocusedLeadingIconColor,\n        disabledLeadingIconColor = disabledLeadingIconColor,\n        errorLeadingIconColor = errorLeadingIconColor,\n        focusedTrailingIconColor = focusedTrailingIconColor,\n        unfocusedTrailingIconColor = unfocusedTrailingIconColor,\n        disabledTrailingIconColor = disabledTrailingIconColor,\n        errorTrailingIconColor = errorTrailingIconColor,\n        focusedLabelColor = focusedLabelColor,\n        unfocusedLabelColor = unfocusedLabelColor,\n        disabledLabelColor = disabledLabelColor,\n        errorLabelColor = errorLabelColor,\n        focusedPlaceholderColor = focusedPlaceholderColor,\n        unfocusedPlaceholderColor = unfocusedPlaceholderColor,\n        disabledPlaceholderColor = disabledPlaceholderColor,\n        errorPlaceholderColor = errorPlaceholderColor,\n        focusedSupportingTextColor = focusedSupportingTextColor,\n        unfocusedSupportingTextColor = unfocusedSupportingTextColor,\n        disabledSupportingTextColor = disabledSupportingTextColor,\n        errorSupportingTextColor = errorSupportingTextColor,\n        focusedPrefixColor = focusedPrefixColor,\n        unfocusedPrefixColor = unfocusedPrefixColor,\n        disabledPrefixColor = disabledPrefixColor,\n        errorPrefixColor = errorPrefixColor,\n        focusedSuffixColor = focusedSuffixColor,\n        unfocusedSuffixColor = unfocusedSuffixColor,\n        disabledSuffixColor = disabledSuffixColor,\n        errorSuffixColor = errorSuffixColor,\n    )", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    @ExperimentalMaterial3Api
    @p4.l
    @Composable
    /* renamed from: outlinedTextFieldColors-M37tBTI, reason: not valid java name */
    public final TextFieldColors m2432outlinedTextFieldColorsM37tBTI(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, @p4.m TextSelectionColors textSelectionColors, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, @p4.m Composer composer, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        composer.startReplaceableGroup(618732090);
        long value = (i10 & 1) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getFocusInputColor(), composer, 6) : j5;
        long value2 = (i10 & 2) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputColor(), composer, 6) : j6;
        long m3733copywmQWz5c$default = (i10 & 4) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long value3 = (i10 & 8) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getErrorInputColor(), composer, 6) : j8;
        long m3769getTransparent0d7_KjU = (i10 & 16) != 0 ? Color.Companion.m3769getTransparent0d7_KjU() : j9;
        long m3769getTransparent0d7_KjU2 = (i10 & 32) != 0 ? Color.Companion.m3769getTransparent0d7_KjU() : j10;
        long value4 = (i10 & 64) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j11;
        long value5 = (i10 & 128) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getErrorFocusCaretColor(), composer, 6) : j12;
        TextSelectionColors textSelectionColors2 = (i10 & 256) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long value6 = (i10 & 512) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getFocusOutlineColor(), composer, 6) : j13;
        long value7 = (i10 & 1024) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getOutlineColor(), composer, 6) : j14;
        long m3733copywmQWz5c$default2 = (i10 & 2048) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long value8 = (i10 & 4096) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getErrorOutlineColor(), composer, 6) : j16;
        long value9 = (i10 & 8192) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getFocusLeadingIconColor(), composer, 6) : j17;
        long value10 = (i10 & 16384) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j18;
        long m3733copywmQWz5c$default3 = (32768 & i10) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        long value11 = (65536 & i10) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getErrorLeadingIconColor(), composer, 6) : j20;
        long value12 = (131072 & i10) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getFocusTrailingIconColor(), composer, 6) : j21;
        long value13 = (262144 & i10) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j22;
        long m3733copywmQWz5c$default4 = (524288 & i10) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j23;
        long value14 = (1048576 & i10) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getErrorTrailingIconColor(), composer, 6) : j24;
        long value15 = (2097152 & i10) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getFocusLabelColor(), composer, 6) : j25;
        long value16 = (4194304 & i10) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getLabelColor(), composer, 6) : j26;
        long m3733copywmQWz5c$default5 = (8388608 & i10) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getDisabledLabelColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j27;
        long value17 = (16777216 & i10) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getErrorLabelColor(), composer, 6) : j28;
        long value18 = (33554432 & i10) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j29;
        long value19 = (67108864 & i10) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j30;
        long m3733copywmQWz5c$default6 = (134217728 & i10) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j31;
        long value20 = (268435456 & i10) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j32;
        long value21 = (536870912 & i10) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getFocusSupportingColor(), composer, 6) : j33;
        long value22 = (i10 & 1073741824) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getSupportingColor(), composer, 6) : j34;
        long m3733copywmQWz5c$default7 = (i11 & 1) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getDisabledSupportingColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j35;
        long value23 = (i11 & 2) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getErrorSupportingColor(), composer, 6) : j36;
        long value24 = (i11 & 4) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j37;
        long value25 = (i11 & 8) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j38;
        long m3733copywmQWz5c$default8 = (i11 & 16) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j39;
        long value26 = (i11 & 32) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j40;
        long value27 = (i11 & 64) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j41;
        long value28 = (i11 & 128) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j42;
        long m3733copywmQWz5c$default9 = (i11 & 256) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j43;
        long value29 = (i11 & 512) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j44;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(618732090, i5, i6, "androidx.compose.material3.TextFieldDefaults.outlinedTextFieldColors (TextFieldDefaults.kt:933)");
        }
        int i12 = i5 << 6;
        int i13 = i5 >> 24;
        int i14 = i6 << 6;
        int i15 = (i13 & 112) | (i13 & 14) | (i14 & 896) | (i14 & 7168) | (i14 & 57344) | (i14 & 458752) | (i14 & 3670016) | (i14 & 29360128) | (i14 & 234881024) | (i14 & 1879048192);
        int i16 = i6 >> 24;
        int i17 = i7 << 6;
        int i18 = (i16 & 112) | (i16 & 14) | (i17 & 896) | (i17 & 7168) | (i17 & 57344) | (i17 & 458752) | (i17 & 3670016) | (i17 & 29360128) | (i17 & 234881024) | (i17 & 1879048192);
        int i19 = i7 >> 24;
        int i20 = i8 << 6;
        int i21 = (i19 & 112) | (i19 & 14) | (i20 & 896) | (i20 & 7168) | (i20 & 57344) | (i20 & 458752) | (i20 & 3670016) | (i20 & 29360128) | (i20 & 234881024) | (i20 & 1879048192);
        int i22 = i8 >> 24;
        TextFieldColors m2054colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m2054colors0hiis_0(value, value2, m3733copywmQWz5c$default, value3, m3769getTransparent0d7_KjU, m3769getTransparent0d7_KjU, m3769getTransparent0d7_KjU, m3769getTransparent0d7_KjU2, value4, value5, textSelectionColors2, value6, value7, m3733copywmQWz5c$default2, value8, value9, value10, m3733copywmQWz5c$default3, value11, value12, value13, m3733copywmQWz5c$default4, value14, value15, value16, m3733copywmQWz5c$default5, value17, value18, value19, m3733copywmQWz5c$default6, value20, value21, value22, m3733copywmQWz5c$default7, value23, value24, value25, m3733copywmQWz5c$default8, value26, value27, value28, m3733copywmQWz5c$default9, value29, composer, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | ((i5 << 3) & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024) | (i12 & 1879048192), i15, i18, i21, (i22 & 112) | (i22 & 14) | 3072 | ((i9 << 6) & 896), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m2054colors0hiis_0;
    }

    @Composable
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility")
    @ExperimentalMaterial3Api
    /* renamed from: outlinedTextFieldColors-eS1Emto, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m2433outlinedTextFieldColorseS1Emto(long j5, long j6, long j7, long j8, long j9, TextSelectionColors textSelectionColors, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, Composer composer, int i5, int i6, int i7, int i8, int i9, int i10) {
        composer.startReplaceableGroup(1767818445);
        long value = (i9 & 1) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputColor(), composer, 6) : j5;
        long m3733copywmQWz5c$default = (i9 & 2) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long m3769getTransparent0d7_KjU = (i9 & 4) != 0 ? Color.Companion.m3769getTransparent0d7_KjU() : j7;
        long value2 = (i9 & 8) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j8;
        long value3 = (i9 & 16) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getErrorFocusCaretColor(), composer, 6) : j9;
        TextSelectionColors textSelectionColors2 = (i9 & 32) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long value4 = (i9 & 64) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getFocusOutlineColor(), composer, 6) : j10;
        long value5 = (i9 & 128) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getOutlineColor(), composer, 6) : j11;
        long m3733copywmQWz5c$default2 = (i9 & 256) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long value6 = (i9 & 512) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getErrorOutlineColor(), composer, 6) : j13;
        long value7 = (i9 & 1024) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getFocusLeadingIconColor(), composer, 6) : j14;
        long value8 = (i9 & 2048) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j15;
        long m3733copywmQWz5c$default3 = (i9 & 4096) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long value9 = (i9 & 8192) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getErrorLeadingIconColor(), composer, 6) : j17;
        long value10 = (i9 & 16384) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getFocusTrailingIconColor(), composer, 6) : j18;
        long value11 = (32768 & i9) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j19;
        long m3733copywmQWz5c$default4 = (65536 & i9) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long value12 = (131072 & i9) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getErrorTrailingIconColor(), composer, 6) : j21;
        long value13 = (262144 & i9) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getFocusLabelColor(), composer, 6) : j22;
        long value14 = (524288 & i9) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getLabelColor(), composer, 6) : j23;
        long m3733copywmQWz5c$default5 = (1048576 & i9) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getDisabledLabelColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j24;
        long value15 = (2097152 & i9) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getErrorLabelColor(), composer, 6) : j25;
        long value16 = (4194304 & i9) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j26;
        long m3733copywmQWz5c$default6 = (8388608 & i9) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j27;
        long value17 = (16777216 & i9) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getFocusSupportingColor(), composer, 6) : j28;
        long value18 = (33554432 & i9) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getSupportingColor(), composer, 6) : j29;
        long m3733copywmQWz5c$default7 = (67108864 & i9) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getDisabledSupportingColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j30;
        long value19 = (134217728 & i9) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getErrorSupportingColor(), composer, 6) : j31;
        long value20 = (268435456 & i9) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j32;
        long value21 = (536870912 & i9) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j33;
        long m3733copywmQWz5c$default8 = (i9 & 1073741824) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j34;
        long value22 = (i10 & 1) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j35;
        long value23 = (i10 & 2) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j36;
        long value24 = (i10 & 4) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j37;
        long m3733copywmQWz5c$default9 = (i10 & 8) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j38;
        long value25 = (i10 & 16) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j39;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1767818445, i5, i6, "androidx.compose.material3.TextFieldDefaults.outlinedTextFieldColors (TextFieldDefaults.kt:1262)");
        }
        int i11 = i5 << 3;
        int i12 = (i5 & 14) | (i11 & 112) | (i11 & 896);
        int i13 = i5 << 9;
        int i14 = i12 | (i13 & 7168) | ((i5 << 6) & 57344) | (i13 & 458752) | ((i5 << 12) & 3670016);
        int i15 = i5 << 15;
        int i16 = i14 | (i15 & 29360128) | (i15 & 234881024) | (i15 & 1879048192);
        int i17 = i5 >> 15;
        int i18 = i6 << 15;
        int i19 = (i17 & 57344) | (i17 & 14) | (i17 & 112) | (i17 & 896) | (i17 & 7168) | (i18 & 458752) | (i18 & 3670016) | (i18 & 29360128) | (i18 & 234881024) | (i18 & 1879048192);
        int i20 = i6 >> 15;
        int i21 = i7 << 15;
        int i22 = (i20 & 57344) | (i20 & 14) | (i20 & 112) | (i20 & 896) | (i20 & 7168) | (i21 & 458752) | (i21 & 3670016) | (i21 & 29360128);
        int i23 = i7 << 18;
        int i24 = i22 | (i23 & 234881024) | (i23 & 1879048192);
        int i25 = i7 >> 9;
        int i26 = ((i7 >> 6) & 14) | (i25 & 112) | (i25 & 896) | (i25 & 7168) | (i25 & 57344) | (i25 & 458752) | (i25 & 3670016);
        int i27 = i8 << 21;
        int i28 = i26 | (i27 & 29360128) | (i27 & 234881024) | (i27 & 1879048192);
        int i29 = i8 >> 9;
        TextFieldColors m2054colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m2054colors0hiis_0(value, value, m3733copywmQWz5c$default, value, m3769getTransparent0d7_KjU, m3769getTransparent0d7_KjU, m3769getTransparent0d7_KjU, m3769getTransparent0d7_KjU, value2, value3, textSelectionColors2, value4, value5, m3733copywmQWz5c$default2, value6, value7, value8, m3733copywmQWz5c$default3, value9, value10, value11, m3733copywmQWz5c$default4, value12, value13, value14, m3733copywmQWz5c$default5, value15, value16, value16, m3733copywmQWz5c$default6, value16, value17, value18, m3733copywmQWz5c$default7, value19, value20, value21, m3733copywmQWz5c$default8, value22, value23, value24, m3733copywmQWz5c$default9, value25, composer, i16, i19, i24, i28, (i29 & 14) | 3072 | (i29 & 112) | (i29 & 896), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m2054colors0hiis_0;
    }

    @p4.l
    @kotlin.k(level = kotlin.m.WARNING, message = "Renamed to `OutlinedTextFieldDefaults.contentPadding`", replaceWith = @b1(expression = "OutlinedTextFieldDefaults.contentPadding(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    /* renamed from: outlinedTextFieldPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m2434outlinedTextFieldPaddinga9UjIt4(float f5, float f6, float f7, float f8) {
        return OutlinedTextFieldDefaults.INSTANCE.m2055contentPaddinga9UjIt4(f5, f6, f7, f8);
    }

    @p4.l
    @ExperimentalMaterial3Api
    /* renamed from: supportingTextPadding-a9UjIt4$material3_release, reason: not valid java name */
    public final PaddingValues m2435supportingTextPaddinga9UjIt4$material3_release(float f5, float f6, float f7, float f8) {
        return PaddingKt.m549PaddingValuesa9UjIt4(f5, f6, f7, f8);
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Renamed to `TextFieldDefaults.colors` with additional parameters to controlcontainer color based on state.", replaceWith = @b1(expression = "TextFieldDefaults.colors(\n        focusedTextColor = focusedTextColor,\n        unfocusedTextColor = unfocusedTextColor,\n        disabledTextColor = disabledTextColor,\n        errorTextColor = errorTextColor,\n        focusedContainerColor = containerColor,\n        unfocusedContainerColor = containerColor,\n        disabledContainerColor = containerColor,\n        errorContainerColor = errorContainerColor,\n        cursorColor = cursorColor,\n        errorCursorColor = errorCursorColor,\n        selectionColors = selectionColors,\n        focusedIndicatorColor = focusedIndicatorColor,\n        unfocusedIndicatorColor = unfocusedIndicatorColor,\n        disabledIndicatorColor = disabledIndicatorColor,\n        errorIndicatorColor = errorIndicatorColor,\n        focusedLeadingIconColor = focusedLeadingIconColor,\n        unfocusedLeadingIconColor = unfocusedLeadingIconColor,\n        disabledLeadingIconColor = disabledLeadingIconColor,\n        errorLeadingIconColor = errorLeadingIconColor,\n        focusedTrailingIconColor = focusedTrailingIconColor,\n        unfocusedTrailingIconColor = unfocusedTrailingIconColor,\n        disabledTrailingIconColor = disabledTrailingIconColor,\n        errorTrailingIconColor = errorTrailingIconColor,\n        focusedLabelColor = focusedLabelColor,\n        unfocusedLabelColor = unfocusedLabelColor,\n        disabledLabelColor = disabledLabelColor,\n        errorLabelColor = errorLabelColor,\n        focusedPlaceholderColor = focusedPlaceholderColor,\n        unfocusedPlaceholderColor = unfocusedPlaceholderColor,\n        disabledPlaceholderColor = disabledPlaceholderColor,\n        errorPlaceholderColor = errorPlaceholderColor,\n        focusedSupportingTextColor = focusedSupportingTextColor,\n        unfocusedSupportingTextColor = unfocusedSupportingTextColor,\n        disabledSupportingTextColor = disabledSupportingTextColor,\n        errorSupportingTextColor = errorSupportingTextColor,\n        focusedPrefixColor = focusedPrefixColor,\n        unfocusedPrefixColor = unfocusedPrefixColor,\n        disabledPrefixColor = disabledPrefixColor,\n        errorPrefixColor = errorPrefixColor,\n        focusedSuffixColor = focusedSuffixColor,\n        unfocusedSuffixColor = unfocusedSuffixColor,\n        disabledSuffixColor = disabledSuffixColor,\n        errorSuffixColor = errorSuffixColor,\n    )", imports = {}))
    @ExperimentalMaterial3Api
    @p4.l
    @Composable
    /* renamed from: textFieldColors-M37tBTI, reason: not valid java name */
    public final TextFieldColors m2436textFieldColorsM37tBTI(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, @p4.m TextSelectionColors textSelectionColors, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, @p4.m Composer composer, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        composer.startReplaceableGroup(568209592);
        long value = (i10 & 1) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getFocusInputColor(), composer, 6) : j5;
        long value2 = (i10 & 2) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputColor(), composer, 6) : j6;
        long m3733copywmQWz5c$default = (i10 & 4) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long value3 = (i10 & 8) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getErrorInputColor(), composer, 6) : j8;
        long value4 = (i10 & 16) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getContainerColor(), composer, 6) : j9;
        long value5 = (i10 & 32) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getContainerColor(), composer, 6) : j10;
        long value6 = (i10 & 64) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j11;
        long value7 = (i10 & 128) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getErrorFocusCaretColor(), composer, 6) : j12;
        TextSelectionColors textSelectionColors2 = (i10 & 256) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long value8 = (i10 & 512) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getFocusActiveIndicatorColor(), composer, 6) : j13;
        long value9 = (i10 & 1024) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getActiveIndicatorColor(), composer, 6) : j14;
        long m3733copywmQWz5c$default2 = (i10 & 2048) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledActiveIndicatorColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long value10 = (i10 & 4096) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getErrorActiveIndicatorColor(), composer, 6) : j16;
        long value11 = (i10 & 8192) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getFocusLeadingIconColor(), composer, 6) : j17;
        long value12 = (i10 & 16384) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j18;
        long m3733copywmQWz5c$default3 = (32768 & i10) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        long value13 = (65536 & i10) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getErrorLeadingIconColor(), composer, 6) : j20;
        long value14 = (131072 & i10) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getFocusTrailingIconColor(), composer, 6) : j21;
        long value15 = (262144 & i10) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j22;
        long m3733copywmQWz5c$default4 = (524288 & i10) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j23;
        long value16 = (1048576 & i10) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getErrorTrailingIconColor(), composer, 6) : j24;
        long value17 = (2097152 & i10) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getFocusLabelColor(), composer, 6) : j25;
        long value18 = (4194304 & i10) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getLabelColor(), composer, 6) : j26;
        long m3733copywmQWz5c$default5 = (8388608 & i10) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledLabelColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j27;
        long value19 = (16777216 & i10) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getErrorLabelColor(), composer, 6) : j28;
        long value20 = (33554432 & i10) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j29;
        long value21 = (67108864 & i10) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j30;
        long m3733copywmQWz5c$default6 = (134217728 & i10) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j31;
        long value22 = (268435456 & i10) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j32;
        long value23 = (536870912 & i10) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getFocusSupportingColor(), composer, 6) : j33;
        long value24 = (i10 & 1073741824) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getSupportingColor(), composer, 6) : j34;
        long m3733copywmQWz5c$default7 = (i11 & 1) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledSupportingColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j35;
        long value25 = (i11 & 2) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getErrorSupportingColor(), composer, 6) : j36;
        long value26 = (i11 & 4) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j37;
        long value27 = (i11 & 8) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j38;
        long m3733copywmQWz5c$default8 = (i11 & 16) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j39;
        long value28 = (i11 & 32) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j40;
        long value29 = (i11 & 64) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j41;
        long value30 = (i11 & 128) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j42;
        long m3733copywmQWz5c$default9 = (i11 & 256) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j43;
        long value31 = (i11 & 512) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j44;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(568209592, i5, i6, "androidx.compose.material3.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:783)");
        }
        int i12 = i5 << 6;
        int i13 = i5 >> 24;
        int i14 = i6 << 6;
        int i15 = (i13 & 112) | (i13 & 14) | (i14 & 896) | (i14 & 7168) | (i14 & 57344) | (i14 & 458752) | (i14 & 3670016) | (i14 & 29360128) | (i14 & 234881024) | (i14 & 1879048192);
        int i16 = i6 >> 24;
        int i17 = i7 << 6;
        int i18 = (i16 & 112) | (i16 & 14) | (i17 & 896) | (i17 & 7168) | (i17 & 57344) | (i17 & 458752) | (i17 & 3670016) | (i17 & 29360128) | (i17 & 234881024) | (i17 & 1879048192);
        int i19 = i7 >> 24;
        int i20 = i8 << 6;
        int i21 = (i19 & 112) | (i19 & 14) | (i20 & 896) | (i20 & 7168) | (i20 & 57344) | (i20 & 458752) | (i20 & 3670016) | (i20 & 29360128) | (i20 & 234881024) | (i20 & 1879048192);
        int i22 = i8 >> 24;
        int i23 = i9 << 6;
        TextFieldColors m2422colors0hiis_0 = m2422colors0hiis_0(value, value2, m3733copywmQWz5c$default, value3, value4, value4, value4, value5, value6, value7, textSelectionColors2, value8, value9, m3733copywmQWz5c$default2, value10, value11, value12, m3733copywmQWz5c$default3, value13, value14, value15, m3733copywmQWz5c$default4, value16, value17, value18, m3733copywmQWz5c$default5, value19, value20, value21, m3733copywmQWz5c$default6, value22, value23, value24, m3733copywmQWz5c$default7, value25, value26, value27, m3733copywmQWz5c$default8, value28, value29, value30, m3733copywmQWz5c$default9, value31, composer, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | ((i5 << 3) & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024) | (i12 & 1879048192), i15, i18, i21, (i22 & 112) | (i22 & 14) | (i23 & 896) | (i23 & 7168), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m2422colors0hiis_0;
    }

    @Composable
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility")
    @ExperimentalMaterial3Api
    /* renamed from: textFieldColors-eS1Emto, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m2437textFieldColorseS1Emto(long j5, long j6, long j7, long j8, long j9, TextSelectionColors textSelectionColors, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, Composer composer, int i5, int i6, int i7, int i8, int i9, int i10) {
        composer.startReplaceableGroup(-595874869);
        long value = (i9 & 1) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputColor(), composer, 6) : j5;
        long m3733copywmQWz5c$default = (i9 & 2) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long value2 = (i9 & 4) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getContainerColor(), composer, 6) : j7;
        long value3 = (i9 & 8) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j8;
        long value4 = (i9 & 16) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getErrorFocusCaretColor(), composer, 6) : j9;
        TextSelectionColors textSelectionColors2 = (i9 & 32) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long value5 = (i9 & 64) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getFocusActiveIndicatorColor(), composer, 6) : j10;
        long value6 = (i9 & 128) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getActiveIndicatorColor(), composer, 6) : j11;
        long m3733copywmQWz5c$default2 = (i9 & 256) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledActiveIndicatorColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long value7 = (i9 & 512) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getErrorActiveIndicatorColor(), composer, 6) : j13;
        long value8 = (i9 & 1024) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getFocusLeadingIconColor(), composer, 6) : j14;
        long value9 = (i9 & 2048) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j15;
        long m3733copywmQWz5c$default3 = (i9 & 4096) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long value10 = (i9 & 8192) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getErrorLeadingIconColor(), composer, 6) : j17;
        long value11 = (i9 & 16384) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getFocusTrailingIconColor(), composer, 6) : j18;
        long value12 = (32768 & i9) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j19;
        long m3733copywmQWz5c$default4 = (65536 & i9) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long value13 = (131072 & i9) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getErrorTrailingIconColor(), composer, 6) : j21;
        long value14 = (262144 & i9) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getFocusLabelColor(), composer, 6) : j22;
        long value15 = (524288 & i9) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getLabelColor(), composer, 6) : j23;
        long m3733copywmQWz5c$default5 = (1048576 & i9) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledLabelColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j24;
        long value16 = (2097152 & i9) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getErrorLabelColor(), composer, 6) : j25;
        long value17 = (4194304 & i9) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j26;
        long m3733copywmQWz5c$default6 = (8388608 & i9) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j27;
        long value18 = (16777216 & i9) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getFocusSupportingColor(), composer, 6) : j28;
        long value19 = (33554432 & i9) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getSupportingColor(), composer, 6) : j29;
        long m3733copywmQWz5c$default7 = (67108864 & i9) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledSupportingColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j30;
        long value20 = (134217728 & i9) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getErrorSupportingColor(), composer, 6) : j31;
        long value21 = (268435456 & i9) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j32;
        long value22 = (536870912 & i9) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j33;
        long m3733copywmQWz5c$default8 = (i9 & 1073741824) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j34;
        long value23 = (i10 & 1) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j35;
        long value24 = (i10 & 2) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j36;
        long value25 = (i10 & 4) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j37;
        long m3733copywmQWz5c$default9 = (i10 & 8) != 0 ? Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j38;
        long value26 = (i10 & 16) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j39;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-595874869, i5, i6, "androidx.compose.material3.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:1167)");
        }
        int i11 = i5 << 3;
        int i12 = (i5 & 14) | (i11 & 112) | (i11 & 896);
        int i13 = i5 << 9;
        int i14 = i12 | (i13 & 7168) | ((i5 << 6) & 57344) | (i13 & 458752) | ((i5 << 12) & 3670016);
        int i15 = i5 << 15;
        int i16 = i14 | (i15 & 29360128) | (i15 & 234881024) | (i15 & 1879048192);
        int i17 = i5 >> 15;
        int i18 = i6 << 15;
        int i19 = (i17 & 57344) | (i17 & 14) | (i17 & 112) | (i17 & 896) | (i17 & 7168) | (i18 & 458752) | (i18 & 3670016) | (i18 & 29360128) | (i18 & 234881024) | (i18 & 1879048192);
        int i20 = i6 >> 15;
        int i21 = i7 << 15;
        int i22 = (i20 & 57344) | (i20 & 14) | (i20 & 112) | (i20 & 896) | (i20 & 7168) | (i21 & 458752) | (i21 & 3670016) | (i21 & 29360128);
        int i23 = i7 << 18;
        int i24 = i22 | (i23 & 234881024) | (i23 & 1879048192);
        int i25 = i7 >> 9;
        int i26 = ((i7 >> 6) & 14) | (i25 & 112) | (i25 & 896) | (i25 & 7168) | (i25 & 57344) | (i25 & 458752) | (i25 & 3670016);
        int i27 = i8 << 21;
        int i28 = i26 | (i27 & 29360128) | (i27 & 234881024) | (i27 & 1879048192);
        int i29 = i8 >> 9;
        TextFieldColors m2422colors0hiis_0 = m2422colors0hiis_0(value, value, m3733copywmQWz5c$default, value, value2, value2, value2, value2, value3, value4, textSelectionColors2, value5, value6, m3733copywmQWz5c$default2, value7, value8, value9, m3733copywmQWz5c$default3, value10, value11, value12, m3733copywmQWz5c$default4, value13, value14, value15, m3733copywmQWz5c$default5, value16, value17, value17, m3733copywmQWz5c$default6, value17, value18, value19, m3733copywmQWz5c$default7, value20, value21, value22, m3733copywmQWz5c$default8, value23, value24, value25, m3733copywmQWz5c$default9, value26, composer, i16, i19, i24, i28, (i29 & 14) | (i29 & 112) | (i29 & 896) | (i29 & 7168), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m2422colors0hiis_0;
    }

    @p4.l
    @kotlin.k(level = kotlin.m.WARNING, message = "Renamed to `TextFieldDefaults.contentPaddingWithLabel`", replaceWith = @b1(expression = "TextFieldDefaults.contentPaddingWithLabel(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {}))
    /* renamed from: textFieldWithLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m2438textFieldWithLabelPaddinga9UjIt4(float f5, float f6, float f7, float f8) {
        return m2423contentPaddingWithLabela9UjIt4(f5, f6, f7, f8);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.WARNING, message = "Renamed to `TextFieldDefaults.contentPaddingWithoutLabel`", replaceWith = @b1(expression = "TextFieldDefaults.contentPaddingWithoutLabel(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {}))
    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m2439textFieldWithoutLabelPaddinga9UjIt4(float f5, float f6, float f7, float f8) {
        return m2424contentPaddingWithoutLabela9UjIt4(f5, f6, f7, f8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x019a, code lost:
    
        if (r8.changed(r48) == false) goto L145;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x023d  */
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Use overload with prefix and suffix parameters")
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void OutlinedTextFieldDecorationBox(java.lang.String r35, v3.p r36, boolean r37, boolean r38, androidx.compose.ui.text.input.VisualTransformation r39, androidx.compose.foundation.interaction.InteractionSource r40, boolean r41, v3.p r42, v3.p r43, v3.p r44, v3.p r45, v3.p r46, androidx.compose.material3.TextFieldColors r47, androidx.compose.foundation.layout.PaddingValues r48, v3.p r49, androidx.compose.runtime.Composer r50, int r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 889
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox(java.lang.String, v3.p, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, v3.p, v3.p, v3.p, v3.p, v3.p, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, v3.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x01a2, code lost:
    
        if (r9.changed(r50) == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01bc, code lost:
    
        if (r9.changed(r51) == false) goto L157;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x034b  */
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Use overload with prefix and suffix parameters")
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void TextFieldDecorationBox(java.lang.String r37, v3.p r38, boolean r39, boolean r40, androidx.compose.ui.text.input.VisualTransformation r41, androidx.compose.foundation.interaction.InteractionSource r42, boolean r43, v3.p r44, v3.p r45, v3.p r46, v3.p r47, v3.p r48, androidx.compose.ui.graphics.Shape r49, androidx.compose.material3.TextFieldColors r50, androidx.compose.foundation.layout.PaddingValues r51, v3.p r52, androidx.compose.runtime.Composer r53, int r54, int r55, int r56) {
        /*
            Method dump skipped, instructions count: 1039
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox(java.lang.String, v3.p, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, v3.p, v3.p, v3.p, v3.p, v3.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, v3.p, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
