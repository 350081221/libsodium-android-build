.class Landroidx/core/app/NotificationCompatBuilder$Api26Impl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x1a
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/app/NotificationCompatBuilder;
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

.method static createBuilder(Landroid/content/Context;Ljava/lang/String;)Landroid/app/Notification$Builder;
    .locals 1
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    new-instance v0, Landroid/app/Notification$Builder;

    invoke-direct {v0, p0, p1}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-object v0
.end method

.method static setBadgeIconType(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0, p1}, Landroidx/core/app/p2;->a(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    move-result-object p0

    return-object p0
.end method

.method static setColorized(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0, p1}, Landroidx/core/app/r2;->a(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    move-result-object p0

    return-object p0
.end method

.method static setGroupAlertBehavior(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0, p1}, Landroidx/core/app/o2;->a(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    move-result-object p0

    return-object p0
.end method

.method static setSettingsText(Landroid/app/Notification$Builder;Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0, p1}, Landroidx/core/app/n2;->a(Landroid/app/Notification$Builder;Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object p0

    return-object p0
.end method

.method static setShortcutId(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0, p1}, Landroidx/core/app/s2;->a(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    move-result-object p0

    return-object p0
.end method

.method static setTimeoutAfter(Landroid/app/Notification$Builder;J)Landroid/app/Notification$Builder;
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0, p1, p2}, Landroidx/core/app/q2;->a(Landroid/app/Notification$Builder;J)Landroid/app/Notification$Builder;

    move-result-object p0

    return-object p0
.end method
