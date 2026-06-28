package com.zzhoujay.richtext.ext;

import android.graphics.Color;
import android.text.Editable;
import android.text.Html;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.zzhoujay.markdown.style.MarkDownBulletSpan;
import java.lang.ref.SoftReference;
import java.util.Stack;
import org.xml.sax.XMLReader;

/* loaded from: classes3.dex */
public class d implements Html.TagHandler {

    /* renamed from: e, reason: collision with root package name */
    private static final int f15716e = Color.parseColor("#F0F0F0");

    /* renamed from: f, reason: collision with root package name */
    private static final int f15717f = Color.parseColor("#333333");

    /* renamed from: d, reason: collision with root package name */
    private SoftReference<TextView> f15721d;

    /* renamed from: c, reason: collision with root package name */
    private int f15720c = 0;

    /* renamed from: a, reason: collision with root package name */
    private Stack<Integer> f15718a = new Stack<>();

    /* renamed from: b, reason: collision with root package name */
    private Stack<Boolean> f15719b = new Stack<>();

    public d(TextView textView) {
        this.f15721d = new SoftReference<>(textView);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void a(int i5, int i6, String str, Editable editable, XMLReader xMLReader) {
        char c5;
        String lowerCase = str.toLowerCase();
        lowerCase.hashCode();
        int i7 = -1;
        switch (lowerCase.hashCode()) {
            case 3453:
                if (lowerCase.equals("li")) {
                    c5 = 0;
                    break;
                }
                c5 = 65535;
                break;
            case 3549:
                if (lowerCase.equals("ol")) {
                    c5 = 1;
                    break;
                }
                c5 = 65535;
                break;
            case 3735:
                if (lowerCase.equals("ul")) {
                    c5 = 2;
                    break;
                }
                c5 = 65535;
                break;
            case 3059181:
                if (lowerCase.equals(PluginConstants.KEY_ERROR_CODE)) {
                    c5 = 3;
                    break;
                }
                c5 = 65535;
                break;
            default:
                c5 = 65535;
                break;
        }
        switch (c5) {
            case 0:
                if (this.f15719b.peek().booleanValue()) {
                    this.f15720c = 0;
                } else {
                    i7 = this.f15720c + 1;
                    this.f15720c = i7;
                }
                editable.append('\n');
                TextView textView = this.f15721d.get();
                if (textView == null) {
                    return;
                }
                editable.setSpan(new MarkDownBulletSpan(this.f15719b.size() - 1, f15717f, i7, textView), i5, editable.length(), 33);
                return;
            case 1:
            case 2:
                editable.append('\n');
                if (!this.f15719b.isEmpty()) {
                    this.f15719b.pop();
                    return;
                }
                return;
            case 3:
                editable.setSpan(new c3.b(f15716e), i5, i6, 33);
                return;
            default:
                return;
        }
    }

    private void b(String str, Editable editable, XMLReader xMLReader) {
        char c5;
        String lowerCase = str.toLowerCase();
        int hashCode = lowerCase.hashCode();
        if (hashCode != 3549) {
            if (hashCode != 3735) {
                if (hashCode == 111267 && lowerCase.equals("pre")) {
                    c5 = 2;
                }
                c5 = 65535;
            } else {
                if (lowerCase.equals("ul")) {
                    c5 = 0;
                }
                c5 = 65535;
            }
        } else {
            if (lowerCase.equals("ol")) {
                c5 = 1;
            }
            c5 = 65535;
        }
        if (c5 != 0) {
            if (c5 == 1) {
                this.f15719b.push(Boolean.FALSE);
                editable.append('\n');
                return;
            }
            return;
        }
        this.f15719b.push(Boolean.TRUE);
        editable.append('\n');
    }

    @Override // android.text.Html.TagHandler
    public void handleTag(boolean z4, String str, Editable editable, XMLReader xMLReader) {
        int intValue;
        if (z4) {
            b(str, editable, xMLReader);
            this.f15718a.push(Integer.valueOf(editable.length()));
        } else {
            if (this.f15718a.isEmpty()) {
                intValue = 0;
            } else {
                intValue = this.f15718a.pop().intValue();
            }
            a(intValue, editable.length(), str.toLowerCase(), editable, xMLReader);
        }
    }
}
