package com.bytedance.sdk.openadsdk;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public abstract class TTDislikeDialogAbstract extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private View f4753a;

    public TTDislikeDialogAbstract(Context context) {
        super(context);
    }

    protected void a() {
        if (this.f4753a == null) {
            return;
        }
        int[] tTDislikeListViewIds = getTTDislikeListViewIds();
        if (tTDislikeListViewIds != null && tTDislikeListViewIds.length > 0) {
            for (int i5 : tTDislikeListViewIds) {
                View findViewById = this.f4753a.findViewById(i5);
                if (findViewById != null) {
                    if (!(findViewById instanceof DislikeListView)) {
                        throw new IllegalArgumentException("getTTDislikeListViewIds找到的view类型异常，请检查");
                    }
                } else {
                    throw new IllegalArgumentException("getTTDislikeListViewIds提供的id找不到view，请检查");
                }
            }
            return;
        }
        throw new IllegalArgumentException("dislike选项列表为空，请设置TTDislikeListView");
    }

    public abstract int getLayoutId();

    public abstract ViewGroup.LayoutParams getLayoutParams();

    public abstract int[] getTTDislikeListViewIds();

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            View inflate = LayoutInflater.from(getContext()).inflate(getLayoutId(), (ViewGroup) null);
            this.f4753a = inflate;
            if (inflate == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            View view = this.f4753a;
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -1);
            }
            setContentView(view, layoutParams);
            a();
        } catch (Exception unused) {
            Log.e("TTDislikeDialogAbstract", "getLayoutId布局文件id可能异常，请检查");
        }
    }

    @Deprecated
    public void setDislikeModel(TTDislikeController tTDislikeController) {
    }

    @Deprecated
    public void startPersonalizePromptActivity() {
    }

    public TTDislikeDialogAbstract(Context context, int i5) {
        super(context, i5);
    }
}
