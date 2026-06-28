package com.yuanqi.group.home.adapters.decorations;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class ItemOffsetDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a, reason: collision with root package name */
    private int f13902a;

    public ItemOffsetDecoration(int i5) {
        this.f13902a = i5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int i5 = this.f13902a;
        rect.set(i5, i5, i5, i5);
    }

    public ItemOffsetDecoration(@NonNull Context context, @DimenRes int i5) {
        this(context.getResources().getDimensionPixelSize(i5));
    }
}
