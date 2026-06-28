package com.yuanqi.group.home.device;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.Toolbar;
import androidx.autofill.HintConstants;
import androidx.fragment.app.Fragment;
import com.alipay.sdk.m.x.d;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.ipc.VDeviceManager;
import com.lody.virtual.remote.VDeviceConfig;
import com.yqtech.multiapp.R;
import com.yuanqi.group.abs.ui.VActivity;
import com.yuanqi.group.home.models.e;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@Instrumented
/* loaded from: classes3.dex */
public class DeviceDetailActiivty extends VActivity {

    /* renamed from: v, reason: collision with root package name */
    private static final String f13938v = "DeviceData";

    /* renamed from: a, reason: collision with root package name */
    private String f13939a;

    /* renamed from: b, reason: collision with root package name */
    private String f13940b;

    /* renamed from: c, reason: collision with root package name */
    private int f13941c;

    /* renamed from: d, reason: collision with root package name */
    private int f13942d;

    /* renamed from: e, reason: collision with root package name */
    private VDeviceConfig f13943e;

    /* renamed from: f, reason: collision with root package name */
    private TelephonyManager f13944f;

    /* renamed from: g, reason: collision with root package name */
    private WifiManager f13945g;

    /* renamed from: h, reason: collision with root package name */
    private EditText f13946h;

    /* renamed from: i, reason: collision with root package name */
    private EditText f13947i;

    /* renamed from: j, reason: collision with root package name */
    private EditText f13948j;

    /* renamed from: k, reason: collision with root package name */
    private EditText f13949k;

    /* renamed from: l, reason: collision with root package name */
    private EditText f13950l;

    /* renamed from: m, reason: collision with root package name */
    private EditText f13951m;

    /* renamed from: n, reason: collision with root package name */
    private EditText f13952n;

    /* renamed from: o, reason: collision with root package name */
    private EditText f13953o;

    /* renamed from: p, reason: collision with root package name */
    private EditText f13954p;

    /* renamed from: q, reason: collision with root package name */
    private EditText f13955q;

    /* renamed from: r, reason: collision with root package name */
    private EditText f13956r;

    /* renamed from: s, reason: collision with root package name */
    private EditText f13957s;

    /* renamed from: t, reason: collision with root package name */
    private EditText f13958t;

    /* renamed from: u, reason: collision with root package name */
    private EditText f13959u;

    private void J() {
        this.f13943e.setProp("BRAND", L(this.f13950l));
        this.f13943e.setProp("MODEL", L(this.f13951m));
        this.f13943e.setProp("PRODUCT", L(this.f13952n));
        this.f13943e.setProp("DEVICE", L(this.f13953o));
        this.f13943e.setProp("BOARD", L(this.f13954p));
        this.f13943e.setProp("DISPLAY", L(this.f13955q));
        this.f13943e.setProp("ID", L(this.f13956r));
        this.f13943e.setProp("MANUFACTURER", L(this.f13958t));
        this.f13943e.setProp("FINGERPRINT", L(this.f13959u));
        this.f13943e.serial = L(this.f13957s);
        this.f13943e.deviceId = L(this.f13947i);
        this.f13943e.iccId = L(this.f13948j);
        this.f13943e.wifiMac = L(this.f13949k);
        this.f13943e.androidId = L(this.f13946h);
    }

    @SuppressLint({"HardwareIds"})
    private String K() {
        String[] strArr = {"/sys/class/net/wlan0/address", "/sys/class/net/eth0/address", "/sys/class/net/wifi/address"};
        String macAddress = this.f13945g.getConnectionInfo().getMacAddress();
        if (TextUtils.isEmpty(macAddress)) {
            for (int i5 = 0; i5 < 3; i5++) {
                try {
                    macAddress = Q(strArr[i5]);
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
                if (!TextUtils.isEmpty(macAddress)) {
                    break;
                }
            }
        }
        return macAddress;
    }

    private String L(EditText editText) {
        return editText.getText().toString().trim();
    }

    private void M() {
        if (TextUtils.isEmpty(this.f13939a)) {
            VirtualCore.get().killAllApps();
        } else {
            VirtualCore.get().killApp(this.f13939a, this.f13941c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(DialogInterface dialogInterface, int i5) {
        VDeviceConfig vDeviceConfig = this.f13943e;
        vDeviceConfig.enable = false;
        vDeviceConfig.clear();
        VDeviceManager.get().updateDeviceConfig(this.f13941c, this.f13943e);
        Intent intent = new Intent();
        intent.putExtra("pkg", this.f13939a);
        intent.putExtra("user", this.f13941c);
        intent.putExtra("pos", this.f13942d);
        intent.putExtra("result", "reset");
        setResult(-1, intent);
        M();
        S();
    }

    public static void P(Fragment fragment, e eVar, int i5) {
        Intent intent = new Intent(fragment.getContext(), (Class<?>) DeviceDetailActiivty.class);
        intent.putExtra(d.f3030v, eVar.f14039c);
        intent.putExtra("pkg", eVar.f14037a);
        intent.putExtra("user", eVar.f14038b);
        intent.putExtra("pos", i5);
        fragment.startActivityForResult(intent, 1001);
    }

    private String Q(String str) throws IOException {
        StringBuilder sb = new StringBuilder(1000);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(str));
        char[] cArr = new char[1024];
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read != -1) {
                sb.append(String.valueOf(cArr, 0, read));
            } else {
                bufferedReader.close();
                return sb.toString().trim();
            }
        }
    }

    private void R(EditText editText, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            editText.setText(str2);
        } else {
            editText.setText(str);
        }
    }

    @SuppressLint({"HardwareIds", "MissingPermission"})
    private void S() {
        R(this.f13950l, this.f13943e.getProp("BRAND"), Build.BRAND);
        R(this.f13951m, this.f13943e.getProp("MODEL"), Build.MODEL);
        R(this.f13952n, this.f13943e.getProp("PRODUCT"), Build.PRODUCT);
        R(this.f13953o, this.f13943e.getProp("DEVICE"), Build.DEVICE);
        R(this.f13954p, this.f13943e.getProp("BOARD"), Build.BOARD);
        R(this.f13955q, this.f13943e.getProp("DISPLAY"), Build.DISPLAY);
        R(this.f13956r, this.f13943e.getProp("ID"), Build.ID);
        R(this.f13958t, this.f13943e.getProp("MANUFACTURER"), Build.MANUFACTURER);
        R(this.f13959u, this.f13943e.getProp("FINGERPRINT"), Build.FINGERPRINT);
        R(this.f13957s, this.f13943e.serial, Build.SERIAL);
        try {
            R(this.f13947i, this.f13943e.deviceId, this.f13944f.getDeviceId());
        } catch (Throwable unused) {
            R(this.f13947i, this.f13943e.deviceId, "");
        }
        try {
            R(this.f13948j, this.f13943e.iccId, this.f13944f.getSimSerialNumber());
        } catch (Throwable unused2) {
            R(this.f13948j, this.f13943e.iccId, "");
        }
        R(this.f13949k, this.f13943e.wifiMac, K());
        R(this.f13946h, this.f13943e.androidId, Settings.Secure.getString(getContentResolver(), "android_id"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        TraceManager.startActivityTrace(getClass().getName());
        super.onCreate(bundle);
        setResult(0);
        setContentView(R.layout.activity_mock_device);
        setSupportActionBar((Toolbar) C(R.id.top_toolbar));
        E();
        this.f13946h = (EditText) findViewById(R.id.edt_androidId);
        this.f13947i = (EditText) findViewById(R.id.edt_imei);
        this.f13948j = (EditText) findViewById(R.id.edt_imsi);
        this.f13949k = (EditText) findViewById(R.id.edt_mac);
        this.f13950l = (EditText) findViewById(R.id.edt_brand);
        this.f13951m = (EditText) findViewById(R.id.edt_model);
        this.f13952n = (EditText) findViewById(R.id.edt_name);
        this.f13953o = (EditText) findViewById(R.id.edt_device);
        this.f13954p = (EditText) findViewById(R.id.edt_board);
        this.f13955q = (EditText) findViewById(R.id.edt_display);
        this.f13956r = (EditText) findViewById(R.id.edt_id);
        this.f13957s = (EditText) findViewById(R.id.edt_serial);
        this.f13958t = (EditText) findViewById(R.id.edt_manufacturer);
        this.f13959u = (EditText) findViewById(R.id.edt_fingerprint);
        this.f13945g = (WifiManager) getApplicationContext().getSystemService(NetworkUtil.NETWORK_TYPE_WIFI);
        this.f13944f = (TelephonyManager) getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        if (TextUtils.isEmpty(this.f13940b)) {
            this.f13939a = getIntent().getStringExtra("pkg");
            this.f13941c = getIntent().getIntExtra("user", 0);
            this.f13940b = getIntent().getStringExtra(d.f3030v);
        }
        setTitle(this.f13940b);
        this.f13943e = VDeviceManager.get().getDeviceConfig(this.f13941c);
        S();
        AppInstrumentation.onActivityCreateEnd();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_device, menu);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f13939a = intent.getStringExtra("pkg");
        this.f13941c = intent.getIntExtra("user", 0);
        this.f13940b = intent.getStringExtra(d.f3030v);
        this.f13942d = intent.getIntExtra("pos", -1);
    }

    @Override // com.yuanqi.group.abs.ui.VActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.action_reset /* 2131296331 */:
                new AlertDialog.Builder(this, R.style.MyDialogTheme).setMessage(R.string.dlg_reset_device).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.yuanqi.group.home.device.a
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i5) {
                        DeviceDetailActiivty.this.N(dialogInterface, i5);
                    }
                }).setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.yuanqi.group.home.device.b
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i5) {
                        dialogInterface.dismiss();
                    }
                }).setCancelable(false).show();
                return true;
            case R.id.action_save /* 2131296332 */:
                this.f13943e.enable = true;
                J();
                S();
                VDeviceManager.get().updateDeviceConfig(this.f13941c, this.f13943e);
                Intent intent = new Intent();
                intent.putExtra("pkg", this.f13939a);
                intent.putExtra("user", this.f13941c);
                intent.putExtra("pos", this.f13942d);
                intent.putExtra("result", "save");
                setResult(-1, intent);
                if (TextUtils.isEmpty(this.f13939a)) {
                    VirtualCore.get().killAllApps();
                } else {
                    VirtualCore.get().killApp(this.f13939a, this.f13941c);
                }
                M();
                Toast.makeText(this, "保存成功", 0).show();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    @Override // android.app.Activity
    protected void onRestart() {
        AppInstrumentation.onActivityRestartBegin(getClass().getName());
        super.onRestart();
        AppInstrumentation.onActivityRestartEnd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        AppInstrumentation.onActivityResumeBegin(getClass().getName());
        super.onResume();
        AppInstrumentation.onActivityResumeEnd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yuanqi.group.abs.ui.VActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        AppInstrumentation.onActivityStartBegin(getClass().getName());
        super.onStart();
        AppInstrumentation.onActivityStartEnd();
    }
}
