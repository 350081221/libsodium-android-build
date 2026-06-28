package androidx.core.view.contentcapture;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewStructureCompat;
import androidx.core.view.autofill.AutofillIdCompat;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public class ContentCaptureSessionCompat {
    private static final String KEY_VIEW_TREE_APPEARED = "TREAT_AS_VIEW_TREE_APPEARED";
    private static final String KEY_VIEW_TREE_APPEARING = "TREAT_AS_VIEW_TREE_APPEARING";
    private final View mView;
    private final Object mWrappedObj;

    @RequiresApi(23)
    /* loaded from: classes2.dex */
    private static class Api23Impl {
        private Api23Impl() {
        }

        @DoNotInline
        static Bundle getExtras(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }
    }

    @RequiresApi(29)
    /* loaded from: classes2.dex */
    private static class Api29Impl {
        private Api29Impl() {
        }

        @DoNotInline
        static AutofillId newAutofillId(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j5) {
            AutofillId newAutofillId;
            newAutofillId = contentCaptureSession.newAutofillId(autofillId, j5);
            return newAutofillId;
        }

        @DoNotInline
        static ViewStructure newViewStructure(ContentCaptureSession contentCaptureSession, View view) {
            ViewStructure newViewStructure;
            newViewStructure = contentCaptureSession.newViewStructure(view);
            return newViewStructure;
        }

        @DoNotInline
        static ViewStructure newVirtualViewStructure(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j5) {
            ViewStructure newVirtualViewStructure;
            newVirtualViewStructure = contentCaptureSession.newVirtualViewStructure(autofillId, j5);
            return newVirtualViewStructure;
        }

        @DoNotInline
        static void notifyViewAppeared(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        @DoNotInline
        public static void notifyViewTextChanged(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }

        @DoNotInline
        static void notifyViewsDisappeared(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }
    }

    @RequiresApi(34)
    /* loaded from: classes2.dex */
    private static class Api34Impl {
        private Api34Impl() {
        }

        @DoNotInline
        static void notifyViewsAppeared(ContentCaptureSession contentCaptureSession, List<ViewStructure> list) {
            contentCaptureSession.notifyViewsAppeared(list);
        }
    }

    @RequiresApi(29)
    private ContentCaptureSessionCompat(@NonNull ContentCaptureSession contentCaptureSession, @NonNull View view) {
        this.mWrappedObj = contentCaptureSession;
        this.mView = view;
    }

    @NonNull
    @RequiresApi(29)
    public static ContentCaptureSessionCompat toContentCaptureSessionCompat(@NonNull ContentCaptureSession contentCaptureSession, @NonNull View view) {
        return new ContentCaptureSessionCompat(contentCaptureSession, view);
    }

    @Nullable
    public AutofillId newAutofillId(long j5) {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession contentCaptureSession = (ContentCaptureSession) this.mWrappedObj;
            AutofillIdCompat autofillId = ViewCompat.getAutofillId(this.mView);
            Objects.requireNonNull(autofillId);
            return Api29Impl.newAutofillId(contentCaptureSession, autofillId.toAutofillId(), j5);
        }
        return null;
    }

    @Nullable
    public ViewStructureCompat newVirtualViewStructure(@NonNull AutofillId autofillId, long j5) {
        if (Build.VERSION.SDK_INT >= 29) {
            return ViewStructureCompat.toViewStructureCompat(Api29Impl.newVirtualViewStructure((ContentCaptureSession) this.mWrappedObj, autofillId, j5));
        }
        return null;
    }

    public void notifyViewTextChanged(@NonNull AutofillId autofillId, @Nullable CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.notifyViewTextChanged((ContentCaptureSession) this.mWrappedObj, autofillId, charSequence);
        }
    }

    public void notifyViewsAppeared(@NonNull List<ViewStructure> list) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 34) {
            Api34Impl.notifyViewsAppeared((ContentCaptureSession) this.mWrappedObj, list);
            return;
        }
        if (i5 >= 29) {
            ViewStructure newViewStructure = Api29Impl.newViewStructure((ContentCaptureSession) this.mWrappedObj, this.mView);
            Api23Impl.getExtras(newViewStructure).putBoolean(KEY_VIEW_TREE_APPEARING, true);
            Api29Impl.notifyViewAppeared((ContentCaptureSession) this.mWrappedObj, newViewStructure);
            for (int i6 = 0; i6 < list.size(); i6++) {
                Api29Impl.notifyViewAppeared((ContentCaptureSession) this.mWrappedObj, list.get(i6));
            }
            ViewStructure newViewStructure2 = Api29Impl.newViewStructure((ContentCaptureSession) this.mWrappedObj, this.mView);
            Api23Impl.getExtras(newViewStructure2).putBoolean(KEY_VIEW_TREE_APPEARED, true);
            Api29Impl.notifyViewAppeared((ContentCaptureSession) this.mWrappedObj, newViewStructure2);
        }
    }

    public void notifyViewsDisappeared(@NonNull long[] jArr) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 34) {
            ContentCaptureSession contentCaptureSession = (ContentCaptureSession) this.mWrappedObj;
            AutofillIdCompat autofillId = ViewCompat.getAutofillId(this.mView);
            Objects.requireNonNull(autofillId);
            Api29Impl.notifyViewsDisappeared(contentCaptureSession, autofillId.toAutofillId(), jArr);
            return;
        }
        if (i5 >= 29) {
            ViewStructure newViewStructure = Api29Impl.newViewStructure((ContentCaptureSession) this.mWrappedObj, this.mView);
            Api23Impl.getExtras(newViewStructure).putBoolean(KEY_VIEW_TREE_APPEARING, true);
            Api29Impl.notifyViewAppeared((ContentCaptureSession) this.mWrappedObj, newViewStructure);
            ContentCaptureSession contentCaptureSession2 = (ContentCaptureSession) this.mWrappedObj;
            AutofillIdCompat autofillId2 = ViewCompat.getAutofillId(this.mView);
            Objects.requireNonNull(autofillId2);
            Api29Impl.notifyViewsDisappeared(contentCaptureSession2, autofillId2.toAutofillId(), jArr);
            ViewStructure newViewStructure2 = Api29Impl.newViewStructure((ContentCaptureSession) this.mWrappedObj, this.mView);
            Api23Impl.getExtras(newViewStructure2).putBoolean(KEY_VIEW_TREE_APPEARED, true);
            Api29Impl.notifyViewAppeared((ContentCaptureSession) this.mWrappedObj, newViewStructure2);
        }
    }

    @NonNull
    @RequiresApi(29)
    public ContentCaptureSession toContentCaptureSession() {
        return (ContentCaptureSession) this.mWrappedObj;
    }
}
