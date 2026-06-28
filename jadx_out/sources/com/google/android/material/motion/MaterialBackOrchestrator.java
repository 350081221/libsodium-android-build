package com.google.android.material.motion;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.BackEventCompat;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.Objects;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class MaterialBackOrchestrator {

    @Nullable
    private final BackCallbackDelegate backCallbackDelegate;

    @NonNull
    private final MaterialBackHandler backHandler;

    @NonNull
    private final View view;

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(33)
    /* loaded from: classes2.dex */
    public static class Api33BackCallbackDelegate implements BackCallbackDelegate {

        @Nullable
        private OnBackInvokedCallback onBackInvokedCallback;

        private Api33BackCallbackDelegate() {
        }

        OnBackInvokedCallback createOnBackInvokedCallback(@NonNull final MaterialBackHandler materialBackHandler) {
            Objects.requireNonNull(materialBackHandler);
            return new OnBackInvokedCallback() { // from class: com.google.android.material.motion.a
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    MaterialBackHandler.this.handleBackInvoked();
                }
            };
        }

        boolean isListeningForBackCallbacks() {
            return this.onBackInvokedCallback != null;
        }

        @Override // com.google.android.material.motion.MaterialBackOrchestrator.BackCallbackDelegate
        @DoNotInline
        public void startListeningForBackCallbacks(@NonNull MaterialBackHandler materialBackHandler, @NonNull View view, boolean z4) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            int i5;
            if (this.onBackInvokedCallback != null || (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            OnBackInvokedCallback createOnBackInvokedCallback = createOnBackInvokedCallback(materialBackHandler);
            this.onBackInvokedCallback = createOnBackInvokedCallback;
            if (z4) {
                i5 = 1000000;
            } else {
                i5 = 0;
            }
            findOnBackInvokedDispatcher.registerOnBackInvokedCallback(i5, createOnBackInvokedCallback);
        }

        @Override // com.google.android.material.motion.MaterialBackOrchestrator.BackCallbackDelegate
        @DoNotInline
        public void stopListeningForBackCallbacks(@NonNull View view) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
            if (findOnBackInvokedDispatcher == null) {
                return;
            }
            findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.onBackInvokedCallback);
            this.onBackInvokedCallback = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(34)
    /* loaded from: classes2.dex */
    public static class Api34BackCallbackDelegate extends Api33BackCallbackDelegate {
        private Api34BackCallbackDelegate() {
            super();
        }

        @Override // com.google.android.material.motion.MaterialBackOrchestrator.Api33BackCallbackDelegate
        OnBackInvokedCallback createOnBackInvokedCallback(@NonNull final MaterialBackHandler materialBackHandler) {
            return new OnBackAnimationCallback() { // from class: com.google.android.material.motion.MaterialBackOrchestrator.Api34BackCallbackDelegate.1
                @Override // android.window.OnBackAnimationCallback
                public void onBackCancelled() {
                    if (!Api34BackCallbackDelegate.this.isListeningForBackCallbacks()) {
                        return;
                    }
                    materialBackHandler.cancelBackProgress();
                }

                @Override // android.window.OnBackInvokedCallback
                public void onBackInvoked() {
                    materialBackHandler.handleBackInvoked();
                }

                @Override // android.window.OnBackAnimationCallback
                public void onBackProgressed(@NonNull BackEvent backEvent) {
                    if (!Api34BackCallbackDelegate.this.isListeningForBackCallbacks()) {
                        return;
                    }
                    materialBackHandler.updateBackProgress(new BackEventCompat(backEvent));
                }

                @Override // android.window.OnBackAnimationCallback
                public void onBackStarted(@NonNull BackEvent backEvent) {
                    if (!Api34BackCallbackDelegate.this.isListeningForBackCallbacks()) {
                        return;
                    }
                    materialBackHandler.startBackProgress(new BackEventCompat(backEvent));
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public interface BackCallbackDelegate {
        void startListeningForBackCallbacks(@NonNull MaterialBackHandler materialBackHandler, @NonNull View view, boolean z4);

        void stopListeningForBackCallbacks(@NonNull View view);
    }

    public <T extends View & MaterialBackHandler> MaterialBackOrchestrator(@NonNull T t5) {
        this(t5, t5);
    }

    @Nullable
    private static BackCallbackDelegate createBackCallbackDelegate() {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 34) {
            return new Api34BackCallbackDelegate();
        }
        if (i5 < 33) {
            return null;
        }
        return new Api33BackCallbackDelegate();
    }

    public boolean shouldListenForBackCallbacks() {
        return this.backCallbackDelegate != null;
    }

    public void startListeningForBackCallbacks() {
        startListeningForBackCallbacks(false);
    }

    public void startListeningForBackCallbacksWithPriorityOverlay() {
        startListeningForBackCallbacks(true);
    }

    public void stopListeningForBackCallbacks() {
        BackCallbackDelegate backCallbackDelegate = this.backCallbackDelegate;
        if (backCallbackDelegate != null) {
            backCallbackDelegate.stopListeningForBackCallbacks(this.view);
        }
    }

    public MaterialBackOrchestrator(@NonNull MaterialBackHandler materialBackHandler, @NonNull View view) {
        this.backCallbackDelegate = createBackCallbackDelegate();
        this.backHandler = materialBackHandler;
        this.view = view;
    }

    private void startListeningForBackCallbacks(boolean z4) {
        BackCallbackDelegate backCallbackDelegate = this.backCallbackDelegate;
        if (backCallbackDelegate != null) {
            backCallbackDelegate.startListeningForBackCallbacks(this.backHandler, this.view, z4);
        }
    }
}
