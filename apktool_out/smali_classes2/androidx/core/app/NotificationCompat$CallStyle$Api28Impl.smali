.class Landroidx/core/app/NotificationCompat$CallStyle$Api28Impl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x1c
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/app/NotificationCompat$CallStyle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Api28Impl"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static addPerson(Landroid/app/Notification$Builder;Landroid/app/Person;)Landroid/app/Notification$Builder;
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    invoke-static {p0, p1}, Landroidx/core/app/b2;->a(Landroid/app/Notification$Builder;Landroid/app/Person;)Landroid/app/Notification$Builder;

    move-result-object p0

    return-object p0
.end method

.method static castToParcelable(Landroid/app/Person;)Landroid/os/Parcelable;
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    return-object p0
.end method
