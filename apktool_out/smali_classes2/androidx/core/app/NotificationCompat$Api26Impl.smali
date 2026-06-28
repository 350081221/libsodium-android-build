.class Landroidx/core/app/NotificationCompat$Api26Impl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x1a
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/app/NotificationCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Api26Impl"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static getBadgeIconType(Landroid/app/Notification;)I
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0}, Landroidx/core/app/c1;->a(Landroid/app/Notification;)I

    move-result p0

    return p0
.end method

.method static getChannelId(Landroid/app/Notification;)Ljava/lang/String;
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0}, Landroidx/core/app/a1;->a(Landroid/app/Notification;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static getGroupAlertBehavior(Landroid/app/Notification;)I
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0}, Landroidx/core/app/x0;->a(Landroid/app/Notification;)I

    move-result p0

    return p0
.end method

.method static getSettingsText(Landroid/app/Notification;)Ljava/lang/CharSequence;
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0}, Landroidx/core/app/b1;->a(Landroid/app/Notification;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method static getShortcutId(Landroid/app/Notification;)Ljava/lang/String;
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0}, Landroidx/core/app/z0;->a(Landroid/app/Notification;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static getTimeoutAfter(Landroid/app/Notification;)J
    .locals 2
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0}, Landroidx/core/app/y0;->a(Landroid/app/Notification;)J

    move-result-wide v0

    return-wide v0
.end method
