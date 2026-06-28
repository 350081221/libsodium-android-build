package com.yuanqi.group.home.adapters;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yuanqi.group.home.adapters.LaunchpadAdapter;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J*\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0016J*\u0010\u0012\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/yuanqi/group/home/adapters/SwipeGestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "adapter", "Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "(Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;Landroidx/recyclerview/widget/RecyclerView;)V", "onFling", "", "e1", "Landroid/view/MotionEvent;", "e2", "velocityX", "", "velocityY", "onLongPress", "", "e", "onScroll", "distanceX", "distanceY", "onSingleTapUp", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    @l
    private final LaunchpadAdapter f13925a;

    /* renamed from: b, reason: collision with root package name */
    @l
    private final RecyclerView f13926b;

    public j(@l LaunchpadAdapter adapter, @l RecyclerView recyclerView) {
        l0.p(adapter, "adapter");
        l0.p(recyclerView, "recyclerView");
        this.f13925a = adapter;
        this.f13926b = recyclerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(@m MotionEvent motionEvent, @l MotionEvent e22, float f5, float f6) {
        l0.p(e22, "e2");
        double d5 = f5;
        if (Math.abs(d5) > Math.abs(d5)) {
            View findChildViewUnder = this.f13926b.findChildViewUnder(e22.getX() - this.f13926b.getLeft(), e22.getY() - this.f13926b.getTop());
            if (findChildViewUnder != null) {
                int childAdapterPosition = this.f13926b.getChildAdapterPosition(findChildViewUnder);
                RecyclerView.ViewHolder childViewHolder = this.f13926b.getChildViewHolder(findChildViewUnder);
                if (childViewHolder instanceof LaunchpadAdapter.ViewHolder) {
                    this.f13925a.t(childAdapterPosition, (LaunchpadAdapter.ViewHolder) childViewHolder);
                    return true;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(@l MotionEvent e5) {
        l0.p(e5, "e");
        View findChildViewUnder = this.f13926b.findChildViewUnder(e5.getX() - this.f13926b.getLeft(), e5.getY() - this.f13926b.getTop());
        if (findChildViewUnder != null) {
            this.f13925a.s(findChildViewUnder, this.f13926b.getChildAdapterPosition(findChildViewUnder));
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(@m MotionEvent motionEvent, @l MotionEvent e22, float f5, float f6) {
        l0.p(e22, "e2");
        if (Math.abs(f5) > Math.abs(f6)) {
            View findChildViewUnder = this.f13926b.findChildViewUnder(e22.getX() - this.f13926b.getLeft(), e22.getY() - this.f13926b.getTop());
            if (findChildViewUnder != null) {
                int childAdapterPosition = this.f13926b.getChildAdapterPosition(findChildViewUnder);
                RecyclerView.ViewHolder childViewHolder = this.f13926b.getChildViewHolder(findChildViewUnder);
                if (childViewHolder instanceof LaunchpadAdapter.ViewHolder) {
                    this.f13925a.t(childAdapterPosition, (LaunchpadAdapter.ViewHolder) childViewHolder);
                    return true;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(@l MotionEvent e5) {
        l0.p(e5, "e");
        View findChildViewUnder = this.f13926b.findChildViewUnder(e5.getX() - this.f13926b.getLeft(), e5.getY() - this.f13926b.getTop());
        if (findChildViewUnder == null) {
            return false;
        }
        int childAdapterPosition = this.f13926b.getChildAdapterPosition(findChildViewUnder);
        RecyclerView.ViewHolder childViewHolder = this.f13926b.getChildViewHolder(findChildViewUnder);
        if (childViewHolder != null) {
            this.f13925a.n(childAdapterPosition, childViewHolder);
            return true;
        }
        return true;
    }
}
