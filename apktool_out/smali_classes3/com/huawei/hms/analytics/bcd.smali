.class public final Lcom/huawei/hms/analytics/bcd;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hms/analytics/bcd$lmn;
    }
.end annotation


# static fields
.field static klm:Lcom/huawei/hms/analytics/bcd;


# instance fields
.field private abc:Z

.field public final bcd:Landroid/os/Bundle;

.field public final cde:Landroid/os/Bundle;

.field public def:Lcom/huawei/hms/analytics/bh;

.field final efg:Landroid/os/Handler;

.field fgh:Z

.field public ghi:J

.field public hij:Lcom/huawei/hms/analytics/bcd$lmn;

.field public ijk:Lcom/huawei/hms/analytics/bcd$lmn;

.field public ikl:Lcom/huawei/hms/analytics/bcd$lmn;

.field public final lmn:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/huawei/hms/analytics/bcd$lmn;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/huawei/hms/analytics/bcd;

    invoke-direct {v0}, Lcom/huawei/hms/analytics/bcd;-><init>()V

    sput-object v0, Lcom/huawei/hms/analytics/bcd;->klm:Lcom/huawei/hms/analytics/bcd;

    return-void
.end method

.method public constructor <init>()V
    .locals 13

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/hms/analytics/bcd;->lmn:Ljava/util/Map;

    new-instance v0, Lcom/huawei/hms/analytics/bcd$lmn;

    const-string v2, ""

    const-string v3, ""

    const-string v4, ""

    const-wide/16 v5, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/huawei/hms/analytics/bcd$lmn;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    iput-object v0, p0, Lcom/huawei/hms/analytics/bcd;->ikl:Lcom/huawei/hms/analytics/bcd$lmn;

    new-instance v0, Lcom/huawei/hms/analytics/bcd$lmn;

    const-string v8, ""

    const-string v9, ""

    const-string v10, ""

    const-wide/16 v11, 0x0

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/huawei/hms/analytics/bcd$lmn;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    iput-object v0, p0, Lcom/huawei/hms/analytics/bcd;->ijk:Lcom/huawei/hms/analytics/bcd$lmn;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hms/analytics/bcd;->ghi:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hms/analytics/bcd;->abc:Z

    iput-boolean v0, p0, Lcom/huawei/hms/analytics/bcd;->fgh:Z

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/huawei/hms/analytics/bcd;->efg:Landroid/os/Handler;

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/huawei/hms/analytics/bcd;->cde:Landroid/os/Bundle;

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/huawei/hms/analytics/bcd;->bcd:Landroid/os/Bundle;

    return-void
.end method

.method static synthetic klm(Lcom/huawei/hms/analytics/bcd;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/huawei/hms/analytics/bcd;->fgh:Z

    return p0
.end method

.method public static lmn()Lcom/huawei/hms/analytics/bcd;
    .locals 1

    sget-object v0, Lcom/huawei/hms/analytics/bcd;->klm:Lcom/huawei/hms/analytics/bcd;

    return-object v0
.end method

.method static synthetic lmn(Lcom/huawei/hms/analytics/bcd;Lcom/huawei/hms/analytics/bcd$lmn;Landroid/os/Bundle;J)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/huawei/hms/analytics/bcd;->lmn(Lcom/huawei/hms/analytics/bcd$lmn;Landroid/os/Bundle;J)V

    return-void
.end method

.method static synthetic lmn(Lcom/huawei/hms/analytics/bcd;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/huawei/hms/analytics/bcd;->abc:Z

    return p0
.end method


# virtual methods
.method public final lmn(J)V
    .locals 8

    const-string v0, "onScreenExit with time: "

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ActivityStatCommander"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/bcd;->ikl:Lcom/huawei/hms/analytics/bcd$lmn;

    if-nez v0, :cond_0

    const-string p1, "onScreenEnter should be invoked first."

    invoke-static {v1, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-wide v2, v0, Lcom/huawei/hms/analytics/bcd$lmn;->ijk:J

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    const-string p1, "timestamp is 0."

    invoke-static {v1, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v4, p0, Lcom/huawei/hms/analytics/bcd;->ikl:Lcom/huawei/hms/analytics/bcd$lmn;

    iget-object v4, v4, Lcom/huawei/hms/analytics/bcd$lmn;->lmn:Ljava/lang/String;

    const-string v5, "$CurActivityName"

    invoke-virtual {v0, v5, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v4, p0, Lcom/huawei/hms/analytics/bcd;->ikl:Lcom/huawei/hms/analytics/bcd$lmn;

    iget-object v4, v4, Lcom/huawei/hms/analytics/bcd$lmn;->klm:Ljava/lang/String;

    const-string v5, "$CurActivityClass"

    invoke-virtual {v0, v5, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v4, p0, Lcom/huawei/hms/analytics/bcd;->ikl:Lcom/huawei/hms/analytics/bcd$lmn;

    iget-object v4, v4, Lcom/huawei/hms/analytics/bcd$lmn;->ikl:Ljava/lang/String;

    const-string v6, "$CurActivityId"

    invoke-virtual {v0, v6, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v4, p0, Lcom/huawei/hms/analytics/bcd;->cde:Landroid/os/Bundle;

    const-string v6, "$PrevActivityClass"

    const-string v7, ""

    invoke-virtual {v4, v6, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v6, "$PrePageId"

    invoke-virtual {v0, v6, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v4, p0, Lcom/huawei/hms/analytics/bcd;->cde:Landroid/os/Bundle;

    invoke-virtual {v4, v5, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "$CurrPageId"

    invoke-virtual {v0, v5, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "onScreenExit duration cal: 1. "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v5, " 2. "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lcom/huawei/hms/analytics/core/log/HiLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    sub-long v2, p1, v2

    const-wide/32 v4, 0x240c8400

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    const-string v3, "$Duration"

    invoke-virtual {v0, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "onScreenExit: send ScreenExit event..."

    invoke-static {v1, v2}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/huawei/hms/analytics/bcd;->def:Lcom/huawei/hms/analytics/bh;

    new-instance v2, Lcom/huawei/hms/analytics/dj;

    const-string v3, "$ExitScreen"

    invoke-direct {v2, v3, v0}, Lcom/huawei/hms/analytics/dj;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-interface {v1, v3, v2, p1, p2}, Lcom/huawei/hms/analytics/bh;->lmn(Ljava/lang/String;Lcom/huawei/hms/analytics/dj;J)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/huawei/hms/analytics/bcd;->fgh:Z

    return-void
.end method

.method public final lmn(Landroid/app/Activity;Landroid/os/Bundle;J)V
    .locals 10

    const-string v0, "onScreenEnterDelayed with time: "

    invoke-static {p3, p4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ActivityStatCommander"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/hms/analytics/ar;->lmn()Lcom/huawei/hms/analytics/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/hms/analytics/ar;->lmn:Lcom/huawei/hms/analytics/at;

    iget-boolean v0, v0, Lcom/huawei/hms/analytics/at;->fgh:Z

    if-nez v0, :cond_0

    const-string v0, "auto collect is closed"

    invoke-static {v1, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Landroid/app/Activity;->getTaskId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    new-instance v7, Lcom/huawei/hms/analytics/bcd$lmn;

    move-object v1, v7

    move-object v2, v3

    move-wide v5, p3

    invoke-direct/range {v1 .. v6}, Lcom/huawei/hms/analytics/bcd$lmn;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hms/analytics/bcd;->abc:Z

    iget-object v8, p0, Lcom/huawei/hms/analytics/bcd;->efg:Landroid/os/Handler;

    new-instance v9, Lcom/huawei/hms/analytics/bcd$1;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, v7

    move-object v4, p2

    invoke-direct/range {v0 .. v6}, Lcom/huawei/hms/analytics/bcd$1;-><init>(Lcom/huawei/hms/analytics/bcd;Landroid/app/Activity;Lcom/huawei/hms/analytics/bcd$lmn;Landroid/os/Bundle;J)V

    const-wide/16 v0, 0x64

    invoke-virtual {v8, v9, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    iget-object v0, p0, Lcom/huawei/hms/analytics/bcd;->lmn:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hms/analytics/bcd;->ijk:Lcom/huawei/hms/analytics/bcd$lmn;

    return-void
.end method

.method public final lmn(Lcom/huawei/hms/analytics/bcd$lmn;Landroid/os/Bundle;J)V
    .locals 5

    const-string v0, "ActivityStatCommander"

    const-string v1, "onScreenEnterSend"

    invoke-static {v0, v1}, Lcom/huawei/hms/analytics/core/log/HiLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/bcd;->hij:Lcom/huawei/hms/analytics/bcd$lmn;

    const-string v1, "$PrePageId"

    const-string v2, "$PrevActivityId"

    const-string v3, "$PrevActivityName"

    const-string v4, "$PrevActivityClass"

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hms/analytics/bcd;->ikl:Lcom/huawei/hms/analytics/bcd$lmn;

    iget-object v0, v0, Lcom/huawei/hms/analytics/bcd$lmn;->lmn:Ljava/lang/String;

    invoke-virtual {p2, v3, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/bcd;->ikl:Lcom/huawei/hms/analytics/bcd$lmn;

    iget-object v0, v0, Lcom/huawei/hms/analytics/bcd$lmn;->klm:Ljava/lang/String;

    invoke-virtual {p2, v4, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/bcd;->ikl:Lcom/huawei/hms/analytics/bcd$lmn;

    iget-object v0, v0, Lcom/huawei/hms/analytics/bcd$lmn;->ikl:Ljava/lang/String;

    invoke-virtual {p2, v2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/bcd;->ikl:Lcom/huawei/hms/analytics/bcd$lmn;

    iget-object v0, v0, Lcom/huawei/hms/analytics/bcd$lmn;->klm:Ljava/lang/String;

    invoke-virtual {p2, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/bcd;->cde:Landroid/os/Bundle;

    iget-object v1, p0, Lcom/huawei/hms/analytics/bcd;->ikl:Lcom/huawei/hms/analytics/bcd$lmn;

    goto :goto_0

    :cond_0
    iget-object v0, v0, Lcom/huawei/hms/analytics/bcd$lmn;->lmn:Ljava/lang/String;

    invoke-virtual {p2, v3, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/bcd;->hij:Lcom/huawei/hms/analytics/bcd$lmn;

    iget-object v0, v0, Lcom/huawei/hms/analytics/bcd$lmn;->klm:Ljava/lang/String;

    invoke-virtual {p2, v4, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/bcd;->hij:Lcom/huawei/hms/analytics/bcd$lmn;

    iget-object v0, v0, Lcom/huawei/hms/analytics/bcd$lmn;->ikl:Ljava/lang/String;

    invoke-virtual {p2, v2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/bcd;->hij:Lcom/huawei/hms/analytics/bcd$lmn;

    iget-object v0, v0, Lcom/huawei/hms/analytics/bcd$lmn;->klm:Ljava/lang/String;

    invoke-virtual {p2, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/bcd;->cde:Landroid/os/Bundle;

    iget-object v1, p0, Lcom/huawei/hms/analytics/bcd;->hij:Lcom/huawei/hms/analytics/bcd$lmn;

    :goto_0
    iget-object v1, v1, Lcom/huawei/hms/analytics/bcd$lmn;->klm:Ljava/lang/String;

    invoke-virtual {v0, v4, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p1, Lcom/huawei/hms/analytics/bcd$lmn;->lmn:Ljava/lang/String;

    const-string v1, "$CurActivityName"

    invoke-virtual {p2, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p1, Lcom/huawei/hms/analytics/bcd$lmn;->klm:Ljava/lang/String;

    const-string v1, "$CurActivityClass"

    invoke-virtual {p2, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "$CurActivityId"

    iget-object v2, p1, Lcom/huawei/hms/analytics/bcd$lmn;->ikl:Ljava/lang/String;

    invoke-virtual {p2, v0, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "$CurrPageId"

    iget-object v2, p1, Lcom/huawei/hms/analytics/bcd$lmn;->klm:Ljava/lang/String;

    invoke-virtual {p2, v0, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hms/analytics/bcd;->def:Lcom/huawei/hms/analytics/bh;

    new-instance v2, Lcom/huawei/hms/analytics/dj;

    const-string v3, "$EnterScreen"

    invoke-direct {v2, v3, p2}, Lcom/huawei/hms/analytics/dj;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-interface {v0, v3, v2, p3, p4}, Lcom/huawei/hms/analytics/bh;->lmn(Ljava/lang/String;Lcom/huawei/hms/analytics/dj;J)V

    iget-object p2, p0, Lcom/huawei/hms/analytics/bcd;->cde:Landroid/os/Bundle;

    iget-object p3, p1, Lcom/huawei/hms/analytics/bcd$lmn;->klm:Ljava/lang/String;

    invoke-virtual {p2, v1, p3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/huawei/hms/analytics/bcd;->abc:Z

    iput-object p1, p0, Lcom/huawei/hms/analytics/bcd;->ikl:Lcom/huawei/hms/analytics/bcd$lmn;

    return-void
.end method
