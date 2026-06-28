.class public Lcom/huawei/hms/analytics/database/LogEventDao$Properties;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hms/analytics/database/LogEventDao;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Properties"
.end annotation


# static fields
.field public static final hij:Lorg/greenrobot/greendao/i;

.field public static final ijk:Lorg/greenrobot/greendao/i;

.field public static final ikl:Lorg/greenrobot/greendao/i;

.field public static final klm:Lorg/greenrobot/greendao/i;

.field public static final lmn:Lorg/greenrobot/greendao/i;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v6, Lorg/greenrobot/greendao/i;

    const/4 v1, 0x0

    const-class v2, Ljava/lang/Long;

    const-string v3, "id"

    const/4 v4, 0x1

    const-string v5, "_id"

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lorg/greenrobot/greendao/i;-><init>(ILjava/lang/Class;Ljava/lang/String;ZLjava/lang/String;)V

    sput-object v6, Lcom/huawei/hms/analytics/database/LogEventDao$Properties;->lmn:Lorg/greenrobot/greendao/i;

    new-instance v0, Lorg/greenrobot/greendao/i;

    const/4 v8, 0x1

    const-class v9, Ljava/lang/String;

    const-string v10, "evtTime"

    const/4 v11, 0x0

    const-string v12, "ev_t"

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lorg/greenrobot/greendao/i;-><init>(ILjava/lang/Class;Ljava/lang/String;ZLjava/lang/String;)V

    sput-object v0, Lcom/huawei/hms/analytics/database/LogEventDao$Properties;->klm:Lorg/greenrobot/greendao/i;

    new-instance v0, Lorg/greenrobot/greendao/i;

    const/4 v2, 0x2

    const-class v3, Ljava/lang/Long;

    const-string v4, "evtType"

    const/4 v5, 0x0

    const-string v6, "cf_id"

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lorg/greenrobot/greendao/i;-><init>(ILjava/lang/Class;Ljava/lang/String;ZLjava/lang/String;)V

    sput-object v0, Lcom/huawei/hms/analytics/database/LogEventDao$Properties;->ikl:Lorg/greenrobot/greendao/i;

    new-instance v0, Lorg/greenrobot/greendao/i;

    const/4 v8, 0x3

    const-class v9, Ljava/lang/String;

    const-string v10, "content"

    const-string v12, "ev_ct"

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lorg/greenrobot/greendao/i;-><init>(ILjava/lang/Class;Ljava/lang/String;ZLjava/lang/String;)V

    sput-object v0, Lcom/huawei/hms/analytics/database/LogEventDao$Properties;->ijk:Lorg/greenrobot/greendao/i;

    new-instance v0, Lorg/greenrobot/greendao/i;

    const/4 v2, 0x4

    const-class v3, Ljava/lang/String;

    const-string v4, "eventId"

    const-string v6, "ev_id"

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lorg/greenrobot/greendao/i;-><init>(ILjava/lang/Class;Ljava/lang/String;ZLjava/lang/String;)V

    sput-object v0, Lcom/huawei/hms/analytics/database/LogEventDao$Properties;->hij:Lorg/greenrobot/greendao/i;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
