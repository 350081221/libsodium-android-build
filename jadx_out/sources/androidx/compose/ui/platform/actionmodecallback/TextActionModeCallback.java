package androidx.compose.ui.platform.actionmodecallback;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.a;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001Bk\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b0\u00101J(\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002J\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u001a\u0010\u000e\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u001a\u0010\u0010\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000fJ\u0006\u0010\u0011\u001a\u00020\u0007J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u001f\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R*\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010&R*\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0019\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010&R*\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0019\u001a\u0004\b+\u0010\u001b\"\u0004\b,\u0010&R*\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0019\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u0010&¨\u00062"}, d2 = {"Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;", "", "Landroid/view/Menu;", "menu", "Landroidx/compose/ui/platform/actionmodecallback/MenuItemOption;", "item", "Lkotlin/Function0;", "Lkotlin/r2;", "callback", "addOrRemoveMenuItem", "Landroid/view/ActionMode;", "mode", "", "onCreateActionMode", "onPrepareActionMode", "Landroid/view/MenuItem;", "onActionItemClicked", "onDestroyActionMode", "updateMenuItems$ui_release", "(Landroid/view/Menu;)V", "updateMenuItems", "addMenuItem$ui_release", "(Landroid/view/Menu;Landroidx/compose/ui/platform/actionmodecallback/MenuItemOption;)V", "addMenuItem", "onActionModeDestroy", "Lv3/a;", "getOnActionModeDestroy", "()Lv3/a;", "Landroidx/compose/ui/geometry/Rect;", "rect", "Landroidx/compose/ui/geometry/Rect;", "getRect", "()Landroidx/compose/ui/geometry/Rect;", "setRect", "(Landroidx/compose/ui/geometry/Rect;)V", "onCopyRequested", "getOnCopyRequested", "setOnCopyRequested", "(Lv3/a;)V", "onPasteRequested", "getOnPasteRequested", "setOnPasteRequested", "onCutRequested", "getOnCutRequested", "setOnCutRequested", "onSelectAllRequested", "getOnSelectAllRequested", "setOnSelectAllRequested", "<init>", "(Lv3/a;Landroidx/compose/ui/geometry/Rect;Lv3/a;Lv3/a;Lv3/a;Lv3/a;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nTextActionModeCallback.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextActionModeCallback.android.kt\nandroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
/* loaded from: classes.dex */
public final class TextActionModeCallback {
    public static final int $stable = 8;

    @m
    private final a<r2> onActionModeDestroy;

    @m
    private a<r2> onCopyRequested;

    @m
    private a<r2> onCutRequested;

    @m
    private a<r2> onPasteRequested;

    @m
    private a<r2> onSelectAllRequested;

    @l
    private Rect rect;

    public TextActionModeCallback() {
        this(null, null, null, null, null, null, 63, null);
    }

    public TextActionModeCallback(@m a<r2> aVar, @l Rect rect, @m a<r2> aVar2, @m a<r2> aVar3, @m a<r2> aVar4, @m a<r2> aVar5) {
        this.onActionModeDestroy = aVar;
        this.rect = rect;
        this.onCopyRequested = aVar2;
        this.onPasteRequested = aVar3;
        this.onCutRequested = aVar4;
        this.onSelectAllRequested = aVar5;
    }

    private final void addOrRemoveMenuItem(Menu menu, MenuItemOption menuItemOption, a<r2> aVar) {
        if (aVar != null && menu.findItem(menuItemOption.getId()) == null) {
            addMenuItem$ui_release(menu, menuItemOption);
        } else if (aVar == null && menu.findItem(menuItemOption.getId()) != null) {
            menu.removeItem(menuItemOption.getId());
        }
    }

    public final void addMenuItem$ui_release(@l Menu menu, @l MenuItemOption menuItemOption) {
        menu.add(0, menuItemOption.getId(), menuItemOption.getOrder(), menuItemOption.getTitleResource()).setShowAsAction(1);
    }

    @m
    public final a<r2> getOnActionModeDestroy() {
        return this.onActionModeDestroy;
    }

    @m
    public final a<r2> getOnCopyRequested() {
        return this.onCopyRequested;
    }

    @m
    public final a<r2> getOnCutRequested() {
        return this.onCutRequested;
    }

    @m
    public final a<r2> getOnPasteRequested() {
        return this.onPasteRequested;
    }

    @m
    public final a<r2> getOnSelectAllRequested() {
        return this.onSelectAllRequested;
    }

    @l
    public final Rect getRect() {
        return this.rect;
    }

    public final boolean onActionItemClicked(@m ActionMode actionMode, @m MenuItem menuItem) {
        l0.m(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == MenuItemOption.Copy.getId()) {
            a<r2> aVar = this.onCopyRequested;
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (itemId == MenuItemOption.Paste.getId()) {
            a<r2> aVar2 = this.onPasteRequested;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        } else if (itemId == MenuItemOption.Cut.getId()) {
            a<r2> aVar3 = this.onCutRequested;
            if (aVar3 != null) {
                aVar3.invoke();
            }
        } else if (itemId == MenuItemOption.SelectAll.getId()) {
            a<r2> aVar4 = this.onSelectAllRequested;
            if (aVar4 != null) {
                aVar4.invoke();
            }
        } else {
            return false;
        }
        if (actionMode != null) {
            actionMode.finish();
            return true;
        }
        return true;
    }

    public final boolean onCreateActionMode(@m ActionMode actionMode, @m Menu menu) {
        if (menu != null) {
            if (actionMode != null) {
                if (this.onCopyRequested != null) {
                    addMenuItem$ui_release(menu, MenuItemOption.Copy);
                }
                if (this.onPasteRequested != null) {
                    addMenuItem$ui_release(menu, MenuItemOption.Paste);
                }
                if (this.onCutRequested != null) {
                    addMenuItem$ui_release(menu, MenuItemOption.Cut);
                }
                if (this.onSelectAllRequested != null) {
                    addMenuItem$ui_release(menu, MenuItemOption.SelectAll);
                    return true;
                }
                return true;
            }
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode".toString());
        }
        throw new IllegalArgumentException("onCreateActionMode requires a non-null menu".toString());
    }

    public final void onDestroyActionMode() {
        a<r2> aVar = this.onActionModeDestroy;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final boolean onPrepareActionMode(@m ActionMode actionMode, @m Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        updateMenuItems$ui_release(menu);
        return true;
    }

    public final void setOnCopyRequested(@m a<r2> aVar) {
        this.onCopyRequested = aVar;
    }

    public final void setOnCutRequested(@m a<r2> aVar) {
        this.onCutRequested = aVar;
    }

    public final void setOnPasteRequested(@m a<r2> aVar) {
        this.onPasteRequested = aVar;
    }

    public final void setOnSelectAllRequested(@m a<r2> aVar) {
        this.onSelectAllRequested = aVar;
    }

    public final void setRect(@l Rect rect) {
        this.rect = rect;
    }

    @VisibleForTesting
    public final void updateMenuItems$ui_release(@l Menu menu) {
        addOrRemoveMenuItem(menu, MenuItemOption.Copy, this.onCopyRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.Paste, this.onPasteRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.Cut, this.onCutRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.SelectAll, this.onSelectAllRequested);
    }

    public /* synthetic */ TextActionModeCallback(a aVar, Rect rect, a aVar2, a aVar3, a aVar4, a aVar5, int i5, w wVar) {
        this((i5 & 1) != 0 ? null : aVar, (i5 & 2) != 0 ? Rect.Companion.getZero() : rect, (i5 & 4) != 0 ? null : aVar2, (i5 & 8) != 0 ? null : aVar3, (i5 & 16) != 0 ? null : aVar4, (i5 & 32) != 0 ? null : aVar5);
    }
}
