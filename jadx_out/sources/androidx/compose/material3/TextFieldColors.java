package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.jvm.internal.r1;

@kotlin.i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b7\b\u0007\u0018\u00002\u00020\u0001Bá\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\u0002\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020\u0002\u0012\u0006\u0010*\u001a\u00020\u0002\u0012\u0006\u0010+\u001a\u00020\u0002\u0012\u0006\u0010,\u001a\u00020\u0002\u0012\u0006\u0010-\u001a\u00020\u0002\u0012\u0006\u0010.\u001a\u00020\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001JÀ\u0003\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u00022\b\b\u0002\u0010$\u001a\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u00022\b\b\u0002\u0010&\u001a\u00020\u00022\b\b\u0002\u0010'\u001a\u00020\u00022\b\b\u0002\u0010(\u001a\u00020\u00022\b\b\u0002\u0010)\u001a\u00020\u00022\b\b\u0002\u0010*\u001a\u00020\u00022\b\b\u0002\u0010+\u001a\u00020\u00022\b\b\u0002\u0010,\u001a\u00020\u00022\b\b\u0002\u0010-\u001a\u00020\u00022\b\b\u0002\u0010.\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b/\u00100J#\u00106\u001a\u00020\r*\u0004\u0018\u00010\r2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\r02H\u0000¢\u0006\u0004\b4\u00105J-\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00020<2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\b=\u0010>J-\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00020<2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\b@\u0010>J-\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00020<2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\bB\u0010>J-\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00020<2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\bD\u0010>J-\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00020<2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\bF\u0010>J-\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00020<2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\bH\u0010>J-\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00020<2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\bJ\u0010>J-\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00020<2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\bL\u0010>J-\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00020<2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\bN\u0010>J-\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00020<2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\bP\u0010>J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020<2\u0006\u00109\u001a\u000207H\u0001¢\u0006\u0004\bR\u0010SJ\u0013\u0010U\u001a\u0002072\b\u0010T\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010W\u001a\u00020VH\u0016R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010X\u001a\u0004\bY\u0010ZR\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0004\u0010X\u001a\u0004\b[\u0010ZR\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010X\u001a\u0004\b\\\u0010ZR\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010X\u001a\u0004\b]\u0010ZR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010X\u001a\u0004\b^\u0010ZR\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010X\u001a\u0004\b_\u0010ZR\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010X\u001a\u0004\b`\u0010ZR\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010X\u001a\u0004\ba\u0010ZR\u001d\u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010X\u001a\u0004\bb\u0010ZR\u001d\u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010X\u001a\u0004\bc\u0010ZR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010d\u001a\u0004\be\u0010fR\u001d\u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010X\u001a\u0004\bg\u0010ZR\u001d\u0010\u0010\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010X\u001a\u0004\bh\u0010ZR\u001d\u0010\u0011\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010X\u001a\u0004\bi\u0010ZR\u001d\u0010\u0012\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010X\u001a\u0004\bj\u0010ZR\u001d\u0010\u0013\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010X\u001a\u0004\bk\u0010ZR\u001d\u0010\u0014\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010X\u001a\u0004\bl\u0010ZR\u001d\u0010\u0015\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010X\u001a\u0004\bm\u0010ZR\u001d\u0010\u0016\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010X\u001a\u0004\bn\u0010ZR\u001d\u0010\u0017\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010X\u001a\u0004\bo\u0010ZR\u001d\u0010\u0018\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010X\u001a\u0004\bp\u0010ZR\u001d\u0010\u0019\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010X\u001a\u0004\bq\u0010ZR\u001d\u0010\u001a\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010X\u001a\u0004\br\u0010ZR\u001d\u0010\u001b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010X\u001a\u0004\bs\u0010ZR\u001d\u0010\u001c\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001c\u0010X\u001a\u0004\bt\u0010ZR\u001d\u0010\u001d\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010X\u001a\u0004\bu\u0010ZR\u001d\u0010\u001e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001e\u0010X\u001a\u0004\bv\u0010ZR\u001d\u0010\u001f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001f\u0010X\u001a\u0004\bw\u0010ZR\u001d\u0010 \u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010X\u001a\u0004\bx\u0010ZR\u001d\u0010!\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010X\u001a\u0004\by\u0010ZR\u001d\u0010\"\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010X\u001a\u0004\bz\u0010ZR\u001d\u0010#\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b#\u0010X\u001a\u0004\b{\u0010ZR\u001d\u0010$\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b$\u0010X\u001a\u0004\b|\u0010ZR\u001d\u0010%\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b%\u0010X\u001a\u0004\b}\u0010ZR\u001d\u0010&\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010X\u001a\u0004\b~\u0010ZR\u001d\u0010'\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b'\u0010X\u001a\u0004\b\u007f\u0010ZR\u001e\u0010(\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0004\b(\u0010X\u001a\u0005\b\u0080\u0001\u0010ZR\u001e\u0010)\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0004\b)\u0010X\u001a\u0005\b\u0081\u0001\u0010ZR\u001e\u0010*\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0004\b*\u0010X\u001a\u0005\b\u0082\u0001\u0010ZR\u001e\u0010+\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0004\b+\u0010X\u001a\u0005\b\u0083\u0001\u0010ZR\u001e\u0010,\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0004\b,\u0010X\u001a\u0005\b\u0084\u0001\u0010ZR\u001e\u0010-\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0004\b-\u0010X\u001a\u0005\b\u0085\u0001\u0010ZR\u001e\u0010.\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0004\b.\u0010X\u001a\u0005\b\u0086\u0001\u0010ZR\u0017\u0010\u0089\u0001\u001a\u00020\r8AX\u0080\u0004¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u008d\u0001²\u0006\r\u0010\u008c\u0001\u001a\u0002078\nX\u008a\u0084\u0002²\u0006\r\u0010\u008c\u0001\u001a\u0002078\nX\u008a\u0084\u0002²\u0006\r\u0010\u008c\u0001\u001a\u0002078\nX\u008a\u0084\u0002²\u0006\r\u0010\u008c\u0001\u001a\u0002078\nX\u008a\u0084\u0002²\u0006\r\u0010\u008c\u0001\u001a\u0002078\nX\u008a\u0084\u0002²\u0006\r\u0010\u008c\u0001\u001a\u0002078\nX\u008a\u0084\u0002²\u0006\r\u0010\u008c\u0001\u001a\u0002078\nX\u008a\u0084\u0002²\u0006\r\u0010\u008c\u0001\u001a\u0002078\nX\u008a\u0084\u0002²\u0006\r\u0010\u008c\u0001\u001a\u0002078\nX\u008a\u0084\u0002²\u0006\r\u0010\u008c\u0001\u001a\u0002078\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material3/TextFieldColors;", "", "Landroidx/compose/ui/graphics/Color;", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "textSelectionColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "copy-ejIjP34", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/TextFieldColors;", "copy", "Lkotlin/Function0;", "block", "takeOrElse$material3_release", "(Landroidx/compose/foundation/text/selection/TextSelectionColors;Lv3/a;)Landroidx/compose/foundation/text/selection/TextSelectionColors;", "takeOrElse", "", "enabled", "isError", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/runtime/State;", "leadingIconColor$material3_release", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "leadingIconColor", "trailingIconColor$material3_release", "trailingIconColor", "indicatorColor$material3_release", "indicatorColor", "containerColor$material3_release", "containerColor", "placeholderColor$material3_release", "placeholderColor", "labelColor$material3_release", "labelColor", "textColor$material3_release", "textColor", "supportingTextColor$material3_release", "supportingTextColor", "prefixColor$material3_release", "prefixColor", "suffixColor$material3_release", "suffixColor", "cursorColor$material3_release", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "other", "equals", "", TTDownloadField.TT_HASHCODE, "J", "getFocusedTextColor-0d7_KjU", "()J", "getUnfocusedTextColor-0d7_KjU", "getDisabledTextColor-0d7_KjU", "getErrorTextColor-0d7_KjU", "getFocusedContainerColor-0d7_KjU", "getUnfocusedContainerColor-0d7_KjU", "getDisabledContainerColor-0d7_KjU", "getErrorContainerColor-0d7_KjU", "getCursorColor-0d7_KjU", "getErrorCursorColor-0d7_KjU", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "getTextSelectionColors", "()Landroidx/compose/foundation/text/selection/TextSelectionColors;", "getFocusedIndicatorColor-0d7_KjU", "getUnfocusedIndicatorColor-0d7_KjU", "getDisabledIndicatorColor-0d7_KjU", "getErrorIndicatorColor-0d7_KjU", "getFocusedLeadingIconColor-0d7_KjU", "getUnfocusedLeadingIconColor-0d7_KjU", "getDisabledLeadingIconColor-0d7_KjU", "getErrorLeadingIconColor-0d7_KjU", "getFocusedTrailingIconColor-0d7_KjU", "getUnfocusedTrailingIconColor-0d7_KjU", "getDisabledTrailingIconColor-0d7_KjU", "getErrorTrailingIconColor-0d7_KjU", "getFocusedLabelColor-0d7_KjU", "getUnfocusedLabelColor-0d7_KjU", "getDisabledLabelColor-0d7_KjU", "getErrorLabelColor-0d7_KjU", "getFocusedPlaceholderColor-0d7_KjU", "getUnfocusedPlaceholderColor-0d7_KjU", "getDisabledPlaceholderColor-0d7_KjU", "getErrorPlaceholderColor-0d7_KjU", "getFocusedSupportingTextColor-0d7_KjU", "getUnfocusedSupportingTextColor-0d7_KjU", "getDisabledSupportingTextColor-0d7_KjU", "getErrorSupportingTextColor-0d7_KjU", "getFocusedPrefixColor-0d7_KjU", "getUnfocusedPrefixColor-0d7_KjU", "getDisabledPrefixColor-0d7_KjU", "getErrorPrefixColor-0d7_KjU", "getFocusedSuffixColor-0d7_KjU", "getUnfocusedSuffixColor-0d7_KjU", "getDisabledSuffixColor-0d7_KjU", "getErrorSuffixColor-0d7_KjU", "getSelectionColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/TextSelectionColors;", "selectionColors", "<init>", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/w;)V", "focused", "material3_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@r1({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/TextFieldColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2400:1\n658#2:2401\n646#2:2402\n658#2:2403\n646#2:2404\n658#2:2405\n646#2:2406\n658#2:2407\n646#2:2408\n658#2:2409\n646#2:2410\n658#2:2411\n646#2:2412\n658#2:2413\n646#2:2414\n658#2:2415\n646#2:2416\n658#2:2417\n646#2:2418\n658#2:2419\n646#2:2420\n658#2:2421\n646#2:2422\n658#2:2423\n646#2:2424\n658#2:2425\n646#2:2426\n658#2:2427\n646#2:2428\n658#2:2429\n646#2:2430\n658#2:2431\n646#2:2432\n658#2:2433\n646#2:2434\n658#2:2435\n646#2:2436\n658#2:2437\n646#2:2438\n658#2:2439\n646#2:2440\n658#2:2441\n646#2:2442\n658#2:2443\n646#2:2444\n658#2:2445\n646#2:2446\n658#2:2447\n646#2:2448\n658#2:2449\n646#2:2450\n658#2:2451\n646#2:2452\n658#2:2453\n646#2:2454\n658#2:2455\n646#2:2456\n658#2:2457\n646#2:2458\n658#2:2459\n646#2:2460\n658#2:2461\n646#2:2462\n658#2:2463\n646#2:2464\n658#2:2465\n646#2:2466\n658#2:2467\n646#2:2468\n658#2:2469\n646#2:2470\n658#2:2471\n646#2:2472\n658#2:2473\n646#2:2474\n658#2:2475\n646#2:2476\n658#2:2477\n646#2:2478\n658#2:2479\n646#2:2480\n658#2:2481\n646#2:2482\n658#2:2483\n646#2:2484\n81#3:2485\n81#3:2486\n81#3:2487\n81#3:2488\n81#3:2489\n81#3:2490\n81#3:2491\n81#3:2492\n81#3:2493\n81#3:2494\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/TextFieldColors\n*L\n1967#1:2401\n1967#1:2402\n1968#1:2403\n1968#1:2404\n1969#1:2405\n1969#1:2406\n1970#1:2407\n1970#1:2408\n1971#1:2409\n1971#1:2410\n1972#1:2411\n1972#1:2412\n1973#1:2413\n1973#1:2414\n1974#1:2415\n1974#1:2416\n1975#1:2417\n1975#1:2418\n1976#1:2419\n1976#1:2420\n1978#1:2421\n1978#1:2422\n1979#1:2423\n1979#1:2424\n1980#1:2425\n1980#1:2426\n1981#1:2427\n1981#1:2428\n1982#1:2429\n1982#1:2430\n1983#1:2431\n1983#1:2432\n1984#1:2433\n1984#1:2434\n1985#1:2435\n1985#1:2436\n1986#1:2437\n1986#1:2438\n1987#1:2439\n1987#1:2440\n1988#1:2441\n1988#1:2442\n1989#1:2443\n1989#1:2444\n1990#1:2445\n1990#1:2446\n1991#1:2447\n1991#1:2448\n1992#1:2449\n1992#1:2450\n1993#1:2451\n1993#1:2452\n1994#1:2453\n1994#1:2454\n1995#1:2455\n1995#1:2456\n1996#1:2457\n1996#1:2458\n1997#1:2459\n1997#1:2460\n1998#1:2461\n1998#1:2462\n1999#1:2463\n1999#1:2464\n2000#1:2465\n2000#1:2466\n2001#1:2467\n2001#1:2468\n2002#1:2469\n2002#1:2470\n2003#1:2471\n2003#1:2472\n2004#1:2473\n2004#1:2474\n2005#1:2475\n2005#1:2476\n2006#1:2477\n2006#1:2478\n2007#1:2479\n2007#1:2480\n2008#1:2481\n2008#1:2482\n2009#1:2483\n2009#1:2484\n2029#1:2485\n2055#1:2486\n2081#1:2487\n2110#1:2488\n2135#1:2489\n2160#1:2490\n2185#1:2491\n2202#1:2492\n2228#1:2493\n2253#1:2494\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldColors {
    public static final int $stable = 0;
    private final long cursorColor;
    private final long disabledContainerColor;
    private final long disabledIndicatorColor;
    private final long disabledLabelColor;
    private final long disabledLeadingIconColor;
    private final long disabledPlaceholderColor;
    private final long disabledPrefixColor;
    private final long disabledSuffixColor;
    private final long disabledSupportingTextColor;
    private final long disabledTextColor;
    private final long disabledTrailingIconColor;
    private final long errorContainerColor;
    private final long errorCursorColor;
    private final long errorIndicatorColor;
    private final long errorLabelColor;
    private final long errorLeadingIconColor;
    private final long errorPlaceholderColor;
    private final long errorPrefixColor;
    private final long errorSuffixColor;
    private final long errorSupportingTextColor;
    private final long errorTextColor;
    private final long errorTrailingIconColor;
    private final long focusedContainerColor;
    private final long focusedIndicatorColor;
    private final long focusedLabelColor;
    private final long focusedLeadingIconColor;
    private final long focusedPlaceholderColor;
    private final long focusedPrefixColor;
    private final long focusedSuffixColor;
    private final long focusedSupportingTextColor;
    private final long focusedTextColor;
    private final long focusedTrailingIconColor;

    @p4.l
    private final TextSelectionColors textSelectionColors;
    private final long unfocusedContainerColor;
    private final long unfocusedIndicatorColor;
    private final long unfocusedLabelColor;
    private final long unfocusedLeadingIconColor;
    private final long unfocusedPlaceholderColor;
    private final long unfocusedPrefixColor;
    private final long unfocusedSuffixColor;
    private final long unfocusedSupportingTextColor;
    private final long unfocusedTextColor;
    private final long unfocusedTrailingIconColor;

    private TextFieldColors(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, TextSelectionColors textSelectionColors, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46) {
        this.focusedTextColor = j5;
        this.unfocusedTextColor = j6;
        this.disabledTextColor = j7;
        this.errorTextColor = j8;
        this.focusedContainerColor = j9;
        this.unfocusedContainerColor = j10;
        this.disabledContainerColor = j11;
        this.errorContainerColor = j12;
        this.cursorColor = j13;
        this.errorCursorColor = j14;
        this.textSelectionColors = textSelectionColors;
        this.focusedIndicatorColor = j15;
        this.unfocusedIndicatorColor = j16;
        this.disabledIndicatorColor = j17;
        this.errorIndicatorColor = j18;
        this.focusedLeadingIconColor = j19;
        this.unfocusedLeadingIconColor = j20;
        this.disabledLeadingIconColor = j21;
        this.errorLeadingIconColor = j22;
        this.focusedTrailingIconColor = j23;
        this.unfocusedTrailingIconColor = j24;
        this.disabledTrailingIconColor = j25;
        this.errorTrailingIconColor = j26;
        this.focusedLabelColor = j27;
        this.unfocusedLabelColor = j28;
        this.disabledLabelColor = j29;
        this.errorLabelColor = j30;
        this.focusedPlaceholderColor = j31;
        this.unfocusedPlaceholderColor = j32;
        this.disabledPlaceholderColor = j33;
        this.errorPlaceholderColor = j34;
        this.focusedSupportingTextColor = j35;
        this.unfocusedSupportingTextColor = j36;
        this.disabledSupportingTextColor = j37;
        this.errorSupportingTextColor = j38;
        this.focusedPrefixColor = j39;
        this.unfocusedPrefixColor = j40;
        this.disabledPrefixColor = j41;
        this.errorPrefixColor = j42;
        this.focusedSuffixColor = j43;
        this.unfocusedSuffixColor = j44;
        this.disabledSuffixColor = j45;
        this.errorSuffixColor = j46;
    }

    public /* synthetic */ TextFieldColors(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, TextSelectionColors textSelectionColors, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, kotlin.jvm.internal.w wVar) {
        this(j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, textSelectionColors, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46);
    }

    private static final boolean containerColor$lambda$45(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean indicatorColor$lambda$44(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean labelColor$lambda$47(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean leadingIconColor$lambda$42(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean placeholderColor$lambda$46(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean prefixColor$lambda$50(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean suffixColor$lambda$51(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean supportingTextColor$lambda$49(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean textColor$lambda$48(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean trailingIconColor$lambda$43(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    @p4.l
    @Composable
    public final State<Color> containerColor$material3_release(boolean z4, boolean z5, @p4.l InteractionSource interactionSource, @p4.m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(-1921164569);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1921164569, i5, -1, "androidx.compose.material3.TextFieldColors.containerColor (TextFieldDefaults.kt:2108)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i5 >> 6) & 14);
        if (!z4) {
            j5 = this.disabledContainerColor;
        } else if (z5) {
            j5 = this.errorContainerColor;
        } else if (containerColor$lambda$45(collectIsFocusedAsState)) {
            j5 = this.focusedContainerColor;
        } else {
            j5 = this.unfocusedContainerColor;
        }
        State<Color> m96animateColorAsStateeuL9pac = SingleValueAnimationKt.m96animateColorAsStateeuL9pac(j5, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer, 48, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m96animateColorAsStateeuL9pac;
    }

    @p4.l
    /* renamed from: copy-ejIjP34, reason: not valid java name */
    public final TextFieldColors m2369copyejIjP34(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, @p4.m TextSelectionColors textSelectionColors, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46) {
        Color.Companion companion = Color.Companion;
        return new TextFieldColors((j5 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j5 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j5 : this.focusedTextColor, (j6 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j6 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j6 : this.unfocusedTextColor, (j7 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j7 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j7 : this.disabledTextColor, (j8 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j8 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j8 : this.errorTextColor, (j9 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j9 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j9 : this.focusedContainerColor, (j10 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j10 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j10 : this.unfocusedContainerColor, (j11 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j11 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j11 : this.disabledContainerColor, (j12 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j12 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j12 : this.errorContainerColor, (j13 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j13 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j13 : this.cursorColor, (j14 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j14 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j14 : this.errorCursorColor, takeOrElse$material3_release(textSelectionColors, new TextFieldColors$copy$11(this)), (j15 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j15 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j15 : this.focusedIndicatorColor, (j16 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j16 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j16 : this.unfocusedIndicatorColor, (j17 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j17 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j17 : this.disabledIndicatorColor, (j18 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j18 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j18 : this.errorIndicatorColor, (j19 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j19 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j19 : this.focusedLeadingIconColor, (j20 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j20 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j20 : this.unfocusedLeadingIconColor, (j21 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j21 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j21 : this.disabledLeadingIconColor, (j22 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j22 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j22 : this.errorLeadingIconColor, (j23 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j23 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j23 : this.focusedTrailingIconColor, (j24 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j24 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j24 : this.unfocusedTrailingIconColor, (j25 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j25 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j25 : this.disabledTrailingIconColor, (j26 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j26 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j26 : this.errorTrailingIconColor, (j27 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j27 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j27 : this.focusedLabelColor, (j28 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j28 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j28 : this.unfocusedLabelColor, (j29 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j29 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j29 : this.disabledLabelColor, (j30 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j30 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j30 : this.errorLabelColor, (j31 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j31 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j31 : this.focusedPlaceholderColor, (j32 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j32 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j32 : this.unfocusedPlaceholderColor, (j33 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j33 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j33 : this.disabledPlaceholderColor, (j34 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j34 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j34 : this.errorPlaceholderColor, (j35 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j35 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j35 : this.focusedSupportingTextColor, (j36 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j36 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j36 : this.unfocusedSupportingTextColor, (j37 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j37 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j37 : this.disabledSupportingTextColor, (j38 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j38 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j38 : this.errorSupportingTextColor, (j39 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j39 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j39 : this.focusedPrefixColor, (j40 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j40 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j40 : this.unfocusedPrefixColor, (j41 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j41 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j41 : this.disabledPrefixColor, (j42 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j42 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j42 : this.errorPrefixColor, (j43 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j43 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j43 : this.focusedSuffixColor, (j44 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j44 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j44 : this.unfocusedSuffixColor, (j45 > companion.m3770getUnspecified0d7_KjU() ? 1 : (j45 == companion.m3770getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j45 : this.disabledSuffixColor, j46 != companion.m3770getUnspecified0d7_KjU() ? j46 : this.errorSuffixColor, null);
    }

    @p4.l
    @Composable
    public final State<Color> cursorColor$material3_release(boolean z4, @p4.m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(-1885422187);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1885422187, i5, -1, "androidx.compose.material3.TextFieldColors.cursorColor (TextFieldDefaults.kt:2269)");
        }
        if (z4) {
            j5 = this.errorCursorColor;
        } else {
            j5 = this.cursorColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j5), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TextFieldColors)) {
            return false;
        }
        TextFieldColors textFieldColors = (TextFieldColors) obj;
        if (Color.m3735equalsimpl0(this.focusedTextColor, textFieldColors.focusedTextColor) && Color.m3735equalsimpl0(this.unfocusedTextColor, textFieldColors.unfocusedTextColor) && Color.m3735equalsimpl0(this.disabledTextColor, textFieldColors.disabledTextColor) && Color.m3735equalsimpl0(this.errorTextColor, textFieldColors.errorTextColor) && Color.m3735equalsimpl0(this.focusedContainerColor, textFieldColors.focusedContainerColor) && Color.m3735equalsimpl0(this.unfocusedContainerColor, textFieldColors.unfocusedContainerColor) && Color.m3735equalsimpl0(this.disabledContainerColor, textFieldColors.disabledContainerColor) && Color.m3735equalsimpl0(this.errorContainerColor, textFieldColors.errorContainerColor) && Color.m3735equalsimpl0(this.cursorColor, textFieldColors.cursorColor) && Color.m3735equalsimpl0(this.errorCursorColor, textFieldColors.errorCursorColor) && kotlin.jvm.internal.l0.g(this.textSelectionColors, textFieldColors.textSelectionColors) && Color.m3735equalsimpl0(this.focusedIndicatorColor, textFieldColors.focusedIndicatorColor) && Color.m3735equalsimpl0(this.unfocusedIndicatorColor, textFieldColors.unfocusedIndicatorColor) && Color.m3735equalsimpl0(this.disabledIndicatorColor, textFieldColors.disabledIndicatorColor) && Color.m3735equalsimpl0(this.errorIndicatorColor, textFieldColors.errorIndicatorColor) && Color.m3735equalsimpl0(this.focusedLeadingIconColor, textFieldColors.focusedLeadingIconColor) && Color.m3735equalsimpl0(this.unfocusedLeadingIconColor, textFieldColors.unfocusedLeadingIconColor) && Color.m3735equalsimpl0(this.disabledLeadingIconColor, textFieldColors.disabledLeadingIconColor) && Color.m3735equalsimpl0(this.errorLeadingIconColor, textFieldColors.errorLeadingIconColor) && Color.m3735equalsimpl0(this.focusedTrailingIconColor, textFieldColors.focusedTrailingIconColor) && Color.m3735equalsimpl0(this.unfocusedTrailingIconColor, textFieldColors.unfocusedTrailingIconColor) && Color.m3735equalsimpl0(this.disabledTrailingIconColor, textFieldColors.disabledTrailingIconColor) && Color.m3735equalsimpl0(this.errorTrailingIconColor, textFieldColors.errorTrailingIconColor) && Color.m3735equalsimpl0(this.focusedLabelColor, textFieldColors.focusedLabelColor) && Color.m3735equalsimpl0(this.unfocusedLabelColor, textFieldColors.unfocusedLabelColor) && Color.m3735equalsimpl0(this.disabledLabelColor, textFieldColors.disabledLabelColor) && Color.m3735equalsimpl0(this.errorLabelColor, textFieldColors.errorLabelColor) && Color.m3735equalsimpl0(this.focusedPlaceholderColor, textFieldColors.focusedPlaceholderColor) && Color.m3735equalsimpl0(this.unfocusedPlaceholderColor, textFieldColors.unfocusedPlaceholderColor) && Color.m3735equalsimpl0(this.disabledPlaceholderColor, textFieldColors.disabledPlaceholderColor) && Color.m3735equalsimpl0(this.errorPlaceholderColor, textFieldColors.errorPlaceholderColor) && Color.m3735equalsimpl0(this.focusedSupportingTextColor, textFieldColors.focusedSupportingTextColor) && Color.m3735equalsimpl0(this.unfocusedSupportingTextColor, textFieldColors.unfocusedSupportingTextColor) && Color.m3735equalsimpl0(this.disabledSupportingTextColor, textFieldColors.disabledSupportingTextColor) && Color.m3735equalsimpl0(this.errorSupportingTextColor, textFieldColors.errorSupportingTextColor) && Color.m3735equalsimpl0(this.focusedPrefixColor, textFieldColors.focusedPrefixColor) && Color.m3735equalsimpl0(this.unfocusedPrefixColor, textFieldColors.unfocusedPrefixColor) && Color.m3735equalsimpl0(this.disabledPrefixColor, textFieldColors.disabledPrefixColor) && Color.m3735equalsimpl0(this.errorPrefixColor, textFieldColors.errorPrefixColor) && Color.m3735equalsimpl0(this.focusedSuffixColor, textFieldColors.focusedSuffixColor) && Color.m3735equalsimpl0(this.unfocusedSuffixColor, textFieldColors.unfocusedSuffixColor) && Color.m3735equalsimpl0(this.disabledSuffixColor, textFieldColors.disabledSuffixColor) && Color.m3735equalsimpl0(this.errorSuffixColor, textFieldColors.errorSuffixColor)) {
            return true;
        }
        return false;
    }

    /* renamed from: getCursorColor-0d7_KjU, reason: not valid java name */
    public final long m2370getCursorColor0d7_KjU() {
        return this.cursorColor;
    }

    /* renamed from: getDisabledContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2371getDisabledContainerColor0d7_KjU() {
        return this.disabledContainerColor;
    }

    /* renamed from: getDisabledIndicatorColor-0d7_KjU, reason: not valid java name */
    public final long m2372getDisabledIndicatorColor0d7_KjU() {
        return this.disabledIndicatorColor;
    }

    /* renamed from: getDisabledLabelColor-0d7_KjU, reason: not valid java name */
    public final long m2373getDisabledLabelColor0d7_KjU() {
        return this.disabledLabelColor;
    }

    /* renamed from: getDisabledLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2374getDisabledLeadingIconColor0d7_KjU() {
        return this.disabledLeadingIconColor;
    }

    /* renamed from: getDisabledPlaceholderColor-0d7_KjU, reason: not valid java name */
    public final long m2375getDisabledPlaceholderColor0d7_KjU() {
        return this.disabledPlaceholderColor;
    }

    /* renamed from: getDisabledPrefixColor-0d7_KjU, reason: not valid java name */
    public final long m2376getDisabledPrefixColor0d7_KjU() {
        return this.disabledPrefixColor;
    }

    /* renamed from: getDisabledSuffixColor-0d7_KjU, reason: not valid java name */
    public final long m2377getDisabledSuffixColor0d7_KjU() {
        return this.disabledSuffixColor;
    }

    /* renamed from: getDisabledSupportingTextColor-0d7_KjU, reason: not valid java name */
    public final long m2378getDisabledSupportingTextColor0d7_KjU() {
        return this.disabledSupportingTextColor;
    }

    /* renamed from: getDisabledTextColor-0d7_KjU, reason: not valid java name */
    public final long m2379getDisabledTextColor0d7_KjU() {
        return this.disabledTextColor;
    }

    /* renamed from: getDisabledTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2380getDisabledTrailingIconColor0d7_KjU() {
        return this.disabledTrailingIconColor;
    }

    /* renamed from: getErrorContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2381getErrorContainerColor0d7_KjU() {
        return this.errorContainerColor;
    }

    /* renamed from: getErrorCursorColor-0d7_KjU, reason: not valid java name */
    public final long m2382getErrorCursorColor0d7_KjU() {
        return this.errorCursorColor;
    }

    /* renamed from: getErrorIndicatorColor-0d7_KjU, reason: not valid java name */
    public final long m2383getErrorIndicatorColor0d7_KjU() {
        return this.errorIndicatorColor;
    }

    /* renamed from: getErrorLabelColor-0d7_KjU, reason: not valid java name */
    public final long m2384getErrorLabelColor0d7_KjU() {
        return this.errorLabelColor;
    }

    /* renamed from: getErrorLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2385getErrorLeadingIconColor0d7_KjU() {
        return this.errorLeadingIconColor;
    }

    /* renamed from: getErrorPlaceholderColor-0d7_KjU, reason: not valid java name */
    public final long m2386getErrorPlaceholderColor0d7_KjU() {
        return this.errorPlaceholderColor;
    }

    /* renamed from: getErrorPrefixColor-0d7_KjU, reason: not valid java name */
    public final long m2387getErrorPrefixColor0d7_KjU() {
        return this.errorPrefixColor;
    }

    /* renamed from: getErrorSuffixColor-0d7_KjU, reason: not valid java name */
    public final long m2388getErrorSuffixColor0d7_KjU() {
        return this.errorSuffixColor;
    }

    /* renamed from: getErrorSupportingTextColor-0d7_KjU, reason: not valid java name */
    public final long m2389getErrorSupportingTextColor0d7_KjU() {
        return this.errorSupportingTextColor;
    }

    /* renamed from: getErrorTextColor-0d7_KjU, reason: not valid java name */
    public final long m2390getErrorTextColor0d7_KjU() {
        return this.errorTextColor;
    }

    /* renamed from: getErrorTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2391getErrorTrailingIconColor0d7_KjU() {
        return this.errorTrailingIconColor;
    }

    /* renamed from: getFocusedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2392getFocusedContainerColor0d7_KjU() {
        return this.focusedContainerColor;
    }

    /* renamed from: getFocusedIndicatorColor-0d7_KjU, reason: not valid java name */
    public final long m2393getFocusedIndicatorColor0d7_KjU() {
        return this.focusedIndicatorColor;
    }

    /* renamed from: getFocusedLabelColor-0d7_KjU, reason: not valid java name */
    public final long m2394getFocusedLabelColor0d7_KjU() {
        return this.focusedLabelColor;
    }

    /* renamed from: getFocusedLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2395getFocusedLeadingIconColor0d7_KjU() {
        return this.focusedLeadingIconColor;
    }

    /* renamed from: getFocusedPlaceholderColor-0d7_KjU, reason: not valid java name */
    public final long m2396getFocusedPlaceholderColor0d7_KjU() {
        return this.focusedPlaceholderColor;
    }

    /* renamed from: getFocusedPrefixColor-0d7_KjU, reason: not valid java name */
    public final long m2397getFocusedPrefixColor0d7_KjU() {
        return this.focusedPrefixColor;
    }

    /* renamed from: getFocusedSuffixColor-0d7_KjU, reason: not valid java name */
    public final long m2398getFocusedSuffixColor0d7_KjU() {
        return this.focusedSuffixColor;
    }

    /* renamed from: getFocusedSupportingTextColor-0d7_KjU, reason: not valid java name */
    public final long m2399getFocusedSupportingTextColor0d7_KjU() {
        return this.focusedSupportingTextColor;
    }

    /* renamed from: getFocusedTextColor-0d7_KjU, reason: not valid java name */
    public final long m2400getFocusedTextColor0d7_KjU() {
        return this.focusedTextColor;
    }

    /* renamed from: getFocusedTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2401getFocusedTrailingIconColor0d7_KjU() {
        return this.focusedTrailingIconColor;
    }

    @p4.l
    @u3.h(name = "getSelectionColors")
    @Composable
    public final TextSelectionColors getSelectionColors(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(997785083);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(997785083, i5, -1, "androidx.compose.material3.TextFieldColors.<get-selectionColors> (TextFieldDefaults.kt:2277)");
        }
        TextSelectionColors textSelectionColors = this.textSelectionColors;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textSelectionColors;
    }

    @p4.l
    public final TextSelectionColors getTextSelectionColors() {
        return this.textSelectionColors;
    }

    /* renamed from: getUnfocusedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2402getUnfocusedContainerColor0d7_KjU() {
        return this.unfocusedContainerColor;
    }

    /* renamed from: getUnfocusedIndicatorColor-0d7_KjU, reason: not valid java name */
    public final long m2403getUnfocusedIndicatorColor0d7_KjU() {
        return this.unfocusedIndicatorColor;
    }

    /* renamed from: getUnfocusedLabelColor-0d7_KjU, reason: not valid java name */
    public final long m2404getUnfocusedLabelColor0d7_KjU() {
        return this.unfocusedLabelColor;
    }

    /* renamed from: getUnfocusedLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2405getUnfocusedLeadingIconColor0d7_KjU() {
        return this.unfocusedLeadingIconColor;
    }

    /* renamed from: getUnfocusedPlaceholderColor-0d7_KjU, reason: not valid java name */
    public final long m2406getUnfocusedPlaceholderColor0d7_KjU() {
        return this.unfocusedPlaceholderColor;
    }

    /* renamed from: getUnfocusedPrefixColor-0d7_KjU, reason: not valid java name */
    public final long m2407getUnfocusedPrefixColor0d7_KjU() {
        return this.unfocusedPrefixColor;
    }

    /* renamed from: getUnfocusedSuffixColor-0d7_KjU, reason: not valid java name */
    public final long m2408getUnfocusedSuffixColor0d7_KjU() {
        return this.unfocusedSuffixColor;
    }

    /* renamed from: getUnfocusedSupportingTextColor-0d7_KjU, reason: not valid java name */
    public final long m2409getUnfocusedSupportingTextColor0d7_KjU() {
        return this.unfocusedSupportingTextColor;
    }

    /* renamed from: getUnfocusedTextColor-0d7_KjU, reason: not valid java name */
    public final long m2410getUnfocusedTextColor0d7_KjU() {
        return this.unfocusedTextColor;
    }

    /* renamed from: getUnfocusedTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m2411getUnfocusedTrailingIconColor0d7_KjU() {
        return this.unfocusedTrailingIconColor;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Color.m3741hashCodeimpl(this.focusedTextColor) * 31) + Color.m3741hashCodeimpl(this.unfocusedTextColor)) * 31) + Color.m3741hashCodeimpl(this.disabledTextColor)) * 31) + Color.m3741hashCodeimpl(this.errorTextColor)) * 31) + Color.m3741hashCodeimpl(this.focusedContainerColor)) * 31) + Color.m3741hashCodeimpl(this.unfocusedContainerColor)) * 31) + Color.m3741hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m3741hashCodeimpl(this.errorContainerColor)) * 31) + Color.m3741hashCodeimpl(this.cursorColor)) * 31) + Color.m3741hashCodeimpl(this.errorCursorColor)) * 31) + this.textSelectionColors.hashCode()) * 31) + Color.m3741hashCodeimpl(this.focusedIndicatorColor)) * 31) + Color.m3741hashCodeimpl(this.unfocusedIndicatorColor)) * 31) + Color.m3741hashCodeimpl(this.disabledIndicatorColor)) * 31) + Color.m3741hashCodeimpl(this.errorIndicatorColor)) * 31) + Color.m3741hashCodeimpl(this.focusedLeadingIconColor)) * 31) + Color.m3741hashCodeimpl(this.unfocusedLeadingIconColor)) * 31) + Color.m3741hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m3741hashCodeimpl(this.errorLeadingIconColor)) * 31) + Color.m3741hashCodeimpl(this.focusedTrailingIconColor)) * 31) + Color.m3741hashCodeimpl(this.unfocusedTrailingIconColor)) * 31) + Color.m3741hashCodeimpl(this.disabledTrailingIconColor)) * 31) + Color.m3741hashCodeimpl(this.errorTrailingIconColor)) * 31) + Color.m3741hashCodeimpl(this.focusedLabelColor)) * 31) + Color.m3741hashCodeimpl(this.unfocusedLabelColor)) * 31) + Color.m3741hashCodeimpl(this.disabledLabelColor)) * 31) + Color.m3741hashCodeimpl(this.errorLabelColor)) * 31) + Color.m3741hashCodeimpl(this.focusedPlaceholderColor)) * 31) + Color.m3741hashCodeimpl(this.unfocusedPlaceholderColor)) * 31) + Color.m3741hashCodeimpl(this.disabledPlaceholderColor)) * 31) + Color.m3741hashCodeimpl(this.errorPlaceholderColor)) * 31) + Color.m3741hashCodeimpl(this.focusedSupportingTextColor)) * 31) + Color.m3741hashCodeimpl(this.unfocusedSupportingTextColor)) * 31) + Color.m3741hashCodeimpl(this.disabledSupportingTextColor)) * 31) + Color.m3741hashCodeimpl(this.errorSupportingTextColor)) * 31) + Color.m3741hashCodeimpl(this.focusedPrefixColor)) * 31) + Color.m3741hashCodeimpl(this.unfocusedPrefixColor)) * 31) + Color.m3741hashCodeimpl(this.disabledPrefixColor)) * 31) + Color.m3741hashCodeimpl(this.errorPrefixColor)) * 31) + Color.m3741hashCodeimpl(this.focusedSuffixColor)) * 31) + Color.m3741hashCodeimpl(this.unfocusedSuffixColor)) * 31) + Color.m3741hashCodeimpl(this.disabledSuffixColor)) * 31) + Color.m3741hashCodeimpl(this.errorSuffixColor);
    }

    @p4.l
    @Composable
    public final State<Color> indicatorColor$material3_release(boolean z4, boolean z5, @p4.l InteractionSource interactionSource, @p4.m Composer composer, int i5) {
        long j5;
        State<Color> rememberUpdatedState;
        composer.startReplaceableGroup(-1877482635);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1877482635, i5, -1, "androidx.compose.material3.TextFieldColors.indicatorColor (TextFieldDefaults.kt:2079)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i5 >> 6) & 14);
        if (!z4) {
            j5 = this.disabledIndicatorColor;
        } else if (z5) {
            j5 = this.errorIndicatorColor;
        } else if (indicatorColor$lambda$44(collectIsFocusedAsState)) {
            j5 = this.focusedIndicatorColor;
        } else {
            j5 = this.unfocusedIndicatorColor;
        }
        long j6 = j5;
        if (z4) {
            composer.startReplaceableGroup(715804770);
            rememberUpdatedState = SingleValueAnimationKt.m96animateColorAsStateeuL9pac(j6, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer, 48, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(715804875);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j6), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @p4.l
    @Composable
    public final State<Color> labelColor$material3_release(boolean z4, boolean z5, @p4.l InteractionSource interactionSource, @p4.m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(1167161306);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1167161306, i5, -1, "androidx.compose.material3.TextFieldColors.labelColor (TextFieldDefaults.kt:2158)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i5 >> 6) & 14);
        if (!z4) {
            j5 = this.disabledLabelColor;
        } else if (z5) {
            j5 = this.errorLabelColor;
        } else if (labelColor$lambda$47(collectIsFocusedAsState)) {
            j5 = this.focusedLabelColor;
        } else {
            j5 = this.unfocusedLabelColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j5), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @p4.l
    @Composable
    public final State<Color> leadingIconColor$material3_release(boolean z4, boolean z5, @p4.l InteractionSource interactionSource, @p4.m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(925127045);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(925127045, i5, -1, "androidx.compose.material3.TextFieldColors.leadingIconColor (TextFieldDefaults.kt:2027)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i5 >> 6) & 14);
        if (!z4) {
            j5 = this.disabledLeadingIconColor;
        } else if (z5) {
            j5 = this.errorLeadingIconColor;
        } else if (leadingIconColor$lambda$42(collectIsFocusedAsState)) {
            j5 = this.focusedLeadingIconColor;
        } else {
            j5 = this.unfocusedLeadingIconColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j5), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @p4.l
    @Composable
    public final State<Color> placeholderColor$material3_release(boolean z4, boolean z5, @p4.l InteractionSource interactionSource, @p4.m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(653850713);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(653850713, i5, -1, "androidx.compose.material3.TextFieldColors.placeholderColor (TextFieldDefaults.kt:2133)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i5 >> 6) & 14);
        if (!z4) {
            j5 = this.disabledPlaceholderColor;
        } else if (z5) {
            j5 = this.errorPlaceholderColor;
        } else if (placeholderColor$lambda$46(collectIsFocusedAsState)) {
            j5 = this.focusedPlaceholderColor;
        } else {
            j5 = this.unfocusedPlaceholderColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j5), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @p4.l
    @Composable
    public final State<Color> prefixColor$material3_release(boolean z4, boolean z5, @p4.l InteractionSource interactionSource, @p4.m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(129569364);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(129569364, i5, -1, "androidx.compose.material3.TextFieldColors.prefixColor (TextFieldDefaults.kt:2226)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i5 >> 6) & 14);
        if (!z4) {
            j5 = this.disabledPrefixColor;
        } else if (z5) {
            j5 = this.errorPrefixColor;
        } else if (prefixColor$lambda$50(collectIsFocusedAsState)) {
            j5 = this.focusedPrefixColor;
        } else {
            j5 = this.unfocusedPrefixColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j5), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @p4.l
    @Composable
    public final State<Color> suffixColor$material3_release(boolean z4, boolean z5, @p4.l InteractionSource interactionSource, @p4.m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(1575329427);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1575329427, i5, -1, "androidx.compose.material3.TextFieldColors.suffixColor (TextFieldDefaults.kt:2251)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i5 >> 6) & 14);
        if (!z4) {
            j5 = this.disabledSuffixColor;
        } else if (z5) {
            j5 = this.errorSuffixColor;
        } else if (suffixColor$lambda$51(collectIsFocusedAsState)) {
            j5 = this.focusedSuffixColor;
        } else {
            j5 = this.unfocusedSuffixColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j5), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @p4.l
    @Composable
    public final State<Color> supportingTextColor$material3_release(boolean z4, boolean z5, @p4.l InteractionSource interactionSource, @p4.m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(1464709698);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1464709698, i5, -1, "androidx.compose.material3.TextFieldColors.supportingTextColor (TextFieldDefaults.kt:2200)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i5 >> 6) & 14);
        if (!z4) {
            j5 = this.disabledSupportingTextColor;
        } else if (z5) {
            j5 = this.errorSupportingTextColor;
        } else if (supportingTextColor$lambda$49(collectIsFocusedAsState)) {
            j5 = this.focusedSupportingTextColor;
        } else {
            j5 = this.unfocusedSupportingTextColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j5), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @p4.l
    public final TextSelectionColors takeOrElse$material3_release(@p4.m TextSelectionColors textSelectionColors, @p4.l v3.a<TextSelectionColors> aVar) {
        return textSelectionColors == null ? aVar.invoke() : textSelectionColors;
    }

    @p4.l
    @Composable
    public final State<Color> textColor$material3_release(boolean z4, boolean z5, @p4.l InteractionSource interactionSource, @p4.m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(68412911);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(68412911, i5, -1, "androidx.compose.material3.TextFieldColors.textColor (TextFieldDefaults.kt:2183)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i5 >> 6) & 14);
        if (!z4) {
            j5 = this.disabledTextColor;
        } else if (z5) {
            j5 = this.errorTextColor;
        } else if (textColor$lambda$48(collectIsFocusedAsState)) {
            j5 = this.focusedTextColor;
        } else {
            j5 = this.unfocusedTextColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j5), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @p4.l
    @Composable
    public final State<Color> trailingIconColor$material3_release(boolean z4, boolean z5, @p4.l InteractionSource interactionSource, @p4.m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(-109504137);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-109504137, i5, -1, "androidx.compose.material3.TextFieldColors.trailingIconColor (TextFieldDefaults.kt:2053)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i5 >> 6) & 14);
        if (!z4) {
            j5 = this.disabledTrailingIconColor;
        } else if (z5) {
            j5 = this.errorTrailingIconColor;
        } else if (trailingIconColor$lambda$43(collectIsFocusedAsState)) {
            j5 = this.focusedTrailingIconColor;
        } else {
            j5 = this.unfocusedTrailingIconColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j5), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }
}
