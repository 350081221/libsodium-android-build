package com.ss.android.socialbase.appdownloader.e;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.view.KeyEvent;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationManagerCompat;
import com.ss.android.socialbase.appdownloader.c.n;
import com.ss.android.socialbase.appdownloader.i;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10285a = "d";

    /* renamed from: b, reason: collision with root package name */
    private static List<n> f10286b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private static com.ss.android.socialbase.appdownloader.view.a f10287c;

    /* renamed from: d, reason: collision with root package name */
    private static AlertDialog f10288d;

    public static void b(@NonNull Activity activity, @NonNull n nVar) {
        if (activity != null) {
            try {
                if (!activity.isFinishing()) {
                    FragmentManager fragmentManager = activity.getFragmentManager();
                    String str = f10285a;
                    com.ss.android.socialbase.appdownloader.view.a aVar = (com.ss.android.socialbase.appdownloader.view.a) fragmentManager.findFragmentByTag(str);
                    f10287c = aVar;
                    if (aVar == null) {
                        f10287c = new com.ss.android.socialbase.appdownloader.view.a();
                        fragmentManager.beginTransaction().add(f10287c, str).commitAllowingStateLoss();
                        try {
                            fragmentManager.executePendingTransactions();
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                    f10287c.a();
                    return;
                }
            } catch (Throwable th2) {
                try {
                    th2.printStackTrace();
                    nVar.a();
                    return;
                } catch (Throwable th3) {
                    th3.printStackTrace();
                    return;
                }
            }
        }
        nVar.a();
    }

    public static boolean a() {
        try {
            return NotificationManagerCompat.from(com.ss.android.socialbase.downloader.downloader.c.O()).areNotificationsEnabled();
        } catch (Throwable th) {
            th.printStackTrace();
            return true;
        }
    }

    public static synchronized void a(boolean z4) {
        synchronized (d.class) {
            try {
                AlertDialog alertDialog = f10288d;
                if (alertDialog != null) {
                    alertDialog.cancel();
                    f10288d = null;
                }
                for (n nVar : f10286b) {
                    if (nVar != null) {
                        if (z4) {
                            nVar.a();
                        } else {
                            nVar.b();
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static synchronized void a(@NonNull final Activity activity, @NonNull final n nVar) {
        synchronized (d.class) {
            if (nVar == null) {
                return;
            }
            if (activity != null) {
                try {
                } catch (Throwable th) {
                    th.printStackTrace();
                    a(false);
                }
                if (!activity.isFinishing()) {
                    int a5 = i.a(com.ss.android.socialbase.downloader.downloader.c.O(), "tt_appdownloader_notification_request_title");
                    int a6 = i.a(com.ss.android.socialbase.downloader.downloader.c.O(), "tt_appdownloader_notification_request_message");
                    int a7 = i.a(com.ss.android.socialbase.downloader.downloader.c.O(), "tt_appdownloader_notification_request_btn_yes");
                    int a8 = i.a(com.ss.android.socialbase.downloader.downloader.c.O(), "tt_appdownloader_notification_request_btn_no");
                    f10286b.add(nVar);
                    AlertDialog alertDialog = f10288d;
                    if (alertDialog == null || !alertDialog.isShowing()) {
                        f10288d = new AlertDialog.Builder(activity).setTitle(a5).setMessage(a6).setPositiveButton(a7, new DialogInterface.OnClickListener() { // from class: com.ss.android.socialbase.appdownloader.e.d.3
                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i5) {
                                d.b(activity, nVar);
                                dialogInterface.cancel();
                                AlertDialog unused = d.f10288d = null;
                            }
                        }).setNegativeButton(a8, new DialogInterface.OnClickListener() { // from class: com.ss.android.socialbase.appdownloader.e.d.2
                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i5) {
                                d.a(false);
                            }
                        }).setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.ss.android.socialbase.appdownloader.e.d.1
                            @Override // android.content.DialogInterface.OnKeyListener
                            public boolean onKey(DialogInterface dialogInterface, int i5, KeyEvent keyEvent) {
                                if (i5 != 4) {
                                    return false;
                                }
                                if (keyEvent.getAction() == 1) {
                                    d.a(false);
                                }
                                return true;
                            }
                        }).setCancelable(false).show();
                    }
                    return;
                }
            }
            nVar.b();
        }
    }
}
