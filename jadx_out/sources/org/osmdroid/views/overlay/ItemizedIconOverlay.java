package org.osmdroid.views.overlay;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import java.util.List;
import org.osmdroid.api.IMapView;
import org.osmdroid.library.R;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.OverlayItem;

/* loaded from: classes4.dex */
public class ItemizedIconOverlay<Item extends OverlayItem> extends ItemizedOverlay<Item> {
    protected List<Item> mItemList;
    protected OnItemGestureListener<Item> mOnItemGestureListener;

    /* loaded from: classes4.dex */
    public interface ActiveItem {
        boolean run(int i5);
    }

    /* loaded from: classes4.dex */
    public interface OnItemGestureListener<T> {
        boolean onItemLongPress(int i5, T t5);

        boolean onItemSingleTapUp(int i5, T t5);
    }

    public ItemizedIconOverlay(List<Item> list, Drawable drawable, OnItemGestureListener<Item> onItemGestureListener, Context context) {
        super(drawable);
        this.mItemList = list;
        this.mOnItemGestureListener = onItemGestureListener;
        populate();
    }

    private boolean activateSelectedItems(MotionEvent motionEvent, MapView mapView, ActiveItem activeItem) {
        int round = Math.round(motionEvent.getX());
        int round2 = Math.round(motionEvent.getY());
        for (int i5 = 0; i5 < this.mItemList.size(); i5++) {
            if (isEventOnItem(getItem(i5), round, round2, mapView) && activeItem.run(i5)) {
                return true;
            }
        }
        return false;
    }

    public boolean addItem(Item item) {
        boolean add = this.mItemList.add(item);
        populate();
        return add;
    }

    public boolean addItems(List<Item> list) {
        boolean addAll = this.mItemList.addAll(list);
        populate();
        return addAll;
    }

    @Override // org.osmdroid.views.overlay.ItemizedOverlay
    protected Item createItem(int i5) {
        return this.mItemList.get(i5);
    }

    @Override // org.osmdroid.views.overlay.ItemizedOverlay, org.osmdroid.views.overlay.Overlay
    public void onDetach(MapView mapView) {
        List<Item> list = this.mItemList;
        if (list != null) {
            list.clear();
        }
        this.mItemList = null;
        this.mOnItemGestureListener = null;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public boolean onLongPress(MotionEvent motionEvent, MapView mapView) {
        if (activateSelectedItems(motionEvent, mapView, new ActiveItem() { // from class: org.osmdroid.views.overlay.ItemizedIconOverlay.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // org.osmdroid.views.overlay.ItemizedIconOverlay.ActiveItem
            public boolean run(int i5) {
                ItemizedIconOverlay itemizedIconOverlay = ItemizedIconOverlay.this;
                if (itemizedIconOverlay.mOnItemGestureListener == null) {
                    return false;
                }
                return itemizedIconOverlay.onLongPressHelper(i5, itemizedIconOverlay.getItem(i5));
            }
        })) {
            return true;
        }
        return super.onLongPress(motionEvent, mapView);
    }

    protected boolean onLongPressHelper(int i5, Item item) {
        return this.mOnItemGestureListener.onItemLongPress(i5, item);
    }

    @Override // org.osmdroid.views.overlay.ItemizedOverlay, org.osmdroid.views.overlay.Overlay
    public boolean onSingleTapConfirmed(MotionEvent motionEvent, final MapView mapView) {
        if (activateSelectedItems(motionEvent, mapView, new ActiveItem() { // from class: org.osmdroid.views.overlay.ItemizedIconOverlay.1
            @Override // org.osmdroid.views.overlay.ItemizedIconOverlay.ActiveItem
            public boolean run(int i5) {
                ItemizedIconOverlay itemizedIconOverlay = ItemizedIconOverlay.this;
                if (itemizedIconOverlay.mOnItemGestureListener == null) {
                    return false;
                }
                return itemizedIconOverlay.onSingleTapUpHelper(i5, itemizedIconOverlay.mItemList.get(i5), mapView);
            }
        })) {
            return true;
        }
        return super.onSingleTapConfirmed(motionEvent, mapView);
    }

    protected boolean onSingleTapUpHelper(int i5, Item item, MapView mapView) {
        return this.mOnItemGestureListener.onItemSingleTapUp(i5, item);
    }

    @Override // org.osmdroid.views.overlay.Overlay.Snappable
    public boolean onSnapToItem(int i5, int i6, Point point, IMapView iMapView) {
        return false;
    }

    public void removeAllItems() {
        removeAllItems(true);
    }

    public boolean removeItem(Item item) {
        boolean remove = this.mItemList.remove(item);
        populate();
        return remove;
    }

    @Override // org.osmdroid.views.overlay.ItemizedOverlay
    public int size() {
        return Math.min(this.mItemList.size(), this.mDrawnItemsLimit);
    }

    public void removeAllItems(boolean z4) {
        this.mItemList.clear();
        if (z4) {
            populate();
        }
    }

    public void addItem(int i5, Item item) {
        this.mItemList.add(i5, item);
        populate();
    }

    public Item removeItem(int i5) {
        Item remove = this.mItemList.remove(i5);
        populate();
        return remove;
    }

    public ItemizedIconOverlay(List<Item> list, OnItemGestureListener<Item> onItemGestureListener, Context context) {
        this(list, context.getResources().getDrawable(R.drawable.f21666h), onItemGestureListener, context);
    }

    public ItemizedIconOverlay(Context context, List<Item> list, OnItemGestureListener<Item> onItemGestureListener) {
        this(list, context.getResources().getDrawable(R.drawable.f21666h), onItemGestureListener, context);
    }
}
