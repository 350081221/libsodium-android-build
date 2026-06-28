package com.lody.virtual.server.pm;

import android.content.ComponentName;
import android.content.SharedPreferences;
import android.util.SparseArray;
import com.lody.virtual.client.core.VirtualCore;
import java.util.Map;

/* loaded from: classes3.dex */
public class ComponentStateManager {
    private static SparseArray<UserComponentState> helpers = new SparseArray<>();

    /* loaded from: classes3.dex */
    public static class UserComponentState {
        private SharedPreferences sharedPreferences;

        private String componentKey(ComponentName componentName) {
            return componentName.getPackageName() + "@" + componentName.getClassName();
        }

        public void clear(String str) {
            Map<String, ?> all = this.sharedPreferences.getAll();
            if (all == null) {
                return;
            }
            for (String str2 : all.keySet()) {
                if (str2.startsWith(str + "@")) {
                    this.sharedPreferences.edit().remove(str2).apply();
                }
            }
        }

        public void clearAll() {
            this.sharedPreferences.edit().clear().apply();
        }

        public int get(ComponentName componentName) {
            return this.sharedPreferences.getInt(componentKey(componentName), 0);
        }

        public void set(ComponentName componentName, int i5) {
            this.sharedPreferences.edit().putInt(componentKey(componentName), i5).apply();
        }

        private UserComponentState(int i5) {
            this.sharedPreferences = VirtualCore.get().getContext().getSharedPreferences("va_components_state_u" + i5, 0);
        }
    }

    public static synchronized UserComponentState user(int i5) {
        UserComponentState userComponentState;
        synchronized (ComponentStateManager.class) {
            userComponentState = helpers.get(i5);
            if (userComponentState == null) {
                userComponentState = new UserComponentState(i5);
                helpers.put(i5, userComponentState);
            }
        }
        return userComponentState;
    }
}
