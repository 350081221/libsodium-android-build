package androidx.compose.foundation.text2.input.internal;

import androidx.annotation.VisibleForTesting;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a:\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u0080@¢\u0006\u0004\b\n\u0010\u000b\u001a\u001c\u0010\u000f\u001a\u00020\u0007*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002\u001a \u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0017H\u0002\"\u001a\u0010\u001a\u001a\u00020\u00138\u0000X\u0081T¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001c\u0010\u001d\"\u0014\u0010\u001e\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Landroidx/compose/ui/platform/PlatformTextInputSession;", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "state", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/ImeAction;", "Lkotlin/r2;", "onImeAction", "", "platformSpecificTextInputSession", "(Landroidx/compose/ui/platform/PlatformTextInputSession;Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/input/ImeOptions;Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroid/view/inputmethod/EditorInfo;", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "textFieldValue", "update", "", "bits", "flag", "", "hasFlag", "", TTDownloadField.TT_TAG, "Lkotlin/Function0;", "content", "logDebug", "TIA_DEBUG", "Z", "getTIA_DEBUG$annotations", "()V", "TAG", "Ljava/lang/String;", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AndroidTextInputSession_androidKt {

    @l
    private static final String TAG = "AndroidTextInputSession";
    public static final boolean TIA_DEBUG = false;

    @VisibleForTesting
    public static /* synthetic */ void getTIA_DEBUG$annotations() {
    }

    private static final boolean hasFlag(int i5, int i6) {
        return (i5 & i6) == i6;
    }

    private static final void logDebug(String str, v3.a<String> aVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void logDebug$default(String str, v3.a aVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = TAG;
        }
        logDebug(str, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object platformSpecificTextInputSession(@p4.l androidx.compose.ui.platform.PlatformTextInputSession r11, @p4.l androidx.compose.foundation.text2.input.internal.TransformedTextFieldState r12, @p4.l androidx.compose.ui.text.input.ImeOptions r13, @p4.m v3.l<? super androidx.compose.ui.text.input.ImeAction, kotlin.r2> r14, @p4.l kotlin.coroutines.d<?> r15) {
        /*
            boolean r0 = r15 instanceof androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1
            if (r0 == 0) goto L13
            r0 = r15
            androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1 r0 = (androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1 r0 = new androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2d:
            kotlin.e1.n(r15)
            goto L50
        L31:
            kotlin.e1.n(r15)
            android.view.View r15 = r11.getView()
            androidx.compose.foundation.text2.input.internal.ComposeInputMethodManager r7 = androidx.compose.foundation.text2.input.internal.ComposeInputMethodManager_androidKt.ComposeInputMethodManager(r15)
            androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2 r15 = new androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2
            r10 = 0
            r4 = r15
            r5 = r11
            r6 = r12
            r8 = r13
            r9 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.label = r3
            java.lang.Object r11 = kotlinx.coroutines.t0.g(r15, r0)
            if (r11 != r1) goto L50
            return r1
        L50:
            kotlin.y r11 = new kotlin.y
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt.platformSpecificTextInputSession(androidx.compose.ui.platform.PlatformTextInputSession, androidx.compose.foundation.text2.input.internal.TransformedTextFieldState, androidx.compose.ui.text.input.ImeOptions, v3.l, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void update(@p4.l android.view.inputmethod.EditorInfo r7, @p4.l androidx.compose.foundation.text2.input.TextFieldCharSequence r8, @p4.l androidx.compose.ui.text.input.ImeOptions r9) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt.update(android.view.inputmethod.EditorInfo, androidx.compose.foundation.text2.input.TextFieldCharSequence, androidx.compose.ui.text.input.ImeOptions):void");
    }
}
