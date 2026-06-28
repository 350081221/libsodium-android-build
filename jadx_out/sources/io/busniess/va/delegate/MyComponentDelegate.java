package io.busniess.va.delegate;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.http.Headers;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.lody.virtual.client.core.AppCallback;
import com.lody.virtual.client.hook.base.MethodProxy;
import com.lody.virtual.client.ipc.VLocationManager;
import com.lody.virtual.remote.vloc.VLocation;
import com.umeng.analytics.pro.bi;
import com.umeng.analytics.pro.d;
import dalvik.system.DexClassLoader;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import u.dont.know.what.i.am.g;
import u.dont.know.what.i.am.k;

/* loaded from: classes3.dex */
public class MyComponentDelegate implements AppCallback {
    private static final boolean sTrace = false;
    String TAG = "xxposed";
    Set<Class<?>> hookedClasses = new HashSet();
    VLocation vLocation = VLocationManager.get().getCurAppLocation();

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
        ClassLoader classLoader = application.getClassLoader();
        if (str.equals("com.tencent.mm") && MethodProxy.isFakeLocationEnable()) {
            k.k(DexClassLoader.class, String.class, String.class, String.class, ClassLoader.class, new g() { // from class: io.busniess.va.delegate.MyComponentDelegate.2
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // u.dont.know.what.i.am.g
                public void afterHookedMethod(g.a aVar) throws Throwable {
                    super.afterHookedMethod(aVar);
                    Log.d("test", "加载了" + Arrays.toString(aVar.f22498e));
                    if (((String) aVar.f22498e[0]).contains("TencentLocation_sapp")) {
                        k.n("c.t.m.sapp.g.dm", (ClassLoader) aVar.f22497d, bi.ay, String.class, byte[].class, new g() { // from class: io.busniess.va.delegate.MyComponentDelegate.2.1
                            /* JADX INFO: Access modifiers changed from: protected */
                            @Override // u.dont.know.what.i.am.g
                            public void afterHookedMethod(g.a aVar2) throws Throwable {
                                super.afterHookedMethod(aVar2);
                                Bundle bundle = (Bundle) aVar2.d();
                                Log.d("test ", "bundle ==" + bundle + "\n " + aVar2.f22498e[1]);
                                JSONObject jSONObject = new JSONObject(bundle.getString("result"));
                                try {
                                    JSONObject jSONObject2 = jSONObject.getJSONObject("content");
                                    MyComponentDelegate myComponentDelegate = MyComponentDelegate.this;
                                    jSONObject2.put(d.C, myComponentDelegate.format(myComponentDelegate.vLocation.getLatitude()));
                                    MyComponentDelegate myComponentDelegate2 = MyComponentDelegate.this;
                                    jSONObject2.put(d.D, myComponentDelegate2.format(myComponentDelegate2.vLocation.getLongitude()));
                                    jSONObject.put("content", jSONObject2);
                                } catch (JSONException unused) {
                                }
                                try {
                                    JSONObject jSONObject3 = jSONObject.getJSONObject(Headers.LOCATION);
                                    MyComponentDelegate myComponentDelegate3 = MyComponentDelegate.this;
                                    jSONObject3.put("latitude", myComponentDelegate3.format(myComponentDelegate3.vLocation.getLatitude()));
                                    MyComponentDelegate myComponentDelegate4 = MyComponentDelegate.this;
                                    jSONObject3.put("longitude", myComponentDelegate4.format(myComponentDelegate4.vLocation.getLongitude()));
                                    jSONObject.put(Headers.LOCATION, jSONObject3);
                                } catch (JSONException unused2) {
                                }
                                bundle.putString("result", jSONObject.toString());
                                aVar2.h(bundle);
                            }
                        });
                    }
                }
            });
            try {
                k.n("c.t.m.sapp.c.f", classLoader, bi.ay, new g() { // from class: io.busniess.va.delegate.MyComponentDelegate.3
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // u.dont.know.what.i.am.g
                    public void afterHookedMethod(g.a aVar) throws Throwable {
                        super.afterHookedMethod(aVar);
                        k.n("c.t.m.sapp.g.dm", (ClassLoader) aVar.d(), bi.ay, String.class, byte[].class, new g() { // from class: io.busniess.va.delegate.MyComponentDelegate.3.1
                            /* JADX INFO: Access modifiers changed from: protected */
                            @Override // u.dont.know.what.i.am.g
                            public void afterHookedMethod(g.a aVar2) throws Throwable {
                                super.afterHookedMethod(aVar2);
                                Bundle bundle = (Bundle) aVar2.d();
                                Log.d("test ", "bundle ==" + bundle + "\n " + aVar2.f22498e[1]);
                                JSONObject jSONObject = new JSONObject(bundle.getString("result"));
                                try {
                                    JSONObject jSONObject2 = jSONObject.getJSONObject("content");
                                    MyComponentDelegate myComponentDelegate = MyComponentDelegate.this;
                                    jSONObject2.put(d.C, myComponentDelegate.format(myComponentDelegate.vLocation.getLatitude()));
                                    MyComponentDelegate myComponentDelegate2 = MyComponentDelegate.this;
                                    jSONObject2.put(d.D, myComponentDelegate2.format(myComponentDelegate2.vLocation.getLongitude()));
                                    jSONObject.put("content", jSONObject2);
                                } catch (JSONException unused) {
                                }
                                try {
                                    JSONObject jSONObject3 = jSONObject.getJSONObject(Headers.LOCATION);
                                    MyComponentDelegate myComponentDelegate3 = MyComponentDelegate.this;
                                    jSONObject3.put("latitude", myComponentDelegate3.format(myComponentDelegate3.vLocation.getLatitude()));
                                    MyComponentDelegate myComponentDelegate4 = MyComponentDelegate.this;
                                    jSONObject3.put("longitude", myComponentDelegate4.format(myComponentDelegate4.vLocation.getLongitude()));
                                    jSONObject.put(Headers.LOCATION, jSONObject3);
                                } catch (JSONException unused2) {
                                }
                                bundle.putString("result", jSONObject.toString());
                                aVar2.h(bundle);
                                Log.d("test", "修改后" + bundle);
                            }
                        });
                    }
                });
            } catch (Exception unused) {
            }
        }
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
        if (str.equals("com.tencent.mm") && MethodProxy.isFakeLocationEnable()) {
            k.m(Handler.class, "sendMessage", Message.class, new g() { // from class: io.busniess.va.delegate.MyComponentDelegate.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // u.dont.know.what.i.am.g
                public void beforeHookedMethod(g.a aVar) throws Throwable {
                    Message message = (Message) aVar.f22498e[0];
                    if (message.what == 4999) {
                        Log.d("test", "位置信息" + message.obj);
                        Pair pair = (Pair) message.obj;
                        JSONObject jSONObject = new JSONObject((String) pair.first);
                        try {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("content");
                            MyComponentDelegate myComponentDelegate = MyComponentDelegate.this;
                            jSONObject2.put(d.C, myComponentDelegate.format(myComponentDelegate.vLocation.getLatitude()));
                            MyComponentDelegate myComponentDelegate2 = MyComponentDelegate.this;
                            jSONObject2.put(d.D, myComponentDelegate2.format(myComponentDelegate2.vLocation.getLongitude()));
                            jSONObject.put("content", jSONObject2);
                        } catch (JSONException unused) {
                        }
                        try {
                            JSONObject jSONObject3 = jSONObject.getJSONObject(Headers.LOCATION);
                            MyComponentDelegate myComponentDelegate3 = MyComponentDelegate.this;
                            jSONObject3.put("latitude", myComponentDelegate3.format(myComponentDelegate3.vLocation.getLatitude()));
                            MyComponentDelegate myComponentDelegate4 = MyComponentDelegate.this;
                            jSONObject3.put("longitude", myComponentDelegate4.format(myComponentDelegate4.vLocation.getLongitude()));
                            jSONObject.put(Headers.LOCATION, jSONObject3);
                        } catch (JSONException unused2) {
                        }
                        Pair create = Pair.create(jSONObject.toString(), pair.second);
                        Log.d("test", "修改后 " + create);
                        message.obj = create;
                        aVar.f22498e[0] = message;
                        super.beforeHookedMethod(aVar);
                    }
                }
            });
        }
    }

    @Override // com.lody.virtual.client.core.AppCallback
    public void beforeStartApplication(String str, String str2, Context context) {
    }

    public double format(double d5) {
        return Double.parseDouble(new DecimalFormat("#.######").format(d5));
    }
}
