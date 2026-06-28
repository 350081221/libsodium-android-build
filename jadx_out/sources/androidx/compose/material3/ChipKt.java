package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.SuggestionChipTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a¨\u0001\u0010\u0015\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a¨\u0001\u0010\u0015\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0018\u001a¨\u0001\u0010\u0019\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0019\u0010\u0016\u001a¨\u0001\u0010\u0019\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0019\u0010\u0018\u001a°\u0001\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u001b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a°\u0001\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u001b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u001f\u0010\u001e\u001aÇ\u0001\u0010!\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010 \u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u001b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b!\u0010\"\u001a\u0091\u0001\u0010$\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010#\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b$\u0010%\u001a\u0091\u0001\u0010$\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010#\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b$\u0010&\u001a\u0091\u0001\u0010'\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010#\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b'\u0010%\u001a\u0091\u0001\u0010'\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010#\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b'\u0010&\u001a¹\u0001\u00102\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\b\u001a\u00020\u00072\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u0010\u0014\u001a\u00020\u0013H\u0003ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001aÎ\u0001\u00105\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\b\u001a\u00020\u00072\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\u0006\u0010)\u001a\u00020(2\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0013\u0010 \u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u001b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u0010\u0014\u001a\u00020\u0013H\u0003ø\u0001\u0000¢\u0006\u0004\b3\u00104\u001a\u0094\u0001\u0010:\u001a\u00020\u00012\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0013\u0010 \u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\u0006\u00106\u001a\u00020*2\u0006\u00107\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0003ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a&\u0010>\u001a\u00020.2\b\b\u0002\u0010;\u001a\u00020\u00072\b\b\u0002\u0010<\u001a\u00020\u00072\b\b\u0002\u0010=\u001a\u00020\u0007H\u0002\"\u0014\u0010?\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@\"\u0014\u0010A\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010B\"\u0014\u0010C\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010B\"\u0014\u0010D\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010B\"\u0014\u0010F\u001a\u00020E8\u0002X\u0082T¢\u0006\u0006\n\u0004\bF\u0010G\"\u0014\u0010H\u001a\u00020E8\u0002X\u0082T¢\u0006\u0006\n\u0004\bH\u0010G\"\u0014\u0010I\u001a\u00020E8\u0002X\u0082T¢\u0006\u0006\n\u0004\bI\u0010G\"\u0018\u0010M\u001a\u00020\r*\u00020J8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bK\u0010L\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006N"}, d2 = {"Lkotlin/Function0;", "Lkotlin/r2;", "onClick", "Landroidx/compose/runtime/Composable;", "label", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", ChipKt.LeadingIconLayoutId, ChipKt.TrailingIconLayoutId, "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/material3/ChipColors;", "colors", "Landroidx/compose/material3/ChipElevation;", "elevation", "Landroidx/compose/foundation/BorderStroke;", androidx.compose.material.OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "AssistChip", "(Lv3/a;Lv3/p;Landroidx/compose/ui/Modifier;ZLv3/p;Lv3/p;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/material3/ChipBorder;", "(Lv3/a;Lv3/p;Landroidx/compose/ui/Modifier;ZLv3/p;Lv3/p;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "ElevatedAssistChip", "selected", "Landroidx/compose/material3/SelectableChipColors;", "Landroidx/compose/material3/SelectableChipElevation;", "FilterChip", "(ZLv3/a;Lv3/p;Landroidx/compose/ui/Modifier;ZLv3/p;Lv3/p;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "ElevatedFilterChip", "avatar", "InputChip", "(ZLv3/a;Lv3/p;Landroidx/compose/ui/Modifier;ZLv3/p;Lv3/p;Lv3/p;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "icon", "SuggestionChip", "(Lv3/a;Lv3/p;Landroidx/compose/ui/Modifier;ZLv3/p;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "(Lv3/a;Lv3/p;Landroidx/compose/ui/Modifier;ZLv3/p;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "ElevatedSuggestionChip", "Landroidx/compose/ui/text/TextStyle;", "labelTextStyle", "Landroidx/compose/ui/graphics/Color;", "labelColor", "Landroidx/compose/ui/unit/Dp;", "minHeight", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "Chip-nkUnTEs", "(Landroidx/compose/ui/Modifier;Lv3/a;ZLv3/p;Landroidx/compose/ui/text/TextStyle;JLv3/p;Lv3/p;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "Chip", "SelectableChip-u0RnIRE", "(ZLandroidx/compose/ui/Modifier;Lv3/a;ZLv3/p;Landroidx/compose/ui/text/TextStyle;Lv3/p;Lv3/p;Lv3/p;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "SelectableChip", "leadingIconColor", "trailingIconColor", "ChipContent-fe0OD_I", "(Lv3/p;Landroidx/compose/ui/text/TextStyle;JLv3/p;Lv3/p;Lv3/p;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V", "ChipContent", "hasAvatar", "hasLeadingIcon", "hasTrailingIcon", "inputChipPadding", "HorizontalElementsPadding", "F", "AssistChipPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "FilterChipPadding", "SuggestionChipPadding", "", "LeadingIconLayoutId", "Ljava/lang/String;", "LabelLayoutId", "TrailingIconLayoutId", "Landroidx/compose/material3/ColorScheme;", "getDefaultSuggestionChipColors", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/ChipColors;", "defaultSuggestionChipColors", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,2741:1\n1116#2,6:2742\n1116#2,6:2748\n1116#2,6:2754\n1116#2,6:2760\n1116#2,6:2766\n1116#2,6:2772\n1116#2,6:2778\n1116#2,6:2784\n1116#2,6:2790\n1116#2,6:2796\n1116#2,6:2802\n154#3:2808\n154#3:2809\n154#3:2810\n154#3:2811\n154#3:2812\n154#3:2813\n154#3:2814\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipKt\n*L\n124#1:2742,6\n204#1:2748,6\n275#1:2754,6\n354#1:2760,6\n435#1:2766,6\n514#1:2772,6\n598#1:2778,6\n693#1:2784,6\n770#1:2790,6\n838#1:2796,6\n914#1:2802,6\n1869#1:2808\n1870#1:2809\n1916#1:2810\n1917#1:2811\n2713#1:2812\n2714#1:2813\n2721#1:2814\n*E\n"})
/* loaded from: classes.dex */
public final class ChipKt {

    @p4.l
    private static final PaddingValues AssistChipPadding;

    @p4.l
    private static final PaddingValues FilterChipPadding;
    private static final float HorizontalElementsPadding;

    @p4.l
    private static final String LabelLayoutId = "label";

    @p4.l
    private static final String LeadingIconLayoutId = "leadingIcon";

    @p4.l
    private static final PaddingValues SuggestionChipPadding;

    @p4.l
    private static final String TrailingIconLayoutId = "trailingIcon";

    static {
        float m6044constructorimpl = Dp.m6044constructorimpl(8);
        HorizontalElementsPadding = m6044constructorimpl;
        AssistChipPadding = PaddingKt.m548PaddingValuesYgX7TsA$default(m6044constructorimpl, 0.0f, 2, null);
        FilterChipPadding = PaddingKt.m548PaddingValuesYgX7TsA$default(m6044constructorimpl, 0.0f, 2, null);
        SuggestionChipPadding = PaddingKt.m548PaddingValuesYgX7TsA$default(m6044constructorimpl, 0.0f, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ce  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AssistChip(@p4.l v3.a<kotlin.r2> r37, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r38, @p4.m androidx.compose.ui.Modifier r39, boolean r40, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r41, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r42, @p4.m androidx.compose.ui.graphics.Shape r43, @p4.m androidx.compose.material3.ChipColors r44, @p4.m androidx.compose.material3.ChipElevation r45, @p4.m androidx.compose.foundation.BorderStroke r46, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r47, @p4.m androidx.compose.runtime.Composer r48, int r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.AssistChip(v3.a, v3.p, androidx.compose.ui.Modifier, boolean, v3.p, v3.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: Chip-nkUnTEs, reason: not valid java name */
    public static final void m1668ChipnkUnTEs(Modifier modifier, v3.a<r2> aVar, boolean z4, v3.p<? super Composer, ? super Integer, r2> pVar, TextStyle textStyle, long j5, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, float f5, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Composer composer, int i5, int i6) {
        int i7;
        int i8;
        float m6044constructorimpl;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1400504719);
        if ((i5 & 6) == 0) {
            i7 = (startRestartGroup.changed(modifier) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= startRestartGroup.changedInstance(aVar) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= startRestartGroup.changed(z4) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= startRestartGroup.changedInstance(pVar) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i7 |= startRestartGroup.changed(textStyle) ? 16384 : 8192;
        }
        int i9 = i7;
        if ((i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i9 |= startRestartGroup.changed(j5) ? 131072 : 65536;
        }
        if ((i5 & 1572864) == 0) {
            i9 |= startRestartGroup.changedInstance(pVar2) ? 1048576 : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i9 |= startRestartGroup.changedInstance(pVar3) ? 8388608 : 4194304;
        }
        if ((i5 & 100663296) == 0) {
            i9 |= startRestartGroup.changed(shape) ? 67108864 : 33554432;
        }
        if ((i5 & 805306368) == 0) {
            i9 |= startRestartGroup.changed(chipColors) ? 536870912 : 268435456;
        }
        int i10 = i9;
        if ((i6 & 6) == 0) {
            i8 = (startRestartGroup.changed(chipElevation) ? 4 : 2) | i6;
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            i8 |= startRestartGroup.changed(borderStroke) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i8 |= startRestartGroup.changed(f5) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i8 |= startRestartGroup.changed(paddingValues) ? 2048 : 1024;
        }
        if ((i6 & 24576) == 0) {
            i8 |= startRestartGroup.changed(mutableInteractionSource) ? 16384 : 8192;
        }
        if ((306783379 & i10) == 306783378 && (i8 & 9363) == 9362 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1400504719, i10, i8, "androidx.compose.material3.Chip (Chip.kt:1861)");
            }
            Modifier semantics$default = SemanticsModifierKt.semantics$default(modifier, false, ChipKt$Chip$1.INSTANCE, 1, null);
            long m1648containerColorvNxB06k$material3_release = chipColors.m1648containerColorvNxB06k$material3_release(z4);
            if (chipElevation != null) {
                m6044constructorimpl = chipElevation.m1667tonalElevationu2uoSUM$material3_release(z4);
            } else {
                m6044constructorimpl = Dp.m6044constructorimpl(0);
            }
            float f6 = m6044constructorimpl;
            startRestartGroup.startReplaceableGroup(64045604);
            State<Dp> shadowElevation$material3_release = chipElevation != null ? chipElevation.shadowElevation$material3_release(z4, mutableInteractionSource, startRestartGroup, ((i10 >> 6) & 14) | ((i8 >> 9) & 112) | ((i8 << 6) & 896)) : null;
            startRestartGroup.endReplaceableGroup();
            int i11 = i8;
            composer2 = startRestartGroup;
            SurfaceKt.m2307Surfaceo_FOJdg(aVar, semantics$default, z4, shape, m1648containerColorvNxB06k$material3_release, 0L, f6, shadowElevation$material3_release != null ? shadowElevation$material3_release.getValue().m6058unboximpl() : Dp.m6044constructorimpl(0), borderStroke, mutableInteractionSource, ComposableLambdaKt.composableLambda(composer2, -1985962652, true, new ChipKt$Chip$2(pVar, textStyle, j5, pVar2, pVar3, chipColors, z4, f5, paddingValues)), composer2, ((i10 >> 15) & 7168) | ((i10 >> 3) & 14) | (i10 & 896) | ((i11 << 21) & 234881024) | (1879048192 & (i11 << 15)), 6, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ChipKt$Chip$3(modifier, aVar, z4, pVar, textStyle, j5, pVar2, pVar3, shape, chipColors, chipElevation, borderStroke, f5, paddingValues, mutableInteractionSource, i5, i6));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: ChipContent-fe0OD_I, reason: not valid java name */
    public static final void m1669ChipContentfe0OD_I(v3.p<? super Composer, ? super Integer, r2> pVar, TextStyle textStyle, long j5, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, v3.p<? super Composer, ? super Integer, r2> pVar4, long j6, long j7, float f5, PaddingValues paddingValues, Composer composer, int i5) {
        int i6;
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
        int i17;
        Composer startRestartGroup = composer.startRestartGroup(-782878228);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i6 = i17 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changed(textStyle)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i6 |= i16;
        }
        if ((i5 & 384) == 0) {
            if (startRestartGroup.changed(j5)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i6 |= i15;
        }
        if ((i5 & 3072) == 0) {
            if (startRestartGroup.changedInstance(pVar2)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i6 |= i14;
        }
        if ((i5 & 24576) == 0) {
            if (startRestartGroup.changedInstance(pVar3)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i6 |= i13;
        }
        if ((196608 & i5) == 0) {
            if (startRestartGroup.changedInstance(pVar4)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i6 |= i12;
        }
        if ((1572864 & i5) == 0) {
            if (startRestartGroup.changed(j6)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i6 |= i11;
        }
        if ((12582912 & i5) == 0) {
            int i18 = i6;
            if (startRestartGroup.changed(j7)) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i7 = i18 | i10;
        } else {
            i7 = i6;
        }
        if ((100663296 & i5) == 0) {
            if (startRestartGroup.changed(f5)) {
                i9 = 67108864;
            } else {
                i9 = 33554432;
            }
            i7 |= i9;
        }
        if ((i5 & 805306368) == 0) {
            if (startRestartGroup.changed(paddingValues)) {
                i8 = 536870912;
            } else {
                i8 = 268435456;
            }
            i7 |= i8;
        }
        if ((i7 & 306783379) == 306783378 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-782878228, i7, -1, "androidx.compose.material3.ChipContent (Chip.kt:1947)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3724boximpl(j5)), TextKt.getLocalTextStyle().provides(textStyle)}, ComposableLambdaKt.composableLambda(startRestartGroup, 1748799148, true, new ChipKt$ChipContent$1(f5, paddingValues, pVar3, pVar2, pVar4, j6, pVar, j7)), startRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ChipKt$ChipContent$2(pVar, textStyle, j5, pVar2, pVar3, pVar4, j6, j7, f5, paddingValues, i5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e6  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ElevatedAssistChip(@p4.l v3.a<kotlin.r2> r37, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r38, @p4.m androidx.compose.ui.Modifier r39, boolean r40, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r41, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r42, @p4.m androidx.compose.ui.graphics.Shape r43, @p4.m androidx.compose.material3.ChipColors r44, @p4.m androidx.compose.material3.ChipElevation r45, @p4.m androidx.compose.foundation.BorderStroke r46, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r47, @p4.m androidx.compose.runtime.Composer r48, int r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 787
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.ElevatedAssistChip(v3.a, v3.p, androidx.compose.ui.Modifier, boolean, v3.p, v3.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ff  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ElevatedFilterChip(boolean r37, @p4.l v3.a<kotlin.r2> r38, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r39, @p4.m androidx.compose.ui.Modifier r40, boolean r41, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r42, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r43, @p4.m androidx.compose.ui.graphics.Shape r44, @p4.m androidx.compose.material3.SelectableChipColors r45, @p4.m androidx.compose.material3.SelectableChipElevation r46, @p4.m androidx.compose.foundation.BorderStroke r47, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r48, @p4.m androidx.compose.runtime.Composer r49, int r50, int r51, int r52) {
        /*
            Method dump skipped, instructions count: 839
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.ElevatedFilterChip(boolean, v3.a, v3.p, androidx.compose.ui.Modifier, boolean, v3.p, v3.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SelectableChipColors, androidx.compose.material3.SelectableChipElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01eb  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ElevatedSuggestionChip(@p4.l v3.a<kotlin.r2> r32, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r33, @p4.m androidx.compose.ui.Modifier r34, boolean r35, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r36, @p4.m androidx.compose.ui.graphics.Shape r37, @p4.m androidx.compose.material3.ChipColors r38, @p4.m androidx.compose.material3.ChipElevation r39, @p4.m androidx.compose.foundation.BorderStroke r40, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r41, @p4.m androidx.compose.runtime.Composer r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.ElevatedSuggestionChip(v3.a, v3.p, androidx.compose.ui.Modifier, boolean, v3.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e3  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FilterChip(boolean r43, @p4.l v3.a<kotlin.r2> r44, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r45, @p4.m androidx.compose.ui.Modifier r46, boolean r47, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r48, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r49, @p4.m androidx.compose.ui.graphics.Shape r50, @p4.m androidx.compose.material3.SelectableChipColors r51, @p4.m androidx.compose.material3.SelectableChipElevation r52, @p4.m androidx.compose.foundation.BorderStroke r53, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r54, @p4.m androidx.compose.runtime.Composer r55, int r56, int r57, int r58) {
        /*
            Method dump skipped, instructions count: 888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.FilterChip(boolean, v3.a, v3.p, androidx.compose.ui.Modifier, boolean, v3.p, v3.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SelectableChipColors, androidx.compose.material3.SelectableChipElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02ea  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void InputChip(boolean r45, @p4.l v3.a<kotlin.r2> r46, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r47, @p4.m androidx.compose.ui.Modifier r48, boolean r49, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r50, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r51, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r52, @p4.m androidx.compose.ui.graphics.Shape r53, @p4.m androidx.compose.material3.SelectableChipColors r54, @p4.m androidx.compose.material3.SelectableChipElevation r55, @p4.m androidx.compose.foundation.BorderStroke r56, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r57, @p4.m androidx.compose.runtime.Composer r58, int r59, int r60, int r61) {
        /*
            Method dump skipped, instructions count: 980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.InputChip(boolean, v3.a, v3.p, androidx.compose.ui.Modifier, boolean, v3.p, v3.p, v3.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SelectableChipColors, androidx.compose.material3.SelectableChipElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: SelectableChip-u0RnIRE, reason: not valid java name */
    public static final void m1670SelectableChipu0RnIRE(boolean z4, Modifier modifier, v3.a<r2> aVar, boolean z5, v3.p<? super Composer, ? super Integer, r2> pVar, TextStyle textStyle, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, v3.p<? super Composer, ? super Integer, r2> pVar4, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, float f5, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Composer composer, int i5, int i6) {
        int i7;
        int i8;
        float m6044constructorimpl;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(402951308);
        if ((i5 & 6) == 0) {
            i7 = (startRestartGroup.changed(z4) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= startRestartGroup.changedInstance(aVar) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= startRestartGroup.changed(z5) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i7 |= startRestartGroup.changedInstance(pVar) ? 16384 : 8192;
        }
        if ((i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i7 |= startRestartGroup.changed(textStyle) ? 131072 : 65536;
        }
        if ((i5 & 1572864) == 0) {
            i7 |= startRestartGroup.changedInstance(pVar2) ? 1048576 : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i7 |= startRestartGroup.changedInstance(pVar3) ? 8388608 : 4194304;
        }
        if ((i5 & 100663296) == 0) {
            i7 |= startRestartGroup.changedInstance(pVar4) ? 67108864 : 33554432;
        }
        if ((i5 & 805306368) == 0) {
            i7 |= startRestartGroup.changed(shape) ? 536870912 : 268435456;
        }
        if ((i6 & 6) == 0) {
            i8 = (startRestartGroup.changed(selectableChipColors) ? 4 : 2) | i6;
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            i8 |= startRestartGroup.changed(selectableChipElevation) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i8 |= startRestartGroup.changed(borderStroke) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i8 |= startRestartGroup.changed(f5) ? 2048 : 1024;
        }
        if ((i6 & 24576) == 0) {
            i8 |= startRestartGroup.changed(paddingValues) ? 16384 : 8192;
        }
        if ((i6 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i8 |= startRestartGroup.changed(mutableInteractionSource) ? 131072 : 65536;
        }
        if ((i7 & 306783379) == 306783378 && (74899 & i8) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(402951308, i7, i8, "androidx.compose.material3.SelectableChip (Chip.kt:1906)");
            }
            Modifier semantics$default = SemanticsModifierKt.semantics$default(modifier, false, ChipKt$SelectableChip$1.INSTANCE, 1, null);
            int i9 = (i7 >> 9) & 14;
            long m3744unboximpl = selectableChipColors.containerColor$material3_release(z5, z4, startRestartGroup, ((i7 << 3) & 112) | i9 | ((i8 << 6) & 896)).getValue().m3744unboximpl();
            if (selectableChipElevation != null) {
                m6044constructorimpl = selectableChipElevation.m2166tonalElevationu2uoSUM$material3_release(z5);
            } else {
                m6044constructorimpl = Dp.m6044constructorimpl(0);
            }
            float f6 = m6044constructorimpl;
            startRestartGroup.startReplaceableGroup(1036687729);
            State<Dp> shadowElevation$material3_release = selectableChipElevation == null ? null : selectableChipElevation.shadowElevation$material3_release(z5, mutableInteractionSource, startRestartGroup, i9 | ((i8 >> 12) & 112) | ((i8 << 3) & 896));
            startRestartGroup.endReplaceableGroup();
            int i10 = i7;
            int i11 = i8;
            composer2 = startRestartGroup;
            SurfaceKt.m2305Surfaced85dljk(z4, aVar, semantics$default, z5, shape, m3744unboximpl, 0L, f6, shadowElevation$material3_release != null ? shadowElevation$material3_release.getValue().m6058unboximpl() : Dp.m6044constructorimpl(0), borderStroke, mutableInteractionSource, ComposableLambdaKt.composableLambda(startRestartGroup, -577614814, true, new ChipKt$SelectableChip$2(selectableChipColors, z5, z4, pVar, textStyle, pVar2, pVar3, pVar4, f5, paddingValues)), startRestartGroup, (i10 & 14) | ((i10 >> 3) & 112) | (i10 & 7168) | ((i10 >> 15) & 57344) | ((i11 << 21) & 1879048192), ((i11 >> 15) & 14) | 48, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ChipKt$SelectableChip$3(z4, modifier, aVar, z5, pVar, textStyle, pVar2, pVar3, pVar4, shape, selectableChipColors, selectableChipElevation, borderStroke, f5, paddingValues, mutableInteractionSource, i5, i6));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ab  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SuggestionChip(@p4.l v3.a<kotlin.r2> r32, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r33, @p4.m androidx.compose.ui.Modifier r34, boolean r35, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r36, @p4.m androidx.compose.ui.graphics.Shape r37, @p4.m androidx.compose.material3.ChipColors r38, @p4.m androidx.compose.material3.ChipElevation r39, @p4.m androidx.compose.foundation.BorderStroke r40, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r41, @p4.m androidx.compose.runtime.Composer r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.SuggestionChip(v3.a, v3.p, androidx.compose.ui.Modifier, boolean, v3.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    @p4.l
    public static final ChipColors getDefaultSuggestionChipColors(@p4.l ColorScheme colorScheme) {
        ChipColors defaultSuggestionChipColorsCached$material3_release = colorScheme.getDefaultSuggestionChipColorsCached$material3_release();
        if (defaultSuggestionChipColorsCached$material3_release == null) {
            Color.Companion companion = Color.Companion;
            long m3769getTransparent0d7_KjU = companion.m3769getTransparent0d7_KjU();
            SuggestionChipTokens suggestionChipTokens = SuggestionChipTokens.INSTANCE;
            ChipColors chipColors = new ChipColors(m3769getTransparent0d7_KjU, ColorSchemeKt.fromToken(colorScheme, suggestionChipTokens.getLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, suggestionChipTokens.getLeadingIconColor()), companion.m3770getUnspecified0d7_KjU(), companion.m3769getTransparent0d7_KjU(), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, suggestionChipTokens.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, suggestionChipTokens.getDisabledLeadingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), companion.m3770getUnspecified0d7_KjU(), null);
            colorScheme.setDefaultSuggestionChipColorsCached$material3_release(chipColors);
            return chipColors;
        }
        return defaultSuggestionChipColorsCached$material3_release;
    }

    private static final PaddingValues inputChipPadding(boolean z4, boolean z5, boolean z6) {
        float f5;
        float f6;
        if (!z4 && z5) {
            f5 = 8;
        } else {
            f5 = 4;
        }
        float m6044constructorimpl = Dp.m6044constructorimpl(f5);
        if (z6) {
            f6 = 8;
        } else {
            f6 = 4;
        }
        return PaddingKt.m550PaddingValuesa9UjIt4$default(m6044constructorimpl, 0.0f, Dp.m6044constructorimpl(f6), 0.0f, 10, null);
    }

    static /* synthetic */ PaddingValues inputChipPadding$default(boolean z4, boolean z5, boolean z6, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = false;
        }
        if ((i5 & 2) != 0) {
            z5 = false;
        }
        if ((i5 & 4) != 0) {
            z6 = false;
        }
        return inputChipPadding(z4, z5, z6);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01cd  */
    @androidx.compose.runtime.Composable
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility. Use version with ElevatedAssistChip that take a BorderStroke instead", replaceWith = @kotlin.b1(expression = "ElevatedAssistChip(onClick, label, modifier, enabled,leadingIcon, trailingIcon, shape, colors, elevation, border, interactionSource", imports = {}))
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void ElevatedAssistChip(v3.a r37, v3.p r38, androidx.compose.ui.Modifier r39, boolean r40, v3.p r41, v3.p r42, androidx.compose.ui.graphics.Shape r43, androidx.compose.material3.ChipColors r44, androidx.compose.material3.ChipElevation r45, androidx.compose.material3.ChipBorder r46, androidx.compose.foundation.interaction.MutableInteractionSource r47, androidx.compose.runtime.Composer r48, int r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 841
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.ElevatedAssistChip(v3.a, v3.p, androidx.compose.ui.Modifier, boolean, v3.p, v3.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.material3.ChipBorder, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a7  */
    @androidx.compose.runtime.Composable
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility. Use version with ElevatedSuggestionChip that take a BorderStroke instead", replaceWith = @kotlin.b1(expression = "ElevatedSuggestionChip(onClick, label, modifier, enabled, icon, shape, colors, elevation, border, interactionSource", imports = {}))
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void ElevatedSuggestionChip(v3.a r32, v3.p r33, androidx.compose.ui.Modifier r34, boolean r35, v3.p r36, androidx.compose.ui.graphics.Shape r37, androidx.compose.material3.ChipColors r38, androidx.compose.material3.ChipElevation r39, androidx.compose.material3.ChipBorder r40, androidx.compose.foundation.interaction.MutableInteractionSource r41, androidx.compose.runtime.Composer r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.ElevatedSuggestionChip(v3.a, v3.p, androidx.compose.ui.Modifier, boolean, v3.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.material3.ChipBorder, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x032b  */
    @androidx.compose.runtime.Composable
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility. Use version with AssistChip that take a BorderStroke instead", replaceWith = @kotlin.b1(expression = "AssistChip(onClick, label, modifier, enabled,leadingIcon, trailingIcon, shape, colors, elevation, border, interactionSource", imports = {}))
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void AssistChip(v3.a r37, v3.p r38, androidx.compose.ui.Modifier r39, boolean r40, v3.p r41, v3.p r42, androidx.compose.ui.graphics.Shape r43, androidx.compose.material3.ChipColors r44, androidx.compose.material3.ChipElevation r45, androidx.compose.material3.ChipBorder r46, androidx.compose.foundation.interaction.MutableInteractionSource r47, androidx.compose.runtime.Composer r48, int r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 855
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.AssistChip(v3.a, v3.p, androidx.compose.ui.Modifier, boolean, v3.p, v3.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.material3.ChipBorder, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0194  */
    @androidx.compose.runtime.Composable
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility. Use version with SuggestionChip that take a BorderStroke instead", replaceWith = @kotlin.b1(expression = "SuggestionChip(onClick, label, modifier, enabled, icon, shape, colors, elevation, border, interactionSource", imports = {}))
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void SuggestionChip(v3.a r32, v3.p r33, androidx.compose.ui.Modifier r34, boolean r35, v3.p r36, androidx.compose.ui.graphics.Shape r37, androidx.compose.material3.ChipColors r38, androidx.compose.material3.ChipElevation r39, androidx.compose.material3.ChipBorder r40, androidx.compose.foundation.interaction.MutableInteractionSource r41, androidx.compose.runtime.Composer r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.SuggestionChip(v3.a, v3.p, androidx.compose.ui.Modifier, boolean, v3.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.material3.ChipBorder, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }
}
