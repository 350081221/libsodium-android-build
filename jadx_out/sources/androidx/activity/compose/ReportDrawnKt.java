package androidx.activity.compose;

import androidx.activity.FullyDrawnReporter;
import androidx.activity.FullyDrawnReporterOwner;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u000f\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\f\u001a\u00020\u00032\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlin/Function0;", "", "predicate", "Lkotlin/r2;", "ReportDrawnWhen", "(Lv3/a;Landroidx/compose/runtime/Composer;I)V", "ReportDrawn", "(Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "", "block", "ReportDrawnAfter", "(Lv3/l;Landroidx/compose/runtime/Composer;I)V", "activity-compose_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nReportDrawn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,176:1\n955#2,6:177\n955#2,6:183\n*S KotlinDebug\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt\n*L\n133#1:177,6\n172#1:183,6\n*E\n"})
/* loaded from: classes.dex */
public final class ReportDrawnKt {
    @Composable
    public static final void ReportDrawn(@m Composer composer, int i5) {
        Composer startRestartGroup = composer.startRestartGroup(-1357012904);
        if (i5 == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            ReportDrawnWhen(ReportDrawnKt$ReportDrawn$1.INSTANCE, startRestartGroup, 6);
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ReportDrawnKt$ReportDrawn$2(i5));
        }
    }

    @Composable
    public static final void ReportDrawnAfter(@l v3.l<? super d<? super r2>, ? extends Object> lVar, @m Composer composer, int i5) {
        int i6;
        FullyDrawnReporter fullyDrawnReporter;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(945311272);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(lVar)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i6 = i7 | i5;
        } else {
            i6 = i5;
        }
        if ((i6 & 3) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            FullyDrawnReporterOwner current = LocalFullyDrawnReporterOwner.INSTANCE.getCurrent(startRestartGroup, 6);
            if (current != null && (fullyDrawnReporter = current.getFullyDrawnReporter()) != null) {
                startRestartGroup.startReplaceableGroup(-100805929);
                boolean changed = startRestartGroup.changed(fullyDrawnReporter) | startRestartGroup.changed(lVar);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new ReportDrawnKt$ReportDrawnAfter$1$1(fullyDrawnReporter, lVar, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(lVar, fullyDrawnReporter, (p) rememberedValue, startRestartGroup, i6 & 14);
            } else {
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new ReportDrawnKt$ReportDrawnAfter$fullyDrawnReporter$1(lVar, i5));
                    return;
                }
                return;
            }
        }
        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.updateScope(new ReportDrawnKt$ReportDrawnAfter$2(lVar, i5));
        }
    }

    @Composable
    public static final void ReportDrawnWhen(@l v3.a<Boolean> aVar, @m Composer composer, int i5) {
        int i6;
        FullyDrawnReporter fullyDrawnReporter;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(-2047119994);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(aVar)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i6 = i7 | i5;
        } else {
            i6 = i5;
        }
        if ((i6 & 3) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            FullyDrawnReporterOwner current = LocalFullyDrawnReporterOwner.INSTANCE.getCurrent(startRestartGroup, 6);
            if (current != null && (fullyDrawnReporter = current.getFullyDrawnReporter()) != null) {
                startRestartGroup.startReplaceableGroup(-537074000);
                boolean changed = startRestartGroup.changed(fullyDrawnReporter) | startRestartGroup.changed(aVar);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new ReportDrawnKt$ReportDrawnWhen$1$1(fullyDrawnReporter, aVar);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                EffectsKt.DisposableEffect(fullyDrawnReporter, aVar, (v3.l) rememberedValue, startRestartGroup, (i6 << 3) & 112);
            } else {
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new ReportDrawnKt$ReportDrawnWhen$fullyDrawnReporter$1(aVar, i5));
                    return;
                }
                return;
            }
        }
        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.updateScope(new ReportDrawnKt$ReportDrawnWhen$2(aVar, i5));
        }
    }
}
