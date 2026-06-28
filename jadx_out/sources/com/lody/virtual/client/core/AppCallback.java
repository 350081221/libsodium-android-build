package com.lody.virtual.client.core;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

/* loaded from: classes3.dex */
public interface AppCallback {
    public static final AppCallback EMPTY = new AppCallback() { // from class: com.lody.virtual.client.core.AppCallback.1
        @Override // com.lody.virtual.client.core.AppCallback
        public void afterActivityOnCreate(Activity activity) {
        }

        @Override // com.lody.virtual.client.core.AppCallback
        public void afterActivityOnDestroy(Activity activity) {
        }

        @Override // com.lody.virtual.client.core.AppCallback
        public void afterActivityOnResume(Activity activity) {
        }

        @Override // com.lody.virtual.client.core.AppCallback
        public void afterActivityOnStart(Activity activity) {
        }

        @Override // com.lody.virtual.client.core.AppCallback
        public void afterActivityOnStop(Activity activity) {
        }

        @Override // com.lody.virtual.client.core.AppCallback
        public void afterApplicationCreate(String str, String str2, Application application) {
        }

        @Override // com.lody.virtual.client.core.AppCallback
        public void beforeActivityOnCreate(Activity activity) {
        }

        @Override // com.lody.virtual.client.core.AppCallback
        public void beforeActivityOnDestroy(Activity activity) {
        }

        @Override // com.lody.virtual.client.core.AppCallback
        public void beforeActivityOnResume(Activity activity) {
        }

        @Override // com.lody.virtual.client.core.AppCallback
        public void beforeActivityOnStart(Activity activity) {
        }

        @Override // com.lody.virtual.client.core.AppCallback
        public void beforeActivityOnStop(Activity activity) {
        }

        @Override // com.lody.virtual.client.core.AppCallback
        public void beforeApplicationCreate(String str, String str2, Application application) {
        }

        @Override // com.lody.virtual.client.core.AppCallback
        public void beforeStartApplication(String str, String str2, Context context) {
        }
    };

    void afterActivityOnCreate(Activity activity);

    void afterActivityOnDestroy(Activity activity);

    void afterActivityOnResume(Activity activity);

    void afterActivityOnStart(Activity activity);

    void afterActivityOnStop(Activity activity);

    void afterApplicationCreate(String str, String str2, Application application);

    void beforeActivityOnCreate(Activity activity);

    void beforeActivityOnDestroy(Activity activity);

    void beforeActivityOnResume(Activity activity);

    void beforeActivityOnStart(Activity activity);

    void beforeActivityOnStop(Activity activity);

    void beforeApplicationCreate(String str, String str2, Application application);

    void beforeStartApplication(String str, String str2, Context context);
}
