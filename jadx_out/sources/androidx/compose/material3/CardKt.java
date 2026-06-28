package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aa\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0083\u0001\u0010\u0010\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0018\u001aU\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001aw\u0010\u0019\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0019\u0010\u001b\u001a_\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u001c\u0010\u0011\u001a\u0081\u0001\u0010\u001c\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u001c\u0010\u0018¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/material3/CardColors;", "colors", "Landroidx/compose/material3/CardElevation;", "elevation", "Landroidx/compose/foundation/BorderStroke;", androidx.compose.material.OutlinedTextFieldKt.BorderId, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "Lkotlin/u;", "content", "Card", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardElevation;Landroidx/compose/foundation/BorderStroke;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "onClick", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "(Lv3/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "ElevatedCard", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardElevation;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "(Lv3/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "OutlinedCard", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,850:1\n1116#2,6:851\n1116#2,6:857\n1116#2,6:863\n*S KotlinDebug\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardKt\n*L\n140#1:851,6\n237#1:857,6\n333#1:863,6\n*E\n"})
/* loaded from: classes.dex */
public final class CardKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Card(@p4.m Modifier modifier, @p4.m Shape shape, @p4.m CardColors cardColors, @p4.m CardElevation cardElevation, @p4.m BorderStroke borderStroke, @p4.l v3.q<? super ColumnScope, ? super Composer, ? super Integer, r2> qVar, @p4.m Composer composer, int i5, int i6) {
        Modifier modifier2;
        int i7;
        Shape shape2;
        CardColors cardColors2;
        CardElevation cardElevation2;
        BorderStroke borderStroke2;
        Modifier modifier3;
        Shape shape3;
        CardColors cardColors3;
        CardElevation cardElevation3;
        BorderStroke borderStroke3;
        int i8;
        CardElevation cardElevation4;
        CardElevation cardElevation5;
        BorderStroke borderStroke4;
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(1179621553);
        int i12 = i6 & 1;
        if (i12 != 0) {
            i7 = i5 | 6;
            modifier2 = modifier;
        } else if ((i5 & 6) == 0) {
            modifier2 = modifier;
            i7 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i5;
        } else {
            modifier2 = modifier;
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            if ((i6 & 2) == 0) {
                shape2 = shape;
                if (startRestartGroup.changed(shape2)) {
                    i11 = 32;
                    i7 |= i11;
                }
            } else {
                shape2 = shape;
            }
            i11 = 16;
            i7 |= i11;
        } else {
            shape2 = shape;
        }
        if ((i5 & 384) == 0) {
            if ((i6 & 4) == 0) {
                cardColors2 = cardColors;
                if (startRestartGroup.changed(cardColors2)) {
                    i10 = 256;
                    i7 |= i10;
                }
            } else {
                cardColors2 = cardColors;
            }
            i10 = 128;
            i7 |= i10;
        } else {
            cardColors2 = cardColors;
        }
        if ((i5 & 3072) == 0) {
            if ((i6 & 8) == 0) {
                cardElevation2 = cardElevation;
                if (startRestartGroup.changed(cardElevation2)) {
                    i9 = 2048;
                    i7 |= i9;
                }
            } else {
                cardElevation2 = cardElevation;
            }
            i9 = 1024;
            i7 |= i9;
        } else {
            cardElevation2 = cardElevation;
        }
        int i13 = i6 & 16;
        if (i13 != 0) {
            i7 |= 24576;
            borderStroke2 = borderStroke;
        } else {
            borderStroke2 = borderStroke;
            if ((i5 & 24576) == 0) {
                i7 |= startRestartGroup.changed(borderStroke2) ? 16384 : 8192;
            }
        }
        if ((i6 & 32) != 0) {
            i7 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i7 |= startRestartGroup.changedInstance(qVar) ? 131072 : 65536;
        }
        if ((74899 & i7) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            shape3 = shape2;
            cardElevation5 = cardElevation2;
            borderStroke4 = borderStroke2;
        } else {
            startRestartGroup.startDefaults();
            if ((i5 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i6 & 2) != 0) {
                    i7 &= -113;
                }
                if ((i6 & 4) != 0) {
                    i7 &= -897;
                }
                if ((i6 & 8) != 0) {
                    i7 &= -7169;
                }
                modifier3 = modifier2;
                shape3 = shape2;
                cardColors3 = cardColors2;
                borderStroke3 = borderStroke2;
                i8 = i7;
                cardElevation4 = cardElevation2;
            } else {
                modifier3 = i12 != 0 ? Modifier.Companion : modifier2;
                if ((i6 & 2) != 0) {
                    shape3 = CardDefaults.INSTANCE.getShape(startRestartGroup, 6);
                    i7 &= -113;
                } else {
                    shape3 = shape2;
                }
                if ((i6 & 4) != 0) {
                    cardColors3 = CardDefaults.INSTANCE.cardColors(startRestartGroup, 6);
                    i7 &= -897;
                } else {
                    cardColors3 = cardColors2;
                }
                if ((i6 & 8) != 0) {
                    cardElevation3 = CardDefaults.INSTANCE.m1616cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                    i7 &= -7169;
                } else {
                    cardElevation3 = cardElevation2;
                }
                borderStroke3 = i13 != 0 ? null : borderStroke;
                CardElevation cardElevation6 = cardElevation3;
                i8 = i7;
                cardElevation4 = cardElevation6;
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1179621553, i8, -1, "androidx.compose.material3.Card (Card.kt:83)");
            }
            CardElevation cardElevation7 = cardElevation4;
            SurfaceKt.m2304SurfaceT9BRK9s(modifier3, shape3, cardColors3.m1608containerColorvNxB06k$material3_release(true), cardColors3.m1609contentColorvNxB06k$material3_release(true), cardElevation4.m1621tonalElevationu2uoSUM$material3_release(true), cardElevation4.shadowElevation$material3_release(true, null, startRestartGroup, ((i8 >> 3) & 896) | 54).getValue().m6058unboximpl(), borderStroke3, ComposableLambdaKt.composableLambda(startRestartGroup, 664103990, true, new CardKt$Card$1(qVar)), startRestartGroup, (i8 & 14) | 12582912 | (i8 & 112) | (3670016 & (i8 << 6)), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            cardColors2 = cardColors3;
            cardElevation5 = cardElevation7;
            borderStroke4 = borderStroke3;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new CardKt$Card$2(modifier3, shape3, cardColors2, cardElevation5, borderStroke4, qVar, i5, i6));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014d  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ElevatedCard(@p4.m androidx.compose.ui.Modifier r19, @p4.m androidx.compose.ui.graphics.Shape r20, @p4.m androidx.compose.material3.CardColors r21, @p4.m androidx.compose.material3.CardElevation r22, @p4.l v3.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r23, @p4.m androidx.compose.runtime.Composer r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CardKt.ElevatedCard(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, androidx.compose.material3.CardColors, androidx.compose.material3.CardElevation, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void OutlinedCard(@p4.m Modifier modifier, @p4.m Shape shape, @p4.m CardColors cardColors, @p4.m CardElevation cardElevation, @p4.m BorderStroke borderStroke, @p4.l v3.q<? super ColumnScope, ? super Composer, ? super Integer, r2> qVar, @p4.m Composer composer, int i5, int i6) {
        Modifier modifier2;
        int i7;
        Shape shape2;
        CardColors cardColors2;
        CardElevation cardElevation2;
        BorderStroke borderStroke2;
        Modifier modifier3;
        Shape shape3;
        CardColors cardColors3;
        BorderStroke borderStroke3;
        CardElevation cardElevation3;
        int i8;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(740336179);
        int i11 = i6 & 1;
        if (i11 != 0) {
            i7 = i5 | 6;
            modifier2 = modifier;
        } else if ((i5 & 6) == 0) {
            modifier2 = modifier;
            i7 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i5;
        } else {
            modifier2 = modifier;
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            if ((i6 & 2) == 0) {
                shape2 = shape;
                if (startRestartGroup.changed(shape2)) {
                    i10 = 32;
                    i7 |= i10;
                }
            } else {
                shape2 = shape;
            }
            i10 = 16;
            i7 |= i10;
        } else {
            shape2 = shape;
        }
        if ((i5 & 384) == 0) {
            if ((i6 & 4) == 0) {
                cardColors2 = cardColors;
                if (startRestartGroup.changed(cardColors2)) {
                    i9 = 256;
                    i7 |= i9;
                }
            } else {
                cardColors2 = cardColors;
            }
            i9 = 128;
            i7 |= i9;
        } else {
            cardColors2 = cardColors;
        }
        if ((i5 & 3072) == 0) {
            if ((i6 & 8) == 0) {
                cardElevation2 = cardElevation;
                if (startRestartGroup.changed(cardElevation2)) {
                    i8 = 2048;
                    i7 |= i8;
                }
            } else {
                cardElevation2 = cardElevation;
            }
            i8 = 1024;
            i7 |= i8;
        } else {
            cardElevation2 = cardElevation;
        }
        if ((i5 & 24576) == 0) {
            borderStroke2 = borderStroke;
            i7 |= ((i6 & 16) == 0 && startRestartGroup.changed(borderStroke2)) ? 16384 : 8192;
        } else {
            borderStroke2 = borderStroke;
        }
        if ((i6 & 32) != 0) {
            i7 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i7 |= startRestartGroup.changedInstance(qVar) ? 131072 : 65536;
        }
        if ((74899 & i7) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            shape3 = shape2;
            cardColors3 = cardColors2;
            cardElevation3 = cardElevation2;
        } else {
            startRestartGroup.startDefaults();
            if ((i5 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i6 & 2) != 0) {
                    i7 &= -113;
                }
                if ((i6 & 4) != 0) {
                    i7 &= -897;
                }
                if ((i6 & 8) != 0) {
                    i7 &= -7169;
                }
                if ((i6 & 16) != 0) {
                    i7 &= -57345;
                }
                modifier3 = modifier2;
                shape3 = shape2;
                cardColors3 = cardColors2;
                borderStroke3 = borderStroke2;
            } else {
                modifier3 = i11 != 0 ? Modifier.Companion : modifier2;
                if ((i6 & 2) != 0) {
                    shape3 = CardDefaults.INSTANCE.getOutlinedShape(startRestartGroup, 6);
                    i7 &= -113;
                } else {
                    shape3 = shape2;
                }
                if ((i6 & 4) != 0) {
                    cardColors3 = CardDefaults.INSTANCE.outlinedCardColors(startRestartGroup, 6);
                    i7 &= -897;
                } else {
                    cardColors3 = cardColors2;
                }
                if ((i6 & 8) != 0) {
                    i7 &= -7169;
                    cardElevation2 = CardDefaults.INSTANCE.m1620outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                }
                if ((i6 & 16) != 0) {
                    borderStroke3 = CardDefaults.INSTANCE.outlinedCardBorder(false, startRestartGroup, 48, 1);
                    i7 &= -57345;
                } else {
                    borderStroke3 = borderStroke;
                }
            }
            CardElevation cardElevation4 = cardElevation2;
            int i12 = i7;
            cardElevation3 = cardElevation4;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(740336179, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:283)");
            }
            Card(modifier3, shape3, cardColors3, cardElevation3, borderStroke3, qVar, startRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            borderStroke2 = borderStroke3;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new CardKt$OutlinedCard$1(modifier3, shape3, cardColors3, cardElevation3, borderStroke2, qVar, i5, i6));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00dc  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ElevatedCard(@p4.l v3.a<kotlin.r2> r24, @p4.m androidx.compose.ui.Modifier r25, boolean r26, @p4.m androidx.compose.ui.graphics.Shape r27, @p4.m androidx.compose.material3.CardColors r28, @p4.m androidx.compose.material3.CardElevation r29, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r30, @p4.l v3.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r31, @p4.m androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CardKt.ElevatedCard(v3.a, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, androidx.compose.material3.CardColors, androidx.compose.material3.CardElevation, androidx.compose.foundation.interaction.MutableInteractionSource, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0186  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void OutlinedCard(@p4.l v3.a<kotlin.r2> r24, @p4.m androidx.compose.ui.Modifier r25, boolean r26, @p4.m androidx.compose.ui.graphics.Shape r27, @p4.m androidx.compose.material3.CardColors r28, @p4.m androidx.compose.material3.CardElevation r29, @p4.m androidx.compose.foundation.BorderStroke r30, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r31, @p4.l v3.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r32, @p4.m androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CardKt.OutlinedCard(v3.a, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, androidx.compose.material3.CardColors, androidx.compose.material3.CardElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.interaction.MutableInteractionSource, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a4  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Card(@p4.l v3.a<kotlin.r2> r30, @p4.m androidx.compose.ui.Modifier r31, boolean r32, @p4.m androidx.compose.ui.graphics.Shape r33, @p4.m androidx.compose.material3.CardColors r34, @p4.m androidx.compose.material3.CardElevation r35, @p4.m androidx.compose.foundation.BorderStroke r36, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r37, @p4.l v3.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r38, @p4.m androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CardKt.Card(v3.a, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, androidx.compose.material3.CardColors, androidx.compose.material3.CardElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.interaction.MutableInteractionSource, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }
}
