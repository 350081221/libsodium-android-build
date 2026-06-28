package androidx.compose.ui.platform;

import android.content.ClipData;
import android.content.ClipDescription;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/platform/AndroidClipboardManager;", "Landroidx/compose/ui/platform/ClipboardManager;", "Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "Lkotlin/r2;", "setText", "getText", "", "hasText", "Landroid/content/ClipboardManager;", "clipboardManager", "Landroid/content/ClipboardManager;", "<init>", "(Landroid/content/ClipboardManager;)V", "Landroid/content/Context;", com.umeng.analytics.pro.d.X, "(Landroid/content/Context;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AndroidClipboardManager implements ClipboardManager {
    public static final int $stable = 8;

    @p4.l
    private final android.content.ClipboardManager clipboardManager;

    public AndroidClipboardManager(@p4.l android.content.ClipboardManager clipboardManager) {
        this.clipboardManager = clipboardManager;
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    @p4.m
    public AnnotatedString getText() {
        ClipData primaryClip = this.clipboardManager.getPrimaryClip();
        CharSequence charSequence = null;
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return null;
        }
        ClipData.Item itemAt = primaryClip.getItemAt(0);
        if (itemAt != null) {
            charSequence = itemAt.getText();
        }
        return AndroidClipboardManager_androidKt.convertToAnnotatedString(charSequence);
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    public boolean hasText() {
        ClipDescription primaryClipDescription = this.clipboardManager.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    public void setText(@p4.l AnnotatedString annotatedString) {
        this.clipboardManager.setPrimaryClip(ClipData.newPlainText("plain text", AndroidClipboardManager_androidKt.convertToCharSequence(annotatedString)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AndroidClipboardManager(@p4.l android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "clipboard"
            java.lang.Object r2 = r2.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.content.ClipboardManager"
            kotlin.jvm.internal.l0.n(r2, r0)
            android.content.ClipboardManager r2 = (android.content.ClipboardManager) r2
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidClipboardManager.<init>(android.content.Context):void");
    }
}
