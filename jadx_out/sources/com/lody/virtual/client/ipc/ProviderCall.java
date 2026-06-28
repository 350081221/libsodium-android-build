package com.lody.virtual.client.ipc;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.helper.compat.ContentProviderCompat;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class ProviderCall {

    /* loaded from: classes3.dex */
    public static final class Builder {
        private String arg;
        private String auth;
        private Context context;
        private String method;
        private Bundle bundle = new Bundle();
        private int retryCount = 5;

        public Builder(Context context, String str) {
            this.context = context;
            this.auth = str;
        }

        public Builder addArg(String str, Object obj) {
            if (obj != null) {
                if (obj instanceof Boolean) {
                    this.bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Integer) {
                    this.bundle.putInt(str, ((Integer) obj).intValue());
                } else if (obj instanceof String) {
                    this.bundle.putString(str, (String) obj);
                } else if (obj instanceof Serializable) {
                    this.bundle.putSerializable(str, (Serializable) obj);
                } else if (obj instanceof Bundle) {
                    this.bundle.putBundle(str, (Bundle) obj);
                } else if (obj instanceof Parcelable) {
                    this.bundle.putParcelable(str, (Parcelable) obj);
                } else if (obj instanceof int[]) {
                    this.bundle.putIntArray(str, (int[]) obj);
                } else {
                    throw new IllegalArgumentException("Unknown type " + obj.getClass() + " in Bundle.");
                }
            }
            return this;
        }

        public Builder arg(String str) {
            this.arg = str;
            return this;
        }

        public Bundle call() throws IllegalAccessException {
            return ProviderCall.call(this.auth, this.context, this.method, this.arg, this.bundle, this.retryCount);
        }

        public Bundle callSafely() {
            try {
                return call();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }

        public Builder methodName(String str) {
            this.method = str;
            return this;
        }

        public Builder retry(int i5) {
            this.retryCount = i5;
            return this;
        }
    }

    public static Bundle call(String str, Context context, String str2, String str3, Bundle bundle, int i5) throws IllegalAccessException {
        return ContentProviderCompat.call(context, Uri.parse("content://" + str), str2, str3, bundle, i5);
    }

    public static Bundle callSafely(String str, String str2, String str3, Bundle bundle) {
        return callSafely(str, str2, str3, bundle, 3);
    }

    public static Bundle callSafely(String str, String str2, String str3, Bundle bundle, int i5) {
        try {
            return call(str, VirtualCore.get().getContext(), str2, str3, bundle, i5);
        } catch (IllegalAccessException e5) {
            e5.printStackTrace();
            return null;
        }
    }
}
