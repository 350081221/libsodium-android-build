package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.internal.view.SupportMenuItem;

/* loaded from: classes2.dex */
public final class MenuItemCompat {

    @Deprecated
    public static final int SHOW_AS_ACTION_ALWAYS = 2;

    @Deprecated
    public static final int SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW = 8;

    @Deprecated
    public static final int SHOW_AS_ACTION_IF_ROOM = 1;

    @Deprecated
    public static final int SHOW_AS_ACTION_NEVER = 0;

    @Deprecated
    public static final int SHOW_AS_ACTION_WITH_TEXT = 4;
    private static final String TAG = "MenuItemCompat";

    @RequiresApi(26)
    /* loaded from: classes2.dex */
    static class Api26Impl {
        private Api26Impl() {
        }

        @DoNotInline
        static int getAlphabeticModifiers(MenuItem menuItem) {
            int alphabeticModifiers;
            alphabeticModifiers = menuItem.getAlphabeticModifiers();
            return alphabeticModifiers;
        }

        @DoNotInline
        static CharSequence getContentDescription(MenuItem menuItem) {
            CharSequence contentDescription;
            contentDescription = menuItem.getContentDescription();
            return contentDescription;
        }

        @DoNotInline
        static ColorStateList getIconTintList(MenuItem menuItem) {
            ColorStateList iconTintList;
            iconTintList = menuItem.getIconTintList();
            return iconTintList;
        }

        @DoNotInline
        static PorterDuff.Mode getIconTintMode(MenuItem menuItem) {
            PorterDuff.Mode iconTintMode;
            iconTintMode = menuItem.getIconTintMode();
            return iconTintMode;
        }

        @DoNotInline
        static int getNumericModifiers(MenuItem menuItem) {
            int numericModifiers;
            numericModifiers = menuItem.getNumericModifiers();
            return numericModifiers;
        }

        @DoNotInline
        static CharSequence getTooltipText(MenuItem menuItem) {
            CharSequence tooltipText;
            tooltipText = menuItem.getTooltipText();
            return tooltipText;
        }

        @DoNotInline
        static MenuItem setAlphabeticShortcut(MenuItem menuItem, char c5, int i5) {
            MenuItem alphabeticShortcut;
            alphabeticShortcut = menuItem.setAlphabeticShortcut(c5, i5);
            return alphabeticShortcut;
        }

        @DoNotInline
        static MenuItem setContentDescription(MenuItem menuItem, CharSequence charSequence) {
            MenuItem contentDescription;
            contentDescription = menuItem.setContentDescription(charSequence);
            return contentDescription;
        }

        @DoNotInline
        static MenuItem setIconTintList(MenuItem menuItem, ColorStateList colorStateList) {
            MenuItem iconTintList;
            iconTintList = menuItem.setIconTintList(colorStateList);
            return iconTintList;
        }

        @DoNotInline
        static MenuItem setIconTintMode(MenuItem menuItem, PorterDuff.Mode mode) {
            MenuItem iconTintMode;
            iconTintMode = menuItem.setIconTintMode(mode);
            return iconTintMode;
        }

        @DoNotInline
        static MenuItem setNumericShortcut(MenuItem menuItem, char c5, int i5) {
            MenuItem numericShortcut;
            numericShortcut = menuItem.setNumericShortcut(c5, i5);
            return numericShortcut;
        }

        @DoNotInline
        static MenuItem setShortcut(MenuItem menuItem, char c5, char c6, int i5, int i6) {
            MenuItem shortcut;
            shortcut = menuItem.setShortcut(c5, c6, i5, i6);
            return shortcut;
        }

        @DoNotInline
        static MenuItem setTooltipText(MenuItem menuItem, CharSequence charSequence) {
            MenuItem tooltipText;
            tooltipText = menuItem.setTooltipText(charSequence);
            return tooltipText;
        }
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public interface OnActionExpandListener {
        boolean onMenuItemActionCollapse(MenuItem menuItem);

        boolean onMenuItemActionExpand(MenuItem menuItem);
    }

    private MenuItemCompat() {
    }

    @Deprecated
    public static boolean collapseActionView(MenuItem menuItem) {
        return menuItem.collapseActionView();
    }

    @Deprecated
    public static boolean expandActionView(MenuItem menuItem) {
        return menuItem.expandActionView();
    }

    @Nullable
    public static ActionProvider getActionProvider(@NonNull MenuItem menuItem) {
        if (menuItem instanceof SupportMenuItem) {
            return ((SupportMenuItem) menuItem).getSupportActionProvider();
        }
        Log.w(TAG, "getActionProvider: item does not implement SupportMenuItem; returning null");
        return null;
    }

    @Deprecated
    public static View getActionView(MenuItem menuItem) {
        return menuItem.getActionView();
    }

    public static int getAlphabeticModifiers(@NonNull MenuItem menuItem) {
        if (menuItem instanceof SupportMenuItem) {
            return ((SupportMenuItem) menuItem).getAlphabeticModifiers();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getAlphabeticModifiers(menuItem);
        }
        return 0;
    }

    @Nullable
    public static CharSequence getContentDescription(@NonNull MenuItem menuItem) {
        if (menuItem instanceof SupportMenuItem) {
            return ((SupportMenuItem) menuItem).getContentDescription();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getContentDescription(menuItem);
        }
        return null;
    }

    @Nullable
    public static ColorStateList getIconTintList(@NonNull MenuItem menuItem) {
        if (menuItem instanceof SupportMenuItem) {
            return ((SupportMenuItem) menuItem).getIconTintList();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getIconTintList(menuItem);
        }
        return null;
    }

    @Nullable
    public static PorterDuff.Mode getIconTintMode(@NonNull MenuItem menuItem) {
        if (menuItem instanceof SupportMenuItem) {
            return ((SupportMenuItem) menuItem).getIconTintMode();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getIconTintMode(menuItem);
        }
        return null;
    }

    public static int getNumericModifiers(@NonNull MenuItem menuItem) {
        if (menuItem instanceof SupportMenuItem) {
            return ((SupportMenuItem) menuItem).getNumericModifiers();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getNumericModifiers(menuItem);
        }
        return 0;
    }

    @Nullable
    public static CharSequence getTooltipText(@NonNull MenuItem menuItem) {
        if (menuItem instanceof SupportMenuItem) {
            return ((SupportMenuItem) menuItem).getTooltipText();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getTooltipText(menuItem);
        }
        return null;
    }

    @Deprecated
    public static boolean isActionViewExpanded(MenuItem menuItem) {
        return menuItem.isActionViewExpanded();
    }

    @Nullable
    public static MenuItem setActionProvider(@NonNull MenuItem menuItem, @Nullable ActionProvider actionProvider) {
        if (menuItem instanceof SupportMenuItem) {
            return ((SupportMenuItem) menuItem).setSupportActionProvider(actionProvider);
        }
        Log.w(TAG, "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    @Deprecated
    public static MenuItem setActionView(MenuItem menuItem, View view) {
        return menuItem.setActionView(view);
    }

    public static void setAlphabeticShortcut(@NonNull MenuItem menuItem, char c5, int i5) {
        if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setAlphabeticShortcut(c5, i5);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setAlphabeticShortcut(menuItem, c5, i5);
        }
    }

    public static void setContentDescription(@NonNull MenuItem menuItem, @Nullable CharSequence charSequence) {
        if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setContentDescription(menuItem, charSequence);
        }
    }

    public static void setIconTintList(@NonNull MenuItem menuItem, @Nullable ColorStateList colorStateList) {
        if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setIconTintList(menuItem, colorStateList);
        }
    }

    public static void setIconTintMode(@NonNull MenuItem menuItem, @Nullable PorterDuff.Mode mode) {
        if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setIconTintMode(menuItem, mode);
        }
    }

    public static void setNumericShortcut(@NonNull MenuItem menuItem, char c5, int i5) {
        if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setNumericShortcut(c5, i5);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setNumericShortcut(menuItem, c5, i5);
        }
    }

    @Deprecated
    public static MenuItem setOnActionExpandListener(MenuItem menuItem, final OnActionExpandListener onActionExpandListener) {
        return menuItem.setOnActionExpandListener(new MenuItem.OnActionExpandListener() { // from class: androidx.core.view.MenuItemCompat.1
            @Override // android.view.MenuItem.OnActionExpandListener
            public boolean onMenuItemActionCollapse(MenuItem menuItem2) {
                return OnActionExpandListener.this.onMenuItemActionCollapse(menuItem2);
            }

            @Override // android.view.MenuItem.OnActionExpandListener
            public boolean onMenuItemActionExpand(MenuItem menuItem2) {
                return OnActionExpandListener.this.onMenuItemActionExpand(menuItem2);
            }
        });
    }

    public static void setShortcut(@NonNull MenuItem menuItem, char c5, char c6, int i5, int i6) {
        if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setShortcut(c5, c6, i5, i6);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setShortcut(menuItem, c5, c6, i5, i6);
        }
    }

    @Deprecated
    public static void setShowAsAction(MenuItem menuItem, int i5) {
        menuItem.setShowAsAction(i5);
    }

    public static void setTooltipText(@NonNull MenuItem menuItem, @Nullable CharSequence charSequence) {
        if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setTooltipText(menuItem, charSequence);
        }
    }

    @Deprecated
    public static MenuItem setActionView(MenuItem menuItem, int i5) {
        return menuItem.setActionView(i5);
    }
}
