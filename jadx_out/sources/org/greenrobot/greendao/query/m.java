package org.greenrobot.greendao.query;

import java.util.Date;
import java.util.List;

/* loaded from: classes4.dex */
public interface m {
    void a(List<Object> list);

    void b(StringBuilder sb, String str);

    /* loaded from: classes4.dex */
    public static class c extends a {

        /* renamed from: d, reason: collision with root package name */
        protected final String f21451d;

        public c(String str) {
            this.f21451d = str;
        }

        @Override // org.greenrobot.greendao.query.m
        public void b(StringBuilder sb, String str) {
            sb.append(this.f21451d);
        }

        public c(String str, Object obj) {
            super(obj);
            this.f21451d = str;
        }

        public c(String str, Object... objArr) {
            super(objArr);
            this.f21451d = str;
        }
    }

    /* loaded from: classes4.dex */
    public static class b extends a {

        /* renamed from: d, reason: collision with root package name */
        public final org.greenrobot.greendao.i f21449d;

        /* renamed from: e, reason: collision with root package name */
        public final String f21450e;

        public b(org.greenrobot.greendao.i iVar, String str) {
            this.f21449d = iVar;
            this.f21450e = str;
        }

        private static Object c(org.greenrobot.greendao.i iVar, Object obj) {
            if (obj != null && obj.getClass().isArray()) {
                throw new org.greenrobot.greendao.d("Illegal value: found array, but simple object required");
            }
            Class<?> cls = iVar.f21357b;
            if (cls == Date.class) {
                if (obj instanceof Date) {
                    return Long.valueOf(((Date) obj).getTime());
                }
                if (obj instanceof Long) {
                    return obj;
                }
                throw new org.greenrobot.greendao.d("Illegal date value: expected java.util.Date or Long for value " + obj);
            }
            if (cls == Boolean.TYPE || cls == Boolean.class) {
                if (obj instanceof Boolean) {
                    return Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
                }
                if (obj instanceof Number) {
                    int intValue = ((Number) obj).intValue();
                    if (intValue != 0 && intValue != 1) {
                        throw new org.greenrobot.greendao.d("Illegal boolean value: numbers must be 0 or 1, but was " + obj);
                    }
                } else if (obj instanceof String) {
                    String str = (String) obj;
                    if ("TRUE".equalsIgnoreCase(str)) {
                        return 1;
                    }
                    if ("FALSE".equalsIgnoreCase(str)) {
                        return 0;
                    }
                    throw new org.greenrobot.greendao.d("Illegal boolean value: Strings must be \"TRUE\" or \"FALSE\" (case insensitive), but was " + obj);
                }
            }
            return obj;
        }

        private static Object[] d(org.greenrobot.greendao.i iVar, Object[] objArr) {
            for (int i5 = 0; i5 < objArr.length; i5++) {
                objArr[i5] = c(iVar, objArr[i5]);
            }
            return objArr;
        }

        @Override // org.greenrobot.greendao.query.m
        public void b(StringBuilder sb, String str) {
            org.greenrobot.greendao.internal.d.h(sb, str, this.f21449d).append(this.f21450e);
        }

        public b(org.greenrobot.greendao.i iVar, String str, Object obj) {
            super(c(iVar, obj));
            this.f21449d = iVar;
            this.f21450e = str;
        }

        public b(org.greenrobot.greendao.i iVar, String str, Object[] objArr) {
            super(d(iVar, objArr));
            this.f21449d = iVar;
            this.f21450e = str;
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class a implements m {

        /* renamed from: a, reason: collision with root package name */
        protected final boolean f21446a;

        /* renamed from: b, reason: collision with root package name */
        protected final Object f21447b;

        /* renamed from: c, reason: collision with root package name */
        protected final Object[] f21448c;

        public a() {
            this.f21446a = false;
            this.f21447b = null;
            this.f21448c = null;
        }

        @Override // org.greenrobot.greendao.query.m
        public void a(List<Object> list) {
            if (this.f21446a) {
                list.add(this.f21447b);
                return;
            }
            Object[] objArr = this.f21448c;
            if (objArr != null) {
                for (Object obj : objArr) {
                    list.add(obj);
                }
            }
        }

        public a(Object obj) {
            this.f21447b = obj;
            this.f21446a = true;
            this.f21448c = null;
        }

        public a(Object[] objArr) {
            this.f21447b = null;
            this.f21446a = false;
            this.f21448c = objArr;
        }
    }
}
