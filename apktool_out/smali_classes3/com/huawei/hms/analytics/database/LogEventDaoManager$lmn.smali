.class public final Lcom/huawei/hms/analytics/database/LogEventDaoManager$lmn;
.super Lcom/huawei/hms/analytics/database/LogEventDaoManager$klm;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hms/analytics/database/LogEventDaoManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "lmn"
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/huawei/hms/analytics/database/LogEventDaoManager$klm;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;B)V
    .locals 0

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hms/analytics/database/LogEventDaoManager$klm;-><init>(Landroid/content/Context;Ljava/lang/String;B)V

    return-void
.end method


# virtual methods
.method public final onUpgrade(Lorg/greenrobot/greendao/database/a;II)V
    .locals 1

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Upgrading schema from version "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " to "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " by dropping all tables"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "greenDAO"

    invoke-static {p2, p1}, Lcom/huawei/hms/analytics/core/log/HiLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
