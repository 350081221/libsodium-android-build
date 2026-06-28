package androidx.compose.foundation.text;

import kotlin.i0;

@i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0004H&J\u001a\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0006J\u001a\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0004H&J\b\u0010\u0010\u001a\u00020\u0004H&ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/TextDragObserver;", "", "Landroidx/compose/ui/geometry/Offset;", "point", "Lkotlin/r2;", "onDown-k-4lQ0M", "(J)V", "onDown", "onUp", "startPoint", "onStart-k-4lQ0M", "onStart", "delta", "onDrag-k-4lQ0M", "onDrag", "onStop", "onCancel", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface TextDragObserver {
    void onCancel();

    /* renamed from: onDown-k-4lQ0M, reason: not valid java name */
    void mo895onDownk4lQ0M(long j5);

    /* renamed from: onDrag-k-4lQ0M, reason: not valid java name */
    void mo896onDragk4lQ0M(long j5);

    /* renamed from: onStart-k-4lQ0M, reason: not valid java name */
    void mo897onStartk4lQ0M(long j5);

    void onStop();

    void onUp();
}
