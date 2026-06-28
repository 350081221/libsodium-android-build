.class public Lmirror/android/net/TrafficStats;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static TYPE:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static sStatsService:Lmirror/RefStaticObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmirror/RefStaticObject<",
            "Landroid/os/IInterface;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lmirror/android/net/TrafficStats;

    const-class v1, Landroid/net/TrafficStats;

    invoke-static {v0, v1}, Lmirror/RefClass;->load(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lmirror/android/net/TrafficStats;->TYPE:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static sStatsService()Landroid/os/IInterface;
    .locals 1

    .line 1
    sget-object v0, Lmirror/android/net/TrafficStats;->sStatsService:Lmirror/RefStaticObject;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lmirror/RefStaticObject;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/IInterface;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static sStatsService(Landroid/os/IInterface;)V
    .locals 1

    .line 3
    sget-object v0, Lmirror/android/net/TrafficStats;->sStatsService:Lmirror/RefStaticObject;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0, p0}, Lmirror/RefStaticObject;->set(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
