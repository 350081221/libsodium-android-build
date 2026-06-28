package com.huawei.agconnect.common.api;

import android.text.TextUtils;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.datastore.annotation.DefaultCrypto;
import com.huawei.agconnect.datastore.core.SharedPrefUtil;
import com.huawei.agconnect.exception.AGCException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public class RequestThrottle {
    private static final String TAG = "AGC_THROTTLE";
    private final Map<String, Throttle> throttleMap = new HashMap();
    private static final Object LOCK = new Object();
    private static final RequestThrottle INSTANCE = new RequestThrottle();

    /* loaded from: classes3.dex */
    public static class Throttle {
        private static final Object LOCK = new Object();
        private static final int MAX_REQUEST_COUNT_IN_INTERVAL = 20;
        private static final String SP_FILE_NAME = "com.huawei.agc.throttle";
        private static final long THROTTLE_INTERVAL_TIME = 3600000;
        private final ArrayDeque<Long> countDeque = new ArrayDeque<>();
        private Integer failCount;
        private Long failTime;
        private boolean isDeveloperMode;
        private final String name;

        Throttle(String str) {
            this.name = str;
            loadCache();
        }

        private long getFirst() {
            try {
                return this.countDeque.getFirst().longValue();
            } catch (NoSuchElementException unused) {
                return 0L;
            }
        }

        private void loadCache() {
            String[] split = ((String) SharedPrefUtil.getInstance().get(SP_FILE_NAME, this.name + "-countDeque", String.class, "", DefaultCrypto.class)).split(",");
            int length = split.length;
            for (int i5 = 0; i5 < length; i5++) {
                String str = split[i5];
                try {
                    if (str.length() > 0) {
                        this.countDeque.addLast(Long.valueOf(str));
                    }
                } catch (NumberFormatException e5) {
                    Logger.e(RequestThrottle.TAG, "count deque", e5);
                }
            }
            this.failCount = (Integer) SharedPrefUtil.getInstance().get(SP_FILE_NAME, this.name + "-failCount", Integer.class, 0, DefaultCrypto.class);
            this.failTime = (Long) SharedPrefUtil.getInstance().get(SP_FILE_NAME, this.name + "-failTime", Long.class, 0L, DefaultCrypto.class);
        }

        private void saveCache() {
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList = new ArrayList(this.countDeque);
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                sb.append(arrayList.get(i5));
                if (i5 != arrayList.size() - 1) {
                    sb.append(",");
                }
            }
            SharedPrefUtil.getInstance().put(SP_FILE_NAME, this.name + "-countDeque", String.class, sb.toString(), DefaultCrypto.class);
            SharedPrefUtil.getInstance().put(SP_FILE_NAME, this.name + "-failCount", Integer.class, this.failCount, DefaultCrypto.class);
            SharedPrefUtil.getInstance().put(SP_FILE_NAME, this.name + "-failTime", Long.class, this.failTime, DefaultCrypto.class);
        }

        public void addForFail() {
            synchronized (LOCK) {
                this.failCount = Integer.valueOf(this.failCount.intValue() + 1);
                this.failTime = Long.valueOf(System.currentTimeMillis());
                saveCache();
            }
        }

        public void addForStart() {
            synchronized (LOCK) {
                if (this.countDeque.size() == 20) {
                    this.countDeque.pollFirst();
                }
                this.countDeque.addLast(Long.valueOf(System.currentTimeMillis()));
            }
        }

        public void addForSuccess() {
            synchronized (LOCK) {
                this.failCount = 0;
                this.failTime = 0L;
                saveCache();
            }
        }

        public boolean checkFail(Exception exc) {
            if (!(exc instanceof AGCException)) {
                return false;
            }
            AGCException aGCException = (AGCException) exc;
            return aGCException.getCode() == 429 || aGCException.getCode() == 500 || aGCException.getCode() == 502 || aGCException.getCode() == 503 || aGCException.getCode() == 504;
        }

        public long getEndTime() {
            synchronized (LOCK) {
                if (!this.isDeveloperMode && this.countDeque.size() >= 20 && System.currentTimeMillis() - getFirst() < 3600000) {
                    return (getFirst() + 3600000) - System.currentTimeMillis();
                }
                if (this.failCount.intValue() > 1 && this.failTime.longValue() > 0) {
                    long pow = ((long) Math.pow(2.0d, Math.min(this.failCount.intValue() - 1, 8))) * 60 * 1000;
                    if (System.currentTimeMillis() < this.failTime.longValue() + pow) {
                        return (this.failTime.longValue() + pow) - System.currentTimeMillis();
                    }
                }
                return 0L;
            }
        }

        public void setDeveloperMode(boolean z4) {
            this.isDeveloperMode = z4;
        }
    }

    private RequestThrottle() {
    }

    public static RequestThrottle getInstance() {
        return INSTANCE;
    }

    public Throttle get(AGConnectInstance aGConnectInstance, String str) {
        synchronized (LOCK) {
            if (TextUtils.isEmpty(str)) {
                throw new RuntimeException("throttle name can not be empty");
            }
            if (aGConnectInstance == null) {
                aGConnectInstance = AGConnectInstance.getInstance();
            }
            String format = String.format(Locale.ENGLISH, "%s_%s", str, aGConnectInstance.getOptions().getIdentifier());
            if (this.throttleMap.containsKey(format)) {
                return this.throttleMap.get(format);
            }
            Throttle throttle = new Throttle(format);
            this.throttleMap.put(format, throttle);
            return throttle;
        }
    }

    public Throttle get(String str) {
        return get(null, str);
    }
}
