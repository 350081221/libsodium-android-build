.class Landroidx/core/app/NotificationChannelCompat$Api26Impl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x1a
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/app/NotificationChannelCompat;
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

.method static canBypassDnd(Landroid/app/NotificationChannel;)Z
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0}, Landroidx/core/app/y;->a(Landroid/app/NotificationChannel;)Z

    move-result p0

    return p0
.end method

.method static canShowBadge(Landroid/app/NotificationChannel;)Z
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0}, Landroidx/core/app/a0;->a(Landroid/app/NotificationChannel;)Z

    move-result p0

    return p0
.end method

.method static createNotificationChannel(Ljava/lang/String;Ljava/lang/CharSequence;I)Landroid/app/NotificationChannel;
    .locals 1
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    new-instance v0, Landroid/app/NotificationChannel;

    invoke-direct {v0, p0, p1, p2}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    return-object v0
.end method

.method static enableLights(Landroid/app/NotificationChannel;Z)V
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0, p1}, Landroidx/core/app/x;->a(Landroid/app/NotificationChannel;Z)V

    return-void
.end method

.method static enableVibration(Landroid/app/NotificationChannel;Z)V
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0, p1}, Landroidx/core/app/u;->a(Landroid/app/NotificationChannel;Z)V

    return-void
.end method

.method static getAudioAttributes(Landroid/app/NotificationChannel;)Landroid/media/AudioAttributes;
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0}, Landroidx/core/app/v;->a(Landroid/app/NotificationChannel;)Landroid/media/AudioAttributes;

    move-result-object p0

    return-object p0
.end method

.method static getDescription(Landroid/app/NotificationChannel;)Ljava/lang/String;
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0}, Landroidx/core/app/w;->a(Landroid/app/NotificationChannel;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static getGroup(Landroid/app/NotificationChannel;)Ljava/lang/String;
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0}, Landroidx/core/app/r;->a(Landroid/app/NotificationChannel;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static getId(Landroid/app/NotificationChannel;)Ljava/lang/String;
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0}, Landroidx/core/app/d0;->a(Landroid/app/NotificationChannel;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static getImportance(Landroid/app/NotificationChannel;)I
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0}, Landroidx/core/app/i0;->a(Landroid/app/NotificationChannel;)I

    move-result p0

    return p0
.end method

.method static getLightColor(Landroid/app/NotificationChannel;)I
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0}, Landroidx/core/app/c0;->a(Landroid/app/NotificationChannel;)I

    move-result p0

    return p0
.end method

.method static getLockscreenVisibility(Landroid/app/NotificationChannel;)I
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0}, Landroidx/core/app/s;->a(Landroid/app/NotificationChannel;)I

    move-result p0

    return p0
.end method

.method static getName(Landroid/app/NotificationChannel;)Ljava/lang/CharSequence;
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0}, Landroidx/core/app/e0;->a(Landroid/app/NotificationChannel;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method static getSound(Landroid/app/NotificationChannel;)Landroid/net/Uri;
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0}, Landroidx/core/app/n;->a(Landroid/app/NotificationChannel;)Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method

.method static getVibrationPattern(Landroid/app/NotificationChannel;)[J
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0}, Landroidx/core/app/p;->a(Landroid/app/NotificationChannel;)[J

    move-result-object p0

    return-object p0
.end method

.method static setDescription(Landroid/app/NotificationChannel;Ljava/lang/String;)V
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0, p1}, Landroidx/core/app/g0;->a(Landroid/app/NotificationChannel;Ljava/lang/String;)V

    return-void
.end method

.method static setGroup(Landroid/app/NotificationChannel;Ljava/lang/String;)V
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0, p1}, Landroidx/core/app/t;->a(Landroid/app/NotificationChannel;Ljava/lang/String;)V

    return-void
.end method

.method static setLightColor(Landroid/app/NotificationChannel;I)V
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0, p1}, Landroidx/core/app/z;->a(Landroid/app/NotificationChannel;I)V

    return-void
.end method

.method static setShowBadge(Landroid/app/NotificationChannel;Z)V
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0, p1}, Landroidx/core/app/o;->a(Landroid/app/NotificationChannel;Z)V

    return-void
.end method

.method static setSound(Landroid/app/NotificationChannel;Landroid/net/Uri;Landroid/media/AudioAttributes;)V
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0, p1, p2}, Landroidx/core/app/h0;->a(Landroid/app/NotificationChannel;Landroid/net/Uri;Landroid/media/AudioAttributes;)V

    return-void
.end method

.method static setVibrationPattern(Landroid/app/NotificationChannel;[J)V
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0, p1}, Landroidx/core/app/f0;->a(Landroid/app/NotificationChannel;[J)V

    return-void
.end method

.method static shouldShowLights(Landroid/app/NotificationChannel;)Z
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0}, Landroidx/core/app/q;->a(Landroid/app/NotificationChannel;)Z

    move-result p0

    return p0
.end method

.method static shouldVibrate(Landroid/app/NotificationChannel;)Z
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0}, Landroidx/core/app/b0;->a(Landroid/app/NotificationChannel;)Z

    move-result p0

    return p0
.end method
