package com.huawei.agconnect.https;

import com.huawei.agconnect.https.annotation.Header;
import com.huawei.agconnect.https.annotation.HeaderMap;
import com.huawei.agconnect.https.annotation.Query;
import com.huawei.agconnect.https.annotation.Url;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.InvalidParameterException;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Map;
import okhttp3.HttpUrl;
import okhttp3.Request;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class a<Annotation, Builder> {

    /* renamed from: a, reason: collision with root package name */
    private static c f7970a = new c();

    /* renamed from: b, reason: collision with root package name */
    private static b f7971b = new b();

    /* renamed from: c, reason: collision with root package name */
    private static C0155a f7972c = new C0155a();

    /* renamed from: com.huawei.agconnect.https.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static class C0155a extends a<Header, Request.Builder> {
        C0155a() {
        }

        @Override // com.huawei.agconnect.https.a
        /* bridge */ /* synthetic */ Request.Builder a(Field field, Object obj, Request.Builder builder) {
            return a2(field, (Field) obj, builder);
        }

        /* renamed from: a, reason: avoid collision after fix types in other method */
        <RequestBean> Request.Builder a2(Field field, RequestBean requestbean, Request.Builder builder) {
            if (builder == null) {
                throw new IllegalArgumentException("builder cannot be null");
            }
            try {
                a.b(field);
                Object obj = field.get(requestbean);
                String value = ((Header) field.getAnnotation(Header.class)).value();
                if (value.isEmpty()) {
                    value = field.getName();
                }
                if (!String.class.equals(field.getType())) {
                    throw new InvalidParameterException("Header should be the annotation of String type");
                }
                String str = (String) obj;
                if (!h.a(str)) {
                    builder.addHeader(value, str);
                }
                return builder;
            } catch (IllegalAccessException e5) {
                throw new RuntimeException(e5);
            }
        }
    }

    /* loaded from: classes3.dex */
    static class b extends a<HeaderMap, Request.Builder> {
        b() {
        }

        @Override // com.huawei.agconnect.https.a
        /* bridge */ /* synthetic */ Request.Builder a(Field field, Object obj, Request.Builder builder) {
            return a2(field, (Field) obj, builder);
        }

        /* renamed from: a, reason: avoid collision after fix types in other method */
        <RequestBean> Request.Builder a2(Field field, RequestBean requestbean, Request.Builder builder) {
            if (builder == null) {
                throw new IllegalArgumentException("builder cannot be null");
            }
            try {
                a.b(field);
                Object obj = field.get(requestbean);
                if (!Map.class.isAssignableFrom(field.getType())) {
                    throw new InvalidParameterException("HeaderMap should be the annotation of Map type");
                }
                Map map = (Map) obj;
                if (map != null && !map.isEmpty()) {
                    for (Map.Entry entry : map.entrySet()) {
                        builder.addHeader((String) entry.getKey(), String.valueOf(entry.getValue()));
                    }
                }
                return builder;
            } catch (IllegalAccessException e5) {
                throw new RuntimeException(e5);
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class c extends a<Query, HttpUrl.Builder> {
        c() {
        }

        @Override // com.huawei.agconnect.https.a
        /* bridge */ /* synthetic */ HttpUrl.Builder a(Field field, Object obj, HttpUrl.Builder builder) {
            return a2(field, (Field) obj, builder);
        }

        /* renamed from: a, reason: avoid collision after fix types in other method */
        <RequestBean> HttpUrl.Builder a2(Field field, RequestBean requestbean, HttpUrl.Builder builder) {
            if (builder == null) {
                throw new IllegalArgumentException("builder cannot be null");
            }
            try {
                a.b(field);
                Object obj = field.get(requestbean);
                if (!String.class.equals(field.getType())) {
                    throw new InvalidParameterException("QueryHandler should be the annotation of String");
                }
                Query query = (Query) field.getAnnotation(Query.class);
                String value = query.value();
                boolean encoded = query.encoded();
                if (value == null || value.isEmpty()) {
                    value = field.getName();
                }
                if (obj == null) {
                    obj = "";
                }
                if (encoded) {
                    builder.addEncodedQueryParameter(value, String.valueOf(obj));
                } else {
                    builder.addQueryParameter(value, String.valueOf(obj));
                }
                return builder;
            } catch (IllegalAccessException e5) {
                throw new RuntimeException(e5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class d extends a<Url, HttpUrl.Builder> {
        d() {
        }

        @Override // com.huawei.agconnect.https.a
        /* bridge */ /* synthetic */ HttpUrl.Builder a(Field field, Object obj, HttpUrl.Builder builder) {
            return a2(field, (Field) obj, builder);
        }

        /* renamed from: a, reason: avoid collision after fix types in other method */
        <RequestBean> HttpUrl.Builder a2(Field field, RequestBean requestbean, HttpUrl.Builder builder) {
            try {
                if (!field.isAnnotationPresent(Url.class)) {
                    throw new IllegalArgumentException("field is not Url annotation");
                }
                a.b(field);
                Object obj = field.get(requestbean);
                if (!String.class.equals(field.getType())) {
                    throw new InvalidParameterException("Url should be the annotation of String");
                }
                String str = (String) obj;
                if (str == null || str.isEmpty()) {
                    throw new IllegalArgumentException("url cannot be null or empty");
                }
                return HttpUrl.parse(str).newBuilder();
            } catch (IllegalAccessException e5) {
                throw new RuntimeException(e5);
            }
        }
    }

    a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <RequestBean> Request.Builder a(RequestBean requestbean) {
        HttpUrl.Builder b5 = b(requestbean);
        Request.Builder builder = new Request.Builder();
        Class<?> cls = requestbean.getClass();
        do {
            Field[] declaredFields = cls.getDeclaredFields();
            if (declaredFields.length > 0) {
                for (Field field : declaredFields) {
                    b(field);
                    for (Annotation annotation : field.getDeclaredAnnotations()) {
                        Class<? extends Annotation> annotationType = annotation.annotationType();
                        if (Query.class.equals(annotationType)) {
                            f7970a.a2(field, (Field) requestbean, b5);
                        } else if (HeaderMap.class.equals(annotationType)) {
                            f7971b.a2(field, (Field) requestbean, builder);
                        } else if (Header.class.equals(annotationType)) {
                            f7972c.a2(field, (Field) requestbean, builder);
                        }
                    }
                }
            }
            cls = cls.getSuperclass();
        } while (cls != Object.class);
        return builder.url(b5.build());
    }

    private static <RequestBean> HttpUrl.Builder b(RequestBean requestbean) {
        ArrayList arrayList = new ArrayList(1);
        Class<?> cls = requestbean.getClass();
        do {
            Field[] declaredFields = cls.getDeclaredFields();
            if (declaredFields.length > 0) {
                for (Field field : declaredFields) {
                    if (field.isAnnotationPresent(Url.class)) {
                        arrayList.add(field);
                    }
                }
            }
            cls = cls.getSuperclass();
        } while (cls != Object.class);
        if (arrayList.size() == 1) {
            return new d().a2((Field) arrayList.get(0), (Field) requestbean, (HttpUrl.Builder) null);
        }
        throw new IllegalArgumentException("ONLY ONE String Field can be annotated as Url");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(final Field field) {
        if (field.isAccessible()) {
            return;
        }
        AccessController.doPrivileged(new PrivilegedAction() { // from class: com.huawei.agconnect.https.a.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                field.setAccessible(true);
                return null;
            }
        });
    }

    abstract <RequestBean> Builder a(Field field, RequestBean requestbean, Builder builder);
}
