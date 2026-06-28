.class public final Lcom/huawei/hms/analytics/database/DaoManager$lmn;
.super Lcom/huawei/hms/analytics/database/DaoManager$klm;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hms/analytics/database/DaoManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "lmn"
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/huawei/hms/analytics/database/DaoManager$klm;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;B)V
    .locals 0

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hms/analytics/database/DaoManager$klm;-><init>(Landroid/content/Context;Ljava/lang/String;B)V

    return-void
.end method


# virtual methods
.method public final onUpgrade(Lorg/greenrobot/greendao/database/a;II)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Upgrading schema from version "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " to "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " by dropping all tables"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "greenDAO"

    invoke-static {p3, p2}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/Class;

    const-class p3, Lcom/huawei/hms/analytics/database/EventDao;

    const/4 v0, 0x0

    aput-object p3, p2, v0

    invoke-static {p1, p2}, Lcom/huawei/hms/analytics/bg;->klm(Lorg/greenrobot/greendao/database/a;[Ljava/lang/Class;)V

    invoke-static {p1, v0}, Lcom/huawei/hms/analytics/database/DaoManager;->createEventTable(Lorg/greenrobot/greendao/database/a;Z)V

    invoke-static {p1, p2}, Lcom/huawei/hms/analytics/bg;->lmn(Lorg/greenrobot/greendao/database/a;[Ljava/lang/Class;)V

    return-void
.end method
