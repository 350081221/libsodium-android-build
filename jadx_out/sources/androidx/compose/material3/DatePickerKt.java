package androidx.compose.material3;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.material3.Strings;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.lody.virtual.client.hook.providers.DownloadProviderHook;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.u0;
import kotlinx.coroutines.s0;

@kotlin.i0(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\u001am\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001aH\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aT\u0010\"\u001a\u00020\u00002\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\u0084\u0001\u0010+\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b2\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b2\u0013\u0010#\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0011\u0010(\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a6\u00101\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u00162\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00070-H\u0001ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a\u009c\u0001\u0010>\u001a\u00020\u00072\b\u00102\u001a\u0004\u0018\u00010\u00112\u0006\u00103\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00162#\u00107\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020\u00070-2!\u00109\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(8\u0012\u0004\u0012\u00020\u00070-2\u0006\u0010;\u001a\u00020:2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\rH\u0003ø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001a\u008f\u0001\u0010?\u001a\u00020\u00072\b\u00102\u001a\u0004\u0018\u00010\u00112\u0006\u00103\u001a\u00020\u00112!\u00107\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020\u00070-2!\u00109\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(8\u0012\u0004\u0012\u00020\u00070-2\u0006\u0010;\u001a\u00020:2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b?\u0010@\u001aZ\u0010G\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020A2\u0006\u0010D\u001a\u00020&2\u0011\u0010(\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0001ø\u0001\u0000¢\u0006\u0004\bE\u0010F\u001a\u008f\u0001\u0010J\u001a\u00020\u00072\u0006\u0010I\u001a\u00020H2\b\u00102\u001a\u0004\u0018\u00010\u00112!\u00107\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020\u00070-2!\u00109\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(8\u0012\u0004\u0012\u00020\u00070-2\u0006\u0010;\u001a\u00020:2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\bJ\u0010K\u001aK\u0010L\u001a\u00020\u00072\u0006\u0010I\u001a\u00020H2!\u00109\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(8\u0012\u0004\u0012\u00020\u00070-2\u0006\u0010;\u001a\u00020:2\u0006\u0010\u0015\u001a\u00020\u0014H\u0080@¢\u0006\u0004\bL\u0010M\u001a\u001f\u0010N\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\bN\u0010O\u001ax\u0010W\u001a\u00020\u00072\u0006\u0010Q\u001a\u00020P2!\u00107\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020\u00070-2\u0006\u0010R\u001a\u00020\u00112\b\u0010S\u001a\u0004\u0018\u00010\u00112\b\u0010T\u001a\u0004\u0018\u00010\u00112\b\u0010V\u001a\u0004\u0018\u00010U2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\bW\u0010X\u001a\u0010\u0010Z\u001a\u00020Y2\u0006\u0010\u0015\u001a\u00020\u0014H\u0000\u001a9\u0010a\u001a\u0004\u0018\u00010`2\u0006\u0010[\u001a\u00020\u000b2\u0006\u0010\\\u001a\u00020\u000b2\u0006\u0010]\u001a\u00020\u000b2\u0006\u0010^\u001a\u00020\u000b2\u0006\u0010_\u001a\u00020\u000bH\u0003¢\u0006\u0004\ba\u0010b\u001ap\u0010j\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010c\u001a\u00020\u000b2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010e\u001a\u00020\u000b2\u0006\u0010f\u001a\u00020\u000b2\u0006\u0010g\u001a\u00020\u000b2\u0006\u0010h\u001a\u00020\u000b2\u0006\u0010i\u001a\u00020`2\u0006\u0010\u000e\u001a\u00020\r2\u0011\u0010(\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0003¢\u0006\u0004\bj\u0010k\u001ab\u0010n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u00112!\u0010m\u001a\u001d\u0012\u0013\u0012\u00110Y¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(l\u0012\u0004\u0012\u00020\u00070-2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010;\u001a\u00020:2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\bn\u0010o\u001a`\u0010q\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010c\u001a\u00020\u000b2\u0006\u0010p\u001a\u00020\u000b2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010f\u001a\u00020\u000b2\u0006\u0010i\u001a\u00020`2\u0006\u0010\u000e\u001a\u00020\r2\u0011\u0010(\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0003¢\u0006\u0004\bq\u0010r\u001ai\u0010z\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010s\u001a\u00020\u000b2\u0006\u0010t\u001a\u00020\u000b2\u0006\u0010u\u001a\u00020\u000b2\u0006\u0010v\u001a\u00020`2\f\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010x\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010y\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\bz\u0010{\u001aB\u0010}\u001a\u00020\u00072\f\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010|\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0011\u0010(\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0003¢\u0006\u0004\b}\u0010~\u001a5\u0010\u0086\u0001\u001a\n\u0012\u0005\u0012\u00030\u0085\u00010\u0084\u00012\u0006\u0010\u0001\u001a\u00020\u007f2\b\u0010\u0081\u0001\u001a\u00030\u0080\u00012\u0007\u0010\u0082\u0001\u001a\u00020`2\u0007\u0010\u0083\u0001\u001a\u00020`H\u0002\"\u001f\u0010\u0087\u0001\u001a\u00020&8\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u001f\u0010\u008b\u0001\u001a\u00020&8\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u0088\u0001\u001a\u0006\b\u008c\u0001\u0010\u008a\u0001\"\u001f\u0010\u008d\u0001\u001a\u00020&8\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u008d\u0001\u0010\u0088\u0001\u001a\u0006\b\u008e\u0001\u0010\u008a\u0001\" \u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0018\u0010\u0094\u0001\u001a\u00030\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0091\u0001\"\u0018\u0010\u0095\u0001\u001a\u00030\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0091\u0001\"\u0017\u0010\u0096\u0001\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0088\u0001\"\u0017\u0010\u0097\u0001\u001a\u00020Y8\u0002X\u0082T¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0017\u0010\u0099\u0001\u001a\u00020Y8\u0002X\u0082T¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u0098\u0001\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u009a\u0001²\u0006\u000e\u0010u\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/material3/DatePickerState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", com.alipay.sdk.m.x.d.f3030v, "headline", "", "showModeToggle", "Landroidx/compose/material3/DatePickerColors;", "colors", "DatePicker", "(Landroidx/compose/material3/DatePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DatePickerFormatter;Lv3/p;Lv3/p;ZLandroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V", "", "initialSelectedDateMillis", "initialDisplayedMonthMillis", "Lkotlin/ranges/l;", "yearRange", "Landroidx/compose/material3/DisplayMode;", "initialDisplayMode", "Landroidx/compose/material3/SelectableDates;", "selectableDates", "rememberDatePickerState-EU0dCGE", "(Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/l;ILandroidx/compose/material3/SelectableDates;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DatePickerState;", "rememberDatePickerState", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "DatePickerState-sHin3Bw", "(Ljava/util/Locale;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/l;ILandroidx/compose/material3/SelectableDates;)Landroidx/compose/material3/DatePickerState;", "DatePickerState", "modeToggleButton", "Landroidx/compose/ui/text/TextStyle;", "headlineTextStyle", "Landroidx/compose/ui/unit/Dp;", "headerMinHeight", "content", "DateEntryContainer-au3_HiA", "(Landroidx/compose/ui/Modifier;Lv3/p;Lv3/p;Lv3/p;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/ui/text/TextStyle;FLv3/p;Landroidx/compose/runtime/Composer;I)V", "DateEntryContainer", "displayMode", "Lkotlin/Function1;", "onDisplayModeChange", "DisplayModeToggleButton-tER2X8s", "(Landroidx/compose/ui/Modifier;ILv3/l;Landroidx/compose/runtime/Composer;I)V", "DisplayModeToggleButton", "selectedDateMillis", "displayedMonthMillis", "Lkotlin/v0;", "name", "dateInMillis", "onDateSelectionChange", "monthInMillis", "onDisplayedMonthChange", "Landroidx/compose/material3/CalendarModel;", "calendarModel", "SwitchableDateEntryContent-d7iavvg", "(Ljava/lang/Long;JILv3/l;Lv3/l;Landroidx/compose/material3/CalendarModel;Lkotlin/ranges/l;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "SwitchableDateEntryContent", "DatePickerContent", "(Ljava/lang/Long;JLv3/l;Lv3/l;Landroidx/compose/material3/CalendarModel;Lkotlin/ranges/l;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/graphics/Color;", "titleContentColor", "headlineContentColor", "minHeight", "DatePickerHeader-pc5RIQQ", "(Landroidx/compose/ui/Modifier;Lv3/p;JJFLv3/p;Landroidx/compose/runtime/Composer;I)V", "DatePickerHeader", "Landroidx/compose/foundation/lazy/LazyListState;", "lazyListState", "HorizontalMonthsList", "(Landroidx/compose/foundation/lazy/LazyListState;Ljava/lang/Long;Lv3/l;Lv3/l;Landroidx/compose/material3/CalendarModel;Lkotlin/ranges/l;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "updateDisplayedMonth", "(Landroidx/compose/foundation/lazy/LazyListState;Lv3/l;Landroidx/compose/material3/CalendarModel;Lkotlin/ranges/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "WeekDays", "(Landroidx/compose/material3/DatePickerColors;Landroidx/compose/material3/CalendarModel;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/material3/CalendarMonth;", "month", "todayMillis", "startDateMillis", "endDateMillis", "Landroidx/compose/material3/SelectedRangeInfo;", "rangeSelectionInfo", "Month", "(Landroidx/compose/material3/CalendarMonth;Lv3/l;JLjava/lang/Long;Ljava/lang/Long;Landroidx/compose/material3/SelectedRangeInfo;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "", "numberOfMonthsInRange", "rangeSelectionEnabled", "isToday", "isStartDate", "isEndDate", "isInRange", "", "dayContentDescription", "(ZZZZZLandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "selected", "onClick", "animateChecked", "enabled", "today", "inRange", DownloadProviderHook.COLUMN_DESCRIPTION, "Day", "(Landroidx/compose/ui/Modifier;ZLv3/a;ZZZZLjava/lang/String;Landroidx/compose/material3/DatePickerColors;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "year", "onYearSelected", "YearPicker", "(Landroidx/compose/ui/Modifier;JLv3/l;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/CalendarModel;Lkotlin/ranges/l;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "currentYear", "Year", "(Landroidx/compose/ui/Modifier;ZZLv3/a;ZLjava/lang/String;Landroidx/compose/material3/DatePickerColors;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "nextAvailable", "previousAvailable", "yearPickerVisible", "yearPickerText", "onNextClicked", "onPreviousClicked", "onYearPickerButtonClicked", "MonthsNavigation", "(Landroidx/compose/ui/Modifier;ZZZLjava/lang/String;Lv3/a;Lv3/a;Lv3/a;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "expanded", "YearPickerMenuButton", "(Lv3/a;ZLandroidx/compose/ui/Modifier;Lv3/p;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "Lkotlinx/coroutines/s0;", "coroutineScope", "scrollUpLabel", "scrollDownLabel", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "customScrollActions", "RecommendedSizeForAccessibility", "F", "getRecommendedSizeForAccessibility", "()F", "MonthYearHeight", "getMonthYearHeight", "DatePickerHorizontalPadding", "getDatePickerHorizontalPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "DatePickerModeTogglePadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getDatePickerModeTogglePadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "DatePickerTitlePadding", "DatePickerHeadlinePadding", "YearsVerticalPadding", "MaxCalendarRows", "I", "YearsInRow", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 11 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 12 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 13 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 14 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 15 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 16 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n+ 17 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2268:1\n1116#2,6:2269\n1116#2,6:2275\n1116#2,6:2281\n1116#2,6:2327\n1116#2,6:2333\n1116#2,6:2342\n1116#2,3:2353\n1119#2,3:2359\n1116#2,6:2399\n1116#2,6:2405\n1116#2,6:2411\n1116#2,6:2542\n1116#2,6:2548\n1116#2,6:2589\n1116#2,6:2640\n1116#2,6:2712\n1116#2,6:2718\n1116#2,6:2724\n1116#2,6:2744\n1116#2,6:2750\n1116#2,6:2756\n74#3,6:2287\n80#3:2321\n84#3:2326\n73#3,7:2363\n80#3:2398\n74#3,6:2453\n80#3:2487\n84#3:2492\n84#3:2502\n75#3,5:2503\n80#3:2536\n84#3:2541\n75#3,5:2647\n80#3:2680\n84#3:2739\n78#4,11:2293\n91#4:2325\n78#4,11:2370\n78#4,11:2424\n78#4,11:2459\n91#4:2491\n91#4:2496\n91#4:2501\n78#4,11:2508\n91#4:2540\n78#4,11:2556\n78#4,11:2600\n91#4:2632\n91#4:2638\n78#4,11:2652\n78#4,11:2683\n91#4:2733\n91#4:2738\n78#4,11:2764\n91#4:2796\n456#5,8:2304\n464#5,3:2318\n467#5,3:2322\n25#5:2352\n456#5,8:2381\n464#5,3:2395\n456#5,8:2435\n464#5,3:2449\n456#5,8:2470\n464#5,3:2484\n467#5,3:2488\n467#5,3:2493\n467#5,3:2498\n456#5,8:2519\n464#5,3:2533\n467#5,3:2537\n456#5,8:2567\n464#5,3:2581\n456#5,8:2611\n464#5,3:2625\n467#5,3:2629\n467#5,3:2635\n456#5,8:2663\n464#5,3:2677\n456#5,8:2694\n464#5,3:2708\n467#5,3:2730\n467#5,3:2735\n456#5,8:2775\n464#5,3:2789\n467#5,3:2793\n3737#6,6:2312\n3737#6,6:2389\n3737#6,6:2443\n3737#6,6:2478\n3737#6,6:2527\n3737#6,6:2575\n3737#6,6:2619\n3737#6,6:2671\n3737#6,6:2702\n3737#6,6:2783\n74#7:2339\n74#7:2798\n1#8:2340\n154#9:2341\n154#9:2802\n154#9:2803\n154#9:2804\n154#9:2805\n154#9:2806\n154#9:2807\n154#9:2808\n487#10,4:2348\n491#10,2:2356\n495#10:2362\n487#11:2358\n67#12,7:2417\n74#12:2452\n78#12:2497\n69#12,5:2595\n74#12:2628\n78#12:2633\n91#13,2:2554\n93#13:2584\n97#13:2639\n91#13,2:2681\n93#13:2711\n97#13:2734\n91#13,2:2762\n93#13:2792\n97#13:2797\n33#14,4:2585\n38#14:2634\n92#15:2646\n111#16:2740\n113#16:2741\n119#16:2742\n83#16:2743\n81#17:2799\n107#17,2:2800\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt\n*L\n155#1:2269,6\n174#1:2275,6\n368#1:2281,6\n1357#1:2327,6\n1364#1:2333,6\n1400#1:2342,6\n1482#1:2353,3\n1482#1:2359,3\n1495#1:2399,6\n1507#1:2405,6\n1519#1:2411,6\n1643#1:2542,6\n1688#1:2548,6\n1748#1:2589,6\n1783#1:2640,6\n1825#1:2712,6\n1850#1:2718,6\n1855#1:2724,6\n1946#1:2744,6\n2087#1:2750,6\n2104#1:2756,6\n1304#1:2287,6\n1304#1:2321\n1304#1:2326\n1485#1:2363,7\n1485#1:2398\n1524#1:2453,6\n1524#1:2487\n1524#1:2492\n1485#1:2502\n1601#1:2503,5\n1601#1:2536\n1601#1:2541\n1793#1:2647,5\n1793#1:2680\n1793#1:2739\n1304#1:2293,11\n1304#1:2325\n1485#1:2370,11\n1523#1:2424,11\n1524#1:2459,11\n1524#1:2491\n1523#1:2496\n1485#1:2501\n1601#1:2508,11\n1601#1:2540\n1736#1:2556,11\n1746#1:2600,11\n1746#1:2632\n1736#1:2638\n1793#1:2652,11\n1800#1:2683,11\n1800#1:2733\n1793#1:2738\n2141#1:2764,11\n2141#1:2796\n1304#1:2304,8\n1304#1:2318,3\n1304#1:2322,3\n1482#1:2352\n1485#1:2381,8\n1485#1:2395,3\n1523#1:2435,8\n1523#1:2449,3\n1524#1:2470,8\n1524#1:2484,3\n1524#1:2488,3\n1523#1:2493,3\n1485#1:2498,3\n1601#1:2519,8\n1601#1:2533,3\n1601#1:2537,3\n1736#1:2567,8\n1736#1:2581,3\n1746#1:2611,8\n1746#1:2625,3\n1746#1:2629,3\n1736#1:2635,3\n1793#1:2663,8\n1793#1:2677,3\n1800#1:2694,8\n1800#1:2708,3\n1800#1:2730,3\n1793#1:2735,3\n2141#1:2775,8\n2141#1:2789,3\n2141#1:2793,3\n1304#1:2312,6\n1485#1:2389,6\n1523#1:2443,6\n1524#1:2478,6\n1601#1:2527,6\n1736#1:2575,6\n1746#1:2619,6\n1793#1:2671,6\n1800#1:2702,6\n2141#1:2783,6\n1393#1:2339\n2199#1:2798\n1393#1:2341\n2255#1:2802\n2256#1:2803\n2257#1:2804\n2258#1:2805\n2260#1:2806\n2262#1:2807\n2264#1:2808\n1482#1:2348,4\n1482#1:2356,2\n1482#1:2362\n1482#1:2358\n1523#1:2417,7\n1523#1:2452\n1523#1:2497\n1746#1:2595,5\n1746#1:2628\n1746#1:2633\n1736#1:2554,2\n1736#1:2584\n1736#1:2639\n1800#1:2681,2\n1800#1:2711\n1800#1:2734\n2141#1:2762,2\n2141#1:2792\n2141#1:2797\n1745#1:2585,4\n1745#1:2634\n1795#1:2646\n1906#1:2740\n1910#1:2741\n1914#1:2742\n1920#1:2743\n1483#1:2799\n1483#1:2800,2\n*E\n"})
/* loaded from: classes.dex */
public final class DatePickerKt {

    @p4.l
    private static final PaddingValues DatePickerHeadlinePadding;
    private static final float DatePickerHorizontalPadding;

    @p4.l
    private static final PaddingValues DatePickerModeTogglePadding;

    @p4.l
    private static final PaddingValues DatePickerTitlePadding;
    private static final int MaxCalendarRows = 6;
    private static final int YearsInRow = 3;
    private static final float YearsVerticalPadding;
    private static final float RecommendedSizeForAccessibility = Dp.m6044constructorimpl(48);
    private static final float MonthYearHeight = Dp.m6044constructorimpl(56);

    static {
        float f5 = 12;
        DatePickerHorizontalPadding = Dp.m6044constructorimpl(f5);
        DatePickerModeTogglePadding = PaddingKt.m550PaddingValuesa9UjIt4$default(0.0f, 0.0f, Dp.m6044constructorimpl(f5), Dp.m6044constructorimpl(f5), 3, null);
        float f6 = 24;
        float f7 = 16;
        DatePickerTitlePadding = PaddingKt.m550PaddingValuesa9UjIt4$default(Dp.m6044constructorimpl(f6), Dp.m6044constructorimpl(f7), Dp.m6044constructorimpl(f5), 0.0f, 8, null);
        DatePickerHeadlinePadding = PaddingKt.m550PaddingValuesa9UjIt4$default(Dp.m6044constructorimpl(f6), 0.0f, Dp.m6044constructorimpl(f5), Dp.m6044constructorimpl(f5), 2, null);
        YearsVerticalPadding = Dp.m6044constructorimpl(f7);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: DateEntryContainer-au3_HiA, reason: not valid java name */
    public static final void m1806DateEntryContainerau3_HiA(@p4.l Modifier modifier, @p4.m v3.p<? super Composer, ? super Integer, r2> pVar, @p4.m v3.p<? super Composer, ? super Integer, r2> pVar2, @p4.m v3.p<? super Composer, ? super Integer, r2> pVar3, @p4.l DatePickerColors datePickerColors, @p4.l TextStyle textStyle, float f5, @p4.l v3.p<? super Composer, ? super Integer, r2> pVar4, @p4.m Composer composer, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(1507356255);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i6 = i14 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i6 |= i13;
        }
        if ((i5 & 384) == 0) {
            if (startRestartGroup.changedInstance(pVar2)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i6 |= i12;
        }
        if ((i5 & 3072) == 0) {
            if (startRestartGroup.changedInstance(pVar3)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i6 |= i11;
        }
        if ((i5 & 24576) == 0) {
            if (startRestartGroup.changed(datePickerColors)) {
                i10 = 16384;
            } else {
                i10 = 8192;
            }
            i6 |= i10;
        }
        if ((196608 & i5) == 0) {
            if (startRestartGroup.changed(textStyle)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i6 |= i9;
        }
        if ((1572864 & i5) == 0) {
            if (startRestartGroup.changed(f5)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i6 |= i8;
        }
        if ((12582912 & i5) == 0) {
            if (startRestartGroup.changedInstance(pVar4)) {
                i7 = 8388608;
            } else {
                i7 = 4194304;
            }
            i6 |= i7;
        }
        if ((4793491 & i6) == 4793490 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1507356255, i6, -1, "androidx.compose.material3.DateEntryContainer (DatePicker.kt:1302)");
            }
            Modifier semantics$default = SemanticsModifierKt.semantics$default(SizeKt.m606sizeInqDBjuR0$default(modifier, DatePickerModalTokens.INSTANCE.m2767getContainerWidthD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), false, DatePickerKt$DateEntryContainer$1.INSTANCE, 1, null);
            startRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(semantics$default);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3264constructorimpl = Updater.m3264constructorimpl(startRestartGroup);
            Updater.m3271setimpl(m3264constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            m1807DatePickerHeaderpc5RIQQ(Modifier.Companion, pVar, datePickerColors.m1796getTitleContentColor0d7_KjU(), datePickerColors.m1789getHeadlineContentColor0d7_KjU(), f5, ComposableLambdaKt.composableLambda(startRestartGroup, -229007058, true, new DatePickerKt$DateEntryContainer$2$1(pVar2, pVar3, pVar, datePickerColors, textStyle)), startRestartGroup, (i6 & 112) | 196614 | (57344 & (i6 >> 6)));
            pVar4.invoke(startRestartGroup, Integer.valueOf((i6 >> 21) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DatePickerKt$DateEntryContainer$3(modifier, pVar, pVar2, pVar3, datePickerColors, textStyle, f5, pVar4, i5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x009f  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void DatePicker(@p4.l androidx.compose.material3.DatePickerState r24, @p4.m androidx.compose.ui.Modifier r25, @p4.m androidx.compose.material3.DatePickerFormatter r26, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r27, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r28, boolean r29, @p4.m androidx.compose.material3.DatePickerColors r30, @p4.m androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt.DatePicker(androidx.compose.material3.DatePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.DatePickerFormatter, v3.p, v3.p, boolean, androidx.compose.material3.DatePickerColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void DatePickerContent(Long l5, long j5, v3.l<? super Long, r2> lVar, v3.l<? super Long, r2> lVar2, CalendarModel calendarModel, kotlin.ranges.l lVar3, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, Composer composer, int i5) {
        int i6;
        Composer composer2;
        int i7;
        int i8;
        boolean changedInstance;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(-434467002);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(l5)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i6 = i15 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changed(j5)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i6 |= i14;
        }
        if ((i5 & 384) == 0) {
            if (startRestartGroup.changedInstance(lVar)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i6 |= i13;
        }
        if ((i5 & 3072) == 0) {
            if (startRestartGroup.changedInstance(lVar2)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i6 |= i12;
        }
        if ((i5 & 24576) == 0) {
            if (startRestartGroup.changedInstance(calendarModel)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i6 |= i11;
        }
        if ((196608 & i5) == 0) {
            if (startRestartGroup.changedInstance(lVar3)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i6 |= i10;
        }
        if ((1572864 & i5) == 0) {
            if ((2097152 & i5) == 0) {
                changedInstance = startRestartGroup.changed(datePickerFormatter);
            } else {
                changedInstance = startRestartGroup.changedInstance(datePickerFormatter);
            }
            if (changedInstance) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i6 |= i9;
        }
        if ((12582912 & i5) == 0) {
            if (startRestartGroup.changed(selectableDates)) {
                i8 = 8388608;
            } else {
                i8 = 4194304;
            }
            i6 |= i8;
        }
        if ((100663296 & i5) == 0) {
            if (startRestartGroup.changed(datePickerColors)) {
                i7 = 67108864;
            } else {
                i7 = 33554432;
            }
            i6 |= i7;
        }
        int i16 = i6;
        if ((38347923 & i16) == 38347922 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-434467002, i16, -1, "androidx.compose.material3.DatePickerContent (DatePicker.kt:1477)");
            }
            CalendarMonth month = calendarModel.getMonth(j5);
            LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(month.indexIn(lVar3), 0, startRestartGroup, 0, 2);
            startRestartGroup.startReplaceableGroup(773894976);
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.i.INSTANCE, startRestartGroup));
                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            startRestartGroup.endReplaceableGroup();
            s0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) RememberSaveableKt.m3351rememberSaveable(new Object[0], (Saver) null, (String) null, (v3.a) DatePickerKt$DatePickerContent$yearPickerVisible$2.INSTANCE, startRestartGroup, 3072, 6);
            Locale defaultLocale = ActualAndroid_androidKt.defaultLocale(startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-483455358);
            Modifier.Companion companion2 = Modifier.Companion;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion4.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion2);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3264constructorimpl = Updater.m3264constructorimpl(startRestartGroup);
            Updater.m3271setimpl(m3264constructorimpl, columnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f5 = DatePickerHorizontalPadding;
            Modifier m555paddingVpY3zN4$default = PaddingKt.m555paddingVpY3zN4$default(companion2, f5, 0.0f, 2, null);
            boolean canScrollForward = rememberLazyListState.getCanScrollForward();
            boolean canScrollBackward = rememberLazyListState.getCanScrollBackward();
            boolean DatePickerContent$lambda$8 = DatePickerContent$lambda$8(mutableState);
            String formatMonthYear = datePickerFormatter.formatMonthYear(Long.valueOf(j5), defaultLocale);
            if (formatMonthYear == null) {
                formatMonthYear = "-";
            }
            String str = formatMonthYear;
            startRestartGroup.startReplaceableGroup(-269656881);
            boolean changedInstance2 = startRestartGroup.changedInstance(coroutineScope) | startRestartGroup.changed(rememberLazyListState);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new DatePickerKt$DatePickerContent$1$1$1(coroutineScope, rememberLazyListState);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            v3.a aVar = (v3.a) rememberedValue2;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-269656336);
            boolean changedInstance3 = startRestartGroup.changedInstance(coroutineScope) | startRestartGroup.changed(rememberLazyListState);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance3 || rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new DatePickerKt$DatePickerContent$1$2$1(coroutineScope, rememberLazyListState);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            v3.a aVar2 = (v3.a) rememberedValue3;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-269655774);
            boolean changed = startRestartGroup.changed(mutableState);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new DatePickerKt$DatePickerContent$1$3$1(mutableState);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceableGroup();
            int i17 = i16 & 234881024;
            MonthsNavigation(m555paddingVpY3zN4$default, canScrollForward, canScrollBackward, DatePickerContent$lambda$8, str, aVar, aVar2, (v3.a) rememberedValue4, datePickerColors, startRestartGroup, i17 | 6);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            v3.a<ComposeUiNode> constructor2 = companion4.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion2);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3264constructorimpl2 = Updater.m3264constructorimpl(startRestartGroup);
            Updater.m3271setimpl(m3264constructorimpl2, rememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (m3264constructorimpl2.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m3264constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3264constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier m555paddingVpY3zN4$default2 = PaddingKt.m555paddingVpY3zN4$default(companion2, f5, 0.0f, 2, null);
            startRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            v3.a<ComposeUiNode> constructor3 = companion4.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(m555paddingVpY3zN4$default2);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3264constructorimpl3 = Updater.m3264constructorimpl(startRestartGroup);
            Updater.m3271setimpl(m3264constructorimpl3, columnMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
            if (m3264constructorimpl3.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m3264constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m3264constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            modifierMaterializerOf3.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            WeekDays(datePickerColors, calendarModel, startRestartGroup, ((i16 >> 24) & 14) | ((i16 >> 9) & 112));
            HorizontalMonthsList(rememberLazyListState, l5, lVar, lVar2, calendarModel, lVar3, datePickerFormatter, selectableDates, datePickerColors, startRestartGroup, ((i16 << 3) & 112) | (i16 & 896) | (i16 & 7168) | (57344 & i16) | (458752 & i16) | (3670016 & i16) | (i16 & 29360128) | i17);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            AnimatedVisibilityKt.AnimatedVisibility(DatePickerContent$lambda$8(mutableState), ClipKt.clipToBounds(companion2), EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.6f, 1, null)), EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)), (String) null, ComposableLambdaKt.composableLambda(composer2, 1193716082, true, new DatePickerKt$DatePickerContent$1$4$2(j5, mutableState, coroutineScope, rememberLazyListState, lVar3, month, selectableDates, calendarModel, datePickerColors)), composer2, 200112, 16);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DatePickerKt$DatePickerContent$2(l5, j5, lVar, lVar2, calendarModel, lVar3, datePickerFormatter, selectableDates, datePickerColors, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DatePickerContent$lambda$8(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DatePickerContent$lambda$9(MutableState<Boolean> mutableState, boolean z4) {
        mutableState.setValue(Boolean.valueOf(z4));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: DatePickerHeader-pc5RIQQ, reason: not valid java name */
    public static final void m1807DatePickerHeaderpc5RIQQ(@p4.l Modifier modifier, @p4.m v3.p<? super Composer, ? super Integer, r2> pVar, long j5, long j6, float f5, @p4.l v3.p<? super Composer, ? super Integer, r2> pVar2, @p4.m Composer composer, int i5) {
        int i6;
        Modifier modifier2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-996037719);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i6 = i12 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i6 |= i11;
        }
        if ((i5 & 384) == 0) {
            if (startRestartGroup.changed(j5)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i6 |= i10;
        }
        if ((i5 & 3072) == 0) {
            if (startRestartGroup.changed(j6)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i6 |= i9;
        }
        if ((i5 & 24576) == 0) {
            if (startRestartGroup.changed(f5)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i6 |= i8;
        }
        if ((196608 & i5) == 0) {
            if (startRestartGroup.changedInstance(pVar2)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i6 |= i7;
        }
        if ((74899 & i6) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-996037719, i6, -1, "androidx.compose.material3.DatePickerHeader (DatePicker.kt:1592)");
            }
            if (pVar != null) {
                modifier2 = SizeKt.m587defaultMinSizeVpY3zN4$default(Modifier.Companion, 0.0f, f5, 1, null);
            } else {
                modifier2 = Modifier.Companion;
            }
            Modifier then = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null).then(modifier2);
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            startRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceBetween, Alignment.Companion.getStart(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(then);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3264constructorimpl = Updater.m3264constructorimpl(startRestartGroup);
            Updater.m3271setimpl(m3264constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(1127544336);
            if (pVar != null) {
                ProvideContentColorTextStyleKt.m2091ProvideContentColorTextStyle3JVO9M(j5, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), DatePickerModalTokens.INSTANCE.getHeaderSupportingTextFont()), ComposableLambdaKt.composableLambda(startRestartGroup, 1936268514, true, new DatePickerKt$DatePickerHeader$1$1(pVar)), startRestartGroup, ((i6 >> 6) & 14) | 384);
            }
            startRestartGroup.endReplaceableGroup();
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3724boximpl(j6)), pVar2, startRestartGroup, ((i6 >> 12) & 112) | ProvidedValue.$stable | 0);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DatePickerKt$DatePickerHeader$2(modifier, pVar, j5, j6, f5, pVar2, i5));
        }
    }

    @p4.l
    @ExperimentalMaterial3Api
    /* renamed from: DatePickerState-sHin3Bw, reason: not valid java name */
    public static final DatePickerState m1808DatePickerStatesHin3Bw(@p4.l Locale locale, @p4.m Long l5, @p4.m Long l6, @p4.l kotlin.ranges.l lVar, int i5, @p4.l SelectableDates selectableDates) {
        return new DatePickerStateImpl(l5, l6, lVar, i5, selectableDates, locale, null);
    }

    /* renamed from: DatePickerState-sHin3Bw$default, reason: not valid java name */
    public static /* synthetic */ DatePickerState m1809DatePickerStatesHin3Bw$default(Locale locale, Long l5, Long l6, kotlin.ranges.l lVar, int i5, SelectableDates selectableDates, int i6, Object obj) {
        Long l7;
        if ((i6 & 2) != 0) {
            l5 = null;
        }
        if ((i6 & 4) != 0) {
            l7 = l5;
        } else {
            l7 = l6;
        }
        if ((i6 & 8) != 0) {
            lVar = DatePickerDefaults.INSTANCE.getYearRange();
        }
        kotlin.ranges.l lVar2 = lVar;
        if ((i6 & 16) != 0) {
            i5 = DisplayMode.Companion.m1849getPickerjFl4v0();
        }
        int i7 = i5;
        if ((i6 & 32) != 0) {
            selectableDates = DatePickerDefaults.INSTANCE.getAllDates();
        }
        return m1808DatePickerStatesHin3Bw(locale, l5, l7, lVar2, i7, selectableDates);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Day(Modifier modifier, boolean z4, v3.a<r2> aVar, boolean z5, boolean z6, boolean z7, boolean z8, String str, DatePickerColors datePickerColors, v3.p<? super Composer, ? super Integer, r2> pVar, Composer composer, int i5) {
        int i6;
        boolean z9;
        BorderStroke borderStroke;
        Composer composer2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Composer startRestartGroup = composer.startRestartGroup(-1434777861);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i6 = i16 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changed(z4)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i6 |= i15;
        }
        if ((i5 & 384) == 0) {
            if (startRestartGroup.changedInstance(aVar)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i6 |= i14;
        }
        if ((i5 & 3072) == 0) {
            if (startRestartGroup.changed(z5)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i6 |= i13;
        }
        if ((i5 & 24576) == 0) {
            if (startRestartGroup.changed(z6)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i6 |= i12;
        }
        if ((196608 & i5) == 0) {
            if (startRestartGroup.changed(z7)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i6 |= i11;
        }
        if ((1572864 & i5) == 0) {
            if (startRestartGroup.changed(z8)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i6 |= i10;
        }
        if ((12582912 & i5) == 0) {
            if (startRestartGroup.changed(str)) {
                i9 = 8388608;
            } else {
                i9 = 4194304;
            }
            i6 |= i9;
        }
        if ((100663296 & i5) == 0) {
            if (startRestartGroup.changed(datePickerColors)) {
                i8 = 67108864;
            } else {
                i8 = 33554432;
            }
            i6 |= i8;
        }
        if ((805306368 & i5) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i7 = 536870912;
            } else {
                i7 = 268435456;
            }
            i6 |= i7;
        }
        int i17 = i6;
        if ((306783379 & i17) == 306783378 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1434777861, i17, -1, "androidx.compose.material3.Day (DatePicker.kt:1937)");
            }
            startRestartGroup.startReplaceableGroup(1664739143);
            if ((29360128 & i17) == 8388608) {
                z9 = true;
            } else {
                z9 = false;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z9 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new DatePickerKt$Day$1$1(str);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier semantics = SemanticsModifierKt.semantics(modifier, true, (v3.l) rememberedValue);
            DatePickerModalTokens datePickerModalTokens = DatePickerModalTokens.INSTANCE;
            Shape value = ShapesKt.getValue(datePickerModalTokens.getDateContainerShape(), startRestartGroup, 6);
            int i18 = i17 >> 3;
            int i19 = i18 & 14;
            int i20 = i17 >> 15;
            long m3744unboximpl = datePickerColors.dayContainerColor$material3_release(z4, z6, z5, startRestartGroup, (i20 & 7168) | i19 | ((i17 >> 9) & 112) | (i18 & 896)).getValue().m3744unboximpl();
            int i21 = i17 >> 12;
            int i22 = i18 & 7168;
            long m3744unboximpl2 = datePickerColors.dayContentColor$material3_release(z7, z4, z8, z6, startRestartGroup, (i20 & 14) | (i17 & 112) | (i21 & 896) | i22 | (i21 & 57344)).getValue().m3744unboximpl();
            if (z7 && !z4) {
                borderStroke = BorderStrokeKt.m228BorderStrokecXLIe8U(datePickerModalTokens.m2772getDateTodayContainerOutlineWidthD9Ej5fM(), datePickerColors.m1798getTodayDateBorderColor0d7_KjU());
            } else {
                borderStroke = null;
            }
            composer2 = startRestartGroup;
            SurfaceKt.m2305Surfaced85dljk(z4, aVar, semantics, z6, value, m3744unboximpl, m3744unboximpl2, 0.0f, 0.0f, borderStroke, (MutableInteractionSource) null, ComposableLambdaKt.composableLambda(startRestartGroup, -2031780827, true, new DatePickerKt$Day$2(pVar)), composer2, i19 | (i18 & 112) | i22, 48, 1408);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DatePickerKt$Day$3(modifier, z4, aVar, z5, z6, z7, z8, str, datePickerColors, pVar, i5));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: DisplayModeToggleButton-tER2X8s, reason: not valid java name */
    public static final void m1810DisplayModeToggleButtontER2X8s(@p4.l Modifier modifier, int i5, @p4.l v3.l<? super DisplayMode, r2> lVar, @p4.m Composer composer, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(1393846115);
        if ((i6 & 6) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i7 = i10 | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            if (startRestartGroup.changed(i5)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i7 |= i9;
        }
        if ((i6 & 384) == 0) {
            if (startRestartGroup.changedInstance(lVar)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i7 |= i8;
        }
        if ((i7 & 147) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1393846115, i7, -1, "androidx.compose.material3.DisplayModeToggleButton (DatePicker.kt:1354)");
            }
            boolean z4 = true;
            if (DisplayMode.m1844equalsimpl0(i5, DisplayMode.Companion.m1849getPickerjFl4v0())) {
                startRestartGroup.startReplaceableGroup(-1814955688);
                startRestartGroup.startReplaceableGroup(-1814955657);
                if ((i7 & 896) != 256) {
                    z4 = false;
                }
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (z4 || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new DatePickerKt$DisplayModeToggleButton$1$1(lVar);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                IconButtonKt.IconButton((v3.a) rememberedValue, modifier, false, null, null, ComposableSingletons$DatePickerKt.INSTANCE.m1744getLambda1$material3_release(), startRestartGroup, ((i7 << 3) & 112) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
                startRestartGroup.endReplaceableGroup();
            } else {
                startRestartGroup.startReplaceableGroup(-1814955404);
                startRestartGroup.startReplaceableGroup(-1814955373);
                if ((i7 & 896) != 256) {
                    z4 = false;
                }
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z4 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new DatePickerKt$DisplayModeToggleButton$2$1(lVar);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                IconButtonKt.IconButton((v3.a) rememberedValue2, modifier, false, null, null, ComposableSingletons$DatePickerKt.INSTANCE.m1745getLambda2$material3_release(), startRestartGroup, ((i7 << 3) & 112) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
                startRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DatePickerKt$DisplayModeToggleButton$3(modifier, i5, lVar, i6));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void HorizontalMonthsList(LazyListState lazyListState, Long l5, v3.l<? super Long, r2> lVar, v3.l<? super Long, r2> lVar2, CalendarModel calendarModel, kotlin.ranges.l lVar3, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, Composer composer, int i5) {
        int i6;
        Composer composer2;
        boolean z4;
        int i7;
        int i8;
        boolean changedInstance;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(-1994757941);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(lazyListState)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i6 = i15 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changed(l5)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i6 |= i14;
        }
        if ((i5 & 384) == 0) {
            if (startRestartGroup.changedInstance(lVar)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i6 |= i13;
        }
        if ((i5 & 3072) == 0) {
            if (startRestartGroup.changedInstance(lVar2)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i6 |= i12;
        }
        if ((i5 & 24576) == 0) {
            if (startRestartGroup.changedInstance(calendarModel)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i6 |= i11;
        }
        if ((196608 & i5) == 0) {
            if (startRestartGroup.changedInstance(lVar3)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i6 |= i10;
        }
        if ((1572864 & i5) == 0) {
            if ((2097152 & i5) == 0) {
                changedInstance = startRestartGroup.changed(datePickerFormatter);
            } else {
                changedInstance = startRestartGroup.changedInstance(datePickerFormatter);
            }
            if (changedInstance) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i6 |= i9;
        }
        if ((12582912 & i5) == 0) {
            if (startRestartGroup.changed(selectableDates)) {
                i8 = 8388608;
            } else {
                i8 = 4194304;
            }
            i6 |= i8;
        }
        if ((100663296 & i5) == 0) {
            if (startRestartGroup.changed(datePickerColors)) {
                i7 = 67108864;
            } else {
                i7 = 33554432;
            }
            i6 |= i7;
        }
        int i16 = i6;
        if ((38347923 & i16) == 38347922 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1994757941, i16, -1, "androidx.compose.material3.HorizontalMonthsList (DatePicker.kt:1640)");
            }
            CalendarDate today = calendarModel.getToday();
            startRestartGroup.startReplaceableGroup(1346192500);
            boolean changed = startRestartGroup.changed(lVar3);
            Object rememberedValue = startRestartGroup.rememberedValue();
            boolean z5 = true;
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = calendarModel.getMonth(lVar3.e(), 1);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            TextKt.ProvideTextStyle(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), DatePickerModalTokens.INSTANCE.getDateLabelTextFont()), ComposableLambdaKt.composableLambda(composer2, 1504086906, true, new DatePickerKt$HorizontalMonthsList$1(lazyListState, lVar3, calendarModel, (CalendarMonth) rememberedValue, lVar, today, l5, datePickerFormatter, selectableDates, datePickerColors)), composer2, 48);
            composer2.startReplaceableGroup(1346194369);
            int i17 = i16 & 14;
            if (i17 == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((i16 & 7168) != 2048) {
                z5 = false;
            }
            boolean changedInstance2 = z4 | z5 | composer2.changedInstance(calendarModel) | composer2.changedInstance(lVar3);
            Object rememberedValue2 = composer2.rememberedValue();
            if (changedInstance2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                DatePickerKt$HorizontalMonthsList$2$1 datePickerKt$HorizontalMonthsList$2$1 = new DatePickerKt$HorizontalMonthsList$2$1(lazyListState, lVar2, calendarModel, lVar3, null);
                composer2.updateRememberedValue(datePickerKt$HorizontalMonthsList$2$1);
                rememberedValue2 = datePickerKt$HorizontalMonthsList$2$1;
            }
            composer2.endReplaceableGroup();
            EffectsKt.LaunchedEffect(lazyListState, (v3.p<? super s0, ? super kotlin.coroutines.d<? super r2>, ? extends Object>) rememberedValue2, composer2, i17);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DatePickerKt$HorizontalMonthsList$3(lazyListState, l5, lVar, lVar2, calendarModel, lVar3, datePickerFormatter, selectableDates, datePickerColors, i5));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Month(@p4.l CalendarMonth calendarMonth, @p4.l v3.l<? super Long, r2> lVar, long j5, @p4.m Long l5, @p4.m Long l6, @p4.m SelectedRangeInfo selectedRangeInfo, @p4.l DatePickerFormatter datePickerFormatter, @p4.l SelectableDates selectableDates, @p4.l DatePickerColors datePickerColors, @p4.m Composer composer, int i5) {
        int i6;
        Modifier modifier;
        Composer composer2;
        int i7;
        int i8;
        int i9;
        int i10;
        Composer composer3;
        Locale locale;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        char c5;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        boolean z13;
        long j6;
        boolean z14;
        Object mutableStateOf$default;
        long j7;
        boolean z15;
        boolean z16;
        int i11;
        int i12;
        boolean changedInstance;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        v3.l<? super Long, r2> lVar2 = lVar;
        long j8 = j5;
        Object obj = l5;
        Object obj2 = l6;
        Composer startRestartGroup = composer.startRestartGroup(-1912870997);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(calendarMonth)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i6 = i19 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changedInstance(lVar2)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i6 |= i18;
        }
        if ((i5 & 384) == 0) {
            if (startRestartGroup.changed(j8)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i6 |= i17;
        }
        if ((i5 & 3072) == 0) {
            if (startRestartGroup.changed(obj)) {
                i16 = 2048;
            } else {
                i16 = 1024;
            }
            i6 |= i16;
        }
        if ((i5 & 24576) == 0) {
            if (startRestartGroup.changed(obj2)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i6 |= i15;
        }
        if ((196608 & i5) == 0) {
            if (startRestartGroup.changed(selectedRangeInfo)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i6 |= i14;
        }
        if ((1572864 & i5) == 0) {
            if ((2097152 & i5) == 0) {
                changedInstance = startRestartGroup.changed(datePickerFormatter);
            } else {
                changedInstance = startRestartGroup.changedInstance(datePickerFormatter);
            }
            if (changedInstance) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i6 |= i13;
        }
        if ((12582912 & i5) == 0) {
            if (startRestartGroup.changed(selectableDates)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i6 |= i12;
        }
        if ((100663296 & i5) == 0) {
            if (startRestartGroup.changed(datePickerColors)) {
                i11 = 67108864;
            } else {
                i11 = 33554432;
            }
            i6 |= i11;
        }
        int i20 = i6;
        if ((38347923 & i20) == 38347922 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1912870997, i20, -1, "androidx.compose.material3.Month (DatePicker.kt:1780)");
            }
            startRestartGroup.startReplaceableGroup(-2019459922);
            if (selectedRangeInfo != null) {
                Modifier.Companion companion = Modifier.Companion;
                startRestartGroup.startReplaceableGroup(-2019459855);
                if ((i20 & 458752) == 131072) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if ((i20 & 234881024) == 67108864) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z17 = z16 | z15;
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (z17 || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new DatePickerKt$Month$rangeSelectionDrawModifier$1$1(selectedRangeInfo, datePickerColors);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                modifier = DrawModifierKt.drawWithContent(companion, (v3.l) rememberedValue);
            } else {
                modifier = Modifier.Companion;
            }
            startRestartGroup.endReplaceableGroup();
            Locale defaultLocale = ActualAndroid_androidKt.defaultLocale(startRestartGroup, 0);
            Modifier then = SizeKt.m591requiredHeight3ABfNKs(Modifier.Companion, Dp.m6044constructorimpl(RecommendedSizeForAccessibility * 6)).then(modifier);
            Arrangement.HorizontalOrVertical spaceEvenly = Arrangement.INSTANCE.getSpaceEvenly();
            startRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceEvenly, Alignment.Companion.getStart(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion2.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(then);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3264constructorimpl = Updater.m3264constructorimpl(startRestartGroup);
            Updater.m3271setimpl(m3264constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-2019459388);
            int i21 = 0;
            int i22 = 0;
            int i23 = 6;
            while (i21 < i23) {
                int i24 = i22;
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical spaceEvenly2 = Arrangement.INSTANCE.getSpaceEvenly();
                Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                startRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceEvenly2, centerVertically, startRestartGroup, 54);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                v3.a<ComposeUiNode> constructor2 = companion3.getConstructor();
                v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
                Locale locale2 = defaultLocale;
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m3264constructorimpl2 = Updater.m3264constructorimpl(startRestartGroup);
                Updater.m3271setimpl(m3264constructorimpl2, rowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m3271setimpl(m3264constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (m3264constructorimpl2.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m3264constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m3264constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                boolean z18 = false;
                modifierMaterializerOf2.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(-713628297);
                int i25 = 0;
                int i26 = i24;
                while (i25 < 7) {
                    if (i26 >= calendarMonth.getDaysFromStartOfWeekToFirstOfMonth() && i26 < calendarMonth.getDaysFromStartOfWeekToFirstOfMonth() + calendarMonth.getNumberOfDays()) {
                        startRestartGroup.startReplaceableGroup(-1111235573);
                        int daysFromStartOfWeekToFirstOfMonth = i26 - calendarMonth.getDaysFromStartOfWeekToFirstOfMonth();
                        i7 = i21;
                        long startUtcTimeMillis = calendarMonth.getStartUtcTimeMillis() + (daysFromStartOfWeekToFirstOfMonth * 86400000);
                        if (startUtcTimeMillis == j8) {
                            z5 = true;
                        } else {
                            z5 = z18;
                        }
                        if (obj != null && startUtcTimeMillis == l5.longValue()) {
                            z6 = true;
                        } else {
                            z6 = z18;
                        }
                        if (obj2 != null && startUtcTimeMillis == l6.longValue()) {
                            z7 = true;
                        } else {
                            z7 = z18;
                        }
                        startRestartGroup.startReplaceableGroup(-1111235085);
                        if (selectedRangeInfo != null) {
                            startRestartGroup.startReplaceableGroup(-1111235023);
                            if ((i20 & 458752) == 131072) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            boolean changed = z13 | startRestartGroup.changed(startUtcTimeMillis);
                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!changed && rememberedValue2 != Composer.Companion.getEmpty()) {
                                mutableStateOf$default = rememberedValue2;
                                c5 = 2;
                            } else {
                                if (obj != null) {
                                    j6 = l5.longValue();
                                } else {
                                    j6 = Long.MAX_VALUE;
                                }
                                if (startUtcTimeMillis >= j6) {
                                    if (obj2 != null) {
                                        j7 = l6.longValue();
                                    } else {
                                        j7 = Long.MIN_VALUE;
                                    }
                                    if (startUtcTimeMillis <= j7) {
                                        z14 = true;
                                        c5 = 2;
                                        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z14), null, 2, null);
                                        startRestartGroup.updateRememberedValue(mutableStateOf$default);
                                    }
                                }
                                z14 = false;
                                c5 = 2;
                                mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z14), null, 2, null);
                                startRestartGroup.updateRememberedValue(mutableStateOf$default);
                            }
                            startRestartGroup.endReplaceableGroup();
                            z8 = ((Boolean) ((MutableState) mutableStateOf$default).getValue()).booleanValue();
                        } else {
                            c5 = 2;
                            z8 = false;
                        }
                        startRestartGroup.endReplaceableGroup();
                        if (selectedRangeInfo != null) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        boolean z19 = z9;
                        i8 = i20;
                        i9 = i26;
                        i10 = i25;
                        Locale locale3 = locale2;
                        z4 = false;
                        Composer composer4 = startRestartGroup;
                        String dayContentDescription = dayContentDescription(z19, z5, z6, z7, z8, composer4, 0);
                        String formatDate = datePickerFormatter.formatDate(Long.valueOf(startUtcTimeMillis), locale3, true);
                        if (formatDate == null) {
                            formatDate = "";
                        }
                        Modifier.Companion companion4 = Modifier.Companion;
                        if (!z6 && !z7) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        composer3 = composer4;
                        composer3.startReplaceableGroup(-1111233694);
                        if ((i8 & 112) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        boolean changed2 = z11 | composer3.changed(startUtcTimeMillis);
                        Object rememberedValue3 = composer3.rememberedValue();
                        if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                            rememberedValue3 = new DatePickerKt$Month$1$1$1$1(lVar2, startUtcTimeMillis);
                            composer3.updateRememberedValue(rememberedValue3);
                        }
                        v3.a aVar = (v3.a) rememberedValue3;
                        composer3.endReplaceableGroup();
                        composer3.startReplaceableGroup(-1111233319);
                        boolean changed3 = composer3.changed(startUtcTimeMillis);
                        Object rememberedValue4 = composer3.rememberedValue();
                        if (changed3 || rememberedValue4 == Composer.Companion.getEmpty()) {
                            if (selectableDates.isSelectableYear(calendarMonth.getYear()) && selectableDates.isSelectableDate(startUtcTimeMillis)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            rememberedValue4 = Boolean.valueOf(z12);
                            composer3.updateRememberedValue(rememberedValue4);
                        }
                        boolean booleanValue = ((Boolean) rememberedValue4).booleanValue();
                        composer3.endReplaceableGroup();
                        if (dayContentDescription != null) {
                            str = dayContentDescription + ", " + formatDate;
                        } else {
                            str = formatDate;
                        }
                        locale = locale3;
                        Day(companion4, z10, aVar, z6, booleanValue, z5, z8, str, datePickerColors, ComposableLambdaKt.composableLambda(composer3, -2095706591, true, new DatePickerKt$Month$1$1$3(daysFromStartOfWeekToFirstOfMonth)), composer3, 805306374 | (i8 & 234881024));
                        composer3.endReplaceableGroup();
                    } else {
                        i7 = i21;
                        i8 = i20;
                        i9 = i26;
                        i10 = i25;
                        composer3 = startRestartGroup;
                        locale = locale2;
                        z4 = z18;
                        composer3.startReplaceableGroup(-1111235936);
                        Modifier.Companion companion5 = Modifier.Companion;
                        float f5 = RecommendedSizeForAccessibility;
                        SpacerKt.Spacer(SizeKt.m596requiredSizeVpY3zN4(companion5, f5, f5), composer3, 6);
                        composer3.endReplaceableGroup();
                    }
                    i26 = i9 + 1;
                    i25 = i10 + 1;
                    lVar2 = lVar;
                    obj2 = l6;
                    startRestartGroup = composer3;
                    i21 = i7;
                    i20 = i8;
                    z18 = z4;
                    obj = l5;
                    locale2 = locale;
                    j8 = j5;
                }
                Composer composer5 = startRestartGroup;
                composer5.endReplaceableGroup();
                composer5.endReplaceableGroup();
                composer5.endNode();
                composer5.endReplaceableGroup();
                composer5.endReplaceableGroup();
                lVar2 = lVar;
                obj2 = l6;
                i23 = 6;
                defaultLocale = locale2;
                i22 = i26;
                j8 = j5;
                obj = l5;
                i21++;
            }
            composer2 = startRestartGroup;
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DatePickerKt$Month$2(calendarMonth, lVar, j5, l5, l6, selectedRangeInfo, datePickerFormatter, selectableDates, datePickerColors, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void MonthsNavigation(Modifier modifier, boolean z4, boolean z5, boolean z6, String str, v3.a<r2> aVar, v3.a<r2> aVar2, v3.a<r2> aVar3, DatePickerColors datePickerColors, Composer composer, int i5) {
        int i6;
        Arrangement.Horizontal spaceBetween;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(-773929258);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i6 = i15 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changed(z4)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i6 |= i14;
        }
        if ((i5 & 384) == 0) {
            if (startRestartGroup.changed(z5)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i6 |= i13;
        }
        if ((i5 & 3072) == 0) {
            if (startRestartGroup.changed(z6)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i6 |= i12;
        }
        if ((i5 & 24576) == 0) {
            if (startRestartGroup.changed(str)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i6 |= i11;
        }
        if ((196608 & i5) == 0) {
            if (startRestartGroup.changedInstance(aVar)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i6 |= i10;
        }
        if ((1572864 & i5) == 0) {
            if (startRestartGroup.changedInstance(aVar2)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i6 |= i9;
        }
        if ((12582912 & i5) == 0) {
            if (startRestartGroup.changedInstance(aVar3)) {
                i8 = 8388608;
            } else {
                i8 = 4194304;
            }
            i6 |= i8;
        }
        if ((100663296 & i5) == 0) {
            if (startRestartGroup.changed(datePickerColors)) {
                i7 = 67108864;
            } else {
                i7 = 33554432;
            }
            i6 |= i7;
        }
        if ((38347923 & i6) == 38347922 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-773929258, i6, -1, "androidx.compose.material3.MonthsNavigation (DatePicker.kt:2139)");
            }
            Modifier m591requiredHeight3ABfNKs = SizeKt.m591requiredHeight3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), MonthYearHeight);
            if (z6) {
                spaceBetween = Arrangement.INSTANCE.getStart();
            } else {
                spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            }
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m591requiredHeight3ABfNKs);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3264constructorimpl = Updater.m3264constructorimpl(startRestartGroup);
            Updater.m3271setimpl(m3264constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3724boximpl(datePickerColors.m1790getNavigationContentColor0d7_KjU())), ComposableLambdaKt.composableLambda(startRestartGroup, -962805198, true, new DatePickerKt$MonthsNavigation$1$1(aVar3, z6, str, aVar2, z5, aVar, z4)), startRestartGroup, ProvidedValue.$stable | 0 | 48);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DatePickerKt$MonthsNavigation$2(modifier, z4, z5, z6, str, aVar, aVar2, aVar3, datePickerColors, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: SwitchableDateEntryContent-d7iavvg, reason: not valid java name */
    public static final void m1811SwitchableDateEntryContentd7iavvg(Long l5, long j5, int i5, v3.l<? super Long, r2> lVar, v3.l<? super Long, r2> lVar2, CalendarModel calendarModel, kotlin.ranges.l lVar3, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, Composer composer, int i6) {
        int i7;
        int i8;
        int i9;
        boolean changedInstance;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Composer startRestartGroup = composer.startRestartGroup(-895379221);
        if ((i6 & 6) == 0) {
            if (startRestartGroup.changed(l5)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i7 = i17 | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            if (startRestartGroup.changed(j5)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i7 |= i16;
        }
        if ((i6 & 384) == 0) {
            if (startRestartGroup.changed(i5)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i7 |= i15;
        }
        if ((i6 & 3072) == 0) {
            if (startRestartGroup.changedInstance(lVar)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i7 |= i14;
        }
        if ((i6 & 24576) == 0) {
            if (startRestartGroup.changedInstance(lVar2)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i7 |= i13;
        }
        if ((196608 & i6) == 0) {
            if (startRestartGroup.changedInstance(calendarModel)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i7 |= i12;
        }
        if ((1572864 & i6) == 0) {
            if (startRestartGroup.changedInstance(lVar3)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i7 |= i11;
        }
        if ((12582912 & i6) == 0) {
            if ((16777216 & i6) == 0) {
                changedInstance = startRestartGroup.changed(datePickerFormatter);
            } else {
                changedInstance = startRestartGroup.changedInstance(datePickerFormatter);
            }
            if (changedInstance) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i7 |= i10;
        }
        if ((100663296 & i6) == 0) {
            if (startRestartGroup.changed(selectableDates)) {
                i9 = 67108864;
            } else {
                i9 = 33554432;
            }
            i7 |= i9;
        }
        if ((805306368 & i6) == 0) {
            if (startRestartGroup.changed(datePickerColors)) {
                i8 = 536870912;
            } else {
                i8 = 268435456;
            }
            i7 |= i8;
        }
        int i18 = i7;
        if ((306783379 & i18) == 306783378 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-895379221, i18, -1, "androidx.compose.material3.SwitchableDateEntryContent (DatePicker.kt:1389)");
            }
            int i19 = -((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo298roundToPx0680j_4(Dp.m6044constructorimpl(48));
            DisplayMode m1841boximpl = DisplayMode.m1841boximpl(i5);
            Modifier semantics$default = SemanticsModifierKt.semantics$default(Modifier.Companion, false, DatePickerKt$SwitchableDateEntryContent$1.INSTANCE, 1, null);
            startRestartGroup.startReplaceableGroup(1777156755);
            boolean changed = startRestartGroup.changed(i19);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new DatePickerKt$SwitchableDateEntryContent$2$1(i19);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            AnimatedContentKt.AnimatedContent(m1841boximpl, semantics$default, (v3.l) rememberedValue, null, "DatePickerDisplayModeAnimation", null, ComposableLambdaKt.composableLambda(startRestartGroup, -459778869, true, new DatePickerKt$SwitchableDateEntryContent$3(l5, j5, lVar, lVar2, calendarModel, lVar3, datePickerFormatter, selectableDates, datePickerColors)), startRestartGroup, ((i18 >> 6) & 14) | 1597440, 40);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DatePickerKt$SwitchableDateEntryContent$4(l5, j5, i5, lVar, lVar2, calendarModel, lVar3, datePickerFormatter, selectableDates, datePickerColors, i6));
        }
    }

    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v7 */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void WeekDays(@p4.l DatePickerColors datePickerColors, @p4.l CalendarModel calendarModel, @p4.m Composer composer, int i5) {
        int i6;
        Composer composer2;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(-1849465391);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(datePickerColors)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i6 = i8 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changedInstance(calendarModel)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i6 |= i7;
        }
        if ((i6 & 19) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1849465391, i6, -1, "androidx.compose.material3.WeekDays (DatePicker.kt:1721)");
            }
            int firstDayOfWeek = calendarModel.getFirstDayOfWeek();
            List<u0<String, String>> weekdayNames = calendarModel.getWeekdayNames();
            ArrayList arrayList = new ArrayList();
            int i9 = firstDayOfWeek - 1;
            int size = weekdayNames.size();
            for (int i10 = i9; i10 < size; i10++) {
                arrayList.add(weekdayNames.get(i10));
            }
            ?? r14 = 0;
            for (int i11 = 0; i11 < i9; i11++) {
                arrayList.add(weekdayNames.get(i11));
            }
            int i12 = 6;
            TextStyle fromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), DatePickerModalTokens.INSTANCE.getWeekdaysLabelTextFont());
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m587defaultMinSizeVpY3zN4$default(Modifier.Companion, 0.0f, RecommendedSizeForAccessibility, 1, null), 0.0f, 1, null);
            Arrangement.HorizontalOrVertical spaceEvenly = Arrangement.INSTANCE.getSpaceEvenly();
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceEvenly, centerVertically, startRestartGroup, 54);
            int i13 = -1323940314;
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3264constructorimpl = Updater.m3264constructorimpl(startRestartGroup);
            Updater.m3271setimpl(m3264constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-971954356);
            int size2 = arrayList.size();
            int i14 = 0;
            while (i14 < size2) {
                u0 u0Var = (u0) arrayList.get(i14);
                Modifier.Companion companion2 = Modifier.Companion;
                startRestartGroup.startReplaceableGroup(784223355);
                boolean changed = startRestartGroup.changed(u0Var);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new DatePickerKt$WeekDays$1$1$1$1(u0Var);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(companion2, (v3.l) rememberedValue);
                float f5 = RecommendedSizeForAccessibility;
                Modifier m604sizeVpY3zN4 = SizeKt.m604sizeVpY3zN4(clearAndSetSemantics, f5, f5);
                Alignment center = Alignment.Companion.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, r14, startRestartGroup, i12);
                startRestartGroup.startReplaceableGroup(i13);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, r14);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                v3.a<ComposeUiNode> constructor2 = companion3.getConstructor();
                v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m604sizeVpY3zN4);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m3264constructorimpl2 = Updater.m3264constructorimpl(startRestartGroup);
                Updater.m3271setimpl(m3264constructorimpl2, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m3271setimpl(m3264constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (m3264constructorimpl2.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m3264constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m3264constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                modifierMaterializerOf2.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Composer composer3 = startRestartGroup;
                TextKt.m2452Text4IGK_g((String) u0Var.getSecond(), SizeKt.wrapContentSize$default(companion2, null, false, 3, null), datePickerColors.m1799getWeekdayContentColor0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5929boximpl(TextAlign.Companion.m5936getCentere0LSkKk()), 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, fromToken, composer3, 48, 0, 65016);
                composer3.endReplaceableGroup();
                composer3.endNode();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                i14++;
                size2 = size2;
                i13 = -1323940314;
                i12 = 6;
                arrayList = arrayList;
                r14 = 0;
                startRestartGroup = composer3;
            }
            composer2 = startRestartGroup;
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DatePickerKt$WeekDays$2(datePickerColors, calendarModel, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Year(Modifier modifier, boolean z4, boolean z5, v3.a<r2> aVar, boolean z6, String str, DatePickerColors datePickerColors, v3.p<? super Composer, ? super Integer, r2> pVar, Composer composer, int i5) {
        int i6;
        boolean z7;
        boolean z8;
        Object obj;
        boolean z9;
        Composer composer2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(238547184);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i6 = i14 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changed(z4)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i6 |= i13;
        }
        if ((i5 & 384) == 0) {
            if (startRestartGroup.changed(z5)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i6 |= i12;
        }
        if ((i5 & 3072) == 0) {
            if (startRestartGroup.changedInstance(aVar)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i6 |= i11;
        }
        if ((i5 & 24576) == 0) {
            if (startRestartGroup.changed(z6)) {
                i10 = 16384;
            } else {
                i10 = 8192;
            }
            i6 |= i10;
        }
        if ((196608 & i5) == 0) {
            if (startRestartGroup.changed(str)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i6 |= i9;
        }
        if ((1572864 & i5) == 0) {
            if (startRestartGroup.changed(datePickerColors)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i6 |= i8;
        }
        if ((12582912 & i5) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i7 = 8388608;
            } else {
                i7 = 4194304;
            }
            i6 |= i7;
        }
        if ((4793491 & i6) == 4793490 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(238547184, i6, -1, "androidx.compose.material3.Year (DatePicker.kt:2085)");
            }
            startRestartGroup.startReplaceableGroup(84263149);
            if ((i6 & 896) == 256) {
                z7 = true;
            } else {
                z7 = false;
            }
            int i15 = i6 & 112;
            if (i15 == 32) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z10 = z7 | z8;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (!z10 && rememberedValue != Composer.Companion.getEmpty()) {
                obj = rememberedValue;
            } else {
                if (z5 && !z4) {
                    obj = BorderStrokeKt.m228BorderStrokecXLIe8U(DatePickerModalTokens.INSTANCE.m2772getDateTodayContainerOutlineWidthD9Ej5fM(), datePickerColors.m1798getTodayDateBorderColor0d7_KjU());
                } else {
                    obj = null;
                }
                startRestartGroup.updateRememberedValue(obj);
            }
            BorderStroke borderStroke = (BorderStroke) obj;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(84263865);
            if ((458752 & i6) == 131072) {
                z9 = true;
            } else {
                z9 = false;
            }
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z9 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new DatePickerKt$Year$1$1(str);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier semantics = SemanticsModifierKt.semantics(modifier, true, (v3.l) rememberedValue2);
            Shape value = ShapesKt.getValue(DatePickerModalTokens.INSTANCE.getSelectionYearStateLayerShape(), startRestartGroup, 6);
            int i16 = i6 >> 3;
            int i17 = i16 & 14;
            int i18 = i6 >> 9;
            long m3744unboximpl = datePickerColors.yearContainerColor$material3_release(z4, z6, startRestartGroup, i17 | (i18 & 112) | ((i6 >> 12) & 896)).getValue().m3744unboximpl();
            int i19 = i6 >> 6;
            long m3744unboximpl2 = datePickerColors.yearContentColor$material3_release(z5, z4, z6, startRestartGroup, (i19 & 14) | i15 | (i19 & 896) | (i18 & 7168)).getValue().m3744unboximpl();
            composer2 = startRestartGroup;
            SurfaceKt.m2305Surfaced85dljk(z4, aVar, semantics, z6, value, m3744unboximpl, m3744unboximpl2, 0.0f, 0.0f, borderStroke, (MutableInteractionSource) null, ComposableLambdaKt.composableLambda(composer2, -1573188346, true, new DatePickerKt$Year$2(pVar)), composer2, i17 | (i19 & 112) | (i16 & 7168), 48, 1408);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DatePickerKt$Year$3(modifier, z4, z5, aVar, z6, str, datePickerColors, pVar, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void YearPicker(Modifier modifier, long j5, v3.l<? super Integer, r2> lVar, SelectableDates selectableDates, CalendarModel calendarModel, kotlin.ranges.l lVar2, DatePickerColors datePickerColors, Composer composer, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(-1286899812);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i6 = i13 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changed(j5)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i6 |= i12;
        }
        if ((i5 & 384) == 0) {
            if (startRestartGroup.changedInstance(lVar)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i6 |= i11;
        }
        if ((i5 & 3072) == 0) {
            if (startRestartGroup.changed(selectableDates)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i6 |= i10;
        }
        if ((i5 & 24576) == 0) {
            if (startRestartGroup.changedInstance(calendarModel)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i6 |= i9;
        }
        if ((196608 & i5) == 0) {
            if (startRestartGroup.changedInstance(lVar2)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i6 |= i8;
        }
        if ((1572864 & i5) == 0) {
            if (startRestartGroup.changed(datePickerColors)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i6 |= i7;
        }
        if ((599187 & i6) == 599186 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1286899812, i6, -1, "androidx.compose.material3.YearPicker (DatePicker.kt:1993)");
            }
            TextKt.ProvideTextStyle(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), DatePickerModalTokens.INSTANCE.getSelectionYearLabelTextFont()), ComposableLambdaKt.composableLambda(startRestartGroup, 1301915789, true, new DatePickerKt$YearPicker$1(calendarModel, j5, lVar2, datePickerColors, modifier, lVar, selectableDates)), startRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DatePickerKt$YearPicker$2(modifier, j5, lVar, selectableDates, calendarModel, lVar2, datePickerColors, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void YearPickerMenuButton(v3.a<kotlin.r2> r21, boolean r22, androidx.compose.ui.Modifier r23, v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r24, androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt.YearPickerMenuButton(v3.a, boolean, androidx.compose.ui.Modifier, v3.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<CustomAccessibilityAction> customScrollActions(LazyGridState lazyGridState, s0 s0Var, String str, String str2) {
        List<CustomAccessibilityAction> L;
        L = kotlin.collections.w.L(new CustomAccessibilityAction(str, new DatePickerKt$customScrollActions$scrollUpAction$1(lazyGridState, s0Var)), new CustomAccessibilityAction(str2, new DatePickerKt$customScrollActions$scrollDownAction$1(lazyGridState, s0Var)));
        return L;
    }

    @Composable
    private static final String dayContentDescription(boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, Composer composer, int i5) {
        String sb;
        boolean z9;
        composer.startReplaceableGroup(502032503);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(502032503, i5, -1, "androidx.compose.material3.dayContentDescription (DatePicker.kt:1900)");
        }
        StringBuilder sb2 = new StringBuilder();
        composer.startReplaceableGroup(-852185051);
        boolean z10 = false;
        if (z4) {
            if (z6) {
                composer.startReplaceableGroup(-852184961);
                Strings.Companion companion = Strings.Companion;
                sb2.append(Strings_androidKt.m2294getStringNWtq28(Strings.m2225constructorimpl(R.string.m3c_date_range_picker_start_headline), composer, 0));
                composer.endReplaceableGroup();
            } else if (z7) {
                composer.startReplaceableGroup(-852184821);
                Strings.Companion companion2 = Strings.Companion;
                sb2.append(Strings_androidKt.m2294getStringNWtq28(Strings.m2225constructorimpl(R.string.m3c_date_range_picker_end_headline), composer, 0));
                composer.endReplaceableGroup();
            } else if (z8) {
                composer.startReplaceableGroup(-852184683);
                Strings.Companion companion3 = Strings.Companion;
                sb2.append(Strings_androidKt.m2294getStringNWtq28(Strings.m2225constructorimpl(R.string.m3c_date_range_picker_day_in_range), composer, 0));
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-852184582);
                composer.endReplaceableGroup();
            }
        }
        composer.endReplaceableGroup();
        if (z5) {
            if (sb2.length() > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                sb2.append(", ");
            }
            Strings.Companion companion4 = Strings.Companion;
            sb2.append(Strings_androidKt.m2294getStringNWtq28(Strings.m2225constructorimpl(R.string.m3c_date_picker_today_description), composer, 0));
        }
        if (sb2.length() == 0) {
            z10 = true;
        }
        if (z10) {
            sb = null;
        } else {
            sb = sb2.toString();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return sb;
    }

    public static final float getDatePickerHorizontalPadding() {
        return DatePickerHorizontalPadding;
    }

    @p4.l
    public static final PaddingValues getDatePickerModeTogglePadding() {
        return DatePickerModeTogglePadding;
    }

    public static final float getMonthYearHeight() {
        return MonthYearHeight;
    }

    public static final float getRecommendedSizeForAccessibility() {
        return RecommendedSizeForAccessibility;
    }

    public static final int numberOfMonthsInRange(@p4.l kotlin.ranges.l lVar) {
        return ((lVar.g() - lVar.e()) + 1) * 12;
    }

    @p4.l
    @Composable
    @ExperimentalMaterial3Api
    /* renamed from: rememberDatePickerState-EU0dCGE, reason: not valid java name */
    public static final DatePickerState m1813rememberDatePickerStateEU0dCGE(@p4.m Long l5, @p4.m Long l6, @p4.m kotlin.ranges.l lVar, int i5, @p4.m SelectableDates selectableDates, @p4.m Composer composer, int i6, int i7) {
        Long l7;
        Long l8;
        kotlin.ranges.l lVar2;
        int i8;
        SelectableDates selectableDates2;
        boolean z4;
        boolean z5;
        boolean z6;
        composer.startReplaceableGroup(2065763010);
        if ((i7 & 1) != 0) {
            l7 = null;
        } else {
            l7 = l5;
        }
        if ((i7 & 2) != 0) {
            l8 = l7;
        } else {
            l8 = l6;
        }
        if ((i7 & 4) != 0) {
            lVar2 = DatePickerDefaults.INSTANCE.getYearRange();
        } else {
            lVar2 = lVar;
        }
        if ((i7 & 8) != 0) {
            i8 = DisplayMode.Companion.m1849getPickerjFl4v0();
        } else {
            i8 = i5;
        }
        if ((i7 & 16) != 0) {
            selectableDates2 = DatePickerDefaults.INSTANCE.getAllDates();
        } else {
            selectableDates2 = selectableDates;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2065763010, i6, -1, "androidx.compose.material3.rememberDatePickerState (DatePicker.kt:363)");
        }
        boolean z7 = false;
        Locale defaultLocale = ActualAndroid_androidKt.defaultLocale(composer, 0);
        Object[] objArr = new Object[0];
        Saver<DatePickerStateImpl, Object> Saver = DatePickerStateImpl.Companion.Saver(selectableDates2, defaultLocale);
        composer.startReplaceableGroup(-1398082866);
        if ((((i6 & 14) ^ 6) > 4 && composer.changed(l7)) || (i6 & 6) == 4) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((((i6 & 112) ^ 48) > 32 && composer.changed(l8)) || (i6 & 48) == 32) {
            z5 = true;
        } else {
            z5 = false;
        }
        boolean changedInstance = z4 | z5 | composer.changedInstance(lVar2);
        if ((((i6 & 7168) ^ 3072) > 2048 && composer.changed(i8)) || (i6 & 3072) == 2048) {
            z6 = true;
        } else {
            z6 = false;
        }
        boolean z8 = changedInstance | z6;
        if ((((57344 & i6) ^ 24576) > 16384 && composer.changed(selectableDates2)) || (i6 & 24576) == 16384) {
            z7 = true;
        }
        boolean changedInstance2 = z8 | z7 | composer.changedInstance(defaultLocale);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance2 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DatePickerKt$rememberDatePickerState$1$1(l7, l8, lVar2, i8, selectableDates2, defaultLocale);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DatePickerStateImpl datePickerStateImpl = (DatePickerStateImpl) RememberSaveableKt.m3351rememberSaveable(objArr, (Saver) Saver, (String) null, (v3.a) rememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return datePickerStateImpl;
    }

    @p4.m
    public static final Object updateDisplayedMonth(@p4.l final LazyListState lazyListState, @p4.l final v3.l<? super Long, r2> lVar, @p4.l final CalendarModel calendarModel, @p4.l final kotlin.ranges.l lVar2, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object collect = SnapshotStateKt.snapshotFlow(new DatePickerKt$updateDisplayedMonth$2(lazyListState)).collect(new kotlinx.coroutines.flow.j() { // from class: androidx.compose.material3.DatePickerKt$updateDisplayedMonth$3
            @Override // kotlinx.coroutines.flow.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.d dVar2) {
                return emit(((Number) obj).intValue(), (kotlin.coroutines.d<? super r2>) dVar2);
            }

            @p4.m
            public final Object emit(int i5, @p4.l kotlin.coroutines.d<? super r2> dVar2) {
                int firstVisibleItemIndex = LazyListState.this.getFirstVisibleItemIndex() / 12;
                lVar.invoke(kotlin.coroutines.jvm.internal.b.g(calendarModel.getMonth(lVar2.e() + firstVisibleItemIndex, (LazyListState.this.getFirstVisibleItemIndex() % 12) + 1).getStartUtcTimeMillis()));
                return r2.f19517a;
            }
        }, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return collect == l5 ? collect : r2.f19517a;
    }
}
