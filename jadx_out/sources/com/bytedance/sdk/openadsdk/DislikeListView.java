package com.bytedance.sdk.openadsdk;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.bykv.a.a.a.a.a;
import com.bykv.a.a.a.a.b;
import com.bykv.vk.openvk.api.proto.EventListener;

/* loaded from: classes2.dex */
public class DislikeListView extends ListView {
    private EventListener mOnItemClickBridge;
    private AdapterView.OnItemClickListener mOnItemClickListener;
    private AdapterView.OnItemClickListener mOnItemClickListenerInner;

    public DislikeListView(Context context) {
        super(context);
        this.mOnItemClickListenerInner = new AdapterView.OnItemClickListener() { // from class: com.bytedance.sdk.openadsdk.DislikeListView.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i5, long j5) {
                if (DislikeListView.this.getAdapter() != null && DislikeListView.this.getAdapter().getItem(i5) != null && (DislikeListView.this.getAdapter().getItem(i5) instanceof FilterWord)) {
                    FilterWord filterWord = (FilterWord) DislikeListView.this.getAdapter().getItem(i5);
                    if (!filterWord.hasSecondOptions()) {
                        if (DislikeListView.this.mOnItemClickListener != null) {
                            DislikeListView.this.mOnItemClickListener.onItemClick(adapterView, view, i5, j5);
                        }
                        if (DislikeListView.this.mOnItemClickBridge != null) {
                            DislikeListView.this.mOnItemClickBridge.onEvent(0, a.a().c(b.a().h(0, filterWord.getId()).h(1, filterWord.getName()).k()).f());
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("adapter数据异常，必须为FilterWord");
            }
        };
        init();
    }

    private void init() {
        super.setOnItemClickListener(this.mOnItemClickListenerInner);
    }

    @Override // android.widget.AdapterView
    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        if (onItemClickListener instanceof EventListener) {
            this.mOnItemClickBridge = (EventListener) onItemClickListener;
        } else {
            this.mOnItemClickListener = onItemClickListener;
        }
    }

    public DislikeListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mOnItemClickListenerInner = new AdapterView.OnItemClickListener() { // from class: com.bytedance.sdk.openadsdk.DislikeListView.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i5, long j5) {
                if (DislikeListView.this.getAdapter() != null && DislikeListView.this.getAdapter().getItem(i5) != null && (DislikeListView.this.getAdapter().getItem(i5) instanceof FilterWord)) {
                    FilterWord filterWord = (FilterWord) DislikeListView.this.getAdapter().getItem(i5);
                    if (!filterWord.hasSecondOptions()) {
                        if (DislikeListView.this.mOnItemClickListener != null) {
                            DislikeListView.this.mOnItemClickListener.onItemClick(adapterView, view, i5, j5);
                        }
                        if (DislikeListView.this.mOnItemClickBridge != null) {
                            DislikeListView.this.mOnItemClickBridge.onEvent(0, a.a().c(b.a().h(0, filterWord.getId()).h(1, filterWord.getName()).k()).f());
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("adapter数据异常，必须为FilterWord");
            }
        };
        init();
    }

    public DislikeListView(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.mOnItemClickListenerInner = new AdapterView.OnItemClickListener() { // from class: com.bytedance.sdk.openadsdk.DislikeListView.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i52, long j5) {
                if (DislikeListView.this.getAdapter() != null && DislikeListView.this.getAdapter().getItem(i52) != null && (DislikeListView.this.getAdapter().getItem(i52) instanceof FilterWord)) {
                    FilterWord filterWord = (FilterWord) DislikeListView.this.getAdapter().getItem(i52);
                    if (!filterWord.hasSecondOptions()) {
                        if (DislikeListView.this.mOnItemClickListener != null) {
                            DislikeListView.this.mOnItemClickListener.onItemClick(adapterView, view, i52, j5);
                        }
                        if (DislikeListView.this.mOnItemClickBridge != null) {
                            DislikeListView.this.mOnItemClickBridge.onEvent(0, a.a().c(b.a().h(0, filterWord.getId()).h(1, filterWord.getName()).k()).f());
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("adapter数据异常，必须为FilterWord");
            }
        };
        init();
    }
}
