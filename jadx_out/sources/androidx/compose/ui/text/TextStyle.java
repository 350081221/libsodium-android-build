package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.huawei.agconnect.apms.collect.model.event.interaction.ForeAndBackgroundEvent;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.k;
import p4.l;
import p4.m;
import u3.h;

@i0(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\bW\b\u0007\u0018\u0000 §\u00012\u00020\u0001:\u0002§\u0001B'\b\u0000\u0012\u0006\u0010W\u001a\u00020\u0002\u0012\u0006\u0010[\u001a\u00020\u0004\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000101¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001B\u001b\b\u0010\u0012\u0006\u0010W\u001a\u00020\u0002\u0012\u0006\u0010[\u001a\u00020\u0004¢\u0006\u0006\b\u009d\u0001\u0010\u009f\u0001BÙ\u0001\b\u0017\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\b\b\u0002\u0010(\u001a\u00020\n\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0006\b\u009d\u0001\u0010 \u0001Bñ\u0001\b\u0017\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\b\b\u0002\u0010(\u001a\u00020\n\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000101\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0006\b\u009d\u0001\u0010¡\u0001B\u0089\u0002\b\u0017\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\b\b\u0002\u0010(\u001a\u00020\n\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000101\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0006\b\u009d\u0001\u0010¢\u0001B¡\u0002\b\u0017\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\b\b\u0002\u0010(\u001a\u00020\n\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000101\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000103¢\u0006\u0006\b\u009d\u0001\u0010£\u0001B\u0099\u0002\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\b\u0002\u0010%\u001a\u00020$\u0012\b\b\u0002\u0010'\u001a\u00020&\u0012\b\b\u0002\u0010(\u001a\u00020\n\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000101\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\b\b\u0002\u0010.\u001a\u00020-\u0012\b\b\u0002\u00100\u001a\u00020/\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000103¢\u0006\u0006\b\u009d\u0001\u0010¤\u0001B£\u0002\b\u0016\u0012\b\u0010F\u001a\u0004\u0018\u00010E\u0012\b\b\u0002\u0010H\u001a\u00020G\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\b\u0002\u0010%\u001a\u00020$\u0012\b\b\u0002\u0010'\u001a\u00020&\u0012\b\b\u0002\u0010(\u001a\u00020\n\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000101\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\b\b\u0002\u0010.\u001a\u00020-\u0012\b\b\u0002\u00100\u001a\u00020/\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000103¢\u0006\u0006\b\u009d\u0001\u0010¥\u0001B«\u0002\b\u0017\u0012\b\u0010F\u001a\u0004\u0018\u00010E\u0012\b\b\u0002\u0010H\u001a\u00020G\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\b\b\u0002\u0010(\u001a\u00020\n\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000101\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000103¢\u0006\u0006\b\u009d\u0001\u0010¦\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\u0014\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0000H\u0007J \u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020\n2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u00100\u001a\u00020/2\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\n\b\u0002\u00104\u001a\u0004\u0018\u000103H\u0007ø\u0001\u0000¢\u0006\u0004\b5\u00106J¨\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010(\u001a\u00020\n2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\n\b\u0002\u00100\u001a\u0004\u0018\u00010/2\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\n\b\u0002\u00104\u001a\u0004\u0018\u000103H\u0007ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u0011\u00109\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\u0002J\u0011\u00109\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0004H\u0087\u0002J\u0011\u00109\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002H\u0087\u0002Jà\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010(\u001a\u00020\n2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)H\u0007ø\u0001\u0000¢\u0006\u0004\b:\u0010;Jø\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010(\u001a\u00020\n2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+H\u0007ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\u0090\u0002\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010(\u001a\u00020\n2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\n\b\u0002\u00100\u001a\u0004\u0018\u00010/H\u0007ø\u0001\u0000¢\u0006\u0004\b?\u0010@J¨\u0002\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010(\u001a\u00020\n2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\n\b\u0002\u00100\u001a\u0004\u0018\u00010/2\n\b\u0002\u00104\u001a\u0004\u0018\u000103H\u0007ø\u0001\u0000¢\u0006\u0004\bA\u0010BJ\u009e\u0002\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020\n2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u00100\u001a\u00020/2\n\b\u0002\u00104\u001a\u0004\u0018\u000103ø\u0001\u0000¢\u0006\u0004\bC\u0010DJ²\u0002\u0010<\u001a\u00020\u00002\b\u0010F\u001a\u0004\u0018\u00010E2\b\b\u0002\u0010H\u001a\u00020G2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010(\u001a\u00020\n2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\n\b\u0002\u00100\u001a\u0004\u0018\u00010/2\n\b\u0002\u00104\u001a\u0004\u0018\u000103H\u0007ø\u0001\u0000¢\u0006\u0004\bI\u0010JJ¨\u0002\u0010<\u001a\u00020\u00002\b\u0010F\u001a\u0004\u0018\u00010E2\b\b\u0002\u0010H\u001a\u00020G2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020\n2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u00100\u001a\u00020/2\n\b\u0002\u00104\u001a\u0004\u0018\u000103ø\u0001\u0000¢\u0006\u0004\bK\u0010LJ\u0013\u0010N\u001a\u00020M2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u000e\u0010O\u001a\u00020M2\u0006\u0010\u0006\u001a\u00020\u0000J\u000e\u0010P\u001a\u00020M2\u0006\u0010\u0006\u001a\u00020\u0000J\b\u0010R\u001a\u00020QH\u0016J\u000f\u0010U\u001a\u00020QH\u0000¢\u0006\u0004\bS\u0010TJ\b\u0010V\u001a\u00020\u0014H\u0016R\u001a\u0010W\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u001a\u0010[\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u0019\u00102\u001a\u0004\u0018\u0001018\u0006¢\u0006\f\n\u0004\b2\u0010_\u001a\u0004\b`\u0010aR\u0013\u0010F\u001a\u0004\u0018\u00010E8F¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0017\u0010\t\u001a\u00020\b8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0011\u0010H\u001a\u00020G8F¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0017\u0010\u000b\u001a\u00020\n8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bh\u0010eR\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0017\u0010\u0016\u001a\u00020\n8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bs\u0010eR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bt\u0010uR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\bv\u0010wR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\bx\u0010yR\u0017\u0010\u001d\u001a\u00020\b8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bz\u0010eR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\b{\u0010|R\u0013\u0010!\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b}\u0010~R\u0014\u0010#\u001a\u0004\u0018\u00010\"8F¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010%\u001a\u00020$8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010TR'\u0010\u0086\u0001\u001a\u0004\u0018\u00010$8GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\u0012\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010'\u001a\u00020&8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010TR'\u0010\u008b\u0001\u001a\u0004\u0018\u00010&8GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\u0012\u0006\b\u008a\u0001\u0010\u0085\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010(\u001a\u00020\n8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010eR\u0015\u0010*\u001a\u0004\u0018\u00010)8F¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0015\u0010,\u001a\u0004\u0018\u00010+8F¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u00100\u001a\u00020/8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\u001a\u0005\b\u0091\u0001\u0010TR'\u0010\u0095\u0001\u001a\u0004\u0018\u00010/8GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\u0012\u0006\b\u0094\u0001\u0010\u0085\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0018\u0010.\u001a\u00020-8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010TR'\u0010\u009a\u0001\u001a\u0004\u0018\u00010-8GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\u0012\u0006\b\u0099\u0001\u0010\u0085\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0015\u00104\u001a\u0004\u0018\u0001038F¢\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¨\u0001"}, d2 = {"Landroidx/compose/ui/text/TextStyle;", "", "Landroidx/compose/ui/text/SpanStyle;", "toSpanStyle", "Landroidx/compose/ui/text/ParagraphStyle;", "toParagraphStyle", "other", "merge", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/unit/TextUnit;", "fontSize", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "Landroidx/compose/ui/text/style/BaselineShift;", "baselineShift", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "textGeometricTransform", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", ForeAndBackgroundEvent.BACKGROUND, "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "Landroidx/compose/ui/text/style/TextAlign;", "textAlign", "Landroidx/compose/ui/text/style/TextDirection;", "textDirection", "lineHeight", "Landroidx/compose/ui/text/style/TextIndent;", "textIndent", "Landroidx/compose/ui/text/style/LineHeightStyle;", "lineHeightStyle", "Landroidx/compose/ui/text/style/LineBreak;", "lineBreak", "Landroidx/compose/ui/text/style/Hyphens;", "hyphens", "Landroidx/compose/ui/text/PlatformTextStyle;", "platformStyle", "Landroidx/compose/ui/text/style/TextMotion;", "textMotion", "merge-dA7vx0o", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/TextStyle;", "merge-Z1GrekI", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/TextStyle;", "plus", "copy-HL5avdY", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;)Landroidx/compose/ui/text/TextStyle;", "copy", "copy-NOaFTUo", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;)Landroidx/compose/ui/text/TextStyle;", "copy-CXVQc50", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;)Landroidx/compose/ui/text/TextStyle;", "copy-v2rsoow", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/TextStyle;", "copy-p1EtxEg", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/TextStyle;", "Landroidx/compose/ui/graphics/Brush;", "brush", "", "alpha", "copy-aIRg9q4", "(Landroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/TextStyle;", "copy-Ns73l9s", "(Landroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/TextStyle;", "", "equals", "hasSameLayoutAffectingAttributes", "hasSameDrawAffectingAttributes", "", TTDownloadField.TT_HASHCODE, "hashCodeLayoutAffectingAttributes$ui_text_release", "()I", "hashCodeLayoutAffectingAttributes", "toString", "spanStyle", "Landroidx/compose/ui/text/SpanStyle;", "getSpanStyle$ui_text_release", "()Landroidx/compose/ui/text/SpanStyle;", "paragraphStyle", "Landroidx/compose/ui/text/ParagraphStyle;", "getParagraphStyle$ui_text_release", "()Landroidx/compose/ui/text/ParagraphStyle;", "Landroidx/compose/ui/text/PlatformTextStyle;", "getPlatformStyle", "()Landroidx/compose/ui/text/PlatformTextStyle;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "getColor-0d7_KjU", "()J", "getAlpha", "()F", "getFontSize-XSAIIZE", "getFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "getFontStyle-4Lr2A7w", "()Landroidx/compose/ui/text/font/FontStyle;", "getFontSynthesis-ZQGJjVo", "()Landroidx/compose/ui/text/font/FontSynthesis;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "getFontFeatureSettings", "()Ljava/lang/String;", "getLetterSpacing-XSAIIZE", "getBaselineShift-5SSeXJ0", "()Landroidx/compose/ui/text/style/BaselineShift;", "getTextGeometricTransform", "()Landroidx/compose/ui/text/style/TextGeometricTransform;", "getLocaleList", "()Landroidx/compose/ui/text/intl/LocaleList;", "getBackground-0d7_KjU", "getTextDecoration", "()Landroidx/compose/ui/text/style/TextDecoration;", "getShadow", "()Landroidx/compose/ui/graphics/Shadow;", "getDrawStyle", "()Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "getTextAlign-e0LSkKk", "getTextAlign-buA522U", "()Landroidx/compose/ui/text/style/TextAlign;", "getTextAlign-buA522U$annotations", "()V", "deprecated_boxing_textAlign", "getTextDirection-s_7X-co", "getTextDirection-mmuk1to", "()Landroidx/compose/ui/text/style/TextDirection;", "getTextDirection-mmuk1to$annotations", "deprecated_boxing_textDirection", "getLineHeight-XSAIIZE", "getTextIndent", "()Landroidx/compose/ui/text/style/TextIndent;", "getLineHeightStyle", "()Landroidx/compose/ui/text/style/LineHeightStyle;", "getHyphens-vmbZdU8", "getHyphens-EaSxIns", "()Landroidx/compose/ui/text/style/Hyphens;", "getHyphens-EaSxIns$annotations", "deprecated_boxing_hyphens", "getLineBreak-rAG3T2k", "getLineBreak-LgCVezo", "()Landroidx/compose/ui/text/style/LineBreak;", "getLineBreak-LgCVezo$annotations", "deprecated_boxing_lineBreak", "getTextMotion", "()Landroidx/compose/ui/text/style/TextMotion;", "<init>", "(Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/ParagraphStyle;Landroidx/compose/ui/text/PlatformTextStyle;)V", "(Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/ParagraphStyle;)V", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Lkotlin/jvm/internal/w;)V", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Lkotlin/jvm/internal/w;)V", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Lkotlin/jvm/internal/w;)V", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/w;)V", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/w;)V", "(Landroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/w;)V", "(Landroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/w;)V", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@Immutable
/* loaded from: classes.dex */
public final class TextStyle {
    public static final int $stable = 0;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final TextStyle Default = new TextStyle(0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, ViewCompat.MEASURED_SIZE_MASK, (w) null);

    @l
    private final ParagraphStyle paragraphStyle;

    @m
    private final PlatformTextStyle platformStyle;

    @l
    private final SpanStyle spanStyle;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/TextStyle$Companion;", "", "()V", "Default", "Landroidx/compose/ui/text/TextStyle;", "getDefault$annotations", "getDefault", "()Landroidx/compose/ui/text/TextStyle;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @Stable
        public static /* synthetic */ void getDefault$annotations() {
        }

        @l
        public final TextStyle getDefault() {
            return TextStyle.Default;
        }
    }

    public /* synthetic */ TextStyle(long j5, long j6, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j7, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j8, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i5, int i6, long j9, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i7, int i8, TextMotion textMotion, w wVar) {
        this(j5, j6, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j7, baselineShift, textGeometricTransform, localeList, j8, textDecoration, shadow, drawStyle, i5, i6, j9, textIndent, platformTextStyle, lineHeightStyle, i7, i8, textMotion);
    }

    @k(level = kotlin.m.HIDDEN, message = "TextStyle constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    public /* synthetic */ TextStyle(long j5, long j6, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j7, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j8, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j9, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, w wVar) {
        this(j5, j6, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j7, baselineShift, textGeometricTransform, localeList, j8, textDecoration, shadow, drawStyle, textAlign, textDirection, j9, textIndent, platformTextStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    @k(level = kotlin.m.HIDDEN, message = "TextStyle constructors that do not take new stable parameters like TextMotion are deprecated. Please use the new stable constructor.")
    public /* synthetic */ TextStyle(long j5, long j6, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j7, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j8, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j9, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, w wVar) {
        this(j5, j6, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j7, baselineShift, textGeometricTransform, localeList, j8, textDecoration, shadow, textAlign, textDirection, j9, textIndent, platformTextStyle, lineHeightStyle, lineBreak, hyphens);
    }

    @k(level = kotlin.m.HIDDEN, message = "TextStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructor.")
    public /* synthetic */ TextStyle(long j5, long j6, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j7, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j8, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j9, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, w wVar) {
        this(j5, j6, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j7, baselineShift, textGeometricTransform, localeList, j8, textDecoration, shadow, textAlign, textDirection, j9, textIndent, platformTextStyle, lineHeightStyle);
    }

    @k(level = kotlin.m.HIDDEN, message = "TextStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructor.")
    public /* synthetic */ TextStyle(long j5, long j6, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j7, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j8, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j9, TextIndent textIndent, w wVar) {
        this(j5, j6, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j7, baselineShift, textGeometricTransform, localeList, j8, textDecoration, shadow, textAlign, textDirection, j9, textIndent);
    }

    public /* synthetic */ TextStyle(Brush brush, float f5, long j5, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j6, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j7, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i5, int i6, long j8, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i7, int i8, TextMotion textMotion, w wVar) {
        this(brush, f5, j5, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j6, baselineShift, textGeometricTransform, localeList, j7, textDecoration, shadow, drawStyle, i5, i6, j8, textIndent, platformTextStyle, lineHeightStyle, i7, i8, textMotion);
    }

    @k(level = kotlin.m.HIDDEN, message = "TextStyle constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    public /* synthetic */ TextStyle(Brush brush, float f5, long j5, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j6, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j7, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j8, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, w wVar) {
        this(brush, f5, j5, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j6, baselineShift, textGeometricTransform, localeList, j7, textDecoration, shadow, drawStyle, textAlign, textDirection, j8, textIndent, platformTextStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    public TextStyle(@l SpanStyle spanStyle, @l ParagraphStyle paragraphStyle, @m PlatformTextStyle platformTextStyle) {
        this.spanStyle = spanStyle;
        this.paragraphStyle = paragraphStyle;
        this.platformStyle = platformTextStyle;
    }

    /* renamed from: copy-Ns73l9s$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m5556copyNs73l9s$default(TextStyle textStyle, Brush brush, float f5, long j5, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j6, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j7, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i5, int i6, long j8, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i7, int i8, TextMotion textMotion, int i9, Object obj) {
        Shadow shadow2;
        DrawStyle drawStyle2;
        DrawStyle drawStyle3;
        int i10;
        int i11;
        int i12;
        int i13;
        long j9;
        TextIndent textIndent2;
        PlatformTextStyle platformTextStyle2;
        PlatformTextStyle platformTextStyle3;
        LineHeightStyle lineHeightStyle2;
        LineHeightStyle lineHeightStyle3;
        int i14;
        int i15;
        int i16;
        float alpha = (i9 & 2) != 0 ? textStyle.spanStyle.getAlpha() : f5;
        long m5505getFontSizeXSAIIZE = (i9 & 4) != 0 ? textStyle.spanStyle.m5505getFontSizeXSAIIZE() : j5;
        FontWeight fontWeight2 = (i9 & 8) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle m5506getFontStyle4Lr2A7w = (i9 & 16) != 0 ? textStyle.spanStyle.m5506getFontStyle4Lr2A7w() : fontStyle;
        FontSynthesis m5507getFontSynthesisZQGJjVo = (i9 & 32) != 0 ? textStyle.spanStyle.m5507getFontSynthesisZQGJjVo() : fontSynthesis;
        FontFamily fontFamily2 = (i9 & 64) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i9 & 128) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long m5508getLetterSpacingXSAIIZE = (i9 & 256) != 0 ? textStyle.spanStyle.m5508getLetterSpacingXSAIIZE() : j6;
        BaselineShift m5503getBaselineShift5SSeXJ0 = (i9 & 512) != 0 ? textStyle.spanStyle.m5503getBaselineShift5SSeXJ0() : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i9 & 1024) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList2 = (i9 & 2048) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long m5502getBackground0d7_KjU = (i9 & 4096) != 0 ? textStyle.spanStyle.m5502getBackground0d7_KjU() : j7;
        TextDecoration textDecoration2 = (i9 & 8192) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow3 = (i9 & 16384) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        if ((i9 & 32768) != 0) {
            shadow2 = shadow3;
            drawStyle2 = textStyle.spanStyle.getDrawStyle();
        } else {
            shadow2 = shadow3;
            drawStyle2 = drawStyle;
        }
        if ((i9 & 65536) != 0) {
            drawStyle3 = drawStyle2;
            i10 = textStyle.paragraphStyle.m5460getTextAligne0LSkKk();
        } else {
            drawStyle3 = drawStyle2;
            i10 = i5;
        }
        if ((i9 & 131072) != 0) {
            i11 = i10;
            i12 = textStyle.paragraphStyle.m5462getTextDirections_7Xco();
        } else {
            i11 = i10;
            i12 = i6;
        }
        if ((i9 & 262144) != 0) {
            i13 = i12;
            j9 = textStyle.paragraphStyle.m5458getLineHeightXSAIIZE();
        } else {
            i13 = i12;
            j9 = j8;
        }
        TextIndent textIndent3 = (524288 & i9) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        if ((i9 & 1048576) != 0) {
            textIndent2 = textIndent3;
            platformTextStyle2 = textStyle.platformStyle;
        } else {
            textIndent2 = textIndent3;
            platformTextStyle2 = platformTextStyle;
        }
        if ((i9 & 2097152) != 0) {
            platformTextStyle3 = platformTextStyle2;
            lineHeightStyle2 = textStyle.paragraphStyle.getLineHeightStyle();
        } else {
            platformTextStyle3 = platformTextStyle2;
            lineHeightStyle2 = lineHeightStyle;
        }
        if ((i9 & 4194304) != 0) {
            lineHeightStyle3 = lineHeightStyle2;
            i14 = textStyle.paragraphStyle.m5457getLineBreakrAG3T2k();
        } else {
            lineHeightStyle3 = lineHeightStyle2;
            i14 = i7;
        }
        if ((i9 & 8388608) != 0) {
            i15 = i14;
            i16 = textStyle.paragraphStyle.m5455getHyphensvmbZdU8();
        } else {
            i15 = i14;
            i16 = i8;
        }
        return textStyle.m5569copyNs73l9s(brush, alpha, m5505getFontSizeXSAIIZE, fontWeight2, m5506getFontStyle4Lr2A7w, m5507getFontSynthesisZQGJjVo, fontFamily2, fontFeatureSettings, m5508getLetterSpacingXSAIIZE, m5503getBaselineShift5SSeXJ0, textGeometricTransform2, localeList2, m5502getBackground0d7_KjU, textDecoration2, shadow2, drawStyle3, i11, i13, j9, textIndent2, platformTextStyle3, lineHeightStyle3, i15, i16, (i9 & 16777216) != 0 ? textStyle.paragraphStyle.getTextMotion() : textMotion);
    }

    /* renamed from: copy-aIRg9q4$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m5557copyaIRg9q4$default(TextStyle textStyle, Brush brush, float f5, long j5, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j6, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j7, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j8, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i5, Object obj) {
        Shadow shadow2;
        DrawStyle drawStyle2;
        DrawStyle drawStyle3;
        TextAlign textAlign2;
        TextAlign textAlign3;
        TextDirection textDirection2;
        TextDirection textDirection3;
        long j9;
        TextIndent textIndent2;
        PlatformTextStyle platformTextStyle2;
        PlatformTextStyle platformTextStyle3;
        LineHeightStyle lineHeightStyle2;
        LineHeightStyle lineHeightStyle3;
        LineBreak lineBreak2;
        LineBreak lineBreak3;
        Hyphens hyphens2;
        float alpha = (i5 & 2) != 0 ? textStyle.spanStyle.getAlpha() : f5;
        long m5505getFontSizeXSAIIZE = (i5 & 4) != 0 ? textStyle.spanStyle.m5505getFontSizeXSAIIZE() : j5;
        FontWeight fontWeight2 = (i5 & 8) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle m5506getFontStyle4Lr2A7w = (i5 & 16) != 0 ? textStyle.spanStyle.m5506getFontStyle4Lr2A7w() : fontStyle;
        FontSynthesis m5507getFontSynthesisZQGJjVo = (i5 & 32) != 0 ? textStyle.spanStyle.m5507getFontSynthesisZQGJjVo() : fontSynthesis;
        FontFamily fontFamily2 = (i5 & 64) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i5 & 128) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long m5508getLetterSpacingXSAIIZE = (i5 & 256) != 0 ? textStyle.spanStyle.m5508getLetterSpacingXSAIIZE() : j6;
        BaselineShift m5503getBaselineShift5SSeXJ0 = (i5 & 512) != 0 ? textStyle.spanStyle.m5503getBaselineShift5SSeXJ0() : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i5 & 1024) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList2 = (i5 & 2048) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long m5502getBackground0d7_KjU = (i5 & 4096) != 0 ? textStyle.spanStyle.m5502getBackground0d7_KjU() : j7;
        TextDecoration textDecoration2 = (i5 & 8192) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow3 = (i5 & 16384) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        if ((i5 & 32768) != 0) {
            shadow2 = shadow3;
            drawStyle2 = textStyle.spanStyle.getDrawStyle();
        } else {
            shadow2 = shadow3;
            drawStyle2 = drawStyle;
        }
        if ((i5 & 65536) != 0) {
            drawStyle3 = drawStyle2;
            textAlign2 = TextAlign.m5929boximpl(textStyle.paragraphStyle.m5460getTextAligne0LSkKk());
        } else {
            drawStyle3 = drawStyle2;
            textAlign2 = textAlign;
        }
        if ((i5 & 131072) != 0) {
            textAlign3 = textAlign2;
            textDirection2 = TextDirection.m5943boximpl(textStyle.paragraphStyle.m5462getTextDirections_7Xco());
        } else {
            textAlign3 = textAlign2;
            textDirection2 = textDirection;
        }
        if ((i5 & 262144) != 0) {
            textDirection3 = textDirection2;
            j9 = textStyle.paragraphStyle.m5458getLineHeightXSAIIZE();
        } else {
            textDirection3 = textDirection2;
            j9 = j8;
        }
        TextIndent textIndent3 = (524288 & i5) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        if ((i5 & 1048576) != 0) {
            textIndent2 = textIndent3;
            platformTextStyle2 = textStyle.platformStyle;
        } else {
            textIndent2 = textIndent3;
            platformTextStyle2 = platformTextStyle;
        }
        if ((i5 & 2097152) != 0) {
            platformTextStyle3 = platformTextStyle2;
            lineHeightStyle2 = textStyle.paragraphStyle.getLineHeightStyle();
        } else {
            platformTextStyle3 = platformTextStyle2;
            lineHeightStyle2 = lineHeightStyle;
        }
        if ((i5 & 4194304) != 0) {
            lineHeightStyle3 = lineHeightStyle2;
            lineBreak2 = LineBreak.m5849boximpl(textStyle.paragraphStyle.m5457getLineBreakrAG3T2k());
        } else {
            lineHeightStyle3 = lineHeightStyle2;
            lineBreak2 = lineBreak;
        }
        if ((i5 & 8388608) != 0) {
            lineBreak3 = lineBreak2;
            hyphens2 = Hyphens.m5839boximpl(textStyle.paragraphStyle.m5455getHyphensvmbZdU8());
        } else {
            lineBreak3 = lineBreak2;
            hyphens2 = hyphens;
        }
        return textStyle.m5570copyaIRg9q4(brush, alpha, m5505getFontSizeXSAIIZE, fontWeight2, m5506getFontStyle4Lr2A7w, m5507getFontSynthesisZQGJjVo, fontFamily2, fontFeatureSettings, m5508getLetterSpacingXSAIIZE, m5503getBaselineShift5SSeXJ0, textGeometricTransform2, localeList2, m5502getBackground0d7_KjU, textDecoration2, shadow2, drawStyle3, textAlign3, textDirection3, j9, textIndent2, platformTextStyle3, lineHeightStyle3, lineBreak3, hyphens2, (i5 & 16777216) != 0 ? textStyle.paragraphStyle.getTextMotion() : textMotion);
    }

    @k(level = kotlin.m.WARNING, message = "Kept for backwards compatibility.")
    /* renamed from: getHyphens-EaSxIns$annotations, reason: not valid java name */
    public static /* synthetic */ void m5560getHyphensEaSxIns$annotations() {
    }

    @k(level = kotlin.m.WARNING, message = "Kept for backwards compatibility.")
    /* renamed from: getLineBreak-LgCVezo$annotations, reason: not valid java name */
    public static /* synthetic */ void m5561getLineBreakLgCVezo$annotations() {
    }

    @k(level = kotlin.m.WARNING, message = "Kept for backwards compatibility.")
    /* renamed from: getTextAlign-buA522U$annotations, reason: not valid java name */
    public static /* synthetic */ void m5562getTextAlignbuA522U$annotations() {
    }

    @k(level = kotlin.m.WARNING, message = "Kept for backwards compatibility.")
    /* renamed from: getTextDirection-mmuk1to$annotations, reason: not valid java name */
    public static /* synthetic */ void m5563getTextDirectionmmuk1to$annotations() {
    }

    public static /* synthetic */ TextStyle merge$default(TextStyle textStyle, TextStyle textStyle2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            textStyle2 = null;
        }
        return textStyle.merge(textStyle2);
    }

    @k(level = kotlin.m.HIDDEN, message = "TextStyle copy constructors that do not take new stable parameters like LineBreak, Hyphens, and TextMotion are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-CXVQc50, reason: not valid java name */
    public final /* synthetic */ TextStyle m5566copyCXVQc50(long j5, long j6, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j7, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j8, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j9, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        TextForegroundStyle m5957from8_81llA;
        if (Color.m3735equalsimpl0(j5, this.spanStyle.m5504getColor0d7_KjU())) {
            m5957from8_81llA = this.spanStyle.getTextForegroundStyle$ui_text_release();
        } else {
            m5957from8_81llA = TextForegroundStyle.Companion.m5957from8_81llA(j5);
        }
        return new TextStyle(new SpanStyle(m5957from8_81llA, j6, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j7, baselineShift, textGeometricTransform, localeList, j8, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, getDrawStyle(), (w) null), new ParagraphStyle(textAlign != null ? textAlign.m5935unboximpl() : TextAlign.Companion.m5942getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m5949unboximpl() : TextDirection.Companion.m5955getUnspecifieds_7Xco(), j9, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m5861unboximpl() : LineBreak.Companion.m5869getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m5845unboximpl() : Hyphens.Companion.m5848getUnspecifiedvmbZdU8(), getTextMotion(), (w) null), platformTextStyle);
    }

    @k(level = kotlin.m.HIDDEN, message = "TextStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-HL5avdY, reason: not valid java name */
    public final /* synthetic */ TextStyle m5567copyHL5avdY(long j5, long j6, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j7, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j8, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j9, TextIndent textIndent) {
        TextForegroundStyle m5957from8_81llA;
        if (Color.m3735equalsimpl0(j5, this.spanStyle.m5504getColor0d7_KjU())) {
            m5957from8_81llA = this.spanStyle.getTextForegroundStyle$ui_text_release();
        } else {
            m5957from8_81llA = TextForegroundStyle.Companion.m5957from8_81llA(j5);
        }
        return new TextStyle(new SpanStyle(m5957from8_81llA, j6, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j7, baselineShift, textGeometricTransform, localeList, j8, textDecoration, shadow, this.spanStyle.getPlatformStyle(), this.spanStyle.getDrawStyle(), (w) null), new ParagraphStyle(textAlign != null ? textAlign.m5935unboximpl() : TextAlign.Companion.m5942getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m5949unboximpl() : TextDirection.Companion.m5955getUnspecifieds_7Xco(), j9, textIndent, this.paragraphStyle.getPlatformStyle(), getLineHeightStyle(), m5583getLineBreakrAG3T2k(), m5580getHyphensvmbZdU8(), getTextMotion(), (w) null), this.platformStyle);
    }

    @k(level = kotlin.m.HIDDEN, message = "TextStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-NOaFTUo, reason: not valid java name */
    public final /* synthetic */ TextStyle m5568copyNOaFTUo(long j5, long j6, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j7, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j8, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j9, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle) {
        TextForegroundStyle m5957from8_81llA;
        if (Color.m3735equalsimpl0(j5, this.spanStyle.m5504getColor0d7_KjU())) {
            m5957from8_81llA = this.spanStyle.getTextForegroundStyle$ui_text_release();
        } else {
            m5957from8_81llA = TextForegroundStyle.Companion.m5957from8_81llA(j5);
        }
        return new TextStyle(new SpanStyle(m5957from8_81llA, j6, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j7, baselineShift, textGeometricTransform, localeList, j8, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, this.spanStyle.getDrawStyle(), (w) null), new ParagraphStyle(textAlign != null ? textAlign.m5935unboximpl() : TextAlign.Companion.m5942getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m5949unboximpl() : TextDirection.Companion.m5955getUnspecifieds_7Xco(), j9, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, m5583getLineBreakrAG3T2k(), m5580getHyphensvmbZdU8(), getTextMotion(), (w) null), platformTextStyle);
    }

    @l
    /* renamed from: copy-Ns73l9s, reason: not valid java name */
    public final TextStyle m5569copyNs73l9s(@m Brush brush, float f5, long j5, @m FontWeight fontWeight, @m FontStyle fontStyle, @m FontSynthesis fontSynthesis, @m FontFamily fontFamily, @m String str, long j6, @m BaselineShift baselineShift, @m TextGeometricTransform textGeometricTransform, @m LocaleList localeList, long j7, @m TextDecoration textDecoration, @m Shadow shadow, @m DrawStyle drawStyle, int i5, int i6, long j8, @m TextIndent textIndent, @m PlatformTextStyle platformTextStyle, @m LineHeightStyle lineHeightStyle, int i7, int i8, @m TextMotion textMotion) {
        PlatformSpanStyle platformSpanStyle;
        PlatformParagraphStyle platformParagraphStyle = null;
        if (platformTextStyle != null) {
            platformSpanStyle = platformTextStyle.getSpanStyle();
        } else {
            platformSpanStyle = null;
        }
        SpanStyle spanStyle = new SpanStyle(brush, f5, j5, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j6, baselineShift, textGeometricTransform, localeList, j7, textDecoration, shadow, platformSpanStyle, drawStyle, (w) null);
        if (platformTextStyle != null) {
            platformParagraphStyle = platformTextStyle.getParagraphStyle();
        }
        return new TextStyle(spanStyle, new ParagraphStyle(i5, i6, j8, textIndent, platformParagraphStyle, lineHeightStyle, i7, i8, textMotion, (w) null), platformTextStyle);
    }

    @k(level = kotlin.m.HIDDEN, message = "copy constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    /* renamed from: copy-aIRg9q4, reason: not valid java name */
    public final /* synthetic */ TextStyle m5570copyaIRg9q4(Brush brush, float f5, long j5, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j6, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j7, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j8, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        PlatformSpanStyle platformSpanStyle;
        int m5942getUnspecifiede0LSkKk;
        int m5955getUnspecifieds_7Xco;
        int m5869getUnspecifiedrAG3T2k;
        int m5848getUnspecifiedvmbZdU8;
        PlatformParagraphStyle platformParagraphStyle = null;
        if (platformTextStyle != null) {
            platformSpanStyle = platformTextStyle.getSpanStyle();
        } else {
            platformSpanStyle = null;
        }
        SpanStyle spanStyle = new SpanStyle(brush, f5, j5, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j6, baselineShift, textGeometricTransform, localeList, j7, textDecoration, shadow, platformSpanStyle, drawStyle, (w) null);
        if (textAlign != null) {
            m5942getUnspecifiede0LSkKk = textAlign.m5935unboximpl();
        } else {
            m5942getUnspecifiede0LSkKk = TextAlign.Companion.m5942getUnspecifiede0LSkKk();
        }
        if (textDirection != null) {
            m5955getUnspecifieds_7Xco = textDirection.m5949unboximpl();
        } else {
            m5955getUnspecifieds_7Xco = TextDirection.Companion.m5955getUnspecifieds_7Xco();
        }
        if (platformTextStyle != null) {
            platformParagraphStyle = platformTextStyle.getParagraphStyle();
        }
        if (lineBreak != null) {
            m5869getUnspecifiedrAG3T2k = lineBreak.m5861unboximpl();
        } else {
            m5869getUnspecifiedrAG3T2k = LineBreak.Companion.m5869getUnspecifiedrAG3T2k();
        }
        if (hyphens != null) {
            m5848getUnspecifiedvmbZdU8 = hyphens.m5845unboximpl();
        } else {
            m5848getUnspecifiedvmbZdU8 = Hyphens.Companion.m5848getUnspecifiedvmbZdU8();
        }
        return new TextStyle(spanStyle, new ParagraphStyle(m5942getUnspecifiede0LSkKk, m5955getUnspecifieds_7Xco, j8, textIndent, platformParagraphStyle, lineHeightStyle, m5869getUnspecifiedrAG3T2k, m5848getUnspecifiedvmbZdU8, textMotion, (w) null), platformTextStyle);
    }

    @l
    /* renamed from: copy-p1EtxEg, reason: not valid java name */
    public final TextStyle m5571copyp1EtxEg(long j5, long j6, @m FontWeight fontWeight, @m FontStyle fontStyle, @m FontSynthesis fontSynthesis, @m FontFamily fontFamily, @m String str, long j7, @m BaselineShift baselineShift, @m TextGeometricTransform textGeometricTransform, @m LocaleList localeList, long j8, @m TextDecoration textDecoration, @m Shadow shadow, @m DrawStyle drawStyle, int i5, int i6, long j9, @m TextIndent textIndent, @m PlatformTextStyle platformTextStyle, @m LineHeightStyle lineHeightStyle, int i7, int i8, @m TextMotion textMotion) {
        TextForegroundStyle m5957from8_81llA;
        PlatformSpanStyle platformSpanStyle;
        if (Color.m3735equalsimpl0(j5, this.spanStyle.m5504getColor0d7_KjU())) {
            m5957from8_81llA = this.spanStyle.getTextForegroundStyle$ui_text_release();
        } else {
            m5957from8_81llA = TextForegroundStyle.Companion.m5957from8_81llA(j5);
        }
        TextForegroundStyle textForegroundStyle = m5957from8_81llA;
        PlatformParagraphStyle platformParagraphStyle = null;
        if (platformTextStyle != null) {
            platformSpanStyle = platformTextStyle.getSpanStyle();
        } else {
            platformSpanStyle = null;
        }
        SpanStyle spanStyle = new SpanStyle(textForegroundStyle, j6, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j7, baselineShift, textGeometricTransform, localeList, j8, textDecoration, shadow, platformSpanStyle, drawStyle, (w) null);
        if (platformTextStyle != null) {
            platformParagraphStyle = platformTextStyle.getParagraphStyle();
        }
        return new TextStyle(spanStyle, new ParagraphStyle(i5, i6, j9, textIndent, platformParagraphStyle, lineHeightStyle, i7, i8, textMotion, (w) null), platformTextStyle);
    }

    @k(level = kotlin.m.HIDDEN, message = "copy constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    /* renamed from: copy-v2rsoow, reason: not valid java name */
    public final /* synthetic */ TextStyle m5572copyv2rsoow(long j5, long j6, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j7, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j8, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j9, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        TextForegroundStyle m5957from8_81llA;
        PlatformSpanStyle platformSpanStyle;
        int m5942getUnspecifiede0LSkKk;
        int m5955getUnspecifieds_7Xco;
        int m5869getUnspecifiedrAG3T2k;
        int m5848getUnspecifiedvmbZdU8;
        if (Color.m3735equalsimpl0(j5, this.spanStyle.m5504getColor0d7_KjU())) {
            m5957from8_81llA = this.spanStyle.getTextForegroundStyle$ui_text_release();
        } else {
            m5957from8_81llA = TextForegroundStyle.Companion.m5957from8_81llA(j5);
        }
        TextForegroundStyle textForegroundStyle = m5957from8_81llA;
        PlatformParagraphStyle platformParagraphStyle = null;
        if (platformTextStyle != null) {
            platformSpanStyle = platformTextStyle.getSpanStyle();
        } else {
            platformSpanStyle = null;
        }
        SpanStyle spanStyle = new SpanStyle(textForegroundStyle, j6, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j7, baselineShift, textGeometricTransform, localeList, j8, textDecoration, shadow, platformSpanStyle, drawStyle, (w) null);
        if (textAlign != null) {
            m5942getUnspecifiede0LSkKk = textAlign.m5935unboximpl();
        } else {
            m5942getUnspecifiede0LSkKk = TextAlign.Companion.m5942getUnspecifiede0LSkKk();
        }
        if (textDirection != null) {
            m5955getUnspecifieds_7Xco = textDirection.m5949unboximpl();
        } else {
            m5955getUnspecifieds_7Xco = TextDirection.Companion.m5955getUnspecifieds_7Xco();
        }
        if (platformTextStyle != null) {
            platformParagraphStyle = platformTextStyle.getParagraphStyle();
        }
        if (lineBreak != null) {
            m5869getUnspecifiedrAG3T2k = lineBreak.m5861unboximpl();
        } else {
            m5869getUnspecifiedrAG3T2k = LineBreak.Companion.m5869getUnspecifiedrAG3T2k();
        }
        if (hyphens != null) {
            m5848getUnspecifiedvmbZdU8 = hyphens.m5845unboximpl();
        } else {
            m5848getUnspecifiedvmbZdU8 = Hyphens.Companion.m5848getUnspecifiedvmbZdU8();
        }
        return new TextStyle(spanStyle, new ParagraphStyle(m5942getUnspecifiede0LSkKk, m5955getUnspecifieds_7Xco, j9, textIndent, platformParagraphStyle, lineHeightStyle, m5869getUnspecifiedrAG3T2k, m5848getUnspecifiedvmbZdU8, textMotion, (w) null), platformTextStyle);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStyle)) {
            return false;
        }
        TextStyle textStyle = (TextStyle) obj;
        if (l0.g(this.spanStyle, textStyle.spanStyle) && l0.g(this.paragraphStyle, textStyle.paragraphStyle) && l0.g(this.platformStyle, textStyle.platformStyle)) {
            return true;
        }
        return false;
    }

    public final float getAlpha() {
        return this.spanStyle.getAlpha();
    }

    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m5573getBackground0d7_KjU() {
        return this.spanStyle.m5502getBackground0d7_KjU();
    }

    @m
    /* renamed from: getBaselineShift-5SSeXJ0, reason: not valid java name */
    public final BaselineShift m5574getBaselineShift5SSeXJ0() {
        return this.spanStyle.m5503getBaselineShift5SSeXJ0();
    }

    @m
    public final Brush getBrush() {
        return this.spanStyle.getBrush();
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m5575getColor0d7_KjU() {
        return this.spanStyle.m5504getColor0d7_KjU();
    }

    @m
    public final DrawStyle getDrawStyle() {
        return this.spanStyle.getDrawStyle();
    }

    @m
    public final FontFamily getFontFamily() {
        return this.spanStyle.getFontFamily();
    }

    @m
    public final String getFontFeatureSettings() {
        return this.spanStyle.getFontFeatureSettings();
    }

    /* renamed from: getFontSize-XSAIIZE, reason: not valid java name */
    public final long m5576getFontSizeXSAIIZE() {
        return this.spanStyle.m5505getFontSizeXSAIIZE();
    }

    @m
    /* renamed from: getFontStyle-4Lr2A7w, reason: not valid java name */
    public final FontStyle m5577getFontStyle4Lr2A7w() {
        return this.spanStyle.m5506getFontStyle4Lr2A7w();
    }

    @m
    /* renamed from: getFontSynthesis-ZQGJjVo, reason: not valid java name */
    public final FontSynthesis m5578getFontSynthesisZQGJjVo() {
        return this.spanStyle.m5507getFontSynthesisZQGJjVo();
    }

    @m
    public final FontWeight getFontWeight() {
        return this.spanStyle.getFontWeight();
    }

    @h(name = "getHyphens-EaSxIns")
    @m
    /* renamed from: getHyphens-EaSxIns, reason: not valid java name */
    public final Hyphens m5579getHyphensEaSxIns() {
        return Hyphens.m5839boximpl(m5580getHyphensvmbZdU8());
    }

    /* renamed from: getHyphens-vmbZdU8, reason: not valid java name */
    public final int m5580getHyphensvmbZdU8() {
        return this.paragraphStyle.m5455getHyphensvmbZdU8();
    }

    /* renamed from: getLetterSpacing-XSAIIZE, reason: not valid java name */
    public final long m5581getLetterSpacingXSAIIZE() {
        return this.spanStyle.m5508getLetterSpacingXSAIIZE();
    }

    @h(name = "getLineBreak-LgCVezo")
    @m
    /* renamed from: getLineBreak-LgCVezo, reason: not valid java name */
    public final LineBreak m5582getLineBreakLgCVezo() {
        return LineBreak.m5849boximpl(m5583getLineBreakrAG3T2k());
    }

    /* renamed from: getLineBreak-rAG3T2k, reason: not valid java name */
    public final int m5583getLineBreakrAG3T2k() {
        return this.paragraphStyle.m5457getLineBreakrAG3T2k();
    }

    /* renamed from: getLineHeight-XSAIIZE, reason: not valid java name */
    public final long m5584getLineHeightXSAIIZE() {
        return this.paragraphStyle.m5458getLineHeightXSAIIZE();
    }

    @m
    public final LineHeightStyle getLineHeightStyle() {
        return this.paragraphStyle.getLineHeightStyle();
    }

    @m
    public final LocaleList getLocaleList() {
        return this.spanStyle.getLocaleList();
    }

    @l
    public final ParagraphStyle getParagraphStyle$ui_text_release() {
        return this.paragraphStyle;
    }

    @m
    public final PlatformTextStyle getPlatformStyle() {
        return this.platformStyle;
    }

    @m
    public final Shadow getShadow() {
        return this.spanStyle.getShadow();
    }

    @l
    public final SpanStyle getSpanStyle$ui_text_release() {
        return this.spanStyle;
    }

    @h(name = "getTextAlign-buA522U")
    @m
    /* renamed from: getTextAlign-buA522U, reason: not valid java name */
    public final TextAlign m5585getTextAlignbuA522U() {
        return TextAlign.m5929boximpl(m5586getTextAligne0LSkKk());
    }

    /* renamed from: getTextAlign-e0LSkKk, reason: not valid java name */
    public final int m5586getTextAligne0LSkKk() {
        return this.paragraphStyle.m5460getTextAligne0LSkKk();
    }

    @m
    public final TextDecoration getTextDecoration() {
        return this.spanStyle.getTextDecoration();
    }

    @h(name = "getTextDirection-mmuk1to")
    @m
    /* renamed from: getTextDirection-mmuk1to, reason: not valid java name */
    public final TextDirection m5587getTextDirectionmmuk1to() {
        return TextDirection.m5943boximpl(m5588getTextDirections_7Xco());
    }

    /* renamed from: getTextDirection-s_7X-co, reason: not valid java name */
    public final int m5588getTextDirections_7Xco() {
        return this.paragraphStyle.m5462getTextDirections_7Xco();
    }

    @m
    public final TextGeometricTransform getTextGeometricTransform() {
        return this.spanStyle.getTextGeometricTransform();
    }

    @m
    public final TextIndent getTextIndent() {
        return this.paragraphStyle.getTextIndent();
    }

    @m
    public final TextMotion getTextMotion() {
        return this.paragraphStyle.getTextMotion();
    }

    public final boolean hasSameDrawAffectingAttributes(@l TextStyle textStyle) {
        return this == textStyle || this.spanStyle.hasSameNonLayoutAttributes$ui_text_release(textStyle.spanStyle);
    }

    public final boolean hasSameLayoutAffectingAttributes(@l TextStyle textStyle) {
        if (this != textStyle && (!l0.g(this.paragraphStyle, textStyle.paragraphStyle) || !this.spanStyle.hasSameLayoutAffectingAttributes$ui_text_release(textStyle.spanStyle))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i5;
        int hashCode = ((this.spanStyle.hashCode() * 31) + this.paragraphStyle.hashCode()) * 31;
        PlatformTextStyle platformTextStyle = this.platformStyle;
        if (platformTextStyle != null) {
            i5 = platformTextStyle.hashCode();
        } else {
            i5 = 0;
        }
        return hashCode + i5;
    }

    public final int hashCodeLayoutAffectingAttributes$ui_text_release() {
        int i5;
        int hashCodeLayoutAffectingAttributes$ui_text_release = ((this.spanStyle.hashCodeLayoutAffectingAttributes$ui_text_release() * 31) + this.paragraphStyle.hashCode()) * 31;
        PlatformTextStyle platformTextStyle = this.platformStyle;
        if (platformTextStyle != null) {
            i5 = platformTextStyle.hashCode();
        } else {
            i5 = 0;
        }
        return hashCodeLayoutAffectingAttributes$ui_text_release + i5;
    }

    @Stable
    @l
    public final TextStyle merge(@m TextStyle textStyle) {
        return (textStyle == null || l0.g(textStyle, Default)) ? this : new TextStyle(toSpanStyle().merge(textStyle.toSpanStyle()), toParagraphStyle().merge(textStyle.toParagraphStyle()));
    }

    @Stable
    @k(level = kotlin.m.HIDDEN, message = "merge that takes nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    /* renamed from: merge-Z1GrekI, reason: not valid java name */
    public final /* synthetic */ TextStyle m5589mergeZ1GrekI(long j5, long j6, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j7, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j8, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j9, TextIndent textIndent, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, PlatformTextStyle platformTextStyle, TextMotion textMotion) {
        PlatformSpanStyle platformSpanStyle;
        int m5942getUnspecifiede0LSkKk;
        int m5955getUnspecifieds_7Xco;
        int m5869getUnspecifiedrAG3T2k;
        int m5848getUnspecifiedvmbZdU8;
        SpanStyle spanStyle = this.spanStyle;
        PlatformParagraphStyle platformParagraphStyle = null;
        if (platformTextStyle != null) {
            platformSpanStyle = platformTextStyle.getSpanStyle();
        } else {
            platformSpanStyle = null;
        }
        SpanStyle m5509fastMergedSHsh3o = SpanStyleKt.m5509fastMergedSHsh3o(spanStyle, j5, null, Float.NaN, j6, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j7, baselineShift, textGeometricTransform, localeList, j8, textDecoration, shadow, platformSpanStyle, drawStyle);
        ParagraphStyle paragraphStyle = this.paragraphStyle;
        if (textAlign != null) {
            m5942getUnspecifiede0LSkKk = textAlign.m5935unboximpl();
        } else {
            m5942getUnspecifiede0LSkKk = TextAlign.Companion.m5942getUnspecifiede0LSkKk();
        }
        if (textDirection != null) {
            m5955getUnspecifieds_7Xco = textDirection.m5949unboximpl();
        } else {
            m5955getUnspecifieds_7Xco = TextDirection.Companion.m5955getUnspecifieds_7Xco();
        }
        if (platformTextStyle != null) {
            platformParagraphStyle = platformTextStyle.getParagraphStyle();
        }
        if (lineBreak != null) {
            m5869getUnspecifiedrAG3T2k = lineBreak.m5861unboximpl();
        } else {
            m5869getUnspecifiedrAG3T2k = LineBreak.Companion.m5869getUnspecifiedrAG3T2k();
        }
        if (hyphens != null) {
            m5848getUnspecifiedvmbZdU8 = hyphens.m5845unboximpl();
        } else {
            m5848getUnspecifiedvmbZdU8 = Hyphens.Companion.m5848getUnspecifiedvmbZdU8();
        }
        ParagraphStyle m5463fastMergej5T8yCg = ParagraphStyleKt.m5463fastMergej5T8yCg(paragraphStyle, m5942getUnspecifiede0LSkKk, m5955getUnspecifieds_7Xco, j9, textIndent, platformParagraphStyle, lineHeightStyle, m5869getUnspecifiedrAG3T2k, m5848getUnspecifiedvmbZdU8, textMotion);
        if (this.spanStyle == m5509fastMergedSHsh3o && this.paragraphStyle == m5463fastMergej5T8yCg) {
            return this;
        }
        return new TextStyle(m5509fastMergedSHsh3o, m5463fastMergej5T8yCg);
    }

    @Stable
    @l
    /* renamed from: merge-dA7vx0o, reason: not valid java name */
    public final TextStyle m5590mergedA7vx0o(long j5, long j6, @m FontWeight fontWeight, @m FontStyle fontStyle, @m FontSynthesis fontSynthesis, @m FontFamily fontFamily, @m String str, long j7, @m BaselineShift baselineShift, @m TextGeometricTransform textGeometricTransform, @m LocaleList localeList, long j8, @m TextDecoration textDecoration, @m Shadow shadow, @m DrawStyle drawStyle, int i5, int i6, long j9, @m TextIndent textIndent, @m LineHeightStyle lineHeightStyle, int i7, int i8, @m PlatformTextStyle platformTextStyle, @m TextMotion textMotion) {
        PlatformSpanStyle platformSpanStyle;
        SpanStyle spanStyle = this.spanStyle;
        PlatformParagraphStyle platformParagraphStyle = null;
        if (platformTextStyle != null) {
            platformSpanStyle = platformTextStyle.getSpanStyle();
        } else {
            platformSpanStyle = null;
        }
        SpanStyle m5509fastMergedSHsh3o = SpanStyleKt.m5509fastMergedSHsh3o(spanStyle, j5, null, Float.NaN, j6, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j7, baselineShift, textGeometricTransform, localeList, j8, textDecoration, shadow, platformSpanStyle, drawStyle);
        ParagraphStyle paragraphStyle = this.paragraphStyle;
        if (platformTextStyle != null) {
            platformParagraphStyle = platformTextStyle.getParagraphStyle();
        }
        ParagraphStyle m5463fastMergej5T8yCg = ParagraphStyleKt.m5463fastMergej5T8yCg(paragraphStyle, i5, i6, j9, textIndent, platformParagraphStyle, lineHeightStyle, i7, i8, textMotion);
        if (this.spanStyle == m5509fastMergedSHsh3o && this.paragraphStyle == m5463fastMergej5T8yCg) {
            return this;
        }
        return new TextStyle(m5509fastMergedSHsh3o, m5463fastMergej5T8yCg);
    }

    @Stable
    @l
    public final TextStyle plus(@l TextStyle textStyle) {
        return merge(textStyle);
    }

    @Stable
    @l
    public final ParagraphStyle toParagraphStyle() {
        return this.paragraphStyle;
    }

    @Stable
    @l
    public final SpanStyle toSpanStyle() {
        return this.spanStyle;
    }

    @l
    public String toString() {
        return "TextStyle(color=" + ((Object) Color.m3742toStringimpl(m5575getColor0d7_KjU())) + ", brush=" + getBrush() + ", alpha=" + getAlpha() + ", fontSize=" + ((Object) TextUnit.m6242toStringimpl(m5576getFontSizeXSAIIZE())) + ", fontWeight=" + getFontWeight() + ", fontStyle=" + m5577getFontStyle4Lr2A7w() + ", fontSynthesis=" + m5578getFontSynthesisZQGJjVo() + ", fontFamily=" + getFontFamily() + ", fontFeatureSettings=" + getFontFeatureSettings() + ", letterSpacing=" + ((Object) TextUnit.m6242toStringimpl(m5581getLetterSpacingXSAIIZE())) + ", baselineShift=" + m5574getBaselineShift5SSeXJ0() + ", textGeometricTransform=" + getTextGeometricTransform() + ", localeList=" + getLocaleList() + ", background=" + ((Object) Color.m3742toStringimpl(m5573getBackground0d7_KjU())) + ", textDecoration=" + getTextDecoration() + ", shadow=" + getShadow() + ", drawStyle=" + getDrawStyle() + ", textAlign=" + ((Object) TextAlign.m5934toStringimpl(m5586getTextAligne0LSkKk())) + ", textDirection=" + ((Object) TextDirection.m5948toStringimpl(m5588getTextDirections_7Xco())) + ", lineHeight=" + ((Object) TextUnit.m6242toStringimpl(m5584getLineHeightXSAIIZE())) + ", textIndent=" + getTextIndent() + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + getLineHeightStyle() + ", lineBreak=" + ((Object) LineBreak.m5860toStringimpl(m5583getLineBreakrAG3T2k())) + ", hyphens=" + ((Object) Hyphens.m5844toStringimpl(m5580getHyphensvmbZdU8())) + ", textMotion=" + getTextMotion() + ')';
    }

    @Stable
    @l
    public final TextStyle plus(@l ParagraphStyle paragraphStyle) {
        return merge(paragraphStyle);
    }

    @Stable
    @l
    public final TextStyle plus(@l SpanStyle spanStyle) {
        return merge(spanStyle);
    }

    public /* synthetic */ TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle, PlatformTextStyle platformTextStyle, int i5, w wVar) {
        this(spanStyle, paragraphStyle, (i5 & 4) != 0 ? null : platformTextStyle);
    }

    public TextStyle(@l SpanStyle spanStyle, @l ParagraphStyle paragraphStyle) {
        this(spanStyle, paragraphStyle, TextStyleKt.access$createPlatformTextStyleInternal(spanStyle.getPlatformStyle(), paragraphStyle.getPlatformStyle()));
    }

    @Stable
    @l
    public final TextStyle merge(@l SpanStyle spanStyle) {
        return new TextStyle(toSpanStyle().merge(spanStyle), toParagraphStyle());
    }

    public /* synthetic */ TextStyle(long j5, long j6, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j7, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j8, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j9, TextIndent textIndent, int i5, w wVar) {
        this((i5 & 1) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j5, (i5 & 2) != 0 ? TextUnit.Companion.m6246getUnspecifiedXSAIIZE() : j6, (i5 & 4) != 0 ? null : fontWeight, (i5 & 8) != 0 ? null : fontStyle, (i5 & 16) != 0 ? null : fontSynthesis, (i5 & 32) != 0 ? null : fontFamily, (i5 & 64) != 0 ? null : str, (i5 & 128) != 0 ? TextUnit.Companion.m6246getUnspecifiedXSAIIZE() : j7, (i5 & 256) != 0 ? null : baselineShift, (i5 & 512) != 0 ? null : textGeometricTransform, (i5 & 1024) != 0 ? null : localeList, (i5 & 2048) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j8, (i5 & 4096) != 0 ? null : textDecoration, (i5 & 8192) != 0 ? null : shadow, (i5 & 16384) != 0 ? null : textAlign, (i5 & 32768) != 0 ? null : textDirection, (i5 & 65536) != 0 ? TextUnit.Companion.m6246getUnspecifiedXSAIIZE() : j9, (i5 & 131072) != 0 ? null : textIndent, null);
    }

    @Stable
    @l
    public final TextStyle merge(@l ParagraphStyle paragraphStyle) {
        return new TextStyle(toSpanStyle(), toParagraphStyle().merge(paragraphStyle));
    }

    private TextStyle(long j5, long j6, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j7, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j8, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j9, TextIndent textIndent) {
        this(new SpanStyle(j5, j6, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j7, baselineShift, textGeometricTransform, localeList, j8, textDecoration, shadow, (PlatformSpanStyle) null, (DrawStyle) null, (w) null), new ParagraphStyle(textAlign != null ? textAlign.m5935unboximpl() : TextAlign.Companion.m5942getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m5949unboximpl() : TextDirection.Companion.m5955getUnspecifieds_7Xco(), j9, textIndent, (PlatformParagraphStyle) null, (LineHeightStyle) null, LineBreak.Companion.m5869getUnspecifiedrAG3T2k(), Hyphens.Companion.m5848getUnspecifiedvmbZdU8(), (TextMotion) null, (w) null), null);
    }

    public /* synthetic */ TextStyle(long j5, long j6, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j7, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j8, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j9, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i5, w wVar) {
        this((i5 & 1) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j5, (i5 & 2) != 0 ? TextUnit.Companion.m6246getUnspecifiedXSAIIZE() : j6, (i5 & 4) != 0 ? null : fontWeight, (i5 & 8) != 0 ? null : fontStyle, (i5 & 16) != 0 ? null : fontSynthesis, (i5 & 32) != 0 ? null : fontFamily, (i5 & 64) != 0 ? null : str, (i5 & 128) != 0 ? TextUnit.Companion.m6246getUnspecifiedXSAIIZE() : j7, (i5 & 256) != 0 ? null : baselineShift, (i5 & 512) != 0 ? null : textGeometricTransform, (i5 & 1024) != 0 ? null : localeList, (i5 & 2048) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j8, (i5 & 4096) != 0 ? null : textDecoration, (i5 & 8192) != 0 ? null : shadow, (i5 & 16384) != 0 ? null : textAlign, (i5 & 32768) != 0 ? null : textDirection, (i5 & 65536) != 0 ? TextUnit.Companion.m6246getUnspecifiedXSAIIZE() : j9, (i5 & 131072) != 0 ? null : textIndent, (i5 & 262144) != 0 ? null : platformTextStyle, (i5 & 524288) != 0 ? null : lineHeightStyle, null);
    }

    private TextStyle(long j5, long j6, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j7, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j8, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j9, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle) {
        this(new SpanStyle(j5, j6, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j7, baselineShift, textGeometricTransform, localeList, j8, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, (DrawStyle) null, (w) null), new ParagraphStyle(textAlign != null ? textAlign.m5935unboximpl() : TextAlign.Companion.m5942getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m5949unboximpl() : TextDirection.Companion.m5955getUnspecifieds_7Xco(), j9, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, LineBreak.Companion.m5869getUnspecifiedrAG3T2k(), Hyphens.Companion.m5848getUnspecifiedvmbZdU8(), (TextMotion) null, (w) null), platformTextStyle);
    }

    public /* synthetic */ TextStyle(long j5, long j6, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j7, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j8, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j9, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i5, w wVar) {
        this((i5 & 1) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j5, (i5 & 2) != 0 ? TextUnit.Companion.m6246getUnspecifiedXSAIIZE() : j6, (i5 & 4) != 0 ? null : fontWeight, (i5 & 8) != 0 ? null : fontStyle, (i5 & 16) != 0 ? null : fontSynthesis, (i5 & 32) != 0 ? null : fontFamily, (i5 & 64) != 0 ? null : str, (i5 & 128) != 0 ? TextUnit.Companion.m6246getUnspecifiedXSAIIZE() : j7, (i5 & 256) != 0 ? null : baselineShift, (i5 & 512) != 0 ? null : textGeometricTransform, (i5 & 1024) != 0 ? null : localeList, (i5 & 2048) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j8, (i5 & 4096) != 0 ? null : textDecoration, (i5 & 8192) != 0 ? null : shadow, (i5 & 16384) != 0 ? null : textAlign, (i5 & 32768) != 0 ? null : textDirection, (i5 & 65536) != 0 ? TextUnit.Companion.m6246getUnspecifiedXSAIIZE() : j9, (i5 & 131072) != 0 ? null : textIndent, (i5 & 262144) != 0 ? null : platformTextStyle, (i5 & 524288) != 0 ? null : lineHeightStyle, (i5 & 1048576) != 0 ? null : lineBreak, (i5 & 2097152) != 0 ? null : hyphens, null);
    }

    private TextStyle(long j5, long j6, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j7, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j8, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j9, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        this(new SpanStyle(j5, j6, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j7, baselineShift, textGeometricTransform, localeList, j8, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, (DrawStyle) null, 32768, (w) null), new ParagraphStyle(textAlign != null ? textAlign.m5935unboximpl() : TextAlign.Companion.m5942getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m5949unboximpl() : TextDirection.Companion.m5955getUnspecifieds_7Xco(), j9, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m5861unboximpl() : LineBreak.Companion.m5869getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m5845unboximpl() : Hyphens.Companion.m5848getUnspecifiedvmbZdU8(), (TextMotion) null, 256, (w) null), platformTextStyle);
    }

    public /* synthetic */ TextStyle(long j5, long j6, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j7, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j8, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j9, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i5, w wVar) {
        this((i5 & 1) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j5, (i5 & 2) != 0 ? TextUnit.Companion.m6246getUnspecifiedXSAIIZE() : j6, (i5 & 4) != 0 ? null : fontWeight, (i5 & 8) != 0 ? null : fontStyle, (i5 & 16) != 0 ? null : fontSynthesis, (i5 & 32) != 0 ? null : fontFamily, (i5 & 64) != 0 ? null : str, (i5 & 128) != 0 ? TextUnit.Companion.m6246getUnspecifiedXSAIIZE() : j7, (i5 & 256) != 0 ? null : baselineShift, (i5 & 512) != 0 ? null : textGeometricTransform, (i5 & 1024) != 0 ? null : localeList, (i5 & 2048) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j8, (i5 & 4096) != 0 ? null : textDecoration, (i5 & 8192) != 0 ? null : shadow, (i5 & 16384) != 0 ? null : drawStyle, (i5 & 32768) != 0 ? null : textAlign, (i5 & 65536) != 0 ? null : textDirection, (i5 & 131072) != 0 ? TextUnit.Companion.m6246getUnspecifiedXSAIIZE() : j9, (i5 & 262144) != 0 ? null : textIndent, (i5 & 524288) != 0 ? null : platformTextStyle, (i5 & 1048576) != 0 ? null : lineHeightStyle, (i5 & 2097152) != 0 ? null : lineBreak, (i5 & 4194304) != 0 ? null : hyphens, (i5 & 8388608) != 0 ? null : textMotion, (w) null);
    }

    private TextStyle(long j5, long j6, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j7, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j8, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j9, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        this(new SpanStyle(j5, j6, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j7, baselineShift, textGeometricTransform, localeList, j8, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (w) null), new ParagraphStyle(textAlign != null ? textAlign.m5935unboximpl() : TextAlign.Companion.m5942getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m5949unboximpl() : TextDirection.Companion.m5955getUnspecifieds_7Xco(), j9, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m5861unboximpl() : LineBreak.Companion.m5869getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m5845unboximpl() : Hyphens.Companion.m5848getUnspecifiedvmbZdU8(), textMotion, (w) null), platformTextStyle);
    }

    public /* synthetic */ TextStyle(long j5, long j6, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j7, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j8, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i5, int i6, long j9, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i7, int i8, TextMotion textMotion, int i9, w wVar) {
        this((i9 & 1) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j5, (i9 & 2) != 0 ? TextUnit.Companion.m6246getUnspecifiedXSAIIZE() : j6, (i9 & 4) != 0 ? null : fontWeight, (i9 & 8) != 0 ? null : fontStyle, (i9 & 16) != 0 ? null : fontSynthesis, (i9 & 32) != 0 ? null : fontFamily, (i9 & 64) != 0 ? null : str, (i9 & 128) != 0 ? TextUnit.Companion.m6246getUnspecifiedXSAIIZE() : j7, (i9 & 256) != 0 ? null : baselineShift, (i9 & 512) != 0 ? null : textGeometricTransform, (i9 & 1024) != 0 ? null : localeList, (i9 & 2048) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j8, (i9 & 4096) != 0 ? null : textDecoration, (i9 & 8192) != 0 ? null : shadow, (i9 & 16384) != 0 ? null : drawStyle, (i9 & 32768) != 0 ? TextAlign.Companion.m5942getUnspecifiede0LSkKk() : i5, (i9 & 65536) != 0 ? TextDirection.Companion.m5955getUnspecifieds_7Xco() : i6, (i9 & 131072) != 0 ? TextUnit.Companion.m6246getUnspecifiedXSAIIZE() : j9, (i9 & 262144) != 0 ? null : textIndent, (i9 & 524288) != 0 ? null : platformTextStyle, (i9 & 1048576) != 0 ? null : lineHeightStyle, (i9 & 2097152) != 0 ? LineBreak.Companion.m5869getUnspecifiedrAG3T2k() : i7, (i9 & 4194304) != 0 ? Hyphens.Companion.m5848getUnspecifiedvmbZdU8() : i8, (i9 & 8388608) != 0 ? null : textMotion, (w) null);
    }

    private TextStyle(long j5, long j6, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j7, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j8, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i5, int i6, long j9, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i7, int i8, TextMotion textMotion) {
        this(new SpanStyle(j5, j6, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j7, baselineShift, textGeometricTransform, localeList, j8, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (w) null), new ParagraphStyle(i5, i6, j9, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i7, i8, textMotion, (w) null), platformTextStyle);
    }

    public /* synthetic */ TextStyle(Brush brush, float f5, long j5, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j6, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j7, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i5, int i6, long j8, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i7, int i8, TextMotion textMotion, int i9, w wVar) {
        this(brush, (i9 & 2) != 0 ? Float.NaN : f5, (i9 & 4) != 0 ? TextUnit.Companion.m6246getUnspecifiedXSAIIZE() : j5, (i9 & 8) != 0 ? null : fontWeight, (i9 & 16) != 0 ? null : fontStyle, (i9 & 32) != 0 ? null : fontSynthesis, (i9 & 64) != 0 ? null : fontFamily, (i9 & 128) != 0 ? null : str, (i9 & 256) != 0 ? TextUnit.Companion.m6246getUnspecifiedXSAIIZE() : j6, (i9 & 512) != 0 ? null : baselineShift, (i9 & 1024) != 0 ? null : textGeometricTransform, (i9 & 2048) != 0 ? null : localeList, (i9 & 4096) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j7, (i9 & 8192) != 0 ? null : textDecoration, (i9 & 16384) != 0 ? null : shadow, (32768 & i9) != 0 ? null : drawStyle, (65536 & i9) != 0 ? TextAlign.Companion.m5942getUnspecifiede0LSkKk() : i5, (131072 & i9) != 0 ? TextDirection.Companion.m5955getUnspecifieds_7Xco() : i6, (262144 & i9) != 0 ? TextUnit.Companion.m6246getUnspecifiedXSAIIZE() : j8, (524288 & i9) != 0 ? null : textIndent, (1048576 & i9) != 0 ? null : platformTextStyle, (2097152 & i9) != 0 ? null : lineHeightStyle, (4194304 & i9) != 0 ? LineBreak.Companion.m5869getUnspecifiedrAG3T2k() : i7, (8388608 & i9) != 0 ? Hyphens.Companion.m5848getUnspecifiedvmbZdU8() : i8, (i9 & 16777216) != 0 ? null : textMotion, (w) null);
    }

    private TextStyle(Brush brush, float f5, long j5, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j6, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j7, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i5, int i6, long j8, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i7, int i8, TextMotion textMotion) {
        this(new SpanStyle(brush, f5, j5, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j6, baselineShift, textGeometricTransform, localeList, j7, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (w) null), new ParagraphStyle(i5, i6, j8, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i7, i8, textMotion, (w) null), platformTextStyle);
    }

    public /* synthetic */ TextStyle(Brush brush, float f5, long j5, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j6, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j7, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j8, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i5, w wVar) {
        this(brush, (i5 & 2) != 0 ? Float.NaN : f5, (i5 & 4) != 0 ? TextUnit.Companion.m6246getUnspecifiedXSAIIZE() : j5, (i5 & 8) != 0 ? null : fontWeight, (i5 & 16) != 0 ? null : fontStyle, (i5 & 32) != 0 ? null : fontSynthesis, (i5 & 64) != 0 ? null : fontFamily, (i5 & 128) != 0 ? null : str, (i5 & 256) != 0 ? TextUnit.Companion.m6246getUnspecifiedXSAIIZE() : j6, (i5 & 512) != 0 ? null : baselineShift, (i5 & 1024) != 0 ? null : textGeometricTransform, (i5 & 2048) != 0 ? null : localeList, (i5 & 4096) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j7, (i5 & 8192) != 0 ? null : textDecoration, (i5 & 16384) != 0 ? null : shadow, (32768 & i5) != 0 ? null : drawStyle, (65536 & i5) != 0 ? null : textAlign, (131072 & i5) != 0 ? null : textDirection, (262144 & i5) != 0 ? TextUnit.Companion.m6246getUnspecifiedXSAIIZE() : j8, (524288 & i5) != 0 ? null : textIndent, (1048576 & i5) != 0 ? null : platformTextStyle, (2097152 & i5) != 0 ? null : lineHeightStyle, (4194304 & i5) != 0 ? null : lineBreak, (8388608 & i5) != 0 ? null : hyphens, (i5 & 16777216) != 0 ? null : textMotion, (w) null);
    }

    private TextStyle(Brush brush, float f5, long j5, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j6, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j7, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j8, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        this(new SpanStyle(brush, f5, j5, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j6, baselineShift, textGeometricTransform, localeList, j7, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (w) null), new ParagraphStyle(textAlign != null ? textAlign.m5935unboximpl() : TextAlign.Companion.m5942getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m5949unboximpl() : TextDirection.Companion.m5955getUnspecifieds_7Xco(), j8, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m5861unboximpl() : LineBreak.Companion.m5869getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m5845unboximpl() : Hyphens.Companion.m5848getUnspecifiedvmbZdU8(), textMotion, (w) null), platformTextStyle);
    }
}
