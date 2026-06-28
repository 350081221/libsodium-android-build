.class Landroidx/core/app/NotificationManagerCompat$Api26Impl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x1a
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/app/NotificationManagerCompat;
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

.method static createNotificationChannel(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0, p1}, Landroidx/core/app/h3;->a(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    return-void
.end method

.method static createNotificationChannelGroup(Landroid/app/NotificationManager;Landroid/app/NotificationChannelGroup;)V
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0, p1}, Landroidx/core/app/f3;->a(Landroid/app/NotificationManager;Landroid/app/NotificationChannelGroup;)V

    return-void
.end method

.method static createNotificationChannelGroups(Landroid/app/NotificationManager;Ljava/util/List;)V
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/NotificationManager;",
            "Ljava/util/List<",
            "Landroid/app/NotificationChannelGroup;",
            ">;)V"
        }
    .end annotation

    invoke-static {p0, p1}, Landroidx/core/app/e3;->a(Landroid/app/NotificationManager;Ljava/util/List;)V

    return-void
.end method

.method static createNotificationChannels(Landroid/app/NotificationManager;Ljava/util/List;)V
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/NotificationManager;",
            "Ljava/util/List<",
            "Landroid/app/NotificationChannel;",
            ">;)V"
        }
    .end annotation

    invoke-static {p0, p1}, Landroidx/core/app/g3;->a(Landroid/app/NotificationManager;Ljava/util/List;)V

    return-void
.end method

.method static deleteNotificationChannel(Landroid/app/NotificationManager;Ljava/lang/String;)V
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0, p1}, Landroidx/core/app/z2;->a(Landroid/app/NotificationManager;Ljava/lang/String;)V

    return-void
.end method

.method static deleteNotificationChannelGroup(Landroid/app/NotificationManager;Ljava/lang/String;)V
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0, p1}, Landroidx/core/app/c3;->a(Landroid/app/NotificationManager;Ljava/lang/String;)V

    return-void
.end method

.method static getId(Landroid/app/NotificationChannel;)Ljava/lang/String;
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/core/app/d0;->a(Landroid/app/NotificationChannel;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static getId(Landroid/app/NotificationChannelGroup;)Ljava/lang/String;
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    .line 2
    invoke-static {p0}, Landroidx/core/app/p0;->a(Landroid/app/NotificationChannelGroup;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static getNotificationChannel(Landroid/app/NotificationManager;Ljava/lang/String;)Landroid/app/NotificationChannel;
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0, p1}, Landroidx/core/app/d3;->a(Landroid/app/NotificationManager;Ljava/lang/String;)Landroid/app/NotificationChannel;

    move-result-object p0

    return-object p0
.end method

.method static getNotificationChannelGroups(Landroid/app/NotificationManager;)Ljava/util/List;
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/NotificationManager;",
            ")",
            "Ljava/util/List<",
            "Landroid/app/NotificationChannelGroup;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, Landroidx/core/app/b3;->a(Landroid/app/NotificationManager;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static getNotificationChannels(Landroid/app/NotificationManager;)Ljava/util/List;
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/NotificationManager;",
            ")",
            "Ljava/util/List<",
            "Landroid/app/NotificationChannel;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, Landroidx/core/app/a3;->a(Landroid/app/NotificationManager;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method
