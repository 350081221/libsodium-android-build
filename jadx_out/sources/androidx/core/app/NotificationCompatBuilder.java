package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.ArraySet;
import androidx.core.app.NotificationCompat;
import androidx.core.content.LocusIdCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
class NotificationCompatBuilder implements NotificationBuilderWithBuilderAccessor {
    private RemoteViews mBigContentView;
    private final Notification.Builder mBuilder;
    private final NotificationCompat.Builder mBuilderCompat;
    private RemoteViews mContentView;
    private final Context mContext;
    private int mGroupAlertBehavior;
    private RemoteViews mHeadsUpContentView;
    private final List<Bundle> mActionExtrasList = new ArrayList();
    private final Bundle mExtras = new Bundle();

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(20)
    /* loaded from: classes2.dex */
    public static class Api20Impl {
        private Api20Impl() {
        }

        @DoNotInline
        static Notification.Builder addAction(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        @DoNotInline
        static Notification.Action.Builder addExtras(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        @DoNotInline
        static Notification.Action.Builder addRemoteInput(Notification.Action.Builder builder, android.app.RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        @DoNotInline
        static Notification.Action build(Notification.Action.Builder builder) {
            return builder.build();
        }

        @DoNotInline
        static Notification.Action.Builder createBuilder(int i5, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i5, charSequence, pendingIntent);
        }

        @DoNotInline
        static String getGroup(Notification notification) {
            return notification.getGroup();
        }

        @DoNotInline
        static Notification.Builder setGroup(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        @DoNotInline
        static Notification.Builder setGroupSummary(Notification.Builder builder, boolean z4) {
            return builder.setGroupSummary(z4);
        }

        @DoNotInline
        static Notification.Builder setLocalOnly(Notification.Builder builder, boolean z4) {
            return builder.setLocalOnly(z4);
        }

        @DoNotInline
        static Notification.Builder setSortKey(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    @RequiresApi(21)
    /* loaded from: classes2.dex */
    static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        static Notification.Builder addPerson(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        @DoNotInline
        static Notification.Builder setCategory(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        @DoNotInline
        static Notification.Builder setColor(Notification.Builder builder, int i5) {
            return builder.setColor(i5);
        }

        @DoNotInline
        static Notification.Builder setPublicVersion(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        @DoNotInline
        static Notification.Builder setSound(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        @DoNotInline
        static Notification.Builder setVisibility(Notification.Builder builder, int i5) {
            return builder.setVisibility(i5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(23)
    /* loaded from: classes2.dex */
    public static class Api23Impl {
        private Api23Impl() {
        }

        @DoNotInline
        static Notification.Action.Builder createBuilder(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        @DoNotInline
        static Notification.Builder setLargeIcon(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        @DoNotInline
        static Notification.Builder setSmallIcon(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(24)
    /* loaded from: classes2.dex */
    public static class Api24Impl {
        private Api24Impl() {
        }

        @DoNotInline
        static Notification.Action.Builder setAllowGeneratedReplies(Notification.Action.Builder builder, boolean z4) {
            return builder.setAllowGeneratedReplies(z4);
        }

        @DoNotInline
        static Notification.Builder setCustomBigContentView(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        @DoNotInline
        static Notification.Builder setCustomContentView(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        @DoNotInline
        static Notification.Builder setCustomHeadsUpContentView(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        @DoNotInline
        static Notification.Builder setRemoteInputHistory(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    @RequiresApi(26)
    /* loaded from: classes2.dex */
    static class Api26Impl {
        private Api26Impl() {
        }

        @DoNotInline
        static Notification.Builder createBuilder(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        @DoNotInline
        static Notification.Builder setBadgeIconType(Notification.Builder builder, int i5) {
            Notification.Builder badgeIconType;
            badgeIconType = builder.setBadgeIconType(i5);
            return badgeIconType;
        }

        @DoNotInline
        static Notification.Builder setColorized(Notification.Builder builder, boolean z4) {
            Notification.Builder colorized;
            colorized = builder.setColorized(z4);
            return colorized;
        }

        @DoNotInline
        static Notification.Builder setGroupAlertBehavior(Notification.Builder builder, int i5) {
            Notification.Builder groupAlertBehavior;
            groupAlertBehavior = builder.setGroupAlertBehavior(i5);
            return groupAlertBehavior;
        }

        @DoNotInline
        static Notification.Builder setSettingsText(Notification.Builder builder, CharSequence charSequence) {
            Notification.Builder settingsText;
            settingsText = builder.setSettingsText(charSequence);
            return settingsText;
        }

        @DoNotInline
        static Notification.Builder setShortcutId(Notification.Builder builder, String str) {
            Notification.Builder shortcutId;
            shortcutId = builder.setShortcutId(str);
            return shortcutId;
        }

        @DoNotInline
        static Notification.Builder setTimeoutAfter(Notification.Builder builder, long j5) {
            Notification.Builder timeoutAfter;
            timeoutAfter = builder.setTimeoutAfter(j5);
            return timeoutAfter;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(28)
    /* loaded from: classes2.dex */
    public static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        static Notification.Builder addPerson(Notification.Builder builder, android.app.Person person) {
            Notification.Builder addPerson;
            addPerson = builder.addPerson(person);
            return addPerson;
        }

        @DoNotInline
        static Notification.Action.Builder setSemanticAction(Notification.Action.Builder builder, int i5) {
            Notification.Action.Builder semanticAction;
            semanticAction = builder.setSemanticAction(i5);
            return semanticAction;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(29)
    /* loaded from: classes2.dex */
    public static class Api29Impl {
        private Api29Impl() {
        }

        @DoNotInline
        static Notification.Builder setAllowSystemGeneratedContextualActions(Notification.Builder builder, boolean z4) {
            Notification.Builder allowSystemGeneratedContextualActions;
            allowSystemGeneratedContextualActions = builder.setAllowSystemGeneratedContextualActions(z4);
            return allowSystemGeneratedContextualActions;
        }

        @DoNotInline
        static Notification.Builder setBubbleMetadata(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            Notification.Builder bubbleMetadata2;
            bubbleMetadata2 = builder.setBubbleMetadata(bubbleMetadata);
            return bubbleMetadata2;
        }

        @DoNotInline
        static Notification.Action.Builder setContextual(Notification.Action.Builder builder, boolean z4) {
            Notification.Action.Builder contextual;
            contextual = builder.setContextual(z4);
            return contextual;
        }

        @DoNotInline
        static Notification.Builder setLocusId(Notification.Builder builder, Object obj) {
            Notification.Builder locusId;
            locusId = builder.setLocusId((LocusId) obj);
            return locusId;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(31)
    /* loaded from: classes2.dex */
    public static class Api31Impl {
        private Api31Impl() {
        }

        @DoNotInline
        static Notification.Action.Builder setAuthenticationRequired(Notification.Action.Builder builder, boolean z4) {
            Notification.Action.Builder authenticationRequired;
            authenticationRequired = builder.setAuthenticationRequired(z4);
            return authenticationRequired;
        }

        @DoNotInline
        static Notification.Builder setForegroundServiceBehavior(Notification.Builder builder, int i5) {
            Notification.Builder foregroundServiceBehavior;
            foregroundServiceBehavior = builder.setForegroundServiceBehavior(i5);
            return foregroundServiceBehavior;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public NotificationCompatBuilder(NotificationCompat.Builder builder) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        Icon icon;
        List list;
        int i5;
        this.mBuilderCompat = builder;
        Context context = builder.mContext;
        this.mContext = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.mBuilder = Api26Impl.createBuilder(context, builder.mChannelId);
        } else {
            this.mBuilder = new Notification.Builder(builder.mContext);
        }
        Notification notification = builder.mNotification;
        Notification.Builder lights = this.mBuilder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, builder.mTickerView).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        if ((notification.flags & 2) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z4);
        if ((notification.flags & 8) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z5);
        if ((notification.flags & 16) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z6).setDefaults(notification.defaults).setContentTitle(builder.mContentTitle).setContentText(builder.mContentText).setContentInfo(builder.mContentInfo).setContentIntent(builder.mContentIntent).setDeleteIntent(notification.deleteIntent);
        PendingIntent pendingIntent = builder.mFullScreenIntent;
        if ((notification.flags & 128) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        deleteIntent.setFullScreenIntent(pendingIntent, z7).setNumber(builder.mNumber).setProgress(builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate);
        Notification.Builder builder2 = this.mBuilder;
        IconCompat iconCompat = builder.mLargeIcon;
        if (iconCompat == null) {
            icon = null;
        } else {
            icon = iconCompat.toIcon(context);
        }
        Api23Impl.setLargeIcon(builder2, icon);
        this.mBuilder.setSubText(builder.mSubText).setUsesChronometer(builder.mUseChronometer).setPriority(builder.mPriority);
        NotificationCompat.Style style = builder.mStyle;
        if (style instanceof NotificationCompat.CallStyle) {
            Iterator<NotificationCompat.Action> it = ((NotificationCompat.CallStyle) style).getActionsListWithSystemActions().iterator();
            while (it.hasNext()) {
                addAction(it.next());
            }
        } else {
            Iterator<NotificationCompat.Action> it2 = builder.mActions.iterator();
            while (it2.hasNext()) {
                addAction(it2.next());
            }
        }
        Bundle bundle = builder.mExtras;
        if (bundle != null) {
            this.mExtras.putAll(bundle);
        }
        int i6 = Build.VERSION.SDK_INT;
        this.mContentView = builder.mContentView;
        this.mBigContentView = builder.mBigContentView;
        this.mBuilder.setShowWhen(builder.mShowWhen);
        Api20Impl.setLocalOnly(this.mBuilder, builder.mLocalOnly);
        Api20Impl.setGroup(this.mBuilder, builder.mGroupKey);
        Api20Impl.setSortKey(this.mBuilder, builder.mSortKey);
        Api20Impl.setGroupSummary(this.mBuilder, builder.mGroupSummary);
        this.mGroupAlertBehavior = builder.mGroupAlertBehavior;
        Api21Impl.setCategory(this.mBuilder, builder.mCategory);
        Api21Impl.setColor(this.mBuilder, builder.mColor);
        Api21Impl.setVisibility(this.mBuilder, builder.mVisibility);
        Api21Impl.setPublicVersion(this.mBuilder, builder.mPublicVersion);
        Api21Impl.setSound(this.mBuilder, notification.sound, notification.audioAttributes);
        if (i6 < 28) {
            list = combineLists(getPeople(builder.mPersonList), builder.mPeople);
        } else {
            list = builder.mPeople;
        }
        if (list != null && !list.isEmpty()) {
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                Api21Impl.addPerson(this.mBuilder, (String) it3.next());
            }
        }
        this.mHeadsUpContentView = builder.mHeadsUpContentView;
        if (builder.mInvisibleActions.size() > 0) {
            Bundle bundle2 = builder.getExtras().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i7 = 0; i7 < builder.mInvisibleActions.size(); i7++) {
                bundle4.putBundle(Integer.toString(i7), NotificationCompatJellybean.getBundleForAction(builder.mInvisibleActions.get(i7)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            builder.getExtras().putBundle("android.car.EXTENSIONS", bundle2);
            this.mExtras.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i8 = Build.VERSION.SDK_INT;
        Object obj = builder.mSmallIcon;
        if (obj != null) {
            Api23Impl.setSmallIcon(this.mBuilder, obj);
        }
        this.mBuilder.setExtras(builder.mExtras);
        Api24Impl.setRemoteInputHistory(this.mBuilder, builder.mRemoteInputHistory);
        RemoteViews remoteViews = builder.mContentView;
        if (remoteViews != null) {
            Api24Impl.setCustomContentView(this.mBuilder, remoteViews);
        }
        RemoteViews remoteViews2 = builder.mBigContentView;
        if (remoteViews2 != null) {
            Api24Impl.setCustomBigContentView(this.mBuilder, remoteViews2);
        }
        RemoteViews remoteViews3 = builder.mHeadsUpContentView;
        if (remoteViews3 != null) {
            Api24Impl.setCustomHeadsUpContentView(this.mBuilder, remoteViews3);
        }
        if (i8 >= 26) {
            Api26Impl.setBadgeIconType(this.mBuilder, builder.mBadgeIcon);
            Api26Impl.setSettingsText(this.mBuilder, builder.mSettingsText);
            Api26Impl.setShortcutId(this.mBuilder, builder.mShortcutId);
            Api26Impl.setTimeoutAfter(this.mBuilder, builder.mTimeout);
            Api26Impl.setGroupAlertBehavior(this.mBuilder, builder.mGroupAlertBehavior);
            if (builder.mColorizedSet) {
                Api26Impl.setColorized(this.mBuilder, builder.mColorized);
            }
            if (!TextUtils.isEmpty(builder.mChannelId)) {
                this.mBuilder.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i8 >= 28) {
            Iterator<Person> it4 = builder.mPersonList.iterator();
            while (it4.hasNext()) {
                Api28Impl.addPerson(this.mBuilder, it4.next().toAndroidPerson());
            }
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 29) {
            Api29Impl.setAllowSystemGeneratedContextualActions(this.mBuilder, builder.mAllowSystemGeneratedContextualActions);
            Api29Impl.setBubbleMetadata(this.mBuilder, NotificationCompat.BubbleMetadata.toPlatform(builder.mBubbleMetadata));
            LocusIdCompat locusIdCompat = builder.mLocusId;
            if (locusIdCompat != null) {
                Api29Impl.setLocusId(this.mBuilder, locusIdCompat.toLocusId());
            }
        }
        if (i9 >= 31 && (i5 = builder.mFgsDeferBehavior) != 0) {
            Api31Impl.setForegroundServiceBehavior(this.mBuilder, i5);
        }
        if (builder.mSilent) {
            if (this.mBuilderCompat.mGroupSummary) {
                this.mGroupAlertBehavior = 2;
            } else {
                this.mGroupAlertBehavior = 1;
            }
            this.mBuilder.setVibrate(null);
            this.mBuilder.setSound(null);
            int i10 = notification.defaults & (-2) & (-3);
            notification.defaults = i10;
            this.mBuilder.setDefaults(i10);
            if (i9 >= 26) {
                if (TextUtils.isEmpty(this.mBuilderCompat.mGroupKey)) {
                    Api20Impl.setGroup(this.mBuilder, NotificationCompat.GROUP_KEY_SILENT);
                }
                Api26Impl.setGroupAlertBehavior(this.mBuilder, this.mGroupAlertBehavior);
            }
        }
    }

    private void addAction(NotificationCompat.Action action) {
        Icon icon;
        Bundle bundle;
        IconCompat iconCompat = action.getIconCompat();
        if (iconCompat != null) {
            icon = iconCompat.toIcon();
        } else {
            icon = null;
        }
        Notification.Action.Builder createBuilder = Api23Impl.createBuilder(icon, action.getTitle(), action.getActionIntent());
        if (action.getRemoteInputs() != null) {
            for (android.app.RemoteInput remoteInput : RemoteInput.fromCompat(action.getRemoteInputs())) {
                Api20Impl.addRemoteInput(createBuilder, remoteInput);
            }
        }
        if (action.getExtras() != null) {
            bundle = new Bundle(action.getExtras());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
        int i5 = Build.VERSION.SDK_INT;
        Api24Impl.setAllowGeneratedReplies(createBuilder, action.getAllowGeneratedReplies());
        bundle.putInt("android.support.action.semanticAction", action.getSemanticAction());
        if (i5 >= 28) {
            Api28Impl.setSemanticAction(createBuilder, action.getSemanticAction());
        }
        if (i5 >= 29) {
            Api29Impl.setContextual(createBuilder, action.isContextual());
        }
        if (i5 >= 31) {
            Api31Impl.setAuthenticationRequired(createBuilder, action.isAuthenticationRequired());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", action.getShowsUserInterface());
        Api20Impl.addExtras(createBuilder, bundle);
        Api20Impl.addAction(this.mBuilder, Api20Impl.build(createBuilder));
    }

    @Nullable
    private static List<String> combineLists(@Nullable List<String> list, @Nullable List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        ArraySet arraySet = new ArraySet(list.size() + list2.size());
        arraySet.addAll(list);
        arraySet.addAll(list2);
        return new ArrayList(arraySet);
    }

    @Nullable
    private static List<String> getPeople(@Nullable List<Person> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<Person> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().resolveToLegacyUri());
        }
        return arrayList;
    }

    private void removeSoundAndVibration(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults = notification.defaults & (-2) & (-3);
    }

    public Notification build() {
        RemoteViews remoteViews;
        Bundle extras;
        RemoteViews makeHeadsUpContentView;
        RemoteViews makeBigContentView;
        NotificationCompat.Style style = this.mBuilderCompat.mStyle;
        if (style != null) {
            style.apply(this);
        }
        if (style != null) {
            remoteViews = style.makeContentView(this);
        } else {
            remoteViews = null;
        }
        Notification buildInternal = buildInternal();
        if (remoteViews != null) {
            buildInternal.contentView = remoteViews;
        } else {
            RemoteViews remoteViews2 = this.mBuilderCompat.mContentView;
            if (remoteViews2 != null) {
                buildInternal.contentView = remoteViews2;
            }
        }
        if (style != null && (makeBigContentView = style.makeBigContentView(this)) != null) {
            buildInternal.bigContentView = makeBigContentView;
        }
        if (style != null && (makeHeadsUpContentView = this.mBuilderCompat.mStyle.makeHeadsUpContentView(this)) != null) {
            buildInternal.headsUpContentView = makeHeadsUpContentView;
        }
        if (style != null && (extras = NotificationCompat.getExtras(buildInternal)) != null) {
            style.addCompatExtras(extras);
        }
        return buildInternal;
    }

    protected Notification buildInternal() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.mBuilder.build();
        }
        Notification build = this.mBuilder.build();
        if (this.mGroupAlertBehavior != 0) {
            if (Api20Impl.getGroup(build) != null && (build.flags & 512) != 0 && this.mGroupAlertBehavior == 2) {
                removeSoundAndVibration(build);
            }
            if (Api20Impl.getGroup(build) != null && (build.flags & 512) == 0 && this.mGroupAlertBehavior == 1) {
                removeSoundAndVibration(build);
            }
        }
        return build;
    }

    @Override // androidx.core.app.NotificationBuilderWithBuilderAccessor
    public Notification.Builder getBuilder() {
        return this.mBuilder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context getContext() {
        return this.mContext;
    }
}
